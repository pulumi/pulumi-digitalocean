// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a DigitalOcean domain resource.
 *
 * ## Import
 *
 * Domains can be imported using the `domain name`, e.g.
 *
 * ```sh
 *  $ pulumi import digitalocean:index/domain:Domain mydomain mytestdomain.com
 * ```
 */
export class Domain extends pulumi.CustomResource {
    /**
     * Get an existing Domain resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DomainState, opts?: pulumi.CustomResourceOptions): Domain {
        return new Domain(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'digitalocean:index/domain:Domain';

    /**
     * Returns true if the given object is an instance of Domain.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Domain {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Domain.__pulumiType;
    }

    /**
     * The uniform resource name of the domain
     */
    public /*out*/ readonly domainUrn!: pulumi.Output<string>;
    /**
     * The IP address of the domain. If specified, this IP
     * is used to created an initial A record for the domain.
     */
    public readonly ipAddress!: pulumi.Output<string | undefined>;
    /**
     * The name of the domain
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The TTL value of the domain
     */
    public /*out*/ readonly ttl!: pulumi.Output<number>;

    /**
     * Create a Domain resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DomainArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DomainArgs | DomainState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DomainState | undefined;
            resourceInputs["domainUrn"] = state ? state.domainUrn : undefined;
            resourceInputs["ipAddress"] = state ? state.ipAddress : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["ttl"] = state ? state.ttl : undefined;
        } else {
            const args = argsOrState as DomainArgs | undefined;
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            resourceInputs["ipAddress"] = args ? args.ipAddress : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["domainUrn"] = undefined /*out*/;
            resourceInputs["ttl"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Domain.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Domain resources.
 */
export interface DomainState {
    /**
     * The uniform resource name of the domain
     */
    domainUrn?: pulumi.Input<string>;
    /**
     * The IP address of the domain. If specified, this IP
     * is used to created an initial A record for the domain.
     */
    ipAddress?: pulumi.Input<string>;
    /**
     * The name of the domain
     */
    name?: pulumi.Input<string>;
    /**
     * The TTL value of the domain
     */
    ttl?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a Domain resource.
 */
export interface DomainArgs {
    /**
     * The IP address of the domain. If specified, this IP
     * is used to created an initial A record for the domain.
     */
    ipAddress?: pulumi.Input<string>;
    /**
     * The name of the domain
     */
    name: pulumi.Input<string>;
}
