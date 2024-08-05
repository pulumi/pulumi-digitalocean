// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-digitalocean/sdk/v4/go/digitalocean/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Get information on a Droplet for use in other resources. This data source provides
// all of the Droplet's properties as configured on your DigitalOcean account. This
// is useful if the Droplet in question is not managed by this provider or you need to
// utilize any of the Droplet's data.
//
// **Note:** This data source returns a single Droplet. When specifying a `tag`, an
// error is triggered if more than one Droplet is found.
//
// ## Example Usage
//
// Get the Droplet by name:
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
//			example, err := digitalocean.LookupDroplet(ctx, &digitalocean.LookupDropletArgs{
//				Name: pulumi.StringRef("web"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("dropletOutput", example.Ipv4Address)
//			return nil
//		})
//	}
//
// ```
//
// Get the Droplet by tag:
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
//			_, err := digitalocean.LookupDroplet(ctx, &digitalocean.LookupDropletArgs{
//				Tag: pulumi.StringRef("web"),
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
// Get the Droplet by ID:
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
//			_, err := digitalocean.LookupDroplet(ctx, &digitalocean.LookupDropletArgs{
//				Id: pulumi.IntRef(exampleDigitaloceanKubernetesCluster.NodePool[0].Nodes[0].DropletId),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupDroplet(ctx *pulumi.Context, args *LookupDropletArgs, opts ...pulumi.InvokeOption) (*LookupDropletResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupDropletResult
	err := ctx.Invoke("digitalocean:index/getDroplet:getDroplet", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDroplet.
type LookupDropletArgs struct {
	// The ID of the Droplet
	Id *int `pulumi:"id"`
	// The name of the Droplet.
	Name *string `pulumi:"name"`
	// A tag applied to the Droplet.
	Tag *string `pulumi:"tag"`
}

// A collection of values returned by getDroplet.
type LookupDropletResult struct {
	// Whether backups are enabled.
	Backups   bool   `pulumi:"backups"`
	CreatedAt string `pulumi:"createdAt"`
	// The size of the Droplets disk in GB.
	Disk int `pulumi:"disk"`
	// The ID of the Droplet.
	Id int `pulumi:"id"`
	// The Droplet image ID or slug.
	Image string `pulumi:"image"`
	// The Droplets public IPv4 address
	Ipv4Address string `pulumi:"ipv4Address"`
	// The Droplets private IPv4 address
	Ipv4AddressPrivate string `pulumi:"ipv4AddressPrivate"`
	// Whether IPv6 is enabled.
	Ipv6 bool `pulumi:"ipv6"`
	// The Droplets public IPv6 address
	Ipv6Address string `pulumi:"ipv6Address"`
	// The Droplets private IPv6 address
	Ipv6AddressPrivate string `pulumi:"ipv6AddressPrivate"`
	// Whether the Droplet is locked.
	Locked bool `pulumi:"locked"`
	// The amount of the Droplets memory in MB.
	Memory int `pulumi:"memory"`
	// Whether monitoring agent is installed.
	Monitoring bool   `pulumi:"monitoring"`
	Name       string `pulumi:"name"`
	// Droplet hourly price.
	PriceHourly float64 `pulumi:"priceHourly"`
	// Droplet monthly price.
	PriceMonthly float64 `pulumi:"priceMonthly"`
	// Whether private networks are enabled.
	PrivateNetworking bool `pulumi:"privateNetworking"`
	// The region the Droplet is running in.
	Region string `pulumi:"region"`
	// The unique slug that identifies the type of Droplet.
	Size string `pulumi:"size"`
	// The status of the Droplet.
	Status string  `pulumi:"status"`
	Tag    *string `pulumi:"tag"`
	// A list of the tags associated to the Droplet.
	Tags []string `pulumi:"tags"`
	// The uniform resource name of the Droplet
	Urn string `pulumi:"urn"`
	// The number of the Droplets virtual CPUs.
	Vcpus int `pulumi:"vcpus"`
	// List of the IDs of each volumes attached to the Droplet.
	VolumeIds []string `pulumi:"volumeIds"`
	// The ID of the VPC where the Droplet is located.
	VpcUuid string `pulumi:"vpcUuid"`
}

func LookupDropletOutput(ctx *pulumi.Context, args LookupDropletOutputArgs, opts ...pulumi.InvokeOption) LookupDropletResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupDropletResult, error) {
			args := v.(LookupDropletArgs)
			r, err := LookupDroplet(ctx, &args, opts...)
			var s LookupDropletResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupDropletResultOutput)
}

// A collection of arguments for invoking getDroplet.
type LookupDropletOutputArgs struct {
	// The ID of the Droplet
	Id pulumi.IntPtrInput `pulumi:"id"`
	// The name of the Droplet.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// A tag applied to the Droplet.
	Tag pulumi.StringPtrInput `pulumi:"tag"`
}

func (LookupDropletOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDropletArgs)(nil)).Elem()
}

// A collection of values returned by getDroplet.
type LookupDropletResultOutput struct{ *pulumi.OutputState }

