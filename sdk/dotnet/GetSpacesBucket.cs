// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean
{
    public static class GetSpacesBucket
    {
        /// <summary>
        /// Get information on a Spaces bucket for use in other resources. This is useful if the Spaces bucket in question
        /// is not managed by the provider or you need to utilize any of the bucket's data.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Get the bucket by name:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetSpacesBucket.Invoke(new()
        ///     {
        ///         Name = "my-spaces-bucket",
        ///         Region = "nyc3",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["bucketDomainName"] = example.Apply(getSpacesBucketResult =&gt; getSpacesBucketResult.BucketDomainName),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetSpacesBucketResult> InvokeAsync(GetSpacesBucketArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSpacesBucketResult>("digitalocean:index/getSpacesBucket:getSpacesBucket", args ?? new GetSpacesBucketArgs(), options.WithDefaults());

        /// <summary>
        /// Get information on a Spaces bucket for use in other resources. This is useful if the Spaces bucket in question
        /// is not managed by the provider or you need to utilize any of the bucket's data.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Get the bucket by name:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetSpacesBucket.Invoke(new()
        ///     {
        ///         Name = "my-spaces-bucket",
        ///         Region = "nyc3",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["bucketDomainName"] = example.Apply(getSpacesBucketResult =&gt; getSpacesBucketResult.BucketDomainName),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetSpacesBucketResult> Invoke(GetSpacesBucketInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSpacesBucketResult>("digitalocean:index/getSpacesBucket:getSpacesBucket", args ?? new GetSpacesBucketInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSpacesBucketArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the Spaces bucket.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The slug of the region where the bucket is stored.
        /// </summary>
        [Input("region", required: true)]
        public string Region { get; set; } = null!;

        public GetSpacesBucketArgs()
        {
        }
        public static new GetSpacesBucketArgs Empty => new GetSpacesBucketArgs();
    }

    public sealed class GetSpacesBucketInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the Spaces bucket.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The slug of the region where the bucket is stored.
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        public GetSpacesBucketInvokeArgs()
        {
        }
        public static new GetSpacesBucketInvokeArgs Empty => new GetSpacesBucketInvokeArgs();
    }


    [OutputType]
    public sealed class GetSpacesBucketResult
    {
        /// <summary>
        /// The FQDN of the bucket (e.g. bucket-name.nyc3.digitaloceanspaces.com)
        /// </summary>
        public readonly string BucketDomainName;
        /// <summary>
        /// The FQDN of the bucket without the bucket name (e.g. nyc3.digitaloceanspaces.com)
        /// </summary>
        public readonly string Endpoint;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The name of the Spaces bucket
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The slug of the region where the bucket is stored.
        /// </summary>
        public readonly string Region;
        /// <summary>
        /// The uniform resource name of the bucket
        /// </summary>
        public readonly string Urn;

        [OutputConstructor]
        private GetSpacesBucketResult(
            string bucketDomainName,

            string endpoint,

            string id,

            string name,

            string region,

            string urn)
        {
            BucketDomainName = bucketDomainName;
            Endpoint = endpoint;
            Id = id;
            Name = name;
            Region = region;
            Urn = urn;
        }
    }
}
