// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean
{
    public static class GetDomains
    {
        /// <summary>
        /// Get information on domains for use in other resources, with the ability to filter and sort the results.
        /// If no filters are specified, all domains will be returned.
        /// 
        /// This data source is useful if the domains in question are not managed by this provider or you need to
        /// utilize any of the domains' data.
        /// 
        /// Note: You can use the `digitalocean.Domain` data source to obtain metadata
        /// about a single domain if you already know the `name`.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Use the `filter` block with a `key` string and `values` list to filter domains. (This example
        /// also uses the regular expression `match_by` mode in order to match domains by suffix.)
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var examples = Output.Create(DigitalOcean.GetDomains.InvokeAsync(new DigitalOcean.GetDomainsArgs
        ///         {
        ///             Filters = 
        ///             {
        ///                 new DigitalOcean.Inputs.GetDomainsFilterArgs
        ///                 {
        ///                     Key = "name",
        ///                     MatchBy = "re",
        ///                     Values = 
        ///                     {
        ///                         "example\\.com$",
        ///                     },
        ///                 },
        ///             },
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetDomainsResult> InvokeAsync(GetDomainsArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetDomainsResult>("digitalocean:index/getDomains:getDomains", args ?? new GetDomainsArgs(), options.WithVersion());
    }


    public sealed class GetDomainsArgs : Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetDomainsFilterArgs>? _filters;

        /// <summary>
        /// Filter the results.
        /// The `filter` block is documented below.
        /// </summary>
        public List<Inputs.GetDomainsFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetDomainsFilterArgs>());
            set => _filters = value;
        }

        [Input("sorts")]
        private List<Inputs.GetDomainsSortArgs>? _sorts;

        /// <summary>
        /// Sort the results.
        /// The `sort` block is documented below.
        /// </summary>
        public List<Inputs.GetDomainsSortArgs> Sorts
        {
            get => _sorts ?? (_sorts = new List<Inputs.GetDomainsSortArgs>());
            set => _sorts = value;
        }

        public GetDomainsArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetDomainsResult
    {
        /// <summary>
        /// A list of domains satisfying any `filter` and `sort` criteria. Each domain has the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDomainsDomainResult> Domains;
        public readonly ImmutableArray<Outputs.GetDomainsFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetDomainsSortResult> Sorts;

        [OutputConstructor]
        private GetDomainsResult(
            ImmutableArray<Outputs.GetDomainsDomainResult> domains,

            ImmutableArray<Outputs.GetDomainsFilterResult> filters,

            string id,

            ImmutableArray<Outputs.GetDomainsSortResult> sorts)
        {
            Domains = domains;
            Filters = filters;
            Id = id;
            Sorts = sorts;
        }
    }
}
