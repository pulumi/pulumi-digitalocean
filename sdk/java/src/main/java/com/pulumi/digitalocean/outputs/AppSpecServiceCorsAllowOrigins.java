// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppSpecServiceCorsAllowOrigins {
    /**
     * @return Exact string match.
     * 
     */
    private @Nullable String exact;
    /**
     * @return Prefix-based match.
     * 
     */
    private @Nullable String prefix;
    /**
     * @return RE2 style regex-based match.
     * 
     */
    private @Nullable String regex;

    private AppSpecServiceCorsAllowOrigins() {}
    /**
     * @return Exact string match.
     * 
     */
    public Optional<String> exact() {
        return Optional.ofNullable(this.exact);
    }
    /**
     * @return Prefix-based match.
     * 
     */
    public Optional<String> prefix() {
        return Optional.ofNullable(this.prefix);
    }
    /**
     * @return RE2 style regex-based match.
     * 
     */
    public Optional<String> regex() {
        return Optional.ofNullable(this.regex);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppSpecServiceCorsAllowOrigins defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String exact;
        private @Nullable String prefix;
        private @Nullable String regex;
        public Builder() {}
        public Builder(AppSpecServiceCorsAllowOrigins defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exact = defaults.exact;
    	      this.prefix = defaults.prefix;
    	      this.regex = defaults.regex;
        }

        @CustomType.Setter
        public Builder exact(@Nullable String exact) {

            this.exact = exact;
            return this;
        }
        @CustomType.Setter
        public Builder prefix(@Nullable String prefix) {

            this.prefix = prefix;
            return this;
        }
        @CustomType.Setter
        public Builder regex(@Nullable String regex) {

            this.regex = regex;
            return this;
        }
        public AppSpecServiceCorsAllowOrigins build() {
            final var _resultValue = new AppSpecServiceCorsAllowOrigins();
            _resultValue.exact = exact;
            _resultValue.prefix = prefix;
            _resultValue.regex = regex;
            return _resultValue;
        }
    }
}
