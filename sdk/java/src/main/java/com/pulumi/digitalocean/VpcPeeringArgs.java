// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VpcPeeringArgs extends com.pulumi.resources.ResourceArgs {

    public static final VpcPeeringArgs Empty = new VpcPeeringArgs();

    /**
     * A name for the VPC Peering. Must be unique and contain alphanumeric characters, dashes, and periods only.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A name for the VPC Peering. Must be unique and contain alphanumeric characters, dashes, and periods only.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A set of two VPC IDs to be peered.
     * 
     */
    @Import(name="vpcIds", required=true)
    private Output<List<String>> vpcIds;

    /**
     * @return A set of two VPC IDs to be peered.
     * 
     */
    public Output<List<String>> vpcIds() {
        return this.vpcIds;
    }

    private VpcPeeringArgs() {}

    private VpcPeeringArgs(VpcPeeringArgs $) {
        this.name = $.name;
        this.vpcIds = $.vpcIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpcPeeringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpcPeeringArgs $;

        public Builder() {
            $ = new VpcPeeringArgs();
        }

        public Builder(VpcPeeringArgs defaults) {
            $ = new VpcPeeringArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name A name for the VPC Peering. Must be unique and contain alphanumeric characters, dashes, and periods only.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A name for the VPC Peering. Must be unique and contain alphanumeric characters, dashes, and periods only.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param vpcIds A set of two VPC IDs to be peered.
         * 
         * @return builder
         * 
         */
        public Builder vpcIds(Output<List<String>> vpcIds) {
            $.vpcIds = vpcIds;
            return this;
        }

        /**
         * @param vpcIds A set of two VPC IDs to be peered.
         * 
         * @return builder
         * 
         */
        public Builder vpcIds(List<String> vpcIds) {
            return vpcIds(Output.of(vpcIds));
        }

        /**
         * @param vpcIds A set of two VPC IDs to be peered.
         * 
         * @return builder
         * 
         */
        public Builder vpcIds(String... vpcIds) {
            return vpcIds(List.of(vpcIds));
        }

        public VpcPeeringArgs build() {
            if ($.vpcIds == null) {
                throw new MissingRequiredPropertyException("VpcPeeringArgs", "vpcIds");
            }
            return $;
        }
    }

}
