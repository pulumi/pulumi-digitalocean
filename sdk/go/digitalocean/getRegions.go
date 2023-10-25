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

// Retrieve information about all supported DigitalOcean regions, with the ability to
// filter and sort the results. If no filters are specified, all regions will be returned.
//
// Note: You can use the `getRegion` data source
// to obtain metadata about a single region if you already know the `slug` to retrieve.
//
// ## Example Usage
//
// Use the `filter` block with a `key` string and `values` list to filter regions.
//
// For example to find all available regions:
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
//			_, err := digitalocean.GetRegions(ctx, &digitalocean.GetRegionsArgs{
//				Filters: []digitalocean.GetRegionsFilter{
//					{
//						Key: "available",
//						Values: []string{
//							"true",
//						},
//					},
//				},
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
// You can filter on multiple fields and sort the results as well:
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
//			_, err := digitalocean.GetRegions(ctx, &digitalocean.GetRegionsArgs{
//				Filters: []digitalocean.GetRegionsFilter{
//					{
//						Key: "available",
//						Values: []string{
//							"true",
//						},
//					},
//					{
//						Key: "features",
//						Values: []string{
//							"private_networking",
//						},
//					},
//				},
//				Sorts: []digitalocean.GetRegionsSort{
//					{
//						Direction: pulumi.StringRef("desc"),
//						Key:       "name",
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetRegions(ctx *pulumi.Context, args *GetRegionsArgs, opts ...pulumi.InvokeOption) (*GetRegionsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetRegionsResult
	err := ctx.Invoke("digitalocean:index/getRegions:getRegions", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getRegions.
type GetRegionsArgs struct {
	// Filter the results.
	// The `filter` block is documented below.
	Filters []GetRegionsFilter `pulumi:"filters"`
	// Sort the results.
	// The `sort` block is documented below.
	Sorts []GetRegionsSort `pulumi:"sorts"`
}

// A collection of values returned by getRegions.
type GetRegionsResult struct {
	Filters []GetRegionsFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A set of regions satisfying any `filter` and `sort` criteria. Each region has the following attributes:
	Regions []GetRegionsRegion `pulumi:"regions"`
	Sorts   []GetRegionsSort   `pulumi:"sorts"`
}

func GetRegionsOutput(ctx *pulumi.Context, args GetRegionsOutputArgs, opts ...pulumi.InvokeOption) GetRegionsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetRegionsResult, error) {
			args := v.(GetRegionsArgs)
			r, err := GetRegions(ctx, &args, opts...)
			var s GetRegionsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetRegionsResultOutput)
}

// A collection of arguments for invoking getRegions.
type GetRegionsOutputArgs struct {
	// Filter the results.
	// The `filter` block is documented below.
	Filters GetRegionsFilterArrayInput `pulumi:"filters"`
	// Sort the results.
	// The `sort` block is documented below.
	Sorts GetRegionsSortArrayInput `pulumi:"sorts"`
}

func (GetRegionsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRegionsArgs)(nil)).Elem()
}

// A collection of values returned by getRegions.
type GetRegionsResultOutput struct{ *pulumi.OutputState }

func (GetRegionsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRegionsResult)(nil)).Elem()
}

func (o GetRegionsResultOutput) ToGetRegionsResultOutput() GetRegionsResultOutput {
	return o
}

func (o GetRegionsResultOutput) ToGetRegionsResultOutputWithContext(ctx context.Context) GetRegionsResultOutput {
	return o
}

func (o GetRegionsResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetRegionsResult] {
	return pulumix.Output[GetRegionsResult]{
		OutputState: o.OutputState,
	}
}

func (o GetRegionsResultOutput) Filters() GetRegionsFilterArrayOutput {
	return o.ApplyT(func(v GetRegionsResult) []GetRegionsFilter { return v.Filters }).(GetRegionsFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetRegionsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetRegionsResult) string { return v.Id }).(pulumi.StringOutput)
}

// A set of regions satisfying any `filter` and `sort` criteria. Each region has the following attributes:
func (o GetRegionsResultOutput) Regions() GetRegionsRegionArrayOutput {
	return o.ApplyT(func(v GetRegionsResult) []GetRegionsRegion { return v.Regions }).(GetRegionsRegionArrayOutput)
}

func (o GetRegionsResultOutput) Sorts() GetRegionsSortArrayOutput {
	return o.ApplyT(func(v GetRegionsResult) []GetRegionsSort { return v.Sorts }).(GetRegionsSortArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetRegionsResultOutput{})
}
