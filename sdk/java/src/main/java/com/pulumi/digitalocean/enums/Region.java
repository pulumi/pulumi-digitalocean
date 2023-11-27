// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum Region {
        NYC1("nyc1"),
        NYC2("nyc2"),
        NYC3("nyc3"),
        SGP1("sgp1"),
        LON1("lon1"),
        AMS2("ams2"),
        AMS3("ams3"),
        FRA1("fra1"),
        TOR1("tor1"),
        SFO1("sfo1"),
        SFO2("sfo2"),
        SFO3("sfo3"),
        BLR1("blr1"),
        SYD1("syd1");

        private final String value;

        Region(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "Region[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
