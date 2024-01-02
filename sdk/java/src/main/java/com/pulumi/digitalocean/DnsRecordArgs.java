// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean;

import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.digitalocean.enums.RecordType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DnsRecordArgs extends com.pulumi.resources.ResourceArgs {

    public static final DnsRecordArgs Empty = new DnsRecordArgs();

    /**
     * The domain to add the record to.
     * 
     */
    @Import(name="domain", required=true)
    private Output<String> domain;

    /**
     * @return The domain to add the record to.
     * 
     */
    public Output<String> domain() {
        return this.domain;
    }

    /**
     * The flags of the record. Only valid when type is `CAA`. Must be between 0 and 255.
     * 
     */
    @Import(name="flags")
    private @Nullable Output<Integer> flags;

    /**
     * @return The flags of the record. Only valid when type is `CAA`. Must be between 0 and 255.
     * 
     */
    public Optional<Output<Integer>> flags() {
        return Optional.ofNullable(this.flags);
    }

    /**
     * The hostname of the record. Use `@` for records on domain&#39;s name itself.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The hostname of the record. Use `@` for records on domain&#39;s name itself.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The port of the record. Only valid when type is `SRV`.  Must be between 1 and 65535.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return The port of the record. Only valid when type is `SRV`.  Must be between 1 and 65535.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * The priority of the record. Only valid when type is `MX` or `SRV`. Must be between 0 and 65535.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return The priority of the record. Only valid when type is `MX` or `SRV`. Must be between 0 and 65535.
     * 
     */
    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * The tag of the record. Only valid when type is `CAA`. Must be one of `issue`, `issuewild`, or `iodef`.
     * 
     */
    @Import(name="tag")
    private @Nullable Output<String> tag;

    /**
     * @return The tag of the record. Only valid when type is `CAA`. Must be one of `issue`, `issuewild`, or `iodef`.
     * 
     */
    public Optional<Output<String>> tag() {
        return Optional.ofNullable(this.tag);
    }

    /**
     * The time to live for the record, in seconds. Must be at least 0. Defaults to 1800.
     * 
     */
    @Import(name="ttl")
    private @Nullable Output<Integer> ttl;

    /**
     * @return The time to live for the record, in seconds. Must be at least 0. Defaults to 1800.
     * 
     */
    public Optional<Output<Integer>> ttl() {
        return Optional.ofNullable(this.ttl);
    }

    /**
     * The type of record. Must be one of `A`, `AAAA`, `CAA`, `CNAME`, `MX`, `NS`, `TXT`, or `SRV`.
     * 
     */
    @Import(name="type", required=true)
    private Output<Either<String,RecordType>> type;

    /**
     * @return The type of record. Must be one of `A`, `AAAA`, `CAA`, `CNAME`, `MX`, `NS`, `TXT`, or `SRV`.
     * 
     */
    public Output<Either<String,RecordType>> type() {
        return this.type;
    }

    /**
     * The value of the record.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The value of the record.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    /**
     * The weight of the record. Only valid when type is `SRV`.  Must be between 0 and 65535.
     * 
     */
    @Import(name="weight")
    private @Nullable Output<Integer> weight;

    /**
     * @return The weight of the record. Only valid when type is `SRV`.  Must be between 0 and 65535.
     * 
     */
    public Optional<Output<Integer>> weight() {
        return Optional.ofNullable(this.weight);
    }

    private DnsRecordArgs() {}

    private DnsRecordArgs(DnsRecordArgs $) {
        this.domain = $.domain;
        this.flags = $.flags;
        this.name = $.name;
        this.port = $.port;
        this.priority = $.priority;
        this.tag = $.tag;
        this.ttl = $.ttl;
        this.type = $.type;
        this.value = $.value;
        this.weight = $.weight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DnsRecordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DnsRecordArgs $;

        public Builder() {
            $ = new DnsRecordArgs();
        }

        public Builder(DnsRecordArgs defaults) {
            $ = new DnsRecordArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domain The domain to add the record to.
         * 
         * @return builder
         * 
         */
        public Builder domain(Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain The domain to add the record to.
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param flags The flags of the record. Only valid when type is `CAA`. Must be between 0 and 255.
         * 
         * @return builder
         * 
         */
        public Builder flags(@Nullable Output<Integer> flags) {
            $.flags = flags;
            return this;
        }

        /**
         * @param flags The flags of the record. Only valid when type is `CAA`. Must be between 0 and 255.
         * 
         * @return builder
         * 
         */
        public Builder flags(Integer flags) {
            return flags(Output.of(flags));
        }

        /**
         * @param name The hostname of the record. Use `@` for records on domain&#39;s name itself.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The hostname of the record. Use `@` for records on domain&#39;s name itself.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param port The port of the record. Only valid when type is `SRV`.  Must be between 1 and 65535.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port of the record. Only valid when type is `SRV`.  Must be between 1 and 65535.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param priority The priority of the record. Only valid when type is `MX` or `SRV`. Must be between 0 and 65535.
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority The priority of the record. Only valid when type is `MX` or `SRV`. Must be between 0 and 65535.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param tag The tag of the record. Only valid when type is `CAA`. Must be one of `issue`, `issuewild`, or `iodef`.
         * 
         * @return builder
         * 
         */
        public Builder tag(@Nullable Output<String> tag) {
            $.tag = tag;
            return this;
        }

        /**
         * @param tag The tag of the record. Only valid when type is `CAA`. Must be one of `issue`, `issuewild`, or `iodef`.
         * 
         * @return builder
         * 
         */
        public Builder tag(String tag) {
            return tag(Output.of(tag));
        }

        /**
         * @param ttl The time to live for the record, in seconds. Must be at least 0. Defaults to 1800.
         * 
         * @return builder
         * 
         */
        public Builder ttl(@Nullable Output<Integer> ttl) {
            $.ttl = ttl;
            return this;
        }

        /**
         * @param ttl The time to live for the record, in seconds. Must be at least 0. Defaults to 1800.
         * 
         * @return builder
         * 
         */
        public Builder ttl(Integer ttl) {
            return ttl(Output.of(ttl));
        }

        /**
         * @param type The type of record. Must be one of `A`, `AAAA`, `CAA`, `CNAME`, `MX`, `NS`, `TXT`, or `SRV`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<Either<String,RecordType>> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of record. Must be one of `A`, `AAAA`, `CAA`, `CNAME`, `MX`, `NS`, `TXT`, or `SRV`.
         * 
         * @return builder
         * 
         */
        public Builder type(Either<String,RecordType> type) {
            return type(Output.of(type));
        }

        /**
         * @param type The type of record. Must be one of `A`, `AAAA`, `CAA`, `CNAME`, `MX`, `NS`, `TXT`, or `SRV`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        /**
         * @param type The type of record. Must be one of `A`, `AAAA`, `CAA`, `CNAME`, `MX`, `NS`, `TXT`, or `SRV`.
         * 
         * @return builder
         * 
         */
        public Builder type(RecordType type) {
            return type(Either.ofRight(type));
        }

        /**
         * @param value The value of the record.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value of the record.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        /**
         * @param weight The weight of the record. Only valid when type is `SRV`.  Must be between 0 and 65535.
         * 
         * @return builder
         * 
         */
        public Builder weight(@Nullable Output<Integer> weight) {
            $.weight = weight;
            return this;
        }

        /**
         * @param weight The weight of the record. Only valid when type is `SRV`.  Must be between 0 and 65535.
         * 
         * @return builder
         * 
         */
        public Builder weight(Integer weight) {
            return weight(Output.of(weight));
        }

        public DnsRecordArgs build() {
            if ($.domain == null) {
                throw new MissingRequiredPropertyException("DnsRecordArgs", "domain");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("DnsRecordArgs", "type");
            }
            if ($.value == null) {
                throw new MissingRequiredPropertyException("DnsRecordArgs", "value");
            }
            return $;
        }
    }

}
