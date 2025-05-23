// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.digitalocean.inputs.SpacesKeyGrantArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpacesKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final SpacesKeyArgs Empty = new SpacesKeyArgs();

    /**
     * A grant for the key (documented below).
     * 
     */
    @Import(name="grants")
    private @Nullable Output<List<SpacesKeyGrantArgs>> grants;

    /**
     * @return A grant for the key (documented below).
     * 
     */
    public Optional<Output<List<SpacesKeyGrantArgs>>> grants() {
        return Optional.ofNullable(this.grants);
    }

    /**
     * The name of the key
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the key
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private SpacesKeyArgs() {}

    private SpacesKeyArgs(SpacesKeyArgs $) {
        this.grants = $.grants;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpacesKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpacesKeyArgs $;

        public Builder() {
            $ = new SpacesKeyArgs();
        }

        public Builder(SpacesKeyArgs defaults) {
            $ = new SpacesKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param grants A grant for the key (documented below).
         * 
         * @return builder
         * 
         */
        public Builder grants(@Nullable Output<List<SpacesKeyGrantArgs>> grants) {
            $.grants = grants;
            return this;
        }

        /**
         * @param grants A grant for the key (documented below).
         * 
         * @return builder
         * 
         */
        public Builder grants(List<SpacesKeyGrantArgs> grants) {
            return grants(Output.of(grants));
        }

        /**
         * @param grants A grant for the key (documented below).
         * 
         * @return builder
         * 
         */
        public Builder grants(SpacesKeyGrantArgs... grants) {
            return grants(List.of(grants));
        }

        /**
         * @param name The name of the key
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the key
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public SpacesKeyArgs build() {
            return $;
        }
    }

}
