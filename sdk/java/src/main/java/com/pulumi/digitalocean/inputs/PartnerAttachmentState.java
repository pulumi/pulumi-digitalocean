// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.digitalocean.inputs.PartnerAttachmentBgpArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PartnerAttachmentState extends com.pulumi.resources.ResourceArgs {

    public static final PartnerAttachmentState Empty = new PartnerAttachmentState();

    @Import(name="bgp")
    private @Nullable Output<PartnerAttachmentBgpArgs> bgp;

    public Optional<Output<PartnerAttachmentBgpArgs>> bgp() {
        return Optional.ofNullable(this.bgp);
    }

    /**
     * The connection bandwidth in Mbps
     * 
     */
    @Import(name="connectionBandwidthInMbps")
    private @Nullable Output<Integer> connectionBandwidthInMbps;

    /**
     * @return The connection bandwidth in Mbps
     * 
     */
    public Optional<Output<Integer>> connectionBandwidthInMbps() {
        return Optional.ofNullable(this.connectionBandwidthInMbps);
    }

    /**
     * The date and time when the Partner Attachment was created
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    /**
     * @return The date and time when the Partner Attachment was created
     * 
     */
    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * The NaaS provider
     * 
     */
    @Import(name="naasProvider")
    private @Nullable Output<String> naasProvider;

    /**
     * @return The NaaS provider
     * 
     */
    public Optional<Output<String>> naasProvider() {
        return Optional.ofNullable(this.naasProvider);
    }

    /**
     * The name of the Partner Attachment
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Partner Attachment
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The region where the Partner Attachment will be created
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The region where the Partner Attachment will be created
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * The state of the Partner Attachment
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The state of the Partner Attachment
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The list of VPC IDs to attach the Partner Attachment to
     * 
     */
    @Import(name="vpcIds")
    private @Nullable Output<List<String>> vpcIds;

    /**
     * @return The list of VPC IDs to attach the Partner Attachment to
     * 
     */
    public Optional<Output<List<String>>> vpcIds() {
        return Optional.ofNullable(this.vpcIds);
    }

    private PartnerAttachmentState() {}

    private PartnerAttachmentState(PartnerAttachmentState $) {
        this.bgp = $.bgp;
        this.connectionBandwidthInMbps = $.connectionBandwidthInMbps;
        this.createdAt = $.createdAt;
        this.naasProvider = $.naasProvider;
        this.name = $.name;
        this.region = $.region;
        this.state = $.state;
        this.vpcIds = $.vpcIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PartnerAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PartnerAttachmentState $;

        public Builder() {
            $ = new PartnerAttachmentState();
        }

        public Builder(PartnerAttachmentState defaults) {
            $ = new PartnerAttachmentState(Objects.requireNonNull(defaults));
        }

        public Builder bgp(@Nullable Output<PartnerAttachmentBgpArgs> bgp) {
            $.bgp = bgp;
            return this;
        }

        public Builder bgp(PartnerAttachmentBgpArgs bgp) {
            return bgp(Output.of(bgp));
        }

        /**
         * @param connectionBandwidthInMbps The connection bandwidth in Mbps
         * 
         * @return builder
         * 
         */
        public Builder connectionBandwidthInMbps(@Nullable Output<Integer> connectionBandwidthInMbps) {
            $.connectionBandwidthInMbps = connectionBandwidthInMbps;
            return this;
        }

        /**
         * @param connectionBandwidthInMbps The connection bandwidth in Mbps
         * 
         * @return builder
         * 
         */
        public Builder connectionBandwidthInMbps(Integer connectionBandwidthInMbps) {
            return connectionBandwidthInMbps(Output.of(connectionBandwidthInMbps));
        }

        /**
         * @param createdAt The date and time when the Partner Attachment was created
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt The date and time when the Partner Attachment was created
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param naasProvider The NaaS provider
         * 
         * @return builder
         * 
         */
        public Builder naasProvider(@Nullable Output<String> naasProvider) {
            $.naasProvider = naasProvider;
            return this;
        }

        /**
         * @param naasProvider The NaaS provider
         * 
         * @return builder
         * 
         */
        public Builder naasProvider(String naasProvider) {
            return naasProvider(Output.of(naasProvider));
        }

        /**
         * @param name The name of the Partner Attachment
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Partner Attachment
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param region The region where the Partner Attachment will be created
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region where the Partner Attachment will be created
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param state The state of the Partner Attachment
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The state of the Partner Attachment
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param vpcIds The list of VPC IDs to attach the Partner Attachment to
         * 
         * @return builder
         * 
         */
        public Builder vpcIds(@Nullable Output<List<String>> vpcIds) {
            $.vpcIds = vpcIds;
            return this;
        }

        /**
         * @param vpcIds The list of VPC IDs to attach the Partner Attachment to
         * 
         * @return builder
         * 
         */
        public Builder vpcIds(List<String> vpcIds) {
            return vpcIds(Output.of(vpcIds));
        }

        /**
         * @param vpcIds The list of VPC IDs to attach the Partner Attachment to
         * 
         * @return builder
         * 
         */
        public Builder vpcIds(String... vpcIds) {
            return vpcIds(List.of(vpcIds));
        }

        public PartnerAttachmentState build() {
            return $;
        }
    }

}
