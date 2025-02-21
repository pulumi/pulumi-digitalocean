// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.digitalocean.outputs.GetKubernetesClusterClusterAutoscalerConfiguration;
import com.pulumi.digitalocean.outputs.GetKubernetesClusterControlPlaneFirewall;
import com.pulumi.digitalocean.outputs.GetKubernetesClusterKubeConfig;
import com.pulumi.digitalocean.outputs.GetKubernetesClusterMaintenancePolicy;
import com.pulumi.digitalocean.outputs.GetKubernetesClusterNodePool;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetKubernetesClusterResult {
    /**
     * @return A boolean value indicating whether the cluster will be automatically upgraded to new patch releases during its maintenance window.
     * 
     */
    private Boolean autoUpgrade;
    private @Nullable List<GetKubernetesClusterClusterAutoscalerConfiguration> clusterAutoscalerConfigurations;
    /**
     * @return The range of IP addresses in the overlay network of the Kubernetes cluster.
     * 
     */
    private String clusterSubnet;
    private List<GetKubernetesClusterControlPlaneFirewall> controlPlaneFirewalls;
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
    /**
     * @return A representation of the Kubernetes cluster&#39;s kubeconfig with the following attributes:
     * 
     */
    private List<GetKubernetesClusterKubeConfig> kubeConfigs;
    private @Nullable Integer kubeconfigExpireSeconds;
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
     * 
     */
    public Boolean autoUpgrade() {
        return this.autoUpgrade;
    }
    public List<GetKubernetesClusterClusterAutoscalerConfiguration> clusterAutoscalerConfigurations() {
        return this.clusterAutoscalerConfigurations == null ? List.of() : this.clusterAutoscalerConfigurations;
    }
    /**
     * @return The range of IP addresses in the overlay network of the Kubernetes cluster.
     * 
     */
    public String clusterSubnet() {
        return this.clusterSubnet;
    }
    public List<GetKubernetesClusterControlPlaneFirewall> controlPlaneFirewalls() {
        return this.controlPlaneFirewalls;
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
    /**
     * @return A representation of the Kubernetes cluster&#39;s kubeconfig with the following attributes:
     * 
     */
    public List<GetKubernetesClusterKubeConfig> kubeConfigs() {
        return this.kubeConfigs;
    }
    public Optional<Integer> kubeconfigExpireSeconds() {
        return Optional.ofNullable(this.kubeconfigExpireSeconds);
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
        private @Nullable List<GetKubernetesClusterClusterAutoscalerConfiguration> clusterAutoscalerConfigurations;
        private String clusterSubnet;
        private List<GetKubernetesClusterControlPlaneFirewall> controlPlaneFirewalls;
        private String createdAt;
        private String endpoint;
        private Boolean ha;
        private String id;
        private String ipv4Address;
        private List<GetKubernetesClusterKubeConfig> kubeConfigs;
        private @Nullable Integer kubeconfigExpireSeconds;
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
    	      this.clusterAutoscalerConfigurations = defaults.clusterAutoscalerConfigurations;
    	      this.clusterSubnet = defaults.clusterSubnet;
    	      this.controlPlaneFirewalls = defaults.controlPlaneFirewalls;
    	      this.createdAt = defaults.createdAt;
    	      this.endpoint = defaults.endpoint;
    	      this.ha = defaults.ha;
    	      this.id = defaults.id;
    	      this.ipv4Address = defaults.ipv4Address;
    	      this.kubeConfigs = defaults.kubeConfigs;
    	      this.kubeconfigExpireSeconds = defaults.kubeconfigExpireSeconds;
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
            if (autoUpgrade == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClusterResult", "autoUpgrade");
            }
            this.autoUpgrade = autoUpgrade;
            return this;
        }
        @CustomType.Setter
        public Builder clusterAutoscalerConfigurations(@Nullable List<GetKubernetesClusterClusterAutoscalerConfiguration> clusterAutoscalerConfigurations) {

            this.clusterAutoscalerConfigurations = clusterAutoscalerConfigurations;
            return this;
        }
        public Builder clusterAutoscalerConfigurations(GetKubernetesClusterClusterAutoscalerConfiguration... clusterAutoscalerConfigurations) {
            return clusterAutoscalerConfigurations(List.of(clusterAutoscalerConfigurations));
        }
        @CustomType.Setter
        public Builder clusterSubnet(String clusterSubnet) {
            if (clusterSubnet == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClusterResult", "clusterSubnet");
            }
            this.clusterSubnet = clusterSubnet;
            return this;
        }
        @CustomType.Setter
        public Builder controlPlaneFirewalls(List<GetKubernetesClusterControlPlaneFirewall> controlPlaneFirewalls) {
            if (controlPlaneFirewalls == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClusterResult", "controlPlaneFirewalls");
            }
            this.controlPlaneFirewalls = controlPlaneFirewalls;
            return this;
        }
        public Builder controlPlaneFirewalls(GetKubernetesClusterControlPlaneFirewall... controlPlaneFirewalls) {
            return controlPlaneFirewalls(List.of(controlPlaneFirewalls));
        }
        @CustomType.Setter
        public Builder createdAt(String createdAt) {
            if (createdAt == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClusterResult", "createdAt");
            }
            this.createdAt = createdAt;
            return this;
        }
        @CustomType.Setter
        public Builder endpoint(String endpoint) {
            if (endpoint == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClusterResult", "endpoint");
            }
            this.endpoint = endpoint;
            return this;
        }
        @CustomType.Setter
        public Builder ha(Boolean ha) {
            if (ha == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClusterResult", "ha");
            }
            this.ha = ha;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClusterResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ipv4Address(String ipv4Address) {
            if (ipv4Address == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClusterResult", "ipv4Address");
            }
            this.ipv4Address = ipv4Address;
            return this;
        }
        @CustomType.Setter
        public Builder kubeConfigs(List<GetKubernetesClusterKubeConfig> kubeConfigs) {
            if (kubeConfigs == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClusterResult", "kubeConfigs");
            }
            this.kubeConfigs = kubeConfigs;
            return this;
        }
        public Builder kubeConfigs(GetKubernetesClusterKubeConfig... kubeConfigs) {
            return kubeConfigs(List.of(kubeConfigs));
        }
        @CustomType.Setter
        public Builder kubeconfigExpireSeconds(@Nullable Integer kubeconfigExpireSeconds) {

            this.kubeconfigExpireSeconds = kubeconfigExpireSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder maintenancePolicies(List<GetKubernetesClusterMaintenancePolicy> maintenancePolicies) {
            if (maintenancePolicies == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClusterResult", "maintenancePolicies");
            }
            this.maintenancePolicies = maintenancePolicies;
            return this;
        }
        public Builder maintenancePolicies(GetKubernetesClusterMaintenancePolicy... maintenancePolicies) {
            return maintenancePolicies(List.of(maintenancePolicies));
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClusterResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder nodePools(List<GetKubernetesClusterNodePool> nodePools) {
            if (nodePools == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClusterResult", "nodePools");
            }
            this.nodePools = nodePools;
            return this;
        }
        public Builder nodePools(GetKubernetesClusterNodePool... nodePools) {
            return nodePools(List.of(nodePools));
        }
        @CustomType.Setter
        public Builder region(String region) {
            if (region == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClusterResult", "region");
            }
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder serviceSubnet(String serviceSubnet) {
            if (serviceSubnet == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClusterResult", "serviceSubnet");
            }
            this.serviceSubnet = serviceSubnet;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClusterResult", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder surgeUpgrade(Boolean surgeUpgrade) {
            if (surgeUpgrade == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClusterResult", "surgeUpgrade");
            }
            this.surgeUpgrade = surgeUpgrade;
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
            if (updatedAt == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClusterResult", "updatedAt");
            }
            this.updatedAt = updatedAt;
            return this;
        }
        @CustomType.Setter
        public Builder urn(String urn) {
            if (urn == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClusterResult", "urn");
            }
            this.urn = urn;
            return this;
        }
        @CustomType.Setter
        public Builder version(String version) {
            if (version == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClusterResult", "version");
            }
            this.version = version;
            return this;
        }
        @CustomType.Setter
        public Builder vpcUuid(String vpcUuid) {
            if (vpcUuid == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClusterResult", "vpcUuid");
            }
            this.vpcUuid = vpcUuid;
            return this;
        }
        public GetKubernetesClusterResult build() {
            final var _resultValue = new GetKubernetesClusterResult();
            _resultValue.autoUpgrade = autoUpgrade;
            _resultValue.clusterAutoscalerConfigurations = clusterAutoscalerConfigurations;
            _resultValue.clusterSubnet = clusterSubnet;
            _resultValue.controlPlaneFirewalls = controlPlaneFirewalls;
            _resultValue.createdAt = createdAt;
            _resultValue.endpoint = endpoint;
            _resultValue.ha = ha;
            _resultValue.id = id;
            _resultValue.ipv4Address = ipv4Address;
            _resultValue.kubeConfigs = kubeConfigs;
            _resultValue.kubeconfigExpireSeconds = kubeconfigExpireSeconds;
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
