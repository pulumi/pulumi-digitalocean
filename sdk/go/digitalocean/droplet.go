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

// Provides a DigitalOcean Droplet resource. This can be used to create,
// modify, and delete Droplets.
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
//			// Create a new Web Droplet in the nyc2 region
//			_, err := digitalocean.NewDroplet(ctx, "web", &digitalocean.DropletArgs{
//				Image:   pulumi.String("ubuntu-20-04-x64"),
//				Name:    pulumi.String("web-1"),
//				Region:  pulumi.String(digitalocean.RegionNYC2),
//				Size:    pulumi.String(digitalocean.DropletSlugDropletS1VCPU1GB),
//				Backups: pulumi.Bool(true),
//				BackupPolicy: &digitalocean.DropletBackupPolicyArgs{
//					Plan:    pulumi.String("weekly"),
//					Weekday: pulumi.String("TUE"),
//					Hour:    pulumi.Int(8),
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
// ## Import
//
// Droplets can be imported using the Droplet `id`, e.g.
//
// ```sh
// $ pulumi import digitalocean:index/droplet:Droplet mydroplet 100823
// ```
type Droplet struct {
	pulumi.CustomResourceState

	// An object specifying the backup policy for the Droplet. If omitted and `backups` is `true`, the backup plan will default to daily.
	BackupPolicy DropletBackupPolicyPtrOutput `pulumi:"backupPolicy"`
	// Boolean controlling if backups are made. Defaults to
	// false.
	Backups   pulumi.BoolPtrOutput `pulumi:"backups"`
	CreatedAt pulumi.StringOutput  `pulumi:"createdAt"`
	// The size of the instance's disk in GB
	Disk pulumi.IntOutput `pulumi:"disk"`
	// A boolean indicating whether to install the
	// DigitalOcean agent used for providing access to the Droplet web console in
	// the control panel. By default, the agent is installed on new Droplets but
	// installation errors (i.e. OS not supported) are ignored. To prevent it from
	// being installed, set to `false`. To make installation errors fatal, explicitly
	// set it to `true`.
	DropletAgent pulumi.BoolPtrOutput `pulumi:"dropletAgent"`
	// The uniform resource name of the Droplet
	DropletUrn pulumi.StringOutput `pulumi:"dropletUrn"`
	// A boolean indicating whether the droplet
	// should be gracefully shut down before it is deleted.
	//
	// > **NOTE:** If you use `volumeIds` on a Droplet, this provider will assume management over the full set volumes for the instance, and treat additional volumes as a drift. For this reason, `volumeIds` must not be mixed with external `VolumeAttachment` resources for a given instance.
	GracefulShutdown pulumi.BoolPtrOutput `pulumi:"gracefulShutdown"`
	// The Droplet image ID or slug. This could be either image ID or droplet snapshot ID.
	Image pulumi.StringOutput `pulumi:"image"`
	// The IPv4 address
	Ipv4Address pulumi.StringOutput `pulumi:"ipv4Address"`
	// The private networking IPv4 address
	Ipv4AddressPrivate pulumi.StringOutput `pulumi:"ipv4AddressPrivate"`
	// Boolean controlling if IPv6 is enabled. Defaults to false.
	// Once enabled for a Droplet, IPv6 can not be disabled. When enabling IPv6 on
	// an existing Droplet, [additional OS-level configuration](https://docs.digitalocean.com/products/networking/ipv6/how-to/enable/#on-existing-droplets)
	// is required.
	Ipv6 pulumi.BoolPtrOutput `pulumi:"ipv6"`
	// The IPv6 address
	Ipv6Address pulumi.StringOutput `pulumi:"ipv6Address"`
	// Is the Droplet locked
	Locked pulumi.BoolOutput `pulumi:"locked"`
	Memory pulumi.IntOutput  `pulumi:"memory"`
	// Boolean controlling whether monitoring agent is installed.
	// Defaults to false. If set to `true`, you can configure monitor alert policies
	// [monitor alert resource](https://www.terraform.io/providers/digitalocean/digitalocean/latest/docs/resources/monitor_alert)
	Monitoring pulumi.BoolPtrOutput `pulumi:"monitoring"`
	// The Droplet name.
	Name pulumi.StringOutput `pulumi:"name"`
	// Droplet hourly price
	PriceHourly pulumi.Float64Output `pulumi:"priceHourly"`
	// Droplet monthly price
	PriceMonthly pulumi.Float64Output `pulumi:"priceMonthly"`
	// **Deprecated** Boolean controlling if private networking
	// is enabled. This parameter has been deprecated. Use `vpcUuid` instead to specify a VPC network for the Droplet. If no `vpcUuid` is provided, the Droplet will be placed in your account's default VPC for the region.
	//
	// Deprecated: This parameter has been deprecated. Use `vpcUuid` instead to specify a VPC network for the Droplet. If no `vpcUuid` is provided, the Droplet will be placed in your account's default VPC for the region.
	PrivateNetworking pulumi.BoolOutput `pulumi:"privateNetworking"`
	// The region where the Droplet will be created.
	Region pulumi.StringOutput `pulumi:"region"`
	// Boolean controlling whether to increase the disk
	// size when resizing a Droplet. It defaults to `true`. When set to `false`,
	// only the Droplet's RAM and CPU will be resized. **Increasing a Droplet's disk
	// size is a permanent change**. Increasing only RAM and CPU is reversible.
	ResizeDisk pulumi.BoolPtrOutput `pulumi:"resizeDisk"`
	// The unique slug that identifies the type of Droplet. You can find a list of available slugs on [DigitalOcean API documentation](https://docs.digitalocean.com/reference/api/api-reference/#tag/Sizes).
	Size pulumi.StringOutput `pulumi:"size"`
	// A list of SSH key IDs or fingerprints to enable in
	// the format `[12345, 123456]`. To retrieve this info, use the
	// [DigitalOcean API](https://docs.digitalocean.com/reference/api/api-reference/#tag/SSH-Keys)
	// or CLI (`doctl compute ssh-key list`). Once a Droplet is created keys can not
	// be added or removed via this provider. Modifying this field will prompt you
	// to destroy and recreate the Droplet.
	SshKeys pulumi.StringArrayOutput `pulumi:"sshKeys"`
	// The status of the Droplet
	Status pulumi.StringOutput `pulumi:"status"`
	// A list of the tags to be applied to this Droplet.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
	// A string of the desired User Data provided [during Droplet creation](https://docs.digitalocean.com/products/droplets/how-to/provide-user-data/). Changing this forces a new resource to be created.
	UserData pulumi.StringPtrOutput `pulumi:"userData"`
	// The number of the instance's virtual CPUs
	Vcpus pulumi.IntOutput `pulumi:"vcpus"`
	// A list of the IDs of each block storage volume to be attached to the Droplet.
	VolumeIds pulumi.StringArrayOutput `pulumi:"volumeIds"`
	// The ID of the VPC where the Droplet will be located.
	VpcUuid pulumi.StringOutput `pulumi:"vpcUuid"`
}

