// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpacesBucketCorsRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final SpacesBucketCorsRuleArgs Empty = new SpacesBucketCorsRuleArgs();

    /**
     * A list of headers that will be included in the CORS preflight request&#39;s `Access-Control-Request-Headers`. A header may contain one wildcard (e.g. `x-amz-*`).
     * 
     */
    @Import(name="allowedHeaders")
    private @Nullable Output<List<String>> allowedHeaders;

    /**
     * @return A list of headers that will be included in the CORS preflight request&#39;s `Access-Control-Request-Headers`. A header may contain one wildcard (e.g. `x-amz-*`).
     * 
     */
    public Optional<Output<List<String>>> allowedHeaders() {
        return Optional.ofNullable(this.allowedHeaders);
    }

    /**
     * A list of HTTP methods (e.g. `GET`) which are allowed from the specified origin.
     * 
     */
    @Import(name="allowedMethods", required=true)
    private Output<List<String>> allowedMethods;

    /**
     * @return A list of HTTP methods (e.g. `GET`) which are allowed from the specified origin.
     * 
     */
    public Output<List<String>> allowedMethods() {
        return this.allowedMethods;
    }

    /**
     * A list of hosts from which requests using the specified methods are allowed. A host may contain one wildcard (e.g. http://*.example.com).
     * 
     */
    @Import(name="allowedOrigins", required=true)
    private Output<List<String>> allowedOrigins;

    /**
     * @return A list of hosts from which requests using the specified methods are allowed. A host may contain one wildcard (e.g. http://*.example.com).
     * 
     */
    public Output<List<String>> allowedOrigins() {
        return this.allowedOrigins;
    }

    /**
     * The time in seconds that browser can cache the response for a preflight request.
     * 
     */
    @Import(name="maxAgeSeconds")
    private @Nullable Output<Integer> maxAgeSeconds;

    /**
     * @return The time in seconds that browser can cache the response for a preflight request.
     * 
     */
    public Optional<Output<Integer>> maxAgeSeconds() {
        return Optional.ofNullable(this.maxAgeSeconds);
    }

    private SpacesBucketCorsRuleArgs() {}

    private SpacesBucketCorsRuleArgs(SpacesBucketCorsRuleArgs $) {
        this.allowedHeaders = $.allowedHeaders;
        this.allowedMethods = $.allowedMethods;
        this.allowedOrigins = $.allowedOrigins;
        this.maxAgeSeconds = $.maxAgeSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpacesBucketCorsRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpacesBucketCorsRuleArgs $;

        public Builder() {
            $ = new SpacesBucketCorsRuleArgs();
        }

        public Builder(SpacesBucketCorsRuleArgs defaults) {
            $ = new SpacesBucketCorsRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedHeaders A list of headers that will be included in the CORS preflight request&#39;s `Access-Control-Request-Headers`. A header may contain one wildcard (e.g. `x-amz-*`).
         * 
         * @return builder
         * 
         */
        public Builder allowedHeaders(@Nullable Output<List<String>> allowedHeaders) {
            $.allowedHeaders = allowedHeaders;
            return this;
        }

        /**
         * @param allowedHeaders A list of headers that will be included in the CORS preflight request&#39;s `Access-Control-Request-Headers`. A header may contain one wildcard (e.g. `x-amz-*`).
         * 
         * @return builder
         * 
         */
        public Builder allowedHeaders(List<String> allowedHeaders) {
            return allowedHeaders(Output.of(allowedHeaders));
        }

        /**
         * @param allowedHeaders A list of headers that will be included in the CORS preflight request&#39;s `Access-Control-Request-Headers`. A header may contain one wildcard (e.g. `x-amz-*`).
         * 
         * @return builder
         * 
         */
        public Builder allowedHeaders(String... allowedHeaders) {
            return allowedHeaders(List.of(allowedHeaders));
        }

        /**
         * @param allowedMethods A list of HTTP methods (e.g. `GET`) which are allowed from the specified origin.
         * 
         * @return builder
         * 
         */
        public Builder allowedMethods(Output<List<String>> allowedMethods) {
            $.allowedMethods = allowedMethods;
            return this;
        }

        /**
         * @param allowedMethods A list of HTTP methods (e.g. `GET`) which are allowed from the specified origin.
         * 
         * @return builder
         * 
         */
        public Builder allowedMethods(List<String> allowedMethods) {
            return allowedMethods(Output.of(allowedMethods));
        }

        /**
         * @param allowedMethods A list of HTTP methods (e.g. `GET`) which are allowed from the specified origin.
         * 
         * @return builder
         * 
         */
        public Builder allowedMethods(String... allowedMethods) {
            return allowedMethods(List.of(allowedMethods));
        }

        /**
         * @param allowedOrigins A list of hosts from which requests using the specified methods are allowed. A host may contain one wildcard (e.g. http://*.example.com).
         * 
         * @return builder
         * 
         */
        public Builder allowedOrigins(Output<List<String>> allowedOrigins) {
            $.allowedOrigins = allowedOrigins;
            return this;
        }

        /**
         * @param allowedOrigins A list of hosts from which requests using the specified methods are allowed. A host may contain one wildcard (e.g. http://*.example.com).
         * 
         * @return builder
         * 
         */
        public Builder allowedOrigins(List<String> allowedOrigins) {
            return allowedOrigins(Output.of(allowedOrigins));
        }

        /**
         * @param allowedOrigins A list of hosts from which requests using the specified methods are allowed. A host may contain one wildcard (e.g. http://*.example.com).
         * 
         * @return builder
         * 
         */
        public Builder allowedOrigins(String... allowedOrigins) {
            return allowedOrigins(List.of(allowedOrigins));
        }

        /**
         * @param maxAgeSeconds The time in seconds that browser can cache the response for a preflight request.
         * 
         * @return builder
         * 
         */
        public Builder maxAgeSeconds(@Nullable Output<Integer> maxAgeSeconds) {
            $.maxAgeSeconds = maxAgeSeconds;
            return this;
        }

        /**
         * @param maxAgeSeconds The time in seconds that browser can cache the response for a preflight request.
         * 
         * @return builder
         * 
         */
        public Builder maxAgeSeconds(Integer maxAgeSeconds) {
            return maxAgeSeconds(Output.of(maxAgeSeconds));
        }

        public SpacesBucketCorsRuleArgs build() {
            if ($.allowedMethods == null) {
                throw new MissingRequiredPropertyException("SpacesBucketCorsRuleArgs", "allowedMethods");
            }
            if ($.allowedOrigins == null) {
                throw new MissingRequiredPropertyException("SpacesBucketCorsRuleArgs", "allowedOrigins");
            }
            return $;
        }
    }

}
