// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.digitalocean.inputs.AppSpecStaticSiteCorsAllowOriginsArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppSpecStaticSiteCorsArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppSpecStaticSiteCorsArgs Empty = new AppSpecStaticSiteCorsArgs();

    /**
     * Whether browsers should expose the response to the client-side JavaScript code when the request&#39;s credentials mode is `include`. This configures the `Access-Control-Allow-Credentials` header.
     * 
     * A spec can contain multiple components.
     * 
     * A `service` can contain:
     * 
     */
    @Import(name="allowCredentials")
    private @Nullable Output<Boolean> allowCredentials;

    /**
     * @return Whether browsers should expose the response to the client-side JavaScript code when the request&#39;s credentials mode is `include`. This configures the `Access-Control-Allow-Credentials` header.
     * 
     * A spec can contain multiple components.
     * 
     * A `service` can contain:
     * 
     */
    public Optional<Output<Boolean>> allowCredentials() {
        return Optional.ofNullable(this.allowCredentials);
    }

    /**
     * The set of allowed HTTP request headers. This configures the `Access-Control-Allow-Headers` header.
     * 
     */
    @Import(name="allowHeaders")
    private @Nullable Output<List<String>> allowHeaders;

    /**
     * @return The set of allowed HTTP request headers. This configures the `Access-Control-Allow-Headers` header.
     * 
     */
    public Optional<Output<List<String>>> allowHeaders() {
        return Optional.ofNullable(this.allowHeaders);
    }

    /**
     * The set of allowed HTTP methods. This configures the `Access-Control-Allow-Methods` header.
     * 
     */
    @Import(name="allowMethods")
    private @Nullable Output<List<String>> allowMethods;

    /**
     * @return The set of allowed HTTP methods. This configures the `Access-Control-Allow-Methods` header.
     * 
     */
    public Optional<Output<List<String>>> allowMethods() {
        return Optional.ofNullable(this.allowMethods);
    }

    /**
     * The `Access-Control-Allow-Origin` can be
     * 
     */
    @Import(name="allowOrigins")
    private @Nullable Output<AppSpecStaticSiteCorsAllowOriginsArgs> allowOrigins;

    /**
     * @return The `Access-Control-Allow-Origin` can be
     * 
     */
    public Optional<Output<AppSpecStaticSiteCorsAllowOriginsArgs>> allowOrigins() {
        return Optional.ofNullable(this.allowOrigins);
    }

    /**
     * The set of HTTP response headers that browsers are allowed to access. This configures the `Access-Control-Expose-Headers` header.
     * 
     */
    @Import(name="exposeHeaders")
    private @Nullable Output<List<String>> exposeHeaders;

    /**
     * @return The set of HTTP response headers that browsers are allowed to access. This configures the `Access-Control-Expose-Headers` header.
     * 
     */
    public Optional<Output<List<String>>> exposeHeaders() {
        return Optional.ofNullable(this.exposeHeaders);
    }

    /**
     * An optional duration specifying how long browsers can cache the results of a preflight request. This configures the Access-Control-Max-Age header. Example: `5h30m`.
     * 
     */
    @Import(name="maxAge")
    private @Nullable Output<String> maxAge;

    /**
     * @return An optional duration specifying how long browsers can cache the results of a preflight request. This configures the Access-Control-Max-Age header. Example: `5h30m`.
     * 
     */
    public Optional<Output<String>> maxAge() {
        return Optional.ofNullable(this.maxAge);
    }

    private AppSpecStaticSiteCorsArgs() {}

    private AppSpecStaticSiteCorsArgs(AppSpecStaticSiteCorsArgs $) {
        this.allowCredentials = $.allowCredentials;
        this.allowHeaders = $.allowHeaders;
        this.allowMethods = $.allowMethods;
        this.allowOrigins = $.allowOrigins;
        this.exposeHeaders = $.exposeHeaders;
        this.maxAge = $.maxAge;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppSpecStaticSiteCorsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppSpecStaticSiteCorsArgs $;

        public Builder() {
            $ = new AppSpecStaticSiteCorsArgs();
        }

        public Builder(AppSpecStaticSiteCorsArgs defaults) {
            $ = new AppSpecStaticSiteCorsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowCredentials Whether browsers should expose the response to the client-side JavaScript code when the request&#39;s credentials mode is `include`. This configures the `Access-Control-Allow-Credentials` header.
         * 
         * A spec can contain multiple components.
         * 
         * A `service` can contain:
         * 
         * @return builder
         * 
         */
        public Builder allowCredentials(@Nullable Output<Boolean> allowCredentials) {
            $.allowCredentials = allowCredentials;
            return this;
        }

        /**
         * @param allowCredentials Whether browsers should expose the response to the client-side JavaScript code when the request&#39;s credentials mode is `include`. This configures the `Access-Control-Allow-Credentials` header.
         * 
         * A spec can contain multiple components.
         * 
         * A `service` can contain:
         * 
         * @return builder
         * 
         */
        public Builder allowCredentials(Boolean allowCredentials) {
            return allowCredentials(Output.of(allowCredentials));
        }

        /**
         * @param allowHeaders The set of allowed HTTP request headers. This configures the `Access-Control-Allow-Headers` header.
         * 
         * @return builder
         * 
         */
        public Builder allowHeaders(@Nullable Output<List<String>> allowHeaders) {
            $.allowHeaders = allowHeaders;
            return this;
        }

        /**
         * @param allowHeaders The set of allowed HTTP request headers. This configures the `Access-Control-Allow-Headers` header.
         * 
         * @return builder
         * 
         */
        public Builder allowHeaders(List<String> allowHeaders) {
            return allowHeaders(Output.of(allowHeaders));
        }

        /**
         * @param allowHeaders The set of allowed HTTP request headers. This configures the `Access-Control-Allow-Headers` header.
         * 
         * @return builder
         * 
         */
        public Builder allowHeaders(String... allowHeaders) {
            return allowHeaders(List.of(allowHeaders));
        }

        /**
         * @param allowMethods The set of allowed HTTP methods. This configures the `Access-Control-Allow-Methods` header.
         * 
         * @return builder
         * 
         */
        public Builder allowMethods(@Nullable Output<List<String>> allowMethods) {
            $.allowMethods = allowMethods;
            return this;
        }

        /**
         * @param allowMethods The set of allowed HTTP methods. This configures the `Access-Control-Allow-Methods` header.
         * 
         * @return builder
         * 
         */
        public Builder allowMethods(List<String> allowMethods) {
            return allowMethods(Output.of(allowMethods));
        }

        /**
         * @param allowMethods The set of allowed HTTP methods. This configures the `Access-Control-Allow-Methods` header.
         * 
         * @return builder
         * 
         */
        public Builder allowMethods(String... allowMethods) {
            return allowMethods(List.of(allowMethods));
        }

        /**
         * @param allowOrigins The `Access-Control-Allow-Origin` can be
         * 
         * @return builder
         * 
         */
        public Builder allowOrigins(@Nullable Output<AppSpecStaticSiteCorsAllowOriginsArgs> allowOrigins) {
            $.allowOrigins = allowOrigins;
            return this;
        }

        /**
         * @param allowOrigins The `Access-Control-Allow-Origin` can be
         * 
         * @return builder
         * 
         */
        public Builder allowOrigins(AppSpecStaticSiteCorsAllowOriginsArgs allowOrigins) {
            return allowOrigins(Output.of(allowOrigins));
        }

        /**
         * @param exposeHeaders The set of HTTP response headers that browsers are allowed to access. This configures the `Access-Control-Expose-Headers` header.
         * 
         * @return builder
         * 
         */
        public Builder exposeHeaders(@Nullable Output<List<String>> exposeHeaders) {
            $.exposeHeaders = exposeHeaders;
            return this;
        }

        /**
         * @param exposeHeaders The set of HTTP response headers that browsers are allowed to access. This configures the `Access-Control-Expose-Headers` header.
         * 
         * @return builder
         * 
         */
        public Builder exposeHeaders(List<String> exposeHeaders) {
            return exposeHeaders(Output.of(exposeHeaders));
        }

        /**
         * @param exposeHeaders The set of HTTP response headers that browsers are allowed to access. This configures the `Access-Control-Expose-Headers` header.
         * 
         * @return builder
         * 
         */
        public Builder exposeHeaders(String... exposeHeaders) {
            return exposeHeaders(List.of(exposeHeaders));
        }

        /**
         * @param maxAge An optional duration specifying how long browsers can cache the results of a preflight request. This configures the Access-Control-Max-Age header. Example: `5h30m`.
         * 
         * @return builder
         * 
         */
        public Builder maxAge(@Nullable Output<String> maxAge) {
            $.maxAge = maxAge;
            return this;
        }

        /**
         * @param maxAge An optional duration specifying how long browsers can cache the results of a preflight request. This configures the Access-Control-Max-Age header. Example: `5h30m`.
         * 
         * @return builder
         * 
         */
        public Builder maxAge(String maxAge) {
            return maxAge(Output.of(maxAge));
        }

        public AppSpecStaticSiteCorsArgs build() {
            return $;
        }
    }

}
