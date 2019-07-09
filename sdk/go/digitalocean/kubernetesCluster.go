// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides a DigitalOcean Kubernetes cluster resource. This can be used to create, delete, and modify clusters. For more information see the [official documentation](https://www.digitalocean.com/docs/kubernetes/).
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-digitalocean/blob/master/website/docs/r/kubernetes_cluster.html.markdown.
type KubernetesCluster struct {
	s *pulumi.ResourceState
}

// NewKubernetesCluster registers a new resource with the given unique name, arguments, and options.
func NewKubernetesCluster(ctx *pulumi.Context,
	name string, args *KubernetesClusterArgs, opts ...pulumi.ResourceOpt) (*KubernetesCluster, error) {
	if args == nil || args.NodePool == nil {
		return nil, errors.New("missing required argument 'NodePool'")
	}
	if args == nil || args.Region == nil {
		return nil, errors.New("missing required argument 'Region'")
	}
	if args == nil || args.Version == nil {
		return nil, errors.New("missing required argument 'Version'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["name"] = nil
		inputs["nodePool"] = nil
		inputs["region"] = nil
		inputs["tags"] = nil
		inputs["version"] = nil
	} else {
		inputs["name"] = args.Name
		inputs["nodePool"] = args.NodePool
		inputs["region"] = args.Region
		inputs["tags"] = args.Tags
		inputs["version"] = args.Version
	}
	inputs["clusterSubnet"] = nil
	inputs["createdAt"] = nil
	inputs["endpoint"] = nil
	inputs["ipv4Address"] = nil
	inputs["kubeConfigs"] = nil
	inputs["serviceSubnet"] = nil
	inputs["status"] = nil
	inputs["updatedAt"] = nil
	s, err := ctx.RegisterResource("digitalocean:index/kubernetesCluster:KubernetesCluster", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &KubernetesCluster{s: s}, nil
}

// GetKubernetesCluster gets an existing KubernetesCluster resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetKubernetesCluster(ctx *pulumi.Context,
	name string, id pulumi.ID, state *KubernetesClusterState, opts ...pulumi.ResourceOpt) (*KubernetesCluster, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["clusterSubnet"] = state.ClusterSubnet
		inputs["createdAt"] = state.CreatedAt
		inputs["endpoint"] = state.Endpoint
		inputs["ipv4Address"] = state.Ipv4Address
		inputs["kubeConfigs"] = state.KubeConfigs
		inputs["name"] = state.Name
		inputs["nodePool"] = state.NodePool
		inputs["region"] = state.Region
		inputs["serviceSubnet"] = state.ServiceSubnet
		inputs["status"] = state.Status
		inputs["tags"] = state.Tags
		inputs["updatedAt"] = state.UpdatedAt
		inputs["version"] = state.Version
	}
	s, err := ctx.ReadResource("digitalocean:index/kubernetesCluster:KubernetesCluster", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &KubernetesCluster{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *KubernetesCluster) URN() *pulumi.URNOutput {
	return r.s.URN()
}

// ID is this resource's unique identifier assigned by its provider.
func (r *KubernetesCluster) ID() *pulumi.IDOutput {
	return r.s.ID()
}

// The range of IP addresses in the overlay network of the Kubernetes cluster.
func (r *KubernetesCluster) ClusterSubnet() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["clusterSubnet"])
}

// The date and time when the Kubernetes cluster was created.
func (r *KubernetesCluster) CreatedAt() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["createdAt"])
}

// The base URL of the API server on the Kubernetes master node.
func (r *KubernetesCluster) Endpoint() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["endpoint"])
}

// The public IPv4 address of the Kubernetes master node.
func (r *KubernetesCluster) Ipv4Address() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["ipv4Address"])
}

func (r *KubernetesCluster) KubeConfigs() *pulumi.ArrayOutput {
	return (*pulumi.ArrayOutput)(r.s.State["kubeConfigs"])
}

// A name for the Kubernetes cluster.
func (r *KubernetesCluster) Name() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["name"])
}

// A block representing the cluster's default node pool. Additional node pools may be added to the cluster using the `digitalocean_kubernetes_node_pool` resource. The following arguments may be specified:
// - `name` - (Required) A name for the node pool.
// - `size` - (Required) The slug identifier for the type of Droplet to be used as workers in the node pool.
// - `node_count` - (Required) The number of Droplet instances in the node pool.
// - `tags` - (Optional) A list of tag names to be applied to the Kubernetes cluster.
func (r *KubernetesCluster) NodePool() *pulumi.Output {
	return r.s.State["nodePool"]
}

