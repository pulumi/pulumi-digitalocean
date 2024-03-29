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


public final class FloatingIpAssignmentState extends com.pulumi.resources.ResourceArgs {

    public static final FloatingIpAssignmentState Empty = new FloatingIpAssignmentState();

    /**
     * The ID of Droplet that the Floating IP will be assigned to.
     * 
     */
    @Import(name="dropletId")
    private @Nullable Output<Integer> dropletId;

    /**
     * @return The ID of Droplet that the Floating IP will be assigned to.
     * 
     */
    public Optional<Output<Integer>> dropletId() {
        return Optional.ofNullable(this.dropletId);
    }

    /**
     * The Floating IP to assign to the Droplet.
     * 
     */
    @Import(name="ipAddress")
    private @Nullable Output<String> ipAddress;

    /**
     * @return The Floating IP to assign to the Droplet.
     * 
     */
    public Optional<Output<String>> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    private FloatingIpAssignmentState() {}

    private FloatingIpAssignmentState(FloatingIpAssignmentState $) {
        this.dropletId = $.dropletId;
        this.ipAddress = $.ipAddress;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FloatingIpAssignmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FloatingIpAssignmentState $;

        public Builder() {
            $ = new FloatingIpAssignmentState();
        }

        public Builder(FloatingIpAssignmentState defaults) {
            $ = new FloatingIpAssignmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param dropletId The ID of Droplet that the Floating IP will be assigned to.
         * 
         * @return builder
         * 
         */
        public Builder dropletId(@Nullable Output<Integer> dropletId) {
            $.dropletId = dropletId;
            return this;
        }

        /**
         * @param dropletId The ID of Droplet that the Floating IP will be assigned to.
         * 
         * @return builder
         * 
         */
        public Builder dropletId(Integer dropletId) {
            return dropletId(Output.of(dropletId));
        }

        /**
         * @param ipAddress The Floating IP to assign to the Droplet.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        /**
         * @param ipAddress The Floating IP to assign to the Droplet.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(String ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        public FloatingIpAssignmentState build() {
            return $;
        }
    }

}
