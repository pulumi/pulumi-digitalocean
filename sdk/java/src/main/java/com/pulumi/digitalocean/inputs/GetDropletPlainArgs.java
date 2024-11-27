// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDropletPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDropletPlainArgs Empty = new GetDropletPlainArgs();

    /**
     * A boolean value specifying whether or not to search GPU Droplets
     * 
     */
    @Import(name="gpu")
    private @Nullable Boolean gpu;

    /**
     * @return A boolean value specifying whether or not to search GPU Droplets
     * 
     */
    public Optional<Boolean> gpu() {
        return Optional.ofNullable(this.gpu);
    }

    /**
     * The ID of the Droplet
     * 
     */
    @Import(name="id")
    private @Nullable Integer id;

    /**
     * @return The ID of the Droplet
     * 
     */
    public Optional<Integer> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the Droplet.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name of the Droplet.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A tag applied to the Droplet.
     * 
     * To include GPU Droplets when searching by name, use:
     * 
     */
    @Import(name="tag")
    private @Nullable String tag;

    /**
     * @return A tag applied to the Droplet.
     * 
     * To include GPU Droplets when searching by name, use:
     * 
     */
    public Optional<String> tag() {
        return Optional.ofNullable(this.tag);
    }

    private GetDropletPlainArgs() {}

    private GetDropletPlainArgs(GetDropletPlainArgs $) {
        this.gpu = $.gpu;
        this.id = $.id;
        this.name = $.name;
        this.tag = $.tag;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDropletPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDropletPlainArgs $;

        public Builder() {
            $ = new GetDropletPlainArgs();
        }

        public Builder(GetDropletPlainArgs defaults) {
            $ = new GetDropletPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param gpu A boolean value specifying whether or not to search GPU Droplets
         * 
         * @return builder
         * 
         */
        public Builder gpu(@Nullable Boolean gpu) {
            $.gpu = gpu;
            return this;
        }

        /**
         * @param id The ID of the Droplet
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Integer id) {
            $.id = id;
            return this;
        }

        /**
         * @param name The name of the Droplet.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param tag A tag applied to the Droplet.
         * 
         * To include GPU Droplets when searching by name, use:
         * 
         * @return builder
         * 
         */
        public Builder tag(@Nullable String tag) {
            $.tag = tag;
            return this;
        }

        public GetDropletPlainArgs build() {
            return $;
        }
    }

}