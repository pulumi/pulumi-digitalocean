// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.digitalocean.DatabaseReplicaArgs;
import com.pulumi.digitalocean.Utilities;
import com.pulumi.digitalocean.inputs.DatabaseReplicaState;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a DigitalOcean database replica resource.
 * 
 * ## Example Usage
 * ### Create a new PostgreSQL database replica
 * ```java
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
 *         var postgres_example = new DatabaseCluster(&#34;postgres-example&#34;, DatabaseClusterArgs.builder()        
 *             .engine(&#34;pg&#34;)
 *             .version(&#34;11&#34;)
 *             .size(&#34;db-s-1vcpu-1gb&#34;)
 *             .region(&#34;nyc1&#34;)
 *             .nodeCount(1)
 *             .build());
 * 
 *         var replica_example = new DatabaseReplica(&#34;replica-example&#34;, DatabaseReplicaArgs.builder()        
 *             .clusterId(postgres_example.id())
 *             .size(&#34;db-s-1vcpu-1gb&#34;)
 *             .region(&#34;nyc1&#34;)
 *             .build());
 * 
 *         ctx.export(&#34;uUID&#34;, replica_example.uuid());
 *         var example_fw = new DatabaseFirewall(&#34;example-fw&#34;, DatabaseFirewallArgs.builder()        
 *             .clusterId(replica_example.uuid())
 *             .rules(DatabaseFirewallRuleArgs.builder()
 *                 .type(&#34;ip_addr&#34;)
 *                 .value(&#34;192.168.1.1&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Database replicas can be imported using the `id` of the source database cluster and the `name` of the replica joined with a comma. For example
 * 
 * ```sh
 *  $ pulumi import digitalocean:index/databaseReplica:DatabaseReplica read-replica 245bcfd0-7f31-4ce6-a2bc-475a116cca97,read-replica
 * ```
 * 
 */
@ResourceType(type="digitalocean:index/databaseReplica:DatabaseReplica")
public class DatabaseReplica extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the original source database cluster.
     * 
     */
    @Export(name="clusterId", type=String.class, parameters={})
    private Output<String> clusterId;

    /**
     * @return The ID of the original source database cluster.
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }
    /**
     * Name of the replica&#39;s default database.
     * 
     */
    @Export(name="database", type=String.class, parameters={})
    private Output<String> database;

    /**
     * @return Name of the replica&#39;s default database.
     * 
     */
    public Output<String> database() {
        return this.database;
    }
    /**
     * Database replica&#39;s hostname.
     * 
     */
    @Export(name="host", type=String.class, parameters={})
    private Output<String> host;

    /**
     * @return Database replica&#39;s hostname.
     * 
     */
    public Output<String> host() {
        return this.host;
    }
    /**
     * The name for the database replica.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name for the database replica.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Password for the replica&#39;s default user.
     * 
     */
    @Export(name="password", type=String.class, parameters={})
    private Output<String> password;

    /**
     * @return Password for the replica&#39;s default user.
     * 
     */
    public Output<String> password() {
        return this.password;
    }
    /**
     * Network port that the database replica is listening on.
     * 
     */
    @Export(name="port", type=Integer.class, parameters={})
    private Output<Integer> port;

    /**
     * @return Network port that the database replica is listening on.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }
    /**
     * Same as `host`, but only accessible from resources within the account and in the same region.
     * 
     */
    @Export(name="privateHost", type=String.class, parameters={})
    private Output<String> privateHost;

    /**
     * @return Same as `host`, but only accessible from resources within the account and in the same region.
     * 
     */
    public Output<String> privateHost() {
        return this.privateHost;
    }
    /**
     * The ID of the VPC where the database replica will be located.
     * 
     */
    @Export(name="privateNetworkUuid", type=String.class, parameters={})
    private Output<String> privateNetworkUuid;

    /**
     * @return The ID of the VPC where the database replica will be located.
     * 
     */
    public Output<String> privateNetworkUuid() {
        return this.privateNetworkUuid;
    }
    /**
     * Same as `uri`, but only accessible from resources within the account and in the same region.
     * 
     */
    @Export(name="privateUri", type=String.class, parameters={})
    private Output<String> privateUri;

    /**
     * @return Same as `uri`, but only accessible from resources within the account and in the same region.
     * 
     */
    public Output<String> privateUri() {
        return this.privateUri;
    }
    /**
     * DigitalOcean region where the replica will reside.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output</* @Nullable */ String> region;

    /**
     * @return DigitalOcean region where the replica will reside.
     * 
     */
    public Output<Optional<String>> region() {
        return Codegen.optional(this.region);
    }
    /**
     * Database Droplet size associated with the replica (ex. `db-s-1vcpu-1gb`).
     * 
     */
    @Export(name="size", type=String.class, parameters={})
    private Output</* @Nullable */ String> size;

    /**
     * @return Database Droplet size associated with the replica (ex. `db-s-1vcpu-1gb`).
     * 
     */
    public Output<Optional<String>> size() {
        return Codegen.optional(this.size);
    }
    /**
     * A list of tag names to be applied to the database replica.
     * 
     */
    @Export(name="tags", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return A list of tag names to be applied to the database replica.
     * 
     */
    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The full URI for connecting to the database replica.
     * 
     */
    @Export(name="uri", type=String.class, parameters={})
    private Output<String> uri;

    /**
     * @return The full URI for connecting to the database replica.
     * 
     */
    public Output<String> uri() {
        return this.uri;
    }
    /**
     * Username for the replica&#39;s default user.
     * 
     */
    @Export(name="user", type=String.class, parameters={})
    private Output<String> user;

    /**
     * @return Username for the replica&#39;s default user.
     * 
     */
    public Output<String> user() {
        return this.user;
    }
    /**
     * The UUID of the database replica. The uuid can be used to reference the database replica as the target database cluster in other resources. See example  &#34;Create firewall rule for database replica&#34; above.
     * 
     */
    @Export(name="uuid", type=String.class, parameters={})
    private Output<String> uuid;

    /**
     * @return The UUID of the database replica. The uuid can be used to reference the database replica as the target database cluster in other resources. See example  &#34;Create firewall rule for database replica&#34; above.
     * 
     */
    public Output<String> uuid() {
        return this.uuid;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DatabaseReplica(String name) {
        this(name, DatabaseReplicaArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DatabaseReplica(String name, DatabaseReplicaArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DatabaseReplica(String name, DatabaseReplicaArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/databaseReplica:DatabaseReplica", name, args == null ? DatabaseReplicaArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DatabaseReplica(String name, Output<String> id, @Nullable DatabaseReplicaState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/databaseReplica:DatabaseReplica", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "password",
                "privateUri",
                "uri"
            ))
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
    public static DatabaseReplica get(String name, Output<String> id, @Nullable DatabaseReplicaState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DatabaseReplica(name, id, state, options);
    }
}
