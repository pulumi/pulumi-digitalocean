// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean
{
    public static class GetRegion
    {
        /// <summary>
        /// Get information on a single DigitalOcean region. This is useful to find out 
        /// what Droplet sizes and features are supported within a region.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var sfo2 = Output.Create(DigitalOcean.GetRegion.InvokeAsync(new DigitalOcean.GetRegionArgs
        ///         {
        ///             Slug = "sfo2",
        ///         }));
        ///         this.RegionName = sfo2.Apply(sfo2 =&gt; sfo2.Name);
        ///     }
        /// 
        ///     [Output("regionName")]
        ///     public Output&lt;string&gt; RegionName { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetRegionResult> InvokeAsync(GetRegionArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetRegionResult>("digitalocean:index/getRegion:getRegion", args ?? new GetRegionArgs(), options.WithDefaults());

        /// <summary>
        /// Get information on a single DigitalOcean region. This is useful to find out 
        /// what Droplet sizes and features are supported within a region.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var sfo2 = Output.Create(DigitalOcean.GetRegion.InvokeAsync(new DigitalOcean.GetRegionArgs
        ///         {
        ///             Slug = "sfo2",
        ///         }));
        ///         this.RegionName = sfo2.Apply(sfo2 =&gt; sfo2.Name);
        ///     }
        /// 
        ///     [Output("regionName")]
        ///     public Output&lt;string&gt; RegionName { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetRegionResult> Invoke(GetRegionInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetRegionResult>("digitalocean:index/getRegion:getRegion", args ?? new GetRegionInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRegionArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// A human-readable string that is used as a unique identifier for each region.
        /// </summary>
        [Input("slug", required: true)]
        public string Slug { get; set; } = null!;

        public GetRegionArgs()
        {
        }
    }

    public sealed class GetRegionInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// A human-readable string that is used as a unique identifier for each region.
        /// </summary>
        [Input("slug", required: true)]
        public Input<string> Slug { get; set; } = null!;

        public GetRegionInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetRegionResult
    {
        /// <summary>
        /// A boolean value that represents whether new Droplets can be created in this region.
        /// </summary>
        public readonly bool Available;
        /// <summary>
        /// A set of features available in this region.
        /// </summary>
        public readonly ImmutableArray<string> Features;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The display name of the region.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// A set of identifying slugs for the Droplet sizes available in this region.
        /// </summary>
        public readonly ImmutableArray<string> Sizes;
        /// <summary>
        /// A human-readable string that is used as a unique identifier for each region.
        /// </summary>
        public readonly string Slug;

        [OutputConstructor]
        private GetRegionResult(
            bool available,

            ImmutableArray<string> features,

            string id,

            string name,

            ImmutableArray<string> sizes,

            string slug)
        {
            Available = available;
            Features = features;
            Id = id;
            Name = name;
            Sizes = sizes;
            Slug = slug;
        }
    }
}
