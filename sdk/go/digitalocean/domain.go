// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a DigitalOcean domain resource.
type Domain struct {
	pulumi.CustomResourceState

	// The uniform resource name of the domain
	DomainUrn pulumi.StringOutput `pulumi:"domainUrn"`
	// The IP address of the domain. If specified, this IP
	// is used to created an initial A record for the domain.
	IpAddress pulumi.StringPtrOutput `pulumi:"ipAddress"`
	// The name of the domain
	Name pulumi.StringOutput `pulumi:"name"`
}

// NewDomain registers a new resource with the given unique name, arguments, and options.
func NewDomain(ctx *pulumi.Context,
	name string, args *DomainArgs, opts ...pulumi.ResourceOption) (*Domain, error) {
	if args == nil || args.Name == nil {
		return nil, errors.New("missing required argument 'Name'")
	}
	if args == nil {
		args = &DomainArgs{}
	}
	var resource Domain
	err := ctx.RegisterResource("digitalocean:index/domain:Domain", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDomain gets an existing Domain resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDomain(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DomainState, opts ...pulumi.ResourceOption) (*Domain, error) {
	var resource Domain
	err := ctx.ReadResource("digitalocean:index/domain:Domain", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Domain resources.
type domainState struct {
	// The uniform resource name of the domain
	DomainUrn *string `pulumi:"domainUrn"`
	// The IP address of the domain. If specified, this IP
	// is used to created an initial A record for the domain.
	IpAddress *string `pulumi:"ipAddress"`
	// The name of the domain
	Name *string `pulumi:"name"`
}

type DomainState struct {
	// The uniform resource name of the domain
	DomainUrn pulumi.StringPtrInput
	// The IP address of the domain. If specified, this IP
	// is used to created an initial A record for the domain.
	IpAddress pulumi.StringPtrInput
	// The name of the domain
	Name pulumi.StringPtrInput
}

func (DomainState) ElementType() reflect.Type {
	return reflect.TypeOf((*domainState)(nil)).Elem()
}

type domainArgs struct {
	// The IP address of the domain. If specified, this IP
	// is used to created an initial A record for the domain.
	IpAddress *string `pulumi:"ipAddress"`
	// The name of the domain
	Name string `pulumi:"name"`
}

// The set of arguments for constructing a Domain resource.
type DomainArgs struct {
	// The IP address of the domain. If specified, this IP
	// is used to created an initial A record for the domain.
	IpAddress pulumi.StringPtrInput
	// The name of the domain
	Name pulumi.StringInput
}

func (DomainArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*domainArgs)(nil)).Elem()
}
