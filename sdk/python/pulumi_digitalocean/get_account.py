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
    'GetAccountResult',
    'AwaitableGetAccountResult',
    'get_account',
    'get_account_output',
]

@pulumi.output_type
class GetAccountResult:
    """
    A collection of values returned by getAccount.
    """
    def __init__(__self__, droplet_limit=None, email=None, email_verified=None, floating_ip_limit=None, id=None, status=None, status_message=None, uuid=None):
        if droplet_limit and not isinstance(droplet_limit, int):
            raise TypeError("Expected argument 'droplet_limit' to be a int")
        pulumi.set(__self__, "droplet_limit", droplet_limit)
        if email and not isinstance(email, str):
            raise TypeError("Expected argument 'email' to be a str")
        pulumi.set(__self__, "email", email)
        if email_verified and not isinstance(email_verified, bool):
            raise TypeError("Expected argument 'email_verified' to be a bool")
        pulumi.set(__self__, "email_verified", email_verified)
        if floating_ip_limit and not isinstance(floating_ip_limit, int):
            raise TypeError("Expected argument 'floating_ip_limit' to be a int")
        pulumi.set(__self__, "floating_ip_limit", floating_ip_limit)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if status_message and not isinstance(status_message, str):
            raise TypeError("Expected argument 'status_message' to be a str")
        pulumi.set(__self__, "status_message", status_message)
        if uuid and not isinstance(uuid, str):
            raise TypeError("Expected argument 'uuid' to be a str")
        pulumi.set(__self__, "uuid", uuid)

    @property
    @pulumi.getter(name="dropletLimit")
    def droplet_limit(self) -> int:
        """
        The total number of droplets current user or team may have active at one time.
        """
        return pulumi.get(self, "droplet_limit")

    @property
    @pulumi.getter
    def email(self) -> str:
        """
        The email address used by the current user to register for DigitalOcean.
        """
        return pulumi.get(self, "email")

    @property
    @pulumi.getter(name="emailVerified")
    def email_verified(self) -> bool:
        """
        If true, the user has verified their account via email. False otherwise.
        """
        return pulumi.get(self, "email_verified")

    @property
    @pulumi.getter(name="floatingIpLimit")
    def floating_ip_limit(self) -> int:
        """
        The total number of floating IPs the current user or team may have.
        """
        return pulumi.get(self, "floating_ip_limit")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        This value is one of "active", "warning" or "locked".
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="statusMessage")
    def status_message(self) -> str:
        """
        A human-readable message giving more details about the status of the account.
        """
        return pulumi.get(self, "status_message")

    @property
    @pulumi.getter
    def uuid(self) -> str:
        """
        The unique universal identifier for the current user.
        """
        return pulumi.get(self, "uuid")


class AwaitableGetAccountResult(GetAccountResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAccountResult(
            droplet_limit=self.droplet_limit,
            email=self.email,
            email_verified=self.email_verified,
            floating_ip_limit=self.floating_ip_limit,
            id=self.id,
            status=self.status,
            status_message=self.status_message,
            uuid=self.uuid)


def get_account(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAccountResult:
    """
    Get information on your DigitalOcean account.

    ## Example Usage

    Get the account:

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    example = digitalocean.get_account()
    ```
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('digitalocean:index/getAccount:getAccount', __args__, opts=opts, typ=GetAccountResult).value

    return AwaitableGetAccountResult(
        droplet_limit=pulumi.get(__ret__, 'droplet_limit'),
        email=pulumi.get(__ret__, 'email'),
        email_verified=pulumi.get(__ret__, 'email_verified'),
        floating_ip_limit=pulumi.get(__ret__, 'floating_ip_limit'),
        id=pulumi.get(__ret__, 'id'),
        status=pulumi.get(__ret__, 'status'),
        status_message=pulumi.get(__ret__, 'status_message'),
        uuid=pulumi.get(__ret__, 'uuid'))


@_utilities.lift_output_func(get_account)
def get_account_output(opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetAccountResult]:
    """
    Get information on your DigitalOcean account.

    ## Example Usage

    Get the account:

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    example = digitalocean.get_account()
    ```
    """
    ...
