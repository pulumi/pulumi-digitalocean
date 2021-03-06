// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean
{
    public static class GetDroplets
    {
        /// <summary>
        /// Get information on Droplets for use in other resources, with the ability to filter and sort the results.
        /// If no filters are specified, all Droplets will be returned.
        /// 
        /// This data source is useful if the Droplets in question are not managed by the provider or you need to
        /// utilize any of the Droplets' data.
        /// 
        /// Note: You can use the `digitalocean.Droplet` data source to obtain metadata
        /// about a single Droplet if you already know the `id`, unique `name`, or unique `tag` to retrieve.
        /// </summary>
        public static Task<GetDropletsResult> InvokeAsync(GetDropletsArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetDropletsResult>("digitalocean:index/getDroplets:getDroplets", args ?? new GetDropletsArgs(), options.WithVersion());
    }


    public sealed class GetDropletsArgs : Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetDropletsFilterArgs>? _filters;

        /// <summary>
        /// Filter the results.
        /// The `filter` block is documented below.
        /// </summary>
        public List<Inputs.GetDropletsFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetDropletsFilterArgs>());
            set => _filters = value;
        }

        [Input("sorts")]
        private List<Inputs.GetDropletsSortArgs>? _sorts;

        /// <summary>
        /// Sort the results.
        /// The `sort` block is documented below.
        /// </summary>
        public List<Inputs.GetDropletsSortArgs> Sorts
        {
            get => _sorts ?? (_sorts = new List<Inputs.GetDropletsSortArgs>());
            set => _sorts = value;
        }

        public GetDropletsArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetDropletsResult
    {
        /// <summary>
        /// A list of Droplets satisfying any `filter` and `sort` criteria. Each Droplet has the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDropletsDropletResult> Droplets;
        public readonly ImmutableArray<Outputs.GetDropletsFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetDropletsSortResult> Sorts;

        [OutputConstructor]
        private GetDropletsResult(
            ImmutableArray<Outputs.GetDropletsDropletResult> droplets,

            ImmutableArray<Outputs.GetDropletsFilterResult> filters,

            string id,

            ImmutableArray<Outputs.GetDropletsSortResult> sorts)
        {
            Droplets = droplets;
            Filters = filters;
            Id = id;
            Sorts = sorts;
        }
    }
}
