// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * > **Deprecated:** DigitalOcean Floating IPs have been renamed reserved IPs. This resource will be removed in a future release. Please use `digitalocean.ReservedIpAssignment` instead.
 *
 * Provides a resource for assigning an existing DigitalOcean Floating IP to a Droplet. This
 * makes it easy to provision floating IP addresses that are not tied to the lifecycle of your
 * Droplet.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const foobarFloatingIp = new digitalocean.FloatingIp("foobarFloatingIp", {region: "sgp1"});
 * const foobarDroplet = new digitalocean.Droplet("foobarDroplet", {
 *     size: "s-1vcpu-1gb",
 *     image: "ubuntu-18-04-x64",
 *     region: "sgp1",
 *     ipv6: true,
 *     privateNetworking: true,
 * });
 * const foobarFloatingIpAssignment = new digitalocean.FloatingIpAssignment("foobarFloatingIpAssignment", {
 *     ipAddress: foobarFloatingIp.ipAddress,
 *     dropletId: foobarDroplet.id,
 * });
 * ```
 *
 * ## Import
 *
 * Floating IP assignments can be imported using the Floating IP itself and the `id` of
 *
 *  the Droplet joined with a comma. For example:
 *
 * ```sh
 * $ pulumi import digitalocean:index/floatingIpAssignment:FloatingIpAssignment foobar 192.0.2.1,123456
 * ```
 */
export class FloatingIpAssignment extends pulumi.CustomResource {
    /**
     * Get an existing FloatingIpAssignment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FloatingIpAssignmentState, opts?: pulumi.CustomResourceOptions): FloatingIpAssignment {
        return new FloatingIpAssignment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'digitalocean:index/floatingIpAssignment:FloatingIpAssignment';

    /**
     * Returns true if the given object is an instance of FloatingIpAssignment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is FloatingIpAssignment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === FloatingIpAssignment.__pulumiType;
    }

    /**
     * The ID of Droplet that the Floating IP will be assigned to.
     */
    public readonly dropletId!: pulumi.Output<number>;
    /**
     * The Floating IP to assign to the Droplet.
     */
    public readonly ipAddress!: pulumi.Output<string>;

    /**
     * Create a FloatingIpAssignment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FloatingIpAssignmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FloatingIpAssignmentArgs | FloatingIpAssignmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FloatingIpAssignmentState | undefined;
            resourceInputs["dropletId"] = state ? state.dropletId : undefined;
            resourceInputs["ipAddress"] = state ? state.ipAddress : undefined;
        } else {
            const args = argsOrState as FloatingIpAssignmentArgs | undefined;
            if ((!args || args.dropletId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dropletId'");
            }
            if ((!args || args.ipAddress === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ipAddress'");
            }
            resourceInputs["dropletId"] = args ? args.dropletId : undefined;
            resourceInputs["ipAddress"] = args ? args.ipAddress : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(FloatingIpAssignment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering FloatingIpAssignment resources.
 */
export interface FloatingIpAssignmentState {
    /**
     * The ID of Droplet that the Floating IP will be assigned to.
     */
    dropletId?: pulumi.Input<number>;
    /**
     * The Floating IP to assign to the Droplet.
     */
    ipAddress?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a FloatingIpAssignment resource.
 */
export interface FloatingIpAssignmentArgs {
    /**
     * The ID of Droplet that the Floating IP will be assigned to.
     */
    dropletId: pulumi.Input<number>;
    /**
     * The Floating IP to assign to the Droplet.
     */
    ipAddress: pulumi.Input<string>;
}
