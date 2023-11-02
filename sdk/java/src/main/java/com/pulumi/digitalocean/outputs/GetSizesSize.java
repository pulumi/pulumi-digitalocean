// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSizesSize {
    /**
     * @return This represents whether new Droplets can be created with this size.
     * 
     */
    private Boolean available;
    /**
     * @return The amount of disk space set aside for Droplets of this size. The value is measured in gigabytes.
     * 
     */
    private Integer disk;
    /**
     * @return The amount of RAM allocated to Droplets created of this size. The value is measured in megabytes.
     * 
     */
    private Integer memory;
    /**
     * @return The hourly cost of Droplets created in this size as measured hourly. The value is measured in US dollars.
     * 
     */
    private Double priceHourly;
    /**
     * @return The monthly cost of Droplets created in this size if they are kept for an entire month. The value is measured in US dollars.
     * 
     */
    private Double priceMonthly;
    /**
     * @return List of region slugs where Droplets can be created in this size.
     * 
     */
    private List<String> regions;
    /**
     * @return A human-readable string that is used to uniquely identify each size.
     * 
     */
    private String slug;
    /**
     * @return The amount of transfer bandwidth that is available for Droplets created in this size. This only counts traffic on the public interface. The value is given in terabytes.
     * 
     */
    private Double transfer;
    /**
     * @return The number of CPUs allocated to Droplets of this size.
     * 
     */
    private Integer vcpus;

    private GetSizesSize() {}
    /**
     * @return This represents whether new Droplets can be created with this size.
     * 
     */
    public Boolean available() {
        return this.available;
    }
    /**
     * @return The amount of disk space set aside for Droplets of this size. The value is measured in gigabytes.
     * 
     */
    public Integer disk() {
        return this.disk;
    }
    /**
     * @return The amount of RAM allocated to Droplets created of this size. The value is measured in megabytes.
     * 
     */
    public Integer memory() {
        return this.memory;
    }
    /**
     * @return The hourly cost of Droplets created in this size as measured hourly. The value is measured in US dollars.
     * 
     */
    public Double priceHourly() {
        return this.priceHourly;
    }
    /**
     * @return The monthly cost of Droplets created in this size if they are kept for an entire month. The value is measured in US dollars.
     * 
     */
    public Double priceMonthly() {
        return this.priceMonthly;
    }
    /**
     * @return List of region slugs where Droplets can be created in this size.
     * 
     */
    public List<String> regions() {
        return this.regions;
    }
    /**
     * @return A human-readable string that is used to uniquely identify each size.
     * 
     */
    public String slug() {
        return this.slug;
    }
    /**
     * @return The amount of transfer bandwidth that is available for Droplets created in this size. This only counts traffic on the public interface. The value is given in terabytes.
     * 
     */
    public Double transfer() {
        return this.transfer;
    }
    /**
     * @return The number of CPUs allocated to Droplets of this size.
     * 
     */
    public Integer vcpus() {
        return this.vcpus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSizesSize defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean available;
        private Integer disk;
        private Integer memory;
        private Double priceHourly;
        private Double priceMonthly;
        private List<String> regions;
        private String slug;
        private Double transfer;
        private Integer vcpus;
        public Builder() {}
        public Builder(GetSizesSize defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.available = defaults.available;
    	      this.disk = defaults.disk;
    	      this.memory = defaults.memory;
    	      this.priceHourly = defaults.priceHourly;
    	      this.priceMonthly = defaults.priceMonthly;
    	      this.regions = defaults.regions;
    	      this.slug = defaults.slug;
    	      this.transfer = defaults.transfer;
    	      this.vcpus = defaults.vcpus;
        }

        @CustomType.Setter
        public Builder available(Boolean available) {
            this.available = Objects.requireNonNull(available);
            return this;
        }
        @CustomType.Setter
        public Builder disk(Integer disk) {
            this.disk = Objects.requireNonNull(disk);
            return this;
        }
        @CustomType.Setter
        public Builder memory(Integer memory) {
            this.memory = Objects.requireNonNull(memory);
            return this;
        }
        @CustomType.Setter
        public Builder priceHourly(Double priceHourly) {
            this.priceHourly = Objects.requireNonNull(priceHourly);
            return this;
        }
        @CustomType.Setter
        public Builder priceMonthly(Double priceMonthly) {
            this.priceMonthly = Objects.requireNonNull(priceMonthly);
            return this;
        }
        @CustomType.Setter
        public Builder regions(List<String> regions) {
            this.regions = Objects.requireNonNull(regions);
            return this;
        }
        public Builder regions(String... regions) {
            return regions(List.of(regions));
        }
        @CustomType.Setter
        public Builder slug(String slug) {
            this.slug = Objects.requireNonNull(slug);
            return this;
        }
        @CustomType.Setter
        public Builder transfer(Double transfer) {
            this.transfer = Objects.requireNonNull(transfer);
            return this;
        }
        @CustomType.Setter
        public Builder vcpus(Integer vcpus) {
            this.vcpus = Objects.requireNonNull(vcpus);
            return this;
        }
        public GetSizesSize build() {
            final var _resultValue = new GetSizesSize();
            _resultValue.available = available;
            _resultValue.disk = disk;
            _resultValue.memory = memory;
            _resultValue.priceHourly = priceHourly;
            _resultValue.priceMonthly = priceMonthly;
            _resultValue.regions = regions;
            _resultValue.slug = slug;
            _resultValue.transfer = transfer;
            _resultValue.vcpus = vcpus;
            return _resultValue;
        }
    }
}
