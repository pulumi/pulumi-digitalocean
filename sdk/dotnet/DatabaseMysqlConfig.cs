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
    /// Provides a virtual resource that can be used to change advanced configuration
    /// options for a DigitalOcean managed MySQL database cluster.
    /// 
    /// &gt; **Note** MySQL configurations are only removed from state when destroyed. The remote configuration is not unset.
    /// 
    /// ## Example Usage
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using DigitalOcean = Pulumi.DigitalOcean;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var exampleDatabaseCluster = new DigitalOcean.DatabaseCluster("exampleDatabaseCluster", new()
    ///     {
    ///         Engine = "mysql",
    ///         Version = "8",
    ///         Size = "db-s-1vcpu-1gb",
    ///         Region = "nyc1",
    ///         NodeCount = 1,
    ///     });
    /// 
    ///     var exampleDatabaseMysqlConfig = new DigitalOcean.DatabaseMysqlConfig("exampleDatabaseMysqlConfig", new()
    ///     {
    ///         ClusterId = exampleDatabaseCluster.Id,
    ///         ConnectTimeout = 10,
    ///         DefaultTimeZone = "UTC",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// A MySQL database cluster's configuration can be imported using the `id` the parent cluster, e.g.
    /// 
    /// ```sh
    /// $ pulumi import digitalocean:index/databaseMysqlConfig:DatabaseMysqlConfig example 4b62829a-9c42-465b-aaa3-84051048e712
    /// ```
    /// </summary>
    [DigitalOceanResourceType("digitalocean:index/databaseMysqlConfig:DatabaseMysqlConfig")]
    public partial class DatabaseMysqlConfig : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The hour of day (in UTC) when backup for the service starts. New backup only starts if previous backup has already completed.
        /// </summary>
        [Output("backupHour")]
        public Output<int> BackupHour { get; private set; } = null!;

        /// <summary>
        /// The minute of the backup hour when backup for the service starts. New backup only starts if previous backup has already completed.
        /// </summary>
        [Output("backupMinute")]
        public Output<int> BackupMinute { get; private set; } = null!;

        /// <summary>
        /// The minimum amount of time, in seconds, to keep binlog entries before deletion. This may be extended for services that require binlog entries for longer than the default, for example if using the MySQL Debezium Kafka connector.
        /// </summary>
        [Output("binlogRetentionPeriod")]
        public Output<int> BinlogRetentionPeriod { get; private set; } = null!;

        /// <summary>
        /// The ID of the target MySQL cluster.
        /// </summary>
        [Output("clusterId")]
        public Output<string> ClusterId { get; private set; } = null!;

        /// <summary>
        /// The number of seconds that the mysqld server waits for a connect packet before responding with bad handshake.
        /// </summary>
        [Output("connectTimeout")]
        public Output<int> ConnectTimeout { get; private set; } = null!;

        /// <summary>
        /// Default server time zone, in the form of an offset from UTC (from -12:00 to +12:00), a time zone name (EST), or `SYSTEM` to use the MySQL server default.
        /// </summary>
        [Output("defaultTimeZone")]
        public Output<string> DefaultTimeZone { get; private set; } = null!;

        /// <summary>
        /// The maximum permitted result length, in bytes, for the `GROUP_CONCAT()` function.
        /// </summary>
        [Output("groupConcatMaxLen")]
        public Output<int> GroupConcatMaxLen { get; private set; } = null!;

        /// <summary>
        /// The time, in seconds, before cached statistics expire.
        /// </summary>
        [Output("informationSchemaStatsExpiry")]
        public Output<int> InformationSchemaStatsExpiry { get; private set; } = null!;

        /// <summary>
        /// The minimum length of words that an InnoDB FULLTEXT index stores.
        /// </summary>
        [Output("innodbFtMinTokenSize")]
        public Output<int> InnodbFtMinTokenSize { get; private set; } = null!;

        /// <summary>
        /// The InnoDB FULLTEXT index stopword list for all InnoDB tables.
        /// </summary>
        [Output("innodbFtServerStopwordTable")]
        public Output<string> InnodbFtServerStopwordTable { get; private set; } = null!;

        /// <summary>
        /// The time, in seconds, that an InnoDB transaction waits for a row lock. before giving up.
        /// </summary>
        [Output("innodbLockWaitTimeout")]
        public Output<int> InnodbLockWaitTimeout { get; private set; } = null!;

        /// <summary>
        /// The size of the buffer, in bytes, that InnoDB uses to write to the log files. on disk.
        /// </summary>
        [Output("innodbLogBufferSize")]
        public Output<int> InnodbLogBufferSize { get; private set; } = null!;

        /// <summary>
        /// The upper limit, in bytes, of the size of the temporary log files used during online DDL operations for InnoDB tables.
        /// </summary>
        [Output("innodbOnlineAlterLogMaxSize")]
        public Output<int> InnodbOnlineAlterLogMaxSize { get; private set; } = null!;

        /// <summary>
        /// When enabled, records information about all deadlocks in InnoDB user transactions in the error log. Disabled by default.
        /// </summary>
        [Output("innodbPrintAllDeadlocks")]
        public Output<bool> InnodbPrintAllDeadlocks { get; private set; } = null!;

        /// <summary>
        /// When enabled, transaction timeouts cause InnoDB to abort and roll back the entire transaction.
        /// </summary>
        [Output("innodbRollbackOnTimeout")]
        public Output<bool> InnodbRollbackOnTimeout { get; private set; } = null!;

        /// <summary>
        /// The time, in seconds, the server waits for activity on an interactive. connection before closing it.
        /// </summary>
        [Output("interactiveTimeout")]
        public Output<int> InteractiveTimeout { get; private set; } = null!;

        /// <summary>
        /// The storage engine for in-memory internal temporary tables. Supported values are: `TempTable`, `MEMORY`.
        /// </summary>
        [Output("internalTmpMemStorageEngine")]
        public Output<string> InternalTmpMemStorageEngine { get; private set; } = null!;

        /// <summary>
        /// The time, in seconds, for a query to take to execute before being captured by `slow_query_logs`. Default is `10` seconds.
        /// </summary>
        [Output("longQueryTime")]
        public Output<double> LongQueryTime { get; private set; } = null!;

        /// <summary>
        /// The size of the largest message, in bytes, that can be received by the server. Default is `67108864` (64M).
        /// </summary>
        [Output("maxAllowedPacket")]
        public Output<int> MaxAllowedPacket { get; private set; } = null!;

        /// <summary>
        /// The maximum size, in bytes, of internal in-memory tables. Also set `tmp_table_size`. Default is `16777216` (16M)
        /// </summary>
        [Output("maxHeapTableSize")]
        public Output<int> MaxHeapTableSize { get; private set; } = null!;

        /// <summary>
        /// The time, in seconds, to wait for more data from an existing connection. aborting the read.
        /// </summary>
        [Output("netReadTimeout")]
        public Output<int> NetReadTimeout { get; private set; } = null!;

        /// <summary>
        /// The number of seconds to wait for a block to be written to a connection before aborting the write.
        /// </summary>
        [Output("netWriteTimeout")]
        public Output<int> NetWriteTimeout { get; private set; } = null!;

        /// <summary>
        /// When enabled, captures slow queries. When disabled, also truncates the mysql.slow_log table. Default is false.
        /// </summary>
        [Output("slowQueryLog")]
        public Output<bool> SlowQueryLog { get; private set; } = null!;

        /// <summary>
        /// The sort buffer size, in bytes, for `ORDER BY` optimization. Default is `262144`. (256K).
        /// </summary>
        [Output("sortBufferSize")]
        public Output<int> SortBufferSize { get; private set; } = null!;

        /// <summary>
        /// Global SQL mode. If empty, uses MySQL server defaults. Must only include uppercase alphabetic characters, underscores, and commas.
        /// </summary>
        [Output("sqlMode")]
        public Output<string> SqlMode { get; private set; } = null!;

        /// <summary>
        /// Require primary key to be defined for new tables or old tables modified with ALTER TABLE and fail if missing. It is recommended to always have primary keys because various functionality may break if any large table is missing them.
        /// </summary>
        [Output("sqlRequirePrimaryKey")]
        public Output<bool> SqlRequirePrimaryKey { get; private set; } = null!;

        /// <summary>
        /// The maximum size, in bytes, of internal in-memory tables. Also set `max_heap_table_size`. Default is `16777216` (16M).
        /// </summary>
        [Output("tmpTableSize")]
        public Output<int> TmpTableSize { get; private set; } = null!;

        /// <summary>
        /// The number of seconds the server waits for activity on a noninteractive connection before closing it.
        /// </summary>
        [Output("waitTimeout")]
        public Output<int> WaitTimeout { get; private set; } = null!;


        /// <summary>
        /// Create a DatabaseMysqlConfig resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DatabaseMysqlConfig(string name, DatabaseMysqlConfigArgs args, CustomResourceOptions? options = null)
            : base("digitalocean:index/databaseMysqlConfig:DatabaseMysqlConfig", name, args ?? new DatabaseMysqlConfigArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DatabaseMysqlConfig(string name, Input<string> id, DatabaseMysqlConfigState? state = null, CustomResourceOptions? options = null)
            : base("digitalocean:index/databaseMysqlConfig:DatabaseMysqlConfig", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DatabaseMysqlConfig resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DatabaseMysqlConfig Get(string name, Input<string> id, DatabaseMysqlConfigState? state = null, CustomResourceOptions? options = null)
        {
            return new DatabaseMysqlConfig(name, id, state, options);
        }
    }

    public sealed class DatabaseMysqlConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The hour of day (in UTC) when backup for the service starts. New backup only starts if previous backup has already completed.
        /// </summary>
        [Input("backupHour")]
        public Input<int>? BackupHour { get; set; }

        /// <summary>
        /// The minute of the backup hour when backup for the service starts. New backup only starts if previous backup has already completed.
        /// </summary>
        [Input("backupMinute")]
        public Input<int>? BackupMinute { get; set; }

        /// <summary>
        /// The minimum amount of time, in seconds, to keep binlog entries before deletion. This may be extended for services that require binlog entries for longer than the default, for example if using the MySQL Debezium Kafka connector.
        /// </summary>
        [Input("binlogRetentionPeriod")]
        public Input<int>? BinlogRetentionPeriod { get; set; }

        /// <summary>
        /// The ID of the target MySQL cluster.
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        /// <summary>
        /// The number of seconds that the mysqld server waits for a connect packet before responding with bad handshake.
        /// </summary>
        [Input("connectTimeout")]
        public Input<int>? ConnectTimeout { get; set; }

        /// <summary>
        /// Default server time zone, in the form of an offset from UTC (from -12:00 to +12:00), a time zone name (EST), or `SYSTEM` to use the MySQL server default.
        /// </summary>
        [Input("defaultTimeZone")]
        public Input<string>? DefaultTimeZone { get; set; }

        /// <summary>
        /// The maximum permitted result length, in bytes, for the `GROUP_CONCAT()` function.
        /// </summary>
        [Input("groupConcatMaxLen")]
        public Input<int>? GroupConcatMaxLen { get; set; }

        /// <summary>
        /// The time, in seconds, before cached statistics expire.
        /// </summary>
        [Input("informationSchemaStatsExpiry")]
        public Input<int>? InformationSchemaStatsExpiry { get; set; }

        /// <summary>
        /// The minimum length of words that an InnoDB FULLTEXT index stores.
        /// </summary>
        [Input("innodbFtMinTokenSize")]
        public Input<int>? InnodbFtMinTokenSize { get; set; }

        /// <summary>
        /// The InnoDB FULLTEXT index stopword list for all InnoDB tables.
        /// </summary>
        [Input("innodbFtServerStopwordTable")]
        public Input<string>? InnodbFtServerStopwordTable { get; set; }

        /// <summary>
        /// The time, in seconds, that an InnoDB transaction waits for a row lock. before giving up.
        /// </summary>
        [Input("innodbLockWaitTimeout")]
        public Input<int>? InnodbLockWaitTimeout { get; set; }

        /// <summary>
        /// The size of the buffer, in bytes, that InnoDB uses to write to the log files. on disk.
        /// </summary>
        [Input("innodbLogBufferSize")]
        public Input<int>? InnodbLogBufferSize { get; set; }

        /// <summary>
        /// The upper limit, in bytes, of the size of the temporary log files used during online DDL operations for InnoDB tables.
        /// </summary>
        [Input("innodbOnlineAlterLogMaxSize")]
        public Input<int>? InnodbOnlineAlterLogMaxSize { get; set; }

        /// <summary>
        /// When enabled, records information about all deadlocks in InnoDB user transactions in the error log. Disabled by default.
        /// </summary>
        [Input("innodbPrintAllDeadlocks")]
        public Input<bool>? InnodbPrintAllDeadlocks { get; set; }

        /// <summary>
        /// When enabled, transaction timeouts cause InnoDB to abort and roll back the entire transaction.
        /// </summary>
        [Input("innodbRollbackOnTimeout")]
        public Input<bool>? InnodbRollbackOnTimeout { get; set; }

        /// <summary>
        /// The time, in seconds, the server waits for activity on an interactive. connection before closing it.
        /// </summary>
        [Input("interactiveTimeout")]
        public Input<int>? InteractiveTimeout { get; set; }

        /// <summary>
        /// The storage engine for in-memory internal temporary tables. Supported values are: `TempTable`, `MEMORY`.
        /// </summary>
        [Input("internalTmpMemStorageEngine")]
        public Input<string>? InternalTmpMemStorageEngine { get; set; }

        /// <summary>
        /// The time, in seconds, for a query to take to execute before being captured by `slow_query_logs`. Default is `10` seconds.
        /// </summary>
        [Input("longQueryTime")]
        public Input<double>? LongQueryTime { get; set; }

        /// <summary>
        /// The size of the largest message, in bytes, that can be received by the server. Default is `67108864` (64M).
        /// </summary>
        [Input("maxAllowedPacket")]
        public Input<int>? MaxAllowedPacket { get; set; }

        /// <summary>
        /// The maximum size, in bytes, of internal in-memory tables. Also set `tmp_table_size`. Default is `16777216` (16M)
        /// </summary>
        [Input("maxHeapTableSize")]
        public Input<int>? MaxHeapTableSize { get; set; }

        /// <summary>
        /// The time, in seconds, to wait for more data from an existing connection. aborting the read.
        /// </summary>
        [Input("netReadTimeout")]
        public Input<int>? NetReadTimeout { get; set; }

        /// <summary>
        /// The number of seconds to wait for a block to be written to a connection before aborting the write.
        /// </summary>
        [Input("netWriteTimeout")]
        public Input<int>? NetWriteTimeout { get; set; }

        /// <summary>
        /// When enabled, captures slow queries. When disabled, also truncates the mysql.slow_log table. Default is false.
        /// </summary>
        [Input("slowQueryLog")]
        public Input<bool>? SlowQueryLog { get; set; }

        /// <summary>
        /// The sort buffer size, in bytes, for `ORDER BY` optimization. Default is `262144`. (256K).
        /// </summary>
        [Input("sortBufferSize")]
        public Input<int>? SortBufferSize { get; set; }

        /// <summary>
        /// Global SQL mode. If empty, uses MySQL server defaults. Must only include uppercase alphabetic characters, underscores, and commas.
        /// </summary>
        [Input("sqlMode")]
        public Input<string>? SqlMode { get; set; }

        /// <summary>
        /// Require primary key to be defined for new tables or old tables modified with ALTER TABLE and fail if missing. It is recommended to always have primary keys because various functionality may break if any large table is missing them.
        /// </summary>
        [Input("sqlRequirePrimaryKey")]
        public Input<bool>? SqlRequirePrimaryKey { get; set; }

        /// <summary>
        /// The maximum size, in bytes, of internal in-memory tables. Also set `max_heap_table_size`. Default is `16777216` (16M).
        /// </summary>
        [Input("tmpTableSize")]
        public Input<int>? TmpTableSize { get; set; }

        /// <summary>
        /// The number of seconds the server waits for activity on a noninteractive connection before closing it.
        /// </summary>
        [Input("waitTimeout")]
        public Input<int>? WaitTimeout { get; set; }

        public DatabaseMysqlConfigArgs()
        {
        }
        public static new DatabaseMysqlConfigArgs Empty => new DatabaseMysqlConfigArgs();
    }

    public sealed class DatabaseMysqlConfigState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The hour of day (in UTC) when backup for the service starts. New backup only starts if previous backup has already completed.
        /// </summary>
        [Input("backupHour")]
        public Input<int>? BackupHour { get; set; }

        /// <summary>
        /// The minute of the backup hour when backup for the service starts. New backup only starts if previous backup has already completed.
        /// </summary>
        [Input("backupMinute")]
        public Input<int>? BackupMinute { get; set; }

        /// <summary>
        /// The minimum amount of time, in seconds, to keep binlog entries before deletion. This may be extended for services that require binlog entries for longer than the default, for example if using the MySQL Debezium Kafka connector.
        /// </summary>
        [Input("binlogRetentionPeriod")]
        public Input<int>? BinlogRetentionPeriod { get; set; }

        /// <summary>
        /// The ID of the target MySQL cluster.
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        /// <summary>
        /// The number of seconds that the mysqld server waits for a connect packet before responding with bad handshake.
        /// </summary>
        [Input("connectTimeout")]
        public Input<int>? ConnectTimeout { get; set; }

        /// <summary>
        /// Default server time zone, in the form of an offset from UTC (from -12:00 to +12:00), a time zone name (EST), or `SYSTEM` to use the MySQL server default.
        /// </summary>
        [Input("defaultTimeZone")]
        public Input<string>? DefaultTimeZone { get; set; }

        /// <summary>
        /// The maximum permitted result length, in bytes, for the `GROUP_CONCAT()` function.
        /// </summary>
        [Input("groupConcatMaxLen")]
        public Input<int>? GroupConcatMaxLen { get; set; }

        /// <summary>
        /// The time, in seconds, before cached statistics expire.
        /// </summary>
        [Input("informationSchemaStatsExpiry")]
        public Input<int>? InformationSchemaStatsExpiry { get; set; }

        /// <summary>
        /// The minimum length of words that an InnoDB FULLTEXT index stores.
        /// </summary>
        [Input("innodbFtMinTokenSize")]
        public Input<int>? InnodbFtMinTokenSize { get; set; }

        /// <summary>
        /// The InnoDB FULLTEXT index stopword list for all InnoDB tables.
        /// </summary>
        [Input("innodbFtServerStopwordTable")]
        public Input<string>? InnodbFtServerStopwordTable { get; set; }

        /// <summary>
        /// The time, in seconds, that an InnoDB transaction waits for a row lock. before giving up.
        /// </summary>
        [Input("innodbLockWaitTimeout")]
        public Input<int>? InnodbLockWaitTimeout { get; set; }

        /// <summary>
        /// The size of the buffer, in bytes, that InnoDB uses to write to the log files. on disk.
        /// </summary>
        [Input("innodbLogBufferSize")]
        public Input<int>? InnodbLogBufferSize { get; set; }

        /// <summary>
        /// The upper limit, in bytes, of the size of the temporary log files used during online DDL operations for InnoDB tables.
        /// </summary>
        [Input("innodbOnlineAlterLogMaxSize")]
        public Input<int>? InnodbOnlineAlterLogMaxSize { get; set; }

        /// <summary>
        /// When enabled, records information about all deadlocks in InnoDB user transactions in the error log. Disabled by default.
        /// </summary>
        [Input("innodbPrintAllDeadlocks")]
        public Input<bool>? InnodbPrintAllDeadlocks { get; set; }

        /// <summary>
        /// When enabled, transaction timeouts cause InnoDB to abort and roll back the entire transaction.
        /// </summary>
        [Input("innodbRollbackOnTimeout")]
        public Input<bool>? InnodbRollbackOnTimeout { get; set; }

        /// <summary>
        /// The time, in seconds, the server waits for activity on an interactive. connection before closing it.
        /// </summary>
        [Input("interactiveTimeout")]
        public Input<int>? InteractiveTimeout { get; set; }

        /// <summary>
        /// The storage engine for in-memory internal temporary tables. Supported values are: `TempTable`, `MEMORY`.
        /// </summary>
        [Input("internalTmpMemStorageEngine")]
        public Input<string>? InternalTmpMemStorageEngine { get; set; }

        /// <summary>
        /// The time, in seconds, for a query to take to execute before being captured by `slow_query_logs`. Default is `10` seconds.
        /// </summary>
        [Input("longQueryTime")]
        public Input<double>? LongQueryTime { get; set; }

        /// <summary>
        /// The size of the largest message, in bytes, that can be received by the server. Default is `67108864` (64M).
        /// </summary>
        [Input("maxAllowedPacket")]
        public Input<int>? MaxAllowedPacket { get; set; }

        /// <summary>
        /// The maximum size, in bytes, of internal in-memory tables. Also set `tmp_table_size`. Default is `16777216` (16M)
        /// </summary>
        [Input("maxHeapTableSize")]
        public Input<int>? MaxHeapTableSize { get; set; }

        /// <summary>
        /// The time, in seconds, to wait for more data from an existing connection. aborting the read.
        /// </summary>
        [Input("netReadTimeout")]
        public Input<int>? NetReadTimeout { get; set; }

        /// <summary>
        /// The number of seconds to wait for a block to be written to a connection before aborting the write.
        /// </summary>
        [Input("netWriteTimeout")]
        public Input<int>? NetWriteTimeout { get; set; }

        /// <summary>
        /// When enabled, captures slow queries. When disabled, also truncates the mysql.slow_log table. Default is false.
        /// </summary>
        [Input("slowQueryLog")]
        public Input<bool>? SlowQueryLog { get; set; }

        /// <summary>
        /// The sort buffer size, in bytes, for `ORDER BY` optimization. Default is `262144`. (256K).
        /// </summary>
        [Input("sortBufferSize")]
        public Input<int>? SortBufferSize { get; set; }

        /// <summary>
        /// Global SQL mode. If empty, uses MySQL server defaults. Must only include uppercase alphabetic characters, underscores, and commas.
        /// </summary>
        [Input("sqlMode")]
        public Input<string>? SqlMode { get; set; }

        /// <summary>
        /// Require primary key to be defined for new tables or old tables modified with ALTER TABLE and fail if missing. It is recommended to always have primary keys because various functionality may break if any large table is missing them.
        /// </summary>
        [Input("sqlRequirePrimaryKey")]
        public Input<bool>? SqlRequirePrimaryKey { get; set; }

        /// <summary>
        /// The maximum size, in bytes, of internal in-memory tables. Also set `max_heap_table_size`. Default is `16777216` (16M).
        /// </summary>
        [Input("tmpTableSize")]
        public Input<int>? TmpTableSize { get; set; }

        /// <summary>
        /// The number of seconds the server waits for activity on a noninteractive connection before closing it.
        /// </summary>
        [Input("waitTimeout")]
        public Input<int>? WaitTimeout { get; set; }

        public DatabaseMysqlConfigState()
        {
        }
        public static new DatabaseMysqlConfigState Empty => new DatabaseMysqlConfigState();
    }
}
