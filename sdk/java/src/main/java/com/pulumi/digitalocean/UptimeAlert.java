// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.digitalocean.UptimeAlertArgs;
import com.pulumi.digitalocean.Utilities;
import com.pulumi.digitalocean.inputs.UptimeAlertState;
import com.pulumi.digitalocean.outputs.UptimeAlertNotification;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a [DigitalOcean Uptime Alerts](https://docs.digitalocean.com/reference/api/digitalocean/#tag/Uptime/operation/uptime_create_alert)
 * resource. Uptime Alerts provide the ability to add alerts to your [DigitalOcean Uptime Checks](https://docs.digitalocean.com/reference/api/digitalocean/#tag/Uptime) when your endpoints are slow, unavailable, or SSL certificates are expiring.
 * 
 * ## Import
 * 
 * Uptime alerts can be imported using both the ID of the alert&#39;s parent check and
 * 
 * its own separated by a comma in the format: `check_id,alert_id`. For example:
 * 
 * ```sh
 * $ pulumi import digitalocean:index/uptimeAlert:UptimeAlert target 94a7d216-d821-11ee-a327-33d3239ffc4b,5a4981aa-9653-4bd1-bef5-d6bff52042e4
 * ```
 * 
 */
@ResourceType(type="digitalocean:index/uptimeAlert:UptimeAlert")
public class UptimeAlert extends com.pulumi.resources.CustomResource {
    /**
     * A unique identifier for a check
     * 
     */
    @Export(name="checkId", refs={String.class}, tree="[0]")
    private Output<String> checkId;

    /**
     * @return A unique identifier for a check
     * 
     */
    public Output<String> checkId() {
        return this.checkId;
    }
    /**
     * The comparison operator used against the alert&#39;s threshold. Must be one of `greater_than` or `less_than`.
     * 
     */
    @Export(name="comparison", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comparison;

    /**
     * @return The comparison operator used against the alert&#39;s threshold. Must be one of `greater_than` or `less_than`.
     * 
     */
    public Output<Optional<String>> comparison() {
        return Codegen.optional(this.comparison);
    }
    /**
     * A human-friendly display name.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return A human-friendly display name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The notification settings for a trigger alert.
     * 
     */
    @Export(name="notifications", refs={List.class,UptimeAlertNotification.class}, tree="[0,1]")
    private Output<List<UptimeAlertNotification>> notifications;

    /**
     * @return The notification settings for a trigger alert.
     * 
     */
    public Output<List<UptimeAlertNotification>> notifications() {
        return this.notifications;
    }
    /**
     * Period of time the threshold must be exceeded to trigger the alert. Must be one of `2m`, `3m`, `5m`, `10m`, `15m`, `30m` or `1h`.
     * 
     */
    @Export(name="period", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> period;

    /**
     * @return Period of time the threshold must be exceeded to trigger the alert. Must be one of `2m`, `3m`, `5m`, `10m`, `15m`, `30m` or `1h`.
     * 
     */
    public Output<Optional<String>> period() {
        return Codegen.optional(this.period);
    }
    /**
     * The threshold at which the alert will enter a trigger state. The specific threshold is dependent on the alert type.
     * 
     */
    @Export(name="threshold", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> threshold;

    /**
     * @return The threshold at which the alert will enter a trigger state. The specific threshold is dependent on the alert type.
     * 
     */
    public Output<Optional<Integer>> threshold() {
        return Codegen.optional(this.threshold);
    }
    /**
     * The type of health check to perform. Must be one of `latency`, `down`, `down_global` or `ssl_expiry`.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The type of health check to perform. Must be one of `latency`, `down`, `down_global` or `ssl_expiry`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public UptimeAlert(java.lang.String name) {
        this(name, UptimeAlertArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public UptimeAlert(java.lang.String name, UptimeAlertArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UptimeAlert(java.lang.String name, UptimeAlertArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/uptimeAlert:UptimeAlert", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private UptimeAlert(java.lang.String name, Output<java.lang.String> id, @Nullable UptimeAlertState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/uptimeAlert:UptimeAlert", name, state, makeResourceOptions(options, id), false);
    }

    private static UptimeAlertArgs makeArgs(UptimeAlertArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? UptimeAlertArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static UptimeAlert get(java.lang.String name, Output<java.lang.String> id, @Nullable UptimeAlertState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new UptimeAlert(name, id, state, options);
    }
}
