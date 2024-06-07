// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean
{
    public static class GetSpacesBucketObject
    {
        /// <summary>
        /// The Spaces object data source allows access to the metadata and
        /// _optionally_ (see below) content of an object stored inside a Spaces bucket.
        /// 
        /// &gt; **Note:** The content of an object (`body` field) is available only for objects which have a human-readable
        /// `Content-Type` (`text/*` and `application/json`). This is to prevent printing unsafe characters and potentially
        /// downloading large amount of data which would be thrown away in favor of metadata.
        /// 
        /// ## Example Usage
        /// 
        /// The following example retrieves a text object (which must have a `Content-Type`
        /// value starting with `text/`) and uses it as the `user_data` for a Droplet:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var bootstrapScript = DigitalOcean.GetSpacesBucketObject.Invoke(new()
        ///     {
        ///         Bucket = "ourcorp-deploy-config",
        ///         Region = "nyc3",
        ///         Key = "droplet-bootstrap-script.sh",
        ///     });
        /// 
        ///     var web = new DigitalOcean.Droplet("web", new()
        ///     {
        ///         Image = "ubuntu-18-04-x64",
        ///         Name = "web-1",
        ///         Region = DigitalOcean.Region.NYC2,
        ///         Size = DigitalOcean.DropletSlug.DropletS1VCPU1GB,
        ///         UserData = bootstrapScript.Apply(getSpacesBucketObjectResult =&gt; getSpacesBucketObjectResult.Body),
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetSpacesBucketObjectResult> InvokeAsync(GetSpacesBucketObjectArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSpacesBucketObjectResult>("digitalocean:index/getSpacesBucketObject:getSpacesBucketObject", args ?? new GetSpacesBucketObjectArgs(), options.WithDefaults());

        /// <summary>
        /// The Spaces object data source allows access to the metadata and
        /// _optionally_ (see below) content of an object stored inside a Spaces bucket.
        /// 
        /// &gt; **Note:** The content of an object (`body` field) is available only for objects which have a human-readable
        /// `Content-Type` (`text/*` and `application/json`). This is to prevent printing unsafe characters and potentially
        /// downloading large amount of data which would be thrown away in favor of metadata.
        /// 
        /// ## Example Usage
        /// 
        /// The following example retrieves a text object (which must have a `Content-Type`
        /// value starting with `text/`) and uses it as the `user_data` for a Droplet:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var bootstrapScript = DigitalOcean.GetSpacesBucketObject.Invoke(new()
        ///     {
        ///         Bucket = "ourcorp-deploy-config",
        ///         Region = "nyc3",
        ///         Key = "droplet-bootstrap-script.sh",
        ///     });
        /// 
        ///     var web = new DigitalOcean.Droplet("web", new()
        ///     {
        ///         Image = "ubuntu-18-04-x64",
        ///         Name = "web-1",
        ///         Region = DigitalOcean.Region.NYC2,
        ///         Size = DigitalOcean.DropletSlug.DropletS1VCPU1GB,
        ///         UserData = bootstrapScript.Apply(getSpacesBucketObjectResult =&gt; getSpacesBucketObjectResult.Body),
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetSpacesBucketObjectResult> Invoke(GetSpacesBucketObjectInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSpacesBucketObjectResult>("digitalocean:index/getSpacesBucketObject:getSpacesBucketObject", args ?? new GetSpacesBucketObjectInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSpacesBucketObjectArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the bucket to read the object from.
        /// </summary>
        [Input("bucket", required: true)]
        public string Bucket { get; set; } = null!;

        /// <summary>
        /// The full path to the object inside the bucket
        /// </summary>
        [Input("key", required: true)]
        public string Key { get; set; } = null!;

        [Input("range")]
        public string? Range { get; set; }

        /// <summary>
        /// The slug of the region where the bucket is stored.
        /// </summary>
        [Input("region", required: true)]
        public string Region { get; set; } = null!;

        /// <summary>
        /// Specific version ID of the object returned (defaults to latest version)
        /// </summary>
        [Input("versionId")]
        public string? VersionId { get; set; }

        public GetSpacesBucketObjectArgs()
        {
        }
        public static new GetSpacesBucketObjectArgs Empty => new GetSpacesBucketObjectArgs();
    }

    public sealed class GetSpacesBucketObjectInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the bucket to read the object from.
        /// </summary>
        [Input("bucket", required: true)]
        public Input<string> Bucket { get; set; } = null!;

        /// <summary>
        /// The full path to the object inside the bucket
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        [Input("range")]
        public Input<string>? Range { get; set; }

        /// <summary>
        /// The slug of the region where the bucket is stored.
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        /// <summary>
        /// Specific version ID of the object returned (defaults to latest version)
        /// </summary>
        [Input("versionId")]
        public Input<string>? VersionId { get; set; }

        public GetSpacesBucketObjectInvokeArgs()
        {
        }
        public static new GetSpacesBucketObjectInvokeArgs Empty => new GetSpacesBucketObjectInvokeArgs();
    }


    [OutputType]
    public sealed class GetSpacesBucketObjectResult
    {
        /// <summary>
        /// Object data (see **limitations above** to understand cases in which this field is actually available)
        /// </summary>
        public readonly string Body;
        public readonly string Bucket;
        /// <summary>
        /// Specifies caching behavior along the request/reply chain.
        /// </summary>
        public readonly string CacheControl;
        /// <summary>
        /// Specifies presentational information for the object.
        /// </summary>
        public readonly string ContentDisposition;
        /// <summary>
        /// Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field.
        /// </summary>
        public readonly string ContentEncoding;
        /// <summary>
        /// The language the content is in.
        /// </summary>
        public readonly string ContentLanguage;
        /// <summary>
        /// Size of the body in bytes.
        /// </summary>
        public readonly int ContentLength;
        /// <summary>
        /// A standard MIME type describing the format of the object data.
        /// </summary>
        public readonly string ContentType;
        /// <summary>
        /// [ETag](https://en.wikipedia.org/wiki/HTTP_ETag) generated for the object (an MD5 sum of the object content in case it's not encrypted)
        /// </summary>
        public readonly string Etag;
        /// <summary>
        /// If the object expiration is configured (see [object lifecycle management](http://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html)), the field includes this header. It includes the expiry-date and rule-id key value pairs providing object expiration information. The value of the rule-id is URL encoded.
        /// </summary>
        public readonly string Expiration;
        /// <summary>
        /// The date and time at which the object is no longer cacheable.
        /// </summary>
        public readonly string Expires;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Key;
        /// <summary>
        /// Last modified date of the object in RFC1123 format (e.g. `Mon, 02 Jan 2006 15:04:05 MST`)
        /// </summary>
        public readonly string LastModified;
        /// <summary>
        /// A map of metadata stored with the object in Spaces
        /// </summary>
        public readonly ImmutableDictionary<string, object> Metadata;
        public readonly string? Range;
        public readonly string Region;
        /// <summary>
        /// The latest version ID of the object returned.
        /// </summary>
        public readonly string VersionId;
        /// <summary>
        /// If the bucket is configured as a website, redirects requests for this object to another object in the same bucket or to an external URL. Spaces stores the value of this header in the object metadata.
        /// </summary>
        public readonly string WebsiteRedirectLocation;

        [OutputConstructor]
        private GetSpacesBucketObjectResult(
            string body,

            string bucket,

            string cacheControl,

            string contentDisposition,

            string contentEncoding,

            string contentLanguage,

            int contentLength,

            string contentType,

            string etag,

            string expiration,

            string expires,

            string id,

            string key,

            string lastModified,

            ImmutableDictionary<string, object> metadata,

            string? range,

            string region,

            string versionId,

            string websiteRedirectLocation)
        {
            Body = body;
            Bucket = bucket;
            CacheControl = cacheControl;
            ContentDisposition = contentDisposition;
            ContentEncoding = contentEncoding;
            ContentLanguage = contentLanguage;
            ContentLength = contentLength;
            ContentType = contentType;
            Etag = etag;
            Expiration = expiration;
            Expires = expires;
            Id = id;
            Key = key;
            LastModified = lastModified;
            Metadata = metadata;
            Range = range;
            Region = region;
            VersionId = versionId;
            WebsiteRedirectLocation = websiteRedirectLocation;
        }
    }
}
