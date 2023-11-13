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

// Provides a resource for assigning an existing DigitalOcean reserved IP to a Droplet. This
// makes it easy to provision reserved IP addresses that are not tied to the lifecycle of your
// Droplet.
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
//			exampleReservedIp, err := digitalocean.NewReservedIp(ctx, "exampleReservedIp", &digitalocean.ReservedIpArgs{
//				Region: pulumi.String("nyc3"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleDroplet, err := digitalocean.NewDroplet(ctx, "exampleDroplet", &digitalocean.DropletArgs{
//				Size:              pulumi.String("s-1vcpu-1gb"),
//				Image:             pulumi.String("ubuntu-22-04-x64"),
//				Region:            pulumi.String("nyc3"),
//				Ipv6:              pulumi.Bool(true),
//				PrivateNetworking: pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = digitalocean.NewReservedIpAssignment(ctx, "exampleReservedIpAssignment", &digitalocean.ReservedIpAssignmentArgs{
//				IpAddress: exampleReservedIp.IpAddress,
//				DropletId: exampleDroplet.ID(),
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
// Reserved IP assignments can be imported using the reserved IP itself and the `id` of the Droplet joined with a comma. For example
//
// ```sh
//
//	$ pulumi import digitalocean:index/reservedIpAssignment:ReservedIpAssignment foobar 192.0.2.1,123456
//
// ```
type ReservedIpAssignment struct {
	pulumi.CustomResourceState

	// The ID of Droplet that the reserved IP will be assigned to.
	DropletId pulumi.IntOutput `pulumi:"dropletId"`
	// The reserved IP to assign to the Droplet.
	IpAddress pulumi.StringOutput `pulumi:"ipAddress"`
}

// NewReservedIpAssignment registers a new resource with the given unique name, arguments, and options.
func NewReservedIpAssignment(ctx *pulumi.Context,
	name string, args *ReservedIpAssignmentArgs, opts ...pulumi.ResourceOption) (*ReservedIpAssignment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DropletId == nil {
		return nil, errors.New("invalid value for required argument 'DropletId'")
	}
	if args.IpAddress == nil {
		return nil, errors.New("invalid value for required argument 'IpAddress'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ReservedIpAssignment
	err := ctx.RegisterResource("digitalocean:index/reservedIpAssignment:ReservedIpAssignment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetReservedIpAssignment gets an existing ReservedIpAssignment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetReservedIpAssignment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ReservedIpAssignmentState, opts ...pulumi.ResourceOption) (*ReservedIpAssignment, error) {
	var resource ReservedIpAssignment
	err := ctx.ReadResource("digitalocean:index/reservedIpAssignment:ReservedIpAssignment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ReservedIpAssignment resources.
type reservedIpAssignmentState struct {
	// The ID of Droplet that the reserved IP will be assigned to.
	DropletId *int `pulumi:"dropletId"`
	// The reserved IP to assign to the Droplet.
	IpAddress *string `pulumi:"ipAddress"`
}

type ReservedIpAssignmentState struct {
	// The ID of Droplet that the reserved IP will be assigned to.
	DropletId pulumi.IntPtrInput
	// The reserved IP to assign to the Droplet.
	IpAddress pulumi.StringPtrInput
}

func (ReservedIpAssignmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*reservedIpAssignmentState)(nil)).Elem()
}

type reservedIpAssignmentArgs struct {
	// The ID of Droplet that the reserved IP will be assigned to.
	DropletId int `pulumi:"dropletId"`
	// The reserved IP to assign to the Droplet.
	IpAddress string `pulumi:"ipAddress"`
}

// The set of arguments for constructing a ReservedIpAssignment resource.
type ReservedIpAssignmentArgs struct {
	// The ID of Droplet that the reserved IP will be assigned to.
	DropletId pulumi.IntInput
	// The reserved IP to assign to the Droplet.
	IpAddress pulumi.StringInput
}

func (ReservedIpAssignmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*reservedIpAssignmentArgs)(nil)).Elem()
}

type ReservedIpAssignmentInput interface {
	pulumi.Input

	ToReservedIpAssignmentOutput() ReservedIpAssignmentOutput
	ToReservedIpAssignmentOutputWithContext(ctx context.Context) ReservedIpAssignmentOutput
}

func (*ReservedIpAssignment) ElementType() reflect.Type {
	return reflect.TypeOf((**ReservedIpAssignment)(nil)).Elem()
}

func (i *ReservedIpAssignment) ToReservedIpAssignmentOutput() ReservedIpAssignmentOutput {
	return i.ToReservedIpAssignmentOutputWithContext(context.Background())
}

func (i *ReservedIpAssignment) ToReservedIpAssignmentOutputWithContext(ctx context.Context) ReservedIpAssignmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ReservedIpAssignmentOutput)
}

// ReservedIpAssignmentArrayInput is an input type that accepts ReservedIpAssignmentArray and ReservedIpAssignmentArrayOutput values.
// You can construct a concrete instance of `ReservedIpAssignmentArrayInput` via:
//
//	ReservedIpAssignmentArray{ ReservedIpAssignmentArgs{...} }
type ReservedIpAssignmentArrayInput interface {
	pulumi.Input

	ToReservedIpAssignmentArrayOutput() ReservedIpAssignmentArrayOutput
	ToReservedIpAssignmentArrayOutputWithContext(context.Context) ReservedIpAssignmentArrayOutput
}

