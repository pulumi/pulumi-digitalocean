// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a virtual resource that can be used to change advanced configuration
 * options for a DigitalOcean managed MySQL database cluster.
 *
 * > **Note** MySQL configurations are only removed from state when destroyed. The remote configuration is not unset.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const exampleDatabaseCluster = new digitalocean.DatabaseCluster("exampleDatabaseCluster", {
 *     engine: "mysql",
 *     version: "8",
 *     size: "db-s-1vcpu-1gb",
 *     region: "nyc1",
 *     nodeCount: 1,
 * });
 * const exampleDatabaseMysqlConfig = new digitalocean.DatabaseMysqlConfig("exampleDatabaseMysqlConfig", {
 *     clusterId: exampleDatabaseCluster.id,
 *     connectTimeout: 10,
 *     defaultTimeZone: "UTC",
 * });
 * ```
 *
 * ## Import
 *
 * A MySQL database cluster's configuration can be imported using the `id` the parent cluster, e.g.
 *
 * ```sh
 * $ pulumi import digitalocean:index/databaseMysqlConfig:DatabaseMysqlConfig example 4b62829a-9c42-465b-aaa3-84051048e712
 * ```
 */
export class DatabaseMysqlConfig extends pulumi.CustomResource {
    /**
     * Get an existing DatabaseMysqlConfig resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DatabaseMysqlConfigState, opts?: pulumi.CustomResourceOptions): DatabaseMysqlConfig {
        return new DatabaseMysqlConfig(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'digitalocean:index/databaseMysqlConfig:DatabaseMysqlConfig';

    /**
     * Returns true if the given object is an instance of DatabaseMysqlConfig.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DatabaseMysqlConfig {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DatabaseMysqlConfig.__pulumiType;
    }

    /**
     * The hour of day (in UTC) when backup for the service starts. New backup only starts if previous backup has already completed.
     */
    public readonly backupHour!: pulumi.Output<number>;
    /**
     * The minute of the backup hour when backup for the service starts. New backup only starts if previous backup has already completed.
     */
    public readonly backupMinute!: pulumi.Output<number>;
    /**
     * The minimum amount of time, in seconds, to keep binlog entries before deletion. This may be extended for services that require binlog entries for longer than the default, for example if using the MySQL Debezium Kafka connector.
     */
    public readonly binlogRetentionPeriod!: pulumi.Output<number>;
    /**
     * The ID of the target MySQL cluster.
     */
    public readonly clusterId!: pulumi.Output<string>;
    /**
     * The number of seconds that the mysqld server waits for a connect packet before responding with bad handshake.
     */
    public readonly connectTimeout!: pulumi.Output<number>;
    /**
     * Default server time zone, in the form of an offset from UTC (from -12:00 to +12:00), a time zone name (EST), or `SYSTEM` to use the MySQL server default.
     */
    public readonly defaultTimeZone!: pulumi.Output<string>;
    /**
     * The maximum permitted result length, in bytes, for the `GROUP_CONCAT()` function.
     */
    public readonly groupConcatMaxLen!: pulumi.Output<number>;
    /**
     * The time, in seconds, before cached statistics expire.
     */
    public readonly informationSchemaStatsExpiry!: pulumi.Output<number>;
    /**
     * The minimum length of words that an InnoDB FULLTEXT index stores.
     */
    public readonly innodbFtMinTokenSize!: pulumi.Output<number>;
    /**
     * The InnoDB FULLTEXT index stopword list for all InnoDB tables.
     */
    public readonly innodbFtServerStopwordTable!: pulumi.Output<string>;
    /**
     * The time, in seconds, that an InnoDB transaction waits for a row lock. before giving up.
     */
    public readonly innodbLockWaitTimeout!: pulumi.Output<number>;
    /**
     * The size of the buffer, in bytes, that InnoDB uses to write to the log files. on disk.
     */
    public readonly innodbLogBufferSize!: pulumi.Output<number>;
    /**
     * The upper limit, in bytes, of the size of the temporary log files used during online DDL operations for InnoDB tables.
     */
    public readonly innodbOnlineAlterLogMaxSize!: pulumi.Output<number>;
    /**
     * When enabled, records information about all deadlocks in InnoDB user transactions in the error log. Disabled by default.
     */
    public readonly innodbPrintAllDeadlocks!: pulumi.Output<boolean>;
    /**
     * When enabled, transaction timeouts cause InnoDB to abort and roll back the entire transaction.
     */
    public readonly innodbRollbackOnTimeout!: pulumi.Output<boolean>;
    /**
     * The time, in seconds, the server waits for activity on an interactive. connection before closing it.
     */
    public readonly interactiveTimeout!: pulumi.Output<number>;
    /**
     * The storage engine for in-memory internal temporary tables. Supported values are: `TempTable`, `MEMORY`.
     */
    public readonly internalTmpMemStorageEngine!: pulumi.Output<string>;
    /**
     * The time, in seconds, for a query to take to execute before being captured by `slowQueryLogs`. Default is `10` seconds.
     */
    public readonly longQueryTime!: pulumi.Output<number>;
    /**
     * The size of the largest message, in bytes, that can be received by the server. Default is `67108864` (64M).
     */
    public readonly maxAllowedPacket!: pulumi.Output<number>;
    /**
     * The maximum size, in bytes, of internal in-memory tables. Also set `tmpTableSize`. Default is `16777216` (16M)
     */
    public readonly maxHeapTableSize!: pulumi.Output<number>;
    /**
     * The time, in seconds, to wait for more data from an existing connection. aborting the read.
     */
    public readonly netReadTimeout!: pulumi.Output<number>;
    /**
     * The number of seconds to wait for a block to be written to a connection before aborting the write.
     */
    public readonly netWriteTimeout!: pulumi.Output<number>;
    /**
     * When enabled, captures slow queries. When disabled, also truncates the mysql.slow_log table. Default is false.
     */
    public readonly slowQueryLog!: pulumi.Output<boolean>;
    /**
     * The sort buffer size, in bytes, for `ORDER BY` optimization. Default is `262144`. (256K).
     */
    public readonly sortBufferSize!: pulumi.Output<number>;
    /**
     * Global SQL mode. If empty, uses MySQL server defaults. Must only include uppercase alphabetic characters, underscores, and commas.
     */
    public readonly sqlMode!: pulumi.Output<string>;
    /**
     * Require primary key to be defined for new tables or old tables modified with ALTER TABLE and fail if missing. It is recommended to always have primary keys because various functionality may break if any large table is missing them.
     */
    public readonly sqlRequirePrimaryKey!: pulumi.Output<boolean>;
    /**
     * The maximum size, in bytes, of internal in-memory tables. Also set `maxHeapTableSize`. Default is `16777216` (16M).
     */
    public readonly tmpTableSize!: pulumi.Output<number>;
    /**
     * The number of seconds the server waits for activity on a noninteractive connection before closing it.
     */
    public readonly waitTimeout!: pulumi.Output<number>;

    /**
     * Create a DatabaseMysqlConfig resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DatabaseMysqlConfigArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DatabaseMysqlConfigArgs | DatabaseMysqlConfigState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DatabaseMysqlConfigState | undefined;
            resourceInputs["backupHour"] = state ? state.backupHour : undefined;
            resourceInputs["backupMinute"] = state ? state.backupMinute : undefined;
            resourceInputs["binlogRetentionPeriod"] = state ? state.binlogRetentionPeriod : undefined;
            resourceInputs["clusterId"] = state ? state.clusterId : undefined;
            resourceInputs["connectTimeout"] = state ? state.connectTimeout : undefined;
            resourceInputs["defaultTimeZone"] = state ? state.defaultTimeZone : undefined;
            resourceInputs["groupConcatMaxLen"] = state ? state.groupConcatMaxLen : undefined;
            resourceInputs["informationSchemaStatsExpiry"] = state ? state.informationSchemaStatsExpiry : undefined;
            resourceInputs["innodbFtMinTokenSize"] = state ? state.innodbFtMinTokenSize : undefined;
            resourceInputs["innodbFtServerStopwordTable"] = state ? state.innodbFtServerStopwordTable : undefined;
            resourceInputs["innodbLockWaitTimeout"] = state ? state.innodbLockWaitTimeout : undefined;
            resourceInputs["innodbLogBufferSize"] = state ? state.innodbLogBufferSize : undefined;
            resourceInputs["innodbOnlineAlterLogMaxSize"] = state ? state.innodbOnlineAlterLogMaxSize : undefined;
            resourceInputs["innodbPrintAllDeadlocks"] = state ? state.innodbPrintAllDeadlocks : undefined;
            resourceInputs["innodbRollbackOnTimeout"] = state ? state.innodbRollbackOnTimeout : undefined;
            resourceInputs["interactiveTimeout"] = state ? state.interactiveTimeout : undefined;
            resourceInputs["internalTmpMemStorageEngine"] = state ? state.internalTmpMemStorageEngine : undefined;
            resourceInputs["longQueryTime"] = state ? state.longQueryTime : undefined;
            resourceInputs["maxAllowedPacket"] = state ? state.maxAllowedPacket : undefined;
            resourceInputs["maxHeapTableSize"] = state ? state.maxHeapTableSize : undefined;
            resourceInputs["netReadTimeout"] = state ? state.netReadTimeout : undefined;
            resourceInputs["netWriteTimeout"] = state ? state.netWriteTimeout : undefined;
            resourceInputs["slowQueryLog"] = state ? state.slowQueryLog : undefined;
            resourceInputs["sortBufferSize"] = state ? state.sortBufferSize : undefined;
            resourceInputs["sqlMode"] = state ? state.sqlMode : undefined;
            resourceInputs["sqlRequirePrimaryKey"] = state ? state.sqlRequirePrimaryKey : undefined;
            resourceInputs["tmpTableSize"] = state ? state.tmpTableSize : undefined;
            resourceInputs["waitTimeout"] = state ? state.waitTimeout : undefined;
        } else {
            const args = argsOrState as DatabaseMysqlConfigArgs | undefined;
            if ((!args || args.clusterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterId'");
            }
            resourceInputs["backupHour"] = args ? args.backupHour : undefined;
            resourceInputs["backupMinute"] = args ? args.backupMinute : undefined;
            resourceInputs["binlogRetentionPeriod"] = args ? args.binlogRetentionPeriod : undefined;
            resourceInputs["clusterId"] = args ? args.clusterId : undefined;
            resourceInputs["connectTimeout"] = args ? args.connectTimeout : undefined;
            resourceInputs["defaultTimeZone"] = args ? args.defaultTimeZone : undefined;
            resourceInputs["groupConcatMaxLen"] = args ? args.groupConcatMaxLen : undefined;
            resourceInputs["informationSchemaStatsExpiry"] = args ? args.informationSchemaStatsExpiry : undefined;
            resourceInputs["innodbFtMinTokenSize"] = args ? args.innodbFtMinTokenSize : undefined;
            resourceInputs["innodbFtServerStopwordTable"] = args ? args.innodbFtServerStopwordTable : undefined;
            resourceInputs["innodbLockWaitTimeout"] = args ? args.innodbLockWaitTimeout : undefined;
            resourceInputs["innodbLogBufferSize"] = args ? args.innodbLogBufferSize : undefined;
            resourceInputs["innodbOnlineAlterLogMaxSize"] = args ? args.innodbOnlineAlterLogMaxSize : undefined;
            resourceInputs["innodbPrintAllDeadlocks"] = args ? args.innodbPrintAllDeadlocks : undefined;
            resourceInputs["innodbRollbackOnTimeout"] = args ? args.innodbRollbackOnTimeout : undefined;
            resourceInputs["interactiveTimeout"] = args ? args.interactiveTimeout : undefined;
            resourceInputs["internalTmpMemStorageEngine"] = args ? args.internalTmpMemStorageEngine : undefined;
            resourceInputs["longQueryTime"] = args ? args.longQueryTime : undefined;
            resourceInputs["maxAllowedPacket"] = args ? args.maxAllowedPacket : undefined;
            resourceInputs["maxHeapTableSize"] = args ? args.maxHeapTableSize : undefined;
            resourceInputs["netReadTimeout"] = args ? args.netReadTimeout : undefined;
            resourceInputs["netWriteTimeout"] = args ? args.netWriteTimeout : undefined;
            resourceInputs["slowQueryLog"] = args ? args.slowQueryLog : undefined;
            resourceInputs["sortBufferSize"] = args ? args.sortBufferSize : undefined;
            resourceInputs["sqlMode"] = args ? args.sqlMode : undefined;
            resourceInputs["sqlRequirePrimaryKey"] = args ? args.sqlRequirePrimaryKey : undefined;
            resourceInputs["tmpTableSize"] = args ? args.tmpTableSize : undefined;
            resourceInputs["waitTimeout"] = args ? args.waitTimeout : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DatabaseMysqlConfig.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DatabaseMysqlConfig resources.
 */
export interface DatabaseMysqlConfigState {
    /**
     * The hour of day (in UTC) when backup for the service starts. New backup only starts if previous backup has already completed.
     */
    backupHour?: pulumi.Input<number>;
    /**
     * The minute of the backup hour when backup for the service starts. New backup only starts if previous backup has already completed.
     */
    backupMinute?: pulumi.Input<number>;
    /**
     * The minimum amount of time, in seconds, to keep binlog entries before deletion. This may be extended for services that require binlog entries for longer than the default, for example if using the MySQL Debezium Kafka connector.
     */
    binlogRetentionPeriod?: pulumi.Input<number>;
    /**
     * The ID of the target MySQL cluster.
     */
    clusterId?: pulumi.Input<string>;
    /**
     * The number of seconds that the mysqld server waits for a connect packet before responding with bad handshake.
     */
    connectTimeout?: pulumi.Input<number>;
    /**
     * Default server time zone, in the form of an offset from UTC (from -12:00 to +12:00), a time zone name (EST), or `SYSTEM` to use the MySQL server default.
     */
    defaultTimeZone?: pulumi.Input<string>;
    /**
     * The maximum permitted result length, in bytes, for the `GROUP_CONCAT()` function.
     */
    groupConcatMaxLen?: pulumi.Input<number>;
    /**
     * The time, in seconds, before cached statistics expire.
     */
    informationSchemaStatsExpiry?: pulumi.Input<number>;
    /**
     * The minimum length of words that an InnoDB FULLTEXT index stores.
     */
    innodbFtMinTokenSize?: pulumi.Input<number>;
    /**
     * The InnoDB FULLTEXT index stopword list for all InnoDB tables.
     */
    innodbFtServerStopwordTable?: pulumi.Input<string>;
    /**
     * The time, in seconds, that an InnoDB transaction waits for a row lock. before giving up.
     */
    innodbLockWaitTimeout?: pulumi.Input<number>;
    /**
     * The size of the buffer, in bytes, that InnoDB uses to write to the log files. on disk.
     */
    innodbLogBufferSize?: pulumi.Input<number>;
    /**
     * The upper limit, in bytes, of the size of the temporary log files used during online DDL operations for InnoDB tables.
     */
    innodbOnlineAlterLogMaxSize?: pulumi.Input<number>;
    /**
     * When enabled, records information about all deadlocks in InnoDB user transactions in the error log. Disabled by default.
     */
    innodbPrintAllDeadlocks?: pulumi.Input<boolean>;
    /**
     * When enabled, transaction timeouts cause InnoDB to abort and roll back the entire transaction.
     */
    innodbRollbackOnTimeout?: pulumi.Input<boolean>;
    /**
     * The time, in seconds, the server waits for activity on an interactive. connection before closing it.
     */
    interactiveTimeout?: pulumi.Input<number>;
    /**
     * The storage engine for in-memory internal temporary tables. Supported values are: `TempTable`, `MEMORY`.
     */
    internalTmpMemStorageEngine?: pulumi.Input<string>;
    /**
     * The time, in seconds, for a query to take to execute before being captured by `slowQueryLogs`. Default is `10` seconds.
     */
    longQueryTime?: pulumi.Input<number>;
    /**
     * The size of the largest message, in bytes, that can be received by the server. Default is `67108864` (64M).
     */
    maxAllowedPacket?: pulumi.Input<number>;
    /**
     * The maximum size, in bytes, of internal in-memory tables. Also set `tmpTableSize`. Default is `16777216` (16M)
     */
    maxHeapTableSize?: pulumi.Input<number>;
    /**
     * The time, in seconds, to wait for more data from an existing connection. aborting the read.
     */
    netReadTimeout?: pulumi.Input<number>;
    /**
     * The number of seconds to wait for a block to be written to a connection before aborting the write.
     */
    netWriteTimeout?: pulumi.Input<number>;
    /**
     * When enabled, captures slow queries. When disabled, also truncates the mysql.slow_log table. Default is false.
     */
    slowQueryLog?: pulumi.Input<boolean>;
    /**
     * The sort buffer size, in bytes, for `ORDER BY` optimization. Default is `262144`. (256K).
     */
    sortBufferSize?: pulumi.Input<number>;
    /**
     * Global SQL mode. If empty, uses MySQL server defaults. Must only include uppercase alphabetic characters, underscores, and commas.
     */
    sqlMode?: pulumi.Input<string>;
    /**
     * Require primary key to be defined for new tables or old tables modified with ALTER TABLE and fail if missing. It is recommended to always have primary keys because various functionality may break if any large table is missing them.
     */
    sqlRequirePrimaryKey?: pulumi.Input<boolean>;
    /**
     * The maximum size, in bytes, of internal in-memory tables. Also set `maxHeapTableSize`. Default is `16777216` (16M).
     */
    tmpTableSize?: pulumi.Input<number>;
    /**
     * The number of seconds the server waits for activity on a noninteractive connection before closing it.
     */
    waitTimeout?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a DatabaseMysqlConfig resource.
 */
export interface DatabaseMysqlConfigArgs {
    /**
     * The hour of day (in UTC) when backup for the service starts. New backup only starts if previous backup has already completed.
     */
    backupHour?: pulumi.Input<number>;
    /**
     * The minute of the backup hour when backup for the service starts. New backup only starts if previous backup has already completed.
     */
    backupMinute?: pulumi.Input<number>;
    /**
     * The minimum amount of time, in seconds, to keep binlog entries before deletion. This may be extended for services that require binlog entries for longer than the default, for example if using the MySQL Debezium Kafka connector.
     */
    binlogRetentionPeriod?: pulumi.Input<number>;
    /**
     * The ID of the target MySQL cluster.
     */
    clusterId: pulumi.Input<string>;
    /**
     * The number of seconds that the mysqld server waits for a connect packet before responding with bad handshake.
     */
    connectTimeout?: pulumi.Input<number>;
    /**
     * Default server time zone, in the form of an offset from UTC (from -12:00 to +12:00), a time zone name (EST), or `SYSTEM` to use the MySQL server default.
     */
    defaultTimeZone?: pulumi.Input<string>;
    /**
     * The maximum permitted result length, in bytes, for the `GROUP_CONCAT()` function.
     */
    groupConcatMaxLen?: pulumi.Input<number>;
    /**
     * The time, in seconds, before cached statistics expire.
     */
    informationSchemaStatsExpiry?: pulumi.Input<number>;
    /**
     * The minimum length of words that an InnoDB FULLTEXT index stores.
     */
    innodbFtMinTokenSize?: pulumi.Input<number>;
    /**
     * The InnoDB FULLTEXT index stopword list for all InnoDB tables.
     */
    innodbFtServerStopwordTable?: pulumi.Input<string>;
    /**
     * The time, in seconds, that an InnoDB transaction waits for a row lock. before giving up.
     */
    innodbLockWaitTimeout?: pulumi.Input<number>;
    /**
     * The size of the buffer, in bytes, that InnoDB uses to write to the log files. on disk.
     */
    innodbLogBufferSize?: pulumi.Input<number>;
    /**
     * The upper limit, in bytes, of the size of the temporary log files used during online DDL operations for InnoDB tables.
     */
    innodbOnlineAlterLogMaxSize?: pulumi.Input<number>;
    /**
     * When enabled, records information about all deadlocks in InnoDB user transactions in the error log. Disabled by default.
     */
    innodbPrintAllDeadlocks?: pulumi.Input<boolean>;
    /**
     * When enabled, transaction timeouts cause InnoDB to abort and roll back the entire transaction.
     */
    innodbRollbackOnTimeout?: pulumi.Input<boolean>;
    /**
     * The time, in seconds, the server waits for activity on an interactive. connection before closing it.
     */
    interactiveTimeout?: pulumi.Input<number>;
    /**
     * The storage engine for in-memory internal temporary tables. Supported values are: `TempTable`, `MEMORY`.
     */
    internalTmpMemStorageEngine?: pulumi.Input<string>;
    /**
     * The time, in seconds, for a query to take to execute before being captured by `slowQueryLogs`. Default is `10` seconds.
     */
    longQueryTime?: pulumi.Input<number>;
    /**
     * The size of the largest message, in bytes, that can be received by the server. Default is `67108864` (64M).
     */
    maxAllowedPacket?: pulumi.Input<number>;
    /**
     * The maximum size, in bytes, of internal in-memory tables. Also set `tmpTableSize`. Default is `16777216` (16M)
     */
    maxHeapTableSize?: pulumi.Input<number>;
    /**
     * The time, in seconds, to wait for more data from an existing connection. aborting the read.
     */
    netReadTimeout?: pulumi.Input<number>;
    /**
     * The number of seconds to wait for a block to be written to a connection before aborting the write.
     */
    netWriteTimeout?: pulumi.Input<number>;
    /**
     * When enabled, captures slow queries. When disabled, also truncates the mysql.slow_log table. Default is false.
     */
    slowQueryLog?: pulumi.Input<boolean>;
    /**
     * The sort buffer size, in bytes, for `ORDER BY` optimization. Default is `262144`. (256K).
     */
    sortBufferSize?: pulumi.Input<number>;
    /**
     * Global SQL mode. If empty, uses MySQL server defaults. Must only include uppercase alphabetic characters, underscores, and commas.
     */
    sqlMode?: pulumi.Input<string>;
    /**
     * Require primary key to be defined for new tables or old tables modified with ALTER TABLE and fail if missing. It is recommended to always have primary keys because various functionality may break if any large table is missing them.
     */
    sqlRequirePrimaryKey?: pulumi.Input<boolean>;
    /**
     * The maximum size, in bytes, of internal in-memory tables. Also set `maxHeapTableSize`. Default is `16777216` (16M).
     */
    tmpTableSize?: pulumi.Input<number>;
    /**
     * The number of seconds the server waits for activity on a noninteractive connection before closing it.
     */
    waitTimeout?: pulumi.Input<number>;
}
