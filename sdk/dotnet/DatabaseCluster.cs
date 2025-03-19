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
    /// Provides a DigitalOcean database cluster resource.
    /// 
    /// ## Example Usage
    /// 
    /// ### Create a new PostgreSQL database cluster
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using DigitalOcean = Pulumi.DigitalOcean;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var postgres_example = new DigitalOcean.DatabaseCluster("postgres-example", new()
    ///     {
    ///         Name = "example-postgres-cluster",
    ///         Engine = "pg",
    ///         Version = "15",
    ///         Size = DigitalOcean.DatabaseSlug.DB_1VPCU1GB,
    ///         Region = DigitalOcean.Region.NYC1,
    ///         NodeCount = 1,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### Create a new MySQL database cluster
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using DigitalOcean = Pulumi.DigitalOcean;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var mysql_example = new DigitalOcean.DatabaseCluster("mysql-example", new()
    ///     {
    ///         Name = "example-mysql-cluster",
    ///         Engine = "mysql",
    ///         Version = "8",
    ///         Size = DigitalOcean.DatabaseSlug.DB_1VPCU1GB,
    ///         Region = DigitalOcean.Region.NYC1,
    ///         NodeCount = 1,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### Create a new Redis database cluster
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using DigitalOcean = Pulumi.DigitalOcean;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var redis_example = new DigitalOcean.DatabaseCluster("redis-example", new()
    ///     {
    ///         Name = "example-redis-cluster",
    ///         Engine = "redis",
    ///         Version = "7",
    ///         Size = DigitalOcean.DatabaseSlug.DB_1VPCU1GB,
    ///         Region = DigitalOcean.Region.NYC1,
    ///         NodeCount = 1,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### Create a new Kafka database cluster
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
    ///         Name = "example-kafka-cluster",
    ///         Engine = "kafka",
    ///         Version = "3.5",
    ///         Size = "db-s-2vcpu-2gb",
    ///         Region = DigitalOcean.Region.NYC1,
    ///         NodeCount = 3,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### Create a new MongoDB database cluster
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using DigitalOcean = Pulumi.DigitalOcean;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var mongodb_example = new DigitalOcean.DatabaseCluster("mongodb-example", new()
    ///     {
    ///         Name = "example-mongo-cluster",
    ///         Engine = "mongodb",
    ///         Version = "6",
    ///         Size = DigitalOcean.DatabaseSlug.DB_1VPCU1GB,
    ///         Region = DigitalOcean.Region.NYC3,
    ///         NodeCount = 1,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### Create a new OpenSearch database cluster
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using DigitalOcean = Pulumi.DigitalOcean;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var opensearch_example = new DigitalOcean.DatabaseCluster("opensearch-example", new()
    ///     {
    ///         Name = "example-opensearch-cluster",
    ///         Engine = "opensearch",
    ///         Version = "2",
    ///         Size = DigitalOcean.DatabaseSlug.DB_1VPCU2GB,
    ///         Region = DigitalOcean.Region.NYC3,
    ///         NodeCount = 1,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Create a new database cluster based on a backup of an existing cluster.
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using DigitalOcean = Pulumi.DigitalOcean;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var doby = new DigitalOcean.DatabaseCluster("doby", new()
    ///     {
    ///         Name = "dobydb",
    ///         Engine = "pg",
    ///         Version = "15",
    ///         Size = DigitalOcean.DatabaseSlug.DB_1VPCU2GB,
    ///         Region = DigitalOcean.Region.NYC1,
    ///         NodeCount = 1,
    ///         Tags = new[]
    ///         {
    ///             "production",
    ///         },
    ///     });
    /// 
    ///     var dobyBackup = new DigitalOcean.DatabaseCluster("doby_backup", new()
    ///     {
    ///         Name = "dobydupe",
    ///         Engine = "pg",
    ///         Version = "15",
    ///         Size = DigitalOcean.DatabaseSlug.DB_1VPCU2GB,
    ///         Region = DigitalOcean.Region.NYC1,
    ///         NodeCount = 1,
    ///         Tags = new[]
    ///         {
    ///             "production",
    ///         },
    ///         BackupRestore = new DigitalOcean.Inputs.DatabaseClusterBackupRestoreArgs
    ///         {
    ///             DatabaseName = "dobydb",
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             doby,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Database clusters can be imported using the `id` returned from DigitalOcean, e.g.
    /// 
    /// ```sh
    /// $ pulumi import digitalocean:index/databaseCluster:DatabaseCluster mycluster 245bcfd0-7f31-4ce6-a2bc-475a116cca97
    /// ```
    /// </summary>
    [DigitalOceanResourceType("digitalocean:index/databaseCluster:DatabaseCluster")]
    public partial class DatabaseCluster : global::Pulumi.CustomResource
    {
        [Output("backupRestore")]
        public Output<Outputs.DatabaseClusterBackupRestore?> BackupRestore { get; private set; } = null!;

        /// <summary>
        /// The uniform resource name of the database cluster.
        /// </summary>
        [Output("clusterUrn")]
        public Output<string> ClusterUrn { get; private set; } = null!;

        /// <summary>
        /// Name of the cluster's default database.
        /// </summary>
        [Output("database")]
        public Output<string> Database { get; private set; } = null!;

        /// <summary>
        /// Database engine used by the cluster (ex. `pg` for PostgreSQL, `mysql` for MySQL, `redis` for Redis, `mongodb` for MongoDB, or `kafka` for Kafka).
        /// </summary>
        [Output("engine")]
        public Output<string> Engine { get; private set; } = null!;

        /// <summary>
        /// A string specifying the eviction policy for a Redis cluster. Valid values are: `noeviction`, `allkeys_lru`, `allkeys_random`, `volatile_lru`, `volatile_random`, or `volatile_ttl`.
        /// </summary>
        [Output("evictionPolicy")]
        public Output<string?> EvictionPolicy { get; private set; } = null!;

        /// <summary>
        /// Database cluster's hostname.
        /// </summary>
        [Output("host")]
        public Output<string> Host { get; private set; } = null!;

        /// <summary>
        /// Defines when the automatic maintenance should be performed for the database cluster.
        /// </summary>
        [Output("maintenanceWindows")]
        public Output<ImmutableArray<Outputs.DatabaseClusterMaintenanceWindow>> MaintenanceWindows { get; private set; } = null!;

        /// <summary>
        /// The name of the database cluster.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Number of nodes that will be included in the cluster. For `kafka` clusters, this must be 3.
        /// </summary>
        [Output("nodeCount")]
        public Output<int> NodeCount { get; private set; } = null!;

        /// <summary>
        /// Password for the cluster's default user.
        /// </summary>
        [Output("password")]
        public Output<string> Password { get; private set; } = null!;

        /// <summary>
        /// Network port that the database cluster is listening on.
        /// </summary>
        [Output("port")]
        public Output<int> Port { get; private set; } = null!;

        /// <summary>
        /// Same as `host`, but only accessible from resources within the account and in the same region.
        /// </summary>
        [Output("privateHost")]
        public Output<string> PrivateHost { get; private set; } = null!;

        /// <summary>
        /// The ID of the VPC where the database cluster will be located.
        /// </summary>
        [Output("privateNetworkUuid")]
        public Output<string> PrivateNetworkUuid { get; private set; } = null!;

        /// <summary>
        /// Same as `uri`, but only accessible from resources within the account and in the same region.
        /// </summary>
        [Output("privateUri")]
        public Output<string> PrivateUri { get; private set; } = null!;

        /// <summary>
        /// The ID of the project that the database cluster is assigned to. If excluded when creating a new database cluster, it will be assigned to your default project.
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// DigitalOcean region where the cluster will reside.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// Database Droplet size associated with the cluster (ex. `db-s-1vcpu-1gb`). See the DigitalOcean API for a [list of valid size slugs](https://docs.digitalocean.com/reference/api/digitalocean/#tag/Databases/operation/databases_list_options).
        /// </summary>
        [Output("size")]
        public Output<string> Size { get; private set; } = null!;

        /// <summary>
        /// A comma separated string specifying the  SQL modes for a MySQL cluster.
        /// </summary>
        [Output("sqlMode")]
        public Output<string?> SqlMode { get; private set; } = null!;

        /// <summary>
        /// Defines the disk size, in MiB, allocated to the cluster. This can be adjusted on MySQL and PostgreSQL clusters based on predefined ranges for each slug/droplet size.
        /// </summary>
        [Output("storageSizeMib")]
        public Output<string> StorageSizeMib { get; private set; } = null!;

        /// <summary>
        /// A list of tag names to be applied to the database cluster.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;

        /// <summary>
        /// Name of the OpenSearch dashboard db.
        /// </summary>
        [Output("uiDatabase")]
        public Output<string> UiDatabase { get; private set; } = null!;

        /// <summary>
        /// Hostname for the OpenSearch dashboard.
        /// </summary>
        [Output("uiHost")]
        public Output<string> UiHost { get; private set; } = null!;

        /// <summary>
        /// Password for the OpenSearch dashboard's default user.
        /// </summary>
        [Output("uiPassword")]
        public Output<string> UiPassword { get; private set; } = null!;

        /// <summary>
        /// Network port that the OpenSearch dashboard is listening on.
        /// </summary>
        [Output("uiPort")]
        public Output<int> UiPort { get; private set; } = null!;

        /// <summary>
        /// The full URI for connecting to the OpenSearch dashboard.
        /// </summary>
        [Output("uiUri")]
        public Output<string> UiUri { get; private set; } = null!;

        /// <summary>
        /// Username for OpenSearch dashboard's default user.
        /// </summary>
        [Output("uiUser")]
        public Output<string> UiUser { get; private set; } = null!;

        /// <summary>
        /// The full URI for connecting to the database cluster.
        /// </summary>
        [Output("uri")]
        public Output<string> Uri { get; private set; } = null!;

        /// <summary>
        /// Username for the cluster's default user.
        /// </summary>
        [Output("user")]
        public Output<string> User { get; private set; } = null!;

        /// <summary>
        /// Engine version used by the cluster (ex. `14` for PostgreSQL 14).
        /// When this value is changed, a call to the [Upgrade major Version for a Database](https://docs.digitalocean.com/reference/api/digitalocean/#tag/Databases/operation/databases_update_major_version) API operation is made with the new version.
        /// </summary>
        [Output("version")]
        public Output<string?> Version { get; private set; } = null!;


        /// <summary>
        /// Create a DatabaseCluster resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DatabaseCluster(string name, DatabaseClusterArgs args, CustomResourceOptions? options = null)
            : base("digitalocean:index/databaseCluster:DatabaseCluster", name, args ?? new DatabaseClusterArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DatabaseCluster(string name, Input<string> id, DatabaseClusterState? state = null, CustomResourceOptions? options = null)
            : base("digitalocean:index/databaseCluster:DatabaseCluster", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "password",
                    "privateUri",
                    "uiPassword",
                    "uiUri",
                    "uri",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing DatabaseCluster resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DatabaseCluster Get(string name, Input<string> id, DatabaseClusterState? state = null, CustomResourceOptions? options = null)
        {
            return new DatabaseCluster(name, id, state, options);
        }
    }

    public sealed class DatabaseClusterArgs : global::Pulumi.ResourceArgs
    {
        [Input("backupRestore")]
        public Input<Inputs.DatabaseClusterBackupRestoreArgs>? BackupRestore { get; set; }

        /// <summary>
        /// Database engine used by the cluster (ex. `pg` for PostgreSQL, `mysql` for MySQL, `redis` for Redis, `mongodb` for MongoDB, or `kafka` for Kafka).
        /// </summary>
        [Input("engine", required: true)]
        public Input<string> Engine { get; set; } = null!;

        /// <summary>
        /// A string specifying the eviction policy for a Redis cluster. Valid values are: `noeviction`, `allkeys_lru`, `allkeys_random`, `volatile_lru`, `volatile_random`, or `volatile_ttl`.
        /// </summary>
        [Input("evictionPolicy")]
        public Input<string>? EvictionPolicy { get; set; }

        [Input("maintenanceWindows")]
        private InputList<Inputs.DatabaseClusterMaintenanceWindowArgs>? _maintenanceWindows;

        /// <summary>
        /// Defines when the automatic maintenance should be performed for the database cluster.
        /// </summary>
        public InputList<Inputs.DatabaseClusterMaintenanceWindowArgs> MaintenanceWindows
        {
            get => _maintenanceWindows ?? (_maintenanceWindows = new InputList<Inputs.DatabaseClusterMaintenanceWindowArgs>());
            set => _maintenanceWindows = value;
        }

        /// <summary>
        /// The name of the database cluster.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Number of nodes that will be included in the cluster. For `kafka` clusters, this must be 3.
        /// </summary>
        [Input("nodeCount", required: true)]
        public Input<int> NodeCount { get; set; } = null!;

        /// <summary>
        /// The ID of the VPC where the database cluster will be located.
        /// </summary>
        [Input("privateNetworkUuid")]
        public Input<string>? PrivateNetworkUuid { get; set; }

        /// <summary>
        /// The ID of the project that the database cluster is assigned to. If excluded when creating a new database cluster, it will be assigned to your default project.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// DigitalOcean region where the cluster will reside.
        /// </summary>
        [Input("region", required: true)]
        public InputUnion<string, Pulumi.DigitalOcean.Region> Region { get; set; } = null!;

        /// <summary>
        /// Database Droplet size associated with the cluster (ex. `db-s-1vcpu-1gb`). See the DigitalOcean API for a [list of valid size slugs](https://docs.digitalocean.com/reference/api/digitalocean/#tag/Databases/operation/databases_list_options).
        /// </summary>
        [Input("size", required: true)]
        public InputUnion<string, Pulumi.DigitalOcean.DatabaseSlug> Size { get; set; } = null!;

        /// <summary>
        /// A comma separated string specifying the  SQL modes for a MySQL cluster.
        /// </summary>
        [Input("sqlMode")]
        public Input<string>? SqlMode { get; set; }

        /// <summary>
        /// Defines the disk size, in MiB, allocated to the cluster. This can be adjusted on MySQL and PostgreSQL clusters based on predefined ranges for each slug/droplet size.
        /// </summary>
        [Input("storageSizeMib")]
        public Input<string>? StorageSizeMib { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// A list of tag names to be applied to the database cluster.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Engine version used by the cluster (ex. `14` for PostgreSQL 14).
        /// When this value is changed, a call to the [Upgrade major Version for a Database](https://docs.digitalocean.com/reference/api/digitalocean/#tag/Databases/operation/databases_update_major_version) API operation is made with the new version.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public DatabaseClusterArgs()
        {
        }
        public static new DatabaseClusterArgs Empty => new DatabaseClusterArgs();
    }

    public sealed class DatabaseClusterState : global::Pulumi.ResourceArgs
    {
        [Input("backupRestore")]
        public Input<Inputs.DatabaseClusterBackupRestoreGetArgs>? BackupRestore { get; set; }

        /// <summary>
        /// The uniform resource name of the database cluster.
        /// </summary>
        [Input("clusterUrn")]
        public Input<string>? ClusterUrn { get; set; }

        /// <summary>
        /// Name of the cluster's default database.
        /// </summary>
        [Input("database")]
        public Input<string>? Database { get; set; }

        /// <summary>
        /// Database engine used by the cluster (ex. `pg` for PostgreSQL, `mysql` for MySQL, `redis` for Redis, `mongodb` for MongoDB, or `kafka` for Kafka).
        /// </summary>
        [Input("engine")]
        public Input<string>? Engine { get; set; }

        /// <summary>
        /// A string specifying the eviction policy for a Redis cluster. Valid values are: `noeviction`, `allkeys_lru`, `allkeys_random`, `volatile_lru`, `volatile_random`, or `volatile_ttl`.
        /// </summary>
        [Input("evictionPolicy")]
        public Input<string>? EvictionPolicy { get; set; }

        /// <summary>
        /// Database cluster's hostname.
        /// </summary>
        [Input("host")]
        public Input<string>? Host { get; set; }

        [Input("maintenanceWindows")]
        private InputList<Inputs.DatabaseClusterMaintenanceWindowGetArgs>? _maintenanceWindows;

        /// <summary>
        /// Defines when the automatic maintenance should be performed for the database cluster.
        /// </summary>
        public InputList<Inputs.DatabaseClusterMaintenanceWindowGetArgs> MaintenanceWindows
        {
            get => _maintenanceWindows ?? (_maintenanceWindows = new InputList<Inputs.DatabaseClusterMaintenanceWindowGetArgs>());
            set => _maintenanceWindows = value;
        }

        /// <summary>
        /// The name of the database cluster.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Number of nodes that will be included in the cluster. For `kafka` clusters, this must be 3.
        /// </summary>
        [Input("nodeCount")]
        public Input<int>? NodeCount { get; set; }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// Password for the cluster's default user.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Network port that the database cluster is listening on.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// Same as `host`, but only accessible from resources within the account and in the same region.
        /// </summary>
        [Input("privateHost")]
        public Input<string>? PrivateHost { get; set; }

        /// <summary>
        /// The ID of the VPC where the database cluster will be located.
        /// </summary>
        [Input("privateNetworkUuid")]
        public Input<string>? PrivateNetworkUuid { get; set; }

        [Input("privateUri")]
        private Input<string>? _privateUri;

        /// <summary>
        /// Same as `uri`, but only accessible from resources within the account and in the same region.
        /// </summary>
        public Input<string>? PrivateUri
        {
            get => _privateUri;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _privateUri = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The ID of the project that the database cluster is assigned to. If excluded when creating a new database cluster, it will be assigned to your default project.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// DigitalOcean region where the cluster will reside.
        /// </summary>
        [Input("region")]
        public InputUnion<string, Pulumi.DigitalOcean.Region>? Region { get; set; }

        /// <summary>
        /// Database Droplet size associated with the cluster (ex. `db-s-1vcpu-1gb`). See the DigitalOcean API for a [list of valid size slugs](https://docs.digitalocean.com/reference/api/digitalocean/#tag/Databases/operation/databases_list_options).
        /// </summary>
        [Input("size")]
        public InputUnion<string, Pulumi.DigitalOcean.DatabaseSlug>? Size { get; set; }

        /// <summary>
        /// A comma separated string specifying the  SQL modes for a MySQL cluster.
        /// </summary>
        [Input("sqlMode")]
        public Input<string>? SqlMode { get; set; }

        /// <summary>
        /// Defines the disk size, in MiB, allocated to the cluster. This can be adjusted on MySQL and PostgreSQL clusters based on predefined ranges for each slug/droplet size.
        /// </summary>
        [Input("storageSizeMib")]
        public Input<string>? StorageSizeMib { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// A list of tag names to be applied to the database cluster.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Name of the OpenSearch dashboard db.
        /// </summary>
        [Input("uiDatabase")]
        public Input<string>? UiDatabase { get; set; }

        /// <summary>
        /// Hostname for the OpenSearch dashboard.
        /// </summary>
        [Input("uiHost")]
        public Input<string>? UiHost { get; set; }

        [Input("uiPassword")]
        private Input<string>? _uiPassword;

        /// <summary>
        /// Password for the OpenSearch dashboard's default user.
        /// </summary>
        public Input<string>? UiPassword
        {
            get => _uiPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _uiPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Network port that the OpenSearch dashboard is listening on.
        /// </summary>
        [Input("uiPort")]
        public Input<int>? UiPort { get; set; }

        [Input("uiUri")]
        private Input<string>? _uiUri;

        /// <summary>
        /// The full URI for connecting to the OpenSearch dashboard.
        /// </summary>
        public Input<string>? UiUri
        {
            get => _uiUri;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _uiUri = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Username for OpenSearch dashboard's default user.
        /// </summary>
        [Input("uiUser")]
        public Input<string>? UiUser { get; set; }

        [Input("uri")]
        private Input<string>? _uri;

        /// <summary>
        /// The full URI for connecting to the database cluster.
        /// </summary>
        public Input<string>? Uri
        {
            get => _uri;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _uri = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Username for the cluster's default user.
        /// </summary>
        [Input("user")]
        public Input<string>? User { get; set; }

        /// <summary>
        /// Engine version used by the cluster (ex. `14` for PostgreSQL 14).
        /// When this value is changed, a call to the [Upgrade major Version for a Database](https://docs.digitalocean.com/reference/api/digitalocean/#tag/Databases/operation/databases_update_major_version) API operation is made with the new version.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public DatabaseClusterState()
        {
        }
        public static new DatabaseClusterState Empty => new DatabaseClusterState();
    }
}
