// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetKubernetesVersionsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The most recent version available.
     * 
     */
    private String latestVersion;
    /**
     * @return A list of available versions.
     * 
     */
    private List<String> validVersions;
    private @Nullable String versionPrefix;

    private GetKubernetesVersionsResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The most recent version available.
     * 
     */
    public String latestVersion() {
        return this.latestVersion;
    }
    /**
     * @return A list of available versions.
     * 
     */
    public List<String> validVersions() {
        return this.validVersions;
    }
    public Optional<String> versionPrefix() {
        return Optional.ofNullable(this.versionPrefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKubernetesVersionsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String latestVersion;
        private List<String> validVersions;
        private @Nullable String versionPrefix;
        public Builder() {}
        public Builder(GetKubernetesVersionsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.latestVersion = defaults.latestVersion;
    	      this.validVersions = defaults.validVersions;
    	      this.versionPrefix = defaults.versionPrefix;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetKubernetesVersionsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder latestVersion(String latestVersion) {
            if (latestVersion == null) {
              throw new MissingRequiredPropertyException("GetKubernetesVersionsResult", "latestVersion");
            }
            this.latestVersion = latestVersion;
            return this;
        }
        @CustomType.Setter
        public Builder validVersions(List<String> validVersions) {
            if (validVersions == null) {
              throw new MissingRequiredPropertyException("GetKubernetesVersionsResult", "validVersions");
            }
            this.validVersions = validVersions;
            return this;
        }
        public Builder validVersions(String... validVersions) {
            return validVersions(List.of(validVersions));
        }
        @CustomType.Setter
        public Builder versionPrefix(@Nullable String versionPrefix) {

            this.versionPrefix = versionPrefix;
            return this;
        }
        public GetKubernetesVersionsResult build() {
            final var _resultValue = new GetKubernetesVersionsResult();
            _resultValue.id = id;
            _resultValue.latestVersion = latestVersion;
            _resultValue.validVersions = validVersions;
            _resultValue.versionPrefix = versionPrefix;
            return _resultValue;
        }
    }
}
