// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SpacesBucketVersioning {
    /**
     * @return Enable versioning. Once you version-enable a bucket, it can never return to an unversioned
     * state. You can, however, suspend versioning on that bucket.
     * 
     */
    private @Nullable Boolean enabled;

    private SpacesBucketVersioning() {}
    /**
     * @return Enable versioning. Once you version-enable a bucket, it can never return to an unversioned
     * state. You can, however, suspend versioning on that bucket.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpacesBucketVersioning defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        public Builder() {}
        public Builder(SpacesBucketVersioning defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        public SpacesBucketVersioning build() {
            final var _resultValue = new SpacesBucketVersioning();
            _resultValue.enabled = enabled;
            return _resultValue;
        }
    }
}
