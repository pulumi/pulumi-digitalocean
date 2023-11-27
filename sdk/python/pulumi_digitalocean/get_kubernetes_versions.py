# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetKubernetesVersionsResult',
    'AwaitableGetKubernetesVersionsResult',
    'get_kubernetes_versions',
    'get_kubernetes_versions_output',
]

@pulumi.output_type
class GetKubernetesVersionsResult:
    """
    A collection of values returned by getKubernetesVersions.
    """
    def __init__(__self__, id=None, latest_version=None, valid_versions=None, version_prefix=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if latest_version and not isinstance(latest_version, str):
            raise TypeError("Expected argument 'latest_version' to be a str")
        pulumi.set(__self__, "latest_version", latest_version)
        if valid_versions and not isinstance(valid_versions, list):
            raise TypeError("Expected argument 'valid_versions' to be a list")
        pulumi.set(__self__, "valid_versions", valid_versions)
        if version_prefix and not isinstance(version_prefix, str):
            raise TypeError("Expected argument 'version_prefix' to be a str")
        pulumi.set(__self__, "version_prefix", version_prefix)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="latestVersion")
    def latest_version(self) -> str:
        """
        The most recent version available.
        """
        return pulumi.get(self, "latest_version")

    @property
    @pulumi.getter(name="validVersions")
    def valid_versions(self) -> Sequence[str]:
        """
        A list of available versions.
        """
        return pulumi.get(self, "valid_versions")

    @property
    @pulumi.getter(name="versionPrefix")
    def version_prefix(self) -> Optional[str]:
        return pulumi.get(self, "version_prefix")


class AwaitableGetKubernetesVersionsResult(GetKubernetesVersionsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetKubernetesVersionsResult(
            id=self.id,
            latest_version=self.latest_version,
            valid_versions=self.valid_versions,
            version_prefix=self.version_prefix)


def get_kubernetes_versions(version_prefix: Optional[str] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetKubernetesVersionsResult:
    """
    Provides access to the available DigitalOcean Kubernetes Service versions.

    ## Example Usage
    ### Output a list of all available versions

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    example = digitalocean.get_kubernetes_versions()
    pulumi.export("k8s-versions", example.valid_versions)
    ```
    ### Create a Kubernetes cluster using the most recent version available

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    example = digitalocean.get_kubernetes_versions()
    example_cluster = digitalocean.KubernetesCluster("example-cluster",
        region="lon1",
        version=example.latest_version,
        node_pool=digitalocean.KubernetesClusterNodePoolArgs(
            name="default",
            size="s-1vcpu-2gb",
            node_count=3,
        ))
    ```
    ### Pin a Kubernetes cluster to a specific minor version

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    example = digitalocean.get_kubernetes_versions(version_prefix="1.22.")
    example_cluster = digitalocean.KubernetesCluster("example-cluster",
        region="lon1",
        version=example.latest_version,
        node_pool=digitalocean.KubernetesClusterNodePoolArgs(
            name="default",
            size="s-1vcpu-2gb",
            node_count=3,
        ))
    ```


    :param str version_prefix: If provided, the provider will only return versions that match the string prefix. For example, `1.15.` will match all 1.15.x series releases.
    """
    __args__ = dict()
    __args__['versionPrefix'] = version_prefix
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('digitalocean:index/getKubernetesVersions:getKubernetesVersions', __args__, opts=opts, typ=GetKubernetesVersionsResult).value

    return AwaitableGetKubernetesVersionsResult(
        id=pulumi.get(__ret__, 'id'),
        latest_version=pulumi.get(__ret__, 'latest_version'),
        valid_versions=pulumi.get(__ret__, 'valid_versions'),
        version_prefix=pulumi.get(__ret__, 'version_prefix'))


@_utilities.lift_output_func(get_kubernetes_versions)
def get_kubernetes_versions_output(version_prefix: Optional[pulumi.Input[Optional[str]]] = None,
                                   opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetKubernetesVersionsResult]:
    """
    Provides access to the available DigitalOcean Kubernetes Service versions.

    ## Example Usage
    ### Output a list of all available versions

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    example = digitalocean.get_kubernetes_versions()
    pulumi.export("k8s-versions", example.valid_versions)
    ```
    ### Create a Kubernetes cluster using the most recent version available

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    example = digitalocean.get_kubernetes_versions()
    example_cluster = digitalocean.KubernetesCluster("example-cluster",
        region="lon1",
        version=example.latest_version,
        node_pool=digitalocean.KubernetesClusterNodePoolArgs(
            name="default",
            size="s-1vcpu-2gb",
            node_count=3,
        ))
    ```
    ### Pin a Kubernetes cluster to a specific minor version

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    example = digitalocean.get_kubernetes_versions(version_prefix="1.22.")
    example_cluster = digitalocean.KubernetesCluster("example-cluster",
        region="lon1",
        version=example.latest_version,
        node_pool=digitalocean.KubernetesClusterNodePoolArgs(
            name="default",
            size="s-1vcpu-2gb",
            node_count=3,
        ))
    ```


    :param str version_prefix: If provided, the provider will only return versions that match the string prefix. For example, `1.15.` will match all 1.15.x series releases.
    """
    ...
