// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabaseConnectionPoolArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseConnectionPoolArgs Empty = new DatabaseConnectionPoolArgs();

    /**
     * The ID of the source database cluster. Note: This must be a PostgreSQL cluster.
     * 
     */
    @Import(name="clusterId", required=true)
    private Output<String> clusterId;

    /**
     * @return The ID of the source database cluster. Note: This must be a PostgreSQL cluster.
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }

    /**
     * The database for use with the connection pool.
     * 
     */
    @Import(name="dbName", required=true)
    private Output<String> dbName;

    /**
     * @return The database for use with the connection pool.
     * 
     */
    public Output<String> dbName() {
        return this.dbName;
    }

    /**
     * The PGBouncer transaction mode for the connection pool. The allowed values are session, transaction, and statement.
     * 
     */
    @Import(name="mode", required=true)
    private Output<String> mode;

    /**
     * @return The PGBouncer transaction mode for the connection pool. The allowed values are session, transaction, and statement.
     * 
     */
    public Output<String> mode() {
        return this.mode;
    }

    /**
     * The name for the database connection pool.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name for the database connection pool.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The desired size of the PGBouncer connection pool.
     * 
     */
    @Import(name="size", required=true)
    private Output<Integer> size;

    /**
     * @return The desired size of the PGBouncer connection pool.
     * 
     */
    public Output<Integer> size() {
        return this.size;
    }

    /**
     * The name of the database user for use with the connection pool. When excluded, all sessions connect to the database as the inbound user.
     * 
     */
    @Import(name="user")
    private @Nullable Output<String> user;

    /**
     * @return The name of the database user for use with the connection pool. When excluded, all sessions connect to the database as the inbound user.
     * 
     */
    public Optional<Output<String>> user() {
        return Optional.ofNullable(this.user);
    }

    private DatabaseConnectionPoolArgs() {}

    private DatabaseConnectionPoolArgs(DatabaseConnectionPoolArgs $) {
        this.clusterId = $.clusterId;
        this.dbName = $.dbName;
        this.mode = $.mode;
        this.name = $.name;
        this.size = $.size;
        this.user = $.user;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseConnectionPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseConnectionPoolArgs $;

        public Builder() {
            $ = new DatabaseConnectionPoolArgs();
        }

        public Builder(DatabaseConnectionPoolArgs defaults) {
            $ = new DatabaseConnectionPoolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterId The ID of the source database cluster. Note: This must be a PostgreSQL cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId The ID of the source database cluster. Note: This must be a PostgreSQL cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        /**
         * @param dbName The database for use with the connection pool.
         * 
         * @return builder
         * 
         */
        public Builder dbName(Output<String> dbName) {
            $.dbName = dbName;
            return this;
        }

        /**
         * @param dbName The database for use with the connection pool.
         * 
         * @return builder
         * 
         */
        public Builder dbName(String dbName) {
            return dbName(Output.of(dbName));
        }

        /**
         * @param mode The PGBouncer transaction mode for the connection pool. The allowed values are session, transaction, and statement.
         * 
         * @return builder
         * 
         */
        public Builder mode(Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode The PGBouncer transaction mode for the connection pool. The allowed values are session, transaction, and statement.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param name The name for the database connection pool.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name for the database connection pool.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param size The desired size of the PGBouncer connection pool.
         * 
         * @return builder
         * 
         */
        public Builder size(Output<Integer> size) {
            $.size = size;
            return this;
        }

        /**
         * @param size The desired size of the PGBouncer connection pool.
         * 
         * @return builder
         * 
         */
        public Builder size(Integer size) {
            return size(Output.of(size));
        }

        /**
         * @param user The name of the database user for use with the connection pool. When excluded, all sessions connect to the database as the inbound user.
         * 
         * @return builder
         * 
         */
        public Builder user(@Nullable Output<String> user) {
            $.user = user;
            return this;
        }

        /**
         * @param user The name of the database user for use with the connection pool. When excluded, all sessions connect to the database as the inbound user.
         * 
         * @return builder
         * 
         */
        public Builder user(String user) {
            return user(Output.of(user));
        }

        public DatabaseConnectionPoolArgs build() {
            if ($.clusterId == null) {
                throw new MissingRequiredPropertyException("DatabaseConnectionPoolArgs", "clusterId");
            }
            if ($.dbName == null) {
                throw new MissingRequiredPropertyException("DatabaseConnectionPoolArgs", "dbName");
            }
            if ($.mode == null) {
                throw new MissingRequiredPropertyException("DatabaseConnectionPoolArgs", "mode");
            }
            if ($.size == null) {
                throw new MissingRequiredPropertyException("DatabaseConnectionPoolArgs", "size");
            }
            return $;
        }
    }

}
