// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRegionsFilter {
    /**
     * @return Set to `true` to require that a field match all of the `values` instead of just one or more of
     * them. This is useful when matching against multi-valued fields such as lists or sets where you want to ensure
     * that all of the `values` are present in the list or set.
     * 
     */
    private @Nullable Boolean all;
    /**
     * @return Filter the regions by this key. This may be one of `slug`,
     * `name`, `available`, `features`, or `sizes`.
     * 
     */
    private String key;
    /**
     * @return One of `exact` (default), `re`, or `substring`. For string-typed fields, specify `re` to
     * match by using the `values` as regular expressions, or specify `substring` to match by treating the `values` as
     * substrings to find within the string field.
     * 
     */
    private @Nullable String matchBy;
    /**
     * @return A list of values to match against the `key` field. Only retrieves regions
     * where the `key` field takes on one or more of the values provided here.
     * 
     */
    private List<String> values;

    private GetRegionsFilter() {}
    /**
     * @return Set to `true` to require that a field match all of the `values` instead of just one or more of
     * them. This is useful when matching against multi-valued fields such as lists or sets where you want to ensure
     * that all of the `values` are present in the list or set.
     * 
     */
    public Optional<Boolean> all() {
        return Optional.ofNullable(this.all);
    }
    /**
     * @return Filter the regions by this key. This may be one of `slug`,
     * `name`, `available`, `features`, or `sizes`.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return One of `exact` (default), `re`, or `substring`. For string-typed fields, specify `re` to
     * match by using the `values` as regular expressions, or specify `substring` to match by treating the `values` as
     * substrings to find within the string field.
     * 
     */
    public Optional<String> matchBy() {
        return Optional.ofNullable(this.matchBy);
    }
    /**
     * @return A list of values to match against the `key` field. Only retrieves regions
     * where the `key` field takes on one or more of the values provided here.
     * 
     */
    public List<String> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionsFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean all;
        private String key;
        private @Nullable String matchBy;
        private List<String> values;
        public Builder() {}
        public Builder(GetRegionsFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.all = defaults.all;
    	      this.key = defaults.key;
    	      this.matchBy = defaults.matchBy;
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder all(@Nullable Boolean all) {

            this.all = all;
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            if (key == null) {
              throw new MissingRequiredPropertyException("GetRegionsFilter", "key");
            }
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder matchBy(@Nullable String matchBy) {

            this.matchBy = matchBy;
            return this;
        }
        @CustomType.Setter
        public Builder values(List<String> values) {
            if (values == null) {
              throw new MissingRequiredPropertyException("GetRegionsFilter", "values");
            }
            this.values = values;
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }
        public GetRegionsFilter build() {
            final var _resultValue = new GetRegionsFilter();
            _resultValue.all = all;
            _resultValue.key = key;
            _resultValue.matchBy = matchBy;
            _resultValue.values = values;
            return _resultValue;
        }
    }
}
