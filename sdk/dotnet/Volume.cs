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
    /// Provides a DigitalOcean Block Storage volume which can be attached to a Droplet in order to provide expanded storage.
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
    ///         var foobarVolume = new DigitalOcean.Volume("foobarVolume", new DigitalOcean.VolumeArgs
    ///         {
    ///             Region = "nyc1",
    ///             Size = 100,
    ///             InitialFilesystemType = "ext4",
    ///             Description = "an example volume",
    ///         });
    ///         var foobarDroplet = new DigitalOcean.Droplet("foobarDroplet", new DigitalOcean.DropletArgs
    ///         {
    ///             Size = "s-1vcpu-1gb",
    ///             Image = "ubuntu-18-04-x64",
    ///             Region = "nyc1",
    ///         });
    ///         var foobarVolumeAttachment = new DigitalOcean.VolumeAttachment("foobarVolumeAttachment", new DigitalOcean.VolumeAttachmentArgs
    ///         {
    ///             DropletId = foobarDroplet.Id,
    ///             VolumeId = foobarVolume.Id,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// You can also create a volume from an existing snapshot.
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using DigitalOcean = Pulumi.DigitalOcean;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var foobarVolumeSnapshot = Output.Create(DigitalOcean.GetVolumeSnapshot.InvokeAsync(new DigitalOcean.GetVolumeSnapshotArgs
    ///         {
    ///             Name = "baz",
    ///         }));
    ///         var foobarVolume = new DigitalOcean.Volume("foobarVolume", new DigitalOcean.VolumeArgs
    ///         {
    ///             Region = "lon1",
    ///             Size = foobarVolumeSnapshot.Apply(foobarVolumeSnapshot =&gt; foobarVolumeSnapshot.MinDiskSize),
    ///             SnapshotId = foobarVolumeSnapshot.Apply(foobarVolumeSnapshot =&gt; foobarVolumeSnapshot.Id),
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Volumes can be imported using the `volume id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import digitalocean:index/volume:Volume volume 506f78a4-e098-11e5-ad9f-000f53306ae1
    /// ```
    /// </summary>
    [DigitalOceanResourceType("digitalocean:index/volume:Volume")]
    public partial class Volume : Pulumi.CustomResource
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
        /// A name for the block storage volume. Must be lowercase and be composed only of numbers, letters and "-", up to a limit of 64 characters.
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
        /// The ID of an existing volume snapshot from which the new volume will be created. If supplied, the region and size will be limitied on creation to that of the referenced snapshot
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

    public sealed class VolumeArgs : Pulumi.ResourceArgs
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
        public Input<string>? InitialFilesystemType { get; set; }

        /// <summary>
        /// A name for the block storage volume. Must be lowercase and be composed only of numbers, letters and "-", up to a limit of 64 characters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The region that the block storage volume will be created in.
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        /// <summary>
        /// The size of the block storage volume in GiB. If updated, can only be expanded.
        /// </summary>
        [Input("size", required: true)]
        public Input<int> Size { get; set; } = null!;

        /// <summary>
        /// The ID of an existing volume snapshot from which the new volume will be created. If supplied, the region and size will be limitied on creation to that of the referenced snapshot
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
    }

    public sealed class VolumeState : Pulumi.ResourceArgs
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
        public Input<string>? InitialFilesystemType { get; set; }

        /// <summary>
        /// A name for the block storage volume. Must be lowercase and be composed only of numbers, letters and "-", up to a limit of 64 characters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The region that the block storage volume will be created in.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// The size of the block storage volume in GiB. If updated, can only be expanded.
        /// </summary>
        [Input("size")]
        public Input<int>? Size { get; set; }

        /// <summary>
        /// The ID of an existing volume snapshot from which the new volume will be created. If supplied, the region and size will be limitied on creation to that of the referenced snapshot
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
    }
}
