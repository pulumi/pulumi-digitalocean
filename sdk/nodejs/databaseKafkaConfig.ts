// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a virtual resource that can be used to change advanced configuration
 * options for a DigitalOcean managed Kafka database cluster.
 *
 * > **Note** Kafka configurations are only removed from state when destroyed. The remote configuration is not unset.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const exampleDatabaseCluster = new digitalocean.DatabaseCluster("example", {
 *     name: "example-kafka-cluster",
 *     engine: "kafka",
 *     version: "3.7",
 *     size: digitalocean.DatabaseSlug.DB_1VPCU1GB,
 *     region: digitalocean.Region.NYC3,
 *     nodeCount: 3,
 * });
 * const example = new digitalocean.DatabaseKafkaConfig("example", {
 *     clusterId: exampleDatabaseCluster.id,
 *     groupInitialRebalanceDelayMs: 3000,
 *     groupMinSessionTimeoutMs: 6000,
 *     groupMaxSessionTimeoutMs: 1800000,
 *     messageMaxBytes: 1048588,
 *     logCleanerDeleteRetentionMs: 86400000,
 *     logCleanerMinCompactionLagMs: "0",
 *     logFlushIntervalMs: "9223372036854775807",
 *     logIndexIntervalBytes: 4096,
 *     logMessageDownconversionEnable: true,
 *     logMessageTimestampDifferenceMaxMs: "9223372036854775807",
 *     logPreallocate: false,
 *     logRetentionBytes: "-1",
 *     logRetentionHours: 168,
 *     logRetentionMs: "604800000",
 *     logRollJitterMs: "0",
 *     logSegmentDeleteDelayMs: 60000,
 *     autoCreateTopicsEnable: true,
 * });
 * ```
 *
 * ## Import
 *
 * A Kafka database cluster's configuration can be imported using the `id` the parent cluster, e.g.
 *
 * ```sh
 * $ pulumi import digitalocean:index/databaseKafkaConfig:DatabaseKafkaConfig example 4b62829a-9c42-465b-aaa3-84051048e712
 * ```
 */
export class DatabaseKafkaConfig extends pulumi.CustomResource {
    /**
     * Get an existing DatabaseKafkaConfig resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DatabaseKafkaConfigState, opts?: pulumi.CustomResourceOptions): DatabaseKafkaConfig {
        return new DatabaseKafkaConfig(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'digitalocean:index/databaseKafkaConfig:DatabaseKafkaConfig';

    /**
     * Returns true if the given object is an instance of DatabaseKafkaConfig.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DatabaseKafkaConfig {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DatabaseKafkaConfig.__pulumiType;
    }

    /**
     * Enable auto creation of topics.
     */
    public readonly autoCreateTopicsEnable!: pulumi.Output<boolean>;
    /**
     * The ID of the target Kafka cluster.
     */
    public readonly clusterId!: pulumi.Output<string>;
    /**
     * The amount of time, in milliseconds, the group coordinator will wait for more consumers to join a new group before performing the first rebalance. A longer delay means potentially fewer rebalances, but increases the time until processing begins. The default value for this is 3 seconds. During development and testing it might be desirable to set this to 0 in order to not delay test execution time.
     */
    public readonly groupInitialRebalanceDelayMs!: pulumi.Output<number>;
    /**
     * The maximum allowed session timeout for registered consumers. Longer timeouts give consumers more time to process messages in between heartbeats at the cost of a longer time to detect failures.
     */
    public readonly groupMaxSessionTimeoutMs!: pulumi.Output<number>;
    /**
     * The minimum allowed session timeout for registered consumers. Longer timeouts give consumers more time to process messages in between heartbeats at the cost of a longer time to detect failures.
     */
    public readonly groupMinSessionTimeoutMs!: pulumi.Output<number>;
    /**
     * How long are delete records retained?
     */
    public readonly logCleanerDeleteRetentionMs!: pulumi.Output<number>;
    /**
     * The minimum time a message will remain uncompacted in the log. Only applicable for logs that are being compacted.
     */
    public readonly logCleanerMinCompactionLagMs!: pulumi.Output<string>;
    /**
     * The maximum time in ms that a message in any topic is kept in memory before flushed to disk. If not set, the value in log.flush.scheduler.interval.ms is used.
     */
    public readonly logFlushIntervalMs!: pulumi.Output<string>;
    /**
     * The interval with which Kafka adds an entry to the offset index.
     */
    public readonly logIndexIntervalBytes!: pulumi.Output<number>;
    /**
     * This configuration controls whether down-conversion of message formats is enabled to satisfy consume requests.
     */
    public readonly logMessageDownconversionEnable!: pulumi.Output<boolean>;
    /**
     * The maximum difference allowed between the timestamp when a broker receives a message and the timestamp specified in the message.
     */
    public readonly logMessageTimestampDifferenceMaxMs!: pulumi.Output<string>;
    /**
     * Controls whether to preallocate a file when creating a new segment.
     */
    public readonly logPreallocate!: pulumi.Output<boolean>;
    /**
     * The maximum size of the log before deleting messages.
     */
    public readonly logRetentionBytes!: pulumi.Output<string>;
    /**
     * The number of hours to keep a log file before deleting it.
     */
    public readonly logRetentionHours!: pulumi.Output<number>;
    /**
     * The number of milliseconds to keep a log file before deleting it (in milliseconds), If not set, the value in log.retention.minutes is used. If set to -1, no time limit is applied.
     */
    public readonly logRetentionMs!: pulumi.Output<string>;
    /**
     * The maximum jitter to subtract from logRollTimeMillis (in milliseconds). If not set, the value in log.roll.jitter.hours is used.
     */
    public readonly logRollJitterMs!: pulumi.Output<string>;
    /**
     * The amount of time to wait before deleting a file from the filesystem.
     */
    public readonly logSegmentDeleteDelayMs!: pulumi.Output<number>;
    /**
     * The maximum size of message that the server can receive.
     */
    public readonly messageMaxBytes!: pulumi.Output<number>;

    /**
     * Create a DatabaseKafkaConfig resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DatabaseKafkaConfigArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DatabaseKafkaConfigArgs | DatabaseKafkaConfigState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DatabaseKafkaConfigState | undefined;
            resourceInputs["autoCreateTopicsEnable"] = state ? state.autoCreateTopicsEnable : undefined;
            resourceInputs["clusterId"] = state ? state.clusterId : undefined;
            resourceInputs["groupInitialRebalanceDelayMs"] = state ? state.groupInitialRebalanceDelayMs : undefined;
            resourceInputs["groupMaxSessionTimeoutMs"] = state ? state.groupMaxSessionTimeoutMs : undefined;
            resourceInputs["groupMinSessionTimeoutMs"] = state ? state.groupMinSessionTimeoutMs : undefined;
            resourceInputs["logCleanerDeleteRetentionMs"] = state ? state.logCleanerDeleteRetentionMs : undefined;
            resourceInputs["logCleanerMinCompactionLagMs"] = state ? state.logCleanerMinCompactionLagMs : undefined;
            resourceInputs["logFlushIntervalMs"] = state ? state.logFlushIntervalMs : undefined;
            resourceInputs["logIndexIntervalBytes"] = state ? state.logIndexIntervalBytes : undefined;
            resourceInputs["logMessageDownconversionEnable"] = state ? state.logMessageDownconversionEnable : undefined;
            resourceInputs["logMessageTimestampDifferenceMaxMs"] = state ? state.logMessageTimestampDifferenceMaxMs : undefined;
            resourceInputs["logPreallocate"] = state ? state.logPreallocate : undefined;
            resourceInputs["logRetentionBytes"] = state ? state.logRetentionBytes : undefined;
            resourceInputs["logRetentionHours"] = state ? state.logRetentionHours : undefined;
            resourceInputs["logRetentionMs"] = state ? state.logRetentionMs : undefined;
            resourceInputs["logRollJitterMs"] = state ? state.logRollJitterMs : undefined;
            resourceInputs["logSegmentDeleteDelayMs"] = state ? state.logSegmentDeleteDelayMs : undefined;
            resourceInputs["messageMaxBytes"] = state ? state.messageMaxBytes : undefined;
        } else {
            const args = argsOrState as DatabaseKafkaConfigArgs | undefined;
            if ((!args || args.clusterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterId'");
            }
            resourceInputs["autoCreateTopicsEnable"] = args ? args.autoCreateTopicsEnable : undefined;
            resourceInputs["clusterId"] = args ? args.clusterId : undefined;
            resourceInputs["groupInitialRebalanceDelayMs"] = args ? args.groupInitialRebalanceDelayMs : undefined;
            resourceInputs["groupMaxSessionTimeoutMs"] = args ? args.groupMaxSessionTimeoutMs : undefined;
            resourceInputs["groupMinSessionTimeoutMs"] = args ? args.groupMinSessionTimeoutMs : undefined;
            resourceInputs["logCleanerDeleteRetentionMs"] = args ? args.logCleanerDeleteRetentionMs : undefined;
            resourceInputs["logCleanerMinCompactionLagMs"] = args ? args.logCleanerMinCompactionLagMs : undefined;
            resourceInputs["logFlushIntervalMs"] = args ? args.logFlushIntervalMs : undefined;
            resourceInputs["logIndexIntervalBytes"] = args ? args.logIndexIntervalBytes : undefined;
            resourceInputs["logMessageDownconversionEnable"] = args ? args.logMessageDownconversionEnable : undefined;
            resourceInputs["logMessageTimestampDifferenceMaxMs"] = args ? args.logMessageTimestampDifferenceMaxMs : undefined;
            resourceInputs["logPreallocate"] = args ? args.logPreallocate : undefined;
            resourceInputs["logRetentionBytes"] = args ? args.logRetentionBytes : undefined;
            resourceInputs["logRetentionHours"] = args ? args.logRetentionHours : undefined;
            resourceInputs["logRetentionMs"] = args ? args.logRetentionMs : undefined;
            resourceInputs["logRollJitterMs"] = args ? args.logRollJitterMs : undefined;
            resourceInputs["logSegmentDeleteDelayMs"] = args ? args.logSegmentDeleteDelayMs : undefined;
            resourceInputs["messageMaxBytes"] = args ? args.messageMaxBytes : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DatabaseKafkaConfig.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DatabaseKafkaConfig resources.
 */
export interface DatabaseKafkaConfigState {
    /**
     * Enable auto creation of topics.
     */
    autoCreateTopicsEnable?: pulumi.Input<boolean>;
    /**
     * The ID of the target Kafka cluster.
     */
    clusterId?: pulumi.Input<string>;
    /**
     * The amount of time, in milliseconds, the group coordinator will wait for more consumers to join a new group before performing the first rebalance. A longer delay means potentially fewer rebalances, but increases the time until processing begins. The default value for this is 3 seconds. During development and testing it might be desirable to set this to 0 in order to not delay test execution time.
     */
    groupInitialRebalanceDelayMs?: pulumi.Input<number>;
    /**
     * The maximum allowed session timeout for registered consumers. Longer timeouts give consumers more time to process messages in between heartbeats at the cost of a longer time to detect failures.
     */
    groupMaxSessionTimeoutMs?: pulumi.Input<number>;
    /**
     * The minimum allowed session timeout for registered consumers. Longer timeouts give consumers more time to process messages in between heartbeats at the cost of a longer time to detect failures.
     */
    groupMinSessionTimeoutMs?: pulumi.Input<number>;
    /**
     * How long are delete records retained?
     */
    logCleanerDeleteRetentionMs?: pulumi.Input<number>;
    /**
     * The minimum time a message will remain uncompacted in the log. Only applicable for logs that are being compacted.
     */
    logCleanerMinCompactionLagMs?: pulumi.Input<string>;
    /**
     * The maximum time in ms that a message in any topic is kept in memory before flushed to disk. If not set, the value in log.flush.scheduler.interval.ms is used.
     */
    logFlushIntervalMs?: pulumi.Input<string>;
    /**
     * The interval with which Kafka adds an entry to the offset index.
     */
    logIndexIntervalBytes?: pulumi.Input<number>;
    /**
     * This configuration controls whether down-conversion of message formats is enabled to satisfy consume requests.
     */
    logMessageDownconversionEnable?: pulumi.Input<boolean>;
    /**
     * The maximum difference allowed between the timestamp when a broker receives a message and the timestamp specified in the message.
     */
    logMessageTimestampDifferenceMaxMs?: pulumi.Input<string>;
    /**
     * Controls whether to preallocate a file when creating a new segment.
     */
    logPreallocate?: pulumi.Input<boolean>;
    /**
     * The maximum size of the log before deleting messages.
     */
    logRetentionBytes?: pulumi.Input<string>;
    /**
     * The number of hours to keep a log file before deleting it.
     */
    logRetentionHours?: pulumi.Input<number>;
    /**
     * The number of milliseconds to keep a log file before deleting it (in milliseconds), If not set, the value in log.retention.minutes is used. If set to -1, no time limit is applied.
     */
    logRetentionMs?: pulumi.Input<string>;
    /**
     * The maximum jitter to subtract from logRollTimeMillis (in milliseconds). If not set, the value in log.roll.jitter.hours is used.
     */
    logRollJitterMs?: pulumi.Input<string>;
    /**
     * The amount of time to wait before deleting a file from the filesystem.
     */
    logSegmentDeleteDelayMs?: pulumi.Input<number>;
    /**
     * The maximum size of message that the server can receive.
     */
    messageMaxBytes?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a DatabaseKafkaConfig resource.
 */
export interface DatabaseKafkaConfigArgs {
    /**
     * Enable auto creation of topics.
     */
    autoCreateTopicsEnable?: pulumi.Input<boolean>;
    /**
     * The ID of the target Kafka cluster.
     */
    clusterId: pulumi.Input<string>;
    /**
     * The amount of time, in milliseconds, the group coordinator will wait for more consumers to join a new group before performing the first rebalance. A longer delay means potentially fewer rebalances, but increases the time until processing begins. The default value for this is 3 seconds. During development and testing it might be desirable to set this to 0 in order to not delay test execution time.
     */
    groupInitialRebalanceDelayMs?: pulumi.Input<number>;
    /**
     * The maximum allowed session timeout for registered consumers. Longer timeouts give consumers more time to process messages in between heartbeats at the cost of a longer time to detect failures.
     */
    groupMaxSessionTimeoutMs?: pulumi.Input<number>;
    /**
     * The minimum allowed session timeout for registered consumers. Longer timeouts give consumers more time to process messages in between heartbeats at the cost of a longer time to detect failures.
     */
    groupMinSessionTimeoutMs?: pulumi.Input<number>;
    /**
     * How long are delete records retained?
     */
    logCleanerDeleteRetentionMs?: pulumi.Input<number>;
    /**
     * The minimum time a message will remain uncompacted in the log. Only applicable for logs that are being compacted.
     */
    logCleanerMinCompactionLagMs?: pulumi.Input<string>;
    /**
     * The maximum time in ms that a message in any topic is kept in memory before flushed to disk. If not set, the value in log.flush.scheduler.interval.ms is used.
     */
    logFlushIntervalMs?: pulumi.Input<string>;
    /**
     * The interval with which Kafka adds an entry to the offset index.
     */
    logIndexIntervalBytes?: pulumi.Input<number>;
    /**
     * This configuration controls whether down-conversion of message formats is enabled to satisfy consume requests.
     */
    logMessageDownconversionEnable?: pulumi.Input<boolean>;
    /**
     * The maximum difference allowed between the timestamp when a broker receives a message and the timestamp specified in the message.
     */
    logMessageTimestampDifferenceMaxMs?: pulumi.Input<string>;
    /**
     * Controls whether to preallocate a file when creating a new segment.
     */
    logPreallocate?: pulumi.Input<boolean>;
    /**
     * The maximum size of the log before deleting messages.
     */
    logRetentionBytes?: pulumi.Input<string>;
    /**
     * The number of hours to keep a log file before deleting it.
     */
    logRetentionHours?: pulumi.Input<number>;
    /**
     * The number of milliseconds to keep a log file before deleting it (in milliseconds), If not set, the value in log.retention.minutes is used. If set to -1, no time limit is applied.
     */
    logRetentionMs?: pulumi.Input<string>;
    /**
     * The maximum jitter to subtract from logRollTimeMillis (in milliseconds). If not set, the value in log.roll.jitter.hours is used.
     */
    logRollJitterMs?: pulumi.Input<string>;
    /**
     * The amount of time to wait before deleting a file from the filesystem.
     */
    logSegmentDeleteDelayMs?: pulumi.Input<number>;
    /**
     * The maximum size of message that the server can receive.
     */
    messageMaxBytes?: pulumi.Input<number>;
}
