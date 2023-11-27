// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SpacesBucketCorsConfigurationCorsRule {
    /**
     * @return Set of Headers that are specified in the Access-Control-Request-Headers header.
     * 
     */
    private @Nullable List<String> allowedHeaders;
    /**
     * @return Set of HTTP methods that you allow the origin to execute. Valid values are GET, PUT, HEAD, POST, and DELETE.
     * 
     */
    private List<String> allowedMethods;
    /**
     * @return Set of origins you want customers to be able to access the bucket from.
     * 
     */
    private List<String> allowedOrigins;
    /**
     * @return Set of headers in the response that you want customers to be able to access from their applications (for example, from a JavaScript XMLHttpRequest object).
     * 
     */
    private @Nullable List<String> exposeHeaders;
    /**
     * @return Unique identifier for the rule. The value cannot be longer than 255 characters.
     * 
     */
    private @Nullable String id;
    /**
     * @return Time in seconds that your browser is to cache the preflight response for the specified resource.
     * 
     */
    private @Nullable Integer maxAgeSeconds;

    private SpacesBucketCorsConfigurationCorsRule() {}
    /**
     * @return Set of Headers that are specified in the Access-Control-Request-Headers header.
     * 
     */
    public List<String> allowedHeaders() {
        return this.allowedHeaders == null ? List.of() : this.allowedHeaders;
    }
    /**
     * @return Set of HTTP methods that you allow the origin to execute. Valid values are GET, PUT, HEAD, POST, and DELETE.
     * 
     */
    public List<String> allowedMethods() {
        return this.allowedMethods;
    }
    /**
     * @return Set of origins you want customers to be able to access the bucket from.
     * 
     */
    public List<String> allowedOrigins() {
        return this.allowedOrigins;
    }
    /**
     * @return Set of headers in the response that you want customers to be able to access from their applications (for example, from a JavaScript XMLHttpRequest object).
     * 
     */
    public List<String> exposeHeaders() {
        return this.exposeHeaders == null ? List.of() : this.exposeHeaders;
    }
    /**
     * @return Unique identifier for the rule. The value cannot be longer than 255 characters.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Time in seconds that your browser is to cache the preflight response for the specified resource.
     * 
     */
    public Optional<Integer> maxAgeSeconds() {
        return Optional.ofNullable(this.maxAgeSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpacesBucketCorsConfigurationCorsRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> allowedHeaders;
        private List<String> allowedMethods;
        private List<String> allowedOrigins;
        private @Nullable List<String> exposeHeaders;
        private @Nullable String id;
        private @Nullable Integer maxAgeSeconds;
        public Builder() {}
        public Builder(SpacesBucketCorsConfigurationCorsRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedHeaders = defaults.allowedHeaders;
    	      this.allowedMethods = defaults.allowedMethods;
    	      this.allowedOrigins = defaults.allowedOrigins;
    	      this.exposeHeaders = defaults.exposeHeaders;
    	      this.id = defaults.id;
    	      this.maxAgeSeconds = defaults.maxAgeSeconds;
        }

        @CustomType.Setter
        public Builder allowedHeaders(@Nullable List<String> allowedHeaders) {
            this.allowedHeaders = allowedHeaders;
            return this;
        }
        public Builder allowedHeaders(String... allowedHeaders) {
            return allowedHeaders(List.of(allowedHeaders));
        }
        @CustomType.Setter
        public Builder allowedMethods(List<String> allowedMethods) {
            this.allowedMethods = Objects.requireNonNull(allowedMethods);
            return this;
        }
        public Builder allowedMethods(String... allowedMethods) {
            return allowedMethods(List.of(allowedMethods));
        }
        @CustomType.Setter
        public Builder allowedOrigins(List<String> allowedOrigins) {
            this.allowedOrigins = Objects.requireNonNull(allowedOrigins);
            return this;
        }
        public Builder allowedOrigins(String... allowedOrigins) {
            return allowedOrigins(List.of(allowedOrigins));
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
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder maxAgeSeconds(@Nullable Integer maxAgeSeconds) {
            this.maxAgeSeconds = maxAgeSeconds;
            return this;
        }
        public SpacesBucketCorsConfigurationCorsRule build() {
            final var _resultValue = new SpacesBucketCorsConfigurationCorsRule();
            _resultValue.allowedHeaders = allowedHeaders;
            _resultValue.allowedMethods = allowedMethods;
            _resultValue.allowedOrigins = allowedOrigins;
            _resultValue.exposeHeaders = exposeHeaders;
            _resultValue.id = id;
            _resultValue.maxAgeSeconds = maxAgeSeconds;
            return _resultValue;
        }
    }
}