type ReservedIpAssignmentArray []ReservedIpAssignmentInput

func (ReservedIpAssignmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ReservedIpAssignment)(nil)).Elem()
}

func (i ReservedIpAssignmentArray) ToReservedIpAssignmentArrayOutput() ReservedIpAssignmentArrayOutput {
	return i.ToReservedIpAssignmentArrayOutputWithContext(context.Background())
}

func (i ReservedIpAssignmentArray) ToReservedIpAssignmentArrayOutputWithContext(ctx context.Context) ReservedIpAssignmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ReservedIpAssignmentArrayOutput)
}

// ReservedIpAssignmentMapInput is an input type that accepts ReservedIpAssignmentMap and ReservedIpAssignmentMapOutput values.
// You can construct a concrete instance of `ReservedIpAssignmentMapInput` via:
//
//	ReservedIpAssignmentMap{ "key": ReservedIpAssignmentArgs{...} }
type ReservedIpAssignmentMapInput interface {
	pulumi.Input

	ToReservedIpAssignmentMapOutput() ReservedIpAssignmentMapOutput
	ToReservedIpAssignmentMapOutputWithContext(context.Context) ReservedIpAssignmentMapOutput
}

type ReservedIpAssignmentMap map[string]ReservedIpAssignmentInput

func (ReservedIpAssignmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ReservedIpAssignment)(nil)).Elem()
}

func (i ReservedIpAssignmentMap) ToReservedIpAssignmentMapOutput() ReservedIpAssignmentMapOutput {
	return i.ToReservedIpAssignmentMapOutputWithContext(context.Background())
}

func (i ReservedIpAssignmentMap) ToReservedIpAssignmentMapOutputWithContext(ctx context.Context) ReservedIpAssignmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ReservedIpAssignmentMapOutput)
}

type ReservedIpAssignmentOutput struct{ *pulumi.OutputState }

func (ReservedIpAssignmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ReservedIpAssignment)(nil)).Elem()
}

func (o ReservedIpAssignmentOutput) ToReservedIpAssignmentOutput() ReservedIpAssignmentOutput {
	return o
}

func (o ReservedIpAssignmentOutput) ToReservedIpAssignmentOutputWithContext(ctx context.Context) ReservedIpAssignmentOutput {
	return o
}

// The ID of Droplet that the reserved IP will be assigned to.
func (o ReservedIpAssignmentOutput) DropletId() pulumi.IntOutput {
	return o.ApplyT(func(v *ReservedIpAssignment) pulumi.IntOutput { return v.DropletId }).(pulumi.IntOutput)
}

// The reserved IP to assign to the Droplet.
func (o ReservedIpAssignmentOutput) IpAddress() pulumi.StringOutput {
	return o.ApplyT(func(v *ReservedIpAssignment) pulumi.StringOutput { return v.IpAddress }).(pulumi.StringOutput)
}

type ReservedIpAssignmentArrayOutput struct{ *pulumi.OutputState }

func (ReservedIpAssignmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ReservedIpAssignment)(nil)).Elem()
}

func (o ReservedIpAssignmentArrayOutput) ToReservedIpAssignmentArrayOutput() ReservedIpAssignmentArrayOutput {
	return o
}

func (o ReservedIpAssignmentArrayOutput) ToReservedIpAssignmentArrayOutputWithContext(ctx context.Context) ReservedIpAssignmentArrayOutput {
	return o
}

func (o ReservedIpAssignmentArrayOutput) Index(i pulumi.IntInput) ReservedIpAssignmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ReservedIpAssignment {
		return vs[0].([]*ReservedIpAssignment)[vs[1].(int)]
	}).(ReservedIpAssignmentOutput)
}

type ReservedIpAssignmentMapOutput struct{ *pulumi.OutputState }

func (ReservedIpAssignmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ReservedIpAssignment)(nil)).Elem()
}

func (o ReservedIpAssignmentMapOutput) ToReservedIpAssignmentMapOutput() ReservedIpAssignmentMapOutput {
	return o
}

func (o ReservedIpAssignmentMapOutput) ToReservedIpAssignmentMapOutputWithContext(ctx context.Context) ReservedIpAssignmentMapOutput {
	return o
}

func (o ReservedIpAssignmentMapOutput) MapIndex(k pulumi.StringInput) ReservedIpAssignmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ReservedIpAssignment {
		return vs[0].(map[string]*ReservedIpAssignment)[vs[1].(string)]
	}).(ReservedIpAssignmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ReservedIpAssignmentInput)(nil)).Elem(), &ReservedIpAssignment{})
	pulumi.RegisterInputType(reflect.TypeOf((*ReservedIpAssignmentArrayInput)(nil)).Elem(), ReservedIpAssignmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ReservedIpAssignmentMapInput)(nil)).Elem(), ReservedIpAssignmentMap{})
	pulumi.RegisterOutputType(ReservedIpAssignmentOutput{})
	pulumi.RegisterOutputType(ReservedIpAssignmentArrayOutput{})
	pulumi.RegisterOutputType(ReservedIpAssignmentMapOutput{})
}
