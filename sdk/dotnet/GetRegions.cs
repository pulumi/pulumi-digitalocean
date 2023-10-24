// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean
{
    public static class GetRegions
    {
        /// <summary>
        /// Retrieve information about all supported DigitalOcean regions, with the ability to
        /// filter and sort the results. If no filters are specified, all regions will be returned.
        /// 
        /// Note: You can use the `digitalocean.getRegion` data source
        /// to obtain metadata about a single region if you already know the `slug` to retrieve.
        /// </summary>
        public static Task<GetRegionsResult> InvokeAsync(GetRegionsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetRegionsResult>("digitalocean:index/getRegions:getRegions", args ?? new GetRegionsArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieve information about all supported DigitalOcean regions, with the ability to
        /// filter and sort the results. If no filters are specified, all regions will be returned.
        /// 
        /// Note: You can use the `digitalocean.getRegion` data source
        /// to obtain metadata about a single region if you already know the `slug` to retrieve.
        /// </summary>
        public static Output<GetRegionsResult> Invoke(GetRegionsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetRegionsResult>("digitalocean:index/getRegions:getRegions", args ?? new GetRegionsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRegionsArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetRegionsFilterArgs>? _filters;

        /// <summary>
        /// Filter the results.
        /// The `filter` block is documented below.
        /// </summary>
        public List<Inputs.GetRegionsFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetRegionsFilterArgs>());
            set => _filters = value;
        }

        [Input("sorts")]
        private List<Inputs.GetRegionsSortArgs>? _sorts;

        /// <summary>
        /// Sort the results.
        /// The `sort` block is documented below.
        /// </summary>
        public List<Inputs.GetRegionsSortArgs> Sorts
        {
            get => _sorts ?? (_sorts = new List<Inputs.GetRegionsSortArgs>());
            set => _sorts = value;
        }

        public GetRegionsArgs()
        {
        }
        public static new GetRegionsArgs Empty => new GetRegionsArgs();
    }

    public sealed class GetRegionsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetRegionsFilterInputArgs>? _filters;

        /// <summary>
        /// Filter the results.
        /// The `filter` block is documented below.
        /// </summary>
        public InputList<Inputs.GetRegionsFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetRegionsFilterInputArgs>());
            set => _filters = value;
        }

        [Input("sorts")]
        private InputList<Inputs.GetRegionsSortInputArgs>? _sorts;

        /// <summary>
        /// Sort the results.
        /// The `sort` block is documented below.
        /// </summary>
        public InputList<Inputs.GetRegionsSortInputArgs> Sorts
        {
            get => _sorts ?? (_sorts = new InputList<Inputs.GetRegionsSortInputArgs>());
            set => _sorts = value;
        }

        public GetRegionsInvokeArgs()
        {
        }
        public static new GetRegionsInvokeArgs Empty => new GetRegionsInvokeArgs();
    }


    [OutputType]
    public sealed class GetRegionsResult
    {
        public readonly ImmutableArray<Outputs.GetRegionsFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A set of regions satisfying any `filter` and `sort` criteria. Each region has the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRegionsRegionResult> Regions;
        public readonly ImmutableArray<Outputs.GetRegionsSortResult> Sorts;

        [OutputConstructor]
        private GetRegionsResult(
            ImmutableArray<Outputs.GetRegionsFilterResult> filters,

            string id,

            ImmutableArray<Outputs.GetRegionsRegionResult> regions,

            ImmutableArray<Outputs.GetRegionsSortResult> sorts)
        {
            Filters = filters;
            Id = id;
            Regions = regions;
            Sorts = sorts;
        }
    }
}
