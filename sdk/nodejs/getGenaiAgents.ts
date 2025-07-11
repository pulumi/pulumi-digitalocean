// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as enums from "./types/enums";
import * as utilities from "./utilities";

export function getGenaiAgents(args?: GetGenaiAgentsArgs, opts?: pulumi.InvokeOptions): Promise<GetGenaiAgentsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("digitalocean:index/getGenaiAgents:getGenaiAgents", {
        "filters": args.filters,
        "onlyDeployed": args.onlyDeployed,
        "sorts": args.sorts,
    }, opts);
}

/**
 * A collection of arguments for invoking getGenaiAgents.
 */
export interface GetGenaiAgentsArgs {
    filters?: inputs.GetGenaiAgentsFilter[];
    onlyDeployed?: boolean;
    sorts?: inputs.GetGenaiAgentsSort[];
}

/**
 * A collection of values returned by getGenaiAgents.
 */
export interface GetGenaiAgentsResult {
    readonly agents: outputs.GetGenaiAgentsAgent[];
    readonly filters?: outputs.GetGenaiAgentsFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly onlyDeployed?: boolean;
    readonly sorts?: outputs.GetGenaiAgentsSort[];
}
export function getGenaiAgentsOutput(args?: GetGenaiAgentsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetGenaiAgentsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("digitalocean:index/getGenaiAgents:getGenaiAgents", {
        "filters": args.filters,
        "onlyDeployed": args.onlyDeployed,
        "sorts": args.sorts,
    }, opts);
}

/**
 * A collection of arguments for invoking getGenaiAgents.
 */
export interface GetGenaiAgentsOutputArgs {
    filters?: pulumi.Input<pulumi.Input<inputs.GetGenaiAgentsFilterArgs>[]>;
    onlyDeployed?: pulumi.Input<boolean>;
    sorts?: pulumi.Input<pulumi.Input<inputs.GetGenaiAgentsSortArgs>[]>;
}
