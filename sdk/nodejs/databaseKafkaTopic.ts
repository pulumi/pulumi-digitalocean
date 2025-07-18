// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as enums from "./types/enums";
import * as utilities from "./utilities";

/**
 * Provides a DigitalOcean Kafka topic for Kafka clusters.
 *
 * ## Example Usage
 *
 * ### Create a new Kafka topic
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const kafka_example = new digitalocean.DatabaseCluster("kafka-example", {
 *     name: "example-kafka-cluster",
 *     engine: "kafka",
 *     version: "3.5",
 *     size: "db-s-2vcpu-2gb",
 *     region: digitalocean.Region.NYC1,
 *     nodeCount: 3,
 *     tags: ["production"],
 * });
 * const topic_01 = new digitalocean.DatabaseKafkaTopic("topic-01", {
 *     clusterId: kafka_example.id,
 *     name: "topic-01",
 *     partitionCount: 3,
 *     replicationFactor: 2,
 *     configs: [{
 *         cleanupPolicy: "compact",
 *         compressionType: "uncompressed",
 *         deleteRetentionMs: "14000",
 *         fileDeleteDelayMs: "170000",
 *         flushMessages: "92233",
 *         flushMs: "92233720368",
 *         indexIntervalBytes: "40962",
 *         maxCompactionLagMs: "9223372036854775807",
 *         maxMessageBytes: "1048588",
 *         messageDownConversionEnable: true,
 *         messageFormatVersion: "3.0-IV1",
 *         messageTimestampDifferenceMaxMs: "9223372036854775807",
 *         messageTimestampType: "log_append_time",
 *         minCleanableDirtyRatio: 0.5,
 *         minCompactionLagMs: "20000",
 *         minInsyncReplicas: 2,
 *         preallocate: false,
 *         retentionBytes: "-1",
 *         retentionMs: "-1",
 *         segmentBytes: "209715200",
 *         segmentIndexBytes: "10485760",
 *         segmentJitterMs: "0",
 *         segmentMs: "604800000",
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Topics can be imported using the `id` of the source cluster and the `name` of the topic joined with a comma. For example:
 *
 * ```sh
 * $ pulumi import digitalocean:index/databaseKafkaTopic:DatabaseKafkaTopic topic-01 245bcfd0-7f31-4ce6-a2bc-475a116cca97,topic-01
 * ```
 */
export class DatabaseKafkaTopic extends pulumi.CustomResource {
    /**
     * Get an existing DatabaseKafkaTopic resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DatabaseKafkaTopicState, opts?: pulumi.CustomResourceOptions): DatabaseKafkaTopic {
        return new DatabaseKafkaTopic(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'digitalocean:index/databaseKafkaTopic:DatabaseKafkaTopic';

    /**
     * Returns true if the given object is an instance of DatabaseKafkaTopic.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DatabaseKafkaTopic {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DatabaseKafkaTopic.__pulumiType;
    }

    /**
     * The ID of the source database cluster. Note: This must be a Kafka cluster.
     */
    public readonly clusterId!: pulumi.Output<string>;
    /**
     * A set of advanced configuration parameters. Defaults will be set for any of the parameters that are not included.
     * The `config` block is documented below.
     */
    public readonly configs!: pulumi.Output<outputs.DatabaseKafkaTopicConfig[]>;
    /**
     * The name for the topic.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The number of partitions for the topic. Default and minimum set at 3, maximum is 2048.
     */
    public readonly partitionCount!: pulumi.Output<number | undefined>;
    /**
     * The number of nodes that topics are replicated across. Default and minimum set at 2, maximum is the number of nodes in the cluster.
     */
    public readonly replicationFactor!: pulumi.Output<number | undefined>;
    /**
     * The current status of the topic. Possible values are 'active', 'configuring', and 'deleting'.
     */
    public /*out*/ readonly state!: pulumi.Output<string>;

    /**
     * Create a DatabaseKafkaTopic resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DatabaseKafkaTopicArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DatabaseKafkaTopicArgs | DatabaseKafkaTopicState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DatabaseKafkaTopicState | undefined;
            resourceInputs["clusterId"] = state ? state.clusterId : undefined;
            resourceInputs["configs"] = state ? state.configs : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["partitionCount"] = state ? state.partitionCount : undefined;
            resourceInputs["replicationFactor"] = state ? state.replicationFactor : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
        } else {
            const args = argsOrState as DatabaseKafkaTopicArgs | undefined;
            if ((!args || args.clusterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterId'");
            }
            resourceInputs["clusterId"] = args ? args.clusterId : undefined;
            resourceInputs["configs"] = args ? args.configs : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["partitionCount"] = args ? args.partitionCount : undefined;
            resourceInputs["replicationFactor"] = args ? args.replicationFactor : undefined;
            resourceInputs["state"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DatabaseKafkaTopic.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DatabaseKafkaTopic resources.
 */
export interface DatabaseKafkaTopicState {
    /**
     * The ID of the source database cluster. Note: This must be a Kafka cluster.
     */
    clusterId?: pulumi.Input<string>;
    /**
     * A set of advanced configuration parameters. Defaults will be set for any of the parameters that are not included.
     * The `config` block is documented below.
     */
    configs?: pulumi.Input<pulumi.Input<inputs.DatabaseKafkaTopicConfig>[]>;
    /**
     * The name for the topic.
     */
    name?: pulumi.Input<string>;
    /**
     * The number of partitions for the topic. Default and minimum set at 3, maximum is 2048.
     */
    partitionCount?: pulumi.Input<number>;
    /**
     * The number of nodes that topics are replicated across. Default and minimum set at 2, maximum is the number of nodes in the cluster.
     */
    replicationFactor?: pulumi.Input<number>;
    /**
     * The current status of the topic. Possible values are 'active', 'configuring', and 'deleting'.
     */
    state?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a DatabaseKafkaTopic resource.
 */
export interface DatabaseKafkaTopicArgs {
    /**
     * The ID of the source database cluster. Note: This must be a Kafka cluster.
     */
    clusterId: pulumi.Input<string>;
    /**
     * A set of advanced configuration parameters. Defaults will be set for any of the parameters that are not included.
     * The `config` block is documented below.
     */
    configs?: pulumi.Input<pulumi.Input<inputs.DatabaseKafkaTopicConfig>[]>;
    /**
     * The name for the topic.
     */
    name?: pulumi.Input<string>;
    /**
     * The number of partitions for the topic. Default and minimum set at 3, maximum is 2048.
     */
    partitionCount?: pulumi.Input<number>;
    /**
     * The number of nodes that topics are replicated across. Default and minimum set at 2, maximum is the number of nodes in the cluster.
     */
    replicationFactor?: pulumi.Input<number>;
}
