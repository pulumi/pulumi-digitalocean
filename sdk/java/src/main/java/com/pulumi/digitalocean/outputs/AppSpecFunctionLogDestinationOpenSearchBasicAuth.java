// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppSpecFunctionLogDestinationOpenSearchBasicAuth {
    /**
     * @return Password for basic authentication.
     * 
     */
    private @Nullable String password;
    /**
     * @return user for basic authentication.
     * 
     */
    private @Nullable String user;

    private AppSpecFunctionLogDestinationOpenSearchBasicAuth() {}
    /**
     * @return Password for basic authentication.
     * 
     */
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    /**
     * @return user for basic authentication.
     * 
     */
    public Optional<String> user() {
        return Optional.ofNullable(this.user);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppSpecFunctionLogDestinationOpenSearchBasicAuth defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String password;
        private @Nullable String user;
        public Builder() {}
        public Builder(AppSpecFunctionLogDestinationOpenSearchBasicAuth defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.user = defaults.user;
        }

        @CustomType.Setter
        public Builder password(@Nullable String password) {

            this.password = password;
            return this;
        }
        @CustomType.Setter
        public Builder user(@Nullable String user) {

            this.user = user;
            return this;
        }
        public AppSpecFunctionLogDestinationOpenSearchBasicAuth build() {
            final var _resultValue = new AppSpecFunctionLogDestinationOpenSearchBasicAuth();
            _resultValue.password = password;
            _resultValue.user = user;
            return _resultValue;
        }
    }
}
