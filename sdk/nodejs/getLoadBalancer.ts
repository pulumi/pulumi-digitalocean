// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as enums from "./types/enums";
import * as utilities from "./utilities";

/**
 * Get information on a load balancer for use in other resources. This data source
 * provides all of the load balancers properties as configured on your DigitalOcean
 * account. This is useful if the load balancer in question is not managed by
 * the provider or you need to utilize any of the load balancers data.
 *
 * An error is triggered if the provided load balancer name does not exist.
 *
 * ## Example Usage
 *
 * Get the load balancer by name:
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
 *
 * Get the load balancer by ID:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const example = digitalocean.getLoadBalancer({
 *     id: "loadbalancer_id",
 * });
 * ```
 */
export function getLoadBalancer(args?: GetLoadBalancerArgs, opts?: pulumi.InvokeOptions): Promise<GetLoadBalancerResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("digitalocean:index/getLoadBalancer:getLoadBalancer", {
        "id": args.id,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getLoadBalancer.
 */
export interface GetLoadBalancerArgs {
    /**
     * The ID of load balancer.
     */
    id?: string;
    /**
     * The name of load balancer.
     */
    name?: string;
}

/**
 * A collection of values returned by getLoadBalancer.
 */
export interface GetLoadBalancerResult {
    /**
     * @deprecated This field has been deprecated. You can no longer specify an algorithm for load balancers.
     */
    readonly algorithm: string;
    readonly disableLetsEncryptDnsRecords: boolean;
    readonly domains: outputs.GetLoadBalancerDomain[];
    readonly dropletIds: number[];
    readonly dropletTag: string;
    readonly enableBackendKeepalive: boolean;
    readonly enableProxyProtocol: boolean;
    readonly firewalls: outputs.GetLoadBalancerFirewall[];
    readonly forwardingRules: outputs.GetLoadBalancerForwardingRule[];
    readonly glbSettings: outputs.GetLoadBalancerGlbSetting[];
    readonly healthchecks: outputs.GetLoadBalancerHealthcheck[];
    readonly httpIdleTimeoutSeconds: number;
    readonly id?: string;
    readonly ip: string;
    readonly loadBalancerUrn: string;
    readonly name?: string;
    readonly network: string;
    readonly projectId: string;
    readonly redirectHttpToHttps: boolean;
    readonly region: string;
    readonly size: string;
    readonly sizeUnit: number;
    readonly status: string;
    readonly stickySessions: outputs.GetLoadBalancerStickySession[];
    readonly targetLoadBalancerIds: string[];
    readonly type: string;
    readonly vpcUuid: string;
}
/**
 * Get information on a load balancer for use in other resources. This data source
 * provides all of the load balancers properties as configured on your DigitalOcean
 * account. This is useful if the load balancer in question is not managed by
 * the provider or you need to utilize any of the load balancers data.
 *
 * An error is triggered if the provided load balancer name does not exist.
 *
 * ## Example Usage
 *
 * Get the load balancer by name:
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
 *
 * Get the load balancer by ID:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const example = digitalocean.getLoadBalancer({
 *     id: "loadbalancer_id",
 * });
 * ```
 */
export function getLoadBalancerOutput(args?: GetLoadBalancerOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetLoadBalancerResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("digitalocean:index/getLoadBalancer:getLoadBalancer", {
        "id": args.id,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getLoadBalancer.
 */
export interface GetLoadBalancerOutputArgs {
    /**
     * The ID of load balancer.
     */
    id?: pulumi.Input<string>;
    /**
     * The name of load balancer.
     */
    name?: pulumi.Input<string>;
}
