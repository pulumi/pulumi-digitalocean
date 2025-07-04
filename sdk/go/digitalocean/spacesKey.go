// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-digitalocean/sdk/v4/go/digitalocean/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a key resource for Spaces, DigitalOcean's object storage product.
//
// The [Spaces API](https://docs.digitalocean.com/reference/api/spaces-api/) was
// designed to be interoperable with Amazon's AWS S3 API. This allows users to
// interact with the service while using the tools they already know. Spaces
// mirrors S3's authentication framework and requests to Spaces require a key pair
// similar to Amazon's Access ID and Secret Key.
//
// As a Spaces owner, you limit others’ access to your buckets using Spaces access
// keys. Access keys can provide several levels of permissions to create, destroy,
// read, and write to specific associated buckets. However, access keys only limit
// access to certain commands using the S3 API or CLI, not the control panel or
// other DigitalOcean resources.
//
// ## Example Usage
//
// ### Create a New Key
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
//			_, err := digitalocean.NewSpacesKey(ctx, "foobar", &digitalocean.SpacesKeyArgs{
//				Name: pulumi.String("foobar"),
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
// ### Create a New Key with Grants
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
//			_, err := digitalocean.NewSpacesKey(ctx, "foobar", &digitalocean.SpacesKeyArgs{
//				Name: pulumi.String("foobar"),
//				Grants: digitalocean.SpacesKeyGrantArray{
//					&digitalocean.SpacesKeyGrantArgs{
//						Bucket:     pulumi.String("my-bucket"),
//						Permission: pulumi.String("read"),
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
// ### Create a New Key with full access
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
//			_, err := digitalocean.NewSpacesKey(ctx, "foobar", &digitalocean.SpacesKeyArgs{
//				Name: pulumi.String("foobar"),
//				Grants: digitalocean.SpacesKeyGrantArray{
//					&digitalocean.SpacesKeyGrantArgs{
//						Bucket:     pulumi.String(""),
//						Permission: pulumi.String("fullaccess"),
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
type SpacesKey struct {
	pulumi.CustomResourceState

	// The access key ID of the key
	AccessKey pulumi.StringOutput `pulumi:"accessKey"`
	// The creation time of the key
	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// A grant for the key (documented below).
	Grants SpacesKeyGrantArrayOutput `pulumi:"grants"`
	// The name of the key
	Name pulumi.StringOutput `pulumi:"name"`
	// The access key secret of the key
	SecretKey pulumi.StringOutput `pulumi:"secretKey"`
}

// NewSpacesKey registers a new resource with the given unique name, arguments, and options.
func NewSpacesKey(ctx *pulumi.Context,
	name string, args *SpacesKeyArgs, opts ...pulumi.ResourceOption) (*SpacesKey, error) {
	if args == nil {
		args = &SpacesKeyArgs{}
	}

	secrets := pulumi.AdditionalSecretOutputs([]string{
		"secretKey",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SpacesKey
	err := ctx.RegisterResource("digitalocean:index/spacesKey:SpacesKey", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSpacesKey gets an existing SpacesKey resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSpacesKey(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SpacesKeyState, opts ...pulumi.ResourceOption) (*SpacesKey, error) {
	var resource SpacesKey
	err := ctx.ReadResource("digitalocean:index/spacesKey:SpacesKey", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SpacesKey resources.
type spacesKeyState struct {
	// The access key ID of the key
	AccessKey *string `pulumi:"accessKey"`
	// The creation time of the key
	CreatedAt *string `pulumi:"createdAt"`
	// A grant for the key (documented below).
	Grants []SpacesKeyGrant `pulumi:"grants"`
	// The name of the key
	Name *string `pulumi:"name"`
	// The access key secret of the key
	SecretKey *string `pulumi:"secretKey"`
}

type SpacesKeyState struct {
	// The access key ID of the key
	AccessKey pulumi.StringPtrInput
	// The creation time of the key
	CreatedAt pulumi.StringPtrInput
	// A grant for the key (documented below).
	Grants SpacesKeyGrantArrayInput
	// The name of the key
	Name pulumi.StringPtrInput
	// The access key secret of the key
	SecretKey pulumi.StringPtrInput
}

func (SpacesKeyState) ElementType() reflect.Type {
	return reflect.TypeOf((*spacesKeyState)(nil)).Elem()
}

type spacesKeyArgs struct {
	// A grant for the key (documented below).
	Grants []SpacesKeyGrant `pulumi:"grants"`
	// The name of the key
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a SpacesKey resource.
type SpacesKeyArgs struct {
	// A grant for the key (documented below).
	Grants SpacesKeyGrantArrayInput
	// The name of the key
	Name pulumi.StringPtrInput
}

func (SpacesKeyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*spacesKeyArgs)(nil)).Elem()
}

type SpacesKeyInput interface {
	pulumi.Input

	ToSpacesKeyOutput() SpacesKeyOutput
	ToSpacesKeyOutputWithContext(ctx context.Context) SpacesKeyOutput
}

func (*SpacesKey) ElementType() reflect.Type {
	return reflect.TypeOf((**SpacesKey)(nil)).Elem()
}

func (i *SpacesKey) ToSpacesKeyOutput() SpacesKeyOutput {
	return i.ToSpacesKeyOutputWithContext(context.Background())
}

func (i *SpacesKey) ToSpacesKeyOutputWithContext(ctx context.Context) SpacesKeyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SpacesKeyOutput)
}

// SpacesKeyArrayInput is an input type that accepts SpacesKeyArray and SpacesKeyArrayOutput values.
// You can construct a concrete instance of `SpacesKeyArrayInput` via:
//
//	SpacesKeyArray{ SpacesKeyArgs{...} }
type SpacesKeyArrayInput interface {
	pulumi.Input

	ToSpacesKeyArrayOutput() SpacesKeyArrayOutput
	ToSpacesKeyArrayOutputWithContext(context.Context) SpacesKeyArrayOutput
}

type SpacesKeyArray []SpacesKeyInput

func (SpacesKeyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SpacesKey)(nil)).Elem()
}

func (i SpacesKeyArray) ToSpacesKeyArrayOutput() SpacesKeyArrayOutput {
	return i.ToSpacesKeyArrayOutputWithContext(context.Background())
}

func (i SpacesKeyArray) ToSpacesKeyArrayOutputWithContext(ctx context.Context) SpacesKeyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SpacesKeyArrayOutput)
}

