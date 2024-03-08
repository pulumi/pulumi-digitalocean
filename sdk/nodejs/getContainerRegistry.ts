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
 *
 * ### Basic Example
 *
 * Get the container registry:
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const example = digitalocean.getContainerRegistry({
 *     name: "example",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getContainerRegistry(args: GetContainerRegistryArgs, opts?: pulumi.InvokeOptions): Promise<GetContainerRegistryResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
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
    /**
     * The date and time when the registry was created
     */
    readonly createdAt: string;
    /**
     * The URL endpoint of the container registry. Ex: `registry.digitalocean.com/my_registry`
     */
    readonly endpoint: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The name of the container registry
     */
    readonly name: string;
    /**
     * The slug identifier for the  region
     */
    readonly region: string;
    /**
     * The domain of the container registry. Ex: `registry.digitalocean.com`
     */
    readonly serverUrl: string;
    /**
     * The amount of storage used in the registry in bytes.
     */
    readonly storageUsageBytes: number;
    /**
     * The slug identifier for the subscription tier
     */
    readonly subscriptionTierSlug: string;
}
/**
 * Get information on a container registry. This data source provides the name as
 * configured on your DigitalOcean account. This is useful if the container
 * registry name in question is not managed by this provider or you need validate if
 * the container registry exists in the account.
 *
 * An error is triggered if the provided container registry name does not exist.
 *
 * ## Example Usage
 *
 * ### Basic Example
 *
 * Get the container registry:
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const example = digitalocean.getContainerRegistry({
 *     name: "example",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getContainerRegistryOutput(args: GetContainerRegistryOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetContainerRegistryResult> {
    return pulumi.output(args).apply((a: any) => getContainerRegistry(a, opts))
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
