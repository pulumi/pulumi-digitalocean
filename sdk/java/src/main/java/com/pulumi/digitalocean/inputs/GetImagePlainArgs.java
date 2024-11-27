// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetImagePlainArgs Empty = new GetImagePlainArgs();

    /**
     * The id of the image
     * 
     */
    @Import(name="id")
    private @Nullable Integer id;

    /**
     * @return The id of the image
     * 
     */
    public Optional<Integer> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the image.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name of the image.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The slug of the official image.
     * 
     * If `name` is specified, you may also specify:
     * 
     */
    @Import(name="slug")
    private @Nullable String slug;

    /**
     * @return The slug of the official image.
     * 
     * If `name` is specified, you may also specify:
     * 
     */
    public Optional<String> slug() {
        return Optional.ofNullable(this.slug);
    }

    /**
     * Restrict the search to one of the following categories of images:
     * 
     */
    @Import(name="source")
    private @Nullable String source;

    /**
     * @return Restrict the search to one of the following categories of images:
     * 
     */
    public Optional<String> source() {
        return Optional.ofNullable(this.source);
    }

    private GetImagePlainArgs() {}

    private GetImagePlainArgs(GetImagePlainArgs $) {
        this.id = $.id;
        this.name = $.name;
        this.slug = $.slug;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagePlainArgs $;

        public Builder() {
            $ = new GetImagePlainArgs();
        }

        public Builder(GetImagePlainArgs defaults) {
            $ = new GetImagePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The id of the image
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Integer id) {
            $.id = id;
            return this;
        }

        /**
         * @param name The name of the image.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param slug The slug of the official image.
         * 
         * If `name` is specified, you may also specify:
         * 
         * @return builder
         * 
         */
        public Builder slug(@Nullable String slug) {
            $.slug = slug;
            return this;
        }

        /**
         * @param source Restrict the search to one of the following categories of images:
         * 
         * @return builder
         * 
         */
        public Builder source(@Nullable String source) {
            $.source = source;
            return this;
        }

        public GetImagePlainArgs build() {
            return $;
        }
    }

}