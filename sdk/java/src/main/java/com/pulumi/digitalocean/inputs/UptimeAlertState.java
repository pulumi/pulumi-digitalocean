// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.digitalocean.inputs.UptimeAlertNotificationArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UptimeAlertState extends com.pulumi.resources.ResourceArgs {

    public static final UptimeAlertState Empty = new UptimeAlertState();

    /**
     * A unique identifier for a check
     * 
     */
    @Import(name="checkId")
    private @Nullable Output<String> checkId;

    /**
     * @return A unique identifier for a check
     * 
     */
    public Optional<Output<String>> checkId() {
        return Optional.ofNullable(this.checkId);
    }

    /**
     * A boolean value indicating whether the check is enabled/disabled.
     * 
     */
    @Import(name="comparison")
    private @Nullable Output<String> comparison;

    /**
     * @return A boolean value indicating whether the check is enabled/disabled.
     * 
     */
    public Optional<Output<String>> comparison() {
        return Optional.ofNullable(this.comparison);
    }

    /**
     * A human-friendly display name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A human-friendly display name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The notification settings for a trigger alert.
     * 
     */
    @Import(name="notifications")
    private @Nullable Output<List<UptimeAlertNotificationArgs>> notifications;

    /**
     * @return The notification settings for a trigger alert.
     * 
     */
    public Optional<Output<List<UptimeAlertNotificationArgs>>> notifications() {
        return Optional.ofNullable(this.notifications);
    }

    /**
     * Period of time the threshold must be exceeded to trigger the alert: &#34;2m&#34; &#34;3m&#34; &#34;5m&#34; &#34;10m&#34; &#34;15m&#34; &#34;30m&#34; &#34;1h&#34;
     * 
     */
    @Import(name="period")
    private @Nullable Output<String> period;

    /**
     * @return Period of time the threshold must be exceeded to trigger the alert: &#34;2m&#34; &#34;3m&#34; &#34;5m&#34; &#34;10m&#34; &#34;15m&#34; &#34;30m&#34; &#34;1h&#34;
     * 
     */
    public Optional<Output<String>> period() {
        return Optional.ofNullable(this.period);
    }

    /**
     * The comparison operator used against the alert&#39;s threshold: &#34;greater_than&#34;, &#34;less_than&#34;
     * 
     */
    @Import(name="threshold")
    private @Nullable Output<Integer> threshold;

    /**
     * @return The comparison operator used against the alert&#39;s threshold: &#34;greater_than&#34;, &#34;less_than&#34;
     * 
     */
    public Optional<Output<Integer>> threshold() {
        return Optional.ofNullable(this.threshold);
    }

    /**
     * The type of health check to perform: &#39;ping&#39; &#39;http&#39; &#39;https&#39;.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of health check to perform: &#39;ping&#39; &#39;http&#39; &#39;https&#39;.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private UptimeAlertState() {}

    private UptimeAlertState(UptimeAlertState $) {
        this.checkId = $.checkId;
        this.comparison = $.comparison;
        this.name = $.name;
        this.notifications = $.notifications;
        this.period = $.period;
        this.threshold = $.threshold;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UptimeAlertState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UptimeAlertState $;

        public Builder() {
            $ = new UptimeAlertState();
        }

        public Builder(UptimeAlertState defaults) {
            $ = new UptimeAlertState(Objects.requireNonNull(defaults));
        }

        /**
         * @param checkId A unique identifier for a check
         * 
         * @return builder
         * 
         */
        public Builder checkId(@Nullable Output<String> checkId) {
            $.checkId = checkId;
            return this;
        }

        /**
         * @param checkId A unique identifier for a check
         * 
         * @return builder
         * 
         */
        public Builder checkId(String checkId) {
            return checkId(Output.of(checkId));
        }

        /**
         * @param comparison A boolean value indicating whether the check is enabled/disabled.
         * 
         * @return builder
         * 
         */
        public Builder comparison(@Nullable Output<String> comparison) {
            $.comparison = comparison;
            return this;
        }

        /**
         * @param comparison A boolean value indicating whether the check is enabled/disabled.
         * 
         * @return builder
         * 
         */
        public Builder comparison(String comparison) {
            return comparison(Output.of(comparison));
        }

        /**
         * @param name A human-friendly display name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A human-friendly display name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param notifications The notification settings for a trigger alert.
         * 
         * @return builder
         * 
         */
        public Builder notifications(@Nullable Output<List<UptimeAlertNotificationArgs>> notifications) {
            $.notifications = notifications;
            return this;
        }

        /**
         * @param notifications The notification settings for a trigger alert.
         * 
         * @return builder
         * 
         */
        public Builder notifications(List<UptimeAlertNotificationArgs> notifications) {
            return notifications(Output.of(notifications));
        }

        /**
         * @param notifications The notification settings for a trigger alert.
         * 
         * @return builder
         * 
         */
        public Builder notifications(UptimeAlertNotificationArgs... notifications) {
            return notifications(List.of(notifications));
        }

        /**
         * @param period Period of time the threshold must be exceeded to trigger the alert: &#34;2m&#34; &#34;3m&#34; &#34;5m&#34; &#34;10m&#34; &#34;15m&#34; &#34;30m&#34; &#34;1h&#34;
         * 
         * @return builder
         * 
         */
        public Builder period(@Nullable Output<String> period) {
            $.period = period;
            return this;
        }

        /**
         * @param period Period of time the threshold must be exceeded to trigger the alert: &#34;2m&#34; &#34;3m&#34; &#34;5m&#34; &#34;10m&#34; &#34;15m&#34; &#34;30m&#34; &#34;1h&#34;
         * 
         * @return builder
         * 
         */
        public Builder period(String period) {
            return period(Output.of(period));
        }

        /**
         * @param threshold The comparison operator used against the alert&#39;s threshold: &#34;greater_than&#34;, &#34;less_than&#34;
         * 
         * @return builder
         * 
         */
        public Builder threshold(@Nullable Output<Integer> threshold) {
            $.threshold = threshold;
            return this;
        }

        /**
         * @param threshold The comparison operator used against the alert&#39;s threshold: &#34;greater_than&#34;, &#34;less_than&#34;
         * 
         * @return builder
         * 
         */
        public Builder threshold(Integer threshold) {
            return threshold(Output.of(threshold));
        }

        /**
         * @param type The type of health check to perform: &#39;ping&#39; &#39;http&#39; &#39;https&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of health check to perform: &#39;ping&#39; &#39;http&#39; &#39;https&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public UptimeAlertState build() {
            return $;
        }
    }

}
