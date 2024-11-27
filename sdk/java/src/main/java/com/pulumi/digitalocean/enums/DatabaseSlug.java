// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum DatabaseSlug {
        DB_1VPCU1GB("db-s-1vcpu-1gb"),
        DB_1VPCU2GB("db-s-1vcpu-2gb"),
        DB_2VPCU4GB("db-s-2vcpu-4gb"),
        DB_4VPCU8GB("db-s-4vcpu-8gb"),
        DB_6VPCU16GB("db-s-6vcpu-16gb"),
        DB_8VPCU32GB("db-s-8vcpu-32gb"),
        DB_16VPCU64GB("db-s-16vcpu-64gb");

        private final String value;

        DatabaseSlug(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public java.lang.String toString() {
            return new StringJoiner(", ", "DatabaseSlug[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }