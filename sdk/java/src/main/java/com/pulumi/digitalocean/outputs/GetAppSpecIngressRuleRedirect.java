// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAppSpecIngressRuleRedirect {
    private @Nullable String authority;
    private @Nullable Integer port;
    private @Nullable Integer redirectCode;
    private @Nullable String scheme;
    private @Nullable String uri;

    private GetAppSpecIngressRuleRedirect() {}
    public Optional<String> authority() {
        return Optional.ofNullable(this.authority);
    }
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }
    public Optional<Integer> redirectCode() {
        return Optional.ofNullable(this.redirectCode);
    }
    public Optional<String> scheme() {
        return Optional.ofNullable(this.scheme);
    }
    public Optional<String> uri() {
        return Optional.ofNullable(this.uri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppSpecIngressRuleRedirect defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String authority;
        private @Nullable Integer port;
        private @Nullable Integer redirectCode;
        private @Nullable String scheme;
        private @Nullable String uri;
        public Builder() {}
        public Builder(GetAppSpecIngressRuleRedirect defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authority = defaults.authority;
    	      this.port = defaults.port;
    	      this.redirectCode = defaults.redirectCode;
    	      this.scheme = defaults.scheme;
    	      this.uri = defaults.uri;
        }

        @CustomType.Setter
        public Builder authority(@Nullable String authority) {
            this.authority = authority;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder redirectCode(@Nullable Integer redirectCode) {
            this.redirectCode = redirectCode;
            return this;
        }
        @CustomType.Setter
        public Builder scheme(@Nullable String scheme) {
            this.scheme = scheme;
            return this;
        }
        @CustomType.Setter
        public Builder uri(@Nullable String uri) {
            this.uri = uri;
            return this;
        }
        public GetAppSpecIngressRuleRedirect build() {
            final var o = new GetAppSpecIngressRuleRedirect();
            o.authority = authority;
            o.port = port;
            o.redirectCode = redirectCode;
            o.scheme = scheme;
            o.uri = uri;
            return o;
        }
    }
}
