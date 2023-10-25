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
    /// Provides a DigitalOcean database connection pool resource.
    /// 
    /// ## Example Usage
    /// ### Create a new PostgreSQL database connection pool
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
    ///         Engine = "pg",
    ///         Version = "11",
    ///         Size = "db-s-1vcpu-1gb",
    ///         Region = "nyc1",
    ///         NodeCount = 1,
    ///     });
    /// 
    ///     var pool_01 = new DigitalOcean.DatabaseConnectionPool("pool-01", new()
    ///     {
    ///         ClusterId = postgres_example.Id,
    ///         Mode = "transaction",
    ///         Size = 20,
    ///         DbName = "defaultdb",
    ///         User = "doadmin",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Database connection pools can be imported using the `id` of the source database cluster and the `name` of the connection pool joined with a comma. For example
    /// 
    /// ```sh
    ///  $ pulumi import digitalocean:index/databaseConnectionPool:DatabaseConnectionPool pool-01 245bcfd0-7f31-4ce6-a2bc-475a116cca97,pool-01
    /// ```
    /// </summary>
    [DigitalOceanResourceType("digitalocean:index/databaseConnectionPool:DatabaseConnectionPool")]
    public partial class DatabaseConnectionPool : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the source database cluster. Note: This must be a PostgreSQL cluster.
        /// </summary>
        [Output("clusterId")]
        public Output<string> ClusterId { get; private set; } = null!;

        /// <summary>
        /// The database for use with the connection pool.
        /// </summary>
        [Output("dbName")]
        public Output<string> DbName { get; private set; } = null!;

        /// <summary>
        /// The hostname used to connect to the database connection pool.
        /// </summary>
        [Output("host")]
        public Output<string> Host { get; private set; } = null!;

        /// <summary>
        /// The PGBouncer transaction mode for the connection pool. The allowed values are session, transaction, and statement.
        /// </summary>
        [Output("mode")]
        public Output<string> Mode { get; private set; } = null!;

        /// <summary>
        /// The name for the database connection pool.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Password for the connection pool's user.
        /// </summary>
        [Output("password")]
        public Output<string> Password { get; private set; } = null!;

        /// <summary>
        /// Network port that the database connection pool is listening on.
        /// </summary>
        [Output("port")]
        public Output<int> Port { get; private set; } = null!;

        /// <summary>
        /// Same as `host`, but only accessible from resources within the account and in the same region.
        /// </summary>
        [Output("privateHost")]
        public Output<string> PrivateHost { get; private set; } = null!;

        /// <summary>
        /// Same as `uri`, but only accessible from resources within the account and in the same region.
        /// </summary>
        [Output("privateUri")]
        public Output<string> PrivateUri { get; private set; } = null!;

        /// <summary>
        /// The desired size of the PGBouncer connection pool.
        /// </summary>
        [Output("size")]
        public Output<int> Size { get; private set; } = null!;

        /// <summary>
        /// The full URI for connecting to the database connection pool.
        /// </summary>
        [Output("uri")]
        public Output<string> Uri { get; private set; } = null!;

        /// <summary>
        /// The name of the database user for use with the connection pool. When excluded, all sessions connect to the database as the inbound user.
        /// </summary>
        [Output("user")]
        public Output<string?> User { get; private set; } = null!;


        /// <summary>
        /// Create a DatabaseConnectionPool resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DatabaseConnectionPool(string name, DatabaseConnectionPoolArgs args, CustomResourceOptions? options = null)
            : base("digitalocean:index/databaseConnectionPool:DatabaseConnectionPool", name, args ?? new DatabaseConnectionPoolArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DatabaseConnectionPool(string name, Input<string> id, DatabaseConnectionPoolState? state = null, CustomResourceOptions? options = null)
            : base("digitalocean:index/databaseConnectionPool:DatabaseConnectionPool", name, state, MakeResourceOptions(options, id))
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
                    "uri",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing DatabaseConnectionPool resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DatabaseConnectionPool Get(string name, Input<string> id, DatabaseConnectionPoolState? state = null, CustomResourceOptions? options = null)
        {
            return new DatabaseConnectionPool(name, id, state, options);
        }
    }

    public sealed class DatabaseConnectionPoolArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the source database cluster. Note: This must be a PostgreSQL cluster.
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        /// <summary>
        /// The database for use with the connection pool.
        /// </summary>
        [Input("dbName", required: true)]
        public Input<string> DbName { get; set; } = null!;

        /// <summary>
        /// The PGBouncer transaction mode for the connection pool. The allowed values are session, transaction, and statement.
        /// </summary>
        [Input("mode", required: true)]
        public Input<string> Mode { get; set; } = null!;

        /// <summary>
        /// The name for the database connection pool.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The desired size of the PGBouncer connection pool.
        /// </summary>
        [Input("size", required: true)]
        public Input<int> Size { get; set; } = null!;

        /// <summary>
        /// The name of the database user for use with the connection pool. When excluded, all sessions connect to the database as the inbound user.
        /// </summary>
        [Input("user")]
        public Input<string>? User { get; set; }

        public DatabaseConnectionPoolArgs()
        {
        }
        public static new DatabaseConnectionPoolArgs Empty => new DatabaseConnectionPoolArgs();
    }

    public sealed class DatabaseConnectionPoolState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the source database cluster. Note: This must be a PostgreSQL cluster.
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        /// <summary>
        /// The database for use with the connection pool.
        /// </summary>
        [Input("dbName")]
        public Input<string>? DbName { get; set; }

        /// <summary>
        /// The hostname used to connect to the database connection pool.
        /// </summary>
        [Input("host")]
        public Input<string>? Host { get; set; }

        /// <summary>
        /// The PGBouncer transaction mode for the connection pool. The allowed values are session, transaction, and statement.
        /// </summary>
        [Input("mode")]
        public Input<string>? Mode { get; set; }

        /// <summary>
        /// The name for the database connection pool.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// Password for the connection pool's user.
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
        /// Network port that the database connection pool is listening on.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// Same as `host`, but only accessible from resources within the account and in the same region.
        /// </summary>
        [Input("privateHost")]
        public Input<string>? PrivateHost { get; set; }

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
        /// The desired size of the PGBouncer connection pool.
        /// </summary>
        [Input("size")]
        public Input<int>? Size { get; set; }

        [Input("uri")]
        private Input<string>? _uri;

        /// <summary>
        /// The full URI for connecting to the database connection pool.
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
        /// The name of the database user for use with the connection pool. When excluded, all sessions connect to the database as the inbound user.
        /// </summary>
        [Input("user")]
        public Input<string>? User { get; set; }

        public DatabaseConnectionPoolState()
        {
        }
        public static new DatabaseConnectionPoolState Empty => new DatabaseConnectionPoolState();
    }
}
