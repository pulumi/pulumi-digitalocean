// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SpacesBucketLifecycleRuleExpiration {
    /**
     * @return Specifies the date/time after which you want applicable objects to expire. The argument uses
     * RFC3339 format, e.g. &#34;2020-03-22T15:03:55Z&#34; or parts thereof e.g. &#34;2019-02-28&#34;.
     * 
     */
    private @Nullable String date;
    /**
     * @return Specifies the number of days after object creation when the applicable objects will expire.
     * 
     */
    private @Nullable Integer days;
    /**
     * @return On a versioned bucket (versioning-enabled or versioning-suspended
     * bucket), setting this to true directs Spaces to delete expired object delete markers.
     * 
     */
    private @Nullable Boolean expiredObjectDeleteMarker;

    private SpacesBucketLifecycleRuleExpiration() {}
    /**
     * @return Specifies the date/time after which you want applicable objects to expire. The argument uses
     * RFC3339 format, e.g. &#34;2020-03-22T15:03:55Z&#34; or parts thereof e.g. &#34;2019-02-28&#34;.
     * 
     */
    public Optional<String> date() {
        return Optional.ofNullable(this.date);
    }
    /**
     * @return Specifies the number of days after object creation when the applicable objects will expire.
     * 
     */
    public Optional<Integer> days() {
        return Optional.ofNullable(this.days);
    }
    /**
     * @return On a versioned bucket (versioning-enabled or versioning-suspended
     * bucket), setting this to true directs Spaces to delete expired object delete markers.
     * 
     */
    public Optional<Boolean> expiredObjectDeleteMarker() {
        return Optional.ofNullable(this.expiredObjectDeleteMarker);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpacesBucketLifecycleRuleExpiration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String date;
        private @Nullable Integer days;
        private @Nullable Boolean expiredObjectDeleteMarker;
        public Builder() {}
        public Builder(SpacesBucketLifecycleRuleExpiration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.date = defaults.date;
    	      this.days = defaults.days;
    	      this.expiredObjectDeleteMarker = defaults.expiredObjectDeleteMarker;
        }

        @CustomType.Setter
        public Builder date(@Nullable String date) {
            this.date = date;
            return this;
        }
        @CustomType.Setter
        public Builder days(@Nullable Integer days) {
            this.days = days;
            return this;
        }
        @CustomType.Setter
        public Builder expiredObjectDeleteMarker(@Nullable Boolean expiredObjectDeleteMarker) {
            this.expiredObjectDeleteMarker = expiredObjectDeleteMarker;
            return this;
        }
        public SpacesBucketLifecycleRuleExpiration build() {
            final var _resultValue = new SpacesBucketLifecycleRuleExpiration();
            _resultValue.date = date;
            _resultValue.days = days;
            _resultValue.expiredObjectDeleteMarker = expiredObjectDeleteMarker;
            return _resultValue;
        }
    }
}
