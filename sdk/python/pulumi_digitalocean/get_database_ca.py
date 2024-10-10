# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

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

__all__ = [
    'GetDatabaseCaResult',
    'AwaitableGetDatabaseCaResult',
    'get_database_ca',
    'get_database_ca_output',
]

@pulumi.output_type
class GetDatabaseCaResult:
    """
    A collection of values returned by getDatabaseCa.
    """
    def __init__(__self__, certificate=None, cluster_id=None, id=None):
        if certificate and not isinstance(certificate, str):
            raise TypeError("Expected argument 'certificate' to be a str")
        pulumi.set(__self__, "certificate", certificate)
        if cluster_id and not isinstance(cluster_id, str):
            raise TypeError("Expected argument 'cluster_id' to be a str")
        pulumi.set(__self__, "cluster_id", cluster_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)

    @property
    @pulumi.getter
    def certificate(self) -> str:
        """
        The CA certificate used to secure database connections decoded to a string.
        """
        return pulumi.get(self, "certificate")

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> str:
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")


class AwaitableGetDatabaseCaResult(GetDatabaseCaResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDatabaseCaResult(
            certificate=self.certificate,
            cluster_id=self.cluster_id,
            id=self.id)


def get_database_ca(cluster_id: Optional[str] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDatabaseCaResult:
    """
    Provides the CA certificate for a DigitalOcean database.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    ca = digitalocean.get_database_ca(cluster_id="aaa-bbb-ccc-ddd")
    pulumi.export("caOutput", ca.certificate)
    ```


    :param str cluster_id: The ID of the source database cluster.
    """
    __args__ = dict()
    __args__['clusterId'] = cluster_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('digitalocean:index/getDatabaseCa:getDatabaseCa', __args__, opts=opts, typ=GetDatabaseCaResult).value

    return AwaitableGetDatabaseCaResult(
        certificate=pulumi.get(__ret__, 'certificate'),
        cluster_id=pulumi.get(__ret__, 'cluster_id'),
        id=pulumi.get(__ret__, 'id'))
def get_database_ca_output(cluster_id: Optional[pulumi.Input[str]] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetDatabaseCaResult]:
    """
    Provides the CA certificate for a DigitalOcean database.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    ca = digitalocean.get_database_ca(cluster_id="aaa-bbb-ccc-ddd")
    pulumi.export("caOutput", ca.certificate)
    ```


    :param str cluster_id: The ID of the source database cluster.
    """
    __args__ = dict()
    __args__['clusterId'] = cluster_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('digitalocean:index/getDatabaseCa:getDatabaseCa', __args__, opts=opts, typ=GetDatabaseCaResult)
    return __ret__.apply(lambda __response__: GetDatabaseCaResult(
        certificate=pulumi.get(__response__, 'certificate'),
        cluster_id=pulumi.get(__response__, 'cluster_id'),
        id=pulumi.get(__response__, 'id')))
