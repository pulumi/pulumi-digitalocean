// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Outputs
{

    [OutputType]
    public sealed class KubernetesClusterNodePool
    {
        /// <summary>
        /// A computed field representing the actual number of nodes in the node pool, which is especially useful when auto-scaling is enabled.
        /// </summary>
        public readonly int? ActualNodeCount;
        /// <summary>
        /// Enable auto-scaling of the number of nodes in the node pool within the given min/max range.
        /// </summary>
        public readonly bool? AutoScale;
        /// <summary>
        /// A unique ID that can be used to identify and reference the node.
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// A map of key/value pairs to apply to nodes in the pool. The labels are exposed in the Kubernetes API as labels in the metadata of the corresponding [Node resources](https://kubernetes.io/docs/concepts/architecture/nodes/).
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Labels;
        /// <summary>
        /// If auto-scaling is enabled, this represents the maximum number of nodes that the node pool can be scaled up to.
        /// </summary>
        public readonly int? MaxNodes;
        /// <summary>
        /// If auto-scaling is enabled, this represents the minimum number of nodes that the node pool can be scaled down to.
        /// </summary>
        public readonly int? MinNodes;
        /// <summary>
        /// A name for the node pool.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The number of Droplet instances in the node pool. If auto-scaling is enabled, this should only be set if the desired result is to explicitly reset the number of nodes to this value. If auto-scaling is enabled, and the node count is outside of the given min/max range, it will use the min nodes value.
        /// </summary>
        public readonly int? NodeCount;
        /// <summary>
        /// A list of nodes in the pool. Each node exports the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.KubernetesClusterNodePoolNode> Nodes;
        /// <summary>
        /// The slug identifier for the type of Droplet to be used as workers in the node pool.
        /// </summary>
        public readonly string Size;
        /// <summary>
        /// A list of tag names applied to the node pool.
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        /// <summary>
        /// A block representing a taint applied to all nodes in the pool. Each taint exports the following attributes (taints must be unique by key and effect pair):
        /// </summary>
        public readonly ImmutableArray<Outputs.KubernetesClusterNodePoolTaint> Taints;

        [OutputConstructor]
        private KubernetesClusterNodePool(
            int? actualNodeCount,

            bool? autoScale,

            string? id,

            ImmutableDictionary<string, string>? labels,

            int? maxNodes,

            int? minNodes,

            string name,

            int? nodeCount,

            ImmutableArray<Outputs.KubernetesClusterNodePoolNode> nodes,

            string size,

            ImmutableArray<string> tags,

            ImmutableArray<Outputs.KubernetesClusterNodePoolTaint> taints)
        {
            ActualNodeCount = actualNodeCount;
            AutoScale = autoScale;
            Id = id;
            Labels = labels;
            MaxNodes = maxNodes;
            MinNodes = minNodes;
            Name = name;
            NodeCount = nodeCount;
            Nodes = nodes;
            Size = size;
            Tags = tags;
            Taints = taints;
        }
    }
}
