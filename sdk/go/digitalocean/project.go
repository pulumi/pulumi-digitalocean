// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-digitalocean/sdk/v4/go/digitalocean/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a DigitalOcean Project resource.
//
// Projects allow you to organize your resources into groups that fit the way you work.
// You can group resources (like Droplets, Spaces, Load Balancers, domains, and Floating IPs)
// in ways that align with the applications you host on DigitalOcean.
//
// The following resource types can be associated with a project:
//
// * App Platform Apps
// * Database Clusters
// * Domains
// * Droplets
// * Floating IPs
// * Kubernetes Clusters
// * Load Balancers
// * Spaces Buckets
// * Volumes
//
// **Note:** A provider managed project cannot be set as a default project.
//
// ## Example Usage
//
// The following example demonstrates the creation of an empty project:
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
//			_, err := digitalocean.NewProject(ctx, "playground", &digitalocean.ProjectArgs{
//				Name:        pulumi.String("playground"),
//				Description: pulumi.String("A project to represent development resources."),
//				Purpose:     pulumi.String("Web Application"),
//				Environment: pulumi.String("Development"),
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
// The following example demonstrates the creation of a project with a Droplet resource:
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
//			foobar, err := digitalocean.NewDroplet(ctx, "foobar", &digitalocean.DropletArgs{
//				Name:   pulumi.String("example"),
//				Size:   pulumi.String(digitalocean.DropletSlugDropletS1VCPU1GB),
//				Image:  pulumi.String("ubuntu-22-04-x64"),
//				Region: pulumi.String(digitalocean.RegionNYC3),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = digitalocean.NewProject(ctx, "playground", &digitalocean.ProjectArgs{
//				Name:        pulumi.String("playground"),
//				Description: pulumi.String("A project to represent development resources."),
//				Purpose:     pulumi.String("Web Application"),
//				Environment: pulumi.String("Development"),
//				Resources: pulumi.StringArray{
//					foobar.DropletUrn,
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
// Projects can be imported using the `id` returned from DigitalOcean, e.g.
//
// ```sh
// $ pulumi import digitalocean:index/project:Project myproject 245bcfd0-7f31-4ce6-a2bc-475a116cca97
// ```
type Project struct {
	pulumi.CustomResourceState

	// the date and time when the project was created, (ISO8601)
	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// the description of the project
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// the environment of the project's resources. The possible values are: `Development`, `Staging`, `Production`)
	Environment pulumi.StringPtrOutput `pulumi:"environment"`
	// a boolean indicating whether or not the project is the default project. (Default: "false")
	IsDefault pulumi.BoolPtrOutput `pulumi:"isDefault"`
	// The name of the Project
	Name pulumi.StringOutput `pulumi:"name"`
	// the id of the project owner.
	OwnerId pulumi.IntOutput `pulumi:"ownerId"`
	// the unique universal identifier of the project owner.
	OwnerUuid pulumi.StringOutput `pulumi:"ownerUuid"`
	// the purpose of the project, (Default: "Web Application")
	Purpose pulumi.StringPtrOutput `pulumi:"purpose"`
	// a list of uniform resource names (URNs) for the resources associated with the project
	Resources pulumi.StringArrayOutput `pulumi:"resources"`
	// the date and time when the project was last updated, (ISO8601)
	UpdatedAt pulumi.StringOutput `pulumi:"updatedAt"`
}

