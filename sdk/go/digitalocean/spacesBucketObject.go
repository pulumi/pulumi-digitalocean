// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-digitalocean/sdk/v4/go/digitalocean/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a bucket object resource for Spaces, DigitalOcean's object storage product.
// The `SpacesBucketObject` resource allows the provider to upload content
// to Spaces.
//
// The [Spaces API](https://docs.digitalocean.com/reference/api/spaces-api/) was
// designed to be interoperable with Amazon's AWS S3 API. This allows users to
// interact with the service while using the tools they already know. Spaces
// mirrors S3's authentication framework and requests to Spaces require a key pair
// similar to Amazon's Access ID and Secret Key.
//
// The authentication requirement can be met by either setting the
// `SPACES_ACCESS_KEY_ID` and `SPACES_SECRET_ACCESS_KEY` environment variables or
// the provider's `spacesAccessId` and `spacesSecretKey` arguments to the
// access ID and secret you generate via the DigitalOcean control panel. For
// example:
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-digitalocean/sdk/v4/go/digitalocean"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := digitalocean.NewSpacesBucket(ctx, "static-assets", nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// For more information, See [An Introduction to DigitalOcean Spaces](https://www.digitalocean.com/community/tutorials/an-introduction-to-digitalocean-spaces)
//
// ## Example Usage
//
// ### Create a Key in a Spaces Bucket
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-digitalocean/sdk/v4/go/digitalocean"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			foobar, err := digitalocean.NewSpacesBucket(ctx, "foobar", &digitalocean.SpacesBucketArgs{
//				Name:   pulumi.String("foobar"),
//				Region: pulumi.String(digitalocean.RegionNYC3),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = digitalocean.NewSpacesBucketObject(ctx, "index", &digitalocean.SpacesBucketObjectArgs{
//				Region:      foobar.Region,
//				Bucket:      foobar.Name,
//				Key:         pulumi.String("index.html"),
//				Content:     pulumi.String("<html><body><p>This page is empty.</p></body></html>"),
//				ContentType: pulumi.String("text/html"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Importing this resource is not supported.
type SpacesBucketObject struct {
	pulumi.CustomResourceState

	// The canned ACL to apply. DigitalOcean supports "private" and "public-read". (Defaults to "private".)
	Acl pulumi.StringPtrOutput `pulumi:"acl"`
	// The name of the bucket to put the file in.
	Bucket pulumi.StringOutput `pulumi:"bucket"`
	// Specifies caching behavior along the request/reply chain Read [w3c cacheControl](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9) for further details.
	CacheControl pulumi.StringPtrOutput `pulumi:"cacheControl"`
	// Literal string value to use as the object content, which will be uploaded as UTF-8-encoded text.
	Content pulumi.StringPtrOutput `pulumi:"content"`
	// Base64-encoded data that will be decoded and uploaded as raw bytes for the object content. This allows safely uploading non-UTF8 binary data, but is recommended only for small content such as the result of the `gzipbase64` function with small text strings. For larger objects, use `source` to stream the content from a disk file.
	ContentBase64 pulumi.StringPtrOutput `pulumi:"contentBase64"`
	// Specifies presentational information for the object. Read [w3c contentDisposition](http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1) for further information.
	ContentDisposition pulumi.StringPtrOutput `pulumi:"contentDisposition"`
	// Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [w3c content encoding](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11) for further information.
	ContentEncoding pulumi.StringPtrOutput `pulumi:"contentEncoding"`
	// The language the content is in e.g. en-US or en-GB.
	ContentLanguage pulumi.StringPtrOutput `pulumi:"contentLanguage"`
	// A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
	ContentType pulumi.StringOutput `pulumi:"contentType"`
	// Used to trigger updates.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// Allow the object to be deleted by removing any legal hold on any object version.
	// Default is `false`. This value should be set to `true` only if the bucket has S3 object lock enabled.
	//
	// If no content is provided through `source`, `content` or `contentBase64`, then the object will be empty.
	//
	// > **Note:** The provider ignores all leading `/`s in the object's `key` and treats multiple `/`s in the rest of the object's `key` as a single `/`, so values of `/index.html` and `index.html` correspond to the same S3 object as do `first//second///third//` and `first/second/third/`.
	ForceDestroy pulumi.BoolPtrOutput `pulumi:"forceDestroy"`
	// The name of the object once it is in the bucket.
	Key pulumi.StringOutput `pulumi:"key"`
	// A mapping of keys/values to provision metadata (will be automatically prefixed by `x-amz-meta-`, note that only lowercase label are currently supported by the AWS Go API).
	Metadata pulumi.StringMapOutput `pulumi:"metadata"`
	// The region where the bucket resides (Defaults to `nyc3`)
	Region pulumi.StringOutput `pulumi:"region"`
	// The path to a file that will be read and uploaded as raw bytes for the object content.
	Source pulumi.StringPtrOutput `pulumi:"source"`
	// A unique version ID value for the object, if bucket versioning is enabled.
	VersionId pulumi.StringOutput `pulumi:"versionId"`
	// Specifies a target URL for [website redirect](http://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html).
	WebsiteRedirect pulumi.StringPtrOutput `pulumi:"websiteRedirect"`
}

