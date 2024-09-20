// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-digitalocean/sdk/v4/go/digitalocean/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Get information on a DigitalOcean App.
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
//			example, err := digitalocean.LookupApp(ctx, &digitalocean.LookupAppArgs{
//				AppId: "e665d18d-7b56-44a9-92ce-31979174d544",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("defaultIngress", example.DefaultIngress)
//			return nil
//		})
//	}
//
// ```
func LookupApp(ctx *pulumi.Context, args *LookupAppArgs, opts ...pulumi.InvokeOption) (*LookupAppResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAppResult
	err := ctx.Invoke("digitalocean:index/getApp:getApp", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getApp.
type LookupAppArgs struct {
	// The ID of the app to retrieve information about.
	AppId string `pulumi:"appId"`
	// A list of dedicated egress IP addresses associated with the app.
	DedicatedIps []GetAppDedicatedIp `pulumi:"dedicatedIps"`
}

// A collection of values returned by getApp.
type LookupAppResult struct {
	// The ID the app's currently active deployment.
	ActiveDeploymentId string `pulumi:"activeDeploymentId"`
	AppId              string `pulumi:"appId"`
	// The date and time of when the app was created.
	CreatedAt string `pulumi:"createdAt"`
	// A list of dedicated egress IP addresses associated with the app.
	DedicatedIps []GetAppDedicatedIp `pulumi:"dedicatedIps"`
	// The default URL to access the app.
	DefaultIngress string `pulumi:"defaultIngress"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The live domain of the app.
	LiveDomain string `pulumi:"liveDomain"`
	// The live URL of the app.
	LiveUrl string `pulumi:"liveUrl"`
	// The ID of the project that the app is assigned to.
	ProjectId string `pulumi:"projectId"`
	// A DigitalOcean App spec describing the app.
	Specs []GetAppSpec `pulumi:"specs"`
	// The date and time of when the app was last updated.
	UpdatedAt string `pulumi:"updatedAt"`
	// The uniform resource identifier for the app.
	Urn string `pulumi:"urn"`
}

func LookupAppOutput(ctx *pulumi.Context, args LookupAppOutputArgs, opts ...pulumi.InvokeOption) LookupAppResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupAppResultOutput, error) {
			args := v.(LookupAppArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv LookupAppResult
			secret, err := ctx.InvokePackageRaw("digitalocean:index/getApp:getApp", args, &rv, "", opts...)
			if err != nil {
				return LookupAppResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(LookupAppResultOutput)
			if secret {
				return pulumi.ToSecret(output).(LookupAppResultOutput), nil
			}
			return output, nil
		}).(LookupAppResultOutput)
}

// A collection of arguments for invoking getApp.
type LookupAppOutputArgs struct {
	// The ID of the app to retrieve information about.
	AppId pulumi.StringInput `pulumi:"appId"`
	// A list of dedicated egress IP addresses associated with the app.
	DedicatedIps GetAppDedicatedIpArrayInput `pulumi:"dedicatedIps"`
}

func (LookupAppOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAppArgs)(nil)).Elem()
}

// A collection of values returned by getApp.
type LookupAppResultOutput struct{ *pulumi.OutputState }

func (LookupAppResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAppResult)(nil)).Elem()
}

func (o LookupAppResultOutput) ToLookupAppResultOutput() LookupAppResultOutput {
	return o
}

func (o LookupAppResultOutput) ToLookupAppResultOutputWithContext(ctx context.Context) LookupAppResultOutput {
	return o
}

// The ID the app's currently active deployment.
func (o LookupAppResultOutput) ActiveDeploymentId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppResult) string { return v.ActiveDeploymentId }).(pulumi.StringOutput)
}

func (o LookupAppResultOutput) AppId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppResult) string { return v.AppId }).(pulumi.StringOutput)
}

// The date and time of when the app was created.
func (o LookupAppResultOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppResult) string { return v.CreatedAt }).(pulumi.StringOutput)
}

// A list of dedicated egress IP addresses associated with the app.
func (o LookupAppResultOutput) DedicatedIps() GetAppDedicatedIpArrayOutput {
	return o.ApplyT(func(v LookupAppResult) []GetAppDedicatedIp { return v.DedicatedIps }).(GetAppDedicatedIpArrayOutput)
}

// The default URL to access the app.
func (o LookupAppResultOutput) DefaultIngress() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppResult) string { return v.DefaultIngress }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupAppResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppResult) string { return v.Id }).(pulumi.StringOutput)
}

// The live domain of the app.
func (o LookupAppResultOutput) LiveDomain() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppResult) string { return v.LiveDomain }).(pulumi.StringOutput)
}

// The live URL of the app.
func (o LookupAppResultOutput) LiveUrl() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppResult) string { return v.LiveUrl }).(pulumi.StringOutput)
}

// The ID of the project that the app is assigned to.
func (o LookupAppResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// A DigitalOcean App spec describing the app.
func (o LookupAppResultOutput) Specs() GetAppSpecArrayOutput {
	return o.ApplyT(func(v LookupAppResult) []GetAppSpec { return v.Specs }).(GetAppSpecArrayOutput)
}

// The date and time of when the app was last updated.
func (o LookupAppResultOutput) UpdatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppResult) string { return v.UpdatedAt }).(pulumi.StringOutput)
}

// The uniform resource identifier for the app.
func (o LookupAppResultOutput) Urn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppResult) string { return v.Urn }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAppResultOutput{})
}
