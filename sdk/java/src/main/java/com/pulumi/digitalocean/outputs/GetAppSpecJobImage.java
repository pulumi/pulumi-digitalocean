// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.digitalocean.outputs.GetAppSpecJobImageDeployOnPush;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAppSpecJobImage {
    /**
     * @return Whether to automatically deploy new commits made to the repo.
     * 
     */
    private List<GetAppSpecJobImageDeployOnPush> deployOnPushes;
    /**
     * @return The registry name. Must be left empty for the `DOCR` registry type. Required for the `DOCKER_HUB` registry type.
     * 
     */
    private @Nullable String registry;
    /**
     * @return The registry type. One of `DOCR` (DigitalOcean container registry) or `DOCKER_HUB`.
     * 
     */
    private String registryType;
    /**
     * @return The repository name.
     * 
     */
    private String repository;
    /**
     * @return The repository tag. Defaults to `latest` if not provided.
     * 
     */
    private @Nullable String tag;

    private GetAppSpecJobImage() {}
    /**
     * @return Whether to automatically deploy new commits made to the repo.
     * 
     */
    public List<GetAppSpecJobImageDeployOnPush> deployOnPushes() {
        return this.deployOnPushes;
    }
    /**
     * @return The registry name. Must be left empty for the `DOCR` registry type. Required for the `DOCKER_HUB` registry type.
     * 
     */
    public Optional<String> registry() {
        return Optional.ofNullable(this.registry);
    }
    /**
     * @return The registry type. One of `DOCR` (DigitalOcean container registry) or `DOCKER_HUB`.
     * 
     */
    public String registryType() {
        return this.registryType;
    }
    /**
     * @return The repository name.
     * 
     */
    public String repository() {
        return this.repository;
    }
    /**
     * @return The repository tag. Defaults to `latest` if not provided.
     * 
     */
    public Optional<String> tag() {
        return Optional.ofNullable(this.tag);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppSpecJobImage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetAppSpecJobImageDeployOnPush> deployOnPushes;
        private @Nullable String registry;
        private String registryType;
        private String repository;
        private @Nullable String tag;
        public Builder() {}
        public Builder(GetAppSpecJobImage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deployOnPushes = defaults.deployOnPushes;
    	      this.registry = defaults.registry;
    	      this.registryType = defaults.registryType;
    	      this.repository = defaults.repository;
    	      this.tag = defaults.tag;
        }

        @CustomType.Setter
        public Builder deployOnPushes(List<GetAppSpecJobImageDeployOnPush> deployOnPushes) {
            this.deployOnPushes = Objects.requireNonNull(deployOnPushes);
            return this;
        }
        public Builder deployOnPushes(GetAppSpecJobImageDeployOnPush... deployOnPushes) {
            return deployOnPushes(List.of(deployOnPushes));
        }
        @CustomType.Setter
        public Builder registry(@Nullable String registry) {
            this.registry = registry;
            return this;
        }
        @CustomType.Setter
        public Builder registryType(String registryType) {
            this.registryType = Objects.requireNonNull(registryType);
            return this;
        }
        @CustomType.Setter
        public Builder repository(String repository) {
            this.repository = Objects.requireNonNull(repository);
            return this;
        }
        @CustomType.Setter
        public Builder tag(@Nullable String tag) {
            this.tag = tag;
            return this;
        }
        public GetAppSpecJobImage build() {
            final var _resultValue = new GetAppSpecJobImage();
            _resultValue.deployOnPushes = deployOnPushes;
            _resultValue.registry = registry;
            _resultValue.registryType = registryType;
            _resultValue.repository = repository;
            _resultValue.tag = tag;
            return _resultValue;
        }
    }
}