// NewSpacesBucketObject registers a new resource with the given unique name, arguments, and options.
func NewSpacesBucketObject(ctx *pulumi.Context,
	name string, args *SpacesBucketObjectArgs, opts ...pulumi.ResourceOption) (*SpacesBucketObject, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Bucket == nil {
		return nil, errors.New("invalid value for required argument 'Bucket'")
	}
	if args.Key == nil {
		return nil, errors.New("invalid value for required argument 'Key'")
	}
	if args.Region == nil {
		return nil, errors.New("invalid value for required argument 'Region'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SpacesBucketObject
	err := ctx.RegisterResource("digitalocean:index/spacesBucketObject:SpacesBucketObject", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSpacesBucketObject gets an existing SpacesBucketObject resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSpacesBucketObject(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SpacesBucketObjectState, opts ...pulumi.ResourceOption) (*SpacesBucketObject, error) {
	var resource SpacesBucketObject
	err := ctx.ReadResource("digitalocean:index/spacesBucketObject:SpacesBucketObject", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SpacesBucketObject resources.
type spacesBucketObjectState struct {
	// The canned ACL to apply. DigitalOcean supports "private" and "public-read". (Defaults to "private".)
	Acl *string `pulumi:"acl"`
	// The name of the bucket to put the file in.
	Bucket *string `pulumi:"bucket"`
	// Specifies caching behavior along the request/reply chain Read [w3c cacheControl](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9) for further details.
	CacheControl *string `pulumi:"cacheControl"`
	// Literal string value to use as the object content, which will be uploaded as UTF-8-encoded text.
	Content *string `pulumi:"content"`
	// Base64-encoded data that will be decoded and uploaded as raw bytes for the object content. This allows safely uploading non-UTF8 binary data, but is recommended only for small content such as the result of the `gzipbase64` function with small text strings. For larger objects, use `source` to stream the content from a disk file.
	ContentBase64 *string `pulumi:"contentBase64"`
	// Specifies presentational information for the object. Read [w3c contentDisposition](http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1) for further information.
	ContentDisposition *string `pulumi:"contentDisposition"`
	// Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [w3c content encoding](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11) for further information.
	ContentEncoding *string `pulumi:"contentEncoding"`
	// The language the content is in e.g. en-US or en-GB.
	ContentLanguage *string `pulumi:"contentLanguage"`
	// A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
	ContentType *string `pulumi:"contentType"`
	// Used to trigger updates.
	Etag *string `pulumi:"etag"`
	// Allow the object to be deleted by removing any legal hold on any object version.
	// Default is `false`. This value should be set to `true` only if the bucket has S3 object lock enabled.
	//
	// If no content is provided through `source`, `content` or `contentBase64`, then the object will be empty.
	//
	// > **Note:** The provider ignores all leading `/`s in the object's `key` and treats multiple `/`s in the rest of the object's `key` as a single `/`, so values of `/index.html` and `index.html` correspond to the same S3 object as do `first//second///third//` and `first/second/third/`.
	ForceDestroy *bool `pulumi:"forceDestroy"`
	// The name of the object once it is in the bucket.
	Key *string `pulumi:"key"`
	// A mapping of keys/values to provision metadata (will be automatically prefixed by `x-amz-meta-`, note that only lowercase label are currently supported by the AWS Go API).
	Metadata map[string]string `pulumi:"metadata"`
	// The region where the bucket resides (Defaults to `nyc3`)
	Region *string `pulumi:"region"`
	// The path to a file that will be read and uploaded as raw bytes for the object content.
	Source *string `pulumi:"source"`
	// A unique version ID value for the object, if bucket versioning is enabled.
	VersionId *string `pulumi:"versionId"`
	// Specifies a target URL for [website redirect](http://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html).
	WebsiteRedirect *string `pulumi:"websiteRedirect"`
}

type SpacesBucketObjectState struct {
	// The canned ACL to apply. DigitalOcean supports "private" and "public-read". (Defaults to "private".)
	Acl pulumi.StringPtrInput
	// The name of the bucket to put the file in.
	Bucket pulumi.StringPtrInput
	// Specifies caching behavior along the request/reply chain Read [w3c cacheControl](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9) for further details.
	CacheControl pulumi.StringPtrInput
	// Literal string value to use as the object content, which will be uploaded as UTF-8-encoded text.
	Content pulumi.StringPtrInput
	// Base64-encoded data that will be decoded and uploaded as raw bytes for the object content. This allows safely uploading non-UTF8 binary data, but is recommended only for small content such as the result of the `gzipbase64` function with small text strings. For larger objects, use `source` to stream the content from a disk file.
	ContentBase64 pulumi.StringPtrInput
	// Specifies presentational information for the object. Read [w3c contentDisposition](http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1) for further information.
	ContentDisposition pulumi.StringPtrInput
	// Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [w3c content encoding](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11) for further information.
	ContentEncoding pulumi.StringPtrInput
	// The language the content is in e.g. en-US or en-GB.
	ContentLanguage pulumi.StringPtrInput
	// A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
	ContentType pulumi.StringPtrInput
	// Used to trigger updates.
	Etag pulumi.StringPtrInput
	// Allow the object to be deleted by removing any legal hold on any object version.
	// Default is `false`. This value should be set to `true` only if the bucket has S3 object lock enabled.
	//
	// If no content is provided through `source`, `content` or `contentBase64`, then the object will be empty.
	//
	// > **Note:** The provider ignores all leading `/`s in the object's `key` and treats multiple `/`s in the rest of the object's `key` as a single `/`, so values of `/index.html` and `index.html` correspond to the same S3 object as do `first//second///third//` and `first/second/third/`.
	ForceDestroy pulumi.BoolPtrInput
	// The name of the object once it is in the bucket.
	Key pulumi.StringPtrInput
	// A mapping of keys/values to provision metadata (will be automatically prefixed by `x-amz-meta-`, note that only lowercase label are currently supported by the AWS Go API).
	Metadata pulumi.StringMapInput
	// The region where the bucket resides (Defaults to `nyc3`)
	Region pulumi.StringPtrInput
	// The path to a file that will be read and uploaded as raw bytes for the object content.
	Source pulumi.StringPtrInput
	// A unique version ID value for the object, if bucket versioning is enabled.
	VersionId pulumi.StringPtrInput
	// Specifies a target URL for [website redirect](http://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html).
	WebsiteRedirect pulumi.StringPtrInput
}

func (SpacesBucketObjectState) ElementType() reflect.Type {
	return reflect.TypeOf((*spacesBucketObjectState)(nil)).Elem()
}

type spacesBucketObjectArgs struct {
	// The canned ACL to apply. DigitalOcean supports "private" and "public-read". (Defaults to "private".)
	Acl *string `pulumi:"acl"`
	// The name of the bucket to put the file in.
	Bucket string `pulumi:"bucket"`
	// Specifies caching behavior along the request/reply chain Read [w3c cacheControl](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9) for further details.
	CacheControl *string `pulumi:"cacheControl"`
	// Literal string value to use as the object content, which will be uploaded as UTF-8-encoded text.
	Content *string `pulumi:"content"`
	// Base64-encoded data that will be decoded and uploaded as raw bytes for the object content. This allows safely uploading non-UTF8 binary data, but is recommended only for small content such as the result of the `gzipbase64` function with small text strings. For larger objects, use `source` to stream the content from a disk file.
	ContentBase64 *string `pulumi:"contentBase64"`
	// Specifies presentational information for the object. Read [w3c contentDisposition](http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1) for further information.
	ContentDisposition *string `pulumi:"contentDisposition"`
	// Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [w3c content encoding](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11) for further information.
	ContentEncoding *string `pulumi:"contentEncoding"`
	// The language the content is in e.g. en-US or en-GB.
	ContentLanguage *string `pulumi:"contentLanguage"`
	// A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
	ContentType *string `pulumi:"contentType"`
	// Used to trigger updates.
	Etag *string `pulumi:"etag"`
	// Allow the object to be deleted by removing any legal hold on any object version.
	// Default is `false`. This value should be set to `true` only if the bucket has S3 object lock enabled.
	//
	// If no content is provided through `source`, `content` or `contentBase64`, then the object will be empty.
	//
	// > **Note:** The provider ignores all leading `/`s in the object's `key` and treats multiple `/`s in the rest of the object's `key` as a single `/`, so values of `/index.html` and `index.html` correspond to the same S3 object as do `first//second///third//` and `first/second/third/`.
	ForceDestroy *bool `pulumi:"forceDestroy"`
	// The name of the object once it is in the bucket.
	Key string `pulumi:"key"`
	// A mapping of keys/values to provision metadata (will be automatically prefixed by `x-amz-meta-`, note that only lowercase label are currently supported by the AWS Go API).
	Metadata map[string]string `pulumi:"metadata"`
	// The region where the bucket resides (Defaults to `nyc3`)
	Region string `pulumi:"region"`
	// The path to a file that will be read and uploaded as raw bytes for the object content.
	Source *string `pulumi:"source"`
	// Specifies a target URL for [website redirect](http://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html).
	WebsiteRedirect *string `pulumi:"websiteRedirect"`
}

// The set of arguments for constructing a SpacesBucketObject resource.
type SpacesBucketObjectArgs struct {
	// The canned ACL to apply. DigitalOcean supports "private" and "public-read". (Defaults to "private".)
	Acl pulumi.StringPtrInput
	// The name of the bucket to put the file in.
	Bucket pulumi.StringInput
	// Specifies caching behavior along the request/reply chain Read [w3c cacheControl](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9) for further details.
	CacheControl pulumi.StringPtrInput
	// Literal string value to use as the object content, which will be uploaded as UTF-8-encoded text.
	Content pulumi.StringPtrInput
	// Base64-encoded data that will be decoded and uploaded as raw bytes for the object content. This allows safely uploading non-UTF8 binary data, but is recommended only for small content such as the result of the `gzipbase64` function with small text strings. For larger objects, use `source` to stream the content from a disk file.
	ContentBase64 pulumi.StringPtrInput
	// Specifies presentational information for the object. Read [w3c contentDisposition](http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1) for further information.
	ContentDisposition pulumi.StringPtrInput
	// Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [w3c content encoding](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11) for further information.
	ContentEncoding pulumi.StringPtrInput
	// The language the content is in e.g. en-US or en-GB.
	ContentLanguage pulumi.StringPtrInput
	// A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
	ContentType pulumi.StringPtrInput
	// Used to trigger updates.
	Etag pulumi.StringPtrInput
	// Allow the object to be deleted by removing any legal hold on any object version.
	// Default is `false`. This value should be set to `true` only if the bucket has S3 object lock enabled.
	//
	// If no content is provided through `source`, `content` or `contentBase64`, then the object will be empty.
	//
	// > **Note:** The provider ignores all leading `/`s in the object's `key` and treats multiple `/`s in the rest of the object's `key` as a single `/`, so values of `/index.html` and `index.html` correspond to the same S3 object as do `first//second///third//` and `first/second/third/`.
	ForceDestroy pulumi.BoolPtrInput
	// The name of the object once it is in the bucket.
	Key pulumi.StringInput
	// A mapping of keys/values to provision metadata (will be automatically prefixed by `x-amz-meta-`, note that only lowercase label are currently supported by the AWS Go API).
	Metadata pulumi.StringMapInput
	// The region where the bucket resides (Defaults to `nyc3`)
	Region pulumi.StringInput
	// The path to a file that will be read and uploaded as raw bytes for the object content.
	Source pulumi.StringPtrInput
	// Specifies a target URL for [website redirect](http://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html).
	WebsiteRedirect pulumi.StringPtrInput
}

func (SpacesBucketObjectArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*spacesBucketObjectArgs)(nil)).Elem()
}

type SpacesBucketObjectInput interface {
	pulumi.Input

	ToSpacesBucketObjectOutput() SpacesBucketObjectOutput
	ToSpacesBucketObjectOutputWithContext(ctx context.Context) SpacesBucketObjectOutput
}

func (*SpacesBucketObject) ElementType() reflect.Type {
	return reflect.TypeOf((**SpacesBucketObject)(nil)).Elem()
}

func (i *SpacesBucketObject) ToSpacesBucketObjectOutput() SpacesBucketObjectOutput {
	return i.ToSpacesBucketObjectOutputWithContext(context.Background())
}

func (i *SpacesBucketObject) ToSpacesBucketObjectOutputWithContext(ctx context.Context) SpacesBucketObjectOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SpacesBucketObjectOutput)
}

// SpacesBucketObjectArrayInput is an input type that accepts SpacesBucketObjectArray and SpacesBucketObjectArrayOutput values.
// You can construct a concrete instance of `SpacesBucketObjectArrayInput` via:
//
//	SpacesBucketObjectArray{ SpacesBucketObjectArgs{...} }
type SpacesBucketObjectArrayInput interface {
	pulumi.Input

	ToSpacesBucketObjectArrayOutput() SpacesBucketObjectArrayOutput
	ToSpacesBucketObjectArrayOutputWithContext(context.Context) SpacesBucketObjectArrayOutput
}

type SpacesBucketObjectArray []SpacesBucketObjectInput

func (SpacesBucketObjectArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SpacesBucketObject)(nil)).Elem()
}

