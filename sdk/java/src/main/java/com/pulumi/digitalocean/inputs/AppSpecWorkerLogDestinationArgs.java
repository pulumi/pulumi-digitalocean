// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.digitalocean.inputs.AppSpecWorkerLogDestinationDatadogArgs;
import com.pulumi.digitalocean.inputs.AppSpecWorkerLogDestinationLogtailArgs;
import com.pulumi.digitalocean.inputs.AppSpecWorkerLogDestinationOpenSearchArgs;
import com.pulumi.digitalocean.inputs.AppSpecWorkerLogDestinationPapertrailArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppSpecWorkerLogDestinationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppSpecWorkerLogDestinationArgs Empty = new AppSpecWorkerLogDestinationArgs();

    /**
     * Datadog configuration.
     * 
     */
    @Import(name="datadog")
    private @Nullable Output<AppSpecWorkerLogDestinationDatadogArgs> datadog;

    /**
     * @return Datadog configuration.
     * 
     */
    public Optional<Output<AppSpecWorkerLogDestinationDatadogArgs>> datadog() {
        return Optional.ofNullable(this.datadog);
    }

    /**
     * Logtail configuration.
     * 
     */
    @Import(name="logtail")
    private @Nullable Output<AppSpecWorkerLogDestinationLogtailArgs> logtail;

    /**
     * @return Logtail configuration.
     * 
     */
    public Optional<Output<AppSpecWorkerLogDestinationLogtailArgs>> logtail() {
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
    private @Nullable Output<AppSpecWorkerLogDestinationOpenSearchArgs> openSearch;

    /**
     * @return OpenSearch configuration.
     * 
     */
    public Optional<Output<AppSpecWorkerLogDestinationOpenSearchArgs>> openSearch() {
        return Optional.ofNullable(this.openSearch);
    }

    /**
     * Papertrail configuration.
     * 
     */
    @Import(name="papertrail")
    private @Nullable Output<AppSpecWorkerLogDestinationPapertrailArgs> papertrail;

    /**
     * @return Papertrail configuration.
     * 
     */
    public Optional<Output<AppSpecWorkerLogDestinationPapertrailArgs>> papertrail() {
        return Optional.ofNullable(this.papertrail);
    }

    private AppSpecWorkerLogDestinationArgs() {}

    private AppSpecWorkerLogDestinationArgs(AppSpecWorkerLogDestinationArgs $) {
        this.datadog = $.datadog;
        this.logtail = $.logtail;
        this.name = $.name;
        this.openSearch = $.openSearch;
        this.papertrail = $.papertrail;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppSpecWorkerLogDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppSpecWorkerLogDestinationArgs $;

        public Builder() {
            $ = new AppSpecWorkerLogDestinationArgs();
        }

        public Builder(AppSpecWorkerLogDestinationArgs defaults) {
            $ = new AppSpecWorkerLogDestinationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param datadog Datadog configuration.
         * 
         * @return builder
         * 
         */
        public Builder datadog(@Nullable Output<AppSpecWorkerLogDestinationDatadogArgs> datadog) {
            $.datadog = datadog;
            return this;
        }

        /**
         * @param datadog Datadog configuration.
         * 
         * @return builder
         * 
         */
        public Builder datadog(AppSpecWorkerLogDestinationDatadogArgs datadog) {
            return datadog(Output.of(datadog));
        }

        /**
         * @param logtail Logtail configuration.
         * 
         * @return builder
         * 
         */
        public Builder logtail(@Nullable Output<AppSpecWorkerLogDestinationLogtailArgs> logtail) {
            $.logtail = logtail;
            return this;
        }

        /**
         * @param logtail Logtail configuration.
         * 
         * @return builder
         * 
         */
        public Builder logtail(AppSpecWorkerLogDestinationLogtailArgs logtail) {
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
        public Builder openSearch(@Nullable Output<AppSpecWorkerLogDestinationOpenSearchArgs> openSearch) {
            $.openSearch = openSearch;
            return this;
        }

        /**
         * @param openSearch OpenSearch configuration.
         * 
         * @return builder
         * 
         */
        public Builder openSearch(AppSpecWorkerLogDestinationOpenSearchArgs openSearch) {
            return openSearch(Output.of(openSearch));
        }

        /**
         * @param papertrail Papertrail configuration.
         * 
         * @return builder
         * 
         */
        public Builder papertrail(@Nullable Output<AppSpecWorkerLogDestinationPapertrailArgs> papertrail) {
            $.papertrail = papertrail;
            return this;
        }

        /**
         * @param papertrail Papertrail configuration.
         * 
         * @return builder
         * 
         */
        public Builder papertrail(AppSpecWorkerLogDestinationPapertrailArgs papertrail) {
            return papertrail(Output.of(papertrail));
        }

        public AppSpecWorkerLogDestinationArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("AppSpecWorkerLogDestinationArgs", "name");
            }
            return $;
        }
    }

}
