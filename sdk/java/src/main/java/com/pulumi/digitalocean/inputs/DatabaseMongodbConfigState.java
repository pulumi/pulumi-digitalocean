// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabaseMongodbConfigState extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseMongodbConfigState Empty = new DatabaseMongodbConfigState();

    /**
     * The ID of the target MongoDB cluster.
     * 
     */
    @Import(name="clusterId")
    private @Nullable Output<String> clusterId;

    /**
     * @return The ID of the target MongoDB cluster.
     * 
     */
    public Optional<Output<String>> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }

    /**
     * Specifies the default consistency behavior of reads from the database. Data that is returned from the query with may or may not have been acknowledged by all nodes in the replicaset depending on this value. Learn more [here](https://www.mongodb.com/docs/manual/reference/read-concern/).
     * 
     */
    @Import(name="defaultReadConcern")
    private @Nullable Output<String> defaultReadConcern;

    /**
     * @return Specifies the default consistency behavior of reads from the database. Data that is returned from the query with may or may not have been acknowledged by all nodes in the replicaset depending on this value. Learn more [here](https://www.mongodb.com/docs/manual/reference/read-concern/).
     * 
     */
    public Optional<Output<String>> defaultReadConcern() {
        return Optional.ofNullable(this.defaultReadConcern);
    }

    /**
     * Describes the level of acknowledgment requested from MongoDB for write operations clusters. This field can set to either `majority` or a number`0...n` which will describe the number of nodes that must acknowledge the write operation before it is fully accepted. Setting to `0` will request no acknowledgement of the write operation. Learn more [here](https://www.mongodb.com/docs/manual/reference/write-concern/).
     * 
     */
    @Import(name="defaultWriteConcern")
    private @Nullable Output<String> defaultWriteConcern;

    /**
     * @return Describes the level of acknowledgment requested from MongoDB for write operations clusters. This field can set to either `majority` or a number`0...n` which will describe the number of nodes that must acknowledge the write operation before it is fully accepted. Setting to `0` will request no acknowledgement of the write operation. Learn more [here](https://www.mongodb.com/docs/manual/reference/write-concern/).
     * 
     */
    public Optional<Output<String>> defaultWriteConcern() {
        return Optional.ofNullable(this.defaultWriteConcern);
    }

    /**
     * Operations that run for longer than this threshold are considered slow which are then recorded to the diagnostic logs. Higher log levels (verbosity) will record all operations regardless of this threshold on the primary node. &lt;em&gt;Changing this parameter will lead to a restart of the MongoDB service.&lt;/em&gt; Learn more [here](https://www.mongodb.com/docs/manual/reference/configuration-options/#mongodb-setting-operationProfiling.slowOpThresholdMs).
     * 
     */
    @Import(name="slowOpThresholdMs")
    private @Nullable Output<Integer> slowOpThresholdMs;

    /**
     * @return Operations that run for longer than this threshold are considered slow which are then recorded to the diagnostic logs. Higher log levels (verbosity) will record all operations regardless of this threshold on the primary node. &lt;em&gt;Changing this parameter will lead to a restart of the MongoDB service.&lt;/em&gt; Learn more [here](https://www.mongodb.com/docs/manual/reference/configuration-options/#mongodb-setting-operationProfiling.slowOpThresholdMs).
     * 
     */
    public Optional<Output<Integer>> slowOpThresholdMs() {
        return Optional.ofNullable(this.slowOpThresholdMs);
    }

    /**
     * Specifies the lifetime of multi-document transactions. Transactions that exceed this limit are considered expired and will be aborted by a periodic cleanup process. The cleanup process runs every `transactionLifetimeLimitSeconds/2 seconds` or at least once every 60 seconds. &lt;em&gt;Changing this parameter will lead to a restart of the MongoDB service.&lt;/em&gt; Learn more [here](https://www.mongodb.com/docs/manual/reference/parameters/#mongodb-parameter-param.transactionLifetimeLimitSeconds).
     * 
     */
    @Import(name="transactionLifetimeLimitSeconds")
    private @Nullable Output<Integer> transactionLifetimeLimitSeconds;

    /**
     * @return Specifies the lifetime of multi-document transactions. Transactions that exceed this limit are considered expired and will be aborted by a periodic cleanup process. The cleanup process runs every `transactionLifetimeLimitSeconds/2 seconds` or at least once every 60 seconds. &lt;em&gt;Changing this parameter will lead to a restart of the MongoDB service.&lt;/em&gt; Learn more [here](https://www.mongodb.com/docs/manual/reference/parameters/#mongodb-parameter-param.transactionLifetimeLimitSeconds).
     * 
     */
    public Optional<Output<Integer>> transactionLifetimeLimitSeconds() {
        return Optional.ofNullable(this.transactionLifetimeLimitSeconds);
    }

    /**
     * The log message verbosity level. The verbosity level determines the amount of Informational and Debug messages MongoDB outputs. 0 includes informational messages while 1...5 increases the level to include debug messages. &lt;em&gt;Changing this parameter will lead to a restart of the MongoDB service.&lt;/em&gt; Learn more [here](https://www.mongodb.com/docs/manual/reference/configuration-options/#mongodb-setting-systemLog.verbosity).
     * 
     */
    @Import(name="verbosity")
    private @Nullable Output<Integer> verbosity;

    /**
     * @return The log message verbosity level. The verbosity level determines the amount of Informational and Debug messages MongoDB outputs. 0 includes informational messages while 1...5 increases the level to include debug messages. &lt;em&gt;Changing this parameter will lead to a restart of the MongoDB service.&lt;/em&gt; Learn more [here](https://www.mongodb.com/docs/manual/reference/configuration-options/#mongodb-setting-systemLog.verbosity).
     * 
     */
    public Optional<Output<Integer>> verbosity() {
        return Optional.ofNullable(this.verbosity);
    }

    private DatabaseMongodbConfigState() {}

    private DatabaseMongodbConfigState(DatabaseMongodbConfigState $) {
        this.clusterId = $.clusterId;
        this.defaultReadConcern = $.defaultReadConcern;
        this.defaultWriteConcern = $.defaultWriteConcern;
        this.slowOpThresholdMs = $.slowOpThresholdMs;
        this.transactionLifetimeLimitSeconds = $.transactionLifetimeLimitSeconds;
        this.verbosity = $.verbosity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseMongodbConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseMongodbConfigState $;

        public Builder() {
            $ = new DatabaseMongodbConfigState();
        }

        public Builder(DatabaseMongodbConfigState defaults) {
            $ = new DatabaseMongodbConfigState(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterId The ID of the target MongoDB cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(@Nullable Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId The ID of the target MongoDB cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        /**
         * @param defaultReadConcern Specifies the default consistency behavior of reads from the database. Data that is returned from the query with may or may not have been acknowledged by all nodes in the replicaset depending on this value. Learn more [here](https://www.mongodb.com/docs/manual/reference/read-concern/).
         * 
         * @return builder
         * 
         */
        public Builder defaultReadConcern(@Nullable Output<String> defaultReadConcern) {
            $.defaultReadConcern = defaultReadConcern;
            return this;
        }

        /**
         * @param defaultReadConcern Specifies the default consistency behavior of reads from the database. Data that is returned from the query with may or may not have been acknowledged by all nodes in the replicaset depending on this value. Learn more [here](https://www.mongodb.com/docs/manual/reference/read-concern/).
         * 
         * @return builder
         * 
         */
        public Builder defaultReadConcern(String defaultReadConcern) {
            return defaultReadConcern(Output.of(defaultReadConcern));
        }

        /**
         * @param defaultWriteConcern Describes the level of acknowledgment requested from MongoDB for write operations clusters. This field can set to either `majority` or a number`0...n` which will describe the number of nodes that must acknowledge the write operation before it is fully accepted. Setting to `0` will request no acknowledgement of the write operation. Learn more [here](https://www.mongodb.com/docs/manual/reference/write-concern/).
         * 
         * @return builder
         * 
         */
        public Builder defaultWriteConcern(@Nullable Output<String> defaultWriteConcern) {
            $.defaultWriteConcern = defaultWriteConcern;
            return this;
        }

        /**
         * @param defaultWriteConcern Describes the level of acknowledgment requested from MongoDB for write operations clusters. This field can set to either `majority` or a number`0...n` which will describe the number of nodes that must acknowledge the write operation before it is fully accepted. Setting to `0` will request no acknowledgement of the write operation. Learn more [here](https://www.mongodb.com/docs/manual/reference/write-concern/).
         * 
         * @return builder
         * 
         */
        public Builder defaultWriteConcern(String defaultWriteConcern) {
            return defaultWriteConcern(Output.of(defaultWriteConcern));
        }

        /**
         * @param slowOpThresholdMs Operations that run for longer than this threshold are considered slow which are then recorded to the diagnostic logs. Higher log levels (verbosity) will record all operations regardless of this threshold on the primary node. &lt;em&gt;Changing this parameter will lead to a restart of the MongoDB service.&lt;/em&gt; Learn more [here](https://www.mongodb.com/docs/manual/reference/configuration-options/#mongodb-setting-operationProfiling.slowOpThresholdMs).
         * 
         * @return builder
         * 
         */
        public Builder slowOpThresholdMs(@Nullable Output<Integer> slowOpThresholdMs) {
            $.slowOpThresholdMs = slowOpThresholdMs;
            return this;
        }

        /**
         * @param slowOpThresholdMs Operations that run for longer than this threshold are considered slow which are then recorded to the diagnostic logs. Higher log levels (verbosity) will record all operations regardless of this threshold on the primary node. &lt;em&gt;Changing this parameter will lead to a restart of the MongoDB service.&lt;/em&gt; Learn more [here](https://www.mongodb.com/docs/manual/reference/configuration-options/#mongodb-setting-operationProfiling.slowOpThresholdMs).
         * 
         * @return builder
         * 
         */
        public Builder slowOpThresholdMs(Integer slowOpThresholdMs) {
            return slowOpThresholdMs(Output.of(slowOpThresholdMs));
        }

        /**
         * @param transactionLifetimeLimitSeconds Specifies the lifetime of multi-document transactions. Transactions that exceed this limit are considered expired and will be aborted by a periodic cleanup process. The cleanup process runs every `transactionLifetimeLimitSeconds/2 seconds` or at least once every 60 seconds. &lt;em&gt;Changing this parameter will lead to a restart of the MongoDB service.&lt;/em&gt; Learn more [here](https://www.mongodb.com/docs/manual/reference/parameters/#mongodb-parameter-param.transactionLifetimeLimitSeconds).
         * 
         * @return builder
         * 
         */
        public Builder transactionLifetimeLimitSeconds(@Nullable Output<Integer> transactionLifetimeLimitSeconds) {
            $.transactionLifetimeLimitSeconds = transactionLifetimeLimitSeconds;
            return this;
        }

        /**
         * @param transactionLifetimeLimitSeconds Specifies the lifetime of multi-document transactions. Transactions that exceed this limit are considered expired and will be aborted by a periodic cleanup process. The cleanup process runs every `transactionLifetimeLimitSeconds/2 seconds` or at least once every 60 seconds. &lt;em&gt;Changing this parameter will lead to a restart of the MongoDB service.&lt;/em&gt; Learn more [here](https://www.mongodb.com/docs/manual/reference/parameters/#mongodb-parameter-param.transactionLifetimeLimitSeconds).
         * 
         * @return builder
         * 
         */
        public Builder transactionLifetimeLimitSeconds(Integer transactionLifetimeLimitSeconds) {
            return transactionLifetimeLimitSeconds(Output.of(transactionLifetimeLimitSeconds));
        }

        /**
         * @param verbosity The log message verbosity level. The verbosity level determines the amount of Informational and Debug messages MongoDB outputs. 0 includes informational messages while 1...5 increases the level to include debug messages. &lt;em&gt;Changing this parameter will lead to a restart of the MongoDB service.&lt;/em&gt; Learn more [here](https://www.mongodb.com/docs/manual/reference/configuration-options/#mongodb-setting-systemLog.verbosity).
         * 
         * @return builder
         * 
         */
        public Builder verbosity(@Nullable Output<Integer> verbosity) {
            $.verbosity = verbosity;
            return this;
        }

        /**
         * @param verbosity The log message verbosity level. The verbosity level determines the amount of Informational and Debug messages MongoDB outputs. 0 includes informational messages while 1...5 increases the level to include debug messages. &lt;em&gt;Changing this parameter will lead to a restart of the MongoDB service.&lt;/em&gt; Learn more [here](https://www.mongodb.com/docs/manual/reference/configuration-options/#mongodb-setting-systemLog.verbosity).
         * 
         * @return builder
         * 
         */
        public Builder verbosity(Integer verbosity) {
            return verbosity(Output.of(verbosity));
        }

        public DatabaseMongodbConfigState build() {
            return $;
        }
    }

}