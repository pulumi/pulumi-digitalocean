// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDropletAutoscalePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDropletAutoscalePlainArgs Empty = new GetDropletAutoscalePlainArgs();

    /**
     * The ID of Droplet Autoscale pool.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return The ID of Droplet Autoscale pool.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of Droplet Autoscale pool.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name of Droplet Autoscale pool.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    private GetDropletAutoscalePlainArgs() {}

    private GetDropletAutoscalePlainArgs(GetDropletAutoscalePlainArgs $) {
        this.id = $.id;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDropletAutoscalePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDropletAutoscalePlainArgs $;

        public Builder() {
            $ = new GetDropletAutoscalePlainArgs();
        }

        public Builder(GetDropletAutoscalePlainArgs defaults) {
            $ = new GetDropletAutoscalePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of Droplet Autoscale pool.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param name The name of Droplet Autoscale pool.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public GetDropletAutoscalePlainArgs build() {
            return $;
        }
    }

}
