// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.digitalocean.inputs.GetProjectsFilterArgs;
import com.pulumi.digitalocean.inputs.GetProjectsSortArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProjectsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProjectsArgs Empty = new GetProjectsArgs();

    /**
     * Filter the results.
     * The `filter` block is documented below.
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<GetProjectsFilterArgs>> filters;

    /**
     * @return Filter the results.
     * The `filter` block is documented below.
     * 
     */
    public Optional<Output<List<GetProjectsFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Sort the results.
     * The `sort` block is documented below.
     * 
     */
    @Import(name="sorts")
    private @Nullable Output<List<GetProjectsSortArgs>> sorts;

    /**
     * @return Sort the results.
     * The `sort` block is documented below.
     * 
     */
    public Optional<Output<List<GetProjectsSortArgs>>> sorts() {
        return Optional.ofNullable(this.sorts);
    }

    private GetProjectsArgs() {}

    private GetProjectsArgs(GetProjectsArgs $) {
        this.filters = $.filters;
        this.sorts = $.sorts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProjectsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProjectsArgs $;

        public Builder() {
            $ = new GetProjectsArgs();
        }

        public Builder(GetProjectsArgs defaults) {
            $ = new GetProjectsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters Filter the results.
         * The `filter` block is documented below.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<List<GetProjectsFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters Filter the results.
         * The `filter` block is documented below.
         * 
         * @return builder
         * 
         */
        public Builder filters(List<GetProjectsFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters Filter the results.
         * The `filter` block is documented below.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetProjectsFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param sorts Sort the results.
         * The `sort` block is documented below.
         * 
         * @return builder
         * 
         */
        public Builder sorts(@Nullable Output<List<GetProjectsSortArgs>> sorts) {
            $.sorts = sorts;
            return this;
        }

        /**
         * @param sorts Sort the results.
         * The `sort` block is documented below.
         * 
         * @return builder
         * 
         */
        public Builder sorts(List<GetProjectsSortArgs> sorts) {
            return sorts(Output.of(sorts));
        }

        /**
         * @param sorts Sort the results.
         * The `sort` block is documented below.
         * 
         * @return builder
         * 
         */
        public Builder sorts(GetProjectsSortArgs... sorts) {
            return sorts(List.of(sorts));
        }

        public GetProjectsArgs build() {
            return $;
        }
    }

}
