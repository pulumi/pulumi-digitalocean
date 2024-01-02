// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.digitalocean.outputs.GetDatabaseClusterMaintenanceWindow;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetDatabaseClusterResult {
    /**
     * @return Name of the cluster&#39;s default database.
     * 
     */
    private String database;
    /**
     * @return Database engine used by the cluster (ex. `pg` for PostreSQL).
     * 
     */
    private String engine;
    /**
     * @return Database cluster&#39;s hostname.
     * 
     */
    private String host;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Defines when the automatic maintenance should be performed for the database cluster.
     * 
     */
    private List<GetDatabaseClusterMaintenanceWindow> maintenanceWindows;
    private String name;
    /**
     * @return Number of nodes that will be included in the cluster.
     * 
     */
    private Integer nodeCount;
    /**
     * @return Password for the cluster&#39;s default user.
     * 
     */
    private String password;
    /**
     * @return Network port that the database cluster is listening on.
     * 
     */
    private Integer port;
    /**
     * @return Same as `host`, but only accessible from resources within the account and in the same region.
     * 
     */
    private String privateHost;
    /**
     * @return The ID of the VPC where the database cluster is located.
     * 
     */
    private String privateNetworkUuid;
    /**
     * @return Same as `uri`, but only accessible from resources within the account and in the same region.
     * 
     */
    private String privateUri;
    /**
     * @return The ID of the project that the database cluster is assigned to.
     * 
     */
    private String projectId;
    /**
     * @return DigitalOcean region where the cluster will reside.
     * 
     */
    private String region;
    /**
     * @return Database droplet size associated with the cluster (ex. `db-s-1vcpu-1gb`).
     * 
     */
    private String size;
    private String storageSizeMib;
    private @Nullable List<String> tags;
    /**
     * @return The full URI for connecting to the database cluster.
     * 
     */
    private String uri;
    /**
     * @return The uniform resource name of the database cluster.
     * 
     */
    private String urn;
    /**
     * @return Username for the cluster&#39;s default user.
     * 
     */
    private String user;
    /**
     * @return Engine version used by the cluster (ex. `11` for PostgreSQL 11).
     * 
     */
    private String version;

    private GetDatabaseClusterResult() {}
    /**
     * @return Name of the cluster&#39;s default database.
     * 
     */
    public String database() {
        return this.database;
    }
    /**
     * @return Database engine used by the cluster (ex. `pg` for PostreSQL).
     * 
     */
    public String engine() {
        return this.engine;
    }
    /**
     * @return Database cluster&#39;s hostname.
     * 
     */
    public String host() {
        return this.host;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Defines when the automatic maintenance should be performed for the database cluster.
     * 
     */
    public List<GetDatabaseClusterMaintenanceWindow> maintenanceWindows() {
        return this.maintenanceWindows;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return Number of nodes that will be included in the cluster.
     * 
     */
    public Integer nodeCount() {
        return this.nodeCount;
    }
    /**
     * @return Password for the cluster&#39;s default user.
     * 
     */
    public String password() {
        return this.password;
    }
    /**
     * @return Network port that the database cluster is listening on.
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return Same as `host`, but only accessible from resources within the account and in the same region.
     * 
     */
    public String privateHost() {
        return this.privateHost;
    }
    /**
     * @return The ID of the VPC where the database cluster is located.
     * 
     */
    public String privateNetworkUuid() {
        return this.privateNetworkUuid;
    }
    /**
     * @return Same as `uri`, but only accessible from resources within the account and in the same region.
     * 
     */
    public String privateUri() {
        return this.privateUri;
    }
    /**
     * @return The ID of the project that the database cluster is assigned to.
     * 
     */
    public String projectId() {
        return this.projectId;
    }
    /**
     * @return DigitalOcean region where the cluster will reside.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return Database droplet size associated with the cluster (ex. `db-s-1vcpu-1gb`).
     * 
     */
    public String size() {
        return this.size;
    }
    public String storageSizeMib() {
        return this.storageSizeMib;
    }
    public List<String> tags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * @return The full URI for connecting to the database cluster.
     * 
     */
    public String uri() {
        return this.uri;
    }
    /**
     * @return The uniform resource name of the database cluster.
     * 
     */
    public String urn() {
        return this.urn;
    }
    /**
     * @return Username for the cluster&#39;s default user.
     * 
     */
    public String user() {
        return this.user;
    }
    /**
     * @return Engine version used by the cluster (ex. `11` for PostgreSQL 11).
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseClusterResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String database;
        private String engine;
        private String host;
        private String id;
        private List<GetDatabaseClusterMaintenanceWindow> maintenanceWindows;
        private String name;
        private Integer nodeCount;
        private String password;
        private Integer port;
        private String privateHost;
        private String privateNetworkUuid;
        private String privateUri;
        private String projectId;
        private String region;
        private String size;
        private String storageSizeMib;
        private @Nullable List<String> tags;
        private String uri;
        private String urn;
        private String user;
        private String version;
        public Builder() {}
        public Builder(GetDatabaseClusterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.engine = defaults.engine;
    	      this.host = defaults.host;
    	      this.id = defaults.id;
    	      this.maintenanceWindows = defaults.maintenanceWindows;
    	      this.name = defaults.name;
    	      this.nodeCount = defaults.nodeCount;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.privateHost = defaults.privateHost;
    	      this.privateNetworkUuid = defaults.privateNetworkUuid;
    	      this.privateUri = defaults.privateUri;
    	      this.projectId = defaults.projectId;
    	      this.region = defaults.region;
    	      this.size = defaults.size;
    	      this.storageSizeMib = defaults.storageSizeMib;
    	      this.tags = defaults.tags;
    	      this.uri = defaults.uri;
    	      this.urn = defaults.urn;
    	      this.user = defaults.user;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder database(String database) {
            if (database == null) {
              throw new MissingRequiredPropertyException("GetDatabaseClusterResult", "database");
            }
            this.database = database;
            return this;
        }
        @CustomType.Setter
        public Builder engine(String engine) {
            if (engine == null) {
              throw new MissingRequiredPropertyException("GetDatabaseClusterResult", "engine");
            }
            this.engine = engine;
            return this;
        }
        @CustomType.Setter
        public Builder host(String host) {
            if (host == null) {
              throw new MissingRequiredPropertyException("GetDatabaseClusterResult", "host");
            }
            this.host = host;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetDatabaseClusterResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder maintenanceWindows(List<GetDatabaseClusterMaintenanceWindow> maintenanceWindows) {
            if (maintenanceWindows == null) {
              throw new MissingRequiredPropertyException("GetDatabaseClusterResult", "maintenanceWindows");
            }
            this.maintenanceWindows = maintenanceWindows;
            return this;
        }
        public Builder maintenanceWindows(GetDatabaseClusterMaintenanceWindow... maintenanceWindows) {
            return maintenanceWindows(List.of(maintenanceWindows));
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetDatabaseClusterResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder nodeCount(Integer nodeCount) {
            if (nodeCount == null) {
              throw new MissingRequiredPropertyException("GetDatabaseClusterResult", "nodeCount");
            }
            this.nodeCount = nodeCount;
            return this;
        }
        @CustomType.Setter
        public Builder password(String password) {
            if (password == null) {
              throw new MissingRequiredPropertyException("GetDatabaseClusterResult", "password");
            }
            this.password = password;
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("GetDatabaseClusterResult", "port");
            }
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder privateHost(String privateHost) {
            if (privateHost == null) {
              throw new MissingRequiredPropertyException("GetDatabaseClusterResult", "privateHost");
            }
            this.privateHost = privateHost;
            return this;
        }
        @CustomType.Setter
        public Builder privateNetworkUuid(String privateNetworkUuid) {
            if (privateNetworkUuid == null) {
              throw new MissingRequiredPropertyException("GetDatabaseClusterResult", "privateNetworkUuid");
            }
            this.privateNetworkUuid = privateNetworkUuid;
            return this;
        }
        @CustomType.Setter
        public Builder privateUri(String privateUri) {
            if (privateUri == null) {
              throw new MissingRequiredPropertyException("GetDatabaseClusterResult", "privateUri");
            }
            this.privateUri = privateUri;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("GetDatabaseClusterResult", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            if (region == null) {
              throw new MissingRequiredPropertyException("GetDatabaseClusterResult", "region");
            }
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder size(String size) {
            if (size == null) {
              throw new MissingRequiredPropertyException("GetDatabaseClusterResult", "size");
            }
            this.size = size;
            return this;
        }
        @CustomType.Setter
        public Builder storageSizeMib(String storageSizeMib) {
            if (storageSizeMib == null) {
              throw new MissingRequiredPropertyException("GetDatabaseClusterResult", "storageSizeMib");
            }
            this.storageSizeMib = storageSizeMib;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable List<String> tags) {

            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder uri(String uri) {
            if (uri == null) {
              throw new MissingRequiredPropertyException("GetDatabaseClusterResult", "uri");
            }
            this.uri = uri;
            return this;
        }
        @CustomType.Setter
        public Builder urn(String urn) {
            if (urn == null) {
              throw new MissingRequiredPropertyException("GetDatabaseClusterResult", "urn");
            }
            this.urn = urn;
            return this;
        }
        @CustomType.Setter
        public Builder user(String user) {
            if (user == null) {
              throw new MissingRequiredPropertyException("GetDatabaseClusterResult", "user");
            }
            this.user = user;
            return this;
        }
        @CustomType.Setter
        public Builder version(String version) {
            if (version == null) {
              throw new MissingRequiredPropertyException("GetDatabaseClusterResult", "version");
            }
            this.version = version;
            return this;
        }
        public GetDatabaseClusterResult build() {
            final var _resultValue = new GetDatabaseClusterResult();
            _resultValue.database = database;
            _resultValue.engine = engine;
            _resultValue.host = host;
            _resultValue.id = id;
            _resultValue.maintenanceWindows = maintenanceWindows;
            _resultValue.name = name;
            _resultValue.nodeCount = nodeCount;
            _resultValue.password = password;
            _resultValue.port = port;
            _resultValue.privateHost = privateHost;
            _resultValue.privateNetworkUuid = privateNetworkUuid;
            _resultValue.privateUri = privateUri;
            _resultValue.projectId = projectId;
            _resultValue.region = region;
            _resultValue.size = size;
            _resultValue.storageSizeMib = storageSizeMib;
            _resultValue.tags = tags;
            _resultValue.uri = uri;
            _resultValue.urn = urn;
            _resultValue.user = user;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
