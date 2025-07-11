// *** WARNING: this file was generated by pulumi-language-nodejs. ***
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
 * const example = digitalocean.getSshKey({
 *     name: "example",
 * });
 * const exampleDroplet = new digitalocean.Droplet("example", {
 *     image: "ubuntu-18-04-x64",
 *     name: "example-1",
 *     region: digitalocean.Region.NYC2,
 *     size: digitalocean.DropletSlug.DropletS1VCPU1GB,
 *     sshKeys: [example.then(example => example.id)],
 * });
 * ```
 */
export function getSshKey(args: GetSshKeyArgs, opts?: pulumi.InvokeOptions): Promise<GetSshKeyResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
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
    /**
     * The fingerprint of the public key of the ssh key.
     */
    readonly fingerprint: string;
    /**
     * The ID of the ssh key.
     */
    readonly id: number;
    readonly name: string;
    /**
     * The public key of the ssh key.
     */
    readonly publicKey: string;
}
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
 * const example = digitalocean.getSshKey({
 *     name: "example",
 * });
 * const exampleDroplet = new digitalocean.Droplet("example", {
 *     image: "ubuntu-18-04-x64",
 *     name: "example-1",
 *     region: digitalocean.Region.NYC2,
 *     size: digitalocean.DropletSlug.DropletS1VCPU1GB,
 *     sshKeys: [example.then(example => example.id)],
 * });
 * ```
 */
export function getSshKeyOutput(args: GetSshKeyOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetSshKeyResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("digitalocean:index/getSshKey:getSshKey", {
        "name": args.name,
    }, opts);
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
