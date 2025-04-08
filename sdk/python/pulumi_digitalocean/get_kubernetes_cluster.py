# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = [
    'GetKubernetesClusterResult',
    'AwaitableGetKubernetesClusterResult',
    'get_kubernetes_cluster',
    'get_kubernetes_cluster_output',
]

@pulumi.output_type
class GetKubernetesClusterResult:
    """
    A collection of values returned by getKubernetesCluster.
    """
    def __init__(__self__, auto_upgrade=None, cluster_autoscaler_configurations=None, cluster_subnet=None, control_plane_firewalls=None, created_at=None, endpoint=None, ha=None, id=None, ipv4_address=None, kube_configs=None, kubeconfig_expire_seconds=None, maintenance_policies=None, name=None, node_pools=None, region=None, routing_agent=None, service_subnet=None, status=None, surge_upgrade=None, tags=None, updated_at=None, urn=None, version=None, vpc_uuid=None):
        if auto_upgrade and not isinstance(auto_upgrade, bool):
            raise TypeError("Expected argument 'auto_upgrade' to be a bool")
        pulumi.set(__self__, "auto_upgrade", auto_upgrade)
        if cluster_autoscaler_configurations and not isinstance(cluster_autoscaler_configurations, list):
            raise TypeError("Expected argument 'cluster_autoscaler_configurations' to be a list")
        pulumi.set(__self__, "cluster_autoscaler_configurations", cluster_autoscaler_configurations)
        if cluster_subnet and not isinstance(cluster_subnet, str):
            raise TypeError("Expected argument 'cluster_subnet' to be a str")
        pulumi.set(__self__, "cluster_subnet", cluster_subnet)
        if control_plane_firewalls and not isinstance(control_plane_firewalls, list):
            raise TypeError("Expected argument 'control_plane_firewalls' to be a list")
        pulumi.set(__self__, "control_plane_firewalls", control_plane_firewalls)
        if created_at and not isinstance(created_at, str):
            raise TypeError("Expected argument 'created_at' to be a str")
        pulumi.set(__self__, "created_at", created_at)
        if endpoint and not isinstance(endpoint, str):
            raise TypeError("Expected argument 'endpoint' to be a str")
        pulumi.set(__self__, "endpoint", endpoint)
        if ha and not isinstance(ha, bool):
            raise TypeError("Expected argument 'ha' to be a bool")
        pulumi.set(__self__, "ha", ha)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ipv4_address and not isinstance(ipv4_address, str):
            raise TypeError("Expected argument 'ipv4_address' to be a str")
        pulumi.set(__self__, "ipv4_address", ipv4_address)
        if kube_configs and not isinstance(kube_configs, list):
            raise TypeError("Expected argument 'kube_configs' to be a list")
        pulumi.set(__self__, "kube_configs", kube_configs)
        if kubeconfig_expire_seconds and not isinstance(kubeconfig_expire_seconds, int):
            raise TypeError("Expected argument 'kubeconfig_expire_seconds' to be a int")
        pulumi.set(__self__, "kubeconfig_expire_seconds", kubeconfig_expire_seconds)
        if maintenance_policies and not isinstance(maintenance_policies, list):
            raise TypeError("Expected argument 'maintenance_policies' to be a list")
        pulumi.set(__self__, "maintenance_policies", maintenance_policies)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if node_pools and not isinstance(node_pools, list):
            raise TypeError("Expected argument 'node_pools' to be a list")
        pulumi.set(__self__, "node_pools", node_pools)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if routing_agent and not isinstance(routing_agent, dict):
            raise TypeError("Expected argument 'routing_agent' to be a dict")
        pulumi.set(__self__, "routing_agent", routing_agent)
        if service_subnet and not isinstance(service_subnet, str):
            raise TypeError("Expected argument 'service_subnet' to be a str")
        pulumi.set(__self__, "service_subnet", service_subnet)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if surge_upgrade and not isinstance(surge_upgrade, bool):
            raise TypeError("Expected argument 'surge_upgrade' to be a bool")
        pulumi.set(__self__, "surge_upgrade", surge_upgrade)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)
        if updated_at and not isinstance(updated_at, str):
            raise TypeError("Expected argument 'updated_at' to be a str")
        pulumi.set(__self__, "updated_at", updated_at)
        if urn and not isinstance(urn, str):
            raise TypeError("Expected argument 'urn' to be a str")
        pulumi.set(__self__, "urn", urn)
        if version and not isinstance(version, str):
            raise TypeError("Expected argument 'version' to be a str")
        pulumi.set(__self__, "version", version)
        if vpc_uuid and not isinstance(vpc_uuid, str):
            raise TypeError("Expected argument 'vpc_uuid' to be a str")
        pulumi.set(__self__, "vpc_uuid", vpc_uuid)

    @property
    @pulumi.getter(name="autoUpgrade")
    def auto_upgrade(self) -> builtins.bool:
        """
        A boolean value indicating whether the cluster will be automatically upgraded to new patch releases during its maintenance window.
        """
        return pulumi.get(self, "auto_upgrade")

    @property
    @pulumi.getter(name="clusterAutoscalerConfigurations")
    def cluster_autoscaler_configurations(self) -> Optional[Sequence['outputs.GetKubernetesClusterClusterAutoscalerConfigurationResult']]:
        return pulumi.get(self, "cluster_autoscaler_configurations")

    @property
    @pulumi.getter(name="clusterSubnet")
    def cluster_subnet(self) -> builtins.str:
        """
        The range of IP addresses in the overlay network of the Kubernetes cluster.
        """
        return pulumi.get(self, "cluster_subnet")

    @property
    @pulumi.getter(name="controlPlaneFirewalls")
    def control_plane_firewalls(self) -> Sequence['outputs.GetKubernetesClusterControlPlaneFirewallResult']:
        return pulumi.get(self, "control_plane_firewalls")

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> builtins.str:
        """
        The date and time when the node was created.
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter
    def endpoint(self) -> builtins.str:
        """
        The base URL of the API server on the Kubernetes master node.
        """
        return pulumi.get(self, "endpoint")

    @property
    @pulumi.getter
    def ha(self) -> builtins.bool:
        return pulumi.get(self, "ha")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="ipv4Address")
    def ipv4_address(self) -> builtins.str:
        """
        The public IPv4 address of the Kubernetes master node.
        """
        return pulumi.get(self, "ipv4_address")

    @property
    @pulumi.getter(name="kubeConfigs")
    def kube_configs(self) -> Sequence['outputs.GetKubernetesClusterKubeConfigResult']:
        """
        A representation of the Kubernetes cluster's kubeconfig with the following attributes:
        """
        return pulumi.get(self, "kube_configs")

    @property
    @pulumi.getter(name="kubeconfigExpireSeconds")
    def kubeconfig_expire_seconds(self) -> Optional[builtins.int]:
        return pulumi.get(self, "kubeconfig_expire_seconds")

    @property
    @pulumi.getter(name="maintenancePolicies")
    def maintenance_policies(self) -> Sequence['outputs.GetKubernetesClusterMaintenancePolicyResult']:
        """
        The maintenance policy of the Kubernetes cluster. Digital Ocean has a default maintenancen window.
        """
        return pulumi.get(self, "maintenance_policies")

    @property
    @pulumi.getter
    def name(self) -> builtins.str:
        """
        The auto-generated name for the node.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="nodePools")
    def node_pools(self) -> Sequence['outputs.GetKubernetesClusterNodePoolResult']:
        """
        A list of node pools associated with the cluster. Each node pool exports the following attributes:
        """
        return pulumi.get(self, "node_pools")

    @property
    @pulumi.getter
    def region(self) -> builtins.str:
        """
        The slug identifier for the region where the Kubernetes cluster is located.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="routingAgent")
    def routing_agent(self) -> 'outputs.GetKubernetesClusterRoutingAgentResult':
        return pulumi.get(self, "routing_agent")

    @property
    @pulumi.getter(name="serviceSubnet")
    def service_subnet(self) -> builtins.str:
        """
        The range of assignable IP addresses for services running in the Kubernetes cluster.
        """
        return pulumi.get(self, "service_subnet")

    @property
    @pulumi.getter
    def status(self) -> builtins.str:
        """
        A string indicating the current status of the individual node.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="surgeUpgrade")
    def surge_upgrade(self) -> builtins.bool:
        return pulumi.get(self, "surge_upgrade")

    @property
    @pulumi.getter
    def tags(self) -> Optional[Sequence[builtins.str]]:
        """
        A list of tag names applied to the node pool.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> builtins.str:
        """
        The date and time when the node was last updated.
        """
        return pulumi.get(self, "updated_at")

    @property
    @pulumi.getter
    def urn(self) -> builtins.str:
        """
        The uniform resource name (URN) for the Kubernetes cluster.
        """
        return pulumi.get(self, "urn")

    @property
    @pulumi.getter
    def version(self) -> builtins.str:
        """
        The slug identifier for the version of Kubernetes used for the cluster.
        """
        return pulumi.get(self, "version")

    @property
    @pulumi.getter(name="vpcUuid")
    def vpc_uuid(self) -> builtins.str:
        """
        The ID of the VPC where the Kubernetes cluster is located.
        """
        return pulumi.get(self, "vpc_uuid")


class AwaitableGetKubernetesClusterResult(GetKubernetesClusterResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetKubernetesClusterResult(
            auto_upgrade=self.auto_upgrade,
            cluster_autoscaler_configurations=self.cluster_autoscaler_configurations,
            cluster_subnet=self.cluster_subnet,
            control_plane_firewalls=self.control_plane_firewalls,
            created_at=self.created_at,
            endpoint=self.endpoint,
            ha=self.ha,
            id=self.id,
            ipv4_address=self.ipv4_address,
            kube_configs=self.kube_configs,
            kubeconfig_expire_seconds=self.kubeconfig_expire_seconds,
            maintenance_policies=self.maintenance_policies,
            name=self.name,
            node_pools=self.node_pools,
            region=self.region,
            routing_agent=self.routing_agent,
            service_subnet=self.service_subnet,
            status=self.status,
            surge_upgrade=self.surge_upgrade,
            tags=self.tags,
            updated_at=self.updated_at,
            urn=self.urn,
            version=self.version,
            vpc_uuid=self.vpc_uuid)


def get_kubernetes_cluster(cluster_autoscaler_configurations: Optional[Sequence[Union['GetKubernetesClusterClusterAutoscalerConfigurationArgs', 'GetKubernetesClusterClusterAutoscalerConfigurationArgsDict']]] = None,
                           kubeconfig_expire_seconds: Optional[builtins.int] = None,
                           name: Optional[builtins.str] = None,
                           routing_agent: Optional[Union['GetKubernetesClusterRoutingAgentArgs', 'GetKubernetesClusterRoutingAgentArgsDict']] = None,
                           tags: Optional[Sequence[builtins.str]] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetKubernetesClusterResult:
    """
    Retrieves information about a DigitalOcean Kubernetes cluster for use in other resources. This data source provides all of the cluster's properties as configured on your DigitalOcean account. This is useful if the cluster in question is not managed by the provider.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    example = digitalocean.get_kubernetes_cluster(name="prod-cluster-01")
    ```


    :param builtins.str name: The name of Kubernetes cluster.
    :param Sequence[builtins.str] tags: A list of tag names applied to the node pool.
    """
    __args__ = dict()
    __args__['clusterAutoscalerConfigurations'] = cluster_autoscaler_configurations
    __args__['kubeconfigExpireSeconds'] = kubeconfig_expire_seconds
    __args__['name'] = name
    __args__['routingAgent'] = routing_agent
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('digitalocean:index/getKubernetesCluster:getKubernetesCluster', __args__, opts=opts, typ=GetKubernetesClusterResult).value

    return AwaitableGetKubernetesClusterResult(
        auto_upgrade=pulumi.get(__ret__, 'auto_upgrade'),
        cluster_autoscaler_configurations=pulumi.get(__ret__, 'cluster_autoscaler_configurations'),
        cluster_subnet=pulumi.get(__ret__, 'cluster_subnet'),
        control_plane_firewalls=pulumi.get(__ret__, 'control_plane_firewalls'),
        created_at=pulumi.get(__ret__, 'created_at'),
        endpoint=pulumi.get(__ret__, 'endpoint'),
        ha=pulumi.get(__ret__, 'ha'),
        id=pulumi.get(__ret__, 'id'),
        ipv4_address=pulumi.get(__ret__, 'ipv4_address'),
        kube_configs=pulumi.get(__ret__, 'kube_configs'),
        kubeconfig_expire_seconds=pulumi.get(__ret__, 'kubeconfig_expire_seconds'),
        maintenance_policies=pulumi.get(__ret__, 'maintenance_policies'),
        name=pulumi.get(__ret__, 'name'),
        node_pools=pulumi.get(__ret__, 'node_pools'),
        region=pulumi.get(__ret__, 'region'),
        routing_agent=pulumi.get(__ret__, 'routing_agent'),
        service_subnet=pulumi.get(__ret__, 'service_subnet'),
        status=pulumi.get(__ret__, 'status'),
        surge_upgrade=pulumi.get(__ret__, 'surge_upgrade'),
        tags=pulumi.get(__ret__, 'tags'),
        updated_at=pulumi.get(__ret__, 'updated_at'),
        urn=pulumi.get(__ret__, 'urn'),
        version=pulumi.get(__ret__, 'version'),
        vpc_uuid=pulumi.get(__ret__, 'vpc_uuid'))
def get_kubernetes_cluster_output(cluster_autoscaler_configurations: Optional[pulumi.Input[Optional[Sequence[Union['GetKubernetesClusterClusterAutoscalerConfigurationArgs', 'GetKubernetesClusterClusterAutoscalerConfigurationArgsDict']]]]] = None,
                                  kubeconfig_expire_seconds: Optional[pulumi.Input[Optional[builtins.int]]] = None,
                                  name: Optional[pulumi.Input[builtins.str]] = None,
                                  routing_agent: Optional[pulumi.Input[Optional[Union['GetKubernetesClusterRoutingAgentArgs', 'GetKubernetesClusterRoutingAgentArgsDict']]]] = None,
                                  tags: Optional[pulumi.Input[Optional[Sequence[builtins.str]]]] = None,
                                  opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetKubernetesClusterResult]:
    """
    Retrieves information about a DigitalOcean Kubernetes cluster for use in other resources. This data source provides all of the cluster's properties as configured on your DigitalOcean account. This is useful if the cluster in question is not managed by the provider.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    example = digitalocean.get_kubernetes_cluster(name="prod-cluster-01")
    ```


    :param builtins.str name: The name of Kubernetes cluster.
    :param Sequence[builtins.str] tags: A list of tag names applied to the node pool.
    """
    __args__ = dict()
    __args__['clusterAutoscalerConfigurations'] = cluster_autoscaler_configurations
    __args__['kubeconfigExpireSeconds'] = kubeconfig_expire_seconds
    __args__['name'] = name
    __args__['routingAgent'] = routing_agent
    __args__['tags'] = tags
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('digitalocean:index/getKubernetesCluster:getKubernetesCluster', __args__, opts=opts, typ=GetKubernetesClusterResult)
    return __ret__.apply(lambda __response__: GetKubernetesClusterResult(
        auto_upgrade=pulumi.get(__response__, 'auto_upgrade'),
        cluster_autoscaler_configurations=pulumi.get(__response__, 'cluster_autoscaler_configurations'),
        cluster_subnet=pulumi.get(__response__, 'cluster_subnet'),
        control_plane_firewalls=pulumi.get(__response__, 'control_plane_firewalls'),
        created_at=pulumi.get(__response__, 'created_at'),
        endpoint=pulumi.get(__response__, 'endpoint'),
        ha=pulumi.get(__response__, 'ha'),
        id=pulumi.get(__response__, 'id'),
        ipv4_address=pulumi.get(__response__, 'ipv4_address'),
        kube_configs=pulumi.get(__response__, 'kube_configs'),
        kubeconfig_expire_seconds=pulumi.get(__response__, 'kubeconfig_expire_seconds'),
        maintenance_policies=pulumi.get(__response__, 'maintenance_policies'),
        name=pulumi.get(__response__, 'name'),
        node_pools=pulumi.get(__response__, 'node_pools'),
        region=pulumi.get(__response__, 'region'),
        routing_agent=pulumi.get(__response__, 'routing_agent'),
        service_subnet=pulumi.get(__response__, 'service_subnet'),
        status=pulumi.get(__response__, 'status'),
        surge_upgrade=pulumi.get(__response__, 'surge_upgrade'),
        tags=pulumi.get(__response__, 'tags'),
        updated_at=pulumi.get(__response__, 'updated_at'),
        urn=pulumi.get(__response__, 'urn'),
        version=pulumi.get(__response__, 'version'),
        vpc_uuid=pulumi.get(__response__, 'vpc_uuid')))
