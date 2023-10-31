// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.digitalocean.outputs.AppSpecStaticSiteCorsAllowOrigins;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppSpecStaticSiteCors {
    /**
     * @return Whether browsers should expose the response to the client-side JavaScript code when the request&#39;s credentials mode is `include`. This configures the `Access-Control-Allow-Credentials` header.
     * 
     * A spec can contain multiple components.
     * 
     * A `service` can contain:
     * 
     */
    private @Nullable Boolean allowCredentials;
    /**
     * @return The set of allowed HTTP request headers. This configures the `Access-Control-Allow-Headers` header.
     * 
     */
    private @Nullable List<String> allowHeaders;
    /**
     * @return The set of allowed HTTP methods. This configures the `Access-Control-Allow-Methods` header.
     * 
     */
    private @Nullable List<String> allowMethods;
    /**
     * @return The `Access-Control-Allow-Origin` can be
     * 
     */
    private @Nullable AppSpecStaticSiteCorsAllowOrigins allowOrigins;
    /**
     * @return The set of HTTP response headers that browsers are allowed to access. This configures the `Access-Control-Expose-Headers` header.
     * 
     */
    private @Nullable List<String> exposeHeaders;
    /**
     * @return An optional duration specifying how long browsers can cache the results of a preflight request. This configures the Access-Control-Max-Age header. Example: `5h30m`.
     * 
     */
    private @Nullable String maxAge;

    private AppSpecStaticSiteCors() {}
    /**
     * @return Whether browsers should expose the response to the client-side JavaScript code when the request&#39;s credentials mode is `include`. This configures the `Access-Control-Allow-Credentials` header.
     * 
     * A spec can contain multiple components.
     * 
     * A `service` can contain:
     * 
     */
    public Optional<Boolean> allowCredentials() {
        return Optional.ofNullable(this.allowCredentials);
    }
    /**
     * @return The set of allowed HTTP request headers. This configures the `Access-Control-Allow-Headers` header.
     * 
     */
    public List<String> allowHeaders() {
        return this.allowHeaders == null ? List.of() : this.allowHeaders;
    }
    /**
     * @return The set of allowed HTTP methods. This configures the `Access-Control-Allow-Methods` header.
     * 
     */
    public List<String> allowMethods() {
        return this.allowMethods == null ? List.of() : this.allowMethods;
    }
    /**
     * @return The `Access-Control-Allow-Origin` can be
     * 
     */
    public Optional<AppSpecStaticSiteCorsAllowOrigins> allowOrigins() {
        return Optional.ofNullable(this.allowOrigins);
    }
    /**
     * @return The set of HTTP response headers that browsers are allowed to access. This configures the `Access-Control-Expose-Headers` header.
     * 
     */
    public List<String> exposeHeaders() {
        return this.exposeHeaders == null ? List.of() : this.exposeHeaders;
    }
    /**
     * @return An optional duration specifying how long browsers can cache the results of a preflight request. This configures the Access-Control-Max-Age header. Example: `5h30m`.
     * 
     */
    public Optional<String> maxAge() {
        return Optional.ofNullable(this.maxAge);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppSpecStaticSiteCors defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean allowCredentials;
        private @Nullable List<String> allowHeaders;
        private @Nullable List<String> allowMethods;
        private @Nullable AppSpecStaticSiteCorsAllowOrigins allowOrigins;
        private @Nullable List<String> exposeHeaders;
        private @Nullable String maxAge;
        public Builder() {}
        public Builder(AppSpecStaticSiteCors defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowCredentials = defaults.allowCredentials;
    	      this.allowHeaders = defaults.allowHeaders;
    	      this.allowMethods = defaults.allowMethods;
    	      this.allowOrigins = defaults.allowOrigins;
    	      this.exposeHeaders = defaults.exposeHeaders;
    	      this.maxAge = defaults.maxAge;
        }

        @CustomType.Setter
        public Builder allowCredentials(@Nullable Boolean allowCredentials) {
            this.allowCredentials = allowCredentials;
            return this;
        }
        @CustomType.Setter
        public Builder allowHeaders(@Nullable List<String> allowHeaders) {
            this.allowHeaders = allowHeaders;
            return this;
        }
        public Builder allowHeaders(String... allowHeaders) {
            return allowHeaders(List.of(allowHeaders));
        }
        @CustomType.Setter
        public Builder allowMethods(@Nullable List<String> allowMethods) {
            this.allowMethods = allowMethods;
            return this;
        }
        public Builder allowMethods(String... allowMethods) {
            return allowMethods(List.of(allowMethods));
        }
        @CustomType.Setter
        public Builder allowOrigins(@Nullable AppSpecStaticSiteCorsAllowOrigins allowOrigins) {
            this.allowOrigins = allowOrigins;
            return this;
        }
        @CustomType.Setter
        public Builder exposeHeaders(@Nullable List<String> exposeHeaders) {
            this.exposeHeaders = exposeHeaders;
            return this;
        }
        public Builder exposeHeaders(String... exposeHeaders) {
            return exposeHeaders(List.of(exposeHeaders));
        }
        @CustomType.Setter
        public Builder maxAge(@Nullable String maxAge) {
            this.maxAge = maxAge;
            return this;
        }
        public AppSpecStaticSiteCors build() {
            final var o = new AppSpecStaticSiteCors();
            o.allowCredentials = allowCredentials;
            o.allowHeaders = allowHeaders;
            o.allowMethods = allowMethods;
            o.allowOrigins = allowOrigins;
            o.exposeHeaders = exposeHeaders;
            o.maxAge = maxAge;
            return o;
        }
    }
}