func (LookupDropletResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDropletResult)(nil)).Elem()
}

func (o LookupDropletResultOutput) ToLookupDropletResultOutput() LookupDropletResultOutput {
	return o
}

func (o LookupDropletResultOutput) ToLookupDropletResultOutputWithContext(ctx context.Context) LookupDropletResultOutput {
	return o
}

// Whether backups are enabled.
func (o LookupDropletResultOutput) Backups() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupDropletResult) bool { return v.Backups }).(pulumi.BoolOutput)
}

func (o LookupDropletResultOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDropletResult) string { return v.CreatedAt }).(pulumi.StringOutput)
}

// The size of the Droplets disk in GB.
func (o LookupDropletResultOutput) Disk() pulumi.IntOutput {
	return o.ApplyT(func(v LookupDropletResult) int { return v.Disk }).(pulumi.IntOutput)
}

// The ID of the Droplet.
func (o LookupDropletResultOutput) Id() pulumi.IntOutput {
	return o.ApplyT(func(v LookupDropletResult) int { return v.Id }).(pulumi.IntOutput)
}

// The Droplet image ID or slug.
func (o LookupDropletResultOutput) Image() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDropletResult) string { return v.Image }).(pulumi.StringOutput)
}

// The Droplets public IPv4 address
func (o LookupDropletResultOutput) Ipv4Address() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDropletResult) string { return v.Ipv4Address }).(pulumi.StringOutput)
}

// The Droplets private IPv4 address
func (o LookupDropletResultOutput) Ipv4AddressPrivate() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDropletResult) string { return v.Ipv4AddressPrivate }).(pulumi.StringOutput)
}

// Whether IPv6 is enabled.
func (o LookupDropletResultOutput) Ipv6() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupDropletResult) bool { return v.Ipv6 }).(pulumi.BoolOutput)
}

// The Droplets public IPv6 address
func (o LookupDropletResultOutput) Ipv6Address() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDropletResult) string { return v.Ipv6Address }).(pulumi.StringOutput)
}

// The Droplets private IPv6 address
func (o LookupDropletResultOutput) Ipv6AddressPrivate() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDropletResult) string { return v.Ipv6AddressPrivate }).(pulumi.StringOutput)
}

// Whether the Droplet is locked.
func (o LookupDropletResultOutput) Locked() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupDropletResult) bool { return v.Locked }).(pulumi.BoolOutput)
}

// The amount of the Droplets memory in MB.
func (o LookupDropletResultOutput) Memory() pulumi.IntOutput {
	return o.ApplyT(func(v LookupDropletResult) int { return v.Memory }).(pulumi.IntOutput)
}

// Whether monitoring agent is installed.
func (o LookupDropletResultOutput) Monitoring() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupDropletResult) bool { return v.Monitoring }).(pulumi.BoolOutput)
}

func (o LookupDropletResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDropletResult) string { return v.Name }).(pulumi.StringOutput)
}

// Droplet hourly price.
func (o LookupDropletResultOutput) PriceHourly() pulumi.Float64Output {
	return o.ApplyT(func(v LookupDropletResult) float64 { return v.PriceHourly }).(pulumi.Float64Output)
}

// Droplet monthly price.
func (o LookupDropletResultOutput) PriceMonthly() pulumi.Float64Output {
	return o.ApplyT(func(v LookupDropletResult) float64 { return v.PriceMonthly }).(pulumi.Float64Output)
}

// Whether private networks are enabled.
func (o LookupDropletResultOutput) PrivateNetworking() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupDropletResult) bool { return v.PrivateNetworking }).(pulumi.BoolOutput)
}

// The region the Droplet is running in.
func (o LookupDropletResultOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDropletResult) string { return v.Region }).(pulumi.StringOutput)
}

// The unique slug that identifies the type of Droplet.
func (o LookupDropletResultOutput) Size() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDropletResult) string { return v.Size }).(pulumi.StringOutput)
}

// The status of the Droplet.
func (o LookupDropletResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDropletResult) string { return v.Status }).(pulumi.StringOutput)
}

func (o LookupDropletResultOutput) Tag() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupDropletResult) *string { return v.Tag }).(pulumi.StringPtrOutput)
}

// A list of the tags associated to the Droplet.
func (o LookupDropletResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupDropletResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

// The uniform resource name of the Droplet
func (o LookupDropletResultOutput) Urn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDropletResult) string { return v.Urn }).(pulumi.StringOutput)
}

// The number of the Droplets virtual CPUs.
func (o LookupDropletResultOutput) Vcpus() pulumi.IntOutput {
	return o.ApplyT(func(v LookupDropletResult) int { return v.Vcpus }).(pulumi.IntOutput)
}

// List of the IDs of each volumes attached to the Droplet.
func (o LookupDropletResultOutput) VolumeIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupDropletResult) []string { return v.VolumeIds }).(pulumi.StringArrayOutput)
}

// The ID of the VPC where the Droplet is located.
func (o LookupDropletResultOutput) VpcUuid() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDropletResult) string { return v.VpcUuid }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupDropletResultOutput{})
}
