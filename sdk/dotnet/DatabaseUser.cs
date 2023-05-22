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
    /// Provides a DigitalOcean database user resource. When creating a new database cluster, a default admin user with name `doadmin` will be created. Then, this resource can be used to provide additional normal users inside the cluster.
    /// 
    /// &gt; **NOTE:** Any new users created will always have `normal` role, only the default user that comes with database cluster creation has `primary` role. Additional permissions must be managed manually.
    /// 
    /// ## Example Usage
    /// ### Create a new PostgreSQL database user
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
    ///     var user_example = new DigitalOcean.DatabaseUser("user-example", new()
    ///     {
    ///         ClusterId = postgres_example.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Database user can be imported using the `id` of the source database cluster and the `name` of the user joined with a comma. For example
    /// 
    /// ```sh
    ///  $ pulumi import digitalocean:index/databaseUser:DatabaseUser user-example 245bcfd0-7f31-4ce6-a2bc-475a116cca97,foobar
    /// ```
    /// </summary>
    [DigitalOceanResourceType("digitalocean:index/databaseUser:DatabaseUser")]
    public partial class DatabaseUser : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the original source database cluster.
        /// </summary>
        [Output("clusterId")]
        public Output<string> ClusterId { get; private set; } = null!;

        /// <summary>
        /// The authentication method to use for connections to the MySQL user account. The valid values are `mysql_native_password` or `caching_sha2_password` (this is the default).
        /// </summary>
        [Output("mysqlAuthPlugin")]
        public Output<string?> MysqlAuthPlugin { get; private set; } = null!;

        /// <summary>
        /// The name for the database user.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Password for the database user.
        /// </summary>
        [Output("password")]
        public Output<string> Password { get; private set; } = null!;

        /// <summary>
        /// Role for the database user. The value will be either "primary" or "normal".
        /// </summary>
        [Output("role")]
        public Output<string> Role { get; private set; } = null!;


        /// <summary>
        /// Create a DatabaseUser resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DatabaseUser(string name, DatabaseUserArgs args, CustomResourceOptions? options = null)
            : base("digitalocean:index/databaseUser:DatabaseUser", name, args ?? new DatabaseUserArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DatabaseUser(string name, Input<string> id, DatabaseUserState? state = null, CustomResourceOptions? options = null)
            : base("digitalocean:index/databaseUser:DatabaseUser", name, state, MakeResourceOptions(options, id))
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
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing DatabaseUser resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DatabaseUser Get(string name, Input<string> id, DatabaseUserState? state = null, CustomResourceOptions? options = null)
        {
            return new DatabaseUser(name, id, state, options);
        }
    }

    public sealed class DatabaseUserArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the original source database cluster.
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        /// <summary>
        /// The authentication method to use for connections to the MySQL user account. The valid values are `mysql_native_password` or `caching_sha2_password` (this is the default).
        /// </summary>
        [Input("mysqlAuthPlugin")]
        public Input<string>? MysqlAuthPlugin { get; set; }

        /// <summary>
        /// The name for the database user.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public DatabaseUserArgs()
        {
        }
        public static new DatabaseUserArgs Empty => new DatabaseUserArgs();
    }

    public sealed class DatabaseUserState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the original source database cluster.
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        /// <summary>
        /// The authentication method to use for connections to the MySQL user account. The valid values are `mysql_native_password` or `caching_sha2_password` (this is the default).
        /// </summary>
        [Input("mysqlAuthPlugin")]
        public Input<string>? MysqlAuthPlugin { get; set; }

        /// <summary>
        /// The name for the database user.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// Password for the database user.
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
        /// Role for the database user. The value will be either "primary" or "normal".
        /// </summary>
        [Input("role")]
        public Input<string>? Role { get; set; }

        public DatabaseUserState()
        {
        }
        public static new DatabaseUserState Empty => new DatabaseUserState();
    }
}
