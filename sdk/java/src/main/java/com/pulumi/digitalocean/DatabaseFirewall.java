// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.digitalocean.DatabaseFirewallArgs;
import com.pulumi.digitalocean.Utilities;
import com.pulumi.digitalocean.inputs.DatabaseFirewallState;
import com.pulumi.digitalocean.outputs.DatabaseFirewallRule;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a DigitalOcean database firewall resource allowing you to restrict
 * connections to your database to trusted sources. You may limit connections to
 * specific Droplets, Kubernetes clusters, or IP addresses.
 * 
 * ## Example Usage
 * 
 * ### Create a new database firewall allowing multiple IP addresses
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.digitalocean.DatabaseCluster;
 * import com.pulumi.digitalocean.DatabaseClusterArgs;
 * import com.pulumi.digitalocean.DatabaseFirewall;
 * import com.pulumi.digitalocean.DatabaseFirewallArgs;
 * import com.pulumi.digitalocean.inputs.DatabaseFirewallRuleArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var postgres_example = new DatabaseCluster("postgres-example", DatabaseClusterArgs.builder()
 *             .name("example-postgres-cluster")
 *             .engine("pg")
 *             .version("15")
 *             .size("db-s-1vcpu-1gb")
 *             .region("nyc1")
 *             .nodeCount(1)
 *             .build());
 * 
 *         var example_fw = new DatabaseFirewall("example-fw", DatabaseFirewallArgs.builder()
 *             .clusterId(postgres_example.id())
 *             .rules(            
 *                 DatabaseFirewallRuleArgs.builder()
 *                     .type("ip_addr")
 *                     .value("192.168.1.1")
 *                     .build(),
 *                 DatabaseFirewallRuleArgs.builder()
 *                     .type("ip_addr")
 *                     .value("192.0.2.0")
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Create a new database firewall allowing a Droplet
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.digitalocean.Droplet;
 * import com.pulumi.digitalocean.DropletArgs;
 * import com.pulumi.digitalocean.DatabaseCluster;
 * import com.pulumi.digitalocean.DatabaseClusterArgs;
 * import com.pulumi.digitalocean.DatabaseFirewall;
 * import com.pulumi.digitalocean.DatabaseFirewallArgs;
 * import com.pulumi.digitalocean.inputs.DatabaseFirewallRuleArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var web = new Droplet("web", DropletArgs.builder()
 *             .name("web-01")
 *             .size("s-1vcpu-1gb")
 *             .image("ubuntu-22-04-x64")
 *             .region("nyc3")
 *             .build());
 * 
 *         var postgres_example = new DatabaseCluster("postgres-example", DatabaseClusterArgs.builder()
 *             .name("example-postgres-cluster")
 *             .engine("pg")
 *             .version("15")
 *             .size("db-s-1vcpu-1gb")
 *             .region("nyc1")
 *             .nodeCount(1)
 *             .build());
 * 
 *         var example_fw = new DatabaseFirewall("example-fw", DatabaseFirewallArgs.builder()
 *             .clusterId(postgres_example.id())
 *             .rules(DatabaseFirewallRuleArgs.builder()
 *                 .type("droplet")
 *                 .value(web.id())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Create a new database firewall for a database replica
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.digitalocean.DatabaseCluster;
 * import com.pulumi.digitalocean.DatabaseClusterArgs;
 * import com.pulumi.digitalocean.DatabaseReplica;
 * import com.pulumi.digitalocean.DatabaseReplicaArgs;
 * import com.pulumi.digitalocean.DatabaseFirewall;
 * import com.pulumi.digitalocean.DatabaseFirewallArgs;
 * import com.pulumi.digitalocean.inputs.DatabaseFirewallRuleArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var postgres_example = new DatabaseCluster("postgres-example", DatabaseClusterArgs.builder()
 *             .name("example-postgres-cluster")
 *             .engine("pg")
 *             .version("15")
 *             .size("db-s-1vcpu-1gb")
 *             .region("nyc1")
 *             .nodeCount(1)
 *             .build());
 * 
 *         var replica_example = new DatabaseReplica("replica-example", DatabaseReplicaArgs.builder()
 *             .clusterId(postgres_example.id())
 *             .name("replica-example")
 *             .size("db-s-1vcpu-1gb")
 *             .region("nyc1")
 *             .build());
 * 
 *         // Create firewall rule for database replica
 *         var example_fw = new DatabaseFirewall("example-fw", DatabaseFirewallArgs.builder()
 *             .clusterId(replica_example.uuid())
 *             .rules(DatabaseFirewallRuleArgs.builder()
 *                 .type("ip_addr")
 *                 .value("192.168.1.1")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Database firewalls can be imported using the `id` of the target database cluster
 * 
 * For example:
 * 
 * ```sh
 * $ pulumi import digitalocean:index/databaseFirewall:DatabaseFirewall example-fw 5f55c6cd-863b-4907-99b8-7e09b0275d54
 * ```
 * 
 */
@ResourceType(type="digitalocean:index/databaseFirewall:DatabaseFirewall")
public class DatabaseFirewall extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the target database cluster.
     * 
     */
    @Export(name="clusterId", refs={String.class}, tree="[0]")
    private Output<String> clusterId;

    /**
     * @return The ID of the target database cluster.
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }
    /**
     * A rule specifying a resource allowed to access the database cluster. The following arguments must be specified:
     * 
     */
    @Export(name="rules", refs={List.class,DatabaseFirewallRule.class}, tree="[0,1]")
    private Output<List<DatabaseFirewallRule>> rules;

    /**
     * @return A rule specifying a resource allowed to access the database cluster. The following arguments must be specified:
     * 
     */
    public Output<List<DatabaseFirewallRule>> rules() {
        return this.rules;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DatabaseFirewall(java.lang.String name) {
        this(name, DatabaseFirewallArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DatabaseFirewall(java.lang.String name, DatabaseFirewallArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DatabaseFirewall(java.lang.String name, DatabaseFirewallArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/databaseFirewall:DatabaseFirewall", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private DatabaseFirewall(java.lang.String name, Output<java.lang.String> id, @Nullable DatabaseFirewallState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/databaseFirewall:DatabaseFirewall", name, state, makeResourceOptions(options, id), false);
    }

    private static DatabaseFirewallArgs makeArgs(DatabaseFirewallArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? DatabaseFirewallArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static DatabaseFirewall get(java.lang.String name, Output<java.lang.String> id, @Nullable DatabaseFirewallState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DatabaseFirewall(name, id, state, options);
    }
}
