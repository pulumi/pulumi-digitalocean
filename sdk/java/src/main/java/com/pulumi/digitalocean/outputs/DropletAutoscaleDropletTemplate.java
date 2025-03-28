// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DropletAutoscaleDropletTemplate {
    /**
     * @return Image slug of the Droplet Autoscale pool underlying resource(s).
     * 
     */
    private String image;
    /**
     * @return Boolean flag to enable IPv6 networking on the Droplet Autoscale pool underlying resource(s).
     * 
     */
    private @Nullable Boolean ipv6;
    /**
     * @return Project UUID to create the Droplet Autoscale pool underlying resource(s).
     * 
     */
    private @Nullable String projectId;
    /**
     * @return Region slug of the Droplet Autoscale pool underlying resource(s).
     * 
     */
    private String region;
    /**
     * @return Size slug of the Droplet Autoscale pool underlying resource(s).
     * 
     */
    private String size;
    /**
     * @return SSH fingerprints to add to the Droplet Autoscale pool underlying resource(s).
     * 
     */
    private List<String> sshKeys;
    /**
     * @return List of tags to add to the Droplet Autoscale pool underlying resource(s).
     * 
     */
    private @Nullable List<String> tags;
    /**
     * @return Custom user data that can be added to the Droplet Autoscale pool underlying resource(s). This can be a
     * cloud init script that user may configure to setup their application workload.
     * 
     */
    private @Nullable String userData;
    /**
     * @return VPC UUID to create the Droplet Autoscale pool underlying resource(s). If not provided, this is inferred
     * from the specified `region` (default VPC).
     * 
     */
    private @Nullable String vpcUuid;
    /**
     * @return Boolean flag to enable metric agent on the Droplet Autoscale pool underlying resource(s). The
     * metric agent enables collecting resource utilization metrics, which allows making resource based scaling decisions.
     * 
     */
    private @Nullable Boolean withDropletAgent;

    private DropletAutoscaleDropletTemplate() {}
    /**
     * @return Image slug of the Droplet Autoscale pool underlying resource(s).
     * 
     */
    public String image() {
        return this.image;
    }
    /**
     * @return Boolean flag to enable IPv6 networking on the Droplet Autoscale pool underlying resource(s).
     * 
     */
    public Optional<Boolean> ipv6() {
        return Optional.ofNullable(this.ipv6);
    }
    /**
     * @return Project UUID to create the Droplet Autoscale pool underlying resource(s).
     * 
     */
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }
    /**
     * @return Region slug of the Droplet Autoscale pool underlying resource(s).
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return Size slug of the Droplet Autoscale pool underlying resource(s).
     * 
     */
    public String size() {
        return this.size;
    }
    /**
     * @return SSH fingerprints to add to the Droplet Autoscale pool underlying resource(s).
     * 
     */
    public List<String> sshKeys() {
        return this.sshKeys;
    }
    /**
     * @return List of tags to add to the Droplet Autoscale pool underlying resource(s).
     * 
     */
    public List<String> tags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * @return Custom user data that can be added to the Droplet Autoscale pool underlying resource(s). This can be a
     * cloud init script that user may configure to setup their application workload.
     * 
     */
    public Optional<String> userData() {
        return Optional.ofNullable(this.userData);
    }
    /**
     * @return VPC UUID to create the Droplet Autoscale pool underlying resource(s). If not provided, this is inferred
     * from the specified `region` (default VPC).
     * 
     */
    public Optional<String> vpcUuid() {
        return Optional.ofNullable(this.vpcUuid);
    }
    /**
     * @return Boolean flag to enable metric agent on the Droplet Autoscale pool underlying resource(s). The
     * metric agent enables collecting resource utilization metrics, which allows making resource based scaling decisions.
     * 
     */
    public Optional<Boolean> withDropletAgent() {
        return Optional.ofNullable(this.withDropletAgent);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DropletAutoscaleDropletTemplate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String image;
        private @Nullable Boolean ipv6;
        private @Nullable String projectId;
        private String region;
        private String size;
        private List<String> sshKeys;
        private @Nullable List<String> tags;
        private @Nullable String userData;
        private @Nullable String vpcUuid;
        private @Nullable Boolean withDropletAgent;
        public Builder() {}
        public Builder(DropletAutoscaleDropletTemplate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.image = defaults.image;
    	      this.ipv6 = defaults.ipv6;
    	      this.projectId = defaults.projectId;
    	      this.region = defaults.region;
    	      this.size = defaults.size;
    	      this.sshKeys = defaults.sshKeys;
    	      this.tags = defaults.tags;
    	      this.userData = defaults.userData;
    	      this.vpcUuid = defaults.vpcUuid;
    	      this.withDropletAgent = defaults.withDropletAgent;
        }

        @CustomType.Setter
        public Builder image(String image) {
            if (image == null) {
              throw new MissingRequiredPropertyException("DropletAutoscaleDropletTemplate", "image");
            }
            this.image = image;
            return this;
        }
        @CustomType.Setter
        public Builder ipv6(@Nullable Boolean ipv6) {

            this.ipv6 = ipv6;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(@Nullable String projectId) {

            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            if (region == null) {
              throw new MissingRequiredPropertyException("DropletAutoscaleDropletTemplate", "region");
            }
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder size(String size) {
            if (size == null) {
              throw new MissingRequiredPropertyException("DropletAutoscaleDropletTemplate", "size");
            }
            this.size = size;
            return this;
        }
        @CustomType.Setter
        public Builder sshKeys(List<String> sshKeys) {
            if (sshKeys == null) {
              throw new MissingRequiredPropertyException("DropletAutoscaleDropletTemplate", "sshKeys");
            }
            this.sshKeys = sshKeys;
            return this;
        }
        public Builder sshKeys(String... sshKeys) {
            return sshKeys(List.of(sshKeys));
        }
        @CustomType.Setter
        public Builder tags(@Nullable List<String> tags) {

            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder userData(@Nullable String userData) {

            this.userData = userData;
            return this;
        }
        @CustomType.Setter
        public Builder vpcUuid(@Nullable String vpcUuid) {

            this.vpcUuid = vpcUuid;
            return this;
        }
        @CustomType.Setter
        public Builder withDropletAgent(@Nullable Boolean withDropletAgent) {

            this.withDropletAgent = withDropletAgent;
            return this;
        }
        public DropletAutoscaleDropletTemplate build() {
            final var _resultValue = new DropletAutoscaleDropletTemplate();
            _resultValue.image = image;
            _resultValue.ipv6 = ipv6;
            _resultValue.projectId = projectId;
            _resultValue.region = region;
            _resultValue.size = size;
            _resultValue.sshKeys = sshKeys;
            _resultValue.tags = tags;
            _resultValue.userData = userData;
            _resultValue.vpcUuid = vpcUuid;
            _resultValue.withDropletAgent = withDropletAgent;
            return _resultValue;
        }
    }
}
