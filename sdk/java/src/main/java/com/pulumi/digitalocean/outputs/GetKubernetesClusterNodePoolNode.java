// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetKubernetesClusterNodePoolNode {
    /**
     * @return The date and time when the node was created.
     * 
     */
    private String createdAt;
    private String dropletId;
    /**
     * @return A unique ID that can be used to identify and reference the node.
     * 
     */
    private String id;
    /**
     * @return The name of Kubernetes cluster.
     * 
     */
    private String name;
    /**
     * @return A string indicating the current status of the individual node.
     * 
     */
    private String status;
    /**
     * @return The date and time when the node was last updated.
     * 
     */
    private String updatedAt;

    private GetKubernetesClusterNodePoolNode() {}
    /**
     * @return The date and time when the node was created.
     * 
     */
    public String createdAt() {
        return this.createdAt;
    }
    public String dropletId() {
        return this.dropletId;
    }
    /**
     * @return A unique ID that can be used to identify and reference the node.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of Kubernetes cluster.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A string indicating the current status of the individual node.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The date and time when the node was last updated.
     * 
     */
    public String updatedAt() {
        return this.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKubernetesClusterNodePoolNode defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createdAt;
        private String dropletId;
        private String id;
        private String name;
        private String status;
        private String updatedAt;
        public Builder() {}
        public Builder(GetKubernetesClusterNodePoolNode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.dropletId = defaults.dropletId;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.status = defaults.status;
    	      this.updatedAt = defaults.updatedAt;
        }

        @CustomType.Setter
        public Builder createdAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }
        @CustomType.Setter
        public Builder dropletId(String dropletId) {
            this.dropletId = Objects.requireNonNull(dropletId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = Objects.requireNonNull(updatedAt);
            return this;
        }
        public GetKubernetesClusterNodePoolNode build() {
            final var _resultValue = new GetKubernetesClusterNodePoolNode();
            _resultValue.createdAt = createdAt;
            _resultValue.dropletId = dropletId;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.status = status;
            _resultValue.updatedAt = updatedAt;
            return _resultValue;
        }
    }
}
