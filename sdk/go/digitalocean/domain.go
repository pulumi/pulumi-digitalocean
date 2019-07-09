// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides a DigitalOcean domain resource.
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-digitalocean/blob/master/website/docs/r/domain.html.markdown.
type Domain struct {
	s *pulumi.ResourceState
}

// NewDomain registers a new resource with the given unique name, arguments, and options.
func NewDomain(ctx *pulumi.Context,
	name string, args *DomainArgs, opts ...pulumi.ResourceOpt) (*Domain, error) {
	if args == nil || args.Name == nil {
		return nil, errors.New("missing required argument 'Name'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["ipAddress"] = nil
		inputs["name"] = nil
	} else {
		inputs["ipAddress"] = args.IpAddress
		inputs["name"] = args.Name
	}
	inputs["urn"] = nil
	s, err := ctx.RegisterResource("digitalocean:index/domain:Domain", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &Domain{s: s}, nil
}

// GetDomain gets an existing Domain resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDomain(ctx *pulumi.Context,
	name string, id pulumi.ID, state *DomainState, opts ...pulumi.ResourceOpt) (*Domain, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["ipAddress"] = state.IpAddress
		inputs["name"] = state.Name
		inputs["urn"] = state.Urn
	}
	s, err := ctx.ReadResource("digitalocean:index/domain:Domain", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &Domain{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *Domain) URN() *pulumi.URNOutput {
	return r.s.URN()
}

// ID is this resource's unique identifier assigned by its provider.
func (r *Domain) ID() *pulumi.IDOutput {
	return r.s.ID()
}

// The IP address of the domain. If specified, this IP
// is used to created an initial A record for the domain.
func (r *Domain) IpAddress() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["ipAddress"])
}

// The name of the domain
func (r *Domain) Name() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["name"])
}

// The uniform resource name of the domain
func (r *Domain) Urn() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["urn"])
}

// Input properties used for looking up and filtering Domain resources.
type DomainState struct {
	// The IP address of the domain. If specified, this IP
	// is used to created an initial A record for the domain.
	IpAddress interface{}
	// The name of the domain
	Name interface{}
	// The uniform resource name of the domain
	Urn interface{}
}

// The set of arguments for constructing a Domain resource.
type DomainArgs struct {
	// The IP address of the domain. If specified, this IP
	// is used to created an initial A record for the domain.
	IpAddress interface{}
	// The name of the domain
	Name interface{}
}
