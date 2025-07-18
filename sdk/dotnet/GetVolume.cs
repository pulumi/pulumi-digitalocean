// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean
{
    public static class GetVolume
    {
        /// <summary>
        /// Get information on a volume for use in other resources. This data source provides
        /// all of the volumes properties as configured on your DigitalOcean account. This is
        /// useful if the volume in question is not managed by the provider or you need to utilize
        /// any of the volumes data.
        /// 
        /// An error is triggered if the provided volume name does not exist.
        /// 
        /// ## Example Usage
        /// 
        /// Get the volume:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetVolume.Invoke(new()
        ///     {
        ///         Name = "app-data",
        ///         Region = "nyc3",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// Reuse the data about a volume to attach it to a Droplet:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetVolume.Invoke(new()
        ///     {
        ///         Name = "app-data",
        ///         Region = "nyc3",
        ///     });
        /// 
        ///     var exampleDroplet = new DigitalOcean.Droplet("example", new()
        ///     {
        ///         Name = "foo",
        ///         Size = DigitalOcean.DropletSlug.DropletS1VCPU1GB,
        ///         Image = "ubuntu-18-04-x64",
        ///         Region = DigitalOcean.Region.NYC3,
        ///     });
        /// 
        ///     var foobar = new DigitalOcean.VolumeAttachment("foobar", new()
        ///     {
        ///         DropletId = exampleDroplet.Id,
        ///         VolumeId = example.Apply(getVolumeResult =&gt; getVolumeResult.Id),
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetVolumeResult> InvokeAsync(GetVolumeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetVolumeResult>("digitalocean:index/getVolume:getVolume", args ?? new GetVolumeArgs(), options.WithDefaults());

        /// <summary>
        /// Get information on a volume for use in other resources. This data source provides
        /// all of the volumes properties as configured on your DigitalOcean account. This is
        /// useful if the volume in question is not managed by the provider or you need to utilize
        /// any of the volumes data.
        /// 
        /// An error is triggered if the provided volume name does not exist.
        /// 
        /// ## Example Usage
        /// 
        /// Get the volume:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetVolume.Invoke(new()
        ///     {
        ///         Name = "app-data",
        ///         Region = "nyc3",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// Reuse the data about a volume to attach it to a Droplet:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetVolume.Invoke(new()
        ///     {
        ///         Name = "app-data",
        ///         Region = "nyc3",
        ///     });
        /// 
        ///     var exampleDroplet = new DigitalOcean.Droplet("example", new()
        ///     {
        ///         Name = "foo",
        ///         Size = DigitalOcean.DropletSlug.DropletS1VCPU1GB,
        ///         Image = "ubuntu-18-04-x64",
        ///         Region = DigitalOcean.Region.NYC3,
        ///     });
        /// 
        ///     var foobar = new DigitalOcean.VolumeAttachment("foobar", new()
        ///     {
        ///         DropletId = exampleDroplet.Id,
        ///         VolumeId = example.Apply(getVolumeResult =&gt; getVolumeResult.Id),
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetVolumeResult> Invoke(GetVolumeInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetVolumeResult>("digitalocean:index/getVolume:getVolume", args ?? new GetVolumeInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Get information on a volume for use in other resources. This data source provides
        /// all of the volumes properties as configured on your DigitalOcean account. This is
        /// useful if the volume in question is not managed by the provider or you need to utilize
        /// any of the volumes data.
        /// 
        /// An error is triggered if the provided volume name does not exist.
        /// 
        /// ## Example Usage
        /// 
        /// Get the volume:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetVolume.Invoke(new()
        ///     {
        ///         Name = "app-data",
        ///         Region = "nyc3",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// Reuse the data about a volume to attach it to a Droplet:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetVolume.Invoke(new()
        ///     {
        ///         Name = "app-data",
        ///         Region = "nyc3",
        ///     });
        /// 
        ///     var exampleDroplet = new DigitalOcean.Droplet("example", new()
        ///     {
        ///         Name = "foo",
        ///         Size = DigitalOcean.DropletSlug.DropletS1VCPU1GB,
        ///         Image = "ubuntu-18-04-x64",
        ///         Region = DigitalOcean.Region.NYC3,
        ///     });
        /// 
        ///     var foobar = new DigitalOcean.VolumeAttachment("foobar", new()
        ///     {
        ///         DropletId = exampleDroplet.Id,
        ///         VolumeId = example.Apply(getVolumeResult =&gt; getVolumeResult.Id),
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetVolumeResult> Invoke(GetVolumeInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetVolumeResult>("digitalocean:index/getVolume:getVolume", args ?? new GetVolumeInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetVolumeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Text describing a block storage volume.
        /// </summary>
        [Input("description")]
        public string? Description { get; set; }

        /// <summary>
        /// The name of block storage volume.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The region the block storage volume is provisioned in.
        /// </summary>
        [Input("region")]
        public string? Region { get; set; }

        public GetVolumeArgs()
        {
        }
        public static new GetVolumeArgs Empty => new GetVolumeArgs();
    }

    public sealed class GetVolumeInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Text describing a block storage volume.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of block storage volume.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The region the block storage volume is provisioned in.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        public GetVolumeInvokeArgs()
        {
        }
        public static new GetVolumeInvokeArgs Empty => new GetVolumeInvokeArgs();
    }


    [OutputType]
    public sealed class GetVolumeResult
    {
        /// <summary>
        /// Text describing a block storage volume.
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// A list of associated Droplet ids.
        /// </summary>
        public readonly ImmutableArray<int> DropletIds;
        /// <summary>
        /// Filesystem label currently in-use on the block storage volume.
        /// </summary>
        public readonly string FilesystemLabel;
        /// <summary>
        /// Filesystem type currently in-use on the block storage volume.
        /// </summary>
        public readonly string FilesystemType;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;
        public readonly string? Region;
        /// <summary>
        /// The size of the block storage volume in GiB.
        /// </summary>
        public readonly int Size;
        /// <summary>
        /// A list of the tags associated to the Volume.
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        /// <summary>
        /// The uniform resource name for the storage volume.
        /// </summary>
        public readonly string Urn;

        [OutputConstructor]
        private GetVolumeResult(
            string? description,

            ImmutableArray<int> dropletIds,

            string filesystemLabel,

            string filesystemType,

            string id,

            string name,

            string? region,

            int size,

            ImmutableArray<string> tags,

            string urn)
        {
            Description = description;
            DropletIds = dropletIds;
            FilesystemLabel = filesystemLabel;
            FilesystemType = filesystemType;
            Id = id;
            Name = name;
            Region = region;
            Size = size;
            Tags = tags;
            Urn = urn;
        }
    }
}
