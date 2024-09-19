// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Get information on a Droplet for use in other resources. This data source provides
 * all of the Droplet's properties as configured on your DigitalOcean account. This
 * is useful if the Droplet in question is not managed by this provider or you need to
 * utilize any of the Droplet's data.
 *
 * **Note:** This data source returns a single Droplet. When specifying a `tag`, an
 * error is triggered if more than one Droplet is found.
 *
 * ## Example Usage
 *
 * Get the Droplet by name:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const example = digitalocean.getDroplet({
 *     name: "web",
 * });
 * export const dropletOutput = example.then(example => example.ipv4Address);
 * ```
 *
 * Get the Droplet by tag:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const example = digitalocean.getDroplet({
 *     tag: "web",
 * });
 * ```
 *
 * Get the Droplet by ID:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const example = digitalocean.getDroplet({
 *     id: exampleDigitaloceanKubernetesCluster.nodePool[0].nodes[0].dropletId,
 * });
 * ```
 */
export function getDroplet(args?: GetDropletArgs, opts?: pulumi.InvokeOptions): Promise<GetDropletResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("digitalocean:index/getDroplet:getDroplet", {
        "id": args.id,
        "name": args.name,
        "tag": args.tag,
    }, opts);
}

/**
 * A collection of arguments for invoking getDroplet.
 */
export interface GetDropletArgs {
    /**
     * The ID of the Droplet
     */
    id?: number;
    /**
     * The name of the Droplet.
     */
    name?: string;
    /**
     * A tag applied to the Droplet.
     */
    tag?: string;
}

/**
 * A collection of values returned by getDroplet.
 */
export interface GetDropletResult {
    /**
     * Whether backups are enabled.
     */
    readonly backups: boolean;
    readonly createdAt: string;
    /**
     * The size of the Droplets disk in GB.
     */
    readonly disk: number;
    /**
     * The ID of the Droplet.
     */
    readonly id: number;
    /**
     * The Droplet image ID or slug.
     */
    readonly image: string;
    /**
     * The Droplets public IPv4 address
     */
    readonly ipv4Address: string;
    /**
     * The Droplets private IPv4 address
     */
    readonly ipv4AddressPrivate: string;
    /**
     * Whether IPv6 is enabled.
     */
    readonly ipv6: boolean;
    /**
     * The Droplets public IPv6 address
     */
    readonly ipv6Address: string;
    /**
     * The Droplets private IPv6 address
     */
    readonly ipv6AddressPrivate: string;
    /**
     * Whether the Droplet is locked.
     */
    readonly locked: boolean;
    /**
     * The amount of the Droplets memory in MB.
     */
    readonly memory: number;
    /**
     * Whether monitoring agent is installed.
     */
    readonly monitoring: boolean;
    readonly name: string;
    /**
     * Droplet hourly price.
     */
    readonly priceHourly: number;
    /**
     * Droplet monthly price.
     */
    readonly priceMonthly: number;
    /**
     * Whether private networks are enabled.
     */
    readonly privateNetworking: boolean;
    /**
     * The region the Droplet is running in.
     */
    readonly region: string;
    /**
     * The unique slug that identifies the type of Droplet.
     */
    readonly size: string;
    /**
     * The status of the Droplet.
     */
    readonly status: string;
    readonly tag?: string;
    /**
     * A list of the tags associated to the Droplet.
     */
    readonly tags: string[];
    /**
     * The uniform resource name of the Droplet
     */
    readonly urn: string;
    /**
     * The number of the Droplets virtual CPUs.
     */
    readonly vcpus: number;
    /**
     * List of the IDs of each volumes attached to the Droplet.
     */
    readonly volumeIds: string[];
    /**
     * The ID of the VPC where the Droplet is located.
     */
    readonly vpcUuid: string;
}
/**
 * Get information on a Droplet for use in other resources. This data source provides
 * all of the Droplet's properties as configured on your DigitalOcean account. This
 * is useful if the Droplet in question is not managed by this provider or you need to
 * utilize any of the Droplet's data.
 *
 * **Note:** This data source returns a single Droplet. When specifying a `tag`, an
 * error is triggered if more than one Droplet is found.
 *
 * ## Example Usage
 *
 * Get the Droplet by name:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const example = digitalocean.getDroplet({
 *     name: "web",
 * });
 * export const dropletOutput = example.then(example => example.ipv4Address);
 * ```
 *
 * Get the Droplet by tag:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const example = digitalocean.getDroplet({
 *     tag: "web",
 * });
 * ```
 *
 * Get the Droplet by ID:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const example = digitalocean.getDroplet({
 *     id: exampleDigitaloceanKubernetesCluster.nodePool[0].nodes[0].dropletId,
 * });
 * ```
 */
export function getDropletOutput(args?: GetDropletOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDropletResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("digitalocean:index/getDroplet:getDroplet", {
        "id": args.id,
        "name": args.name,
        "tag": args.tag,
    }, opts);
}

/**
 * A collection of arguments for invoking getDroplet.
 */
export interface GetDropletOutputArgs {
    /**
     * The ID of the Droplet
     */
    id?: pulumi.Input<number>;
    /**
     * The name of the Droplet.
     */
    name?: pulumi.Input<string>;
    /**
     * A tag applied to the Droplet.
     */
    tag?: pulumi.Input<string>;
}
