// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as enums from "./types/enums";
import * as utilities from "./utilities";

/**
 * Provides a DigitalOcean Load Balancer resource. This can be used to create,
 * modify, and delete Load Balancers.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const web = new digitalocean.Droplet("web", {
 *     size: digitalocean.DropletSlug.DropletS1VCPU1GB,
 *     image: "ubuntu-18-04-x64",
 *     region: digitalocean.Region.NYC3,
 * });
 * const _public = new digitalocean.LoadBalancer("public", {
 *     region: digitalocean.Region.NYC3,
 *     forwardingRules: [{
 *         entryPort: 80,
 *         entryProtocol: "http",
 *         targetPort: 80,
 *         targetProtocol: "http",
 *     }],
 *     healthcheck: {
 *         port: 22,
 *         protocol: "tcp",
 *     },
 *     dropletIds: [web.id],
 * });
 * ```
 *
 * When managing certificates attached to the load balancer, make sure to add the `createBeforeDestroy`
 * lifecycle property in order to ensure the certificate is correctly updated when changed. The order of
 * operations will then be: `Create new certificate` > `Update loadbalancer with new certificate` ->
 * `Delete old certificate`. When doing so, you must also change the name of the certificate,
 * as there cannot be multiple certificates with the same name in an account.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const cert = new digitalocean.Certificate("cert", {
 *     privateKey: "file('key.pem')",
 *     leafCertificate: "file('cert.pem')",
 * });
 * const web = new digitalocean.Droplet("web", {
 *     size: digitalocean.DropletSlug.DropletS1VCPU1GB,
 *     image: "ubuntu-18-04-x64",
 *     region: digitalocean.Region.NYC3,
 * });
 * const _public = new digitalocean.LoadBalancer("public", {
 *     region: digitalocean.Region.NYC3,
 *     forwardingRules: [{
 *         entryPort: 443,
 *         entryProtocol: "https",
 *         targetPort: 80,
 *         targetProtocol: "http",
 *         certificateName: cert.name,
 *     }],
 *     healthcheck: {
 *         port: 22,
 *         protocol: "tcp",
 *     },
 *     dropletIds: [web.id],
 * });
 * ```
 *
 * ## Import
 *
 * Load Balancers can be imported using the `id`, e.g.
 *
 * ```sh
 * $ pulumi import digitalocean:index/loadBalancer:LoadBalancer myloadbalancer 4de7ac8b-495b-4884-9a69-1050c6793cd6
 * ```
 */
