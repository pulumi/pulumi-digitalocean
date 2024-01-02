// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSpacesBucketObjectsResult {
    private String bucket;
    /**
     * @return List of any keys between `prefix` and the next occurrence of `delimiter` (i.e., similar to subdirectories of the `prefix` &#34;directory&#34;); the list is only returned when you specify `delimiter`
     * 
     */
    private List<String> commonPrefixes;
    private @Nullable String delimiter;
    private @Nullable String encodingType;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return List of strings representing object keys
     * 
     */
    private List<String> keys;
    private @Nullable Integer maxKeys;
    /**
     * @return List of strings representing object owner IDs
     * 
     */
    private List<String> owners;
    private @Nullable String prefix;
    private String region;

    private GetSpacesBucketObjectsResult() {}
    public String bucket() {
        return this.bucket;
    }
    /**
     * @return List of any keys between `prefix` and the next occurrence of `delimiter` (i.e., similar to subdirectories of the `prefix` &#34;directory&#34;); the list is only returned when you specify `delimiter`
     * 
     */
    public List<String> commonPrefixes() {
        return this.commonPrefixes;
    }
    public Optional<String> delimiter() {
        return Optional.ofNullable(this.delimiter);
    }
    public Optional<String> encodingType() {
        return Optional.ofNullable(this.encodingType);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return List of strings representing object keys
     * 
     */
    public List<String> keys() {
        return this.keys;
    }
    public Optional<Integer> maxKeys() {
        return Optional.ofNullable(this.maxKeys);
    }
    /**
     * @return List of strings representing object owner IDs
     * 
     */
    public List<String> owners() {
        return this.owners;
    }
    public Optional<String> prefix() {
        return Optional.ofNullable(this.prefix);
    }
    public String region() {
        return this.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSpacesBucketObjectsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String bucket;
        private List<String> commonPrefixes;
        private @Nullable String delimiter;
        private @Nullable String encodingType;
        private String id;
        private List<String> keys;
        private @Nullable Integer maxKeys;
        private List<String> owners;
        private @Nullable String prefix;
        private String region;
        public Builder() {}
        public Builder(GetSpacesBucketObjectsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.commonPrefixes = defaults.commonPrefixes;
    	      this.delimiter = defaults.delimiter;
    	      this.encodingType = defaults.encodingType;
    	      this.id = defaults.id;
    	      this.keys = defaults.keys;
    	      this.maxKeys = defaults.maxKeys;
    	      this.owners = defaults.owners;
    	      this.prefix = defaults.prefix;
    	      this.region = defaults.region;
        }

        @CustomType.Setter
        public Builder bucket(String bucket) {
            if (bucket == null) {
              throw new MissingRequiredPropertyException("GetSpacesBucketObjectsResult", "bucket");
            }
            this.bucket = bucket;
            return this;
        }
        @CustomType.Setter
        public Builder commonPrefixes(List<String> commonPrefixes) {
            if (commonPrefixes == null) {
              throw new MissingRequiredPropertyException("GetSpacesBucketObjectsResult", "commonPrefixes");
            }
            this.commonPrefixes = commonPrefixes;
            return this;
        }
        public Builder commonPrefixes(String... commonPrefixes) {
            return commonPrefixes(List.of(commonPrefixes));
        }
        @CustomType.Setter
        public Builder delimiter(@Nullable String delimiter) {

            this.delimiter = delimiter;
            return this;
        }
        @CustomType.Setter
        public Builder encodingType(@Nullable String encodingType) {

            this.encodingType = encodingType;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSpacesBucketObjectsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder keys(List<String> keys) {
            if (keys == null) {
              throw new MissingRequiredPropertyException("GetSpacesBucketObjectsResult", "keys");
            }
            this.keys = keys;
            return this;
        }
        public Builder keys(String... keys) {
            return keys(List.of(keys));
        }
        @CustomType.Setter
        public Builder maxKeys(@Nullable Integer maxKeys) {

            this.maxKeys = maxKeys;
            return this;
        }
        @CustomType.Setter
        public Builder owners(List<String> owners) {
            if (owners == null) {
              throw new MissingRequiredPropertyException("GetSpacesBucketObjectsResult", "owners");
            }
            this.owners = owners;
            return this;
        }
        public Builder owners(String... owners) {
            return owners(List.of(owners));
        }
        @CustomType.Setter
        public Builder prefix(@Nullable String prefix) {

            this.prefix = prefix;
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            if (region == null) {
              throw new MissingRequiredPropertyException("GetSpacesBucketObjectsResult", "region");
            }
            this.region = region;
            return this;
        }
        public GetSpacesBucketObjectsResult build() {
            final var _resultValue = new GetSpacesBucketObjectsResult();
            _resultValue.bucket = bucket;
            _resultValue.commonPrefixes = commonPrefixes;
            _resultValue.delimiter = delimiter;
            _resultValue.encodingType = encodingType;
            _resultValue.id = id;
            _resultValue.keys = keys;
            _resultValue.maxKeys = maxKeys;
            _resultValue.owners = owners;
            _resultValue.prefix = prefix;
            _resultValue.region = region;
            return _resultValue;
        }
    }
}
