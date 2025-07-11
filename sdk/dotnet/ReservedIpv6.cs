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
    /// Provides a DigitalOcean reserved IPv6 to represent a publicly-accessible static IPv6 addresses that can be mapped to one of your Droplets.
    /// 
    /// &gt; **NOTE:** Reserved IPv6s can be assigned to a Droplet using
    /// `digitalocean.ReservedIpv6Assignment` resource only.
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
    ///     var foobar = new DigitalOcean.ReservedIpv6("foobar", new()
    ///     {
    ///         RegionSlug = "nyc3",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Reserved IPv6s can be imported using the `ip`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import digitalocean:index/reservedIpv6:ReservedIpv6 myip 
    /// ```
    /// 
    /// 2409:40d0:fa:27dd:9b24:7074:7b85:eee6
    /// </summary>
    [DigitalOceanResourceType("digitalocean:index/reservedIpv6:ReservedIpv6")]
    public partial class ReservedIpv6 : global::Pulumi.CustomResource
    {
        [Output("dropletId")]
        public Output<int> DropletId { get; private set; } = null!;

        [Output("ip")]
        public Output<string> Ip { get; private set; } = null!;

        /// <summary>
        /// The region that the reserved IPv6 needs to be reserved to.
        /// </summary>
        [Output("regionSlug")]
        public Output<string> RegionSlug { get; private set; } = null!;

        /// <summary>
        /// the uniform resource name for the reserved ipv6
        /// </summary>
        [Output("reservedIpv6Urn")]
        public Output<string> ReservedIpv6Urn { get; private set; } = null!;


        /// <summary>
        /// Create a ReservedIpv6 resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ReservedIpv6(string name, ReservedIpv6Args args, CustomResourceOptions? options = null)
            : base("digitalocean:index/reservedIpv6:ReservedIpv6", name, args ?? new ReservedIpv6Args(), MakeResourceOptions(options, ""))
        {
        }

        private ReservedIpv6(string name, Input<string> id, ReservedIpv6State? state = null, CustomResourceOptions? options = null)
            : base("digitalocean:index/reservedIpv6:ReservedIpv6", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ReservedIpv6 resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ReservedIpv6 Get(string name, Input<string> id, ReservedIpv6State? state = null, CustomResourceOptions? options = null)
        {
            return new ReservedIpv6(name, id, state, options);
        }
    }

    public sealed class ReservedIpv6Args : global::Pulumi.ResourceArgs
    {
        [Input("dropletId")]
        public Input<int>? DropletId { get; set; }

        [Input("ip")]
        public Input<string>? Ip { get; set; }

        /// <summary>
        /// The region that the reserved IPv6 needs to be reserved to.
        /// </summary>
        [Input("regionSlug", required: true)]
        public Input<string> RegionSlug { get; set; } = null!;

        public ReservedIpv6Args()
        {
        }
        public static new ReservedIpv6Args Empty => new ReservedIpv6Args();
    }

    public sealed class ReservedIpv6State : global::Pulumi.ResourceArgs
    {
        [Input("dropletId")]
        public Input<int>? DropletId { get; set; }

        [Input("ip")]
        public Input<string>? Ip { get; set; }

        /// <summary>
        /// The region that the reserved IPv6 needs to be reserved to.
        /// </summary>
        [Input("regionSlug")]
        public Input<string>? RegionSlug { get; set; }

        /// <summary>
        /// the uniform resource name for the reserved ipv6
        /// </summary>
        [Input("reservedIpv6Urn")]
        public Input<string>? ReservedIpv6Urn { get; set; }

        public ReservedIpv6State()
        {
        }
        public static new ReservedIpv6State Empty => new ReservedIpv6State();
    }
}
