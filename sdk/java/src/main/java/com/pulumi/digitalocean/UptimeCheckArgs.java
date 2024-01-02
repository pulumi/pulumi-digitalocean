// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UptimeCheckArgs extends com.pulumi.resources.ResourceArgs {

    public static final UptimeCheckArgs Empty = new UptimeCheckArgs();

    /**
     * A boolean value indicating whether the check is enabled/disabled.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return A boolean value indicating whether the check is enabled/disabled.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * A human-friendly display name for the check.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A human-friendly display name for the check.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * An array containing the selected regions to perform healthchecks from: &#34;us_east&#34;, &#34;us_west&#34;, &#34;eu_west&#34;, &#34;se_asia&#34;
     * 
     */
    @Import(name="regions")
    private @Nullable Output<List<String>> regions;

    /**
     * @return An array containing the selected regions to perform healthchecks from: &#34;us_east&#34;, &#34;us_west&#34;, &#34;eu_west&#34;, &#34;se_asia&#34;
     * 
     */
    public Optional<Output<List<String>>> regions() {
        return Optional.ofNullable(this.regions);
    }

    /**
     * The endpoint to perform healthchecks on.
     * 
     */
    @Import(name="target", required=true)
    private Output<String> target;

    /**
     * @return The endpoint to perform healthchecks on.
     * 
     */
    public Output<String> target() {
        return this.target;
    }

    /**
     * The type of health check to perform: &#39;ping&#39; &#39;http&#39; &#39;https&#39;.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of health check to perform: &#39;ping&#39; &#39;http&#39; &#39;https&#39;.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private UptimeCheckArgs() {}

    private UptimeCheckArgs(UptimeCheckArgs $) {
        this.enabled = $.enabled;
        this.name = $.name;
        this.regions = $.regions;
        this.target = $.target;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UptimeCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UptimeCheckArgs $;

        public Builder() {
            $ = new UptimeCheckArgs();
        }

        public Builder(UptimeCheckArgs defaults) {
            $ = new UptimeCheckArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled A boolean value indicating whether the check is enabled/disabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled A boolean value indicating whether the check is enabled/disabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param name A human-friendly display name for the check.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A human-friendly display name for the check.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param regions An array containing the selected regions to perform healthchecks from: &#34;us_east&#34;, &#34;us_west&#34;, &#34;eu_west&#34;, &#34;se_asia&#34;
         * 
         * @return builder
         * 
         */
        public Builder regions(@Nullable Output<List<String>> regions) {
            $.regions = regions;
            return this;
        }

        /**
         * @param regions An array containing the selected regions to perform healthchecks from: &#34;us_east&#34;, &#34;us_west&#34;, &#34;eu_west&#34;, &#34;se_asia&#34;
         * 
         * @return builder
         * 
         */
        public Builder regions(List<String> regions) {
            return regions(Output.of(regions));
        }

        /**
         * @param regions An array containing the selected regions to perform healthchecks from: &#34;us_east&#34;, &#34;us_west&#34;, &#34;eu_west&#34;, &#34;se_asia&#34;
         * 
         * @return builder
         * 
         */
        public Builder regions(String... regions) {
            return regions(List.of(regions));
        }

        /**
         * @param target The endpoint to perform healthchecks on.
         * 
         * @return builder
         * 
         */
        public Builder target(Output<String> target) {
            $.target = target;
            return this;
        }

        /**
         * @param target The endpoint to perform healthchecks on.
         * 
         * @return builder
         * 
         */
        public Builder target(String target) {
            return target(Output.of(target));
        }

        /**
         * @param type The type of health check to perform: &#39;ping&#39; &#39;http&#39; &#39;https&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of health check to perform: &#39;ping&#39; &#39;http&#39; &#39;https&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public UptimeCheckArgs build() {
            if ($.target == null) {
                throw new MissingRequiredPropertyException("UptimeCheckArgs", "target");
            }
            return $;
        }
    }

}
