// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-digitalocean/sdk/v4/go/digitalocean/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// > VPC peering is currently in alpha. If you are not a member of the alpha group for this feature, you will not be able to use it until it has been more widely released. Please follow the official [DigitalOcean changelog](https://docs.digitalocean.com/release-notes/) for updates.
//
// Provides a DigitalOcean VPC Peering resource.
//
// VPC Peerings are used to connect two VPC networks allowing resources in each
// VPC to communicate with each other privately.
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
//			_, err := digitalocean.NewVpcPeering(ctx, "example", &digitalocean.VpcPeeringArgs{
//				Name: pulumi.String("example-peering"),
//				VpcIds: pulumi.StringArray{
//					vpc1.Id,
//					vpc2.Id,
//				},
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
// ### Resource Assignment
//
// You can use the VPC Peering resource to allow communication between resources
// in different VPCs. For example:
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
//			vpc1, err := digitalocean.NewVpc(ctx, "vpc1", &digitalocean.VpcArgs{
//				Name:   pulumi.String("vpc1"),
//				Region: pulumi.String("nyc3"),
//			})
//			if err != nil {
//				return err
//			}
//			vpc2, err := digitalocean.NewVpc(ctx, "vpc2", &digitalocean.VpcArgs{
//				Name:   pulumi.String("vpc2"),
//				Region: pulumi.String("nyc3"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = digitalocean.NewVpcPeering(ctx, "example", &digitalocean.VpcPeeringArgs{
//				Name: pulumi.String("example-peering"),
//				VpcIds: pulumi.StringArray{
//					vpc1.ID(),
//					vpc2.ID(),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = digitalocean.NewDroplet(ctx, "example1", &digitalocean.DropletArgs{
//				Name:    pulumi.String("example1"),
//				Size:    pulumi.String(digitalocean.DropletSlugDropletS1VCPU1GB),
//				Image:   pulumi.String("ubuntu-18-04-x64"),
//				Region:  pulumi.String(digitalocean.RegionNYC3),
//				VpcUuid: vpc1.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = digitalocean.NewDroplet(ctx, "example2", &digitalocean.DropletArgs{
//				Name:    pulumi.String("example2"),
//				Size:    pulumi.String(digitalocean.DropletSlugDropletS1VCPU1GB),
//				Image:   pulumi.String("ubuntu-18-04-x64"),
//				Region:  pulumi.String(digitalocean.RegionNYC3),
//				VpcUuid: vpc2.ID(),
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
// ## Import
//
// A VPC Peering can be imported using its `id`, e.g.
//
// ```sh
// $ pulumi import digitalocean:index/vpcPeering:VpcPeering example 771ad360-c017-4b4e-a34e-73934f5f0190
// ```
type VpcPeering struct {
	pulumi.CustomResourceState

	// The date and time of when the VPC Peering was created.
	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// A name for the VPC Peering. Must be unique and contain alphanumeric characters, dashes, and periods only.
	Name pulumi.StringOutput `pulumi:"name"`
	// The status of the VPC Peering.
	Status pulumi.StringOutput `pulumi:"status"`
	// A set of two VPC IDs to be peered.
	VpcIds pulumi.StringArrayOutput `pulumi:"vpcIds"`
}

// NewVpcPeering registers a new resource with the given unique name, arguments, and options.
func NewVpcPeering(ctx *pulumi.Context,
	name string, args *VpcPeeringArgs, opts ...pulumi.ResourceOption) (*VpcPeering, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.VpcIds == nil {
		return nil, errors.New("invalid value for required argument 'VpcIds'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource VpcPeering
	err := ctx.RegisterResource("digitalocean:index/vpcPeering:VpcPeering", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVpcPeering gets an existing VpcPeering resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVpcPeering(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *VpcPeeringState, opts ...pulumi.ResourceOption) (*VpcPeering, error) {
	var resource VpcPeering
	err := ctx.ReadResource("digitalocean:index/vpcPeering:VpcPeering", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering VpcPeering resources.
type vpcPeeringState struct {
	// The date and time of when the VPC Peering was created.
	CreatedAt *string `pulumi:"createdAt"`
	// A name for the VPC Peering. Must be unique and contain alphanumeric characters, dashes, and periods only.
	Name *string `pulumi:"name"`
	// The status of the VPC Peering.
	Status *string `pulumi:"status"`
	// A set of two VPC IDs to be peered.
	VpcIds []string `pulumi:"vpcIds"`
}

type VpcPeeringState struct {
	// The date and time of when the VPC Peering was created.
	CreatedAt pulumi.StringPtrInput
	// A name for the VPC Peering. Must be unique and contain alphanumeric characters, dashes, and periods only.
	Name pulumi.StringPtrInput
	// The status of the VPC Peering.
	Status pulumi.StringPtrInput
	// A set of two VPC IDs to be peered.
	VpcIds pulumi.StringArrayInput
}

func (VpcPeeringState) ElementType() reflect.Type {
	return reflect.TypeOf((*vpcPeeringState)(nil)).Elem()
}

type vpcPeeringArgs struct {
	// A name for the VPC Peering. Must be unique and contain alphanumeric characters, dashes, and periods only.
	Name *string `pulumi:"name"`
	// A set of two VPC IDs to be peered.
	VpcIds []string `pulumi:"vpcIds"`
}

// The set of arguments for constructing a VpcPeering resource.
type VpcPeeringArgs struct {
	// A name for the VPC Peering. Must be unique and contain alphanumeric characters, dashes, and periods only.
	Name pulumi.StringPtrInput
	// A set of two VPC IDs to be peered.
	VpcIds pulumi.StringArrayInput
}

func (VpcPeeringArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*vpcPeeringArgs)(nil)).Elem()
}

type VpcPeeringInput interface {
	pulumi.Input

	ToVpcPeeringOutput() VpcPeeringOutput
	ToVpcPeeringOutputWithContext(ctx context.Context) VpcPeeringOutput
}

func (*VpcPeering) ElementType() reflect.Type {
	return reflect.TypeOf((**VpcPeering)(nil)).Elem()
}

func (i *VpcPeering) ToVpcPeeringOutput() VpcPeeringOutput {
	return i.ToVpcPeeringOutputWithContext(context.Background())
}

func (i *VpcPeering) ToVpcPeeringOutputWithContext(ctx context.Context) VpcPeeringOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VpcPeeringOutput)
}

// VpcPeeringArrayInput is an input type that accepts VpcPeeringArray and VpcPeeringArrayOutput values.
// You can construct a concrete instance of `VpcPeeringArrayInput` via:
//
//	VpcPeeringArray{ VpcPeeringArgs{...} }
type VpcPeeringArrayInput interface {
	pulumi.Input

	ToVpcPeeringArrayOutput() VpcPeeringArrayOutput
	ToVpcPeeringArrayOutputWithContext(context.Context) VpcPeeringArrayOutput
}

type VpcPeeringArray []VpcPeeringInput

func (VpcPeeringArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VpcPeering)(nil)).Elem()
}

