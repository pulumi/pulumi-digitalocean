// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

import {Algorithm, Region} from "./index";

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
 *     image: "ubuntu-18-04-x64",
 *     region: "nyc3",
 *     size: "s-1vcpu-1gb",
 * });
 * const publicLoadBalancer = new digitalocean.LoadBalancer("public", {
 *     dropletIds: [web.id],
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
 *     region: "nyc3",
 * });
 * ```
 * 
 * When managing certificates attached to the load balancer, make sure to add the `create_before_destroy`
 * lifecycle property in order to ensure the certificate is correctly updated when changed. The order of
 * operations will then be: `Create new certificate` > `Update loadbalancer with new certificate` ->
 * `Delete old certificate`. When doing so, you must also change the name of the certificate,
 * as there cannot be multiple certificates with the same name in an account.
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 * import * as fs from "fs";
 * 
 * const cert = new digitalocean.Certificate("cert", {
 *     leafCertificate: fs.readFileSync("cert.pem", "utf-8"),
 *     privateKey: fs.readFileSync("key.pem", "utf-8"),
 * });
 * const web = new digitalocean.Droplet("web", {
 *     image: "ubuntu-18-04-x64",
 *     region: "nyc3",
 *     size: "s-1vcpu-1gb",
 * });
 * const publicLoadBalancer = new digitalocean.LoadBalancer("public", {
 *     dropletIds: [web.id],
 *     forwardingRules: [{
 *         certificateId: cert.id,
 *         entryPort: 443,
 *         entryProtocol: "https",
 *         targetPort: 80,
 *         targetProtocol: "http",
 *     }],
 *     healthcheck: {
 *         port: 22,
 *         protocol: "tcp",
 *     },
 *     region: "nyc3",
 * });
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
     * which backend Droplet will be selected by a client. It must be either `round_robin`
     * or `least_connections`. The default value is `round_robin`.
     */
    public readonly algorithm!: pulumi.Output<Algorithm | undefined>;
    /**
     * A list of the IDs of each droplet to be attached to the Load Balancer.
     */
    public readonly dropletIds!: pulumi.Output<number[]>;
    /**
     * The name of a Droplet tag corresponding to Droplets to be assigned to the Load Balancer.
     */
    public readonly dropletTag!: pulumi.Output<string | undefined>;
    /**
     * A boolean value indicating whether PROXY
     * Protocol should be used to pass information from connecting client requests to
     * the backend service. Default value is `false`.
     */
    public readonly enableProxyProtocol!: pulumi.Output<boolean | undefined>;
    /**
     * A list of `forwarding_rule` to be assigned to the
     * Load Balancer. The `forwarding_rule` block is documented below.
     */
    public readonly forwardingRules!: pulumi.Output<{ certificateId?: string, entryPort: number, entryProtocol: string, targetPort: number, targetProtocol: string, tlsPassthrough?: boolean }[]>;
    /**
     * A `healthcheck` block to be assigned to the
     * Load Balancer. The `healthcheck` block is documented below. Only 1 healthcheck is allowed.
     */
    public readonly healthcheck!: pulumi.Output<{ checkIntervalSeconds?: number, healthyThreshold?: number, path?: string, port: number, protocol: string, responseTimeoutSeconds?: number, unhealthyThreshold?: number }>;
    public /*out*/ readonly ip!: pulumi.Output<string>;
    /**
     * The Load Balancer name
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A boolean value indicating whether
     * HTTP requests to the Load Balancer on port 80 will be redirected to HTTPS on port 443.
     * Default value is `false`.
     */
    public readonly redirectHttpToHttps!: pulumi.Output<boolean | undefined>;
    /**
     * The region to start in
     */
    public readonly region!: pulumi.Output<Region>;
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * A `sticky_sessions` block to be assigned to the
     * Load Balancer. The `sticky_sessions` block is documented below. Only 1 sticky_sessions block is allowed.
     */
    public readonly stickySessions!: pulumi.Output<{ cookieName?: string, cookieTtlSeconds?: number, type?: string }>;
    /**
     * The uniform resource name for the Load Balancer
     */
    public /*out*/ readonly urn!: pulumi.Output<string>;

    /**
     * Create a LoadBalancer resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LoadBalancerArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LoadBalancerArgs | LoadBalancerState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as LoadBalancerState | undefined;
            inputs["algorithm"] = state ? state.algorithm : undefined;
            inputs["dropletIds"] = state ? state.dropletIds : undefined;
            inputs["dropletTag"] = state ? state.dropletTag : undefined;
            inputs["enableProxyProtocol"] = state ? state.enableProxyProtocol : undefined;
            inputs["forwardingRules"] = state ? state.forwardingRules : undefined;
            inputs["healthcheck"] = state ? state.healthcheck : undefined;
            inputs["ip"] = state ? state.ip : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["redirectHttpToHttps"] = state ? state.redirectHttpToHttps : undefined;
            inputs["region"] = state ? state.region : undefined;
            inputs["status"] = state ? state.status : undefined;
            inputs["stickySessions"] = state ? state.stickySessions : undefined;
            inputs["urn"] = state ? state.urn : undefined;
        } else {
            const args = argsOrState as LoadBalancerArgs | undefined;
            if (!args || args.forwardingRules === undefined) {
                throw new Error("Missing required property 'forwardingRules'");
            }
            if (!args || args.region === undefined) {
                throw new Error("Missing required property 'region'");
            }
            inputs["algorithm"] = args ? args.algorithm : undefined;
            inputs["dropletIds"] = args ? args.dropletIds : undefined;
            inputs["dropletTag"] = args ? args.dropletTag : undefined;
            inputs["enableProxyProtocol"] = args ? args.enableProxyProtocol : undefined;
            inputs["forwardingRules"] = args ? args.forwardingRules : undefined;
            inputs["healthcheck"] = args ? args.healthcheck : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["redirectHttpToHttps"] = args ? args.redirectHttpToHttps : undefined;
            inputs["region"] = args ? args.region : undefined;
            inputs["stickySessions"] = args ? args.stickySessions : undefined;
            inputs["ip"] = undefined /*out*/;
            inputs["status"] = undefined /*out*/;
            inputs["urn"] = undefined /*out*/;
        }
        super(LoadBalancer.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LoadBalancer resources.
 */
export interface LoadBalancerState {
    /**
     * The load balancing algorithm used to determine
     * which backend Droplet will be selected by a client. It must be either `round_robin`
     * or `least_connections`. The default value is `round_robin`.
     */
    readonly algorithm?: pulumi.Input<Algorithm>;
    /**
     * A list of the IDs of each droplet to be attached to the Load Balancer.
     */
    readonly dropletIds?: pulumi.Input<pulumi.Input<number>[]>;
    /**
     * The name of a Droplet tag corresponding to Droplets to be assigned to the Load Balancer.
     */
    readonly dropletTag?: pulumi.Input<string>;
    /**
     * A boolean value indicating whether PROXY
     * Protocol should be used to pass information from connecting client requests to
     * the backend service. Default value is `false`.
     */
    readonly enableProxyProtocol?: pulumi.Input<boolean>;
    /**
     * A list of `forwarding_rule` to be assigned to the
     * Load Balancer. The `forwarding_rule` block is documented below.
     */
    readonly forwardingRules?: pulumi.Input<pulumi.Input<{ certificateId?: pulumi.Input<string>, entryPort: pulumi.Input<number>, entryProtocol: pulumi.Input<string>, targetPort: pulumi.Input<number>, targetProtocol: pulumi.Input<string>, tlsPassthrough?: pulumi.Input<boolean> }>[]>;
    /**
     * A `healthcheck` block to be assigned to the
     * Load Balancer. The `healthcheck` block is documented below. Only 1 healthcheck is allowed.
     */
    readonly healthcheck?: pulumi.Input<{ checkIntervalSeconds?: pulumi.Input<number>, healthyThreshold?: pulumi.Input<number>, path?: pulumi.Input<string>, port: pulumi.Input<number>, protocol: pulumi.Input<string>, responseTimeoutSeconds?: pulumi.Input<number>, unhealthyThreshold?: pulumi.Input<number> }>;
    readonly ip?: pulumi.Input<string>;
    /**
     * The Load Balancer name
     */
    readonly name?: pulumi.Input<string>;
    /**
     * A boolean value indicating whether
     * HTTP requests to the Load Balancer on port 80 will be redirected to HTTPS on port 443.
     * Default value is `false`.
     */
    readonly redirectHttpToHttps?: pulumi.Input<boolean>;
    /**
     * The region to start in
     */
    readonly region?: pulumi.Input<Region>;
    readonly status?: pulumi.Input<string>;
    /**
     * A `sticky_sessions` block to be assigned to the
     * Load Balancer. The `sticky_sessions` block is documented below. Only 1 sticky_sessions block is allowed.
     */
    readonly stickySessions?: pulumi.Input<{ cookieName?: pulumi.Input<string>, cookieTtlSeconds?: pulumi.Input<number>, type?: pulumi.Input<string> }>;
    /**
     * The uniform resource name for the Load Balancer
     */
    readonly urn?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a LoadBalancer resource.
 */
export interface LoadBalancerArgs {
    /**
     * The load balancing algorithm used to determine
     * which backend Droplet will be selected by a client. It must be either `round_robin`
     * or `least_connections`. The default value is `round_robin`.
     */
    readonly algorithm?: pulumi.Input<Algorithm>;
    /**
     * A list of the IDs of each droplet to be attached to the Load Balancer.
     */
    readonly dropletIds?: pulumi.Input<pulumi.Input<number>[]>;
    /**
     * The name of a Droplet tag corresponding to Droplets to be assigned to the Load Balancer.
     */
    readonly dropletTag?: pulumi.Input<string>;
    /**
     * A boolean value indicating whether PROXY
     * Protocol should be used to pass information from connecting client requests to
     * the backend service. Default value is `false`.
     */
    readonly enableProxyProtocol?: pulumi.Input<boolean>;
    /**
     * A list of `forwarding_rule` to be assigned to the
     * Load Balancer. The `forwarding_rule` block is documented below.
     */
    readonly forwardingRules: pulumi.Input<pulumi.Input<{ certificateId?: pulumi.Input<string>, entryPort: pulumi.Input<number>, entryProtocol: pulumi.Input<string>, targetPort: pulumi.Input<number>, targetProtocol: pulumi.Input<string>, tlsPassthrough?: pulumi.Input<boolean> }>[]>;
    /**
     * A `healthcheck` block to be assigned to the
     * Load Balancer. The `healthcheck` block is documented below. Only 1 healthcheck is allowed.
     */
    readonly healthcheck?: pulumi.Input<{ checkIntervalSeconds?: pulumi.Input<number>, healthyThreshold?: pulumi.Input<number>, path?: pulumi.Input<string>, port: pulumi.Input<number>, protocol: pulumi.Input<string>, responseTimeoutSeconds?: pulumi.Input<number>, unhealthyThreshold?: pulumi.Input<number> }>;
    /**
     * The Load Balancer name
     */
    readonly name?: pulumi.Input<string>;
    /**
     * A boolean value indicating whether
     * HTTP requests to the Load Balancer on port 80 will be redirected to HTTPS on port 443.
     * Default value is `false`.
     */
    readonly redirectHttpToHttps?: pulumi.Input<boolean>;
    /**
     * The region to start in
     */
    readonly region: pulumi.Input<Region>;
    /**
     * A `sticky_sessions` block to be assigned to the
     * Load Balancer. The `sticky_sessions` block is documented below. Only 1 sticky_sessions block is allowed.
     */
    readonly stickySessions?: pulumi.Input<{ cookieName?: pulumi.Input<string>, cookieTtlSeconds?: pulumi.Input<number>, type?: pulumi.Input<string> }>;
}
