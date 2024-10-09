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
    'GetSshKeyResult',
    'AwaitableGetSshKeyResult',
    'get_ssh_key',
    'get_ssh_key_output',
]

@pulumi.output_type
class GetSshKeyResult:
    """
    A collection of values returned by getSshKey.
    """
    def __init__(__self__, fingerprint=None, id=None, name=None, public_key=None):
        if fingerprint and not isinstance(fingerprint, str):
            raise TypeError("Expected argument 'fingerprint' to be a str")
        pulumi.set(__self__, "fingerprint", fingerprint)
        if id and not isinstance(id, int):
            raise TypeError("Expected argument 'id' to be a int")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if public_key and not isinstance(public_key, str):
            raise TypeError("Expected argument 'public_key' to be a str")
        pulumi.set(__self__, "public_key", public_key)

    @property
    @pulumi.getter
    def fingerprint(self) -> str:
        """
        The fingerprint of the public key of the ssh key.
        """
        return pulumi.get(self, "fingerprint")

    @property
    @pulumi.getter
    def id(self) -> int:
        """
        The ID of the ssh key.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="publicKey")
    def public_key(self) -> str:
        """
        The public key of the ssh key.
        """
        return pulumi.get(self, "public_key")


class AwaitableGetSshKeyResult(GetSshKeyResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSshKeyResult(
            fingerprint=self.fingerprint,
            id=self.id,
            name=self.name,
            public_key=self.public_key)


def get_ssh_key(name: Optional[str] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSshKeyResult:
    """
    Get information on a ssh key. This data source provides the name, public key,
    and fingerprint as configured on your DigitalOcean account. This is useful if
    the ssh key in question is not managed by the provider or you need to utilize any
    of the keys data.

    An error is triggered if the provided ssh key name does not exist.

    ## Example Usage

    Get the ssh key:

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    example = digitalocean.get_ssh_key(name="example")
    example_droplet = digitalocean.Droplet("example",
        image="ubuntu-18-04-x64",
        name="example-1",
        region=digitalocean.Region.NYC2,
        size=digitalocean.DropletSlug.DROPLET_S1_VCPU1_GB,
        ssh_keys=[example.id])
    ```


    :param str name: The name of the ssh key.
    """
    __args__ = dict()
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('digitalocean:index/getSshKey:getSshKey', __args__, opts=opts, typ=GetSshKeyResult).value

    return AwaitableGetSshKeyResult(
        fingerprint=pulumi.get(__ret__, 'fingerprint'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        public_key=pulumi.get(__ret__, 'public_key'))
def get_ssh_key_output(name: Optional[pulumi.Input[str]] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSshKeyResult]:
    """
    Get information on a ssh key. This data source provides the name, public key,
    and fingerprint as configured on your DigitalOcean account. This is useful if
    the ssh key in question is not managed by the provider or you need to utilize any
    of the keys data.

    An error is triggered if the provided ssh key name does not exist.

    ## Example Usage

    Get the ssh key:

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    example = digitalocean.get_ssh_key(name="example")
    example_droplet = digitalocean.Droplet("example",
        image="ubuntu-18-04-x64",
        name="example-1",
        region=digitalocean.Region.NYC2,
        size=digitalocean.DropletSlug.DROPLET_S1_VCPU1_GB,
        ssh_keys=[example.id])
    ```


    :param str name: The name of the ssh key.
    """
    __args__ = dict()
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('digitalocean:index/getSshKey:getSshKey', __args__, opts=opts, typ=GetSshKeyResult)
    return __ret__.apply(lambda __response__: GetSshKeyResult(
        fingerprint=pulumi.get(__response__, 'fingerprint'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        public_key=pulumi.get(__response__, 'public_key')))
