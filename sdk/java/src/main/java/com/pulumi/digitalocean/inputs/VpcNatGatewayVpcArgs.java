// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VpcNatGatewayVpcArgs extends com.pulumi.resources.ResourceArgs {

    public static final VpcNatGatewayVpcArgs Empty = new VpcNatGatewayVpcArgs();

    /**
     * Boolean flag indicating if this should be the default gateway in this VPC
     * 
     */
    @Import(name="defaultGateway")
    private @Nullable Output<Boolean> defaultGateway;

    /**
     * @return Boolean flag indicating if this should be the default gateway in this VPC
     * 
     */
    public Optional<Output<Boolean>> defaultGateway() {
        return Optional.ofNullable(this.defaultGateway);
    }

    /**
     * The private IP of the VPC NAT Gateway
     * 
     */
    @Import(name="gatewayIp")
    private @Nullable Output<String> gatewayIp;

    /**
     * @return The private IP of the VPC NAT Gateway
     * 
     */
    public Optional<Output<String>> gatewayIp() {
        return Optional.ofNullable(this.gatewayIp);
    }

    /**
     * The ID of the ingress VPC
     * 
     */
    @Import(name="vpcUuid", required=true)
    private Output<String> vpcUuid;

    /**
     * @return The ID of the ingress VPC
     * 
     */
    public Output<String> vpcUuid() {
        return this.vpcUuid;
    }

    private VpcNatGatewayVpcArgs() {}

    private VpcNatGatewayVpcArgs(VpcNatGatewayVpcArgs $) {
        this.defaultGateway = $.defaultGateway;
        this.gatewayIp = $.gatewayIp;
        this.vpcUuid = $.vpcUuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpcNatGatewayVpcArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpcNatGatewayVpcArgs $;

        public Builder() {
            $ = new VpcNatGatewayVpcArgs();
        }

        public Builder(VpcNatGatewayVpcArgs defaults) {
            $ = new VpcNatGatewayVpcArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultGateway Boolean flag indicating if this should be the default gateway in this VPC
         * 
         * @return builder
         * 
         */
        public Builder defaultGateway(@Nullable Output<Boolean> defaultGateway) {
            $.defaultGateway = defaultGateway;
            return this;
        }

        /**
         * @param defaultGateway Boolean flag indicating if this should be the default gateway in this VPC
         * 
         * @return builder
         * 
         */
        public Builder defaultGateway(Boolean defaultGateway) {
            return defaultGateway(Output.of(defaultGateway));
        }

        /**
         * @param gatewayIp The private IP of the VPC NAT Gateway
         * 
         * @return builder
         * 
         */
        public Builder gatewayIp(@Nullable Output<String> gatewayIp) {
            $.gatewayIp = gatewayIp;
            return this;
        }

        /**
         * @param gatewayIp The private IP of the VPC NAT Gateway
         * 
         * @return builder
         * 
         */
        public Builder gatewayIp(String gatewayIp) {
            return gatewayIp(Output.of(gatewayIp));
        }

        /**
         * @param vpcUuid The ID of the ingress VPC
         * 
         * @return builder
         * 
         */
        public Builder vpcUuid(Output<String> vpcUuid) {
            $.vpcUuid = vpcUuid;
            return this;
        }

        /**
         * @param vpcUuid The ID of the ingress VPC
         * 
         * @return builder
         * 
         */
        public Builder vpcUuid(String vpcUuid) {
            return vpcUuid(Output.of(vpcUuid));
        }

        public VpcNatGatewayVpcArgs build() {
            if ($.vpcUuid == null) {
                throw new MissingRequiredPropertyException("VpcNatGatewayVpcArgs", "vpcUuid");
            }
            return $;
        }
    }

}
