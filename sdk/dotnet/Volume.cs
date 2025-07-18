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
    /// Provides a DigitalOcean Block Storage volume which can be attached to a Droplet in order to provide expanded storage.
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
    ///     var foobar = new DigitalOcean.Volume("foobar", new()
    ///     {
    ///         Region = DigitalOcean.Region.NYC1,
    ///         Name = "baz",
    ///         Size = 100,
    ///         InitialFilesystemType = DigitalOcean.FileSystemType.EXT4,
    ///         Description = "an example volume",
    ///     });
    /// 
    ///     var foobarDroplet = new DigitalOcean.Droplet("foobar", new()
    ///     {
    ///         Name = "baz",
    ///         Size = DigitalOcean.DropletSlug.DropletS1VCPU1GB,
    ///         Image = "ubuntu-18-04-x64",
    ///         Region = DigitalOcean.Region.NYC1,
    ///     });
    /// 
    ///     var foobarVolumeAttachment = new DigitalOcean.VolumeAttachment("foobar", new()
    ///     {
    ///         DropletId = foobarDroplet.Id,
    ///         VolumeId = foobar.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// You can also create a volume from an existing snapshot.
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using DigitalOcean = Pulumi.DigitalOcean;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foobar = DigitalOcean.GetVolumeSnapshot.Invoke(new()
    ///     {
    ///         Name = "baz",
    ///     });
    /// 
    ///     var foobarVolume = new DigitalOcean.Volume("foobar", new()
    ///     {
    ///         Region = DigitalOcean.Region.LON1,
    ///         Name = "foo",
    ///         Size = foobar.Apply(getVolumeSnapshotResult =&gt; getVolumeSnapshotResult.MinDiskSize),
    ///         SnapshotId = foobar.Apply(getVolumeSnapshotResult =&gt; getVolumeSnapshotResult.Id),
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Volumes can be imported using the `volume id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import digitalocean:index/volume:Volume volume 506f78a4-e098-11e5-ad9f-000f53306ae1
    /// ```
    /// </summary>
    [DigitalOceanResourceType("digitalocean:index/volume:Volume")]
    public partial class Volume : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A free-form text field up to a limit of 1024 bytes to describe a block storage volume.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// A list of associated droplet ids.
        /// </summary>
        [Output("dropletIds")]
        public Output<ImmutableArray<int>> DropletIds { get; private set; } = null!;

        /// <summary>
        /// Filesystem label for the block storage volume.
        /// </summary>
        [Output("filesystemLabel")]
        public Output<string> FilesystemLabel { get; private set; } = null!;

        /// <summary>
        /// Filesystem type (`xfs` or `ext4`) for the block storage volume.
        /// </summary>
        [Output("filesystemType")]
        public Output<string> FilesystemType { get; private set; } = null!;

        /// <summary>
        /// Initial filesystem label for the block storage volume.
        /// </summary>
        [Output("initialFilesystemLabel")]
        public Output<string?> InitialFilesystemLabel { get; private set; } = null!;

        /// <summary>
        /// Initial filesystem type (`xfs` or `ext4`) for the block storage volume.
        /// </summary>
        [Output("initialFilesystemType")]
        public Output<string?> InitialFilesystemType { get; private set; } = null!;

        /// <summary>
        /// A name for the block storage volume. Must be lowercase and be composed only of numbers, letters and "-", up to a limit of 64 characters. The name must begin with a letter.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The region that the block storage volume will be created in.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// The size of the block storage volume in GiB. If updated, can only be expanded.
        /// </summary>
        [Output("size")]
        public Output<int> Size { get; private set; } = null!;

        /// <summary>
        /// The ID of an existing volume snapshot from which the new volume will be created. If supplied, the region and size will be limited on creation to that of the referenced snapshot
        /// </summary>
        [Output("snapshotId")]
        public Output<string?> SnapshotId { get; private set; } = null!;

        /// <summary>
        /// A list of the tags to be applied to this Volume.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;

        /// <summary>
        /// The uniform resource name for the volume.
        /// </summary>
        [Output("volumeUrn")]
        public Output<string> VolumeUrn { get; private set; } = null!;


        /// <summary>
        /// Create a Volume resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Volume(string name, VolumeArgs args, CustomResourceOptions? options = null)
            : base("digitalocean:index/volume:Volume", name, args ?? new VolumeArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Volume(string name, Input<string> id, VolumeState? state = null, CustomResourceOptions? options = null)
            : base("digitalocean:index/volume:Volume", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Volume resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Volume Get(string name, Input<string> id, VolumeState? state = null, CustomResourceOptions? options = null)
        {
            return new Volume(name, id, state, options);
        }
    }

    public sealed class VolumeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A free-form text field up to a limit of 1024 bytes to describe a block storage volume.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Filesystem type (`xfs` or `ext4`) for the block storage volume.
        /// </summary>
        [Input("filesystemType")]
        public Input<string>? FilesystemType { get; set; }

        /// <summary>
        /// Initial filesystem label for the block storage volume.
        /// </summary>
        [Input("initialFilesystemLabel")]
        public Input<string>? InitialFilesystemLabel { get; set; }

        /// <summary>
        /// Initial filesystem type (`xfs` or `ext4`) for the block storage volume.
        /// </summary>
        [Input("initialFilesystemType")]
        public InputUnion<string, Pulumi.DigitalOcean.FileSystemType>? InitialFilesystemType { get; set; }

        /// <summary>
        /// A name for the block storage volume. Must be lowercase and be composed only of numbers, letters and "-", up to a limit of 64 characters. The name must begin with a letter.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The region that the block storage volume will be created in.
        /// </summary>
        [Input("region", required: true)]
        public InputUnion<string, Pulumi.DigitalOcean.Region> Region { get; set; } = null!;

        /// <summary>
        /// The size of the block storage volume in GiB. If updated, can only be expanded.
        /// </summary>
        [Input("size", required: true)]
        public Input<int> Size { get; set; } = null!;

        /// <summary>
        /// The ID of an existing volume snapshot from which the new volume will be created. If supplied, the region and size will be limited on creation to that of the referenced snapshot
        /// </summary>
        [Input("snapshotId")]
        public Input<string>? SnapshotId { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// A list of the tags to be applied to this Volume.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        public VolumeArgs()
        {
        }
        public static new VolumeArgs Empty => new VolumeArgs();
    }

    public sealed class VolumeState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A free-form text field up to a limit of 1024 bytes to describe a block storage volume.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("dropletIds")]
        private InputList<int>? _dropletIds;

        /// <summary>
        /// A list of associated droplet ids.
        /// </summary>
        public InputList<int> DropletIds
        {
            get => _dropletIds ?? (_dropletIds = new InputList<int>());
            set => _dropletIds = value;
        }

        /// <summary>
        /// Filesystem label for the block storage volume.
        /// </summary>
        [Input("filesystemLabel")]
        public Input<string>? FilesystemLabel { get; set; }

        /// <summary>
        /// Filesystem type (`xfs` or `ext4`) for the block storage volume.
        /// </summary>
        [Input("filesystemType")]
        public Input<string>? FilesystemType { get; set; }

        /// <summary>
        /// Initial filesystem label for the block storage volume.
        /// </summary>
        [Input("initialFilesystemLabel")]
        public Input<string>? InitialFilesystemLabel { get; set; }

        /// <summary>
        /// Initial filesystem type (`xfs` or `ext4`) for the block storage volume.
        /// </summary>
        [Input("initialFilesystemType")]
        public InputUnion<string, Pulumi.DigitalOcean.FileSystemType>? InitialFilesystemType { get; set; }

        /// <summary>
        /// A name for the block storage volume. Must be lowercase and be composed only of numbers, letters and "-", up to a limit of 64 characters. The name must begin with a letter.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The region that the block storage volume will be created in.
        /// </summary>
        [Input("region")]
        public InputUnion<string, Pulumi.DigitalOcean.Region>? Region { get; set; }

        /// <summary>
        /// The size of the block storage volume in GiB. If updated, can only be expanded.
        /// </summary>
        [Input("size")]
        public Input<int>? Size { get; set; }

        /// <summary>
        /// The ID of an existing volume snapshot from which the new volume will be created. If supplied, the region and size will be limited on creation to that of the referenced snapshot
        /// </summary>
        [Input("snapshotId")]
        public Input<string>? SnapshotId { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// A list of the tags to be applied to this Volume.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The uniform resource name for the volume.
        /// </summary>
        [Input("volumeUrn")]
        public Input<string>? VolumeUrn { get; set; }

        public VolumeState()
        {
        }
        public static new VolumeState Empty => new VolumeState();
    }
}
