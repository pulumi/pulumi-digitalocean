// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Get information on a volume for use in other resources. This data source provides
// all of the volumes properties as configured on your DigitalOcean account. This is
// useful if the volume in question is not managed by the provider or you need to utilize
// any of the volumes data.
//
// An error is triggered if the provided volume name does not exist.
//
// ## Example Usage
//
// Get the volume:
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
// 		_, err := digitalocean.LookupVolume(ctx, &GetVolumeArgs{
// 			Name:   "app-data",
// 			Region: pulumi.StringRef("nyc3"),
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// Reuse the data about a volume to attach it to a Droplet:
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
// 		exampleVolume, err := digitalocean.LookupVolume(ctx, &GetVolumeArgs{
// 			Name:   "app-data",
// 			Region: pulumi.StringRef("nyc3"),
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		exampleDroplet, err := digitalocean.NewDroplet(ctx, "exampleDroplet", &digitalocean.DropletArgs{
// 			Size:   pulumi.String("s-1vcpu-1gb"),
// 			Image:  pulumi.String("ubuntu-18-04-x64"),
// 			Region: pulumi.String("nyc3"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = digitalocean.NewVolumeAttachment(ctx, "foobar", &digitalocean.VolumeAttachmentArgs{
// 			DropletId: exampleDroplet.ID(),
// 			VolumeId:  pulumi.String(exampleVolume.Id),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupVolume(ctx *pulumi.Context, args *LookupVolumeArgs, opts ...pulumi.InvokeOption) (*LookupVolumeResult, error) {
	var rv LookupVolumeResult
	err := ctx.Invoke("digitalocean:index/getVolume:getVolume", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getVolume.
type LookupVolumeArgs struct {
	// Text describing a block storage volume.
	Description *string `pulumi:"description"`
	// The name of block storage volume.
	Name string `pulumi:"name"`
	// The region the block storage volume is provisioned in.
	Region *string `pulumi:"region"`
}

// A collection of values returned by getVolume.
type LookupVolumeResult struct {
	// Text describing a block storage volume.
	Description *string `pulumi:"description"`
	// A list of associated Droplet ids.
	DropletIds []int `pulumi:"dropletIds"`
	// Filesystem label currently in-use on the block storage volume.
	FilesystemLabel string `pulumi:"filesystemLabel"`
	// Filesystem type currently in-use on the block storage volume.
	FilesystemType string `pulumi:"filesystemType"`
	// The provider-assigned unique ID for this managed resource.
	Id     string  `pulumi:"id"`
	Name   string  `pulumi:"name"`
	Region *string `pulumi:"region"`
	// The size of the block storage volume in GiB.
	Size int `pulumi:"size"`
	// A list of the tags associated to the Volume.
	Tags []string `pulumi:"tags"`
	Urn  string   `pulumi:"urn"`
}

func LookupVolumeOutput(ctx *pulumi.Context, args LookupVolumeOutputArgs, opts ...pulumi.InvokeOption) LookupVolumeResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupVolumeResult, error) {
			args := v.(LookupVolumeArgs)
			r, err := LookupVolume(ctx, &args, opts...)
			var s LookupVolumeResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupVolumeResultOutput)
}

// A collection of arguments for invoking getVolume.
type LookupVolumeOutputArgs struct {
	// Text describing a block storage volume.
	Description pulumi.StringPtrInput `pulumi:"description"`
	// The name of block storage volume.
	Name pulumi.StringInput `pulumi:"name"`
	// The region the block storage volume is provisioned in.
	Region pulumi.StringPtrInput `pulumi:"region"`
}

func (LookupVolumeOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupVolumeArgs)(nil)).Elem()
}

// A collection of values returned by getVolume.
type LookupVolumeResultOutput struct{ *pulumi.OutputState }

func (LookupVolumeResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupVolumeResult)(nil)).Elem()
}

func (o LookupVolumeResultOutput) ToLookupVolumeResultOutput() LookupVolumeResultOutput {
	return o
}

func (o LookupVolumeResultOutput) ToLookupVolumeResultOutputWithContext(ctx context.Context) LookupVolumeResultOutput {
	return o
}

// Text describing a block storage volume.
func (o LookupVolumeResultOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupVolumeResult) *string { return v.Description }).(pulumi.StringPtrOutput)
}

// A list of associated Droplet ids.
func (o LookupVolumeResultOutput) DropletIds() pulumi.IntArrayOutput {
	return o.ApplyT(func(v LookupVolumeResult) []int { return v.DropletIds }).(pulumi.IntArrayOutput)
}

// Filesystem label currently in-use on the block storage volume.
func (o LookupVolumeResultOutput) FilesystemLabel() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVolumeResult) string { return v.FilesystemLabel }).(pulumi.StringOutput)
}

// Filesystem type currently in-use on the block storage volume.
func (o LookupVolumeResultOutput) FilesystemType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVolumeResult) string { return v.FilesystemType }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupVolumeResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVolumeResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupVolumeResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVolumeResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupVolumeResultOutput) Region() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupVolumeResult) *string { return v.Region }).(pulumi.StringPtrOutput)
}

// The size of the block storage volume in GiB.
func (o LookupVolumeResultOutput) Size() pulumi.IntOutput {
	return o.ApplyT(func(v LookupVolumeResult) int { return v.Size }).(pulumi.IntOutput)
}

// A list of the tags associated to the Volume.
func (o LookupVolumeResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupVolumeResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

func (o LookupVolumeResultOutput) Urn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVolumeResult) string { return v.Urn }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupVolumeResultOutput{})
}