func (i SpacesBucketObjectArray) ToSpacesBucketObjectArrayOutput() SpacesBucketObjectArrayOutput {
	return i.ToSpacesBucketObjectArrayOutputWithContext(context.Background())
}

func (i SpacesBucketObjectArray) ToSpacesBucketObjectArrayOutputWithContext(ctx context.Context) SpacesBucketObjectArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SpacesBucketObjectArrayOutput)
}

// SpacesBucketObjectMapInput is an input type that accepts SpacesBucketObjectMap and SpacesBucketObjectMapOutput values.
// You can construct a concrete instance of `SpacesBucketObjectMapInput` via:
//
//	SpacesBucketObjectMap{ "key": SpacesBucketObjectArgs{...} }
type SpacesBucketObjectMapInput interface {
	pulumi.Input

	ToSpacesBucketObjectMapOutput() SpacesBucketObjectMapOutput
	ToSpacesBucketObjectMapOutputWithContext(context.Context) SpacesBucketObjectMapOutput
}

type SpacesBucketObjectMap map[string]SpacesBucketObjectInput

func (SpacesBucketObjectMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SpacesBucketObject)(nil)).Elem()
}

func (i SpacesBucketObjectMap) ToSpacesBucketObjectMapOutput() SpacesBucketObjectMapOutput {
	return i.ToSpacesBucketObjectMapOutputWithContext(context.Background())
}

