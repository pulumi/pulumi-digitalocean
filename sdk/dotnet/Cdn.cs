// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean
{
    /// <summary>
    /// Provides a DigitalOcean CDN Endpoint resource for use with Spaces.
    /// 
    /// ## Example Usage
    /// 
    /// ### Basic Example
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using DigitalOcean = Pulumi.DigitalOcean;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // Create a new Spaces Bucket
    ///     var mybucket = new DigitalOcean.SpacesBucket("mybucket", new()
    ///     {
    ///         Name = "example",
    ///         Region = DigitalOcean.Region.SFO2,
    ///         Acl = "public-read",
    ///     });
    /// 
    ///     // Add a CDN endpoint to the Spaces Bucket
    ///     var mycdn = new DigitalOcean.Cdn("mycdn", new()
    ///     {
    ///         Origin = mybucket.BucketDomainName,
    ///     });
    /// 
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["fqdn"] = mycdn.Endpoint,
    ///     };
    /// });
    /// ```
    /// 
    /// ### Custom Sub-Domain Example
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using DigitalOcean = Pulumi.DigitalOcean;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // Create a new Spaces Bucket
    ///     var mybucket = new DigitalOcean.SpacesBucket("mybucket", new()
    ///     {
    ///         Name = "example",
    ///         Region = DigitalOcean.Region.SFO2,
    ///         Acl = "public-read",
    ///     });
    /// 
    ///     // Create a DigitalOcean managed Let's Encrypt Certificate
    ///     var cert = new DigitalOcean.Certificate("cert", new()
    ///     {
    ///         Name = "cdn-cert",
    ///         Type = DigitalOcean.CertificateType.LetsEncrypt,
    ///         Domains = new[]
    ///         {
    ///             "static.example.com",
    ///         },
    ///     });
    /// 
    ///     // Add a CDN endpoint with a custom sub-domain to the Spaces Bucket
    ///     var mycdn = new DigitalOcean.Cdn("mycdn", new()
    ///     {
    ///         Origin = mybucket.BucketDomainName,
    ///         CustomDomain = "static.example.com",
    ///         CertificateName = cert.Name,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// CDN Endpoints can be imported using the CDN `id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import digitalocean:index/cdn:Cdn mycdn fb06ad00-351f-45c8-b5eb-13523c438661
    /// ```
    /// </summary>
    [DigitalOceanResourceType("digitalocean:index/cdn:Cdn")]
    public partial class Cdn : global::Pulumi.CustomResource
    {
        /// <summary>
        /// **Deprecated** The ID of a DigitalOcean managed TLS certificate used for SSL when a custom subdomain is provided.
        /// </summary>
        [Output("certificateId")]
        public Output<string> CertificateId { get; private set; } = null!;

        /// <summary>
        /// The unique name of a DigitalOcean managed TLS certificate used for SSL when a custom subdomain is provided.
        /// </summary>
        [Output("certificateName")]
        public Output<string> CertificateName { get; private set; } = null!;

        /// <summary>
        /// The date and time when the CDN Endpoint was created.
        /// </summary>
        [Output("createdAt")]
        public Output<string> CreatedAt { get; private set; } = null!;

        /// <summary>
        /// The fully qualified domain name (FQDN) of the custom subdomain used with the CDN Endpoint.
        /// </summary>
        [Output("customDomain")]
        public Output<string?> CustomDomain { get; private set; } = null!;

        /// <summary>
        /// The fully qualified domain name (FQDN) from which the CDN-backed content is served.
        /// </summary>
        [Output("endpoint")]
        public Output<string> Endpoint { get; private set; } = null!;

        /// <summary>
        /// The fully qualified domain name, (FQDN) for a Space.
        /// </summary>
        [Output("origin")]
        public Output<string> Origin { get; private set; } = null!;

        /// <summary>
        /// The time to live for the CDN Endpoint, in seconds. Default is 3600 seconds.
        /// </summary>
        [Output("ttl")]
        public Output<int> Ttl { get; private set; } = null!;


        /// <summary>
        /// Create a Cdn resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Cdn(string name, CdnArgs args, CustomResourceOptions? options = null)
            : base("digitalocean:index/cdn:Cdn", name, args ?? new CdnArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Cdn(string name, Input<string> id, CdnState? state = null, CustomResourceOptions? options = null)
            : base("digitalocean:index/cdn:Cdn", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Cdn resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Cdn Get(string name, Input<string> id, CdnState? state = null, CustomResourceOptions? options = null)
        {
            return new Cdn(name, id, state, options);
        }
    }

    public sealed class CdnArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// **Deprecated** The ID of a DigitalOcean managed TLS certificate used for SSL when a custom subdomain is provided.
        /// </summary>
        [Input("certificateId")]
        public Input<string>? CertificateId { get; set; }

        /// <summary>
        /// The unique name of a DigitalOcean managed TLS certificate used for SSL when a custom subdomain is provided.
        /// </summary>
        [Input("certificateName")]
        public Input<string>? CertificateName { get; set; }

        /// <summary>
        /// The fully qualified domain name (FQDN) of the custom subdomain used with the CDN Endpoint.
        /// </summary>
        [Input("customDomain")]
        public Input<string>? CustomDomain { get; set; }

        /// <summary>
        /// The fully qualified domain name, (FQDN) for a Space.
        /// </summary>
        [Input("origin", required: true)]
        public Input<string> Origin { get; set; } = null!;

        /// <summary>
        /// The time to live for the CDN Endpoint, in seconds. Default is 3600 seconds.
        /// </summary>
        [Input("ttl")]
        public Input<int>? Ttl { get; set; }

        public CdnArgs()
        {
        }
        public static new CdnArgs Empty => new CdnArgs();
    }

    public sealed class CdnState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// **Deprecated** The ID of a DigitalOcean managed TLS certificate used for SSL when a custom subdomain is provided.
        /// </summary>
        [Input("certificateId")]
        public Input<string>? CertificateId { get; set; }

        /// <summary>
        /// The unique name of a DigitalOcean managed TLS certificate used for SSL when a custom subdomain is provided.
        /// </summary>
        [Input("certificateName")]
        public Input<string>? CertificateName { get; set; }

        /// <summary>
        /// The date and time when the CDN Endpoint was created.
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        /// <summary>
        /// The fully qualified domain name (FQDN) of the custom subdomain used with the CDN Endpoint.
        /// </summary>
        [Input("customDomain")]
        public Input<string>? CustomDomain { get; set; }

        /// <summary>
        /// The fully qualified domain name (FQDN) from which the CDN-backed content is served.
        /// </summary>
        [Input("endpoint")]
        public Input<string>? Endpoint { get; set; }

        /// <summary>
        /// The fully qualified domain name, (FQDN) for a Space.
        /// </summary>
        [Input("origin")]
        public Input<string>? Origin { get; set; }

        /// <summary>
        /// The time to live for the CDN Endpoint, in seconds. Default is 3600 seconds.
        /// </summary>
        [Input("ttl")]
        public Input<int>? Ttl { get; set; }

        public CdnState()
        {
        }
        public static new CdnState Empty => new CdnState();
    }
}