func (i VpcPeeringArray) ToVpcPeeringArrayOutput() VpcPeeringArrayOutput {
	return i.ToVpcPeeringArrayOutputWithContext(context.Background())
}

func (i VpcPeeringArray) ToVpcPeeringArrayOutputWithContext(ctx context.Context) VpcPeeringArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VpcPeeringArrayOutput)
}

// VpcPeeringMapInput is an input type that accepts VpcPeeringMap and VpcPeeringMapOutput values.
// You can construct a concrete instance of `VpcPeeringMapInput` via:
//
//	VpcPeeringMap{ "key": VpcPeeringArgs{...} }
type VpcPeeringMapInput interface {
	pulumi.Input

	ToVpcPeeringMapOutput() VpcPeeringMapOutput
	ToVpcPeeringMapOutputWithContext(context.Context) VpcPeeringMapOutput
}

type VpcPeeringMap map[string]VpcPeeringInput

func (VpcPeeringMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VpcPeering)(nil)).Elem()
}

func (i VpcPeeringMap) ToVpcPeeringMapOutput() VpcPeeringMapOutput {
	return i.ToVpcPeeringMapOutputWithContext(context.Background())
}

func (i VpcPeeringMap) ToVpcPeeringMapOutputWithContext(ctx context.Context) VpcPeeringMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VpcPeeringMapOutput)
}

type VpcPeeringOutput struct{ *pulumi.OutputState }

func (VpcPeeringOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**VpcPeering)(nil)).Elem()
}

func (o VpcPeeringOutput) ToVpcPeeringOutput() VpcPeeringOutput {
	return o
}

func (o VpcPeeringOutput) ToVpcPeeringOutputWithContext(ctx context.Context) VpcPeeringOutput {
	return o
}

// The date and time of when the VPC Peering was created.
func (o VpcPeeringOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *VpcPeering) pulumi.StringOutput { return v.CreatedAt }).(pulumi.StringOutput)
}

// A name for the VPC Peering. Must be unique and contain alphanumeric characters, dashes, and periods only.
func (o VpcPeeringOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *VpcPeering) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The status of the VPC Peering.
func (o VpcPeeringOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *VpcPeering) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// A set of two VPC IDs to be peered.
func (o VpcPeeringOutput) VpcIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *VpcPeering) pulumi.StringArrayOutput { return v.VpcIds }).(pulumi.StringArrayOutput)
}

type VpcPeeringArrayOutput struct{ *pulumi.OutputState }

func (VpcPeeringArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VpcPeering)(nil)).Elem()
}

func (o VpcPeeringArrayOutput) ToVpcPeeringArrayOutput() VpcPeeringArrayOutput {
	return o
}

func (o VpcPeeringArrayOutput) ToVpcPeeringArrayOutputWithContext(ctx context.Context) VpcPeeringArrayOutput {
	return o
}

func (o VpcPeeringArrayOutput) Index(i pulumi.IntInput) VpcPeeringOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *VpcPeering {
		return vs[0].([]*VpcPeering)[vs[1].(int)]
	}).(VpcPeeringOutput)
}

type VpcPeeringMapOutput struct{ *pulumi.OutputState }

func (VpcPeeringMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VpcPeering)(nil)).Elem()
}

func (o VpcPeeringMapOutput) ToVpcPeeringMapOutput() VpcPeeringMapOutput {
	return o
}

func (o VpcPeeringMapOutput) ToVpcPeeringMapOutputWithContext(ctx context.Context) VpcPeeringMapOutput {
	return o
}

func (o VpcPeeringMapOutput) MapIndex(k pulumi.StringInput) VpcPeeringOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *VpcPeering {
		return vs[0].(map[string]*VpcPeering)[vs[1].(string)]
	}).(VpcPeeringOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*VpcPeeringInput)(nil)).Elem(), &VpcPeering{})
	pulumi.RegisterInputType(reflect.TypeOf((*VpcPeeringArrayInput)(nil)).Elem(), VpcPeeringArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*VpcPeeringMapInput)(nil)).Elem(), VpcPeeringMap{})
	pulumi.RegisterOutputType(VpcPeeringOutput{})
	pulumi.RegisterOutputType(VpcPeeringArrayOutput{})
	pulumi.RegisterOutputType(VpcPeeringMapOutput{})
}
