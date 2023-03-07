// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a DigitalOcean Container Registry resource. A Container Registry is
// a secure, private location to store your containers for rapid deployment.
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
//			_, err := digitalocean.NewContainerRegistry(ctx, "foobar", &digitalocean.ContainerRegistryArgs{
//				SubscriptionTierSlug: pulumi.String("starter"),
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
// Container Registries can be imported using the `name`, e.g.
//
// ```sh
//
//	$ pulumi import digitalocean:index/containerRegistry:ContainerRegistry myregistry registryname
//
// ```
type ContainerRegistry struct {
	pulumi.CustomResourceState

	// The date and time when the registry was created
	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// The URL endpoint of the container registry. Ex: `registry.digitalocean.com/my_registry`
	Endpoint pulumi.StringOutput `pulumi:"endpoint"`
	// The name of the container_registry
	Name pulumi.StringOutput `pulumi:"name"`
	// The slug identifier of for region where registry data will be stored. When not provided, a region will be selected automatically.
	Region pulumi.StringOutput `pulumi:"region"`
	// The domain of the container registry. Ex: `registry.digitalocean.com`
	ServerUrl pulumi.StringOutput `pulumi:"serverUrl"`
	// The amount of storage used in the registry in bytes.
	StorageUsageBytes pulumi.IntOutput `pulumi:"storageUsageBytes"`
	// The slug identifier for the subscription tier to use (`starter`, `basic`, or `professional`)
	SubscriptionTierSlug pulumi.StringOutput `pulumi:"subscriptionTierSlug"`
}

// NewContainerRegistry registers a new resource with the given unique name, arguments, and options.
func NewContainerRegistry(ctx *pulumi.Context,
	name string, args *ContainerRegistryArgs, opts ...pulumi.ResourceOption) (*ContainerRegistry, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.SubscriptionTierSlug == nil {
		return nil, errors.New("invalid value for required argument 'SubscriptionTierSlug'")
	}
	var resource ContainerRegistry
	err := ctx.RegisterResource("digitalocean:index/containerRegistry:ContainerRegistry", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetContainerRegistry gets an existing ContainerRegistry resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetContainerRegistry(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ContainerRegistryState, opts ...pulumi.ResourceOption) (*ContainerRegistry, error) {
	var resource ContainerRegistry
	err := ctx.ReadResource("digitalocean:index/containerRegistry:ContainerRegistry", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ContainerRegistry resources.
type containerRegistryState struct {
	// The date and time when the registry was created
	CreatedAt *string `pulumi:"createdAt"`
	// The URL endpoint of the container registry. Ex: `registry.digitalocean.com/my_registry`
	Endpoint *string `pulumi:"endpoint"`
	// The name of the container_registry
	Name *string `pulumi:"name"`
	// The slug identifier of for region where registry data will be stored. When not provided, a region will be selected automatically.
	Region *string `pulumi:"region"`
	// The domain of the container registry. Ex: `registry.digitalocean.com`
	ServerUrl *string `pulumi:"serverUrl"`
	// The amount of storage used in the registry in bytes.
	StorageUsageBytes *int `pulumi:"storageUsageBytes"`
	// The slug identifier for the subscription tier to use (`starter`, `basic`, or `professional`)
	SubscriptionTierSlug *string `pulumi:"subscriptionTierSlug"`
}

type ContainerRegistryState struct {
	// The date and time when the registry was created
	CreatedAt pulumi.StringPtrInput
	// The URL endpoint of the container registry. Ex: `registry.digitalocean.com/my_registry`
	Endpoint pulumi.StringPtrInput
	// The name of the container_registry
	Name pulumi.StringPtrInput
	// The slug identifier of for region where registry data will be stored. When not provided, a region will be selected automatically.
	Region pulumi.StringPtrInput
	// The domain of the container registry. Ex: `registry.digitalocean.com`
	ServerUrl pulumi.StringPtrInput
	// The amount of storage used in the registry in bytes.
	StorageUsageBytes pulumi.IntPtrInput
	// The slug identifier for the subscription tier to use (`starter`, `basic`, or `professional`)
	SubscriptionTierSlug pulumi.StringPtrInput
}

func (ContainerRegistryState) ElementType() reflect.Type {
	return reflect.TypeOf((*containerRegistryState)(nil)).Elem()
}

type containerRegistryArgs struct {
	// The name of the container_registry
	Name *string `pulumi:"name"`
	// The slug identifier of for region where registry data will be stored. When not provided, a region will be selected automatically.
	Region *string `pulumi:"region"`
	// The slug identifier for the subscription tier to use (`starter`, `basic`, or `professional`)
	SubscriptionTierSlug string `pulumi:"subscriptionTierSlug"`
}

// The set of arguments for constructing a ContainerRegistry resource.
type ContainerRegistryArgs struct {
	// The name of the container_registry
	Name pulumi.StringPtrInput
	// The slug identifier of for region where registry data will be stored. When not provided, a region will be selected automatically.
	Region pulumi.StringPtrInput
	// The slug identifier for the subscription tier to use (`starter`, `basic`, or `professional`)
	SubscriptionTierSlug pulumi.StringInput
}

func (ContainerRegistryArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*containerRegistryArgs)(nil)).Elem()
}

type ContainerRegistryInput interface {
	pulumi.Input

	ToContainerRegistryOutput() ContainerRegistryOutput
	ToContainerRegistryOutputWithContext(ctx context.Context) ContainerRegistryOutput
}

func (*ContainerRegistry) ElementType() reflect.Type {
	return reflect.TypeOf((**ContainerRegistry)(nil)).Elem()
}

func (i *ContainerRegistry) ToContainerRegistryOutput() ContainerRegistryOutput {
	return i.ToContainerRegistryOutputWithContext(context.Background())
}

func (i *ContainerRegistry) ToContainerRegistryOutputWithContext(ctx context.Context) ContainerRegistryOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ContainerRegistryOutput)
}

