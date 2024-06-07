// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class AppSpecServiceLogDestinationPapertrailArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppSpecServiceLogDestinationPapertrailArgs Empty = new AppSpecServiceLogDestinationPapertrailArgs();

    /**
     * Papertrail syslog endpoint.
     * 
     */
    @Import(name="endpoint", required=true)
    private Output<String> endpoint;

    /**
     * @return Papertrail syslog endpoint.
     * 
     */
    public Output<String> endpoint() {
        return this.endpoint;
    }

    private AppSpecServiceLogDestinationPapertrailArgs() {}

    private AppSpecServiceLogDestinationPapertrailArgs(AppSpecServiceLogDestinationPapertrailArgs $) {
        this.endpoint = $.endpoint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppSpecServiceLogDestinationPapertrailArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppSpecServiceLogDestinationPapertrailArgs $;

        public Builder() {
            $ = new AppSpecServiceLogDestinationPapertrailArgs();
        }

        public Builder(AppSpecServiceLogDestinationPapertrailArgs defaults) {
            $ = new AppSpecServiceLogDestinationPapertrailArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endpoint Papertrail syslog endpoint.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        /**
         * @param endpoint Papertrail syslog endpoint.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        public AppSpecServiceLogDestinationPapertrailArgs build() {
            if ($.endpoint == null) {
                throw new MissingRequiredPropertyException("AppSpecServiceLogDestinationPapertrailArgs", "endpoint");
            }
            return $;
        }
    }

}
