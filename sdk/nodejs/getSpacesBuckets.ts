// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as enums from "./types/enums";
import * as utilities from "./utilities";

/**
 * Get information on Spaces buckets for use in other resources, with the ability to filter and sort the results.
 * If no filters are specified, all Spaces buckets will be returned.
 *
 * Note: You can use the `digitalocean.SpacesBucket` data source to
 * obtain metadata about a single bucket if you already know its `name` and `region`.
 *
 * ## Example Usage
 *
 * Use the `filter` block with a `key` string and `values` list to filter buckets.
 *
 * Get all buckets in a region:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const nyc3 = digitalocean.getSpacesBuckets({
 *     filters: [{
 *         key: "region",
 *         values: ["nyc3"],
 *     }],
 * });
 * ```
 * You can sort the results as well:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const nyc3 = digitalocean.getSpacesBuckets({
 *     filters: [{
 *         key: "region",
 *         values: ["nyc3"],
 *     }],
 *     sorts: [{
 *         key: "name",
 *         direction: "desc",
 *     }],
 * });
 * ```
 */
export function getSpacesBuckets(args?: GetSpacesBucketsArgs, opts?: pulumi.InvokeOptions): Promise<GetSpacesBucketsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("digitalocean:index/getSpacesBuckets:getSpacesBuckets", {
        "filters": args.filters,
        "sorts": args.sorts,
    }, opts);
}

/**
 * A collection of arguments for invoking getSpacesBuckets.
 */
export interface GetSpacesBucketsArgs {
    /**
     * Filter the results.
     * The `filter` block is documented below.
     */
    filters?: inputs.GetSpacesBucketsFilter[];
    /**
     * Sort the results.
     * The `sort` block is documented below.
     */
    sorts?: inputs.GetSpacesBucketsSort[];
}

/**
 * A collection of values returned by getSpacesBuckets.
 */
export interface GetSpacesBucketsResult {
    /**
     * A list of Spaces buckets satisfying any `filter` and `sort` criteria. Each bucket has the following attributes:
     */
    readonly buckets: outputs.GetSpacesBucketsBucket[];
    readonly filters?: outputs.GetSpacesBucketsFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly sorts?: outputs.GetSpacesBucketsSort[];
}
/**
 * Get information on Spaces buckets for use in other resources, with the ability to filter and sort the results.
 * If no filters are specified, all Spaces buckets will be returned.
 *
 * Note: You can use the `digitalocean.SpacesBucket` data source to
 * obtain metadata about a single bucket if you already know its `name` and `region`.
 *
 * ## Example Usage
 *
 * Use the `filter` block with a `key` string and `values` list to filter buckets.
 *
 * Get all buckets in a region:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const nyc3 = digitalocean.getSpacesBuckets({
 *     filters: [{
 *         key: "region",
 *         values: ["nyc3"],
 *     }],
 * });
 * ```
 * You can sort the results as well:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const nyc3 = digitalocean.getSpacesBuckets({
 *     filters: [{
 *         key: "region",
 *         values: ["nyc3"],
 *     }],
 *     sorts: [{
 *         key: "name",
 *         direction: "desc",
 *     }],
 * });
 * ```
 */
export function getSpacesBucketsOutput(args?: GetSpacesBucketsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetSpacesBucketsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("digitalocean:index/getSpacesBuckets:getSpacesBuckets", {
        "filters": args.filters,
        "sorts": args.sorts,
    }, opts);
}

/**
 * A collection of arguments for invoking getSpacesBuckets.
 */
export interface GetSpacesBucketsOutputArgs {
    /**
     * Filter the results.
     * The `filter` block is documented below.
     */
    filters?: pulumi.Input<pulumi.Input<inputs.GetSpacesBucketsFilterArgs>[]>;
    /**
     * Sort the results.
     * The `sort` block is documented below.
     */
    sorts?: pulumi.Input<pulumi.Input<inputs.GetSpacesBucketsSortArgs>[]>;
}
