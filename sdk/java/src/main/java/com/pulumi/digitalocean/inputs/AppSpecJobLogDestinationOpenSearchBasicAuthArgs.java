// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppSpecJobLogDestinationOpenSearchBasicAuthArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppSpecJobLogDestinationOpenSearchBasicAuthArgs Empty = new AppSpecJobLogDestinationOpenSearchBasicAuthArgs();

    /**
     * Password for basic authentication.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return Password for basic authentication.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * user for basic authentication.
     * 
     */
    @Import(name="user")
    private @Nullable Output<String> user;

    /**
     * @return user for basic authentication.
     * 
     */
    public Optional<Output<String>> user() {
        return Optional.ofNullable(this.user);
    }

    private AppSpecJobLogDestinationOpenSearchBasicAuthArgs() {}

    private AppSpecJobLogDestinationOpenSearchBasicAuthArgs(AppSpecJobLogDestinationOpenSearchBasicAuthArgs $) {
        this.password = $.password;
        this.user = $.user;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppSpecJobLogDestinationOpenSearchBasicAuthArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppSpecJobLogDestinationOpenSearchBasicAuthArgs $;

        public Builder() {
            $ = new AppSpecJobLogDestinationOpenSearchBasicAuthArgs();
        }

        public Builder(AppSpecJobLogDestinationOpenSearchBasicAuthArgs defaults) {
            $ = new AppSpecJobLogDestinationOpenSearchBasicAuthArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param password Password for basic authentication.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Password for basic authentication.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param user user for basic authentication.
         * 
         * @return builder
         * 
         */
        public Builder user(@Nullable Output<String> user) {
            $.user = user;
            return this;
        }

        /**
         * @param user user for basic authentication.
         * 
         * @return builder
         * 
         */
        public Builder user(String user) {
            return user(Output.of(user));
        }

        public AppSpecJobLogDestinationOpenSearchBasicAuthArgs build() {
            return $;
        }
    }

}
