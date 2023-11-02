// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.digitalocean.outputs.GetKubernetesClusterKubeConfig;
import com.pulumi.digitalocean.outputs.GetKubernetesClusterMaintenancePolicy;
import com.pulumi.digitalocean.outputs.GetKubernetesClusterNodePool;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetKubernetesClusterResult {
    /**
     * @return A boolean value indicating whether the cluster will be automatically upgraded to new patch releases during its maintenance window.
     * * `kube_config.0` - A representation of the Kubernetes cluster&#39;s kubeconfig with the following attributes:
     * 
     */
    private Boolean autoUpgrade;
    /**
     * @return The range of IP addresses in the overlay network of the Kubernetes cluster.
     * 
     */
    private String clusterSubnet;
    /**
     * @return The date and time when the node was created.
     * 
     */
    private String createdAt;
    /**
     * @return The base URL of the API server on the Kubernetes master node.
     * 
     */
    private String endpoint;
    private Boolean ha;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The public IPv4 address of the Kubernetes master node.
     * 
     */
    private String ipv4Address;
    private List<GetKubernetesClusterKubeConfig> kubeConfigs;
    /**
     * @return The maintenance policy of the Kubernetes cluster. Digital Ocean has a default maintenancen window.
     * 
     */
    private List<GetKubernetesClusterMaintenancePolicy> maintenancePolicies;
    /**
     * @return The auto-generated name for the node.
     * 
     */
    private String name;
    /**
     * @return A list of node pools associated with the cluster. Each node pool exports the following attributes:
     * 
     */
    private List<GetKubernetesClusterNodePool> nodePools;
    /**
     * @return The slug identifier for the region where the Kubernetes cluster is located.
     * 
     */
    private String region;
    /**
     * @return The range of assignable IP addresses for services running in the Kubernetes cluster.
     * 
     */
    private String serviceSubnet;
    /**
     * @return A string indicating the current status of the individual node.
     * 
     */
    private String status;
    private Boolean surgeUpgrade;
    /**
     * @return A list of tag names applied to the node pool.
     * 
     */
    private @Nullable List<String> tags;
    /**
     * @return The date and time when the node was last updated.
     * 
     */
    private String updatedAt;
    /**
     * @return The uniform resource name (URN) for the Kubernetes cluster.
     * 
     */
    private String urn;
    /**
     * @return The slug identifier for the version of Kubernetes used for the cluster.
     * 
     */
    private String version;
    /**
     * @return The ID of the VPC where the Kubernetes cluster is located.
     * 
     */
    private String vpcUuid;

    private GetKubernetesClusterResult() {}
    /**
     * @return A boolean value indicating whether the cluster will be automatically upgraded to new patch releases during its maintenance window.
     * * `kube_config.0` - A representation of the Kubernetes cluster&#39;s kubeconfig with the following attributes:
     * 
     */
    public Boolean autoUpgrade() {
        return this.autoUpgrade;
    }
    /**
     * @return The range of IP addresses in the overlay network of the Kubernetes cluster.
     * 
     */
    public String clusterSubnet() {
        return this.clusterSubnet;
    }
    /**
     * @return The date and time when the node was created.
     * 
     */
    public String createdAt() {
        return this.createdAt;
    }
    /**
     * @return The base URL of the API server on the Kubernetes master node.
     * 
     */
    public String endpoint() {
        return this.endpoint;
    }
    public Boolean ha() {
        return this.ha;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The public IPv4 address of the Kubernetes master node.
     * 
     */
    public String ipv4Address() {
        return this.ipv4Address;
    }
    public List<GetKubernetesClusterKubeConfig> kubeConfigs() {
        return this.kubeConfigs;
    }
    /**
     * @return The maintenance policy of the Kubernetes cluster. Digital Ocean has a default maintenancen window.
     * 
     */
    public List<GetKubernetesClusterMaintenancePolicy> maintenancePolicies() {
        return this.maintenancePolicies;
    }
    /**
     * @return The auto-generated name for the node.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A list of node pools associated with the cluster. Each node pool exports the following attributes:
     * 
     */
    public List<GetKubernetesClusterNodePool> nodePools() {
        return this.nodePools;
    }
    /**
     * @return The slug identifier for the region where the Kubernetes cluster is located.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return The range of assignable IP addresses for services running in the Kubernetes cluster.
     * 
     */
    public String serviceSubnet() {
        return this.serviceSubnet;
    }
    /**
     * @return A string indicating the current status of the individual node.
     * 
     */
    public String status() {
        return this.status;
    }
    public Boolean surgeUpgrade() {
        return this.surgeUpgrade;
    }
    /**
     * @return A list of tag names applied to the node pool.
     * 
     */
    public List<String> tags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * @return The date and time when the node was last updated.
     * 
     */
    public String updatedAt() {
        return this.updatedAt;
    }
    /**
     * @return The uniform resource name (URN) for the Kubernetes cluster.
     * 
     */
    public String urn() {
        return this.urn;
    }
    /**
     * @return The slug identifier for the version of Kubernetes used for the cluster.
     * 
     */
    public String version() {
        return this.version;
    }
    /**
     * @return The ID of the VPC where the Kubernetes cluster is located.
     * 
     */
    public String vpcUuid() {
        return this.vpcUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKubernetesClusterResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean autoUpgrade;
        private String clusterSubnet;
        private String createdAt;
        private String endpoint;
        private Boolean ha;
        private String id;
        private String ipv4Address;
        private List<GetKubernetesClusterKubeConfig> kubeConfigs;
        private List<GetKubernetesClusterMaintenancePolicy> maintenancePolicies;
        private String name;
        private List<GetKubernetesClusterNodePool> nodePools;
        private String region;
        private String serviceSubnet;
        private String status;
        private Boolean surgeUpgrade;
        private @Nullable List<String> tags;
        private String updatedAt;
        private String urn;
        private String version;
        private String vpcUuid;
        public Builder() {}
        public Builder(GetKubernetesClusterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoUpgrade = defaults.autoUpgrade;
    	      this.clusterSubnet = defaults.clusterSubnet;
    	      this.createdAt = defaults.createdAt;
    	      this.endpoint = defaults.endpoint;
    	      this.ha = defaults.ha;
    	      this.id = defaults.id;
    	      this.ipv4Address = defaults.ipv4Address;
    	      this.kubeConfigs = defaults.kubeConfigs;
    	      this.maintenancePolicies = defaults.maintenancePolicies;
    	      this.name = defaults.name;
    	      this.nodePools = defaults.nodePools;
    	      this.region = defaults.region;
    	      this.serviceSubnet = defaults.serviceSubnet;
    	      this.status = defaults.status;
    	      this.surgeUpgrade = defaults.surgeUpgrade;
    	      this.tags = defaults.tags;
    	      this.updatedAt = defaults.updatedAt;
    	      this.urn = defaults.urn;
    	      this.version = defaults.version;
    	      this.vpcUuid = defaults.vpcUuid;
        }

        @CustomType.Setter
        public Builder autoUpgrade(Boolean autoUpgrade) {
            this.autoUpgrade = Objects.requireNonNull(autoUpgrade);
            return this;
        }
        @CustomType.Setter
        public Builder clusterSubnet(String clusterSubnet) {
            this.clusterSubnet = Objects.requireNonNull(clusterSubnet);
            return this;
        }
        @CustomType.Setter
        public Builder createdAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }
        @CustomType.Setter
        public Builder endpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }
        @CustomType.Setter
        public Builder ha(Boolean ha) {
            this.ha = Objects.requireNonNull(ha);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ipv4Address(String ipv4Address) {
            this.ipv4Address = Objects.requireNonNull(ipv4Address);
            return this;
        }
        @CustomType.Setter
        public Builder kubeConfigs(List<GetKubernetesClusterKubeConfig> kubeConfigs) {
            this.kubeConfigs = Objects.requireNonNull(kubeConfigs);
            return this;
        }
        public Builder kubeConfigs(GetKubernetesClusterKubeConfig... kubeConfigs) {
            return kubeConfigs(List.of(kubeConfigs));
        }
        @CustomType.Setter
        public Builder maintenancePolicies(List<GetKubernetesClusterMaintenancePolicy> maintenancePolicies) {
            this.maintenancePolicies = Objects.requireNonNull(maintenancePolicies);
            return this;
        }
        public Builder maintenancePolicies(GetKubernetesClusterMaintenancePolicy... maintenancePolicies) {
            return maintenancePolicies(List.of(maintenancePolicies));
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder nodePools(List<GetKubernetesClusterNodePool> nodePools) {
            this.nodePools = Objects.requireNonNull(nodePools);
            return this;
        }
        public Builder nodePools(GetKubernetesClusterNodePool... nodePools) {
            return nodePools(List.of(nodePools));
        }
        @CustomType.Setter
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        @CustomType.Setter
        public Builder serviceSubnet(String serviceSubnet) {
            this.serviceSubnet = Objects.requireNonNull(serviceSubnet);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder surgeUpgrade(Boolean surgeUpgrade) {
            this.surgeUpgrade = Objects.requireNonNull(surgeUpgrade);
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable List<String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = Objects.requireNonNull(updatedAt);
            return this;
        }
        @CustomType.Setter
        public Builder urn(String urn) {
            this.urn = Objects.requireNonNull(urn);
            return this;
        }
        @CustomType.Setter
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        @CustomType.Setter
        public Builder vpcUuid(String vpcUuid) {
            this.vpcUuid = Objects.requireNonNull(vpcUuid);
            return this;
        }
        public GetKubernetesClusterResult build() {
            final var _resultValue = new GetKubernetesClusterResult();
            _resultValue.autoUpgrade = autoUpgrade;
            _resultValue.clusterSubnet = clusterSubnet;
            _resultValue.createdAt = createdAt;
            _resultValue.endpoint = endpoint;
            _resultValue.ha = ha;
            _resultValue.id = id;
            _resultValue.ipv4Address = ipv4Address;
            _resultValue.kubeConfigs = kubeConfigs;
            _resultValue.maintenancePolicies = maintenancePolicies;
            _resultValue.name = name;
            _resultValue.nodePools = nodePools;
            _resultValue.region = region;
            _resultValue.serviceSubnet = serviceSubnet;
            _resultValue.status = status;
            _resultValue.surgeUpgrade = surgeUpgrade;
            _resultValue.tags = tags;
            _resultValue.updatedAt = updatedAt;
            _resultValue.urn = urn;
            _resultValue.version = version;
            _resultValue.vpcUuid = vpcUuid;
            return _resultValue;
        }
    }
}
