// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-digitalocean/sdk/v4/go/digitalocean/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a bucket resource for Spaces, DigitalOcean's object storage product.
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
// ### Create a New Bucket
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
//			_, err := digitalocean.NewSpacesBucket(ctx, "foobar", &digitalocean.SpacesBucketArgs{
//				Name:   pulumi.String("foobar"),
//				Region: pulumi.String(digitalocean.RegionNYC3),
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
// ### Create a New Bucket With CORS Rules
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
//			_, err := digitalocean.NewSpacesBucket(ctx, "foobar", &digitalocean.SpacesBucketArgs{
//				Name:   pulumi.String("foobar"),
//				Region: pulumi.String(digitalocean.RegionNYC3),
//				CorsRules: digitalocean.SpacesBucketCorsRuleArray{
//					&digitalocean.SpacesBucketCorsRuleArgs{
//						AllowedHeaders: pulumi.StringArray{
//							pulumi.String("*"),
//						},
//						AllowedMethods: pulumi.StringArray{
//							pulumi.String("GET"),
//						},
//						AllowedOrigins: pulumi.StringArray{
//							pulumi.String("*"),
//						},
//						MaxAgeSeconds: pulumi.Int(3000),
//					},
//					&digitalocean.SpacesBucketCorsRuleArgs{
//						AllowedHeaders: pulumi.StringArray{
//							pulumi.String("*"),
//						},
//						AllowedMethods: pulumi.StringArray{
//							pulumi.String("PUT"),
//							pulumi.String("POST"),
//							pulumi.String("DELETE"),
//						},
//						AllowedOrigins: pulumi.StringArray{
//							pulumi.String("https://www.example.com"),
//						},
//						MaxAgeSeconds: pulumi.Int(3000),
//					},
//				},
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
// Buckets can be imported using the `region` and `name` attributes (delimited by a comma):
//
// ```sh
// $ pulumi import digitalocean:index/spacesBucket:SpacesBucket foobar `region`,`name`
// ```
type SpacesBucket struct {
	pulumi.CustomResourceState

	// Canned ACL applied on bucket creation (`private` or `public-read`)
	Acl pulumi.StringPtrOutput `pulumi:"acl"`
	// The FQDN of the bucket (e.g. bucket-name.nyc3.digitaloceanspaces.com)
	BucketDomainName pulumi.StringOutput `pulumi:"bucketDomainName"`
	// The uniform resource name for the bucket
	BucketUrn pulumi.StringOutput `pulumi:"bucketUrn"`
	// A rule of Cross-Origin Resource Sharing (documented below).
	//
	// Deprecated: Terraform will only perform drift detection if a configuration value is provided. Use the resource `SpacesBucketCorsConfiguration` instead.
	CorsRules SpacesBucketCorsRuleArrayOutput `pulumi:"corsRules"`
	// The FQDN of the bucket without the bucket name (e.g. nyc3.digitaloceanspaces.com)
	Endpoint pulumi.StringOutput `pulumi:"endpoint"`
	// Unless `true`, the bucket will only be destroyed if empty (Defaults to `false`)
	ForceDestroy pulumi.BoolPtrOutput `pulumi:"forceDestroy"`
	// A configuration of object lifecycle management (documented below).
	LifecycleRules SpacesBucketLifecycleRuleArrayOutput `pulumi:"lifecycleRules"`
	// The name of the bucket
	Name pulumi.StringOutput `pulumi:"name"`
	// The region where the bucket resides (Defaults to `nyc3`)
	Region pulumi.StringPtrOutput `pulumi:"region"`
	// A state of versioning (documented below)
	Versioning SpacesBucketVersioningPtrOutput `pulumi:"versioning"`
}

