// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean
{
    public static class GetKubernetesCluster
    {
        /// <summary>
        /// Retrieves information about a DigitalOcean Kubernetes cluster for use in other resources. This data source provides all of the cluster's properties as configured on your DigitalOcean account. This is useful if the cluster in question is not managed by the provider.
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
        ///     var example = DigitalOcean.GetKubernetesCluster.Invoke(new()
        ///     {
        ///         Name = "prod-cluster-01",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetKubernetesClusterResult> InvokeAsync(GetKubernetesClusterArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetKubernetesClusterResult>("digitalocean:index/getKubernetesCluster:getKubernetesCluster", args ?? new GetKubernetesClusterArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieves information about a DigitalOcean Kubernetes cluster for use in other resources. This data source provides all of the cluster's properties as configured on your DigitalOcean account. This is useful if the cluster in question is not managed by the provider.
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
        ///     var example = DigitalOcean.GetKubernetesCluster.Invoke(new()
        ///     {
        ///         Name = "prod-cluster-01",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetKubernetesClusterResult> Invoke(GetKubernetesClusterInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetKubernetesClusterResult>("digitalocean:index/getKubernetesCluster:getKubernetesCluster", args ?? new GetKubernetesClusterInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieves information about a DigitalOcean Kubernetes cluster for use in other resources. This data source provides all of the cluster's properties as configured on your DigitalOcean account. This is useful if the cluster in question is not managed by the provider.
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
        ///     var example = DigitalOcean.GetKubernetesCluster.Invoke(new()
        ///     {
        ///         Name = "prod-cluster-01",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetKubernetesClusterResult> Invoke(GetKubernetesClusterInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetKubernetesClusterResult>("digitalocean:index/getKubernetesCluster:getKubernetesCluster", args ?? new GetKubernetesClusterInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetKubernetesClusterArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of Kubernetes cluster.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        [Input("tags")]
        private List<string>? _tags;

        /// <summary>
        /// A list of tag names applied to the node pool.
        /// </summary>
        public List<string> Tags
        {
            get => _tags ?? (_tags = new List<string>());
            set => _tags = value;
        }

        public GetKubernetesClusterArgs()
        {
        }
        public static new GetKubernetesClusterArgs Empty => new GetKubernetesClusterArgs();
    }

    public sealed class GetKubernetesClusterInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of Kubernetes cluster.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// A list of tag names applied to the node pool.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        public GetKubernetesClusterInvokeArgs()
        {
        }
        public static new GetKubernetesClusterInvokeArgs Empty => new GetKubernetesClusterInvokeArgs();
    }


    [OutputType]
    public sealed class GetKubernetesClusterResult
    {
        /// <summary>
        /// A boolean value indicating whether the cluster will be automatically upgraded to new patch releases during its maintenance window.
        /// </summary>
        public readonly bool AutoUpgrade;
        /// <summary>
        /// The range of IP addresses in the overlay network of the Kubernetes cluster.
        /// </summary>
        public readonly string ClusterSubnet;
        /// <summary>
        /// The date and time when the node was created.
        /// </summary>
        public readonly string CreatedAt;
        /// <summary>
        /// The base URL of the API server on the Kubernetes master node.
        /// </summary>
        public readonly string Endpoint;
        public readonly bool Ha;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The public IPv4 address of the Kubernetes master node.
        /// </summary>
        public readonly string Ipv4Address;
        /// <summary>
        /// A representation of the Kubernetes cluster's kubeconfig with the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetKubernetesClusterKubeConfigResult> KubeConfigs;
        /// <summary>
        /// The maintenance policy of the Kubernetes cluster. Digital Ocean has a default maintenancen window.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetKubernetesClusterMaintenancePolicyResult> MaintenancePolicies;
        /// <summary>
        /// The auto-generated name for the node.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// A list of node pools associated with the cluster. Each node pool exports the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetKubernetesClusterNodePoolResult> NodePools;
        /// <summary>
        /// The slug identifier for the region where the Kubernetes cluster is located.
        /// </summary>
        public readonly string Region;
        /// <summary>
        /// The range of assignable IP addresses for services running in the Kubernetes cluster.
        /// </summary>
        public readonly string ServiceSubnet;
        /// <summary>
        /// A string indicating the current status of the individual node.
        /// </summary>
        public readonly string Status;
        public readonly bool SurgeUpgrade;
        /// <summary>
        /// A list of tag names applied to the node pool.
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        /// <summary>
        /// The date and time when the node was last updated.
        /// </summary>
        public readonly string UpdatedAt;
        /// <summary>
        /// The uniform resource name (URN) for the Kubernetes cluster.
        /// </summary>
        public readonly string Urn;
        /// <summary>
        /// The slug identifier for the version of Kubernetes used for the cluster.
        /// </summary>
        public readonly string Version;
        /// <summary>
        /// The ID of the VPC where the Kubernetes cluster is located.
        /// </summary>
        public readonly string VpcUuid;

        [OutputConstructor]
        private GetKubernetesClusterResult(
            bool autoUpgrade,

            string clusterSubnet,

            string createdAt,

            string endpoint,

            bool ha,

            string id,

            string ipv4Address,

            ImmutableArray<Outputs.GetKubernetesClusterKubeConfigResult> kubeConfigs,

            ImmutableArray<Outputs.GetKubernetesClusterMaintenancePolicyResult> maintenancePolicies,

            string name,

            ImmutableArray<Outputs.GetKubernetesClusterNodePoolResult> nodePools,

            string region,

            string serviceSubnet,

            string status,

            bool surgeUpgrade,

            ImmutableArray<string> tags,

            string updatedAt,

            string urn,

            string version,

            string vpcUuid)
        {
            AutoUpgrade = autoUpgrade;
            ClusterSubnet = clusterSubnet;
            CreatedAt = createdAt;
            Endpoint = endpoint;
            Ha = ha;
            Id = id;
            Ipv4Address = ipv4Address;
            KubeConfigs = kubeConfigs;
            MaintenancePolicies = maintenancePolicies;
            Name = name;
            NodePools = nodePools;
            Region = region;
            ServiceSubnet = serviceSubnet;
            Status = status;
            SurgeUpgrade = surgeUpgrade;
            Tags = tags;
            UpdatedAt = updatedAt;
            Urn = urn;
            Version = version;
            VpcUuid = vpcUuid;
        }
    }
}
