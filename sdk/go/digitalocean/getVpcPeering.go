// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-digitalocean/sdk/v4/go/digitalocean/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ### VPC Peering By Id
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
//			_, err := digitalocean.LookupVpcPeering(ctx, &digitalocean.LookupVpcPeeringArgs{
//				Id: pulumi.StringRef("example-id"),
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
// Reuse the data about a VPC Peering in other resources:
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
//			example, err := digitalocean.LookupVpcPeering(ctx, &digitalocean.LookupVpcPeeringArgs{
//				Id: pulumi.StringRef("example-id"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = digitalocean.NewDroplet(ctx, "example", &digitalocean.DropletArgs{
//				Name:    pulumi.String("example-01"),
//				Size:    pulumi.String(digitalocean.DropletSlugDropletS1VCPU1GB),
//				Image:   pulumi.String("ubuntu-18-04-x64"),
//				Region:  pulumi.String(digitalocean.RegionNYC3),
//				VpcUuid: pulumi.String(example.VpcIds[0]),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ### VPC Peering By Name
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
//			_, err := digitalocean.LookupVpcPeering(ctx, &digitalocean.LookupVpcPeeringArgs{
//				Name: pulumi.StringRef("example-peering"),
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
// Reuse the data about a VPC Peering in other resources:
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
//			example, err := digitalocean.LookupVpcPeering(ctx, &digitalocean.LookupVpcPeeringArgs{
//				Name: pulumi.StringRef("example-peering"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = digitalocean.NewDroplet(ctx, "example", &digitalocean.DropletArgs{
//				Name:    pulumi.String("example-01"),
//				Size:    pulumi.String(digitalocean.DropletSlugDropletS1VCPU1GB),
//				Image:   pulumi.String("ubuntu-18-04-x64"),
//				Region:  pulumi.String(digitalocean.RegionNYC3),
//				VpcUuid: pulumi.String(example.VpcIds[0]),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupVpcPeering(ctx *pulumi.Context, args *LookupVpcPeeringArgs, opts ...pulumi.InvokeOption) (*LookupVpcPeeringResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupVpcPeeringResult
	err := ctx.Invoke("digitalocean:index/getVpcPeering:getVpcPeering", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getVpcPeering.
type LookupVpcPeeringArgs struct {
	// The unique identifier of an existing VPC Peering.
	Id *string `pulumi:"id"`
	// The name of an existing VPC Peering.
	Name *string `pulumi:"name"`
	// The list of VPC IDs involved in the peering.
	VpcIds []string `pulumi:"vpcIds"`
}

// A collection of values returned by getVpcPeering.
type LookupVpcPeeringResult struct {
	// The date and time of when the VPC Peering was created.
	CreatedAt string `pulumi:"createdAt"`
	// The unique identifier for the VPC Peering.
	Id string `pulumi:"id"`
	// The name of the VPC Peering.
	Name string `pulumi:"name"`
	// The status of the VPC Peering.
	Status string `pulumi:"status"`
	// The list of VPC IDs involved in the peering.
	VpcIds []string `pulumi:"vpcIds"`
}

func LookupVpcPeeringOutput(ctx *pulumi.Context, args LookupVpcPeeringOutputArgs, opts ...pulumi.InvokeOption) LookupVpcPeeringResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupVpcPeeringResult, error) {
			args := v.(LookupVpcPeeringArgs)
			r, err := LookupVpcPeering(ctx, &args, opts...)
			var s LookupVpcPeeringResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupVpcPeeringResultOutput)
}

// A collection of arguments for invoking getVpcPeering.
type LookupVpcPeeringOutputArgs struct {
	// The unique identifier of an existing VPC Peering.
	Id pulumi.StringPtrInput `pulumi:"id"`
	// The name of an existing VPC Peering.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// The list of VPC IDs involved in the peering.
	VpcIds pulumi.StringArrayInput `pulumi:"vpcIds"`
}

func (LookupVpcPeeringOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupVpcPeeringArgs)(nil)).Elem()
}

// A collection of values returned by getVpcPeering.
type LookupVpcPeeringResultOutput struct{ *pulumi.OutputState }

func (LookupVpcPeeringResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupVpcPeeringResult)(nil)).Elem()
}

func (o LookupVpcPeeringResultOutput) ToLookupVpcPeeringResultOutput() LookupVpcPeeringResultOutput {
	return o
}

func (o LookupVpcPeeringResultOutput) ToLookupVpcPeeringResultOutputWithContext(ctx context.Context) LookupVpcPeeringResultOutput {
	return o
}

// The date and time of when the VPC Peering was created.
func (o LookupVpcPeeringResultOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVpcPeeringResult) string { return v.CreatedAt }).(pulumi.StringOutput)
}

// The unique identifier for the VPC Peering.
func (o LookupVpcPeeringResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVpcPeeringResult) string { return v.Id }).(pulumi.StringOutput)
}

// The name of the VPC Peering.
func (o LookupVpcPeeringResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVpcPeeringResult) string { return v.Name }).(pulumi.StringOutput)
}

// The status of the VPC Peering.
func (o LookupVpcPeeringResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVpcPeeringResult) string { return v.Status }).(pulumi.StringOutput)
}

// The list of VPC IDs involved in the peering.
func (o LookupVpcPeeringResultOutput) VpcIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupVpcPeeringResult) []string { return v.VpcIds }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupVpcPeeringResultOutput{})
}