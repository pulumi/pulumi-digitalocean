// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a resource which can be used to create a [custom image](https://www.digitalocean.com/docs/images/custom-images/)
// from a URL. The URL must point to an image in one of the following file formats:
//
// - Raw (.img) with an MBR or GPT partition table
// - qcow2
// - VHDX
// - VDI
// - VMDK
//
// The image may be compressed using gzip or bzip2. See the DigitalOcean Custom
// Image documentation for [additional requirements](https://www.digitalocean.com/docs/images/custom-images/#image-requirements).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-digitalocean/sdk/v4/go/digitalocean"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		flatcar, err := digitalocean.NewCustomImage(ctx, "flatcar", &digitalocean.CustomImageArgs{
// 			Url: pulumi.String("https://stable.release.flatcar-linux.net/amd64-usr/2605.7.0/flatcar_production_digitalocean_image.bin.bz2"),
// 			Regions: pulumi.StringArray{
// 				pulumi.String("nyc3"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = digitalocean.NewDroplet(ctx, "example", &digitalocean.DropletArgs{
// 			Image:  flatcar.ID(),
// 			Region: pulumi.String("nyc3"),
// 			Size:   pulumi.String("s-1vcpu-1gb"),
// 			SshKeys: pulumi.StringArray{
// 				pulumi.String("12345"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type CustomImage struct {
	pulumi.CustomResourceState

	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// An optional description for the image.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// An optional distribution name for the image. Valid values are documented [here](https://developers.digitalocean.com/documentation/v2/#create-a-custom-image)
	Distribution pulumi.StringPtrOutput `pulumi:"distribution"`
	ImageId      pulumi.IntOutput       `pulumi:"imageId"`
	MinDiskSize  pulumi.IntOutput       `pulumi:"minDiskSize"`
	// A name for the Custom Image.
	Name   pulumi.StringOutput `pulumi:"name"`
	Public pulumi.BoolOutput   `pulumi:"public"`
	// A list of regions. (Currently only one is supported).
	Regions       pulumi.StringArrayOutput `pulumi:"regions"`
	SizeGigabytes pulumi.Float64Output     `pulumi:"sizeGigabytes"`
	Slug          pulumi.StringOutput      `pulumi:"slug"`
	Status        pulumi.StringOutput      `pulumi:"status"`
	// A list of optional tags for the image.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
	Type pulumi.StringOutput      `pulumi:"type"`
	// A URL from which the custom Linux virtual machine image may be retrieved.
	Url pulumi.StringOutput `pulumi:"url"`
}

