// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean
{
    public static class GetRecords
    {
        /// <summary>
        /// Retrieve information about all DNS records within a domain, with the ability to filter and sort the results.
        /// If no filters are specified, all records will be returned.
        /// 
        /// ## Example Usage
        /// 
        /// Get data for all MX records in a domain:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// using Std = Pulumi.Std;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetRecords.Invoke(new()
        ///     {
        ///         Domain = "example.com",
        ///         Filters = new[]
        ///         {
        ///             new DigitalOcean.Inputs.GetRecordsFilterInputArgs
        ///             {
        ///                 Key = "type",
        ///                 Values = new[]
        ///                 {
        ///                     "MX",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["mailServers"] = Std.Join.Invoke(new()
        ///         {
        ///             Separator = ",",
        ///             Input = example.Apply(getRecordsResult =&gt; getRecordsResult.Records).Select(__item =&gt; __item.Value).ToList(),
        ///         }).Apply(invoke =&gt; invoke.Result),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetRecordsResult> InvokeAsync(GetRecordsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetRecordsResult>("digitalocean:index/getRecords:getRecords", args ?? new GetRecordsArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieve information about all DNS records within a domain, with the ability to filter and sort the results.
        /// If no filters are specified, all records will be returned.
        /// 
        /// ## Example Usage
        /// 
        /// Get data for all MX records in a domain:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// using Std = Pulumi.Std;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetRecords.Invoke(new()
        ///     {
        ///         Domain = "example.com",
        ///         Filters = new[]
        ///         {
        ///             new DigitalOcean.Inputs.GetRecordsFilterInputArgs
        ///             {
        ///                 Key = "type",
        ///                 Values = new[]
        ///                 {
        ///                     "MX",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["mailServers"] = Std.Join.Invoke(new()
        ///         {
        ///             Separator = ",",
        ///             Input = example.Apply(getRecordsResult =&gt; getRecordsResult.Records).Select(__item =&gt; __item.Value).ToList(),
        ///         }).Apply(invoke =&gt; invoke.Result),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetRecordsResult> Invoke(GetRecordsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetRecordsResult>("digitalocean:index/getRecords:getRecords", args ?? new GetRecordsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieve information about all DNS records within a domain, with the ability to filter and sort the results.
        /// If no filters are specified, all records will be returned.
        /// 
        /// ## Example Usage
        /// 
        /// Get data for all MX records in a domain:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// using Std = Pulumi.Std;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetRecords.Invoke(new()
        ///     {
        ///         Domain = "example.com",
        ///         Filters = new[]
        ///         {
        ///             new DigitalOcean.Inputs.GetRecordsFilterInputArgs
        ///             {
        ///                 Key = "type",
        ///                 Values = new[]
        ///                 {
        ///                     "MX",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["mailServers"] = Std.Join.Invoke(new()
        ///         {
        ///             Separator = ",",
        ///             Input = example.Apply(getRecordsResult =&gt; getRecordsResult.Records).Select(__item =&gt; __item.Value).ToList(),
        ///         }).Apply(invoke =&gt; invoke.Result),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetRecordsResult> Invoke(GetRecordsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetRecordsResult>("digitalocean:index/getRecords:getRecords", args ?? new GetRecordsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRecordsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The domain name to search for DNS records
        /// </summary>
        [Input("domain", required: true)]
        public string Domain { get; set; } = null!;

        [Input("filters")]
        private List<Inputs.GetRecordsFilterArgs>? _filters;

        /// <summary>
        /// Filter the results.
        /// The `filter` block is documented below.
        /// </summary>
        public List<Inputs.GetRecordsFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetRecordsFilterArgs>());
            set => _filters = value;
        }

        [Input("sorts")]
        private List<Inputs.GetRecordsSortArgs>? _sorts;

        /// <summary>
        /// Sort the results.
        /// The `sort` block is documented below.
        /// </summary>
        public List<Inputs.GetRecordsSortArgs> Sorts
        {
            get => _sorts ?? (_sorts = new List<Inputs.GetRecordsSortArgs>());
            set => _sorts = value;
        }

        public GetRecordsArgs()
        {
        }
        public static new GetRecordsArgs Empty => new GetRecordsArgs();
    }

    public sealed class GetRecordsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The domain name to search for DNS records
        /// </summary>
        [Input("domain", required: true)]
        public Input<string> Domain { get; set; } = null!;

        [Input("filters")]
        private InputList<Inputs.GetRecordsFilterInputArgs>? _filters;

        /// <summary>
        /// Filter the results.
        /// The `filter` block is documented below.
        /// </summary>
        public InputList<Inputs.GetRecordsFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetRecordsFilterInputArgs>());
            set => _filters = value;
        }

        [Input("sorts")]
        private InputList<Inputs.GetRecordsSortInputArgs>? _sorts;

        /// <summary>
        /// Sort the results.
        /// The `sort` block is documented below.
        /// </summary>
        public InputList<Inputs.GetRecordsSortInputArgs> Sorts
        {
            get => _sorts ?? (_sorts = new InputList<Inputs.GetRecordsSortInputArgs>());
            set => _sorts = value;
        }

        public GetRecordsInvokeArgs()
        {
        }
        public static new GetRecordsInvokeArgs Empty => new GetRecordsInvokeArgs();
    }


    [OutputType]
    public sealed class GetRecordsResult
    {
        /// <summary>
        /// Domain of the DNS record.
        /// </summary>
        public readonly string Domain;
        public readonly ImmutableArray<Outputs.GetRecordsFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetRecordsRecordResult> Records;
        public readonly ImmutableArray<Outputs.GetRecordsSortResult> Sorts;

        [OutputConstructor]
        private GetRecordsResult(
            string domain,

            ImmutableArray<Outputs.GetRecordsFilterResult> filters,

            string id,

            ImmutableArray<Outputs.GetRecordsRecordResult> records,

            ImmutableArray<Outputs.GetRecordsSortResult> sorts)
        {
            Domain = domain;
            Filters = filters;
            Id = id;
            Records = records;
            Sorts = sorts;
        }
    }
}
