// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAppSpecJobEnv {
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
    private String type;
    /**
     * @return The threshold for the type of the warning.
     * 
     */
    private @Nullable String value;

    private GetAppSpecJobEnv() {}
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
    public String type() {
        return this.type;
    }
    /**
     * @return The threshold for the type of the warning.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppSpecJobEnv defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String key;
        private @Nullable String scope;
        private String type;
        private @Nullable String value;
        public Builder() {}
        public Builder(GetAppSpecJobEnv defaults) {
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
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetAppSpecJobEnv", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {

            this.value = value;
            return this;
        }
        public GetAppSpecJobEnv build() {
            final var _resultValue = new GetAppSpecJobEnv();
            _resultValue.key = key;
            _resultValue.scope = scope;
            _resultValue.type = type;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
