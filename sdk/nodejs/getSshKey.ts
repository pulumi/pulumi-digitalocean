// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Get information on a ssh key. This data source provides the name, public key,
 * and fingerprint as configured on your DigitalOcean account. This is useful if
 * the ssh key in question is not managed by the provider or you need to utilize any
 * of the keys data.
 *
 * An error is triggered if the provided ssh key name does not exist.
 *
 * ## Example Usage
 *
 * Get the ssh key:
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

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
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
    name: string;
}

/**
 * A collection of values returned by getSshKey.
 */
export interface GetSshKeyResult {
    readonly fingerprint: string;
    readonly id: number;
    readonly name: string;
    readonly publicKey: string;
}

export function getSshKeyOutput(args: GetSshKeyOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSshKeyResult> {
    return pulumi.output(args).apply(a => getSshKey(a, opts))
}

/**
 * A collection of arguments for invoking getSshKey.
 */
export interface GetSshKeyOutputArgs {
    /**
     * The name of the ssh key.
     */
    name: pulumi.Input<string>;
}
