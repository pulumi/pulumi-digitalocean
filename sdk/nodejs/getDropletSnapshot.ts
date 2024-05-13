// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Droplet snapshots are saved instances of a Droplet. Use this data
 * source to retrieve the ID of a DigitalOcean Droplet snapshot for use in other
 * resources.
 *
 * ## Example Usage
 *
 * Get the Droplet snapshot:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const web-snapshot = digitalocean.getDropletSnapshot({
 *     nameRegex: "^web",
 *     region: "nyc3",
 *     mostRecent: true,
 * });
 * ```
 *
 * Create image from snapshot:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const web-snapshot = digitalocean.getDropletSnapshot({
 *     nameRegex: "^web",
 *     region: "nyc3",
 *     mostRecent: true,
 * });
 * const from_snapshot = new digitalocean.Droplet("from-snapshot", {
 *     image: web_snapshot.then(web_snapshot => web_snapshot.id),
 *     name: "web-02",
 *     region: digitalocean.Region.NYC3,
 *     size: digitalocean.DropletSlug.DropletS2VCPU4GB,
 * });
 * ```
 */
export function getDropletSnapshot(args?: GetDropletSnapshotArgs, opts?: pulumi.InvokeOptions): Promise<GetDropletSnapshotResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("digitalocean:index/getDropletSnapshot:getDropletSnapshot", {
        "mostRecent": args.mostRecent,
        "name": args.name,
        "nameRegex": args.nameRegex,
        "region": args.region,
    }, opts);
}

/**
 * A collection of arguments for invoking getDropletSnapshot.
 */
export interface GetDropletSnapshotArgs {
    /**
     * If more than one result is returned, use the most recent Droplet snapshot.
     *
     * > **NOTE:** If more or less than a single match is returned by the search,
     * the update will fail. Ensure that your search is specific enough to return
     * a single Droplet snapshot ID only, or use `mostRecent` to choose the most recent one.
     */
    mostRecent?: boolean;
    /**
     * The name of the Droplet snapshot.
     */
    name?: string;
    /**
     * A regex string to apply to the Droplet snapshot list returned by DigitalOcean. This allows more advanced filtering not supported from the DigitalOcean API. This filtering is done locally on what DigitalOcean returns.
     */
    nameRegex?: string;
    /**
     * A "slug" representing a DigitalOcean region (e.g. `nyc1`). If set, only Droplet snapshots available in the region will be returned.
     */
    region?: string;
}

/**
 * A collection of values returned by getDropletSnapshot.
 */
export interface GetDropletSnapshotResult {
    /**
     * The date and time the Droplet snapshot was created.
     */
    readonly createdAt: string;
    /**
     * The ID of the Droplet from which the Droplet snapshot originated.
     */
    readonly dropletId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The minimum size in gigabytes required for a Droplet to be created based on this Droplet snapshot.
     */
    readonly minDiskSize: number;
    readonly mostRecent?: boolean;
    readonly name?: string;
    readonly nameRegex?: string;
    readonly region?: string;
    /**
     * A list of DigitalOcean region "slugs" indicating where the Droplet snapshot is available.
     */
    readonly regions: string[];
    /**
     * The billable size of the Droplet snapshot in gigabytes.
     */
    readonly size: number;
}
/**
 * Droplet snapshots are saved instances of a Droplet. Use this data
 * source to retrieve the ID of a DigitalOcean Droplet snapshot for use in other
 * resources.
 *
 * ## Example Usage
 *
 * Get the Droplet snapshot:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const web-snapshot = digitalocean.getDropletSnapshot({
 *     nameRegex: "^web",
 *     region: "nyc3",
 *     mostRecent: true,
 * });
 * ```
 *
 * Create image from snapshot:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const web-snapshot = digitalocean.getDropletSnapshot({
 *     nameRegex: "^web",
 *     region: "nyc3",
 *     mostRecent: true,
 * });
 * const from_snapshot = new digitalocean.Droplet("from-snapshot", {
 *     image: web_snapshot.then(web_snapshot => web_snapshot.id),
 *     name: "web-02",
 *     region: digitalocean.Region.NYC3,
 *     size: digitalocean.DropletSlug.DropletS2VCPU4GB,
 * });
 * ```
 */
export function getDropletSnapshotOutput(args?: GetDropletSnapshotOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDropletSnapshotResult> {
    return pulumi.output(args).apply((a: any) => getDropletSnapshot(a, opts))
}

/**
 * A collection of arguments for invoking getDropletSnapshot.
 */
export interface GetDropletSnapshotOutputArgs {
    /**
     * If more than one result is returned, use the most recent Droplet snapshot.
     *
     * > **NOTE:** If more or less than a single match is returned by the search,
     * the update will fail. Ensure that your search is specific enough to return
     * a single Droplet snapshot ID only, or use `mostRecent` to choose the most recent one.
     */
    mostRecent?: pulumi.Input<boolean>;
    /**
     * The name of the Droplet snapshot.
     */
    name?: pulumi.Input<string>;
    /**
     * A regex string to apply to the Droplet snapshot list returned by DigitalOcean. This allows more advanced filtering not supported from the DigitalOcean API. This filtering is done locally on what DigitalOcean returns.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * A "slug" representing a DigitalOcean region (e.g. `nyc1`). If set, only Droplet snapshots available in the region will be returned.
     */
    region?: pulumi.Input<string>;
}
