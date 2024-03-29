// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.digitalocean.inputs.DatabaseUserSettingArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabaseUserState extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseUserState Empty = new DatabaseUserState();

    /**
     * Access certificate for TLS client authentication. (Kafka only)
     * 
     */
    @Import(name="accessCert")
    private @Nullable Output<String> accessCert;

    /**
     * @return Access certificate for TLS client authentication. (Kafka only)
     * 
     */
    public Optional<Output<String>> accessCert() {
        return Optional.ofNullable(this.accessCert);
    }

    /**
     * Access key for TLS client authentication. (Kafka only)
     * 
     */
    @Import(name="accessKey")
    private @Nullable Output<String> accessKey;

    /**
     * @return Access key for TLS client authentication. (Kafka only)
     * 
     */
    public Optional<Output<String>> accessKey() {
        return Optional.ofNullable(this.accessKey);
    }

    /**
     * The ID of the original source database cluster.
     * 
     */
    @Import(name="clusterId")
    private @Nullable Output<String> clusterId;

    /**
     * @return The ID of the original source database cluster.
     * 
     */
    public Optional<Output<String>> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }

    /**
     * The authentication method to use for connections to the MySQL user account. The valid values are `mysql_native_password` or `caching_sha2_password` (this is the default).
     * 
     */
    @Import(name="mysqlAuthPlugin")
    private @Nullable Output<String> mysqlAuthPlugin;

    /**
     * @return The authentication method to use for connections to the MySQL user account. The valid values are `mysql_native_password` or `caching_sha2_password` (this is the default).
     * 
     */
    public Optional<Output<String>> mysqlAuthPlugin() {
        return Optional.ofNullable(this.mysqlAuthPlugin);
    }

    /**
     * The name for the database user.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name for the database user.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Password for the database user.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return Password for the database user.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * Role for the database user. The value will be either &#34;primary&#34; or &#34;normal&#34;.
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return Role for the database user. The value will be either &#34;primary&#34; or &#34;normal&#34;.
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    /**
     * Contains optional settings for the user.
     * The `settings` block is documented below.
     * 
     */
    @Import(name="settings")
    private @Nullable Output<List<DatabaseUserSettingArgs>> settings;

    /**
     * @return Contains optional settings for the user.
     * The `settings` block is documented below.
     * 
     */
    public Optional<Output<List<DatabaseUserSettingArgs>>> settings() {
        return Optional.ofNullable(this.settings);
    }

    private DatabaseUserState() {}

    private DatabaseUserState(DatabaseUserState $) {
        this.accessCert = $.accessCert;
        this.accessKey = $.accessKey;
        this.clusterId = $.clusterId;
        this.mysqlAuthPlugin = $.mysqlAuthPlugin;
        this.name = $.name;
        this.password = $.password;
        this.role = $.role;
        this.settings = $.settings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseUserState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseUserState $;

        public Builder() {
            $ = new DatabaseUserState();
        }

        public Builder(DatabaseUserState defaults) {
            $ = new DatabaseUserState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessCert Access certificate for TLS client authentication. (Kafka only)
         * 
         * @return builder
         * 
         */
        public Builder accessCert(@Nullable Output<String> accessCert) {
            $.accessCert = accessCert;
            return this;
        }

        /**
         * @param accessCert Access certificate for TLS client authentication. (Kafka only)
         * 
         * @return builder
         * 
         */
        public Builder accessCert(String accessCert) {
            return accessCert(Output.of(accessCert));
        }

        /**
         * @param accessKey Access key for TLS client authentication. (Kafka only)
         * 
         * @return builder
         * 
         */
        public Builder accessKey(@Nullable Output<String> accessKey) {
            $.accessKey = accessKey;
            return this;
        }

        /**
         * @param accessKey Access key for TLS client authentication. (Kafka only)
         * 
         * @return builder
         * 
         */
        public Builder accessKey(String accessKey) {
            return accessKey(Output.of(accessKey));
        }

        /**
         * @param clusterId The ID of the original source database cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(@Nullable Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId The ID of the original source database cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        /**
         * @param mysqlAuthPlugin The authentication method to use for connections to the MySQL user account. The valid values are `mysql_native_password` or `caching_sha2_password` (this is the default).
         * 
         * @return builder
         * 
         */
        public Builder mysqlAuthPlugin(@Nullable Output<String> mysqlAuthPlugin) {
            $.mysqlAuthPlugin = mysqlAuthPlugin;
            return this;
        }

        /**
         * @param mysqlAuthPlugin The authentication method to use for connections to the MySQL user account. The valid values are `mysql_native_password` or `caching_sha2_password` (this is the default).
         * 
         * @return builder
         * 
         */
        public Builder mysqlAuthPlugin(String mysqlAuthPlugin) {
            return mysqlAuthPlugin(Output.of(mysqlAuthPlugin));
        }

        /**
         * @param name The name for the database user.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name for the database user.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param password Password for the database user.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Password for the database user.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param role Role for the database user. The value will be either &#34;primary&#34; or &#34;normal&#34;.
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role Role for the database user. The value will be either &#34;primary&#34; or &#34;normal&#34;.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        /**
         * @param settings Contains optional settings for the user.
         * The `settings` block is documented below.
         * 
         * @return builder
         * 
         */
        public Builder settings(@Nullable Output<List<DatabaseUserSettingArgs>> settings) {
            $.settings = settings;
            return this;
        }

        /**
         * @param settings Contains optional settings for the user.
         * The `settings` block is documented below.
         * 
         * @return builder
         * 
         */
        public Builder settings(List<DatabaseUserSettingArgs> settings) {
            return settings(Output.of(settings));
        }

        /**
         * @param settings Contains optional settings for the user.
         * The `settings` block is documented below.
         * 
         * @return builder
         * 
         */
        public Builder settings(DatabaseUserSettingArgs... settings) {
            return settings(List.of(settings));
        }

        public DatabaseUserState build() {
            return $;
        }
    }

}
