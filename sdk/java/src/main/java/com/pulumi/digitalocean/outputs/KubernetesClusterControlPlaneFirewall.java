// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class KubernetesClusterControlPlaneFirewall {
    private List<String> allowedAddresses;
    private Boolean enabled;

    private KubernetesClusterControlPlaneFirewall() {}
    public List<String> allowedAddresses() {
        return this.allowedAddresses;
    }
    public Boolean enabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesClusterControlPlaneFirewall defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> allowedAddresses;
        private Boolean enabled;
        public Builder() {}
        public Builder(KubernetesClusterControlPlaneFirewall defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedAddresses = defaults.allowedAddresses;
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder allowedAddresses(List<String> allowedAddresses) {
            if (allowedAddresses == null) {
              throw new MissingRequiredPropertyException("KubernetesClusterControlPlaneFirewall", "allowedAddresses");
            }
            this.allowedAddresses = allowedAddresses;
            return this;
        }
        public Builder allowedAddresses(String... allowedAddresses) {
            return allowedAddresses(List.of(allowedAddresses));
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("KubernetesClusterControlPlaneFirewall", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        public KubernetesClusterControlPlaneFirewall build() {
            final var _resultValue = new KubernetesClusterControlPlaneFirewall();
            _resultValue.allowedAddresses = allowedAddresses;
            _resultValue.enabled = enabled;
            return _resultValue;
        }
    }
}
