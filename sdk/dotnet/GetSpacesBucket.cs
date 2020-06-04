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
        /// is not managed by this provider or you need to utilize any of the bucket's data.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Get the bucket by name:
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var example = Output.Create(DigitalOcean.GetSpacesBucket.InvokeAsync(new DigitalOcean.GetSpacesBucketArgs
        ///         {
        ///             Name = "my-spaces-bucket",
        ///             Region = "nyc3",
        ///         }));
        ///         this.BucketDomainName = example.Apply(example =&gt; example.BucketDomainName);
        ///     }
        /// 
        ///     [Output("bucketDomainName")]
        ///     public Output&lt;string&gt; BucketDomainName { get; set; }
        /// }
        /// ```
        /// 
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetSpacesBucketResult> InvokeAsync(GetSpacesBucketArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetSpacesBucketResult>("digitalocean:index/getSpacesBucket:getSpacesBucket", args ?? new GetSpacesBucketArgs(), options.WithVersion());
    }


    public sealed class GetSpacesBucketArgs : Pulumi.InvokeArgs
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
    }


    [OutputType]
    public sealed class GetSpacesBucketResult
    {
        /// <summary>
        /// The FQDN of the bucket (e.g. bucket-name.nyc3.digitaloceanspaces.com)
        /// </summary>
        public readonly string BucketDomainName;
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

            string id,

            string name,

            string region,

            string urn)
        {
            BucketDomainName = bucketDomainName;
            Id = id;
            Name = name;
            Region = region;
            Urn = urn;
        }
    }
}
