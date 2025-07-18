// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean
{
    /// <summary>
    /// Provides a bucket object resource for Spaces, DigitalOcean's object storage product.
    /// The `digitalocean.SpacesBucketObject` resource allows the provider to upload content
    /// to Spaces.
    /// 
    /// The [Spaces API](https://docs.digitalocean.com/reference/api/spaces-api/) was
    /// designed to be interoperable with Amazon's AWS S3 API. This allows users to
    /// interact with the service while using the tools they already know. Spaces
    /// mirrors S3's authentication framework and requests to Spaces require a key pair
    /// similar to Amazon's Access ID and Secret Key.
    /// 
    /// The authentication requirement can be met by either setting the
    /// `SPACES_ACCESS_KEY_ID` and `SPACES_SECRET_ACCESS_KEY` environment variables or
    /// the provider's `spaces_access_id` and `spaces_secret_key` arguments to the
    /// access ID and secret you generate via the DigitalOcean control panel. For
    /// example:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using DigitalOcean = Pulumi.DigitalOcean;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var static_assets = new DigitalOcean.SpacesBucket("static-assets");
    /// 
    /// });
    /// ```
    /// 
    /// For more information, See [An Introduction to DigitalOcean Spaces](https://www.digitalocean.com/community/tutorials/an-introduction-to-digitalocean-spaces)
    /// 
    /// ## Example Usage
    /// 
    /// ### Create a Key in a Spaces Bucket
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using DigitalOcean = Pulumi.DigitalOcean;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foobar = new DigitalOcean.SpacesBucket("foobar", new()
    ///     {
    ///         Name = "foobar",
    ///         Region = DigitalOcean.Region.NYC3,
    ///     });
    /// 
    ///     var index = new DigitalOcean.SpacesBucketObject("index", new()
    ///     {
    ///         Region = foobar.Region,
    ///         Bucket = foobar.Name,
    ///         Key = "index.html",
    ///         Content = "&lt;html&gt;&lt;body&gt;&lt;p&gt;This page is empty.&lt;/p&gt;&lt;/body&gt;&lt;/html&gt;",
    ///         ContentType = "text/html",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Importing this resource is not supported.
    /// </summary>
    [DigitalOceanResourceType("digitalocean:index/spacesBucketObject:SpacesBucketObject")]
    public partial class SpacesBucketObject : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The canned ACL to apply. DigitalOcean supports "private" and "public-read". (Defaults to "private".)
        /// </summary>
        [Output("acl")]
        public Output<string?> Acl { get; private set; } = null!;

        /// <summary>
        /// The name of the bucket to put the file in.
        /// </summary>
        [Output("bucket")]
        public Output<string> Bucket { get; private set; } = null!;

        /// <summary>
        /// Specifies caching behavior along the request/reply chain Read [w3c cache_control](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9) for further details.
        /// </summary>
        [Output("cacheControl")]
        public Output<string?> CacheControl { get; private set; } = null!;

        /// <summary>
        /// Literal string value to use as the object content, which will be uploaded as UTF-8-encoded text.
        /// </summary>
        [Output("content")]
        public Output<string?> Content { get; private set; } = null!;

        /// <summary>
        /// Base64-encoded data that will be decoded and uploaded as raw bytes for the object content. This allows safely uploading non-UTF8 binary data, but is recommended only for small content such as the result of the `gzipbase64` function with small text strings. For larger objects, use `source` to stream the content from a disk file.
        /// </summary>
        [Output("contentBase64")]
        public Output<string?> ContentBase64 { get; private set; } = null!;

        /// <summary>
        /// Specifies presentational information for the object. Read [w3c content_disposition](http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1) for further information.
        /// </summary>
        [Output("contentDisposition")]
        public Output<string?> ContentDisposition { get; private set; } = null!;

        /// <summary>
        /// Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [w3c content encoding](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11) for further information.
        /// </summary>
        [Output("contentEncoding")]
        public Output<string?> ContentEncoding { get; private set; } = null!;

        /// <summary>
        /// The language the content is in e.g. en-US or en-GB.
        /// </summary>
        [Output("contentLanguage")]
        public Output<string?> ContentLanguage { get; private set; } = null!;

        /// <summary>
        /// A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
        /// </summary>
        [Output("contentType")]
        public Output<string> ContentType { get; private set; } = null!;

        /// <summary>
        /// Used to trigger updates.
        /// </summary>
        [Output("etag")]
        public Output<string> Etag { get; private set; } = null!;

        /// <summary>
        /// Allow the object to be deleted by removing any legal hold on any object version.
        /// Default is `false`. This value should be set to `true` only if the bucket has S3 object lock enabled.
        /// 
        /// If no content is provided through `source`, `content` or `content_base64`, then the object will be empty.
        /// 
        /// &gt; **Note:** The provider ignores all leading `/`s in the object's `key` and treats multiple `/`s in the rest of the object's `key` as a single `/`, so values of `/index.html` and `index.html` correspond to the same S3 object as do `first//second///third//` and `first/second/third/`.
        /// </summary>
        [Output("forceDestroy")]
        public Output<bool?> ForceDestroy { get; private set; } = null!;

        /// <summary>
        /// The name of the object once it is in the bucket.
        /// </summary>
        [Output("key")]
        public Output<string> Key { get; private set; } = null!;

        /// <summary>
        /// A mapping of keys/values to provision metadata (will be automatically prefixed by `x-amz-meta-`, note that only lowercase label are currently supported by the AWS Go API).
        /// </summary>
        [Output("metadata")]
        public Output<ImmutableDictionary<string, string>?> Metadata { get; private set; } = null!;

        /// <summary>
        /// The region where the bucket resides (Defaults to `nyc3`)
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// The path to a file that will be read and uploaded as raw bytes for the object content.
        /// </summary>
        [Output("source")]
        public Output<string?> Source { get; private set; } = null!;

        /// <summary>
        /// A unique version ID value for the object, if bucket versioning is enabled.
        /// </summary>
        [Output("versionId")]
        public Output<string> VersionId { get; private set; } = null!;

        /// <summary>
        /// Specifies a target URL for [website redirect](http://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html).
        /// </summary>
        [Output("websiteRedirect")]
        public Output<string?> WebsiteRedirect { get; private set; } = null!;


        /// <summary>
        /// Create a SpacesBucketObject resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SpacesBucketObject(string name, SpacesBucketObjectArgs args, CustomResourceOptions? options = null)
            : base("digitalocean:index/spacesBucketObject:SpacesBucketObject", name, args ?? new SpacesBucketObjectArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SpacesBucketObject(string name, Input<string> id, SpacesBucketObjectState? state = null, CustomResourceOptions? options = null)
            : base("digitalocean:index/spacesBucketObject:SpacesBucketObject", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SpacesBucketObject resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SpacesBucketObject Get(string name, Input<string> id, SpacesBucketObjectState? state = null, CustomResourceOptions? options = null)
        {
            return new SpacesBucketObject(name, id, state, options);
        }
    }

    public sealed class SpacesBucketObjectArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The canned ACL to apply. DigitalOcean supports "private" and "public-read". (Defaults to "private".)
        /// </summary>
        [Input("acl")]
        public Input<string>? Acl { get; set; }

        /// <summary>
        /// The name of the bucket to put the file in.
        /// </summary>
        [Input("bucket", required: true)]
        public Input<string> Bucket { get; set; } = null!;

        /// <summary>
        /// Specifies caching behavior along the request/reply chain Read [w3c cache_control](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9) for further details.
        /// </summary>
        [Input("cacheControl")]
        public Input<string>? CacheControl { get; set; }

        /// <summary>
        /// Literal string value to use as the object content, which will be uploaded as UTF-8-encoded text.
        /// </summary>
        [Input("content")]
        public Input<string>? Content { get; set; }

        /// <summary>
        /// Base64-encoded data that will be decoded and uploaded as raw bytes for the object content. This allows safely uploading non-UTF8 binary data, but is recommended only for small content such as the result of the `gzipbase64` function with small text strings. For larger objects, use `source` to stream the content from a disk file.
        /// </summary>
        [Input("contentBase64")]
        public Input<string>? ContentBase64 { get; set; }

        /// <summary>
        /// Specifies presentational information for the object. Read [w3c content_disposition](http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1) for further information.
        /// </summary>
        [Input("contentDisposition")]
        public Input<string>? ContentDisposition { get; set; }

        /// <summary>
        /// Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [w3c content encoding](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11) for further information.
        /// </summary>
        [Input("contentEncoding")]
        public Input<string>? ContentEncoding { get; set; }

        /// <summary>
        /// The language the content is in e.g. en-US or en-GB.
        /// </summary>
        [Input("contentLanguage")]
        public Input<string>? ContentLanguage { get; set; }

        /// <summary>
        /// A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
        /// </summary>
        [Input("contentType")]
        public Input<string>? ContentType { get; set; }

        /// <summary>
        /// Used to trigger updates.
        /// </summary>
        [Input("etag")]
        public Input<string>? Etag { get; set; }

        /// <summary>
        /// Allow the object to be deleted by removing any legal hold on any object version.
        /// Default is `false`. This value should be set to `true` only if the bucket has S3 object lock enabled.
        /// 
        /// If no content is provided through `source`, `content` or `content_base64`, then the object will be empty.
        /// 
        /// &gt; **Note:** The provider ignores all leading `/`s in the object's `key` and treats multiple `/`s in the rest of the object's `key` as a single `/`, so values of `/index.html` and `index.html` correspond to the same S3 object as do `first//second///third//` and `first/second/third/`.
        /// </summary>
        [Input("forceDestroy")]
        public Input<bool>? ForceDestroy { get; set; }

        /// <summary>
        /// The name of the object once it is in the bucket.
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        [Input("metadata")]
        private InputMap<string>? _metadata;

        /// <summary>
        /// A mapping of keys/values to provision metadata (will be automatically prefixed by `x-amz-meta-`, note that only lowercase label are currently supported by the AWS Go API).
        /// </summary>
        public InputMap<string> Metadata
        {
            get => _metadata ?? (_metadata = new InputMap<string>());
            set => _metadata = value;
        }

        /// <summary>
        /// The region where the bucket resides (Defaults to `nyc3`)
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        /// <summary>
        /// The path to a file that will be read and uploaded as raw bytes for the object content.
        /// </summary>
        [Input("source")]
        public Input<string>? Source { get; set; }

        /// <summary>
        /// Specifies a target URL for [website redirect](http://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html).
        /// </summary>
        [Input("websiteRedirect")]
        public Input<string>? WebsiteRedirect { get; set; }

        public SpacesBucketObjectArgs()
        {
        }
        public static new SpacesBucketObjectArgs Empty => new SpacesBucketObjectArgs();
    }

    public sealed class SpacesBucketObjectState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The canned ACL to apply. DigitalOcean supports "private" and "public-read". (Defaults to "private".)
        /// </summary>
        [Input("acl")]
        public Input<string>? Acl { get; set; }

        /// <summary>
        /// The name of the bucket to put the file in.
        /// </summary>
        [Input("bucket")]
        public Input<string>? Bucket { get; set; }

        /// <summary>
        /// Specifies caching behavior along the request/reply chain Read [w3c cache_control](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9) for further details.
        /// </summary>
        [Input("cacheControl")]
        public Input<string>? CacheControl { get; set; }

        /// <summary>
        /// Literal string value to use as the object content, which will be uploaded as UTF-8-encoded text.
        /// </summary>
        [Input("content")]
        public Input<string>? Content { get; set; }

        /// <summary>
        /// Base64-encoded data that will be decoded and uploaded as raw bytes for the object content. This allows safely uploading non-UTF8 binary data, but is recommended only for small content such as the result of the `gzipbase64` function with small text strings. For larger objects, use `source` to stream the content from a disk file.
        /// </summary>
        [Input("contentBase64")]
        public Input<string>? ContentBase64 { get; set; }

        /// <summary>
        /// Specifies presentational information for the object. Read [w3c content_disposition](http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1) for further information.
        /// </summary>
        [Input("contentDisposition")]
        public Input<string>? ContentDisposition { get; set; }

        /// <summary>
        /// Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [w3c content encoding](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11) for further information.
        /// </summary>
        [Input("contentEncoding")]
        public Input<string>? ContentEncoding { get; set; }

        /// <summary>
        /// The language the content is in e.g. en-US or en-GB.
        /// </summary>
        [Input("contentLanguage")]
        public Input<string>? ContentLanguage { get; set; }

        /// <summary>
        /// A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
        /// </summary>
        [Input("contentType")]
        public Input<string>? ContentType { get; set; }

        /// <summary>
        /// Used to trigger updates.
        /// </summary>
        [Input("etag")]
        public Input<string>? Etag { get; set; }

        /// <summary>
        /// Allow the object to be deleted by removing any legal hold on any object version.
        /// Default is `false`. This value should be set to `true` only if the bucket has S3 object lock enabled.
        /// 
        /// If no content is provided through `source`, `content` or `content_base64`, then the object will be empty.
        /// 
        /// &gt; **Note:** The provider ignores all leading `/`s in the object's `key` and treats multiple `/`s in the rest of the object's `key` as a single `/`, so values of `/index.html` and `index.html` correspond to the same S3 object as do `first//second///third//` and `first/second/third/`.
        /// </summary>
        [Input("forceDestroy")]
        public Input<bool>? ForceDestroy { get; set; }

        /// <summary>
        /// The name of the object once it is in the bucket.
        /// </summary>
        [Input("key")]
        public Input<string>? Key { get; set; }

        [Input("metadata")]
        private InputMap<string>? _metadata;

        /// <summary>
        /// A mapping of keys/values to provision metadata (will be automatically prefixed by `x-amz-meta-`, note that only lowercase label are currently supported by the AWS Go API).
        /// </summary>
        public InputMap<string> Metadata
        {
            get => _metadata ?? (_metadata = new InputMap<string>());
            set => _metadata = value;
        }

        /// <summary>
        /// The region where the bucket resides (Defaults to `nyc3`)
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// The path to a file that will be read and uploaded as raw bytes for the object content.
        /// </summary>
        [Input("source")]
        public Input<string>? Source { get; set; }

        /// <summary>
        /// A unique version ID value for the object, if bucket versioning is enabled.
        /// </summary>
        [Input("versionId")]
        public Input<string>? VersionId { get; set; }

        /// <summary>
        /// Specifies a target URL for [website redirect](http://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html).
        /// </summary>
        [Input("websiteRedirect")]
        public Input<string>? WebsiteRedirect { get; set; }

        public SpacesBucketObjectState()
        {
        }
        public static new SpacesBucketObjectState Empty => new SpacesBucketObjectState();
    }
}
