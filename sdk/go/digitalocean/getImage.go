// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-digitalocean/sdk/v4/go/digitalocean/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Get information on an image for use in other resources (e.g. creating a Droplet
// based on snapshot). This data source provides all of the image properties as
// configured on your DigitalOcean account. This is useful if the image in question
// is not managed by the provider or you need to utilize any of the image's data.
//
// An error is triggered if zero or more than one result is returned by the query.
//
// ## Example Usage
//
// Get the data about a snapshot:
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
//			_, err := digitalocean.GetImage(ctx, &digitalocean.GetImageArgs{
//				Name: pulumi.StringRef("example-1.0.0"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// Reuse the data about a snapshot to create a Droplet:
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
//			example, err := digitalocean.GetImage(ctx, &digitalocean.GetImageArgs{
//				Name: pulumi.StringRef("example-1.0.0"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = digitalocean.NewDroplet(ctx, "example", &digitalocean.DropletArgs{
//				Image:  pulumi.Int(example.Id),
//				Name:   pulumi.String("example-1"),
//				Region: pulumi.String(digitalocean.RegionNYC2),
//				Size:   pulumi.String(digitalocean.DropletSlugDropletS1VCPU1GB),
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
// Get the data about an official image:
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
//			_, err := digitalocean.GetImage(ctx, &digitalocean.GetImageArgs{
//				Slug: pulumi.StringRef("ubuntu-18-04-x64"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetImage(ctx *pulumi.Context, args *GetImageArgs, opts ...pulumi.InvokeOption) (*GetImageResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetImageResult
	err := ctx.Invoke("digitalocean:index/getImage:getImage", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getImage.
type GetImageArgs struct {
	// The id of the image
	Id *int `pulumi:"id"`
	// The name of the image.
	Name *string `pulumi:"name"`
	// The slug of the official image.
	//
	// If `name` is specified, you may also specify:
	Slug *string `pulumi:"slug"`
	// Restrict the search to one of the following categories of images:
	Source *string `pulumi:"source"`
}

// A collection of values returned by getImage.
type GetImageResult struct {
	// When the image was created
	Created     string `pulumi:"created"`
	Description string `pulumi:"description"`
	// The name of the distribution of the OS of the image.
	Distribution string `pulumi:"distribution"`
	// Any applicable error message pertaining to the image
	ErrorMessage string `pulumi:"errorMessage"`
	// The ID of the image.
	Id int `pulumi:"id"`
	// The id of the image (legacy parameter).
	Image string `pulumi:"image"`
	// The minimum 'disk' required for the image.
	MinDiskSize int `pulumi:"minDiskSize"`
	// The name of the image.
	Name string `pulumi:"name"`
	// Is image a public image or not. Public images represent
	// Linux distributions or One-Click Applications, while non-public images represent
	// snapshots and backups and are only available within your account.
	Private bool `pulumi:"private"`
	// A set of the regions that the image is available in.
	Regions []string `pulumi:"regions"`
	// The size of the image in GB.
	SizeGigabytes float64 `pulumi:"sizeGigabytes"`
	// Unique text identifier of the image.
	Slug   string  `pulumi:"slug"`
	Source *string `pulumi:"source"`
	// Current status of the image
	Status string `pulumi:"status"`
	// A set of tags applied to the image
	Tags []string `pulumi:"tags"`
	// Type of the image.
	Type string `pulumi:"type"`
}

func GetImageOutput(ctx *pulumi.Context, args GetImageOutputArgs, opts ...pulumi.InvokeOption) GetImageResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetImageResultOutput, error) {
			args := v.(GetImageArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("digitalocean:index/getImage:getImage", args, GetImageResultOutput{}, options).(GetImageResultOutput), nil
		}).(GetImageResultOutput)
}

// A collection of arguments for invoking getImage.
type GetImageOutputArgs struct {
	// The id of the image
	Id pulumi.IntPtrInput `pulumi:"id"`
	// The name of the image.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// The slug of the official image.
	//
	// If `name` is specified, you may also specify:
	Slug pulumi.StringPtrInput `pulumi:"slug"`
	// Restrict the search to one of the following categories of images:
	Source pulumi.StringPtrInput `pulumi:"source"`
}

func (GetImageOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetImageArgs)(nil)).Elem()
}

// A collection of values returned by getImage.
type GetImageResultOutput struct{ *pulumi.OutputState }

func (GetImageResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetImageResult)(nil)).Elem()
}

func (o GetImageResultOutput) ToGetImageResultOutput() GetImageResultOutput {
	return o
}

func (o GetImageResultOutput) ToGetImageResultOutputWithContext(ctx context.Context) GetImageResultOutput {
	return o
}

// When the image was created
func (o GetImageResultOutput) Created() pulumi.StringOutput {
	return o.ApplyT(func(v GetImageResult) string { return v.Created }).(pulumi.StringOutput)
}

func (o GetImageResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v GetImageResult) string { return v.Description }).(pulumi.StringOutput)
}

// The name of the distribution of the OS of the image.
func (o GetImageResultOutput) Distribution() pulumi.StringOutput {
	return o.ApplyT(func(v GetImageResult) string { return v.Distribution }).(pulumi.StringOutput)
}

// Any applicable error message pertaining to the image
func (o GetImageResultOutput) ErrorMessage() pulumi.StringOutput {
	return o.ApplyT(func(v GetImageResult) string { return v.ErrorMessage }).(pulumi.StringOutput)
}

// The ID of the image.
func (o GetImageResultOutput) Id() pulumi.IntOutput {
	return o.ApplyT(func(v GetImageResult) int { return v.Id }).(pulumi.IntOutput)
}

// The id of the image (legacy parameter).
func (o GetImageResultOutput) Image() pulumi.StringOutput {
	return o.ApplyT(func(v GetImageResult) string { return v.Image }).(pulumi.StringOutput)
}

// The minimum 'disk' required for the image.
func (o GetImageResultOutput) MinDiskSize() pulumi.IntOutput {
	return o.ApplyT(func(v GetImageResult) int { return v.MinDiskSize }).(pulumi.IntOutput)
}

// The name of the image.
func (o GetImageResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetImageResult) string { return v.Name }).(pulumi.StringOutput)
}

// Is image a public image or not. Public images represent
// Linux distributions or One-Click Applications, while non-public images represent
// snapshots and backups and are only available within your account.
func (o GetImageResultOutput) Private() pulumi.BoolOutput {
	return o.ApplyT(func(v GetImageResult) bool { return v.Private }).(pulumi.BoolOutput)
}

// A set of the regions that the image is available in.
func (o GetImageResultOutput) Regions() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetImageResult) []string { return v.Regions }).(pulumi.StringArrayOutput)
}

// The size of the image in GB.
func (o GetImageResultOutput) SizeGigabytes() pulumi.Float64Output {
	return o.ApplyT(func(v GetImageResult) float64 { return v.SizeGigabytes }).(pulumi.Float64Output)
}

// Unique text identifier of the image.
func (o GetImageResultOutput) Slug() pulumi.StringOutput {
	return o.ApplyT(func(v GetImageResult) string { return v.Slug }).(pulumi.StringOutput)
}

func (o GetImageResultOutput) Source() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetImageResult) *string { return v.Source }).(pulumi.StringPtrOutput)
}

// Current status of the image
func (o GetImageResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v GetImageResult) string { return v.Status }).(pulumi.StringOutput)
}

// A set of tags applied to the image
func (o GetImageResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetImageResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

// Type of the image.
func (o GetImageResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v GetImageResult) string { return v.Type }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetImageResultOutput{})
}