func (i SpacesBucketObjectMap) ToSpacesBucketObjectMapOutputWithContext(ctx context.Context) SpacesBucketObjectMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SpacesBucketObjectMapOutput)
}

type SpacesBucketObjectOutput struct{ *pulumi.OutputState }

func (SpacesBucketObjectOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SpacesBucketObject)(nil)).Elem()
}

func (o SpacesBucketObjectOutput) ToSpacesBucketObjectOutput() SpacesBucketObjectOutput {
	return o
}

func (o SpacesBucketObjectOutput) ToSpacesBucketObjectOutputWithContext(ctx context.Context) SpacesBucketObjectOutput {
	return o
}

// The canned ACL to apply. DigitalOcean supports "private" and "public-read". (Defaults to "private".)
func (o SpacesBucketObjectOutput) Acl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SpacesBucketObject) pulumi.StringPtrOutput { return v.Acl }).(pulumi.StringPtrOutput)
}

// The name of the bucket to put the file in.
func (o SpacesBucketObjectOutput) Bucket() pulumi.StringOutput {
	return o.ApplyT(func(v *SpacesBucketObject) pulumi.StringOutput { return v.Bucket }).(pulumi.StringOutput)
}

// Specifies caching behavior along the request/reply chain Read [w3c cacheControl](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9) for further details.
func (o SpacesBucketObjectOutput) CacheControl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SpacesBucketObject) pulumi.StringPtrOutput { return v.CacheControl }).(pulumi.StringPtrOutput)
}

