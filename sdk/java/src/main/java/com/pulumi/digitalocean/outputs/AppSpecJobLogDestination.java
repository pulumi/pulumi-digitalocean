// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.digitalocean.outputs.AppSpecJobLogDestinationDatadog;
import com.pulumi.digitalocean.outputs.AppSpecJobLogDestinationLogtail;
import com.pulumi.digitalocean.outputs.AppSpecJobLogDestinationPapertrail;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppSpecJobLogDestination {
    /**
     * @return Datadog configuration.
     * 
     */
    private @Nullable AppSpecJobLogDestinationDatadog datadog;
    /**
     * @return Logtail configuration.
     * 
     */
    private @Nullable AppSpecJobLogDestinationLogtail logtail;
    /**
     * @return The name of the component.
     * 
     */
    private String name;
    /**
     * @return Papertrail configuration.
     * 
     */
    private @Nullable AppSpecJobLogDestinationPapertrail papertrail;

    private AppSpecJobLogDestination() {}
    /**
     * @return Datadog configuration.
     * 
     */
    public Optional<AppSpecJobLogDestinationDatadog> datadog() {
        return Optional.ofNullable(this.datadog);
    }
    /**
     * @return Logtail configuration.
     * 
     */
    public Optional<AppSpecJobLogDestinationLogtail> logtail() {
        return Optional.ofNullable(this.logtail);
    }
    /**
     * @return The name of the component.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Papertrail configuration.
     * 
     */
    public Optional<AppSpecJobLogDestinationPapertrail> papertrail() {
        return Optional.ofNullable(this.papertrail);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppSpecJobLogDestination defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable AppSpecJobLogDestinationDatadog datadog;
        private @Nullable AppSpecJobLogDestinationLogtail logtail;
        private String name;
        private @Nullable AppSpecJobLogDestinationPapertrail papertrail;
        public Builder() {}
        public Builder(AppSpecJobLogDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datadog = defaults.datadog;
    	      this.logtail = defaults.logtail;
    	      this.name = defaults.name;
    	      this.papertrail = defaults.papertrail;
        }

        @CustomType.Setter
        public Builder datadog(@Nullable AppSpecJobLogDestinationDatadog datadog) {

            this.datadog = datadog;
            return this;
        }
        @CustomType.Setter
        public Builder logtail(@Nullable AppSpecJobLogDestinationLogtail logtail) {

            this.logtail = logtail;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("AppSpecJobLogDestination", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder papertrail(@Nullable AppSpecJobLogDestinationPapertrail papertrail) {

            this.papertrail = papertrail;
            return this;
        }
        public AppSpecJobLogDestination build() {
            final var _resultValue = new AppSpecJobLogDestination();
            _resultValue.datadog = datadog;
            _resultValue.logtail = logtail;
            _resultValue.name = name;
            _resultValue.papertrail = papertrail;
            return _resultValue;
        }
    }
}
