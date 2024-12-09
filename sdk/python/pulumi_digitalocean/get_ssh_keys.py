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
from . import outputs
from ._inputs import *

__all__ = [
    'GetSshKeysResult',
    'AwaitableGetSshKeysResult',
    'get_ssh_keys',
    'get_ssh_keys_output',
]

@pulumi.output_type
class GetSshKeysResult:
    """
    A collection of values returned by getSshKeys.
    """
    def __init__(__self__, filters=None, id=None, sorts=None, ssh_keys=None):
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if sorts and not isinstance(sorts, list):
            raise TypeError("Expected argument 'sorts' to be a list")
        pulumi.set(__self__, "sorts", sorts)
        if ssh_keys and not isinstance(ssh_keys, list):
            raise TypeError("Expected argument 'ssh_keys' to be a list")
        pulumi.set(__self__, "ssh_keys", ssh_keys)

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetSshKeysFilterResult']]:
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def sorts(self) -> Optional[Sequence['outputs.GetSshKeysSortResult']]:
        return pulumi.get(self, "sorts")

    @property
    @pulumi.getter(name="sshKeys")
    def ssh_keys(self) -> Sequence['outputs.GetSshKeysSshKeyResult']:
        """
        A list of SSH Keys. Each SSH Key has the following attributes:
        """
        return pulumi.get(self, "ssh_keys")


class AwaitableGetSshKeysResult(GetSshKeysResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSshKeysResult(
            filters=self.filters,
            id=self.id,
            sorts=self.sorts,
            ssh_keys=self.ssh_keys)


def get_ssh_keys(filters: Optional[Sequence[Union['GetSshKeysFilterArgs', 'GetSshKeysFilterArgsDict']]] = None,
                 sorts: Optional[Sequence[Union['GetSshKeysSortArgs', 'GetSshKeysSortArgsDict']]] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSshKeysResult:
    """
    Get information on SSH Keys for use in other resources.

    This data source is useful if the SSH Keys in question are not managed by the provider or you need to
    utilize any of the SSH Keys' data.

    Note: You can use the `SshKey` data source to obtain metadata
    about a single SSH Key if you already know the unique `name` to retrieve.

    ## Example Usage

    For example, to find all SSH keys:

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    keys = digitalocean.get_ssh_keys(sorts=[{
        "key": "name",
        "direction": "asc",
    }])
    ```

    Or to find ones matching specific values:

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    keys = digitalocean.get_ssh_keys(filters=[{
        "key": "name",
        "values": [
            "laptop",
            "desktop",
        ],
    }])
    ```


    :param Sequence[Union['GetSshKeysFilterArgs', 'GetSshKeysFilterArgsDict']] filters: Filter the results.
           The `filter` block is documented below.
    :param Sequence[Union['GetSshKeysSortArgs', 'GetSshKeysSortArgsDict']] sorts: Sort the results.
           The `sort` block is documented below.
    """
    __args__ = dict()
    __args__['filters'] = filters
    __args__['sorts'] = sorts
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('digitalocean:index/getSshKeys:getSshKeys', __args__, opts=opts, typ=GetSshKeysResult).value

    return AwaitableGetSshKeysResult(
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        sorts=pulumi.get(__ret__, 'sorts'),
        ssh_keys=pulumi.get(__ret__, 'ssh_keys'))
def get_ssh_keys_output(filters: Optional[pulumi.Input[Optional[Sequence[Union['GetSshKeysFilterArgs', 'GetSshKeysFilterArgsDict']]]]] = None,
                        sorts: Optional[pulumi.Input[Optional[Sequence[Union['GetSshKeysSortArgs', 'GetSshKeysSortArgsDict']]]]] = None,
                        opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetSshKeysResult]:
    """
    Get information on SSH Keys for use in other resources.

    This data source is useful if the SSH Keys in question are not managed by the provider or you need to
    utilize any of the SSH Keys' data.

    Note: You can use the `SshKey` data source to obtain metadata
    about a single SSH Key if you already know the unique `name` to retrieve.

    ## Example Usage

    For example, to find all SSH keys:

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    keys = digitalocean.get_ssh_keys(sorts=[{
        "key": "name",
        "direction": "asc",
    }])
    ```

    Or to find ones matching specific values:

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    keys = digitalocean.get_ssh_keys(filters=[{
        "key": "name",
        "values": [
            "laptop",
            "desktop",
        ],
    }])
    ```


    :param Sequence[Union['GetSshKeysFilterArgs', 'GetSshKeysFilterArgsDict']] filters: Filter the results.
           The `filter` block is documented below.
    :param Sequence[Union['GetSshKeysSortArgs', 'GetSshKeysSortArgsDict']] sorts: Sort the results.
           The `sort` block is documented below.
    """
    __args__ = dict()
    __args__['filters'] = filters
    __args__['sorts'] = sorts
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('digitalocean:index/getSshKeys:getSshKeys', __args__, opts=opts, typ=GetSshKeysResult)
    return __ret__.apply(lambda __response__: GetSshKeysResult(
        filters=pulumi.get(__response__, 'filters'),
        id=pulumi.get(__response__, 'id'),
        sorts=pulumi.get(__response__, 'sorts'),
        ssh_keys=pulumi.get(__response__, 'ssh_keys')))
