// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetKubernetesClusterClusterAutoscalerConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final GetKubernetesClusterClusterAutoscalerConfiguration Empty = new GetKubernetesClusterClusterAutoscalerConfiguration();

    @Import(name="scaleDownUnneededTime")
    private @Nullable String scaleDownUnneededTime;

    public Optional<String> scaleDownUnneededTime() {
        return Optional.ofNullable(this.scaleDownUnneededTime);
    }

    @Import(name="scaleDownUtilizationThreshold")
    private @Nullable Double scaleDownUtilizationThreshold;

    public Optional<Double> scaleDownUtilizationThreshold() {
        return Optional.ofNullable(this.scaleDownUtilizationThreshold);
    }

    private GetKubernetesClusterClusterAutoscalerConfiguration() {}

    private GetKubernetesClusterClusterAutoscalerConfiguration(GetKubernetesClusterClusterAutoscalerConfiguration $) {
        this.scaleDownUnneededTime = $.scaleDownUnneededTime;
        this.scaleDownUtilizationThreshold = $.scaleDownUtilizationThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetKubernetesClusterClusterAutoscalerConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetKubernetesClusterClusterAutoscalerConfiguration $;

        public Builder() {
            $ = new GetKubernetesClusterClusterAutoscalerConfiguration();
        }

        public Builder(GetKubernetesClusterClusterAutoscalerConfiguration defaults) {
            $ = new GetKubernetesClusterClusterAutoscalerConfiguration(Objects.requireNonNull(defaults));
        }

        public Builder scaleDownUnneededTime(@Nullable String scaleDownUnneededTime) {
            $.scaleDownUnneededTime = scaleDownUnneededTime;
            return this;
        }

        public Builder scaleDownUtilizationThreshold(@Nullable Double scaleDownUtilizationThreshold) {
            $.scaleDownUtilizationThreshold = scaleDownUtilizationThreshold;
            return this;
        }

        public GetKubernetesClusterClusterAutoscalerConfiguration build() {
            return $;
        }
    }

}
