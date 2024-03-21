// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Volume snapshots are saved instances of a block storage volume. Use this data
 * source to retrieve the ID of a DigitalOcean volume snapshot for use in other
 * resources.
 *
 * ## Example Usage
 *
 * Get the volume snapshot:
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const snapshot = digitalocean.getVolumeSnapshot({
 *     mostRecent: true,
 *     nameRegex: "^web",
 *     region: "nyc3",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * Reuse the data about a volume snapshot to create a new volume based on it:
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const snapshot = digitalocean.getVolumeSnapshot({
 *     nameRegex: "^web",
 *     region: "nyc3",
 *     mostRecent: true,
 * });
 * const foobar = new digitalocean.Volume("foobar", {
 *     region: digitalocean.Region.NYC3,
 *     size: 100,
 *     snapshotId: snapshot.then(snapshot => snapshot.id),
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getVolumeSnapshot(args?: GetVolumeSnapshotArgs, opts?: pulumi.InvokeOptions): Promise<GetVolumeSnapshotResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("digitalocean:index/getVolumeSnapshot:getVolumeSnapshot", {
        "mostRecent": args.mostRecent,
        "name": args.name,
        "nameRegex": args.nameRegex,
        "region": args.region,
    }, opts);
}

/**
 * A collection of arguments for invoking getVolumeSnapshot.
 */
export interface GetVolumeSnapshotArgs {
    /**
     * If more than one result is returned, use the most recent volume snapshot.
     *
     * > **NOTE:** If more or less than a single match is returned by the search,
     * the provider will fail. Ensure that your search is specific enough to return
     * a single volume snapshot ID only, or use `mostRecent` to choose the most recent one.
     */
    mostRecent?: boolean;
    /**
     * The name of the volume snapshot.
     */
    name?: string;
    /**
     * A regex string to apply to the volume snapshot list returned by DigitalOcean. This allows more advanced filtering not supported from the DigitalOcean API. This filtering is done locally on what DigitalOcean returns.
     */
    nameRegex?: string;
    /**
     * A "slug" representing a DigitalOcean region (e.g. `nyc1`). If set, only volume snapshots available in the region will be returned.
     */
    region?: string;
}

/**
 * A collection of values returned by getVolumeSnapshot.
 */
export interface GetVolumeSnapshotResult {
    /**
     * The date and time the volume snapshot was created.
     */
    readonly createdAt: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The minimum size in gigabytes required for a volume to be created based on this volume snapshot.
     */
    readonly minDiskSize: number;
    readonly mostRecent?: boolean;
    readonly name?: string;
    readonly nameRegex?: string;
    readonly region?: string;
    /**
     * A list of DigitalOcean region "slugs" indicating where the volume snapshot is available.
     */
    readonly regions: string[];
    /**
     * The billable size of the volume snapshot in gigabytes.
     */
    readonly size: number;
    /**
     * A list of the tags associated to the volume snapshot.
     */
    readonly tags: string[];
    /**
     * The ID of the volume from which the volume snapshot originated.
     */
    readonly volumeId: string;
}
/**
 * Volume snapshots are saved instances of a block storage volume. Use this data
 * source to retrieve the ID of a DigitalOcean volume snapshot for use in other
 * resources.
 *
 * ## Example Usage
 *
 * Get the volume snapshot:
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const snapshot = digitalocean.getVolumeSnapshot({
 *     mostRecent: true,
 *     nameRegex: "^web",
 *     region: "nyc3",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * Reuse the data about a volume snapshot to create a new volume based on it:
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const snapshot = digitalocean.getVolumeSnapshot({
 *     nameRegex: "^web",
 *     region: "nyc3",
 *     mostRecent: true,
 * });
 * const foobar = new digitalocean.Volume("foobar", {
 *     region: digitalocean.Region.NYC3,
 *     size: 100,
 *     snapshotId: snapshot.then(snapshot => snapshot.id),
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getVolumeSnapshotOutput(args?: GetVolumeSnapshotOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetVolumeSnapshotResult> {
    return pulumi.output(args).apply((a: any) => getVolumeSnapshot(a, opts))
}

/**
 * A collection of arguments for invoking getVolumeSnapshot.
 */
export interface GetVolumeSnapshotOutputArgs {
    /**
     * If more than one result is returned, use the most recent volume snapshot.
     *
     * > **NOTE:** If more or less than a single match is returned by the search,
     * the provider will fail. Ensure that your search is specific enough to return
     * a single volume snapshot ID only, or use `mostRecent` to choose the most recent one.
     */
    mostRecent?: pulumi.Input<boolean>;
    /**
     * The name of the volume snapshot.
     */
    name?: pulumi.Input<string>;
    /**
     * A regex string to apply to the volume snapshot list returned by DigitalOcean. This allows more advanced filtering not supported from the DigitalOcean API. This filtering is done locally on what DigitalOcean returns.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * A "slug" representing a DigitalOcean region (e.g. `nyc1`). If set, only volume snapshots available in the region will be returned.
     */
    region?: pulumi.Input<string>;
}