// NewDroplet registers a new resource with the given unique name, arguments, and options.
func NewDroplet(ctx *pulumi.Context,
	name string, args *DropletArgs, opts ...pulumi.ResourceOption) (*Droplet, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Image == nil {
		return nil, errors.New("invalid value for required argument 'Image'")
	}
	if args.Size == nil {
		return nil, errors.New("invalid value for required argument 'Size'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Droplet
	err := ctx.RegisterResource("digitalocean:index/droplet:Droplet", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDroplet gets an existing Droplet resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDroplet(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DropletState, opts ...pulumi.ResourceOption) (*Droplet, error) {
	var resource Droplet
	err := ctx.ReadResource("digitalocean:index/droplet:Droplet", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Droplet resources.
type dropletState struct {
	// An object specifying the backup policy for the Droplet. If omitted and `backups` is `true`, the backup plan will default to daily.
	BackupPolicy *DropletBackupPolicy `pulumi:"backupPolicy"`
	// Boolean controlling if backups are made. Defaults to
	// false.
	Backups   *bool   `pulumi:"backups"`
	CreatedAt *string `pulumi:"createdAt"`
	// The size of the instance's disk in GB
	Disk *int `pulumi:"disk"`
	// A boolean indicating whether to install the
	// DigitalOcean agent used for providing access to the Droplet web console in
	// the control panel. By default, the agent is installed on new Droplets but
	// installation errors (i.e. OS not supported) are ignored. To prevent it from
	// being installed, set to `false`. To make installation errors fatal, explicitly
	// set it to `true`.
	DropletAgent *bool `pulumi:"dropletAgent"`
	// The uniform resource name of the Droplet
	DropletUrn *string `pulumi:"dropletUrn"`
	// A boolean indicating whether the droplet
	// should be gracefully shut down before it is deleted.
	//
	// > **NOTE:** If you use `volumeIds` on a Droplet, this provider will assume management over the full set volumes for the instance, and treat additional volumes as a drift. For this reason, `volumeIds` must not be mixed with external `VolumeAttachment` resources for a given instance.
	GracefulShutdown *bool `pulumi:"gracefulShutdown"`
	// The Droplet image ID or slug. This could be either image ID or droplet snapshot ID.
	Image *string `pulumi:"image"`
	// The IPv4 address
	Ipv4Address *string `pulumi:"ipv4Address"`
	// The private networking IPv4 address
	Ipv4AddressPrivate *string `pulumi:"ipv4AddressPrivate"`
	// Boolean controlling if IPv6 is enabled. Defaults to false.
	// Once enabled for a Droplet, IPv6 can not be disabled. When enabling IPv6 on
	// an existing Droplet, [additional OS-level configuration](https://docs.digitalocean.com/products/networking/ipv6/how-to/enable/#on-existing-droplets)
	// is required.
	Ipv6 *bool `pulumi:"ipv6"`
	// The IPv6 address
	Ipv6Address *string `pulumi:"ipv6Address"`
	// Is the Droplet locked
	Locked *bool `pulumi:"locked"`
	Memory *int  `pulumi:"memory"`
	// Boolean controlling whether monitoring agent is installed.
	// Defaults to false. If set to `true`, you can configure monitor alert policies
	// [monitor alert resource](https://www.terraform.io/providers/digitalocean/digitalocean/latest/docs/resources/monitor_alert)
	Monitoring *bool `pulumi:"monitoring"`
	// The Droplet name.
	Name *string `pulumi:"name"`
	// Droplet hourly price
	PriceHourly *float64 `pulumi:"priceHourly"`
	// Droplet monthly price
	PriceMonthly *float64 `pulumi:"priceMonthly"`
	// **Deprecated** Boolean controlling if private networking
	// is enabled. This parameter has been deprecated. Use `vpcUuid` instead to specify a VPC network for the Droplet. If no `vpcUuid` is provided, the Droplet will be placed in your account's default VPC for the region.
	//
	// Deprecated: This parameter has been deprecated. Use `vpcUuid` instead to specify a VPC network for the Droplet. If no `vpcUuid` is provided, the Droplet will be placed in your account's default VPC for the region.
	PrivateNetworking *bool `pulumi:"privateNetworking"`
	// The region where the Droplet will be created.
	Region *string `pulumi:"region"`
	// Boolean controlling whether to increase the disk
	// size when resizing a Droplet. It defaults to `true`. When set to `false`,
	// only the Droplet's RAM and CPU will be resized. **Increasing a Droplet's disk
	// size is a permanent change**. Increasing only RAM and CPU is reversible.
	ResizeDisk *bool `pulumi:"resizeDisk"`
	// The unique slug that identifies the type of Droplet. You can find a list of available slugs on [DigitalOcean API documentation](https://docs.digitalocean.com/reference/api/api-reference/#tag/Sizes).
	Size *string `pulumi:"size"`
	// A list of SSH key IDs or fingerprints to enable in
	// the format `[12345, 123456]`. To retrieve this info, use the
	// [DigitalOcean API](https://docs.digitalocean.com/reference/api/api-reference/#tag/SSH-Keys)
	// or CLI (`doctl compute ssh-key list`). Once a Droplet is created keys can not
	// be added or removed via this provider. Modifying this field will prompt you
	// to destroy and recreate the Droplet.
	SshKeys []string `pulumi:"sshKeys"`
	// The status of the Droplet
	Status *string `pulumi:"status"`
	// A list of the tags to be applied to this Droplet.
	Tags []string `pulumi:"tags"`
	// A string of the desired User Data provided [during Droplet creation](https://docs.digitalocean.com/products/droplets/how-to/provide-user-data/). Changing this forces a new resource to be created.
	UserData *string `pulumi:"userData"`
	// The number of the instance's virtual CPUs
	Vcpus *int `pulumi:"vcpus"`
	// A list of the IDs of each block storage volume to be attached to the Droplet.
	VolumeIds []string `pulumi:"volumeIds"`
	// The ID of the VPC where the Droplet will be located.
	VpcUuid *string `pulumi:"vpcUuid"`
}

type DropletState struct {
	// An object specifying the backup policy for the Droplet. If omitted and `backups` is `true`, the backup plan will default to daily.
	BackupPolicy DropletBackupPolicyPtrInput
	// Boolean controlling if backups are made. Defaults to
	// false.
	Backups   pulumi.BoolPtrInput
	CreatedAt pulumi.StringPtrInput
	// The size of the instance's disk in GB
	Disk pulumi.IntPtrInput
	// A boolean indicating whether to install the
	// DigitalOcean agent used for providing access to the Droplet web console in
	// the control panel. By default, the agent is installed on new Droplets but
	// installation errors (i.e. OS not supported) are ignored. To prevent it from
	// being installed, set to `false`. To make installation errors fatal, explicitly
	// set it to `true`.
	DropletAgent pulumi.BoolPtrInput
	// The uniform resource name of the Droplet
	DropletUrn pulumi.StringPtrInput
	// A boolean indicating whether the droplet
	// should be gracefully shut down before it is deleted.
	//
	// > **NOTE:** If you use `volumeIds` on a Droplet, this provider will assume management over the full set volumes for the instance, and treat additional volumes as a drift. For this reason, `volumeIds` must not be mixed with external `VolumeAttachment` resources for a given instance.
	GracefulShutdown pulumi.BoolPtrInput
	// The Droplet image ID or slug. This could be either image ID or droplet snapshot ID.
	Image pulumi.StringPtrInput
	// The IPv4 address
	Ipv4Address pulumi.StringPtrInput
	// The private networking IPv4 address
	Ipv4AddressPrivate pulumi.StringPtrInput
	// Boolean controlling if IPv6 is enabled. Defaults to false.
	// Once enabled for a Droplet, IPv6 can not be disabled. When enabling IPv6 on
	// an existing Droplet, [additional OS-level configuration](https://docs.digitalocean.com/products/networking/ipv6/how-to/enable/#on-existing-droplets)
	// is required.
	Ipv6 pulumi.BoolPtrInput
	// The IPv6 address
	Ipv6Address pulumi.StringPtrInput
	// Is the Droplet locked
	Locked pulumi.BoolPtrInput
	Memory pulumi.IntPtrInput
	// Boolean controlling whether monitoring agent is installed.
	// Defaults to false. If set to `true`, you can configure monitor alert policies
	// [monitor alert resource](https://www.terraform.io/providers/digitalocean/digitalocean/latest/docs/resources/monitor_alert)
	Monitoring pulumi.BoolPtrInput
	// The Droplet name.
	Name pulumi.StringPtrInput
	// Droplet hourly price
	PriceHourly pulumi.Float64PtrInput
	// Droplet monthly price
	PriceMonthly pulumi.Float64PtrInput
	// **Deprecated** Boolean controlling if private networking
	// is enabled. This parameter has been deprecated. Use `vpcUuid` instead to specify a VPC network for the Droplet. If no `vpcUuid` is provided, the Droplet will be placed in your account's default VPC for the region.
	//
	// Deprecated: This parameter has been deprecated. Use `vpcUuid` instead to specify a VPC network for the Droplet. If no `vpcUuid` is provided, the Droplet will be placed in your account's default VPC for the region.
	PrivateNetworking pulumi.BoolPtrInput
	// The region where the Droplet will be created.
	Region pulumi.StringPtrInput
	// Boolean controlling whether to increase the disk
	// size when resizing a Droplet. It defaults to `true`. When set to `false`,
	// only the Droplet's RAM and CPU will be resized. **Increasing a Droplet's disk
	// size is a permanent change**. Increasing only RAM and CPU is reversible.
	ResizeDisk pulumi.BoolPtrInput
	// The unique slug that identifies the type of Droplet. You can find a list of available slugs on [DigitalOcean API documentation](https://docs.digitalocean.com/reference/api/api-reference/#tag/Sizes).
	Size pulumi.StringPtrInput
	// A list of SSH key IDs or fingerprints to enable in
	// the format `[12345, 123456]`. To retrieve this info, use the
	// [DigitalOcean API](https://docs.digitalocean.com/reference/api/api-reference/#tag/SSH-Keys)
	// or CLI (`doctl compute ssh-key list`). Once a Droplet is created keys can not
	// be added or removed via this provider. Modifying this field will prompt you
	// to destroy and recreate the Droplet.
	SshKeys pulumi.StringArrayInput
	// The status of the Droplet
	Status pulumi.StringPtrInput
	// A list of the tags to be applied to this Droplet.
	Tags pulumi.StringArrayInput
	// A string of the desired User Data provided [during Droplet creation](https://docs.digitalocean.com/products/droplets/how-to/provide-user-data/). Changing this forces a new resource to be created.
	UserData pulumi.StringPtrInput
	// The number of the instance's virtual CPUs
	Vcpus pulumi.IntPtrInput
	// A list of the IDs of each block storage volume to be attached to the Droplet.
	VolumeIds pulumi.StringArrayInput
	// The ID of the VPC where the Droplet will be located.
	VpcUuid pulumi.StringPtrInput
}

func (DropletState) ElementType() reflect.Type {
	return reflect.TypeOf((*dropletState)(nil)).Elem()
}

type dropletArgs struct {
	// An object specifying the backup policy for the Droplet. If omitted and `backups` is `true`, the backup plan will default to daily.
	BackupPolicy *DropletBackupPolicy `pulumi:"backupPolicy"`
	// Boolean controlling if backups are made. Defaults to
	// false.
	Backups *bool `pulumi:"backups"`
	// A boolean indicating whether to install the
	// DigitalOcean agent used for providing access to the Droplet web console in
	// the control panel. By default, the agent is installed on new Droplets but
	// installation errors (i.e. OS not supported) are ignored. To prevent it from
	// being installed, set to `false`. To make installation errors fatal, explicitly
	// set it to `true`.
	DropletAgent *bool `pulumi:"dropletAgent"`
	// A boolean indicating whether the droplet
	// should be gracefully shut down before it is deleted.
	//
	// > **NOTE:** If you use `volumeIds` on a Droplet, this provider will assume management over the full set volumes for the instance, and treat additional volumes as a drift. For this reason, `volumeIds` must not be mixed with external `VolumeAttachment` resources for a given instance.
	GracefulShutdown *bool `pulumi:"gracefulShutdown"`
	// The Droplet image ID or slug. This could be either image ID or droplet snapshot ID.
	Image string `pulumi:"image"`
	// Boolean controlling if IPv6 is enabled. Defaults to false.
	// Once enabled for a Droplet, IPv6 can not be disabled. When enabling IPv6 on
	// an existing Droplet, [additional OS-level configuration](https://docs.digitalocean.com/products/networking/ipv6/how-to/enable/#on-existing-droplets)
	// is required.
	Ipv6 *bool `pulumi:"ipv6"`
	// The IPv6 address
	Ipv6Address *string `pulumi:"ipv6Address"`
	// Boolean controlling whether monitoring agent is installed.
	// Defaults to false. If set to `true`, you can configure monitor alert policies
	// [monitor alert resource](https://www.terraform.io/providers/digitalocean/digitalocean/latest/docs/resources/monitor_alert)
	Monitoring *bool `pulumi:"monitoring"`
	// The Droplet name.
	Name *string `pulumi:"name"`
	// **Deprecated** Boolean controlling if private networking
	// is enabled. This parameter has been deprecated. Use `vpcUuid` instead to specify a VPC network for the Droplet. If no `vpcUuid` is provided, the Droplet will be placed in your account's default VPC for the region.
	//
	// Deprecated: This parameter has been deprecated. Use `vpcUuid` instead to specify a VPC network for the Droplet. If no `vpcUuid` is provided, the Droplet will be placed in your account's default VPC for the region.
	PrivateNetworking *bool `pulumi:"privateNetworking"`
	// The region where the Droplet will be created.
	Region *string `pulumi:"region"`
	// Boolean controlling whether to increase the disk
	// size when resizing a Droplet. It defaults to `true`. When set to `false`,
	// only the Droplet's RAM and CPU will be resized. **Increasing a Droplet's disk
	// size is a permanent change**. Increasing only RAM and CPU is reversible.
	ResizeDisk *bool `pulumi:"resizeDisk"`
	// The unique slug that identifies the type of Droplet. You can find a list of available slugs on [DigitalOcean API documentation](https://docs.digitalocean.com/reference/api/api-reference/#tag/Sizes).
	Size string `pulumi:"size"`
	// A list of SSH key IDs or fingerprints to enable in
	// the format `[12345, 123456]`. To retrieve this info, use the
	// [DigitalOcean API](https://docs.digitalocean.com/reference/api/api-reference/#tag/SSH-Keys)
	// or CLI (`doctl compute ssh-key list`). Once a Droplet is created keys can not
	// be added or removed via this provider. Modifying this field will prompt you
	// to destroy and recreate the Droplet.
	SshKeys []string `pulumi:"sshKeys"`
	// A list of the tags to be applied to this Droplet.
	Tags []string `pulumi:"tags"`
	// A string of the desired User Data provided [during Droplet creation](https://docs.digitalocean.com/products/droplets/how-to/provide-user-data/). Changing this forces a new resource to be created.
	UserData *string `pulumi:"userData"`
	// A list of the IDs of each block storage volume to be attached to the Droplet.
	VolumeIds []string `pulumi:"volumeIds"`
	// The ID of the VPC where the Droplet will be located.
	VpcUuid *string `pulumi:"vpcUuid"`
}

// The set of arguments for constructing a Droplet resource.
type DropletArgs struct {
	// An object specifying the backup policy for the Droplet. If omitted and `backups` is `true`, the backup plan will default to daily.
	BackupPolicy DropletBackupPolicyPtrInput
	// Boolean controlling if backups are made. Defaults to
	// false.
	Backups pulumi.BoolPtrInput
	// A boolean indicating whether to install the
	// DigitalOcean agent used for providing access to the Droplet web console in
	// the control panel. By default, the agent is installed on new Droplets but
	// installation errors (i.e. OS not supported) are ignored. To prevent it from
	// being installed, set to `false`. To make installation errors fatal, explicitly
	// set it to `true`.
	DropletAgent pulumi.BoolPtrInput
	// A boolean indicating whether the droplet
	// should be gracefully shut down before it is deleted.
	//
	// > **NOTE:** If you use `volumeIds` on a Droplet, this provider will assume management over the full set volumes for the instance, and treat additional volumes as a drift. For this reason, `volumeIds` must not be mixed with external `VolumeAttachment` resources for a given instance.
	GracefulShutdown pulumi.BoolPtrInput
	// The Droplet image ID or slug. This could be either image ID or droplet snapshot ID.
	Image pulumi.StringInput
	// Boolean controlling if IPv6 is enabled. Defaults to false.
	// Once enabled for a Droplet, IPv6 can not be disabled. When enabling IPv6 on
	// an existing Droplet, [additional OS-level configuration](https://docs.digitalocean.com/products/networking/ipv6/how-to/enable/#on-existing-droplets)
	// is required.
	Ipv6 pulumi.BoolPtrInput
	// The IPv6 address
	Ipv6Address pulumi.StringPtrInput
	// Boolean controlling whether monitoring agent is installed.
	// Defaults to false. If set to `true`, you can configure monitor alert policies
	// [monitor alert resource](https://www.terraform.io/providers/digitalocean/digitalocean/latest/docs/resources/monitor_alert)
	Monitoring pulumi.BoolPtrInput
	// The Droplet name.
	Name pulumi.StringPtrInput
	// **Deprecated** Boolean controlling if private networking
	// is enabled. This parameter has been deprecated. Use `vpcUuid` instead to specify a VPC network for the Droplet. If no `vpcUuid` is provided, the Droplet will be placed in your account's default VPC for the region.
	//
	// Deprecated: This parameter has been deprecated. Use `vpcUuid` instead to specify a VPC network for the Droplet. If no `vpcUuid` is provided, the Droplet will be placed in your account's default VPC for the region.
	PrivateNetworking pulumi.BoolPtrInput
	// The region where the Droplet will be created.
	Region pulumi.StringPtrInput
	// Boolean controlling whether to increase the disk
	// size when resizing a Droplet. It defaults to `true`. When set to `false`,
	// only the Droplet's RAM and CPU will be resized. **Increasing a Droplet's disk
	// size is a permanent change**. Increasing only RAM and CPU is reversible.
	ResizeDisk pulumi.BoolPtrInput
	// The unique slug that identifies the type of Droplet. You can find a list of available slugs on [DigitalOcean API documentation](https://docs.digitalocean.com/reference/api/api-reference/#tag/Sizes).
	Size pulumi.StringInput
	// A list of SSH key IDs or fingerprints to enable in
	// the format `[12345, 123456]`. To retrieve this info, use the
	// [DigitalOcean API](https://docs.digitalocean.com/reference/api/api-reference/#tag/SSH-Keys)
	// or CLI (`doctl compute ssh-key list`). Once a Droplet is created keys can not
	// be added or removed via this provider. Modifying this field will prompt you
	// to destroy and recreate the Droplet.
	SshKeys pulumi.StringArrayInput
	// A list of the tags to be applied to this Droplet.
	Tags pulumi.StringArrayInput
	// A string of the desired User Data provided [during Droplet creation](https://docs.digitalocean.com/products/droplets/how-to/provide-user-data/). Changing this forces a new resource to be created.
	UserData pulumi.StringPtrInput
	// A list of the IDs of each block storage volume to be attached to the Droplet.
	VolumeIds pulumi.StringArrayInput
	// The ID of the VPC where the Droplet will be located.
	VpcUuid pulumi.StringPtrInput
}

func (DropletArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*dropletArgs)(nil)).Elem()
}

type DropletInput interface {
	pulumi.Input

	ToDropletOutput() DropletOutput
	ToDropletOutputWithContext(ctx context.Context) DropletOutput
}

func (*Droplet) ElementType() reflect.Type {
	return reflect.TypeOf((**Droplet)(nil)).Elem()
}

func (i *Droplet) ToDropletOutput() DropletOutput {
	return i.ToDropletOutputWithContext(context.Background())
}

func (i *Droplet) ToDropletOutputWithContext(ctx context.Context) DropletOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DropletOutput)
}

// DropletArrayInput is an input type that accepts DropletArray and DropletArrayOutput values.
// You can construct a concrete instance of `DropletArrayInput` via:
//
//	DropletArray{ DropletArgs{...} }
type DropletArrayInput interface {
	pulumi.Input

	ToDropletArrayOutput() DropletArrayOutput
	ToDropletArrayOutputWithContext(context.Context) DropletArrayOutput
}

type DropletArray []DropletInput

func (DropletArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Droplet)(nil)).Elem()
}

