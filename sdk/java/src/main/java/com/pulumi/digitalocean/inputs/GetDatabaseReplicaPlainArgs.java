// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDatabaseReplicaPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDatabaseReplicaPlainArgs Empty = new GetDatabaseReplicaPlainArgs();

    /**
     * The ID of the original source database cluster.
     * 
     */
    @Import(name="clusterId", required=true)
    private String clusterId;

    /**
     * @return The ID of the original source database cluster.
     * 
     */
    public String clusterId() {
        return this.clusterId;
    }

    /**
     * The name for the database replica.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name for the database replica.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * A list of tag names to be applied to the database replica.
     * 
     */
    @Import(name="tags")
    private @Nullable List<String> tags;

    /**
     * @return A list of tag names to be applied to the database replica.
     * 
     */
    public Optional<List<String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetDatabaseReplicaPlainArgs() {}

    private GetDatabaseReplicaPlainArgs(GetDatabaseReplicaPlainArgs $) {
        this.clusterId = $.clusterId;
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDatabaseReplicaPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatabaseReplicaPlainArgs $;

        public Builder() {
            $ = new GetDatabaseReplicaPlainArgs();
        }

        public Builder(GetDatabaseReplicaPlainArgs defaults) {
            $ = new GetDatabaseReplicaPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterId The ID of the original source database cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param name The name for the database replica.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param tags A list of tag names to be applied to the database replica.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable List<String> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A list of tag names to be applied to the database replica.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public GetDatabaseReplicaPlainArgs build() {
            if ($.clusterId == null) {
                throw new MissingRequiredPropertyException("GetDatabaseReplicaPlainArgs", "clusterId");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetDatabaseReplicaPlainArgs", "name");
            }
            return $;
        }
    }

}
