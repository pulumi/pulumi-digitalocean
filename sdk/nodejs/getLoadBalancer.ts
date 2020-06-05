// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Get information on a load balancer for use in other resources. This data source
 * provides all of the load balancers properties as configured on your DigitalOcean
 * account. This is useful if the load balancer in question is not managed by
 * this provider or you need to utilize any of the load balancers data.
 *
 * An error is triggered if the provided load balancer name does not exist.
 *
 * ## Example Usage
 *
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const example = digitalocean.getLoadBalancer({
 *     name: "app",
 * });
 * export const lbOutput = example.then(example => example.ip);
 * ```
 */
export function getLoadBalancer(args: GetLoadBalancerArgs, opts?: pulumi.InvokeOptions): Promise<GetLoadBalancerResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("digitalocean:index/getLoadBalancer:getLoadBalancer", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getLoadBalancer.
 */
export interface GetLoadBalancerArgs {
    /**
     * The name of load balancer.
     */
    readonly name: string;
}

/**
 * A collection of values returned by getLoadBalancer.
 */
export interface GetLoadBalancerResult {
    readonly algorithm: string;
    readonly dropletIds: number[];
    readonly dropletTag: string;
    readonly enableBackendKeepalive: boolean;
    readonly enableProxyProtocol: boolean;
    readonly forwardingRules: outputs.GetLoadBalancerForwardingRule[];
    readonly healthcheck: outputs.GetLoadBalancerHealthcheck;
    readonly ip: string;
    readonly name: string;
    readonly redirectHttpToHttps: boolean;
    readonly region: string;
    readonly status: string;
    readonly stickySessions: outputs.GetLoadBalancerStickySessions;
    readonly urn: string;
    readonly vpcUuid: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
