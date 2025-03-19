// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as enums from "./types/enums";
import * as utilities from "./utilities";

/**
 * Provides a [DigitalOcean Uptime Alerts](https://docs.digitalocean.com/reference/api/digitalocean/#tag/Uptime/operation/uptime_create_alert)
 * resource. Uptime Alerts provide the ability to add alerts to your [DigitalOcean Uptime Checks](https://docs.digitalocean.com/reference/api/digitalocean/#tag/Uptime) when your endpoints are slow, unavailable, or SSL certificates are expiring.
 *
 * ## Import
 *
 * Uptime alerts can be imported using both the ID of the alert's parent check and
 *
 * its own separated by a comma in the format: `check_id,alert_id`. For example:
 *
 * ```sh
 * $ pulumi import digitalocean:index/uptimeAlert:UptimeAlert target 94a7d216-d821-11ee-a327-33d3239ffc4b,5a4981aa-9653-4bd1-bef5-d6bff52042e4
 * ```
 */
export class UptimeAlert extends pulumi.CustomResource {
    /**
     * Get an existing UptimeAlert resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: UptimeAlertState, opts?: pulumi.CustomResourceOptions): UptimeAlert {
        return new UptimeAlert(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'digitalocean:index/uptimeAlert:UptimeAlert';

    /**
     * Returns true if the given object is an instance of UptimeAlert.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is UptimeAlert {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === UptimeAlert.__pulumiType;
    }

    /**
     * A unique identifier for a check
     */
    public readonly checkId!: pulumi.Output<string>;
    /**
     * The comparison operator used against the alert's threshold. Must be one of `greaterThan` or `lessThan`.
     */
    public readonly comparison!: pulumi.Output<string | undefined>;
    /**
     * A human-friendly display name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The notification settings for a trigger alert.
     */
    public readonly notifications!: pulumi.Output<outputs.UptimeAlertNotification[]>;
    /**
     * Period of time the threshold must be exceeded to trigger the alert. Must be one of `2m`, `3m`, `5m`, `10m`, `15m`, `30m` or `1h`.
     */
    public readonly period!: pulumi.Output<string | undefined>;
    /**
     * The threshold at which the alert will enter a trigger state. The specific threshold is dependent on the alert type.
     */
    public readonly threshold!: pulumi.Output<number | undefined>;
    /**
     * The type of health check to perform. Must be one of `latency`, `down`, `downGlobal` or `sslExpiry`.
     */
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a UptimeAlert resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: UptimeAlertArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: UptimeAlertArgs | UptimeAlertState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as UptimeAlertState | undefined;
            resourceInputs["checkId"] = state ? state.checkId : undefined;
            resourceInputs["comparison"] = state ? state.comparison : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["notifications"] = state ? state.notifications : undefined;
            resourceInputs["period"] = state ? state.period : undefined;
            resourceInputs["threshold"] = state ? state.threshold : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as UptimeAlertArgs | undefined;
            if ((!args || args.checkId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'checkId'");
            }
            if ((!args || args.notifications === undefined) && !opts.urn) {
                throw new Error("Missing required property 'notifications'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["checkId"] = args ? args.checkId : undefined;
            resourceInputs["comparison"] = args ? args.comparison : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["notifications"] = args ? args.notifications : undefined;
            resourceInputs["period"] = args ? args.period : undefined;
            resourceInputs["threshold"] = args ? args.threshold : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(UptimeAlert.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering UptimeAlert resources.
 */
export interface UptimeAlertState {
    /**
     * A unique identifier for a check
     */
    checkId?: pulumi.Input<string>;
    /**
     * The comparison operator used against the alert's threshold. Must be one of `greaterThan` or `lessThan`.
     */
    comparison?: pulumi.Input<string>;
    /**
     * A human-friendly display name.
     */
    name?: pulumi.Input<string>;
    /**
     * The notification settings for a trigger alert.
     */
    notifications?: pulumi.Input<pulumi.Input<inputs.UptimeAlertNotification>[]>;
    /**
     * Period of time the threshold must be exceeded to trigger the alert. Must be one of `2m`, `3m`, `5m`, `10m`, `15m`, `30m` or `1h`.
     */
    period?: pulumi.Input<string>;
    /**
     * The threshold at which the alert will enter a trigger state. The specific threshold is dependent on the alert type.
     */
    threshold?: pulumi.Input<number>;
    /**
     * The type of health check to perform. Must be one of `latency`, `down`, `downGlobal` or `sslExpiry`.
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a UptimeAlert resource.
 */
export interface UptimeAlertArgs {
    /**
     * A unique identifier for a check
     */
    checkId: pulumi.Input<string>;
    /**
     * The comparison operator used against the alert's threshold. Must be one of `greaterThan` or `lessThan`.
     */
    comparison?: pulumi.Input<string>;
    /**
     * A human-friendly display name.
     */
    name?: pulumi.Input<string>;
    /**
     * The notification settings for a trigger alert.
     */
    notifications: pulumi.Input<pulumi.Input<inputs.UptimeAlertNotification>[]>;
    /**
     * Period of time the threshold must be exceeded to trigger the alert. Must be one of `2m`, `3m`, `5m`, `10m`, `15m`, `30m` or `1h`.
     */
    period?: pulumi.Input<string>;
    /**
     * The threshold at which the alert will enter a trigger state. The specific threshold is dependent on the alert type.
     */
    threshold?: pulumi.Input<number>;
    /**
     * The type of health check to perform. Must be one of `latency`, `down`, `downGlobal` or `sslExpiry`.
     */
    type: pulumi.Input<string>;
}
