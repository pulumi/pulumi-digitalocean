// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.digitalocean.outputs.AppSpecFunctionLogDestinationDatadog;
import com.pulumi.digitalocean.outputs.AppSpecFunctionLogDestinationLogtail;
import com.pulumi.digitalocean.outputs.AppSpecFunctionLogDestinationOpenSearch;
import com.pulumi.digitalocean.outputs.AppSpecFunctionLogDestinationPapertrail;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppSpecFunctionLogDestination {
    /**
     * @return Datadog configuration.
     * 
     */
    private @Nullable AppSpecFunctionLogDestinationDatadog datadog;
    /**
     * @return Logtail configuration.
     * 
     */
    private @Nullable AppSpecFunctionLogDestinationLogtail logtail;
    /**
     * @return Name of the log destination. Minimum length: 2. Maximum length: 42.
     * 
     */
    private String name;
    /**
     * @return OpenSearch configuration.
     * 
     */
    private @Nullable AppSpecFunctionLogDestinationOpenSearch openSearch;
    /**
     * @return Papertrail configuration.
     * 
     */
    private @Nullable AppSpecFunctionLogDestinationPapertrail papertrail;

    private AppSpecFunctionLogDestination() {}
    /**
     * @return Datadog configuration.
     * 
     */
    public Optional<AppSpecFunctionLogDestinationDatadog> datadog() {
        return Optional.ofNullable(this.datadog);
    }
    /**
     * @return Logtail configuration.
     * 
     */
    public Optional<AppSpecFunctionLogDestinationLogtail> logtail() {
        return Optional.ofNullable(this.logtail);
    }
    /**
     * @return Name of the log destination. Minimum length: 2. Maximum length: 42.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return OpenSearch configuration.
     * 
     */
    public Optional<AppSpecFunctionLogDestinationOpenSearch> openSearch() {
        return Optional.ofNullable(this.openSearch);
    }
    /**
     * @return Papertrail configuration.
     * 
     */
    public Optional<AppSpecFunctionLogDestinationPapertrail> papertrail() {
        return Optional.ofNullable(this.papertrail);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppSpecFunctionLogDestination defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable AppSpecFunctionLogDestinationDatadog datadog;
        private @Nullable AppSpecFunctionLogDestinationLogtail logtail;
        private String name;
        private @Nullable AppSpecFunctionLogDestinationOpenSearch openSearch;
        private @Nullable AppSpecFunctionLogDestinationPapertrail papertrail;
        public Builder() {}
        public Builder(AppSpecFunctionLogDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datadog = defaults.datadog;
    	      this.logtail = defaults.logtail;
    	      this.name = defaults.name;
    	      this.openSearch = defaults.openSearch;
    	      this.papertrail = defaults.papertrail;
        }

        @CustomType.Setter
        public Builder datadog(@Nullable AppSpecFunctionLogDestinationDatadog datadog) {

            this.datadog = datadog;
            return this;
        }
        @CustomType.Setter
        public Builder logtail(@Nullable AppSpecFunctionLogDestinationLogtail logtail) {

            this.logtail = logtail;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("AppSpecFunctionLogDestination", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder openSearch(@Nullable AppSpecFunctionLogDestinationOpenSearch openSearch) {

            this.openSearch = openSearch;
            return this;
        }
        @CustomType.Setter
        public Builder papertrail(@Nullable AppSpecFunctionLogDestinationPapertrail papertrail) {

            this.papertrail = papertrail;
            return this;
        }
        public AppSpecFunctionLogDestination build() {
            final var _resultValue = new AppSpecFunctionLogDestination();
            _resultValue.datadog = datadog;
            _resultValue.logtail = logtail;
            _resultValue.name = name;
            _resultValue.openSearch = openSearch;
            _resultValue.papertrail = papertrail;
            return _resultValue;
        }
    }
}
