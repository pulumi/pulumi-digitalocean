// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DropletSnapshotState extends com.pulumi.resources.ResourceArgs {

    public static final DropletSnapshotState Empty = new DropletSnapshotState();

    /**
     * The date and time the Droplet snapshot was created.
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    /**
     * @return The date and time the Droplet snapshot was created.
     * 
     */
    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * The ID of the Droplet from which the snapshot will be taken.
     * 
     */
    @Import(name="dropletId")
    private @Nullable Output<String> dropletId;

    /**
     * @return The ID of the Droplet from which the snapshot will be taken.
     * 
     */
    public Optional<Output<String>> dropletId() {
        return Optional.ofNullable(this.dropletId);
    }

    /**
     * The minimum size in gigabytes required for a Droplet to be created based on this snapshot.
     * 
     */
    @Import(name="minDiskSize")
    private @Nullable Output<Integer> minDiskSize;

    /**
     * @return The minimum size in gigabytes required for a Droplet to be created based on this snapshot.
     * 
     */
    public Optional<Output<Integer>> minDiskSize() {
        return Optional.ofNullable(this.minDiskSize);
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

    /**
     * A list of DigitalOcean region &#34;slugs&#34; indicating where the droplet snapshot is available.
     * 
     */
    @Import(name="regions")
    private @Nullable Output<List<String>> regions;

    /**
     * @return A list of DigitalOcean region &#34;slugs&#34; indicating where the droplet snapshot is available.
     * 
     */
    public Optional<Output<List<String>>> regions() {
        return Optional.ofNullable(this.regions);
    }

    /**
     * The billable size of the Droplet snapshot in gigabytes.
     * 
     */
    @Import(name="size")
    private @Nullable Output<Double> size;

    /**
     * @return The billable size of the Droplet snapshot in gigabytes.
     * 
     */
    public Optional<Output<Double>> size() {
        return Optional.ofNullable(this.size);
    }

    private DropletSnapshotState() {}

    private DropletSnapshotState(DropletSnapshotState $) {
        this.createdAt = $.createdAt;
        this.dropletId = $.dropletId;
        this.minDiskSize = $.minDiskSize;
        this.name = $.name;
        this.regions = $.regions;
        this.size = $.size;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DropletSnapshotState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DropletSnapshotState $;

        public Builder() {
            $ = new DropletSnapshotState();
        }

        public Builder(DropletSnapshotState defaults) {
            $ = new DropletSnapshotState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createdAt The date and time the Droplet snapshot was created.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt The date and time the Droplet snapshot was created.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param dropletId The ID of the Droplet from which the snapshot will be taken.
         * 
         * @return builder
         * 
         */
        public Builder dropletId(@Nullable Output<String> dropletId) {
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
         * @param minDiskSize The minimum size in gigabytes required for a Droplet to be created based on this snapshot.
         * 
         * @return builder
         * 
         */
        public Builder minDiskSize(@Nullable Output<Integer> minDiskSize) {
            $.minDiskSize = minDiskSize;
            return this;
        }

        /**
         * @param minDiskSize The minimum size in gigabytes required for a Droplet to be created based on this snapshot.
         * 
         * @return builder
         * 
         */
        public Builder minDiskSize(Integer minDiskSize) {
            return minDiskSize(Output.of(minDiskSize));
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

        /**
         * @param regions A list of DigitalOcean region &#34;slugs&#34; indicating where the droplet snapshot is available.
         * 
         * @return builder
         * 
         */
        public Builder regions(@Nullable Output<List<String>> regions) {
            $.regions = regions;
            return this;
        }

        /**
         * @param regions A list of DigitalOcean region &#34;slugs&#34; indicating where the droplet snapshot is available.
         * 
         * @return builder
         * 
         */
        public Builder regions(List<String> regions) {
            return regions(Output.of(regions));
        }

        /**
         * @param regions A list of DigitalOcean region &#34;slugs&#34; indicating where the droplet snapshot is available.
         * 
         * @return builder
         * 
         */
        public Builder regions(String... regions) {
            return regions(List.of(regions));
        }

        /**
         * @param size The billable size of the Droplet snapshot in gigabytes.
         * 
         * @return builder
         * 
         */
        public Builder size(@Nullable Output<Double> size) {
            $.size = size;
            return this;
        }

        /**
         * @param size The billable size of the Droplet snapshot in gigabytes.
         * 
         * @return builder
         * 
         */
        public Builder size(Double size) {
            return size(Output.of(size));
        }

        public DropletSnapshotState build() {
            return $;
        }
    }

}
