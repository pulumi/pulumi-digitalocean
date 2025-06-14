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
    /// Provides a [DigitalOcean VPC](https://docs.digitalocean.com/reference/api/digitalocean/#tag/VPCs) resource.
    /// 
    /// VPCs are virtual networks containing resources that can communicate with each
    /// other in full isolation, using private IP addresses.
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
    ///     var example = new DigitalOcean.Vpc("example", new()
    ///     {
    ///         Name = "example-project-network",
    ///         Region = "nyc3",
    ///         IpRange = "10.10.10.0/24",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### Resource Assignment
    /// 
    /// `digitalocean.Droplet`, `digitalocean.KubernetesCluster`,
    /// `digitalocean_load_balancer`, and `digitalocean.DatabaseCluster` resources
    /// may be assigned to a VPC by referencing its `id`. For example:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using DigitalOcean = Pulumi.DigitalOcean;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new DigitalOcean.Vpc("example", new()
    ///     {
    ///         Name = "example-project-network",
    ///         Region = "nyc3",
    ///     });
    /// 
    ///     var exampleDroplet = new DigitalOcean.Droplet("example", new()
    ///     {
    ///         Name = "example-01",
    ///         Size = DigitalOcean.DropletSlug.DropletS1VCPU1GB,
    ///         Image = "ubuntu-18-04-x64",
    ///         Region = DigitalOcean.Region.NYC3,
    ///         VpcUuid = example.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// A VPC can be imported using its `id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import digitalocean:index/vpc:Vpc example 506f78a4-e098-11e5-ad9f-000f53306ae1
    /// ```
    /// </summary>
    [DigitalOceanResourceType("digitalocean:index/vpc:Vpc")]
    public partial class Vpc : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The date and time of when the VPC was created.
        /// </summary>
        [Output("createdAt")]
        public Output<string> CreatedAt { get; private set; } = null!;

        /// <summary>
        /// A boolean indicating whether or not the VPC is the default one for the region.
        /// </summary>
        [Output("default")]
        public Output<bool> Default { get; private set; } = null!;

        /// <summary>
        /// A free-form text field up to a limit of 255 characters to describe the VPC.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The range of IP addresses for the VPC in CIDR notation. Network ranges cannot overlap with other networks in the same account and must be in range of private addresses as defined in RFC1918. It may not be larger than `/16` or smaller than `/24`.
        /// </summary>
        [Output("ipRange")]
        public Output<string> IpRange { get; private set; } = null!;

        /// <summary>
        /// A name for the VPC. Must be unique and contain alphanumeric characters, dashes, and periods only.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The DigitalOcean region slug for the VPC's location.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// The uniform resource name (URN) for the VPC.
        /// </summary>
        [Output("vpcUrn")]
        public Output<string> VpcUrn { get; private set; } = null!;


        /// <summary>
        /// Create a Vpc resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Vpc(string name, VpcArgs args, CustomResourceOptions? options = null)
            : base("digitalocean:index/vpc:Vpc", name, args ?? new VpcArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Vpc(string name, Input<string> id, VpcState? state = null, CustomResourceOptions? options = null)
            : base("digitalocean:index/vpc:Vpc", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Vpc resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Vpc Get(string name, Input<string> id, VpcState? state = null, CustomResourceOptions? options = null)
        {
            return new Vpc(name, id, state, options);
        }
    }

    public sealed class VpcArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A free-form text field up to a limit of 255 characters to describe the VPC.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The range of IP addresses for the VPC in CIDR notation. Network ranges cannot overlap with other networks in the same account and must be in range of private addresses as defined in RFC1918. It may not be larger than `/16` or smaller than `/24`.
        /// </summary>
        [Input("ipRange")]
        public Input<string>? IpRange { get; set; }

        /// <summary>
        /// A name for the VPC. Must be unique and contain alphanumeric characters, dashes, and periods only.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The DigitalOcean region slug for the VPC's location.
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        public VpcArgs()
        {
        }
        public static new VpcArgs Empty => new VpcArgs();
    }

    public sealed class VpcState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The date and time of when the VPC was created.
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        /// <summary>
        /// A boolean indicating whether or not the VPC is the default one for the region.
        /// </summary>
        [Input("default")]
        public Input<bool>? Default { get; set; }

        /// <summary>
        /// A free-form text field up to a limit of 255 characters to describe the VPC.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The range of IP addresses for the VPC in CIDR notation. Network ranges cannot overlap with other networks in the same account and must be in range of private addresses as defined in RFC1918. It may not be larger than `/16` or smaller than `/24`.
        /// </summary>
        [Input("ipRange")]
        public Input<string>? IpRange { get; set; }

        /// <summary>
        /// A name for the VPC. Must be unique and contain alphanumeric characters, dashes, and periods only.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The DigitalOcean region slug for the VPC's location.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// The uniform resource name (URN) for the VPC.
        /// </summary>
        [Input("vpcUrn")]
        public Input<string>? VpcUrn { get; set; }

        public VpcState()
        {
        }
        public static new VpcState Empty => new VpcState();
    }
}
