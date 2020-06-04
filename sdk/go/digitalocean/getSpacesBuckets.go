// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Get information on Spaces buckets for use in other resources, with the ability to filter and sort the results.
// If no filters are specified, all Spaces buckets will be returned.
//
// Note: You can use the `.SpacesBucket` data source to
// obtain metadata about a single bucket if you already know its `name` and `region`.
func GetSpacesBuckets(ctx *pulumi.Context, args *GetSpacesBucketsArgs, opts ...pulumi.InvokeOption) (*GetSpacesBucketsResult, error) {
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
