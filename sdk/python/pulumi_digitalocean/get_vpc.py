# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetVpcResult',
    'AwaitableGetVpcResult',
    'get_vpc',
    'get_vpc_output',
]

@pulumi.output_type
class GetVpcResult:
    """
    A collection of values returned by getVpc.
    """
    def __init__(__self__, created_at=None, default=None, description=None, id=None, ip_range=None, name=None, region=None, urn=None):
        if created_at and not isinstance(created_at, str):
            raise TypeError("Expected argument 'created_at' to be a str")
        pulumi.set(__self__, "created_at", created_at)
        if default and not isinstance(default, bool):
            raise TypeError("Expected argument 'default' to be a bool")
        pulumi.set(__self__, "default", default)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ip_range and not isinstance(ip_range, str):
            raise TypeError("Expected argument 'ip_range' to be a str")
        pulumi.set(__self__, "ip_range", ip_range)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if urn and not isinstance(urn, str):
            raise TypeError("Expected argument 'urn' to be a str")
        pulumi.set(__self__, "urn", urn)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> str:
        """
        The date and time of when the VPC was created.
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter
    def default(self) -> bool:
        """
        A boolean indicating whether or not the VPC is the default one for the region.
        """
        return pulumi.get(self, "default")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        A free-form text field describing the VPC.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The unique identifier for the VPC.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="ipRange")
    def ip_range(self) -> str:
        """
        The range of IP addresses for the VPC in CIDR notation.
        """
        return pulumi.get(self, "ip_range")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the VPC.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def region(self) -> str:
        """
        The DigitalOcean region slug for the VPC's location.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter
    def urn(self) -> str:
        """
        The uniform resource name (URN) for the VPC.
        """
        return pulumi.get(self, "urn")


class AwaitableGetVpcResult(GetVpcResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetVpcResult(
            created_at=self.created_at,
            default=self.default,
            description=self.description,
            id=self.id,
            ip_range=self.ip_range,
            name=self.name,
            region=self.region,
            urn=self.urn)


def get_vpc(id: Optional[str] = None,
            name: Optional[str] = None,
            region: Optional[str] = None,
            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetVpcResult:
    """
    Retrieve information about a VPC for use in other resources.

    This data source provides all of the VPC's properties as configured on your
    DigitalOcean account. This is useful if the VPC in question is not managed by
    the provider or you need to utilize any of the VPC's data.

    VPCs may be looked up by `id` or `name`. Specifying a `region` will
    return that that region's default VPC.

    ## Example Usage
    ### VPC By Name

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    example = digitalocean.get_vpc(name="example-network")
    ```

    Reuse the data about a VPC to assign a Droplet to it:

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    example_vpc = digitalocean.get_vpc(name="example-network")
    example_droplet = digitalocean.Droplet("exampleDroplet",
        size="s-1vcpu-1gb",
        image="ubuntu-18-04-x64",
        region="nyc3",
        vpc_uuid=example_vpc.id)
    ```


    :param str id: The unique identifier of an existing VPC.
    :param str name: The name of an existing VPC.
    :param str region: The DigitalOcean region slug for the VPC's location.
    """
    __args__ = dict()
    __args__['id'] = id
    __args__['name'] = name
    __args__['region'] = region
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('digitalocean:index/getVpc:getVpc', __args__, opts=opts, typ=GetVpcResult).value

    return AwaitableGetVpcResult(
        created_at=pulumi.get(__ret__, 'created_at'),
        default=pulumi.get(__ret__, 'default'),
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        ip_range=pulumi.get(__ret__, 'ip_range'),
        name=pulumi.get(__ret__, 'name'),
        region=pulumi.get(__ret__, 'region'),
        urn=pulumi.get(__ret__, 'urn'))


@_utilities.lift_output_func(get_vpc)
def get_vpc_output(id: Optional[pulumi.Input[Optional[str]]] = None,
                   name: Optional[pulumi.Input[Optional[str]]] = None,
                   region: Optional[pulumi.Input[Optional[str]]] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetVpcResult]:
    """
    Retrieve information about a VPC for use in other resources.

    This data source provides all of the VPC's properties as configured on your
    DigitalOcean account. This is useful if the VPC in question is not managed by
    the provider or you need to utilize any of the VPC's data.

    VPCs may be looked up by `id` or `name`. Specifying a `region` will
    return that that region's default VPC.

    ## Example Usage
    ### VPC By Name

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    example = digitalocean.get_vpc(name="example-network")
    ```

    Reuse the data about a VPC to assign a Droplet to it:

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    example_vpc = digitalocean.get_vpc(name="example-network")
    example_droplet = digitalocean.Droplet("exampleDroplet",
        size="s-1vcpu-1gb",
        image="ubuntu-18-04-x64",
        region="nyc3",
        vpc_uuid=example_vpc.id)
    ```


    :param str id: The unique identifier of an existing VPC.
    :param str name: The name of an existing VPC.
    :param str region: The DigitalOcean region slug for the VPC's location.
    """
    ...
