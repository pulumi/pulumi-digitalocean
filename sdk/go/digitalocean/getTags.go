// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-digitalocean/sdk/v4/go/digitalocean/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Returns a list of tags in your DigitalOcean account, with the ability to
// filter and sort the results. If no filters are specified, all tags will be
// returned.
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
//			list, err := digitalocean.GetTags(ctx, &digitalocean.GetTagsArgs{
//				Sorts: []digitalocean.GetTagsSort{
//					{
//						Key:       "total_resource_count",
//						Direction: pulumi.StringRef("asc"),
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("sortedTags", list.Tags)
//			return nil
//		})
//	}
//
// ```
func GetTags(ctx *pulumi.Context, args *GetTagsArgs, opts ...pulumi.InvokeOption) (*GetTagsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetTagsResult
	err := ctx.Invoke("digitalocean:index/getTags:getTags", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTags.
type GetTagsArgs struct {
	// Filter the results.
	// The `filter` block is documented below.
	Filters []GetTagsFilter `pulumi:"filters"`
	// Sort the results.
	// The `sort` block is documented below.
	Sorts []GetTagsSort `pulumi:"sorts"`
}

// A collection of values returned by getTags.
type GetTagsResult struct {
	Filters []GetTagsFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id    string        `pulumi:"id"`
	Sorts []GetTagsSort `pulumi:"sorts"`
	Tags  []GetTagsTag  `pulumi:"tags"`
}

func GetTagsOutput(ctx *pulumi.Context, args GetTagsOutputArgs, opts ...pulumi.InvokeOption) GetTagsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetTagsResultOutput, error) {
			args := v.(GetTagsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("digitalocean:index/getTags:getTags", args, GetTagsResultOutput{}, options).(GetTagsResultOutput), nil
		}).(GetTagsResultOutput)
}

// A collection of arguments for invoking getTags.
type GetTagsOutputArgs struct {
	// Filter the results.
	// The `filter` block is documented below.
	Filters GetTagsFilterArrayInput `pulumi:"filters"`
	// Sort the results.
	// The `sort` block is documented below.
	Sorts GetTagsSortArrayInput `pulumi:"sorts"`
}

func (GetTagsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTagsArgs)(nil)).Elem()
}

// A collection of values returned by getTags.
type GetTagsResultOutput struct{ *pulumi.OutputState }

func (GetTagsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTagsResult)(nil)).Elem()
}

func (o GetTagsResultOutput) ToGetTagsResultOutput() GetTagsResultOutput {
	return o
}

func (o GetTagsResultOutput) ToGetTagsResultOutputWithContext(ctx context.Context) GetTagsResultOutput {
	return o
}

func (o GetTagsResultOutput) Filters() GetTagsFilterArrayOutput {
	return o.ApplyT(func(v GetTagsResult) []GetTagsFilter { return v.Filters }).(GetTagsFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetTagsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetTagsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetTagsResultOutput) Sorts() GetTagsSortArrayOutput {
	return o.ApplyT(func(v GetTagsResult) []GetTagsSort { return v.Sorts }).(GetTagsSortArrayOutput)
}

func (o GetTagsResultOutput) Tags() GetTagsTagArrayOutput {
	return o.ApplyT(func(v GetTagsResult) []GetTagsTag { return v.Tags }).(GetTagsTagArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetTagsResultOutput{})
}
