// *** WARNING: this file was generated by pulumi-language-dotnet. ***
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
        /// ## Example Usage
        /// 
        /// Get the zone file for a domain:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetDomain.Invoke(new()
        ///     {
        ///         Name = "example.com",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["domainOutput"] = example.Apply(getDomainResult =&gt; getDomainResult.ZoneFile),
        ///     };
        /// });
        /// ```
        /// 
        /// ```
        /// 
        /// data.digitalocean_domain.example: Refreshing state...
        /// 
        /// Apply complete! Resources: 0 added, 0 changed, 0 destroyed.
        /// 
        /// Outputs:
        /// 
        /// domain_output = $ORIGIN example.com.
        /// $TTL 1800
        /// example.com. IN SOA ns1.digitalocean.com. hostmaster.example.com. 1516944700 10800 3600 604800 1800
        /// example.com. 1800 IN NS ns1.digitalocean.com.
        /// example.com. 1800 IN NS ns2.digitalocean.com.
        /// example.com. 1800 IN NS ns3.digitalocean.com.
        /// www.example.com. 3600 IN A 176.107.155.137
        /// db.example.com. 3600 IN A 179.189.166.115
        /// jira.example.com. 3600 IN A 207.189.228.15
        /// ```
        /// </summary>
        public static Task<GetDomainResult> InvokeAsync(GetDomainArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDomainResult>("digitalocean:index/getDomain:getDomain", args ?? new GetDomainArgs(), options.WithDefaults());

        /// <summary>
        /// Get information on a domain. This data source provides the name, TTL, and zone
        /// file as configured on your DigitalOcean account. This is useful if the domain
        /// name in question is not managed by this provider or you need to utilize TTL or zone
        /// file data.
        /// 
        /// An error is triggered if the provided domain name is not managed with your
        /// DigitalOcean account.
        /// 
        /// ## Example Usage
        /// 
        /// Get the zone file for a domain:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetDomain.Invoke(new()
        ///     {
        ///         Name = "example.com",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["domainOutput"] = example.Apply(getDomainResult =&gt; getDomainResult.ZoneFile),
        ///     };
        /// });
        /// ```
        /// 
        /// ```
        /// 
        /// data.digitalocean_domain.example: Refreshing state...
        /// 
        /// Apply complete! Resources: 0 added, 0 changed, 0 destroyed.
        /// 
        /// Outputs:
        /// 
        /// domain_output = $ORIGIN example.com.
        /// $TTL 1800
        /// example.com. IN SOA ns1.digitalocean.com. hostmaster.example.com. 1516944700 10800 3600 604800 1800
        /// example.com. 1800 IN NS ns1.digitalocean.com.
        /// example.com. 1800 IN NS ns2.digitalocean.com.
        /// example.com. 1800 IN NS ns3.digitalocean.com.
        /// www.example.com. 3600 IN A 176.107.155.137
        /// db.example.com. 3600 IN A 179.189.166.115
        /// jira.example.com. 3600 IN A 207.189.228.15
        /// ```
        /// </summary>
        public static Output<GetDomainResult> Invoke(GetDomainInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDomainResult>("digitalocean:index/getDomain:getDomain", args ?? new GetDomainInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Get information on a domain. This data source provides the name, TTL, and zone
        /// file as configured on your DigitalOcean account. This is useful if the domain
        /// name in question is not managed by this provider or you need to utilize TTL or zone
        /// file data.
        /// 
        /// An error is triggered if the provided domain name is not managed with your
        /// DigitalOcean account.
        /// 
        /// ## Example Usage
        /// 
        /// Get the zone file for a domain:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetDomain.Invoke(new()
        ///     {
        ///         Name = "example.com",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["domainOutput"] = example.Apply(getDomainResult =&gt; getDomainResult.ZoneFile),
        ///     };
        /// });
        /// ```
        /// 
        /// ```
        /// 
        /// data.digitalocean_domain.example: Refreshing state...
        /// 
        /// Apply complete! Resources: 0 added, 0 changed, 0 destroyed.
        /// 
        /// Outputs:
        /// 
        /// domain_output = $ORIGIN example.com.
        /// $TTL 1800
        /// example.com. IN SOA ns1.digitalocean.com. hostmaster.example.com. 1516944700 10800 3600 604800 1800
        /// example.com. 1800 IN NS ns1.digitalocean.com.
        /// example.com. 1800 IN NS ns2.digitalocean.com.
        /// example.com. 1800 IN NS ns3.digitalocean.com.
        /// www.example.com. 3600 IN A 176.107.155.137
        /// db.example.com. 3600 IN A 179.189.166.115
        /// jira.example.com. 3600 IN A 207.189.228.15
        /// ```
        /// </summary>
        public static Output<GetDomainResult> Invoke(GetDomainInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetDomainResult>("digitalocean:index/getDomain:getDomain", args ?? new GetDomainInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDomainArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the domain.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetDomainArgs()
        {
        }
        public static new GetDomainArgs Empty => new GetDomainArgs();
    }

    public sealed class GetDomainInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the domain.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetDomainInvokeArgs()
        {
        }
        public static new GetDomainInvokeArgs Empty => new GetDomainInvokeArgs();
    }


    [OutputType]
    public sealed class GetDomainResult
    {
        /// <summary>
        /// The uniform resource name of the domain
        /// </summary>
        public readonly string DomainUrn;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;
        /// <summary>
        /// The TTL of the domain.
        /// </summary>
        public readonly int Ttl;
        /// <summary>
        /// The zone file of the domain.
        /// </summary>
        public readonly string ZoneFile;

        [OutputConstructor]
        private GetDomainResult(
            string domainUrn,

            string id,

            string name,

            int ttl,

            string zoneFile)
        {
            DomainUrn = domainUrn;
            Id = id;
            Name = name;
            Ttl = ttl;
            ZoneFile = zoneFile;
        }
    }
}
