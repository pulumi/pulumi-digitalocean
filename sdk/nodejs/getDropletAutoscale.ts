// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as enums from "./types/enums";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * Get the Droplet Autoscale pool by name:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const my_imported_autoscale_pool = digitalocean.getDropletAutoscale({
 *     name: my_existing_autoscale_pool.name,
 * });
 * ```
 *
 * Get the Droplet Autoscale pool by ID:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const my_imported_autoscale_pool = digitalocean.getDropletAutoscale({
 *     id: my_existing_autoscale_pool.id,
 * });
 * ```
 */
export function getDropletAutoscale(args?: GetDropletAutoscaleArgs, opts?: pulumi.InvokeOptions): Promise<GetDropletAutoscaleResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("digitalocean:index/getDropletAutoscale:getDropletAutoscale", {
        "id": args.id,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getDropletAutoscale.
 */
export interface GetDropletAutoscaleArgs {
    /**
     * The ID of Droplet Autoscale pool.
     */
    id?: string;
    /**
     * The name of Droplet Autoscale pool.
     */
    name?: string;
}

/**
 * A collection of values returned by getDropletAutoscale.
 */
export interface GetDropletAutoscaleResult {
    readonly configs: outputs.GetDropletAutoscaleConfig[];
    readonly createdAt: string;
    readonly currentUtilizations: outputs.GetDropletAutoscaleCurrentUtilization[];
    readonly dropletTemplates: outputs.GetDropletAutoscaleDropletTemplate[];
    readonly id?: string;
    readonly name?: string;
    readonly status: string;
    readonly updatedAt: string;
}
/**
 * ## Example Usage
 *
 * Get the Droplet Autoscale pool by name:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const my_imported_autoscale_pool = digitalocean.getDropletAutoscale({
 *     name: my_existing_autoscale_pool.name,
 * });
 * ```
 *
 * Get the Droplet Autoscale pool by ID:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const my_imported_autoscale_pool = digitalocean.getDropletAutoscale({
 *     id: my_existing_autoscale_pool.id,
 * });
 * ```
 */
export function getDropletAutoscaleOutput(args?: GetDropletAutoscaleOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetDropletAutoscaleResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("digitalocean:index/getDropletAutoscale:getDropletAutoscale", {
        "id": args.id,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getDropletAutoscale.
 */
export interface GetDropletAutoscaleOutputArgs {
    /**
     * The ID of Droplet Autoscale pool.
     */
    id?: pulumi.Input<string>;
    /**
     * The name of Droplet Autoscale pool.
     */
    name?: pulumi.Input<string>;
}
