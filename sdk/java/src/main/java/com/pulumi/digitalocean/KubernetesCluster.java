// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.digitalocean.KubernetesClusterArgs;
import com.pulumi.digitalocean.Utilities;
import com.pulumi.digitalocean.inputs.KubernetesClusterState;
import com.pulumi.digitalocean.outputs.KubernetesClusterClusterAutoscalerConfiguration;
import com.pulumi.digitalocean.outputs.KubernetesClusterControlPlaneFirewall;
import com.pulumi.digitalocean.outputs.KubernetesClusterKubeConfig;
import com.pulumi.digitalocean.outputs.KubernetesClusterMaintenancePolicy;
import com.pulumi.digitalocean.outputs.KubernetesClusterNodePool;
import com.pulumi.digitalocean.outputs.KubernetesClusterRoutingAgent;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * Before importing a Kubernetes cluster, the cluster&#39;s default node pool must be tagged with
 * 
 * the `terraform:default-node-pool` tag. The provider will automatically add this tag if
 * 
 * the cluster only has a single node pool. Clusters with more than one node pool, however, will require
 * 
 * that you manually add the `terraform:default-node-pool` tag to the node pool that you intend to be
 * 
 * the default node pool.
 * 
 * Then the Kubernetes cluster and its default node pool can be imported using the cluster&#39;s `id`, e.g.
 * 
 * ```sh
 * $ pulumi import digitalocean:index/kubernetesCluster:KubernetesCluster mycluster 1b8b2100-0e9f-4e8f-ad78-9eb578c2a0af
 * ```
 * 
 * Additional node pools must be imported separately as `digitalocean_kubernetes_cluster`
 * 
 * resources, e.g.
 * 
 * ```sh
 * $ pulumi import digitalocean:index/kubernetesCluster:KubernetesCluster mynodepool 9d76f410-9284-4436-9633-4066852442c8
 * ```
 * 
 */