// Literal string value to use as the object content, which will be uploaded as UTF-8-encoded text.
func (o SpacesBucketObjectOutput) Content() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SpacesBucketObject) pulumi.StringPtrOutput { return v.Content }).(pulumi.StringPtrOutput)
}

// Base64-encoded data that will be decoded and uploaded as raw bytes for the object content. This allows safely uploading non-UTF8 binary data, but is recommended only for small content such as the result of the `gzipbase64` function with small text strings. For larger objects, use `source` to stream the content from a disk file.
func (o SpacesBucketObjectOutput) ContentBase64() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SpacesBucketObject) pulumi.StringPtrOutput { return v.ContentBase64 }).(pulumi.StringPtrOutput)
}

// Specifies presentational information for the object. Read [w3c contentDisposition](http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1) for further information.
func (o SpacesBucketObjectOutput) ContentDisposition() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SpacesBucketObject) pulumi.StringPtrOutput { return v.ContentDisposition }).(pulumi.StringPtrOutput)
}

// Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [w3c content encoding](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11) for further information.
func (o SpacesBucketObjectOutput) ContentEncoding() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SpacesBucketObject) pulumi.StringPtrOutput { return v.ContentEncoding }).(pulumi.StringPtrOutput)
}

// The language the content is in e.g. en-US or en-GB.
func (o SpacesBucketObjectOutput) ContentLanguage() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SpacesBucketObject) pulumi.StringPtrOutput { return v.ContentLanguage }).(pulumi.StringPtrOutput)
}

