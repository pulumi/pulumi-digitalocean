// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// Before importing a Kubernetes cluster, the cluster's default node pool must be tagged with the `terraform:default-node-pool` tag. The provider will automatically add this tag if the cluster has a single node pool. Clusters with more than one node pool, however, will require that you manually add the `terraform:default-node-pool` tag to the node pool that you intend to be the default node pool. Then the Kubernetes cluster and all of its node pools can be imported using the cluster's `id`, e.g.
//
// ```sh
//  $ pulumi import digitalocean:index/kubernetesCluster:KubernetesCluster mycluster 1b8b2100-0e9f-4e8f-ad78-9eb578c2a0af
// ```
type KubernetesCluster struct {
	pulumi.CustomResourceState

	// A boolean value indicating whether the cluster will be automatically upgraded to new patch releases during its maintenance window.
	AutoUpgrade pulumi.BoolPtrOutput `pulumi:"autoUpgrade"`
	// The range of IP addresses in the overlay network of the Kubernetes cluster.
	ClusterSubnet pulumi.StringOutput `pulumi:"clusterSubnet"`
	// The date and time when the node was created.
	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// The base URL of the API server on the Kubernetes master node.
	Endpoint pulumi.StringOutput `pulumi:"endpoint"`
	// The public IPv4 address of the Kubernetes master node.
	Ipv4Address pulumi.StringOutput                    `pulumi:"ipv4Address"`
	KubeConfigs KubernetesClusterKubeConfigArrayOutput `pulumi:"kubeConfigs"`
	// A name for the node pool.
	Name pulumi.StringOutput `pulumi:"name"`
	// A block representing the cluster's default node pool. Additional node pools may be added to the cluster using the `KubernetesNodePool` resource. The following arguments may be specified:
	NodePool KubernetesClusterNodePoolOutput `pulumi:"nodePool"`
	// The slug identifier for the region where the Kubernetes cluster will be created.
	Region pulumi.StringOutput `pulumi:"region"`
	// The range of assignable IP addresses for services running in the Kubernetes cluster.
	ServiceSubnet pulumi.StringOutput `pulumi:"serviceSubnet"`
	// A string indicating the current status of the individual node.
	Status pulumi.StringOutput `pulumi:"status"`
	// Enable/disable surge upgrades for a cluster. Default: false
	SurgeUpgrade pulumi.BoolPtrOutput `pulumi:"surgeUpgrade"`
	// A list of tag names to be applied to the Kubernetes cluster.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
	// The date and time when the node was last updated.
	UpdatedAt pulumi.StringOutput `pulumi:"updatedAt"`
	// The slug identifier for the version of Kubernetes used for the cluster. Use [doctl](https://github.com/digitalocean/doctl) to find the available versions `doctl kubernetes options versions`. (**Note:** A cluster may only be upgraded to newer versions in-place. If the version is decreased, a new resource will be created.)
	Version pulumi.StringOutput `pulumi:"version"`
	// The ID of the VPC where the Kubernetes cluster will be located.
	VpcUuid pulumi.StringOutput `pulumi:"vpcUuid"`
}

