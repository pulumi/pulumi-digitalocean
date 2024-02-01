// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.digitalocean.inputs.MonitorAlertAlertsSlackArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MonitorAlertAlertsArgs extends com.pulumi.resources.ResourceArgs {

    public static final MonitorAlertAlertsArgs Empty = new MonitorAlertAlertsArgs();

    /**
     * List of email addresses to sent notifications to
     * 
     */
    @Import(name="emails")
    private @Nullable Output<List<String>> emails;

    /**
     * @return List of email addresses to sent notifications to
     * 
     */
    public Optional<Output<List<String>>> emails() {
        return Optional.ofNullable(this.emails);
    }

    @Import(name="slacks")
    private @Nullable Output<List<MonitorAlertAlertsSlackArgs>> slacks;

    public Optional<Output<List<MonitorAlertAlertsSlackArgs>>> slacks() {
        return Optional.ofNullable(this.slacks);
    }

    private MonitorAlertAlertsArgs() {}

    private MonitorAlertAlertsArgs(MonitorAlertAlertsArgs $) {
        this.emails = $.emails;
        this.slacks = $.slacks;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitorAlertAlertsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitorAlertAlertsArgs $;

        public Builder() {
            $ = new MonitorAlertAlertsArgs();
        }

        public Builder(MonitorAlertAlertsArgs defaults) {
            $ = new MonitorAlertAlertsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param emails List of email addresses to sent notifications to
         * 
         * @return builder
         * 
         */
        public Builder emails(@Nullable Output<List<String>> emails) {
            $.emails = emails;
            return this;
        }

        /**
         * @param emails List of email addresses to sent notifications to
         * 
         * @return builder
         * 
         */
        public Builder emails(List<String> emails) {
            return emails(Output.of(emails));
        }

        /**
         * @param emails List of email addresses to sent notifications to
         * 
         * @return builder
         * 
         */
        public Builder emails(String... emails) {
            return emails(List.of(emails));
        }

        public Builder slacks(@Nullable Output<List<MonitorAlertAlertsSlackArgs>> slacks) {
            $.slacks = slacks;
            return this;
        }

        public Builder slacks(List<MonitorAlertAlertsSlackArgs> slacks) {
            return slacks(Output.of(slacks));
        }

        public Builder slacks(MonitorAlertAlertsSlackArgs... slacks) {
            return slacks(List.of(slacks));
        }

        public MonitorAlertAlertsArgs build() {
            return $;
        }
    }

}
