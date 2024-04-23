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
//
//	"github.com/pulumi/pulumi-digitalocean/sdk/v4/go/digitalocean"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			flatcar, err := digitalocean.NewCustomImage(ctx, "flatcar", &digitalocean.CustomImageArgs{
//				Url: pulumi.String("https://stable.release.flatcar-linux.net/amd64-usr/2605.7.0/flatcar_production_digitalocean_image.bin.bz2"),
//				Regions: pulumi.StringArray{
//					pulumi.String("nyc3"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = digitalocean.NewDroplet(ctx, "example", &digitalocean.DropletArgs{
//				Image:  flatcar.ID(),
//				Region: pulumi.String(digitalocean.RegionNYC3),
//				Size:   pulumi.String(digitalocean.DropletSlugDropletS1VCPU1GB),
//				SshKeys: pulumi.StringArray{
//					pulumi.String("12345"),
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
type CustomImage struct {
	pulumi.CustomResourceState

	// A time value given in ISO8601 combined date and time format that represents when the image was created.
	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// An optional description for the image.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// An optional distribution name for the image. Valid values are documented [here](https://docs.digitalocean.com/reference/api/api-reference/#operation/create_custom_image)
	Distribution pulumi.StringPtrOutput `pulumi:"distribution"`
	// A unique number that can be used to identify and reference a specific image.
	ImageId pulumi.IntOutput `pulumi:"imageId"`
	// The minimum disk size in GB required for a Droplet to use this image.
	MinDiskSize pulumi.IntOutput `pulumi:"minDiskSize"`
	// A name for the Custom Image.
	Name pulumi.StringOutput `pulumi:"name"`
	// Indicates whether the image in question is public or not.
	Public pulumi.BoolOutput `pulumi:"public"`
	// A list of regions. (Currently only one is supported).
	Regions pulumi.StringArrayOutput `pulumi:"regions"`
	// The size of the image in gigabytes.
	SizeGigabytes pulumi.Float64Output `pulumi:"sizeGigabytes"`
	// A uniquely identifying string for each image.
	Slug pulumi.StringOutput `pulumi:"slug"`
	// A status string indicating the state of a custom image.
	Status pulumi.StringOutput `pulumi:"status"`
	// A list of optional tags for the image.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
	// Describes the kind of image.
	Type pulumi.StringOutput `pulumi:"type"`
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
	opts = internal.PkgResourceDefaultOpts(opts)
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
	// A time value given in ISO8601 combined date and time format that represents when the image was created.
	CreatedAt *string `pulumi:"createdAt"`
	// An optional description for the image.
	Description *string `pulumi:"description"`
	// An optional distribution name for the image. Valid values are documented [here](https://docs.digitalocean.com/reference/api/api-reference/#operation/create_custom_image)
	Distribution *string `pulumi:"distribution"`
	// A unique number that can be used to identify and reference a specific image.
	ImageId *int `pulumi:"imageId"`
	// The minimum disk size in GB required for a Droplet to use this image.
	MinDiskSize *int `pulumi:"minDiskSize"`
	// A name for the Custom Image.
	Name *string `pulumi:"name"`
	// Indicates whether the image in question is public or not.
	Public *bool `pulumi:"public"`
	// A list of regions. (Currently only one is supported).
	Regions []string `pulumi:"regions"`
	// The size of the image in gigabytes.
	SizeGigabytes *float64 `pulumi:"sizeGigabytes"`
	// A uniquely identifying string for each image.
	Slug *string `pulumi:"slug"`
	// A status string indicating the state of a custom image.
	Status *string `pulumi:"status"`
	// A list of optional tags for the image.
	Tags []string `pulumi:"tags"`
	// Describes the kind of image.
	Type *string `pulumi:"type"`
	// A URL from which the custom Linux virtual machine image may be retrieved.
	Url *string `pulumi:"url"`
}