func (i DropletArray) ToDropletArrayOutput() DropletArrayOutput {
	return i.ToDropletArrayOutputWithContext(context.Background())
}

func (i DropletArray) ToDropletArrayOutputWithContext(ctx context.Context) DropletArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DropletArrayOutput)
}

// DropletMapInput is an input type that accepts DropletMap and DropletMapOutput values.
// You can construct a concrete instance of `DropletMapInput` via:
//
//	DropletMap{ "key": DropletArgs{...} }
type DropletMapInput interface {
	pulumi.Input

	ToDropletMapOutput() DropletMapOutput
	ToDropletMapOutputWithContext(context.Context) DropletMapOutput
}

type DropletMap map[string]DropletInput

func (DropletMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Droplet)(nil)).Elem()
}

func (i DropletMap) ToDropletMapOutput() DropletMapOutput {
	return i.ToDropletMapOutputWithContext(context.Background())
}

func (i DropletMap) ToDropletMapOutputWithContext(ctx context.Context) DropletMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DropletMapOutput)
}

type DropletOutput struct{ *pulumi.OutputState }

func (DropletOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Droplet)(nil)).Elem()
}

func (o DropletOutput) ToDropletOutput() DropletOutput {
	return o
}

func (o DropletOutput) ToDropletOutputWithContext(ctx context.Context) DropletOutput {
	return o
}