// NewProject registers a new resource with the given unique name, arguments, and options.
func NewProject(ctx *pulumi.Context,
	name string, args *ProjectArgs, opts ...pulumi.ResourceOption) (*Project, error) {
	if args == nil {
		args = &ProjectArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Project
	err := ctx.RegisterResource("digitalocean:index/project:Project", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetProject gets an existing Project resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProject(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ProjectState, opts ...pulumi.ResourceOption) (*Project, error) {
	var resource Project
	err := ctx.ReadResource("digitalocean:index/project:Project", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Project resources.
type projectState struct {
	// the date and time when the project was created, (ISO8601)
	CreatedAt *string `pulumi:"createdAt"`
	// the description of the project
	Description *string `pulumi:"description"`
	// the environment of the project's resources. The possible values are: `Development`, `Staging`, `Production`)
	Environment *string `pulumi:"environment"`
	// a boolean indicating whether or not the project is the default project. (Default: "false")
	IsDefault *bool `pulumi:"isDefault"`
	// The name of the Project
	Name *string `pulumi:"name"`
	// the id of the project owner.
	OwnerId *int `pulumi:"ownerId"`
	// the unique universal identifier of the project owner.
	OwnerUuid *string `pulumi:"ownerUuid"`
	// the purpose of the project, (Default: "Web Application")
	Purpose *string `pulumi:"purpose"`
	// a list of uniform resource names (URNs) for the resources associated with the project
	Resources []string `pulumi:"resources"`
	// the date and time when the project was last updated, (ISO8601)
	UpdatedAt *string `pulumi:"updatedAt"`
}

type ProjectState struct {
	// the date and time when the project was created, (ISO8601)
	CreatedAt pulumi.StringPtrInput
	// the description of the project
	Description pulumi.StringPtrInput
	// the environment of the project's resources. The possible values are: `Development`, `Staging`, `Production`)
	Environment pulumi.StringPtrInput
	// a boolean indicating whether or not the project is the default project. (Default: "false")
	IsDefault pulumi.BoolPtrInput
	// The name of the Project
	Name pulumi.StringPtrInput
	// the id of the project owner.
	OwnerId pulumi.IntPtrInput
	// the unique universal identifier of the project owner.
	OwnerUuid pulumi.StringPtrInput
	// the purpose of the project, (Default: "Web Application")
	Purpose pulumi.StringPtrInput
	// a list of uniform resource names (URNs) for the resources associated with the project
	Resources pulumi.StringArrayInput
	// the date and time when the project was last updated, (ISO8601)
	UpdatedAt pulumi.StringPtrInput
}

func (ProjectState) ElementType() reflect.Type {
	return reflect.TypeOf((*projectState)(nil)).Elem()
}

type projectArgs struct {
	// the description of the project
	Description *string `pulumi:"description"`
	// the environment of the project's resources. The possible values are: `Development`, `Staging`, `Production`)
	Environment *string `pulumi:"environment"`
	// a boolean indicating whether or not the project is the default project. (Default: "false")
	IsDefault *bool `pulumi:"isDefault"`
	// The name of the Project
	Name *string `pulumi:"name"`
	// the purpose of the project, (Default: "Web Application")
	Purpose *string `pulumi:"purpose"`
	// a list of uniform resource names (URNs) for the resources associated with the project
	Resources []string `pulumi:"resources"`
}

// The set of arguments for constructing a Project resource.
type ProjectArgs struct {
	// the description of the project
	Description pulumi.StringPtrInput
	// the environment of the project's resources. The possible values are: `Development`, `Staging`, `Production`)
	Environment pulumi.StringPtrInput
	// a boolean indicating whether or not the project is the default project. (Default: "false")
	IsDefault pulumi.BoolPtrInput
	// The name of the Project
	Name pulumi.StringPtrInput
	// the purpose of the project, (Default: "Web Application")
	Purpose pulumi.StringPtrInput
	// a list of uniform resource names (URNs) for the resources associated with the project
	Resources pulumi.StringArrayInput
}

func (ProjectArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*projectArgs)(nil)).Elem()
}

type ProjectInput interface {
	pulumi.Input

	ToProjectOutput() ProjectOutput
	ToProjectOutputWithContext(ctx context.Context) ProjectOutput
}

func (*Project) ElementType() reflect.Type {
	return reflect.TypeOf((**Project)(nil)).Elem()
}

func (i *Project) ToProjectOutput() ProjectOutput {
	return i.ToProjectOutputWithContext(context.Background())
}

func (i *Project) ToProjectOutputWithContext(ctx context.Context) ProjectOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectOutput)
}

// ProjectArrayInput is an input type that accepts ProjectArray and ProjectArrayOutput values.
// You can construct a concrete instance of `ProjectArrayInput` via:
//
//	ProjectArray{ ProjectArgs{...} }
type ProjectArrayInput interface {
	pulumi.Input

	ToProjectArrayOutput() ProjectArrayOutput
	ToProjectArrayOutputWithContext(context.Context) ProjectArrayOutput
}

type ProjectArray []ProjectInput

func (ProjectArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Project)(nil)).Elem()
}

func (i ProjectArray) ToProjectArrayOutput() ProjectArrayOutput {
	return i.ToProjectArrayOutputWithContext(context.Background())
}

func (i ProjectArray) ToProjectArrayOutputWithContext(ctx context.Context) ProjectArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectArrayOutput)
}

