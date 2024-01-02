// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DropletSnapshotArgs extends com.pulumi.resources.ResourceArgs {

    public static final DropletSnapshotArgs Empty = new DropletSnapshotArgs();

    /**
     * The ID of the Droplet from which the snapshot will be taken.
     * 
     */
    @Import(name="dropletId", required=true)
    private Output<String> dropletId;

    /**
     * @return The ID of the Droplet from which the snapshot will be taken.
     * 
     */
    public Output<String> dropletId() {
        return this.dropletId;
    }

    /**
     * A name for the Droplet snapshot.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A name for the Droplet snapshot.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private DropletSnapshotArgs() {}

    private DropletSnapshotArgs(DropletSnapshotArgs $) {
        this.dropletId = $.dropletId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DropletSnapshotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DropletSnapshotArgs $;

        public Builder() {
            $ = new DropletSnapshotArgs();
        }

        public Builder(DropletSnapshotArgs defaults) {
            $ = new DropletSnapshotArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dropletId The ID of the Droplet from which the snapshot will be taken.
         * 
         * @return builder
         * 
         */
        public Builder dropletId(Output<String> dropletId) {
            $.dropletId = dropletId;
            return this;
        }

        /**
         * @param dropletId The ID of the Droplet from which the snapshot will be taken.
         * 
         * @return builder
         * 
         */
        public Builder dropletId(String dropletId) {
            return dropletId(Output.of(dropletId));
        }

        /**
         * @param name A name for the Droplet snapshot.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A name for the Droplet snapshot.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public DropletSnapshotArgs build() {
            if ($.dropletId == null) {
                throw new MissingRequiredPropertyException("DropletSnapshotArgs", "dropletId");
            }
            return $;
        }
    }

}
