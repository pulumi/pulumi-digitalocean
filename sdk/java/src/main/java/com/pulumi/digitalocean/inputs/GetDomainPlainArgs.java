// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetDomainPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDomainPlainArgs Empty = new GetDomainPlainArgs();

    /**
     * The name of the domain.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the domain.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetDomainPlainArgs() {}

    private GetDomainPlainArgs(GetDomainPlainArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDomainPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDomainPlainArgs $;

        public Builder() {
            $ = new GetDomainPlainArgs();
        }

        public Builder(GetDomainPlainArgs defaults) {
            $ = new GetDomainPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the domain.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetDomainPlainArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetDomainPlainArgs", "name");
            }
            return $;
        }
    }

}
