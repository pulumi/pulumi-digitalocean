// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as enums from "./types/enums";
import * as utilities from "./utilities";

/**
 * Provides a DigitalOcean Droplet resource. This can be used to create,
 * modify, and delete Droplets.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * // Create a new Web Droplet in the nyc2 region
 * const web = new digitalocean.Droplet("web", {
 *     image: "ubuntu-20-04-x64",
 *     region: "nyc2",
 *     size: "s-1vcpu-1gb",
 * });
 * ```
 *
 * ## Import
 *
 * Droplets can be imported using the Droplet `id`, e.g.
 *
 * ```sh
 * $ pulumi import digitalocean:index/droplet:Droplet mydroplet 100823
 * ```
 */
export class Droplet extends pulumi.CustomResource {
    /**
     * Get an existing Droplet resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DropletState, opts?: pulumi.CustomResourceOptions): Droplet {
        return new Droplet(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'digitalocean:index/droplet:Droplet';

    /**
     * Returns true if the given object is an instance of Droplet.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Droplet {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Droplet.__pulumiType;
    }

    /**
     * Boolean controlling if backups are made. Defaults to
     * false.
     */
    public readonly backups!: pulumi.Output<boolean | undefined>;
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * The size of the instance's disk in GB
     */
    public /*out*/ readonly disk!: pulumi.Output<number>;
    /**
     * A boolean indicating whether to install the
     * DigitalOcean agent used for providing access to the Droplet web console in
     * the control panel. By default, the agent is installed on new Droplets but
     * installation errors (i.e. OS not supported) are ignored. To prevent it from
     * being installed, set to `false`. To make installation errors fatal, explicitly
     * set it to `true`.
     */
    public readonly dropletAgent!: pulumi.Output<boolean | undefined>;
    /**
     * The uniform resource name of the Droplet
     */
    public /*out*/ readonly dropletUrn!: pulumi.Output<string>;
    /**
     * A boolean indicating whether the droplet
     * should be gracefully shut down before it is deleted.
     *
     * > **NOTE:** If you use `volumeIds` on a Droplet, this provider will assume management over the full set volumes for the instance, and treat additional volumes as a drift. For this reason, `volumeIds` must not be mixed with external `digitalocean.VolumeAttachment` resources for a given instance.
     */
    public readonly gracefulShutdown!: pulumi.Output<boolean | undefined>;
    /**
     * The Droplet image ID or slug. This could be either image ID or droplet snapshot ID.
     */
    public readonly image!: pulumi.Output<string>;
    /**
     * The IPv4 address
     */
    public /*out*/ readonly ipv4Address!: pulumi.Output<string>;
    /**
     * The private networking IPv4 address
     */
    public /*out*/ readonly ipv4AddressPrivate!: pulumi.Output<string>;
    /**
     * Boolean controlling if IPv6 is enabled. Defaults to false.
     * Once enabled for a Droplet, IPv6 can not be disabled. When enabling IPv6 on
     * an existing Droplet, [additional OS-level configuration](https://docs.digitalocean.com/products/networking/ipv6/how-to/enable/#on-existing-droplets)
     * is required.
     */
    public readonly ipv6!: pulumi.Output<boolean | undefined>;
    /**
     * The IPv6 address
     */
    public readonly ipv6Address!: pulumi.Output<string>;
    /**
     * Is the Droplet locked
     */
    public /*out*/ readonly locked!: pulumi.Output<boolean>;
    public /*out*/ readonly memory!: pulumi.Output<number>;
    /**
     * Boolean controlling whether monitoring agent is installed.
     * Defaults to false. If set to `true`, you can configure monitor alert policies
     * [monitor alert resource](https://www.terraform.io/providers/digitalocean/digitalocean/latest/docs/resources/monitor_alert)
     */
    public readonly monitoring!: pulumi.Output<boolean | undefined>;
    /**
     * The Droplet name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Droplet hourly price
     */
    public /*out*/ readonly priceHourly!: pulumi.Output<number>;
    /**
     * Droplet monthly price
     */
    public /*out*/ readonly priceMonthly!: pulumi.Output<number>;
    /**
     * **Deprecated** Boolean controlling if private networking
     * is enabled. This parameter has been deprecated. Use `vpcUuid` instead to specify a VPC network for the Droplet. If no `vpcUuid` is provided, the Droplet will be placed in your account's default VPC for the region.
     *
     * @deprecated This parameter has been deprecated. Use `vpc_uuid` instead to specify a VPC network for the Droplet. If no `vpc_uuid` is provided, the Droplet will be placed in your account's default VPC for the region.
     */
    public readonly privateNetworking!: pulumi.Output<boolean>;
    /**
     * The region where the Droplet will be created.
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * Boolean controlling whether to increase the disk
     * size when resizing a Droplet. It defaults to `true`. When set to `false`,
     * only the Droplet's RAM and CPU will be resized. **Increasing a Droplet's disk
     * size is a permanent change**. Increasing only RAM and CPU is reversible.
     */
    public readonly resizeDisk!: pulumi.Output<boolean | undefined>;
    /**
     * The unique slug that indentifies the type of Droplet. You can find a list of available slugs on [DigitalOcean API documentation](https://docs.digitalocean.com/reference/api/api-reference/#tag/Sizes).
     */
    public readonly size!: pulumi.Output<string>;
    /**
     * A list of SSH key IDs or fingerprints to enable in
     * the format `[12345, 123456]`. To retrieve this info, use the
     * [DigitalOcean API](https://docs.digitalocean.com/reference/api/api-reference/#tag/SSH-Keys)
     * or CLI (`doctl compute ssh-key list`). Once a Droplet is created keys can not
     * be added or removed via this provider. Modifying this field will prompt you
     * to destroy and recreate the Droplet.
     */
    public readonly sshKeys!: pulumi.Output<string[] | undefined>;
    /**
     * The status of the Droplet
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * A list of the tags to be applied to this Droplet.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;
    /**
     * A string of the desired User Data for the Droplet.
     */
    public readonly userData!: pulumi.Output<string | undefined>;
    /**
     * The number of the instance's virtual CPUs
     */
    public /*out*/ readonly vcpus!: pulumi.Output<number>;
    /**
     * A list of the IDs of each block storage volume to be attached to the Droplet.
     */
    public readonly volumeIds!: pulumi.Output<string[]>;
    /**
     * The ID of the VPC where the Droplet will be located.
     */
    public readonly vpcUuid!: pulumi.Output<string>;

