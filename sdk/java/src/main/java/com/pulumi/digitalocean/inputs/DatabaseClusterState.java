// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.digitalocean.enums.DatabaseSlug;
import com.pulumi.digitalocean.enums.Region;
import com.pulumi.digitalocean.inputs.DatabaseClusterMaintenanceWindowArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabaseClusterState extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseClusterState Empty = new DatabaseClusterState();

    /**
     * The uniform resource name of the database cluster.
     * 
     */
    @Import(name="clusterUrn")
    private @Nullable Output<String> clusterUrn;

    /**
     * @return The uniform resource name of the database cluster.
     * 
     */
    public Optional<Output<String>> clusterUrn() {
        return Optional.ofNullable(this.clusterUrn);
    }

    /**
     * Name of the cluster&#39;s default database.
     * 
     */
    @Import(name="database")
    private @Nullable Output<String> database;

    /**
     * @return Name of the cluster&#39;s default database.
     * 
     */
    public Optional<Output<String>> database() {
        return Optional.ofNullable(this.database);
    }

    /**
     * Database engine used by the cluster (ex. `pg` for PostreSQL, `mysql` for MySQL, `redis` for Redis, or `mongodb` for MongoDB).
     * 
     */
    @Import(name="engine")
    private @Nullable Output<String> engine;

    /**
     * @return Database engine used by the cluster (ex. `pg` for PostreSQL, `mysql` for MySQL, `redis` for Redis, or `mongodb` for MongoDB).
     * 
     */
    public Optional<Output<String>> engine() {
        return Optional.ofNullable(this.engine);
    }

    /**
     * A string specifying the eviction policy for a Redis cluster. Valid values are: `noeviction`, `allkeys_lru`, `allkeys_random`, `volatile_lru`, `volatile_random`, or `volatile_ttl`.
     * 
     */
    @Import(name="evictionPolicy")
    private @Nullable Output<String> evictionPolicy;

    /**
     * @return A string specifying the eviction policy for a Redis cluster. Valid values are: `noeviction`, `allkeys_lru`, `allkeys_random`, `volatile_lru`, `volatile_random`, or `volatile_ttl`.
     * 
     */
    public Optional<Output<String>> evictionPolicy() {
        return Optional.ofNullable(this.evictionPolicy);
    }

    /**
     * Database cluster&#39;s hostname.
     * 
     */
    @Import(name="host")
    private @Nullable Output<String> host;

    /**
     * @return Database cluster&#39;s hostname.
     * 
     */
    public Optional<Output<String>> host() {
        return Optional.ofNullable(this.host);
    }

    /**
     * Defines when the automatic maintenance should be performed for the database cluster.
     * 
     */
    @Import(name="maintenanceWindows")
    private @Nullable Output<List<DatabaseClusterMaintenanceWindowArgs>> maintenanceWindows;

    /**
     * @return Defines when the automatic maintenance should be performed for the database cluster.
     * 
     */
    public Optional<Output<List<DatabaseClusterMaintenanceWindowArgs>>> maintenanceWindows() {
        return Optional.ofNullable(this.maintenanceWindows);
    }

    /**
     * The name of the database cluster.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the database cluster.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Number of nodes that will be included in the cluster.
     * 
     */
    @Import(name="nodeCount")
    private @Nullable Output<Integer> nodeCount;

    /**
     * @return Number of nodes that will be included in the cluster.
     * 
     */
    public Optional<Output<Integer>> nodeCount() {
        return Optional.ofNullable(this.nodeCount);
    }

    /**
     * Password for the cluster&#39;s default user.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return Password for the cluster&#39;s default user.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * Network port that the database cluster is listening on.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return Network port that the database cluster is listening on.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * Same as `host`, but only accessible from resources within the account and in the same region.
     * 
     */
    @Import(name="privateHost")
    private @Nullable Output<String> privateHost;

    /**
     * @return Same as `host`, but only accessible from resources within the account and in the same region.
     * 
     */
    public Optional<Output<String>> privateHost() {
        return Optional.ofNullable(this.privateHost);
    }

    /**
     * The ID of the VPC where the database cluster will be located.
     * 
     */
    @Import(name="privateNetworkUuid")
    private @Nullable Output<String> privateNetworkUuid;

    /**
     * @return The ID of the VPC where the database cluster will be located.
     * 
     */
    public Optional<Output<String>> privateNetworkUuid() {
        return Optional.ofNullable(this.privateNetworkUuid);
    }

    /**
     * Same as `uri`, but only accessible from resources within the account and in the same region.
     * 
     */
    @Import(name="privateUri")
    private @Nullable Output<String> privateUri;

    /**
     * @return Same as `uri`, but only accessible from resources within the account and in the same region.
     * 
     */
    public Optional<Output<String>> privateUri() {
        return Optional.ofNullable(this.privateUri);
    }

    /**
     * DigitalOcean region where the cluster will reside.
     * 
     */
    @Import(name="region")
    private @Nullable Output<Either<String,Region>> region;

    /**
     * @return DigitalOcean region where the cluster will reside.
     * 
     */
    public Optional<Output<Either<String,Region>>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * Database Droplet size associated with the cluster (ex. `db-s-1vcpu-1gb`). See here for a [list of valid size slugs](https://docs.digitalocean.com/reference/api/api-reference/#tag/Databases).
     * 
     */
    @Import(name="size")
    private @Nullable Output<Either<String,DatabaseSlug>> size;

    /**
     * @return Database Droplet size associated with the cluster (ex. `db-s-1vcpu-1gb`). See here for a [list of valid size slugs](https://docs.digitalocean.com/reference/api/api-reference/#tag/Databases).
     * 
     */
    public Optional<Output<Either<String,DatabaseSlug>>> size() {
        return Optional.ofNullable(this.size);
    }

    /**
     * A comma separated string specifying the  SQL modes for a MySQL cluster.
     * 
     */
    @Import(name="sqlMode")
    private @Nullable Output<String> sqlMode;

    /**
     * @return A comma separated string specifying the  SQL modes for a MySQL cluster.
     * 
     */
    public Optional<Output<String>> sqlMode() {
        return Optional.ofNullable(this.sqlMode);
    }

    /**
     * A list of tag names to be applied to the database cluster.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return A list of tag names to be applied to the database cluster.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The full URI for connecting to the database cluster.
     * 
     */
    @Import(name="uri")
    private @Nullable Output<String> uri;

    /**
     * @return The full URI for connecting to the database cluster.
     * 
     */
    public Optional<Output<String>> uri() {
        return Optional.ofNullable(this.uri);
    }

    /**
     * Username for the cluster&#39;s default user.
     * 
     */
    @Import(name="user")
    private @Nullable Output<String> user;

    /**
     * @return Username for the cluster&#39;s default user.
     * 
     */
    public Optional<Output<String>> user() {
        return Optional.ofNullable(this.user);
    }

    /**
     * Engine version used by the cluster (ex. `11` for PostgreSQL 11).
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return Engine version used by the cluster (ex. `11` for PostgreSQL 11).
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private DatabaseClusterState() {}

    private DatabaseClusterState(DatabaseClusterState $) {
        this.clusterUrn = $.clusterUrn;
        this.database = $.database;
        this.engine = $.engine;
        this.evictionPolicy = $.evictionPolicy;
        this.host = $.host;
        this.maintenanceWindows = $.maintenanceWindows;
        this.name = $.name;
        this.nodeCount = $.nodeCount;
        this.password = $.password;
        this.port = $.port;
        this.privateHost = $.privateHost;
        this.privateNetworkUuid = $.privateNetworkUuid;
        this.privateUri = $.privateUri;
        this.region = $.region;
        this.size = $.size;
        this.sqlMode = $.sqlMode;
        this.tags = $.tags;
        this.uri = $.uri;
        this.user = $.user;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseClusterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseClusterState $;

        public Builder() {
            $ = new DatabaseClusterState();
        }

        public Builder(DatabaseClusterState defaults) {
            $ = new DatabaseClusterState(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterUrn The uniform resource name of the database cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterUrn(@Nullable Output<String> clusterUrn) {
            $.clusterUrn = clusterUrn;
            return this;
        }

        /**
         * @param clusterUrn The uniform resource name of the database cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterUrn(String clusterUrn) {
            return clusterUrn(Output.of(clusterUrn));
        }

        /**
         * @param database Name of the cluster&#39;s default database.
         * 
         * @return builder
         * 
         */
        public Builder database(@Nullable Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database Name of the cluster&#39;s default database.
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param engine Database engine used by the cluster (ex. `pg` for PostreSQL, `mysql` for MySQL, `redis` for Redis, or `mongodb` for MongoDB).
         * 
         * @return builder
         * 
         */
        public Builder engine(@Nullable Output<String> engine) {
            $.engine = engine;
            return this;
        }

        /**
         * @param engine Database engine used by the cluster (ex. `pg` for PostreSQL, `mysql` for MySQL, `redis` for Redis, or `mongodb` for MongoDB).
         * 
         * @return builder
         * 
         */
        public Builder engine(String engine) {
            return engine(Output.of(engine));
        }

        /**
         * @param evictionPolicy A string specifying the eviction policy for a Redis cluster. Valid values are: `noeviction`, `allkeys_lru`, `allkeys_random`, `volatile_lru`, `volatile_random`, or `volatile_ttl`.
         * 
         * @return builder
         * 
         */
        public Builder evictionPolicy(@Nullable Output<String> evictionPolicy) {
            $.evictionPolicy = evictionPolicy;
            return this;
        }

        /**
         * @param evictionPolicy A string specifying the eviction policy for a Redis cluster. Valid values are: `noeviction`, `allkeys_lru`, `allkeys_random`, `volatile_lru`, `volatile_random`, or `volatile_ttl`.
         * 
         * @return builder
         * 
         */
        public Builder evictionPolicy(String evictionPolicy) {
            return evictionPolicy(Output.of(evictionPolicy));
        }

        /**
         * @param host Database cluster&#39;s hostname.
         * 
         * @return builder
         * 
         */
        public Builder host(@Nullable Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host Database cluster&#39;s hostname.
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            return host(Output.of(host));
        }

        /**
         * @param maintenanceWindows Defines when the automatic maintenance should be performed for the database cluster.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceWindows(@Nullable Output<List<DatabaseClusterMaintenanceWindowArgs>> maintenanceWindows) {
            $.maintenanceWindows = maintenanceWindows;
            return this;
        }

        /**
         * @param maintenanceWindows Defines when the automatic maintenance should be performed for the database cluster.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceWindows(List<DatabaseClusterMaintenanceWindowArgs> maintenanceWindows) {
            return maintenanceWindows(Output.of(maintenanceWindows));
        }

        /**
         * @param maintenanceWindows Defines when the automatic maintenance should be performed for the database cluster.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceWindows(DatabaseClusterMaintenanceWindowArgs... maintenanceWindows) {
            return maintenanceWindows(List.of(maintenanceWindows));
        }

        /**
         * @param name The name of the database cluster.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the database cluster.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nodeCount Number of nodes that will be included in the cluster.
         * 
         * @return builder
         * 
         */
        public Builder nodeCount(@Nullable Output<Integer> nodeCount) {
            $.nodeCount = nodeCount;
            return this;
        }

        /**
         * @param nodeCount Number of nodes that will be included in the cluster.
         * 
         * @return builder
         * 
         */
        public Builder nodeCount(Integer nodeCount) {
            return nodeCount(Output.of(nodeCount));
        }

        /**
         * @param password Password for the cluster&#39;s default user.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Password for the cluster&#39;s default user.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param port Network port that the database cluster is listening on.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port Network port that the database cluster is listening on.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param privateHost Same as `host`, but only accessible from resources within the account and in the same region.
         * 
         * @return builder
         * 
         */
        public Builder privateHost(@Nullable Output<String> privateHost) {
            $.privateHost = privateHost;
            return this;
        }

        /**
         * @param privateHost Same as `host`, but only accessible from resources within the account and in the same region.
         * 
         * @return builder
         * 
         */
        public Builder privateHost(String privateHost) {
            return privateHost(Output.of(privateHost));
        }

        /**
         * @param privateNetworkUuid The ID of the VPC where the database cluster will be located.
         * 
         * @return builder
         * 
         */
        public Builder privateNetworkUuid(@Nullable Output<String> privateNetworkUuid) {
            $.privateNetworkUuid = privateNetworkUuid;
            return this;
        }

        /**
         * @param privateNetworkUuid The ID of the VPC where the database cluster will be located.
         * 
         * @return builder
         * 
         */
        public Builder privateNetworkUuid(String privateNetworkUuid) {
            return privateNetworkUuid(Output.of(privateNetworkUuid));
        }

        /**
         * @param privateUri Same as `uri`, but only accessible from resources within the account and in the same region.
         * 
         * @return builder
         * 
         */
        public Builder privateUri(@Nullable Output<String> privateUri) {
            $.privateUri = privateUri;
            return this;
        }

        /**
         * @param privateUri Same as `uri`, but only accessible from resources within the account and in the same region.
         * 
         * @return builder
         * 
         */
        public Builder privateUri(String privateUri) {
            return privateUri(Output.of(privateUri));
        }

        /**
         * @param region DigitalOcean region where the cluster will reside.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<Either<String,Region>> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region DigitalOcean region where the cluster will reside.
         * 
         * @return builder
         * 
         */
        public Builder region(Either<String,Region> region) {
            return region(Output.of(region));
        }

        /**
         * @param region DigitalOcean region where the cluster will reside.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Either.ofLeft(region));
        }

        /**
         * @param region DigitalOcean region where the cluster will reside.
         * 
         * @return builder
         * 
         */
        public Builder region(Region region) {
            return region(Either.ofRight(region));
        }

        /**
         * @param size Database Droplet size associated with the cluster (ex. `db-s-1vcpu-1gb`). See here for a [list of valid size slugs](https://docs.digitalocean.com/reference/api/api-reference/#tag/Databases).
         * 
         * @return builder
         * 
         */
        public Builder size(@Nullable Output<Either<String,DatabaseSlug>> size) {
            $.size = size;
            return this;
        }

        /**
         * @param size Database Droplet size associated with the cluster (ex. `db-s-1vcpu-1gb`). See here for a [list of valid size slugs](https://docs.digitalocean.com/reference/api/api-reference/#tag/Databases).
         * 
         * @return builder
         * 
         */
        public Builder size(Either<String,DatabaseSlug> size) {
            return size(Output.of(size));
        }

        /**
         * @param size Database Droplet size associated with the cluster (ex. `db-s-1vcpu-1gb`). See here for a [list of valid size slugs](https://docs.digitalocean.com/reference/api/api-reference/#tag/Databases).
         * 
         * @return builder
         * 
         */
        public Builder size(String size) {
            return size(Either.ofLeft(size));
        }

        /**
         * @param size Database Droplet size associated with the cluster (ex. `db-s-1vcpu-1gb`). See here for a [list of valid size slugs](https://docs.digitalocean.com/reference/api/api-reference/#tag/Databases).
         * 
         * @return builder
         * 
         */
        public Builder size(DatabaseSlug size) {
            return size(Either.ofRight(size));
        }

        /**
         * @param sqlMode A comma separated string specifying the  SQL modes for a MySQL cluster.
         * 
         * @return builder
         * 
         */
        public Builder sqlMode(@Nullable Output<String> sqlMode) {
            $.sqlMode = sqlMode;
            return this;
        }

        /**
         * @param sqlMode A comma separated string specifying the  SQL modes for a MySQL cluster.
         * 
         * @return builder
         * 
         */
        public Builder sqlMode(String sqlMode) {
            return sqlMode(Output.of(sqlMode));
        }

        /**
         * @param tags A list of tag names to be applied to the database cluster.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A list of tag names to be applied to the database cluster.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A list of tag names to be applied to the database cluster.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param uri The full URI for connecting to the database cluster.
         * 
         * @return builder
         * 
         */
        public Builder uri(@Nullable Output<String> uri) {
            $.uri = uri;
            return this;
        }

        /**
         * @param uri The full URI for connecting to the database cluster.
         * 
         * @return builder
         * 
         */
        public Builder uri(String uri) {
            return uri(Output.of(uri));
        }

        /**
         * @param user Username for the cluster&#39;s default user.
         * 
         * @return builder
         * 
         */
        public Builder user(@Nullable Output<String> user) {
            $.user = user;
            return this;
        }

        /**
         * @param user Username for the cluster&#39;s default user.
         * 
         * @return builder
         * 
         */
        public Builder user(String user) {
            return user(Output.of(user));
        }

        /**
         * @param version Engine version used by the cluster (ex. `11` for PostgreSQL 11).
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Engine version used by the cluster (ex. `11` for PostgreSQL 11).
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public DatabaseClusterState build() {
            return $;
        }
    }

}