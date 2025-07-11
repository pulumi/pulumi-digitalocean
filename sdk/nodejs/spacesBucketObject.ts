// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a bucket object resource for Spaces, DigitalOcean's object storage product.
 * The `digitalocean.SpacesBucketObject` resource allows the provider to upload content
 * to Spaces.
 *
 * The [Spaces API](https://docs.digitalocean.com/reference/api/spaces-api/) was
 * designed to be interoperable with Amazon's AWS S3 API. This allows users to
 * interact with the service while using the tools they already know. Spaces
 * mirrors S3's authentication framework and requests to Spaces require a key pair
 * similar to Amazon's Access ID and Secret Key.
 *
 * The authentication requirement can be met by either setting the
 * `SPACES_ACCESS_KEY_ID` and `SPACES_SECRET_ACCESS_KEY` environment variables or
 * the provider's `spacesAccessId` and `spacesSecretKey` arguments to the
 * access ID and secret you generate via the DigitalOcean control panel. For
 * example:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const static_assets = new digitalocean.SpacesBucket("static-assets", {});
 * ```
 *
 * For more information, See [An Introduction to DigitalOcean Spaces](https://www.digitalocean.com/community/tutorials/an-introduction-to-digitalocean-spaces)
 *
 * ## Example Usage
 *
 * ### Create a Key in a Spaces Bucket
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const foobar = new digitalocean.SpacesBucket("foobar", {
 *     name: "foobar",
 *     region: digitalocean.Region.NYC3,
 * });
 * const index = new digitalocean.SpacesBucketObject("index", {
 *     region: foobar.region,
 *     bucket: foobar.name,
 *     key: "index.html",
 *     content: "<html><body><p>This page is empty.</p></body></html>",
 *     contentType: "text/html",
 * });
 * ```
 *
 * ## Import
 *
 * Importing this resource is not supported.
 */
export class SpacesBucketObject extends pulumi.CustomResource {
    /**
     * Get an existing SpacesBucketObject resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SpacesBucketObjectState, opts?: pulumi.CustomResourceOptions): SpacesBucketObject {
        return new SpacesBucketObject(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'digitalocean:index/spacesBucketObject:SpacesBucketObject';

    /**
     * Returns true if the given object is an instance of SpacesBucketObject.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SpacesBucketObject {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SpacesBucketObject.__pulumiType;
    }

    /**
     * The canned ACL to apply. DigitalOcean supports "private" and "public-read". (Defaults to "private".)
     */
    public readonly acl!: pulumi.Output<string | undefined>;
    /**
     * The name of the bucket to put the file in.
     */
    public readonly bucket!: pulumi.Output<string>;
    /**
     * Specifies caching behavior along the request/reply chain Read [w3c cacheControl](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9) for further details.
     */
    public readonly cacheControl!: pulumi.Output<string | undefined>;
    /**
     * Literal string value to use as the object content, which will be uploaded as UTF-8-encoded text.
     */
    public readonly content!: pulumi.Output<string | undefined>;
    /**
     * Base64-encoded data that will be decoded and uploaded as raw bytes for the object content. This allows safely uploading non-UTF8 binary data, but is recommended only for small content such as the result of the `gzipbase64` function with small text strings. For larger objects, use `source` to stream the content from a disk file.
     */
    public readonly contentBase64!: pulumi.Output<string | undefined>;
    /**
     * Specifies presentational information for the object. Read [w3c contentDisposition](http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1) for further information.
     */
    public readonly contentDisposition!: pulumi.Output<string | undefined>;
    /**
     * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [w3c content encoding](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11) for further information.
     */
    public readonly contentEncoding!: pulumi.Output<string | undefined>;
    /**
     * The language the content is in e.g. en-US or en-GB.
     */
    public readonly contentLanguage!: pulumi.Output<string | undefined>;
    /**
     * A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
     */
    public readonly contentType!: pulumi.Output<string>;
    /**
     * Used to trigger updates.
     */
    public readonly etag!: pulumi.Output<string>;
    /**
     * Allow the object to be deleted by removing any legal hold on any object version.
     * Default is `false`. This value should be set to `true` only if the bucket has S3 object lock enabled.
     *
     * If no content is provided through `source`, `content` or `contentBase64`, then the object will be empty.
     *
     * > **Note:** The provider ignores all leading `/`s in the object's `key` and treats multiple `/`s in the rest of the object's `key` as a single `/`, so values of `/index.html` and `index.html` correspond to the same S3 object as do `first//second///third//` and `first/second/third/`.
     */
    public readonly forceDestroy!: pulumi.Output<boolean | undefined>;
    /**
     * The name of the object once it is in the bucket.
     */
    public readonly key!: pulumi.Output<string>;
    /**
     * A mapping of keys/values to provision metadata (will be automatically prefixed by `x-amz-meta-`, note that only lowercase label are currently supported by the AWS Go API).
     */
    public readonly metadata!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The region where the bucket resides (Defaults to `nyc3`)
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * The path to a file that will be read and uploaded as raw bytes for the object content.
     */
    public readonly source!: pulumi.Output<string | undefined>;
    /**
     * A unique version ID value for the object, if bucket versioning is enabled.
     */
    public /*out*/ readonly versionId!: pulumi.Output<string>;
    /**
     * Specifies a target URL for [website redirect](http://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html).
     */
    public readonly websiteRedirect!: pulumi.Output<string | undefined>;

    /**
     * Create a SpacesBucketObject resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SpacesBucketObjectArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SpacesBucketObjectArgs | SpacesBucketObjectState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SpacesBucketObjectState | undefined;
            resourceInputs["acl"] = state ? state.acl : undefined;
            resourceInputs["bucket"] = state ? state.bucket : undefined;
            resourceInputs["cacheControl"] = state ? state.cacheControl : undefined;
            resourceInputs["content"] = state ? state.content : undefined;
            resourceInputs["contentBase64"] = state ? state.contentBase64 : undefined;
            resourceInputs["contentDisposition"] = state ? state.contentDisposition : undefined;
            resourceInputs["contentEncoding"] = state ? state.contentEncoding : undefined;
            resourceInputs["contentLanguage"] = state ? state.contentLanguage : undefined;
            resourceInputs["contentType"] = state ? state.contentType : undefined;
            resourceInputs["etag"] = state ? state.etag : undefined;
            resourceInputs["forceDestroy"] = state ? state.forceDestroy : undefined;
            resourceInputs["key"] = state ? state.key : undefined;
            resourceInputs["metadata"] = state ? state.metadata : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["source"] = state ? state.source : undefined;
            resourceInputs["versionId"] = state ? state.versionId : undefined;
            resourceInputs["websiteRedirect"] = state ? state.websiteRedirect : undefined;
        } else {
            const args = argsOrState as SpacesBucketObjectArgs | undefined;
            if ((!args || args.bucket === undefined) && !opts.urn) {
                throw new Error("Missing required property 'bucket'");
            }
            if ((!args || args.key === undefined) && !opts.urn) {
                throw new Error("Missing required property 'key'");
            }
            if ((!args || args.region === undefined) && !opts.urn) {
                throw new Error("Missing required property 'region'");
            }
            resourceInputs["acl"] = args ? args.acl : undefined;
            resourceInputs["bucket"] = args ? args.bucket : undefined;
            resourceInputs["cacheControl"] = args ? args.cacheControl : undefined;
            resourceInputs["content"] = args ? args.content : undefined;
            resourceInputs["contentBase64"] = args ? args.contentBase64 : undefined;
            resourceInputs["contentDisposition"] = args ? args.contentDisposition : undefined;
            resourceInputs["contentEncoding"] = args ? args.contentEncoding : undefined;
            resourceInputs["contentLanguage"] = args ? args.contentLanguage : undefined;
            resourceInputs["contentType"] = args ? args.contentType : undefined;
            resourceInputs["etag"] = args ? args.etag : undefined;
            resourceInputs["forceDestroy"] = args ? args.forceDestroy : undefined;
            resourceInputs["key"] = args ? args.key : undefined;
            resourceInputs["metadata"] = args ? args.metadata : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["source"] = args ? args.source : undefined;
            resourceInputs["websiteRedirect"] = args ? args.websiteRedirect : undefined;
            resourceInputs["versionId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SpacesBucketObject.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SpacesBucketObject resources.
 */
export interface SpacesBucketObjectState {
    /**
     * The canned ACL to apply. DigitalOcean supports "private" and "public-read". (Defaults to "private".)
     */
    acl?: pulumi.Input<string>;
    /**
     * The name of the bucket to put the file in.
     */
    bucket?: pulumi.Input<string>;
    /**
     * Specifies caching behavior along the request/reply chain Read [w3c cacheControl](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9) for further details.
     */
    cacheControl?: pulumi.Input<string>;
    /**
     * Literal string value to use as the object content, which will be uploaded as UTF-8-encoded text.
     */
    content?: pulumi.Input<string>;
    /**
     * Base64-encoded data that will be decoded and uploaded as raw bytes for the object content. This allows safely uploading non-UTF8 binary data, but is recommended only for small content such as the result of the `gzipbase64` function with small text strings. For larger objects, use `source` to stream the content from a disk file.
     */
    contentBase64?: pulumi.Input<string>;
    /**
     * Specifies presentational information for the object. Read [w3c contentDisposition](http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1) for further information.
     */
    contentDisposition?: pulumi.Input<string>;
    /**
     * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [w3c content encoding](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11) for further information.
     */
    contentEncoding?: pulumi.Input<string>;
    /**
     * The language the content is in e.g. en-US or en-GB.
     */
    contentLanguage?: pulumi.Input<string>;
    /**
     * A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
     */
    contentType?: pulumi.Input<string>;
    /**
     * Used to trigger updates.
     */
    etag?: pulumi.Input<string>;
    /**
     * Allow the object to be deleted by removing any legal hold on any object version.
     * Default is `false`. This value should be set to `true` only if the bucket has S3 object lock enabled.
     *
     * If no content is provided through `source`, `content` or `contentBase64`, then the object will be empty.
     *
     * > **Note:** The provider ignores all leading `/`s in the object's `key` and treats multiple `/`s in the rest of the object's `key` as a single `/`, so values of `/index.html` and `index.html` correspond to the same S3 object as do `first//second///third//` and `first/second/third/`.
     */
    forceDestroy?: pulumi.Input<boolean>;
    /**
     * The name of the object once it is in the bucket.
     */
    key?: pulumi.Input<string>;
    /**
     * A mapping of keys/values to provision metadata (will be automatically prefixed by `x-amz-meta-`, note that only lowercase label are currently supported by the AWS Go API).
     */
    metadata?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The region where the bucket resides (Defaults to `nyc3`)
     */
    region?: pulumi.Input<string>;
    /**
     * The path to a file that will be read and uploaded as raw bytes for the object content.
     */
    source?: pulumi.Input<string>;
    /**
     * A unique version ID value for the object, if bucket versioning is enabled.
     */
    versionId?: pulumi.Input<string>;
    /**
     * Specifies a target URL for [website redirect](http://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html).
     */
    websiteRedirect?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SpacesBucketObject resource.
 */
export interface SpacesBucketObjectArgs {
    /**
     * The canned ACL to apply. DigitalOcean supports "private" and "public-read". (Defaults to "private".)
     */
    acl?: pulumi.Input<string>;
    /**
     * The name of the bucket to put the file in.
     */
    bucket: pulumi.Input<string>;
    /**
     * Specifies caching behavior along the request/reply chain Read [w3c cacheControl](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9) for further details.
     */
    cacheControl?: pulumi.Input<string>;
    /**
     * Literal string value to use as the object content, which will be uploaded as UTF-8-encoded text.
     */
    content?: pulumi.Input<string>;
    /**
     * Base64-encoded data that will be decoded and uploaded as raw bytes for the object content. This allows safely uploading non-UTF8 binary data, but is recommended only for small content such as the result of the `gzipbase64` function with small text strings. For larger objects, use `source` to stream the content from a disk file.
     */
    contentBase64?: pulumi.Input<string>;
    /**
     * Specifies presentational information for the object. Read [w3c contentDisposition](http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1) for further information.
     */
    contentDisposition?: pulumi.Input<string>;
    /**
     * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [w3c content encoding](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11) for further information.
     */
    contentEncoding?: pulumi.Input<string>;
    /**
     * The language the content is in e.g. en-US or en-GB.
     */
    contentLanguage?: pulumi.Input<string>;
    /**
     * A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
     */
    contentType?: pulumi.Input<string>;
    /**
     * Used to trigger updates.
     */
    etag?: pulumi.Input<string>;
    /**
     * Allow the object to be deleted by removing any legal hold on any object version.
     * Default is `false`. This value should be set to `true` only if the bucket has S3 object lock enabled.
     *
     * If no content is provided through `source`, `content` or `contentBase64`, then the object will be empty.
     *
     * > **Note:** The provider ignores all leading `/`s in the object's `key` and treats multiple `/`s in the rest of the object's `key` as a single `/`, so values of `/index.html` and `index.html` correspond to the same S3 object as do `first//second///third//` and `first/second/third/`.
     */
    forceDestroy?: pulumi.Input<boolean>;
    /**
     * The name of the object once it is in the bucket.
     */
    key: pulumi.Input<string>;
    /**
     * A mapping of keys/values to provision metadata (will be automatically prefixed by `x-amz-meta-`, note that only lowercase label are currently supported by the AWS Go API).
     */
    metadata?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The region where the bucket resides (Defaults to `nyc3`)
     */
    region: pulumi.Input<string>;
    /**
     * The path to a file that will be read and uploaded as raw bytes for the object content.
     */
    source?: pulumi.Input<string>;
    /**
     * Specifies a target URL for [website redirect](http://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html).
     */
    websiteRedirect?: pulumi.Input<string>;
}
