// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DropletBackupPolicy {
    /**
     * @return The hour of the day that the backup window will start (`0`, `4`, `8`, `12`, `16`, `20`).
     * 
     */
    private @Nullable Integer hour;
    /**
     * @return The backup plan used for the Droplet. The plan can be either `daily` or `weekly`.
     * 
     */
    private @Nullable String plan;
    /**
     * @return The day of the week on which the backup will occur (`SUN`, `MON`, `TUE`, `WED`, `THU`, `FRI`, `SAT`).
     * 
     */
    private @Nullable String weekday;

    private DropletBackupPolicy() {}
    /**
     * @return The hour of the day that the backup window will start (`0`, `4`, `8`, `12`, `16`, `20`).
     * 
     */
    public Optional<Integer> hour() {
        return Optional.ofNullable(this.hour);
    }
    /**
     * @return The backup plan used for the Droplet. The plan can be either `daily` or `weekly`.
     * 
     */
    public Optional<String> plan() {
        return Optional.ofNullable(this.plan);
    }
    /**
     * @return The day of the week on which the backup will occur (`SUN`, `MON`, `TUE`, `WED`, `THU`, `FRI`, `SAT`).
     * 
     */
    public Optional<String> weekday() {
        return Optional.ofNullable(this.weekday);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DropletBackupPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer hour;
        private @Nullable String plan;
        private @Nullable String weekday;
        public Builder() {}
        public Builder(DropletBackupPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hour = defaults.hour;
    	      this.plan = defaults.plan;
    	      this.weekday = defaults.weekday;
        }

        @CustomType.Setter
        public Builder hour(@Nullable Integer hour) {

            this.hour = hour;
            return this;
        }
        @CustomType.Setter
        public Builder plan(@Nullable String plan) {

            this.plan = plan;
            return this;
        }
        @CustomType.Setter
        public Builder weekday(@Nullable String weekday) {

            this.weekday = weekday;
            return this;
        }
        public DropletBackupPolicy build() {
            final var _resultValue = new DropletBackupPolicy();
            _resultValue.hour = hour;
            _resultValue.plan = plan;
            _resultValue.weekday = weekday;
            return _resultValue;
        }
    }
}