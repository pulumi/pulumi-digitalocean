// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.digitalocean.outputs.GetImagesFilter;
import com.pulumi.digitalocean.outputs.GetImagesImage;
import com.pulumi.digitalocean.outputs.GetImagesSort;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetImagesResult {
    private @Nullable List<GetImagesFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A set of images satisfying any `filter` and `sort` criteria. Each image has the following attributes:
     * 
     */
    private List<GetImagesImage> images;
    private @Nullable List<GetImagesSort> sorts;

    private GetImagesResult() {}
    public List<GetImagesFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A set of images satisfying any `filter` and `sort` criteria. Each image has the following attributes:
     * 
     */
    public List<GetImagesImage> images() {
        return this.images;
    }
    public List<GetImagesSort> sorts() {
        return this.sorts == null ? List.of() : this.sorts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetImagesFilter> filters;
        private String id;
        private List<GetImagesImage> images;
        private @Nullable List<GetImagesSort> sorts;
        public Builder() {}
        public Builder(GetImagesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.images = defaults.images;
    	      this.sorts = defaults.sorts;
        }

        @CustomType.Setter
        public Builder filters(@Nullable List<GetImagesFilter> filters) {

            this.filters = filters;
            return this;
        }
        public Builder filters(GetImagesFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetImagesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder images(List<GetImagesImage> images) {
            if (images == null) {
              throw new MissingRequiredPropertyException("GetImagesResult", "images");
            }
            this.images = images;
            return this;
        }
        public Builder images(GetImagesImage... images) {
            return images(List.of(images));
        }
        @CustomType.Setter
        public Builder sorts(@Nullable List<GetImagesSort> sorts) {

            this.sorts = sorts;
            return this;
        }
        public Builder sorts(GetImagesSort... sorts) {
            return sorts(List.of(sorts));
        }
        public GetImagesResult build() {
            final var _resultValue = new GetImagesResult();
            _resultValue.filters = filters;
            _resultValue.id = id;
            _resultValue.images = images;
            _resultValue.sorts = sorts;
            return _resultValue;
        }
    }
}
