// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-digitalocean/sdk/v4/go/digitalocean/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Get information on SSH Keys for use in other resources.
//
// This data source is useful if the SSH Keys in question are not managed by the provider or you need to
// utilize any of the SSH Keys' data.
//
// Note: You can use the `SshKey` data source to obtain metadata
// about a single SSH Key if you already know the unique `name` to retrieve.
//
// ## Example Usage
//
// For example, to find all SSH keys:
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
//			_, err := digitalocean.GetSshKeys(ctx, &digitalocean.GetSshKeysArgs{
//				Sorts: []digitalocean.GetSshKeysSort{
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
//
// Or to find ones matching specific values:
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
//			_, err := digitalocean.GetSshKeys(ctx, &digitalocean.GetSshKeysArgs{
//				Filters: []digitalocean.GetSshKeysFilter{
//					{
//						Key: "name",
//						Values: []string{
//							"laptop",
//							"desktop",
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
func GetSshKeys(ctx *pulumi.Context, args *GetSshKeysArgs, opts ...pulumi.InvokeOption) (*GetSshKeysResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSshKeysResult
	err := ctx.Invoke("digitalocean:index/getSshKeys:getSshKeys", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSshKeys.
type GetSshKeysArgs struct {
	// Filter the results.
	// The `filter` block is documented below.
	Filters []GetSshKeysFilter `pulumi:"filters"`
	// Sort the results.
	// The `sort` block is documented below.
	Sorts []GetSshKeysSort `pulumi:"sorts"`
}

// A collection of values returned by getSshKeys.
type GetSshKeysResult struct {
	Filters []GetSshKeysFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id    string           `pulumi:"id"`
	Sorts []GetSshKeysSort `pulumi:"sorts"`
	// A list of SSH Keys. Each SSH Key has the following attributes:
	SshKeys []GetSshKeysSshKey `pulumi:"sshKeys"`
}

func GetSshKeysOutput(ctx *pulumi.Context, args GetSshKeysOutputArgs, opts ...pulumi.InvokeOption) GetSshKeysResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetSshKeysResultOutput, error) {
			args := v.(GetSshKeysArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv GetSshKeysResult
			secret, err := ctx.InvokePackageRaw("digitalocean:index/getSshKeys:getSshKeys", args, &rv, "", opts...)
			if err != nil {
				return GetSshKeysResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(GetSshKeysResultOutput)
			if secret {
				return pulumi.ToSecret(output).(GetSshKeysResultOutput), nil
			}
			return output, nil
		}).(GetSshKeysResultOutput)
}

// A collection of arguments for invoking getSshKeys.
type GetSshKeysOutputArgs struct {
	// Filter the results.
	// The `filter` block is documented below.
	Filters GetSshKeysFilterArrayInput `pulumi:"filters"`
	// Sort the results.
	// The `sort` block is documented below.
	Sorts GetSshKeysSortArrayInput `pulumi:"sorts"`
}

func (GetSshKeysOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSshKeysArgs)(nil)).Elem()
}

// A collection of values returned by getSshKeys.
type GetSshKeysResultOutput struct{ *pulumi.OutputState }

func (GetSshKeysResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSshKeysResult)(nil)).Elem()
}

func (o GetSshKeysResultOutput) ToGetSshKeysResultOutput() GetSshKeysResultOutput {
	return o
}

func (o GetSshKeysResultOutput) ToGetSshKeysResultOutputWithContext(ctx context.Context) GetSshKeysResultOutput {
	return o
}

func (o GetSshKeysResultOutput) Filters() GetSshKeysFilterArrayOutput {
	return o.ApplyT(func(v GetSshKeysResult) []GetSshKeysFilter { return v.Filters }).(GetSshKeysFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetSshKeysResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSshKeysResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetSshKeysResultOutput) Sorts() GetSshKeysSortArrayOutput {
	return o.ApplyT(func(v GetSshKeysResult) []GetSshKeysSort { return v.Sorts }).(GetSshKeysSortArrayOutput)
}

// A list of SSH Keys. Each SSH Key has the following attributes:
func (o GetSshKeysResultOutput) SshKeys() GetSshKeysSshKeyArrayOutput {
	return o.ApplyT(func(v GetSshKeysResult) []GetSshKeysSshKey { return v.SshKeys }).(GetSshKeysSshKeyArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSshKeysResultOutput{})
}
