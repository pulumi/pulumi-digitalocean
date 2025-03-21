// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetReservedIpv6Result {
    /**
     * @return The Droplet id that the reserved IP has been assigned to.
     * 
     */
    private Integer dropletId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String ip;
    /**
     * @return The region that the reserved IPv6 is reserved to.
     * 
     */
    private String regionSlug;
    /**
     * @return The uniform resource name of the reserved IPv6.
     * 
     */
    private String urn;

    private GetReservedIpv6Result() {}
    /**
     * @return The Droplet id that the reserved IP has been assigned to.
     * 
     */
    public Integer dropletId() {
        return this.dropletId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String ip() {
        return this.ip;
    }
    /**
     * @return The region that the reserved IPv6 is reserved to.
     * 
     */
    public String regionSlug() {
        return this.regionSlug;
    }
    /**
     * @return The uniform resource name of the reserved IPv6.
     * 
     */
    public String urn() {
        return this.urn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReservedIpv6Result defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer dropletId;
        private String id;
        private String ip;
        private String regionSlug;
        private String urn;
        public Builder() {}
        public Builder(GetReservedIpv6Result defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dropletId = defaults.dropletId;
    	      this.id = defaults.id;
    	      this.ip = defaults.ip;
    	      this.regionSlug = defaults.regionSlug;
    	      this.urn = defaults.urn;
        }

        @CustomType.Setter
        public Builder dropletId(Integer dropletId) {
            if (dropletId == null) {
              throw new MissingRequiredPropertyException("GetReservedIpv6Result", "dropletId");
            }
            this.dropletId = dropletId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetReservedIpv6Result", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ip(String ip) {
            if (ip == null) {
              throw new MissingRequiredPropertyException("GetReservedIpv6Result", "ip");
            }
            this.ip = ip;
            return this;
        }
        @CustomType.Setter
        public Builder regionSlug(String regionSlug) {
            if (regionSlug == null) {
              throw new MissingRequiredPropertyException("GetReservedIpv6Result", "regionSlug");
            }
            this.regionSlug = regionSlug;
            return this;
        }
        @CustomType.Setter
        public Builder urn(String urn) {
            if (urn == null) {
              throw new MissingRequiredPropertyException("GetReservedIpv6Result", "urn");
            }
            this.urn = urn;
            return this;
        }
        public GetReservedIpv6Result build() {
            final var _resultValue = new GetReservedIpv6Result();
            _resultValue.dropletId = dropletId;
            _resultValue.id = id;
            _resultValue.ip = ip;
            _resultValue.regionSlug = regionSlug;
            _resultValue.urn = urn;
            return _resultValue;
        }
    }
}
