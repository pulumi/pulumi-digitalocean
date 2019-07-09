// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export function getDomain(args: GetDomainArgs, opts?: pulumi.InvokeOptions): Promise<GetDomainResult> {
    return pulumi.runtime.invoke("digitalocean:index/getDomain:getDomain", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getDomain.
 */
export interface GetDomainArgs {
    /**
     * The name of the domain.
     */
    readonly name: string;
}

/**
 * A collection of values returned by getDomain.
 */
export interface GetDomainResult {
    readonly name: string;
    readonly ttl: number;
    /**
     * The uniform resource name of the domain
     * * `zone_file`: The zone file of the domain.
     */
    readonly urn: string;
    readonly zoneFile: string;
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