// NewKubernetesCluster registers a new resource with the given unique name, arguments, and options.
func NewKubernetesCluster(ctx *pulumi.Context,
	name string, args *KubernetesClusterArgs, opts ...pulumi.ResourceOption) (*KubernetesCluster, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NodePool == nil {
		return nil, errors.New("invalid value for required argument 'NodePool'")
	}
	if args.Region == nil {
		return nil, errors.New("invalid value for required argument 'Region'")
	}
	if args.Version == nil {
		return nil, errors.New("invalid value for required argument 'Version'")
	}
	var resource KubernetesCluster
	err := ctx.RegisterResource("digitalocean:index/kubernetesCluster:KubernetesCluster", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetKubernetesCluster gets an existing KubernetesCluster resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetKubernetesCluster(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *KubernetesClusterState, opts ...pulumi.ResourceOption) (*KubernetesCluster, error) {
	var resource KubernetesCluster
	err := ctx.ReadResource("digitalocean:index/kubernetesCluster:KubernetesCluster", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering KubernetesCluster resources.
type kubernetesClusterState struct {
	// A boolean value indicating whether the cluster will be automatically upgraded to new patch releases during its maintenance window.
	AutoUpgrade *bool `pulumi:"autoUpgrade"`
	// The range of IP addresses in the overlay network of the Kubernetes cluster.
	ClusterSubnet *string `pulumi:"clusterSubnet"`
	// The date and time when the node was created.
	CreatedAt *string `pulumi:"createdAt"`
	// The base URL of the API server on the Kubernetes master node.
	Endpoint *string `pulumi:"endpoint"`
	// The public IPv4 address of the Kubernetes master node.
	Ipv4Address *string                       `pulumi:"ipv4Address"`
	KubeConfigs []KubernetesClusterKubeConfig `pulumi:"kubeConfigs"`
	// A name for the node pool.
	Name *string `pulumi:"name"`
	// A block representing the cluster's default node pool. Additional node pools may be added to the cluster using the `KubernetesNodePool` resource. The following arguments may be specified:
	NodePool *KubernetesClusterNodePool `pulumi:"nodePool"`
	// The slug identifier for the region where the Kubernetes cluster will be created.
	Region *string `pulumi:"region"`
	// The range of assignable IP addresses for services running in the Kubernetes cluster.
	ServiceSubnet *string `pulumi:"serviceSubnet"`
	// A string indicating the current status of the individual node.
	Status *string `pulumi:"status"`
	// Enable/disable surge upgrades for a cluster. Default: false
	SurgeUpgrade *bool `pulumi:"surgeUpgrade"`
	// A list of tag names to be applied to the Kubernetes cluster.
	Tags []string `pulumi:"tags"`
	// The date and time when the node was last updated.
	UpdatedAt *string `pulumi:"updatedAt"`
	// The slug identifier for the version of Kubernetes used for the cluster. Use [doctl](https://github.com/digitalocean/doctl) to find the available versions `doctl kubernetes options versions`. (**Note:** A cluster may only be upgraded to newer versions in-place. If the version is decreased, a new resource will be created.)
	Version *string `pulumi:"version"`
	// The ID of the VPC where the Kubernetes cluster will be located.
	VpcUuid *string `pulumi:"vpcUuid"`
}

type KubernetesClusterState struct {
	// A boolean value indicating whether the cluster will be automatically upgraded to new patch releases during its maintenance window.
	AutoUpgrade pulumi.BoolPtrInput
	// The range of IP addresses in the overlay network of the Kubernetes cluster.
	ClusterSubnet pulumi.StringPtrInput
	// The date and time when the node was created.
	CreatedAt pulumi.StringPtrInput
	// The base URL of the API server on the Kubernetes master node.
	Endpoint pulumi.StringPtrInput
	// The public IPv4 address of the Kubernetes master node.
	Ipv4Address pulumi.StringPtrInput
	KubeConfigs KubernetesClusterKubeConfigArrayInput
	// A name for the node pool.
	Name pulumi.StringPtrInput
	// A block representing the cluster's default node pool. Additional node pools may be added to the cluster using the `KubernetesNodePool` resource. The following arguments may be specified:
	NodePool KubernetesClusterNodePoolPtrInput
	// The slug identifier for the region where the Kubernetes cluster will be created.
	Region pulumi.StringPtrInput
	// The range of assignable IP addresses for services running in the Kubernetes cluster.
	ServiceSubnet pulumi.StringPtrInput
	// A string indicating the current status of the individual node.
	Status pulumi.StringPtrInput
	// Enable/disable surge upgrades for a cluster. Default: false
	SurgeUpgrade pulumi.BoolPtrInput
	// A list of tag names to be applied to the Kubernetes cluster.
	Tags pulumi.StringArrayInput
	// The date and time when the node was last updated.
	UpdatedAt pulumi.StringPtrInput
	// The slug identifier for the version of Kubernetes used for the cluster. Use [doctl](https://github.com/digitalocean/doctl) to find the available versions `doctl kubernetes options versions`. (**Note:** A cluster may only be upgraded to newer versions in-place. If the version is decreased, a new resource will be created.)
	Version pulumi.StringPtrInput
	// The ID of the VPC where the Kubernetes cluster will be located.
	VpcUuid pulumi.StringPtrInput
}

func (KubernetesClusterState) ElementType() reflect.Type {
	return reflect.TypeOf((*kubernetesClusterState)(nil)).Elem()
}

type kubernetesClusterArgs struct {
	// A boolean value indicating whether the cluster will be automatically upgraded to new patch releases during its maintenance window.
	AutoUpgrade *bool `pulumi:"autoUpgrade"`
	// A name for the node pool.
	Name *string `pulumi:"name"`
	// A block representing the cluster's default node pool. Additional node pools may be added to the cluster using the `KubernetesNodePool` resource. The following arguments may be specified:
	NodePool KubernetesClusterNodePool `pulumi:"nodePool"`
	// The slug identifier for the region where the Kubernetes cluster will be created.
	Region string `pulumi:"region"`
	// Enable/disable surge upgrades for a cluster. Default: false
	SurgeUpgrade *bool `pulumi:"surgeUpgrade"`
	// A list of tag names to be applied to the Kubernetes cluster.
	Tags []string `pulumi:"tags"`
	// The slug identifier for the version of Kubernetes used for the cluster. Use [doctl](https://github.com/digitalocean/doctl) to find the available versions `doctl kubernetes options versions`. (**Note:** A cluster may only be upgraded to newer versions in-place. If the version is decreased, a new resource will be created.)
	Version string `pulumi:"version"`
	// The ID of the VPC where the Kubernetes cluster will be located.
	VpcUuid *string `pulumi:"vpcUuid"`
}

// The set of arguments for constructing a KubernetesCluster resource.
type KubernetesClusterArgs struct {
	// A boolean value indicating whether the cluster will be automatically upgraded to new patch releases during its maintenance window.
	AutoUpgrade pulumi.BoolPtrInput
	// A name for the node pool.
	Name pulumi.StringPtrInput
	// A block representing the cluster's default node pool. Additional node pools may be added to the cluster using the `KubernetesNodePool` resource. The following arguments may be specified:
	NodePool KubernetesClusterNodePoolInput
	// The slug identifier for the region where the Kubernetes cluster will be created.
	Region pulumi.StringInput
	// Enable/disable surge upgrades for a cluster. Default: false
	SurgeUpgrade pulumi.BoolPtrInput
	// A list of tag names to be applied to the Kubernetes cluster.
	Tags pulumi.StringArrayInput
	// The slug identifier for the version of Kubernetes used for the cluster. Use [doctl](https://github.com/digitalocean/doctl) to find the available versions `doctl kubernetes options versions`. (**Note:** A cluster may only be upgraded to newer versions in-place. If the version is decreased, a new resource will be created.)
	Version pulumi.StringInput
	// The ID of the VPC where the Kubernetes cluster will be located.
	VpcUuid pulumi.StringPtrInput
}

func (KubernetesClusterArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*kubernetesClusterArgs)(nil)).Elem()
}

type KubernetesClusterInput interface {
	pulumi.Input

	ToKubernetesClusterOutput() KubernetesClusterOutput
	ToKubernetesClusterOutputWithContext(ctx context.Context) KubernetesClusterOutput
}

func (*KubernetesCluster) ElementType() reflect.Type {
	return reflect.TypeOf((*KubernetesCluster)(nil))
}

func (i *KubernetesCluster) ToKubernetesClusterOutput() KubernetesClusterOutput {
	return i.ToKubernetesClusterOutputWithContext(context.Background())
}

func (i *KubernetesCluster) ToKubernetesClusterOutputWithContext(ctx context.Context) KubernetesClusterOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KubernetesClusterOutput)
}

