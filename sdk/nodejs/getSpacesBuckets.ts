// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs, enums } from "./types";
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
 * const nyc3 = pulumi.output(digitalocean.getSpacesBuckets({
 *     filters: [{
 *         key: "region",
 *         values: ["nyc3"],
 *     }],
 * }));
 * ```
 * You can sort the results as well:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const nyc3 = pulumi.output(digitalocean.getSpacesBuckets({
 *     filters: [{
 *         key: "region",
 *         values: ["nyc3"],
 *     }],
 *     sorts: [{
 *         direction: "desc",
 *         key: "name",
 *     }],
 * }));
 * ```
 */
export function getSpacesBuckets(args?: GetSpacesBucketsArgs, opts?: pulumi.InvokeOptions): Promise<GetSpacesBucketsResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
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

export function getSpacesBucketsOutput(args?: GetSpacesBucketsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSpacesBucketsResult> {
    return pulumi.output(args).apply(a => getSpacesBuckets(a, opts))
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
