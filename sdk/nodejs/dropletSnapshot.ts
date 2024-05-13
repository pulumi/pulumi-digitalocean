// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a resource which can be used to create a snapshot from an existing DigitalOcean Droplet.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const web = new digitalocean.Droplet("web", {
 *     name: "web-01",
 *     size: digitalocean.DropletSlug.DropletS1VCPU1GB,
 *     image: "ubuntu-22-04-x64",
 *     region: digitalocean.Region.NYC3,
 * });
 * const web_snapshot = new digitalocean.DropletSnapshot("web-snapshot", {
 *     dropletId: web.id,
 *     name: "web-snapshot-01",
 * });
 * const from_snapshot = new digitalocean.Droplet("from-snapshot", {
 *     image: web_snapshot.id,
 *     name: "web-02",
 *     region: digitalocean.Region.NYC3,
 *     size: digitalocean.DropletSlug.DropletS2VCPU4GB,
 * });
 * ```
 *
 * ## Import
 *
 * Droplet Snapshots can be imported using the `snapshot id`, e.g.
 *
 * ```sh
 * $ pulumi import digitalocean:index/dropletSnapshot:DropletSnapshot mysnapshot 123456
 * ```
 */
export class DropletSnapshot extends pulumi.CustomResource {
    /**
     * Get an existing DropletSnapshot resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DropletSnapshotState, opts?: pulumi.CustomResourceOptions): DropletSnapshot {
        return new DropletSnapshot(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'digitalocean:index/dropletSnapshot:DropletSnapshot';

    /**
     * Returns true if the given object is an instance of DropletSnapshot.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DropletSnapshot {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DropletSnapshot.__pulumiType;
    }

    /**
     * The date and time the Droplet snapshot was created.
     */
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * The ID of the Droplet from which the snapshot will be taken.
     */
    public readonly dropletId!: pulumi.Output<string>;
    /**
     * The minimum size in gigabytes required for a Droplet to be created based on this snapshot.
     */
    public /*out*/ readonly minDiskSize!: pulumi.Output<number>;
    /**
     * A name for the Droplet snapshot.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A list of DigitalOcean region "slugs" indicating where the droplet snapshot is available.
     */
    public /*out*/ readonly regions!: pulumi.Output<string[]>;
    /**
     * The billable size of the Droplet snapshot in gigabytes.
     */
    public /*out*/ readonly size!: pulumi.Output<number>;

    /**
     * Create a DropletSnapshot resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DropletSnapshotArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DropletSnapshotArgs | DropletSnapshotState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DropletSnapshotState | undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["dropletId"] = state ? state.dropletId : undefined;
            resourceInputs["minDiskSize"] = state ? state.minDiskSize : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["regions"] = state ? state.regions : undefined;
            resourceInputs["size"] = state ? state.size : undefined;
        } else {
            const args = argsOrState as DropletSnapshotArgs | undefined;
            if ((!args || args.dropletId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dropletId'");
            }
            resourceInputs["dropletId"] = args ? args.dropletId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["minDiskSize"] = undefined /*out*/;
            resourceInputs["regions"] = undefined /*out*/;
            resourceInputs["size"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DropletSnapshot.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DropletSnapshot resources.
 */
export interface DropletSnapshotState {
    /**
     * The date and time the Droplet snapshot was created.
     */
    createdAt?: pulumi.Input<string>;
    /**
     * The ID of the Droplet from which the snapshot will be taken.
     */
    dropletId?: pulumi.Input<string>;
    /**
     * The minimum size in gigabytes required for a Droplet to be created based on this snapshot.
     */
    minDiskSize?: pulumi.Input<number>;
    /**
     * A name for the Droplet snapshot.
     */
    name?: pulumi.Input<string>;
    /**
     * A list of DigitalOcean region "slugs" indicating where the droplet snapshot is available.
     */
    regions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The billable size of the Droplet snapshot in gigabytes.
     */
    size?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a DropletSnapshot resource.
 */
export interface DropletSnapshotArgs {
    /**
     * The ID of the Droplet from which the snapshot will be taken.
     */
    dropletId: pulumi.Input<string>;
    /**
     * A name for the Droplet snapshot.
     */
    name?: pulumi.Input<string>;
}
