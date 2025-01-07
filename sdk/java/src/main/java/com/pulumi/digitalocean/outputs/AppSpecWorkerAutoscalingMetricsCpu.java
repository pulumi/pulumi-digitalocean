// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class AppSpecWorkerAutoscalingMetricsCpu {
    /**
     * @return The average target CPU utilization for the component.
     * 
     */
    private Integer percent;

    private AppSpecWorkerAutoscalingMetricsCpu() {}
    /**
     * @return The average target CPU utilization for the component.
     * 
     */
    public Integer percent() {
        return this.percent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppSpecWorkerAutoscalingMetricsCpu defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer percent;
        public Builder() {}
        public Builder(AppSpecWorkerAutoscalingMetricsCpu defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.percent = defaults.percent;
        }

        @CustomType.Setter
        public Builder percent(Integer percent) {
            if (percent == null) {
              throw new MissingRequiredPropertyException("AppSpecWorkerAutoscalingMetricsCpu", "percent");
            }
            this.percent = percent;
            return this;
        }
        public AppSpecWorkerAutoscalingMetricsCpu build() {
            final var _resultValue = new AppSpecWorkerAutoscalingMetricsCpu();
            _resultValue.percent = percent;
            return _resultValue;
        }
    }
}
