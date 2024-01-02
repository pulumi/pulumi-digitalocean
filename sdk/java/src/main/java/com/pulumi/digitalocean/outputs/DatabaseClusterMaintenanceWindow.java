// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DatabaseClusterMaintenanceWindow {
    /**
     * @return The day of the week on which to apply maintenance updates.
     * 
     */
    private String day;
    /**
     * @return The hour in UTC at which maintenance updates will be applied in 24 hour format.
     * 
     */
    private String hour;

    private DatabaseClusterMaintenanceWindow() {}
    /**
     * @return The day of the week on which to apply maintenance updates.
     * 
     */
    public String day() {
        return this.day;
    }
    /**
     * @return The hour in UTC at which maintenance updates will be applied in 24 hour format.
     * 
     */
    public String hour() {
        return this.hour;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseClusterMaintenanceWindow defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String day;
        private String hour;
        public Builder() {}
        public Builder(DatabaseClusterMaintenanceWindow defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.hour = defaults.hour;
        }

        @CustomType.Setter
        public Builder day(String day) {
            if (day == null) {
              throw new MissingRequiredPropertyException("DatabaseClusterMaintenanceWindow", "day");
            }
            this.day = day;
            return this;
        }
        @CustomType.Setter
        public Builder hour(String hour) {
            if (hour == null) {
              throw new MissingRequiredPropertyException("DatabaseClusterMaintenanceWindow", "hour");
            }
            this.hour = hour;
            return this;
        }
        public DatabaseClusterMaintenanceWindow build() {
            final var _resultValue = new DatabaseClusterMaintenanceWindow();
            _resultValue.day = day;
            _resultValue.hour = hour;
            return _resultValue;
        }
    }
}
