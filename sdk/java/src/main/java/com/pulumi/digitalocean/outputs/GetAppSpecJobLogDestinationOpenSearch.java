// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.digitalocean.outputs.GetAppSpecJobLogDestinationOpenSearchBasicAuth;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAppSpecJobLogDestinationOpenSearch {
    /**
     * @return OpenSearch basic auth
     * 
     */
    private GetAppSpecJobLogDestinationOpenSearchBasicAuth basicAuth;
    /**
     * @return The name of the underlying DigitalOcean DBaaS cluster. This is required for production databases. For dev databases, if `cluster_name` is not set, a new cluster will be provisioned.
     * 
     */
    private @Nullable String clusterName;
    /**
     * @return OpenSearch API Endpoint. Only HTTPS is supported. Format: https://&lt;host&gt;:&lt;port&gt;.
     * 
     */
    private @Nullable String endpoint;
    /**
     * @return The index name to use for the logs. If not set, the default index name is `logs`.
     * 
     */
    private @Nullable String indexName;

    private GetAppSpecJobLogDestinationOpenSearch() {}
    /**
     * @return OpenSearch basic auth
     * 
     */
    public GetAppSpecJobLogDestinationOpenSearchBasicAuth basicAuth() {
        return this.basicAuth;
    }
    /**
     * @return The name of the underlying DigitalOcean DBaaS cluster. This is required for production databases. For dev databases, if `cluster_name` is not set, a new cluster will be provisioned.
     * 
     */
    public Optional<String> clusterName() {
        return Optional.ofNullable(this.clusterName);
    }
    /**
     * @return OpenSearch API Endpoint. Only HTTPS is supported. Format: https://&lt;host&gt;:&lt;port&gt;.
     * 
     */
    public Optional<String> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }
    /**
     * @return The index name to use for the logs. If not set, the default index name is `logs`.
     * 
     */
    public Optional<String> indexName() {
        return Optional.ofNullable(this.indexName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppSpecJobLogDestinationOpenSearch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetAppSpecJobLogDestinationOpenSearchBasicAuth basicAuth;
        private @Nullable String clusterName;
        private @Nullable String endpoint;
        private @Nullable String indexName;
        public Builder() {}
        public Builder(GetAppSpecJobLogDestinationOpenSearch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basicAuth = defaults.basicAuth;
    	      this.clusterName = defaults.clusterName;
    	      this.endpoint = defaults.endpoint;
    	      this.indexName = defaults.indexName;
        }

        @CustomType.Setter
        public Builder basicAuth(GetAppSpecJobLogDestinationOpenSearchBasicAuth basicAuth) {
            if (basicAuth == null) {
              throw new MissingRequiredPropertyException("GetAppSpecJobLogDestinationOpenSearch", "basicAuth");
            }
            this.basicAuth = basicAuth;
            return this;
        }
        @CustomType.Setter
        public Builder clusterName(@Nullable String clusterName) {

            this.clusterName = clusterName;
            return this;
        }
        @CustomType.Setter
        public Builder endpoint(@Nullable String endpoint) {

            this.endpoint = endpoint;
            return this;
        }
        @CustomType.Setter
        public Builder indexName(@Nullable String indexName) {

            this.indexName = indexName;
            return this;
        }
        public GetAppSpecJobLogDestinationOpenSearch build() {
            final var _resultValue = new GetAppSpecJobLogDestinationOpenSearch();
            _resultValue.basicAuth = basicAuth;
            _resultValue.clusterName = clusterName;
            _resultValue.endpoint = endpoint;
            _resultValue.indexName = indexName;
            return _resultValue;
        }
    }
}