// NewCustomImage registers a new resource with the given unique name, arguments, and options.
func NewCustomImage(ctx *pulumi.Context,
	name string, args *CustomImageArgs, opts ...pulumi.ResourceOption) (*CustomImage, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Regions == nil {
		return nil, errors.New("invalid value for required argument 'Regions'")
	}
	if args.Url == nil {
		return nil, errors.New("invalid value for required argument 'Url'")
	}
	var resource CustomImage
	err := ctx.RegisterResource("digitalocean:index/customImage:CustomImage", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCustomImage gets an existing CustomImage resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCustomImage(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CustomImageState, opts ...pulumi.ResourceOption) (*CustomImage, error) {
	var resource CustomImage
	err := ctx.ReadResource("digitalocean:index/customImage:CustomImage", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CustomImage resources.
type customImageState struct {
	CreatedAt *string `pulumi:"createdAt"`
	// An optional description for the image.
	Description *string `pulumi:"description"`
	// An optional distribution name for the image. Valid values are documented [here](https://developers.digitalocean.com/documentation/v2/#create-a-custom-image)
	Distribution *string `pulumi:"distribution"`
	ImageId      *int    `pulumi:"imageId"`
	MinDiskSize  *int    `pulumi:"minDiskSize"`
	// A name for the Custom Image.
	Name   *string `pulumi:"name"`
	Public *bool   `pulumi:"public"`
	// A list of regions. (Currently only one is supported).
	Regions       []string `pulumi:"regions"`
	SizeGigabytes *float64 `pulumi:"sizeGigabytes"`
	Slug          *string  `pulumi:"slug"`
	Status        *string  `pulumi:"status"`
	// A list of optional tags for the image.
	Tags []string `pulumi:"tags"`
	Type *string  `pulumi:"type"`
	// A URL from which the custom Linux virtual machine image may be retrieved.
	Url *string `pulumi:"url"`
}

type CustomImageState struct {
	CreatedAt pulumi.StringPtrInput
	// An optional description for the image.
	Description pulumi.StringPtrInput
	// An optional distribution name for the image. Valid values are documented [here](https://developers.digitalocean.com/documentation/v2/#create-a-custom-image)
	Distribution pulumi.StringPtrInput
	ImageId      pulumi.IntPtrInput
	MinDiskSize  pulumi.IntPtrInput
	// A name for the Custom Image.
	Name   pulumi.StringPtrInput
	Public pulumi.BoolPtrInput
	// A list of regions. (Currently only one is supported).
	Regions       pulumi.StringArrayInput
	SizeGigabytes pulumi.Float64PtrInput
	Slug          pulumi.StringPtrInput
	Status        pulumi.StringPtrInput
	// A list of optional tags for the image.
	Tags pulumi.StringArrayInput
	Type pulumi.StringPtrInput
	// A URL from which the custom Linux virtual machine image may be retrieved.
	Url pulumi.StringPtrInput
}

func (CustomImageState) ElementType() reflect.Type {
	return reflect.TypeOf((*customImageState)(nil)).Elem()
}

type customImageArgs struct {
	// An optional description for the image.
	Description *string `pulumi:"description"`
	// An optional distribution name for the image. Valid values are documented [here](https://developers.digitalocean.com/documentation/v2/#create-a-custom-image)
	Distribution *string `pulumi:"distribution"`
	// A name for the Custom Image.
	Name *string `pulumi:"name"`
	// A list of regions. (Currently only one is supported).
	Regions []string `pulumi:"regions"`
	// A list of optional tags for the image.
	Tags []string `pulumi:"tags"`
	// A URL from which the custom Linux virtual machine image may be retrieved.
	Url string `pulumi:"url"`
}

// The set of arguments for constructing a CustomImage resource.
type CustomImageArgs struct {
	// An optional description for the image.
	Description pulumi.StringPtrInput
	// An optional distribution name for the image. Valid values are documented [here](https://developers.digitalocean.com/documentation/v2/#create-a-custom-image)
	Distribution pulumi.StringPtrInput
	// A name for the Custom Image.
	Name pulumi.StringPtrInput
	// A list of regions. (Currently only one is supported).
	Regions pulumi.StringArrayInput
	// A list of optional tags for the image.
	Tags pulumi.StringArrayInput
	// A URL from which the custom Linux virtual machine image may be retrieved.
	Url pulumi.StringInput
}

func (CustomImageArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*customImageArgs)(nil)).Elem()
}

type CustomImageInput interface {
	pulumi.Input

	ToCustomImageOutput() CustomImageOutput
	ToCustomImageOutputWithContext(ctx context.Context) CustomImageOutput
}

func (*CustomImage) ElementType() reflect.Type {
	return reflect.TypeOf((*CustomImage)(nil))
}

func (i *CustomImage) ToCustomImageOutput() CustomImageOutput {
	return i.ToCustomImageOutputWithContext(context.Background())
}

func (i *CustomImage) ToCustomImageOutputWithContext(ctx context.Context) CustomImageOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomImageOutput)
}

func (i *CustomImage) ToCustomImagePtrOutput() CustomImagePtrOutput {
	return i.ToCustomImagePtrOutputWithContext(context.Background())
}

func (i *CustomImage) ToCustomImagePtrOutputWithContext(ctx context.Context) CustomImagePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomImagePtrOutput)
}

type CustomImagePtrInput interface {
	pulumi.Input

	ToCustomImagePtrOutput() CustomImagePtrOutput
	ToCustomImagePtrOutputWithContext(ctx context.Context) CustomImagePtrOutput
}

type customImagePtrType CustomImageArgs

func (*customImagePtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**CustomImage)(nil))
}

func (i *customImagePtrType) ToCustomImagePtrOutput() CustomImagePtrOutput {
	return i.ToCustomImagePtrOutputWithContext(context.Background())
}

func (i *customImagePtrType) ToCustomImagePtrOutputWithContext(ctx context.Context) CustomImagePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomImagePtrOutput)
}

