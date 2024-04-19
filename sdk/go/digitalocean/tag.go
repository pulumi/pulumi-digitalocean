// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-digitalocean/sdk/v4/go/digitalocean/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a DigitalOcean Tag resource. A Tag is a label that can be applied to a
// Droplet resource in order to better organize or facilitate the lookups and
// actions on it. Tags created with this resource can be referenced in your Droplet
// configuration via their ID or name.
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
//			// Create a new tag
//			foobar, err := digitalocean.NewTag(ctx, "foobar", nil)
//			if err != nil {
//				return err
//			}
//			// Create a new Droplet in nyc3 with the foobar tag
//			_, err = digitalocean.NewDroplet(ctx, "web", &digitalocean.DropletArgs{
//				Image:  pulumi.String("ubuntu-18-04-x64"),
//				Region: pulumi.String(digitalocean.RegionNYC3),
//				Size:   pulumi.String(digitalocean.DropletSlugDropletS1VCPU1GB),
//				Tags: pulumi.StringArray{
//					foobar.ID(),
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
// Tags can be imported using the `name`, e.g.
//
// ```sh
// $ pulumi import digitalocean:index/tag:Tag mytag tagname
// ```
type Tag struct {
	pulumi.CustomResourceState

	// A count of the database clusters that the tag is applied to.
	DatabasesCount pulumi.IntOutput `pulumi:"databasesCount"`
	// A count of the Droplets the tag is applied to.
	DropletsCount pulumi.IntOutput `pulumi:"dropletsCount"`
	// A count of the images that the tag is applied to.
	ImagesCount pulumi.IntOutput `pulumi:"imagesCount"`
	// The name of the tag
	Name pulumi.StringOutput `pulumi:"name"`
	// A count of the total number of resources that the tag is applied to.
	TotalResourceCount pulumi.IntOutput `pulumi:"totalResourceCount"`
	// A count of the volume snapshots that the tag is applied to.
	VolumeSnapshotsCount pulumi.IntOutput `pulumi:"volumeSnapshotsCount"`
	// A count of the volumes that the tag is applied to.
	VolumesCount pulumi.IntOutput `pulumi:"volumesCount"`
}

// NewTag registers a new resource with the given unique name, arguments, and options.
func NewTag(ctx *pulumi.Context,
	name string, args *TagArgs, opts ...pulumi.ResourceOption) (*Tag, error) {
	if args == nil {
		args = &TagArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Tag
	err := ctx.RegisterResource("digitalocean:index/tag:Tag", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTag gets an existing Tag resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTag(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TagState, opts ...pulumi.ResourceOption) (*Tag, error) {
	var resource Tag
	err := ctx.ReadResource("digitalocean:index/tag:Tag", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Tag resources.
type tagState struct {
	// A count of the database clusters that the tag is applied to.
	DatabasesCount *int `pulumi:"databasesCount"`
	// A count of the Droplets the tag is applied to.
	DropletsCount *int `pulumi:"dropletsCount"`
	// A count of the images that the tag is applied to.
	ImagesCount *int `pulumi:"imagesCount"`
	// The name of the tag
	Name *string `pulumi:"name"`
	// A count of the total number of resources that the tag is applied to.
	TotalResourceCount *int `pulumi:"totalResourceCount"`
	// A count of the volume snapshots that the tag is applied to.
	VolumeSnapshotsCount *int `pulumi:"volumeSnapshotsCount"`
	// A count of the volumes that the tag is applied to.
	VolumesCount *int `pulumi:"volumesCount"`
}

type TagState struct {
	// A count of the database clusters that the tag is applied to.
	DatabasesCount pulumi.IntPtrInput
	// A count of the Droplets the tag is applied to.
	DropletsCount pulumi.IntPtrInput
	// A count of the images that the tag is applied to.
	ImagesCount pulumi.IntPtrInput
	// The name of the tag
	Name pulumi.StringPtrInput
	// A count of the total number of resources that the tag is applied to.
	TotalResourceCount pulumi.IntPtrInput
	// A count of the volume snapshots that the tag is applied to.
	VolumeSnapshotsCount pulumi.IntPtrInput
	// A count of the volumes that the tag is applied to.
	VolumesCount pulumi.IntPtrInput
}

func (TagState) ElementType() reflect.Type {
	return reflect.TypeOf((*tagState)(nil)).Elem()
}

type tagArgs struct {
	// The name of the tag
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a Tag resource.
type TagArgs struct {
	// The name of the tag
	Name pulumi.StringPtrInput
}

func (TagArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*tagArgs)(nil)).Elem()
}

type TagInput interface {
	pulumi.Input

	ToTagOutput() TagOutput
	ToTagOutputWithContext(ctx context.Context) TagOutput
}

func (*Tag) ElementType() reflect.Type {
	return reflect.TypeOf((**Tag)(nil)).Elem()
}

func (i *Tag) ToTagOutput() TagOutput {
	return i.ToTagOutputWithContext(context.Background())
}

func (i *Tag) ToTagOutputWithContext(ctx context.Context) TagOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TagOutput)
}

// TagArrayInput is an input type that accepts TagArray and TagArrayOutput values.
// You can construct a concrete instance of `TagArrayInput` via:
//
//	TagArray{ TagArgs{...} }
type TagArrayInput interface {
	pulumi.Input

	ToTagArrayOutput() TagArrayOutput
	ToTagArrayOutputWithContext(context.Context) TagArrayOutput
}

type TagArray []TagInput

func (TagArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Tag)(nil)).Elem()
}

