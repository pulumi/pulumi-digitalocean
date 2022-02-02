// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Get information on a container registry. This data source provides the name as
 * configured on your DigitalOcean account. This is useful if the container
 * registry name in question is not managed by this provider or you need validate if
 * the container registry exists in the account.
 *
 * An error is triggered if the provided container registry name does not exist.
 *
 * ## Example Usage
 * ### Basic Example
 *
 * Get the container registry:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const example = pulumi.output(digitalocean.getContainerRegistry({
 *     name: "example",
 * }));
 * ```
 */
export function getContainerRegistry(args: GetContainerRegistryArgs, opts?: pulumi.InvokeOptions): Promise<GetContainerRegistryResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("digitalocean:index/getContainerRegistry:getContainerRegistry", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getContainerRegistry.
 */
export interface GetContainerRegistryArgs {
    /**
     * The name of the container registry.
     */
    name: string;
}

/**
 * A collection of values returned by getContainerRegistry.
 */
export interface GetContainerRegistryResult {
    readonly endpoint: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The name of the container registry
     */
    readonly name: string;
    readonly serverUrl: string;
    /**
     * The slug identifier for the subscription tier
     * * `endpoint`: The URL endpoint of the container registry. Ex: `registry.digitalocean.com/my_registry`
     * * `serverUrl`: The domain of the container registry. Ex: `registry.digitalocean.com`
     */
    readonly subscriptionTierSlug: string;
}

export function getContainerRegistryOutput(args: GetContainerRegistryOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetContainerRegistryResult> {
    return pulumi.output(args).apply(a => getContainerRegistry(a, opts))
}

/**
 * A collection of arguments for invoking getContainerRegistry.
 */
export interface GetContainerRegistryOutputArgs {
    /**
     * The name of the container registry.
     */
    name: pulumi.Input<string>;
}
