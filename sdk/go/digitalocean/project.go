// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides a DigitalOcean Project resource.
// 
// Projects allow you to organize your resources into groups that fit the way you work.
// You can group resources (like Droplets, Spaces, Load Balancers, domains, and Floating IPs)
// in ways that align with the applications you host on DigitalOcean.
// 
// The following resources can be associated with a project:
// 
// * Droplet
// * Load Balancer
// * Domain
// * Volume
// * Floating IP
// * Spaces Bucket
// 
// **Note:** A Terrafrom managed project cannot be set as a default project.
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-digitalocean/blob/master/website/docs/r/project.html.markdown.
type Project struct {
	s *pulumi.ResourceState
}

// NewProject registers a new resource with the given unique name, arguments, and options.
func NewProject(ctx *pulumi.Context,
	name string, args *ProjectArgs, opts ...pulumi.ResourceOpt) (*Project, error) {
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["description"] = nil
		inputs["environment"] = nil
		inputs["name"] = nil
		inputs["purpose"] = nil
		inputs["resources"] = nil
	} else {
		inputs["description"] = args.Description
		inputs["environment"] = args.Environment
		inputs["name"] = args.Name
		inputs["purpose"] = args.Purpose
		inputs["resources"] = args.Resources
	}
	inputs["createdAt"] = nil
	inputs["ownerId"] = nil
	inputs["ownerUuid"] = nil
	inputs["updatedAt"] = nil
	s, err := ctx.RegisterResource("digitalocean:index/project:Project", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &Project{s: s}, nil
}

// GetProject gets an existing Project resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProject(ctx *pulumi.Context,
	name string, id pulumi.ID, state *ProjectState, opts ...pulumi.ResourceOpt) (*Project, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["createdAt"] = state.CreatedAt
		inputs["description"] = state.Description
		inputs["environment"] = state.Environment
		inputs["name"] = state.Name
		inputs["ownerId"] = state.OwnerId
		inputs["ownerUuid"] = state.OwnerUuid
		inputs["purpose"] = state.Purpose
		inputs["resources"] = state.Resources
		inputs["updatedAt"] = state.UpdatedAt
	}
	s, err := ctx.ReadResource("digitalocean:index/project:Project", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &Project{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *Project) URN() *pulumi.URNOutput {
	return r.s.URN()
}

// ID is this resource's unique identifier assigned by its provider.
func (r *Project) ID() *pulumi.IDOutput {
	return r.s.ID()
}

// the date and time when the project was created, (ISO8601)
func (r *Project) CreatedAt() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["createdAt"])
}

// the description of the project
func (r *Project) Description() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["description"])
}

// the environment of the project's resources. The possible values are: `Development`, `Staging`, `Production`)
func (r *Project) Environment() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["environment"])
}

// The name of the Project
func (r *Project) Name() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["name"])
}

// the id of the project owner.
func (r *Project) OwnerId() *pulumi.IntOutput {
	return (*pulumi.IntOutput)(r.s.State["ownerId"])
}

// the unique universal identifier of the project owner.
func (r *Project) OwnerUuid() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["ownerUuid"])
}

// the purpose of the project, (Default: "Web Application")
func (r *Project) Purpose() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["purpose"])
}

// a list of uniform resource names (URNs) for the resources associated with the project
func (r *Project) Resources() *pulumi.ArrayOutput {
	return (*pulumi.ArrayOutput)(r.s.State["resources"])
}

// the date and time when the project was last updated, (ISO8601)
func (r *Project) UpdatedAt() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["updatedAt"])
}

// Input properties used for looking up and filtering Project resources.
type ProjectState struct {
	// the date and time when the project was created, (ISO8601)
	CreatedAt interface{}
	// the description of the project
	Description interface{}
	// the environment of the project's resources. The possible values are: `Development`, `Staging`, `Production`)
	Environment interface{}
	// The name of the Project
	Name interface{}
	// the id of the project owner.
	OwnerId interface{}
	// the unique universal identifier of the project owner.
	OwnerUuid interface{}
	// the purpose of the project, (Default: "Web Application")
	Purpose interface{}
	// a list of uniform resource names (URNs) for the resources associated with the project
	Resources interface{}
	// the date and time when the project was last updated, (ISO8601)
	UpdatedAt interface{}
}

// The set of arguments for constructing a Project resource.
type ProjectArgs struct {
	// the description of the project
	Description interface{}
	// the environment of the project's resources. The possible values are: `Development`, `Staging`, `Production`)
	Environment interface{}
	// The name of the Project
	Name interface{}
	// the purpose of the project, (Default: "Web Application")
	Purpose interface{}
	// a list of uniform resource names (URNs) for the resources associated with the project
	Resources interface{}
}
