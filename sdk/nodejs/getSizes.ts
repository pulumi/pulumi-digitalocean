// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Retrieves information about the Droplet sizes that DigitalOcean supports, with
 * the ability to filter and sort the results. If no filters are specified, all sizes
 * will be returned.
 *
 * ## Example Usage
 *
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const main = digitalocean.getSizes({
 *     filter: [{
 *         key: "slug",
 *         values: ["s-1vcpu-1gb"],
 *     }],
 * });
 * const web = new digitalocean.Droplet("web", {
 *     image: "ubuntu-18-04-x64",
 *     region: "sgp1",
 *     size: main.then(main => main.sizes)[0].then(sizes => sizes.slug),
 * });
 * ```
 */
export function getSizes(args?: GetSizesArgs, opts?: pulumi.InvokeOptions): Promise<GetSizesResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("digitalocean:index/getSizes:getSizes", {
        "filters": args.filters,
        "sorts": args.sorts,
    }, opts);
}

/**
 * A collection of arguments for invoking getSizes.
 */
export interface GetSizesArgs {
    /**
     * Filter the results.
     * The `filter` block is documented below.
     */
    readonly filters?: inputs.GetSizesFilter[];
    /**
     * Sort the results.
     * The `sort` block is documented below.
     */
    readonly sorts?: inputs.GetSizesSort[];
}

/**
 * A collection of values returned by getSizes.
 */
export interface GetSizesResult {
    readonly filters?: outputs.GetSizesFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly sizes: outputs.GetSizesSize[];
    readonly sorts?: outputs.GetSizesSort[];
}
