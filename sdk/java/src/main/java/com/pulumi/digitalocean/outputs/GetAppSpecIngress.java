// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.digitalocean.outputs.GetAppSpecIngressRule;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAppSpecIngress {
    /**
     * @return The type of the alert to configure. Component app alert policies can be: `CPU_UTILIZATION`, `MEM_UTILIZATION`, or `RESTART_COUNT`.
     * 
     */
    private List<GetAppSpecIngressRule> rules;

    private GetAppSpecIngress() {}
    /**
     * @return The type of the alert to configure. Component app alert policies can be: `CPU_UTILIZATION`, `MEM_UTILIZATION`, or `RESTART_COUNT`.
     * 
     */
    public List<GetAppSpecIngressRule> rules() {
        return this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppSpecIngress defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetAppSpecIngressRule> rules;
        public Builder() {}
        public Builder(GetAppSpecIngress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rules = defaults.rules;
        }

        @CustomType.Setter
        public Builder rules(List<GetAppSpecIngressRule> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(GetAppSpecIngressRule... rules) {
            return rules(List.of(rules));
        }
        public GetAppSpecIngress build() {
            final var _resultValue = new GetAppSpecIngress();
            _resultValue.rules = rules;
            return _resultValue;
        }
    }
}
