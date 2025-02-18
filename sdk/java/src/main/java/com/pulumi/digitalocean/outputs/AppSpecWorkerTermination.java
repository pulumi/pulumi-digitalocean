// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppSpecWorkerTermination {
    /**
     * @return The number of seconds to wait between sending a TERM signal to a container and issuing a KILL which causes immediate shutdown. Default: 120, Minimum 1, Maximum 600.
     * 
     * A `function` component can contain:
     * 
     */
    private @Nullable Integer gracePeriodSeconds;

    private AppSpecWorkerTermination() {}
    /**
     * @return The number of seconds to wait between sending a TERM signal to a container and issuing a KILL which causes immediate shutdown. Default: 120, Minimum 1, Maximum 600.
     * 
     * A `function` component can contain:
     * 
     */
    public Optional<Integer> gracePeriodSeconds() {
        return Optional.ofNullable(this.gracePeriodSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppSpecWorkerTermination defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer gracePeriodSeconds;
        public Builder() {}
        public Builder(AppSpecWorkerTermination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gracePeriodSeconds = defaults.gracePeriodSeconds;
        }

        @CustomType.Setter
        public Builder gracePeriodSeconds(@Nullable Integer gracePeriodSeconds) {

            this.gracePeriodSeconds = gracePeriodSeconds;
            return this;
        }
        public AppSpecWorkerTermination build() {
            final var _resultValue = new AppSpecWorkerTermination();
            _resultValue.gracePeriodSeconds = gracePeriodSeconds;
            return _resultValue;
        }
    }
}
