// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as enums from "./types/enums";
import * as utilities from "./utilities";

/**
 * Provides a DigitalOcean Kubernetes node pool resource. While the default node pool must be defined in the `digitalocean.KubernetesCluster` resource, this resource can be used to add additional ones to a cluster.
 *
 * ## Example Usage
 * ### Basic Example
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const foo = new digitalocean.KubernetesCluster("foo", {
 *     region: "nyc1",
 *     version: "1.22.8-do.1",
 *     nodePool: {
 *         name: "front-end-pool",
 *         size: "s-2vcpu-2gb",
 *         nodeCount: 3,
 *     },
 * });
 * const bar = new digitalocean.KubernetesNodePool("bar", {
 *     clusterId: foo.id,
 *     size: "c-2",
 *     nodeCount: 2,
 *     tags: ["backend"],
 *     labels: {
 *         service: "backend",
 *         priority: "high",
 *     },
 *     taints: [{
 *         key: "workloadKind",
 *         value: "database",
 *         effect: "NoSchedule",
 *     }],
 * });
 * ```
 * ### Autoscaling Example
 *
 * Node pools may also be configured to [autoscale](https://www.digitalocean.com/docs/kubernetes/how-to/autoscale/).
 * For example:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const autoscale_pool_01 = new digitalocean.KubernetesNodePool("autoscale-pool-01", {
 *     clusterId: digitalocean_kubernetes_cluster.foo.id,
 *     size: "s-1vcpu-2gb",
 *     autoScale: true,
 *     minNodes: 1,
 *     maxNodes: 5,
 * });
 * ```
 *
 * ## Import
 *
 * If you are importing an existing Kubernetes cluster with a single node pool, just import the cluster. Additional node pools can be imported by using their `id`, e.g.
 *
 * ```sh
 *  $ pulumi import digitalocean:index/kubernetesNodePool:KubernetesNodePool mynodepool 9d76f410-9284-4436-9633-4066852442c8
 * ```
 *
 *  NoteIf the node pool has the `terraform:default-node-pool` tag, then it is a default node pool for an existing cluster. The provider will refuse to import the node pool in that case because the node pool is managed by the `digitalocean_kubernetes_cluster` resource and not by this `digitalocean_kubernetes_node_pool` resource.
 */
export class KubernetesNodePool extends pulumi.CustomResource {
    /**
     * Get an existing KubernetesNodePool resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: KubernetesNodePoolState, opts?: pulumi.CustomResourceOptions): KubernetesNodePool {
        return new KubernetesNodePool(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'digitalocean:index/kubernetesNodePool:KubernetesNodePool';

    /**
     * Returns true if the given object is an instance of KubernetesNodePool.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is KubernetesNodePool {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === KubernetesNodePool.__pulumiType;
    }

    /**
     * A computed field representing the actual number of nodes in the node pool, which is especially useful when auto-scaling is enabled.
     */
    public /*out*/ readonly actualNodeCount!: pulumi.Output<number>;
    /**
     * Enable auto-scaling of the number of nodes in the node pool within the given min/max range.
     */
    public readonly autoScale!: pulumi.Output<boolean | undefined>;
    /**
     * The ID of the Kubernetes cluster to which the node pool is associated.
     */
    public readonly clusterId!: pulumi.Output<string>;
    /**
     * A map of key/value pairs to apply to nodes in the pool. The labels are exposed in the Kubernetes API as labels in the metadata of the corresponding [Node resources](https://kubernetes.io/docs/concepts/architecture/nodes/).
     */
    public readonly labels!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * If auto-scaling is enabled, this represents the maximum number of nodes that the node pool can be scaled up to.
     */
    public readonly maxNodes!: pulumi.Output<number | undefined>;
    /**
     * If auto-scaling is enabled, this represents the minimum number of nodes that the node pool can be scaled down to.
     */
    public readonly minNodes!: pulumi.Output<number | undefined>;
    /**
     * A name for the node pool.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The number of Droplet instances in the node pool. If auto-scaling is enabled, this should only be set if the desired result is to explicitly reset the number of nodes to this value. If auto-scaling is enabled, and the node count is outside of the given min/max range, it will use the min nodes value.
     */
    public readonly nodeCount!: pulumi.Output<number | undefined>;
    /**
     * A list of nodes in the pool. Each node exports the following attributes:
     */
    public /*out*/ readonly nodes!: pulumi.Output<outputs.KubernetesNodePoolNode[]>;
    /**
     * The slug identifier for the type of Droplet to be used as workers in the node pool.
     */
    public readonly size!: pulumi.Output<string>;
    /**
     * A list of tag names to be applied to the Kubernetes cluster.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;
    /**
     * A list of taints applied to all nodes in the pool.
     *
     * This resource supports customized create timeouts. The default timeout is 30 minutes.
     */
    public readonly taints!: pulumi.Output<outputs.KubernetesNodePoolTaint[] | undefined>;

