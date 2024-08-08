// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.digitalocean.SpacesBucketObjectArgs;
import com.pulumi.digitalocean.Utilities;
import com.pulumi.digitalocean.inputs.SpacesBucketObjectState;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a bucket object resource for Spaces, DigitalOcean&#39;s object storage product.
 * The `digitalocean.SpacesBucketObject` resource allows the provider to upload content
 * to Spaces.
 * 
 * The [Spaces API](https://docs.digitalocean.com/reference/api/spaces-api/) was
 * designed to be interoperable with Amazon&#39;s AWS S3 API. This allows users to
 * interact with the service while using the tools they already know. Spaces
 * mirrors S3&#39;s authentication framework and requests to Spaces require a key pair
 * similar to Amazon&#39;s Access ID and Secret Key.
 * 
 * The authentication requirement can be met by either setting the
 * `SPACES_ACCESS_KEY_ID` and `SPACES_SECRET_ACCESS_KEY` environment variables or
 * the provider&#39;s `spaces_access_id` and `spaces_secret_key` arguments to the
 * access ID and secret you generate via the DigitalOcean control panel. For
 * example:
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.digitalocean.SpacesBucket;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var static_assets = new SpacesBucket("static-assets");
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * For more information, See [An Introduction to DigitalOcean Spaces](https://www.digitalocean.com/community/tutorials/an-introduction-to-digitalocean-spaces)
 * 
 * ## Example Usage
 * 
 * ### Create a Key in a Spaces Bucket
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.digitalocean.SpacesBucket;
 * import com.pulumi.digitalocean.SpacesBucketArgs;
 * import com.pulumi.digitalocean.SpacesBucketObject;
 * import com.pulumi.digitalocean.SpacesBucketObjectArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var foobar = new SpacesBucket("foobar", SpacesBucketArgs.builder()
 *             .name("foobar")
 *             .region("nyc3")
 *             .build());
 * 
 *         var index = new SpacesBucketObject("index", SpacesBucketObjectArgs.builder()
 *             .region(foobar.region())
 *             .bucket(foobar.name())
 *             .key("index.html")
 *             .content("<html><body><p>This page is empty.</p></body></html>")
 *             .contentType("text/html")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Importing this resource is not supported.
 * 
 */
@ResourceType(type="digitalocean:index/spacesBucketObject:SpacesBucketObject")
public class SpacesBucketObject extends com.pulumi.resources.CustomResource {
    /**
     * The canned ACL to apply. DigitalOcean supports &#34;private&#34; and &#34;public-read&#34;. (Defaults to &#34;private&#34;.)
     * 
     */
    @Export(name="acl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> acl;

    /**
     * @return The canned ACL to apply. DigitalOcean supports &#34;private&#34; and &#34;public-read&#34;. (Defaults to &#34;private&#34;.)
     * 
     */
    public Output<Optional<String>> acl() {
        return Codegen.optional(this.acl);
    }
    /**
     * The name of the bucket to put the file in.
     * 
     */
    @Export(name="bucket", refs={String.class}, tree="[0]")
    private Output<String> bucket;

    /**
     * @return The name of the bucket to put the file in.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }
    /**
     * Specifies caching behavior along the request/reply chain Read [w3c cache_control](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9) for further details.
     * 
     */
    @Export(name="cacheControl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> cacheControl;

    /**
     * @return Specifies caching behavior along the request/reply chain Read [w3c cache_control](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9) for further details.
     * 
     */
    public Output<Optional<String>> cacheControl() {
        return Codegen.optional(this.cacheControl);
    }
    /**
     * Literal string value to use as the object content, which will be uploaded as UTF-8-encoded text.
     * 
     */
    @Export(name="content", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> content;

    /**
     * @return Literal string value to use as the object content, which will be uploaded as UTF-8-encoded text.
     * 
     */
    public Output<Optional<String>> content() {
        return Codegen.optional(this.content);
    }
    /**
     * Base64-encoded data that will be decoded and uploaded as raw bytes for the object content. This allows safely uploading non-UTF8 binary data, but is recommended only for small content such as the result of the `gzipbase64` function with small text strings. For larger objects, use `source` to stream the content from a disk file.
     * 
     */
    @Export(name="contentBase64", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> contentBase64;

    /**
     * @return Base64-encoded data that will be decoded and uploaded as raw bytes for the object content. This allows safely uploading non-UTF8 binary data, but is recommended only for small content such as the result of the `gzipbase64` function with small text strings. For larger objects, use `source` to stream the content from a disk file.
     * 
     */
    public Output<Optional<String>> contentBase64() {
        return Codegen.optional(this.contentBase64);
    }
    /**
     * Specifies presentational information for the object. Read [w3c content_disposition](http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1) for further information.
     * 
     */
    @Export(name="contentDisposition", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> contentDisposition;

    /**
     * @return Specifies presentational information for the object. Read [w3c content_disposition](http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1) for further information.
     * 
     */
    public Output<Optional<String>> contentDisposition() {
        return Codegen.optional(this.contentDisposition);
    }
    /**
     * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [w3c content encoding](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11) for further information.
     * 
     */
    @Export(name="contentEncoding", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> contentEncoding;

    /**
     * @return Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [w3c content encoding](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11) for further information.
     * 
     */
    public Output<Optional<String>> contentEncoding() {
        return Codegen.optional(this.contentEncoding);
    }
    /**
     * The language the content is in e.g. en-US or en-GB.
     * 
     */
    @Export(name="contentLanguage", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> contentLanguage;

    /**
     * @return The language the content is in e.g. en-US or en-GB.
     * 
     */
    public Output<Optional<String>> contentLanguage() {
        return Codegen.optional(this.contentLanguage);
    }
    /**
     * A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
     * 
     */
    @Export(name="contentType", refs={String.class}, tree="[0]")
    private Output<String> contentType;

    /**
     * @return A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
     * 
     */
    public Output<String> contentType() {
        return this.contentType;
    }
    /**
     * Used to trigger updates.
     * 
     */
    @Export(name="etag", refs={String.class}, tree="[0]")
    private Output<String> etag;

    /**
     * @return Used to trigger updates.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * Allow the object to be deleted by removing any legal hold on any object version.
     * Default is `false`. This value should be set to `true` only if the bucket has S3 object lock enabled.
     * 
     * If no content is provided through `source`, `content` or `content_base64`, then the object will be empty.
     * 
     * &gt; **Note:** The provider ignores all leading `/`s in the object&#39;s `key` and treats multiple `/`s in the rest of the object&#39;s `key` as a single `/`, so values of `/index.html` and `index.html` correspond to the same S3 object as do `first//second///third//` and `first/second/third/`.
     * 
     */
    @Export(name="forceDestroy", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> forceDestroy;

    /**
     * @return Allow the object to be deleted by removing any legal hold on any object version.
     * Default is `false`. This value should be set to `true` only if the bucket has S3 object lock enabled.
     * 
     * If no content is provided through `source`, `content` or `content_base64`, then the object will be empty.
     * 
     * &gt; **Note:** The provider ignores all leading `/`s in the object&#39;s `key` and treats multiple `/`s in the rest of the object&#39;s `key` as a single `/`, so values of `/index.html` and `index.html` correspond to the same S3 object as do `first//second///third//` and `first/second/third/`.
     * 
     */
    public Output<Optional<Boolean>> forceDestroy() {
        return Codegen.optional(this.forceDestroy);
    }
    /**
     * The name of the object once it is in the bucket.
     * 
     */
    @Export(name="key", refs={String.class}, tree="[0]")
    private Output<String> key;

    /**
     * @return The name of the object once it is in the bucket.
     * 
     */
    public Output<String> key() {
        return this.key;
    }
    /**
     * A mapping of keys/values to provision metadata (will be automatically prefixed by `x-amz-meta-`, note that only lowercase label are currently supported by the AWS Go API).
     * 
     */
    @Export(name="metadata", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> metadata;

    /**
     * @return A mapping of keys/values to provision metadata (will be automatically prefixed by `x-amz-meta-`, note that only lowercase label are currently supported by the AWS Go API).
     * 
     */
    public Output<Optional<Map<String,String>>> metadata() {
        return Codegen.optional(this.metadata);
    }
    /**
     * The region where the bucket resides (Defaults to `nyc3`)
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return The region where the bucket resides (Defaults to `nyc3`)
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * The path to a file that will be read and uploaded as raw bytes for the object content.
     * 
     */
    @Export(name="source", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> source;

    /**
     * @return The path to a file that will be read and uploaded as raw bytes for the object content.
     * 
     */
    public Output<Optional<String>> source() {
        return Codegen.optional(this.source);
    }
    /**
     * A unique version ID value for the object, if bucket versioning is enabled.
     * 
     */
    @Export(name="versionId", refs={String.class}, tree="[0]")
    private Output<String> versionId;

    /**
     * @return A unique version ID value for the object, if bucket versioning is enabled.
     * 
     */
    public Output<String> versionId() {
        return this.versionId;
    }
    /**
     * Specifies a target URL for [website redirect](http://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html).
     * 
     */
    @Export(name="websiteRedirect", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> websiteRedirect;

    /**
     * @return Specifies a target URL for [website redirect](http://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html).
     * 
     */
    public Output<Optional<String>> websiteRedirect() {
        return Codegen.optional(this.websiteRedirect);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SpacesBucketObject(java.lang.String name) {
        this(name, SpacesBucketObjectArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SpacesBucketObject(java.lang.String name, SpacesBucketObjectArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SpacesBucketObject(java.lang.String name, SpacesBucketObjectArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/spacesBucketObject:SpacesBucketObject", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private SpacesBucketObject(java.lang.String name, Output<java.lang.String> id, @Nullable SpacesBucketObjectState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/spacesBucketObject:SpacesBucketObject", name, state, makeResourceOptions(options, id), false);
    }

    private static SpacesBucketObjectArgs makeArgs(SpacesBucketObjectArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SpacesBucketObjectArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static SpacesBucketObject get(java.lang.String name, Output<java.lang.String> id, @Nullable SpacesBucketObjectState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SpacesBucketObject(name, id, state, options);
    }
}
