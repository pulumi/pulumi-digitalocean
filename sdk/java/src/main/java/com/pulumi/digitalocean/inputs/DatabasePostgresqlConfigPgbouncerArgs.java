// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabasePostgresqlConfigPgbouncerArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabasePostgresqlConfigPgbouncerArgs Empty = new DatabasePostgresqlConfigPgbouncerArgs();

    @Import(name="autodbIdleTimeout")
    private @Nullable Output<Integer> autodbIdleTimeout;

    public Optional<Output<Integer>> autodbIdleTimeout() {
        return Optional.ofNullable(this.autodbIdleTimeout);
    }

    @Import(name="autodbMaxDbConnections")
    private @Nullable Output<Integer> autodbMaxDbConnections;

    public Optional<Output<Integer>> autodbMaxDbConnections() {
        return Optional.ofNullable(this.autodbMaxDbConnections);
    }

    @Import(name="autodbPoolMode")
    private @Nullable Output<String> autodbPoolMode;

    public Optional<Output<String>> autodbPoolMode() {
        return Optional.ofNullable(this.autodbPoolMode);
    }

    @Import(name="autodbPoolSize")
    private @Nullable Output<Integer> autodbPoolSize;

    public Optional<Output<Integer>> autodbPoolSize() {
        return Optional.ofNullable(this.autodbPoolSize);
    }

    @Import(name="ignoreStartupParameters")
    private @Nullable Output<List<String>> ignoreStartupParameters;

    public Optional<Output<List<String>>> ignoreStartupParameters() {
        return Optional.ofNullable(this.ignoreStartupParameters);
    }

    @Import(name="minPoolSize")
    private @Nullable Output<Integer> minPoolSize;

    public Optional<Output<Integer>> minPoolSize() {
        return Optional.ofNullable(this.minPoolSize);
    }

    @Import(name="serverIdleTimeout")
    private @Nullable Output<Integer> serverIdleTimeout;

    public Optional<Output<Integer>> serverIdleTimeout() {
        return Optional.ofNullable(this.serverIdleTimeout);
    }

    @Import(name="serverLifetime")
    private @Nullable Output<Integer> serverLifetime;

    public Optional<Output<Integer>> serverLifetime() {
        return Optional.ofNullable(this.serverLifetime);
    }

    @Import(name="serverResetQueryAlways")
    private @Nullable Output<Boolean> serverResetQueryAlways;

    public Optional<Output<Boolean>> serverResetQueryAlways() {
        return Optional.ofNullable(this.serverResetQueryAlways);
    }

    private DatabasePostgresqlConfigPgbouncerArgs() {}

    private DatabasePostgresqlConfigPgbouncerArgs(DatabasePostgresqlConfigPgbouncerArgs $) {
        this.autodbIdleTimeout = $.autodbIdleTimeout;
        this.autodbMaxDbConnections = $.autodbMaxDbConnections;
        this.autodbPoolMode = $.autodbPoolMode;
        this.autodbPoolSize = $.autodbPoolSize;
        this.ignoreStartupParameters = $.ignoreStartupParameters;
        this.minPoolSize = $.minPoolSize;
        this.serverIdleTimeout = $.serverIdleTimeout;
        this.serverLifetime = $.serverLifetime;
        this.serverResetQueryAlways = $.serverResetQueryAlways;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabasePostgresqlConfigPgbouncerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabasePostgresqlConfigPgbouncerArgs $;

        public Builder() {
            $ = new DatabasePostgresqlConfigPgbouncerArgs();
        }

        public Builder(DatabasePostgresqlConfigPgbouncerArgs defaults) {
            $ = new DatabasePostgresqlConfigPgbouncerArgs(Objects.requireNonNull(defaults));
        }

        public Builder autodbIdleTimeout(@Nullable Output<Integer> autodbIdleTimeout) {
            $.autodbIdleTimeout = autodbIdleTimeout;
            return this;
        }

        public Builder autodbIdleTimeout(Integer autodbIdleTimeout) {
            return autodbIdleTimeout(Output.of(autodbIdleTimeout));
        }

        public Builder autodbMaxDbConnections(@Nullable Output<Integer> autodbMaxDbConnections) {
            $.autodbMaxDbConnections = autodbMaxDbConnections;
            return this;
        }

        public Builder autodbMaxDbConnections(Integer autodbMaxDbConnections) {
            return autodbMaxDbConnections(Output.of(autodbMaxDbConnections));
        }

        public Builder autodbPoolMode(@Nullable Output<String> autodbPoolMode) {
            $.autodbPoolMode = autodbPoolMode;
            return this;
        }

        public Builder autodbPoolMode(String autodbPoolMode) {
            return autodbPoolMode(Output.of(autodbPoolMode));
        }

        public Builder autodbPoolSize(@Nullable Output<Integer> autodbPoolSize) {
            $.autodbPoolSize = autodbPoolSize;
            return this;
        }

        public Builder autodbPoolSize(Integer autodbPoolSize) {
            return autodbPoolSize(Output.of(autodbPoolSize));
        }

        public Builder ignoreStartupParameters(@Nullable Output<List<String>> ignoreStartupParameters) {
            $.ignoreStartupParameters = ignoreStartupParameters;
            return this;
        }

        public Builder ignoreStartupParameters(List<String> ignoreStartupParameters) {
            return ignoreStartupParameters(Output.of(ignoreStartupParameters));
        }

        public Builder ignoreStartupParameters(String... ignoreStartupParameters) {
            return ignoreStartupParameters(List.of(ignoreStartupParameters));
        }

        public Builder minPoolSize(@Nullable Output<Integer> minPoolSize) {
            $.minPoolSize = minPoolSize;
            return this;
        }

        public Builder minPoolSize(Integer minPoolSize) {
            return minPoolSize(Output.of(minPoolSize));
        }

        public Builder serverIdleTimeout(@Nullable Output<Integer> serverIdleTimeout) {
            $.serverIdleTimeout = serverIdleTimeout;
            return this;
        }

        public Builder serverIdleTimeout(Integer serverIdleTimeout) {
            return serverIdleTimeout(Output.of(serverIdleTimeout));
        }

        public Builder serverLifetime(@Nullable Output<Integer> serverLifetime) {
            $.serverLifetime = serverLifetime;
            return this;
        }

        public Builder serverLifetime(Integer serverLifetime) {
            return serverLifetime(Output.of(serverLifetime));
        }

        public Builder serverResetQueryAlways(@Nullable Output<Boolean> serverResetQueryAlways) {
            $.serverResetQueryAlways = serverResetQueryAlways;
            return this;
        }

        public Builder serverResetQueryAlways(Boolean serverResetQueryAlways) {
            return serverResetQueryAlways(Output.of(serverResetQueryAlways));
        }

        public DatabasePostgresqlConfigPgbouncerArgs build() {
            return $;
        }
    }

}