    /**
     * Create a Droplet resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DropletArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DropletArgs | DropletState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DropletState | undefined;
            resourceInputs["backups"] = state ? state.backups : undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["disk"] = state ? state.disk : undefined;
            resourceInputs["dropletAgent"] = state ? state.dropletAgent : undefined;
            resourceInputs["dropletUrn"] = state ? state.dropletUrn : undefined;
            resourceInputs["gracefulShutdown"] = state ? state.gracefulShutdown : undefined;
            resourceInputs["image"] = state ? state.image : undefined;
            resourceInputs["ipv4Address"] = state ? state.ipv4Address : undefined;
            resourceInputs["ipv4AddressPrivate"] = state ? state.ipv4AddressPrivate : undefined;
            resourceInputs["ipv6"] = state ? state.ipv6 : undefined;
            resourceInputs["ipv6Address"] = state ? state.ipv6Address : undefined;
            resourceInputs["locked"] = state ? state.locked : undefined;
            resourceInputs["memory"] = state ? state.memory : undefined;
            resourceInputs["monitoring"] = state ? state.monitoring : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["priceHourly"] = state ? state.priceHourly : undefined;
            resourceInputs["priceMonthly"] = state ? state.priceMonthly : undefined;
            resourceInputs["privateNetworking"] = state ? state.privateNetworking : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["resizeDisk"] = state ? state.resizeDisk : undefined;
            resourceInputs["size"] = state ? state.size : undefined;
            resourceInputs["sshKeys"] = state ? state.sshKeys : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["userData"] = state ? state.userData : undefined;
            resourceInputs["vcpus"] = state ? state.vcpus : undefined;
            resourceInputs["volumeIds"] = state ? state.volumeIds : undefined;
            resourceInputs["vpcUuid"] = state ? state.vpcUuid : undefined;
        } else {
            const args = argsOrState as DropletArgs | undefined;
            if ((!args || args.image === undefined) && !opts.urn) {
                throw new Error("Missing required property 'image'");
            }
            if ((!args || args.size === undefined) && !opts.urn) {
                throw new Error("Missing required property 'size'");
            }
            resourceInputs["backups"] = args ? args.backups : undefined;
            resourceInputs["dropletAgent"] = args ? args.dropletAgent : undefined;
            resourceInputs["gracefulShutdown"] = args ? args.gracefulShutdown : undefined;
            resourceInputs["image"] = args ? args.image : undefined;
            resourceInputs["ipv6"] = args ? args.ipv6 : undefined;
            resourceInputs["ipv6Address"] = args ? args.ipv6Address : undefined;
            resourceInputs["monitoring"] = args ? args.monitoring : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["privateNetworking"] = args ? args.privateNetworking : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["resizeDisk"] = args ? args.resizeDisk : undefined;
            resourceInputs["size"] = args ? args.size : undefined;
            resourceInputs["sshKeys"] = args ? args.sshKeys : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["userData"] = args ? args.userData : undefined;
            resourceInputs["volumeIds"] = args ? args.volumeIds : undefined;
            resourceInputs["vpcUuid"] = args ? args.vpcUuid : undefined;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["disk"] = undefined /*out*/;
            resourceInputs["dropletUrn"] = undefined /*out*/;
            resourceInputs["ipv4Address"] = undefined /*out*/;
            resourceInputs["ipv4AddressPrivate"] = undefined /*out*/;
            resourceInputs["locked"] = undefined /*out*/;
            resourceInputs["memory"] = undefined /*out*/;
            resourceInputs["priceHourly"] = undefined /*out*/;
            resourceInputs["priceMonthly"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
            resourceInputs["vcpus"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Droplet.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Droplet resources.
 */
export interface DropletState {
    /**
     * Boolean controlling if backups are made. Defaults to
     * false.
     */
    backups?: pulumi.Input<boolean>;
    createdAt?: pulumi.Input<string>;
    /**
     * The size of the instance's disk in GB
     */
    disk?: pulumi.Input<number>;
    /**
     * A boolean indicating whether to install the
     * DigitalOcean agent used for providing access to the Droplet web console in
     * the control panel. By default, the agent is installed on new Droplets but
     * installation errors (i.e. OS not supported) are ignored. To prevent it from
     * being installed, set to `false`. To make installation errors fatal, explicitly
     * set it to `true`.
     */
    dropletAgent?: pulumi.Input<boolean>;
    /**
     * The uniform resource name of the Droplet
     */
    dropletUrn?: pulumi.Input<string>;
    /**
     * A boolean indicating whether the droplet
     * should be gracefully shut down before it is deleted.
     *
     * > **NOTE:** If you use `volumeIds` on a Droplet, this provider will assume management over the full set volumes for the instance, and treat additional volumes as a drift. For this reason, `volumeIds` must not be mixed with external `digitalocean.VolumeAttachment` resources for a given instance.
     */
    gracefulShutdown?: pulumi.Input<boolean>;
    /**
     * The Droplet image ID or slug. This could be either image ID or droplet snapshot ID.
     */
    image?: pulumi.Input<string>;
    /**
     * The IPv4 address
     */
    ipv4Address?: pulumi.Input<string>;
    /**
     * The private networking IPv4 address
     */
    ipv4AddressPrivate?: pulumi.Input<string>;
    /**
     * Boolean controlling if IPv6 is enabled. Defaults to false.
     * Once enabled for a Droplet, IPv6 can not be disabled. When enabling IPv6 on
     * an existing Droplet, [additional OS-level configuration](https://docs.digitalocean.com/products/networking/ipv6/how-to/enable/#on-existing-droplets)
     * is required.
     */
    ipv6?: pulumi.Input<boolean>;
    /**
     * The IPv6 address
     */
    ipv6Address?: pulumi.Input<string>;
    /**
     * Is the Droplet locked
     */
    locked?: pulumi.Input<boolean>;
    memory?: pulumi.Input<number>;
    /**
     * Boolean controlling whether monitoring agent is installed.
     * Defaults to false. If set to `true`, you can configure monitor alert policies
     * [monitor alert resource](https://www.terraform.io/providers/digitalocean/digitalocean/latest/docs/resources/monitor_alert)
     */
    monitoring?: pulumi.Input<boolean>;
    /**
     * The Droplet name.
     */
    name?: pulumi.Input<string>;
    /**
     * Droplet hourly price
     */
    priceHourly?: pulumi.Input<number>;
    /**
     * Droplet monthly price
     */
    priceMonthly?: pulumi.Input<number>;
    /**
     * **Deprecated** Boolean controlling if private networking
     * is enabled. This parameter has been deprecated. Use `vpcUuid` instead to specify a VPC network for the Droplet. If no `vpcUuid` is provided, the Droplet will be placed in your account's default VPC for the region.
     *
     * @deprecated This parameter has been deprecated. Use `vpc_uuid` instead to specify a VPC network for the Droplet. If no `vpc_uuid` is provided, the Droplet will be placed in your account's default VPC for the region.
     */
    privateNetworking?: pulumi.Input<boolean>;
    /**
     * The region where the Droplet will be created.
     */
    region?: pulumi.Input<string | enums.Region>;
    /**
     * Boolean controlling whether to increase the disk
     * size when resizing a Droplet. It defaults to `true`. When set to `false`,
     * only the Droplet's RAM and CPU will be resized. **Increasing a Droplet's disk
     * size is a permanent change**. Increasing only RAM and CPU is reversible.
     */
    resizeDisk?: pulumi.Input<boolean>;
    /**
     * The unique slug that indentifies the type of Droplet. You can find a list of available slugs on [DigitalOcean API documentation](https://docs.digitalocean.com/reference/api/api-reference/#tag/Sizes).
     */
    size?: pulumi.Input<string | enums.DropletSlug>;
    /**
     * A list of SSH key IDs or fingerprints to enable in
     * the format `[12345, 123456]`. To retrieve this info, use the
     * [DigitalOcean API](https://docs.digitalocean.com/reference/api/api-reference/#tag/SSH-Keys)
     * or CLI (`doctl compute ssh-key list`). Once a Droplet is created keys can not
     * be added or removed via this provider. Modifying this field will prompt you
     * to destroy and recreate the Droplet.
     */
    sshKeys?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The status of the Droplet
     */
    status?: pulumi.Input<string>;
    /**
     * A list of the tags to be applied to this Droplet.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A string of the desired User Data for the Droplet.
     */
    userData?: pulumi.Input<string>;
    /**
     * The number of the instance's virtual CPUs
     */
    vcpus?: pulumi.Input<number>;
    /**
     * A list of the IDs of each block storage volume to be attached to the Droplet.
     */
    volumeIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of the VPC where the Droplet will be located.
     */
    vpcUuid?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Droplet resource.
 */
export interface DropletArgs {
    /**
     * Boolean controlling if backups are made. Defaults to
     * false.
     */
    backups?: pulumi.Input<boolean>;
    /**
     * A boolean indicating whether to install the
     * DigitalOcean agent used for providing access to the Droplet web console in
     * the control panel. By default, the agent is installed on new Droplets but
     * installation errors (i.e. OS not supported) are ignored. To prevent it from
     * being installed, set to `false`. To make installation errors fatal, explicitly
     * set it to `true`.
     */
    dropletAgent?: pulumi.Input<boolean>;
    /**
     * A boolean indicating whether the droplet
     * should be gracefully shut down before it is deleted.
     *
     * > **NOTE:** If you use `volumeIds` on a Droplet, this provider will assume management over the full set volumes for the instance, and treat additional volumes as a drift. For this reason, `volumeIds` must not be mixed with external `digitalocean.VolumeAttachment` resources for a given instance.
     */
    gracefulShutdown?: pulumi.Input<boolean>;
    /**
     * The Droplet image ID or slug. This could be either image ID or droplet snapshot ID.
     */
    image: pulumi.Input<string>;
    /**
     * Boolean controlling if IPv6 is enabled. Defaults to false.
     * Once enabled for a Droplet, IPv6 can not be disabled. When enabling IPv6 on
     * an existing Droplet, [additional OS-level configuration](https://docs.digitalocean.com/products/networking/ipv6/how-to/enable/#on-existing-droplets)
     * is required.
     */
    ipv6?: pulumi.Input<boolean>;
    /**
     * The IPv6 address
     */
    ipv6Address?: pulumi.Input<string>;
    /**
     * Boolean controlling whether monitoring agent is installed.
     * Defaults to false. If set to `true`, you can configure monitor alert policies
     * [monitor alert resource](https://www.terraform.io/providers/digitalocean/digitalocean/latest/docs/resources/monitor_alert)
     */
    monitoring?: pulumi.Input<boolean>;
    /**
     * The Droplet name.
     */
    name?: pulumi.Input<string>;
    /**
     * **Deprecated** Boolean controlling if private networking
     * is enabled. This parameter has been deprecated. Use `vpcUuid` instead to specify a VPC network for the Droplet. If no `vpcUuid` is provided, the Droplet will be placed in your account's default VPC for the region.
     *
     * @deprecated This parameter has been deprecated. Use `vpc_uuid` instead to specify a VPC network for the Droplet. If no `vpc_uuid` is provided, the Droplet will be placed in your account's default VPC for the region.
     */
    privateNetworking?: pulumi.Input<boolean>;
    /**
     * The region where the Droplet will be created.
     */
    region?: pulumi.Input<string | enums.Region>;
    /**
     * Boolean controlling whether to increase the disk
     * size when resizing a Droplet. It defaults to `true`. When set to `false`,
     * only the Droplet's RAM and CPU will be resized. **Increasing a Droplet's disk
     * size is a permanent change**. Increasing only RAM and CPU is reversible.
     */
    resizeDisk?: pulumi.Input<boolean>;
    /**
     * The unique slug that indentifies the type of Droplet. You can find a list of available slugs on [DigitalOcean API documentation](https://docs.digitalocean.com/reference/api/api-reference/#tag/Sizes).
     */
    size: pulumi.Input<string | enums.DropletSlug>;
    /**
     * A list of SSH key IDs or fingerprints to enable in
     * the format `[12345, 123456]`. To retrieve this info, use the
     * [DigitalOcean API](https://docs.digitalocean.com/reference/api/api-reference/#tag/SSH-Keys)
     * or CLI (`doctl compute ssh-key list`). Once a Droplet is created keys can not
     * be added or removed via this provider. Modifying this field will prompt you
     * to destroy and recreate the Droplet.
     */
    sshKeys?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A list of the tags to be applied to this Droplet.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A string of the desired User Data for the Droplet.
     */
    userData?: pulumi.Input<string>;
    /**
     * A list of the IDs of each block storage volume to be attached to the Droplet.
     */
    volumeIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of the VPC where the Droplet will be located.
     */
    vpcUuid?: pulumi.Input<string>;
}
