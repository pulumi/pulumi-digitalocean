// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Outputs
{

    [OutputType]
    public sealed class KubernetesNodePoolNode
    {
        /// <summary>
        /// The date and time when the node was created.
        /// </summary>
        public readonly string? CreatedAt;
        /// <summary>
        /// The id of the node's droplet
        /// </summary>
        public readonly string? DropletId;
        /// <summary>
        /// A unique ID that can be used to identify and reference the node.
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// A name for the node pool.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// A string indicating the current status of the individual node.
        /// </summary>
        public readonly string? Status;
        /// <summary>
        /// The date and time when the node was last updated.
        /// </summary>
        public readonly string? UpdatedAt;

        [OutputConstructor]
        private KubernetesNodePoolNode(
            string? createdAt,

            string? dropletId,

            string? id,

            string? name,

            string? status,

            string? updatedAt)
        {
            CreatedAt = createdAt;
            DropletId = dropletId;
            Id = id;
            Name = name;
            Status = status;
            UpdatedAt = updatedAt;
        }
    }
}