// A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
func (o SpacesBucketObjectOutput) ContentType() pulumi.StringOutput {
	return o.ApplyT(func(v *SpacesBucketObject) pulumi.StringOutput { return v.ContentType }).(pulumi.StringOutput)
}

// Used to trigger updates.
func (o SpacesBucketObjectOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *SpacesBucketObject) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// Allow the object to be deleted by removing any legal hold on any object version.
// Default is `false`. This value should be set to `true` only if the bucket has S3 object lock enabled.
//
// If no content is provided through `source`, `content` or `contentBase64`, then the object will be empty.
//
// > **Note:** The provider ignores all leading `/`s in the object's `key` and treats multiple `/`s in the rest of the object's `key` as a single `/`, so values of `/index.html` and `index.html` correspond to the same S3 object as do `first//second///third//` and `first/second/third/`.
func (o SpacesBucketObjectOutput) ForceDestroy() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *SpacesBucketObject) pulumi.BoolPtrOutput { return v.ForceDestroy }).(pulumi.BoolPtrOutput)
}

// The name of the object once it is in the bucket.
func (o SpacesBucketObjectOutput) Key() pulumi.StringOutput {
	return o.ApplyT(func(v *SpacesBucketObject) pulumi.StringOutput { return v.Key }).(pulumi.StringOutput)
}

