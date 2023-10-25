// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides access to the available DigitalOcean Kubernetes Service versions.
 *
 * ## Example Usage
 * ### Output a list of all available versions
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * export = async () => {
 *     const example = await digitalocean.getKubernetesVersions({});
 *     return {
 *         "k8s-versions": example.validVersions,
 *     };
 * }
 * ```
 * ### Create a Kubernetes cluster using the most recent version available
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const example = digitalocean.getKubernetesVersions({});
 * const example_cluster = new digitalocean.KubernetesCluster("example-cluster", {
 *     region: "lon1",
 *     version: example.then(example => example.latestVersion),
 *     nodePool: {
 *         name: "default",
 *         size: "s-1vcpu-2gb",
 *         nodeCount: 3,
 *     },
 * });
 * ```
 * ### Pin a Kubernetes cluster to a specific minor version
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const example = digitalocean.getKubernetesVersions({
 *     versionPrefix: "1.22.",
 * });
 * const example_cluster = new digitalocean.KubernetesCluster("example-cluster", {
 *     region: "lon1",
 *     version: example.then(example => example.latestVersion),
 *     nodePool: {
 *         name: "default",
 *         size: "s-1vcpu-2gb",
 *         nodeCount: 3,
 *     },
 * });
 * ```
 */
export function getKubernetesVersions(args?: GetKubernetesVersionsArgs, opts?: pulumi.InvokeOptions): Promise<GetKubernetesVersionsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("digitalocean:index/getKubernetesVersions:getKubernetesVersions", {
        "versionPrefix": args.versionPrefix,
    }, opts);
}

/**
 * A collection of arguments for invoking getKubernetesVersions.
 */
export interface GetKubernetesVersionsArgs {
    /**
     * If provided, the provider will only return versions that match the string prefix. For example, `1.15.` will match all 1.15.x series releases.
     */
    versionPrefix?: string;
}

/**
 * A collection of values returned by getKubernetesVersions.
 */
export interface GetKubernetesVersionsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The most recent version available.
     */
    readonly latestVersion: string;
    /**
     * A list of available versions.
     */
    readonly validVersions: string[];
    readonly versionPrefix?: string;
}
/**
 * Provides access to the available DigitalOcean Kubernetes Service versions.
 *
 * ## Example Usage
 * ### Output a list of all available versions
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * export = async () => {
 *     const example = await digitalocean.getKubernetesVersions({});
 *     return {
 *         "k8s-versions": example.validVersions,
 *     };
 * }
 * ```
 * ### Create a Kubernetes cluster using the most recent version available
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const example = digitalocean.getKubernetesVersions({});
 * const example_cluster = new digitalocean.KubernetesCluster("example-cluster", {
 *     region: "lon1",
 *     version: example.then(example => example.latestVersion),
 *     nodePool: {
 *         name: "default",
 *         size: "s-1vcpu-2gb",
 *         nodeCount: 3,
 *     },
 * });
 * ```
 * ### Pin a Kubernetes cluster to a specific minor version
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const example = digitalocean.getKubernetesVersions({
 *     versionPrefix: "1.22.",
 * });
 * const example_cluster = new digitalocean.KubernetesCluster("example-cluster", {
 *     region: "lon1",
 *     version: example.then(example => example.latestVersion),
 *     nodePool: {
 *         name: "default",
 *         size: "s-1vcpu-2gb",
 *         nodeCount: 3,
 *     },
 * });
 * ```
 */
export function getKubernetesVersionsOutput(args?: GetKubernetesVersionsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetKubernetesVersionsResult> {
    return pulumi.output(args).apply((a: any) => getKubernetesVersions(a, opts))
}

/**
 * A collection of arguments for invoking getKubernetesVersions.
 */
export interface GetKubernetesVersionsOutputArgs {
    /**
     * If provided, the provider will only return versions that match the string prefix. For example, `1.15.` will match all 1.15.x series releases.
     */
    versionPrefix?: pulumi.Input<string>;
}
