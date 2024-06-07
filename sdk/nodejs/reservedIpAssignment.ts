// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a resource for assigning an existing DigitalOcean reserved IP to a Droplet. This
 * makes it easy to provision reserved IP addresses that are not tied to the lifecycle of your
 * Droplet.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const example = new digitalocean.ReservedIp("example", {region: "nyc3"});
 * const exampleDroplet = new digitalocean.Droplet("example", {
 *     name: "baz",
 *     size: digitalocean.DropletSlug.DropletS1VCPU1GB,
 *     image: "ubuntu-22-04-x64",
 *     region: digitalocean.Region.NYC3,
 *     ipv6: true,
 *     privateNetworking: true,
 * });
 * const exampleReservedIpAssignment = new digitalocean.ReservedIpAssignment("example", {
 *     ipAddress: example.ipAddress,
 *     dropletId: exampleDroplet.id,
 * });
 * ```
 *
 * ## Import
 *
 * Reserved IP assignments can be imported using the reserved IP itself and the `id` of
 *
 * the Droplet joined with a comma. For example:
 *
 * ```sh
 * $ pulumi import digitalocean:index/reservedIpAssignment:ReservedIpAssignment foobar 192.0.2.1,123456
 * ```
 */
export class ReservedIpAssignment extends pulumi.CustomResource {
    /**
     * Get an existing ReservedIpAssignment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ReservedIpAssignmentState, opts?: pulumi.CustomResourceOptions): ReservedIpAssignment {
        return new ReservedIpAssignment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'digitalocean:index/reservedIpAssignment:ReservedIpAssignment';

    /**
     * Returns true if the given object is an instance of ReservedIpAssignment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ReservedIpAssignment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ReservedIpAssignment.__pulumiType;
    }

    /**
     * The ID of Droplet that the reserved IP will be assigned to.
     */
    public readonly dropletId!: pulumi.Output<number>;
    /**
     * The reserved IP to assign to the Droplet.
     */
    public readonly ipAddress!: pulumi.Output<string>;

    /**
     * Create a ReservedIpAssignment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ReservedIpAssignmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ReservedIpAssignmentArgs | ReservedIpAssignmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ReservedIpAssignmentState | undefined;
            resourceInputs["dropletId"] = state ? state.dropletId : undefined;
            resourceInputs["ipAddress"] = state ? state.ipAddress : undefined;
        } else {
            const args = argsOrState as ReservedIpAssignmentArgs | undefined;
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
        super(ReservedIpAssignment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ReservedIpAssignment resources.
 */
export interface ReservedIpAssignmentState {
    /**
     * The ID of Droplet that the reserved IP will be assigned to.
     */
    dropletId?: pulumi.Input<number>;
    /**
     * The reserved IP to assign to the Droplet.
     */
    ipAddress?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ReservedIpAssignment resource.
 */
export interface ReservedIpAssignmentArgs {
    /**
     * The ID of Droplet that the reserved IP will be assigned to.
     */
    dropletId: pulumi.Input<number>;
    /**
     * The reserved IP to assign to the Droplet.
     */
    ipAddress: pulumi.Input<string>;
}
