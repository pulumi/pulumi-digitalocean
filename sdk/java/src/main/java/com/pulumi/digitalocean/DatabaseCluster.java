// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.digitalocean.DatabaseClusterArgs;
import com.pulumi.digitalocean.Utilities;
import com.pulumi.digitalocean.inputs.DatabaseClusterState;
import com.pulumi.digitalocean.outputs.DatabaseClusterBackupRestore;
import com.pulumi.digitalocean.outputs.DatabaseClusterMaintenanceWindow;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a DigitalOcean database cluster resource.
 * 
 * ## Example Usage
 * 
 * ### Create a new PostgreSQL database cluster
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.digitalocean.DatabaseCluster;
 * import com.pulumi.digitalocean.DatabaseClusterArgs;
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
 *             .nodeCount(1)
 *             .region(&#34;nyc1&#34;)
 *             .size(&#34;db-s-1vcpu-1gb&#34;)
 *             .version(&#34;15&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Create a new MySQL database cluster
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.digitalocean.DatabaseCluster;
 * import com.pulumi.digitalocean.DatabaseClusterArgs;
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
 *         var mysql_example = new DatabaseCluster(&#34;mysql-example&#34;, DatabaseClusterArgs.builder()        
 *             .engine(&#34;mysql&#34;)
 *             .nodeCount(1)
 *             .region(&#34;nyc1&#34;)
 *             .size(&#34;db-s-1vcpu-1gb&#34;)
 *             .version(&#34;8&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Create a new Redis database cluster
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.digitalocean.DatabaseCluster;
 * import com.pulumi.digitalocean.DatabaseClusterArgs;
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
 *         var redis_example = new DatabaseCluster(&#34;redis-example&#34;, DatabaseClusterArgs.builder()        
 *             .engine(&#34;redis&#34;)
 *             .nodeCount(1)
 *             .region(&#34;nyc1&#34;)
 *             .size(&#34;db-s-1vcpu-1gb&#34;)
 *             .version(&#34;7&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Create a new Kafka database cluster
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.digitalocean.DatabaseCluster;
 * import com.pulumi.digitalocean.DatabaseClusterArgs;
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
 *         var kafka_example = new DatabaseCluster(&#34;kafka-example&#34;, DatabaseClusterArgs.builder()        
 *             .engine(&#34;kafka&#34;)
 *             .nodeCount(3)
 *             .region(&#34;nyc1&#34;)
 *             .size(&#34;db-s-2vcpu-2gb&#34;)
 *             .version(&#34;3.5&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Create a new MongoDB database cluster
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.digitalocean.DatabaseCluster;
 * import com.pulumi.digitalocean.DatabaseClusterArgs;
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
 *         var mongodb_example = new DatabaseCluster(&#34;mongodb-example&#34;, DatabaseClusterArgs.builder()        
 *             .engine(&#34;mongodb&#34;)
 *             .nodeCount(1)
 *             .region(&#34;nyc3&#34;)
 *             .size(&#34;db-s-1vcpu-1gb&#34;)
 *             .version(&#34;4&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Create a new database cluster based on a backup of an existing cluster.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.digitalocean.DatabaseCluster;
 * import com.pulumi.digitalocean.DatabaseClusterArgs;
 * import com.pulumi.digitalocean.inputs.DatabaseClusterBackupRestoreArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         var doby = new DatabaseCluster(&#34;doby&#34;, DatabaseClusterArgs.builder()        
 *             .engine(&#34;pg&#34;)
 *             .version(&#34;11&#34;)
 *             .size(&#34;db-s-1vcpu-2gb&#34;)
 *             .region(&#34;nyc1&#34;)
 *             .nodeCount(1)
 *             .tags(&#34;production&#34;)
 *             .build());
 * 
 *         var dobyBackup = new DatabaseCluster(&#34;dobyBackup&#34;, DatabaseClusterArgs.builder()        
 *             .engine(&#34;pg&#34;)
 *             .version(&#34;11&#34;)
 *             .size(&#34;db-s-1vcpu-2gb&#34;)
 *             .region(&#34;nyc1&#34;)
 *             .nodeCount(1)
 *             .tags(&#34;production&#34;)
 *             .backupRestore(DatabaseClusterBackupRestoreArgs.builder()
 *                 .databaseName(&#34;dobydb&#34;)
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(doby)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Database clusters can be imported using the `id` returned from DigitalOcean, e.g.
 * 
 * ```sh
 * $ pulumi import digitalocean:index/databaseCluster:DatabaseCluster mycluster 245bcfd0-7f31-4ce6-a2bc-475a116cca97
 * ```
 * 
 */
@ResourceType(type="digitalocean:index/databaseCluster:DatabaseCluster")
public class DatabaseCluster extends com.pulumi.resources.CustomResource {
    /**
     * Create a new database cluster based on a backup of an existing cluster.
     * 
     */
    @Export(name="backupRestore", refs={DatabaseClusterBackupRestore.class}, tree="[0]")
    private Output</* @Nullable */ DatabaseClusterBackupRestore> backupRestore;

    /**
     * @return Create a new database cluster based on a backup of an existing cluster.
     * 
     */
    public Output<Optional<DatabaseClusterBackupRestore>> backupRestore() {
        return Codegen.optional(this.backupRestore);
    }
    /**
     * The uniform resource name of the database cluster.
     * 
     */
    @Export(name="clusterUrn", refs={String.class}, tree="[0]")
    private Output<String> clusterUrn;

    /**
     * @return The uniform resource name of the database cluster.
     * 
     */
    public Output<String> clusterUrn() {
        return this.clusterUrn;
    }
    /**
     * Name of the cluster&#39;s default database.
     * 
     */
    @Export(name="database", refs={String.class}, tree="[0]")
    private Output<String> database;

    /**
     * @return Name of the cluster&#39;s default database.
     * 
     */
    public Output<String> database() {
        return this.database;
    }
    /**
     * Database engine used by the cluster (ex. `pg` for PostreSQL, `mysql` for MySQL, `redis` for Redis, `mongodb` for MongoDB, or `kafka` for Kafka).
     * 
     */
    @Export(name="engine", refs={String.class}, tree="[0]")
    private Output<String> engine;

    /**
     * @return Database engine used by the cluster (ex. `pg` for PostreSQL, `mysql` for MySQL, `redis` for Redis, `mongodb` for MongoDB, or `kafka` for Kafka).
     * 
     */
    public Output<String> engine() {
        return this.engine;
    }
    /**
     * A string specifying the eviction policy for a Redis cluster. Valid values are: `noeviction`, `allkeys_lru`, `allkeys_random`, `volatile_lru`, `volatile_random`, or `volatile_ttl`.
     * 
     */
    @Export(name="evictionPolicy", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> evictionPolicy;

    /**
     * @return A string specifying the eviction policy for a Redis cluster. Valid values are: `noeviction`, `allkeys_lru`, `allkeys_random`, `volatile_lru`, `volatile_random`, or `volatile_ttl`.
     * 
     */
    public Output<Optional<String>> evictionPolicy() {
        return Codegen.optional(this.evictionPolicy);
    }
    /**
     * Database cluster&#39;s hostname.
     * 
     */
    @Export(name="host", refs={String.class}, tree="[0]")
    private Output<String> host;

    /**
     * @return Database cluster&#39;s hostname.
     * 
     */
    public Output<String> host() {
        return this.host;
    }
    /**
     * Defines when the automatic maintenance should be performed for the database cluster.
     * 
     */
    @Export(name="maintenanceWindows", refs={List.class,DatabaseClusterMaintenanceWindow.class}, tree="[0,1]")
    private Output</* @Nullable */ List<DatabaseClusterMaintenanceWindow>> maintenanceWindows;

    /**
     * @return Defines when the automatic maintenance should be performed for the database cluster.
     * 
     */
    public Output<Optional<List<DatabaseClusterMaintenanceWindow>>> maintenanceWindows() {
        return Codegen.optional(this.maintenanceWindows);
    }
    /**
     * The name of the database cluster.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the database cluster.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Number of nodes that will be included in the cluster. For `kafka` clusters, this must be 3.
     * 
     */
    @Export(name="nodeCount", refs={Integer.class}, tree="[0]")
    private Output<Integer> nodeCount;

    /**
     * @return Number of nodes that will be included in the cluster. For `kafka` clusters, this must be 3.
     * 
     */
    public Output<Integer> nodeCount() {
        return this.nodeCount;
    }
    /**
     * Password for the cluster&#39;s default user.
     * 
     */
    @Export(name="password", refs={String.class}, tree="[0]")
    private Output<String> password;

    /**
     * @return Password for the cluster&#39;s default user.
     * 
     */
    public Output<String> password() {
        return this.password;
    }
    /**
     * Network port that the database cluster is listening on.
     * 
     */
    @Export(name="port", refs={Integer.class}, tree="[0]")
    private Output<Integer> port;

    /**
     * @return Network port that the database cluster is listening on.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }
    /**
     * Same as `host`, but only accessible from resources within the account and in the same region.
     * 
     */
    @Export(name="privateHost", refs={String.class}, tree="[0]")
    private Output<String> privateHost;

    /**
     * @return Same as `host`, but only accessible from resources within the account and in the same region.
     * 
     */
    public Output<String> privateHost() {
        return this.privateHost;
    }
    /**
     * The ID of the VPC where the database cluster will be located.
     * 
     */
    @Export(name="privateNetworkUuid", refs={String.class}, tree="[0]")
    private Output<String> privateNetworkUuid;

    /**
     * @return The ID of the VPC where the database cluster will be located.
     * 
     */
    public Output<String> privateNetworkUuid() {
        return this.privateNetworkUuid;
    }
    /**
     * Same as `uri`, but only accessible from resources within the account and in the same region.
     * 
     */
    @Export(name="privateUri", refs={String.class}, tree="[0]")
    private Output<String> privateUri;

    /**
     * @return Same as `uri`, but only accessible from resources within the account and in the same region.
     * 
     */
    public Output<String> privateUri() {
        return this.privateUri;
    }
    /**
     * The ID of the project that the database cluster is assigned to. If excluded when creating a new database cluster, it will be assigned to your default project.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return The ID of the project that the database cluster is assigned to. If excluded when creating a new database cluster, it will be assigned to your default project.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * DigitalOcean region where the cluster will reside.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return DigitalOcean region where the cluster will reside.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * Database Droplet size associated with the cluster (ex. `db-s-1vcpu-1gb`). See here for a [list of valid size slugs](https://docs.digitalocean.com/reference/api/api-reference/#tag/Databases).
     * 
     */
    @Export(name="size", refs={String.class}, tree="[0]")
    private Output<String> size;

    /**
     * @return Database Droplet size associated with the cluster (ex. `db-s-1vcpu-1gb`). See here for a [list of valid size slugs](https://docs.digitalocean.com/reference/api/api-reference/#tag/Databases).
     * 
     */
    public Output<String> size() {
        return this.size;
    }
    /**
     * A comma separated string specifying the  SQL modes for a MySQL cluster.
     * 
     */
    @Export(name="sqlMode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> sqlMode;

    /**
     * @return A comma separated string specifying the  SQL modes for a MySQL cluster.
     * 
     */
    public Output<Optional<String>> sqlMode() {
        return Codegen.optional(this.sqlMode);
    }
    /**
     * Defines the disk size, in MiB, allocated to the cluster. This can be adjusted on MySQL and PostreSQL clusters based on predefined ranges for each slug/droplet size.
     * 
     */
    @Export(name="storageSizeMib", refs={String.class}, tree="[0]")
    private Output<String> storageSizeMib;

    /**
     * @return Defines the disk size, in MiB, allocated to the cluster. This can be adjusted on MySQL and PostreSQL clusters based on predefined ranges for each slug/droplet size.
     * 
     */
    public Output<String> storageSizeMib() {
        return this.storageSizeMib;
    }
    /**
     * A list of tag names to be applied to the database cluster.
     * 
     */
    @Export(name="tags", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return A list of tag names to be applied to the database cluster.
     * 
     */
    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The full URI for connecting to the database cluster.
     * 
     */
    @Export(name="uri", refs={String.class}, tree="[0]")
    private Output<String> uri;

    /**
     * @return The full URI for connecting to the database cluster.
     * 
     */
    public Output<String> uri() {
        return this.uri;
    }
    /**
     * Username for the cluster&#39;s default user.
     * 
     */
    @Export(name="user", refs={String.class}, tree="[0]")
    private Output<String> user;

    /**
     * @return Username for the cluster&#39;s default user.
     * 
     */
    public Output<String> user() {
        return this.user;
    }
    /**
     * Engine version used by the cluster (ex. `14` for PostgreSQL 14).
     * When this value is changed, a call to the [Upgrade major Version for a Database](https://docs.digitalocean.com/reference/api/api-reference/#operation/databases_update_major_version) API operation is made with the new version.
     * 
     */
    @Export(name="version", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> version;

    /**
     * @return Engine version used by the cluster (ex. `14` for PostgreSQL 14).
     * When this value is changed, a call to the [Upgrade major Version for a Database](https://docs.digitalocean.com/reference/api/api-reference/#operation/databases_update_major_version) API operation is made with the new version.
     * 
     */
    public Output<Optional<String>> version() {
        return Codegen.optional(this.version);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DatabaseCluster(String name) {
        this(name, DatabaseClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DatabaseCluster(String name, DatabaseClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DatabaseCluster(String name, DatabaseClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/databaseCluster:DatabaseCluster", name, args == null ? DatabaseClusterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DatabaseCluster(String name, Output<String> id, @Nullable DatabaseClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/databaseCluster:DatabaseCluster", name, state, makeResourceOptions(options, id));
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
    public static DatabaseCluster get(String name, Output<String> id, @Nullable DatabaseClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DatabaseCluster(name, id, state, options);
    }
}