export class LoadBalancer extends pulumi.CustomResource {
    /**
     * Get an existing LoadBalancer resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LoadBalancerState, opts?: pulumi.CustomResourceOptions): LoadBalancer {
        return new LoadBalancer(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'digitalocean:index/loadBalancer:LoadBalancer';

    /**
     * Returns true if the given object is an instance of LoadBalancer.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LoadBalancer {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LoadBalancer.__pulumiType;
    }

    /**
     * The load balancing algorithm used to determine
     * which backend Droplet will be selected by a client. It must be either `roundRobin`
     * or `leastConnections`. The default value is `roundRobin`.
     */
    public readonly algorithm!: pulumi.Output<string | undefined>;
    /**
     * A boolean value indicating whether to disable automatic DNS record creation for Let's Encrypt certificates that are added to the load balancer. Default value is `false`.
     */
    public readonly disableLetsEncryptDnsRecords!: pulumi.Output<boolean | undefined>;
    /**
     * A list of the IDs of each droplet to be attached to the Load Balancer.
     */
    public readonly dropletIds!: pulumi.Output<number[]>;
    /**
     * The name of a Droplet tag corresponding to Droplets to be assigned to the Load Balancer.
     */
    public readonly dropletTag!: pulumi.Output<string | undefined>;
    /**
     * A boolean value indicating whether HTTP keepalive connections are maintained to target Droplets. Default value is `false`.
     */
    public readonly enableBackendKeepalive!: pulumi.Output<boolean | undefined>;
    /**
     * A boolean value indicating whether PROXY
     * Protocol should be used to pass information from connecting client requests to
     * the backend service. Default value is `false`.
     */
    public readonly enableProxyProtocol!: pulumi.Output<boolean | undefined>;
    /**
     * A block containing rules for allowing/denying traffic to the Load Balancer. The `firewall` block is documented below. Only 1 firewall is allowed.
     */
    public readonly firewall!: pulumi.Output<outputs.LoadBalancerFirewall>;
    /**
     * A list of `forwardingRule` to be assigned to the
     * Load Balancer. The `forwardingRule` block is documented below.
     */
    public readonly forwardingRules!: pulumi.Output<outputs.LoadBalancerForwardingRule[]>;
    /**
     * A `healthcheck` block to be assigned to the
     * Load Balancer. The `healthcheck` block is documented below. Only 1 healthcheck is allowed.
     */
    public readonly healthcheck!: pulumi.Output<outputs.LoadBalancerHealthcheck>;
    /**
     * Specifies the idle timeout for HTTPS connections on the load balancer in seconds.
     */
    public readonly httpIdleTimeoutSeconds!: pulumi.Output<number>;
    /**
     * The ip of the Load Balancer
     */
    public /*out*/ readonly ip!: pulumi.Output<string>;
    /**
     * The uniform resource name for the Load Balancer
     */
    public /*out*/ readonly loadBalancerUrn!: pulumi.Output<string>;
    /**
     * The Load Balancer name
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The ID of the project that the load balancer is associated with. If no ID is provided at creation, the load balancer associates with the user's default project.
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * A boolean value indicating whether
     * HTTP requests to the Load Balancer on port 80 will be redirected to HTTPS on port 443.
     * Default value is `false`.
     */
    public readonly redirectHttpToHttps!: pulumi.Output<boolean | undefined>;
    /**
     * The region to start in
     */
    public readonly region!: pulumi.Output<string | undefined>;
    /**
     * The size of the Load Balancer. It must be either `lb-small`, `lb-medium`, or `lb-large`. Defaults to `lb-small`. Only one of `size` or `sizeUnit` may be provided.
     */
    public readonly size!: pulumi.Output<string | undefined>;
    /**
     * The size of the Load Balancer. It must be in the range (1, 100). Defaults to `1`. Only one of `size` or `sizeUnit` may be provided.
     */
    public readonly sizeUnit!: pulumi.Output<number>;
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * A `stickySessions` block to be assigned to the
     * Load Balancer. The `stickySessions` block is documented below. Only 1 stickySessions block is allowed.
     */
    public readonly stickySessions!: pulumi.Output<outputs.LoadBalancerStickySessions>;
    /**
     * the type of the load balancer (GLOBAL or REGIONAL)
     */
    public readonly type!: pulumi.Output<string | undefined>;
    /**
     * The ID of the VPC where the load balancer will be located.
     */
    public readonly vpcUuid!: pulumi.Output<string>;

