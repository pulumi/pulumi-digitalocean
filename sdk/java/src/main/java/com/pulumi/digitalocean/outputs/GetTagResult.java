// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTagResult {
    /**
     * @return A count of the database clusters that the tag is applied to.
     * 
     */
    private Integer databasesCount;
    /**
     * @return A count of the Droplets the tag is applied to.
     * 
     */
    private Integer dropletsCount;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A count of the images that the tag is applied to.
     * 
     */
    private Integer imagesCount;
    private String name;
    /**
     * @return A count of the total number of resources that the tag is applied to.
     * 
     */
    private Integer totalResourceCount;
    /**
     * @return A count of the volume snapshots that the tag is applied to.
     * 
     */
    private Integer volumeSnapshotsCount;
    /**
     * @return A count of the volumes that the tag is applied to.
     * 
     */
    private Integer volumesCount;

    private GetTagResult() {}
    /**
     * @return A count of the database clusters that the tag is applied to.
     * 
     */
    public Integer databasesCount() {
        return this.databasesCount;
    }
    /**
     * @return A count of the Droplets the tag is applied to.
     * 
     */
    public Integer dropletsCount() {
        return this.dropletsCount;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A count of the images that the tag is applied to.
     * 
     */
    public Integer imagesCount() {
        return this.imagesCount;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return A count of the total number of resources that the tag is applied to.
     * 
     */
    public Integer totalResourceCount() {
        return this.totalResourceCount;
    }
    /**
     * @return A count of the volume snapshots that the tag is applied to.
     * 
     */
    public Integer volumeSnapshotsCount() {
        return this.volumeSnapshotsCount;
    }
    /**
     * @return A count of the volumes that the tag is applied to.
     * 
     */
    public Integer volumesCount() {
        return this.volumesCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTagResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer databasesCount;
        private Integer dropletsCount;
        private String id;
        private Integer imagesCount;
        private String name;
        private Integer totalResourceCount;
        private Integer volumeSnapshotsCount;
        private Integer volumesCount;
        public Builder() {}
        public Builder(GetTagResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databasesCount = defaults.databasesCount;
    	      this.dropletsCount = defaults.dropletsCount;
    	      this.id = defaults.id;
    	      this.imagesCount = defaults.imagesCount;
    	      this.name = defaults.name;
    	      this.totalResourceCount = defaults.totalResourceCount;
    	      this.volumeSnapshotsCount = defaults.volumeSnapshotsCount;
    	      this.volumesCount = defaults.volumesCount;
        }

        @CustomType.Setter
        public Builder databasesCount(Integer databasesCount) {
            if (databasesCount == null) {
              throw new MissingRequiredPropertyException("GetTagResult", "databasesCount");
            }
            this.databasesCount = databasesCount;
            return this;
        }
        @CustomType.Setter
        public Builder dropletsCount(Integer dropletsCount) {
            if (dropletsCount == null) {
              throw new MissingRequiredPropertyException("GetTagResult", "dropletsCount");
            }
            this.dropletsCount = dropletsCount;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetTagResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder imagesCount(Integer imagesCount) {
            if (imagesCount == null) {
              throw new MissingRequiredPropertyException("GetTagResult", "imagesCount");
            }
            this.imagesCount = imagesCount;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetTagResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder totalResourceCount(Integer totalResourceCount) {
            if (totalResourceCount == null) {
              throw new MissingRequiredPropertyException("GetTagResult", "totalResourceCount");
            }
            this.totalResourceCount = totalResourceCount;
            return this;
        }
        @CustomType.Setter
        public Builder volumeSnapshotsCount(Integer volumeSnapshotsCount) {
            if (volumeSnapshotsCount == null) {
              throw new MissingRequiredPropertyException("GetTagResult", "volumeSnapshotsCount");
            }
            this.volumeSnapshotsCount = volumeSnapshotsCount;
            return this;
        }
        @CustomType.Setter
        public Builder volumesCount(Integer volumesCount) {
            if (volumesCount == null) {
              throw new MissingRequiredPropertyException("GetTagResult", "volumesCount");
            }
            this.volumesCount = volumesCount;
            return this;
        }
        public GetTagResult build() {
            final var _resultValue = new GetTagResult();
            _resultValue.databasesCount = databasesCount;
            _resultValue.dropletsCount = dropletsCount;
            _resultValue.id = id;
            _resultValue.imagesCount = imagesCount;
            _resultValue.name = name;
            _resultValue.totalResourceCount = totalResourceCount;
            _resultValue.volumeSnapshotsCount = volumeSnapshotsCount;
            _resultValue.volumesCount = volumesCount;
            return _resultValue;
        }
    }
}
