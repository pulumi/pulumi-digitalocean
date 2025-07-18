// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GenaiAgentModelVersionArgs extends com.pulumi.resources.ResourceArgs {

    public static final GenaiAgentModelVersionArgs Empty = new GenaiAgentModelVersionArgs();

    /**
     * Major version of the model
     * 
     */
    @Import(name="major")
    private @Nullable Output<Integer> major;

    /**
     * @return Major version of the model
     * 
     */
    public Optional<Output<Integer>> major() {
        return Optional.ofNullable(this.major);
    }

    /**
     * Minor version of the model
     * 
     */
    @Import(name="minor")
    private @Nullable Output<Integer> minor;

    /**
     * @return Minor version of the model
     * 
     */
    public Optional<Output<Integer>> minor() {
        return Optional.ofNullable(this.minor);
    }

    /**
     * Patch version of the model
     * 
     */
    @Import(name="patch")
    private @Nullable Output<Integer> patch;

    /**
     * @return Patch version of the model
     * 
     */
    public Optional<Output<Integer>> patch() {
        return Optional.ofNullable(this.patch);
    }

    private GenaiAgentModelVersionArgs() {}

    private GenaiAgentModelVersionArgs(GenaiAgentModelVersionArgs $) {
        this.major = $.major;
        this.minor = $.minor;
        this.patch = $.patch;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GenaiAgentModelVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GenaiAgentModelVersionArgs $;

        public Builder() {
            $ = new GenaiAgentModelVersionArgs();
        }

        public Builder(GenaiAgentModelVersionArgs defaults) {
            $ = new GenaiAgentModelVersionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param major Major version of the model
         * 
         * @return builder
         * 
         */
        public Builder major(@Nullable Output<Integer> major) {
            $.major = major;
            return this;
        }

        /**
         * @param major Major version of the model
         * 
         * @return builder
         * 
         */
        public Builder major(Integer major) {
            return major(Output.of(major));
        }

        /**
         * @param minor Minor version of the model
         * 
         * @return builder
         * 
         */
        public Builder minor(@Nullable Output<Integer> minor) {
            $.minor = minor;
            return this;
        }

        /**
         * @param minor Minor version of the model
         * 
         * @return builder
         * 
         */
        public Builder minor(Integer minor) {
            return minor(Output.of(minor));
        }

        /**
         * @param patch Patch version of the model
         * 
         * @return builder
         * 
         */
        public Builder patch(@Nullable Output<Integer> patch) {
            $.patch = patch;
            return this;
        }

        /**
         * @param patch Patch version of the model
         * 
         * @return builder
         * 
         */
        public Builder patch(Integer patch) {
            return patch(Output.of(patch));
        }

        public GenaiAgentModelVersionArgs build() {
            return $;
        }
    }

}
