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
    /// Provides a DigitalOcean Kubernetes node pool resource. While the default node pool must be defined in the `digitalocean.KubernetesCluster` resource, this resource can be used to add additional ones to a cluster.
    /// 
    /// ## Example Usage
    /// 
    /// ### Basic Example
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using DigitalOcean = Pulumi.DigitalOcean;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foo = new DigitalOcean.KubernetesCluster("foo", new()
    ///     {
    ///         Name = "foo",
    ///         Region = DigitalOcean.Region.NYC1,
    ///         Version = "1.22.8-do.1",
    ///         NodePool = new DigitalOcean.Inputs.KubernetesClusterNodePoolArgs
    ///         {
    ///             Name = "front-end-pool",
    ///             Size = "s-2vcpu-2gb",
    ///             NodeCount = 3,
    ///         },
    ///     });
    /// 
    ///     var bar = new DigitalOcean.KubernetesNodePool("bar", new()
    ///     {
    ///         ClusterId = foo.Id,
    ///         Name = "backend-pool",
    ///         Size = DigitalOcean.DropletSlug.DropletC2,
    ///         NodeCount = 2,
    ///         Tags = new[]
    ///         {
    ///             "backend",
    ///         },
    ///         Labels = 
    ///         {
    ///             { "service", "backend" },
    ///             { "priority", "high" },
    ///         },
    ///         Taints = new[]
    ///         {
    ///             new DigitalOcean.Inputs.KubernetesNodePoolTaintArgs
    ///             {
    ///                 Key = "workloadKind",
    ///                 Value = "database",
    ///                 Effect = "NoSchedule",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### Autoscaling Example
    /// 
    /// Node pools may also be configured to [autoscale](https://www.digitalocean.com/docs/kubernetes/how-to/autoscale/).
    /// For example:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using DigitalOcean = Pulumi.DigitalOcean;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var autoscale_pool_01 = new DigitalOcean.KubernetesNodePool("autoscale-pool-01", new()
    ///     {
    ///         ClusterId = foo.Id,
    ///         Name = "autoscale-pool-01",
    ///         Size = DigitalOcean.DropletSlug.DropletS1VCPU2GB,
    ///         AutoScale = true,
    ///         MinNodes = 1,
    ///         MaxNodes = 5,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// If you are importing an existing Kubernetes cluster with a single node pool, just
    /// 
    /// import the cluster. Additional node pools can be imported by using their `id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import digitalocean:index/kubernetesNodePool:KubernetesNodePool mynodepool 9d76f410-9284-4436-9633-4066852442c8
    /// ```
    /// 
    /// Note: If the node pool has the `terraform:default-node-pool` tag, then it is a default node pool for an
    /// 
    /// existing cluster. The provider will refuse to import the node pool in that case because the node pool
    /// 
    /// is managed by the `digitalocean_kubernetes_cluster` resource and not by this
    /// 
    /// `digitalocean_kubernetes_node_pool` resource.
    /// </summary>
    [DigitalOceanResourceType("digitalocean:index/kubernetesNodePool:KubernetesNodePool")]
    public partial class KubernetesNodePool : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A computed field representing the actual number of nodes in the node pool, which is especially useful when auto-scaling is enabled.
        /// </summary>
        [Output("actualNodeCount")]
        public Output<int> ActualNodeCount { get; private set; } = null!;

        /// <summary>
        /// Enable auto-scaling of the number of nodes in the node pool within the given min/max range.
        /// </summary>
        [Output("autoScale")]
        public Output<bool?> AutoScale { get; private set; } = null!;

        /// <summary>
        /// The ID of the Kubernetes cluster to which the node pool is associated.
        /// </summary>
        [Output("clusterId")]
        public Output<string> ClusterId { get; private set; } = null!;

        /// <summary>
        /// A map of key/value pairs to apply to nodes in the pool. The labels are exposed in the Kubernetes API as labels in the metadata of the corresponding [Node resources](https://kubernetes.io/docs/concepts/architecture/nodes/).
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, string>?> Labels { get; private set; } = null!;

        /// <summary>
        /// If auto-scaling is enabled, this represents the maximum number of nodes that the node pool can be scaled up to.
        /// </summary>
        [Output("maxNodes")]
        public Output<int?> MaxNodes { get; private set; } = null!;

        /// <summary>
        /// If auto-scaling is enabled, this represents the minimum number of nodes that the node pool can be scaled down to.
        /// </summary>
        [Output("minNodes")]
        public Output<int?> MinNodes { get; private set; } = null!;

        /// <summary>
        /// A name for the node pool.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The number of Droplet instances in the node pool. If auto-scaling is enabled, this should only be set if the desired result is to explicitly reset the number of nodes to this value. If auto-scaling is enabled, and the node count is outside of the given min/max range, it will use the min nodes value.
        /// </summary>
        [Output("nodeCount")]
        public Output<int?> NodeCount { get; private set; } = null!;

        /// <summary>
        /// A list of nodes in the pool. Each node exports the following attributes:
        /// </summary>
        [Output("nodes")]
        public Output<ImmutableArray<Outputs.KubernetesNodePoolNode>> Nodes { get; private set; } = null!;

        /// <summary>
        /// The slug identifier for the type of Droplet to be used as workers in the node pool.
        /// </summary>
        [Output("size")]
        public Output<string> Size { get; private set; } = null!;

        /// <summary>
        /// A list of tag names to be applied to the Kubernetes cluster.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;

        /// <summary>
        /// A list of taints applied to all nodes in the pool.
        /// 
        /// This resource supports customized create timeouts. The default timeout is 30 minutes.
        /// </summary>
        [Output("taints")]
        public Output<ImmutableArray<Outputs.KubernetesNodePoolTaint>> Taints { get; private set; } = null!;


        /// <summary>
        /// Create a KubernetesNodePool resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public KubernetesNodePool(string name, KubernetesNodePoolArgs args, CustomResourceOptions? options = null)
            : base("digitalocean:index/kubernetesNodePool:KubernetesNodePool", name, args ?? new KubernetesNodePoolArgs(), MakeResourceOptions(options, ""))
        {
        }

        private KubernetesNodePool(string name, Input<string> id, KubernetesNodePoolState? state = null, CustomResourceOptions? options = null)
            : base("digitalocean:index/kubernetesNodePool:KubernetesNodePool", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing KubernetesNodePool resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static KubernetesNodePool Get(string name, Input<string> id, KubernetesNodePoolState? state = null, CustomResourceOptions? options = null)
        {
            return new KubernetesNodePool(name, id, state, options);
        }
    }

    public sealed class KubernetesNodePoolArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable auto-scaling of the number of nodes in the node pool within the given min/max range.
        /// </summary>
        [Input("autoScale")]
        public Input<bool>? AutoScale { get; set; }

        /// <summary>
        /// The ID of the Kubernetes cluster to which the node pool is associated.
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// A map of key/value pairs to apply to nodes in the pool. The labels are exposed in the Kubernetes API as labels in the metadata of the corresponding [Node resources](https://kubernetes.io/docs/concepts/architecture/nodes/).
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// If auto-scaling is enabled, this represents the maximum number of nodes that the node pool can be scaled up to.
        /// </summary>
        [Input("maxNodes")]
        public Input<int>? MaxNodes { get; set; }

        /// <summary>
        /// If auto-scaling is enabled, this represents the minimum number of nodes that the node pool can be scaled down to.
        /// </summary>
        [Input("minNodes")]
        public Input<int>? MinNodes { get; set; }

        /// <summary>
        /// A name for the node pool.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The number of Droplet instances in the node pool. If auto-scaling is enabled, this should only be set if the desired result is to explicitly reset the number of nodes to this value. If auto-scaling is enabled, and the node count is outside of the given min/max range, it will use the min nodes value.
        /// </summary>
        [Input("nodeCount")]
        public Input<int>? NodeCount { get; set; }

        /// <summary>
        /// The slug identifier for the type of Droplet to be used as workers in the node pool.
        /// </summary>
        [Input("size", required: true)]
        public InputUnion<string, Pulumi.DigitalOcean.DropletSlug> Size { get; set; } = null!;

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

        [Input("taints")]
        private InputList<Inputs.KubernetesNodePoolTaintArgs>? _taints;

        /// <summary>
        /// A list of taints applied to all nodes in the pool.
        /// 
        /// This resource supports customized create timeouts. The default timeout is 30 minutes.
        /// </summary>
        public InputList<Inputs.KubernetesNodePoolTaintArgs> Taints
        {
            get => _taints ?? (_taints = new InputList<Inputs.KubernetesNodePoolTaintArgs>());
            set => _taints = value;
        }

        public KubernetesNodePoolArgs()
        {
        }
        public static new KubernetesNodePoolArgs Empty => new KubernetesNodePoolArgs();
    }

    public sealed class KubernetesNodePoolState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A computed field representing the actual number of nodes in the node pool, which is especially useful when auto-scaling is enabled.
        /// </summary>
        [Input("actualNodeCount")]
        public Input<int>? ActualNodeCount { get; set; }

        /// <summary>
        /// Enable auto-scaling of the number of nodes in the node pool within the given min/max range.
        /// </summary>
        [Input("autoScale")]
        public Input<bool>? AutoScale { get; set; }

        /// <summary>
        /// The ID of the Kubernetes cluster to which the node pool is associated.
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// A map of key/value pairs to apply to nodes in the pool. The labels are exposed in the Kubernetes API as labels in the metadata of the corresponding [Node resources](https://kubernetes.io/docs/concepts/architecture/nodes/).
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// If auto-scaling is enabled, this represents the maximum number of nodes that the node pool can be scaled up to.
        /// </summary>
        [Input("maxNodes")]
        public Input<int>? MaxNodes { get; set; }

        /// <summary>
        /// If auto-scaling is enabled, this represents the minimum number of nodes that the node pool can be scaled down to.
        /// </summary>
        [Input("minNodes")]
        public Input<int>? MinNodes { get; set; }

        /// <summary>
        /// A name for the node pool.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The number of Droplet instances in the node pool. If auto-scaling is enabled, this should only be set if the desired result is to explicitly reset the number of nodes to this value. If auto-scaling is enabled, and the node count is outside of the given min/max range, it will use the min nodes value.
        /// </summary>
        [Input("nodeCount")]
        public Input<int>? NodeCount { get; set; }

        [Input("nodes")]
        private InputList<Inputs.KubernetesNodePoolNodeGetArgs>? _nodes;

        /// <summary>
        /// A list of nodes in the pool. Each node exports the following attributes:
        /// </summary>
        public InputList<Inputs.KubernetesNodePoolNodeGetArgs> Nodes
        {
            get => _nodes ?? (_nodes = new InputList<Inputs.KubernetesNodePoolNodeGetArgs>());
            set => _nodes = value;
        }

        /// <summary>
        /// The slug identifier for the type of Droplet to be used as workers in the node pool.
        /// </summary>
        [Input("size")]
        public InputUnion<string, Pulumi.DigitalOcean.DropletSlug>? Size { get; set; }

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

        [Input("taints")]
        private InputList<Inputs.KubernetesNodePoolTaintGetArgs>? _taints;

        /// <summary>
        /// A list of taints applied to all nodes in the pool.
        /// 
        /// This resource supports customized create timeouts. The default timeout is 30 minutes.
        /// </summary>
        public InputList<Inputs.KubernetesNodePoolTaintGetArgs> Taints
        {
            get => _taints ?? (_taints = new InputList<Inputs.KubernetesNodePoolTaintGetArgs>());
            set => _taints = value;
        }

        public KubernetesNodePoolState()
        {
        }
        public static new KubernetesNodePoolState Empty => new KubernetesNodePoolState();
    }
}
