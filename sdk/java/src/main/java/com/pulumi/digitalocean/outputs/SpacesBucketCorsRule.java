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
public final class SpacesBucketCorsRule {
    /**
     * @return A list of headers that will be included in the CORS preflight request&#39;s `Access-Control-Request-Headers`. A header may contain one wildcard (e.g. `x-amz-*`).
     * 
     */
    private @Nullable List<String> allowedHeaders;
    /**
     * @return A list of HTTP methods (e.g. `GET`) which are allowed from the specified origin.
     * 
     */
    private List<String> allowedMethods;
    /**
     * @return A list of hosts from which requests using the specified methods are allowed. A host may contain one wildcard (e.g. http://*.example.com).
     * 
     */
    private List<String> allowedOrigins;
    /**
     * @return The time in seconds that browser can cache the response for a preflight request.
     * 
     */
    private @Nullable Integer maxAgeSeconds;

    private SpacesBucketCorsRule() {}
    /**
     * @return A list of headers that will be included in the CORS preflight request&#39;s `Access-Control-Request-Headers`. A header may contain one wildcard (e.g. `x-amz-*`).
     * 
     */
    public List<String> allowedHeaders() {
        return this.allowedHeaders == null ? List.of() : this.allowedHeaders;
    }
    /**
     * @return A list of HTTP methods (e.g. `GET`) which are allowed from the specified origin.
     * 
     */
    public List<String> allowedMethods() {
        return this.allowedMethods;
    }
    /**
     * @return A list of hosts from which requests using the specified methods are allowed. A host may contain one wildcard (e.g. http://*.example.com).
     * 
     */
    public List<String> allowedOrigins() {
        return this.allowedOrigins;
    }
    /**
     * @return The time in seconds that browser can cache the response for a preflight request.
     * 
     */
    public Optional<Integer> maxAgeSeconds() {
        return Optional.ofNullable(this.maxAgeSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpacesBucketCorsRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> allowedHeaders;
        private List<String> allowedMethods;
        private List<String> allowedOrigins;
        private @Nullable Integer maxAgeSeconds;
        public Builder() {}
        public Builder(SpacesBucketCorsRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedHeaders = defaults.allowedHeaders;
    	      this.allowedMethods = defaults.allowedMethods;
    	      this.allowedOrigins = defaults.allowedOrigins;
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
        public Builder maxAgeSeconds(@Nullable Integer maxAgeSeconds) {
            this.maxAgeSeconds = maxAgeSeconds;
            return this;
        }
        public SpacesBucketCorsRule build() {
            final var _resultValue = new SpacesBucketCorsRule();
            _resultValue.allowedHeaders = allowedHeaders;
            _resultValue.allowedMethods = allowedMethods;
            _resultValue.allowedOrigins = allowedOrigins;
            _resultValue.maxAgeSeconds = maxAgeSeconds;
            return _resultValue;
        }
    }
}
