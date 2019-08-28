// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// > This content is derived from https://github.com/terraform-providers/terraform-provider-digitalocean/blob/master/website/docs/d/volume.html.markdown.
func LookupVolume(ctx *pulumi.Context, args *GetVolumeArgs) (*GetVolumeResult, error) {
	inputs := make(map[string]interface{})
	if args != nil {
		inputs["description"] = args.Description
		inputs["name"] = args.Name
		inputs["region"] = args.Region
	}
	outputs, err := ctx.Invoke("digitalocean:index/getVolume:getVolume", inputs)
	if err != nil {
		return nil, err
	}
	return &GetVolumeResult{
		Description: outputs["description"],
		DropletIds: outputs["dropletIds"],
		FilesystemLabel: outputs["filesystemLabel"],
		FilesystemType: outputs["filesystemType"],
		Name: outputs["name"],
		Region: outputs["region"],
		Size: outputs["size"],
		Urn: outputs["urn"],
		Id: outputs["id"],
	}, nil
}

// A collection of arguments for invoking getVolume.
type GetVolumeArgs struct {
	Description interface{}
	// The name of block storage volume.
	Name interface{}
	// The region the block storage volume is provisioned in.
	Region interface{}
}

// A collection of values returned by getVolume.
type GetVolumeResult struct {
	// Text describing a block storage volume.
	Description interface{}
	// A list of associated Droplet ids.
	DropletIds interface{}
	// Filesystem label currently in-use on the block storage volume.
	FilesystemLabel interface{}
	// Filesystem type currently in-use on the block storage volume.
	FilesystemType interface{}
	Name interface{}
	Region interface{}
	// The size of the block storage volume in GiB.
	Size interface{}
	Urn interface{}
	// id is the provider-assigned unique ID for this managed resource.
	Id interface{}
}
