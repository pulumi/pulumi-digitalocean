// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-digitalocean/sdk/v4/go/digitalocean/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Droplet snapshots are saved instances of a Droplet. Use this data
// source to retrieve the ID of a DigitalOcean Droplet snapshot for use in other
// resources.
//
// ## Example Usage
//
// Get the Droplet snapshot:
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
//			_, err := digitalocean.LookupDropletSnapshot(ctx, &digitalocean.LookupDropletSnapshotArgs{
//				MostRecent: pulumi.BoolRef(true),
//				NameRegex:  pulumi.StringRef("^web"),
//				Region:     pulumi.StringRef("nyc3"),
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
// Create image from snapshot:
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
//			web_snapshot, err := digitalocean.LookupDropletSnapshot(ctx, &digitalocean.LookupDropletSnapshotArgs{
//				NameRegex:  pulumi.StringRef("^web"),
//				Region:     pulumi.StringRef("nyc3"),
//				MostRecent: pulumi.BoolRef(true),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = digitalocean.NewDroplet(ctx, "from-snapshot", &digitalocean.DropletArgs{
//				Image:  *pulumi.String(web_snapshot.Id),
//				Region: pulumi.String("nyc3"),
//				Size:   pulumi.String("s-2vcpu-4gb"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupDropletSnapshot(ctx *pulumi.Context, args *LookupDropletSnapshotArgs, opts ...pulumi.InvokeOption) (*LookupDropletSnapshotResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupDropletSnapshotResult
	err := ctx.Invoke("digitalocean:index/getDropletSnapshot:getDropletSnapshot", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDropletSnapshot.
type LookupDropletSnapshotArgs struct {
	// If more than one result is returned, use the most recent Droplet snapshot.
	//
	// > **NOTE:** If more or less than a single match is returned by the search,
	// the update will fail. Ensure that your search is specific enough to return
	// a single Droplet snapshot ID only, or use `mostRecent` to choose the most recent one.
	MostRecent *bool `pulumi:"mostRecent"`
	// The name of the Droplet snapshot.
	Name *string `pulumi:"name"`
	// A regex string to apply to the Droplet snapshot list returned by DigitalOcean. This allows more advanced filtering not supported from the DigitalOcean API. This filtering is done locally on what DigitalOcean returns.
	NameRegex *string `pulumi:"nameRegex"`
	// A "slug" representing a DigitalOcean region (e.g. `nyc1`). If set, only Droplet snapshots available in the region will be returned.
	Region *string `pulumi:"region"`
}

// A collection of values returned by getDropletSnapshot.
type LookupDropletSnapshotResult struct {
	// The date and time the Droplet snapshot was created.
	CreatedAt string `pulumi:"createdAt"`
	// The ID of the Droplet from which the Droplet snapshot originated.
	DropletId string `pulumi:"dropletId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The minimum size in gigabytes required for a Droplet to be created based on this Droplet snapshot.
	MinDiskSize int     `pulumi:"minDiskSize"`
	MostRecent  *bool   `pulumi:"mostRecent"`
	Name        *string `pulumi:"name"`
	NameRegex   *string `pulumi:"nameRegex"`
	Region      *string `pulumi:"region"`
	// A list of DigitalOcean region "slugs" indicating where the Droplet snapshot is available.
	Regions []string `pulumi:"regions"`
	// The billable size of the Droplet snapshot in gigabytes.
	Size float64 `pulumi:"size"`
}

func LookupDropletSnapshotOutput(ctx *pulumi.Context, args LookupDropletSnapshotOutputArgs, opts ...pulumi.InvokeOption) LookupDropletSnapshotResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupDropletSnapshotResult, error) {
			args := v.(LookupDropletSnapshotArgs)
			r, err := LookupDropletSnapshot(ctx, &args, opts...)
			var s LookupDropletSnapshotResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupDropletSnapshotResultOutput)
}

// A collection of arguments for invoking getDropletSnapshot.
type LookupDropletSnapshotOutputArgs struct {
	// If more than one result is returned, use the most recent Droplet snapshot.
	//
	// > **NOTE:** If more or less than a single match is returned by the search,
	// the update will fail. Ensure that your search is specific enough to return
	// a single Droplet snapshot ID only, or use `mostRecent` to choose the most recent one.
	MostRecent pulumi.BoolPtrInput `pulumi:"mostRecent"`
	// The name of the Droplet snapshot.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// A regex string to apply to the Droplet snapshot list returned by DigitalOcean. This allows more advanced filtering not supported from the DigitalOcean API. This filtering is done locally on what DigitalOcean returns.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// A "slug" representing a DigitalOcean region (e.g. `nyc1`). If set, only Droplet snapshots available in the region will be returned.
	Region pulumi.StringPtrInput `pulumi:"region"`
}

func (LookupDropletSnapshotOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDropletSnapshotArgs)(nil)).Elem()
}

// A collection of values returned by getDropletSnapshot.
type LookupDropletSnapshotResultOutput struct{ *pulumi.OutputState }

func (LookupDropletSnapshotResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDropletSnapshotResult)(nil)).Elem()
}

func (o LookupDropletSnapshotResultOutput) ToLookupDropletSnapshotResultOutput() LookupDropletSnapshotResultOutput {
	return o
}

func (o LookupDropletSnapshotResultOutput) ToLookupDropletSnapshotResultOutputWithContext(ctx context.Context) LookupDropletSnapshotResultOutput {
	return o
}

func (o LookupDropletSnapshotResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupDropletSnapshotResult] {
	return pulumix.Output[LookupDropletSnapshotResult]{
		OutputState: o.OutputState,
	}
}

// The date and time the Droplet snapshot was created.
func (o LookupDropletSnapshotResultOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDropletSnapshotResult) string { return v.CreatedAt }).(pulumi.StringOutput)
}

// The ID of the Droplet from which the Droplet snapshot originated.
func (o LookupDropletSnapshotResultOutput) DropletId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDropletSnapshotResult) string { return v.DropletId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupDropletSnapshotResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDropletSnapshotResult) string { return v.Id }).(pulumi.StringOutput)
}

// The minimum size in gigabytes required for a Droplet to be created based on this Droplet snapshot.
func (o LookupDropletSnapshotResultOutput) MinDiskSize() pulumi.IntOutput {
	return o.ApplyT(func(v LookupDropletSnapshotResult) int { return v.MinDiskSize }).(pulumi.IntOutput)
}

func (o LookupDropletSnapshotResultOutput) MostRecent() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v LookupDropletSnapshotResult) *bool { return v.MostRecent }).(pulumi.BoolPtrOutput)
}

func (o LookupDropletSnapshotResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupDropletSnapshotResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

func (o LookupDropletSnapshotResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupDropletSnapshotResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o LookupDropletSnapshotResultOutput) Region() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupDropletSnapshotResult) *string { return v.Region }).(pulumi.StringPtrOutput)
}

// A list of DigitalOcean region "slugs" indicating where the Droplet snapshot is available.
func (o LookupDropletSnapshotResultOutput) Regions() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupDropletSnapshotResult) []string { return v.Regions }).(pulumi.StringArrayOutput)
}

// The billable size of the Droplet snapshot in gigabytes.
func (o LookupDropletSnapshotResultOutput) Size() pulumi.Float64Output {
	return o.ApplyT(func(v LookupDropletSnapshotResult) float64 { return v.Size }).(pulumi.Float64Output)
}

func init() {
	pulumi.RegisterOutputType(LookupDropletSnapshotResultOutput{})
}
