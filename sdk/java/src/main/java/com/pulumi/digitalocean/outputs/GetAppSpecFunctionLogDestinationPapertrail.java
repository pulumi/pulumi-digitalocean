// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAppSpecFunctionLogDestinationPapertrail {
    /**
     * @return OpenSearch API Endpoint. Only HTTPS is supported. Format: https://&lt;host&gt;:&lt;port&gt;.
     * 
     */
    private String endpoint;

    private GetAppSpecFunctionLogDestinationPapertrail() {}
    /**
     * @return OpenSearch API Endpoint. Only HTTPS is supported. Format: https://&lt;host&gt;:&lt;port&gt;.
     * 
     */
    public String endpoint() {
        return this.endpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppSpecFunctionLogDestinationPapertrail defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String endpoint;
        public Builder() {}
        public Builder(GetAppSpecFunctionLogDestinationPapertrail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
        }

        @CustomType.Setter
        public Builder endpoint(String endpoint) {
            if (endpoint == null) {
              throw new MissingRequiredPropertyException("GetAppSpecFunctionLogDestinationPapertrail", "endpoint");
            }
            this.endpoint = endpoint;
            return this;
        }
        public GetAppSpecFunctionLogDestinationPapertrail build() {
            final var _resultValue = new GetAppSpecFunctionLogDestinationPapertrail();
            _resultValue.endpoint = endpoint;
            return _resultValue;
        }
    }
}
