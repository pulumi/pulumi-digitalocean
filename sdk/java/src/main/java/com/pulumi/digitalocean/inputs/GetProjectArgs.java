// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProjectArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProjectArgs Empty = new GetProjectArgs();

    /**
     * the ID of the project to retrieve
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return the ID of the project to retrieve
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * the name of the project to retrieve. The data source will raise an error if more than
     * one project has the provided name or if no project has that name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return the name of the project to retrieve. The data source will raise an error if more than
     * one project has the provided name or if no project has that name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private GetProjectArgs() {}

    private GetProjectArgs(GetProjectArgs $) {
        this.id = $.id;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProjectArgs $;

        public Builder() {
            $ = new GetProjectArgs();
        }

        public Builder(GetProjectArgs defaults) {
            $ = new GetProjectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id the ID of the project to retrieve
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id the ID of the project to retrieve
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name the name of the project to retrieve. The data source will raise an error if more than
         * one project has the provided name or if no project has that name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name the name of the project to retrieve. The data source will raise an error if more than
         * one project has the provided name or if no project has that name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetProjectArgs build() {
            return $;
        }
    }

}
