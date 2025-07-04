// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVpcNatGatewayPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVpcNatGatewayPlainArgs Empty = new GetVpcNatGatewayPlainArgs();

    /**
     * The ID of VPC NAT Gateway.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return The ID of VPC NAT Gateway.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of VPC NAT Gateway.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name of VPC NAT Gateway.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    private GetVpcNatGatewayPlainArgs() {}

    private GetVpcNatGatewayPlainArgs(GetVpcNatGatewayPlainArgs $) {
        this.id = $.id;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVpcNatGatewayPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVpcNatGatewayPlainArgs $;

        public Builder() {
            $ = new GetVpcNatGatewayPlainArgs();
        }

        public Builder(GetVpcNatGatewayPlainArgs defaults) {
            $ = new GetVpcNatGatewayPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of VPC NAT Gateway.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param name The name of VPC NAT Gateway.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public GetVpcNatGatewayPlainArgs build() {
            return $;
        }
    }

}
