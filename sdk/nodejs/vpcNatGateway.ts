// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as enums from "./types/enums";
import * as utilities from "./utilities";

/**
 * Provides a DigitalOcean VPC NAT Gateway resource. This can be used to create, modify,
 * read and delete VPC NAT Gateways.
 *
 * NOTE: VPC NAT Gateway is currently in Private Preview.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const my_vpc = new digitalocean.Vpc("my-vpc", {
 *     name: "terraform-example",
 *     region: "nyc3",
 * });
 * const my_vpc_nat_gateway = new digitalocean.VpcNatGateway("my-vpc-nat-gateway", {
 *     name: "terraform-example",
 *     type: "PUBLIC",
 *     region: "nyc3",
 *     size: 1,
 *     vpcs: [{
 *         vpcUuid: my_vpc.id,
 *     }],
 *     udpTimeoutSeconds: 30,
 *     icmpTimeoutSeconds: 30,
 *     tcpTimeoutSeconds: 30,
 * });
 * ```
 *
 * ## Import
 *
 * VPC NAT Gateways can be imported using their `id`, e.g.
 *
 * ```sh
 * $ pulumi import digitalocean:index/vpcNatGateway:VpcNatGateway my-vpc-nat-gateway-id 38e66834-d741-47ec-88e7-c70cbdcz0445
 * ```
 */
export class VpcNatGateway extends pulumi.CustomResource {
    /**
     * Get an existing VpcNatGateway resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VpcNatGatewayState, opts?: pulumi.CustomResourceOptions): VpcNatGateway {
        return new VpcNatGateway(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'digitalocean:index/vpcNatGateway:VpcNatGateway';

    /**
     * Returns true if the given object is an instance of VpcNatGateway.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is VpcNatGateway {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === VpcNatGateway.__pulumiType;
    }

    /**
     * Created at timestamp for the VPC NAT Gateway.
     */
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * Embeds the list of public egresses assigned to the VPC NAT Gateway: resolves as list of
     * `publicGateways` embedding the reserved `ipv4` addresses.
     */
    public /*out*/ readonly egresses!: pulumi.Output<outputs.VpcNatGatewayEgress[]>;
    /**
     * The egress timeout value for ICMP connections of the VPC NAT Gateway.
     */
    public readonly icmpTimeoutSeconds!: pulumi.Output<number>;
    /**
     * The name of the VPC NAT Gateway.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The region for the VPC NAT Gateway.
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * The size of the VPC NAT Gateway.
     */
    public readonly size!: pulumi.Output<number>;
    /**
     * State of the VPC NAT Gateway
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * The egress timeout value for TCP connections of the VPC NAT Gateway.
     */
    public readonly tcpTimeoutSeconds!: pulumi.Output<number>;
    /**
     * The type of the VPC NAT Gateway.
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * The egress timeout value for UDP connections of the VPC NAT Gateway.
     */
    public readonly udpTimeoutSeconds!: pulumi.Output<number>;
    /**
     * Updated at timestamp for the VPC NAT Gateway.
     */
    public /*out*/ readonly updatedAt!: pulumi.Output<string>;
    /**
     * The ingress VPC configuration of the VPC NAT Gateway, the supported arguments are
     * documented below.
     */
    public readonly vpcs!: pulumi.Output<outputs.VpcNatGatewayVpc[]>;

