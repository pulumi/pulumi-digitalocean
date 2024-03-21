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
    'GetTagResult',
    'AwaitableGetTagResult',
    'get_tag',
    'get_tag_output',
]

@pulumi.output_type
class GetTagResult:
    """
    A collection of values returned by getTag.
    """
    def __init__(__self__, databases_count=None, droplets_count=None, id=None, images_count=None, name=None, total_resource_count=None, volume_snapshots_count=None, volumes_count=None):
        if databases_count and not isinstance(databases_count, int):
            raise TypeError("Expected argument 'databases_count' to be a int")
        pulumi.set(__self__, "databases_count", databases_count)
        if droplets_count and not isinstance(droplets_count, int):
            raise TypeError("Expected argument 'droplets_count' to be a int")
        pulumi.set(__self__, "droplets_count", droplets_count)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if images_count and not isinstance(images_count, int):
            raise TypeError("Expected argument 'images_count' to be a int")
        pulumi.set(__self__, "images_count", images_count)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if total_resource_count and not isinstance(total_resource_count, int):
            raise TypeError("Expected argument 'total_resource_count' to be a int")
        pulumi.set(__self__, "total_resource_count", total_resource_count)
        if volume_snapshots_count and not isinstance(volume_snapshots_count, int):
            raise TypeError("Expected argument 'volume_snapshots_count' to be a int")
        pulumi.set(__self__, "volume_snapshots_count", volume_snapshots_count)
        if volumes_count and not isinstance(volumes_count, int):
            raise TypeError("Expected argument 'volumes_count' to be a int")
        pulumi.set(__self__, "volumes_count", volumes_count)

    @property
    @pulumi.getter(name="databasesCount")
    def databases_count(self) -> int:
        """
        A count of the database clusters that the tag is applied to.
        """
        return pulumi.get(self, "databases_count")

    @property
    @pulumi.getter(name="dropletsCount")
    def droplets_count(self) -> int:
        """
        A count of the Droplets the tag is applied to.
        """
        return pulumi.get(self, "droplets_count")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="imagesCount")
    def images_count(self) -> int:
        """
        A count of the images that the tag is applied to.
        """
        return pulumi.get(self, "images_count")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="totalResourceCount")
    def total_resource_count(self) -> int:
        """
        A count of the total number of resources that the tag is applied to.
        """
        return pulumi.get(self, "total_resource_count")

    @property
    @pulumi.getter(name="volumeSnapshotsCount")
    def volume_snapshots_count(self) -> int:
        """
        A count of the volume snapshots that the tag is applied to.
        """
        return pulumi.get(self, "volume_snapshots_count")

    @property
    @pulumi.getter(name="volumesCount")
    def volumes_count(self) -> int:
        """
        A count of the volumes that the tag is applied to.
        """
        return pulumi.get(self, "volumes_count")


class AwaitableGetTagResult(GetTagResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetTagResult(
            databases_count=self.databases_count,
            droplets_count=self.droplets_count,
            id=self.id,
            images_count=self.images_count,
            name=self.name,
            total_resource_count=self.total_resource_count,
            volume_snapshots_count=self.volume_snapshots_count,
            volumes_count=self.volumes_count)


def get_tag(name: Optional[str] = None,
            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTagResult:
    """
    Get information on a tag. This data source provides the name as configured on
    your DigitalOcean account. This is useful if the tag name in question is not
    managed by the provider or you need validate if the tag exists in the account.

    An error is triggered if the provided tag name does not exist.

    ## Example Usage

    Get the tag:

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    example_tag = digitalocean.get_tag(name="example")
    example_droplet = digitalocean.Droplet("exampleDroplet",
        image="ubuntu-18-04-x64",
        region=digitalocean.Region.NYC2,
        size=digitalocean.DropletSlug.DROPLET_S1_VCPU1_GB,
        tags=[example_tag.name])
    ```
    <!--End PulumiCodeChooser -->


    :param str name: The name of the tag.
    """
    __args__ = dict()
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('digitalocean:index/getTag:getTag', __args__, opts=opts, typ=GetTagResult).value

    return AwaitableGetTagResult(
        databases_count=pulumi.get(__ret__, 'databases_count'),
        droplets_count=pulumi.get(__ret__, 'droplets_count'),
        id=pulumi.get(__ret__, 'id'),
        images_count=pulumi.get(__ret__, 'images_count'),
        name=pulumi.get(__ret__, 'name'),
        total_resource_count=pulumi.get(__ret__, 'total_resource_count'),
        volume_snapshots_count=pulumi.get(__ret__, 'volume_snapshots_count'),
        volumes_count=pulumi.get(__ret__, 'volumes_count'))


@_utilities.lift_output_func(get_tag)
def get_tag_output(name: Optional[pulumi.Input[str]] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetTagResult]:
    """
    Get information on a tag. This data source provides the name as configured on
    your DigitalOcean account. This is useful if the tag name in question is not
    managed by the provider or you need validate if the tag exists in the account.

    An error is triggered if the provided tag name does not exist.

    ## Example Usage

    Get the tag:

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    example_tag = digitalocean.get_tag(name="example")
    example_droplet = digitalocean.Droplet("exampleDroplet",
        image="ubuntu-18-04-x64",
        region=digitalocean.Region.NYC2,
        size=digitalocean.DropletSlug.DROPLET_S1_VCPU1_GB,
        tags=[example_tag.name])
    ```
    <!--End PulumiCodeChooser -->


    :param str name: The name of the tag.
    """
    ...
