// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-digitalocean/sdk/v4/go/digitalocean/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieve information about all DigitalOcean projects associated with an account, with
// the ability to filter and sort the results. If no filters are specified, all projects
// will be returned.
//
// Note: You can use the `Project` data source to
// obtain metadata about a single project if you already know the `id` to retrieve or the unique
// `name` of the project.
//
// ## Example Usage
//
// Use the `filter` block with a `key` string and `values` list to filter projects.
//
// For example to find all staging environment projects:
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
//			_, err := digitalocean.GetProjects(ctx, &digitalocean.GetProjectsArgs{
//				Filters: []digitalocean.GetProjectsFilter{
//					{
//						Key: "environment",
//						Values: []string{
//							"Staging",
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
//			_, err := digitalocean.GetProjects(ctx, &digitalocean.GetProjectsArgs{
//				Filters: []digitalocean.GetProjectsFilter{
//					{
//						Key: "environment",
//						Values: []string{
//							"Production",
//						},
//					},
//					{
//						Key: "is_default",
//						Values: []string{
//							"false",
//						},
//					},
//				},
//				Sorts: []digitalocean.GetProjectsSort{
//					{
//						Key:       "name",
//						Direction: pulumi.StringRef("asc"),
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
func GetProjects(ctx *pulumi.Context, args *GetProjectsArgs, opts ...pulumi.InvokeOption) (*GetProjectsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetProjectsResult
	err := ctx.Invoke("digitalocean:index/getProjects:getProjects", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getProjects.
type GetProjectsArgs struct {
	// Filter the results.
	// The `filter` block is documented below.
	Filters []GetProjectsFilter `pulumi:"filters"`
	// Sort the results.
	// The `sort` block is documented below.
	Sorts []GetProjectsSort `pulumi:"sorts"`
}

// A collection of values returned by getProjects.
type GetProjectsResult struct {
	Filters []GetProjectsFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A set of projects satisfying any `filter` and `sort` criteria. Each project has
	// the following attributes:
	Projects []GetProjectsProject `pulumi:"projects"`
	Sorts    []GetProjectsSort    `pulumi:"sorts"`
}

func GetProjectsOutput(ctx *pulumi.Context, args GetProjectsOutputArgs, opts ...pulumi.InvokeOption) GetProjectsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetProjectsResultOutput, error) {
			args := v.(GetProjectsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("digitalocean:index/getProjects:getProjects", args, GetProjectsResultOutput{}, options).(GetProjectsResultOutput), nil
		}).(GetProjectsResultOutput)
}

// A collection of arguments for invoking getProjects.
type GetProjectsOutputArgs struct {
	// Filter the results.
	// The `filter` block is documented below.
	Filters GetProjectsFilterArrayInput `pulumi:"filters"`
	// Sort the results.
	// The `sort` block is documented below.
	Sorts GetProjectsSortArrayInput `pulumi:"sorts"`
}

func (GetProjectsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetProjectsArgs)(nil)).Elem()
}

// A collection of values returned by getProjects.
type GetProjectsResultOutput struct{ *pulumi.OutputState }

func (GetProjectsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetProjectsResult)(nil)).Elem()
}

func (o GetProjectsResultOutput) ToGetProjectsResultOutput() GetProjectsResultOutput {
	return o
}

func (o GetProjectsResultOutput) ToGetProjectsResultOutputWithContext(ctx context.Context) GetProjectsResultOutput {
	return o
}

func (o GetProjectsResultOutput) Filters() GetProjectsFilterArrayOutput {
	return o.ApplyT(func(v GetProjectsResult) []GetProjectsFilter { return v.Filters }).(GetProjectsFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetProjectsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetProjectsResult) string { return v.Id }).(pulumi.StringOutput)
}

// A set of projects satisfying any `filter` and `sort` criteria. Each project has
// the following attributes:
func (o GetProjectsResultOutput) Projects() GetProjectsProjectArrayOutput {
	return o.ApplyT(func(v GetProjectsResult) []GetProjectsProject { return v.Projects }).(GetProjectsProjectArrayOutput)
}

func (o GetProjectsResultOutput) Sorts() GetProjectsSortArrayOutput {
	return o.ApplyT(func(v GetProjectsResult) []GetProjectsSort { return v.Sorts }).(GetProjectsSortArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetProjectsResultOutput{})
}
