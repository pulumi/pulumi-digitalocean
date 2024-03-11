// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean
{
    public static class GetVolumeSnapshot
    {
        /// <summary>
        /// Volume snapshots are saved instances of a block storage volume. Use this data
        /// source to retrieve the ID of a DigitalOcean volume snapshot for use in other
        /// resources.
        /// 
        /// ## Example Usage
        /// 
        /// Get the volume snapshot:
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var snapshot = DigitalOcean.GetVolumeSnapshot.Invoke(new()
        ///     {
        ///         MostRecent = true,
        ///         NameRegex = "^web",
        ///         Region = "nyc3",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// 
        /// Reuse the data about a volume snapshot to create a new volume based on it:
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var snapshot = DigitalOcean.GetVolumeSnapshot.Invoke(new()
        ///     {
        ///         NameRegex = "^web",
        ///         Region = "nyc3",
        ///         MostRecent = true,
        ///     });
        /// 
        ///     var foobar = new DigitalOcean.Volume("foobar", new()
        ///     {
        ///         Region = "nyc3",
        ///         Size = 100,
        ///         SnapshotId = snapshot.Apply(getVolumeSnapshotResult =&gt; getVolumeSnapshotResult.Id),
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetVolumeSnapshotResult> InvokeAsync(GetVolumeSnapshotArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetVolumeSnapshotResult>("digitalocean:index/getVolumeSnapshot:getVolumeSnapshot", args ?? new GetVolumeSnapshotArgs(), options.WithDefaults());

        /// <summary>
        /// Volume snapshots are saved instances of a block storage volume. Use this data
        /// source to retrieve the ID of a DigitalOcean volume snapshot for use in other
        /// resources.
        /// 
        /// ## Example Usage
        /// 
        /// Get the volume snapshot:
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var snapshot = DigitalOcean.GetVolumeSnapshot.Invoke(new()
        ///     {
        ///         MostRecent = true,
        ///         NameRegex = "^web",
        ///         Region = "nyc3",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// 
        /// Reuse the data about a volume snapshot to create a new volume based on it:
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var snapshot = DigitalOcean.GetVolumeSnapshot.Invoke(new()
        ///     {
        ///         NameRegex = "^web",
        ///         Region = "nyc3",
        ///         MostRecent = true,
        ///     });
        /// 
        ///     var foobar = new DigitalOcean.Volume("foobar", new()
        ///     {
        ///         Region = "nyc3",
        ///         Size = 100,
        ///         SnapshotId = snapshot.Apply(getVolumeSnapshotResult =&gt; getVolumeSnapshotResult.Id),
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetVolumeSnapshotResult> Invoke(GetVolumeSnapshotInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetVolumeSnapshotResult>("digitalocean:index/getVolumeSnapshot:getVolumeSnapshot", args ?? new GetVolumeSnapshotInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetVolumeSnapshotArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// If more than one result is returned, use the most recent volume snapshot.
        /// 
        /// &gt; **NOTE:** If more or less than a single match is returned by the search,
        /// the provider will fail. Ensure that your search is specific enough to return
        /// a single volume snapshot ID only, or use `most_recent` to choose the most recent one.
        /// </summary>
        [Input("mostRecent")]
        public bool? MostRecent { get; set; }

        /// <summary>
        /// The name of the volume snapshot.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// A regex string to apply to the volume snapshot list returned by DigitalOcean. This allows more advanced filtering not supported from the DigitalOcean API. This filtering is done locally on what DigitalOcean returns.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// A "slug" representing a DigitalOcean region (e.g. `nyc1`). If set, only volume snapshots available in the region will be returned.
        /// </summary>
        [Input("region")]
        public string? Region { get; set; }

        public GetVolumeSnapshotArgs()
        {
        }
        public static new GetVolumeSnapshotArgs Empty => new GetVolumeSnapshotArgs();
    }

    public sealed class GetVolumeSnapshotInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// If more than one result is returned, use the most recent volume snapshot.
        /// 
        /// &gt; **NOTE:** If more or less than a single match is returned by the search,
        /// the provider will fail. Ensure that your search is specific enough to return
        /// a single volume snapshot ID only, or use `most_recent` to choose the most recent one.
        /// </summary>
        [Input("mostRecent")]
        public Input<bool>? MostRecent { get; set; }

        /// <summary>
        /// The name of the volume snapshot.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A regex string to apply to the volume snapshot list returned by DigitalOcean. This allows more advanced filtering not supported from the DigitalOcean API. This filtering is done locally on what DigitalOcean returns.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// A "slug" representing a DigitalOcean region (e.g. `nyc1`). If set, only volume snapshots available in the region will be returned.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        public GetVolumeSnapshotInvokeArgs()
        {
        }
        public static new GetVolumeSnapshotInvokeArgs Empty => new GetVolumeSnapshotInvokeArgs();
    }


    [OutputType]
    public sealed class GetVolumeSnapshotResult
    {
        /// <summary>
        /// The date and time the volume snapshot was created.
        /// </summary>
        public readonly string CreatedAt;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The minimum size in gigabytes required for a volume to be created based on this volume snapshot.
        /// </summary>
        public readonly int MinDiskSize;
        public readonly bool? MostRecent;
        public readonly string? Name;
        public readonly string? NameRegex;
        public readonly string? Region;
        /// <summary>
        /// A list of DigitalOcean region "slugs" indicating where the volume snapshot is available.
        /// </summary>
        public readonly ImmutableArray<string> Regions;
        /// <summary>
        /// The billable size of the volume snapshot in gigabytes.
        /// </summary>
        public readonly double Size;
        /// <summary>
        /// A list of the tags associated to the volume snapshot.
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        /// <summary>
        /// The ID of the volume from which the volume snapshot originated.
        /// </summary>
        public readonly string VolumeId;

        [OutputConstructor]
        private GetVolumeSnapshotResult(
            string createdAt,

            string id,

            int minDiskSize,

            bool? mostRecent,

            string? name,

            string? nameRegex,

            string? region,

            ImmutableArray<string> regions,

            double size,

            ImmutableArray<string> tags,

            string volumeId)
        {
            CreatedAt = createdAt;
            Id = id;
            MinDiskSize = minDiskSize;
            MostRecent = mostRecent;
            Name = name;
            NameRegex = nameRegex;
            Region = region;
            Regions = regions;
            Size = size;
            Tags = tags;
            VolumeId = volumeId;
        }
    }
}
