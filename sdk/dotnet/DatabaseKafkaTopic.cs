// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean
{
    /// <summary>
    /// Provides a DigitalOcean Kafka topic for Kafka clusters.
    /// 
    /// ## Example Usage
    /// ### Create a new Kafka topic
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using DigitalOcean = Pulumi.DigitalOcean;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var kafka_example = new DigitalOcean.DatabaseCluster("kafka-example", new()
    ///     {
    ///         Engine = "kafka",
    ///         Version = "3.5",
    ///         Size = "db-s-2vcpu-2gb",
    ///         Region = "nyc1",
    ///         NodeCount = 3,
    ///         Tags = new[]
    ///         {
    ///             "production",
    ///         },
    ///     });
    /// 
    ///     var topic_01 = new DigitalOcean.DatabaseKafkaTopic("topic-01", new()
    ///     {
    ///         ClusterId = kafka_example.Id,
    ///         PartitionCount = 3,
    ///         ReplicationFactor = 2,
    ///         Configs = new[]
    ///         {
    ///             new DigitalOcean.Inputs.DatabaseKafkaTopicConfigArgs
    ///             {
    ///                 CleanupPolicy = "compact",
    ///                 CompressionType = "uncompressed",
    ///                 DeleteRetentionMs = "14000",
    ///                 FileDeleteDelayMs = "170000",
    ///                 FlushMessages = "92233",
    ///                 FlushMs = "92233720368",
    ///                 IndexIntervalBytes = "40962",
    ///                 MaxCompactionLagMs = "9223372036854775807",
    ///                 MaxMessageBytes = "1048588",
    ///                 MessageDownConversionEnable = true,
    ///                 MessageFormatVersion = "3.0-IV1",
    ///                 MessageTimestampDifferenceMaxMs = "9223372036854775807",
    ///                 MessageTimestampType = "log_append_time",
    ///                 MinCleanableDirtyRatio = 0.5,
    ///                 MinCompactionLagMs = "20000",
    ///                 MinInsyncReplicas = 2,
    ///                 Preallocate = false,
    ///                 RetentionBytes = "-1",
    ///                 RetentionMs = "-1",
    ///                 SegmentBytes = "209715200",
    ///                 SegmentIndexBytes = "10485760",
    ///                 SegmentJitterMs = "0",
    ///                 SegmentMs = "604800000",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Topics can be imported using the `id` of the source cluster and the `name` of the topic joined with a comma. For example:
    /// 
    /// ```sh
    /// $ pulumi import digitalocean:index/databaseKafkaTopic:DatabaseKafkaTopic topic-01 245bcfd0-7f31-4ce6-a2bc-475a116cca97,topic-01
    /// ```
    /// </summary>
    [DigitalOceanResourceType("digitalocean:index/databaseKafkaTopic:DatabaseKafkaTopic")]
    public partial class DatabaseKafkaTopic : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the source database cluster. Note: This must be a Kafka cluster.
        /// </summary>
        [Output("clusterId")]
        public Output<string> ClusterId { get; private set; } = null!;

        /// <summary>
        /// A set of advanced configuration parameters. Defaults will be set for any of the parameters that are not included.
        /// The `config` block is documented below.
        /// </summary>
        [Output("configs")]
        public Output<ImmutableArray<Outputs.DatabaseKafkaTopicConfig>> Configs { get; private set; } = null!;

        /// <summary>
        /// The name for the topic.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The number of partitions for the topic. Default and minimum set at 3, maximum is 2048.
        /// </summary>
        [Output("partitionCount")]
        public Output<int?> PartitionCount { get; private set; } = null!;

        /// <summary>
        /// The number of nodes that topics are replicated across. Default and minimum set at 2, maximum is the number of nodes in the cluster.
        /// </summary>
        [Output("replicationFactor")]
        public Output<int?> ReplicationFactor { get; private set; } = null!;

        /// <summary>
        /// The current status of the topic. Possible values are 'active', 'configuring', and 'deleting'.
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;


        /// <summary>
        /// Create a DatabaseKafkaTopic resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DatabaseKafkaTopic(string name, DatabaseKafkaTopicArgs args, CustomResourceOptions? options = null)
            : base("digitalocean:index/databaseKafkaTopic:DatabaseKafkaTopic", name, args ?? new DatabaseKafkaTopicArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DatabaseKafkaTopic(string name, Input<string> id, DatabaseKafkaTopicState? state = null, CustomResourceOptions? options = null)
            : base("digitalocean:index/databaseKafkaTopic:DatabaseKafkaTopic", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing DatabaseKafkaTopic resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DatabaseKafkaTopic Get(string name, Input<string> id, DatabaseKafkaTopicState? state = null, CustomResourceOptions? options = null)
        {
            return new DatabaseKafkaTopic(name, id, state, options);
        }
    }

    public sealed class DatabaseKafkaTopicArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the source database cluster. Note: This must be a Kafka cluster.
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        [Input("configs")]
        private InputList<Inputs.DatabaseKafkaTopicConfigArgs>? _configs;

        /// <summary>
        /// A set of advanced configuration parameters. Defaults will be set for any of the parameters that are not included.
        /// The `config` block is documented below.
        /// </summary>
        public InputList<Inputs.DatabaseKafkaTopicConfigArgs> Configs
        {
            get => _configs ?? (_configs = new InputList<Inputs.DatabaseKafkaTopicConfigArgs>());
            set => _configs = value;
        }

        /// <summary>
        /// The name for the topic.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The number of partitions for the topic. Default and minimum set at 3, maximum is 2048.
        /// </summary>
        [Input("partitionCount")]
        public Input<int>? PartitionCount { get; set; }

        /// <summary>
        /// The number of nodes that topics are replicated across. Default and minimum set at 2, maximum is the number of nodes in the cluster.
        /// </summary>
        [Input("replicationFactor")]
        public Input<int>? ReplicationFactor { get; set; }

        public DatabaseKafkaTopicArgs()
        {
        }
        public static new DatabaseKafkaTopicArgs Empty => new DatabaseKafkaTopicArgs();
    }

    public sealed class DatabaseKafkaTopicState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the source database cluster. Note: This must be a Kafka cluster.
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        [Input("configs")]
        private InputList<Inputs.DatabaseKafkaTopicConfigGetArgs>? _configs;

        /// <summary>
        /// A set of advanced configuration parameters. Defaults will be set for any of the parameters that are not included.
        /// The `config` block is documented below.
        /// </summary>
        public InputList<Inputs.DatabaseKafkaTopicConfigGetArgs> Configs
        {
            get => _configs ?? (_configs = new InputList<Inputs.DatabaseKafkaTopicConfigGetArgs>());
            set => _configs = value;
        }

        /// <summary>
        /// The name for the topic.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The number of partitions for the topic. Default and minimum set at 3, maximum is 2048.
        /// </summary>
        [Input("partitionCount")]
        public Input<int>? PartitionCount { get; set; }

        /// <summary>
        /// The number of nodes that topics are replicated across. Default and minimum set at 2, maximum is the number of nodes in the cluster.
        /// </summary>
        [Input("replicationFactor")]
        public Input<int>? ReplicationFactor { get; set; }

        /// <summary>
        /// The current status of the topic. Possible values are 'active', 'configuring', and 'deleting'.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        public DatabaseKafkaTopicState()
        {
        }
        public static new DatabaseKafkaTopicState Empty => new DatabaseKafkaTopicState();
    }
}
