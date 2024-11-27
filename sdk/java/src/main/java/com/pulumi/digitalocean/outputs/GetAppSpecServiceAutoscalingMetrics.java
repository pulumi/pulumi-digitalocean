// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.digitalocean.outputs.GetAppSpecServiceAutoscalingMetricsCpu;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAppSpecServiceAutoscalingMetrics {
    /**
     * @return Settings for scaling the component based on CPU utilization.
     * 
     */
    private @Nullable GetAppSpecServiceAutoscalingMetricsCpu cpu;

    private GetAppSpecServiceAutoscalingMetrics() {}
    /**
     * @return Settings for scaling the component based on CPU utilization.
     * 
     */
    public Optional<GetAppSpecServiceAutoscalingMetricsCpu> cpu() {
        return Optional.ofNullable(this.cpu);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppSpecServiceAutoscalingMetrics defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GetAppSpecServiceAutoscalingMetricsCpu cpu;
        public Builder() {}
        public Builder(GetAppSpecServiceAutoscalingMetrics defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
        }

        @CustomType.Setter
        public Builder cpu(@Nullable GetAppSpecServiceAutoscalingMetricsCpu cpu) {

            this.cpu = cpu;
            return this;
        }
        public GetAppSpecServiceAutoscalingMetrics build() {
            final var _resultValue = new GetAppSpecServiceAutoscalingMetrics();
            _resultValue.cpu = cpu;
            return _resultValue;
        }
    }
}