// An object specifying the backup policy for the Droplet. If omitted and `backups` is `true`, the backup plan will default to daily.
func (o DropletOutput) BackupPolicy() DropletBackupPolicyPtrOutput {
	return o.ApplyT(func(v *Droplet) DropletBackupPolicyPtrOutput { return v.BackupPolicy }).(DropletBackupPolicyPtrOutput)
}

// Boolean controlling if backups are made. Defaults to
// false.
func (o DropletOutput) Backups() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Droplet) pulumi.BoolPtrOutput { return v.Backups }).(pulumi.BoolPtrOutput)
}

func (o DropletOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *Droplet) pulumi.StringOutput { return v.CreatedAt }).(pulumi.StringOutput)
}

// The size of the instance's disk in GB
func (o DropletOutput) Disk() pulumi.IntOutput {
	return o.ApplyT(func(v *Droplet) pulumi.IntOutput { return v.Disk }).(pulumi.IntOutput)
}

// A boolean indicating whether to install the
// DigitalOcean agent used for providing access to the Droplet web console in
// the control panel. By default, the agent is installed on new Droplets but
// installation errors (i.e. OS not supported) are ignored. To prevent it from
// being installed, set to `false`. To make installation errors fatal, explicitly
// set it to `true`.
func (o DropletOutput) DropletAgent() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Droplet) pulumi.BoolPtrOutput { return v.DropletAgent }).(pulumi.BoolPtrOutput)
}

