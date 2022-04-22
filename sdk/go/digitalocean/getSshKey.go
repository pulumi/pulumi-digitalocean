// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Get information on a ssh key. This data source provides the name, public key,
// and fingerprint as configured on your DigitalOcean account. This is useful if
// the ssh key in question is not managed by the provider or you need to utilize any
// of the keys data.
//
// An error is triggered if the provided ssh key name does not exist.
//
// ## Example Usage
//
// Get the ssh key:
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
// 		exampleSshKey, err := digitalocean.LookupSshKey(ctx, &GetSshKeyArgs{
// 			Name: "example",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = digitalocean.NewDroplet(ctx, "exampleDroplet", &digitalocean.DropletArgs{
// 			Image:  pulumi.String("ubuntu-18-04-x64"),
// 			Region: pulumi.String("nyc2"),
// 			Size:   pulumi.String("s-1vcpu-1gb"),
// 			SshKeys: pulumi.StringArray{
// 				pulumi.Int(exampleSshKey.Id),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupSshKey(ctx *pulumi.Context, args *LookupSshKeyArgs, opts ...pulumi.InvokeOption) (*LookupSshKeyResult, error) {
	var rv LookupSshKeyResult
	err := ctx.Invoke("digitalocean:index/getSshKey:getSshKey", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSshKey.
type LookupSshKeyArgs struct {
	// The name of the ssh key.
	Name string `pulumi:"name"`
}

// A collection of values returned by getSshKey.
type LookupSshKeyResult struct {
	Fingerprint string `pulumi:"fingerprint"`
	Id          int    `pulumi:"id"`
	Name        string `pulumi:"name"`
	PublicKey   string `pulumi:"publicKey"`
}

func LookupSshKeyOutput(ctx *pulumi.Context, args LookupSshKeyOutputArgs, opts ...pulumi.InvokeOption) LookupSshKeyResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupSshKeyResult, error) {
			args := v.(LookupSshKeyArgs)
			r, err := LookupSshKey(ctx, &args, opts...)
			var s LookupSshKeyResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupSshKeyResultOutput)
}

// A collection of arguments for invoking getSshKey.
type LookupSshKeyOutputArgs struct {
	// The name of the ssh key.
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupSshKeyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSshKeyArgs)(nil)).Elem()
}

// A collection of values returned by getSshKey.
type LookupSshKeyResultOutput struct{ *pulumi.OutputState }

func (LookupSshKeyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSshKeyResult)(nil)).Elem()
}

func (o LookupSshKeyResultOutput) ToLookupSshKeyResultOutput() LookupSshKeyResultOutput {
	return o
}

func (o LookupSshKeyResultOutput) ToLookupSshKeyResultOutputWithContext(ctx context.Context) LookupSshKeyResultOutput {
	return o
}

func (o LookupSshKeyResultOutput) Fingerprint() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSshKeyResult) string { return v.Fingerprint }).(pulumi.StringOutput)
}

func (o LookupSshKeyResultOutput) Id() pulumi.IntOutput {
	return o.ApplyT(func(v LookupSshKeyResult) int { return v.Id }).(pulumi.IntOutput)
}

func (o LookupSshKeyResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSshKeyResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupSshKeyResultOutput) PublicKey() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSshKeyResult) string { return v.PublicKey }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSshKeyResultOutput{})
}
