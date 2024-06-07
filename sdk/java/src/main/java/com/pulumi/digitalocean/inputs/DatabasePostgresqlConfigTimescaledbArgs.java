// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabasePostgresqlConfigTimescaledbArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabasePostgresqlConfigTimescaledbArgs Empty = new DatabasePostgresqlConfigTimescaledbArgs();

    /**
     * TimescaleDB extension configuration values
     * 
     */
    @Import(name="timescaledb")
    private @Nullable Output<Integer> timescaledb;

    /**
     * @return TimescaleDB extension configuration values
     * 
     */
    public Optional<Output<Integer>> timescaledb() {
        return Optional.ofNullable(this.timescaledb);
    }

    private DatabasePostgresqlConfigTimescaledbArgs() {}

    private DatabasePostgresqlConfigTimescaledbArgs(DatabasePostgresqlConfigTimescaledbArgs $) {
        this.timescaledb = $.timescaledb;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabasePostgresqlConfigTimescaledbArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabasePostgresqlConfigTimescaledbArgs $;

        public Builder() {
            $ = new DatabasePostgresqlConfigTimescaledbArgs();
        }

        public Builder(DatabasePostgresqlConfigTimescaledbArgs defaults) {
            $ = new DatabasePostgresqlConfigTimescaledbArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param timescaledb TimescaleDB extension configuration values
         * 
         * @return builder
         * 
         */
        public Builder timescaledb(@Nullable Output<Integer> timescaledb) {
            $.timescaledb = timescaledb;
            return this;
        }

        /**
         * @param timescaledb TimescaleDB extension configuration values
         * 
         * @return builder
         * 
         */
        public Builder timescaledb(Integer timescaledb) {
            return timescaledb(Output.of(timescaledb));
        }

        public DatabasePostgresqlConfigTimescaledbArgs build() {
            return $;
        }
    }

}
