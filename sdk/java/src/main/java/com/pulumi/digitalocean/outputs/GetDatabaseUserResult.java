// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.digitalocean.outputs.GetDatabaseUserSetting;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDatabaseUserResult {
    /**
     * @return Access certificate for TLS client authentication. (Kafka only)
     * 
     */
    private String accessCert;
    /**
     * @return Access key for TLS client authentication. (Kafka only)
     * 
     */
    private String accessKey;
    private String clusterId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The authentication method of the MySQL user. The value will be `mysql_native_password` or `caching_sha2_password`.
     * 
     */
    private String mysqlAuthPlugin;
    private String name;
    /**
     * @return The password of the database user. This will not be set for MongoDB users.
     * 
     */
    private String password;
    /**
     * @return The role of the database user. The value will be either `primary` or `normal`.
     * 
     */
    private String role;
    private List<GetDatabaseUserSetting> settings;

    private GetDatabaseUserResult() {}
    /**
     * @return Access certificate for TLS client authentication. (Kafka only)
     * 
     */
    public String accessCert() {
        return this.accessCert;
    }
    /**
     * @return Access key for TLS client authentication. (Kafka only)
     * 
     */
    public String accessKey() {
        return this.accessKey;
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
    /**
     * @return The authentication method of the MySQL user. The value will be `mysql_native_password` or `caching_sha2_password`.
     * 
     */
    public String mysqlAuthPlugin() {
        return this.mysqlAuthPlugin;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return The password of the database user. This will not be set for MongoDB users.
     * 
     */
    public String password() {
        return this.password;
    }
    /**
     * @return The role of the database user. The value will be either `primary` or `normal`.
     * 
     */
    public String role() {
        return this.role;
    }
    public List<GetDatabaseUserSetting> settings() {
        return this.settings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseUserResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accessCert;
        private String accessKey;
        private String clusterId;
        private String id;
        private String mysqlAuthPlugin;
        private String name;
        private String password;
        private String role;
        private List<GetDatabaseUserSetting> settings;
        public Builder() {}
        public Builder(GetDatabaseUserResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessCert = defaults.accessCert;
    	      this.accessKey = defaults.accessKey;
    	      this.clusterId = defaults.clusterId;
    	      this.id = defaults.id;
    	      this.mysqlAuthPlugin = defaults.mysqlAuthPlugin;
    	      this.name = defaults.name;
    	      this.password = defaults.password;
    	      this.role = defaults.role;
    	      this.settings = defaults.settings;
        }

        @CustomType.Setter
        public Builder accessCert(String accessCert) {
            if (accessCert == null) {
              throw new MissingRequiredPropertyException("GetDatabaseUserResult", "accessCert");
            }
            this.accessCert = accessCert;
            return this;
        }
        @CustomType.Setter
        public Builder accessKey(String accessKey) {
            if (accessKey == null) {
              throw new MissingRequiredPropertyException("GetDatabaseUserResult", "accessKey");
            }
            this.accessKey = accessKey;
            return this;
        }
        @CustomType.Setter
        public Builder clusterId(String clusterId) {
            if (clusterId == null) {
              throw new MissingRequiredPropertyException("GetDatabaseUserResult", "clusterId");
            }
            this.clusterId = clusterId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetDatabaseUserResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder mysqlAuthPlugin(String mysqlAuthPlugin) {
            if (mysqlAuthPlugin == null) {
              throw new MissingRequiredPropertyException("GetDatabaseUserResult", "mysqlAuthPlugin");
            }
            this.mysqlAuthPlugin = mysqlAuthPlugin;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetDatabaseUserResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder password(String password) {
            if (password == null) {
              throw new MissingRequiredPropertyException("GetDatabaseUserResult", "password");
            }
            this.password = password;
            return this;
        }
        @CustomType.Setter
        public Builder role(String role) {
            if (role == null) {
              throw new MissingRequiredPropertyException("GetDatabaseUserResult", "role");
            }
            this.role = role;
            return this;
        }
        @CustomType.Setter
        public Builder settings(List<GetDatabaseUserSetting> settings) {
            if (settings == null) {
              throw new MissingRequiredPropertyException("GetDatabaseUserResult", "settings");
            }
            this.settings = settings;
            return this;
        }
        public Builder settings(GetDatabaseUserSetting... settings) {
            return settings(List.of(settings));
        }
        public GetDatabaseUserResult build() {
            final var _resultValue = new GetDatabaseUserResult();
            _resultValue.accessCert = accessCert;
            _resultValue.accessKey = accessKey;
            _resultValue.clusterId = clusterId;
            _resultValue.id = id;
            _resultValue.mysqlAuthPlugin = mysqlAuthPlugin;
            _resultValue.name = name;
            _resultValue.password = password;
            _resultValue.role = role;
            _resultValue.settings = settings;
            return _resultValue;
        }
    }
}
