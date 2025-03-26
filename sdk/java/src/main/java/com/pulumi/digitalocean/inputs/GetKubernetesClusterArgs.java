// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.digitalocean.inputs.GetKubernetesClusterClusterAutoscalerConfigurationArgs;
import com.pulumi.digitalocean.inputs.GetKubernetesClusterRoutingAgentArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetKubernetesClusterArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetKubernetesClusterArgs Empty = new GetKubernetesClusterArgs();

    @Import(name="clusterAutoscalerConfigurations")
    private @Nullable Output<List<GetKubernetesClusterClusterAutoscalerConfigurationArgs>> clusterAutoscalerConfigurations;

    public Optional<Output<List<GetKubernetesClusterClusterAutoscalerConfigurationArgs>>> clusterAutoscalerConfigurations() {
        return Optional.ofNullable(this.clusterAutoscalerConfigurations);
    }

    @Import(name="kubeconfigExpireSeconds")
    private @Nullable Output<Integer> kubeconfigExpireSeconds;

    public Optional<Output<Integer>> kubeconfigExpireSeconds() {
        return Optional.ofNullable(this.kubeconfigExpireSeconds);
    }

    /**
     * The name of Kubernetes cluster.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of Kubernetes cluster.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    @Import(name="routingAgent")
    private @Nullable Output<GetKubernetesClusterRoutingAgentArgs> routingAgent;

    public Optional<Output<GetKubernetesClusterRoutingAgentArgs>> routingAgent() {
        return Optional.ofNullable(this.routingAgent);
    }

    /**
     * A list of tag names applied to the node pool.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return A list of tag names applied to the node pool.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetKubernetesClusterArgs() {}

    private GetKubernetesClusterArgs(GetKubernetesClusterArgs $) {
        this.clusterAutoscalerConfigurations = $.clusterAutoscalerConfigurations;
        this.kubeconfigExpireSeconds = $.kubeconfigExpireSeconds;
        this.name = $.name;
        this.routingAgent = $.routingAgent;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetKubernetesClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetKubernetesClusterArgs $;

        public Builder() {
            $ = new GetKubernetesClusterArgs();
        }

        public Builder(GetKubernetesClusterArgs defaults) {
            $ = new GetKubernetesClusterArgs(Objects.requireNonNull(defaults));
        }

        public Builder clusterAutoscalerConfigurations(@Nullable Output<List<GetKubernetesClusterClusterAutoscalerConfigurationArgs>> clusterAutoscalerConfigurations) {
            $.clusterAutoscalerConfigurations = clusterAutoscalerConfigurations;
            return this;
        }

        public Builder clusterAutoscalerConfigurations(List<GetKubernetesClusterClusterAutoscalerConfigurationArgs> clusterAutoscalerConfigurations) {
            return clusterAutoscalerConfigurations(Output.of(clusterAutoscalerConfigurations));
        }

        public Builder clusterAutoscalerConfigurations(GetKubernetesClusterClusterAutoscalerConfigurationArgs... clusterAutoscalerConfigurations) {
            return clusterAutoscalerConfigurations(List.of(clusterAutoscalerConfigurations));
        }

        public Builder kubeconfigExpireSeconds(@Nullable Output<Integer> kubeconfigExpireSeconds) {
            $.kubeconfigExpireSeconds = kubeconfigExpireSeconds;
            return this;
        }

        public Builder kubeconfigExpireSeconds(Integer kubeconfigExpireSeconds) {
            return kubeconfigExpireSeconds(Output.of(kubeconfigExpireSeconds));
        }

        /**
         * @param name The name of Kubernetes cluster.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of Kubernetes cluster.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder routingAgent(@Nullable Output<GetKubernetesClusterRoutingAgentArgs> routingAgent) {
            $.routingAgent = routingAgent;
            return this;
        }

        public Builder routingAgent(GetKubernetesClusterRoutingAgentArgs routingAgent) {
            return routingAgent(Output.of(routingAgent));
        }

        /**
         * @param tags A list of tag names applied to the node pool.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A list of tag names applied to the node pool.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A list of tag names applied to the node pool.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public GetKubernetesClusterArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetKubernetesClusterArgs", "name");
            }
            return $;
        }
    }

}