// ContainerRegistryArrayInput is an input type that accepts ContainerRegistryArray and ContainerRegistryArrayOutput values.
// You can construct a concrete instance of `ContainerRegistryArrayInput` via:
//
//	ContainerRegistryArray{ ContainerRegistryArgs{...} }
type ContainerRegistryArrayInput interface {
	pulumi.Input

	ToContainerRegistryArrayOutput() ContainerRegistryArrayOutput
	ToContainerRegistryArrayOutputWithContext(context.Context) ContainerRegistryArrayOutput
}

type ContainerRegistryArray []ContainerRegistryInput

func (ContainerRegistryArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ContainerRegistry)(nil)).Elem()
}

func (i ContainerRegistryArray) ToContainerRegistryArrayOutput() ContainerRegistryArrayOutput {
	return i.ToContainerRegistryArrayOutputWithContext(context.Background())
}

func (i ContainerRegistryArray) ToContainerRegistryArrayOutputWithContext(ctx context.Context) ContainerRegistryArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ContainerRegistryArrayOutput)
}

// ContainerRegistryMapInput is an input type that accepts ContainerRegistryMap and ContainerRegistryMapOutput values.
// You can construct a concrete instance of `ContainerRegistryMapInput` via:
//
//	ContainerRegistryMap{ "key": ContainerRegistryArgs{...} }
type ContainerRegistryMapInput interface {
	pulumi.Input

	ToContainerRegistryMapOutput() ContainerRegistryMapOutput
	ToContainerRegistryMapOutputWithContext(context.Context) ContainerRegistryMapOutput
}

type ContainerRegistryMap map[string]ContainerRegistryInput

func (ContainerRegistryMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ContainerRegistry)(nil)).Elem()
}

func (i ContainerRegistryMap) ToContainerRegistryMapOutput() ContainerRegistryMapOutput {
	return i.ToContainerRegistryMapOutputWithContext(context.Background())
}

func (i ContainerRegistryMap) ToContainerRegistryMapOutputWithContext(ctx context.Context) ContainerRegistryMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ContainerRegistryMapOutput)
}

type ContainerRegistryOutput struct{ *pulumi.OutputState }

