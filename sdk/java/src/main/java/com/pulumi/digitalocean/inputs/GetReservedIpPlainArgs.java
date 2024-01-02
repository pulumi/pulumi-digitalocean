// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetReservedIpPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetReservedIpPlainArgs Empty = new GetReservedIpPlainArgs();

    /**
     * The allocated IP address of the specific reserved IP to retrieve.
     * 
     */
    @Import(name="ipAddress", required=true)
    private String ipAddress;

    /**
     * @return The allocated IP address of the specific reserved IP to retrieve.
     * 
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    private GetReservedIpPlainArgs() {}

    private GetReservedIpPlainArgs(GetReservedIpPlainArgs $) {
        this.ipAddress = $.ipAddress;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetReservedIpPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetReservedIpPlainArgs $;

        public Builder() {
            $ = new GetReservedIpPlainArgs();
        }

        public Builder(GetReservedIpPlainArgs defaults) {
            $ = new GetReservedIpPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ipAddress The allocated IP address of the specific reserved IP to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(String ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        public GetReservedIpPlainArgs build() {
            if ($.ipAddress == null) {
                throw new MissingRequiredPropertyException("GetReservedIpPlainArgs", "ipAddress");
            }
            return $;
        }
    }

}