type CustomImageState struct {
	// A time value given in ISO8601 combined date and time format that represents when the image was created.
	CreatedAt pulumi.StringPtrInput
	// An optional description for the image.
	Description pulumi.StringPtrInput
	// An optional distribution name for the image. Valid values are documented [here](https://docs.digitalocean.com/reference/api/api-reference/#operation/create_custom_image)
	Distribution pulumi.StringPtrInput
	// A unique number that can be used to identify and reference a specific image.
	ImageId pulumi.IntPtrInput
	// The minimum disk size in GB required for a Droplet to use this image.
	MinDiskSize pulumi.IntPtrInput
	// A name for the Custom Image.
	Name pulumi.StringPtrInput
	// Indicates whether the image in question is public or not.
	Public pulumi.BoolPtrInput
	// A list of regions. (Currently only one is supported).
	Regions pulumi.StringArrayInput
	// The size of the image in gigabytes.
	SizeGigabytes pulumi.Float64PtrInput
	// A uniquely identifying string for each image.
	Slug pulumi.StringPtrInput
	// A status string indicating the state of a custom image.
	Status pulumi.StringPtrInput
	// A list of optional tags for the image.
	Tags pulumi.StringArrayInput
	// Describes the kind of image.
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
	// An optional distribution name for the image. Valid values are documented [here](https://docs.digitalocean.com/reference/api/api-reference/#operation/create_custom_image)
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
	// An optional distribution name for the image. Valid values are documented [here](https://docs.digitalocean.com/reference/api/api-reference/#operation/create_custom_image)
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
	return reflect.TypeOf((**CustomImage)(nil)).Elem()
}

func (i *CustomImage) ToCustomImageOutput() CustomImageOutput {
	return i.ToCustomImageOutputWithContext(context.Background())
}

func (i *CustomImage) ToCustomImageOutputWithContext(ctx context.Context) CustomImageOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomImageOutput)
}

// CustomImageArrayInput is an input type that accepts CustomImageArray and CustomImageArrayOutput values.
// You can construct a concrete instance of `CustomImageArrayInput` via:
//
//	CustomImageArray{ CustomImageArgs{...} }
type CustomImageArrayInput interface {
	pulumi.Input

	ToCustomImageArrayOutput() CustomImageArrayOutput
	ToCustomImageArrayOutputWithContext(context.Context) CustomImageArrayOutput
}

type CustomImageArray []CustomImageInput

func (CustomImageArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CustomImage)(nil)).Elem()
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
//	CustomImageMap{ "key": CustomImageArgs{...} }
type CustomImageMapInput interface {
	pulumi.Input

	ToCustomImageMapOutput() CustomImageMapOutput
	ToCustomImageMapOutputWithContext(context.Context) CustomImageMapOutput
}

type CustomImageMap map[string]CustomImageInput

func (CustomImageMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CustomImage)(nil)).Elem()
}

func (i CustomImageMap) ToCustomImageMapOutput() CustomImageMapOutput {
	return i.ToCustomImageMapOutputWithContext(context.Background())
}

func (i CustomImageMap) ToCustomImageMapOutputWithContext(ctx context.Context) CustomImageMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomImageMapOutput)
}

type CustomImageOutput struct{ *pulumi.OutputState }

func (CustomImageOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CustomImage)(nil)).Elem()
}

func (o CustomImageOutput) ToCustomImageOutput() CustomImageOutput {
	return o
}

func (o CustomImageOutput) ToCustomImageOutputWithContext(ctx context.Context) CustomImageOutput {
	return o
}

// A time value given in ISO8601 combined date and time format that represents when the image was created.
func (o CustomImageOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomImage) pulumi.StringOutput { return v.CreatedAt }).(pulumi.StringOutput)
}

