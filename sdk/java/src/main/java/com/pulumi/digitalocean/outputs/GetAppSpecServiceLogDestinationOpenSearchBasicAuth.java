// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAppSpecServiceLogDestinationOpenSearchBasicAuth {
    /**
     * @return Password for user defined in User. Is required when endpoint is set. Cannot be set if using a DigitalOcean DBaaS OpenSearch cluster.
     * 
     */
    private @Nullable String password;
    /**
     * @return Username to authenticate with. Only required when endpoint is set. Defaults to doadmin when cluster_name is set.
     * 
     */
    private @Nullable String user;

    private GetAppSpecServiceLogDestinationOpenSearchBasicAuth() {}
    /**
     * @return Password for user defined in User. Is required when endpoint is set. Cannot be set if using a DigitalOcean DBaaS OpenSearch cluster.
     * 
     */
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    /**
     * @return Username to authenticate with. Only required when endpoint is set. Defaults to doadmin when cluster_name is set.
     * 
     */
    public Optional<String> user() {
        return Optional.ofNullable(this.user);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppSpecServiceLogDestinationOpenSearchBasicAuth defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String password;
        private @Nullable String user;
        public Builder() {}
        public Builder(GetAppSpecServiceLogDestinationOpenSearchBasicAuth defaults) {
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
        public GetAppSpecServiceLogDestinationOpenSearchBasicAuth build() {
            final var _resultValue = new GetAppSpecServiceLogDestinationOpenSearchBasicAuth();
            _resultValue.password = password;
            _resultValue.user = user;
            return _resultValue;
        }
    }
}
