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


public final class LoadBalancerHealthcheckArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerHealthcheckArgs Empty = new LoadBalancerHealthcheckArgs();

    /**
     * The number of seconds between two consecutive health checks. If not specified, the default value is `10`.
     * 
     */
    @Import(name="checkIntervalSeconds")
    private @Nullable Output<Integer> checkIntervalSeconds;

    /**
     * @return The number of seconds between two consecutive health checks. If not specified, the default value is `10`.
     * 
     */
    public Optional<Output<Integer>> checkIntervalSeconds() {
        return Optional.ofNullable(this.checkIntervalSeconds);
    }

    /**
     * The number of times a health check must pass for a backend Droplet to be marked &#34;healthy&#34; and be re-added to the pool. If not specified, the default value is `5`.
     * 
     */
    @Import(name="healthyThreshold")
    private @Nullable Output<Integer> healthyThreshold;

    /**
     * @return The number of times a health check must pass for a backend Droplet to be marked &#34;healthy&#34; and be re-added to the pool. If not specified, the default value is `5`.
     * 
     */
    public Optional<Output<Integer>> healthyThreshold() {
        return Optional.ofNullable(this.healthyThreshold);
    }

    /**
     * The path on the backend Droplets to which the Load Balancer instance will send a request.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return The path on the backend Droplets to which the Load Balancer instance will send a request.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * An integer representing the port on the backend Droplets on which the health check will attempt a connection.
     * 
     */
    @Import(name="port", required=true)
    private Output<Integer> port;

    /**
     * @return An integer representing the port on the backend Droplets on which the health check will attempt a connection.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }

    /**
     * The protocol used for health checks sent to the backend Droplets. The possible values are `http`, `https` or `tcp`.
     * 
     */
    @Import(name="protocol", required=true)
    private Output<String> protocol;

    /**
     * @return The protocol used for health checks sent to the backend Droplets. The possible values are `http`, `https` or `tcp`.
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }

    /**
     * The number of seconds the Load Balancer instance will wait for a response until marking a health check as failed. If not specified, the default value is `5`.
     * 
     */
    @Import(name="responseTimeoutSeconds")
    private @Nullable Output<Integer> responseTimeoutSeconds;

    /**
     * @return The number of seconds the Load Balancer instance will wait for a response until marking a health check as failed. If not specified, the default value is `5`.
     * 
     */
    public Optional<Output<Integer>> responseTimeoutSeconds() {
        return Optional.ofNullable(this.responseTimeoutSeconds);
    }

    /**
     * The number of times a health check must fail for a backend Droplet to be marked &#34;unhealthy&#34; and be removed from the pool. If not specified, the default value is `3`.
     * 
     */
    @Import(name="unhealthyThreshold")
    private @Nullable Output<Integer> unhealthyThreshold;

    /**
     * @return The number of times a health check must fail for a backend Droplet to be marked &#34;unhealthy&#34; and be removed from the pool. If not specified, the default value is `3`.
     * 
     */
    public Optional<Output<Integer>> unhealthyThreshold() {
        return Optional.ofNullable(this.unhealthyThreshold);
    }

    private LoadBalancerHealthcheckArgs() {}

    private LoadBalancerHealthcheckArgs(LoadBalancerHealthcheckArgs $) {
        this.checkIntervalSeconds = $.checkIntervalSeconds;
        this.healthyThreshold = $.healthyThreshold;
        this.path = $.path;
        this.port = $.port;
        this.protocol = $.protocol;
        this.responseTimeoutSeconds = $.responseTimeoutSeconds;
        this.unhealthyThreshold = $.unhealthyThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerHealthcheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerHealthcheckArgs $;

        public Builder() {
            $ = new LoadBalancerHealthcheckArgs();
        }

        public Builder(LoadBalancerHealthcheckArgs defaults) {
            $ = new LoadBalancerHealthcheckArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param checkIntervalSeconds The number of seconds between two consecutive health checks. If not specified, the default value is `10`.
         * 
         * @return builder
         * 
         */
        public Builder checkIntervalSeconds(@Nullable Output<Integer> checkIntervalSeconds) {
            $.checkIntervalSeconds = checkIntervalSeconds;
            return this;
        }

        /**
         * @param checkIntervalSeconds The number of seconds between two consecutive health checks. If not specified, the default value is `10`.
         * 
         * @return builder
         * 
         */
        public Builder checkIntervalSeconds(Integer checkIntervalSeconds) {
            return checkIntervalSeconds(Output.of(checkIntervalSeconds));
        }

        /**
         * @param healthyThreshold The number of times a health check must pass for a backend Droplet to be marked &#34;healthy&#34; and be re-added to the pool. If not specified, the default value is `5`.
         * 
         * @return builder
         * 
         */
        public Builder healthyThreshold(@Nullable Output<Integer> healthyThreshold) {
            $.healthyThreshold = healthyThreshold;
            return this;
        }

        /**
         * @param healthyThreshold The number of times a health check must pass for a backend Droplet to be marked &#34;healthy&#34; and be re-added to the pool. If not specified, the default value is `5`.
         * 
         * @return builder
         * 
         */
        public Builder healthyThreshold(Integer healthyThreshold) {
            return healthyThreshold(Output.of(healthyThreshold));
        }

        /**
         * @param path The path on the backend Droplets to which the Load Balancer instance will send a request.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The path on the backend Droplets to which the Load Balancer instance will send a request.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param port An integer representing the port on the backend Droplets on which the health check will attempt a connection.
         * 
         * @return builder
         * 
         */
        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port An integer representing the port on the backend Droplets on which the health check will attempt a connection.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param protocol The protocol used for health checks sent to the backend Droplets. The possible values are `http`, `https` or `tcp`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol The protocol used for health checks sent to the backend Droplets. The possible values are `http`, `https` or `tcp`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param responseTimeoutSeconds The number of seconds the Load Balancer instance will wait for a response until marking a health check as failed. If not specified, the default value is `5`.
         * 
         * @return builder
         * 
         */
        public Builder responseTimeoutSeconds(@Nullable Output<Integer> responseTimeoutSeconds) {
            $.responseTimeoutSeconds = responseTimeoutSeconds;
            return this;
        }

        /**
         * @param responseTimeoutSeconds The number of seconds the Load Balancer instance will wait for a response until marking a health check as failed. If not specified, the default value is `5`.
         * 
         * @return builder
         * 
         */
        public Builder responseTimeoutSeconds(Integer responseTimeoutSeconds) {
            return responseTimeoutSeconds(Output.of(responseTimeoutSeconds));
        }

        /**
         * @param unhealthyThreshold The number of times a health check must fail for a backend Droplet to be marked &#34;unhealthy&#34; and be removed from the pool. If not specified, the default value is `3`.
         * 
         * @return builder
         * 
         */
        public Builder unhealthyThreshold(@Nullable Output<Integer> unhealthyThreshold) {
            $.unhealthyThreshold = unhealthyThreshold;
            return this;
        }

        /**
         * @param unhealthyThreshold The number of times a health check must fail for a backend Droplet to be marked &#34;unhealthy&#34; and be removed from the pool. If not specified, the default value is `3`.
         * 
         * @return builder
         * 
         */
        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            return unhealthyThreshold(Output.of(unhealthyThreshold));
        }

        public LoadBalancerHealthcheckArgs build() {
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            $.protocol = Objects.requireNonNull($.protocol, "expected parameter 'protocol' to be non-null");
            return $;
        }
    }

}
