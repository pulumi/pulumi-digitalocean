// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean
{
    public static class GetDomain
    {
        /// <summary>
        /// Get information on a domain. This data source provides the name, TTL, and zone
        /// file as configured on your DigitalOcean account. This is useful if the domain
        /// name in question is not managed by this provider or you need to utilize TTL or zone
        /// file data.
        /// 
        /// An error is triggered if the provided domain name is not managed with your
        /// DigitalOcean account.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Get the zone file for a domain:
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var example = Output.Create(DigitalOcean.GetDomain.InvokeAsync(new DigitalOcean.GetDomainArgs
        ///         {
        ///             Name = "example.com",
        ///         }));
        ///         this.DomainOutput = example.Apply(example =&gt; example.ZoneFile);
        ///     }
        /// 
        ///     [Output("domainOutput")]
        ///     public Output&lt;string&gt; DomainOutput { get; set; }
        /// }
        /// ```
        /// 
        /// 
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetDomainResult> InvokeAsync(GetDomainArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetDomainResult>("digitalocean:index/getDomain:getDomain", args ?? new GetDomainArgs(), options.WithVersion());
    }


    public sealed class GetDomainArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the domain.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetDomainArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetDomainResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;
        public readonly int Ttl;
        /// <summary>
        /// The uniform resource name of the domain
        /// * `zone_file`: The zone file of the domain.
        /// </summary>
        public readonly string Urn;
        public readonly string ZoneFile;

        [OutputConstructor]
        private GetDomainResult(
            string id,

            string name,

            int ttl,

            string urn,

            string zoneFile)
        {
            Id = id;
            Name = name;
            Ttl = ttl;
            Urn = urn;
            ZoneFile = zoneFile;
        }
    }
}
