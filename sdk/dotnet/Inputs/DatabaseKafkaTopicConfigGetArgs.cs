// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Inputs
{

    public sealed class DatabaseKafkaTopicConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The topic cleanup policy that describes whether messages should be deleted, compacted, or both when retention policies are violated.
        /// This may be one of "delete", "compact", or "compact_delete".
        /// </summary>
        [Input("cleanupPolicy")]
        public Input<string>? CleanupPolicy { get; set; }

        /// <summary>
        /// The topic compression codecs used for a given topic.
        /// This may be one of "uncompressed", "gzip", "snappy", "lz4", "producer", "zstd". "uncompressed" indicates that there is no compression and "producer" retains the original compression codec set by the producer.
        /// </summary>
        [Input("compressionType")]
        public Input<string>? CompressionType { get; set; }

        /// <summary>
        /// The amount of time, in ms, that deleted records are retained.
        /// </summary>
        [Input("deleteRetentionMs")]
        public Input<string>? DeleteRetentionMs { get; set; }

        /// <summary>
        /// The amount of time, in ms, to wait before deleting a topic log segment from the filesystem.
        /// </summary>
        [Input("fileDeleteDelayMs")]
        public Input<string>? FileDeleteDelayMs { get; set; }

        /// <summary>
        /// The number of messages accumulated on a topic partition before they are flushed to disk.
        /// </summary>
        [Input("flushMessages")]
        public Input<string>? FlushMessages { get; set; }

        /// <summary>
        /// The maximum time, in ms, that a topic is kept in memory before being flushed to disk.
        /// </summary>
        [Input("flushMs")]
        public Input<string>? FlushMs { get; set; }

        /// <summary>
        /// The interval, in bytes, in which entries are added to the offset index.
        /// </summary>
        [Input("indexIntervalBytes")]
        public Input<string>? IndexIntervalBytes { get; set; }

        /// <summary>
        /// The maximum time, in ms, that a particular message will remain uncompacted. This will not apply if the `compression_type` is set to "uncompressed" or it is set to `producer` and the producer is not using compression.
        /// </summary>
        [Input("maxCompactionLagMs")]
        public Input<string>? MaxCompactionLagMs { get; set; }

        /// <summary>
        /// The maximum size, in bytes, of a message.
        /// </summary>
        [Input("maxMessageBytes")]
        public Input<string>? MaxMessageBytes { get; set; }

        /// <summary>
        /// Determines whether down-conversion of message formats for consumers is enabled.
        /// </summary>
        [Input("messageDownConversionEnable")]
        public Input<bool>? MessageDownConversionEnable { get; set; }

        /// <summary>
        /// The version of the inter-broker protocol that will be used. This may be one of "0.8.0", "0.8.1", "0.8.2", "0.9.0", "0.10.0", "0.10.0-IV0", "0.10.0-IV1", "0.10.1", "0.10.1-IV0", "0.10.1-IV1", "0.10.1-IV2", "0.10.2", "0.10.2-IV0", "0.11.0", "0.11.0-IV0", "0.11.0-IV1", "0.11.0-IV2", "1.0", "1.0-IV0", "1.1", "1.1-IV0", "2.0", "2.0-IV0", "2.0-IV1", "2.1", "2.1-IV0", "2.1-IV1", "2.1-IV2", "2.2", "2.2-IV0", "2.2-IV1", "2.3", "2.3-IV0", "2.3-IV1", "2.4", "2.4-IV0", "2.4-IV1", "2.5", "2.5-IV0", "2.6", "2.6-IV0", "2.7", "2.7-IV0", "2.7-IV1", "2.7-IV2", "2.8", "2.8-IV0", "2.8-IV1", "3.0", "3.0-IV0", "3.0-IV1", "3.1", "3.1-IV0", "3.2", "3.2-IV0", "3.3", "3.3-IV0", "3.3-IV1", "3.3-IV2", "3.3-IV3", "3.4", "3.4-IV0", "3.5", "3.5-IV0", "3.5-IV1", "3.5-IV2", "3.6", "3.6-IV0", "3.6-IV1", "3.6-IV2".
        /// </summary>
        [Input("messageFormatVersion")]
        public Input<string>? MessageFormatVersion { get; set; }

        /// <summary>
        /// The maximum difference, in ms, between the timestamp specific in a message and when the broker receives the message.
        /// </summary>
        [Input("messageTimestampDifferenceMaxMs")]
        public Input<string>? MessageTimestampDifferenceMaxMs { get; set; }

        /// <summary>
        /// Specifies which timestamp to use for the message. This may be one of "create_time" or "log_append_time".
        /// </summary>
        [Input("messageTimestampType")]
        public Input<string>? MessageTimestampType { get; set; }

        /// <summary>
        /// A scale between 0.0 and 1.0 which controls the frequency of the compactor. Larger values mean more frequent compactions. This is often paired with `max_compaction_lag_ms` to control the compactor frequency.
        /// </summary>
        [Input("minCleanableDirtyRatio")]
        public Input<double>? MinCleanableDirtyRatio { get; set; }

        [Input("minCompactionLagMs")]
        public Input<string>? MinCompactionLagMs { get; set; }

        /// <summary>
        /// The number of replicas that must acknowledge a write before it is considered successful. -1 is a special setting to indicate that all nodes must ack a message before a write is considered successful. Default is 1, indicating at least 1 replica must acknowledge a write to be considered successful.
        /// </summary>
        [Input("minInsyncReplicas")]
        public Input<int>? MinInsyncReplicas { get; set; }

        /// <summary>
        /// Determines whether to preallocate a file on disk when creating a new log segment within a topic.
        /// </summary>
        [Input("preallocate")]
        public Input<bool>? Preallocate { get; set; }

        /// <summary>
        /// The maximum size, in bytes, of a topic before messages are deleted. -1 is a special setting indicating that this setting has no limit.
        /// </summary>
        [Input("retentionBytes")]
        public Input<string>? RetentionBytes { get; set; }

        /// <summary>
        /// The maximum time, in ms, that a topic log file is retained before deleting it. -1 is a special setting indicating that this setting has no limit.
        /// </summary>
        [Input("retentionMs")]
        public Input<string>? RetentionMs { get; set; }

        /// <summary>
        /// The maximum size, in bytes, of a single topic log file.
        /// </summary>
        [Input("segmentBytes")]
        public Input<string>? SegmentBytes { get; set; }

        /// <summary>
        /// The maximum size, in bytes, of the offset index.
        /// </summary>
        [Input("segmentIndexBytes")]
        public Input<string>? SegmentIndexBytes { get; set; }

        /// <summary>
        /// The maximum time, in ms, subtracted from the scheduled segment disk flush time to avoid the thundering herd problem for segment flushing.
        /// </summary>
        [Input("segmentJitterMs")]
        public Input<string>? SegmentJitterMs { get; set; }

        /// <summary>
        /// The maximum time, in ms, before the topic log will flush to disk.
        /// </summary>
        [Input("segmentMs")]
        public Input<string>? SegmentMs { get; set; }

        public DatabaseKafkaTopicConfigGetArgs()
        {
        }
        public static new DatabaseKafkaTopicConfigGetArgs Empty => new DatabaseKafkaTopicConfigGetArgs();
    }
}
