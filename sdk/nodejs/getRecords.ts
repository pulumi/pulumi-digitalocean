// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as enums from "./types/enums";
import * as utilities from "./utilities";

/**
 * Retrieve information about all DNS records within a domain, with the ability to filter and sort the results.
 * If no filters are specified, all records will be returned.
 *
 * ## Example Usage
 *
 * Get data for all MX records in a domain:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 * import * as std from "@pulumi/std";
 *
 * const example = digitalocean.getRecords({
 *     domain: "example.com",
 *     filters: [{
 *         key: "type",
 *         values: ["MX"],
 *     }],
 * });
 * export const mailServers = example.then(example => std.join({
 *     separator: ",",
 *     input: example.records.map(__item => __item.value),
 * })).then(invoke => invoke.result);
 * ```
 */
export function getRecords(args: GetRecordsArgs, opts?: pulumi.InvokeOptions): Promise<GetRecordsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("digitalocean:index/getRecords:getRecords", {
        "domain": args.domain,
        "filters": args.filters,
        "sorts": args.sorts,
    }, opts);
}

/**
 * A collection of arguments for invoking getRecords.
 */
export interface GetRecordsArgs {
    /**
     * The domain name to search for DNS records
     */
    domain: string;
    /**
     * Filter the results.
     * The `filter` block is documented below.
     */
    filters?: inputs.GetRecordsFilter[];
    /**
     * Sort the results.
     * The `sort` block is documented below.
     */
    sorts?: inputs.GetRecordsSort[];
}

/**
 * A collection of values returned by getRecords.
 */
export interface GetRecordsResult {
    /**
     * Domain of the DNS record.
     */
    readonly domain: string;
    readonly filters?: outputs.GetRecordsFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly records: outputs.GetRecordsRecord[];
    readonly sorts?: outputs.GetRecordsSort[];
}
/**
 * Retrieve information about all DNS records within a domain, with the ability to filter and sort the results.
 * If no filters are specified, all records will be returned.
 *
 * ## Example Usage
 *
 * Get data for all MX records in a domain:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 * import * as std from "@pulumi/std";
 *
 * const example = digitalocean.getRecords({
 *     domain: "example.com",
 *     filters: [{
 *         key: "type",
 *         values: ["MX"],
 *     }],
 * });
 * export const mailServers = example.then(example => std.join({
 *     separator: ",",
 *     input: example.records.map(__item => __item.value),
 * })).then(invoke => invoke.result);
 * ```
 */
export function getRecordsOutput(args: GetRecordsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetRecordsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("digitalocean:index/getRecords:getRecords", {
        "domain": args.domain,
        "filters": args.filters,
        "sorts": args.sorts,
    }, opts);
}

/**
 * A collection of arguments for invoking getRecords.
 */
export interface GetRecordsOutputArgs {
    /**
     * The domain name to search for DNS records
     */
    domain: pulumi.Input<string>;
    /**
     * Filter the results.
     * The `filter` block is documented below.
     */
    filters?: pulumi.Input<pulumi.Input<inputs.GetRecordsFilterArgs>[]>;
    /**
     * Sort the results.
     * The `sort` block is documented below.
     */
    sorts?: pulumi.Input<pulumi.Input<inputs.GetRecordsSortArgs>[]>;
}
