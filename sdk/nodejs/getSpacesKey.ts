// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as enums from "./types/enums";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * Get the key by access key ID:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const example = digitalocean.getSpacesKey({
 *     accessKey: "ACCESS_KEY_ID",
 * });
 * export const keyGrants = example.then(example => example.grants);
 * ```
 */
export function getSpacesKey(args: GetSpacesKeyArgs, opts?: pulumi.InvokeOptions): Promise<GetSpacesKeyResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("digitalocean:index/getSpacesKey:getSpacesKey", {
        "accessKey": args.accessKey,
    }, opts);
}

/**
 * A collection of arguments for invoking getSpacesKey.
 */
export interface GetSpacesKeyArgs {
    /**
     * The Access Key ID of the Spaces key.
     */
    accessKey: string;
}

/**
 * A collection of values returned by getSpacesKey.
 */
export interface GetSpacesKeyResult {
    /**
     * The access key ID of the Spaces key
     */
    readonly accessKey: string;
    /**
     * The creation time of the Spaces key
     */
    readonly createdAt: string;
    /**
     * The list of grants associated with the Spaces key.
     */
    readonly grants: outputs.GetSpacesKeyGrant[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The name of the Spaces key
     */
    readonly name: string;
}
/**
 * ## Example Usage
 *
 * Get the key by access key ID:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const example = digitalocean.getSpacesKey({
 *     accessKey: "ACCESS_KEY_ID",
 * });
 * export const keyGrants = example.then(example => example.grants);
 * ```
 */
export function getSpacesKeyOutput(args: GetSpacesKeyOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetSpacesKeyResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("digitalocean:index/getSpacesKey:getSpacesKey", {
        "accessKey": args.accessKey,
    }, opts);
}

/**
 * A collection of arguments for invoking getSpacesKey.
 */
export interface GetSpacesKeyOutputArgs {
    /**
     * The Access Key ID of the Spaces key.
     */
    accessKey: pulumi.Input<string>;
}
