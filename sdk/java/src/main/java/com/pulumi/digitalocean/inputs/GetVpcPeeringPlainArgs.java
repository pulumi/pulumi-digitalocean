// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVpcPeeringPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVpcPeeringPlainArgs Empty = new GetVpcPeeringPlainArgs();

    /**
     * The unique identifier of an existing VPC Peering.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return The unique identifier of an existing VPC Peering.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of an existing VPC Peering.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name of an existing VPC Peering.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The list of VPC IDs involved in the peering.
     * 
     */
    @Import(name="vpcIds")
    private @Nullable List<String> vpcIds;

    /**
     * @return The list of VPC IDs involved in the peering.
     * 
     */
    public Optional<List<String>> vpcIds() {
        return Optional.ofNullable(this.vpcIds);
    }

    private GetVpcPeeringPlainArgs() {}

    private GetVpcPeeringPlainArgs(GetVpcPeeringPlainArgs $) {
        this.id = $.id;
        this.name = $.name;
        this.vpcIds = $.vpcIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVpcPeeringPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVpcPeeringPlainArgs $;

        public Builder() {
            $ = new GetVpcPeeringPlainArgs();
        }

        public Builder(GetVpcPeeringPlainArgs defaults) {
            $ = new GetVpcPeeringPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The unique identifier of an existing VPC Peering.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param name The name of an existing VPC Peering.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param vpcIds The list of VPC IDs involved in the peering.
         * 
         * @return builder
         * 
         */
        public Builder vpcIds(@Nullable List<String> vpcIds) {
            $.vpcIds = vpcIds;
            return this;
        }

        /**
         * @param vpcIds The list of VPC IDs involved in the peering.
         * 
         * @return builder
         * 
         */
        public Builder vpcIds(String... vpcIds) {
            return vpcIds(List.of(vpcIds));
        }

        public GetVpcPeeringPlainArgs build() {
            return $;
        }
    }

}
