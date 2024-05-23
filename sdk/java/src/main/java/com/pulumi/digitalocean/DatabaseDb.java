// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.digitalocean.DatabaseDbArgs;
import com.pulumi.digitalocean.Utilities;
import com.pulumi.digitalocean.inputs.DatabaseDbState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a DigitalOcean database resource. When creating a new database cluster, a default database with name `defaultdb` will be created. Then, this resource can be used to provide additional database inside the cluster.
 * 
 * ## Example Usage
 * 
 * ### Create a new PostgreSQL database
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
 * import com.pulumi.digitalocean.DatabaseDb;
 * import com.pulumi.digitalocean.DatabaseDbArgs;
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
 *         var database_example = new DatabaseDb("database-example", DatabaseDbArgs.builder()
 *             .clusterId(postgres_example.id())
 *             .name("foobar")
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
 * Database can be imported using the `id` of the source database cluster
 * 
 * and the `name` of the database joined with a comma. For example:
 * 
 * ```sh
 * $ pulumi import digitalocean:index/databaseDb:DatabaseDb database-example 245bcfd0-7f31-4ce6-a2bc-475a116cca97,foobar
 * ```
 * 
 */
@ResourceType(type="digitalocean:index/databaseDb:DatabaseDb")
public class DatabaseDb extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the original source database cluster.
     * 
     */
    @Export(name="clusterId", refs={String.class}, tree="[0]")
    private Output<String> clusterId;

    /**
     * @return The ID of the original source database cluster.
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }
    /**
     * The name for the database.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name for the database.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DatabaseDb(String name) {
        this(name, DatabaseDbArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DatabaseDb(String name, DatabaseDbArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DatabaseDb(String name, DatabaseDbArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/databaseDb:DatabaseDb", name, args == null ? DatabaseDbArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DatabaseDb(String name, Output<String> id, @Nullable DatabaseDbState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/databaseDb:DatabaseDb", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
    public static DatabaseDb get(String name, Output<String> id, @Nullable DatabaseDbState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DatabaseDb(name, id, state, options);
    }
}
