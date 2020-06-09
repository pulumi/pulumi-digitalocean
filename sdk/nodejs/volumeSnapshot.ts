// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

import {Region} from "./index";

/**
 * Provides a DigitalOcean Volume Snapshot which can be used to create a snapshot from an existing volume.
 *
 * ## Example Usage
 *
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const foobarVolume = new digitalocean.Volume("foobarVolume", {
 *     region: "nyc1",
 *     size: 100,
 *     description: "an example volume",
 * });
 * const foobarVolumeSnapshot = new digitalocean.VolumeSnapshot("foobarVolumeSnapshot", {volumeId: foobarVolume.id});
 * ```
 */
export class VolumeSnapshot extends pulumi.CustomResource {
    /**
     * Get an existing VolumeSnapshot resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VolumeSnapshotState, opts?: pulumi.CustomResourceOptions): VolumeSnapshot {
        return new VolumeSnapshot(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'digitalocean:index/volumeSnapshot:VolumeSnapshot';

    /**
     * Returns true if the given object is an instance of VolumeSnapshot.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is VolumeSnapshot {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === VolumeSnapshot.__pulumiType;
    }

    /**
     * The date and time the volume snapshot was created.
     */
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * The minimum size in gigabytes required for a volume to be created based on this volume snapshot.
     */
    public /*out*/ readonly minDiskSize!: pulumi.Output<number>;
    /**
     * A name for the volume snapshot.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A list of DigitalOcean region "slugs" indicating where the volume snapshot is available.
     */
    public /*out*/ readonly regions!: pulumi.Output<Region[]>;
    /**
     * The billable size of the volume snapshot in gigabytes.
     */
    public /*out*/ readonly size!: pulumi.Output<number>;
    /**
     * A list of the tags to be applied to this volume snapshot.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;
    /**
     * The ID of the volume from which the volume snapshot originated.
     */
    public readonly volumeId!: pulumi.Output<string>;

    /**
     * Create a VolumeSnapshot resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VolumeSnapshotArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VolumeSnapshotArgs | VolumeSnapshotState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as VolumeSnapshotState | undefined;
            inputs["createdAt"] = state ? state.createdAt : undefined;
            inputs["minDiskSize"] = state ? state.minDiskSize : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["regions"] = state ? state.regions : undefined;
            inputs["size"] = state ? state.size : undefined;
            inputs["tags"] = state ? state.tags : undefined;
            inputs["volumeId"] = state ? state.volumeId : undefined;
        } else {
            const args = argsOrState as VolumeSnapshotArgs | undefined;
            if (!args || args.volumeId === undefined) {
                throw new Error("Missing required property 'volumeId'");
            }
            inputs["name"] = args ? args.name : undefined;
            inputs["tags"] = args ? args.tags : undefined;
            inputs["volumeId"] = args ? args.volumeId : undefined;
            inputs["createdAt"] = undefined /*out*/;
            inputs["minDiskSize"] = undefined /*out*/;
            inputs["regions"] = undefined /*out*/;
            inputs["size"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(VolumeSnapshot.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering VolumeSnapshot resources.
 */
export interface VolumeSnapshotState {
    /**
     * The date and time the volume snapshot was created.
     */
    readonly createdAt?: pulumi.Input<string>;
    /**
     * The minimum size in gigabytes required for a volume to be created based on this volume snapshot.
     */
    readonly minDiskSize?: pulumi.Input<number>;
    /**
     * A name for the volume snapshot.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * A list of DigitalOcean region "slugs" indicating where the volume snapshot is available.
     */
    readonly regions?: pulumi.Input<pulumi.Input<Region>[]>;
    /**
     * The billable size of the volume snapshot in gigabytes.
     */
    readonly size?: pulumi.Input<number>;
    /**
     * A list of the tags to be applied to this volume snapshot.
     */
    readonly tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of the volume from which the volume snapshot originated.
     */
    readonly volumeId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a VolumeSnapshot resource.
 */
export interface VolumeSnapshotArgs {
    /**
     * A name for the volume snapshot.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * A list of the tags to be applied to this volume snapshot.
     */
    readonly tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of the volume from which the volume snapshot originated.
     */
    readonly volumeId: pulumi.Input<string>;
}
