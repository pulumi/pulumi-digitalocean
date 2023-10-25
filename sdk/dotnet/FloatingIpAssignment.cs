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
    /// &gt; **Deprecated:** DigitalOcean Floating IPs have been renamed reserved IPs. This resource will be removed in a future release. Please use `digitalocean.ReservedIpAssignment` instead.
    /// 
    /// Provides a resource for assigning an existing DigitalOcean Floating IP to a Droplet. This
    /// makes it easy to provision floating IP addresses that are not tied to the lifecycle of your
    /// Droplet.
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
    ///     var foobarFloatingIp = new DigitalOcean.FloatingIp("foobarFloatingIp", new()
    ///     {
    ///         Region = "sgp1",
    ///     });
    /// 
    ///     var foobarDroplet = new DigitalOcean.Droplet("foobarDroplet", new()
    ///     {
    ///         Size = "s-1vcpu-1gb",
    ///         Image = "ubuntu-18-04-x64",
    ///         Region = "sgp1",
    ///         Ipv6 = true,
    ///         PrivateNetworking = true,
    ///     });
    /// 
    ///     var foobarFloatingIpAssignment = new DigitalOcean.FloatingIpAssignment("foobarFloatingIpAssignment", new()
    ///     {
    ///         IpAddress = foobarFloatingIp.IpAddress,
    ///         DropletId = foobarDroplet.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Floating IP assignments can be imported using the Floating IP itself and the `id` of the Droplet joined with a comma. For example
    /// 
    /// ```sh
    ///  $ pulumi import digitalocean:index/floatingIpAssignment:FloatingIpAssignment foobar 192.0.2.1,123456
    /// ```
    /// </summary>
    [DigitalOceanResourceType("digitalocean:index/floatingIpAssignment:FloatingIpAssignment")]
    public partial class FloatingIpAssignment : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of Droplet that the Floating IP will be assigned to.
        /// </summary>
        [Output("dropletId")]
        public Output<int> DropletId { get; private set; } = null!;

        /// <summary>
        /// The Floating IP to assign to the Droplet.
        /// </summary>
        [Output("ipAddress")]
        public Output<string> IpAddress { get; private set; } = null!;


        /// <summary>
        /// Create a FloatingIpAssignment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public FloatingIpAssignment(string name, FloatingIpAssignmentArgs args, CustomResourceOptions? options = null)
            : base("digitalocean:index/floatingIpAssignment:FloatingIpAssignment", name, args ?? new FloatingIpAssignmentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private FloatingIpAssignment(string name, Input<string> id, FloatingIpAssignmentState? state = null, CustomResourceOptions? options = null)
            : base("digitalocean:index/floatingIpAssignment:FloatingIpAssignment", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing FloatingIpAssignment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static FloatingIpAssignment Get(string name, Input<string> id, FloatingIpAssignmentState? state = null, CustomResourceOptions? options = null)
        {
            return new FloatingIpAssignment(name, id, state, options);
        }
    }

    public sealed class FloatingIpAssignmentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of Droplet that the Floating IP will be assigned to.
        /// </summary>
        [Input("dropletId", required: true)]
        public Input<int> DropletId { get; set; } = null!;

        /// <summary>
        /// The Floating IP to assign to the Droplet.
        /// </summary>
        [Input("ipAddress", required: true)]
        public Input<string> IpAddress { get; set; } = null!;

        public FloatingIpAssignmentArgs()
        {
        }
        public static new FloatingIpAssignmentArgs Empty => new FloatingIpAssignmentArgs();
    }

    public sealed class FloatingIpAssignmentState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of Droplet that the Floating IP will be assigned to.
        /// </summary>
        [Input("dropletId")]
        public Input<int>? DropletId { get; set; }

        /// <summary>
        /// The Floating IP to assign to the Droplet.
        /// </summary>
        [Input("ipAddress")]
        public Input<string>? IpAddress { get; set; }

        public FloatingIpAssignmentState()
        {
        }
        public static new FloatingIpAssignmentState Empty => new FloatingIpAssignmentState();
    }
}
