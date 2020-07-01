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
    /// Provides a DigitalOcean Droplet resource. This can be used to create,
    /// modify, and delete Droplets. Droplets also support
    /// [provisioning](https://www.terraform.io/docs/provisioners/index.html).
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using DigitalOcean = Pulumi.DigitalOcean;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         // Create a new Web Droplet in the nyc2 region
    ///         var web = new DigitalOcean.Droplet("web", new DigitalOcean.DropletArgs
    ///         {
    ///             Image = "ubuntu-18-04-x64",
    ///             Region = "nyc2",
    ///             Size = "s-1vcpu-1gb",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    public partial class Droplet : Pulumi.CustomResource
    {
        /// <summary>
        /// Boolean controlling if backups are made. Defaults to
        /// false.
        /// </summary>
        [Output("backups")]
        public Output<bool?> Backups { get; private set; } = null!;

        [Output("createdAt")]
        public Output<string> CreatedAt { get; private set; } = null!;

        /// <summary>
        /// The size of the instance's disk in GB
        /// </summary>
        [Output("disk")]
        public Output<int> Disk { get; private set; } = null!;

        /// <summary>
        /// The uniform resource name of the Droplet
        /// * `name`- The name of the Droplet
        /// </summary>
        [Output("dropletUrn")]
        public Output<string> DropletUrn { get; private set; } = null!;

        /// <summary>
        /// The Droplet image ID or slug.
        /// </summary>
        [Output("image")]
        public Output<string> Image { get; private set; } = null!;

        /// <summary>
        /// The IPv4 address
        /// </summary>
        [Output("ipv4Address")]
        public Output<string> Ipv4Address { get; private set; } = null!;

        /// <summary>
        /// The private networking IPv4 address
        /// </summary>
        [Output("ipv4AddressPrivate")]
        public Output<string> Ipv4AddressPrivate { get; private set; } = null!;

        /// <summary>
        /// Boolean controlling if IPv6 is enabled. Defaults to false.
        /// </summary>
        [Output("ipv6")]
        public Output<bool?> Ipv6 { get; private set; } = null!;

        /// <summary>
        /// The IPv6 address
        /// </summary>
        [Output("ipv6Address")]
        public Output<string> Ipv6Address { get; private set; } = null!;

        /// <summary>
        /// Is the Droplet locked
        /// </summary>
        [Output("locked")]
        public Output<bool> Locked { get; private set; } = null!;

        [Output("memory")]
        public Output<int> Memory { get; private set; } = null!;

        /// <summary>
        /// Boolean controlling whether monitoring agent is installed.
        /// Defaults to false.
        /// </summary>
        [Output("monitoring")]
        public Output<bool?> Monitoring { get; private set; } = null!;

        /// <summary>
        /// The Droplet name.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Droplet hourly price
        /// </summary>
        [Output("priceHourly")]
        public Output<double> PriceHourly { get; private set; } = null!;

        /// <summary>
        /// Droplet monthly price
        /// </summary>
        [Output("priceMonthly")]
        public Output<double> PriceMonthly { get; private set; } = null!;

        /// <summary>
        /// Boolean controlling if private networking
        /// is enabled. When VPC is enabled on an account, this will provision the
        /// Droplet inside of your account's default VPC for the region. Use the
        /// `vpc_uuid` attribute to specify a different VPC.
        /// </summary>
        [Output("privateNetworking")]
        public Output<bool> PrivateNetworking { get; private set; } = null!;

        /// <summary>
        /// The region to start in.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// Boolean controlling whether to increase the disk
        /// size when resizing a Droplet. It defaults to `true`. When set to `false`,
        /// only the Droplet's RAM and CPU will be resized. **Increasing a Droplet's disk
        /// size is a permanent change**. Increasing only RAM and CPU is reversible.
        /// </summary>
        [Output("resizeDisk")]
        public Output<bool?> ResizeDisk { get; private set; } = null!;

        /// <summary>
        /// The unique slug that indentifies the type of Droplet. You can find a list of available slugs on [DigitalOcean API documentation](https://developers.digitalocean.com/documentation/v2/#list-all-sizes).
        /// </summary>
        [Output("size")]
        public Output<string> Size { get; private set; } = null!;

        /// <summary>
        /// A list of SSH IDs or fingerprints to enable in
        /// the format `[12345, 123456]`. To retrieve this info, use a tool such
        /// as `curl` with the [DigitalOcean API](https://developers.digitalocean.com/documentation/v2/#ssh-keys),
        /// to retrieve them.
        /// </summary>
        [Output("sshKeys")]
        public Output<ImmutableArray<string>> SshKeys { get; private set; } = null!;

        /// <summary>
        /// The status of the Droplet
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// A list of the tags to be applied to this Droplet.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;

        /// <summary>
        /// A string of the desired User Data for the Droplet.
        /// </summary>
        [Output("userData")]
        public Output<string?> UserData { get; private set; } = null!;

        /// <summary>
        /// The number of the instance's virtual CPUs
        /// </summary>
        [Output("vcpus")]
        public Output<int> Vcpus { get; private set; } = null!;

        /// <summary>
        /// A list of the IDs of each [block storage volume](https://www.terraform.io/docs/providers/do/r/volume.html) to be attached to the Droplet.
        /// </summary>
        [Output("volumeIds")]
        public Output<ImmutableArray<string>> VolumeIds { get; private set; } = null!;

        /// <summary>
        /// The ID of the VPC where the Droplet will be located.
        /// </summary>
        [Output("vpcUuid")]
        public Output<string> VpcUuid { get; private set; } = null!;


        /// <summary>
        /// Create a Droplet resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Droplet(string name, DropletArgs args, CustomResourceOptions? options = null)
            : base("digitalocean:index/droplet:Droplet", name, args ?? new DropletArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Droplet(string name, Input<string> id, DropletState? state = null, CustomResourceOptions? options = null)
            : base("digitalocean:index/droplet:Droplet", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Droplet resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Droplet Get(string name, Input<string> id, DropletState? state = null, CustomResourceOptions? options = null)
        {
            return new Droplet(name, id, state, options);
        }
    }

    public sealed class DropletArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Boolean controlling if backups are made. Defaults to
        /// false.
        /// </summary>
        [Input("backups")]
        public Input<bool>? Backups { get; set; }

        /// <summary>
        /// The Droplet image ID or slug.
        /// </summary>
        [Input("image", required: true)]
        public Input<string> Image { get; set; } = null!;

        /// <summary>
        /// Boolean controlling if IPv6 is enabled. Defaults to false.
        /// </summary>
        [Input("ipv6")]
        public Input<bool>? Ipv6 { get; set; }

        /// <summary>
        /// Boolean controlling whether monitoring agent is installed.
        /// Defaults to false.
        /// </summary>
        [Input("monitoring")]
        public Input<bool>? Monitoring { get; set; }

        /// <summary>
        /// The Droplet name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Boolean controlling if private networking
        /// is enabled. When VPC is enabled on an account, this will provision the
        /// Droplet inside of your account's default VPC for the region. Use the
        /// `vpc_uuid` attribute to specify a different VPC.
        /// </summary>
        [Input("privateNetworking")]
        public Input<bool>? PrivateNetworking { get; set; }

        /// <summary>
        /// The region to start in.
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        /// <summary>
        /// Boolean controlling whether to increase the disk
        /// size when resizing a Droplet. It defaults to `true`. When set to `false`,
        /// only the Droplet's RAM and CPU will be resized. **Increasing a Droplet's disk
        /// size is a permanent change**. Increasing only RAM and CPU is reversible.
        /// </summary>
        [Input("resizeDisk")]
        public Input<bool>? ResizeDisk { get; set; }

        /// <summary>
        /// The unique slug that indentifies the type of Droplet. You can find a list of available slugs on [DigitalOcean API documentation](https://developers.digitalocean.com/documentation/v2/#list-all-sizes).
        /// </summary>
        [Input("size", required: true)]
        public Input<string> Size { get; set; } = null!;

        [Input("sshKeys")]
        private InputList<string>? _sshKeys;

        /// <summary>
        /// A list of SSH IDs or fingerprints to enable in
        /// the format `[12345, 123456]`. To retrieve this info, use a tool such
        /// as `curl` with the [DigitalOcean API](https://developers.digitalocean.com/documentation/v2/#ssh-keys),
        /// to retrieve them.
        /// </summary>
        public InputList<string> SshKeys
        {
            get => _sshKeys ?? (_sshKeys = new InputList<string>());
            set => _sshKeys = value;
        }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// A list of the tags to be applied to this Droplet.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// A string of the desired User Data for the Droplet.
        /// </summary>
        [Input("userData")]
        public Input<string>? UserData { get; set; }

        [Input("volumeIds")]
        private InputList<string>? _volumeIds;

        /// <summary>
        /// A list of the IDs of each [block storage volume](https://www.terraform.io/docs/providers/do/r/volume.html) to be attached to the Droplet.
        /// </summary>
        public InputList<string> VolumeIds
        {
            get => _volumeIds ?? (_volumeIds = new InputList<string>());
            set => _volumeIds = value;
        }

        /// <summary>
        /// The ID of the VPC where the Droplet will be located.
        /// </summary>
        [Input("vpcUuid")]
        public Input<string>? VpcUuid { get; set; }

        public DropletArgs()
        {
        }
    }

    public sealed class DropletState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Boolean controlling if backups are made. Defaults to
        /// false.
        /// </summary>
        [Input("backups")]
        public Input<bool>? Backups { get; set; }

        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        /// <summary>
        /// The size of the instance's disk in GB
        /// </summary>
        [Input("disk")]
        public Input<int>? Disk { get; set; }

        /// <summary>
        /// The uniform resource name of the Droplet
        /// * `name`- The name of the Droplet
        /// </summary>
        [Input("dropletUrn")]
        public Input<string>? DropletUrn { get; set; }

        /// <summary>
        /// The Droplet image ID or slug.
        /// </summary>
        [Input("image")]
        public Input<string>? Image { get; set; }

        /// <summary>
        /// The IPv4 address
        /// </summary>
        [Input("ipv4Address")]
        public Input<string>? Ipv4Address { get; set; }

        /// <summary>
        /// The private networking IPv4 address
        /// </summary>
        [Input("ipv4AddressPrivate")]
        public Input<string>? Ipv4AddressPrivate { get; set; }

        /// <summary>
        /// Boolean controlling if IPv6 is enabled. Defaults to false.
        /// </summary>
        [Input("ipv6")]
        public Input<bool>? Ipv6 { get; set; }

        /// <summary>
        /// The IPv6 address
        /// </summary>
        [Input("ipv6Address")]
        public Input<string>? Ipv6Address { get; set; }

        /// <summary>
        /// Is the Droplet locked
        /// </summary>
        [Input("locked")]
        public Input<bool>? Locked { get; set; }

        [Input("memory")]
        public Input<int>? Memory { get; set; }

        /// <summary>
        /// Boolean controlling whether monitoring agent is installed.
        /// Defaults to false.
        /// </summary>
        [Input("monitoring")]
        public Input<bool>? Monitoring { get; set; }

        /// <summary>
        /// The Droplet name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Droplet hourly price
        /// </summary>
        [Input("priceHourly")]
        public Input<double>? PriceHourly { get; set; }

        /// <summary>
        /// Droplet monthly price
        /// </summary>
        [Input("priceMonthly")]
        public Input<double>? PriceMonthly { get; set; }

        /// <summary>
        /// Boolean controlling if private networking
        /// is enabled. When VPC is enabled on an account, this will provision the
        /// Droplet inside of your account's default VPC for the region. Use the
        /// `vpc_uuid` attribute to specify a different VPC.
        /// </summary>
        [Input("privateNetworking")]
        public Input<bool>? PrivateNetworking { get; set; }

        /// <summary>
        /// The region to start in.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// Boolean controlling whether to increase the disk
        /// size when resizing a Droplet. It defaults to `true`. When set to `false`,
        /// only the Droplet's RAM and CPU will be resized. **Increasing a Droplet's disk
        /// size is a permanent change**. Increasing only RAM and CPU is reversible.
        /// </summary>
        [Input("resizeDisk")]
        public Input<bool>? ResizeDisk { get; set; }

        /// <summary>
        /// The unique slug that indentifies the type of Droplet. You can find a list of available slugs on [DigitalOcean API documentation](https://developers.digitalocean.com/documentation/v2/#list-all-sizes).
        /// </summary>
        [Input("size")]
        public Input<string>? Size { get; set; }

        [Input("sshKeys")]
        private InputList<string>? _sshKeys;

        /// <summary>
        /// A list of SSH IDs or fingerprints to enable in
        /// the format `[12345, 123456]`. To retrieve this info, use a tool such
        /// as `curl` with the [DigitalOcean API](https://developers.digitalocean.com/documentation/v2/#ssh-keys),
        /// to retrieve them.
        /// </summary>
        public InputList<string> SshKeys
        {
            get => _sshKeys ?? (_sshKeys = new InputList<string>());
            set => _sshKeys = value;
        }

        /// <summary>
        /// The status of the Droplet
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// A list of the tags to be applied to this Droplet.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// A string of the desired User Data for the Droplet.
        /// </summary>
        [Input("userData")]
        public Input<string>? UserData { get; set; }

        /// <summary>
        /// The number of the instance's virtual CPUs
        /// </summary>
        [Input("vcpus")]
        public Input<int>? Vcpus { get; set; }

        [Input("volumeIds")]
        private InputList<string>? _volumeIds;

        /// <summary>
        /// A list of the IDs of each [block storage volume](https://www.terraform.io/docs/providers/do/r/volume.html) to be attached to the Droplet.
        /// </summary>
        public InputList<string> VolumeIds
        {
            get => _volumeIds ?? (_volumeIds = new InputList<string>());
            set => _volumeIds = value;
        }

        /// <summary>
        /// The ID of the VPC where the Droplet will be located.
        /// </summary>
        [Input("vpcUuid")]
        public Input<string>? VpcUuid { get; set; }

        public DropletState()
        {
        }
    }
}
