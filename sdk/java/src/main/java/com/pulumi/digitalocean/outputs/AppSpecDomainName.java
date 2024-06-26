// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppSpecDomainName {
    /**
     * @return The hostname for the domain.
     * 
     */
    private String name;
    /**
     * @return The domain type, which can be one of the following:
     * - `DEFAULT`: The default .ondigitalocean.app domain assigned to this app.
     * - `PRIMARY`: The primary domain for this app that is displayed as the default in the control panel, used in bindable environment variables, and any other places that reference an app&#39;s live URL. Only one domain may be set as primary.
     * - `ALIAS`: A non-primary domain.
     * 
     */
    private @Nullable String type;
    /**
     * @return A boolean indicating whether the domain includes all sub-domains, in addition to the given domain.
     * 
     */
    private @Nullable Boolean wildcard;
    /**
     * @return If the domain uses DigitalOcean DNS and you would like App Platform to automatically manage it for you, set this to the name of the domain on your account.
     * 
     */
    private @Nullable String zone;

    private AppSpecDomainName() {}
    /**
     * @return The hostname for the domain.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The domain type, which can be one of the following:
     * - `DEFAULT`: The default .ondigitalocean.app domain assigned to this app.
     * - `PRIMARY`: The primary domain for this app that is displayed as the default in the control panel, used in bindable environment variables, and any other places that reference an app&#39;s live URL. Only one domain may be set as primary.
     * - `ALIAS`: A non-primary domain.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return A boolean indicating whether the domain includes all sub-domains, in addition to the given domain.
     * 
     */
    public Optional<Boolean> wildcard() {
        return Optional.ofNullable(this.wildcard);
    }
    /**
     * @return If the domain uses DigitalOcean DNS and you would like App Platform to automatically manage it for you, set this to the name of the domain on your account.
     * 
     */
    public Optional<String> zone() {
        return Optional.ofNullable(this.zone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppSpecDomainName defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private @Nullable String type;
        private @Nullable Boolean wildcard;
        private @Nullable String zone;
        public Builder() {}
        public Builder(AppSpecDomainName defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.wildcard = defaults.wildcard;
    	      this.zone = defaults.zone;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("AppSpecDomainName", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder wildcard(@Nullable Boolean wildcard) {

            this.wildcard = wildcard;
            return this;
        }
        @CustomType.Setter
        public Builder zone(@Nullable String zone) {

            this.zone = zone;
            return this;
        }
        public AppSpecDomainName build() {
            final var _resultValue = new AppSpecDomainName();
            _resultValue.name = name;
            _resultValue.type = type;
            _resultValue.wildcard = wildcard;
            _resultValue.zone = zone;
            return _resultValue;
        }
    }
}
