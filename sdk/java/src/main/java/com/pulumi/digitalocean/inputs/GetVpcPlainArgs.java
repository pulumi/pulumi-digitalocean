// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVpcPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVpcPlainArgs Empty = new GetVpcPlainArgs();

    /**
     * The unique identifier of an existing VPC.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return The unique identifier of an existing VPC.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of an existing VPC.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name of an existing VPC.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The DigitalOcean region slug for the VPC&#39;s location.
     * 
     */
    @Import(name="region")
    private @Nullable String region;

    /**
     * @return The DigitalOcean region slug for the VPC&#39;s location.
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }

    private GetVpcPlainArgs() {}

    private GetVpcPlainArgs(GetVpcPlainArgs $) {
        this.id = $.id;
        this.name = $.name;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVpcPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVpcPlainArgs $;

        public Builder() {
            $ = new GetVpcPlainArgs();
        }

        public Builder(GetVpcPlainArgs defaults) {
            $ = new GetVpcPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The unique identifier of an existing VPC.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param name The name of an existing VPC.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param region The DigitalOcean region slug for the VPC&#39;s location.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable String region) {
            $.region = region;
            return this;
        }

        public GetVpcPlainArgs build() {
            return $;
        }
    }

}
