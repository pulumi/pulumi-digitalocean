// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a resource which can be used to create a [custom image](https://www.digitalocean.com/docs/images/custom-images/)
 * from a URL. The URL must point to an image in one of the following file formats:
 *
 * - Raw (.img) with an MBR or GPT partition table
 * - qcow2
 * - VHDX
 * - VDI
 * - VMDK
 *
 * The image may be compressed using gzip or bzip2. See the DigitalOcean Custom
 * Image documentation for [additional requirements](https://www.digitalocean.com/docs/images/custom-images/#image-requirements).
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const flatcar = new digitalocean.CustomImage("flatcar", {
 *     url: "https://stable.release.flatcar-linux.net/amd64-usr/2605.7.0/flatcar_production_digitalocean_image.bin.bz2",
 *     regions: ["nyc3"],
 * });
 * const example = new digitalocean.Droplet("example", {
 *     image: flatcar.id,
 *     region: digitalocean.Region.NYC3,
 *     size: digitalocean.DropletSlug.DropletS1VCPU1GB,
 *     sshKeys: ["12345"],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export class CustomImage extends pulumi.CustomResource {
    /**
     * Get an existing CustomImage resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CustomImageState, opts?: pulumi.CustomResourceOptions): CustomImage {
        return new CustomImage(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'digitalocean:index/customImage:CustomImage';

    /**
     * Returns true if the given object is an instance of CustomImage.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CustomImage {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CustomImage.__pulumiType;
    }

    /**
     * A time value given in ISO8601 combined date and time format that represents when the image was created.
     */
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * An optional description for the image.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * An optional distribution name for the image. Valid values are documented [here](https://docs.digitalocean.com/reference/api/api-reference/#operation/create_custom_image)
     */
    public readonly distribution!: pulumi.Output<string | undefined>;
    /**
     * A unique number that can be used to identify and reference a specific image.
     */
    public /*out*/ readonly imageId!: pulumi.Output<number>;
    /**
     * The minimum disk size in GB required for a Droplet to use this image.
     */
    public /*out*/ readonly minDiskSize!: pulumi.Output<number>;
    /**
     * A name for the Custom Image.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Indicates whether the image in question is public or not.
     */
    public /*out*/ readonly public!: pulumi.Output<boolean>;
    /**
     * A list of regions. (Currently only one is supported).
     */
    public readonly regions!: pulumi.Output<string[]>;
    /**
     * The size of the image in gigabytes.
     */
    public /*out*/ readonly sizeGigabytes!: pulumi.Output<number>;
    /**
     * A uniquely identifying string for each image.
     */
    public /*out*/ readonly slug!: pulumi.Output<string>;
    /**
     * A status string indicating the state of a custom image.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * A list of optional tags for the image.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;
    /**
     * Describes the kind of image.
     */
    public /*out*/ readonly type!: pulumi.Output<string>;
    /**
     * A URL from which the custom Linux virtual machine image may be retrieved.
     */
    public readonly url!: pulumi.Output<string>;

    /**
     * Create a CustomImage resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CustomImageArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CustomImageArgs | CustomImageState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CustomImageState | undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["distribution"] = state ? state.distribution : undefined;
            resourceInputs["imageId"] = state ? state.imageId : undefined;
            resourceInputs["minDiskSize"] = state ? state.minDiskSize : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["public"] = state ? state.public : undefined;
            resourceInputs["regions"] = state ? state.regions : undefined;
            resourceInputs["sizeGigabytes"] = state ? state.sizeGigabytes : undefined;
            resourceInputs["slug"] = state ? state.slug : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["url"] = state ? state.url : undefined;
        } else {
            const args = argsOrState as CustomImageArgs | undefined;
            if ((!args || args.regions === undefined) && !opts.urn) {
                throw new Error("Missing required property 'regions'");
            }
            if ((!args || args.url === undefined) && !opts.urn) {
                throw new Error("Missing required property 'url'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["distribution"] = args ? args.distribution : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["regions"] = args ? args.regions : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["url"] = args ? args.url : undefined;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["imageId"] = undefined /*out*/;
            resourceInputs["minDiskSize"] = undefined /*out*/;
            resourceInputs["public"] = undefined /*out*/;
            resourceInputs["sizeGigabytes"] = undefined /*out*/;
            resourceInputs["slug"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
            resourceInputs["type"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CustomImage.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CustomImage resources.
 */
export interface CustomImageState {
    /**
     * A time value given in ISO8601 combined date and time format that represents when the image was created.
     */
    createdAt?: pulumi.Input<string>;
    /**
     * An optional description for the image.
     */
    description?: pulumi.Input<string>;
    /**
     * An optional distribution name for the image. Valid values are documented [here](https://docs.digitalocean.com/reference/api/api-reference/#operation/create_custom_image)
     */
    distribution?: pulumi.Input<string>;
    /**
     * A unique number that can be used to identify and reference a specific image.
     */
    imageId?: pulumi.Input<number>;
    /**
     * The minimum disk size in GB required for a Droplet to use this image.
     */
    minDiskSize?: pulumi.Input<number>;
    /**
     * A name for the Custom Image.
     */
    name?: pulumi.Input<string>;
    /**
     * Indicates whether the image in question is public or not.
     */
    public?: pulumi.Input<boolean>;
    /**
     * A list of regions. (Currently only one is supported).
     */
    regions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The size of the image in gigabytes.
     */
    sizeGigabytes?: pulumi.Input<number>;
    /**
     * A uniquely identifying string for each image.
     */
    slug?: pulumi.Input<string>;
    /**
     * A status string indicating the state of a custom image.
     */
    status?: pulumi.Input<string>;
    /**
     * A list of optional tags for the image.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Describes the kind of image.
     */
    type?: pulumi.Input<string>;
    /**
     * A URL from which the custom Linux virtual machine image may be retrieved.
     */
    url?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a CustomImage resource.
 */
export interface CustomImageArgs {
    /**
     * An optional description for the image.
     */
    description?: pulumi.Input<string>;
    /**
     * An optional distribution name for the image. Valid values are documented [here](https://docs.digitalocean.com/reference/api/api-reference/#operation/create_custom_image)
     */
    distribution?: pulumi.Input<string>;
    /**
     * A name for the Custom Image.
     */
    name?: pulumi.Input<string>;
    /**
     * A list of regions. (Currently only one is supported).
     */
    regions: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A list of optional tags for the image.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A URL from which the custom Linux virtual machine image may be retrieved.
     */
    url: pulumi.Input<string>;
}
