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
    /// ## Import
    /// 
    /// Before importing a Kubernetes cluster, the cluster's default node pool must be tagged with
    /// 
    /// the `terraform:default-node-pool` tag. The provider will automatically add this tag if
    /// 
    /// the cluster only has a single node pool. Clusters with more than one node pool, however, will require
    /// 
    /// that you manually add the `terraform:default-node-pool` tag to the node pool that you intend to be
    /// 
    /// the default node pool.
    /// 
    /// Then the Kubernetes cluster and its default node pool can be imported using the cluster's `id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import digitalocean:index/kubernetesCluster:KubernetesCluster mycluster 1b8b2100-0e9f-4e8f-ad78-9eb578c2a0af
    /// ```
    /// 
    /// Additional node pools must be imported separately as `digitalocean_kubernetes_cluster`
    /// 
    /// resources, e.g.
    /// 
    /// ```sh
    /// $ pulumi import digitalocean:index/kubernetesCluster:KubernetesCluster mynodepool 9d76f410-9284-4436-9633-4066852442c8
    /// ```
    /// </summary>
    [DigitalOceanResourceType("digitalocean:index/kubernetesCluster:KubernetesCluster")]
    public partial class KubernetesCluster : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A boolean value indicating whether the cluster will be automatically upgraded to new patch releases during its maintenance window.
        /// </summary>
        [Output("autoUpgrade")]
        public Output<bool?> AutoUpgrade { get; private set; } = null!;

        /// <summary>
        /// Block containing options for cluster auto-scaling.
        /// </summary>
        [Output("clusterAutoscalerConfigurations")]
        public Output<ImmutableArray<Outputs.KubernetesClusterClusterAutoscalerConfiguration>> ClusterAutoscalerConfigurations { get; private set; } = null!;

        /// <summary>
        /// The range of IP addresses in the overlay network of the Kubernetes cluster. For more information, see [here](https://docs.digitalocean.com/products/kubernetes/how-to/create-clusters/#create-with-vpc-native).
        /// </summary>
        [Output("clusterSubnet")]
        public Output<string> ClusterSubnet { get; private set; } = null!;

        /// <summary>
        /// The uniform resource name (URN) for the Kubernetes cluster.
        /// </summary>
        [Output("clusterUrn")]
        public Output<string> ClusterUrn { get; private set; } = null!;

        /// <summary>
        /// A block representing the cluster's control plane firewall
        /// </summary>
        [Output("controlPlaneFirewall")]
        public Output<Outputs.KubernetesClusterControlPlaneFirewall> ControlPlaneFirewall { get; private set; } = null!;

        /// <summary>
        /// The date and time when the node was created.
        /// </summary>
        [Output("createdAt")]
        public Output<string> CreatedAt { get; private set; } = null!;

        /// <summary>
        /// **Use with caution.** When set to true, all associated DigitalOcean resources created via the Kubernetes API (load balancers, volumes, and volume snapshots) will be destroyed along with the cluster when it is destroyed.
        /// </summary>
        [Output("destroyAllAssociatedResources")]
        public Output<bool?> DestroyAllAssociatedResources { get; private set; } = null!;

        /// <summary>
        /// The base URL of the API server on the Kubernetes master node.
        /// </summary>
        [Output("endpoint")]
        public Output<string> Endpoint { get; private set; } = null!;

        /// <summary>
        /// Enable/disable the high availability control plane for a cluster. Once enabled for a cluster, high availability cannot be disabled. Default: false
        /// </summary>
        [Output("ha")]
        public Output<bool?> Ha { get; private set; } = null!;

        /// <summary>
        /// The public IPv4 address of the Kubernetes master node. This will not be set if high availability is configured on the cluster (v1.21+)
        /// </summary>
        [Output("ipv4Address")]
        public Output<string> Ipv4Address { get; private set; } = null!;

        /// <summary>
        /// A representation of the Kubernetes cluster's kubeconfig with the following attributes:
        /// </summary>
        [Output("kubeConfigs")]
        public Output<ImmutableArray<Outputs.KubernetesClusterKubeConfig>> KubeConfigs { get; private set; } = null!;

        /// <summary>
        /// The duration in seconds that the returned Kubernetes credentials will be valid. If not set or 0, the credentials will have a 7 day expiry.
        /// </summary>
        [Output("kubeconfigExpireSeconds")]
        public Output<int?> KubeconfigExpireSeconds { get; private set; } = null!;

        /// <summary>
        /// A block representing the cluster's maintenance window. Updates will be applied within this window. If not specified, a default maintenance window will be chosen. `auto_upgrade` must be set to `true` for this to have an effect.
        /// </summary>
        [Output("maintenancePolicy")]
        public Output<Outputs.KubernetesClusterMaintenancePolicy> MaintenancePolicy { get; private set; } = null!;

        /// <summary>
        /// A name for the Kubernetes cluster.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A block representing the cluster's default node pool. Additional node pools may be added to the cluster using the `digitalocean.KubernetesNodePool` resource. The following arguments may be specified:
        /// </summary>
        [Output("nodePool")]
        public Output<Outputs.KubernetesClusterNodePool> NodePool { get; private set; } = null!;

        /// <summary>
        /// The slug identifier for the region where the Kubernetes cluster will be created.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// Enables or disables the DigitalOcean container registry integration for the cluster. This requires that a container registry has first been created for the account. Default: false
        /// </summary>
        [Output("registryIntegration")]
        public Output<bool?> RegistryIntegration { get; private set; } = null!;

        /// <summary>
        /// Block containing options for the routing-agent component. If not specified, the routing-agent component will not be installed in the cluster.
        /// </summary>
        [Output("routingAgent")]
        public Output<Outputs.KubernetesClusterRoutingAgent> RoutingAgent { get; private set; } = null!;

        /// <summary>
        /// The range of assignable IP addresses for services running in the Kubernetes cluster. For more information, see [here](https://docs.digitalocean.com/products/kubernetes/how-to/create-clusters/#create-with-vpc-native).
        /// </summary>
        [Output("serviceSubnet")]
        public Output<string> ServiceSubnet { get; private set; } = null!;

        /// <summary>
        /// A string indicating the current status of the individual node.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// Enable/disable surge upgrades for a cluster. Default: true
        /// </summary>
        [Output("surgeUpgrade")]
        public Output<bool?> SurgeUpgrade { get; private set; } = null!;

        /// <summary>
        /// A list of tag names to be applied to the Kubernetes cluster.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;

        /// <summary>
        /// The date and time when the node was last updated.
        /// </summary>
        [Output("updatedAt")]
        public Output<string> UpdatedAt { get; private set; } = null!;

        /// <summary>
        /// The slug identifier for the version of Kubernetes used for the cluster. Use [doctl](https://github.com/digitalocean/doctl) to find the available versions `doctl kubernetes options versions`. (**Note:** A cluster may only be upgraded to newer versions in-place. If the version is decreased, a new resource will be created.)
        /// </summary>
        [Output("version")]
        public Output<string> Version { get; private set; } = null!;

        /// <summary>
        /// The ID of the VPC where the Kubernetes cluster will be located.
        /// </summary>
        [Output("vpcUuid")]
        public Output<string> VpcUuid { get; private set; } = null!;


        /// <summary>
        /// Create a KubernetesCluster resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public KubernetesCluster(string name, KubernetesClusterArgs args, CustomResourceOptions? options = null)
            : base("digitalocean:index/kubernetesCluster:KubernetesCluster", name, args ?? new KubernetesClusterArgs(), MakeResourceOptions(options, ""))
        {
        }

        private KubernetesCluster(string name, Input<string> id, KubernetesClusterState? state = null, CustomResourceOptions? options = null)
            : base("digitalocean:index/kubernetesCluster:KubernetesCluster", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "kubeConfigs",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing KubernetesCluster resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static KubernetesCluster Get(string name, Input<string> id, KubernetesClusterState? state = null, CustomResourceOptions? options = null)
        {
            return new KubernetesCluster(name, id, state, options);
        }
    }

    public sealed class KubernetesClusterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A boolean value indicating whether the cluster will be automatically upgraded to new patch releases during its maintenance window.
        /// </summary>
        [Input("autoUpgrade")]
        public Input<bool>? AutoUpgrade { get; set; }

        [Input("clusterAutoscalerConfigurations")]
        private InputList<Inputs.KubernetesClusterClusterAutoscalerConfigurationArgs>? _clusterAutoscalerConfigurations;

        /// <summary>
        /// Block containing options for cluster auto-scaling.
        /// </summary>
        public InputList<Inputs.KubernetesClusterClusterAutoscalerConfigurationArgs> ClusterAutoscalerConfigurations
        {
            get => _clusterAutoscalerConfigurations ?? (_clusterAutoscalerConfigurations = new InputList<Inputs.KubernetesClusterClusterAutoscalerConfigurationArgs>());
            set => _clusterAutoscalerConfigurations = value;
        }

        /// <summary>
        /// The range of IP addresses in the overlay network of the Kubernetes cluster. For more information, see [here](https://docs.digitalocean.com/products/kubernetes/how-to/create-clusters/#create-with-vpc-native).
        /// </summary>
        [Input("clusterSubnet")]
        public Input<string>? ClusterSubnet { get; set; }

        /// <summary>
        /// A block representing the cluster's control plane firewall
        /// </summary>
        [Input("controlPlaneFirewall")]
        public Input<Inputs.KubernetesClusterControlPlaneFirewallArgs>? ControlPlaneFirewall { get; set; }

        /// <summary>
        /// **Use with caution.** When set to true, all associated DigitalOcean resources created via the Kubernetes API (load balancers, volumes, and volume snapshots) will be destroyed along with the cluster when it is destroyed.
        /// </summary>
        [Input("destroyAllAssociatedResources")]
        public Input<bool>? DestroyAllAssociatedResources { get; set; }

        /// <summary>
        /// Enable/disable the high availability control plane for a cluster. Once enabled for a cluster, high availability cannot be disabled. Default: false
        /// </summary>
        [Input("ha")]
        public Input<bool>? Ha { get; set; }

        /// <summary>
        /// The duration in seconds that the returned Kubernetes credentials will be valid. If not set or 0, the credentials will have a 7 day expiry.
        /// </summary>
        [Input("kubeconfigExpireSeconds")]
        public Input<int>? KubeconfigExpireSeconds { get; set; }

        /// <summary>
        /// A block representing the cluster's maintenance window. Updates will be applied within this window. If not specified, a default maintenance window will be chosen. `auto_upgrade` must be set to `true` for this to have an effect.
        /// </summary>
        [Input("maintenancePolicy")]
        public Input<Inputs.KubernetesClusterMaintenancePolicyArgs>? MaintenancePolicy { get; set; }

        /// <summary>
        /// A name for the Kubernetes cluster.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A block representing the cluster's default node pool. Additional node pools may be added to the cluster using the `digitalocean.KubernetesNodePool` resource. The following arguments may be specified:
        /// </summary>
        [Input("nodePool", required: true)]
        public Input<Inputs.KubernetesClusterNodePoolArgs> NodePool { get; set; } = null!;

        /// <summary>
        /// The slug identifier for the region where the Kubernetes cluster will be created.
        /// </summary>
        [Input("region", required: true)]
        public InputUnion<string, Pulumi.DigitalOcean.Region> Region { get; set; } = null!;

        /// <summary>
        /// Enables or disables the DigitalOcean container registry integration for the cluster. This requires that a container registry has first been created for the account. Default: false
        /// </summary>
        [Input("registryIntegration")]
        public Input<bool>? RegistryIntegration { get; set; }

        /// <summary>
        /// Block containing options for the routing-agent component. If not specified, the routing-agent component will not be installed in the cluster.
        /// </summary>
        [Input("routingAgent")]
        public Input<Inputs.KubernetesClusterRoutingAgentArgs>? RoutingAgent { get; set; }

        /// <summary>
        /// The range of assignable IP addresses for services running in the Kubernetes cluster. For more information, see [here](https://docs.digitalocean.com/products/kubernetes/how-to/create-clusters/#create-with-vpc-native).
        /// </summary>
        [Input("serviceSubnet")]
        public Input<string>? ServiceSubnet { get; set; }

        /// <summary>
        /// Enable/disable surge upgrades for a cluster. Default: true
        /// </summary>
        [Input("surgeUpgrade")]
        public Input<bool>? SurgeUpgrade { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// A list of tag names to be applied to the Kubernetes cluster.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The slug identifier for the version of Kubernetes used for the cluster. Use [doctl](https://github.com/digitalocean/doctl) to find the available versions `doctl kubernetes options versions`. (**Note:** A cluster may only be upgraded to newer versions in-place. If the version is decreased, a new resource will be created.)
        /// </summary>
        [Input("version", required: true)]
        public Input<string> Version { get; set; } = null!;

        /// <summary>
        /// The ID of the VPC where the Kubernetes cluster will be located.
        /// </summary>
        [Input("vpcUuid")]
        public Input<string>? VpcUuid { get; set; }

        public KubernetesClusterArgs()
        {
        }
        public static new KubernetesClusterArgs Empty => new KubernetesClusterArgs();
    }

    public sealed class KubernetesClusterState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A boolean value indicating whether the cluster will be automatically upgraded to new patch releases during its maintenance window.
        /// </summary>
        [Input("autoUpgrade")]
        public Input<bool>? AutoUpgrade { get; set; }

        [Input("clusterAutoscalerConfigurations")]
        private InputList<Inputs.KubernetesClusterClusterAutoscalerConfigurationGetArgs>? _clusterAutoscalerConfigurations;

        /// <summary>
        /// Block containing options for cluster auto-scaling.
        /// </summary>
        public InputList<Inputs.KubernetesClusterClusterAutoscalerConfigurationGetArgs> ClusterAutoscalerConfigurations
        {
            get => _clusterAutoscalerConfigurations ?? (_clusterAutoscalerConfigurations = new InputList<Inputs.KubernetesClusterClusterAutoscalerConfigurationGetArgs>());
            set => _clusterAutoscalerConfigurations = value;
        }

        /// <summary>
        /// The range of IP addresses in the overlay network of the Kubernetes cluster. For more information, see [here](https://docs.digitalocean.com/products/kubernetes/how-to/create-clusters/#create-with-vpc-native).
        /// </summary>
        [Input("clusterSubnet")]
        public Input<string>? ClusterSubnet { get; set; }

        /// <summary>
        /// The uniform resource name (URN) for the Kubernetes cluster.
        /// </summary>
        [Input("clusterUrn")]
        public Input<string>? ClusterUrn { get; set; }

        /// <summary>
        /// A block representing the cluster's control plane firewall
        /// </summary>
        [Input("controlPlaneFirewall")]
        public Input<Inputs.KubernetesClusterControlPlaneFirewallGetArgs>? ControlPlaneFirewall { get; set; }

        /// <summary>
        /// The date and time when the node was created.
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        /// <summary>
        /// **Use with caution.** When set to true, all associated DigitalOcean resources created via the Kubernetes API (load balancers, volumes, and volume snapshots) will be destroyed along with the cluster when it is destroyed.
        /// </summary>
        [Input("destroyAllAssociatedResources")]
        public Input<bool>? DestroyAllAssociatedResources { get; set; }

        /// <summary>
        /// The base URL of the API server on the Kubernetes master node.
        /// </summary>
        [Input("endpoint")]
        public Input<string>? Endpoint { get; set; }

        /// <summary>
        /// Enable/disable the high availability control plane for a cluster. Once enabled for a cluster, high availability cannot be disabled. Default: false
        /// </summary>
        [Input("ha")]
        public Input<bool>? Ha { get; set; }

        /// <summary>
        /// The public IPv4 address of the Kubernetes master node. This will not be set if high availability is configured on the cluster (v1.21+)
        /// </summary>
        [Input("ipv4Address")]
        public Input<string>? Ipv4Address { get; set; }

        [Input("kubeConfigs")]
        private InputList<Inputs.KubernetesClusterKubeConfigGetArgs>? _kubeConfigs;

        /// <summary>
        /// A representation of the Kubernetes cluster's kubeconfig with the following attributes:
        /// </summary>
        public InputList<Inputs.KubernetesClusterKubeConfigGetArgs> KubeConfigs
        {
            get => _kubeConfigs ?? (_kubeConfigs = new InputList<Inputs.KubernetesClusterKubeConfigGetArgs>());
            set
            {
                var emptySecret = Output.CreateSecret(ImmutableArray.Create<Inputs.KubernetesClusterKubeConfigGetArgs>());
                _kubeConfigs = Output.All(value, emptySecret).Apply(v => v[0]);
            }
        }

        /// <summary>
        /// The duration in seconds that the returned Kubernetes credentials will be valid. If not set or 0, the credentials will have a 7 day expiry.
        /// </summary>
        [Input("kubeconfigExpireSeconds")]
        public Input<int>? KubeconfigExpireSeconds { get; set; }

        /// <summary>
        /// A block representing the cluster's maintenance window. Updates will be applied within this window. If not specified, a default maintenance window will be chosen. `auto_upgrade` must be set to `true` for this to have an effect.
        /// </summary>
        [Input("maintenancePolicy")]
        public Input<Inputs.KubernetesClusterMaintenancePolicyGetArgs>? MaintenancePolicy { get; set; }

        /// <summary>
        /// A name for the Kubernetes cluster.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A block representing the cluster's default node pool. Additional node pools may be added to the cluster using the `digitalocean.KubernetesNodePool` resource. The following arguments may be specified:
        /// </summary>
        [Input("nodePool")]
        public Input<Inputs.KubernetesClusterNodePoolGetArgs>? NodePool { get; set; }

        /// <summary>
        /// The slug identifier for the region where the Kubernetes cluster will be created.
        /// </summary>
        [Input("region")]
        public InputUnion<string, Pulumi.DigitalOcean.Region>? Region { get; set; }

        /// <summary>
        /// Enables or disables the DigitalOcean container registry integration for the cluster. This requires that a container registry has first been created for the account. Default: false
        /// </summary>
        [Input("registryIntegration")]
        public Input<bool>? RegistryIntegration { get; set; }

        /// <summary>
        /// Block containing options for the routing-agent component. If not specified, the routing-agent component will not be installed in the cluster.
        /// </summary>
        [Input("routingAgent")]
        public Input<Inputs.KubernetesClusterRoutingAgentGetArgs>? RoutingAgent { get; set; }

        /// <summary>
        /// The range of assignable IP addresses for services running in the Kubernetes cluster. For more information, see [here](https://docs.digitalocean.com/products/kubernetes/how-to/create-clusters/#create-with-vpc-native).
        /// </summary>
        [Input("serviceSubnet")]
        public Input<string>? ServiceSubnet { get; set; }

        /// <summary>
        /// A string indicating the current status of the individual node.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Enable/disable surge upgrades for a cluster. Default: true
        /// </summary>
        [Input("surgeUpgrade")]
        public Input<bool>? SurgeUpgrade { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// A list of tag names to be applied to the Kubernetes cluster.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The date and time when the node was last updated.
        /// </summary>
        [Input("updatedAt")]
        public Input<string>? UpdatedAt { get; set; }

        /// <summary>
        /// The slug identifier for the version of Kubernetes used for the cluster. Use [doctl](https://github.com/digitalocean/doctl) to find the available versions `doctl kubernetes options versions`. (**Note:** A cluster may only be upgraded to newer versions in-place. If the version is decreased, a new resource will be created.)
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        /// <summary>
        /// The ID of the VPC where the Kubernetes cluster will be located.
        /// </summary>
        [Input("vpcUuid")]
        public Input<string>? VpcUuid { get; set; }

        public KubernetesClusterState()
        {
        }
        public static new KubernetesClusterState Empty => new KubernetesClusterState();
    }
}
