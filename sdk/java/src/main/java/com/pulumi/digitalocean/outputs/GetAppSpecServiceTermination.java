// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAppSpecServiceTermination {
    /**
     * @return The number of seconds to wait between selecting a container instance for termination and issuing the TERM signal. Selecting a container instance for termination begins an asynchronous drain of new requests on upstream load-balancers. Default: 15 seconds, Minimum 1, Maximum 110.
     * 
     */
    private @Nullable Integer drainSeconds;
    /**
     * @return The number of seconds to wait between sending a TERM signal to a container and issuing a KILL which causes immediate shutdown. Default: 120, Minimum 1, Maximum 600.
     * 
     */
    private @Nullable Integer gracePeriodSeconds;

    private GetAppSpecServiceTermination() {}
    /**
     * @return The number of seconds to wait between selecting a container instance for termination and issuing the TERM signal. Selecting a container instance for termination begins an asynchronous drain of new requests on upstream load-balancers. Default: 15 seconds, Minimum 1, Maximum 110.
     * 
     */
    public Optional<Integer> drainSeconds() {
        return Optional.ofNullable(this.drainSeconds);
    }
    /**
     * @return The number of seconds to wait between sending a TERM signal to a container and issuing a KILL which causes immediate shutdown. Default: 120, Minimum 1, Maximum 600.
     * 
     */
    public Optional<Integer> gracePeriodSeconds() {
        return Optional.ofNullable(this.gracePeriodSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppSpecServiceTermination defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer drainSeconds;
        private @Nullable Integer gracePeriodSeconds;
        public Builder() {}
        public Builder(GetAppSpecServiceTermination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.drainSeconds = defaults.drainSeconds;
    	      this.gracePeriodSeconds = defaults.gracePeriodSeconds;
        }

        @CustomType.Setter
        public Builder drainSeconds(@Nullable Integer drainSeconds) {

            this.drainSeconds = drainSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder gracePeriodSeconds(@Nullable Integer gracePeriodSeconds) {

            this.gracePeriodSeconds = gracePeriodSeconds;
            return this;
        }
        public GetAppSpecServiceTermination build() {
            final var _resultValue = new GetAppSpecServiceTermination();
            _resultValue.drainSeconds = drainSeconds;
            _resultValue.gracePeriodSeconds = gracePeriodSeconds;
            return _resultValue;
        }
    }
}
