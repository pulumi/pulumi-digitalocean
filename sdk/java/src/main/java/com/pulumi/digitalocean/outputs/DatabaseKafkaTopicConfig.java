// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatabaseKafkaTopicConfig {
    /**
     * @return The topic cleanup policy that decribes whether messages should be deleted, compacted, or both when retention policies are violated.
     * This may be one of &#34;delete&#34;, &#34;compact&#34;, or &#34;compact_delete&#34;.
     * 
     */
    private @Nullable String cleanupPolicy;
    /**
     * @return The topic compression codecs used for a given topic.
     * This may be one of &#34;uncompressed&#34;, &#34;gzip&#34;, &#34;snappy&#34;, &#34;lz4&#34;, &#34;producer&#34;, &#34;zstd&#34;. &#34;uncompressed&#34; indicates that there is no compression and &#34;producer&#34; retains the original compression codec set by the producer.
     * 
     */
    private @Nullable String compressionType;
    /**
     * @return The amount of time, in ms, that deleted records are retained.
     * 
     */
    private @Nullable String deleteRetentionMs;
    /**
     * @return The amount of time, in ms, to wait before deleting a topic log segment from the filesystem.
     * 
     */
    private @Nullable String fileDeleteDelayMs;
    /**
     * @return The number of messages accumulated on a topic partition before they are flushed to disk.
     * 
     */
    private @Nullable String flushMessages;
    /**
     * @return The maximum time, in ms, that a topic is kept in memory before being flushed to disk.
     * 
     */
    private @Nullable String flushMs;
    /**
     * @return The interval, in bytes, in which entries are added to the offset index.
     * 
     */
    private @Nullable String indexIntervalBytes;
    /**
     * @return The maximum time, in ms, that a particular message will remain uncompacted. This will not apply if the `compression_type` is set to &#34;uncompressed&#34; or it is set to `producer` and the producer is not using compression.
     * 
     */
    private @Nullable String maxCompactionLagMs;
    /**
     * @return The maximum size, in bytes, of a message.
     * 
     */
    private @Nullable String maxMessageBytes;
    /**
     * @return Determines whether down-conversion of message formats for consumers is enabled.
     * 
     */
    private @Nullable Boolean messageDownConversionEnable;
    /**
     * @return The version of the inter-broker protocol that will be used. This may be one of &#34;0.8.0&#34;, &#34;0.8.1&#34;, &#34;0.8.2&#34;, &#34;0.9.0&#34;, &#34;0.10.0&#34;, &#34;0.10.0-IV0&#34;, &#34;0.10.0-IV1&#34;, &#34;0.10.1&#34;, &#34;0.10.1-IV0&#34;, &#34;0.10.1-IV1&#34;, &#34;0.10.1-IV2&#34;, &#34;0.10.2&#34;, &#34;0.10.2-IV0&#34;, &#34;0.11.0&#34;, &#34;0.11.0-IV0&#34;, &#34;0.11.0-IV1&#34;, &#34;0.11.0-IV2&#34;, &#34;1.0&#34;, &#34;1.0-IV0&#34;, &#34;1.1&#34;, &#34;1.1-IV0&#34;, &#34;2.0&#34;, &#34;2.0-IV0&#34;, &#34;2.0-IV1&#34;, &#34;2.1&#34;, &#34;2.1-IV0&#34;, &#34;2.1-IV1&#34;, &#34;2.1-IV2&#34;, &#34;2.2&#34;, &#34;2.2-IV0&#34;, &#34;2.2-IV1&#34;, &#34;2.3&#34;, &#34;2.3-IV0&#34;, &#34;2.3-IV1&#34;, &#34;2.4&#34;, &#34;2.4-IV0&#34;, &#34;2.4-IV1&#34;, &#34;2.5&#34;, &#34;2.5-IV0&#34;, &#34;2.6&#34;, &#34;2.6-IV0&#34;, &#34;2.7&#34;, &#34;2.7-IV0&#34;, &#34;2.7-IV1&#34;, &#34;2.7-IV2&#34;, &#34;2.8&#34;, &#34;2.8-IV0&#34;, &#34;2.8-IV1&#34;, &#34;3.0&#34;, &#34;3.0-IV0&#34;, &#34;3.0-IV1&#34;, &#34;3.1&#34;, &#34;3.1-IV0&#34;, &#34;3.2&#34;, &#34;3.2-IV0&#34;, &#34;3.3&#34;, &#34;3.3-IV0&#34;, &#34;3.3-IV1&#34;, &#34;3.3-IV2&#34;, &#34;3.3-IV3&#34;, &#34;3.4&#34;, &#34;3.4-IV0&#34;, &#34;3.5&#34;, &#34;3.5-IV0&#34;, &#34;3.5-IV1&#34;, &#34;3.5-IV2&#34;, &#34;3.6&#34;, &#34;3.6-IV0&#34;, &#34;3.6-IV1&#34;, &#34;3.6-IV2&#34;.
     * 
     */
    private @Nullable String messageFormatVersion;
    /**
     * @return The maximum difference, in ms, between the timestamp specific in a message and when the broker receives the message.
     * 
     */
    private @Nullable String messageTimestampDifferenceMaxMs;
    /**
     * @return Specifies which timestamp to use for the message. This may be one of &#34;create_time&#34; or &#34;log_append_time&#34;.
     * 
     */
    private @Nullable String messageTimestampType;
    /**
     * @return A scale between 0.0 and 1.0 which controls the frequency of the compactor. Larger values mean more frequent compactions. This is often paired with `max_compaction_lag_ms` to control the compactor frequency.
     * 
     */
    private @Nullable Double minCleanableDirtyRatio;
    private @Nullable String minCompactionLagMs;
    /**
     * @return The number of replicas that must acknowledge a write before it is considered successful. -1 is a special setting to indicate that all nodes must ack a message before a write is considered successful.
     * 
     */
    private @Nullable Integer minInsyncReplicas;
    /**
     * @return Determines whether to preallocate a file on disk when creating a new log segment within a topic.
     * 
     */
    private @Nullable Boolean preallocate;
    /**
     * @return The maximum size, in bytes, of a topic before messages are deleted. -1 is a special setting indicating that this setting has no limit.
     * 
     */
    private @Nullable String retentionBytes;
    /**
     * @return The maximum time, in ms, that a topic log file is retained before deleting it. -1 is a special setting indicating that this setting has no limit.
     * 
     */
    private @Nullable String retentionMs;
    /**
     * @return The maximum size, in bytes, of a single topic log file.
     * 
     */
    private @Nullable String segmentBytes;
    /**
     * @return The maximum size, in bytes, of the offset index.
     * 
     */
    private @Nullable String segmentIndexBytes;
    /**
     * @return The maximum time, in ms, subtracted from the scheduled segment disk flush time to avoid the thundering herd problem for segment flushing.
     * 
     */
    private @Nullable String segmentJitterMs;
    /**
     * @return The maximum time, in ms, before the topic log will flush to disk.
     * 
     */
    private @Nullable String segmentMs;
    /**
     * @return Determines whether to allow nodes that are not part of the in-sync replica set (IRS) to be elected as leader. Note: setting this to &#34;true&#34; could result in data loss.
     * 
     */
    private @Nullable Boolean uncleanLeaderElectionEnable;

    private DatabaseKafkaTopicConfig() {}
    /**
     * @return The topic cleanup policy that decribes whether messages should be deleted, compacted, or both when retention policies are violated.
     * This may be one of &#34;delete&#34;, &#34;compact&#34;, or &#34;compact_delete&#34;.
     * 
     */
    public Optional<String> cleanupPolicy() {
        return Optional.ofNullable(this.cleanupPolicy);
    }
    /**
     * @return The topic compression codecs used for a given topic.
     * This may be one of &#34;uncompressed&#34;, &#34;gzip&#34;, &#34;snappy&#34;, &#34;lz4&#34;, &#34;producer&#34;, &#34;zstd&#34;. &#34;uncompressed&#34; indicates that there is no compression and &#34;producer&#34; retains the original compression codec set by the producer.
     * 
     */
    public Optional<String> compressionType() {
        return Optional.ofNullable(this.compressionType);
    }
    /**
     * @return The amount of time, in ms, that deleted records are retained.
     * 
     */
    public Optional<String> deleteRetentionMs() {
        return Optional.ofNullable(this.deleteRetentionMs);
    }
    /**
     * @return The amount of time, in ms, to wait before deleting a topic log segment from the filesystem.
     * 
     */
    public Optional<String> fileDeleteDelayMs() {
        return Optional.ofNullable(this.fileDeleteDelayMs);
    }
    /**
     * @return The number of messages accumulated on a topic partition before they are flushed to disk.
     * 
     */
    public Optional<String> flushMessages() {
        return Optional.ofNullable(this.flushMessages);
    }
    /**
     * @return The maximum time, in ms, that a topic is kept in memory before being flushed to disk.
     * 
     */
    public Optional<String> flushMs() {
        return Optional.ofNullable(this.flushMs);
    }
    /**
     * @return The interval, in bytes, in which entries are added to the offset index.
     * 
     */
    public Optional<String> indexIntervalBytes() {
        return Optional.ofNullable(this.indexIntervalBytes);
    }
    /**
     * @return The maximum time, in ms, that a particular message will remain uncompacted. This will not apply if the `compression_type` is set to &#34;uncompressed&#34; or it is set to `producer` and the producer is not using compression.
     * 
     */
    public Optional<String> maxCompactionLagMs() {
        return Optional.ofNullable(this.maxCompactionLagMs);
    }
    /**
     * @return The maximum size, in bytes, of a message.
     * 
     */
    public Optional<String> maxMessageBytes() {
        return Optional.ofNullable(this.maxMessageBytes);
    }
    /**
     * @return Determines whether down-conversion of message formats for consumers is enabled.
     * 
     */
    public Optional<Boolean> messageDownConversionEnable() {
        return Optional.ofNullable(this.messageDownConversionEnable);
    }
    /**
     * @return The version of the inter-broker protocol that will be used. This may be one of &#34;0.8.0&#34;, &#34;0.8.1&#34;, &#34;0.8.2&#34;, &#34;0.9.0&#34;, &#34;0.10.0&#34;, &#34;0.10.0-IV0&#34;, &#34;0.10.0-IV1&#34;, &#34;0.10.1&#34;, &#34;0.10.1-IV0&#34;, &#34;0.10.1-IV1&#34;, &#34;0.10.1-IV2&#34;, &#34;0.10.2&#34;, &#34;0.10.2-IV0&#34;, &#34;0.11.0&#34;, &#34;0.11.0-IV0&#34;, &#34;0.11.0-IV1&#34;, &#34;0.11.0-IV2&#34;, &#34;1.0&#34;, &#34;1.0-IV0&#34;, &#34;1.1&#34;, &#34;1.1-IV0&#34;, &#34;2.0&#34;, &#34;2.0-IV0&#34;, &#34;2.0-IV1&#34;, &#34;2.1&#34;, &#34;2.1-IV0&#34;, &#34;2.1-IV1&#34;, &#34;2.1-IV2&#34;, &#34;2.2&#34;, &#34;2.2-IV0&#34;, &#34;2.2-IV1&#34;, &#34;2.3&#34;, &#34;2.3-IV0&#34;, &#34;2.3-IV1&#34;, &#34;2.4&#34;, &#34;2.4-IV0&#34;, &#34;2.4-IV1&#34;, &#34;2.5&#34;, &#34;2.5-IV0&#34;, &#34;2.6&#34;, &#34;2.6-IV0&#34;, &#34;2.7&#34;, &#34;2.7-IV0&#34;, &#34;2.7-IV1&#34;, &#34;2.7-IV2&#34;, &#34;2.8&#34;, &#34;2.8-IV0&#34;, &#34;2.8-IV1&#34;, &#34;3.0&#34;, &#34;3.0-IV0&#34;, &#34;3.0-IV1&#34;, &#34;3.1&#34;, &#34;3.1-IV0&#34;, &#34;3.2&#34;, &#34;3.2-IV0&#34;, &#34;3.3&#34;, &#34;3.3-IV0&#34;, &#34;3.3-IV1&#34;, &#34;3.3-IV2&#34;, &#34;3.3-IV3&#34;, &#34;3.4&#34;, &#34;3.4-IV0&#34;, &#34;3.5&#34;, &#34;3.5-IV0&#34;, &#34;3.5-IV1&#34;, &#34;3.5-IV2&#34;, &#34;3.6&#34;, &#34;3.6-IV0&#34;, &#34;3.6-IV1&#34;, &#34;3.6-IV2&#34;.
     * 
     */
    public Optional<String> messageFormatVersion() {
        return Optional.ofNullable(this.messageFormatVersion);
    }
    /**
     * @return The maximum difference, in ms, between the timestamp specific in a message and when the broker receives the message.
     * 
     */
    public Optional<String> messageTimestampDifferenceMaxMs() {
        return Optional.ofNullable(this.messageTimestampDifferenceMaxMs);
    }
    /**
     * @return Specifies which timestamp to use for the message. This may be one of &#34;create_time&#34; or &#34;log_append_time&#34;.
     * 
     */
    public Optional<String> messageTimestampType() {
        return Optional.ofNullable(this.messageTimestampType);
    }
    /**
     * @return A scale between 0.0 and 1.0 which controls the frequency of the compactor. Larger values mean more frequent compactions. This is often paired with `max_compaction_lag_ms` to control the compactor frequency.
     * 
     */
    public Optional<Double> minCleanableDirtyRatio() {
        return Optional.ofNullable(this.minCleanableDirtyRatio);
    }
    public Optional<String> minCompactionLagMs() {
        return Optional.ofNullable(this.minCompactionLagMs);
    }
    /**
     * @return The number of replicas that must acknowledge a write before it is considered successful. -1 is a special setting to indicate that all nodes must ack a message before a write is considered successful.
     * 
     */
    public Optional<Integer> minInsyncReplicas() {
        return Optional.ofNullable(this.minInsyncReplicas);
    }
    /**
     * @return Determines whether to preallocate a file on disk when creating a new log segment within a topic.
     * 
     */
    public Optional<Boolean> preallocate() {
        return Optional.ofNullable(this.preallocate);
    }
    /**
     * @return The maximum size, in bytes, of a topic before messages are deleted. -1 is a special setting indicating that this setting has no limit.
     * 
     */
    public Optional<String> retentionBytes() {
        return Optional.ofNullable(this.retentionBytes);
    }
    /**
     * @return The maximum time, in ms, that a topic log file is retained before deleting it. -1 is a special setting indicating that this setting has no limit.
     * 
     */
    public Optional<String> retentionMs() {
        return Optional.ofNullable(this.retentionMs);
    }
    /**
     * @return The maximum size, in bytes, of a single topic log file.
     * 
     */
    public Optional<String> segmentBytes() {
        return Optional.ofNullable(this.segmentBytes);
    }
    /**
     * @return The maximum size, in bytes, of the offset index.
     * 
     */
    public Optional<String> segmentIndexBytes() {
        return Optional.ofNullable(this.segmentIndexBytes);
    }
    /**
     * @return The maximum time, in ms, subtracted from the scheduled segment disk flush time to avoid the thundering herd problem for segment flushing.
     * 
     */
    public Optional<String> segmentJitterMs() {
        return Optional.ofNullable(this.segmentJitterMs);
    }
    /**
     * @return The maximum time, in ms, before the topic log will flush to disk.
     * 
     */
    public Optional<String> segmentMs() {
        return Optional.ofNullable(this.segmentMs);
    }
    /**
     * @return Determines whether to allow nodes that are not part of the in-sync replica set (IRS) to be elected as leader. Note: setting this to &#34;true&#34; could result in data loss.
     * 
     */
    public Optional<Boolean> uncleanLeaderElectionEnable() {
        return Optional.ofNullable(this.uncleanLeaderElectionEnable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseKafkaTopicConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String cleanupPolicy;
        private @Nullable String compressionType;
        private @Nullable String deleteRetentionMs;
        private @Nullable String fileDeleteDelayMs;
        private @Nullable String flushMessages;
        private @Nullable String flushMs;
        private @Nullable String indexIntervalBytes;
        private @Nullable String maxCompactionLagMs;
        private @Nullable String maxMessageBytes;
        private @Nullable Boolean messageDownConversionEnable;
        private @Nullable String messageFormatVersion;
        private @Nullable String messageTimestampDifferenceMaxMs;
        private @Nullable String messageTimestampType;
        private @Nullable Double minCleanableDirtyRatio;
        private @Nullable String minCompactionLagMs;
        private @Nullable Integer minInsyncReplicas;
        private @Nullable Boolean preallocate;
        private @Nullable String retentionBytes;
        private @Nullable String retentionMs;
        private @Nullable String segmentBytes;
        private @Nullable String segmentIndexBytes;
        private @Nullable String segmentJitterMs;
        private @Nullable String segmentMs;
        private @Nullable Boolean uncleanLeaderElectionEnable;
        public Builder() {}
        public Builder(DatabaseKafkaTopicConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cleanupPolicy = defaults.cleanupPolicy;
    	      this.compressionType = defaults.compressionType;
    	      this.deleteRetentionMs = defaults.deleteRetentionMs;
    	      this.fileDeleteDelayMs = defaults.fileDeleteDelayMs;
    	      this.flushMessages = defaults.flushMessages;
    	      this.flushMs = defaults.flushMs;
    	      this.indexIntervalBytes = defaults.indexIntervalBytes;
    	      this.maxCompactionLagMs = defaults.maxCompactionLagMs;
    	      this.maxMessageBytes = defaults.maxMessageBytes;
    	      this.messageDownConversionEnable = defaults.messageDownConversionEnable;
    	      this.messageFormatVersion = defaults.messageFormatVersion;
    	      this.messageTimestampDifferenceMaxMs = defaults.messageTimestampDifferenceMaxMs;
    	      this.messageTimestampType = defaults.messageTimestampType;
    	      this.minCleanableDirtyRatio = defaults.minCleanableDirtyRatio;
    	      this.minCompactionLagMs = defaults.minCompactionLagMs;
    	      this.minInsyncReplicas = defaults.minInsyncReplicas;
    	      this.preallocate = defaults.preallocate;
    	      this.retentionBytes = defaults.retentionBytes;
    	      this.retentionMs = defaults.retentionMs;
    	      this.segmentBytes = defaults.segmentBytes;
    	      this.segmentIndexBytes = defaults.segmentIndexBytes;
    	      this.segmentJitterMs = defaults.segmentJitterMs;
    	      this.segmentMs = defaults.segmentMs;
    	      this.uncleanLeaderElectionEnable = defaults.uncleanLeaderElectionEnable;
        }

        @CustomType.Setter
        public Builder cleanupPolicy(@Nullable String cleanupPolicy) {
            this.cleanupPolicy = cleanupPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder compressionType(@Nullable String compressionType) {
            this.compressionType = compressionType;
            return this;
        }
        @CustomType.Setter
        public Builder deleteRetentionMs(@Nullable String deleteRetentionMs) {
            this.deleteRetentionMs = deleteRetentionMs;
            return this;
        }
        @CustomType.Setter
        public Builder fileDeleteDelayMs(@Nullable String fileDeleteDelayMs) {
            this.fileDeleteDelayMs = fileDeleteDelayMs;
            return this;
        }
        @CustomType.Setter
        public Builder flushMessages(@Nullable String flushMessages) {
            this.flushMessages = flushMessages;
            return this;
        }
        @CustomType.Setter
        public Builder flushMs(@Nullable String flushMs) {
            this.flushMs = flushMs;
            return this;
        }
        @CustomType.Setter
        public Builder indexIntervalBytes(@Nullable String indexIntervalBytes) {
            this.indexIntervalBytes = indexIntervalBytes;
            return this;
        }
        @CustomType.Setter
        public Builder maxCompactionLagMs(@Nullable String maxCompactionLagMs) {
            this.maxCompactionLagMs = maxCompactionLagMs;
            return this;
        }
        @CustomType.Setter
        public Builder maxMessageBytes(@Nullable String maxMessageBytes) {
            this.maxMessageBytes = maxMessageBytes;
            return this;
        }
        @CustomType.Setter
        public Builder messageDownConversionEnable(@Nullable Boolean messageDownConversionEnable) {
            this.messageDownConversionEnable = messageDownConversionEnable;
            return this;
        }
        @CustomType.Setter
        public Builder messageFormatVersion(@Nullable String messageFormatVersion) {
            this.messageFormatVersion = messageFormatVersion;
            return this;
        }
        @CustomType.Setter
        public Builder messageTimestampDifferenceMaxMs(@Nullable String messageTimestampDifferenceMaxMs) {
            this.messageTimestampDifferenceMaxMs = messageTimestampDifferenceMaxMs;
            return this;
        }
        @CustomType.Setter
        public Builder messageTimestampType(@Nullable String messageTimestampType) {
            this.messageTimestampType = messageTimestampType;
            return this;
        }
        @CustomType.Setter
        public Builder minCleanableDirtyRatio(@Nullable Double minCleanableDirtyRatio) {
            this.minCleanableDirtyRatio = minCleanableDirtyRatio;
            return this;
        }
        @CustomType.Setter
        public Builder minCompactionLagMs(@Nullable String minCompactionLagMs) {
            this.minCompactionLagMs = minCompactionLagMs;
            return this;
        }
        @CustomType.Setter
        public Builder minInsyncReplicas(@Nullable Integer minInsyncReplicas) {
            this.minInsyncReplicas = minInsyncReplicas;
            return this;
        }
        @CustomType.Setter
        public Builder preallocate(@Nullable Boolean preallocate) {
            this.preallocate = preallocate;
            return this;
        }
        @CustomType.Setter
        public Builder retentionBytes(@Nullable String retentionBytes) {
            this.retentionBytes = retentionBytes;
            return this;
        }
        @CustomType.Setter
        public Builder retentionMs(@Nullable String retentionMs) {
            this.retentionMs = retentionMs;
            return this;
        }
        @CustomType.Setter
        public Builder segmentBytes(@Nullable String segmentBytes) {
            this.segmentBytes = segmentBytes;
            return this;
        }
        @CustomType.Setter
        public Builder segmentIndexBytes(@Nullable String segmentIndexBytes) {
            this.segmentIndexBytes = segmentIndexBytes;
            return this;
        }
        @CustomType.Setter
        public Builder segmentJitterMs(@Nullable String segmentJitterMs) {
            this.segmentJitterMs = segmentJitterMs;
            return this;
        }
        @CustomType.Setter
        public Builder segmentMs(@Nullable String segmentMs) {
            this.segmentMs = segmentMs;
            return this;
        }
        @CustomType.Setter
        public Builder uncleanLeaderElectionEnable(@Nullable Boolean uncleanLeaderElectionEnable) {
            this.uncleanLeaderElectionEnable = uncleanLeaderElectionEnable;
            return this;
        }
        public DatabaseKafkaTopicConfig build() {
            final var _resultValue = new DatabaseKafkaTopicConfig();
            _resultValue.cleanupPolicy = cleanupPolicy;
            _resultValue.compressionType = compressionType;
            _resultValue.deleteRetentionMs = deleteRetentionMs;
            _resultValue.fileDeleteDelayMs = fileDeleteDelayMs;
            _resultValue.flushMessages = flushMessages;
            _resultValue.flushMs = flushMs;
            _resultValue.indexIntervalBytes = indexIntervalBytes;
            _resultValue.maxCompactionLagMs = maxCompactionLagMs;
            _resultValue.maxMessageBytes = maxMessageBytes;
            _resultValue.messageDownConversionEnable = messageDownConversionEnable;
            _resultValue.messageFormatVersion = messageFormatVersion;
            _resultValue.messageTimestampDifferenceMaxMs = messageTimestampDifferenceMaxMs;
            _resultValue.messageTimestampType = messageTimestampType;
            _resultValue.minCleanableDirtyRatio = minCleanableDirtyRatio;
            _resultValue.minCompactionLagMs = minCompactionLagMs;
            _resultValue.minInsyncReplicas = minInsyncReplicas;
            _resultValue.preallocate = preallocate;
            _resultValue.retentionBytes = retentionBytes;
            _resultValue.retentionMs = retentionMs;
            _resultValue.segmentBytes = segmentBytes;
            _resultValue.segmentIndexBytes = segmentIndexBytes;
            _resultValue.segmentJitterMs = segmentJitterMs;
            _resultValue.segmentMs = segmentMs;
            _resultValue.uncleanLeaderElectionEnable = uncleanLeaderElectionEnable;
            return _resultValue;
        }
    }
}
