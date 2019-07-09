// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export function getSshKey(args: GetSshKeyArgs, opts?: pulumi.InvokeOptions): Promise<GetSshKeyResult> {
    return pulumi.runtime.invoke("digitalocean:index/getSshKey:getSshKey", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getSshKey.
 */
export interface GetSshKeyArgs {
    /**
     * The name of the ssh key.
     */
    readonly name: string;
}

/**
 * A collection of values returned by getSshKey.
 */
export interface GetSshKeyResult {
    readonly fingerprint: string;
    readonly name: string;
    readonly publicKey: string;
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
