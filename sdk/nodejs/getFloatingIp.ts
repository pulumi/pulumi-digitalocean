// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-digitalocean/blob/master/website/docs/d/floating_ip.html.markdown.
 */
export function getFloatingIp(args: GetFloatingIpArgs, opts?: pulumi.InvokeOptions): Promise<GetFloatingIpResult> & GetFloatingIpResult {
    const promise: Promise<GetFloatingIpResult> = pulumi.runtime.invoke("digitalocean:index/getFloatingIp:getFloatingIp", {
        "ipAddress": args.ipAddress,
    }, opts);

    return pulumi.utils.liftProperties(promise, opts);
}

/**
 * A collection of arguments for invoking getFloatingIp.
 */
export interface GetFloatingIpArgs {
    /**
     * The allocated IP address of the specific floating IP to retrieve.
     */
    readonly ipAddress: string;
}

/**
 * A collection of values returned by getFloatingIp.
 */
export interface GetFloatingIpResult {
    readonly dropletId: number;
    readonly ipAddress: string;
    readonly region: string;
    readonly urn: string;
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