func (i *KubernetesCluster) ToKubernetesClusterPtrOutput() KubernetesClusterPtrOutput {
	return i.ToKubernetesClusterPtrOutputWithContext(context.Background())
}

func (i *KubernetesCluster) ToKubernetesClusterPtrOutputWithContext(ctx context.Context) KubernetesClusterPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KubernetesClusterPtrOutput)
}

type KubernetesClusterPtrInput interface {
	pulumi.Input

	ToKubernetesClusterPtrOutput() KubernetesClusterPtrOutput
	ToKubernetesClusterPtrOutputWithContext(ctx context.Context) KubernetesClusterPtrOutput
}

type kubernetesClusterPtrType KubernetesClusterArgs

func (*kubernetesClusterPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**KubernetesCluster)(nil))
}

func (i *kubernetesClusterPtrType) ToKubernetesClusterPtrOutput() KubernetesClusterPtrOutput {
	return i.ToKubernetesClusterPtrOutputWithContext(context.Background())
}

func (i *kubernetesClusterPtrType) ToKubernetesClusterPtrOutputWithContext(ctx context.Context) KubernetesClusterPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KubernetesClusterPtrOutput)
}

// KubernetesClusterArrayInput is an input type that accepts KubernetesClusterArray and KubernetesClusterArrayOutput values.
// You can construct a concrete instance of `KubernetesClusterArrayInput` via:
//
//          KubernetesClusterArray{ KubernetesClusterArgs{...} }
type KubernetesClusterArrayInput interface {
	pulumi.Input

	ToKubernetesClusterArrayOutput() KubernetesClusterArrayOutput
	ToKubernetesClusterArrayOutputWithContext(context.Context) KubernetesClusterArrayOutput
}

type KubernetesClusterArray []KubernetesClusterInput

func (KubernetesClusterArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*KubernetesCluster)(nil))
}

