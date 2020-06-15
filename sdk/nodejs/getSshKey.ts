// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Get information on a ssh key. This data source provides the name, public key,
 * and fingerprint as configured on your DigitalOcean account. This is useful if
 * the ssh key in question is not managed by this provider or you need to utilize any
 * of the keys data.
 *
 * An error is triggered if the provided ssh key name does not exist.
 *
 * ## Example Usage
 *
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const exampleSshKey = digitalocean.getSshKey({
 *     name: "example",
 * });
 * const exampleDroplet = new digitalocean.Droplet("exampleDroplet", {
 *     image: "ubuntu-18-04-x64",
 *     region: "nyc2",
 *     size: "s-1vcpu-1gb",
 *     sshKeys: [exampleSshKey.then(exampleSshKey => exampleSshKey.id)],
 * });
 * ```
 */
export function getSshKey(args: GetSshKeyArgs, opts?: pulumi.InvokeOptions): Promise<GetSshKeyResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
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
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
    readonly publicKey: string;
}
