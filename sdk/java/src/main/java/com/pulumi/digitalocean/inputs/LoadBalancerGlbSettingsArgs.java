// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.digitalocean.inputs.LoadBalancerGlbSettingsCdnArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadBalancerGlbSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerGlbSettingsArgs Empty = new LoadBalancerGlbSettingsArgs();

    /**
     * CDN configuration supporting the following:
     * 
     */
    @Import(name="cdn")
    private @Nullable Output<LoadBalancerGlbSettingsCdnArgs> cdn;

    /**
     * @return CDN configuration supporting the following:
     * 
     */
    public Optional<Output<LoadBalancerGlbSettingsCdnArgs>> cdn() {
        return Optional.ofNullable(this.cdn);
    }

    /**
     * fail-over threshold
     * 
     */
    @Import(name="failoverThreshold")
    private @Nullable Output<Integer> failoverThreshold;

    /**
     * @return fail-over threshold
     * 
     */
    public Optional<Output<Integer>> failoverThreshold() {
        return Optional.ofNullable(this.failoverThreshold);
    }

    /**
     * region priority map
     * 
     */
    @Import(name="regionPriorities")
    private @Nullable Output<Map<String,Integer>> regionPriorities;

    /**
     * @return region priority map
     * 
     */
    public Optional<Output<Map<String,Integer>>> regionPriorities() {
        return Optional.ofNullable(this.regionPriorities);
    }

    /**
     * An integer representing the port on the backend Droplets to which the Load Balancer will send traffic. The possible values are: `80` for `http` and `443` for `https`.
     * 
     */
    @Import(name="targetPort", required=true)
    private Output<Integer> targetPort;

    /**
     * @return An integer representing the port on the backend Droplets to which the Load Balancer will send traffic. The possible values are: `80` for `http` and `443` for `https`.
     * 
     */
    public Output<Integer> targetPort() {
        return this.targetPort;
    }

    /**
     * The protocol used for traffic from the Load Balancer to the backend Droplets. The possible values are: `http` and `https`.
     * 
     */
    @Import(name="targetProtocol", required=true)
    private Output<String> targetProtocol;

    /**
     * @return The protocol used for traffic from the Load Balancer to the backend Droplets. The possible values are: `http` and `https`.
     * 
     */
    public Output<String> targetProtocol() {
        return this.targetProtocol;
    }

    private LoadBalancerGlbSettingsArgs() {}

    private LoadBalancerGlbSettingsArgs(LoadBalancerGlbSettingsArgs $) {
        this.cdn = $.cdn;
        this.failoverThreshold = $.failoverThreshold;
        this.regionPriorities = $.regionPriorities;
        this.targetPort = $.targetPort;
        this.targetProtocol = $.targetProtocol;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerGlbSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerGlbSettingsArgs $;

        public Builder() {
            $ = new LoadBalancerGlbSettingsArgs();
        }

        public Builder(LoadBalancerGlbSettingsArgs defaults) {
            $ = new LoadBalancerGlbSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cdn CDN configuration supporting the following:
         * 
         * @return builder
         * 
         */
        public Builder cdn(@Nullable Output<LoadBalancerGlbSettingsCdnArgs> cdn) {
            $.cdn = cdn;
            return this;
        }

        /**
         * @param cdn CDN configuration supporting the following:
         * 
         * @return builder
         * 
         */
        public Builder cdn(LoadBalancerGlbSettingsCdnArgs cdn) {
            return cdn(Output.of(cdn));
        }

        /**
         * @param failoverThreshold fail-over threshold
         * 
         * @return builder
         * 
         */
        public Builder failoverThreshold(@Nullable Output<Integer> failoverThreshold) {
            $.failoverThreshold = failoverThreshold;
            return this;
        }

        /**
         * @param failoverThreshold fail-over threshold
         * 
         * @return builder
         * 
         */
        public Builder failoverThreshold(Integer failoverThreshold) {
            return failoverThreshold(Output.of(failoverThreshold));
        }

        /**
         * @param regionPriorities region priority map
         * 
         * @return builder
         * 
         */
        public Builder regionPriorities(@Nullable Output<Map<String,Integer>> regionPriorities) {
            $.regionPriorities = regionPriorities;
            return this;
        }

        /**
         * @param regionPriorities region priority map
         * 
         * @return builder
         * 
         */
        public Builder regionPriorities(Map<String,Integer> regionPriorities) {
            return regionPriorities(Output.of(regionPriorities));
        }

        /**
         * @param targetPort An integer representing the port on the backend Droplets to which the Load Balancer will send traffic. The possible values are: `80` for `http` and `443` for `https`.
         * 
         * @return builder
         * 
         */
        public Builder targetPort(Output<Integer> targetPort) {
            $.targetPort = targetPort;
            return this;
        }

        /**
         * @param targetPort An integer representing the port on the backend Droplets to which the Load Balancer will send traffic. The possible values are: `80` for `http` and `443` for `https`.
         * 
         * @return builder
         * 
         */
        public Builder targetPort(Integer targetPort) {
            return targetPort(Output.of(targetPort));
        }

        /**
         * @param targetProtocol The protocol used for traffic from the Load Balancer to the backend Droplets. The possible values are: `http` and `https`.
         * 
         * @return builder
         * 
         */
        public Builder targetProtocol(Output<String> targetProtocol) {
            $.targetProtocol = targetProtocol;
            return this;
        }

        /**
         * @param targetProtocol The protocol used for traffic from the Load Balancer to the backend Droplets. The possible values are: `http` and `https`.
         * 
         * @return builder
         * 
         */
        public Builder targetProtocol(String targetProtocol) {
            return targetProtocol(Output.of(targetProtocol));
        }

        public LoadBalancerGlbSettingsArgs build() {
            if ($.targetPort == null) {
                throw new MissingRequiredPropertyException("LoadBalancerGlbSettingsArgs", "targetPort");
            }
            if ($.targetProtocol == null) {
                throw new MissingRequiredPropertyException("LoadBalancerGlbSettingsArgs", "targetProtocol");
            }
            return $;
        }
    }

}
