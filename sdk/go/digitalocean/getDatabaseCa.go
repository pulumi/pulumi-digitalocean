// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides the CA certificate for a DigitalOcean database.
//
// ## Example Usage
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
// 		ca, err := digitalocean.GetDatabaseCa(ctx, &GetDatabaseCaArgs{
// 			ClusterId: "aaa-bbb-ccc-ddd",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("caOutput", ca.Certificate)
// 		return nil
// 	})
// }
// ```
func GetDatabaseCa(ctx *pulumi.Context, args *GetDatabaseCaArgs, opts ...pulumi.InvokeOption) (*GetDatabaseCaResult, error) {
	var rv GetDatabaseCaResult
	err := ctx.Invoke("digitalocean:index/getDatabaseCa:getDatabaseCa", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDatabaseCa.
type GetDatabaseCaArgs struct {
	// The ID of the source database cluster.
	ClusterId string `pulumi:"clusterId"`
}

// A collection of values returned by getDatabaseCa.
type GetDatabaseCaResult struct {
	// The CA certificate used to secure database connections decoded to a string.
	Certificate string `pulumi:"certificate"`
	ClusterId   string `pulumi:"clusterId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
}

func GetDatabaseCaOutput(ctx *pulumi.Context, args GetDatabaseCaOutputArgs, opts ...pulumi.InvokeOption) GetDatabaseCaResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetDatabaseCaResult, error) {
			args := v.(GetDatabaseCaArgs)
			r, err := GetDatabaseCa(ctx, &args, opts...)
			return *r, err
		}).(GetDatabaseCaResultOutput)
}

// A collection of arguments for invoking getDatabaseCa.
type GetDatabaseCaOutputArgs struct {
	// The ID of the source database cluster.
	ClusterId pulumi.StringInput `pulumi:"clusterId"`
}

func (GetDatabaseCaOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDatabaseCaArgs)(nil)).Elem()
}

// A collection of values returned by getDatabaseCa.
type GetDatabaseCaResultOutput struct{ *pulumi.OutputState }

func (GetDatabaseCaResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDatabaseCaResult)(nil)).Elem()
}

func (o GetDatabaseCaResultOutput) ToGetDatabaseCaResultOutput() GetDatabaseCaResultOutput {
	return o
}

func (o GetDatabaseCaResultOutput) ToGetDatabaseCaResultOutputWithContext(ctx context.Context) GetDatabaseCaResultOutput {
	return o
}

// The CA certificate used to secure database connections decoded to a string.
func (o GetDatabaseCaResultOutput) Certificate() pulumi.StringOutput {
	return o.ApplyT(func(v GetDatabaseCaResult) string { return v.Certificate }).(pulumi.StringOutput)
}

func (o GetDatabaseCaResultOutput) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v GetDatabaseCaResult) string { return v.ClusterId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetDatabaseCaResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDatabaseCaResult) string { return v.Id }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDatabaseCaResultOutput{})
}
