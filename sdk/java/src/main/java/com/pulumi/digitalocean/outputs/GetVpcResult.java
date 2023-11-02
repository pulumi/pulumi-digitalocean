// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetVpcResult {
    /**
     * @return The date and time of when the VPC was created.
     * 
     */
    private String createdAt;
    /**
     * @return A boolean indicating whether or not the VPC is the default one for the region.
     * 
     */
    private Boolean default_;
    /**
     * @return A free-form text field describing the VPC.
     * 
     */
    private String description;
    /**
     * @return The unique identifier for the VPC.
     * 
     */
    private String id;
    /**
     * @return The range of IP addresses for the VPC in CIDR notation.
     * 
     */
    private String ipRange;
    /**
     * @return The name of the VPC.
     * 
     */
    private String name;
    /**
     * @return The DigitalOcean region slug for the VPC&#39;s location.
     * 
     */
    private String region;
    /**
     * @return The uniform resource name (URN) for the VPC.
     * 
     */
    private String urn;

    private GetVpcResult() {}
    /**
     * @return The date and time of when the VPC was created.
     * 
     */
    public String createdAt() {
        return this.createdAt;
    }
    /**
     * @return A boolean indicating whether or not the VPC is the default one for the region.
     * 
     */
    public Boolean default_() {
        return this.default_;
    }
    /**
     * @return A free-form text field describing the VPC.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The unique identifier for the VPC.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The range of IP addresses for the VPC in CIDR notation.
     * 
     */
    public String ipRange() {
        return this.ipRange;
    }
    /**
     * @return The name of the VPC.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The DigitalOcean region slug for the VPC&#39;s location.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return The uniform resource name (URN) for the VPC.
     * 
     */
    public String urn() {
        return this.urn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpcResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createdAt;
        private Boolean default_;
        private String description;
        private String id;
        private String ipRange;
        private String name;
        private String region;
        private String urn;
        public Builder() {}
        public Builder(GetVpcResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.default_ = defaults.default_;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.ipRange = defaults.ipRange;
    	      this.name = defaults.name;
    	      this.region = defaults.region;
    	      this.urn = defaults.urn;
        }

        @CustomType.Setter
        public Builder createdAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }
        @CustomType.Setter("default")
        public Builder default_(Boolean default_) {
            this.default_ = Objects.requireNonNull(default_);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ipRange(String ipRange) {
            this.ipRange = Objects.requireNonNull(ipRange);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        @CustomType.Setter
        public Builder urn(String urn) {
            this.urn = Objects.requireNonNull(urn);
            return this;
        }
        public GetVpcResult build() {
            final var _resultValue = new GetVpcResult();
            _resultValue.createdAt = createdAt;
            _resultValue.default_ = default_;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.ipRange = ipRange;
            _resultValue.name = name;
            _resultValue.region = region;
            _resultValue.urn = urn;
            return _resultValue;
        }
    }
}
