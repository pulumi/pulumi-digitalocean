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
    'GetDropletResult',
    'AwaitableGetDropletResult',
    'get_droplet',
    'get_droplet_output',
]

@pulumi.output_type
class GetDropletResult:
    """
    A collection of values returned by getDroplet.
    """
    def __init__(__self__, backups=None, created_at=None, disk=None, id=None, image=None, ipv4_address=None, ipv4_address_private=None, ipv6=None, ipv6_address=None, ipv6_address_private=None, locked=None, memory=None, monitoring=None, name=None, price_hourly=None, price_monthly=None, private_networking=None, region=None, size=None, status=None, tag=None, tags=None, urn=None, vcpus=None, volume_ids=None, vpc_uuid=None):
        if backups and not isinstance(backups, bool):
            raise TypeError("Expected argument 'backups' to be a bool")
        pulumi.set(__self__, "backups", backups)
        if created_at and not isinstance(created_at, str):
            raise TypeError("Expected argument 'created_at' to be a str")
        pulumi.set(__self__, "created_at", created_at)
        if disk and not isinstance(disk, int):
            raise TypeError("Expected argument 'disk' to be a int")
        pulumi.set(__self__, "disk", disk)
        if id and not isinstance(id, int):
            raise TypeError("Expected argument 'id' to be a int")
        pulumi.set(__self__, "id", id)
        if image and not isinstance(image, str):
            raise TypeError("Expected argument 'image' to be a str")
        pulumi.set(__self__, "image", image)
        if ipv4_address and not isinstance(ipv4_address, str):
            raise TypeError("Expected argument 'ipv4_address' to be a str")
        pulumi.set(__self__, "ipv4_address", ipv4_address)
        if ipv4_address_private and not isinstance(ipv4_address_private, str):
            raise TypeError("Expected argument 'ipv4_address_private' to be a str")
        pulumi.set(__self__, "ipv4_address_private", ipv4_address_private)
        if ipv6 and not isinstance(ipv6, bool):
            raise TypeError("Expected argument 'ipv6' to be a bool")
        pulumi.set(__self__, "ipv6", ipv6)
        if ipv6_address and not isinstance(ipv6_address, str):
            raise TypeError("Expected argument 'ipv6_address' to be a str")
        pulumi.set(__self__, "ipv6_address", ipv6_address)
        if ipv6_address_private and not isinstance(ipv6_address_private, str):
            raise TypeError("Expected argument 'ipv6_address_private' to be a str")
        pulumi.set(__self__, "ipv6_address_private", ipv6_address_private)
        if locked and not isinstance(locked, bool):
            raise TypeError("Expected argument 'locked' to be a bool")
        pulumi.set(__self__, "locked", locked)
        if memory and not isinstance(memory, int):
            raise TypeError("Expected argument 'memory' to be a int")
        pulumi.set(__self__, "memory", memory)
        if monitoring and not isinstance(monitoring, bool):
            raise TypeError("Expected argument 'monitoring' to be a bool")
        pulumi.set(__self__, "monitoring", monitoring)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if price_hourly and not isinstance(price_hourly, float):
            raise TypeError("Expected argument 'price_hourly' to be a float")
        pulumi.set(__self__, "price_hourly", price_hourly)
        if price_monthly and not isinstance(price_monthly, float):
            raise TypeError("Expected argument 'price_monthly' to be a float")
        pulumi.set(__self__, "price_monthly", price_monthly)
        if private_networking and not isinstance(private_networking, bool):
            raise TypeError("Expected argument 'private_networking' to be a bool")
        pulumi.set(__self__, "private_networking", private_networking)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if size and not isinstance(size, str):
            raise TypeError("Expected argument 'size' to be a str")
        pulumi.set(__self__, "size", size)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if tag and not isinstance(tag, str):
            raise TypeError("Expected argument 'tag' to be a str")
        pulumi.set(__self__, "tag", tag)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)
        if urn and not isinstance(urn, str):
            raise TypeError("Expected argument 'urn' to be a str")
        pulumi.set(__self__, "urn", urn)
        if vcpus and not isinstance(vcpus, int):
            raise TypeError("Expected argument 'vcpus' to be a int")
        pulumi.set(__self__, "vcpus", vcpus)
        if volume_ids and not isinstance(volume_ids, list):
            raise TypeError("Expected argument 'volume_ids' to be a list")
        pulumi.set(__self__, "volume_ids", volume_ids)
        if vpc_uuid and not isinstance(vpc_uuid, str):
            raise TypeError("Expected argument 'vpc_uuid' to be a str")
        pulumi.set(__self__, "vpc_uuid", vpc_uuid)

    @property
    @pulumi.getter
    def backups(self) -> bool:
        """
        Whether backups are enabled.
        """
        return pulumi.get(self, "backups")

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> str:
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter
    def disk(self) -> int:
        """
        The size of the Droplets disk in GB.
        """
        return pulumi.get(self, "disk")

    @property
    @pulumi.getter
    def id(self) -> int:
        """
        The ID of the Droplet.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def image(self) -> str:
        """
        The Droplet image ID or slug.
        """
        return pulumi.get(self, "image")

    @property
    @pulumi.getter(name="ipv4Address")
    def ipv4_address(self) -> str:
        """
        The Droplets public IPv4 address
        """
        return pulumi.get(self, "ipv4_address")

    @property
    @pulumi.getter(name="ipv4AddressPrivate")
    def ipv4_address_private(self) -> str:
        """
        The Droplets private IPv4 address
        """
        return pulumi.get(self, "ipv4_address_private")

    @property
    @pulumi.getter
    def ipv6(self) -> bool:
        """
        Whether IPv6 is enabled.
        """
        return pulumi.get(self, "ipv6")

    @property
    @pulumi.getter(name="ipv6Address")
    def ipv6_address(self) -> str:
        """
        The Droplets public IPv6 address
        """
        return pulumi.get(self, "ipv6_address")

    @property
    @pulumi.getter(name="ipv6AddressPrivate")
    def ipv6_address_private(self) -> str:
        """
        The Droplets private IPv6 address
        """
        return pulumi.get(self, "ipv6_address_private")

    @property
    @pulumi.getter
    def locked(self) -> bool:
        """
        Whether the Droplet is locked.
        """
        return pulumi.get(self, "locked")

    @property
    @pulumi.getter
    def memory(self) -> int:
        """
        The amount of the Droplets memory in MB.
        """
        return pulumi.get(self, "memory")

    @property
    @pulumi.getter
    def monitoring(self) -> bool:
        """
        Whether monitoring agent is installed.
        """
        return pulumi.get(self, "monitoring")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="priceHourly")
    def price_hourly(self) -> float:
        """
        Droplet hourly price.
        """
        return pulumi.get(self, "price_hourly")

    @property
    @pulumi.getter(name="priceMonthly")
    def price_monthly(self) -> float:
        """
        Droplet monthly price.
        """
        return pulumi.get(self, "price_monthly")

    @property
    @pulumi.getter(name="privateNetworking")
    def private_networking(self) -> bool:
        """
        Whether private networks are enabled.
        """
        return pulumi.get(self, "private_networking")

    @property
    @pulumi.getter
    def region(self) -> str:
        """
        The region the Droplet is running in.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter
    def size(self) -> str:
        """
        The unique slug that indentifies the type of Droplet.
        """
        return pulumi.get(self, "size")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        The status of the Droplet.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def tag(self) -> Optional[str]:
        return pulumi.get(self, "tag")

    @property
    @pulumi.getter
    def tags(self) -> Sequence[str]:
        """
        A list of the tags associated to the Droplet.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def urn(self) -> str:
        """
        The uniform resource name of the Droplet
        """
        return pulumi.get(self, "urn")

    @property
    @pulumi.getter
    def vcpus(self) -> int:
        """
        The number of the Droplets virtual CPUs.
        """
        return pulumi.get(self, "vcpus")

    @property
    @pulumi.getter(name="volumeIds")
    def volume_ids(self) -> Sequence[str]:
        """
        List of the IDs of each volumes attached to the Droplet.
        """
        return pulumi.get(self, "volume_ids")

    @property
    @pulumi.getter(name="vpcUuid")
    def vpc_uuid(self) -> str:
        """
        The ID of the VPC where the Droplet is located.
        """
        return pulumi.get(self, "vpc_uuid")


class AwaitableGetDropletResult(GetDropletResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDropletResult(
            backups=self.backups,
            created_at=self.created_at,
            disk=self.disk,
            id=self.id,
            image=self.image,
            ipv4_address=self.ipv4_address,
            ipv4_address_private=self.ipv4_address_private,
            ipv6=self.ipv6,
            ipv6_address=self.ipv6_address,
            ipv6_address_private=self.ipv6_address_private,
            locked=self.locked,
            memory=self.memory,
            monitoring=self.monitoring,
            name=self.name,
            price_hourly=self.price_hourly,
            price_monthly=self.price_monthly,
            private_networking=self.private_networking,
            region=self.region,
            size=self.size,
            status=self.status,
            tag=self.tag,
            tags=self.tags,
            urn=self.urn,
            vcpus=self.vcpus,
            volume_ids=self.volume_ids,
            vpc_uuid=self.vpc_uuid)


def get_droplet(id: Optional[int] = None,
                name: Optional[str] = None,
                tag: Optional[str] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDropletResult:
    """
    Get information on a Droplet for use in other resources. This data source provides
    all of the Droplet's properties as configured on your DigitalOcean account. This
    is useful if the Droplet in question is not managed by this provider or you need to
    utilize any of the Droplet's data.

    **Note:** This data source returns a single Droplet. When specifying a `tag`, an
    error is triggered if more than one Droplet is found.

    ## Example Usage

    Get the Droplet by name:

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    example = digitalocean.get_droplet(name="web")
    pulumi.export("dropletOutput", example.ipv4_address)
    ```

    Get the Droplet by tag:

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    example = digitalocean.get_droplet(tag="web")
    ```

    Get the Droplet by ID:

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    example = digitalocean.get_droplet(id=digitalocean_kubernetes_cluster["example"]["node_pool"][0]["nodes"][0]["droplet_id"])
    ```


    :param int id: The ID of the Droplet
    :param str name: The name of the Droplet.
    :param str tag: A tag applied to the Droplet.
    """
    __args__ = dict()
    __args__['id'] = id
    __args__['name'] = name
    __args__['tag'] = tag
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('digitalocean:index/getDroplet:getDroplet', __args__, opts=opts, typ=GetDropletResult).value

    return AwaitableGetDropletResult(
        backups=pulumi.get(__ret__, 'backups'),
        created_at=pulumi.get(__ret__, 'created_at'),
        disk=pulumi.get(__ret__, 'disk'),
        id=pulumi.get(__ret__, 'id'),
        image=pulumi.get(__ret__, 'image'),
        ipv4_address=pulumi.get(__ret__, 'ipv4_address'),
        ipv4_address_private=pulumi.get(__ret__, 'ipv4_address_private'),
        ipv6=pulumi.get(__ret__, 'ipv6'),
        ipv6_address=pulumi.get(__ret__, 'ipv6_address'),
        ipv6_address_private=pulumi.get(__ret__, 'ipv6_address_private'),
        locked=pulumi.get(__ret__, 'locked'),
        memory=pulumi.get(__ret__, 'memory'),
        monitoring=pulumi.get(__ret__, 'monitoring'),
        name=pulumi.get(__ret__, 'name'),
        price_hourly=pulumi.get(__ret__, 'price_hourly'),
        price_monthly=pulumi.get(__ret__, 'price_monthly'),
        private_networking=pulumi.get(__ret__, 'private_networking'),
        region=pulumi.get(__ret__, 'region'),
        size=pulumi.get(__ret__, 'size'),
        status=pulumi.get(__ret__, 'status'),
        tag=pulumi.get(__ret__, 'tag'),
        tags=pulumi.get(__ret__, 'tags'),
        urn=pulumi.get(__ret__, 'urn'),
        vcpus=pulumi.get(__ret__, 'vcpus'),
        volume_ids=pulumi.get(__ret__, 'volume_ids'),
        vpc_uuid=pulumi.get(__ret__, 'vpc_uuid'))


@_utilities.lift_output_func(get_droplet)
def get_droplet_output(id: Optional[pulumi.Input[Optional[int]]] = None,
                       name: Optional[pulumi.Input[Optional[str]]] = None,
                       tag: Optional[pulumi.Input[Optional[str]]] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetDropletResult]:
    """
    Get information on a Droplet for use in other resources. This data source provides
    all of the Droplet's properties as configured on your DigitalOcean account. This
    is useful if the Droplet in question is not managed by this provider or you need to
    utilize any of the Droplet's data.

    **Note:** This data source returns a single Droplet. When specifying a `tag`, an
    error is triggered if more than one Droplet is found.

    ## Example Usage

    Get the Droplet by name:

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    example = digitalocean.get_droplet(name="web")
    pulumi.export("dropletOutput", example.ipv4_address)
    ```

    Get the Droplet by tag:

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    example = digitalocean.get_droplet(tag="web")
    ```

    Get the Droplet by ID:

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    example = digitalocean.get_droplet(id=digitalocean_kubernetes_cluster["example"]["node_pool"][0]["nodes"][0]["droplet_id"])
    ```


    :param int id: The ID of the Droplet
    :param str name: The name of the Droplet.
    :param str tag: A tag applied to the Droplet.
    """
    ...
