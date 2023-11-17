// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppSpecDomainNameArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppSpecDomainNameArgs Empty = new AppSpecDomainNameArgs();

    /**
     * The hostname for the domain.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The hostname for the domain.
     * 
     */
    public Output<String> name() {
        return this.name;
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
     * A boolean indicating whether the domain includes all sub-domains, in addition to the given domain.
     * 
     */
    @Import(name="wildcard")
    private @Nullable Output<Boolean> wildcard;

    /**
     * @return A boolean indicating whether the domain includes all sub-domains, in addition to the given domain.
     * 
     */
    public Optional<Output<Boolean>> wildcard() {
        return Optional.ofNullable(this.wildcard);
    }

    /**
     * If the domain uses DigitalOcean DNS and you would like App Platform to automatically manage it for you, set this to the name of the domain on your account.
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    /**
     * @return If the domain uses DigitalOcean DNS and you would like App Platform to automatically manage it for you, set this to the name of the domain on your account.
     * 
     */
    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private AppSpecDomainNameArgs() {}

    private AppSpecDomainNameArgs(AppSpecDomainNameArgs $) {
        this.name = $.name;
        this.type = $.type;
        this.wildcard = $.wildcard;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppSpecDomainNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppSpecDomainNameArgs $;

        public Builder() {
            $ = new AppSpecDomainNameArgs();
        }

        public Builder(AppSpecDomainNameArgs defaults) {
            $ = new AppSpecDomainNameArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The hostname for the domain.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The hostname for the domain.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
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
         * @param wildcard A boolean indicating whether the domain includes all sub-domains, in addition to the given domain.
         * 
         * @return builder
         * 
         */
        public Builder wildcard(@Nullable Output<Boolean> wildcard) {
            $.wildcard = wildcard;
            return this;
        }

        /**
         * @param wildcard A boolean indicating whether the domain includes all sub-domains, in addition to the given domain.
         * 
         * @return builder
         * 
         */
        public Builder wildcard(Boolean wildcard) {
            return wildcard(Output.of(wildcard));
        }

        /**
         * @param zone If the domain uses DigitalOcean DNS and you would like App Platform to automatically manage it for you, set this to the name of the domain on your account.
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone If the domain uses DigitalOcean DNS and you would like App Platform to automatically manage it for you, set this to the name of the domain on your account.
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public AppSpecDomainNameArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
