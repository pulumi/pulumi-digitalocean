// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppSpecFunctionBitbucket {
    /**
     * @return The name of the branch to use.
     * 
     */
    private @Nullable String branch;
    /**
     * @return Whether to automatically deploy new commits made to the repo.
     * 
     */
    private @Nullable Boolean deployOnPush;
    /**
     * @return The name of the repo in the format `owner/repo`.
     * 
     */
    private @Nullable String repo;

    private AppSpecFunctionBitbucket() {}
    /**
     * @return The name of the branch to use.
     * 
     */
    public Optional<String> branch() {
        return Optional.ofNullable(this.branch);
    }
    /**
     * @return Whether to automatically deploy new commits made to the repo.
     * 
     */
    public Optional<Boolean> deployOnPush() {
        return Optional.ofNullable(this.deployOnPush);
    }
    /**
     * @return The name of the repo in the format `owner/repo`.
     * 
     */
    public Optional<String> repo() {
        return Optional.ofNullable(this.repo);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppSpecFunctionBitbucket defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String branch;
        private @Nullable Boolean deployOnPush;
        private @Nullable String repo;
        public Builder() {}
        public Builder(AppSpecFunctionBitbucket defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branch = defaults.branch;
    	      this.deployOnPush = defaults.deployOnPush;
    	      this.repo = defaults.repo;
        }

        @CustomType.Setter
        public Builder branch(@Nullable String branch) {

            this.branch = branch;
            return this;
        }
        @CustomType.Setter
        public Builder deployOnPush(@Nullable Boolean deployOnPush) {

            this.deployOnPush = deployOnPush;
            return this;
        }
        @CustomType.Setter
        public Builder repo(@Nullable String repo) {

            this.repo = repo;
            return this;
        }
        public AppSpecFunctionBitbucket build() {
            final var _resultValue = new AppSpecFunctionBitbucket();
            _resultValue.branch = branch;
            _resultValue.deployOnPush = deployOnPush;
            _resultValue.repo = repo;
            return _resultValue;
        }
    }
}