// The uniform resource name of the Droplet
func (o DropletOutput) DropletUrn() pulumi.StringOutput {
	return o.ApplyT(func(v *Droplet) pulumi.StringOutput { return v.DropletUrn }).(pulumi.StringOutput)
}

// A boolean indicating whether the droplet
// should be gracefully shut down before it is deleted.
//
// > **NOTE:** If you use `volumeIds` on a Droplet, this provider will assume management over the full set volumes for the instance, and treat additional volumes as a drift. For this reason, `volumeIds` must not be mixed with external `VolumeAttachment` resources for a given instance.
func (o DropletOutput) GracefulShutdown() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Droplet) pulumi.BoolPtrOutput { return v.GracefulShutdown }).(pulumi.BoolPtrOutput)
}

// The Droplet image ID or slug. This could be either image ID or droplet snapshot ID.
func (o DropletOutput) Image() pulumi.StringOutput {
	return o.ApplyT(func(v *Droplet) pulumi.StringOutput { return v.Image }).(pulumi.StringOutput)
}

// The IPv4 address
func (o DropletOutput) Ipv4Address() pulumi.StringOutput {
	return o.ApplyT(func(v *Droplet) pulumi.StringOutput { return v.Ipv4Address }).(pulumi.StringOutput)
}

// The private networking IPv4 address
func (o DropletOutput) Ipv4AddressPrivate() pulumi.StringOutput {
	return o.ApplyT(func(v *Droplet) pulumi.StringOutput { return v.Ipv4AddressPrivate }).(pulumi.StringOutput)
}

