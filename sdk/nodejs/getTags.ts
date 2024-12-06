// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as enums from "./types/enums";
import * as utilities from "./utilities";

/**
 * Returns a list of tags in your DigitalOcean account, with the ability to
 * filter and sort the results. If no filters are specified, all tags will be
 * returned.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const list = digitalocean.getTags({
 *     sorts: [{
 *         key: "total_resource_count",
 *         direction: "asc",
 *     }],
 * });
 * export const sortedTags = list.then(list => list.tags);
 * ```
 */
export function getTags(args?: GetTagsArgs, opts?: pulumi.InvokeOptions): Promise<GetTagsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("digitalocean:index/getTags:getTags", {
        "filters": args.filters,
        "sorts": args.sorts,
    }, opts);
}

/**
 * A collection of arguments for invoking getTags.
 */
export interface GetTagsArgs {
    /**
     * Filter the results.
     * The `filter` block is documented below.
     */
    filters?: inputs.GetTagsFilter[];
    /**
     * Sort the results.
     * The `sort` block is documented below.
     */
    sorts?: inputs.GetTagsSort[];
}

/**
 * A collection of values returned by getTags.
 */
export interface GetTagsResult {
    readonly filters?: outputs.GetTagsFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly sorts?: outputs.GetTagsSort[];
    readonly tags: outputs.GetTagsTag[];
}
/**
 * Returns a list of tags in your DigitalOcean account, with the ability to
 * filter and sort the results. If no filters are specified, all tags will be
 * returned.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const list = digitalocean.getTags({
 *     sorts: [{
 *         key: "total_resource_count",
 *         direction: "asc",
 *     }],
 * });
 * export const sortedTags = list.then(list => list.tags);
 * ```
 */
export function getTagsOutput(args?: GetTagsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetTagsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("digitalocean:index/getTags:getTags", {
        "filters": args.filters,
        "sorts": args.sorts,
    }, opts);
}

/**
 * A collection of arguments for invoking getTags.
 */
export interface GetTagsOutputArgs {
    /**
     * Filter the results.
     * The `filter` block is documented below.
     */
    filters?: pulumi.Input<pulumi.Input<inputs.GetTagsFilterArgs>[]>;
    /**
     * Sort the results.
     * The `sort` block is documented below.
     */
    sorts?: pulumi.Input<pulumi.Input<inputs.GetTagsSortArgs>[]>;
}