// NewSpacesBucket registers a new resource with the given unique name, arguments, and options.
func NewSpacesBucket(ctx *pulumi.Context,
	name string, args *SpacesBucketArgs, opts ...pulumi.ResourceOption) (*SpacesBucket, error) {
	if args == nil {
		args = &SpacesBucketArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SpacesBucket
	err := ctx.RegisterResource("digitalocean:index/spacesBucket:SpacesBucket", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSpacesBucket gets an existing SpacesBucket resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSpacesBucket(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SpacesBucketState, opts ...pulumi.ResourceOption) (*SpacesBucket, error) {
	var resource SpacesBucket
	err := ctx.ReadResource("digitalocean:index/spacesBucket:SpacesBucket", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SpacesBucket resources.
type spacesBucketState struct {
	// Canned ACL applied on bucket creation (`private` or `public-read`)
	Acl *string `pulumi:"acl"`
	// The FQDN of the bucket (e.g. bucket-name.nyc3.digitaloceanspaces.com)
	BucketDomainName *string `pulumi:"bucketDomainName"`
	// The uniform resource name for the bucket
	BucketUrn *string `pulumi:"bucketUrn"`
	// A rule of Cross-Origin Resource Sharing (documented below).
	//
	// Deprecated: Terraform will only perform drift detection if a configuration value is provided. Use the resource `SpacesBucketCorsConfiguration` instead.
	CorsRules []SpacesBucketCorsRule `pulumi:"corsRules"`
	// The FQDN of the bucket without the bucket name (e.g. nyc3.digitaloceanspaces.com)
	Endpoint *string `pulumi:"endpoint"`
	// Unless `true`, the bucket will only be destroyed if empty (Defaults to `false`)
	ForceDestroy *bool `pulumi:"forceDestroy"`
	// A configuration of object lifecycle management (documented below).
	LifecycleRules []SpacesBucketLifecycleRule `pulumi:"lifecycleRules"`
	// The name of the bucket
	Name *string `pulumi:"name"`
	// The region where the bucket resides (Defaults to `nyc3`)
	Region *string `pulumi:"region"`
	// A state of versioning (documented below)
	Versioning *SpacesBucketVersioning `pulumi:"versioning"`
}

type SpacesBucketState struct {
	// Canned ACL applied on bucket creation (`private` or `public-read`)
	Acl pulumi.StringPtrInput
	// The FQDN of the bucket (e.g. bucket-name.nyc3.digitaloceanspaces.com)
	BucketDomainName pulumi.StringPtrInput
	// The uniform resource name for the bucket
	BucketUrn pulumi.StringPtrInput
	// A rule of Cross-Origin Resource Sharing (documented below).
	//
	// Deprecated: Terraform will only perform drift detection if a configuration value is provided. Use the resource `SpacesBucketCorsConfiguration` instead.
	CorsRules SpacesBucketCorsRuleArrayInput
	// The FQDN of the bucket without the bucket name (e.g. nyc3.digitaloceanspaces.com)
	Endpoint pulumi.StringPtrInput
	// Unless `true`, the bucket will only be destroyed if empty (Defaults to `false`)
	ForceDestroy pulumi.BoolPtrInput
	// A configuration of object lifecycle management (documented below).
	LifecycleRules SpacesBucketLifecycleRuleArrayInput
	// The name of the bucket
	Name pulumi.StringPtrInput
	// The region where the bucket resides (Defaults to `nyc3`)
	Region pulumi.StringPtrInput
	// A state of versioning (documented below)
	Versioning SpacesBucketVersioningPtrInput
}

func (SpacesBucketState) ElementType() reflect.Type {
	return reflect.TypeOf((*spacesBucketState)(nil)).Elem()
}

type spacesBucketArgs struct {
	// Canned ACL applied on bucket creation (`private` or `public-read`)
	Acl *string `pulumi:"acl"`
	// A rule of Cross-Origin Resource Sharing (documented below).
	//
	// Deprecated: Terraform will only perform drift detection if a configuration value is provided. Use the resource `SpacesBucketCorsConfiguration` instead.
	CorsRules []SpacesBucketCorsRule `pulumi:"corsRules"`
	// Unless `true`, the bucket will only be destroyed if empty (Defaults to `false`)
	ForceDestroy *bool `pulumi:"forceDestroy"`
	// A configuration of object lifecycle management (documented below).
	LifecycleRules []SpacesBucketLifecycleRule `pulumi:"lifecycleRules"`
	// The name of the bucket
	Name *string `pulumi:"name"`
	// The region where the bucket resides (Defaults to `nyc3`)
	Region *string `pulumi:"region"`
	// A state of versioning (documented below)
	Versioning *SpacesBucketVersioning `pulumi:"versioning"`
}

// The set of arguments for constructing a SpacesBucket resource.
type SpacesBucketArgs struct {
	// Canned ACL applied on bucket creation (`private` or `public-read`)
	Acl pulumi.StringPtrInput
	// A rule of Cross-Origin Resource Sharing (documented below).
	//
	// Deprecated: Terraform will only perform drift detection if a configuration value is provided. Use the resource `SpacesBucketCorsConfiguration` instead.
	CorsRules SpacesBucketCorsRuleArrayInput
	// Unless `true`, the bucket will only be destroyed if empty (Defaults to `false`)
	ForceDestroy pulumi.BoolPtrInput
	// A configuration of object lifecycle management (documented below).
	LifecycleRules SpacesBucketLifecycleRuleArrayInput
	// The name of the bucket
	Name pulumi.StringPtrInput
	// The region where the bucket resides (Defaults to `nyc3`)
	Region pulumi.StringPtrInput
	// A state of versioning (documented below)
	Versioning SpacesBucketVersioningPtrInput
}

func (SpacesBucketArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*spacesBucketArgs)(nil)).Elem()
}

type SpacesBucketInput interface {
	pulumi.Input

	ToSpacesBucketOutput() SpacesBucketOutput
	ToSpacesBucketOutputWithContext(ctx context.Context) SpacesBucketOutput
}

func (*SpacesBucket) ElementType() reflect.Type {
	return reflect.TypeOf((**SpacesBucket)(nil)).Elem()
}

func (i *SpacesBucket) ToSpacesBucketOutput() SpacesBucketOutput {
	return i.ToSpacesBucketOutputWithContext(context.Background())
}

func (i *SpacesBucket) ToSpacesBucketOutputWithContext(ctx context.Context) SpacesBucketOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SpacesBucketOutput)
}

// SpacesBucketArrayInput is an input type that accepts SpacesBucketArray and SpacesBucketArrayOutput values.
// You can construct a concrete instance of `SpacesBucketArrayInput` via:
//
//	SpacesBucketArray{ SpacesBucketArgs{...} }
type SpacesBucketArrayInput interface {
	pulumi.Input

	ToSpacesBucketArrayOutput() SpacesBucketArrayOutput
	ToSpacesBucketArrayOutputWithContext(context.Context) SpacesBucketArrayOutput
}

type SpacesBucketArray []SpacesBucketInput

func (SpacesBucketArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SpacesBucket)(nil)).Elem()
}

