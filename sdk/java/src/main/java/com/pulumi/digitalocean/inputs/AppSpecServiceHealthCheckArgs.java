// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppSpecServiceHealthCheckArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppSpecServiceHealthCheckArgs Empty = new AppSpecServiceHealthCheckArgs();

    /**
     * The number of failed health checks before considered unhealthy.
     * 
     */
    @Import(name="failureThreshold")
    private @Nullable Output<Integer> failureThreshold;

    /**
     * @return The number of failed health checks before considered unhealthy.
     * 
     */
    public Optional<Output<Integer>> failureThreshold() {
        return Optional.ofNullable(this.failureThreshold);
    }

    /**
     * The route path used for the HTTP health check ping.
     * 
     */
    @Import(name="httpPath")
    private @Nullable Output<String> httpPath;

    /**
     * @return The route path used for the HTTP health check ping.
     * 
     */
    public Optional<Output<String>> httpPath() {
        return Optional.ofNullable(this.httpPath);
    }

    /**
     * The number of seconds to wait before beginning health checks.
     * 
     */
    @Import(name="initialDelaySeconds")
    private @Nullable Output<Integer> initialDelaySeconds;

    /**
     * @return The number of seconds to wait before beginning health checks.
     * 
     */
    public Optional<Output<Integer>> initialDelaySeconds() {
        return Optional.ofNullable(this.initialDelaySeconds);
    }

    /**
     * The number of seconds to wait between health checks.
     * 
     */
    @Import(name="periodSeconds")
    private @Nullable Output<Integer> periodSeconds;

    /**
     * @return The number of seconds to wait between health checks.
     * 
     */
    public Optional<Output<Integer>> periodSeconds() {
        return Optional.ofNullable(this.periodSeconds);
    }

    /**
     * The health check will be performed on this port instead of component&#39;s HTTP port.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return The health check will be performed on this port instead of component&#39;s HTTP port.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * The number of successful health checks before considered healthy.
     * 
     */
    @Import(name="successThreshold")
    private @Nullable Output<Integer> successThreshold;

    /**
     * @return The number of successful health checks before considered healthy.
     * 
     */
    public Optional<Output<Integer>> successThreshold() {
        return Optional.ofNullable(this.successThreshold);
    }

    /**
     * The number of seconds after which the check times out.
     * 
     */
    @Import(name="timeoutSeconds")
    private @Nullable Output<Integer> timeoutSeconds;

    /**
     * @return The number of seconds after which the check times out.
     * 
     */
    public Optional<Output<Integer>> timeoutSeconds() {
        return Optional.ofNullable(this.timeoutSeconds);
    }

    private AppSpecServiceHealthCheckArgs() {}

    private AppSpecServiceHealthCheckArgs(AppSpecServiceHealthCheckArgs $) {
        this.failureThreshold = $.failureThreshold;
        this.httpPath = $.httpPath;
        this.initialDelaySeconds = $.initialDelaySeconds;
        this.periodSeconds = $.periodSeconds;
        this.port = $.port;
        this.successThreshold = $.successThreshold;
        this.timeoutSeconds = $.timeoutSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppSpecServiceHealthCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppSpecServiceHealthCheckArgs $;

        public Builder() {
            $ = new AppSpecServiceHealthCheckArgs();
        }

        public Builder(AppSpecServiceHealthCheckArgs defaults) {
            $ = new AppSpecServiceHealthCheckArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param failureThreshold The number of failed health checks before considered unhealthy.
         * 
         * @return builder
         * 
         */
        public Builder failureThreshold(@Nullable Output<Integer> failureThreshold) {
            $.failureThreshold = failureThreshold;
            return this;
        }

        /**
         * @param failureThreshold The number of failed health checks before considered unhealthy.
         * 
         * @return builder
         * 
         */
        public Builder failureThreshold(Integer failureThreshold) {
            return failureThreshold(Output.of(failureThreshold));
        }

        /**
         * @param httpPath The route path used for the HTTP health check ping.
         * 
         * @return builder
         * 
         */
        public Builder httpPath(@Nullable Output<String> httpPath) {
            $.httpPath = httpPath;
            return this;
        }

        /**
         * @param httpPath The route path used for the HTTP health check ping.
         * 
         * @return builder
         * 
         */
        public Builder httpPath(String httpPath) {
            return httpPath(Output.of(httpPath));
        }

        /**
         * @param initialDelaySeconds The number of seconds to wait before beginning health checks.
         * 
         * @return builder
         * 
         */
        public Builder initialDelaySeconds(@Nullable Output<Integer> initialDelaySeconds) {
            $.initialDelaySeconds = initialDelaySeconds;
            return this;
        }

        /**
         * @param initialDelaySeconds The number of seconds to wait before beginning health checks.
         * 
         * @return builder
         * 
         */
        public Builder initialDelaySeconds(Integer initialDelaySeconds) {
            return initialDelaySeconds(Output.of(initialDelaySeconds));
        }

        /**
         * @param periodSeconds The number of seconds to wait between health checks.
         * 
         * @return builder
         * 
         */
        public Builder periodSeconds(@Nullable Output<Integer> periodSeconds) {
            $.periodSeconds = periodSeconds;
            return this;
        }

        /**
         * @param periodSeconds The number of seconds to wait between health checks.
         * 
         * @return builder
         * 
         */
        public Builder periodSeconds(Integer periodSeconds) {
            return periodSeconds(Output.of(periodSeconds));
        }

        /**
         * @param port The health check will be performed on this port instead of component&#39;s HTTP port.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The health check will be performed on this port instead of component&#39;s HTTP port.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param successThreshold The number of successful health checks before considered healthy.
         * 
         * @return builder
         * 
         */
        public Builder successThreshold(@Nullable Output<Integer> successThreshold) {
            $.successThreshold = successThreshold;
            return this;
        }

        /**
         * @param successThreshold The number of successful health checks before considered healthy.
         * 
         * @return builder
         * 
         */
        public Builder successThreshold(Integer successThreshold) {
            return successThreshold(Output.of(successThreshold));
        }

        /**
         * @param timeoutSeconds The number of seconds after which the check times out.
         * 
         * @return builder
         * 
         */
        public Builder timeoutSeconds(@Nullable Output<Integer> timeoutSeconds) {
            $.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * @param timeoutSeconds The number of seconds after which the check times out.
         * 
         * @return builder
         * 
         */
        public Builder timeoutSeconds(Integer timeoutSeconds) {
            return timeoutSeconds(Output.of(timeoutSeconds));
        }

        public AppSpecServiceHealthCheckArgs build() {
            return $;
        }
    }

}
