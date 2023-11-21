// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-digitalocean/sdk/v4/go/digitalocean/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides a DigitalOcean reserved IP to represent a publicly-accessible static IP addresses that can be mapped to one of your Droplets.
//
// > **NOTE:** Reserved IPs can be assigned to a Droplet either directly on the `ReservedIp` resource by setting a `dropletId` or using the `ReservedIpAssignment` resource, but the two cannot be used together.
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
//			_, err = digitalocean.NewReservedIp(ctx, "exampleReservedIp", &digitalocean.ReservedIpArgs{
//				DropletId: exampleDroplet.ID(),
//				Region:    exampleDroplet.Region,
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
// Reserved IPs can be imported using the `ip`, e.g.
//
// ```sh
//
//	$ pulumi import digitalocean:index/reservedIp:ReservedIp myip 192.168.0.1
//
// ```
type ReservedIp struct {
	pulumi.CustomResourceState

	// The ID of Droplet that the reserved IP will be assigned to.
	DropletId pulumi.IntPtrOutput `pulumi:"dropletId"`
	// The IP Address of the resource
	IpAddress pulumi.StringOutput `pulumi:"ipAddress"`
	// The region that the reserved IP is reserved to.
	Region pulumi.StringOutput `pulumi:"region"`
	// The uniform resource name of the reserved ip
	ReservedIpUrn pulumi.StringOutput `pulumi:"reservedIpUrn"`
}

// NewReservedIp registers a new resource with the given unique name, arguments, and options.
func NewReservedIp(ctx *pulumi.Context,
	name string, args *ReservedIpArgs, opts ...pulumi.ResourceOption) (*ReservedIp, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Region == nil {
		return nil, errors.New("invalid value for required argument 'Region'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ReservedIp
	err := ctx.RegisterResource("digitalocean:index/reservedIp:ReservedIp", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetReservedIp gets an existing ReservedIp resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetReservedIp(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ReservedIpState, opts ...pulumi.ResourceOption) (*ReservedIp, error) {
	var resource ReservedIp
	err := ctx.ReadResource("digitalocean:index/reservedIp:ReservedIp", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ReservedIp resources.
type reservedIpState struct {
	// The ID of Droplet that the reserved IP will be assigned to.
	DropletId *int `pulumi:"dropletId"`
	// The IP Address of the resource
	IpAddress *string `pulumi:"ipAddress"`
	// The region that the reserved IP is reserved to.
	Region *string `pulumi:"region"`
	// The uniform resource name of the reserved ip
	ReservedIpUrn *string `pulumi:"reservedIpUrn"`
}

type ReservedIpState struct {
	// The ID of Droplet that the reserved IP will be assigned to.
	DropletId pulumi.IntPtrInput
	// The IP Address of the resource
	IpAddress pulumi.StringPtrInput
	// The region that the reserved IP is reserved to.
	Region pulumi.StringPtrInput
	// The uniform resource name of the reserved ip
	ReservedIpUrn pulumi.StringPtrInput
}

func (ReservedIpState) ElementType() reflect.Type {
	return reflect.TypeOf((*reservedIpState)(nil)).Elem()
}

type reservedIpArgs struct {
	// The ID of Droplet that the reserved IP will be assigned to.
	DropletId *int `pulumi:"dropletId"`
	// The IP Address of the resource
	IpAddress *string `pulumi:"ipAddress"`
	// The region that the reserved IP is reserved to.
	Region string `pulumi:"region"`
}

// The set of arguments for constructing a ReservedIp resource.
type ReservedIpArgs struct {
	// The ID of Droplet that the reserved IP will be assigned to.
	DropletId pulumi.IntPtrInput
	// The IP Address of the resource
	IpAddress pulumi.StringPtrInput
	// The region that the reserved IP is reserved to.
	Region pulumi.StringInput
}

func (ReservedIpArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*reservedIpArgs)(nil)).Elem()
}

type ReservedIpInput interface {
	pulumi.Input

	ToReservedIpOutput() ReservedIpOutput
	ToReservedIpOutputWithContext(ctx context.Context) ReservedIpOutput
}

func (*ReservedIp) ElementType() reflect.Type {
	return reflect.TypeOf((**ReservedIp)(nil)).Elem()
}

func (i *ReservedIp) ToReservedIpOutput() ReservedIpOutput {
	return i.ToReservedIpOutputWithContext(context.Background())
}

func (i *ReservedIp) ToReservedIpOutputWithContext(ctx context.Context) ReservedIpOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ReservedIpOutput)
}

func (i *ReservedIp) ToOutput(ctx context.Context) pulumix.Output[*ReservedIp] {
	return pulumix.Output[*ReservedIp]{
		OutputState: i.ToReservedIpOutputWithContext(ctx).OutputState,
	}
}

// ReservedIpArrayInput is an input type that accepts ReservedIpArray and ReservedIpArrayOutput values.
// You can construct a concrete instance of `ReservedIpArrayInput` via:
//
//	ReservedIpArray{ ReservedIpArgs{...} }
type ReservedIpArrayInput interface {
	pulumi.Input

	ToReservedIpArrayOutput() ReservedIpArrayOutput
	ToReservedIpArrayOutputWithContext(context.Context) ReservedIpArrayOutput
}

type ReservedIpArray []ReservedIpInput

func (ReservedIpArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ReservedIp)(nil)).Elem()
}