// SpacesKeyMapInput is an input type that accepts SpacesKeyMap and SpacesKeyMapOutput values.
// You can construct a concrete instance of `SpacesKeyMapInput` via:
//
//	SpacesKeyMap{ "key": SpacesKeyArgs{...} }
type SpacesKeyMapInput interface {
	pulumi.Input

	ToSpacesKeyMapOutput() SpacesKeyMapOutput
	ToSpacesKeyMapOutputWithContext(context.Context) SpacesKeyMapOutput
}

type SpacesKeyMap map[string]SpacesKeyInput

func (SpacesKeyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SpacesKey)(nil)).Elem()
}

func (i SpacesKeyMap) ToSpacesKeyMapOutput() SpacesKeyMapOutput {
	return i.ToSpacesKeyMapOutputWithContext(context.Background())
}

func (i SpacesKeyMap) ToSpacesKeyMapOutputWithContext(ctx context.Context) SpacesKeyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SpacesKeyMapOutput)
}

type SpacesKeyOutput struct{ *pulumi.OutputState }

func (SpacesKeyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SpacesKey)(nil)).Elem()
}

func (o SpacesKeyOutput) ToSpacesKeyOutput() SpacesKeyOutput {
	return o
}

func (o SpacesKeyOutput) ToSpacesKeyOutputWithContext(ctx context.Context) SpacesKeyOutput {
	return o
}

// The access key ID of the key
func (o SpacesKeyOutput) AccessKey() pulumi.StringOutput {
	return o.ApplyT(func(v *SpacesKey) pulumi.StringOutput { return v.AccessKey }).(pulumi.StringOutput)
}

// The creation time of the key
func (o SpacesKeyOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *SpacesKey) pulumi.StringOutput { return v.CreatedAt }).(pulumi.StringOutput)
}

// A grant for the key (documented below).
func (o SpacesKeyOutput) Grants() SpacesKeyGrantArrayOutput {
	return o.ApplyT(func(v *SpacesKey) SpacesKeyGrantArrayOutput { return v.Grants }).(SpacesKeyGrantArrayOutput)
}

// The name of the key
func (o SpacesKeyOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SpacesKey) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The access key secret of the key
func (o SpacesKeyOutput) SecretKey() pulumi.StringOutput {
	return o.ApplyT(func(v *SpacesKey) pulumi.StringOutput { return v.SecretKey }).(pulumi.StringOutput)
}

type SpacesKeyArrayOutput struct{ *pulumi.OutputState }

func (SpacesKeyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SpacesKey)(nil)).Elem()
}

func (o SpacesKeyArrayOutput) ToSpacesKeyArrayOutput() SpacesKeyArrayOutput {
	return o
}

func (o SpacesKeyArrayOutput) ToSpacesKeyArrayOutputWithContext(ctx context.Context) SpacesKeyArrayOutput {
	return o
}

func (o SpacesKeyArrayOutput) Index(i pulumi.IntInput) SpacesKeyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SpacesKey {
		return vs[0].([]*SpacesKey)[vs[1].(int)]
	}).(SpacesKeyOutput)
}

type SpacesKeyMapOutput struct{ *pulumi.OutputState }

func (SpacesKeyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SpacesKey)(nil)).Elem()
}

func (o SpacesKeyMapOutput) ToSpacesKeyMapOutput() SpacesKeyMapOutput {
	return o
}

func (o SpacesKeyMapOutput) ToSpacesKeyMapOutputWithContext(ctx context.Context) SpacesKeyMapOutput {
	return o
}

func (o SpacesKeyMapOutput) MapIndex(k pulumi.StringInput) SpacesKeyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SpacesKey {
		return vs[0].(map[string]*SpacesKey)[vs[1].(string)]
	}).(SpacesKeyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SpacesKeyInput)(nil)).Elem(), &SpacesKey{})
	pulumi.RegisterInputType(reflect.TypeOf((*SpacesKeyArrayInput)(nil)).Elem(), SpacesKeyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SpacesKeyMapInput)(nil)).Elem(), SpacesKeyMap{})
	pulumi.RegisterOutputType(SpacesKeyOutput{})
	pulumi.RegisterOutputType(SpacesKeyArrayOutput{})
	pulumi.RegisterOutputType(SpacesKeyMapOutput{})
}
