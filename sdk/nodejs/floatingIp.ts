// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a DigitalOcean Floating IP to represent a publicly-accessible static IP addresses that can be mapped to one of your Droplets.
 *
 * > **NOTE:** Floating IPs can be assigned to a Droplet either directly on the `digitalocean.FloatingIp` resource by setting a `dropletId` or using the `digitalocean.FloatingIpAssignment` resource, but the two cannot be used together.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const foobarDroplet = new digitalocean.Droplet("foobarDroplet", {
 *     size: "s-1vcpu-1gb",
 *     image: "ubuntu-18-04-x64",
 *     region: "sgp1",
 *     ipv6: true,
 *     privateNetworking: true,
 * });
 * const foobarFloatingIp = new digitalocean.FloatingIp("foobarFloatingIp", {
 *     dropletId: foobarDroplet.id,
 *     region: foobarDroplet.region,
 * });
 * ```
 *
 * ## Import
 *
 * Floating IPs can be imported using the `ip`, e.g.
 *
 * ```sh
 *  $ pulumi import digitalocean:index/floatingIp:FloatingIp myip 192.168.0.1
 * ```
 */
export class FloatingIp extends pulumi.CustomResource {
    /**
     * Get an existing FloatingIp resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FloatingIpState, opts?: pulumi.CustomResourceOptions): FloatingIp {
        return new FloatingIp(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'digitalocean:index/floatingIp:FloatingIp';

    /**
     * Returns true if the given object is an instance of FloatingIp.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is FloatingIp {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === FloatingIp.__pulumiType;
    }

    /**
     * The ID of Droplet that the Floating IP will be assigned to.
     */
    public readonly dropletId!: pulumi.Output<number | undefined>;
    /**
     * The uniform resource name of the floating ip
     */
    public /*out*/ readonly floatingIpUrn!: pulumi.Output<string>;
    /**
     * The IP Address of the resource
     */
    public readonly ipAddress!: pulumi.Output<string>;
    /**
     * The region that the Floating IP is reserved to.
     */
    public readonly region!: pulumi.Output<string>;

    /**
     * Create a FloatingIp resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FloatingIpArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FloatingIpArgs | FloatingIpState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FloatingIpState | undefined;
            resourceInputs["dropletId"] = state ? state.dropletId : undefined;
            resourceInputs["floatingIpUrn"] = state ? state.floatingIpUrn : undefined;
            resourceInputs["ipAddress"] = state ? state.ipAddress : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
        } else {
            const args = argsOrState as FloatingIpArgs | undefined;
            if ((!args || args.region === undefined) && !opts.urn) {
                throw new Error("Missing required property 'region'");
            }
            resourceInputs["dropletId"] = args ? args.dropletId : undefined;
            resourceInputs["ipAddress"] = args ? args.ipAddress : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["floatingIpUrn"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(FloatingIp.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering FloatingIp resources.
 */
export interface FloatingIpState {
    /**
     * The ID of Droplet that the Floating IP will be assigned to.
     */
    dropletId?: pulumi.Input<number>;
    /**
     * The uniform resource name of the floating ip
     */
    floatingIpUrn?: pulumi.Input<string>;
    /**
     * The IP Address of the resource
     */
    ipAddress?: pulumi.Input<string>;
    /**
     * The region that the Floating IP is reserved to.
     */
    region?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a FloatingIp resource.
 */
export interface FloatingIpArgs {
    /**
     * The ID of Droplet that the Floating IP will be assigned to.
     */
    dropletId?: pulumi.Input<number>;
    /**
     * The IP Address of the resource
     */
    ipAddress?: pulumi.Input<string>;
    /**
     * The region that the Floating IP is reserved to.
     */
    region: pulumi.Input<string>;
}
