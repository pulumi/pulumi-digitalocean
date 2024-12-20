// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.digitalocean.DatabaseUserArgs;
import com.pulumi.digitalocean.Utilities;
import com.pulumi.digitalocean.inputs.DatabaseUserState;
import com.pulumi.digitalocean.outputs.DatabaseUserSetting;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a DigitalOcean database user resource. When creating a new database cluster, a default admin user with name `doadmin` will be created. Then, this resource can be used to provide additional normal users inside the cluster.
 * 
 * &gt; **NOTE:** Any new users created will always have `normal` role, only the default user that comes with database cluster creation has `primary` role. Additional permissions must be managed manually.
 * 
 * ## Example Usage
 * 
 * ### Create a new PostgreSQL database user
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
 * import com.pulumi.digitalocean.DatabaseUser;
 * import com.pulumi.digitalocean.DatabaseUserArgs;
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
 *         var user_example = new DatabaseUser("user-example", DatabaseUserArgs.builder()
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
 * ### Create a new user for a PostgreSQL database replica
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
 * import com.pulumi.digitalocean.DatabaseUser;
 * import com.pulumi.digitalocean.DatabaseUserArgs;
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
 *         var user_example = new DatabaseUser("user-example", DatabaseUserArgs.builder()
 *             .clusterId(replica_example.uuid())
 *             .name("foobar")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Create a new user for a Kafka database cluster
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
 * import com.pulumi.digitalocean.DatabaseKafkaTopic;
 * import com.pulumi.digitalocean.DatabaseKafkaTopicArgs;
 * import com.pulumi.digitalocean.DatabaseUser;
 * import com.pulumi.digitalocean.DatabaseUserArgs;
 * import com.pulumi.digitalocean.inputs.DatabaseUserSettingArgs;
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
 *         var kafka_example = new DatabaseCluster("kafka-example", DatabaseClusterArgs.builder()
 *             .name("example-kafka-cluster")
 *             .engine("kafka")
 *             .version("3.5")
 *             .size("db-s-2vcpu-2gb")
 *             .region("nyc1")
 *             .nodeCount(3)
 *             .build());
 * 
 *         var foobarTopic = new DatabaseKafkaTopic("foobarTopic", DatabaseKafkaTopicArgs.builder()
 *             .clusterId(foobar.id())
 *             .name("topic-1")
 *             .build());
 * 
 *         var foobarUser = new DatabaseUser("foobarUser", DatabaseUserArgs.builder()
 *             .clusterId(foobar.id())
 *             .name("example-user")
 *             .settings(DatabaseUserSettingArgs.builder()
 *                 .acls(                
 *                     DatabaseUserSettingAclArgs.builder()
 *                         .topic("topic-1")
 *                         .permission("produce")
 *                         .build(),
 *                     DatabaseUserSettingAclArgs.builder()
 *                         .topic("topic-2")
 *                         .permission("produceconsume")
 *                         .build(),
 *                     DatabaseUserSettingAclArgs.builder()
 *                         .topic("topic-*")
 *                         .permission("consume")
 *                         .build())
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
 * Database user can be imported using the `id` of the source database cluster
 * 
 * and the `name` of the user joined with a comma. For example:
 * 
 * ```sh
 * $ pulumi import digitalocean:index/databaseUser:DatabaseUser user-example 245bcfd0-7f31-4ce6-a2bc-475a116cca97,foobar
 * ```
 * 
 */
@ResourceType(type="digitalocean:index/databaseUser:DatabaseUser")
public class DatabaseUser extends com.pulumi.resources.CustomResource {
    /**
     * Access certificate for TLS client authentication. (Kafka only)
     * 
     */
    @Export(name="accessCert", refs={String.class}, tree="[0]")
    private Output<String> accessCert;

    /**
     * @return Access certificate for TLS client authentication. (Kafka only)
     * 
     */
    public Output<String> accessCert() {
        return this.accessCert;
    }
    /**
     * Access key for TLS client authentication. (Kafka only)
     * 
     */
    @Export(name="accessKey", refs={String.class}, tree="[0]")
    private Output<String> accessKey;

    /**
     * @return Access key for TLS client authentication. (Kafka only)
     * 
     */
    public Output<String> accessKey() {
        return this.accessKey;
    }
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
     * The authentication method to use for connections to the MySQL user account. The valid values are `mysql_native_password` or `caching_sha2_password` (this is the default).
     * 
     */
    @Export(name="mysqlAuthPlugin", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> mysqlAuthPlugin;

    /**
     * @return The authentication method to use for connections to the MySQL user account. The valid values are `mysql_native_password` or `caching_sha2_password` (this is the default).
     * 
     */
    public Output<Optional<String>> mysqlAuthPlugin() {
        return Codegen.optional(this.mysqlAuthPlugin);
    }
    /**
     * The name for the database user.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name for the database user.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Password for the database user.
     * 
     */
    @Export(name="password", refs={String.class}, tree="[0]")
    private Output<String> password;

    /**
     * @return Password for the database user.
     * 
     */
    public Output<String> password() {
        return this.password;
    }
    /**
     * Role for the database user. The value will be either &#34;primary&#34; or &#34;normal&#34;.
     * 
     */
    @Export(name="role", refs={String.class}, tree="[0]")
    private Output<String> role;

    /**
     * @return Role for the database user. The value will be either &#34;primary&#34; or &#34;normal&#34;.
     * 
     */
    public Output<String> role() {
        return this.role;
    }
    /**
     * Contains optional settings for the user.
     * The `settings` block is documented below.
     * 
     */
    @Export(name="settings", refs={List.class,DatabaseUserSetting.class}, tree="[0,1]")
    private Output</* @Nullable */ List<DatabaseUserSetting>> settings;

    /**
     * @return Contains optional settings for the user.
     * The `settings` block is documented below.
     * 
     */
    public Output<Optional<List<DatabaseUserSetting>>> settings() {
        return Codegen.optional(this.settings);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DatabaseUser(java.lang.String name) {
        this(name, DatabaseUserArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DatabaseUser(java.lang.String name, DatabaseUserArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DatabaseUser(java.lang.String name, DatabaseUserArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/databaseUser:DatabaseUser", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private DatabaseUser(java.lang.String name, Output<java.lang.String> id, @Nullable DatabaseUserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/databaseUser:DatabaseUser", name, state, makeResourceOptions(options, id), false);
    }

    private static DatabaseUserArgs makeArgs(DatabaseUserArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? DatabaseUserArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "accessCert",
                "accessKey",
                "password"
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
    public static DatabaseUser get(java.lang.String name, Output<java.lang.String> id, @Nullable DatabaseUserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DatabaseUser(name, id, state, options);
    }
}
