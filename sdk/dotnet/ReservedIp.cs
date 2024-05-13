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
    /// Provides a DigitalOcean reserved IP to represent a publicly-accessible static IP addresses that can be mapped to one of your Droplets.
    /// 
    /// &gt; **NOTE:** Reserved IPs can be assigned to a Droplet either directly on the `digitalocean.ReservedIp` resource by setting a `droplet_id` or using the `digitalocean.ReservedIpAssignment` resource, but the two cannot be used together.
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
    ///     var example = new DigitalOcean.Droplet("example", new()
    ///     {
    ///         Name = "example",
    ///         Size = DigitalOcean.DropletSlug.DropletS1VCPU1GB,
    ///         Image = "ubuntu-22-04-x64",
    ///         Region = DigitalOcean.Region.NYC3,
    ///         Ipv6 = true,
    ///         PrivateNetworking = true,
    ///     });
    /// 
    ///     var exampleReservedIp = new DigitalOcean.ReservedIp("example", new()
    ///     {
    ///         DropletId = example.Id,
    ///         Region = example.Region,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Reserved IPs can be imported using the `ip`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import digitalocean:index/reservedIp:ReservedIp myip 192.168.0.1
    /// ```
    /// </summary>
    [DigitalOceanResourceType("digitalocean:index/reservedIp:ReservedIp")]
    public partial class ReservedIp : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of Droplet that the reserved IP will be assigned to.
        /// </summary>
        [Output("dropletId")]
        public Output<int?> DropletId { get; private set; } = null!;

        /// <summary>
        /// The IP Address of the resource
        /// </summary>
        [Output("ipAddress")]
        public Output<string> IpAddress { get; private set; } = null!;

        /// <summary>
        /// The region that the reserved IP is reserved to.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// The uniform resource name of the reserved ip
        /// </summary>
        [Output("reservedIpUrn")]
        public Output<string> ReservedIpUrn { get; private set; } = null!;


        /// <summary>
        /// Create a ReservedIp resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ReservedIp(string name, ReservedIpArgs args, CustomResourceOptions? options = null)
            : base("digitalocean:index/reservedIp:ReservedIp", name, args ?? new ReservedIpArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ReservedIp(string name, Input<string> id, ReservedIpState? state = null, CustomResourceOptions? options = null)
            : base("digitalocean:index/reservedIp:ReservedIp", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ReservedIp resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ReservedIp Get(string name, Input<string> id, ReservedIpState? state = null, CustomResourceOptions? options = null)
        {
            return new ReservedIp(name, id, state, options);
        }
    }

    public sealed class ReservedIpArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of Droplet that the reserved IP will be assigned to.
        /// </summary>
        [Input("dropletId")]
        public Input<int>? DropletId { get; set; }

        /// <summary>
        /// The IP Address of the resource
        /// </summary>
        [Input("ipAddress")]
        public Input<string>? IpAddress { get; set; }

        /// <summary>
        /// The region that the reserved IP is reserved to.
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        public ReservedIpArgs()
        {
        }
        public static new ReservedIpArgs Empty => new ReservedIpArgs();
    }

    public sealed class ReservedIpState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of Droplet that the reserved IP will be assigned to.
        /// </summary>
        [Input("dropletId")]
        public Input<int>? DropletId { get; set; }

        /// <summary>
        /// The IP Address of the resource
        /// </summary>
        [Input("ipAddress")]
        public Input<string>? IpAddress { get; set; }

        /// <summary>
        /// The region that the reserved IP is reserved to.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// The uniform resource name of the reserved ip
        /// </summary>
        [Input("reservedIpUrn")]
        public Input<string>? ReservedIpUrn { get; set; }

        public ReservedIpState()
        {
        }
        public static new ReservedIpState Empty => new ReservedIpState();
    }
}
