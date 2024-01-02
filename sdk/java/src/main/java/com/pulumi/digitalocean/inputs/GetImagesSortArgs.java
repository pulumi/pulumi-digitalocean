// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagesSortArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetImagesSortArgs Empty = new GetImagesSortArgs();

    /**
     * The sort direction. This may be either `asc` or `desc`.
     * 
     */
    @Import(name="direction")
    private @Nullable Output<String> direction;

    /**
     * @return The sort direction. This may be either `asc` or `desc`.
     * 
     */
    public Optional<Output<String>> direction() {
        return Optional.ofNullable(this.direction);
    }

    /**
     * Sort the images by this key. This may be one of `distribution`, `error_message`, `id`,
     * `image`, `min_disk_size`, `name`, `private`, `size_gigabytes`, `slug`, `status`, or `type`.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return Sort the images by this key. This may be one of `distribution`, `error_message`, `id`,
     * `image`, `min_disk_size`, `name`, `private`, `size_gigabytes`, `slug`, `status`, or `type`.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    private GetImagesSortArgs() {}

    private GetImagesSortArgs(GetImagesSortArgs $) {
        this.direction = $.direction;
        this.key = $.key;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagesSortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagesSortArgs $;

        public Builder() {
            $ = new GetImagesSortArgs();
        }

        public Builder(GetImagesSortArgs defaults) {
            $ = new GetImagesSortArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param direction The sort direction. This may be either `asc` or `desc`.
         * 
         * @return builder
         * 
         */
        public Builder direction(@Nullable Output<String> direction) {
            $.direction = direction;
            return this;
        }

        /**
         * @param direction The sort direction. This may be either `asc` or `desc`.
         * 
         * @return builder
         * 
         */
        public Builder direction(String direction) {
            return direction(Output.of(direction));
        }

        /**
         * @param key Sort the images by this key. This may be one of `distribution`, `error_message`, `id`,
         * `image`, `min_disk_size`, `name`, `private`, `size_gigabytes`, `slug`, `status`, or `type`.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Sort the images by this key. This may be one of `distribution`, `error_message`, `id`,
         * `image`, `min_disk_size`, `name`, `private`, `size_gigabytes`, `slug`, `status`, or `type`.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        public GetImagesSortArgs build() {
            if ($.key == null) {
                throw new MissingRequiredPropertyException("GetImagesSortArgs", "key");
            }
            return $;
        }
    }

}
