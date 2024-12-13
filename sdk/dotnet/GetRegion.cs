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
        ///     var sfo2 = DigitalOcean.GetRegion.Invoke(new()
        ///     {
        ///         Slug = "sfo2",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["regionName"] = sfo2.Apply(getRegionResult =&gt; getRegionResult.Name),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetRegionResult> InvokeAsync(GetRegionArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetRegionResult>("digitalocean:index/getRegion:getRegion", args ?? new GetRegionArgs(), options.WithDefaults());

        /// <summary>
        /// Get information on a single DigitalOcean region. This is useful to find out 
        /// what Droplet sizes and features are supported within a region.
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
        ///     var sfo2 = DigitalOcean.GetRegion.Invoke(new()
        ///     {
        ///         Slug = "sfo2",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["regionName"] = sfo2.Apply(getRegionResult =&gt; getRegionResult.Name),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetRegionResult> Invoke(GetRegionInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetRegionResult>("digitalocean:index/getRegion:getRegion", args ?? new GetRegionInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Get information on a single DigitalOcean region. This is useful to find out 
        /// what Droplet sizes and features are supported within a region.
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
        ///     var sfo2 = DigitalOcean.GetRegion.Invoke(new()
        ///     {
        ///         Slug = "sfo2",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["regionName"] = sfo2.Apply(getRegionResult =&gt; getRegionResult.Name),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetRegionResult> Invoke(GetRegionInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetRegionResult>("digitalocean:index/getRegion:getRegion", args ?? new GetRegionInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRegionArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A human-readable string that is used as a unique identifier for each region.
        /// </summary>
        [Input("slug", required: true)]
        public string Slug { get; set; } = null!;

        public GetRegionArgs()
        {
        }
        public static new GetRegionArgs Empty => new GetRegionArgs();
    }

    public sealed class GetRegionInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A human-readable string that is used as a unique identifier for each region.
        /// </summary>
        [Input("slug", required: true)]
        public Input<string> Slug { get; set; } = null!;

        public GetRegionInvokeArgs()
        {
        }
        public static new GetRegionInvokeArgs Empty => new GetRegionInvokeArgs();
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
