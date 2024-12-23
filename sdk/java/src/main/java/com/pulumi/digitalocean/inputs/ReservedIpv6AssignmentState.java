// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReservedIpv6AssignmentState extends com.pulumi.resources.ResourceArgs {

    public static final ReservedIpv6AssignmentState Empty = new ReservedIpv6AssignmentState();

    @Import(name="dropletId")
    private @Nullable Output<Integer> dropletId;

    public Optional<Output<Integer>> dropletId() {
        return Optional.ofNullable(this.dropletId);
    }

    @Import(name="ip")
    private @Nullable Output<String> ip;

    public Optional<Output<String>> ip() {
        return Optional.ofNullable(this.ip);
    }

    private ReservedIpv6AssignmentState() {}

    private ReservedIpv6AssignmentState(ReservedIpv6AssignmentState $) {
        this.dropletId = $.dropletId;
        this.ip = $.ip;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReservedIpv6AssignmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReservedIpv6AssignmentState $;

        public Builder() {
            $ = new ReservedIpv6AssignmentState();
        }

        public Builder(ReservedIpv6AssignmentState defaults) {
            $ = new ReservedIpv6AssignmentState(Objects.requireNonNull(defaults));
        }

        public Builder dropletId(@Nullable Output<Integer> dropletId) {
            $.dropletId = dropletId;
            return this;
        }

        public Builder dropletId(Integer dropletId) {
            return dropletId(Output.of(dropletId));
        }

        public Builder ip(@Nullable Output<String> ip) {
            $.ip = ip;
            return this;
        }

        public Builder ip(String ip) {
            return ip(Output.of(ip));
        }

        public ReservedIpv6AssignmentState build() {
            return $;
        }
    }

}