func (i ReservedIpArray) ToReservedIpArrayOutput() ReservedIpArrayOutput {
	return i.ToReservedIpArrayOutputWithContext(context.Background())
}

func (i ReservedIpArray) ToReservedIpArrayOutputWithContext(ctx context.Context) ReservedIpArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ReservedIpArrayOutput)
}

func (i ReservedIpArray) ToOutput(ctx context.Context) pulumix.Output[[]*ReservedIp] {
	return pulumix.Output[[]*ReservedIp]{
		OutputState: i.ToReservedIpArrayOutputWithContext(ctx).OutputState,
	}
}

// ReservedIpMapInput is an input type that accepts ReservedIpMap and ReservedIpMapOutput values.
// You can construct a concrete instance of `ReservedIpMapInput` via:
//
//	ReservedIpMap{ "key": ReservedIpArgs{...} }
type ReservedIpMapInput interface {
	pulumi.Input

	ToReservedIpMapOutput() ReservedIpMapOutput
	ToReservedIpMapOutputWithContext(context.Context) ReservedIpMapOutput
}

type ReservedIpMap map[string]ReservedIpInput

func (ReservedIpMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ReservedIp)(nil)).Elem()
}

func (i ReservedIpMap) ToReservedIpMapOutput() ReservedIpMapOutput {
	return i.ToReservedIpMapOutputWithContext(context.Background())
}

func (i ReservedIpMap) ToReservedIpMapOutputWithContext(ctx context.Context) ReservedIpMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ReservedIpMapOutput)
}

func (i ReservedIpMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*ReservedIp] {
	return pulumix.Output[map[string]*ReservedIp]{
		OutputState: i.ToReservedIpMapOutputWithContext(ctx).OutputState,
	}
}

type ReservedIpOutput struct{ *pulumi.OutputState }

func (ReservedIpOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ReservedIp)(nil)).Elem()
}

func (o ReservedIpOutput) ToReservedIpOutput() ReservedIpOutput {
	return o
}

func (o ReservedIpOutput) ToReservedIpOutputWithContext(ctx context.Context) ReservedIpOutput {
	return o
}

func (o ReservedIpOutput) ToOutput(ctx context.Context) pulumix.Output[*ReservedIp] {
	return pulumix.Output[*ReservedIp]{
		OutputState: o.OutputState,
	}
}

// The ID of Droplet that the reserved IP will be assigned to.
func (o ReservedIpOutput) DropletId() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *ReservedIp) pulumi.IntPtrOutput { return v.DropletId }).(pulumi.IntPtrOutput)
}

// The IP Address of the resource
func (o ReservedIpOutput) IpAddress() pulumi.StringOutput {
	return o.ApplyT(func(v *ReservedIp) pulumi.StringOutput { return v.IpAddress }).(pulumi.StringOutput)
}

// The region that the reserved IP is reserved to.
func (o ReservedIpOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v *ReservedIp) pulumi.StringOutput { return v.Region }).(pulumi.StringOutput)
}

// The uniform resource name of the reserved ip
func (o ReservedIpOutput) ReservedIpUrn() pulumi.StringOutput {
	return o.ApplyT(func(v *ReservedIp) pulumi.StringOutput { return v.ReservedIpUrn }).(pulumi.StringOutput)
}

type ReservedIpArrayOutput struct{ *pulumi.OutputState }

func (ReservedIpArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ReservedIp)(nil)).Elem()
}

func (o ReservedIpArrayOutput) ToReservedIpArrayOutput() ReservedIpArrayOutput {
	return o
}

func (o ReservedIpArrayOutput) ToReservedIpArrayOutputWithContext(ctx context.Context) ReservedIpArrayOutput {
	return o
}

func (o ReservedIpArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*ReservedIp] {
	return pulumix.Output[[]*ReservedIp]{
		OutputState: o.OutputState,
	}
}

func (o ReservedIpArrayOutput) Index(i pulumi.IntInput) ReservedIpOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ReservedIp {
		return vs[0].([]*ReservedIp)[vs[1].(int)]
	}).(ReservedIpOutput)
}

type ReservedIpMapOutput struct{ *pulumi.OutputState }

func (ReservedIpMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ReservedIp)(nil)).Elem()
}

func (o ReservedIpMapOutput) ToReservedIpMapOutput() ReservedIpMapOutput {
	return o
}

func (o ReservedIpMapOutput) ToReservedIpMapOutputWithContext(ctx context.Context) ReservedIpMapOutput {
	return o
}

func (o ReservedIpMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*ReservedIp] {
	return pulumix.Output[map[string]*ReservedIp]{
		OutputState: o.OutputState,
	}
}

func (o ReservedIpMapOutput) MapIndex(k pulumi.StringInput) ReservedIpOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ReservedIp {
		return vs[0].(map[string]*ReservedIp)[vs[1].(string)]
	}).(ReservedIpOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ReservedIpInput)(nil)).Elem(), &ReservedIp{})
	pulumi.RegisterInputType(reflect.TypeOf((*ReservedIpArrayInput)(nil)).Elem(), ReservedIpArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ReservedIpMapInput)(nil)).Elem(), ReservedIpMap{})
	pulumi.RegisterOutputType(ReservedIpOutput{})
	pulumi.RegisterOutputType(ReservedIpArrayOutput{})
	pulumi.RegisterOutputType(ReservedIpMapOutput{})
}