// The slug identifier for the region where the Kubernetes cluster will be created.
func (r *KubernetesCluster) Region() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["region"])
}

// The range of assignable IP addresses for services running in the Kubernetes cluster.
func (r *KubernetesCluster) ServiceSubnet() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["serviceSubnet"])
}

// A string indicating the current status of the cluster. Potential values include running, provisioning, and errored.
func (r *KubernetesCluster) Status() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["status"])
}

// A list of tag names to be applied to the Kubernetes cluster.
func (r *KubernetesCluster) Tags() *pulumi.ArrayOutput {
	return (*pulumi.ArrayOutput)(r.s.State["tags"])
}

// The date and time when the Kubernetes cluster was last updated.
// * `kube_config.0` - A representation of the Kubernetes cluster's kubeconfig with the following attributes:
// - `raw_config` - The full contents of the Kubernetes cluster's kubeconfig file.
// - `host` - The URL of the API server on the Kubernetes master node.
// - `client_key` - The base64 encoded private key used by clients to access the cluster.
// - `client_certificate` - The base64 encoded public certificate used by clients to access the cluster.
// - `cluster_ca_certificate` - The base64 encoded public certificate for the cluster's certificate authority.
func (r *KubernetesCluster) UpdatedAt() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["updatedAt"])
}

// The slug identifier for the version of Kubernetes used for the cluster.
func (r *KubernetesCluster) Version() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["version"])
}

// Input properties used for looking up and filtering KubernetesCluster resources.
type KubernetesClusterState struct {
	// The range of IP addresses in the overlay network of the Kubernetes cluster.
	ClusterSubnet interface{}
	// The date and time when the Kubernetes cluster was created.
	CreatedAt interface{}
	// The base URL of the API server on the Kubernetes master node.
	Endpoint interface{}
	// The public IPv4 address of the Kubernetes master node.
	Ipv4Address interface{}
	KubeConfigs interface{}
	// A name for the Kubernetes cluster.
	Name interface{}
	// A block representing the cluster's default node pool. Additional node pools may be added to the cluster using the `digitalocean_kubernetes_node_pool` resource. The following arguments may be specified:
	// - `name` - (Required) A name for the node pool.
	// - `size` - (Required) The slug identifier for the type of Droplet to be used as workers in the node pool.
	// - `node_count` - (Required) The number of Droplet instances in the node pool.
	// - `tags` - (Optional) A list of tag names to be applied to the Kubernetes cluster.
	NodePool interface{}
	// The slug identifier for the region where the Kubernetes cluster will be created.
	Region interface{}
	// The range of assignable IP addresses for services running in the Kubernetes cluster.
	ServiceSubnet interface{}
	// A string indicating the current status of the cluster. Potential values include running, provisioning, and errored.
	Status interface{}
	// A list of tag names to be applied to the Kubernetes cluster.
	Tags interface{}
	// The date and time when the Kubernetes cluster was last updated.
	// * `kube_config.0` - A representation of the Kubernetes cluster's kubeconfig with the following attributes:
	// - `raw_config` - The full contents of the Kubernetes cluster's kubeconfig file.
	// - `host` - The URL of the API server on the Kubernetes master node.
	// - `client_key` - The base64 encoded private key used by clients to access the cluster.
	// - `client_certificate` - The base64 encoded public certificate used by clients to access the cluster.
	// - `cluster_ca_certificate` - The base64 encoded public certificate for the cluster's certificate authority.
	UpdatedAt interface{}
	// The slug identifier for the version of Kubernetes used for the cluster.
	Version interface{}
}

// The set of arguments for constructing a KubernetesCluster resource.
type KubernetesClusterArgs struct {
	// A name for the Kubernetes cluster.
	Name interface{}
	// A block representing the cluster's default node pool. Additional node pools may be added to the cluster using the `digitalocean_kubernetes_node_pool` resource. The following arguments may be specified:
	// - `name` - (Required) A name for the node pool.
	// - `size` - (Required) The slug identifier for the type of Droplet to be used as workers in the node pool.
	// - `node_count` - (Required) The number of Droplet instances in the node pool.
	// - `tags` - (Optional) A list of tag names to be applied to the Kubernetes cluster.
	NodePool interface{}
	// The slug identifier for the region where the Kubernetes cluster will be created.
	Region interface{}
	// A list of tag names to be applied to the Kubernetes cluster.
	Tags interface{}
	// The slug identifier for the version of Kubernetes used for the cluster.
	Version interface{}
}
