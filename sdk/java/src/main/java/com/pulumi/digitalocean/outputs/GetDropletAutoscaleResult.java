// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.digitalocean.outputs.GetDropletAutoscaleConfig;
import com.pulumi.digitalocean.outputs.GetDropletAutoscaleCurrentUtilization;
import com.pulumi.digitalocean.outputs.GetDropletAutoscaleDropletTemplate;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDropletAutoscaleResult {
    private List<GetDropletAutoscaleConfig> configs;
    private String createdAt;
    private List<GetDropletAutoscaleCurrentUtilization> currentUtilizations;
    private List<GetDropletAutoscaleDropletTemplate> dropletTemplates;
    private @Nullable String id;
    private @Nullable String name;
    private String status;
    private String updatedAt;

    private GetDropletAutoscaleResult() {}
    public List<GetDropletAutoscaleConfig> configs() {
        return this.configs;
    }
    public String createdAt() {
        return this.createdAt;
    }
    public List<GetDropletAutoscaleCurrentUtilization> currentUtilizations() {
        return this.currentUtilizations;
    }
    public List<GetDropletAutoscaleDropletTemplate> dropletTemplates() {
        return this.dropletTemplates;
    }
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public String status() {
        return this.status;
    }
    public String updatedAt() {
        return this.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDropletAutoscaleResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetDropletAutoscaleConfig> configs;
        private String createdAt;
        private List<GetDropletAutoscaleCurrentUtilization> currentUtilizations;
        private List<GetDropletAutoscaleDropletTemplate> dropletTemplates;
        private @Nullable String id;
        private @Nullable String name;
        private String status;
        private String updatedAt;
        public Builder() {}
        public Builder(GetDropletAutoscaleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configs = defaults.configs;
    	      this.createdAt = defaults.createdAt;
    	      this.currentUtilizations = defaults.currentUtilizations;
    	      this.dropletTemplates = defaults.dropletTemplates;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.status = defaults.status;
    	      this.updatedAt = defaults.updatedAt;
        }

        @CustomType.Setter
        public Builder configs(List<GetDropletAutoscaleConfig> configs) {
            if (configs == null) {
              throw new MissingRequiredPropertyException("GetDropletAutoscaleResult", "configs");
            }
            this.configs = configs;
            return this;
        }
        public Builder configs(GetDropletAutoscaleConfig... configs) {
            return configs(List.of(configs));
        }
        @CustomType.Setter
        public Builder createdAt(String createdAt) {
            if (createdAt == null) {
              throw new MissingRequiredPropertyException("GetDropletAutoscaleResult", "createdAt");
            }
            this.createdAt = createdAt;
            return this;
        }
        @CustomType.Setter
        public Builder currentUtilizations(List<GetDropletAutoscaleCurrentUtilization> currentUtilizations) {
            if (currentUtilizations == null) {
              throw new MissingRequiredPropertyException("GetDropletAutoscaleResult", "currentUtilizations");
            }
            this.currentUtilizations = currentUtilizations;
            return this;
        }
        public Builder currentUtilizations(GetDropletAutoscaleCurrentUtilization... currentUtilizations) {
            return currentUtilizations(List.of(currentUtilizations));
        }
        @CustomType.Setter
        public Builder dropletTemplates(List<GetDropletAutoscaleDropletTemplate> dropletTemplates) {
            if (dropletTemplates == null) {
              throw new MissingRequiredPropertyException("GetDropletAutoscaleResult", "dropletTemplates");
            }
            this.dropletTemplates = dropletTemplates;
            return this;
        }
        public Builder dropletTemplates(GetDropletAutoscaleDropletTemplate... dropletTemplates) {
            return dropletTemplates(List.of(dropletTemplates));
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetDropletAutoscaleResult", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder updatedAt(String updatedAt) {
            if (updatedAt == null) {
              throw new MissingRequiredPropertyException("GetDropletAutoscaleResult", "updatedAt");
            }
            this.updatedAt = updatedAt;
            return this;
        }
        public GetDropletAutoscaleResult build() {
            final var _resultValue = new GetDropletAutoscaleResult();
            _resultValue.configs = configs;
            _resultValue.createdAt = createdAt;
            _resultValue.currentUtilizations = currentUtilizations;
            _resultValue.dropletTemplates = dropletTemplates;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.status = status;
            _resultValue.updatedAt = updatedAt;
            return _resultValue;
        }
    }
}