// Boolean controlling if IPv6 is enabled. Defaults to false.
// Once enabled for a Droplet, IPv6 can not be disabled. When enabling IPv6 on
// an existing Droplet, [additional OS-level configuration](https://docs.digitalocean.com/products/networking/ipv6/how-to/enable/#on-existing-droplets)
// is required.
func (o DropletOutput) Ipv6() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Droplet) pulumi.BoolPtrOutput { return v.Ipv6 }).(pulumi.BoolPtrOutput)
}

// The IPv6 address
func (o DropletOutput) Ipv6Address() pulumi.StringOutput {
	return o.ApplyT(func(v *Droplet) pulumi.StringOutput { return v.Ipv6Address }).(pulumi.StringOutput)
}

// Is the Droplet locked
func (o DropletOutput) Locked() pulumi.BoolOutput {
	return o.ApplyT(func(v *Droplet) pulumi.BoolOutput { return v.Locked }).(pulumi.BoolOutput)
}

func (o DropletOutput) Memory() pulumi.IntOutput {
	return o.ApplyT(func(v *Droplet) pulumi.IntOutput { return v.Memory }).(pulumi.IntOutput)
}

// Boolean controlling whether monitoring agent is installed.
// Defaults to false. If set to `true`, you can configure monitor alert policies
// [monitor alert resource](https://www.terraform.io/providers/digitalocean/digitalocean/latest/docs/resources/monitor_alert)
func (o DropletOutput) Monitoring() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Droplet) pulumi.BoolPtrOutput { return v.Monitoring }).(pulumi.BoolPtrOutput)
}