// ProjectMapInput is an input type that accepts ProjectMap and ProjectMapOutput values.
// You can construct a concrete instance of `ProjectMapInput` via:
//
//	ProjectMap{ "key": ProjectArgs{...} }
type ProjectMapInput interface {
	pulumi.Input

	ToProjectMapOutput() ProjectMapOutput
	ToProjectMapOutputWithContext(context.Context) ProjectMapOutput
}

type ProjectMap map[string]ProjectInput

func (ProjectMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Project)(nil)).Elem()
}

func (i ProjectMap) ToProjectMapOutput() ProjectMapOutput {
	return i.ToProjectMapOutputWithContext(context.Background())
}

func (i ProjectMap) ToProjectMapOutputWithContext(ctx context.Context) ProjectMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectMapOutput)
}

type ProjectOutput struct{ *pulumi.OutputState }

func (ProjectOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Project)(nil)).Elem()
}

func (o ProjectOutput) ToProjectOutput() ProjectOutput {
	return o
}

func (o ProjectOutput) ToProjectOutputWithContext(ctx context.Context) ProjectOutput {
	return o
}

// the date and time when the project was created, (ISO8601)
func (o ProjectOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *Project) pulumi.StringOutput { return v.CreatedAt }).(pulumi.StringOutput)
}

// the description of the project
func (o ProjectOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Project) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// the environment of the project's resources. The possible values are: `Development`, `Staging`, `Production`)
func (o ProjectOutput) Environment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Project) pulumi.StringPtrOutput { return v.Environment }).(pulumi.StringPtrOutput)
}

// a boolean indicating whether or not the project is the default project. (Default: "false")
func (o ProjectOutput) IsDefault() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Project) pulumi.BoolPtrOutput { return v.IsDefault }).(pulumi.BoolPtrOutput)
}

// The name of the Project
func (o ProjectOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Project) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// the id of the project owner.
func (o ProjectOutput) OwnerId() pulumi.IntOutput {
	return o.ApplyT(func(v *Project) pulumi.IntOutput { return v.OwnerId }).(pulumi.IntOutput)
}

// the unique universal identifier of the project owner.
func (o ProjectOutput) OwnerUuid() pulumi.StringOutput {
	return o.ApplyT(func(v *Project) pulumi.StringOutput { return v.OwnerUuid }).(pulumi.StringOutput)
}

// the purpose of the project, (Default: "Web Application")
func (o ProjectOutput) Purpose() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Project) pulumi.StringPtrOutput { return v.Purpose }).(pulumi.StringPtrOutput)
}

// a list of uniform resource names (URNs) for the resources associated with the project
func (o ProjectOutput) Resources() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Project) pulumi.StringArrayOutput { return v.Resources }).(pulumi.StringArrayOutput)
}

// the date and time when the project was last updated, (ISO8601)
func (o ProjectOutput) UpdatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *Project) pulumi.StringOutput { return v.UpdatedAt }).(pulumi.StringOutput)
}

type ProjectArrayOutput struct{ *pulumi.OutputState }

func (ProjectArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Project)(nil)).Elem()
}

func (o ProjectArrayOutput) ToProjectArrayOutput() ProjectArrayOutput {
	return o
}

func (o ProjectArrayOutput) ToProjectArrayOutputWithContext(ctx context.Context) ProjectArrayOutput {
	return o
}

func (o ProjectArrayOutput) Index(i pulumi.IntInput) ProjectOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Project {
		return vs[0].([]*Project)[vs[1].(int)]
	}).(ProjectOutput)
}

type ProjectMapOutput struct{ *pulumi.OutputState }

func (ProjectMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Project)(nil)).Elem()
}

func (o ProjectMapOutput) ToProjectMapOutput() ProjectMapOutput {
	return o
}

func (o ProjectMapOutput) ToProjectMapOutputWithContext(ctx context.Context) ProjectMapOutput {
	return o
}

func (o ProjectMapOutput) MapIndex(k pulumi.StringInput) ProjectOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Project {
		return vs[0].(map[string]*Project)[vs[1].(string)]
	}).(ProjectOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectInput)(nil)).Elem(), &Project{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectArrayInput)(nil)).Elem(), ProjectArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectMapInput)(nil)).Elem(), ProjectMap{})
	pulumi.RegisterOutputType(ProjectOutput{})
	pulumi.RegisterOutputType(ProjectArrayOutput{})
	pulumi.RegisterOutputType(ProjectMapOutput{})
}
