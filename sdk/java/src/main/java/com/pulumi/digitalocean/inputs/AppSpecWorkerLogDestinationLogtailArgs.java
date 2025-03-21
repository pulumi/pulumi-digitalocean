// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class AppSpecWorkerLogDestinationLogtailArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppSpecWorkerLogDestinationLogtailArgs Empty = new AppSpecWorkerLogDestinationLogtailArgs();

    /**
     * Logtail token.
     * 
     */
    @Import(name="token", required=true)
    private Output<String> token;

    /**
     * @return Logtail token.
     * 
     */
    public Output<String> token() {
        return this.token;
    }

    private AppSpecWorkerLogDestinationLogtailArgs() {}

    private AppSpecWorkerLogDestinationLogtailArgs(AppSpecWorkerLogDestinationLogtailArgs $) {
        this.token = $.token;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppSpecWorkerLogDestinationLogtailArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppSpecWorkerLogDestinationLogtailArgs $;

        public Builder() {
            $ = new AppSpecWorkerLogDestinationLogtailArgs();
        }

        public Builder(AppSpecWorkerLogDestinationLogtailArgs defaults) {
            $ = new AppSpecWorkerLogDestinationLogtailArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param token Logtail token.
         * 
         * @return builder
         * 
         */
        public Builder token(Output<String> token) {
            $.token = token;
            return this;
        }

        /**
         * @param token Logtail token.
         * 
         * @return builder
         * 
         */
        public Builder token(String token) {
            return token(Output.of(token));
        }

        public AppSpecWorkerLogDestinationLogtailArgs build() {
            if ($.token == null) {
                throw new MissingRequiredPropertyException("AppSpecWorkerLogDestinationLogtailArgs", "token");
            }
            return $;
        }
    }

}
