// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.digitalocean.inputs.MonitorAlertAlertsArgs;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MonitorAlertArgs extends com.pulumi.resources.ResourceArgs {

    public static final MonitorAlertArgs Empty = new MonitorAlertArgs();

    /**
     * How to send notifications about the alerts. This is a list with one element, .
     * Note that for Slack, the DigitalOcean app needs to have permissions for your workspace. You can
     * read more in [Slack&#39;s documentation](https://slack.com/intl/en-dk/help/articles/222386767-Manage-app-installation-settings-for-your-workspace)
     * 
     */
    @Import(name="alerts", required=true)
    private Output<MonitorAlertAlertsArgs> alerts;

    /**
     * @return How to send notifications about the alerts. This is a list with one element, .
     * Note that for Slack, the DigitalOcean app needs to have permissions for your workspace. You can
     * read more in [Slack&#39;s documentation](https://slack.com/intl/en-dk/help/articles/222386767-Manage-app-installation-settings-for-your-workspace)
     * 
     */
    public Output<MonitorAlertAlertsArgs> alerts() {
        return this.alerts;
    }

    /**
     * The comparison for `value`.
     * This may be either `GreaterThan` or `LessThan`.
     * 
     */
    @Import(name="compare", required=true)
    private Output<String> compare;

    /**
     * @return The comparison for `value`.
     * This may be either `GreaterThan` or `LessThan`.
     * 
     */
    public Output<String> compare() {
        return this.compare;
    }

    /**
     * The description of the alert.
     * 
     */
    @Import(name="description", required=true)
    private Output<String> description;

    /**
     * @return The description of the alert.
     * 
     */
    public Output<String> description() {
        return this.description;
    }

    /**
     * The status of the alert.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return The status of the alert.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * A list of IDs for the resources to which the alert policy applies.
     * 
     */
    @Import(name="entities")
    private @Nullable Output<List<String>> entities;

    /**
     * @return A list of IDs for the resources to which the alert policy applies.
     * 
     */
    public Optional<Output<List<String>>> entities() {
        return Optional.ofNullable(this.entities);
    }

    /**
     * A list of tags. When an included tag is added to a resource, the alert policy will apply to it.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return A list of tags. When an included tag is added to a resource, the alert policy will apply to it.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The type of the alert.
     * This may be one of `v1/insights/droplet/load_1`, `v1/insights/droplet/load_5`, `v1/insights/droplet/load_15`,
     * `v1/insights/droplet/memory_utilization_percent`, `v1/insights/droplet/disk_utilization_percent`,
     * `v1/insights/droplet/cpu`, `v1/insights/droplet/disk_read`, `v1/insights/droplet/disk_write`,
     * `v1/insights/droplet/public_outbound_bandwidth`, `v1/insights/droplet/public_inbound_bandwidth`,
     * `v1/insights/droplet/private_outbound_bandwidth`, `v1/insights/droplet/private_inbound_bandwidth`,
     * `v1/insights/lbaas/avg_cpu_utilization_percent`, `v1/insights/lbaas/connection_utilization_percent`,
     * `v1/insights/lbaas/droplet_health`, `v1/insights/lbaas/tls_connections_per_second_utilization_percent`,
     * `v1/insights/lbaas/increase_in_http_error_rate_percentage_5xx`, `v1/insights/lbaas/increase_in_http_error_rate_percentage_4xx`,
     * `v1/insights/lbaas/increase_in_http_error_rate_count_5xx`, `v1/insights/lbaas/increase_in_http_error_rate_count_4xx`,
     * `v1/insights/lbaas/high_http_request_response_time`, `v1/insights/lbaas/high_http_request_response_time_50p`,
     * `v1/insights/lbaas/high_http_request_response_time_95p`, `v1/insights/lbaas/high_http_request_response_time_99p`,
     * `v1/dbaas/alerts/load_15_alerts`, `v1/dbaas/alerts/cpu_alerts`, `v1/dbaas/alerts/memory_utilization_alerts`, or
     * `v1/dbaas/alerts/disk_utilization_alerts`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of the alert.
     * This may be one of `v1/insights/droplet/load_1`, `v1/insights/droplet/load_5`, `v1/insights/droplet/load_15`,
     * `v1/insights/droplet/memory_utilization_percent`, `v1/insights/droplet/disk_utilization_percent`,
     * `v1/insights/droplet/cpu`, `v1/insights/droplet/disk_read`, `v1/insights/droplet/disk_write`,
     * `v1/insights/droplet/public_outbound_bandwidth`, `v1/insights/droplet/public_inbound_bandwidth`,
     * `v1/insights/droplet/private_outbound_bandwidth`, `v1/insights/droplet/private_inbound_bandwidth`,
     * `v1/insights/lbaas/avg_cpu_utilization_percent`, `v1/insights/lbaas/connection_utilization_percent`,
     * `v1/insights/lbaas/droplet_health`, `v1/insights/lbaas/tls_connections_per_second_utilization_percent`,
     * `v1/insights/lbaas/increase_in_http_error_rate_percentage_5xx`, `v1/insights/lbaas/increase_in_http_error_rate_percentage_4xx`,
     * `v1/insights/lbaas/increase_in_http_error_rate_count_5xx`, `v1/insights/lbaas/increase_in_http_error_rate_count_4xx`,
     * `v1/insights/lbaas/high_http_request_response_time`, `v1/insights/lbaas/high_http_request_response_time_50p`,
     * `v1/insights/lbaas/high_http_request_response_time_95p`, `v1/insights/lbaas/high_http_request_response_time_99p`,
     * `v1/dbaas/alerts/load_15_alerts`, `v1/dbaas/alerts/cpu_alerts`, `v1/dbaas/alerts/memory_utilization_alerts`, or
     * `v1/dbaas/alerts/disk_utilization_alerts`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * The value to start alerting at, e.g., 90% or 85Mbps. This is a floating-point number.
     * DigitalOcean will show the correct unit in the web panel.
     * 
     */
    @Import(name="value", required=true)
    private Output<Double> value;

    /**
     * @return The value to start alerting at, e.g., 90% or 85Mbps. This is a floating-point number.
     * DigitalOcean will show the correct unit in the web panel.
     * 
     */
    public Output<Double> value() {
        return this.value;
    }

    /**
     * The time frame of the alert. Either `5m`, `10m`, `30m`, or `1h`.
     * 
     */
    @Import(name="window", required=true)
    private Output<String> window;

    /**
     * @return The time frame of the alert. Either `5m`, `10m`, `30m`, or `1h`.
     * 
     */
    public Output<String> window() {
        return this.window;
    }

    private MonitorAlertArgs() {}

    private MonitorAlertArgs(MonitorAlertArgs $) {
        this.alerts = $.alerts;
        this.compare = $.compare;
        this.description = $.description;
        this.enabled = $.enabled;
        this.entities = $.entities;
        this.tags = $.tags;
        this.type = $.type;
        this.value = $.value;
        this.window = $.window;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitorAlertArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitorAlertArgs $;

        public Builder() {
            $ = new MonitorAlertArgs();
        }

        public Builder(MonitorAlertArgs defaults) {
            $ = new MonitorAlertArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alerts How to send notifications about the alerts. This is a list with one element, .
         * Note that for Slack, the DigitalOcean app needs to have permissions for your workspace. You can
         * read more in [Slack&#39;s documentation](https://slack.com/intl/en-dk/help/articles/222386767-Manage-app-installation-settings-for-your-workspace)
         * 
         * @return builder
         * 
         */
        public Builder alerts(Output<MonitorAlertAlertsArgs> alerts) {
            $.alerts = alerts;
            return this;
        }

        /**
         * @param alerts How to send notifications about the alerts. This is a list with one element, .
         * Note that for Slack, the DigitalOcean app needs to have permissions for your workspace. You can
         * read more in [Slack&#39;s documentation](https://slack.com/intl/en-dk/help/articles/222386767-Manage-app-installation-settings-for-your-workspace)
         * 
         * @return builder
         * 
         */
        public Builder alerts(MonitorAlertAlertsArgs alerts) {
            return alerts(Output.of(alerts));
        }

        /**
         * @param compare The comparison for `value`.
         * This may be either `GreaterThan` or `LessThan`.
         * 
         * @return builder
         * 
         */
        public Builder compare(Output<String> compare) {
            $.compare = compare;
            return this;
        }

        /**
         * @param compare The comparison for `value`.
         * This may be either `GreaterThan` or `LessThan`.
         * 
         * @return builder
         * 
         */
        public Builder compare(String compare) {
            return compare(Output.of(compare));
        }

        /**
         * @param description The description of the alert.
         * 
         * @return builder
         * 
         */
        public Builder description(Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the alert.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param enabled The status of the alert.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled The status of the alert.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param entities A list of IDs for the resources to which the alert policy applies.
         * 
         * @return builder
         * 
         */
        public Builder entities(@Nullable Output<List<String>> entities) {
            $.entities = entities;
            return this;
        }

        /**
         * @param entities A list of IDs for the resources to which the alert policy applies.
         * 
         * @return builder
         * 
         */
        public Builder entities(List<String> entities) {
            return entities(Output.of(entities));
        }

        /**
         * @param entities A list of IDs for the resources to which the alert policy applies.
         * 
         * @return builder
         * 
         */
        public Builder entities(String... entities) {
            return entities(List.of(entities));
        }

        /**
         * @param tags A list of tags. When an included tag is added to a resource, the alert policy will apply to it.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A list of tags. When an included tag is added to a resource, the alert policy will apply to it.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A list of tags. When an included tag is added to a resource, the alert policy will apply to it.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param type The type of the alert.
         * This may be one of `v1/insights/droplet/load_1`, `v1/insights/droplet/load_5`, `v1/insights/droplet/load_15`,
         * `v1/insights/droplet/memory_utilization_percent`, `v1/insights/droplet/disk_utilization_percent`,
         * `v1/insights/droplet/cpu`, `v1/insights/droplet/disk_read`, `v1/insights/droplet/disk_write`,
         * `v1/insights/droplet/public_outbound_bandwidth`, `v1/insights/droplet/public_inbound_bandwidth`,
         * `v1/insights/droplet/private_outbound_bandwidth`, `v1/insights/droplet/private_inbound_bandwidth`,
         * `v1/insights/lbaas/avg_cpu_utilization_percent`, `v1/insights/lbaas/connection_utilization_percent`,
         * `v1/insights/lbaas/droplet_health`, `v1/insights/lbaas/tls_connections_per_second_utilization_percent`,
         * `v1/insights/lbaas/increase_in_http_error_rate_percentage_5xx`, `v1/insights/lbaas/increase_in_http_error_rate_percentage_4xx`,
         * `v1/insights/lbaas/increase_in_http_error_rate_count_5xx`, `v1/insights/lbaas/increase_in_http_error_rate_count_4xx`,
         * `v1/insights/lbaas/high_http_request_response_time`, `v1/insights/lbaas/high_http_request_response_time_50p`,
         * `v1/insights/lbaas/high_http_request_response_time_95p`, `v1/insights/lbaas/high_http_request_response_time_99p`,
         * `v1/dbaas/alerts/load_15_alerts`, `v1/dbaas/alerts/cpu_alerts`, `v1/dbaas/alerts/memory_utilization_alerts`, or
         * `v1/dbaas/alerts/disk_utilization_alerts`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the alert.
         * This may be one of `v1/insights/droplet/load_1`, `v1/insights/droplet/load_5`, `v1/insights/droplet/load_15`,
         * `v1/insights/droplet/memory_utilization_percent`, `v1/insights/droplet/disk_utilization_percent`,
         * `v1/insights/droplet/cpu`, `v1/insights/droplet/disk_read`, `v1/insights/droplet/disk_write`,
         * `v1/insights/droplet/public_outbound_bandwidth`, `v1/insights/droplet/public_inbound_bandwidth`,
         * `v1/insights/droplet/private_outbound_bandwidth`, `v1/insights/droplet/private_inbound_bandwidth`,
         * `v1/insights/lbaas/avg_cpu_utilization_percent`, `v1/insights/lbaas/connection_utilization_percent`,
         * `v1/insights/lbaas/droplet_health`, `v1/insights/lbaas/tls_connections_per_second_utilization_percent`,
         * `v1/insights/lbaas/increase_in_http_error_rate_percentage_5xx`, `v1/insights/lbaas/increase_in_http_error_rate_percentage_4xx`,
         * `v1/insights/lbaas/increase_in_http_error_rate_count_5xx`, `v1/insights/lbaas/increase_in_http_error_rate_count_4xx`,
         * `v1/insights/lbaas/high_http_request_response_time`, `v1/insights/lbaas/high_http_request_response_time_50p`,
         * `v1/insights/lbaas/high_http_request_response_time_95p`, `v1/insights/lbaas/high_http_request_response_time_99p`,
         * `v1/dbaas/alerts/load_15_alerts`, `v1/dbaas/alerts/cpu_alerts`, `v1/dbaas/alerts/memory_utilization_alerts`, or
         * `v1/dbaas/alerts/disk_utilization_alerts`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param value The value to start alerting at, e.g., 90% or 85Mbps. This is a floating-point number.
         * DigitalOcean will show the correct unit in the web panel.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<Double> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value to start alerting at, e.g., 90% or 85Mbps. This is a floating-point number.
         * DigitalOcean will show the correct unit in the web panel.
         * 
         * @return builder
         * 
         */
        public Builder value(Double value) {
            return value(Output.of(value));
        }

        /**
         * @param window The time frame of the alert. Either `5m`, `10m`, `30m`, or `1h`.
         * 
         * @return builder
         * 
         */
        public Builder window(Output<String> window) {
            $.window = window;
            return this;
        }

        /**
         * @param window The time frame of the alert. Either `5m`, `10m`, `30m`, or `1h`.
         * 
         * @return builder
         * 
         */
        public Builder window(String window) {
            return window(Output.of(window));
        }

        public MonitorAlertArgs build() {
            $.alerts = Objects.requireNonNull($.alerts, "expected parameter 'alerts' to be non-null");
            $.compare = Objects.requireNonNull($.compare, "expected parameter 'compare' to be non-null");
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            $.window = Objects.requireNonNull($.window, "expected parameter 'window' to be non-null");
            return $;
        }
    }

}