    /**
     * Create a KubernetesNodePool resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: KubernetesNodePoolArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: KubernetesNodePoolArgs | KubernetesNodePoolState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as KubernetesNodePoolState | undefined;
            resourceInputs["actualNodeCount"] = state ? state.actualNodeCount : undefined;
            resourceInputs["autoScale"] = state ? state.autoScale : undefined;
            resourceInputs["clusterId"] = state ? state.clusterId : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["maxNodes"] = state ? state.maxNodes : undefined;
            resourceInputs["minNodes"] = state ? state.minNodes : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["nodeCount"] = state ? state.nodeCount : undefined;
            resourceInputs["nodes"] = state ? state.nodes : undefined;
            resourceInputs["size"] = state ? state.size : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["taints"] = state ? state.taints : undefined;
        } else {
            const args = argsOrState as KubernetesNodePoolArgs | undefined;
            if ((!args || args.clusterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterId'");
            }
            if ((!args || args.size === undefined) && !opts.urn) {
                throw new Error("Missing required property 'size'");
            }
            resourceInputs["autoScale"] = args ? args.autoScale : undefined;
            resourceInputs["clusterId"] = args ? args.clusterId : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["maxNodes"] = args ? args.maxNodes : undefined;
            resourceInputs["minNodes"] = args ? args.minNodes : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["nodeCount"] = args ? args.nodeCount : undefined;
            resourceInputs["size"] = args ? args.size : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["taints"] = args ? args.taints : undefined;
            resourceInputs["actualNodeCount"] = undefined /*out*/;
            resourceInputs["nodes"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(KubernetesNodePool.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering KubernetesNodePool resources.
 */
export interface KubernetesNodePoolState {
    /**
     * A computed field representing the actual number of nodes in the node pool, which is especially useful when auto-scaling is enabled.
     */
    actualNodeCount?: pulumi.Input<number>;
    /**
     * Enable auto-scaling of the number of nodes in the node pool within the given min/max range.
     */
    autoScale?: pulumi.Input<boolean>;
    /**
     * The ID of the Kubernetes cluster to which the node pool is associated.
     */
    clusterId?: pulumi.Input<string>;
    /**
     * A map of key/value pairs to apply to nodes in the pool. The labels are exposed in the Kubernetes API as labels in the metadata of the corresponding [Node resources](https://kubernetes.io/docs/concepts/architecture/nodes/).
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * If auto-scaling is enabled, this represents the maximum number of nodes that the node pool can be scaled up to.
     */
    maxNodes?: pulumi.Input<number>;
    /**
     * If auto-scaling is enabled, this represents the minimum number of nodes that the node pool can be scaled down to.
     */
    minNodes?: pulumi.Input<number>;
    /**
     * A name for the node pool.
     */
    name?: pulumi.Input<string>;
    /**
     * The number of Droplet instances in the node pool. If auto-scaling is enabled, this should only be set if the desired result is to explicitly reset the number of nodes to this value. If auto-scaling is enabled, and the node count is outside of the given min/max range, it will use the min nodes value.
     */
    nodeCount?: pulumi.Input<number>;
    /**
     * A list of nodes in the pool. Each node exports the following attributes:
     */
    nodes?: pulumi.Input<pulumi.Input<inputs.KubernetesNodePoolNode>[]>;
    /**
     * The slug identifier for the type of Droplet to be used as workers in the node pool.
     */
    size?: pulumi.Input<string | enums.DropletSlug>;
    /**
     * A list of tag names to be applied to the Kubernetes cluster.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A list of taints applied to all nodes in the pool.
     *
     * This resource supports customized create timeouts. The default timeout is 30 minutes.
     */
    taints?: pulumi.Input<pulumi.Input<inputs.KubernetesNodePoolTaint>[]>;
}

/**
 * The set of arguments for constructing a KubernetesNodePool resource.
 */
export interface KubernetesNodePoolArgs {
    /**
     * Enable auto-scaling of the number of nodes in the node pool within the given min/max range.
     */
    autoScale?: pulumi.Input<boolean>;
    /**
     * The ID of the Kubernetes cluster to which the node pool is associated.
     */
    clusterId: pulumi.Input<string>;
    /**
     * A map of key/value pairs to apply to nodes in the pool. The labels are exposed in the Kubernetes API as labels in the metadata of the corresponding [Node resources](https://kubernetes.io/docs/concepts/architecture/nodes/).
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * If auto-scaling is enabled, this represents the maximum number of nodes that the node pool can be scaled up to.
     */
    maxNodes?: pulumi.Input<number>;
    /**
     * If auto-scaling is enabled, this represents the minimum number of nodes that the node pool can be scaled down to.
     */
    minNodes?: pulumi.Input<number>;
    /**
     * A name for the node pool.
     */
    name?: pulumi.Input<string>;
    /**
     * The number of Droplet instances in the node pool. If auto-scaling is enabled, this should only be set if the desired result is to explicitly reset the number of nodes to this value. If auto-scaling is enabled, and the node count is outside of the given min/max range, it will use the min nodes value.
     */
    nodeCount?: pulumi.Input<number>;
    /**
     * The slug identifier for the type of Droplet to be used as workers in the node pool.
     */
    size: pulumi.Input<string | enums.DropletSlug>;
    /**
     * A list of tag names to be applied to the Kubernetes cluster.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A list of taints applied to all nodes in the pool.
     *
     * This resource supports customized create timeouts. The default timeout is 30 minutes.
     */
    taints?: pulumi.Input<pulumi.Input<inputs.KubernetesNodePoolTaint>[]>;
}
