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
public final class FirewallPendingChange {
    private @Nullable Integer dropletId;
    private @Nullable Boolean removing;
    /**
     * @return A status string indicating the current state of the Firewall.
     * This can be &#34;waiting&#34;, &#34;succeeded&#34;, or &#34;failed&#34;.
     * 
     */
    private @Nullable String status;

    private FirewallPendingChange() {}
    public Optional<Integer> dropletId() {
        return Optional.ofNullable(this.dropletId);
    }
    public Optional<Boolean> removing() {
        return Optional.ofNullable(this.removing);
    }
    /**
     * @return A status string indicating the current state of the Firewall.
     * This can be &#34;waiting&#34;, &#34;succeeded&#34;, or &#34;failed&#34;.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPendingChange defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer dropletId;
        private @Nullable Boolean removing;
        private @Nullable String status;
        public Builder() {}
        public Builder(FirewallPendingChange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dropletId = defaults.dropletId;
    	      this.removing = defaults.removing;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder dropletId(@Nullable Integer dropletId) {
            this.dropletId = dropletId;
            return this;
        }
        @CustomType.Setter
        public Builder removing(@Nullable Boolean removing) {
            this.removing = removing;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public FirewallPendingChange build() {
            final var _resultValue = new FirewallPendingChange();
            _resultValue.dropletId = dropletId;
            _resultValue.removing = removing;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
