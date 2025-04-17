// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as enums from "./types/enums";
import * as utilities from "./utilities";

export class PartnerAttachment extends pulumi.CustomResource {
    /**
     * Get an existing PartnerAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PartnerAttachmentState, opts?: pulumi.CustomResourceOptions): PartnerAttachment {
        return new PartnerAttachment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'digitalocean:index/partnerAttachment:PartnerAttachment';

    /**
     * Returns true if the given object is an instance of PartnerAttachment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PartnerAttachment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PartnerAttachment.__pulumiType;
    }

    public readonly bgp!: pulumi.Output<outputs.PartnerAttachmentBgp | undefined>;
    /**
     * The connection bandwidth in Mbps
     */
    public readonly connectionBandwidthInMbps!: pulumi.Output<number>;
    /**
     * The date and time when the Partner Attachment was created
     */
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * The NaaS provider
     */
    public readonly naasProvider!: pulumi.Output<string>;
    /**
     * The name of the Partner Attachment
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The region where the Partner Attachment will be created
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * The state of the Partner Attachment
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * The list of VPC IDs to attach the Partner Attachment to
     */
    public readonly vpcIds!: pulumi.Output<string[]>;

    /**
     * Create a PartnerAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PartnerAttachmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PartnerAttachmentArgs | PartnerAttachmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PartnerAttachmentState | undefined;
            resourceInputs["bgp"] = state ? state.bgp : undefined;
            resourceInputs["connectionBandwidthInMbps"] = state ? state.connectionBandwidthInMbps : undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["naasProvider"] = state ? state.naasProvider : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["vpcIds"] = state ? state.vpcIds : undefined;
        } else {
            const args = argsOrState as PartnerAttachmentArgs | undefined;
            if ((!args || args.connectionBandwidthInMbps === undefined) && !opts.urn) {
                throw new Error("Missing required property 'connectionBandwidthInMbps'");
            }
            if ((!args || args.naasProvider === undefined) && !opts.urn) {
                throw new Error("Missing required property 'naasProvider'");
            }
            if ((!args || args.region === undefined) && !opts.urn) {
                throw new Error("Missing required property 'region'");
            }
            if ((!args || args.vpcIds === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vpcIds'");
            }
            resourceInputs["bgp"] = args ? args.bgp : undefined;
            resourceInputs["connectionBandwidthInMbps"] = args ? args.connectionBandwidthInMbps : undefined;
            resourceInputs["naasProvider"] = args ? args.naasProvider : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["vpcIds"] = args ? args.vpcIds : undefined;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PartnerAttachment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PartnerAttachment resources.
 */
export interface PartnerAttachmentState {
    bgp?: pulumi.Input<inputs.PartnerAttachmentBgp>;
    /**
     * The connection bandwidth in Mbps
     */
    connectionBandwidthInMbps?: pulumi.Input<number>;
    /**
     * The date and time when the Partner Attachment was created
     */
    createdAt?: pulumi.Input<string>;
    /**
     * The NaaS provider
     */
    naasProvider?: pulumi.Input<string>;
    /**
     * The name of the Partner Attachment
     */
    name?: pulumi.Input<string>;
    /**
     * The region where the Partner Attachment will be created
     */
    region?: pulumi.Input<string>;
    /**
     * The state of the Partner Attachment
     */
    state?: pulumi.Input<string>;
    /**
     * The list of VPC IDs to attach the Partner Attachment to
     */
    vpcIds?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a PartnerAttachment resource.
 */
export interface PartnerAttachmentArgs {
    bgp?: pulumi.Input<inputs.PartnerAttachmentBgp>;
    /**
     * The connection bandwidth in Mbps
     */
    connectionBandwidthInMbps: pulumi.Input<number>;
    /**
     * The NaaS provider
     */
    naasProvider: pulumi.Input<string>;
    /**
     * The name of the Partner Attachment
     */
    name?: pulumi.Input<string>;
    /**
     * The region where the Partner Attachment will be created
     */
    region: pulumi.Input<string>;
    /**
     * The list of VPC IDs to attach the Partner Attachment to
     */
    vpcIds: pulumi.Input<pulumi.Input<string>[]>;
}
