// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a DigitalOcean Tag resource. A Tag is a label that can be applied to a
 * Droplet resource in order to better organize or facilitate the lookups and
 * actions on it. Tags created with this resource can be referenced in your Droplet
 * configuration via their ID or name.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * // Create a new tag
 * const foobar = new digitalocean.Tag("foobar", {});
 * // Create a new Droplet in nyc3 with the foobar tag
 * const web = new digitalocean.Droplet("web", {
 *     image: "ubuntu-18-04-x64",
 *     region: digitalocean.Region.NYC3,
 *     size: digitalocean.DropletSlug.DropletS1VCPU1GB,
 *     tags: [foobar.id],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Tags can be imported using the `name`, e.g.
 *
 * ```sh
 * $ pulumi import digitalocean:index/tag:Tag mytag tagname
 * ```
 */
export class Tag extends pulumi.CustomResource {
    /**
     * Get an existing Tag resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TagState, opts?: pulumi.CustomResourceOptions): Tag {
        return new Tag(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'digitalocean:index/tag:Tag';

    /**
     * Returns true if the given object is an instance of Tag.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Tag {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Tag.__pulumiType;
    }

    /**
     * A count of the database clusters that the tag is applied to.
     */
    public /*out*/ readonly databasesCount!: pulumi.Output<number>;
    /**
     * A count of the Droplets the tag is applied to.
     */
    public /*out*/ readonly dropletsCount!: pulumi.Output<number>;
    /**
     * A count of the images that the tag is applied to.
     */
    public /*out*/ readonly imagesCount!: pulumi.Output<number>;
    /**
     * The name of the tag
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A count of the total number of resources that the tag is applied to.
     */
    public /*out*/ readonly totalResourceCount!: pulumi.Output<number>;
    /**
     * A count of the volume snapshots that the tag is applied to.
     */
    public /*out*/ readonly volumeSnapshotsCount!: pulumi.Output<number>;
    /**
     * A count of the volumes that the tag is applied to.
     */
    public /*out*/ readonly volumesCount!: pulumi.Output<number>;

    /**
     * Create a Tag resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: TagArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TagArgs | TagState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TagState | undefined;
            resourceInputs["databasesCount"] = state ? state.databasesCount : undefined;
            resourceInputs["dropletsCount"] = state ? state.dropletsCount : undefined;
            resourceInputs["imagesCount"] = state ? state.imagesCount : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["totalResourceCount"] = state ? state.totalResourceCount : undefined;
            resourceInputs["volumeSnapshotsCount"] = state ? state.volumeSnapshotsCount : undefined;
            resourceInputs["volumesCount"] = state ? state.volumesCount : undefined;
        } else {
            const args = argsOrState as TagArgs | undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["databasesCount"] = undefined /*out*/;
            resourceInputs["dropletsCount"] = undefined /*out*/;
            resourceInputs["imagesCount"] = undefined /*out*/;
            resourceInputs["totalResourceCount"] = undefined /*out*/;
            resourceInputs["volumeSnapshotsCount"] = undefined /*out*/;
            resourceInputs["volumesCount"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Tag.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Tag resources.
 */
export interface TagState {
    /**
     * A count of the database clusters that the tag is applied to.
     */
    databasesCount?: pulumi.Input<number>;
    /**
     * A count of the Droplets the tag is applied to.
     */
    dropletsCount?: pulumi.Input<number>;
    /**
     * A count of the images that the tag is applied to.
     */
    imagesCount?: pulumi.Input<number>;
    /**
     * The name of the tag
     */
    name?: pulumi.Input<string>;
    /**
     * A count of the total number of resources that the tag is applied to.
     */
    totalResourceCount?: pulumi.Input<number>;
    /**
     * A count of the volume snapshots that the tag is applied to.
     */
    volumeSnapshotsCount?: pulumi.Input<number>;
    /**
     * A count of the volumes that the tag is applied to.
     */
    volumesCount?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a Tag resource.
 */
export interface TagArgs {
    /**
     * The name of the tag
     */
    name?: pulumi.Input<string>;
}
