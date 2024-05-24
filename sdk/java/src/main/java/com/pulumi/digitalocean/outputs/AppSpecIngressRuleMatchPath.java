// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppSpecIngressRuleMatchPath {
    /**
     * @return Prefix-based match.
     * 
     */
    private @Nullable String prefix;

    private AppSpecIngressRuleMatchPath() {}
    /**
     * @return Prefix-based match.
     * 
     */
    public Optional<String> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppSpecIngressRuleMatchPath defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String prefix;
        public Builder() {}
        public Builder(AppSpecIngressRuleMatchPath defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.prefix = defaults.prefix;
        }

        @CustomType.Setter
        public Builder prefix(@Nullable String prefix) {

            this.prefix = prefix;
            return this;
        }
        public AppSpecIngressRuleMatchPath build() {
            final var _resultValue = new AppSpecIngressRuleMatchPath();
            _resultValue.prefix = prefix;
            return _resultValue;
        }
    }
}
