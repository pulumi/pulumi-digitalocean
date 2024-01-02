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


public final class SpacesBucketCorsConfigurationCorsRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final SpacesBucketCorsConfigurationCorsRuleArgs Empty = new SpacesBucketCorsConfigurationCorsRuleArgs();

    /**
     * Set of Headers that are specified in the Access-Control-Request-Headers header.
     * 
     */
    @Import(name="allowedHeaders")
    private @Nullable Output<List<String>> allowedHeaders;

    /**
     * @return Set of Headers that are specified in the Access-Control-Request-Headers header.
     * 
     */
    public Optional<Output<List<String>>> allowedHeaders() {
        return Optional.ofNullable(this.allowedHeaders);
    }

    /**
     * Set of HTTP methods that you allow the origin to execute. Valid values are GET, PUT, HEAD, POST, and DELETE.
     * 
     */
    @Import(name="allowedMethods", required=true)
    private Output<List<String>> allowedMethods;

    /**
     * @return Set of HTTP methods that you allow the origin to execute. Valid values are GET, PUT, HEAD, POST, and DELETE.
     * 
     */
    public Output<List<String>> allowedMethods() {
        return this.allowedMethods;
    }

    /**
     * Set of origins you want customers to be able to access the bucket from.
     * 
     */
    @Import(name="allowedOrigins", required=true)
    private Output<List<String>> allowedOrigins;

    /**
     * @return Set of origins you want customers to be able to access the bucket from.
     * 
     */
    public Output<List<String>> allowedOrigins() {
        return this.allowedOrigins;
    }

    /**
     * Set of headers in the response that you want customers to be able to access from their applications (for example, from a JavaScript XMLHttpRequest object).
     * 
     */
    @Import(name="exposeHeaders")
    private @Nullable Output<List<String>> exposeHeaders;

    /**
     * @return Set of headers in the response that you want customers to be able to access from their applications (for example, from a JavaScript XMLHttpRequest object).
     * 
     */
    public Optional<Output<List<String>>> exposeHeaders() {
        return Optional.ofNullable(this.exposeHeaders);
    }

    /**
     * Unique identifier for the rule. The value cannot be longer than 255 characters.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Unique identifier for the rule. The value cannot be longer than 255 characters.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Time in seconds that your browser is to cache the preflight response for the specified resource.
     * 
     */
    @Import(name="maxAgeSeconds")
    private @Nullable Output<Integer> maxAgeSeconds;

    /**
     * @return Time in seconds that your browser is to cache the preflight response for the specified resource.
     * 
     */
    public Optional<Output<Integer>> maxAgeSeconds() {
        return Optional.ofNullable(this.maxAgeSeconds);
    }

    private SpacesBucketCorsConfigurationCorsRuleArgs() {}

    private SpacesBucketCorsConfigurationCorsRuleArgs(SpacesBucketCorsConfigurationCorsRuleArgs $) {
        this.allowedHeaders = $.allowedHeaders;
        this.allowedMethods = $.allowedMethods;
        this.allowedOrigins = $.allowedOrigins;
        this.exposeHeaders = $.exposeHeaders;
        this.id = $.id;
        this.maxAgeSeconds = $.maxAgeSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpacesBucketCorsConfigurationCorsRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpacesBucketCorsConfigurationCorsRuleArgs $;

        public Builder() {
            $ = new SpacesBucketCorsConfigurationCorsRuleArgs();
        }

        public Builder(SpacesBucketCorsConfigurationCorsRuleArgs defaults) {
            $ = new SpacesBucketCorsConfigurationCorsRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedHeaders Set of Headers that are specified in the Access-Control-Request-Headers header.
         * 
         * @return builder
         * 
         */
        public Builder allowedHeaders(@Nullable Output<List<String>> allowedHeaders) {
            $.allowedHeaders = allowedHeaders;
            return this;
        }

        /**
         * @param allowedHeaders Set of Headers that are specified in the Access-Control-Request-Headers header.
         * 
         * @return builder
         * 
         */
        public Builder allowedHeaders(List<String> allowedHeaders) {
            return allowedHeaders(Output.of(allowedHeaders));
        }

        /**
         * @param allowedHeaders Set of Headers that are specified in the Access-Control-Request-Headers header.
         * 
         * @return builder
         * 
         */
        public Builder allowedHeaders(String... allowedHeaders) {
            return allowedHeaders(List.of(allowedHeaders));
        }

        /**
         * @param allowedMethods Set of HTTP methods that you allow the origin to execute. Valid values are GET, PUT, HEAD, POST, and DELETE.
         * 
         * @return builder
         * 
         */
        public Builder allowedMethods(Output<List<String>> allowedMethods) {
            $.allowedMethods = allowedMethods;
            return this;
        }

        /**
         * @param allowedMethods Set of HTTP methods that you allow the origin to execute. Valid values are GET, PUT, HEAD, POST, and DELETE.
         * 
         * @return builder
         * 
         */
        public Builder allowedMethods(List<String> allowedMethods) {
            return allowedMethods(Output.of(allowedMethods));
        }

        /**
         * @param allowedMethods Set of HTTP methods that you allow the origin to execute. Valid values are GET, PUT, HEAD, POST, and DELETE.
         * 
         * @return builder
         * 
         */
        public Builder allowedMethods(String... allowedMethods) {
            return allowedMethods(List.of(allowedMethods));
        }

        /**
         * @param allowedOrigins Set of origins you want customers to be able to access the bucket from.
         * 
         * @return builder
         * 
         */
        public Builder allowedOrigins(Output<List<String>> allowedOrigins) {
            $.allowedOrigins = allowedOrigins;
            return this;
        }

        /**
         * @param allowedOrigins Set of origins you want customers to be able to access the bucket from.
         * 
         * @return builder
         * 
         */
        public Builder allowedOrigins(List<String> allowedOrigins) {
            return allowedOrigins(Output.of(allowedOrigins));
        }

        /**
         * @param allowedOrigins Set of origins you want customers to be able to access the bucket from.
         * 
         * @return builder
         * 
         */
        public Builder allowedOrigins(String... allowedOrigins) {
            return allowedOrigins(List.of(allowedOrigins));
        }

        /**
         * @param exposeHeaders Set of headers in the response that you want customers to be able to access from their applications (for example, from a JavaScript XMLHttpRequest object).
         * 
         * @return builder
         * 
         */
        public Builder exposeHeaders(@Nullable Output<List<String>> exposeHeaders) {
            $.exposeHeaders = exposeHeaders;
            return this;
        }

        /**
         * @param exposeHeaders Set of headers in the response that you want customers to be able to access from their applications (for example, from a JavaScript XMLHttpRequest object).
         * 
         * @return builder
         * 
         */
        public Builder exposeHeaders(List<String> exposeHeaders) {
            return exposeHeaders(Output.of(exposeHeaders));
        }

        /**
         * @param exposeHeaders Set of headers in the response that you want customers to be able to access from their applications (for example, from a JavaScript XMLHttpRequest object).
         * 
         * @return builder
         * 
         */
        public Builder exposeHeaders(String... exposeHeaders) {
            return exposeHeaders(List.of(exposeHeaders));
        }

        /**
         * @param id Unique identifier for the rule. The value cannot be longer than 255 characters.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Unique identifier for the rule. The value cannot be longer than 255 characters.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param maxAgeSeconds Time in seconds that your browser is to cache the preflight response for the specified resource.
         * 
         * @return builder
         * 
         */
        public Builder maxAgeSeconds(@Nullable Output<Integer> maxAgeSeconds) {
            $.maxAgeSeconds = maxAgeSeconds;
            return this;
        }

        /**
         * @param maxAgeSeconds Time in seconds that your browser is to cache the preflight response for the specified resource.
         * 
         * @return builder
         * 
         */
        public Builder maxAgeSeconds(Integer maxAgeSeconds) {
            return maxAgeSeconds(Output.of(maxAgeSeconds));
        }

        public SpacesBucketCorsConfigurationCorsRuleArgs build() {
            if ($.allowedMethods == null) {
                throw new MissingRequiredPropertyException("SpacesBucketCorsConfigurationCorsRuleArgs", "allowedMethods");
            }
            if ($.allowedOrigins == null) {
                throw new MissingRequiredPropertyException("SpacesBucketCorsConfigurationCorsRuleArgs", "allowedOrigins");
            }
            return $;
        }
    }

}
