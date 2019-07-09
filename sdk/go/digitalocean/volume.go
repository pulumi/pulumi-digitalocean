// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides a DigitalOcean Block Storage volume which can be attached to a Droplet in order to provide expanded storage.
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-digitalocean/blob/master/website/docs/r/volume.html.markdown.
type Volume struct {
	s *pulumi.ResourceState
}

// NewVolume registers a new resource with the given unique name, arguments, and options.
func NewVolume(ctx *pulumi.Context,
	name string, args *VolumeArgs, opts ...pulumi.ResourceOpt) (*Volume, error) {
	if args == nil || args.Region == nil {
		return nil, errors.New("missing required argument 'Region'")
	}
	if args == nil || args.Size == nil {
		return nil, errors.New("missing required argument 'Size'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["description"] = nil
		inputs["filesystemType"] = nil
		inputs["initialFilesystemLabel"] = nil
		inputs["initialFilesystemType"] = nil
		inputs["name"] = nil
		inputs["region"] = nil
		inputs["size"] = nil
		inputs["snapshotId"] = nil
	} else {
		inputs["description"] = args.Description
		inputs["filesystemType"] = args.FilesystemType
		inputs["initialFilesystemLabel"] = args.InitialFilesystemLabel
		inputs["initialFilesystemType"] = args.InitialFilesystemType
		inputs["name"] = args.Name
		inputs["region"] = args.Region
		inputs["size"] = args.Size
		inputs["snapshotId"] = args.SnapshotId
	}
	inputs["dropletIds"] = nil
	inputs["filesystemLabel"] = nil
	inputs["urn"] = nil
	s, err := ctx.RegisterResource("digitalocean:index/volume:Volume", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &Volume{s: s}, nil
}

// GetVolume gets an existing Volume resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVolume(ctx *pulumi.Context,
	name string, id pulumi.ID, state *VolumeState, opts ...pulumi.ResourceOpt) (*Volume, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["description"] = state.Description
		inputs["dropletIds"] = state.DropletIds
		inputs["filesystemLabel"] = state.FilesystemLabel
		inputs["filesystemType"] = state.FilesystemType
		inputs["initialFilesystemLabel"] = state.InitialFilesystemLabel
		inputs["initialFilesystemType"] = state.InitialFilesystemType
		inputs["name"] = state.Name
		inputs["region"] = state.Region
		inputs["size"] = state.Size
		inputs["snapshotId"] = state.SnapshotId
		inputs["urn"] = state.Urn
	}
	s, err := ctx.ReadResource("digitalocean:index/volume:Volume", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &Volume{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *Volume) URN() *pulumi.URNOutput {
	return r.s.URN()
}

// ID is this resource's unique identifier assigned by its provider.
func (r *Volume) ID() *pulumi.IDOutput {
	return r.s.ID()
}

// A free-form text field up to a limit of 1024 bytes to describe a block storage volume.
func (r *Volume) Description() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["description"])
}

// A list of associated droplet ids.
func (r *Volume) DropletIds() *pulumi.ArrayOutput {
	return (*pulumi.ArrayOutput)(r.s.State["dropletIds"])
}

// Filesystem label for the block storage volume.
func (r *Volume) FilesystemLabel() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["filesystemLabel"])
}

// Filesystem type (`xfs` or `ext4`) for the block storage volume.
func (r *Volume) FilesystemType() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["filesystemType"])
}

// Initial filesystem label for the block storage volume.
func (r *Volume) InitialFilesystemLabel() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["initialFilesystemLabel"])
}

// Initial filesystem type (`xfs` or `ext4`) for the block storage volume.
func (r *Volume) InitialFilesystemType() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["initialFilesystemType"])
}

// A name for the block storage volume. Must be lowercase and be composed only of numbers, letters and "-", up to a limit of 64 characters.
func (r *Volume) Name() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["name"])
}

// The region that the block storage volume will be created in.
func (r *Volume) Region() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["region"])
}

// The size of the block storage volume in GiB. If updated, can only be expanded.
func (r *Volume) Size() *pulumi.IntOutput {
	return (*pulumi.IntOutput)(r.s.State["size"])
}

// The ID of an existing volume snapshot from which the new volume will be created. If supplied, the region and size will be limitied on creation to that of the referenced snapshot
func (r *Volume) SnapshotId() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["snapshotId"])
}

// the uniform resource name for the volume.
func (r *Volume) Urn() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["urn"])
}

// Input properties used for looking up and filtering Volume resources.
type VolumeState struct {
	// A free-form text field up to a limit of 1024 bytes to describe a block storage volume.
	Description interface{}
	// A list of associated droplet ids.
	DropletIds interface{}
	// Filesystem label for the block storage volume.
	FilesystemLabel interface{}
	// Filesystem type (`xfs` or `ext4`) for the block storage volume.
	FilesystemType interface{}
	// Initial filesystem label for the block storage volume.
	InitialFilesystemLabel interface{}
	// Initial filesystem type (`xfs` or `ext4`) for the block storage volume.
	InitialFilesystemType interface{}
	// A name for the block storage volume. Must be lowercase and be composed only of numbers, letters and "-", up to a limit of 64 characters.
	Name interface{}
	// The region that the block storage volume will be created in.
	Region interface{}
	// The size of the block storage volume in GiB. If updated, can only be expanded.
	Size interface{}
	// The ID of an existing volume snapshot from which the new volume will be created. If supplied, the region and size will be limitied on creation to that of the referenced snapshot
	SnapshotId interface{}
	// the uniform resource name for the volume.
	Urn interface{}
}

// The set of arguments for constructing a Volume resource.
type VolumeArgs struct {
	// A free-form text field up to a limit of 1024 bytes to describe a block storage volume.
	Description interface{}
	// Filesystem type (`xfs` or `ext4`) for the block storage volume.
	FilesystemType interface{}
	// Initial filesystem label for the block storage volume.
	InitialFilesystemLabel interface{}
	// Initial filesystem type (`xfs` or `ext4`) for the block storage volume.
	InitialFilesystemType interface{}
	// A name for the block storage volume. Must be lowercase and be composed only of numbers, letters and "-", up to a limit of 64 characters.
	Name interface{}
	// The region that the block storage volume will be created in.
	Region interface{}
	// The size of the block storage volume in GiB. If updated, can only be expanded.
	Size interface{}
	// The ID of an existing volume snapshot from which the new volume will be created. If supplied, the region and size will be limitied on creation to that of the referenced snapshot
	SnapshotId interface{}
}
