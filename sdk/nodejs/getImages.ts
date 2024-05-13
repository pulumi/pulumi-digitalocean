// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as enums from "./types/enums";
import * as utilities from "./utilities";

/**
 * Get information on images for use in other resources (e.g. creating a Droplet
 * based on a snapshot), with the ability to filter and sort the results. If no filters are specified,
 * all images will be returned.
 *
 * This data source is useful if the image in question is not managed by the provider or you need to utilize any
 * of the image's data.
 *
 * Note: You can use the `digitalocean.getImage` data source to obtain metadata
 * about a single image if you already know the `slug`, unique `name`, or `id` to retrieve.
 *
 * ## Example Usage
 *
 * Use the `filter` block with a `key` string and `values` list to filter images.
 *
 * For example to find all Ubuntu images:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const ubuntu = digitalocean.getImages({
 *     filters: [{
 *         key: "distribution",
 *         values: ["Ubuntu"],
 *     }],
 * });
 * ```
 *
 * You can filter on multiple fields and sort the results as well:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const available = digitalocean.getImages({
 *     filters: [
 *         {
 *             key: "distribution",
 *             values: ["Ubuntu"],
 *         },
 *         {
 *             key: "regions",
 *             values: ["nyc3"],
 *         },
 *     ],
 *     sorts: [{
 *         key: "created",
 *         direction: "desc",
 *     }],
 * });
 * ```
 */
export function getImages(args?: GetImagesArgs, opts?: pulumi.InvokeOptions): Promise<GetImagesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("digitalocean:index/getImages:getImages", {
        "filters": args.filters,
        "sorts": args.sorts,
    }, opts);
}

/**
 * A collection of arguments for invoking getImages.
 */
export interface GetImagesArgs {
    /**
     * Filter the results.
     * The `filter` block is documented below.
     */
    filters?: inputs.GetImagesFilter[];
    /**
     * Sort the results.
     * The `sort` block is documented below.
     */
    sorts?: inputs.GetImagesSort[];
}

/**
 * A collection of values returned by getImages.
 */
export interface GetImagesResult {
    readonly filters?: outputs.GetImagesFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A set of images satisfying any `filter` and `sort` criteria. Each image has the following attributes:
     */
    readonly images: outputs.GetImagesImage[];
    readonly sorts?: outputs.GetImagesSort[];
}
/**
 * Get information on images for use in other resources (e.g. creating a Droplet
 * based on a snapshot), with the ability to filter and sort the results. If no filters are specified,
 * all images will be returned.
 *
 * This data source is useful if the image in question is not managed by the provider or you need to utilize any
 * of the image's data.
 *
 * Note: You can use the `digitalocean.getImage` data source to obtain metadata
 * about a single image if you already know the `slug`, unique `name`, or `id` to retrieve.
 *
 * ## Example Usage
 *
 * Use the `filter` block with a `key` string and `values` list to filter images.
 *
 * For example to find all Ubuntu images:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const ubuntu = digitalocean.getImages({
 *     filters: [{
 *         key: "distribution",
 *         values: ["Ubuntu"],
 *     }],
 * });
 * ```
 *
 * You can filter on multiple fields and sort the results as well:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const available = digitalocean.getImages({
 *     filters: [
 *         {
 *             key: "distribution",
 *             values: ["Ubuntu"],
 *         },
 *         {
 *             key: "regions",
 *             values: ["nyc3"],
 *         },
 *     ],
 *     sorts: [{
 *         key: "created",
 *         direction: "desc",
 *     }],
 * });
 * ```
 */
export function getImagesOutput(args?: GetImagesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetImagesResult> {
    return pulumi.output(args).apply((a: any) => getImages(a, opts))
}

/**
 * A collection of arguments for invoking getImages.
 */
export interface GetImagesOutputArgs {
    /**
     * Filter the results.
     * The `filter` block is documented below.
     */
    filters?: pulumi.Input<pulumi.Input<inputs.GetImagesFilterArgs>[]>;
    /**
     * Sort the results.
     * The `sort` block is documented below.
     */
    sorts?: pulumi.Input<pulumi.Input<inputs.GetImagesSortArgs>[]>;
}
