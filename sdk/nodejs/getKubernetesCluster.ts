// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as enums from "./types/enums";
import * as utilities from "./utilities";

/**
 * Retrieves information about a DigitalOcean Kubernetes cluster for use in other resources. This data source provides all of the cluster's properties as configured on your DigitalOcean account. This is useful if the cluster in question is not managed by the provider.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const example = digitalocean.getKubernetesCluster({
 *     name: "prod-cluster-01",
 * });
 * ```
 */
export function getKubernetesCluster(args: GetKubernetesClusterArgs, opts?: pulumi.InvokeOptions): Promise<GetKubernetesClusterResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("digitalocean:index/getKubernetesCluster:getKubernetesCluster", {
        "name": args.name,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getKubernetesCluster.
 */
export interface GetKubernetesClusterArgs {
    /**
     * The name of Kubernetes cluster.
     */
    name: string;
    /**
     * A list of tag names applied to the node pool.
     */
    tags?: string[];
}

/**
 * A collection of values returned by getKubernetesCluster.
 */
export interface GetKubernetesClusterResult {
    /**
     * A boolean value indicating whether the cluster will be automatically upgraded to new patch releases during its maintenance window.
     */
    readonly autoUpgrade: boolean;
    /**
     * The range of IP addresses in the overlay network of the Kubernetes cluster.
     */
    readonly clusterSubnet: string;
    /**
     * The date and time when the node was created.
     */
    readonly createdAt: string;
    /**
     * The base URL of the API server on the Kubernetes master node.
     */
    readonly endpoint: string;
    readonly ha: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The public IPv4 address of the Kubernetes master node.
     */
    readonly ipv4Address: string;
    /**
     * A representation of the Kubernetes cluster's kubeconfig with the following attributes:
     */
    readonly kubeConfigs: outputs.GetKubernetesClusterKubeConfig[];
    /**
     * The maintenance policy of the Kubernetes cluster. Digital Ocean has a default maintenancen window.
     */
    readonly maintenancePolicies: outputs.GetKubernetesClusterMaintenancePolicy[];
    /**
     * The auto-generated name for the node.
     */
    readonly name: string;
    /**
     * A list of node pools associated with the cluster. Each node pool exports the following attributes:
     */
    readonly nodePools: outputs.GetKubernetesClusterNodePool[];
    /**
     * The slug identifier for the region where the Kubernetes cluster is located.
     */
    readonly region: string;
    /**
     * The range of assignable IP addresses for services running in the Kubernetes cluster.
     */
    readonly serviceSubnet: string;
    /**
     * A string indicating the current status of the individual node.
     */
    readonly status: string;
    readonly surgeUpgrade: boolean;
    /**
     * A list of tag names applied to the node pool.
     */
    readonly tags?: string[];
    /**
     * The date and time when the node was last updated.
     */
    readonly updatedAt: string;
    /**
     * The uniform resource name (URN) for the Kubernetes cluster.
     */
    readonly urn: string;
    /**
     * The slug identifier for the version of Kubernetes used for the cluster.
     */
    readonly version: string;
    /**
     * The ID of the VPC where the Kubernetes cluster is located.
     */
    readonly vpcUuid: string;
}
/**
 * Retrieves information about a DigitalOcean Kubernetes cluster for use in other resources. This data source provides all of the cluster's properties as configured on your DigitalOcean account. This is useful if the cluster in question is not managed by the provider.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const example = digitalocean.getKubernetesCluster({
 *     name: "prod-cluster-01",
 * });
 * ```
 */
export function getKubernetesClusterOutput(args: GetKubernetesClusterOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetKubernetesClusterResult> {
    return pulumi.output(args).apply((a: any) => getKubernetesCluster(a, opts))
}

/**
 * A collection of arguments for invoking getKubernetesCluster.
 */
export interface GetKubernetesClusterOutputArgs {
    /**
     * The name of Kubernetes cluster.
     */
    name: pulumi.Input<string>;
    /**
     * A list of tag names applied to the node pool.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
}
