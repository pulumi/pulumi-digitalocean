// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class KubernetesClusterControlPlaneFirewallArgs extends com.pulumi.resources.ResourceArgs {

    public static final KubernetesClusterControlPlaneFirewallArgs Empty = new KubernetesClusterControlPlaneFirewallArgs();

    @Import(name="allowedAddresses", required=true)
    private Output<List<String>> allowedAddresses;

    public Output<List<String>> allowedAddresses() {
        return this.allowedAddresses;
    }

    /**
     * Boolean flag whether the routing-agent is enabled or not.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Boolean flag whether the routing-agent is enabled or not.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    private KubernetesClusterControlPlaneFirewallArgs() {}

    private KubernetesClusterControlPlaneFirewallArgs(KubernetesClusterControlPlaneFirewallArgs $) {
        this.allowedAddresses = $.allowedAddresses;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KubernetesClusterControlPlaneFirewallArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubernetesClusterControlPlaneFirewallArgs $;

        public Builder() {
            $ = new KubernetesClusterControlPlaneFirewallArgs();
        }

        public Builder(KubernetesClusterControlPlaneFirewallArgs defaults) {
            $ = new KubernetesClusterControlPlaneFirewallArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowedAddresses(Output<List<String>> allowedAddresses) {
            $.allowedAddresses = allowedAddresses;
            return this;
        }

        public Builder allowedAddresses(List<String> allowedAddresses) {
            return allowedAddresses(Output.of(allowedAddresses));
        }

        public Builder allowedAddresses(String... allowedAddresses) {
            return allowedAddresses(List.of(allowedAddresses));
        }

        /**
         * @param enabled Boolean flag whether the routing-agent is enabled or not.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Boolean flag whether the routing-agent is enabled or not.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public KubernetesClusterControlPlaneFirewallArgs build() {
            if ($.allowedAddresses == null) {
                throw new MissingRequiredPropertyException("KubernetesClusterControlPlaneFirewallArgs", "allowedAddresses");
            }
            if ($.enabled == null) {
                throw new MissingRequiredPropertyException("KubernetesClusterControlPlaneFirewallArgs", "enabled");
            }
            return $;
        }
    }

}