@ResourceType(type="digitalocean:index/kubernetesCluster:KubernetesCluster")
public class KubernetesCluster extends com.pulumi.resources.CustomResource {
    /**
     * A boolean value indicating whether the cluster will be automatically upgraded to new patch releases during its maintenance window.
     * 
     */
    @Export(name="autoUpgrade", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> autoUpgrade;

    /**
     * @return A boolean value indicating whether the cluster will be automatically upgraded to new patch releases during its maintenance window.
     * 
     */
    public Output<Optional<Boolean>> autoUpgrade() {
        return Codegen.optional(this.autoUpgrade);
    }
    /**
     * Block containing options for cluster auto-scaling.
     * 
     */
    @Export(name="clusterAutoscalerConfigurations", refs={List.class,KubernetesClusterClusterAutoscalerConfiguration.class}, tree="[0,1]")
    private Output</* @Nullable */ List<KubernetesClusterClusterAutoscalerConfiguration>> clusterAutoscalerConfigurations;

    /**
     * @return Block containing options for cluster auto-scaling.
     * 
     */
    public Output<Optional<List<KubernetesClusterClusterAutoscalerConfiguration>>> clusterAutoscalerConfigurations() {
        return Codegen.optional(this.clusterAutoscalerConfigurations);
    }
    /**
     * The range of IP addresses in the overlay network of the Kubernetes cluster. For more information, see [here](https://docs.digitalocean.com/products/kubernetes/how-to/create-clusters/#create-with-vpc-native).
     * 
     */
    @Export(name="clusterSubnet", refs={String.class}, tree="[0]")
    private Output<String> clusterSubnet;

    /**
     * @return The range of IP addresses in the overlay network of the Kubernetes cluster. For more information, see [here](https://docs.digitalocean.com/products/kubernetes/how-to/create-clusters/#create-with-vpc-native).
     * 
     */
    public Output<String> clusterSubnet() {
        return this.clusterSubnet;
    }
    /**
     * The uniform resource name (URN) for the Kubernetes cluster.
     * 
     */
    @Export(name="clusterUrn", refs={String.class}, tree="[0]")
    private Output<String> clusterUrn;

    /**
     * @return The uniform resource name (URN) for the Kubernetes cluster.
     * 
     */
    public Output<String> clusterUrn() {
        return this.clusterUrn;
    }
    /**
     * A block representing the cluster&#39;s control plane firewall
     * 
     */
    @Export(name="controlPlaneFirewall", refs={KubernetesClusterControlPlaneFirewall.class}, tree="[0]")
    private Output<KubernetesClusterControlPlaneFirewall> controlPlaneFirewall;

    /**
     * @return A block representing the cluster&#39;s control plane firewall
     * 
     */
    public Output<KubernetesClusterControlPlaneFirewall> controlPlaneFirewall() {
        return this.controlPlaneFirewall;
    }
    /**
     * The date and time when the node was created.
     * 
     */
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    /**
     * @return The date and time when the node was created.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * **Use with caution.** When set to true, all associated DigitalOcean resources created via the Kubernetes API (load balancers, volumes, and volume snapshots) will be destroyed along with the cluster when it is destroyed.
     * 
     */
    @Export(name="destroyAllAssociatedResources", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> destroyAllAssociatedResources;

    /**
     * @return **Use with caution.** When set to true, all associated DigitalOcean resources created via the Kubernetes API (load balancers, volumes, and volume snapshots) will be destroyed along with the cluster when it is destroyed.
     * 
     */
    public Output<Optional<Boolean>> destroyAllAssociatedResources() {
        return Codegen.optional(this.destroyAllAssociatedResources);
    }
    /**
     * The base URL of the API server on the Kubernetes master node.
     * 
     */
    @Export(name="endpoint", refs={String.class}, tree="[0]")
    private Output<String> endpoint;

    /**
     * @return The base URL of the API server on the Kubernetes master node.
     * 
     */
    public Output<String> endpoint() {
        return this.endpoint;
    }
    /**
     * Enable/disable the high availability control plane for a cluster. Once enabled for a cluster, high availability cannot be disabled. Default: false
     * 
     */
    @Export(name="ha", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> ha;

    /**
     * @return Enable/disable the high availability control plane for a cluster. Once enabled for a cluster, high availability cannot be disabled. Default: false
     * 
     */
    public Output<Optional<Boolean>> ha() {
        return Codegen.optional(this.ha);
    }
    /**
     * The public IPv4 address of the Kubernetes master node. This will not be set if high availability is configured on the cluster (v1.21+)
     * 
     */
    @Export(name="ipv4Address", refs={String.class}, tree="[0]")
    private Output<String> ipv4Address;

    /**
     * @return The public IPv4 address of the Kubernetes master node. This will not be set if high availability is configured on the cluster (v1.21+)
     * 
     */
    public Output<String> ipv4Address() {
        return this.ipv4Address;
    }
    /**
     * A representation of the Kubernetes cluster&#39;s kubeconfig with the following attributes:
     * 
     */
    @Export(name="kubeConfigs", refs={List.class,KubernetesClusterKubeConfig.class}, tree="[0,1]")
    private Output<List<KubernetesClusterKubeConfig>> kubeConfigs;

    /**
     * @return A representation of the Kubernetes cluster&#39;s kubeconfig with the following attributes:
     * 
     */
    public Output<List<KubernetesClusterKubeConfig>> kubeConfigs() {
        return this.kubeConfigs;
    }
    /**
     * The duration in seconds that the returned Kubernetes credentials will be valid. If not set or 0, the credentials will have a 7 day expiry.
     * 
     */
    @Export(name="kubeconfigExpireSeconds", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> kubeconfigExpireSeconds;

    /**
     * @return The duration in seconds that the returned Kubernetes credentials will be valid. If not set or 0, the credentials will have a 7 day expiry.
     * 
     */
    public Output<Optional<Integer>> kubeconfigExpireSeconds() {
        return Codegen.optional(this.kubeconfigExpireSeconds);
    }
    /**
     * A block representing the cluster&#39;s maintenance window. Updates will be applied within this window. If not specified, a default maintenance window will be chosen. `auto_upgrade` must be set to `true` for this to have an effect.
     * 
     */
    @Export(name="maintenancePolicy", refs={KubernetesClusterMaintenancePolicy.class}, tree="[0]")
    private Output<KubernetesClusterMaintenancePolicy> maintenancePolicy;

    /**
     * @return A block representing the cluster&#39;s maintenance window. Updates will be applied within this window. If not specified, a default maintenance window will be chosen. `auto_upgrade` must be set to `true` for this to have an effect.
     * 
     */
    public Output<KubernetesClusterMaintenancePolicy> maintenancePolicy() {
        return this.maintenancePolicy;
    }
    /**
     * A name for the Kubernetes cluster.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return A name for the Kubernetes cluster.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A block representing the cluster&#39;s default node pool. Additional node pools may be added to the cluster using the `digitalocean.KubernetesNodePool` resource. The following arguments may be specified:
     * 
     */
    @Export(name="nodePool", refs={KubernetesClusterNodePool.class}, tree="[0]")
    private Output<KubernetesClusterNodePool> nodePool;

    /**
     * @return A block representing the cluster&#39;s default node pool. Additional node pools may be added to the cluster using the `digitalocean.KubernetesNodePool` resource. The following arguments may be specified:
     * 
     */
    public Output<KubernetesClusterNodePool> nodePool() {
        return this.nodePool;
    }
    /**
     * The slug identifier for the region where the Kubernetes cluster will be created.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return The slug identifier for the region where the Kubernetes cluster will be created.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * Enables or disables the DigitalOcean container registry integration for the cluster. This requires that a container registry has first been created for the account. Default: false
     * 
     */
    @Export(name="registryIntegration", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> registryIntegration;

    /**
     * @return Enables or disables the DigitalOcean container registry integration for the cluster. This requires that a container registry has first been created for the account. Default: false
     * 
     */
    public Output<Optional<Boolean>> registryIntegration() {
        return Codegen.optional(this.registryIntegration);
    }
    /**
     * Block containing options for the routing-agent component. If not specified, the routing-agent component will not be installed in the cluster.
     * 
     */
    @Export(name="routingAgent", refs={KubernetesClusterRoutingAgent.class}, tree="[0]")
    private Output<KubernetesClusterRoutingAgent> routingAgent;

    /**
     * @return Block containing options for the routing-agent component. If not specified, the routing-agent component will not be installed in the cluster.
     * 
     */
    public Output<KubernetesClusterRoutingAgent> routingAgent() {
        return this.routingAgent;
    }
    /**
     * The range of assignable IP addresses for services running in the Kubernetes cluster. For more information, see [here](https://docs.digitalocean.com/products/kubernetes/how-to/create-clusters/#create-with-vpc-native).
     * 
     */
    @Export(name="serviceSubnet", refs={String.class}, tree="[0]")
    private Output<String> serviceSubnet;

    /**
     * @return The range of assignable IP addresses for services running in the Kubernetes cluster. For more information, see [here](https://docs.digitalocean.com/products/kubernetes/how-to/create-clusters/#create-with-vpc-native).
     * 
     */
    public Output<String> serviceSubnet() {
        return this.serviceSubnet;
    }
    /**
     * A string indicating the current status of the individual node.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return A string indicating the current status of the individual node.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Enable/disable surge upgrades for a cluster. Default: true
     * 
     */
    @Export(name="surgeUpgrade", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> surgeUpgrade;

    /**
     * @return Enable/disable surge upgrades for a cluster. Default: true
     * 
     */
    public Output<Optional<Boolean>> surgeUpgrade() {
        return Codegen.optional(this.surgeUpgrade);
    }
    /**
     * A list of tag names to be applied to the Kubernetes cluster.
     * 
     */
    @Export(name="tags", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return A list of tag names to be applied to the Kubernetes cluster.
     * 
     */
    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The date and time when the node was last updated.
     * 
     */
    @Export(name="updatedAt", refs={String.class}, tree="[0]")
    private Output<String> updatedAt;

    /**
     * @return The date and time when the node was last updated.
     * 
     */
    public Output<String> updatedAt() {
        return this.updatedAt;
    }
    /**
     * The slug identifier for the version of Kubernetes used for the cluster. Use [doctl](https://github.com/digitalocean/doctl) to find the available versions `doctl kubernetes options versions`. (**Note:** A cluster may only be upgraded to newer versions in-place. If the version is decreased, a new resource will be created.)
     * 
     */
    @Export(name="version", refs={String.class}, tree="[0]")
    private Output<String> version;

    /**
     * @return The slug identifier for the version of Kubernetes used for the cluster. Use [doctl](https://github.com/digitalocean/doctl) to find the available versions `doctl kubernetes options versions`. (**Note:** A cluster may only be upgraded to newer versions in-place. If the version is decreased, a new resource will be created.)
     * 
     */
    public Output<String> version() {
        return this.version;
    }
    /**
     * The ID of the VPC where the Kubernetes cluster will be located.
     * 
     */
    @Export(name="vpcUuid", refs={String.class}, tree="[0]")
    private Output<String> vpcUuid;

    /**
     * @return The ID of the VPC where the Kubernetes cluster will be located.
     * 
     */
    public Output<String> vpcUuid() {
        return this.vpcUuid;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public KubernetesCluster(java.lang.String name) {
        this(name, KubernetesClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public KubernetesCluster(java.lang.String name, KubernetesClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public KubernetesCluster(java.lang.String name, KubernetesClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/kubernetesCluster:KubernetesCluster", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private KubernetesCluster(java.lang.String name, Output<java.lang.String> id, @Nullable KubernetesClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/kubernetesCluster:KubernetesCluster", name, state, makeResourceOptions(options, id), false);
    }

    private static KubernetesClusterArgs makeArgs(KubernetesClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? KubernetesClusterArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "kubeConfigs"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static KubernetesCluster get(java.lang.String name, Output<java.lang.String> id, @Nullable KubernetesClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new KubernetesCluster(name, id, state, options);
    }
}
