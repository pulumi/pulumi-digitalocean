// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class AppSpecWorkerLogDestinationPapertrailArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppSpecWorkerLogDestinationPapertrailArgs Empty = new AppSpecWorkerLogDestinationPapertrailArgs();

    /**
     * Datadog HTTP log intake endpoint.
     * 
     */
    @Import(name="endpoint", required=true)
    private Output<String> endpoint;

    /**
     * @return Datadog HTTP log intake endpoint.
     * 
     */
    public Output<String> endpoint() {
        return this.endpoint;
    }

    private AppSpecWorkerLogDestinationPapertrailArgs() {}

    private AppSpecWorkerLogDestinationPapertrailArgs(AppSpecWorkerLogDestinationPapertrailArgs $) {
        this.endpoint = $.endpoint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppSpecWorkerLogDestinationPapertrailArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppSpecWorkerLogDestinationPapertrailArgs $;

        public Builder() {
            $ = new AppSpecWorkerLogDestinationPapertrailArgs();
        }

        public Builder(AppSpecWorkerLogDestinationPapertrailArgs defaults) {
            $ = new AppSpecWorkerLogDestinationPapertrailArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endpoint Datadog HTTP log intake endpoint.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        /**
         * @param endpoint Datadog HTTP log intake endpoint.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        public AppSpecWorkerLogDestinationPapertrailArgs build() {
            if ($.endpoint == null) {
                throw new MissingRequiredPropertyException("AppSpecWorkerLogDestinationPapertrailArgs", "endpoint");
            }
            return $;
        }
    }

}
