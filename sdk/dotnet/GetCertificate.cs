// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean
{
    public static class GetCertificate
    {
        /// <summary>
        /// Get information on a certificate. This data source provides the name, type, state,
        /// domains, expiry date, and the sha1 fingerprint as configured on your DigitalOcean account.
        /// This is useful if the certificate in question is not managed by this provider or you need to utilize
        /// any of the certificates data.
        /// 
        /// An error is triggered if the provided certificate name does not exist.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Get the certificate:
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var example = Output.Create(DigitalOcean.GetCertificate.InvokeAsync(new DigitalOcean.GetCertificateArgs
        ///         {
        ///             Name = "example",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// 
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetCertificateResult> InvokeAsync(GetCertificateArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetCertificateResult>("digitalocean:index/getCertificate:getCertificate", args ?? new GetCertificateArgs(), options.WithVersion());
    }


    public sealed class GetCertificateArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of certificate.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetCertificateArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetCertificateResult
    {
        public readonly ImmutableArray<string> Domains;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;
        public readonly string NotAfter;
        public readonly string Sha1Fingerprint;
        public readonly string State;
        public readonly string Type;

        [OutputConstructor]
        private GetCertificateResult(
            ImmutableArray<string> domains,

            string id,

            string name,

            string notAfter,

            string sha1Fingerprint,

            string state,

            string type)
        {
            Domains = domains;
            Id = id;
            Name = name;
            NotAfter = notAfter;
            Sha1Fingerprint = sha1Fingerprint;
            State = state;
            Type = type;
        }
    }
}
