// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.digitalocean.inputs.GetSpacesBucketsFilter;
import com.pulumi.digitalocean.inputs.GetSpacesBucketsSort;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSpacesBucketsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSpacesBucketsPlainArgs Empty = new GetSpacesBucketsPlainArgs();

    /**
     * Filter the results.
     * The `filter` block is documented below.
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetSpacesBucketsFilter> filters;

    /**
     * @return Filter the results.
     * The `filter` block is documented below.
     * 
     */
    public Optional<List<GetSpacesBucketsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Sort the results.
     * The `sort` block is documented below.
     * 
     */
    @Import(name="sorts")
    private @Nullable List<GetSpacesBucketsSort> sorts;

    /**
     * @return Sort the results.
     * The `sort` block is documented below.
     * 
     */
    public Optional<List<GetSpacesBucketsSort>> sorts() {
        return Optional.ofNullable(this.sorts);
    }

    private GetSpacesBucketsPlainArgs() {}

    private GetSpacesBucketsPlainArgs(GetSpacesBucketsPlainArgs $) {
        this.filters = $.filters;
        this.sorts = $.sorts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSpacesBucketsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSpacesBucketsPlainArgs $;

        public Builder() {
            $ = new GetSpacesBucketsPlainArgs();
        }

        public Builder(GetSpacesBucketsPlainArgs defaults) {
            $ = new GetSpacesBucketsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters Filter the results.
         * The `filter` block is documented below.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetSpacesBucketsFilter> filters) {
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
        public Builder filters(GetSpacesBucketsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param sorts Sort the results.
         * The `sort` block is documented below.
         * 
         * @return builder
         * 
         */
        public Builder sorts(@Nullable List<GetSpacesBucketsSort> sorts) {
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
        public Builder sorts(GetSpacesBucketsSort... sorts) {
            return sorts(List.of(sorts));
        }

        public GetSpacesBucketsPlainArgs build() {
            return $;
        }
    }

}
