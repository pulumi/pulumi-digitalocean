// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Get information on a Droplet for use in other resources. This data source provides
// all of the Droplet's properties as configured on your DigitalOcean account. This
// is useful if the Droplet in question is not managed by Terraform or you need to
// utilize any of the Droplets data.
// 
// An error is triggered if the provided Droplet name does not exist.
func LookupDroplet(ctx *pulumi.Context, args *GetDropletArgs) (*GetDropletResult, error) {
	inputs := make(map[string]interface{})
	if args != nil {
		inputs["name"] = args.Name
	}
	outputs, err := ctx.Invoke("digitalocean:index/getDroplet:getDroplet", inputs)
	if err != nil {
		return nil, err
	}
	return &GetDropletResult{
		Backups: outputs["backups"],
		Disk: outputs["disk"],
		Image: outputs["image"],
		Ipv4Address: outputs["ipv4Address"],
		Ipv4AddressPrivate: outputs["ipv4AddressPrivate"],
		Ipv6: outputs["ipv6"],
		Ipv6Address: outputs["ipv6Address"],
		Ipv6AddressPrivate: outputs["ipv6AddressPrivate"],
		Locked: outputs["locked"],
		Memory: outputs["memory"],
		Monitoring: outputs["monitoring"],
		Name: outputs["name"],
		PriceHourly: outputs["priceHourly"],
		PriceMonthly: outputs["priceMonthly"],
		PrivateNetworking: outputs["privateNetworking"],
		Region: outputs["region"],
		Size: outputs["size"],
		Status: outputs["status"],
		Tags: outputs["tags"],
		Urn: outputs["urn"],
		Vcpus: outputs["vcpus"],
		VolumeIds: outputs["volumeIds"],
		Id: outputs["id"],
	}, nil
}

// A collection of arguments for invoking getDroplet.
type GetDropletArgs struct {
	// The name of Droplet.
	Name interface{}
}

// A collection of values returned by getDroplet.
type GetDropletResult struct {
	// Whether backups are enabled.
	Backups interface{}
	// The size of the Droplets disk in GB.
	Disk interface{}
	// The Droplet image ID or slug.
	Image interface{}
	// The Droplets public IPv4 address
	Ipv4Address interface{}
	// The Droplets private IPv4 address
	Ipv4AddressPrivate interface{}
	// Whether IPv6 is enabled.
	Ipv6 interface{}
	// The Droplets public IPv6 address
	Ipv6Address interface{}
	// The Droplets private IPv6 address
	Ipv6AddressPrivate interface{}
	// Whether the Droplet is locked.
	Locked interface{}
	// The amount of the Droplets memory in MB.
	Memory interface{}
	// Whether monitoring agent is installed.
	Monitoring interface{}
	Name interface{}
	// Droplet hourly price.
	PriceHourly interface{}
	// Droplet monthly price.
	PriceMonthly interface{}
	// Whether private networks are enabled.
	PrivateNetworking interface{}
	// The region the Droplet is running in.
	Region interface{}
	// The unique slug that indentifies the type of Droplet.
	Size interface{}
	// The status of the Droplet.
	Status interface{}
	// A list of the tags associated to the Droplet.
	Tags interface{}
	// The uniform resource name of the Droplet
	Urn interface{}
	// The number of the Droplets virtual CPUs.
	Vcpus interface{}
	// List of the IDs of each volumes attached to the Droplet.
	VolumeIds interface{}
	// id is the provider-assigned unique ID for this managed resource.
	Id interface{}
}
