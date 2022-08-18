// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDatabaseCaResult {
    /**
     * @return The CA certificate used to secure database connections decoded to a string.
     * 
     */
    private final String certificate;
    private final String clusterId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;

    @CustomType.Constructor
    private GetDatabaseCaResult(
        @CustomType.Parameter("certificate") String certificate,
        @CustomType.Parameter("clusterId") String clusterId,
        @CustomType.Parameter("id") String id) {
        this.certificate = certificate;
        this.clusterId = clusterId;
        this.id = id;
    }

    /**
     * @return The CA certificate used to secure database connections decoded to a string.
     * 
     */
    public String certificate() {
        return this.certificate;
    }
    public String clusterId() {
        return this.clusterId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseCaResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificate;
        private String clusterId;
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatabaseCaResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.clusterId = defaults.clusterId;
    	      this.id = defaults.id;
        }

        public Builder certificate(String certificate) {
            this.certificate = Objects.requireNonNull(certificate);
            return this;
        }
        public Builder clusterId(String clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }        public GetDatabaseCaResult build() {
            return new GetDatabaseCaResult(certificate, clusterId, id);
        }
    }
}