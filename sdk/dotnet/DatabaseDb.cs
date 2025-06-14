// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean
{
    /// <summary>
    /// Provides a DigitalOcean database resource. When creating a new database cluster, a default database with name `defaultdb` will be created. Then, this resource can be used to provide additional database inside the cluster.
    /// 
    /// ## Example Usage
    /// 
    /// ### Create a new PostgreSQL database
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
    ///     var database_example = new DigitalOcean.DatabaseDb("database-example", new()
    ///     {
    ///         ClusterId = postgres_example.Id,
    ///         Name = "foobar",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Database can be imported using the `id` of the source database cluster
    /// 
    /// and the `name` of the database joined with a comma. For example:
    /// 
    /// ```sh
    /// $ pulumi import digitalocean:index/databaseDb:DatabaseDb database-example 245bcfd0-7f31-4ce6-a2bc-475a116cca97,foobar
    /// ```
    /// </summary>
    [DigitalOceanResourceType("digitalocean:index/databaseDb:DatabaseDb")]
    public partial class DatabaseDb : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the original source database cluster.
        /// </summary>
        [Output("clusterId")]
        public Output<string> ClusterId { get; private set; } = null!;

        /// <summary>
        /// The name for the database.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a DatabaseDb resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DatabaseDb(string name, DatabaseDbArgs args, CustomResourceOptions? options = null)
            : base("digitalocean:index/databaseDb:DatabaseDb", name, args ?? new DatabaseDbArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DatabaseDb(string name, Input<string> id, DatabaseDbState? state = null, CustomResourceOptions? options = null)
            : base("digitalocean:index/databaseDb:DatabaseDb", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DatabaseDb resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DatabaseDb Get(string name, Input<string> id, DatabaseDbState? state = null, CustomResourceOptions? options = null)
        {
            return new DatabaseDb(name, id, state, options);
        }
    }

    public sealed class DatabaseDbArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the original source database cluster.
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        /// <summary>
        /// The name for the database.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public DatabaseDbArgs()
        {
        }
        public static new DatabaseDbArgs Empty => new DatabaseDbArgs();
    }

    public sealed class DatabaseDbState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the original source database cluster.
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        /// <summary>
        /// The name for the database.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public DatabaseDbState()
        {
        }
        public static new DatabaseDbState Empty => new DatabaseDbState();
    }
}