func (i SpacesBucketArray) ToSpacesBucketArrayOutput() SpacesBucketArrayOutput {
	return i.ToSpacesBucketArrayOutputWithContext(context.Background())
}

func (i SpacesBucketArray) ToSpacesBucketArrayOutputWithContext(ctx context.Context) SpacesBucketArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SpacesBucketArrayOutput)
}

// SpacesBucketMapInput is an input type that accepts SpacesBucketMap and SpacesBucketMapOutput values.
// You can construct a concrete instance of `SpacesBucketMapInput` via:
//
//	SpacesBucketMap{ "key": SpacesBucketArgs{...} }
type SpacesBucketMapInput interface {
	pulumi.Input

	ToSpacesBucketMapOutput() SpacesBucketMapOutput
	ToSpacesBucketMapOutputWithContext(context.Context) SpacesBucketMapOutput
}

type SpacesBucketMap map[string]SpacesBucketInput

func (SpacesBucketMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SpacesBucket)(nil)).Elem()
}

func (i SpacesBucketMap) ToSpacesBucketMapOutput() SpacesBucketMapOutput {
	return i.ToSpacesBucketMapOutputWithContext(context.Background())
}

func (i SpacesBucketMap) ToSpacesBucketMapOutputWithContext(ctx context.Context) SpacesBucketMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SpacesBucketMapOutput)
}

type SpacesBucketOutput struct{ *pulumi.OutputState }

func (SpacesBucketOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SpacesBucket)(nil)).Elem()
}

func (o SpacesBucketOutput) ToSpacesBucketOutput() SpacesBucketOutput {
	return o
}

func (o SpacesBucketOutput) ToSpacesBucketOutputWithContext(ctx context.Context) SpacesBucketOutput {
	return o
}

// Canned ACL applied on bucket creation (`private` or `public-read`)
func (o SpacesBucketOutput) Acl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SpacesBucket) pulumi.StringPtrOutput { return v.Acl }).(pulumi.StringPtrOutput)
}

// The FQDN of the bucket (e.g. bucket-name.nyc3.digitaloceanspaces.com)
func (o SpacesBucketOutput) BucketDomainName() pulumi.StringOutput {
	return o.ApplyT(func(v *SpacesBucket) pulumi.StringOutput { return v.BucketDomainName }).(pulumi.StringOutput)
}

