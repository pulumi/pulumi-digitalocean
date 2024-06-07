// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppSpecServiceEnv {
    /**
     * @return The name of the environment variable.
     * 
     */
    private @Nullable String key;
    /**
     * @return The visibility scope of the environment variable. One of `RUN_TIME`, `BUILD_TIME`, or `RUN_AND_BUILD_TIME` (default).
     * 
     */
    private @Nullable String scope;
    /**
     * @return The type of the environment variable, `GENERAL` or `SECRET`.
     * 
     */
    private @Nullable String type;
    /**
     * @return The value of the environment variable.
     * 
     */
    private @Nullable String value;

    private AppSpecServiceEnv() {}
    /**
     * @return The name of the environment variable.
     * 
     */
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }
    /**
     * @return The visibility scope of the environment variable. One of `RUN_TIME`, `BUILD_TIME`, or `RUN_AND_BUILD_TIME` (default).
     * 
     */
    public Optional<String> scope() {
        return Optional.ofNullable(this.scope);
    }
    /**
     * @return The type of the environment variable, `GENERAL` or `SECRET`.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return The value of the environment variable.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppSpecServiceEnv defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String key;
        private @Nullable String scope;
        private @Nullable String type;
        private @Nullable String value;
        public Builder() {}
        public Builder(AppSpecServiceEnv defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.scope = defaults.scope;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder key(@Nullable String key) {

            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder scope(@Nullable String scope) {

            this.scope = scope;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {

            this.value = value;
            return this;
        }
        public AppSpecServiceEnv build() {
            final var _resultValue = new AppSpecServiceEnv();
            _resultValue.key = key;
            _resultValue.scope = scope;
            _resultValue.type = type;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
