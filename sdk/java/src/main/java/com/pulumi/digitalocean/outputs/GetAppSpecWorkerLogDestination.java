// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.digitalocean.outputs.GetAppSpecWorkerLogDestinationDatadog;
import com.pulumi.digitalocean.outputs.GetAppSpecWorkerLogDestinationLogtail;
import com.pulumi.digitalocean.outputs.GetAppSpecWorkerLogDestinationPapertrail;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAppSpecWorkerLogDestination {
    /**
     * @return Datadog configuration.
     * 
     */
    private final @Nullable GetAppSpecWorkerLogDestinationDatadog datadog;
    /**
     * @return Logtail configuration.
     * 
     */
    private final @Nullable GetAppSpecWorkerLogDestinationLogtail logtail;
    /**
     * @return The name of the component.
     * 
     */
    private final String name;
    /**
     * @return Papertrail configuration.
     * 
     */
    private final @Nullable GetAppSpecWorkerLogDestinationPapertrail papertrail;

    @CustomType.Constructor
    private GetAppSpecWorkerLogDestination(
        @CustomType.Parameter("datadog") @Nullable GetAppSpecWorkerLogDestinationDatadog datadog,
        @CustomType.Parameter("logtail") @Nullable GetAppSpecWorkerLogDestinationLogtail logtail,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("papertrail") @Nullable GetAppSpecWorkerLogDestinationPapertrail papertrail) {
        this.datadog = datadog;
        this.logtail = logtail;
        this.name = name;
        this.papertrail = papertrail;
    }

    /**
     * @return Datadog configuration.
     * 
     */
    public Optional<GetAppSpecWorkerLogDestinationDatadog> datadog() {
        return Optional.ofNullable(this.datadog);
    }
    /**
     * @return Logtail configuration.
     * 
     */
    public Optional<GetAppSpecWorkerLogDestinationLogtail> logtail() {
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
    public Optional<GetAppSpecWorkerLogDestinationPapertrail> papertrail() {
        return Optional.ofNullable(this.papertrail);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppSpecWorkerLogDestination defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable GetAppSpecWorkerLogDestinationDatadog datadog;
        private @Nullable GetAppSpecWorkerLogDestinationLogtail logtail;
        private String name;
        private @Nullable GetAppSpecWorkerLogDestinationPapertrail papertrail;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAppSpecWorkerLogDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datadog = defaults.datadog;
    	      this.logtail = defaults.logtail;
    	      this.name = defaults.name;
    	      this.papertrail = defaults.papertrail;
        }

        public Builder datadog(@Nullable GetAppSpecWorkerLogDestinationDatadog datadog) {
            this.datadog = datadog;
            return this;
        }
        public Builder logtail(@Nullable GetAppSpecWorkerLogDestinationLogtail logtail) {
            this.logtail = logtail;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder papertrail(@Nullable GetAppSpecWorkerLogDestinationPapertrail papertrail) {
            this.papertrail = papertrail;
            return this;
        }        public GetAppSpecWorkerLogDestination build() {
            return new GetAppSpecWorkerLogDestination(datadog, logtail, name, papertrail);
        }
    }
}