// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetDatabaseUserArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDatabaseUserArgs Empty = new GetDatabaseUserArgs();

    /**
     * The ID of the database cluster.
     * 
     */
    @Import(name="clusterId", required=true)
    private Output<String> clusterId;

    /**
     * @return The ID of the database cluster.
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }

    /**
     * The name of the database user.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the database user.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private GetDatabaseUserArgs() {}

    private GetDatabaseUserArgs(GetDatabaseUserArgs $) {
        this.clusterId = $.clusterId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDatabaseUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatabaseUserArgs $;

        public Builder() {
            $ = new GetDatabaseUserArgs();
        }

        public Builder(GetDatabaseUserArgs defaults) {
            $ = new GetDatabaseUserArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterId The ID of the database cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId The ID of the database cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        /**
         * @param name The name of the database user.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the database user.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetDatabaseUserArgs build() {
            if ($.clusterId == null) {
                throw new MissingRequiredPropertyException("GetDatabaseUserArgs", "clusterId");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetDatabaseUserArgs", "name");
            }
            return $;
        }
    }

}