// The Droplet name.
func (o DropletOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Droplet) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Droplet hourly price
func (o DropletOutput) PriceHourly() pulumi.Float64Output {
	return o.ApplyT(func(v *Droplet) pulumi.Float64Output { return v.PriceHourly }).(pulumi.Float64Output)
}

// Droplet monthly price
func (o DropletOutput) PriceMonthly() pulumi.Float64Output {
	return o.ApplyT(func(v *Droplet) pulumi.Float64Output { return v.PriceMonthly }).(pulumi.Float64Output)
}

// **Deprecated** Boolean controlling if private networking
// is enabled. This parameter has been deprecated. Use `vpcUuid` instead to specify a VPC network for the Droplet. If no `vpcUuid` is provided, the Droplet will be placed in your account's default VPC for the region.
//
// Deprecated: This parameter has been deprecated. Use `vpcUuid` instead to specify a VPC network for the Droplet. If no `vpcUuid` is provided, the Droplet will be placed in your account's default VPC for the region.
func (o DropletOutput) PrivateNetworking() pulumi.BoolOutput {
	return o.ApplyT(func(v *Droplet) pulumi.BoolOutput { return v.PrivateNetworking }).(pulumi.BoolOutput)
}

// The region where the Droplet will be created.
func (o DropletOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v *Droplet) pulumi.StringOutput { return v.Region }).(pulumi.StringOutput)
}

