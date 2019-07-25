// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-digitalocean/blob/master/website/docs/d/kubernetes_cluster.html.markdown.
 */
export function getKubernetesCluster(args: GetKubernetesClusterArgs, opts?: pulumi.InvokeOptions): Promise<GetKubernetesClusterResult> & GetKubernetesClusterResult {
    const promise: Promise<GetKubernetesClusterResult> = pulumi.runtime.invoke("digitalocean:index/getKubernetesCluster:getKubernetesCluster", {
        "name": args.name,
        "tags": args.tags,
    }, opts);

    return pulumi.utils.liftProperties(promise, opts);
}

/**
 * A collection of arguments for invoking getKubernetesCluster.
 */
export interface GetKubernetesClusterArgs {
    /**
     * The name of Kubernetes cluster.
     */
    readonly name: string;
    readonly tags?: string[];
}

/**
 * A collection of values returned by getKubernetesCluster.
 */
export interface GetKubernetesClusterResult {
    /**
     * The range of IP addresses in the overlay network of the Kubernetes cluster.
     */
    readonly clusterSubnet: string;
    /**
     * The date and time when the Kubernetes cluster was created.
     */
    readonly createdAt: string;
    /**
     * The base URL of the API server on the Kubernetes master node.
     */
    readonly endpoint: string;
    /**
     * The public IPv4 address of the Kubernetes master node.
     */
    readonly ipv4Address: string;
    readonly kubeConfigs: { clientCertificate: string, clientKey: string, clusterCaCertificate: string, host: string, rawConfig: string }[];
    readonly name: string;
    /**
     * A list of node pools associated with the cluster. Each node pool exports the following attributes:
     * - `id` -  The unique ID that can be used to identify and reference the node pool.
     * - `name` - The name of the node pool.
     * - `size` - The slug identifier for the type of Droplet used as workers in the node pool.
     * - `node_count` - The number of Droplet instances in the node pool.
     * - `tags` - A list of tag names applied to the node pool.
     * - `nodes` - A list of nodes in the pool. Each node exports the following attributes:
     * + `id` -  A unique ID that can be used to identify and reference the node.
     * + `name` - The auto-generated name for the node.
     * + `status` -  A string indicating the current status of the individual node.
     * + `created_at` - The date and time when the node was created.
     * + `updated_at` - The date and time when the node was last updated.
     */
    readonly nodePools: { id: string, name: string, nodeCount: number, nodes: { createdAt: string, id: string, name: string, status: string, updatedAt: string }[], size: string, tags?: string[] }[];
    /**
     * The slug identifier for the region where the Kubernetes cluster is located.
     */
    readonly region: string;
    /**
     * The range of assignable IP addresses for services running in the Kubernetes cluster.
     */
    readonly serviceSubnet: string;
    /**
     * A string indicating the current status of the cluster. Potential values include running, provisioning, and errored.
     */
    readonly status: string;
    /**
     * A list of tag names to be applied to the Kubernetes cluster.
     */
    readonly tags?: string[];
    /**
     * The date and time when the Kubernetes cluster was last updated.
     * * `kube_config.0` - A representation of the Kubernetes cluster's kubeconfig with the following attributes:
     * - `raw_config` - The full contents of the Kubernetes cluster's kubeconfig file.
     * - `host` - The URL of the API server on the Kubernetes master node.
     * - `client_key` - The base64 encoded private key used by clients to access the cluster.
     * - `client_certificate` - The base64 encoded public certificate used by clients to access the cluster.
     * - `cluster_ca_certificate` - The base64 encoded public certificate for the cluster's certificate authority.
     */
    readonly updatedAt: string;
    /**
     * The slug identifier for the version of Kubernetes used for the cluster.
     */
    readonly version: string;
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
