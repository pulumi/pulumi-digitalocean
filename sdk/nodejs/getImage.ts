// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Get information on an image for use in other resources (e.g. creating a Droplet
 * based on snapshot). This data source provides all of the image properties as
 * configured on your DigitalOcean account. This is useful if the image in question
 * is not managed by the provider or you need to utilize any of the image's data.
 *
 * An error is triggered if zero or more than one result is returned by the query.
 *
 * ## Example Usage
 *
 * Get the data about a snapshot:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const example1 = digitalocean.getImage({
 *     name: "example-1.0.0",
 * });
 * ```
 *
 * Reuse the data about a snapshot to create a Droplet:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const example = digitalocean.getImage({
 *     name: "example-1.0.0",
 * });
 * const exampleDroplet = new digitalocean.Droplet("example", {
 *     image: example.then(example => example.id),
 *     name: "example-1",
 *     region: digitalocean.Region.NYC2,
 *     size: digitalocean.DropletSlug.DropletS1VCPU1GB,
 * });
 * ```
 *
 * Get the data about an official image:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const example2 = digitalocean.getImage({
 *     slug: "ubuntu-18-04-x64",
 * });
 * ```
 */
export function getImage(args?: GetImageArgs, opts?: pulumi.InvokeOptions): Promise<GetImageResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("digitalocean:index/getImage:getImage", {
        "id": args.id,
        "name": args.name,
        "slug": args.slug,
        "source": args.source,
    }, opts);
}

/**
 * A collection of arguments for invoking getImage.
 */
export interface GetImageArgs {
    /**
     * The id of the image
     */
    id?: number;
    /**
     * The name of the image.
     */
    name?: string;
    /**
     * The slug of the official image.
     *
     * If `name` is specified, you may also specify:
     */
    slug?: string;
    /**
     * Restrict the search to one of the following categories of images:
     */
    source?: string;
}

/**
 * A collection of values returned by getImage.
 */
export interface GetImageResult {
    /**
     * When the image was created
     */
    readonly created: string;
    readonly description: string;
    /**
     * The name of the distribution of the OS of the image.
     */
    readonly distribution: string;
    /**
     * Any applicable error message pertaining to the image
     */
    readonly errorMessage: string;
    /**
     * The ID of the image.
     */
    readonly id: number;
    /**
     * The id of the image (legacy parameter).
     */
    readonly image: string;
    /**
     * The minimum 'disk' required for the image.
     */
    readonly minDiskSize: number;
    /**
     * The name of the image.
     */
    readonly name: string;
    /**
     * Is image a public image or not. Public images represent
     * Linux distributions or One-Click Applications, while non-public images represent
     * snapshots and backups and are only available within your account.
     */
    readonly private: boolean;
    /**
     * A set of the regions that the image is available in.
     */
    readonly regions: string[];
    /**
     * The size of the image in GB.
     */
    readonly sizeGigabytes: number;
    /**
     * Unique text identifier of the image.
     */
    readonly slug: string;
    readonly source?: string;
    /**
     * Current status of the image
     */
    readonly status: string;
    /**
     * A set of tags applied to the image
     */
    readonly tags: string[];
    /**
     * Type of the image.
     */
    readonly type: string;
}
/**
 * Get information on an image for use in other resources (e.g. creating a Droplet
 * based on snapshot). This data source provides all of the image properties as
 * configured on your DigitalOcean account. This is useful if the image in question
 * is not managed by the provider or you need to utilize any of the image's data.
 *
 * An error is triggered if zero or more than one result is returned by the query.
 *
 * ## Example Usage
 *
 * Get the data about a snapshot:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const example1 = digitalocean.getImage({
 *     name: "example-1.0.0",
 * });
 * ```
 *
 * Reuse the data about a snapshot to create a Droplet:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const example = digitalocean.getImage({
 *     name: "example-1.0.0",
 * });
 * const exampleDroplet = new digitalocean.Droplet("example", {
 *     image: example.then(example => example.id),
 *     name: "example-1",
 *     region: digitalocean.Region.NYC2,
 *     size: digitalocean.DropletSlug.DropletS1VCPU1GB,
 * });
 * ```
 *
 * Get the data about an official image:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const example2 = digitalocean.getImage({
 *     slug: "ubuntu-18-04-x64",
 * });
 * ```
 */
export function getImageOutput(args?: GetImageOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetImageResult> {
    return pulumi.output(args).apply((a: any) => getImage(a, opts))
}

/**
 * A collection of arguments for invoking getImage.
 */
export interface GetImageOutputArgs {
    /**
     * The id of the image
     */
    id?: pulumi.Input<number>;
    /**
     * The name of the image.
     */
    name?: pulumi.Input<string>;
    /**
     * The slug of the official image.
     *
     * If `name` is specified, you may also specify:
     */
    slug?: pulumi.Input<string>;
    /**
     * Restrict the search to one of the following categories of images:
     */
    source?: pulumi.Input<string>;
}