func (ContainerRegistryOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ContainerRegistry)(nil)).Elem()
}

func (o ContainerRegistryOutput) ToContainerRegistryOutput() ContainerRegistryOutput {
	return o
}

func (o ContainerRegistryOutput) ToContainerRegistryOutputWithContext(ctx context.Context) ContainerRegistryOutput {
	return o
}

// The date and time when the registry was created
func (o ContainerRegistryOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *ContainerRegistry) pulumi.StringOutput { return v.CreatedAt }).(pulumi.StringOutput)
}

// The URL endpoint of the container registry. Ex: `registry.digitalocean.com/my_registry`
func (o ContainerRegistryOutput) Endpoint() pulumi.StringOutput {
	return o.ApplyT(func(v *ContainerRegistry) pulumi.StringOutput { return v.Endpoint }).(pulumi.StringOutput)
}

// The name of the container_registry
func (o ContainerRegistryOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ContainerRegistry) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The slug identifier of for region where registry data will be stored. When not provided, a region will be selected automatically.
func (o ContainerRegistryOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v *ContainerRegistry) pulumi.StringOutput { return v.Region }).(pulumi.StringOutput)
}

// The domain of the container registry. Ex: `registry.digitalocean.com`
func (o ContainerRegistryOutput) ServerUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *ContainerRegistry) pulumi.StringOutput { return v.ServerUrl }).(pulumi.StringOutput)
}

// The amount of storage used in the registry in bytes.
func (o ContainerRegistryOutput) StorageUsageBytes() pulumi.IntOutput {
	return o.ApplyT(func(v *ContainerRegistry) pulumi.IntOutput { return v.StorageUsageBytes }).(pulumi.IntOutput)
}

// The slug identifier for the subscription tier to use (`starter`, `basic`, or `professional`)
func (o ContainerRegistryOutput) SubscriptionTierSlug() pulumi.StringOutput {
	return o.ApplyT(func(v *ContainerRegistry) pulumi.StringOutput { return v.SubscriptionTierSlug }).(pulumi.StringOutput)
}

type ContainerRegistryArrayOutput struct{ *pulumi.OutputState }

func (ContainerRegistryArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ContainerRegistry)(nil)).Elem()
}

func (o ContainerRegistryArrayOutput) ToContainerRegistryArrayOutput() ContainerRegistryArrayOutput {
	return o
}

func (o ContainerRegistryArrayOutput) ToContainerRegistryArrayOutputWithContext(ctx context.Context) ContainerRegistryArrayOutput {
	return o
}

func (o ContainerRegistryArrayOutput) Index(i pulumi.IntInput) ContainerRegistryOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ContainerRegistry {
		return vs[0].([]*ContainerRegistry)[vs[1].(int)]
	}).(ContainerRegistryOutput)
}

type ContainerRegistryMapOutput struct{ *pulumi.OutputState }

func (ContainerRegistryMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ContainerRegistry)(nil)).Elem()
}

func (o ContainerRegistryMapOutput) ToContainerRegistryMapOutput() ContainerRegistryMapOutput {
	return o
}

func (o ContainerRegistryMapOutput) ToContainerRegistryMapOutputWithContext(ctx context.Context) ContainerRegistryMapOutput {
	return o
}

func (o ContainerRegistryMapOutput) MapIndex(k pulumi.StringInput) ContainerRegistryOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ContainerRegistry {
		return vs[0].(map[string]*ContainerRegistry)[vs[1].(string)]
	}).(ContainerRegistryOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ContainerRegistryInput)(nil)).Elem(), &ContainerRegistry{})
	pulumi.RegisterInputType(reflect.TypeOf((*ContainerRegistryArrayInput)(nil)).Elem(), ContainerRegistryArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ContainerRegistryMapInput)(nil)).Elem(), ContainerRegistryMap{})
	pulumi.RegisterOutputType(ContainerRegistryOutput{})
	pulumi.RegisterOutputType(ContainerRegistryArrayOutput{})
	pulumi.RegisterOutputType(ContainerRegistryMapOutput{})
}