    /**
     * Create a LoadBalancer resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LoadBalancerArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LoadBalancerArgs | LoadBalancerState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LoadBalancerState | undefined;
            resourceInputs["algorithm"] = state ? state.algorithm : undefined;
            resourceInputs["disableLetsEncryptDnsRecords"] = state ? state.disableLetsEncryptDnsRecords : undefined;
            resourceInputs["dropletIds"] = state ? state.dropletIds : undefined;
            resourceInputs["dropletTag"] = state ? state.dropletTag : undefined;
            resourceInputs["enableBackendKeepalive"] = state ? state.enableBackendKeepalive : undefined;
            resourceInputs["enableProxyProtocol"] = state ? state.enableProxyProtocol : undefined;
            resourceInputs["firewall"] = state ? state.firewall : undefined;
            resourceInputs["forwardingRules"] = state ? state.forwardingRules : undefined;
            resourceInputs["healthcheck"] = state ? state.healthcheck : undefined;
            resourceInputs["httpIdleTimeoutSeconds"] = state ? state.httpIdleTimeoutSeconds : undefined;
            resourceInputs["ip"] = state ? state.ip : undefined;
            resourceInputs["loadBalancerUrn"] = state ? state.loadBalancerUrn : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["redirectHttpToHttps"] = state ? state.redirectHttpToHttps : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["size"] = state ? state.size : undefined;
            resourceInputs["sizeUnit"] = state ? state.sizeUnit : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["stickySessions"] = state ? state.stickySessions : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["vpcUuid"] = state ? state.vpcUuid : undefined;
        } else {
            const args = argsOrState as LoadBalancerArgs | undefined;
            if ((!args || args.forwardingRules === undefined) && !opts.urn) {
                throw new Error("Missing required property 'forwardingRules'");
            }
            resourceInputs["algorithm"] = args ? args.algorithm : undefined;
            resourceInputs["disableLetsEncryptDnsRecords"] = args ? args.disableLetsEncryptDnsRecords : undefined;
            resourceInputs["dropletIds"] = args ? args.dropletIds : undefined;
            resourceInputs["dropletTag"] = args ? args.dropletTag : undefined;
            resourceInputs["enableBackendKeepalive"] = args ? args.enableBackendKeepalive : undefined;
            resourceInputs["enableProxyProtocol"] = args ? args.enableProxyProtocol : undefined;
            resourceInputs["firewall"] = args ? args.firewall : undefined;
            resourceInputs["forwardingRules"] = args ? args.forwardingRules : undefined;
            resourceInputs["healthcheck"] = args ? args.healthcheck : undefined;
            resourceInputs["httpIdleTimeoutSeconds"] = args ? args.httpIdleTimeoutSeconds : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["redirectHttpToHttps"] = args ? args.redirectHttpToHttps : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["size"] = args ? args.size : undefined;
            resourceInputs["sizeUnit"] = args ? args.sizeUnit : undefined;
            resourceInputs["stickySessions"] = args ? args.stickySessions : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["vpcUuid"] = args ? args.vpcUuid : undefined;
            resourceInputs["ip"] = undefined /*out*/;
            resourceInputs["loadBalancerUrn"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(LoadBalancer.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LoadBalancer resources.
 */
export interface LoadBalancerState {
    /**
     * The load balancing algorithm used to determine
     * which backend Droplet will be selected by a client. It must be either `roundRobin`
     * or `leastConnections`. The default value is `roundRobin`.
     */
    algorithm?: pulumi.Input<string | enums.Algorithm>;
    /**
     * A boolean value indicating whether to disable automatic DNS record creation for Let's Encrypt certificates that are added to the load balancer. Default value is `false`.
     */
    disableLetsEncryptDnsRecords?: pulumi.Input<boolean>;
    /**
     * A list of the IDs of each droplet to be attached to the Load Balancer.
     */
    dropletIds?: pulumi.Input<pulumi.Input<number>[]>;
    /**
     * The name of a Droplet tag corresponding to Droplets to be assigned to the Load Balancer.
     */
    dropletTag?: pulumi.Input<string>;
    /**
     * A boolean value indicating whether HTTP keepalive connections are maintained to target Droplets. Default value is `false`.
     */
    enableBackendKeepalive?: pulumi.Input<boolean>;
    /**
     * A boolean value indicating whether PROXY
     * Protocol should be used to pass information from connecting client requests to
     * the backend service. Default value is `false`.
     */
    enableProxyProtocol?: pulumi.Input<boolean>;
    /**
     * A block containing rules for allowing/denying traffic to the Load Balancer. The `firewall` block is documented below. Only 1 firewall is allowed.
     */
    firewall?: pulumi.Input<inputs.LoadBalancerFirewall>;
    /**
     * A list of `forwardingRule` to be assigned to the
     * Load Balancer. The `forwardingRule` block is documented below.
     */
    forwardingRules?: pulumi.Input<pulumi.Input<inputs.LoadBalancerForwardingRule>[]>;
    /**
     * A `healthcheck` block to be assigned to the
     * Load Balancer. The `healthcheck` block is documented below. Only 1 healthcheck is allowed.
     */
    healthcheck?: pulumi.Input<inputs.LoadBalancerHealthcheck>;
    /**
     * Specifies the idle timeout for HTTPS connections on the load balancer in seconds.
     */
    httpIdleTimeoutSeconds?: pulumi.Input<number>;
    /**
     * The ip of the Load Balancer
     */
    ip?: pulumi.Input<string>;
    /**
     * The uniform resource name for the Load Balancer
     */
    loadBalancerUrn?: pulumi.Input<string>;
    /**
     * The Load Balancer name
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the project that the load balancer is associated with. If no ID is provided at creation, the load balancer associates with the user's default project.
     */
    projectId?: pulumi.Input<string>;
    /**
     * A boolean value indicating whether
     * HTTP requests to the Load Balancer on port 80 will be redirected to HTTPS on port 443.
     * Default value is `false`.
     */
    redirectHttpToHttps?: pulumi.Input<boolean>;
    /**
     * The region to start in
     */
    region?: pulumi.Input<string | enums.Region>;
    /**
     * The size of the Load Balancer. It must be either `lb-small`, `lb-medium`, or `lb-large`. Defaults to `lb-small`. Only one of `size` or `sizeUnit` may be provided.
     */
    size?: pulumi.Input<string>;
    /**
     * The size of the Load Balancer. It must be in the range (1, 100). Defaults to `1`. Only one of `size` or `sizeUnit` may be provided.
     */
    sizeUnit?: pulumi.Input<number>;
    status?: pulumi.Input<string>;
    /**
     * A `stickySessions` block to be assigned to the
     * Load Balancer. The `stickySessions` block is documented below. Only 1 stickySessions block is allowed.
     */
    stickySessions?: pulumi.Input<inputs.LoadBalancerStickySessions>;
    /**
     * the type of the load balancer (GLOBAL or REGIONAL)
     */
    type?: pulumi.Input<string>;
    /**
     * The ID of the VPC where the load balancer will be located.
     */
    vpcUuid?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a LoadBalancer resource.
 */
export interface LoadBalancerArgs {
    /**
     * The load balancing algorithm used to determine
     * which backend Droplet will be selected by a client. It must be either `roundRobin`
     * or `leastConnections`. The default value is `roundRobin`.
     */
    algorithm?: pulumi.Input<string | enums.Algorithm>;
    /**
     * A boolean value indicating whether to disable automatic DNS record creation for Let's Encrypt certificates that are added to the load balancer. Default value is `false`.
     */
    disableLetsEncryptDnsRecords?: pulumi.Input<boolean>;
    /**
     * A list of the IDs of each droplet to be attached to the Load Balancer.
     */
    dropletIds?: pulumi.Input<pulumi.Input<number>[]>;
    /**
     * The name of a Droplet tag corresponding to Droplets to be assigned to the Load Balancer.
     */
    dropletTag?: pulumi.Input<string>;
    /**
     * A boolean value indicating whether HTTP keepalive connections are maintained to target Droplets. Default value is `false`.
     */
    enableBackendKeepalive?: pulumi.Input<boolean>;
    /**
     * A boolean value indicating whether PROXY
     * Protocol should be used to pass information from connecting client requests to
     * the backend service. Default value is `false`.
     */
    enableProxyProtocol?: pulumi.Input<boolean>;
    /**
     * A block containing rules for allowing/denying traffic to the Load Balancer. The `firewall` block is documented below. Only 1 firewall is allowed.
     */
    firewall?: pulumi.Input<inputs.LoadBalancerFirewall>;
    /**
     * A list of `forwardingRule` to be assigned to the
     * Load Balancer. The `forwardingRule` block is documented below.
     */
    forwardingRules: pulumi.Input<pulumi.Input<inputs.LoadBalancerForwardingRule>[]>;
    /**
     * A `healthcheck` block to be assigned to the
     * Load Balancer. The `healthcheck` block is documented below. Only 1 healthcheck is allowed.
     */
    healthcheck?: pulumi.Input<inputs.LoadBalancerHealthcheck>;
    /**
     * Specifies the idle timeout for HTTPS connections on the load balancer in seconds.
     */
    httpIdleTimeoutSeconds?: pulumi.Input<number>;
    /**
     * The Load Balancer name
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the project that the load balancer is associated with. If no ID is provided at creation, the load balancer associates with the user's default project.
     */
    projectId?: pulumi.Input<string>;
    /**
     * A boolean value indicating whether
     * HTTP requests to the Load Balancer on port 80 will be redirected to HTTPS on port 443.
     * Default value is `false`.
     */
    redirectHttpToHttps?: pulumi.Input<boolean>;
    /**
     * The region to start in
     */
    region?: pulumi.Input<string | enums.Region>;
    /**
     * The size of the Load Balancer. It must be either `lb-small`, `lb-medium`, or `lb-large`. Defaults to `lb-small`. Only one of `size` or `sizeUnit` may be provided.
     */
    size?: pulumi.Input<string>;
    /**
     * The size of the Load Balancer. It must be in the range (1, 100). Defaults to `1`. Only one of `size` or `sizeUnit` may be provided.
     */
    sizeUnit?: pulumi.Input<number>;
    /**
     * A `stickySessions` block to be assigned to the
     * Load Balancer. The `stickySessions` block is documented below. Only 1 stickySessions block is allowed.
     */
    stickySessions?: pulumi.Input<inputs.LoadBalancerStickySessions>;
    /**
     * the type of the load balancer (GLOBAL or REGIONAL)
     */
    type?: pulumi.Input<string>;
    /**
     * The ID of the VPC where the load balancer will be located.
     */
    vpcUuid?: pulumi.Input<string>;
}
