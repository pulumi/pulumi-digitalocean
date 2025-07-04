// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean
{
    public static class GetReservedIpv6
    {
        /// <summary>
        /// ## Example Usage
        /// 
        /// Get the reserved IPv6:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var foo = new DigitalOcean.ReservedIpv6("foo", new()
        ///     {
        ///         RegionSlug = "nyc3",
        ///     });
        /// 
        ///     var foobar = DigitalOcean.GetReservedIpv6.Invoke(new()
        ///     {
        ///         Ip = foo.Ip,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetReservedIpv6Result> InvokeAsync(GetReservedIpv6Args args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetReservedIpv6Result>("digitalocean:index/getReservedIpv6:getReservedIpv6", args ?? new GetReservedIpv6Args(), options.WithDefaults());

        /// <summary>
        /// ## Example Usage
        /// 
        /// Get the reserved IPv6:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var foo = new DigitalOcean.ReservedIpv6("foo", new()
        ///     {
        ///         RegionSlug = "nyc3",
        ///     });
        /// 
        ///     var foobar = DigitalOcean.GetReservedIpv6.Invoke(new()
        ///     {
        ///         Ip = foo.Ip,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetReservedIpv6Result> Invoke(GetReservedIpv6InvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetReservedIpv6Result>("digitalocean:index/getReservedIpv6:getReservedIpv6", args ?? new GetReservedIpv6InvokeArgs(), options.WithDefaults());

        /// <summary>
        /// ## Example Usage
        /// 
        /// Get the reserved IPv6:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var foo = new DigitalOcean.ReservedIpv6("foo", new()
        ///     {
        ///         RegionSlug = "nyc3",
        ///     });
        /// 
        ///     var foobar = DigitalOcean.GetReservedIpv6.Invoke(new()
        ///     {
        ///         Ip = foo.Ip,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetReservedIpv6Result> Invoke(GetReservedIpv6InvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetReservedIpv6Result>("digitalocean:index/getReservedIpv6:getReservedIpv6", args ?? new GetReservedIpv6InvokeArgs(), options.WithDefaults());
    }


    public sealed class GetReservedIpv6Args : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The allocated IPv6 address of the specific reserved IPv6 to retrieve.
        /// </summary>
        [Input("ip", required: true)]
        public string Ip { get; set; } = null!;

        public GetReservedIpv6Args()
        {
        }
        public static new GetReservedIpv6Args Empty => new GetReservedIpv6Args();
    }

    public sealed class GetReservedIpv6InvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The allocated IPv6 address of the specific reserved IPv6 to retrieve.
        /// </summary>
        [Input("ip", required: true)]
        public Input<string> Ip { get; set; } = null!;

        public GetReservedIpv6InvokeArgs()
        {
        }
        public static new GetReservedIpv6InvokeArgs Empty => new GetReservedIpv6InvokeArgs();
    }


    [OutputType]
    public sealed class GetReservedIpv6Result
    {
        /// <summary>
        /// The Droplet id that the reserved IP has been assigned to.
        /// </summary>
        public readonly int DropletId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Ip;
        /// <summary>
        /// The region that the reserved IPv6 is reserved to.
        /// </summary>
        public readonly string RegionSlug;
        /// <summary>
        /// The uniform resource name of the reserved IPv6.
        /// </summary>
        public readonly string Urn;

        [OutputConstructor]
        private GetReservedIpv6Result(
            int dropletId,

            string id,

            string ip,

            string regionSlug,

            string urn)
        {
            DropletId = dropletId;
            Id = id;
            Ip = ip;
            RegionSlug = regionSlug;
            Urn = urn;
        }
    }
}
