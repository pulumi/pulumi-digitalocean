// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.digitalocean.inputs.AppSpecJobLogDestinationDatadogArgs;
import com.pulumi.digitalocean.inputs.AppSpecJobLogDestinationLogtailArgs;
import com.pulumi.digitalocean.inputs.AppSpecJobLogDestinationOpenSearchArgs;
import com.pulumi.digitalocean.inputs.AppSpecJobLogDestinationPapertrailArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppSpecJobLogDestinationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppSpecJobLogDestinationArgs Empty = new AppSpecJobLogDestinationArgs();

    /**
     * Datadog configuration.
     * 
     */
    @Import(name="datadog")
    private @Nullable Output<AppSpecJobLogDestinationDatadogArgs> datadog;

    /**
     * @return Datadog configuration.
     * 
     */
    public Optional<Output<AppSpecJobLogDestinationDatadogArgs>> datadog() {
        return Optional.ofNullable(this.datadog);
    }

    /**
     * Logtail configuration.
     * 
     */
    @Import(name="logtail")
    private @Nullable Output<AppSpecJobLogDestinationLogtailArgs> logtail;

    /**
     * @return Logtail configuration.
     * 
     */
    public Optional<Output<AppSpecJobLogDestinationLogtailArgs>> logtail() {
        return Optional.ofNullable(this.logtail);
    }

    /**
     * Name of the log destination. Minimum length: 2. Maximum length: 42.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the log destination. Minimum length: 2. Maximum length: 42.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * OpenSearch configuration.
     * 
     */
    @Import(name="openSearch")
    private @Nullable Output<AppSpecJobLogDestinationOpenSearchArgs> openSearch;

    /**
     * @return OpenSearch configuration.
     * 
     */
    public Optional<Output<AppSpecJobLogDestinationOpenSearchArgs>> openSearch() {
        return Optional.ofNullable(this.openSearch);
    }

    /**
     * Papertrail configuration.
     * 
     */
    @Import(name="papertrail")
    private @Nullable Output<AppSpecJobLogDestinationPapertrailArgs> papertrail;

    /**
     * @return Papertrail configuration.
     * 
     */
    public Optional<Output<AppSpecJobLogDestinationPapertrailArgs>> papertrail() {
        return Optional.ofNullable(this.papertrail);
    }

    private AppSpecJobLogDestinationArgs() {}

    private AppSpecJobLogDestinationArgs(AppSpecJobLogDestinationArgs $) {
        this.datadog = $.datadog;
        this.logtail = $.logtail;
        this.name = $.name;
        this.openSearch = $.openSearch;
        this.papertrail = $.papertrail;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppSpecJobLogDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppSpecJobLogDestinationArgs $;

        public Builder() {
            $ = new AppSpecJobLogDestinationArgs();
        }

        public Builder(AppSpecJobLogDestinationArgs defaults) {
            $ = new AppSpecJobLogDestinationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param datadog Datadog configuration.
         * 
         * @return builder
         * 
         */
        public Builder datadog(@Nullable Output<AppSpecJobLogDestinationDatadogArgs> datadog) {
            $.datadog = datadog;
            return this;
        }

        /**
         * @param datadog Datadog configuration.
         * 
         * @return builder
         * 
         */
        public Builder datadog(AppSpecJobLogDestinationDatadogArgs datadog) {
            return datadog(Output.of(datadog));
        }

        /**
         * @param logtail Logtail configuration.
         * 
         * @return builder
         * 
         */
        public Builder logtail(@Nullable Output<AppSpecJobLogDestinationLogtailArgs> logtail) {
            $.logtail = logtail;
            return this;
        }

        /**
         * @param logtail Logtail configuration.
         * 
         * @return builder
         * 
         */
        public Builder logtail(AppSpecJobLogDestinationLogtailArgs logtail) {
            return logtail(Output.of(logtail));
        }

        /**
         * @param name Name of the log destination. Minimum length: 2. Maximum length: 42.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the log destination. Minimum length: 2. Maximum length: 42.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param openSearch OpenSearch configuration.
         * 
         * @return builder
         * 
         */
        public Builder openSearch(@Nullable Output<AppSpecJobLogDestinationOpenSearchArgs> openSearch) {
            $.openSearch = openSearch;
            return this;
        }

        /**
         * @param openSearch OpenSearch configuration.
         * 
         * @return builder
         * 
         */
        public Builder openSearch(AppSpecJobLogDestinationOpenSearchArgs openSearch) {
            return openSearch(Output.of(openSearch));
        }

        /**
         * @param papertrail Papertrail configuration.
         * 
         * @return builder
         * 
         */
        public Builder papertrail(@Nullable Output<AppSpecJobLogDestinationPapertrailArgs> papertrail) {
            $.papertrail = papertrail;
            return this;
        }

        /**
         * @param papertrail Papertrail configuration.
         * 
         * @return builder
         * 
         */
        public Builder papertrail(AppSpecJobLogDestinationPapertrailArgs papertrail) {
            return papertrail(Output.of(papertrail));
        }

        public AppSpecJobLogDestinationArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("AppSpecJobLogDestinationArgs", "name");
            }
            return $;
        }
    }

}
