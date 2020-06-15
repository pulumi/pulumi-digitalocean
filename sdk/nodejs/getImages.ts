// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Get information on images for use in other resources (e.g. creating a Droplet
 * based on a snapshot), with the ability to filter and sort the results. If no filters are specified,
 * all images will be returned.
 *
 * This data source is useful if the image in question is not managed by this provider or you need to utilize any
 * of the image's data.
 *
 * Note: You can use the `digitalocean..getImage` data source to obtain metadata
 * about a single image if you already know the `slug`, unique `name`, or `id` to retrieve.
 *
 * ## Example Usage
 *
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const ubuntu = pulumi.output(digitalocean.getImages({
 *     filters: [{
 *         key: "distribution",
 *         values: ["Ubuntu"],
 *     }],
 * }, { async: true }));
 * ```
 */
export function getImages(args?: GetImagesArgs, opts?: pulumi.InvokeOptions): Promise<GetImagesResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
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
    readonly filters?: inputs.GetImagesFilter[];
    /**
     * Sort the results.
     * The `sort` block is documented below.
     */
    readonly sorts?: inputs.GetImagesSort[];
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
     * - `slug`: Unique text identifier of the image.
     * - `id`: The ID of the image.
     * - `name`: The name of the image.
     * - `type`: Type of the image.
     * - `distribution` - The name of the distribution of the OS of the image.
     * - `minDiskSize`: The minimum 'disk' required for the image.
     * - `sizeGigabytes`: The size of the image in GB.
     * - `private` - Is image a public image or not. Public images represent
     * Linux distributions or One-Click Applications, while non-public images represent
     * snapshots and backups and are only available within your account.
     * - `regions`: A set of the regions that the image is available in.
     * - `tags`: A set of tags applied to the image
     * - `created`: When the image was created
     * - `status`: Current status of the image
     * - `errorMessage`: Any applicable error message pertaining to the image
     * - `image` - The id of the image (legacy parameter).
     */
    readonly images: outputs.GetImagesImage[];
    readonly sorts?: outputs.GetImagesSort[];
}
