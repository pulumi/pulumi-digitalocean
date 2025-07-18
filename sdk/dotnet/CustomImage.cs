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
    /// Provides a resource which can be used to create a [custom image](https://www.digitalocean.com/docs/images/custom-images/)
    /// from a URL. The URL must point to an image in one of the following file formats:
    /// 
    /// - Raw (.img) with an MBR or GPT partition table
    /// - qcow2
    /// - VHDX
    /// - VDI
    /// - VMDK
    /// 
    /// The image may be compressed using gzip or bzip2. See the DigitalOcean Custom
    /// Image documentation for [additional requirements](https://www.digitalocean.com/docs/images/custom-images/#image-requirements).
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
    ///     var flatcar = new DigitalOcean.CustomImage("flatcar", new()
    ///     {
    ///         Name = "flatcar",
    ///         Url = "https://stable.release.flatcar-linux.net/amd64-usr/2605.7.0/flatcar_production_digitalocean_image.bin.bz2",
    ///         Regions = new[]
    ///         {
    ///             "nyc3",
    ///         },
    ///     });
    /// 
    ///     var example = new DigitalOcean.Droplet("example", new()
    ///     {
    ///         Image = flatcar.Id,
    ///         Name = "example-01",
    ///         Region = DigitalOcean.Region.NYC3,
    ///         Size = DigitalOcean.DropletSlug.DropletS1VCPU1GB,
    ///         SshKeys = new[]
    ///         {
    ///             "12345",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [DigitalOceanResourceType("digitalocean:index/customImage:CustomImage")]
    public partial class CustomImage : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A time value given in ISO8601 combined date and time format that represents when the image was created.
        /// </summary>
        [Output("createdAt")]
        public Output<string> CreatedAt { get; private set; } = null!;

        /// <summary>
        /// An optional description for the image.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// An optional distribution name for the image. Valid values are documented [here](https://docs.digitalocean.com/reference/api/digitalocean/#tag/Images/operation/images_create_custom)
        /// </summary>
        [Output("distribution")]
        public Output<string?> Distribution { get; private set; } = null!;

        /// <summary>
        /// A unique number that can be used to identify and reference a specific image.
        /// </summary>
        [Output("imageId")]
        public Output<int> ImageId { get; private set; } = null!;

        /// <summary>
        /// The minimum disk size in GB required for a Droplet to use this image.
        /// </summary>
        [Output("minDiskSize")]
        public Output<int> MinDiskSize { get; private set; } = null!;

        /// <summary>
        /// A name for the Custom Image.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Indicates whether the image in question is public or not.
        /// </summary>
        [Output("public")]
        public Output<bool> Public { get; private set; } = null!;

        /// <summary>
        /// A list of regions. (Currently only one is supported).
        /// </summary>
        [Output("regions")]
        public Output<ImmutableArray<string>> Regions { get; private set; } = null!;

        /// <summary>
        /// The size of the image in gigabytes.
        /// </summary>
        [Output("sizeGigabytes")]
        public Output<double> SizeGigabytes { get; private set; } = null!;

        /// <summary>
        /// A uniquely identifying string for each image.
        /// </summary>
        [Output("slug")]
        public Output<string> Slug { get; private set; } = null!;

        /// <summary>
        /// A status string indicating the state of a custom image.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// A list of optional tags for the image.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;

        /// <summary>
        /// Describes the kind of image.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// A URL from which the custom Linux virtual machine image may be retrieved.
        /// </summary>
        [Output("url")]
        public Output<string> Url { get; private set; } = null!;


        /// <summary>
        /// Create a CustomImage resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CustomImage(string name, CustomImageArgs args, CustomResourceOptions? options = null)
            : base("digitalocean:index/customImage:CustomImage", name, args ?? new CustomImageArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CustomImage(string name, Input<string> id, CustomImageState? state = null, CustomResourceOptions? options = null)
            : base("digitalocean:index/customImage:CustomImage", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CustomImage resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CustomImage Get(string name, Input<string> id, CustomImageState? state = null, CustomResourceOptions? options = null)
        {
            return new CustomImage(name, id, state, options);
        }
    }

    public sealed class CustomImageArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An optional description for the image.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// An optional distribution name for the image. Valid values are documented [here](https://docs.digitalocean.com/reference/api/digitalocean/#tag/Images/operation/images_create_custom)
        /// </summary>
        [Input("distribution")]
        public Input<string>? Distribution { get; set; }

        /// <summary>
        /// A name for the Custom Image.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("regions", required: true)]
        private InputList<string>? _regions;

        /// <summary>
        /// A list of regions. (Currently only one is supported).
        /// </summary>
        public InputList<string> Regions
        {
            get => _regions ?? (_regions = new InputList<string>());
            set => _regions = value;
        }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// A list of optional tags for the image.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// A URL from which the custom Linux virtual machine image may be retrieved.
        /// </summary>
        [Input("url", required: true)]
        public Input<string> Url { get; set; } = null!;

        public CustomImageArgs()
        {
        }
        public static new CustomImageArgs Empty => new CustomImageArgs();
    }

    public sealed class CustomImageState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A time value given in ISO8601 combined date and time format that represents when the image was created.
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        /// <summary>
        /// An optional description for the image.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// An optional distribution name for the image. Valid values are documented [here](https://docs.digitalocean.com/reference/api/digitalocean/#tag/Images/operation/images_create_custom)
        /// </summary>
        [Input("distribution")]
        public Input<string>? Distribution { get; set; }

        /// <summary>
        /// A unique number that can be used to identify and reference a specific image.
        /// </summary>
        [Input("imageId")]
        public Input<int>? ImageId { get; set; }

        /// <summary>
        /// The minimum disk size in GB required for a Droplet to use this image.
        /// </summary>
        [Input("minDiskSize")]
        public Input<int>? MinDiskSize { get; set; }

        /// <summary>
        /// A name for the Custom Image.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Indicates whether the image in question is public or not.
        /// </summary>
        [Input("public")]
        public Input<bool>? Public { get; set; }

        [Input("regions")]
        private InputList<string>? _regions;

        /// <summary>
        /// A list of regions. (Currently only one is supported).
        /// </summary>
        public InputList<string> Regions
        {
            get => _regions ?? (_regions = new InputList<string>());
            set => _regions = value;
        }

        /// <summary>
        /// The size of the image in gigabytes.
        /// </summary>
        [Input("sizeGigabytes")]
        public Input<double>? SizeGigabytes { get; set; }

        /// <summary>
        /// A uniquely identifying string for each image.
        /// </summary>
        [Input("slug")]
        public Input<string>? Slug { get; set; }

        /// <summary>
        /// A status string indicating the state of a custom image.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// A list of optional tags for the image.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Describes the kind of image.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// A URL from which the custom Linux virtual machine image may be retrieved.
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        public CustomImageState()
        {
        }
        public static new CustomImageState Empty => new CustomImageState();
    }
}