func (i TagArray) ToTagArrayOutput() TagArrayOutput {
	return i.ToTagArrayOutputWithContext(context.Background())
}

func (i TagArray) ToTagArrayOutputWithContext(ctx context.Context) TagArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TagArrayOutput)
}

// TagMapInput is an input type that accepts TagMap and TagMapOutput values.
// You can construct a concrete instance of `TagMapInput` via:
//
//	TagMap{ "key": TagArgs{...} }
type TagMapInput interface {
	pulumi.Input

	ToTagMapOutput() TagMapOutput
	ToTagMapOutputWithContext(context.Context) TagMapOutput
}

type TagMap map[string]TagInput

func (TagMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Tag)(nil)).Elem()
}

func (i TagMap) ToTagMapOutput() TagMapOutput {
	return i.ToTagMapOutputWithContext(context.Background())
}

func (i TagMap) ToTagMapOutputWithContext(ctx context.Context) TagMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TagMapOutput)
}

type TagOutput struct{ *pulumi.OutputState }

func (TagOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Tag)(nil)).Elem()
}

func (o TagOutput) ToTagOutput() TagOutput {
	return o
}

func (o TagOutput) ToTagOutputWithContext(ctx context.Context) TagOutput {
	return o
}

// A count of the database clusters that the tag is applied to.
func (o TagOutput) DatabasesCount() pulumi.IntOutput {
	return o.ApplyT(func(v *Tag) pulumi.IntOutput { return v.DatabasesCount }).(pulumi.IntOutput)
}

// A count of the Droplets the tag is applied to.
func (o TagOutput) DropletsCount() pulumi.IntOutput {
	return o.ApplyT(func(v *Tag) pulumi.IntOutput { return v.DropletsCount }).(pulumi.IntOutput)
}

// A count of the images that the tag is applied to.
func (o TagOutput) ImagesCount() pulumi.IntOutput {
	return o.ApplyT(func(v *Tag) pulumi.IntOutput { return v.ImagesCount }).(pulumi.IntOutput)
}

// The name of the tag
func (o TagOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Tag) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// A count of the total number of resources that the tag is applied to.
func (o TagOutput) TotalResourceCount() pulumi.IntOutput {
	return o.ApplyT(func(v *Tag) pulumi.IntOutput { return v.TotalResourceCount }).(pulumi.IntOutput)
}

// A count of the volume snapshots that the tag is applied to.
func (o TagOutput) VolumeSnapshotsCount() pulumi.IntOutput {
	return o.ApplyT(func(v *Tag) pulumi.IntOutput { return v.VolumeSnapshotsCount }).(pulumi.IntOutput)
}

// A count of the volumes that the tag is applied to.
func (o TagOutput) VolumesCount() pulumi.IntOutput {
	return o.ApplyT(func(v *Tag) pulumi.IntOutput { return v.VolumesCount }).(pulumi.IntOutput)
}

type TagArrayOutput struct{ *pulumi.OutputState }

func (TagArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Tag)(nil)).Elem()
}

func (o TagArrayOutput) ToTagArrayOutput() TagArrayOutput {
	return o
}

func (o TagArrayOutput) ToTagArrayOutputWithContext(ctx context.Context) TagArrayOutput {
	return o
}

func (o TagArrayOutput) Index(i pulumi.IntInput) TagOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Tag {
		return vs[0].([]*Tag)[vs[1].(int)]
	}).(TagOutput)
}

type TagMapOutput struct{ *pulumi.OutputState }

func (TagMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Tag)(nil)).Elem()
}

func (o TagMapOutput) ToTagMapOutput() TagMapOutput {
	return o
}

func (o TagMapOutput) ToTagMapOutputWithContext(ctx context.Context) TagMapOutput {
	return o
}

func (o TagMapOutput) MapIndex(k pulumi.StringInput) TagOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Tag {
		return vs[0].(map[string]*Tag)[vs[1].(string)]
	}).(TagOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TagInput)(nil)).Elem(), &Tag{})
	pulumi.RegisterInputType(reflect.TypeOf((*TagArrayInput)(nil)).Elem(), TagArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TagMapInput)(nil)).Elem(), TagMap{})
	pulumi.RegisterOutputType(TagOutput{})
	pulumi.RegisterOutputType(TagArrayOutput{})
	pulumi.RegisterOutputType(TagMapOutput{})
}
