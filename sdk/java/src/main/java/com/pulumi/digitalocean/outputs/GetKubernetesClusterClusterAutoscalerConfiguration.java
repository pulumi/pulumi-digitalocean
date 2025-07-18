// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetKubernetesClusterClusterAutoscalerConfiguration {
    private @Nullable List<String> expanders;
    private @Nullable String scaleDownUnneededTime;
    private @Nullable Double scaleDownUtilizationThreshold;

    private GetKubernetesClusterClusterAutoscalerConfiguration() {}
    public List<String> expanders() {
        return this.expanders == null ? List.of() : this.expanders;
    }
    public Optional<String> scaleDownUnneededTime() {
        return Optional.ofNullable(this.scaleDownUnneededTime);
    }
    public Optional<Double> scaleDownUtilizationThreshold() {
        return Optional.ofNullable(this.scaleDownUtilizationThreshold);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKubernetesClusterClusterAutoscalerConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> expanders;
        private @Nullable String scaleDownUnneededTime;
        private @Nullable Double scaleDownUtilizationThreshold;
        public Builder() {}
        public Builder(GetKubernetesClusterClusterAutoscalerConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expanders = defaults.expanders;
    	      this.scaleDownUnneededTime = defaults.scaleDownUnneededTime;
    	      this.scaleDownUtilizationThreshold = defaults.scaleDownUtilizationThreshold;
        }

        @CustomType.Setter
        public Builder expanders(@Nullable List<String> expanders) {

            this.expanders = expanders;
            return this;
        }
        public Builder expanders(String... expanders) {
            return expanders(List.of(expanders));
        }
        @CustomType.Setter
        public Builder scaleDownUnneededTime(@Nullable String scaleDownUnneededTime) {

            this.scaleDownUnneededTime = scaleDownUnneededTime;
            return this;
        }
        @CustomType.Setter
        public Builder scaleDownUtilizationThreshold(@Nullable Double scaleDownUtilizationThreshold) {

            this.scaleDownUtilizationThreshold = scaleDownUtilizationThreshold;
            return this;
        }
        public GetKubernetesClusterClusterAutoscalerConfiguration build() {
            final var _resultValue = new GetKubernetesClusterClusterAutoscalerConfiguration();
            _resultValue.expanders = expanders;
            _resultValue.scaleDownUnneededTime = scaleDownUnneededTime;
            _resultValue.scaleDownUtilizationThreshold = scaleDownUtilizationThreshold;
            return _resultValue;
        }
    }
}