// A mapping of keys/values to provision metadata (will be automatically prefixed by `x-amz-meta-`, note that only lowercase label are currently supported by the AWS Go API).
func (o SpacesBucketObjectOutput) Metadata() pulumi.StringMapOutput {
	return o.ApplyT(func(v *SpacesBucketObject) pulumi.StringMapOutput { return v.Metadata }).(pulumi.StringMapOutput)
}

// The region where the bucket resides (Defaults to `nyc3`)
func (o SpacesBucketObjectOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v *SpacesBucketObject) pulumi.StringOutput { return v.Region }).(pulumi.StringOutput)
}

// The path to a file that will be read and uploaded as raw bytes for the object content.
func (o SpacesBucketObjectOutput) Source() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SpacesBucketObject) pulumi.StringPtrOutput { return v.Source }).(pulumi.StringPtrOutput)
}

// A unique version ID value for the object, if bucket versioning is enabled.
func (o SpacesBucketObjectOutput) VersionId() pulumi.StringOutput {
	return o.ApplyT(func(v *SpacesBucketObject) pulumi.StringOutput { return v.VersionId }).(pulumi.StringOutput)
}

// Specifies a target URL for [website redirect](http://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html).
func (o SpacesBucketObjectOutput) WebsiteRedirect() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SpacesBucketObject) pulumi.StringPtrOutput { return v.WebsiteRedirect }).(pulumi.StringPtrOutput)
}

type SpacesBucketObjectArrayOutput struct{ *pulumi.OutputState }

func (SpacesBucketObjectArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SpacesBucketObject)(nil)).Elem()
}

func (o SpacesBucketObjectArrayOutput) ToSpacesBucketObjectArrayOutput() SpacesBucketObjectArrayOutput {
	return o
}

func (o SpacesBucketObjectArrayOutput) ToSpacesBucketObjectArrayOutputWithContext(ctx context.Context) SpacesBucketObjectArrayOutput {
	return o
}

func (o SpacesBucketObjectArrayOutput) Index(i pulumi.IntInput) SpacesBucketObjectOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SpacesBucketObject {
		return vs[0].([]*SpacesBucketObject)[vs[1].(int)]
	}).(SpacesBucketObjectOutput)
}

type SpacesBucketObjectMapOutput struct{ *pulumi.OutputState }

func (SpacesBucketObjectMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SpacesBucketObject)(nil)).Elem()
}

func (o SpacesBucketObjectMapOutput) ToSpacesBucketObjectMapOutput() SpacesBucketObjectMapOutput {
	return o
}

func (o SpacesBucketObjectMapOutput) ToSpacesBucketObjectMapOutputWithContext(ctx context.Context) SpacesBucketObjectMapOutput {
	return o
}

func (o SpacesBucketObjectMapOutput) MapIndex(k pulumi.StringInput) SpacesBucketObjectOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SpacesBucketObject {
		return vs[0].(map[string]*SpacesBucketObject)[vs[1].(string)]
	}).(SpacesBucketObjectOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SpacesBucketObjectInput)(nil)).Elem(), &SpacesBucketObject{})
	pulumi.RegisterInputType(reflect.TypeOf((*SpacesBucketObjectArrayInput)(nil)).Elem(), SpacesBucketObjectArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SpacesBucketObjectMapInput)(nil)).Elem(), SpacesBucketObjectMap{})
	pulumi.RegisterOutputType(SpacesBucketObjectOutput{})
	pulumi.RegisterOutputType(SpacesBucketObjectArrayOutput{})
	pulumi.RegisterOutputType(SpacesBucketObjectMapOutput{})
}
