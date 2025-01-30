// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class DatabaseClusterMaintenanceWindowArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseClusterMaintenanceWindowArgs Empty = new DatabaseClusterMaintenanceWindowArgs();

    /**
     * The day of the week on which to apply maintenance updates. May be one of `monday` through `sunday`.
     * 
     */
    @Import(name="day", required=true)
    private Output<String> day;

    /**
     * @return The day of the week on which to apply maintenance updates. May be one of `monday` through `sunday`.
     * 
     */
    public Output<String> day() {
        return this.day;
    }

    /**
     * The hour in UTC at which maintenance updates will be applied as a string in 24 hour format, e.g. `13:00`.
     * 
     */
    @Import(name="hour", required=true)
    private Output<String> hour;

    /**
     * @return The hour in UTC at which maintenance updates will be applied as a string in 24 hour format, e.g. `13:00`.
     * 
     */
    public Output<String> hour() {
        return this.hour;
    }

    private DatabaseClusterMaintenanceWindowArgs() {}

    private DatabaseClusterMaintenanceWindowArgs(DatabaseClusterMaintenanceWindowArgs $) {
        this.day = $.day;
        this.hour = $.hour;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseClusterMaintenanceWindowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseClusterMaintenanceWindowArgs $;

        public Builder() {
            $ = new DatabaseClusterMaintenanceWindowArgs();
        }

        public Builder(DatabaseClusterMaintenanceWindowArgs defaults) {
            $ = new DatabaseClusterMaintenanceWindowArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param day The day of the week on which to apply maintenance updates. May be one of `monday` through `sunday`.
         * 
         * @return builder
         * 
         */
        public Builder day(Output<String> day) {
            $.day = day;
            return this;
        }

        /**
         * @param day The day of the week on which to apply maintenance updates. May be one of `monday` through `sunday`.
         * 
         * @return builder
         * 
         */
        public Builder day(String day) {
            return day(Output.of(day));
        }

        /**
         * @param hour The hour in UTC at which maintenance updates will be applied as a string in 24 hour format, e.g. `13:00`.
         * 
         * @return builder
         * 
         */
        public Builder hour(Output<String> hour) {
            $.hour = hour;
            return this;
        }

        /**
         * @param hour The hour in UTC at which maintenance updates will be applied as a string in 24 hour format, e.g. `13:00`.
         * 
         * @return builder
         * 
         */
        public Builder hour(String hour) {
            return hour(Output.of(hour));
        }

        public DatabaseClusterMaintenanceWindowArgs build() {
            if ($.day == null) {
                throw new MissingRequiredPropertyException("DatabaseClusterMaintenanceWindowArgs", "day");
            }
            if ($.hour == null) {
                throw new MissingRequiredPropertyException("DatabaseClusterMaintenanceWindowArgs", "hour");
            }
            return $;
        }
    }

}