// The uniform resource name for the bucket
func (o SpacesBucketOutput) BucketUrn() pulumi.StringOutput {
	return o.ApplyT(func(v *SpacesBucket) pulumi.StringOutput { return v.BucketUrn }).(pulumi.StringOutput)
}

// A rule of Cross-Origin Resource Sharing (documented below).
//
// Deprecated: Terraform will only perform drift detection if a configuration value is provided. Use the resource `SpacesBucketCorsConfiguration` instead.
func (o SpacesBucketOutput) CorsRules() SpacesBucketCorsRuleArrayOutput {
	return o.ApplyT(func(v *SpacesBucket) SpacesBucketCorsRuleArrayOutput { return v.CorsRules }).(SpacesBucketCorsRuleArrayOutput)
}

// The FQDN of the bucket without the bucket name (e.g. nyc3.digitaloceanspaces.com)
func (o SpacesBucketOutput) Endpoint() pulumi.StringOutput {
	return o.ApplyT(func(v *SpacesBucket) pulumi.StringOutput { return v.Endpoint }).(pulumi.StringOutput)
}

// Unless `true`, the bucket will only be destroyed if empty (Defaults to `false`)
func (o SpacesBucketOutput) ForceDestroy() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *SpacesBucket) pulumi.BoolPtrOutput { return v.ForceDestroy }).(pulumi.BoolPtrOutput)
}

// A configuration of object lifecycle management (documented below).
func (o SpacesBucketOutput) LifecycleRules() SpacesBucketLifecycleRuleArrayOutput {
	return o.ApplyT(func(v *SpacesBucket) SpacesBucketLifecycleRuleArrayOutput { return v.LifecycleRules }).(SpacesBucketLifecycleRuleArrayOutput)
}

// The name of the bucket
func (o SpacesBucketOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SpacesBucket) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The region where the bucket resides (Defaults to `nyc3`)
func (o SpacesBucketOutput) Region() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SpacesBucket) pulumi.StringPtrOutput { return v.Region }).(pulumi.StringPtrOutput)
}

// A state of versioning (documented below)
func (o SpacesBucketOutput) Versioning() SpacesBucketVersioningPtrOutput {
	return o.ApplyT(func(v *SpacesBucket) SpacesBucketVersioningPtrOutput { return v.Versioning }).(SpacesBucketVersioningPtrOutput)
}

type SpacesBucketArrayOutput struct{ *pulumi.OutputState }

func (SpacesBucketArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SpacesBucket)(nil)).Elem()
}

func (o SpacesBucketArrayOutput) ToSpacesBucketArrayOutput() SpacesBucketArrayOutput {
	return o
}

func (o SpacesBucketArrayOutput) ToSpacesBucketArrayOutputWithContext(ctx context.Context) SpacesBucketArrayOutput {
	return o
}

func (o SpacesBucketArrayOutput) Index(i pulumi.IntInput) SpacesBucketOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SpacesBucket {
		return vs[0].([]*SpacesBucket)[vs[1].(int)]
	}).(SpacesBucketOutput)
}

type SpacesBucketMapOutput struct{ *pulumi.OutputState }

func (SpacesBucketMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SpacesBucket)(nil)).Elem()
}

func (o SpacesBucketMapOutput) ToSpacesBucketMapOutput() SpacesBucketMapOutput {
	return o
}

func (o SpacesBucketMapOutput) ToSpacesBucketMapOutputWithContext(ctx context.Context) SpacesBucketMapOutput {
	return o
}

func (o SpacesBucketMapOutput) MapIndex(k pulumi.StringInput) SpacesBucketOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SpacesBucket {
		return vs[0].(map[string]*SpacesBucket)[vs[1].(string)]
	}).(SpacesBucketOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SpacesBucketInput)(nil)).Elem(), &SpacesBucket{})
	pulumi.RegisterInputType(reflect.TypeOf((*SpacesBucketArrayInput)(nil)).Elem(), SpacesBucketArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SpacesBucketMapInput)(nil)).Elem(), SpacesBucketMap{})
	pulumi.RegisterOutputType(SpacesBucketOutput{})
	pulumi.RegisterOutputType(SpacesBucketArrayOutput{})
	pulumi.RegisterOutputType(SpacesBucketMapOutput{})
}
