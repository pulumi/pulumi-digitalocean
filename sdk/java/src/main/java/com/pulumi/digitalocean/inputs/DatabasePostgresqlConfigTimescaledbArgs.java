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

    @Import(name="maxBackgroundWorkers")
    private @Nullable Output<Integer> maxBackgroundWorkers;

    public Optional<Output<Integer>> maxBackgroundWorkers() {
        return Optional.ofNullable(this.maxBackgroundWorkers);
    }

    private DatabasePostgresqlConfigTimescaledbArgs() {}

    private DatabasePostgresqlConfigTimescaledbArgs(DatabasePostgresqlConfigTimescaledbArgs $) {
        this.maxBackgroundWorkers = $.maxBackgroundWorkers;
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

        public Builder maxBackgroundWorkers(@Nullable Output<Integer> maxBackgroundWorkers) {
            $.maxBackgroundWorkers = maxBackgroundWorkers;
            return this;
        }

        public Builder maxBackgroundWorkers(Integer maxBackgroundWorkers) {
            return maxBackgroundWorkers(Output.of(maxBackgroundWorkers));
        }

        public DatabasePostgresqlConfigTimescaledbArgs build() {
            return $;
        }
    }

}