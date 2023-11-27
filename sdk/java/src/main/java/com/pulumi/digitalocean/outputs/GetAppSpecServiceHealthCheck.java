// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAppSpecServiceHealthCheck {
    /**
     * @return The number of failed health checks before considered unhealthy.
     * 
     */
    private @Nullable Integer failureThreshold;
    /**
     * @return The route path used for the HTTP health check ping.
     * 
     */
    private @Nullable String httpPath;
    /**
     * @return The number of seconds to wait before beginning health checks.
     * 
     */
    private @Nullable Integer initialDelaySeconds;
    /**
     * @return The number of seconds to wait between health checks.
     * 
     */
    private @Nullable Integer periodSeconds;
    /**
     * @return The number of successful health checks before considered healthy.
     * 
     */
    private @Nullable Integer successThreshold;
    /**
     * @return The number of seconds after which the check times out.
     * 
     */
    private @Nullable Integer timeoutSeconds;

    private GetAppSpecServiceHealthCheck() {}
    /**
     * @return The number of failed health checks before considered unhealthy.
     * 
     */
    public Optional<Integer> failureThreshold() {
        return Optional.ofNullable(this.failureThreshold);
    }
    /**
     * @return The route path used for the HTTP health check ping.
     * 
     */
    public Optional<String> httpPath() {
        return Optional.ofNullable(this.httpPath);
    }
    /**
     * @return The number of seconds to wait before beginning health checks.
     * 
     */
    public Optional<Integer> initialDelaySeconds() {
        return Optional.ofNullable(this.initialDelaySeconds);
    }
    /**
     * @return The number of seconds to wait between health checks.
     * 
     */
    public Optional<Integer> periodSeconds() {
        return Optional.ofNullable(this.periodSeconds);
    }
    /**
     * @return The number of successful health checks before considered healthy.
     * 
     */
    public Optional<Integer> successThreshold() {
        return Optional.ofNullable(this.successThreshold);
    }
    /**
     * @return The number of seconds after which the check times out.
     * 
     */
    public Optional<Integer> timeoutSeconds() {
        return Optional.ofNullable(this.timeoutSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppSpecServiceHealthCheck defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer failureThreshold;
        private @Nullable String httpPath;
        private @Nullable Integer initialDelaySeconds;
        private @Nullable Integer periodSeconds;
        private @Nullable Integer successThreshold;
        private @Nullable Integer timeoutSeconds;
        public Builder() {}
        public Builder(GetAppSpecServiceHealthCheck defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failureThreshold = defaults.failureThreshold;
    	      this.httpPath = defaults.httpPath;
    	      this.initialDelaySeconds = defaults.initialDelaySeconds;
    	      this.periodSeconds = defaults.periodSeconds;
    	      this.successThreshold = defaults.successThreshold;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
        }

        @CustomType.Setter
        public Builder failureThreshold(@Nullable Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        @CustomType.Setter
        public Builder httpPath(@Nullable String httpPath) {
            this.httpPath = httpPath;
            return this;
        }
        @CustomType.Setter
        public Builder initialDelaySeconds(@Nullable Integer initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }
        @CustomType.Setter
        public Builder periodSeconds(@Nullable Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder successThreshold(@Nullable Integer successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }
        @CustomType.Setter
        public Builder timeoutSeconds(@Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public GetAppSpecServiceHealthCheck build() {
            final var _resultValue = new GetAppSpecServiceHealthCheck();
            _resultValue.failureThreshold = failureThreshold;
            _resultValue.httpPath = httpPath;
            _resultValue.initialDelaySeconds = initialDelaySeconds;
            _resultValue.periodSeconds = periodSeconds;
            _resultValue.successThreshold = successThreshold;
            _resultValue.timeoutSeconds = timeoutSeconds;
            return _resultValue;
        }
    }
}
