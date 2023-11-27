// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.digitalocean.outputs.GetKubernetesClusterNodePoolNode;
import com.pulumi.digitalocean.outputs.GetKubernetesClusterNodePoolTaint;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetKubernetesClusterNodePool {
    /**
     * @return The actual number of nodes in the node pool, which is especially useful when auto-scaling is enabled.
     * 
     */
    private Integer actualNodeCount;
    /**
     * @return A boolean indicating whether auto-scaling is enabled on the node pool.
     * 
     */
    private Boolean autoScale;
    /**
     * @return A unique ID that can be used to identify and reference the node.
     * 
     */
    private String id;
    /**
     * @return A map of key/value pairs applied to nodes in the pool. The labels are exposed in the Kubernetes API as labels in the metadata of the corresponding [Node resources](https://kubernetes.io/docs/concepts/architecture/nodes/).
     * 
     */
    private Map<String,String> labels;
    /**
     * @return If auto-scaling is enabled, this represents the maximum number of nodes that the node pool can be scaled up to.
     * 
     */
    private Integer maxNodes;
    /**
     * @return If auto-scaling is enabled, this represents the minimum number of nodes that the node pool can be scaled down to.
     * 
     */
    private Integer minNodes;
    /**
     * @return The name of Kubernetes cluster.
     * 
     */
    private String name;
    /**
     * @return The number of Droplet instances in the node pool.
     * 
     */
    private Integer nodeCount;
    /**
     * @return A list of nodes in the pool. Each node exports the following attributes:
     * 
     */
    private List<GetKubernetesClusterNodePoolNode> nodes;
    /**
     * @return The slug identifier for the type of Droplet used as workers in the node pool.
     * 
     */
    private String size;
    /**
     * @return A list of tag names applied to the node pool.
     * 
     */
    private List<String> tags;
    /**
     * @return A list of taints applied to all nodes in the pool. Each taint exports the following attributes:
     * 
     */
    private List<GetKubernetesClusterNodePoolTaint> taints;

    private GetKubernetesClusterNodePool() {}
    /**
     * @return The actual number of nodes in the node pool, which is especially useful when auto-scaling is enabled.
     * 
     */
    public Integer actualNodeCount() {
        return this.actualNodeCount;
    }
    /**
     * @return A boolean indicating whether auto-scaling is enabled on the node pool.
     * 
     */
    public Boolean autoScale() {
        return this.autoScale;
    }
    /**
     * @return A unique ID that can be used to identify and reference the node.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A map of key/value pairs applied to nodes in the pool. The labels are exposed in the Kubernetes API as labels in the metadata of the corresponding [Node resources](https://kubernetes.io/docs/concepts/architecture/nodes/).
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return If auto-scaling is enabled, this represents the maximum number of nodes that the node pool can be scaled up to.
     * 
     */
    public Integer maxNodes() {
        return this.maxNodes;
    }
    /**
     * @return If auto-scaling is enabled, this represents the minimum number of nodes that the node pool can be scaled down to.
     * 
     */
    public Integer minNodes() {
        return this.minNodes;
    }
    /**
     * @return The name of Kubernetes cluster.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The number of Droplet instances in the node pool.
     * 
     */
    public Integer nodeCount() {
        return this.nodeCount;
    }
    /**
     * @return A list of nodes in the pool. Each node exports the following attributes:
     * 
     */
    public List<GetKubernetesClusterNodePoolNode> nodes() {
        return this.nodes;
    }
    /**
     * @return The slug identifier for the type of Droplet used as workers in the node pool.
     * 
     */
    public String size() {
        return this.size;
    }
    /**
     * @return A list of tag names applied to the node pool.
     * 
     */
    public List<String> tags() {
        return this.tags;
    }
    /**
     * @return A list of taints applied to all nodes in the pool. Each taint exports the following attributes:
     * 
     */
    public List<GetKubernetesClusterNodePoolTaint> taints() {
        return this.taints;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKubernetesClusterNodePool defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer actualNodeCount;
        private Boolean autoScale;
        private String id;
        private Map<String,String> labels;
        private Integer maxNodes;
        private Integer minNodes;
        private String name;
        private Integer nodeCount;
        private List<GetKubernetesClusterNodePoolNode> nodes;
        private String size;
        private List<String> tags;
        private List<GetKubernetesClusterNodePoolTaint> taints;
        public Builder() {}
        public Builder(GetKubernetesClusterNodePool defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actualNodeCount = defaults.actualNodeCount;
    	      this.autoScale = defaults.autoScale;
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.maxNodes = defaults.maxNodes;
    	      this.minNodes = defaults.minNodes;
    	      this.name = defaults.name;
    	      this.nodeCount = defaults.nodeCount;
    	      this.nodes = defaults.nodes;
    	      this.size = defaults.size;
    	      this.tags = defaults.tags;
    	      this.taints = defaults.taints;
        }

        @CustomType.Setter
        public Builder actualNodeCount(Integer actualNodeCount) {
            this.actualNodeCount = Objects.requireNonNull(actualNodeCount);
            return this;
        }
        @CustomType.Setter
        public Builder autoScale(Boolean autoScale) {
            this.autoScale = Objects.requireNonNull(autoScale);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        @CustomType.Setter
        public Builder maxNodes(Integer maxNodes) {
            this.maxNodes = Objects.requireNonNull(maxNodes);
            return this;
        }
        @CustomType.Setter
        public Builder minNodes(Integer minNodes) {
            this.minNodes = Objects.requireNonNull(minNodes);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder nodeCount(Integer nodeCount) {
            this.nodeCount = Objects.requireNonNull(nodeCount);
            return this;
        }
        @CustomType.Setter
        public Builder nodes(List<GetKubernetesClusterNodePoolNode> nodes) {
            this.nodes = Objects.requireNonNull(nodes);
            return this;
        }
        public Builder nodes(GetKubernetesClusterNodePoolNode... nodes) {
            return nodes(List.of(nodes));
        }
        @CustomType.Setter
        public Builder size(String size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder taints(List<GetKubernetesClusterNodePoolTaint> taints) {
            this.taints = Objects.requireNonNull(taints);
            return this;
        }
        public Builder taints(GetKubernetesClusterNodePoolTaint... taints) {
            return taints(List.of(taints));
        }
        public GetKubernetesClusterNodePool build() {
            final var _resultValue = new GetKubernetesClusterNodePool();
            _resultValue.actualNodeCount = actualNodeCount;
            _resultValue.autoScale = autoScale;
            _resultValue.id = id;
            _resultValue.labels = labels;
            _resultValue.maxNodes = maxNodes;
            _resultValue.minNodes = minNodes;
            _resultValue.name = name;
            _resultValue.nodeCount = nodeCount;
            _resultValue.nodes = nodes;
            _resultValue.size = size;
            _resultValue.tags = tags;
            _resultValue.taints = taints;
            return _resultValue;
        }
    }
}
