// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides a DigitalOcean database resource. When creating a new database cluster, a default database with name `defaultdb` will be created. Then, this resource can be used to provide additional database inside the cluster.
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-digitalocean/blob/master/website/docs/r/database_db.html.markdown.
type DatabaseDb struct {
	s *pulumi.ResourceState
}

// NewDatabaseDb registers a new resource with the given unique name, arguments, and options.
func NewDatabaseDb(ctx *pulumi.Context,
	name string, args *DatabaseDbArgs, opts ...pulumi.ResourceOpt) (*DatabaseDb, error) {
	if args == nil || args.ClusterId == nil {
		return nil, errors.New("missing required argument 'ClusterId'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["clusterId"] = nil
		inputs["name"] = nil
	} else {
		inputs["clusterId"] = args.ClusterId
		inputs["name"] = args.Name
	}
	s, err := ctx.RegisterResource("digitalocean:index:DatabaseDb", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &DatabaseDb{s: s}, nil
}

// GetDatabaseDb gets an existing DatabaseDb resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDatabaseDb(ctx *pulumi.Context,
	name string, id pulumi.ID, state *DatabaseDbState, opts ...pulumi.ResourceOpt) (*DatabaseDb, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["clusterId"] = state.ClusterId
		inputs["name"] = state.Name
	}
	s, err := ctx.ReadResource("digitalocean:index:DatabaseDb", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &DatabaseDb{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *DatabaseDb) URN() *pulumi.URNOutput {
	return r.s.URN()
}

// ID is this resource's unique identifier assigned by its provider.
func (r *DatabaseDb) ID() *pulumi.IDOutput {
	return r.s.ID()
}

// The ID of the original source database cluster.
func (r *DatabaseDb) ClusterId() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["clusterId"])
}

// The name for the database.
func (r *DatabaseDb) Name() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["name"])
}

// Input properties used for looking up and filtering DatabaseDb resources.
type DatabaseDbState struct {
	// The ID of the original source database cluster.
	ClusterId interface{}
	// The name for the database.
	Name interface{}
}

// The set of arguments for constructing a DatabaseDb resource.
type DatabaseDbArgs struct {
	// The ID of the original source database cluster.
	ClusterId interface{}
	// The name for the database.
	Name interface{}
}