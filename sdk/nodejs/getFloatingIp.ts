// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * > **Deprecated:** DigitalOcean Floating IPs have been renamed reserved IPs. This data source will be removed in a future release. Please use `digitalocean.ReservedIp` instead.
 *
 * Get information on a floating ip. This data source provides the region and Droplet id
 * as configured on your DigitalOcean account. This is useful if the floating IP
 * in question is not managed by the provider or you need to find the Droplet the IP is
 * attached to.
 *
 * An error is triggered if the provided floating IP does not exist.
 *
 * ## Example Usage
 *
 * Get the floating IP:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const config = new pulumi.Config();
 * const publicIp = config.requireObject("publicIp");
 * const example = digitalocean.getFloatingIp({
 *     ipAddress: publicIp,
 * });
 * export const fipOutput = example.then(example => example.dropletId);
 * ```
 */
export function getFloatingIp(args: GetFloatingIpArgs, opts?: pulumi.InvokeOptions): Promise<GetFloatingIpResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("digitalocean:index/getFloatingIp:getFloatingIp", {
        "ipAddress": args.ipAddress,
    }, opts);
}

/**
 * A collection of arguments for invoking getFloatingIp.
 */
export interface GetFloatingIpArgs {
    /**
     * The allocated IP address of the specific floating IP to retrieve.
     */
    ipAddress: string;
}

/**
 * A collection of values returned by getFloatingIp.
 */
export interface GetFloatingIpResult {
    /**
     * The Droplet id that the floating IP has been assigned to.
     */
    readonly dropletId: number;
    /**
     * The uniform resource name of the floating IP.
     */
    readonly floatingIpUrn: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ipAddress: string;
    /**
     * The region that the floating IP is reserved to.
     */
    readonly region: string;
}
/**
 * > **Deprecated:** DigitalOcean Floating IPs have been renamed reserved IPs. This data source will be removed in a future release. Please use `digitalocean.ReservedIp` instead.
 *
 * Get information on a floating ip. This data source provides the region and Droplet id
 * as configured on your DigitalOcean account. This is useful if the floating IP
 * in question is not managed by the provider or you need to find the Droplet the IP is
 * attached to.
 *
 * An error is triggered if the provided floating IP does not exist.
 *
 * ## Example Usage
 *
 * Get the floating IP:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const config = new pulumi.Config();
 * const publicIp = config.requireObject("publicIp");
 * const example = digitalocean.getFloatingIp({
 *     ipAddress: publicIp,
 * });
 * export const fipOutput = example.then(example => example.dropletId);
 * ```
 */
export function getFloatingIpOutput(args: GetFloatingIpOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetFloatingIpResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("digitalocean:index/getFloatingIp:getFloatingIp", {
        "ipAddress": args.ipAddress,
    }, opts);
}

/**
 * A collection of arguments for invoking getFloatingIp.
 */
export interface GetFloatingIpOutputArgs {
    /**
     * The allocated IP address of the specific floating IP to retrieve.
     */
    ipAddress: pulumi.Input<string>;
}
