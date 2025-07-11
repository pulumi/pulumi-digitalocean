// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.digitalocean.inputs.GetGenaiAgentsFilter;
import com.pulumi.digitalocean.inputs.GetGenaiAgentsSort;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGenaiAgentsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGenaiAgentsPlainArgs Empty = new GetGenaiAgentsPlainArgs();

    @Import(name="filters")
    private @Nullable List<GetGenaiAgentsFilter> filters;

    public Optional<List<GetGenaiAgentsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    @Import(name="onlyDeployed")
    private @Nullable Boolean onlyDeployed;

    public Optional<Boolean> onlyDeployed() {
        return Optional.ofNullable(this.onlyDeployed);
    }

    @Import(name="sorts")
    private @Nullable List<GetGenaiAgentsSort> sorts;

    public Optional<List<GetGenaiAgentsSort>> sorts() {
        return Optional.ofNullable(this.sorts);
    }

    private GetGenaiAgentsPlainArgs() {}

    private GetGenaiAgentsPlainArgs(GetGenaiAgentsPlainArgs $) {
        this.filters = $.filters;
        this.onlyDeployed = $.onlyDeployed;
        this.sorts = $.sorts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGenaiAgentsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGenaiAgentsPlainArgs $;

        public Builder() {
            $ = new GetGenaiAgentsPlainArgs();
        }

        public Builder(GetGenaiAgentsPlainArgs defaults) {
            $ = new GetGenaiAgentsPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder filters(@Nullable List<GetGenaiAgentsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetGenaiAgentsFilter... filters) {
            return filters(List.of(filters));
        }

        public Builder onlyDeployed(@Nullable Boolean onlyDeployed) {
            $.onlyDeployed = onlyDeployed;
            return this;
        }

        public Builder sorts(@Nullable List<GetGenaiAgentsSort> sorts) {
            $.sorts = sorts;
            return this;
        }

        public Builder sorts(GetGenaiAgentsSort... sorts) {
            return sorts(List.of(sorts));
        }

        public GetGenaiAgentsPlainArgs build() {
            return $;
        }
    }

}
