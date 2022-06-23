// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export function getReservedIp(args: GetReservedIpArgs, opts?: pulumi.InvokeOptions): Promise<GetReservedIpResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("digitalocean:index/getReservedIp:getReservedIp", {
        "ipAddress": args.ipAddress,
    }, opts);
}

/**
 * A collection of arguments for invoking getReservedIp.
 */
export interface GetReservedIpArgs {
    /**
     * The allocated IP address of the specific reserved IP to retrieve.
     */
    ipAddress: string;
}

/**
 * A collection of values returned by getReservedIp.
 */
export interface GetReservedIpResult {
    readonly dropletId: number;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ipAddress: string;
    readonly region: string;
    readonly urn: string;
}

export function getReservedIpOutput(args: GetReservedIpOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetReservedIpResult> {
    return pulumi.output(args).apply(a => getReservedIp(a, opts))
}

/**
 * A collection of arguments for invoking getReservedIp.
 */
export interface GetReservedIpOutputArgs {
    /**
     * The allocated IP address of the specific reserved IP to retrieve.
     */
    ipAddress: pulumi.Input<string>;
}
