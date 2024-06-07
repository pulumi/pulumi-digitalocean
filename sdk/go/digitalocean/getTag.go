// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-digitalocean/sdk/v4/go/digitalocean/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Get information on a tag. This data source provides the name as configured on
// your DigitalOcean account. This is useful if the tag name in question is not
// managed by the provider or you need validate if the tag exists in the account.
//
// An error is triggered if the provided tag name does not exist.
//
// ## Example Usage
//
// Get the tag:
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
//			example, err := digitalocean.LookupTag(ctx, &digitalocean.LookupTagArgs{
//				Name: "example",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = digitalocean.NewDroplet(ctx, "example", &digitalocean.DropletArgs{
//				Image:  pulumi.String("ubuntu-18-04-x64"),
//				Name:   pulumi.String("example-1"),
//				Region: pulumi.String(digitalocean.RegionNYC2),
//				Size:   pulumi.String(digitalocean.DropletSlugDropletS1VCPU1GB),
//				Tags: pulumi.StringArray{
//					pulumi.String(example.Name),
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
func LookupTag(ctx *pulumi.Context, args *LookupTagArgs, opts ...pulumi.InvokeOption) (*LookupTagResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupTagResult
	err := ctx.Invoke("digitalocean:index/getTag:getTag", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTag.
type LookupTagArgs struct {
	// The name of the tag.
	Name string `pulumi:"name"`
}

// A collection of values returned by getTag.
type LookupTagResult struct {
	// A count of the database clusters that the tag is applied to.
	DatabasesCount int `pulumi:"databasesCount"`
	// A count of the Droplets the tag is applied to.
	DropletsCount int `pulumi:"dropletsCount"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A count of the images that the tag is applied to.
	ImagesCount int    `pulumi:"imagesCount"`
	Name        string `pulumi:"name"`
	// A count of the total number of resources that the tag is applied to.
	TotalResourceCount int `pulumi:"totalResourceCount"`
	// A count of the volume snapshots that the tag is applied to.
	VolumeSnapshotsCount int `pulumi:"volumeSnapshotsCount"`
	// A count of the volumes that the tag is applied to.
	VolumesCount int `pulumi:"volumesCount"`
}

func LookupTagOutput(ctx *pulumi.Context, args LookupTagOutputArgs, opts ...pulumi.InvokeOption) LookupTagResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupTagResult, error) {
			args := v.(LookupTagArgs)
			r, err := LookupTag(ctx, &args, opts...)
			var s LookupTagResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupTagResultOutput)
}

// A collection of arguments for invoking getTag.
type LookupTagOutputArgs struct {
	// The name of the tag.
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupTagOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTagArgs)(nil)).Elem()
}

// A collection of values returned by getTag.
type LookupTagResultOutput struct{ *pulumi.OutputState }

func (LookupTagResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTagResult)(nil)).Elem()
}

func (o LookupTagResultOutput) ToLookupTagResultOutput() LookupTagResultOutput {
	return o
}

func (o LookupTagResultOutput) ToLookupTagResultOutputWithContext(ctx context.Context) LookupTagResultOutput {
	return o
}

// A count of the database clusters that the tag is applied to.
func (o LookupTagResultOutput) DatabasesCount() pulumi.IntOutput {
	return o.ApplyT(func(v LookupTagResult) int { return v.DatabasesCount }).(pulumi.IntOutput)
}

// A count of the Droplets the tag is applied to.
func (o LookupTagResultOutput) DropletsCount() pulumi.IntOutput {
	return o.ApplyT(func(v LookupTagResult) int { return v.DropletsCount }).(pulumi.IntOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupTagResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTagResult) string { return v.Id }).(pulumi.StringOutput)
}

// A count of the images that the tag is applied to.
func (o LookupTagResultOutput) ImagesCount() pulumi.IntOutput {
	return o.ApplyT(func(v LookupTagResult) int { return v.ImagesCount }).(pulumi.IntOutput)
}

func (o LookupTagResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTagResult) string { return v.Name }).(pulumi.StringOutput)
}

// A count of the total number of resources that the tag is applied to.
func (o LookupTagResultOutput) TotalResourceCount() pulumi.IntOutput {
	return o.ApplyT(func(v LookupTagResult) int { return v.TotalResourceCount }).(pulumi.IntOutput)
}

// A count of the volume snapshots that the tag is applied to.
func (o LookupTagResultOutput) VolumeSnapshotsCount() pulumi.IntOutput {
	return o.ApplyT(func(v LookupTagResult) int { return v.VolumeSnapshotsCount }).(pulumi.IntOutput)
}

// A count of the volumes that the tag is applied to.
func (o LookupTagResultOutput) VolumesCount() pulumi.IntOutput {
	return o.ApplyT(func(v LookupTagResult) int { return v.VolumesCount }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupTagResultOutput{})
}