    /**
     * Create a VpcNatGateway resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VpcNatGatewayArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VpcNatGatewayArgs | VpcNatGatewayState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VpcNatGatewayState | undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["egresses"] = state ? state.egresses : undefined;
            resourceInputs["icmpTimeoutSeconds"] = state ? state.icmpTimeoutSeconds : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["size"] = state ? state.size : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["tcpTimeoutSeconds"] = state ? state.tcpTimeoutSeconds : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["udpTimeoutSeconds"] = state ? state.udpTimeoutSeconds : undefined;
            resourceInputs["updatedAt"] = state ? state.updatedAt : undefined;
            resourceInputs["vpcs"] = state ? state.vpcs : undefined;
        } else {
            const args = argsOrState as VpcNatGatewayArgs | undefined;
            if ((!args || args.region === undefined) && !opts.urn) {
                throw new Error("Missing required property 'region'");
            }
            if ((!args || args.size === undefined) && !opts.urn) {
                throw new Error("Missing required property 'size'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            if ((!args || args.vpcs === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vpcs'");
            }
            resourceInputs["icmpTimeoutSeconds"] = args ? args.icmpTimeoutSeconds : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["size"] = args ? args.size : undefined;
            resourceInputs["tcpTimeoutSeconds"] = args ? args.tcpTimeoutSeconds : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["udpTimeoutSeconds"] = args ? args.udpTimeoutSeconds : undefined;
            resourceInputs["vpcs"] = args ? args.vpcs : undefined;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["egresses"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
            resourceInputs["updatedAt"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(VpcNatGateway.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering VpcNatGateway resources.
 */
export interface VpcNatGatewayState {
    /**
     * Created at timestamp for the VPC NAT Gateway.
     */
    createdAt?: pulumi.Input<string>;
    /**
     * Embeds the list of public egresses assigned to the VPC NAT Gateway: resolves as list of
     * `publicGateways` embedding the reserved `ipv4` addresses.
     */
    egresses?: pulumi.Input<pulumi.Input<inputs.VpcNatGatewayEgress>[]>;
    /**
     * The egress timeout value for ICMP connections of the VPC NAT Gateway.
     */
    icmpTimeoutSeconds?: pulumi.Input<number>;
    /**
     * The name of the VPC NAT Gateway.
     */
    name?: pulumi.Input<string>;
    /**
     * The region for the VPC NAT Gateway.
     */
    region?: pulumi.Input<string>;
    /**
     * The size of the VPC NAT Gateway.
     */
    size?: pulumi.Input<number>;
    /**
     * State of the VPC NAT Gateway
     */
    state?: pulumi.Input<string>;
    /**
     * The egress timeout value for TCP connections of the VPC NAT Gateway.
     */
    tcpTimeoutSeconds?: pulumi.Input<number>;
    /**
     * The type of the VPC NAT Gateway.
     */
    type?: pulumi.Input<string>;
    /**
     * The egress timeout value for UDP connections of the VPC NAT Gateway.
     */
    udpTimeoutSeconds?: pulumi.Input<number>;
    /**
     * Updated at timestamp for the VPC NAT Gateway.
     */
    updatedAt?: pulumi.Input<string>;
    /**
     * The ingress VPC configuration of the VPC NAT Gateway, the supported arguments are
     * documented below.
     */
    vpcs?: pulumi.Input<pulumi.Input<inputs.VpcNatGatewayVpc>[]>;
}

/**
 * The set of arguments for constructing a VpcNatGateway resource.
 */
export interface VpcNatGatewayArgs {
    /**
     * The egress timeout value for ICMP connections of the VPC NAT Gateway.
     */
    icmpTimeoutSeconds?: pulumi.Input<number>;
    /**
     * The name of the VPC NAT Gateway.
     */
    name?: pulumi.Input<string>;
    /**
     * The region for the VPC NAT Gateway.
     */
    region: pulumi.Input<string>;
    /**
     * The size of the VPC NAT Gateway.
     */
    size: pulumi.Input<number>;
    /**
     * The egress timeout value for TCP connections of the VPC NAT Gateway.
     */
    tcpTimeoutSeconds?: pulumi.Input<number>;
    /**
     * The type of the VPC NAT Gateway.
     */
    type: pulumi.Input<string>;
    /**
     * The egress timeout value for UDP connections of the VPC NAT Gateway.
     */
    udpTimeoutSeconds?: pulumi.Input<number>;
    /**
     * The ingress VPC configuration of the VPC NAT Gateway, the supported arguments are
     * documented below.
     */
    vpcs: pulumi.Input<pulumi.Input<inputs.VpcNatGatewayVpc>[]>;
}