// CustomImageArrayInput is an input type that accepts CustomImageArray and CustomImageArrayOutput values.
// You can construct a concrete instance of `CustomImageArrayInput` via:
//
//          CustomImageArray{ CustomImageArgs{...} }
type CustomImageArrayInput interface {
	pulumi.Input

	ToCustomImageArrayOutput() CustomImageArrayOutput
	ToCustomImageArrayOutputWithContext(context.Context) CustomImageArrayOutput
}

type CustomImageArray []CustomImageInput

func (CustomImageArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*CustomImage)(nil))
}

func (i CustomImageArray) ToCustomImageArrayOutput() CustomImageArrayOutput {
	return i.ToCustomImageArrayOutputWithContext(context.Background())
}

func (i CustomImageArray) ToCustomImageArrayOutputWithContext(ctx context.Context) CustomImageArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomImageArrayOutput)
}

// CustomImageMapInput is an input type that accepts CustomImageMap and CustomImageMapOutput values.
// You can construct a concrete instance of `CustomImageMapInput` via:
//
//          CustomImageMap{ "key": CustomImageArgs{...} }
type CustomImageMapInput interface {
	pulumi.Input

	ToCustomImageMapOutput() CustomImageMapOutput
	ToCustomImageMapOutputWithContext(context.Context) CustomImageMapOutput
}

type CustomImageMap map[string]CustomImageInput

func (CustomImageMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*CustomImage)(nil))
}

func (i CustomImageMap) ToCustomImageMapOutput() CustomImageMapOutput {
	return i.ToCustomImageMapOutputWithContext(context.Background())
}

func (i CustomImageMap) ToCustomImageMapOutputWithContext(ctx context.Context) CustomImageMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomImageMapOutput)
}

type CustomImageOutput struct {
	*pulumi.OutputState
}

func (CustomImageOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*CustomImage)(nil))
}

func (o CustomImageOutput) ToCustomImageOutput() CustomImageOutput {
	return o
}

func (o CustomImageOutput) ToCustomImageOutputWithContext(ctx context.Context) CustomImageOutput {
	return o
}

func (o CustomImageOutput) ToCustomImagePtrOutput() CustomImagePtrOutput {
	return o.ToCustomImagePtrOutputWithContext(context.Background())
}

func (o CustomImageOutput) ToCustomImagePtrOutputWithContext(ctx context.Context) CustomImagePtrOutput {
	return o.ApplyT(func(v CustomImage) *CustomImage {
		return &v
	}).(CustomImagePtrOutput)
}

type CustomImagePtrOutput struct {
	*pulumi.OutputState
}

func (CustomImagePtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CustomImage)(nil))
}

func (o CustomImagePtrOutput) ToCustomImagePtrOutput() CustomImagePtrOutput {
	return o
}

func (o CustomImagePtrOutput) ToCustomImagePtrOutputWithContext(ctx context.Context) CustomImagePtrOutput {
	return o
}

type CustomImageArrayOutput struct{ *pulumi.OutputState }

func (CustomImageArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]CustomImage)(nil))
}

func (o CustomImageArrayOutput) ToCustomImageArrayOutput() CustomImageArrayOutput {
	return o
}

func (o CustomImageArrayOutput) ToCustomImageArrayOutputWithContext(ctx context.Context) CustomImageArrayOutput {
	return o
}

func (o CustomImageArrayOutput) Index(i pulumi.IntInput) CustomImageOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) CustomImage {
		return vs[0].([]CustomImage)[vs[1].(int)]
	}).(CustomImageOutput)
}

type CustomImageMapOutput struct{ *pulumi.OutputState }

func (CustomImageMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]CustomImage)(nil))
}

func (o CustomImageMapOutput) ToCustomImageMapOutput() CustomImageMapOutput {
	return o
}

func (o CustomImageMapOutput) ToCustomImageMapOutputWithContext(ctx context.Context) CustomImageMapOutput {
	return o
}

func (o CustomImageMapOutput) MapIndex(k pulumi.StringInput) CustomImageOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) CustomImage {
		return vs[0].(map[string]CustomImage)[vs[1].(string)]
	}).(CustomImageOutput)
}

func init() {
	pulumi.RegisterOutputType(CustomImageOutput{})
	pulumi.RegisterOutputType(CustomImagePtrOutput{})
	pulumi.RegisterOutputType(CustomImageArrayOutput{})
	pulumi.RegisterOutputType(CustomImageMapOutput{})
}
