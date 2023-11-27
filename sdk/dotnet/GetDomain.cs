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
        /// </summary>
        public static Output<GetDomainResult> Invoke(GetDomainInvokeArgs args, InvokeOptions? options = null)
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
