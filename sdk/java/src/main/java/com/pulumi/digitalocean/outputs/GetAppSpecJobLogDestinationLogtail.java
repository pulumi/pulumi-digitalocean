// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAppSpecJobLogDestinationLogtail {
    /**
     * @return Logtail token.
     * 
     */
    private String token;

    private GetAppSpecJobLogDestinationLogtail() {}
    /**
     * @return Logtail token.
     * 
     */
    public String token() {
        return this.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppSpecJobLogDestinationLogtail defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String token;
        public Builder() {}
        public Builder(GetAppSpecJobLogDestinationLogtail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.token = defaults.token;
        }

        @CustomType.Setter
        public Builder token(String token) {
            if (token == null) {
              throw new MissingRequiredPropertyException("GetAppSpecJobLogDestinationLogtail", "token");
            }
            this.token = token;
            return this;
        }
        public GetAppSpecJobLogDestinationLogtail build() {
            final var _resultValue = new GetAppSpecJobLogDestinationLogtail();
            _resultValue.token = token;
            return _resultValue;
        }
    }
}
