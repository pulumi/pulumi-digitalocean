// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetRegionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegionArgs Empty = new GetRegionArgs();

    /**
     * A human-readable string that is used as a unique identifier for each region.
     * 
     */
    @Import(name="slug", required=true)
    private Output<String> slug;

    /**
     * @return A human-readable string that is used as a unique identifier for each region.
     * 
     */
    public Output<String> slug() {
        return this.slug;
    }

    private GetRegionArgs() {}

    private GetRegionArgs(GetRegionArgs $) {
        this.slug = $.slug;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegionArgs $;

        public Builder() {
            $ = new GetRegionArgs();
        }

        public Builder(GetRegionArgs defaults) {
            $ = new GetRegionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param slug A human-readable string that is used as a unique identifier for each region.
         * 
         * @return builder
         * 
         */
        public Builder slug(Output<String> slug) {
            $.slug = slug;
            return this;
        }

        /**
         * @param slug A human-readable string that is used as a unique identifier for each region.
         * 
         * @return builder
         * 
         */
        public Builder slug(String slug) {
            return slug(Output.of(slug));
        }

        public GetRegionArgs build() {
            if ($.slug == null) {
                throw new MissingRequiredPropertyException("GetRegionArgs", "slug");
            }
            return $;
        }
    }

}