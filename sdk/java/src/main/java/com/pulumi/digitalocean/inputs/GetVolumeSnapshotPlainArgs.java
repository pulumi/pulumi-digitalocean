// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVolumeSnapshotPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVolumeSnapshotPlainArgs Empty = new GetVolumeSnapshotPlainArgs();

    /**
     * If more than one result is returned, use the most recent volume snapshot.
     * 
     * &gt; **NOTE:** If more or less than a single match is returned by the search,
     * the provider will fail. Ensure that your search is specific enough to return
     * a single volume snapshot ID only, or use `most_recent` to choose the most recent one.
     * 
     */
    @Import(name="mostRecent")
    private @Nullable Boolean mostRecent;

    /**
     * @return If more than one result is returned, use the most recent volume snapshot.
     * 
     * &gt; **NOTE:** If more or less than a single match is returned by the search,
     * the provider will fail. Ensure that your search is specific enough to return
     * a single volume snapshot ID only, or use `most_recent` to choose the most recent one.
     * 
     */
    public Optional<Boolean> mostRecent() {
        return Optional.ofNullable(this.mostRecent);
    }

    /**
     * The name of the volume snapshot.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name of the volume snapshot.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A regex string to apply to the volume snapshot list returned by DigitalOcean. This allows more advanced filtering not supported from the DigitalOcean API. This filtering is done locally on what DigitalOcean returns.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to apply to the volume snapshot list returned by DigitalOcean. This allows more advanced filtering not supported from the DigitalOcean API. This filtering is done locally on what DigitalOcean returns.
     * 
     */
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    /**
     * A &#34;slug&#34; representing a DigitalOcean region (e.g. `nyc1`). If set, only volume snapshots available in the region will be returned.
     * 
     */
    @Import(name="region")
    private @Nullable String region;

    /**
     * @return A &#34;slug&#34; representing a DigitalOcean region (e.g. `nyc1`). If set, only volume snapshots available in the region will be returned.
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }

    private GetVolumeSnapshotPlainArgs() {}

    private GetVolumeSnapshotPlainArgs(GetVolumeSnapshotPlainArgs $) {
        this.mostRecent = $.mostRecent;
        this.name = $.name;
        this.nameRegex = $.nameRegex;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVolumeSnapshotPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVolumeSnapshotPlainArgs $;

        public Builder() {
            $ = new GetVolumeSnapshotPlainArgs();
        }

        public Builder(GetVolumeSnapshotPlainArgs defaults) {
            $ = new GetVolumeSnapshotPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mostRecent If more than one result is returned, use the most recent volume snapshot.
         * 
         * &gt; **NOTE:** If more or less than a single match is returned by the search,
         * the provider will fail. Ensure that your search is specific enough to return
         * a single volume snapshot ID only, or use `most_recent` to choose the most recent one.
         * 
         * @return builder
         * 
         */
        public Builder mostRecent(@Nullable Boolean mostRecent) {
            $.mostRecent = mostRecent;
            return this;
        }

        /**
         * @param name The name of the volume snapshot.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param nameRegex A regex string to apply to the volume snapshot list returned by DigitalOcean. This allows more advanced filtering not supported from the DigitalOcean API. This filtering is done locally on what DigitalOcean returns.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable String nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param region A &#34;slug&#34; representing a DigitalOcean region (e.g. `nyc1`). If set, only volume snapshots available in the region will be returned.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable String region) {
            $.region = region;
            return this;
        }

        public GetVolumeSnapshotPlainArgs build() {
            return $;
        }
    }

}