func (i KubernetesClusterArray) ToKubernetesClusterArrayOutput() KubernetesClusterArrayOutput {
	return i.ToKubernetesClusterArrayOutputWithContext(context.Background())
}

func (i KubernetesClusterArray) ToKubernetesClusterArrayOutputWithContext(ctx context.Context) KubernetesClusterArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KubernetesClusterArrayOutput)
}

// KubernetesClusterMapInput is an input type that accepts KubernetesClusterMap and KubernetesClusterMapOutput values.
// You can construct a concrete instance of `KubernetesClusterMapInput` via:
//
//          KubernetesClusterMap{ "key": KubernetesClusterArgs{...} }
type KubernetesClusterMapInput interface {
	pulumi.Input

	ToKubernetesClusterMapOutput() KubernetesClusterMapOutput
	ToKubernetesClusterMapOutputWithContext(context.Context) KubernetesClusterMapOutput
}

type KubernetesClusterMap map[string]KubernetesClusterInput

func (KubernetesClusterMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*KubernetesCluster)(nil))
}

func (i KubernetesClusterMap) ToKubernetesClusterMapOutput() KubernetesClusterMapOutput {
	return i.ToKubernetesClusterMapOutputWithContext(context.Background())
}

func (i KubernetesClusterMap) ToKubernetesClusterMapOutputWithContext(ctx context.Context) KubernetesClusterMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KubernetesClusterMapOutput)
}

type KubernetesClusterOutput struct {
	*pulumi.OutputState
}

func (KubernetesClusterOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*KubernetesCluster)(nil))
}

func (o KubernetesClusterOutput) ToKubernetesClusterOutput() KubernetesClusterOutput {
	return o
}

func (o KubernetesClusterOutput) ToKubernetesClusterOutputWithContext(ctx context.Context) KubernetesClusterOutput {
	return o
}

func (o KubernetesClusterOutput) ToKubernetesClusterPtrOutput() KubernetesClusterPtrOutput {
	return o.ToKubernetesClusterPtrOutputWithContext(context.Background())
}

func (o KubernetesClusterOutput) ToKubernetesClusterPtrOutputWithContext(ctx context.Context) KubernetesClusterPtrOutput {
	return o.ApplyT(func(v KubernetesCluster) *KubernetesCluster {
		return &v
	}).(KubernetesClusterPtrOutput)
}

type KubernetesClusterPtrOutput struct {
	*pulumi.OutputState
}

func (KubernetesClusterPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**KubernetesCluster)(nil))
}

func (o KubernetesClusterPtrOutput) ToKubernetesClusterPtrOutput() KubernetesClusterPtrOutput {
	return o
}

func (o KubernetesClusterPtrOutput) ToKubernetesClusterPtrOutputWithContext(ctx context.Context) KubernetesClusterPtrOutput {
	return o
}

type KubernetesClusterArrayOutput struct{ *pulumi.OutputState }

func (KubernetesClusterArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]KubernetesCluster)(nil))
}

func (o KubernetesClusterArrayOutput) ToKubernetesClusterArrayOutput() KubernetesClusterArrayOutput {
	return o
}

func (o KubernetesClusterArrayOutput) ToKubernetesClusterArrayOutputWithContext(ctx context.Context) KubernetesClusterArrayOutput {
	return o
}

func (o KubernetesClusterArrayOutput) Index(i pulumi.IntInput) KubernetesClusterOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) KubernetesCluster {
		return vs[0].([]KubernetesCluster)[vs[1].(int)]
	}).(KubernetesClusterOutput)
}

type KubernetesClusterMapOutput struct{ *pulumi.OutputState }

func (KubernetesClusterMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]KubernetesCluster)(nil))
}

func (o KubernetesClusterMapOutput) ToKubernetesClusterMapOutput() KubernetesClusterMapOutput {
	return o
}

func (o KubernetesClusterMapOutput) ToKubernetesClusterMapOutputWithContext(ctx context.Context) KubernetesClusterMapOutput {
	return o
}

func (o KubernetesClusterMapOutput) MapIndex(k pulumi.StringInput) KubernetesClusterOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) KubernetesCluster {
		return vs[0].(map[string]KubernetesCluster)[vs[1].(string)]
	}).(KubernetesClusterOutput)
}

func init() {
	pulumi.RegisterOutputType(KubernetesClusterOutput{})
	pulumi.RegisterOutputType(KubernetesClusterPtrOutput{})
	pulumi.RegisterOutputType(KubernetesClusterArrayOutput{})
	pulumi.RegisterOutputType(KubernetesClusterMapOutput{})
}
