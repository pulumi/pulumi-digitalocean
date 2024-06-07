// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as enums from "./types/enums";
import * as utilities from "./utilities";

/**
 * Get information on SSH Keys for use in other resources.
 *
 * This data source is useful if the SSH Keys in question are not managed by the provider or you need to
 * utilize any of the SSH Keys' data.
 *
 * Note: You can use the `digitalocean.SshKey` data source to obtain metadata
 * about a single SSH Key if you already know the unique `name` to retrieve.
 *
 * ## Example Usage
 *
 * For example, to find all SSH keys:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const keys = digitalocean.getSshKeys({
 *     sorts: [{
 *         key: "name",
 *         direction: "asc",
 *     }],
 * });
 * ```
 *
 * Or to find ones matching specific values:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const keys = digitalocean.getSshKeys({
 *     filters: [{
 *         key: "name",
 *         values: [
 *             "laptop",
 *             "desktop",
 *         ],
 *     }],
 * });
 * ```
 */
export function getSshKeys(args?: GetSshKeysArgs, opts?: pulumi.InvokeOptions): Promise<GetSshKeysResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("digitalocean:index/getSshKeys:getSshKeys", {
        "filters": args.filters,
        "sorts": args.sorts,
    }, opts);
}

/**
 * A collection of arguments for invoking getSshKeys.
 */
export interface GetSshKeysArgs {
    /**
     * Filter the results.
     * The `filter` block is documented below.
     */
    filters?: inputs.GetSshKeysFilter[];
    /**
     * Sort the results.
     * The `sort` block is documented below.
     */
    sorts?: inputs.GetSshKeysSort[];
}

/**
 * A collection of values returned by getSshKeys.
 */
export interface GetSshKeysResult {
    readonly filters?: outputs.GetSshKeysFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly sorts?: outputs.GetSshKeysSort[];
    /**
     * A list of SSH Keys. Each SSH Key has the following attributes:
     */
    readonly sshKeys: outputs.GetSshKeysSshKey[];
}
/**
 * Get information on SSH Keys for use in other resources.
 *
 * This data source is useful if the SSH Keys in question are not managed by the provider or you need to
 * utilize any of the SSH Keys' data.
 *
 * Note: You can use the `digitalocean.SshKey` data source to obtain metadata
 * about a single SSH Key if you already know the unique `name` to retrieve.
 *
 * ## Example Usage
 *
 * For example, to find all SSH keys:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const keys = digitalocean.getSshKeys({
 *     sorts: [{
 *         key: "name",
 *         direction: "asc",
 *     }],
 * });
 * ```
 *
 * Or to find ones matching specific values:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const keys = digitalocean.getSshKeys({
 *     filters: [{
 *         key: "name",
 *         values: [
 *             "laptop",
 *             "desktop",
 *         ],
 *     }],
 * });
 * ```
 */
export function getSshKeysOutput(args?: GetSshKeysOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSshKeysResult> {
    return pulumi.output(args).apply((a: any) => getSshKeys(a, opts))
}

/**
 * A collection of arguments for invoking getSshKeys.
 */
export interface GetSshKeysOutputArgs {
    /**
     * Filter the results.
     * The `filter` block is documented below.
     */
    filters?: pulumi.Input<pulumi.Input<inputs.GetSshKeysFilterArgs>[]>;
    /**
     * Sort the results.
     * The `sort` block is documented below.
     */
    sorts?: pulumi.Input<pulumi.Input<inputs.GetSshKeysSortArgs>[]>;
}
