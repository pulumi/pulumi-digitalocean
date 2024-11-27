// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppSpecStaticSiteEnvArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppSpecStaticSiteEnvArgs Empty = new AppSpecStaticSiteEnvArgs();

    /**
     * The name of the environment variable.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return The name of the environment variable.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * The visibility scope of the environment variable. One of `RUN_TIME`, `BUILD_TIME`, or `RUN_AND_BUILD_TIME` (default).
     * 
     */
    @Import(name="scope")
    private @Nullable Output<String> scope;

    /**
     * @return The visibility scope of the environment variable. One of `RUN_TIME`, `BUILD_TIME`, or `RUN_AND_BUILD_TIME` (default).
     * 
     */
    public Optional<Output<String>> scope() {
        return Optional.ofNullable(this.scope);
    }

    /**
     * The type of the environment variable, `GENERAL` or `SECRET`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of the environment variable, `GENERAL` or `SECRET`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The value of the environment variable.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The value of the environment variable.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private AppSpecStaticSiteEnvArgs() {}

    private AppSpecStaticSiteEnvArgs(AppSpecStaticSiteEnvArgs $) {
        this.key = $.key;
        this.scope = $.scope;
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppSpecStaticSiteEnvArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppSpecStaticSiteEnvArgs $;

        public Builder() {
            $ = new AppSpecStaticSiteEnvArgs();
        }

        public Builder(AppSpecStaticSiteEnvArgs defaults) {
            $ = new AppSpecStaticSiteEnvArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The name of the environment variable.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The name of the environment variable.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param scope The visibility scope of the environment variable. One of `RUN_TIME`, `BUILD_TIME`, or `RUN_AND_BUILD_TIME` (default).
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope The visibility scope of the environment variable. One of `RUN_TIME`, `BUILD_TIME`, or `RUN_AND_BUILD_TIME` (default).
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        /**
         * @param type The type of the environment variable, `GENERAL` or `SECRET`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the environment variable, `GENERAL` or `SECRET`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param value The value of the environment variable.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value of the environment variable.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public AppSpecStaticSiteEnvArgs build() {
            return $;
        }
    }

}