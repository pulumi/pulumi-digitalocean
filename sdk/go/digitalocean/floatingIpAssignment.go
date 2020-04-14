// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a resource for assigning an existing DigitalOcean Floating IP to a Droplet. This
// makes it easy to provision floating IP addresses that are not tied to the lifecycle of your
// Droplet.
type FloatingIpAssignment struct {
	pulumi.CustomResourceState

	// The ID of Droplet that the Floating IP will be assigned to.
	DropletId pulumi.IntOutput `pulumi:"dropletId"`
	// The Floating IP to assign to the Droplet.
	IpAddress pulumi.StringOutput `pulumi:"ipAddress"`
}

// NewFloatingIpAssignment registers a new resource with the given unique name, arguments, and options.
func NewFloatingIpAssignment(ctx *pulumi.Context,
	name string, args *FloatingIpAssignmentArgs, opts ...pulumi.ResourceOption) (*FloatingIpAssignment, error) {
	if args == nil || args.DropletId == nil {
		return nil, errors.New("missing required argument 'DropletId'")
	}
	if args == nil || args.IpAddress == nil {
		return nil, errors.New("missing required argument 'IpAddress'")
	}
	if args == nil {
		args = &FloatingIpAssignmentArgs{}
	}
	var resource FloatingIpAssignment
	err := ctx.RegisterResource("digitalocean:index/floatingIpAssignment:FloatingIpAssignment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFloatingIpAssignment gets an existing FloatingIpAssignment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFloatingIpAssignment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FloatingIpAssignmentState, opts ...pulumi.ResourceOption) (*FloatingIpAssignment, error) {
	var resource FloatingIpAssignment
	err := ctx.ReadResource("digitalocean:index/floatingIpAssignment:FloatingIpAssignment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering FloatingIpAssignment resources.
type floatingIpAssignmentState struct {
	// The ID of Droplet that the Floating IP will be assigned to.
	DropletId *int `pulumi:"dropletId"`
	// The Floating IP to assign to the Droplet.
	IpAddress *string `pulumi:"ipAddress"`
}

type FloatingIpAssignmentState struct {
	// The ID of Droplet that the Floating IP will be assigned to.
	DropletId pulumi.IntPtrInput
	// The Floating IP to assign to the Droplet.
	IpAddress pulumi.StringPtrInput
}

func (FloatingIpAssignmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*floatingIpAssignmentState)(nil)).Elem()
}

type floatingIpAssignmentArgs struct {
	// The ID of Droplet that the Floating IP will be assigned to.
	DropletId int `pulumi:"dropletId"`
	// The Floating IP to assign to the Droplet.
	IpAddress string `pulumi:"ipAddress"`
}

// The set of arguments for constructing a FloatingIpAssignment resource.
type FloatingIpAssignmentArgs struct {
	// The ID of Droplet that the Floating IP will be assigned to.
	DropletId pulumi.IntInput
	// The Floating IP to assign to the Droplet.
	IpAddress pulumi.StringInput
}

func (FloatingIpAssignmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*floatingIpAssignmentArgs)(nil)).Elem()
}
