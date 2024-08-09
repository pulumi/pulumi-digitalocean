// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.digitalocean.DatabasePostgresqlConfigArgs;
import com.pulumi.digitalocean.Utilities;
import com.pulumi.digitalocean.inputs.DatabasePostgresqlConfigState;
import com.pulumi.digitalocean.outputs.DatabasePostgresqlConfigPgbouncer;
import com.pulumi.digitalocean.outputs.DatabasePostgresqlConfigTimescaledb;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a virtual resource that can be used to change advanced configuration
 * options for a DigitalOcean managed PostgreSQL database cluster.
 * 
 * &gt; **Note** PostgreSQL configurations are only removed from state when destroyed. The remote configuration is not unset.
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
 * import com.pulumi.digitalocean.DatabasePostgresqlConfig;
 * import com.pulumi.digitalocean.DatabasePostgresqlConfigArgs;
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
 *             .name("example-postgresql-cluster")
 *             .engine("pg")
 *             .version("15")
 *             .size("db-s-1vcpu-1gb")
 *             .region("nyc1")
 *             .nodeCount(1)
 *             .build());
 * 
 *         var example = new DatabasePostgresqlConfig("example", DatabasePostgresqlConfigArgs.builder()
 *             .clusterId(exampleDatabaseCluster.id())
 *             .timezone("UTC")
 *             .workMem(16)
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
 * A PostgreSQL database cluster&#39;s configuration can be imported using the `id` the parent cluster, e.g.
 * 
 * bash
 * 
 * ```sh
 * $ pulumi import digitalocean:index/databasePostgresqlConfig:DatabasePostgresqlConfig example 52556c07-788e-4d41-b8a7-c796432197d1
 * ```
 * 
 */
@ResourceType(type="digitalocean:index/databasePostgresqlConfig:DatabasePostgresqlConfig")
public class DatabasePostgresqlConfig extends com.pulumi.resources.CustomResource {
    /**
     * Specifies a fraction, in a decimal value, of the table size to add to autovacuum_analyze_threshold when deciding whether to trigger an ANALYZE. The default is 0.2 (20% of table size).
     * 
     */
    @Export(name="autovacuumAnalyzeScaleFactor", refs={Double.class}, tree="[0]")
    private Output<Double> autovacuumAnalyzeScaleFactor;

    /**
     * @return Specifies a fraction, in a decimal value, of the table size to add to autovacuum_analyze_threshold when deciding whether to trigger an ANALYZE. The default is 0.2 (20% of table size).
     * 
     */
    public Output<Double> autovacuumAnalyzeScaleFactor() {
        return this.autovacuumAnalyzeScaleFactor;
    }
    /**
     * Specifies the minimum number of inserted, updated, or deleted tuples needed to trigger an ANALYZE in any one table. The default is 50 tuples.
     * 
     */
    @Export(name="autovacuumAnalyzeThreshold", refs={Integer.class}, tree="[0]")
    private Output<Integer> autovacuumAnalyzeThreshold;

    /**
     * @return Specifies the minimum number of inserted, updated, or deleted tuples needed to trigger an ANALYZE in any one table. The default is 50 tuples.
     * 
     */
    public Output<Integer> autovacuumAnalyzeThreshold() {
        return this.autovacuumAnalyzeThreshold;
    }
    /**
     * Specifies the maximum age (in transactions) that a table&#39;s pg_class.relfrozenxid field can attain before a VACUUM operation is forced to prevent transaction ID wraparound within the table. Note that the system will launch autovacuum processes to prevent wraparound even when autovacuum is otherwise disabled. This parameter will cause the server to be restarted.
     * 
     */
    @Export(name="autovacuumFreezeMaxAge", refs={Integer.class}, tree="[0]")
    private Output<Integer> autovacuumFreezeMaxAge;

    /**
     * @return Specifies the maximum age (in transactions) that a table&#39;s pg_class.relfrozenxid field can attain before a VACUUM operation is forced to prevent transaction ID wraparound within the table. Note that the system will launch autovacuum processes to prevent wraparound even when autovacuum is otherwise disabled. This parameter will cause the server to be restarted.
     * 
     */
    public Output<Integer> autovacuumFreezeMaxAge() {
        return this.autovacuumFreezeMaxAge;
    }
    /**
     * Specifies the maximum number of autovacuum processes (other than the autovacuum launcher) that may be running at any one time. The default is three. This parameter can only be set at server start.
     * 
     */
    @Export(name="autovacuumMaxWorkers", refs={Integer.class}, tree="[0]")
    private Output<Integer> autovacuumMaxWorkers;

    /**
     * @return Specifies the maximum number of autovacuum processes (other than the autovacuum launcher) that may be running at any one time. The default is three. This parameter can only be set at server start.
     * 
     */
    public Output<Integer> autovacuumMaxWorkers() {
        return this.autovacuumMaxWorkers;
    }
    /**
     * Specifies the minimum delay, in seconds, between autovacuum runs on any given database. The default is one minute.
     * 
     */
    @Export(name="autovacuumNaptime", refs={Integer.class}, tree="[0]")
    private Output<Integer> autovacuumNaptime;

    /**
     * @return Specifies the minimum delay, in seconds, between autovacuum runs on any given database. The default is one minute.
     * 
     */
    public Output<Integer> autovacuumNaptime() {
        return this.autovacuumNaptime;
    }
    /**
     * Specifies the cost delay value, in milliseconds, that will be used in automatic VACUUM operations. If -1, uses the regular vacuum_cost_delay value, which is 20 milliseconds.
     * 
     */
    @Export(name="autovacuumVacuumCostDelay", refs={Integer.class}, tree="[0]")
    private Output<Integer> autovacuumVacuumCostDelay;

    /**
     * @return Specifies the cost delay value, in milliseconds, that will be used in automatic VACUUM operations. If -1, uses the regular vacuum_cost_delay value, which is 20 milliseconds.
     * 
     */
    public Output<Integer> autovacuumVacuumCostDelay() {
        return this.autovacuumVacuumCostDelay;
    }
    /**
     * Specifies the cost limit value that will be used in automatic VACUUM operations. If -1 is specified (which is the default), the regular vacuum_cost_limit value will be used.
     * 
     */
    @Export(name="autovacuumVacuumCostLimit", refs={Integer.class}, tree="[0]")
    private Output<Integer> autovacuumVacuumCostLimit;

    /**
     * @return Specifies the cost limit value that will be used in automatic VACUUM operations. If -1 is specified (which is the default), the regular vacuum_cost_limit value will be used.
     * 
     */
    public Output<Integer> autovacuumVacuumCostLimit() {
        return this.autovacuumVacuumCostLimit;
    }
    /**
     * Specifies a fraction, in a decimal value, of the table size to add to autovacuum_vacuum_threshold when deciding whether to trigger a VACUUM. The default is 0.2 (20% of table size).
     * 
     */
    @Export(name="autovacuumVacuumScaleFactor", refs={Double.class}, tree="[0]")
    private Output<Double> autovacuumVacuumScaleFactor;

    /**
     * @return Specifies a fraction, in a decimal value, of the table size to add to autovacuum_vacuum_threshold when deciding whether to trigger a VACUUM. The default is 0.2 (20% of table size).
     * 
     */
    public Output<Double> autovacuumVacuumScaleFactor() {
        return this.autovacuumVacuumScaleFactor;
    }
    /**
     * Specifies the minimum number of updated or deleted tuples needed to trigger a VACUUM in any one table. The default is 50 tuples.
     * 
     */
    @Export(name="autovacuumVacuumThreshold", refs={Integer.class}, tree="[0]")
    private Output<Integer> autovacuumVacuumThreshold;

    /**
     * @return Specifies the minimum number of updated or deleted tuples needed to trigger a VACUUM in any one table. The default is 50 tuples.
     * 
     */
    public Output<Integer> autovacuumVacuumThreshold() {
        return this.autovacuumVacuumThreshold;
    }
    /**
     * The hour of day (in UTC) when backup for the service starts. New backup only starts if previous backup has already completed.
     * 
     */
    @Export(name="backupHour", refs={Integer.class}, tree="[0]")
    private Output<Integer> backupHour;

    /**
     * @return The hour of day (in UTC) when backup for the service starts. New backup only starts if previous backup has already completed.
     * 
     */
    public Output<Integer> backupHour() {
        return this.backupHour;
    }
    /**
     * The minute of the backup hour when backup for the service starts. New backup is only started if previous backup has already completed.
     * 
     */
    @Export(name="backupMinute", refs={Integer.class}, tree="[0]")
    private Output<Integer> backupMinute;

    /**
     * @return The minute of the backup hour when backup for the service starts. New backup is only started if previous backup has already completed.
     * 
     */
    public Output<Integer> backupMinute() {
        return this.backupMinute;
    }
    /**
     * Specifies the delay, in milliseconds, between activity rounds for the background writer. Default is 200 ms.
     * 
     */
    @Export(name="bgwriterDelay", refs={Integer.class}, tree="[0]")
    private Output<Integer> bgwriterDelay;

    /**
     * @return Specifies the delay, in milliseconds, between activity rounds for the background writer. Default is 200 ms.
     * 
     */
    public Output<Integer> bgwriterDelay() {
        return this.bgwriterDelay;
    }
    /**
     * The amount of kilobytes that need to be written by the background writer before attempting to force the OS to issue these writes to underlying storage. Specified in kilobytes, default is 512. Setting of 0 disables forced writeback.
     * 
     */
    @Export(name="bgwriterFlushAfter", refs={Integer.class}, tree="[0]")
    private Output<Integer> bgwriterFlushAfter;

    /**
     * @return The amount of kilobytes that need to be written by the background writer before attempting to force the OS to issue these writes to underlying storage. Specified in kilobytes, default is 512. Setting of 0 disables forced writeback.
     * 
     */
    public Output<Integer> bgwriterFlushAfter() {
        return this.bgwriterFlushAfter;
    }
    /**
     * The maximum number of buffers that the background writer can write. Setting this to zero disables background writing. Default is 100.
     * 
     */
    @Export(name="bgwriterLruMaxpages", refs={Integer.class}, tree="[0]")
    private Output<Integer> bgwriterLruMaxpages;

    /**
     * @return The maximum number of buffers that the background writer can write. Setting this to zero disables background writing. Default is 100.
     * 
     */
    public Output<Integer> bgwriterLruMaxpages() {
        return this.bgwriterLruMaxpages;
    }
    /**
     * The average recent need for new buffers is multiplied by bgwriter_lru_multiplier to arrive at an estimate of the number that will be needed during the next round, (up to bgwriter_lru_maxpages). 1.0 represents a “just in time” policy of writing exactly the number of buffers predicted to be needed. Larger values provide some cushion against spikes in demand, while smaller values intentionally leave writes to be done by server processes. The default is 2.0.
     * 
     */
    @Export(name="bgwriterLruMultiplier", refs={Double.class}, tree="[0]")
    private Output<Double> bgwriterLruMultiplier;

    /**
     * @return The average recent need for new buffers is multiplied by bgwriter_lru_multiplier to arrive at an estimate of the number that will be needed during the next round, (up to bgwriter_lru_maxpages). 1.0 represents a “just in time” policy of writing exactly the number of buffers predicted to be needed. Larger values provide some cushion against spikes in demand, while smaller values intentionally leave writes to be done by server processes. The default is 2.0.
     * 
     */
    public Output<Double> bgwriterLruMultiplier() {
        return this.bgwriterLruMultiplier;
    }
    /**
     * The ID of the target PostgreSQL cluster.
     * 
     */
    @Export(name="clusterId", refs={String.class}, tree="[0]")
    private Output<String> clusterId;

    /**
     * @return The ID of the target PostgreSQL cluster.
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }
    /**
     * The amount of time, in milliseconds, to wait on a lock before checking to see if there is a deadlock condition.
     * 
     */
    @Export(name="deadlockTimeout", refs={Integer.class}, tree="[0]")
    private Output<Integer> deadlockTimeout;

    /**
     * @return The amount of time, in milliseconds, to wait on a lock before checking to see if there is a deadlock condition.
     * 
     */
    public Output<Integer> deadlockTimeout() {
        return this.deadlockTimeout;
    }
    /**
     * Specifies the default TOAST compression method for values of compressible columns (the default is lz4). Supported values are: `lz4`, `pglz`.
     * 
     */
    @Export(name="defaultToastCompression", refs={String.class}, tree="[0]")
    private Output<String> defaultToastCompression;

    /**
     * @return Specifies the default TOAST compression method for values of compressible columns (the default is lz4). Supported values are: `lz4`, `pglz`.
     * 
     */
    public Output<String> defaultToastCompression() {
        return this.defaultToastCompression;
    }
    /**
     * Time out sessions with open transactions after this number of milliseconds
     * 
     */
    @Export(name="idleInTransactionSessionTimeout", refs={Integer.class}, tree="[0]")
    private Output<Integer> idleInTransactionSessionTimeout;

    /**
     * @return Time out sessions with open transactions after this number of milliseconds
     * 
     */
    public Output<Integer> idleInTransactionSessionTimeout() {
        return this.idleInTransactionSessionTimeout;
    }
    /**
     * Activates, in a boolean, the system-wide use of Just-in-Time Compilation (JIT).
     * 
     */
    @Export(name="jit", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> jit;

    /**
     * @return Activates, in a boolean, the system-wide use of Just-in-Time Compilation (JIT).
     * 
     */
    public Output<Boolean> jit() {
        return this.jit;
    }
    /**
     * Causes each action executed by autovacuum to be logged if it ran for at least the specified number of milliseconds. Setting this to zero logs all autovacuum actions. Minus-one (the default) disables logging autovacuum actions.
     * 
     */
    @Export(name="logAutovacuumMinDuration", refs={Integer.class}, tree="[0]")
    private Output<Integer> logAutovacuumMinDuration;

    /**
     * @return Causes each action executed by autovacuum to be logged if it ran for at least the specified number of milliseconds. Setting this to zero logs all autovacuum actions. Minus-one (the default) disables logging autovacuum actions.
     * 
     */
    public Output<Integer> logAutovacuumMinDuration() {
        return this.logAutovacuumMinDuration;
    }
    /**
     * Controls the amount of detail written in the server log for each message that is logged. Supported values are: `TERSE`, `DEFAULT`, `VERBOSE`.
     * 
     */
    @Export(name="logErrorVerbosity", refs={String.class}, tree="[0]")
    private Output<String> logErrorVerbosity;

    /**
     * @return Controls the amount of detail written in the server log for each message that is logged. Supported values are: `TERSE`, `DEFAULT`, `VERBOSE`.
     * 
     */
    public Output<String> logErrorVerbosity() {
        return this.logErrorVerbosity;
    }
    /**
     * Selects one of the available log-formats. These can support popular log analyzers like pgbadger, pganalyze, etc. Supported values are: `pid=%p,user=%u,db=%d,app=%a,client=%h`, `%m [%p] %q[user=%u,db=%d,app=%a]`, `%t [%p]: [%l-1] user=%u,db=%d,app=%a,client=%h`.
     * 
     */
    @Export(name="logLinePrefix", refs={String.class}, tree="[0]")
    private Output<String> logLinePrefix;

    /**
     * @return Selects one of the available log-formats. These can support popular log analyzers like pgbadger, pganalyze, etc. Supported values are: `pid=%p,user=%u,db=%d,app=%a,client=%h`, `%m [%p] %q[user=%u,db=%d,app=%a]`, `%t [%p]: [%l-1] user=%u,db=%d,app=%a,client=%h`.
     * 
     */
    public Output<String> logLinePrefix() {
        return this.logLinePrefix;
    }
    /**
     * Log statements that take more than this number of milliseconds to run. If -1, disables.
     * 
     */
    @Export(name="logMinDurationStatement", refs={Integer.class}, tree="[0]")
    private Output<Integer> logMinDurationStatement;

    /**
     * @return Log statements that take more than this number of milliseconds to run. If -1, disables.
     * 
     */
    public Output<Integer> logMinDurationStatement() {
        return this.logMinDurationStatement;
    }
    /**
     * PostgreSQL maximum number of files that can be open per process.
     * 
     */
    @Export(name="maxFilesPerProcess", refs={Integer.class}, tree="[0]")
    private Output<Integer> maxFilesPerProcess;

    /**
     * @return PostgreSQL maximum number of files that can be open per process.
     * 
     */
    public Output<Integer> maxFilesPerProcess() {
        return this.maxFilesPerProcess;
    }
    /**
     * PostgreSQL maximum locks per transaction. Once increased, this parameter cannot be lowered from its set value.
     * 
     */
    @Export(name="maxLocksPerTransaction", refs={Integer.class}, tree="[0]")
    private Output<Integer> maxLocksPerTransaction;

    /**
     * @return PostgreSQL maximum locks per transaction. Once increased, this parameter cannot be lowered from its set value.
     * 
     */
    public Output<Integer> maxLocksPerTransaction() {
        return this.maxLocksPerTransaction;
    }
    /**
     * PostgreSQL maximum logical replication workers (taken from the pool of max_parallel_workers).
     * 
     */
    @Export(name="maxLogicalReplicationWorkers", refs={Integer.class}, tree="[0]")
    private Output<Integer> maxLogicalReplicationWorkers;

    /**
     * @return PostgreSQL maximum logical replication workers (taken from the pool of max_parallel_workers).
     * 
     */
    public Output<Integer> maxLogicalReplicationWorkers() {
        return this.maxLogicalReplicationWorkers;
    }
    /**
     * Sets the maximum number of workers that the system can support for parallel queries.
     * 
     */
    @Export(name="maxParallelWorkers", refs={Integer.class}, tree="[0]")
    private Output<Integer> maxParallelWorkers;

    /**
     * @return Sets the maximum number of workers that the system can support for parallel queries.
     * 
     */
    public Output<Integer> maxParallelWorkers() {
        return this.maxParallelWorkers;
    }
    /**
     * Sets the maximum number of workers that can be started by a single Gather or Gather Merge node.
     * 
     */
    @Export(name="maxParallelWorkersPerGather", refs={Integer.class}, tree="[0]")
    private Output<Integer> maxParallelWorkersPerGather;

    /**
     * @return Sets the maximum number of workers that can be started by a single Gather or Gather Merge node.
     * 
     */
    public Output<Integer> maxParallelWorkersPerGather() {
        return this.maxParallelWorkersPerGather;
    }
    /**
     * PostgreSQL maximum predicate locks per transaction.
     * 
     */
    @Export(name="maxPredLocksPerTransaction", refs={Integer.class}, tree="[0]")
    private Output<Integer> maxPredLocksPerTransaction;

    /**
     * @return PostgreSQL maximum predicate locks per transaction.
     * 
     */
    public Output<Integer> maxPredLocksPerTransaction() {
        return this.maxPredLocksPerTransaction;
    }
    /**
     * PostgreSQL maximum prepared transactions. Once increased, this parameter cannot be lowered from its set value.
     * 
     */
    @Export(name="maxPreparedTransactions", refs={Integer.class}, tree="[0]")
    private Output<Integer> maxPreparedTransactions;

    /**
     * @return PostgreSQL maximum prepared transactions. Once increased, this parameter cannot be lowered from its set value.
     * 
     */
    public Output<Integer> maxPreparedTransactions() {
        return this.maxPreparedTransactions;
    }
    /**
     * PostgreSQL maximum replication slots.
     * 
     */
    @Export(name="maxReplicationSlots", refs={Integer.class}, tree="[0]")
    private Output<Integer> maxReplicationSlots;

    /**
     * @return PostgreSQL maximum replication slots.
     * 
     */
    public Output<Integer> maxReplicationSlots() {
        return this.maxReplicationSlots;
    }
    /**
     * Maximum depth of the stack in bytes.
     * 
     */
    @Export(name="maxStackDepth", refs={Integer.class}, tree="[0]")
    private Output<Integer> maxStackDepth;

    /**
     * @return Maximum depth of the stack in bytes.
     * 
     */
    public Output<Integer> maxStackDepth() {
        return this.maxStackDepth;
    }
    /**
     * Max standby archive delay in milliseconds.
     * 
     */
    @Export(name="maxStandbyArchiveDelay", refs={Integer.class}, tree="[0]")
    private Output<Integer> maxStandbyArchiveDelay;

    /**
     * @return Max standby archive delay in milliseconds.
     * 
     */
    public Output<Integer> maxStandbyArchiveDelay() {
        return this.maxStandbyArchiveDelay;
    }
    /**
     * Max standby streaming delay in milliseconds.
     * 
     */
    @Export(name="maxStandbyStreamingDelay", refs={Integer.class}, tree="[0]")
    private Output<Integer> maxStandbyStreamingDelay;

    /**
     * @return Max standby streaming delay in milliseconds.
     * 
     */
    public Output<Integer> maxStandbyStreamingDelay() {
        return this.maxStandbyStreamingDelay;
    }
    /**
     * PostgreSQL maximum WAL senders. Once increased, this parameter cannot be lowered from its set value.
     * 
     */
    @Export(name="maxWalSenders", refs={Integer.class}, tree="[0]")
    private Output<Integer> maxWalSenders;

    /**
     * @return PostgreSQL maximum WAL senders. Once increased, this parameter cannot be lowered from its set value.
     * 
     */
    public Output<Integer> maxWalSenders() {
        return this.maxWalSenders;
    }
    /**
     * Sets the maximum number of background processes that the system can support. Once increased, this parameter cannot be lowered from its set value.
     * 
     */
    @Export(name="maxWorkerProcesses", refs={Integer.class}, tree="[0]")
    private Output<Integer> maxWorkerProcesses;

    /**
     * @return Sets the maximum number of background processes that the system can support. Once increased, this parameter cannot be lowered from its set value.
     * 
     */
    public Output<Integer> maxWorkerProcesses() {
        return this.maxWorkerProcesses;
    }
    /**
     * Sets the time interval to run pg_partman&#39;s scheduled tasks.
     * 
     */
    @Export(name="pgPartmanBgwInterval", refs={Integer.class}, tree="[0]")
    private Output<Integer> pgPartmanBgwInterval;

    /**
     * @return Sets the time interval to run pg_partman&#39;s scheduled tasks.
     * 
     */
    public Output<Integer> pgPartmanBgwInterval() {
        return this.pgPartmanBgwInterval;
    }
    /**
     * Controls which role to use for pg_partman&#39;s scheduled background tasks. Must consist of alpha-numeric characters, dots, underscores, or dashes. May not start with dash or dot. Maximum of 64 characters.
     * 
     */
    @Export(name="pgPartmanBgwRole", refs={String.class}, tree="[0]")
    private Output<String> pgPartmanBgwRole;

    /**
     * @return Controls which role to use for pg_partman&#39;s scheduled background tasks. Must consist of alpha-numeric characters, dots, underscores, or dashes. May not start with dash or dot. Maximum of 64 characters.
     * 
     */
    public Output<String> pgPartmanBgwRole() {
        return this.pgPartmanBgwRole;
    }
    /**
     * Controls which statements are counted. Specify &#39;top&#39; to track top-level statements (those issued directly by clients), &#39;all&#39; to also track nested statements (such as statements invoked within functions), or &#39;none&#39; to disable statement statistics collection. The default value is top. Supported values are: `all`, `top`, `none`.
     * 
     */
    @Export(name="pgStatStatementsTrack", refs={String.class}, tree="[0]")
    private Output<String> pgStatStatementsTrack;

    /**
     * @return Controls which statements are counted. Specify &#39;top&#39; to track top-level statements (those issued directly by clients), &#39;all&#39; to also track nested statements (such as statements invoked within functions), or &#39;none&#39; to disable statement statistics collection. The default value is top. Supported values are: `all`, `top`, `none`.
     * 
     */
    public Output<String> pgStatStatementsTrack() {
        return this.pgStatStatementsTrack;
    }
    /**
     * PGBouncer connection pooling settings
     * 
     */
    @Export(name="pgbouncers", refs={List.class,DatabasePostgresqlConfigPgbouncer.class}, tree="[0,1]")
    private Output<List<DatabasePostgresqlConfigPgbouncer>> pgbouncers;

    /**
     * @return PGBouncer connection pooling settings
     * 
     */
    public Output<List<DatabasePostgresqlConfigPgbouncer>> pgbouncers() {
        return this.pgbouncers;
    }
    /**
     * Percentage of total RAM that the database server uses for shared memory buffers. Valid range is 20-60 (float), which corresponds to 20% - 60%. This setting adjusts the shared_buffers configuration value.
     * 
     */
    @Export(name="sharedBuffersPercentage", refs={Double.class}, tree="[0]")
    private Output<Double> sharedBuffersPercentage;

    /**
     * @return Percentage of total RAM that the database server uses for shared memory buffers. Valid range is 20-60 (float), which corresponds to 20% - 60%. This setting adjusts the shared_buffers configuration value.
     * 
     */
    public Output<Double> sharedBuffersPercentage() {
        return this.sharedBuffersPercentage;
    }
    /**
     * PostgreSQL temporary file limit in KiB. If -1, sets to unlimited.
     * 
     */
    @Export(name="tempFileLimit", refs={Integer.class}, tree="[0]")
    private Output<Integer> tempFileLimit;

    /**
     * @return PostgreSQL temporary file limit in KiB. If -1, sets to unlimited.
     * 
     */
    public Output<Integer> tempFileLimit() {
        return this.tempFileLimit;
    }
    /**
     * TimescaleDB extension configuration values
     * 
     */
    @Export(name="timescaledbs", refs={List.class,DatabasePostgresqlConfigTimescaledb.class}, tree="[0,1]")
    private Output<List<DatabasePostgresqlConfigTimescaledb>> timescaledbs;

    /**
     * @return TimescaleDB extension configuration values
     * 
     */
    public Output<List<DatabasePostgresqlConfigTimescaledb>> timescaledbs() {
        return this.timescaledbs;
    }
    /**
     * PostgreSQL service timezone
     * 
     */
    @Export(name="timezone", refs={String.class}, tree="[0]")
    private Output<String> timezone;

    /**
     * @return PostgreSQL service timezone
     * 
     */
    public Output<String> timezone() {
        return this.timezone;
    }
    /**
     * Specifies the number of bytes reserved to track the currently executing command for each active session.
     * 
     */
    @Export(name="trackActivityQuerySize", refs={Integer.class}, tree="[0]")
    private Output<Integer> trackActivityQuerySize;

    /**
     * @return Specifies the number of bytes reserved to track the currently executing command for each active session.
     * 
     */
    public Output<Integer> trackActivityQuerySize() {
        return this.trackActivityQuerySize;
    }
    /**
     * Record commit time of transactions. The default value is top. Supported values are: `off`, `on`.
     * 
     */
    @Export(name="trackCommitTimestamp", refs={String.class}, tree="[0]")
    private Output<String> trackCommitTimestamp;

    /**
     * @return Record commit time of transactions. The default value is top. Supported values are: `off`, `on`.
     * 
     */
    public Output<String> trackCommitTimestamp() {
        return this.trackCommitTimestamp;
    }
    /**
     * Enables tracking of function call counts and time used. The default value is top. Supported values are: `all`, `pl`, `none`.
     * 
     */
    @Export(name="trackFunctions", refs={String.class}, tree="[0]")
    private Output<String> trackFunctions;

    /**
     * @return Enables tracking of function call counts and time used. The default value is top. Supported values are: `all`, `pl`, `none`.
     * 
     */
    public Output<String> trackFunctions() {
        return this.trackFunctions;
    }
    /**
     * Enables timing of database I/O calls. This parameter is off by default, because it will repeatedly query the operating system for the current time, which may cause significant overhead on some platforms. The default value is top. Supported values are: `off`, `on`.
     * 
     */
    @Export(name="trackIoTiming", refs={String.class}, tree="[0]")
    private Output<String> trackIoTiming;

    /**
     * @return Enables timing of database I/O calls. This parameter is off by default, because it will repeatedly query the operating system for the current time, which may cause significant overhead on some platforms. The default value is top. Supported values are: `off`, `on`.
     * 
     */
    public Output<String> trackIoTiming() {
        return this.trackIoTiming;
    }
    /**
     * Terminate replication connections that are inactive for longer than this amount of time, in milliseconds. Setting this value to zero disables the timeout. Must be either 0 or between 5000 and 10800000.
     * 
     */
    @Export(name="walSenderTimeout", refs={Integer.class}, tree="[0]")
    private Output<Integer> walSenderTimeout;

    /**
     * @return Terminate replication connections that are inactive for longer than this amount of time, in milliseconds. Setting this value to zero disables the timeout. Must be either 0 or between 5000 and 10800000.
     * 
     */
    public Output<Integer> walSenderTimeout() {
        return this.walSenderTimeout;
    }
    /**
     * WAL flush interval in milliseconds. Note that setting this value to lower than the default 200ms may negatively impact performance
     * 
     */
    @Export(name="walWriterDelay", refs={Integer.class}, tree="[0]")
    private Output<Integer> walWriterDelay;

    /**
     * @return WAL flush interval in milliseconds. Note that setting this value to lower than the default 200ms may negatively impact performance
     * 
     */
    public Output<Integer> walWriterDelay() {
        return this.walWriterDelay;
    }
    /**
     * The maximum amount of memory, in MB, used by a query operation (such as a sort or hash table) before writing to temporary disk files. Default is 1MB + 0.075% of total RAM (up to 32MB).
     * 
     */
    @Export(name="workMem", refs={Integer.class}, tree="[0]")
    private Output<Integer> workMem;

    /**
     * @return The maximum amount of memory, in MB, used by a query operation (such as a sort or hash table) before writing to temporary disk files. Default is 1MB + 0.075% of total RAM (up to 32MB).
     * 
     */
    public Output<Integer> workMem() {
        return this.workMem;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DatabasePostgresqlConfig(java.lang.String name) {
        this(name, DatabasePostgresqlConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DatabasePostgresqlConfig(java.lang.String name, DatabasePostgresqlConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DatabasePostgresqlConfig(java.lang.String name, DatabasePostgresqlConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/databasePostgresqlConfig:DatabasePostgresqlConfig", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private DatabasePostgresqlConfig(java.lang.String name, Output<java.lang.String> id, @Nullable DatabasePostgresqlConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/databasePostgresqlConfig:DatabasePostgresqlConfig", name, state, makeResourceOptions(options, id), false);
    }

    private static DatabasePostgresqlConfigArgs makeArgs(DatabasePostgresqlConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? DatabasePostgresqlConfigArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
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
    public static DatabasePostgresqlConfig get(java.lang.String name, Output<java.lang.String> id, @Nullable DatabasePostgresqlConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DatabasePostgresqlConfig(name, id, state, options);
    }
}