// An optional description for the image.
func (o CustomImageOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CustomImage) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// An optional distribution name for the image. Valid values are documented [here](https://docs.digitalocean.com/reference/api/api-reference/#operation/create_custom_image)
func (o CustomImageOutput) Distribution() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CustomImage) pulumi.StringPtrOutput { return v.Distribution }).(pulumi.StringPtrOutput)
}

// A unique number that can be used to identify and reference a specific image.
func (o CustomImageOutput) ImageId() pulumi.IntOutput {
	return o.ApplyT(func(v *CustomImage) pulumi.IntOutput { return v.ImageId }).(pulumi.IntOutput)
}

// The minimum disk size in GB required for a Droplet to use this image.
func (o CustomImageOutput) MinDiskSize() pulumi.IntOutput {
	return o.ApplyT(func(v *CustomImage) pulumi.IntOutput { return v.MinDiskSize }).(pulumi.IntOutput)
}

// A name for the Custom Image.
func (o CustomImageOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomImage) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Indicates whether the image in question is public or not.
func (o CustomImageOutput) Public() pulumi.BoolOutput {
	return o.ApplyT(func(v *CustomImage) pulumi.BoolOutput { return v.Public }).(pulumi.BoolOutput)
}

// A list of regions. (Currently only one is supported).
func (o CustomImageOutput) Regions() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *CustomImage) pulumi.StringArrayOutput { return v.Regions }).(pulumi.StringArrayOutput)
}

// The size of the image in gigabytes.
func (o CustomImageOutput) SizeGigabytes() pulumi.Float64Output {
	return o.ApplyT(func(v *CustomImage) pulumi.Float64Output { return v.SizeGigabytes }).(pulumi.Float64Output)
}

// A uniquely identifying string for each image.
func (o CustomImageOutput) Slug() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomImage) pulumi.StringOutput { return v.Slug }).(pulumi.StringOutput)
}

// A status string indicating the state of a custom image.
func (o CustomImageOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomImage) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// A list of optional tags for the image.
func (o CustomImageOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *CustomImage) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

// Describes the kind of image.
func (o CustomImageOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomImage) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// A URL from which the custom Linux virtual machine image may be retrieved.
func (o CustomImageOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomImage) pulumi.StringOutput { return v.Url }).(pulumi.StringOutput)
}

type CustomImageArrayOutput struct{ *pulumi.OutputState }

func (CustomImageArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CustomImage)(nil)).Elem()
}

func (o CustomImageArrayOutput) ToCustomImageArrayOutput() CustomImageArrayOutput {
	return o
}

func (o CustomImageArrayOutput) ToCustomImageArrayOutputWithContext(ctx context.Context) CustomImageArrayOutput {
	return o
}

func (o CustomImageArrayOutput) Index(i pulumi.IntInput) CustomImageOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CustomImage {
		return vs[0].([]*CustomImage)[vs[1].(int)]
	}).(CustomImageOutput)
}

type CustomImageMapOutput struct{ *pulumi.OutputState }

func (CustomImageMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CustomImage)(nil)).Elem()
}

func (o CustomImageMapOutput) ToCustomImageMapOutput() CustomImageMapOutput {
	return o
}

func (o CustomImageMapOutput) ToCustomImageMapOutputWithContext(ctx context.Context) CustomImageMapOutput {
	return o
}

func (o CustomImageMapOutput) MapIndex(k pulumi.StringInput) CustomImageOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CustomImage {
		return vs[0].(map[string]*CustomImage)[vs[1].(string)]
	}).(CustomImageOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CustomImageInput)(nil)).Elem(), &CustomImage{})
	pulumi.RegisterInputType(reflect.TypeOf((*CustomImageArrayInput)(nil)).Elem(), CustomImageArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CustomImageMapInput)(nil)).Elem(), CustomImageMap{})
	pulumi.RegisterOutputType(CustomImageOutput{})
	pulumi.RegisterOutputType(CustomImageArrayOutput{})
	pulumi.RegisterOutputType(CustomImageMapOutput{})
}
