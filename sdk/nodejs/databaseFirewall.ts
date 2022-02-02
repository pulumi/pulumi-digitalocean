// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs, enums } from "./types";
import * as utilities from "./utilities";

/**
 * Provides a DigitalOcean database firewall resource allowing you to restrict
 * connections to your database to trusted sources. You may limit connections to
 * specific Droplets, Kubernetes clusters, or IP addresses.
 *
 * ## Example Usage
 * ### Create a new database firewall allowing multiple IP addresses
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const postgres_example = new digitalocean.DatabaseCluster("postgres-example", {
 *     engine: "pg",
 *     version: "11",
 *     size: "db-s-1vcpu-1gb",
 *     region: "nyc1",
 *     nodeCount: 1,
 * });
 * const example_fw = new digitalocean.DatabaseFirewall("example-fw", {
 *     clusterId: postgres_example.id,
 *     rules: [
 *         {
 *             type: "ip_addr",
 *             value: "192.168.1.1",
 *         },
 *         {
 *             type: "ip_addr",
 *             value: "192.0.2.0",
 *         },
 *     ],
 * });
 * ```
 * ### Create a new database firewall allowing a Droplet
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const web = new digitalocean.Droplet("web", {
 *     size: "s-1vcpu-1gb",
 *     image: "centos-7-x64",
 *     region: "nyc3",
 * });
 * const postgres_example = new digitalocean.DatabaseCluster("postgres-example", {
 *     engine: "pg",
 *     version: "11",
 *     size: "db-s-1vcpu-1gb",
 *     region: "nyc1",
 *     nodeCount: 1,
 * });
 * const example_fw = new digitalocean.DatabaseFirewall("example-fw", {
 *     clusterId: postgres_example.id,
 *     rules: [{
 *         type: "droplet",
 *         value: web.id,
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Database firewalls can be imported using the `id` of the target database cluster For example
 *
 * ```sh
 *  $ pulumi import digitalocean:index/databaseFirewall:DatabaseFirewall example-fw 5f55c6cd-863b-4907-99b8-7e09b0275d54
 * ```
 */
export class DatabaseFirewall extends pulumi.CustomResource {
    /**
     * Get an existing DatabaseFirewall resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DatabaseFirewallState, opts?: pulumi.CustomResourceOptions): DatabaseFirewall {
        return new DatabaseFirewall(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'digitalocean:index/databaseFirewall:DatabaseFirewall';

    /**
     * Returns true if the given object is an instance of DatabaseFirewall.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DatabaseFirewall {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DatabaseFirewall.__pulumiType;
    }

    /**
     * The ID of the target database cluster.
     */
    public readonly clusterId!: pulumi.Output<string>;
    /**
     * A rule specifying a resource allowed to access the database cluster. The following arguments must be specified:
     */
    public readonly rules!: pulumi.Output<outputs.DatabaseFirewallRule[]>;

    /**
     * Create a DatabaseFirewall resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DatabaseFirewallArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DatabaseFirewallArgs | DatabaseFirewallState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DatabaseFirewallState | undefined;
            resourceInputs["clusterId"] = state ? state.clusterId : undefined;
            resourceInputs["rules"] = state ? state.rules : undefined;
        } else {
            const args = argsOrState as DatabaseFirewallArgs | undefined;
            if ((!args || args.clusterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterId'");
            }
            if ((!args || args.rules === undefined) && !opts.urn) {
                throw new Error("Missing required property 'rules'");
            }
            resourceInputs["clusterId"] = args ? args.clusterId : undefined;
            resourceInputs["rules"] = args ? args.rules : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DatabaseFirewall.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DatabaseFirewall resources.
 */
export interface DatabaseFirewallState {
    /**
     * The ID of the target database cluster.
     */
    clusterId?: pulumi.Input<string>;
    /**
     * A rule specifying a resource allowed to access the database cluster. The following arguments must be specified:
     */
    rules?: pulumi.Input<pulumi.Input<inputs.DatabaseFirewallRule>[]>;
}

/**
 * The set of arguments for constructing a DatabaseFirewall resource.
 */
export interface DatabaseFirewallArgs {
    /**
     * The ID of the target database cluster.
     */
    clusterId: pulumi.Input<string>;
    /**
     * A rule specifying a resource allowed to access the database cluster. The following arguments must be specified:
     */
    rules: pulumi.Input<pulumi.Input<inputs.DatabaseFirewallRule>[]>;
}
