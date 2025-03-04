// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.digitalocean.outputs.GetAppSpecWorkerAutoscalingMetrics;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetAppSpecWorkerAutoscaling {
    /**
     * @return The maximum amount of instances for this component. Must be more than min_instance_count.
     * 
     */
    private Integer maxInstanceCount;
    /**
     * @return The metrics that the component is scaled on.
     * 
     */
    private GetAppSpecWorkerAutoscalingMetrics metrics;
    /**
     * @return The minimum amount of instances for this component. Must be less than max_instance_count.
     * 
     */
    private Integer minInstanceCount;

    private GetAppSpecWorkerAutoscaling() {}
    /**
     * @return The maximum amount of instances for this component. Must be more than min_instance_count.
     * 
     */
    public Integer maxInstanceCount() {
        return this.maxInstanceCount;
    }
    /**
     * @return The metrics that the component is scaled on.
     * 
     */
    public GetAppSpecWorkerAutoscalingMetrics metrics() {
        return this.metrics;
    }
    /**
     * @return The minimum amount of instances for this component. Must be less than max_instance_count.
     * 
     */
    public Integer minInstanceCount() {
        return this.minInstanceCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppSpecWorkerAutoscaling defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer maxInstanceCount;
        private GetAppSpecWorkerAutoscalingMetrics metrics;
        private Integer minInstanceCount;
        public Builder() {}
        public Builder(GetAppSpecWorkerAutoscaling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxInstanceCount = defaults.maxInstanceCount;
    	      this.metrics = defaults.metrics;
    	      this.minInstanceCount = defaults.minInstanceCount;
        }

        @CustomType.Setter
        public Builder maxInstanceCount(Integer maxInstanceCount) {
            if (maxInstanceCount == null) {
              throw new MissingRequiredPropertyException("GetAppSpecWorkerAutoscaling", "maxInstanceCount");
            }
            this.maxInstanceCount = maxInstanceCount;
            return this;
        }
        @CustomType.Setter
        public Builder metrics(GetAppSpecWorkerAutoscalingMetrics metrics) {
            if (metrics == null) {
              throw new MissingRequiredPropertyException("GetAppSpecWorkerAutoscaling", "metrics");
            }
            this.metrics = metrics;
            return this;
        }
        @CustomType.Setter
        public Builder minInstanceCount(Integer minInstanceCount) {
            if (minInstanceCount == null) {
              throw new MissingRequiredPropertyException("GetAppSpecWorkerAutoscaling", "minInstanceCount");
            }
            this.minInstanceCount = minInstanceCount;
            return this;
        }
        public GetAppSpecWorkerAutoscaling build() {
            final var _resultValue = new GetAppSpecWorkerAutoscaling();
            _resultValue.maxInstanceCount = maxInstanceCount;
            _resultValue.metrics = metrics;
            _resultValue.minInstanceCount = minInstanceCount;
            return _resultValue;
        }
    }
}
