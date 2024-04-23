// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean
{
    public static class GetSshKeys
    {
        /// <summary>
        /// Get information on SSH Keys for use in other resources.
        /// 
        /// This data source is useful if the SSH Keys in question are not managed by the provider or you need to
        /// utilize any of the SSH Keys' data.
        /// 
        /// Note: You can use the `digitalocean.SshKey` data source to obtain metadata
        /// about a single SSH Key if you already know the unique `name` to retrieve.
        /// 
        /// ## Example Usage
        /// 
        /// For example, to find all SSH keys:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var keys = DigitalOcean.GetSshKeys.Invoke(new()
        ///     {
        ///         Sorts = new[]
        ///         {
        ///             new DigitalOcean.Inputs.GetSshKeysSortInputArgs
        ///             {
        ///                 Direction = "asc",
        ///                 Key = "name",
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// Or to find ones matching specific values:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var keys = DigitalOcean.GetSshKeys.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new DigitalOcean.Inputs.GetSshKeysFilterInputArgs
        ///             {
        ///                 Key = "name",
        ///                 Values = new[]
        ///                 {
        ///                     "laptop",
        ///                     "desktop",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetSshKeysResult> InvokeAsync(GetSshKeysArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSshKeysResult>("digitalocean:index/getSshKeys:getSshKeys", args ?? new GetSshKeysArgs(), options.WithDefaults());

        /// <summary>
        /// Get information on SSH Keys for use in other resources.
        /// 
        /// This data source is useful if the SSH Keys in question are not managed by the provider or you need to
        /// utilize any of the SSH Keys' data.
        /// 
        /// Note: You can use the `digitalocean.SshKey` data source to obtain metadata
        /// about a single SSH Key if you already know the unique `name` to retrieve.
        /// 
        /// ## Example Usage
        /// 
        /// For example, to find all SSH keys:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var keys = DigitalOcean.GetSshKeys.Invoke(new()
        ///     {
        ///         Sorts = new[]
        ///         {
        ///             new DigitalOcean.Inputs.GetSshKeysSortInputArgs
        ///             {
        ///                 Direction = "asc",
        ///                 Key = "name",
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// Or to find ones matching specific values:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var keys = DigitalOcean.GetSshKeys.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new DigitalOcean.Inputs.GetSshKeysFilterInputArgs
        ///             {
        ///                 Key = "name",
        ///                 Values = new[]
        ///                 {
        ///                     "laptop",
        ///                     "desktop",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetSshKeysResult> Invoke(GetSshKeysInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSshKeysResult>("digitalocean:index/getSshKeys:getSshKeys", args ?? new GetSshKeysInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSshKeysArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetSshKeysFilterArgs>? _filters;

        /// <summary>
        /// Filter the results.
        /// The `filter` block is documented below.
        /// </summary>
        public List<Inputs.GetSshKeysFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetSshKeysFilterArgs>());
            set => _filters = value;
        }

        [Input("sorts")]
        private List<Inputs.GetSshKeysSortArgs>? _sorts;

        /// <summary>
        /// Sort the results.
        /// The `sort` block is documented below.
        /// </summary>
        public List<Inputs.GetSshKeysSortArgs> Sorts
        {
            get => _sorts ?? (_sorts = new List<Inputs.GetSshKeysSortArgs>());
            set => _sorts = value;
        }

        public GetSshKeysArgs()
        {
        }
        public static new GetSshKeysArgs Empty => new GetSshKeysArgs();
    }

    public sealed class GetSshKeysInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetSshKeysFilterInputArgs>? _filters;

        /// <summary>
        /// Filter the results.
        /// The `filter` block is documented below.
        /// </summary>
        public InputList<Inputs.GetSshKeysFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetSshKeysFilterInputArgs>());
            set => _filters = value;
        }

        [Input("sorts")]
        private InputList<Inputs.GetSshKeysSortInputArgs>? _sorts;

        /// <summary>
        /// Sort the results.
        /// The `sort` block is documented below.
        /// </summary>
        public InputList<Inputs.GetSshKeysSortInputArgs> Sorts
        {
            get => _sorts ?? (_sorts = new InputList<Inputs.GetSshKeysSortInputArgs>());
            set => _sorts = value;
        }

        public GetSshKeysInvokeArgs()
        {
        }
        public static new GetSshKeysInvokeArgs Empty => new GetSshKeysInvokeArgs();
    }


    [OutputType]
    public sealed class GetSshKeysResult
    {
        public readonly ImmutableArray<Outputs.GetSshKeysFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetSshKeysSortResult> Sorts;
        /// <summary>
        /// A list of SSH Keys. Each SSH Key has the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSshKeysSshKeyResult> SshKeys;

        [OutputConstructor]
        private GetSshKeysResult(
            ImmutableArray<Outputs.GetSshKeysFilterResult> filters,

            string id,

            ImmutableArray<Outputs.GetSshKeysSortResult> sorts,

            ImmutableArray<Outputs.GetSshKeysSshKeyResult> sshKeys)
        {
            Filters = filters;
            Id = id;
            Sorts = sorts;
            SshKeys = sshKeys;
        }
    }
}
