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
    /// &gt; VPC peering is currently in alpha. If you are not a member of the alpha group for this feature, you will not be able to use it until it has been more widely released. Please follow the official [DigitalOcean changelog](https://docs.digitalocean.com/release-notes/) for updates.
    /// 
    /// Provides a DigitalOcean VPC Peering resource.
    /// 
    /// VPC Peerings are used to connect two VPC networks allowing resources in each
    /// VPC to communicate with each other privately.
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
    ///     var example = new DigitalOcean.VpcPeering("example", new()
    ///     {
    ///         Name = "example-peering",
    ///         VpcIds = new[]
    ///         {
    ///             vpc1.Id,
    ///             vpc2.Id,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### Resource Assignement
    /// 
    /// You can use the VPC Peering resource to allow communication between resources
    /// in different VPCs. For example:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using DigitalOcean = Pulumi.DigitalOcean;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var vpc1 = new DigitalOcean.Vpc("vpc1", new()
    ///     {
    ///         Name = "vpc1",
    ///         Region = "nyc3",
    ///     });
    /// 
    ///     var vpc2 = new DigitalOcean.Vpc("vpc2", new()
    ///     {
    ///         Name = "vpc2",
    ///         Region = "nyc3",
    ///     });
    /// 
    ///     var example = new DigitalOcean.VpcPeering("example", new()
    ///     {
    ///         Name = "example-peering",
    ///         VpcIds = new[]
    ///         {
    ///             vpc1.Id,
    ///             vpc2.Id,
    ///         },
    ///     });
    /// 
    ///     var example1 = new DigitalOcean.Droplet("example1", new()
    ///     {
    ///         Name = "example1",
    ///         Size = DigitalOcean.DropletSlug.DropletS1VCPU1GB,
    ///         Image = "ubuntu-18-04-x64",
    ///         Region = DigitalOcean.Region.NYC3,
    ///         VpcUuid = vpc1.Id,
    ///     });
    /// 
    ///     var example2 = new DigitalOcean.Droplet("example2", new()
    ///     {
    ///         Name = "example2",
    ///         Size = DigitalOcean.DropletSlug.DropletS1VCPU1GB,
    ///         Image = "ubuntu-18-04-x64",
    ///         Region = DigitalOcean.Region.NYC3,
    ///         VpcUuid = vpc2.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// A VPC Peering can be imported using its `id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import digitalocean:index/vpcPeering:VpcPeering example 771ad360-c017-4b4e-a34e-73934f5f0190
    /// ```
    /// </summary>
    [DigitalOceanResourceType("digitalocean:index/vpcPeering:VpcPeering")]
    public partial class VpcPeering : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The date and time of when the VPC Peering was created.
        /// </summary>
        [Output("createdAt")]
        public Output<string> CreatedAt { get; private set; } = null!;

        /// <summary>
        /// A name for the VPC Peering. Must be unique and contain alphanumeric characters, dashes, and periods only.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The status of the VPC Peering.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// A set of two VPC IDs to be peered.
        /// </summary>
        [Output("vpcIds")]
        public Output<ImmutableArray<string>> VpcIds { get; private set; } = null!;


        /// <summary>
        /// Create a VpcPeering resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public VpcPeering(string name, VpcPeeringArgs args, CustomResourceOptions? options = null)
            : base("digitalocean:index/vpcPeering:VpcPeering", name, args ?? new VpcPeeringArgs(), MakeResourceOptions(options, ""))
        {
        }

        private VpcPeering(string name, Input<string> id, VpcPeeringState? state = null, CustomResourceOptions? options = null)
            : base("digitalocean:index/vpcPeering:VpcPeering", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing VpcPeering resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static VpcPeering Get(string name, Input<string> id, VpcPeeringState? state = null, CustomResourceOptions? options = null)
        {
            return new VpcPeering(name, id, state, options);
        }
    }

    public sealed class VpcPeeringArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A name for the VPC Peering. Must be unique and contain alphanumeric characters, dashes, and periods only.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("vpcIds", required: true)]
        private InputList<string>? _vpcIds;

        /// <summary>
        /// A set of two VPC IDs to be peered.
        /// </summary>
        public InputList<string> VpcIds
        {
            get => _vpcIds ?? (_vpcIds = new InputList<string>());
            set => _vpcIds = value;
        }

        public VpcPeeringArgs()
        {
        }
        public static new VpcPeeringArgs Empty => new VpcPeeringArgs();
    }

    public sealed class VpcPeeringState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The date and time of when the VPC Peering was created.
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        /// <summary>
        /// A name for the VPC Peering. Must be unique and contain alphanumeric characters, dashes, and periods only.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The status of the VPC Peering.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("vpcIds")]
        private InputList<string>? _vpcIds;

        /// <summary>
        /// A set of two VPC IDs to be peered.
        /// </summary>
        public InputList<string> VpcIds
        {
            get => _vpcIds ?? (_vpcIds = new InputList<string>());
            set => _vpcIds = value;
        }

        public VpcPeeringState()
        {
        }
        public static new VpcPeeringState Empty => new VpcPeeringState();
    }
}
