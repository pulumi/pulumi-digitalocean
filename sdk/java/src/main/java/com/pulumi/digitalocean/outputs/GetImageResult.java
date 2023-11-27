// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetImageResult {
    /**
     * @return When the image was created
     * 
     */
    private String created;
    private String description;
    /**
     * @return The name of the distribution of the OS of the image.
     * 
     */
    private String distribution;
    /**
     * @return Any applicable error message pertaining to the image
     * 
     */
    private String errorMessage;
    /**
     * @return The ID of the image.
     * 
     */
    private Integer id;
    /**
     * @return The id of the image (legacy parameter).
     * 
     */
    private String image;
    /**
     * @return The minimum &#39;disk&#39; required for the image.
     * 
     */
    private Integer minDiskSize;
    /**
     * @return The name of the image.
     * 
     */
    private String name;
    /**
     * @return Is image a public image or not. Public images represent
     * Linux distributions or One-Click Applications, while non-public images represent
     * snapshots and backups and are only available within your account.
     * 
     */
    private Boolean private_;
    /**
     * @return A set of the regions that the image is available in.
     * 
     */
    private List<String> regions;
    /**
     * @return The size of the image in GB.
     * 
     */
    private Double sizeGigabytes;
    /**
     * @return Unique text identifier of the image.
     * 
     */
    private String slug;
    private @Nullable String source;
    /**
     * @return Current status of the image
     * 
     */
    private String status;
    /**
     * @return A set of tags applied to the image
     * 
     */
    private List<String> tags;
    /**
     * @return Type of the image.
     * 
     */
    private String type;

    private GetImageResult() {}
    /**
     * @return When the image was created
     * 
     */
    public String created() {
        return this.created;
    }
    public String description() {
        return this.description;
    }
    /**
     * @return The name of the distribution of the OS of the image.
     * 
     */
    public String distribution() {
        return this.distribution;
    }
    /**
     * @return Any applicable error message pertaining to the image
     * 
     */
    public String errorMessage() {
        return this.errorMessage;
    }
    /**
     * @return The ID of the image.
     * 
     */
    public Integer id() {
        return this.id;
    }
    /**
     * @return The id of the image (legacy parameter).
     * 
     */
    public String image() {
        return this.image;
    }
    /**
     * @return The minimum &#39;disk&#39; required for the image.
     * 
     */
    public Integer minDiskSize() {
        return this.minDiskSize;
    }
    /**
     * @return The name of the image.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Is image a public image or not. Public images represent
     * Linux distributions or One-Click Applications, while non-public images represent
     * snapshots and backups and are only available within your account.
     * 
     */
    public Boolean private_() {
        return this.private_;
    }
    /**
     * @return A set of the regions that the image is available in.
     * 
     */
    public List<String> regions() {
        return this.regions;
    }
    /**
     * @return The size of the image in GB.
     * 
     */
    public Double sizeGigabytes() {
        return this.sizeGigabytes;
    }
    /**
     * @return Unique text identifier of the image.
     * 
     */
    public String slug() {
        return this.slug;
    }
    public Optional<String> source() {
        return Optional.ofNullable(this.source);
    }
    /**
     * @return Current status of the image
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return A set of tags applied to the image
     * 
     */
    public List<String> tags() {
        return this.tags;
    }
    /**
     * @return Type of the image.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImageResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String created;
        private String description;
        private String distribution;
        private String errorMessage;
        private Integer id;
        private String image;
        private Integer minDiskSize;
        private String name;
        private Boolean private_;
        private List<String> regions;
        private Double sizeGigabytes;
        private String slug;
        private @Nullable String source;
        private String status;
        private List<String> tags;
        private String type;
        public Builder() {}
        public Builder(GetImageResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.created = defaults.created;
    	      this.description = defaults.description;
    	      this.distribution = defaults.distribution;
    	      this.errorMessage = defaults.errorMessage;
    	      this.id = defaults.id;
    	      this.image = defaults.image;
    	      this.minDiskSize = defaults.minDiskSize;
    	      this.name = defaults.name;
    	      this.private_ = defaults.private_;
    	      this.regions = defaults.regions;
    	      this.sizeGigabytes = defaults.sizeGigabytes;
    	      this.slug = defaults.slug;
    	      this.source = defaults.source;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder created(String created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder distribution(String distribution) {
            this.distribution = Objects.requireNonNull(distribution);
            return this;
        }
        @CustomType.Setter
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = Objects.requireNonNull(errorMessage);
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder image(String image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }
        @CustomType.Setter
        public Builder minDiskSize(Integer minDiskSize) {
            this.minDiskSize = Objects.requireNonNull(minDiskSize);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter("private")
        public Builder private_(Boolean private_) {
            this.private_ = Objects.requireNonNull(private_);
            return this;
        }
        @CustomType.Setter
        public Builder regions(List<String> regions) {
            this.regions = Objects.requireNonNull(regions);
            return this;
        }
        public Builder regions(String... regions) {
            return regions(List.of(regions));
        }
        @CustomType.Setter
        public Builder sizeGigabytes(Double sizeGigabytes) {
            this.sizeGigabytes = Objects.requireNonNull(sizeGigabytes);
            return this;
        }
        @CustomType.Setter
        public Builder slug(String slug) {
            this.slug = Objects.requireNonNull(slug);
            return this;
        }
        @CustomType.Setter
        public Builder source(@Nullable String source) {
            this.source = source;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetImageResult build() {
            final var _resultValue = new GetImageResult();
            _resultValue.created = created;
            _resultValue.description = description;
            _resultValue.distribution = distribution;
            _resultValue.errorMessage = errorMessage;
            _resultValue.id = id;
            _resultValue.image = image;
            _resultValue.minDiskSize = minDiskSize;
            _resultValue.name = name;
            _resultValue.private_ = private_;
            _resultValue.regions = regions;
            _resultValue.sizeGigabytes = sizeGigabytes;
            _resultValue.slug = slug;
            _resultValue.source = source;
            _resultValue.status = status;
            _resultValue.tags = tags;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
