// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLoadBalancerFirewall {
    private List<String> allows;
    private List<String> denies;

    private GetLoadBalancerFirewall() {}
    public List<String> allows() {
        return this.allows;
    }
    public List<String> denies() {
        return this.denies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancerFirewall defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> allows;
        private List<String> denies;
        public Builder() {}
        public Builder(GetLoadBalancerFirewall defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allows = defaults.allows;
    	      this.denies = defaults.denies;
        }

        @CustomType.Setter
        public Builder allows(List<String> allows) {
            this.allows = Objects.requireNonNull(allows);
            return this;
        }
        public Builder allows(String... allows) {
            return allows(List.of(allows));
        }
        @CustomType.Setter
        public Builder denies(List<String> denies) {
            this.denies = Objects.requireNonNull(denies);
            return this;
        }
        public Builder denies(String... denies) {
            return denies(List.of(denies));
        }
        public GetLoadBalancerFirewall build() {
            final var _resultValue = new GetLoadBalancerFirewall();
            _resultValue.allows = allows;
            _resultValue.denies = denies;
            return _resultValue;
        }
    }
}
