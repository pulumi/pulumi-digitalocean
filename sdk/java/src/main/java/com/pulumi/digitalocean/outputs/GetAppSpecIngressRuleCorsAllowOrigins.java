// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAppSpecIngressRuleCorsAllowOrigins {
    /**
     * @return The `Access-Control-Allow-Origin` header will be set to the client&#39;s origin only if the client&#39;s origin exactly matches the value you provide.
     * 
     */
    private @Nullable String exact;
    /**
     * @return The `Access-Control-Allow-Origin` header will be set to the client&#39;s origin if the beginning of the client&#39;s origin matches the value you provide.
     * 
     * @deprecated
     * Prefix-based matching has been deprecated in favor of regex-based matching.
     * 
     */
    @Deprecated /* Prefix-based matching has been deprecated in favor of regex-based matching. */
    private @Nullable String prefix;
    /**
     * @return The `Access-Control-Allow-Origin` header will be set to the client&#39;s origin if the client’s origin matches the regex you provide, in [RE2 style syntax](https://github.com/google/re2/wiki/Syntax).
     * 
     */
    private @Nullable String regex;

    private GetAppSpecIngressRuleCorsAllowOrigins() {}
    /**
     * @return The `Access-Control-Allow-Origin` header will be set to the client&#39;s origin only if the client&#39;s origin exactly matches the value you provide.
     * 
     */
    public Optional<String> exact() {
        return Optional.ofNullable(this.exact);
    }
    /**
     * @return The `Access-Control-Allow-Origin` header will be set to the client&#39;s origin if the beginning of the client&#39;s origin matches the value you provide.
     * 
     * @deprecated
     * Prefix-based matching has been deprecated in favor of regex-based matching.
     * 
     */
    @Deprecated /* Prefix-based matching has been deprecated in favor of regex-based matching. */
    public Optional<String> prefix() {
        return Optional.ofNullable(this.prefix);
    }
    /**
     * @return The `Access-Control-Allow-Origin` header will be set to the client&#39;s origin if the client’s origin matches the regex you provide, in [RE2 style syntax](https://github.com/google/re2/wiki/Syntax).
     * 
     */
    public Optional<String> regex() {
        return Optional.ofNullable(this.regex);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppSpecIngressRuleCorsAllowOrigins defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String exact;
        private @Nullable String prefix;
        private @Nullable String regex;
        public Builder() {}
        public Builder(GetAppSpecIngressRuleCorsAllowOrigins defaults) {
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
        public GetAppSpecIngressRuleCorsAllowOrigins build() {
            final var _resultValue = new GetAppSpecIngressRuleCorsAllowOrigins();
            _resultValue.exact = exact;
            _resultValue.prefix = prefix;
            _resultValue.regex = regex;
            return _resultValue;
        }
    }
}
