// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as enums from "./types/enums";
import * as utilities from "./utilities";

/**
 * Get information on domains for use in other resources, with the ability to filter and sort the results.
 * If no filters are specified, all domains will be returned.
 *
 * This data source is useful if the domains in question are not managed by this provider or you need to
 * utilize any of the domains' data.
 *
 * Note: You can use the `digitalocean.Domain` data source to obtain metadata
 * about a single domain if you already know the `name`.
 *
 * ## Example Usage
 *
 * Use the `filter` block with a `key` string and `values` list to filter domains. (This example
 * also uses the regular expression `matchBy` mode in order to match domains by suffix.)
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const examples = digitalocean.getDomains({
 *     filters: [{
 *         key: "name",
 *         values: ["example\\.com$"],
 *         matchBy: "re",
 *     }],
 * });
 * ```
 */
export function getDomains(args?: GetDomainsArgs, opts?: pulumi.InvokeOptions): Promise<GetDomainsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("digitalocean:index/getDomains:getDomains", {
        "filters": args.filters,
        "sorts": args.sorts,
    }, opts);
}

/**
 * A collection of arguments for invoking getDomains.
 */
export interface GetDomainsArgs {
    /**
     * Filter the results.
     * The `filter` block is documented below.
     */
    filters?: inputs.GetDomainsFilter[];
    /**
     * Sort the results.
     * The `sort` block is documented below.
     */
    sorts?: inputs.GetDomainsSort[];
}

/**
 * A collection of values returned by getDomains.
 */
export interface GetDomainsResult {
    /**
     * A list of domains satisfying any `filter` and `sort` criteria. Each domain has the following attributes:
     */
    readonly domains: outputs.GetDomainsDomain[];
    readonly filters?: outputs.GetDomainsFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly sorts?: outputs.GetDomainsSort[];
}
/**
 * Get information on domains for use in other resources, with the ability to filter and sort the results.
 * If no filters are specified, all domains will be returned.
 *
 * This data source is useful if the domains in question are not managed by this provider or you need to
 * utilize any of the domains' data.
 *
 * Note: You can use the `digitalocean.Domain` data source to obtain metadata
 * about a single domain if you already know the `name`.
 *
 * ## Example Usage
 *
 * Use the `filter` block with a `key` string and `values` list to filter domains. (This example
 * also uses the regular expression `matchBy` mode in order to match domains by suffix.)
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const examples = digitalocean.getDomains({
 *     filters: [{
 *         key: "name",
 *         values: ["example\\.com$"],
 *         matchBy: "re",
 *     }],
 * });
 * ```
 */
export function getDomainsOutput(args?: GetDomainsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetDomainsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("digitalocean:index/getDomains:getDomains", {
        "filters": args.filters,
        "sorts": args.sorts,
    }, opts);
}

/**
 * A collection of arguments for invoking getDomains.
 */
export interface GetDomainsOutputArgs {
    /**
     * Filter the results.
     * The `filter` block is documented below.
     */
    filters?: pulumi.Input<pulumi.Input<inputs.GetDomainsFilterArgs>[]>;
    /**
     * Sort the results.
     * The `sort` block is documented below.
     */
    sorts?: pulumi.Input<pulumi.Input<inputs.GetDomainsSortArgs>[]>;
}
