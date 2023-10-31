// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRegionsSort {
    /**
     * @return The sort direction. This may be either `asc` or `desc`.
     * 
     */
    private @Nullable String direction;
    /**
     * @return Sort the regions by this key. This may be one of `slug`,
     * `name`, or `available`.
     * 
     */
    private String key;

    private GetRegionsSort() {}
    /**
     * @return The sort direction. This may be either `asc` or `desc`.
     * 
     */
    public Optional<String> direction() {
        return Optional.ofNullable(this.direction);
    }
    /**
     * @return Sort the regions by this key. This may be one of `slug`,
     * `name`, or `available`.
     * 
     */
    public String key() {
        return this.key;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionsSort defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String direction;
        private String key;
        public Builder() {}
        public Builder(GetRegionsSort defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.direction = defaults.direction;
    	      this.key = defaults.key;
        }

        @CustomType.Setter
        public Builder direction(@Nullable String direction) {
            this.direction = direction;
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public GetRegionsSort build() {
            final var _resultValue = new GetRegionsSort();
            _resultValue.direction = direction;
            _resultValue.key = key;
            return _resultValue;
        }
    }
}
