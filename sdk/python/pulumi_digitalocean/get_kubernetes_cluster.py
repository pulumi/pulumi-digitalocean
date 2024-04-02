# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

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
    def __init__(__self__, auto_upgrade=None, cluster_subnet=None, created_at=None, endpoint=None, ha=None, id=None, ipv4_address=None, kube_configs=None, maintenance_policies=None, name=None, node_pools=None, region=None, service_subnet=None, status=None, surge_upgrade=None, tags=None, updated_at=None, urn=None, version=None, vpc_uuid=None):
        if auto_upgrade and not isinstance(auto_upgrade, bool):
            raise TypeError("Expected argument 'auto_upgrade' to be a bool")
        pulumi.set(__self__, "auto_upgrade", auto_upgrade)
        if cluster_subnet and not isinstance(cluster_subnet, str):
            raise TypeError("Expected argument 'cluster_subnet' to be a str")
        pulumi.set(__self__, "cluster_subnet", cluster_subnet)
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
    def auto_upgrade(self) -> bool:
        """
        A boolean value indicating whether the cluster will be automatically upgraded to new patch releases during its maintenance window.
        """
        return pulumi.get(self, "auto_upgrade")

    @property
    @pulumi.getter(name="clusterSubnet")
    def cluster_subnet(self) -> str:
        """
        The range of IP addresses in the overlay network of the Kubernetes cluster.
        """
        return pulumi.get(self, "cluster_subnet")

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> str:
        """
        The date and time when the node was created.
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter
    def endpoint(self) -> str:
        """
        The base URL of the API server on the Kubernetes master node.
        """
        return pulumi.get(self, "endpoint")

    @property
    @pulumi.getter
    def ha(self) -> bool:
        return pulumi.get(self, "ha")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="ipv4Address")
    def ipv4_address(self) -> str:
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
    @pulumi.getter(name="maintenancePolicies")
    def maintenance_policies(self) -> Sequence['outputs.GetKubernetesClusterMaintenancePolicyResult']:
        """
        The maintenance policy of the Kubernetes cluster. Digital Ocean has a default maintenancen window.
        """
        return pulumi.get(self, "maintenance_policies")

    @property
    @pulumi.getter
    def name(self) -> str:
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
    def region(self) -> str:
        """
        The slug identifier for the region where the Kubernetes cluster is located.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="serviceSubnet")
    def service_subnet(self) -> str:
        """
        The range of assignable IP addresses for services running in the Kubernetes cluster.
        """
        return pulumi.get(self, "service_subnet")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        A string indicating the current status of the individual node.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="surgeUpgrade")
    def surge_upgrade(self) -> bool:
        return pulumi.get(self, "surge_upgrade")

    @property
    @pulumi.getter
    def tags(self) -> Optional[Sequence[str]]:
        """
        A list of tag names applied to the node pool.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> str:
        """
        The date and time when the node was last updated.
        """
        return pulumi.get(self, "updated_at")

    @property
    @pulumi.getter
    def urn(self) -> str:
        """
        The uniform resource name (URN) for the Kubernetes cluster.
        """
        return pulumi.get(self, "urn")

    @property
    @pulumi.getter
    def version(self) -> str:
        """
        The slug identifier for the version of Kubernetes used for the cluster.
        """
        return pulumi.get(self, "version")

    @property
    @pulumi.getter(name="vpcUuid")
    def vpc_uuid(self) -> str:
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
            cluster_subnet=self.cluster_subnet,
            created_at=self.created_at,
            endpoint=self.endpoint,
            ha=self.ha,
            id=self.id,
            ipv4_address=self.ipv4_address,
            kube_configs=self.kube_configs,
            maintenance_policies=self.maintenance_policies,
            name=self.name,
            node_pools=self.node_pools,
            region=self.region,
            service_subnet=self.service_subnet,
            status=self.status,
            surge_upgrade=self.surge_upgrade,
            tags=self.tags,
            updated_at=self.updated_at,
            urn=self.urn,
            version=self.version,
            vpc_uuid=self.vpc_uuid)


def get_kubernetes_cluster(name: Optional[str] = None,
                           tags: Optional[Sequence[str]] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetKubernetesClusterResult:
    """
    Retrieves information about a DigitalOcean Kubernetes cluster for use in other resources. This data source provides all of the cluster's properties as configured on your DigitalOcean account. This is useful if the cluster in question is not managed by the provider.


    :param str name: The name of Kubernetes cluster.
    :param Sequence[str] tags: A list of tag names applied to the node pool.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('digitalocean:index/getKubernetesCluster:getKubernetesCluster', __args__, opts=opts, typ=GetKubernetesClusterResult).value

    return AwaitableGetKubernetesClusterResult(
        auto_upgrade=pulumi.get(__ret__, 'auto_upgrade'),
        cluster_subnet=pulumi.get(__ret__, 'cluster_subnet'),
        created_at=pulumi.get(__ret__, 'created_at'),
        endpoint=pulumi.get(__ret__, 'endpoint'),
        ha=pulumi.get(__ret__, 'ha'),
        id=pulumi.get(__ret__, 'id'),
        ipv4_address=pulumi.get(__ret__, 'ipv4_address'),
        kube_configs=pulumi.get(__ret__, 'kube_configs'),
        maintenance_policies=pulumi.get(__ret__, 'maintenance_policies'),
        name=pulumi.get(__ret__, 'name'),
        node_pools=pulumi.get(__ret__, 'node_pools'),
        region=pulumi.get(__ret__, 'region'),
        service_subnet=pulumi.get(__ret__, 'service_subnet'),
        status=pulumi.get(__ret__, 'status'),
        surge_upgrade=pulumi.get(__ret__, 'surge_upgrade'),
        tags=pulumi.get(__ret__, 'tags'),
        updated_at=pulumi.get(__ret__, 'updated_at'),
        urn=pulumi.get(__ret__, 'urn'),
        version=pulumi.get(__ret__, 'version'),
        vpc_uuid=pulumi.get(__ret__, 'vpc_uuid'))


@_utilities.lift_output_func(get_kubernetes_cluster)
def get_kubernetes_cluster_output(name: Optional[pulumi.Input[str]] = None,
                                  tags: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                  opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetKubernetesClusterResult]:
    """
    Retrieves information about a DigitalOcean Kubernetes cluster for use in other resources. This data source provides all of the cluster's properties as configured on your DigitalOcean account. This is useful if the cluster in question is not managed by the provider.


    :param str name: The name of Kubernetes cluster.
    :param Sequence[str] tags: A list of tag names applied to the node pool.
    """
    ...
