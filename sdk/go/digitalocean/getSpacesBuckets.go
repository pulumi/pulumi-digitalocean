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

// Get information on Spaces buckets for use in other resources, with the ability to filter and sort the results.
// If no filters are specified, all Spaces buckets will be returned.
//
// Note: You can use the `SpacesBucket` data source to
// obtain metadata about a single bucket if you already know its `name` and `region`.
func GetSpacesBuckets(ctx *pulumi.Context, args *GetSpacesBucketsArgs, opts ...pulumi.InvokeOption) (*GetSpacesBucketsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSpacesBucketsResult
	err := ctx.Invoke("digitalocean:index/getSpacesBuckets:getSpacesBuckets", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSpacesBuckets.
type GetSpacesBucketsArgs struct {
	// Filter the results.
	// The `filter` block is documented below.
	Filters []GetSpacesBucketsFilter `pulumi:"filters"`
	// Sort the results.
	// The `sort` block is documented below.
	Sorts []GetSpacesBucketsSort `pulumi:"sorts"`
}

// A collection of values returned by getSpacesBuckets.
type GetSpacesBucketsResult struct {
	// A list of Spaces buckets satisfying any `filter` and `sort` criteria. Each bucket has the following attributes:
	Buckets []GetSpacesBucketsBucket `pulumi:"buckets"`
	Filters []GetSpacesBucketsFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id    string                 `pulumi:"id"`
	Sorts []GetSpacesBucketsSort `pulumi:"sorts"`
}

func GetSpacesBucketsOutput(ctx *pulumi.Context, args GetSpacesBucketsOutputArgs, opts ...pulumi.InvokeOption) GetSpacesBucketsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetSpacesBucketsResult, error) {
			args := v.(GetSpacesBucketsArgs)
			r, err := GetSpacesBuckets(ctx, &args, opts...)
			var s GetSpacesBucketsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetSpacesBucketsResultOutput)
}

// A collection of arguments for invoking getSpacesBuckets.
type GetSpacesBucketsOutputArgs struct {
	// Filter the results.
	// The `filter` block is documented below.
	Filters GetSpacesBucketsFilterArrayInput `pulumi:"filters"`
	// Sort the results.
	// The `sort` block is documented below.
	Sorts GetSpacesBucketsSortArrayInput `pulumi:"sorts"`
}

func (GetSpacesBucketsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSpacesBucketsArgs)(nil)).Elem()
}

// A collection of values returned by getSpacesBuckets.
type GetSpacesBucketsResultOutput struct{ *pulumi.OutputState }

func (GetSpacesBucketsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSpacesBucketsResult)(nil)).Elem()
}

func (o GetSpacesBucketsResultOutput) ToGetSpacesBucketsResultOutput() GetSpacesBucketsResultOutput {
	return o
}

func (o GetSpacesBucketsResultOutput) ToGetSpacesBucketsResultOutputWithContext(ctx context.Context) GetSpacesBucketsResultOutput {
	return o
}

func (o GetSpacesBucketsResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetSpacesBucketsResult] {
	return pulumix.Output[GetSpacesBucketsResult]{
		OutputState: o.OutputState,
	}
}

// A list of Spaces buckets satisfying any `filter` and `sort` criteria. Each bucket has the following attributes:
func (o GetSpacesBucketsResultOutput) Buckets() GetSpacesBucketsBucketArrayOutput {
	return o.ApplyT(func(v GetSpacesBucketsResult) []GetSpacesBucketsBucket { return v.Buckets }).(GetSpacesBucketsBucketArrayOutput)
}

func (o GetSpacesBucketsResultOutput) Filters() GetSpacesBucketsFilterArrayOutput {
	return o.ApplyT(func(v GetSpacesBucketsResult) []GetSpacesBucketsFilter { return v.Filters }).(GetSpacesBucketsFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetSpacesBucketsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSpacesBucketsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetSpacesBucketsResultOutput) Sorts() GetSpacesBucketsSortArrayOutput {
	return o.ApplyT(func(v GetSpacesBucketsResult) []GetSpacesBucketsSort { return v.Sorts }).(GetSpacesBucketsSortArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSpacesBucketsResultOutput{})
}