// Boolean controlling whether to increase the disk
// size when resizing a Droplet. It defaults to `true`. When set to `false`,
// only the Droplet's RAM and CPU will be resized. **Increasing a Droplet's disk
// size is a permanent change**. Increasing only RAM and CPU is reversible.
func (o DropletOutput) ResizeDisk() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Droplet) pulumi.BoolPtrOutput { return v.ResizeDisk }).(pulumi.BoolPtrOutput)
}

// The unique slug that identifies the type of Droplet. You can find a list of available slugs on [DigitalOcean API documentation](https://docs.digitalocean.com/reference/api/api-reference/#tag/Sizes).
func (o DropletOutput) Size() pulumi.StringOutput {
	return o.ApplyT(func(v *Droplet) pulumi.StringOutput { return v.Size }).(pulumi.StringOutput)
}

// A list of SSH key IDs or fingerprints to enable in
// the format `[12345, 123456]`. To retrieve this info, use the
// [DigitalOcean API](https://docs.digitalocean.com/reference/api/api-reference/#tag/SSH-Keys)
// or CLI (`doctl compute ssh-key list`). Once a Droplet is created keys can not
// be added or removed via this provider. Modifying this field will prompt you
// to destroy and recreate the Droplet.
func (o DropletOutput) SshKeys() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Droplet) pulumi.StringArrayOutput { return v.SshKeys }).(pulumi.StringArrayOutput)
}

// The status of the Droplet
func (o DropletOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *Droplet) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// A list of the tags to be applied to this Droplet.
func (o DropletOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Droplet) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

// A string of the desired User Data provided [during Droplet creation](https://docs.digitalocean.com/products/droplets/how-to/provide-user-data/). Changing this forces a new resource to be created.
func (o DropletOutput) UserData() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Droplet) pulumi.StringPtrOutput { return v.UserData }).(pulumi.StringPtrOutput)
}

// The number of the instance's virtual CPUs
func (o DropletOutput) Vcpus() pulumi.IntOutput {
	return o.ApplyT(func(v *Droplet) pulumi.IntOutput { return v.Vcpus }).(pulumi.IntOutput)
}

// A list of the IDs of each block storage volume to be attached to the Droplet.
func (o DropletOutput) VolumeIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Droplet) pulumi.StringArrayOutput { return v.VolumeIds }).(pulumi.StringArrayOutput)
}

// The ID of the VPC where the Droplet will be located.
func (o DropletOutput) VpcUuid() pulumi.StringOutput {
	return o.ApplyT(func(v *Droplet) pulumi.StringOutput { return v.VpcUuid }).(pulumi.StringOutput)
}

type DropletArrayOutput struct{ *pulumi.OutputState }

func (DropletArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Droplet)(nil)).Elem()
}

func (o DropletArrayOutput) ToDropletArrayOutput() DropletArrayOutput {
	return o
}

func (o DropletArrayOutput) ToDropletArrayOutputWithContext(ctx context.Context) DropletArrayOutput {
	return o
}

func (o DropletArrayOutput) Index(i pulumi.IntInput) DropletOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Droplet {
		return vs[0].([]*Droplet)[vs[1].(int)]
	}).(DropletOutput)
}

type DropletMapOutput struct{ *pulumi.OutputState }

func (DropletMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Droplet)(nil)).Elem()
}

func (o DropletMapOutput) ToDropletMapOutput() DropletMapOutput {
	return o
}

func (o DropletMapOutput) ToDropletMapOutputWithContext(ctx context.Context) DropletMapOutput {
	return o
}

func (o DropletMapOutput) MapIndex(k pulumi.StringInput) DropletOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Droplet {
		return vs[0].(map[string]*Droplet)[vs[1].(string)]
	}).(DropletOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DropletInput)(nil)).Elem(), &Droplet{})
	pulumi.RegisterInputType(reflect.TypeOf((*DropletArrayInput)(nil)).Elem(), DropletArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DropletMapInput)(nil)).Elem(), DropletMap{})
	pulumi.RegisterOutputType(DropletOutput{})
	pulumi.RegisterOutputType(DropletArrayOutput{})
	pulumi.RegisterOutputType(DropletMapOutput{})
}
