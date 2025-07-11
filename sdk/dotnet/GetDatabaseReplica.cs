// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean
{
    public static class GetDatabaseReplica
    {
        /// <summary>
        /// Provides information on a DigitalOcean database replica.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetDatabaseCluster.Invoke(new()
        ///     {
        ///         Name = "example-cluster",
        ///     });
        /// 
        ///     var read_only = DigitalOcean.GetDatabaseReplica.Invoke(new()
        ///     {
        ///         ClusterId = example.Apply(getDatabaseClusterResult =&gt; getDatabaseClusterResult.Id),
        ///         Name = "terra-test-ro",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["replicaOutput"] = read_only.Apply(read_only =&gt; read_only.Apply(getDatabaseReplicaResult =&gt; getDatabaseReplicaResult.Uri)),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetDatabaseReplicaResult> InvokeAsync(GetDatabaseReplicaArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDatabaseReplicaResult>("digitalocean:index/getDatabaseReplica:getDatabaseReplica", args ?? new GetDatabaseReplicaArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information on a DigitalOcean database replica.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetDatabaseCluster.Invoke(new()
        ///     {
        ///         Name = "example-cluster",
        ///     });
        /// 
        ///     var read_only = DigitalOcean.GetDatabaseReplica.Invoke(new()
        ///     {
        ///         ClusterId = example.Apply(getDatabaseClusterResult =&gt; getDatabaseClusterResult.Id),
        ///         Name = "terra-test-ro",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["replicaOutput"] = read_only.Apply(read_only =&gt; read_only.Apply(getDatabaseReplicaResult =&gt; getDatabaseReplicaResult.Uri)),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetDatabaseReplicaResult> Invoke(GetDatabaseReplicaInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDatabaseReplicaResult>("digitalocean:index/getDatabaseReplica:getDatabaseReplica", args ?? new GetDatabaseReplicaInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information on a DigitalOcean database replica.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetDatabaseCluster.Invoke(new()
        ///     {
        ///         Name = "example-cluster",
        ///     });
        /// 
        ///     var read_only = DigitalOcean.GetDatabaseReplica.Invoke(new()
        ///     {
        ///         ClusterId = example.Apply(getDatabaseClusterResult =&gt; getDatabaseClusterResult.Id),
        ///         Name = "terra-test-ro",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["replicaOutput"] = read_only.Apply(read_only =&gt; read_only.Apply(getDatabaseReplicaResult =&gt; getDatabaseReplicaResult.Uri)),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetDatabaseReplicaResult> Invoke(GetDatabaseReplicaInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetDatabaseReplicaResult>("digitalocean:index/getDatabaseReplica:getDatabaseReplica", args ?? new GetDatabaseReplicaInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDatabaseReplicaArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the original source database cluster.
        /// </summary>
        [Input("clusterId", required: true)]
        public string ClusterId { get; set; } = null!;

        /// <summary>
        /// The name for the database replica.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        [Input("tags")]
        private List<string>? _tags;

        /// <summary>
        /// A list of tag names to be applied to the database replica.
        /// </summary>
        public List<string> Tags
        {
            get => _tags ?? (_tags = new List<string>());
            set => _tags = value;
        }

        public GetDatabaseReplicaArgs()
        {
        }
        public static new GetDatabaseReplicaArgs Empty => new GetDatabaseReplicaArgs();
    }

    public sealed class GetDatabaseReplicaInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the original source database cluster.
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        /// <summary>
        /// The name for the database replica.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// A list of tag names to be applied to the database replica.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        public GetDatabaseReplicaInvokeArgs()
        {
        }
        public static new GetDatabaseReplicaInvokeArgs Empty => new GetDatabaseReplicaInvokeArgs();
    }


    [OutputType]
    public sealed class GetDatabaseReplicaResult
    {
        public readonly string ClusterId;
        /// <summary>
        /// Name of the replica's default database.
        /// </summary>
        public readonly string Database;
        /// <summary>
        /// Database replica's hostname.
        /// </summary>
        public readonly string Host;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;
        /// <summary>
        /// Password for the replica's default user.
        /// </summary>
        public readonly string Password;
        /// <summary>
        /// Network port that the database replica is listening on.
        /// </summary>
        public readonly int Port;
        /// <summary>
        /// Same as `host`, but only accessible from resources within the account and in the same region.
        /// </summary>
        public readonly string PrivateHost;
        public readonly string PrivateNetworkUuid;
        /// <summary>
        /// Same as `uri`, but only accessible from resources within the account and in the same region.
        /// </summary>
        public readonly string PrivateUri;
        public readonly string Region;
        public readonly string StorageSizeMib;
        /// <summary>
        /// A list of tag names to be applied to the database replica.
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        /// <summary>
        /// The full URI for connecting to the database replica.
        /// </summary>
        public readonly string Uri;
        /// <summary>
        /// Username for the replica's default user.
        /// </summary>
        public readonly string User;
        /// <summary>
        /// The UUID of the database replica.
        /// </summary>
        public readonly string Uuid;

        [OutputConstructor]
        private GetDatabaseReplicaResult(
            string clusterId,

            string database,

            string host,

            string id,

            string name,

            string password,

            int port,

            string privateHost,

            string privateNetworkUuid,

            string privateUri,

            string region,

            string storageSizeMib,

            ImmutableArray<string> tags,

            string uri,

            string user,

            string uuid)
        {
            ClusterId = clusterId;
            Database = database;
            Host = host;
            Id = id;
            Name = name;
            Password = password;
            Port = port;
            PrivateHost = privateHost;
            PrivateNetworkUuid = privateNetworkUuid;
            PrivateUri = privateUri;
            Region = region;
            StorageSizeMib = storageSizeMib;
            Tags = tags;
            Uri = uri;
            User = user;
            Uuid = uuid;
        }
    }
}
