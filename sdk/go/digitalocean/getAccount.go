// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-digitalocean/sdk/v4/go/digitalocean/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Get information on your DigitalOcean account.
//
// ## Example Usage
//
// Get the account:
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
//			_, err := digitalocean.GetAccount(ctx, map[string]interface{}{}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetAccount(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetAccountResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetAccountResult
	err := ctx.Invoke("digitalocean:index/getAccount:getAccount", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getAccount.
type GetAccountResult struct {
	// The total number of droplets current user or team may have active at one time.
	DropletLimit int `pulumi:"dropletLimit"`
	// The email address used by the current user to register for DigitalOcean.
	Email string `pulumi:"email"`
	// If true, the user has verified their account via email. False otherwise.
	EmailVerified bool `pulumi:"emailVerified"`
	// The total number of floating IPs the current user or team may have.
	FloatingIpLimit int `pulumi:"floatingIpLimit"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// This value is one of "active", "warning" or "locked".
	Status string `pulumi:"status"`
	// A human-readable message giving more details about the status of the account.
	StatusMessage string `pulumi:"statusMessage"`
	// The unique universal identifier for the current user.
	Uuid string `pulumi:"uuid"`
}

func GetAccountOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetAccountResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetAccountResultOutput, error) {
		options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
		return ctx.InvokeOutput("digitalocean:index/getAccount:getAccount", nil, GetAccountResultOutput{}, options).(GetAccountResultOutput), nil
	}).(GetAccountResultOutput)
}

// A collection of values returned by getAccount.
type GetAccountResultOutput struct{ *pulumi.OutputState }

func (GetAccountResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAccountResult)(nil)).Elem()
}

func (o GetAccountResultOutput) ToGetAccountResultOutput() GetAccountResultOutput {
	return o
}

func (o GetAccountResultOutput) ToGetAccountResultOutputWithContext(ctx context.Context) GetAccountResultOutput {
	return o
}

// The total number of droplets current user or team may have active at one time.
func (o GetAccountResultOutput) DropletLimit() pulumi.IntOutput {
	return o.ApplyT(func(v GetAccountResult) int { return v.DropletLimit }).(pulumi.IntOutput)
}

// The email address used by the current user to register for DigitalOcean.
func (o GetAccountResultOutput) Email() pulumi.StringOutput {
	return o.ApplyT(func(v GetAccountResult) string { return v.Email }).(pulumi.StringOutput)
}

// If true, the user has verified their account via email. False otherwise.
func (o GetAccountResultOutput) EmailVerified() pulumi.BoolOutput {
	return o.ApplyT(func(v GetAccountResult) bool { return v.EmailVerified }).(pulumi.BoolOutput)
}

// The total number of floating IPs the current user or team may have.
func (o GetAccountResultOutput) FloatingIpLimit() pulumi.IntOutput {
	return o.ApplyT(func(v GetAccountResult) int { return v.FloatingIpLimit }).(pulumi.IntOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetAccountResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAccountResult) string { return v.Id }).(pulumi.StringOutput)
}

// This value is one of "active", "warning" or "locked".
func (o GetAccountResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v GetAccountResult) string { return v.Status }).(pulumi.StringOutput)
}

// A human-readable message giving more details about the status of the account.
func (o GetAccountResultOutput) StatusMessage() pulumi.StringOutput {
	return o.ApplyT(func(v GetAccountResult) string { return v.StatusMessage }).(pulumi.StringOutput)
}

// The unique universal identifier for the current user.
func (o GetAccountResultOutput) Uuid() pulumi.StringOutput {
	return o.ApplyT(func(v GetAccountResult) string { return v.Uuid }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAccountResultOutput{})
}
