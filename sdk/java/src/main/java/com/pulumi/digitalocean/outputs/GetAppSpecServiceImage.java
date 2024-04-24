// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.digitalocean.outputs.GetAppSpecServiceImageDeployOnPush;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAppSpecServiceImage {
    /**
     * @return Whether to automatically deploy new commits made to the repo.
     * 
     */
    private List<GetAppSpecServiceImageDeployOnPush> deployOnPushes;
    /**
     * @return The registry name. Must be left empty for the `DOCR` registry type. Required for the `DOCKER_HUB` registry type.
     * 
     */
    private @Nullable String registry;
    /**
     * @return Access credentials for third-party registries
     * 
     */
    private String registryCredentials;
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

    private GetAppSpecServiceImage() {}
    /**
     * @return Whether to automatically deploy new commits made to the repo.
     * 
     */
    public List<GetAppSpecServiceImageDeployOnPush> deployOnPushes() {
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
     * @return Access credentials for third-party registries
     * 
     */
    public String registryCredentials() {
        return this.registryCredentials;
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

    public static Builder builder(GetAppSpecServiceImage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetAppSpecServiceImageDeployOnPush> deployOnPushes;
        private @Nullable String registry;
        private String registryCredentials;
        private String registryType;
        private String repository;
        private @Nullable String tag;
        public Builder() {}
        public Builder(GetAppSpecServiceImage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deployOnPushes = defaults.deployOnPushes;
    	      this.registry = defaults.registry;
    	      this.registryCredentials = defaults.registryCredentials;
    	      this.registryType = defaults.registryType;
    	      this.repository = defaults.repository;
    	      this.tag = defaults.tag;
        }

        @CustomType.Setter
        public Builder deployOnPushes(List<GetAppSpecServiceImageDeployOnPush> deployOnPushes) {
            if (deployOnPushes == null) {
              throw new MissingRequiredPropertyException("GetAppSpecServiceImage", "deployOnPushes");
            }
            this.deployOnPushes = deployOnPushes;
            return this;
        }
        public Builder deployOnPushes(GetAppSpecServiceImageDeployOnPush... deployOnPushes) {
            return deployOnPushes(List.of(deployOnPushes));
        }
        @CustomType.Setter
        public Builder registry(@Nullable String registry) {

            this.registry = registry;
            return this;
        }
        @CustomType.Setter
        public Builder registryCredentials(String registryCredentials) {
            if (registryCredentials == null) {
              throw new MissingRequiredPropertyException("GetAppSpecServiceImage", "registryCredentials");
            }
            this.registryCredentials = registryCredentials;
            return this;
        }
        @CustomType.Setter
        public Builder registryType(String registryType) {
            if (registryType == null) {
              throw new MissingRequiredPropertyException("GetAppSpecServiceImage", "registryType");
            }
            this.registryType = registryType;
            return this;
        }
        @CustomType.Setter
        public Builder repository(String repository) {
            if (repository == null) {
              throw new MissingRequiredPropertyException("GetAppSpecServiceImage", "repository");
            }
            this.repository = repository;
            return this;
        }
        @CustomType.Setter
        public Builder tag(@Nullable String tag) {

            this.tag = tag;
            return this;
        }
        public GetAppSpecServiceImage build() {
            final var _resultValue = new GetAppSpecServiceImage();
            _resultValue.deployOnPushes = deployOnPushes;
            _resultValue.registry = registry;
            _resultValue.registryCredentials = registryCredentials;
            _resultValue.registryType = registryType;
            _resultValue.repository = repository;
            _resultValue.tag = tag;
            return _resultValue;
        }
    }
}
