// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a virtual resource that can be used to change advanced configuration
 * options for a DigitalOcean managed Redis database cluster.
 *
 * > **Note** Redis configurations are only removed from state when destroyed. The remote configuration is not unset.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const exampleDatabaseCluster = new digitalocean.DatabaseCluster("example", {
 *     name: "example-redis-cluster",
 *     engine: "redis",
 *     version: "7",
 *     size: digitalocean.DatabaseSlug.DB_1VPCU1GB,
 *     region: digitalocean.Region.NYC1,
 *     nodeCount: 1,
 * });
 * const example = new digitalocean.DatabaseRedisConfig("example", {
 *     clusterId: exampleDatabaseCluster.id,
 *     maxmemoryPolicy: "allkeys-lru",
 *     notifyKeyspaceEvents: "KEA",
 *     timeout: 90,
 * });
 * ```
 *
 * ## Import
 *
 * A Redis database cluster's configuration can be imported using the `id` the parent cluster, e.g.
 *
 * ```sh
 * $ pulumi import digitalocean:index/databaseRedisConfig:DatabaseRedisConfig example 245bcfd0-7f31-4ce6-a2bc-475a116cca97
 * ```
 */
export class DatabaseRedisConfig extends pulumi.CustomResource {
    /**
     * Get an existing DatabaseRedisConfig resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DatabaseRedisConfigState, opts?: pulumi.CustomResourceOptions): DatabaseRedisConfig {
        return new DatabaseRedisConfig(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'digitalocean:index/databaseRedisConfig:DatabaseRedisConfig';

    /**
     * Returns true if the given object is an instance of DatabaseRedisConfig.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DatabaseRedisConfig {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DatabaseRedisConfig.__pulumiType;
    }

    /**
     * Determines default pub/sub channels' ACL for new users if an ACL is not supplied. When this option is not defined, `allchannels` is assumed to keep backward compatibility. This option doesn't affect Redis' `acl-pubsub-default` configuration. Supported values are: `allchannels` and `resetchannels`
     */
    public readonly aclChannelsDefault!: pulumi.Output<string>;
    /**
     * The ID of the target Redis cluster.
     */
    public readonly clusterId!: pulumi.Output<string>;
    /**
     * The Redis IO thread count.
     */
    public readonly ioThreads!: pulumi.Output<number>;
    /**
     * The LFU maxmemory policy counter decay time in minutes.
     */
    public readonly lfuDecayTime!: pulumi.Output<number>;
    /**
     * The counter logarithm factor for volatile-lfu and allkeys-lfu maxmemory policies.
     */
    public readonly lfuLogFactor!: pulumi.Output<number>;
    /**
     * A string specifying the desired eviction policy for the Redis cluster.Supported values are: `noeviction`, `allkeys-lru`, `allkeys-random`, `volatile-lru`, `volatile-random`, `volatile-ttl`
     */
    public readonly maxmemoryPolicy!: pulumi.Output<string>;
    /**
     * The `notify-keyspace-events` option. Requires at least `K` or `E`.
     */
    public readonly notifyKeyspaceEvents!: pulumi.Output<string>;
    /**
     * The number of Redis databases. Changing this will cause a restart of Redis service.
     */
    public readonly numberOfDatabases!: pulumi.Output<number>;
    /**
     * When persistence is `rdb`, Redis does RDB dumps each 10 minutes if any key is changed. Also RDB dumps are done according to backup schedule for backup purposes. When persistence is `off`, no RDB dumps and backups are done, so data can be lost at any moment if service is restarted for any reason, or if service is powered off. Also service can't be forked.
     */
    public readonly persistence!: pulumi.Output<string>;
    /**
     * The output buffer limit for pub/sub clients in MB. The value is the hard limit, the soft limit is 1/4 of the hard limit. When setting the limit, be mindful of the available memory in the selected service plan.
     */
    public readonly pubsubClientOutputBufferLimit!: pulumi.Output<number>;
    /**
     * A boolean indicating whether to require SSL to access Redis.
     * - When enabled, Redis accepts only SSL connections on port `25061`.
     * - When disabled, port `25060` is opened for non-SSL connections, while port `25061` remains available for SSL connections.
     */
    public readonly ssl!: pulumi.Output<boolean>;
    /**
     * The Redis idle connection timeout in seconds.
     */
    public readonly timeout!: pulumi.Output<number>;

    /**
     * Create a DatabaseRedisConfig resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DatabaseRedisConfigArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DatabaseRedisConfigArgs | DatabaseRedisConfigState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DatabaseRedisConfigState | undefined;
            resourceInputs["aclChannelsDefault"] = state ? state.aclChannelsDefault : undefined;
            resourceInputs["clusterId"] = state ? state.clusterId : undefined;
            resourceInputs["ioThreads"] = state ? state.ioThreads : undefined;
            resourceInputs["lfuDecayTime"] = state ? state.lfuDecayTime : undefined;
            resourceInputs["lfuLogFactor"] = state ? state.lfuLogFactor : undefined;
            resourceInputs["maxmemoryPolicy"] = state ? state.maxmemoryPolicy : undefined;
            resourceInputs["notifyKeyspaceEvents"] = state ? state.notifyKeyspaceEvents : undefined;
            resourceInputs["numberOfDatabases"] = state ? state.numberOfDatabases : undefined;
            resourceInputs["persistence"] = state ? state.persistence : undefined;
            resourceInputs["pubsubClientOutputBufferLimit"] = state ? state.pubsubClientOutputBufferLimit : undefined;
            resourceInputs["ssl"] = state ? state.ssl : undefined;
            resourceInputs["timeout"] = state ? state.timeout : undefined;
        } else {
            const args = argsOrState as DatabaseRedisConfigArgs | undefined;
            if ((!args || args.clusterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterId'");
            }
            resourceInputs["aclChannelsDefault"] = args ? args.aclChannelsDefault : undefined;
            resourceInputs["clusterId"] = args ? args.clusterId : undefined;
            resourceInputs["ioThreads"] = args ? args.ioThreads : undefined;
            resourceInputs["lfuDecayTime"] = args ? args.lfuDecayTime : undefined;
            resourceInputs["lfuLogFactor"] = args ? args.lfuLogFactor : undefined;
            resourceInputs["maxmemoryPolicy"] = args ? args.maxmemoryPolicy : undefined;
            resourceInputs["notifyKeyspaceEvents"] = args ? args.notifyKeyspaceEvents : undefined;
            resourceInputs["numberOfDatabases"] = args ? args.numberOfDatabases : undefined;
            resourceInputs["persistence"] = args ? args.persistence : undefined;
            resourceInputs["pubsubClientOutputBufferLimit"] = args ? args.pubsubClientOutputBufferLimit : undefined;
            resourceInputs["ssl"] = args ? args.ssl : undefined;
            resourceInputs["timeout"] = args ? args.timeout : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DatabaseRedisConfig.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DatabaseRedisConfig resources.
 */
export interface DatabaseRedisConfigState {
    /**
     * Determines default pub/sub channels' ACL for new users if an ACL is not supplied. When this option is not defined, `allchannels` is assumed to keep backward compatibility. This option doesn't affect Redis' `acl-pubsub-default` configuration. Supported values are: `allchannels` and `resetchannels`
     */
    aclChannelsDefault?: pulumi.Input<string>;
    /**
     * The ID of the target Redis cluster.
     */
    clusterId?: pulumi.Input<string>;
    /**
     * The Redis IO thread count.
     */
    ioThreads?: pulumi.Input<number>;
    /**
     * The LFU maxmemory policy counter decay time in minutes.
     */
    lfuDecayTime?: pulumi.Input<number>;
    /**
     * The counter logarithm factor for volatile-lfu and allkeys-lfu maxmemory policies.
     */
    lfuLogFactor?: pulumi.Input<number>;
    /**
     * A string specifying the desired eviction policy for the Redis cluster.Supported values are: `noeviction`, `allkeys-lru`, `allkeys-random`, `volatile-lru`, `volatile-random`, `volatile-ttl`
     */
    maxmemoryPolicy?: pulumi.Input<string>;
    /**
     * The `notify-keyspace-events` option. Requires at least `K` or `E`.
     */
    notifyKeyspaceEvents?: pulumi.Input<string>;
    /**
     * The number of Redis databases. Changing this will cause a restart of Redis service.
     */
    numberOfDatabases?: pulumi.Input<number>;
    /**
     * When persistence is `rdb`, Redis does RDB dumps each 10 minutes if any key is changed. Also RDB dumps are done according to backup schedule for backup purposes. When persistence is `off`, no RDB dumps and backups are done, so data can be lost at any moment if service is restarted for any reason, or if service is powered off. Also service can't be forked.
     */
    persistence?: pulumi.Input<string>;
    /**
     * The output buffer limit for pub/sub clients in MB. The value is the hard limit, the soft limit is 1/4 of the hard limit. When setting the limit, be mindful of the available memory in the selected service plan.
     */
    pubsubClientOutputBufferLimit?: pulumi.Input<number>;
    /**
     * A boolean indicating whether to require SSL to access Redis.
     * - When enabled, Redis accepts only SSL connections on port `25061`.
     * - When disabled, port `25060` is opened for non-SSL connections, while port `25061` remains available for SSL connections.
     */
    ssl?: pulumi.Input<boolean>;
    /**
     * The Redis idle connection timeout in seconds.
     */
    timeout?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a DatabaseRedisConfig resource.
 */
export interface DatabaseRedisConfigArgs {
    /**
     * Determines default pub/sub channels' ACL for new users if an ACL is not supplied. When this option is not defined, `allchannels` is assumed to keep backward compatibility. This option doesn't affect Redis' `acl-pubsub-default` configuration. Supported values are: `allchannels` and `resetchannels`
     */
    aclChannelsDefault?: pulumi.Input<string>;
    /**
     * The ID of the target Redis cluster.
     */
    clusterId: pulumi.Input<string>;
    /**
     * The Redis IO thread count.
     */
    ioThreads?: pulumi.Input<number>;
    /**
     * The LFU maxmemory policy counter decay time in minutes.
     */
    lfuDecayTime?: pulumi.Input<number>;
    /**
     * The counter logarithm factor for volatile-lfu and allkeys-lfu maxmemory policies.
     */
    lfuLogFactor?: pulumi.Input<number>;
    /**
     * A string specifying the desired eviction policy for the Redis cluster.Supported values are: `noeviction`, `allkeys-lru`, `allkeys-random`, `volatile-lru`, `volatile-random`, `volatile-ttl`
     */
    maxmemoryPolicy?: pulumi.Input<string>;
    /**
     * The `notify-keyspace-events` option. Requires at least `K` or `E`.
     */
    notifyKeyspaceEvents?: pulumi.Input<string>;
    /**
     * The number of Redis databases. Changing this will cause a restart of Redis service.
     */
    numberOfDatabases?: pulumi.Input<number>;
    /**
     * When persistence is `rdb`, Redis does RDB dumps each 10 minutes if any key is changed. Also RDB dumps are done according to backup schedule for backup purposes. When persistence is `off`, no RDB dumps and backups are done, so data can be lost at any moment if service is restarted for any reason, or if service is powered off. Also service can't be forked.
     */
    persistence?: pulumi.Input<string>;
    /**
     * The output buffer limit for pub/sub clients in MB. The value is the hard limit, the soft limit is 1/4 of the hard limit. When setting the limit, be mindful of the available memory in the selected service plan.
     */
    pubsubClientOutputBufferLimit?: pulumi.Input<number>;
    /**
     * A boolean indicating whether to require SSL to access Redis.
     * - When enabled, Redis accepts only SSL connections on port `25061`.
     * - When disabled, port `25060` is opened for non-SSL connections, while port `25061` remains available for SSL connections.
     */
    ssl?: pulumi.Input<boolean>;
    /**
     * The Redis idle connection timeout in seconds.
     */
    timeout?: pulumi.Input<number>;
}
