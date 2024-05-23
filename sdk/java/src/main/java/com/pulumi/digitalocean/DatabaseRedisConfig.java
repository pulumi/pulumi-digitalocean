// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.digitalocean.DatabaseRedisConfigArgs;
import com.pulumi.digitalocean.Utilities;
import com.pulumi.digitalocean.inputs.DatabaseRedisConfigState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a virtual resource that can be used to change advanced configuration
 * options for a DigitalOcean managed Redis database cluster.
 * 
 * &gt; **Note** Redis configurations are only removed from state when destroyed. The remote configuration is not unset.
 * 
 * ## Example Usage
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
 * import com.pulumi.digitalocean.DatabaseRedisConfig;
 * import com.pulumi.digitalocean.DatabaseRedisConfigArgs;
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
 *         var exampleDatabaseCluster = new DatabaseCluster("exampleDatabaseCluster", DatabaseClusterArgs.builder()
 *             .name("example-redis-cluster")
 *             .engine("redis")
 *             .version("7")
 *             .size("db-s-1vcpu-1gb")
 *             .region("nyc1")
 *             .nodeCount(1)
 *             .build());
 * 
 *         var example = new DatabaseRedisConfig("example", DatabaseRedisConfigArgs.builder()
 *             .clusterId(exampleDatabaseCluster.id())
 *             .maxmemoryPolicy("allkeys-lru")
 *             .notifyKeyspaceEvents("KEA")
 *             .timeout(90)
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
 * A Redis database cluster&#39;s configuration can be imported using the `id` the parent cluster, e.g.
 * 
 * ```sh
 * $ pulumi import digitalocean:index/databaseRedisConfig:DatabaseRedisConfig example 245bcfd0-7f31-4ce6-a2bc-475a116cca97
 * ```
 * 
 */
@ResourceType(type="digitalocean:index/databaseRedisConfig:DatabaseRedisConfig")
public class DatabaseRedisConfig extends com.pulumi.resources.CustomResource {
    /**
     * Determines default pub/sub channels&#39; ACL for new users if an ACL is not supplied. When this option is not defined, `allchannels` is assumed to keep backward compatibility. This option doesn&#39;t affect Redis&#39; `acl-pubsub-default` configuration. Supported values are: `allchannels` and `resetchannels`
     * 
     */
    @Export(name="aclChannelsDefault", refs={String.class}, tree="[0]")
    private Output<String> aclChannelsDefault;

    /**
     * @return Determines default pub/sub channels&#39; ACL for new users if an ACL is not supplied. When this option is not defined, `allchannels` is assumed to keep backward compatibility. This option doesn&#39;t affect Redis&#39; `acl-pubsub-default` configuration. Supported values are: `allchannels` and `resetchannels`
     * 
     */
    public Output<String> aclChannelsDefault() {
        return this.aclChannelsDefault;
    }
    /**
     * The ID of the target Redis cluster.
     * 
     */
    @Export(name="clusterId", refs={String.class}, tree="[0]")
    private Output<String> clusterId;

    /**
     * @return The ID of the target Redis cluster.
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }
    /**
     * The Redis IO thread count.
     * 
     */
    @Export(name="ioThreads", refs={Integer.class}, tree="[0]")
    private Output<Integer> ioThreads;

    /**
     * @return The Redis IO thread count.
     * 
     */
    public Output<Integer> ioThreads() {
        return this.ioThreads;
    }
    /**
     * The LFU maxmemory policy counter decay time in minutes.
     * 
     */
    @Export(name="lfuDecayTime", refs={Integer.class}, tree="[0]")
    private Output<Integer> lfuDecayTime;

    /**
     * @return The LFU maxmemory policy counter decay time in minutes.
     * 
     */
    public Output<Integer> lfuDecayTime() {
        return this.lfuDecayTime;
    }
    /**
     * The counter logarithm factor for volatile-lfu and allkeys-lfu maxmemory policies.
     * 
     */
    @Export(name="lfuLogFactor", refs={Integer.class}, tree="[0]")
    private Output<Integer> lfuLogFactor;

    /**
     * @return The counter logarithm factor for volatile-lfu and allkeys-lfu maxmemory policies.
     * 
     */
    public Output<Integer> lfuLogFactor() {
        return this.lfuLogFactor;
    }
    /**
     * A string specifying the desired eviction policy for the Redis cluster.Supported values are: `noeviction`, `allkeys-lru`, `allkeys-random`, `volatile-lru`, `volatile-random`, `volatile-ttl`
     * 
     */
    @Export(name="maxmemoryPolicy", refs={String.class}, tree="[0]")
    private Output<String> maxmemoryPolicy;

    /**
     * @return A string specifying the desired eviction policy for the Redis cluster.Supported values are: `noeviction`, `allkeys-lru`, `allkeys-random`, `volatile-lru`, `volatile-random`, `volatile-ttl`
     * 
     */
    public Output<String> maxmemoryPolicy() {
        return this.maxmemoryPolicy;
    }
    /**
     * The `notify-keyspace-events` option. Requires at least `K` or `E`.
     * 
     */
    @Export(name="notifyKeyspaceEvents", refs={String.class}, tree="[0]")
    private Output<String> notifyKeyspaceEvents;

    /**
     * @return The `notify-keyspace-events` option. Requires at least `K` or `E`.
     * 
     */
    public Output<String> notifyKeyspaceEvents() {
        return this.notifyKeyspaceEvents;
    }
    /**
     * The number of Redis databases. Changing this will cause a restart of Redis service.
     * 
     */
    @Export(name="numberOfDatabases", refs={Integer.class}, tree="[0]")
    private Output<Integer> numberOfDatabases;

    /**
     * @return The number of Redis databases. Changing this will cause a restart of Redis service.
     * 
     */
    public Output<Integer> numberOfDatabases() {
        return this.numberOfDatabases;
    }
    /**
     * When persistence is `rdb`, Redis does RDB dumps each 10 minutes if any key is changed. Also RDB dumps are done according to backup schedule for backup purposes. When persistence is `off`, no RDB dumps and backups are done, so data can be lost at any moment if service is restarted for any reason, or if service is powered off. Also service can&#39;t be forked.
     * 
     */
    @Export(name="persistence", refs={String.class}, tree="[0]")
    private Output<String> persistence;

    /**
     * @return When persistence is `rdb`, Redis does RDB dumps each 10 minutes if any key is changed. Also RDB dumps are done according to backup schedule for backup purposes. When persistence is `off`, no RDB dumps and backups are done, so data can be lost at any moment if service is restarted for any reason, or if service is powered off. Also service can&#39;t be forked.
     * 
     */
    public Output<String> persistence() {
        return this.persistence;
    }
    /**
     * The output buffer limit for pub/sub clients in MB. The value is the hard limit, the soft limit is 1/4 of the hard limit. When setting the limit, be mindful of the available memory in the selected service plan.
     * 
     */
    @Export(name="pubsubClientOutputBufferLimit", refs={Integer.class}, tree="[0]")
    private Output<Integer> pubsubClientOutputBufferLimit;

    /**
     * @return The output buffer limit for pub/sub clients in MB. The value is the hard limit, the soft limit is 1/4 of the hard limit. When setting the limit, be mindful of the available memory in the selected service plan.
     * 
     */
    public Output<Integer> pubsubClientOutputBufferLimit() {
        return this.pubsubClientOutputBufferLimit;
    }
    /**
     * A boolean indicating whether to require SSL to access Redis.
     * 
     */
    @Export(name="ssl", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> ssl;

    /**
     * @return A boolean indicating whether to require SSL to access Redis.
     * 
     */
    public Output<Boolean> ssl() {
        return this.ssl;
    }
    /**
     * The Redis idle connection timeout in seconds.
     * 
     */
    @Export(name="timeout", refs={Integer.class}, tree="[0]")
    private Output<Integer> timeout;

    /**
     * @return The Redis idle connection timeout in seconds.
     * 
     */
    public Output<Integer> timeout() {
        return this.timeout;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DatabaseRedisConfig(String name) {
        this(name, DatabaseRedisConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DatabaseRedisConfig(String name, DatabaseRedisConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DatabaseRedisConfig(String name, DatabaseRedisConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/databaseRedisConfig:DatabaseRedisConfig", name, args == null ? DatabaseRedisConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DatabaseRedisConfig(String name, Output<String> id, @Nullable DatabaseRedisConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/databaseRedisConfig:DatabaseRedisConfig", name, state, makeResourceOptions(options, id));
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
    public static DatabaseRedisConfig get(String name, Output<String> id, @Nullable DatabaseRedisConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DatabaseRedisConfig(name, id, state, options);
    }
}
