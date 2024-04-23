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
    'GetImageResult',
    'AwaitableGetImageResult',
    'get_image',
    'get_image_output',
]

@pulumi.output_type
class GetImageResult:
    """
    A collection of values returned by getImage.
    """
    def __init__(__self__, created=None, description=None, distribution=None, error_message=None, id=None, image=None, min_disk_size=None, name=None, private=None, regions=None, size_gigabytes=None, slug=None, source=None, status=None, tags=None, type=None):
        if created and not isinstance(created, str):
            raise TypeError("Expected argument 'created' to be a str")
        pulumi.set(__self__, "created", created)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if distribution and not isinstance(distribution, str):
            raise TypeError("Expected argument 'distribution' to be a str")
        pulumi.set(__self__, "distribution", distribution)
        if error_message and not isinstance(error_message, str):
            raise TypeError("Expected argument 'error_message' to be a str")
        pulumi.set(__self__, "error_message", error_message)
        if id and not isinstance(id, int):
            raise TypeError("Expected argument 'id' to be a int")
        pulumi.set(__self__, "id", id)
        if image and not isinstance(image, str):
            raise TypeError("Expected argument 'image' to be a str")
        pulumi.set(__self__, "image", image)
        if min_disk_size and not isinstance(min_disk_size, int):
            raise TypeError("Expected argument 'min_disk_size' to be a int")
        pulumi.set(__self__, "min_disk_size", min_disk_size)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if private and not isinstance(private, bool):
            raise TypeError("Expected argument 'private' to be a bool")
        pulumi.set(__self__, "private", private)
        if regions and not isinstance(regions, list):
            raise TypeError("Expected argument 'regions' to be a list")
        pulumi.set(__self__, "regions", regions)
        if size_gigabytes and not isinstance(size_gigabytes, float):
            raise TypeError("Expected argument 'size_gigabytes' to be a float")
        pulumi.set(__self__, "size_gigabytes", size_gigabytes)
        if slug and not isinstance(slug, str):
            raise TypeError("Expected argument 'slug' to be a str")
        pulumi.set(__self__, "slug", slug)
        if source and not isinstance(source, str):
            raise TypeError("Expected argument 'source' to be a str")
        pulumi.set(__self__, "source", source)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def created(self) -> str:
        """
        When the image was created
        """
        return pulumi.get(self, "created")

    @property
    @pulumi.getter
    def description(self) -> str:
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def distribution(self) -> str:
        """
        The name of the distribution of the OS of the image.
        """
        return pulumi.get(self, "distribution")

    @property
    @pulumi.getter(name="errorMessage")
    def error_message(self) -> str:
        """
        Any applicable error message pertaining to the image
        """
        return pulumi.get(self, "error_message")

    @property
    @pulumi.getter
    def id(self) -> int:
        """
        The ID of the image.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def image(self) -> str:
        """
        The id of the image (legacy parameter).
        """
        return pulumi.get(self, "image")

    @property
    @pulumi.getter(name="minDiskSize")
    def min_disk_size(self) -> int:
        """
        The minimum 'disk' required for the image.
        """
        return pulumi.get(self, "min_disk_size")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the image.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def private(self) -> bool:
        """
        Is image a public image or not. Public images represent
        Linux distributions or One-Click Applications, while non-public images represent
        snapshots and backups and are only available within your account.
        """
        return pulumi.get(self, "private")

    @property
    @pulumi.getter
    def regions(self) -> Sequence[str]:
        """
        A set of the regions that the image is available in.
        """
        return pulumi.get(self, "regions")

    @property
    @pulumi.getter(name="sizeGigabytes")
    def size_gigabytes(self) -> float:
        """
        The size of the image in GB.
        """
        return pulumi.get(self, "size_gigabytes")

    @property
    @pulumi.getter
    def slug(self) -> str:
        """
        Unique text identifier of the image.
        """
        return pulumi.get(self, "slug")

    @property
    @pulumi.getter
    def source(self) -> Optional[str]:
        return pulumi.get(self, "source")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        Current status of the image
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def tags(self) -> Sequence[str]:
        """
        A set of tags applied to the image
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        Type of the image.
        """
        return pulumi.get(self, "type")


class AwaitableGetImageResult(GetImageResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetImageResult(
            created=self.created,
            description=self.description,
            distribution=self.distribution,
            error_message=self.error_message,
            id=self.id,
            image=self.image,
            min_disk_size=self.min_disk_size,
            name=self.name,
            private=self.private,
            regions=self.regions,
            size_gigabytes=self.size_gigabytes,
            slug=self.slug,
            source=self.source,
            status=self.status,
            tags=self.tags,
            type=self.type)


def get_image(id: Optional[int] = None,
              name: Optional[str] = None,
              slug: Optional[str] = None,
              source: Optional[str] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetImageResult:
    """
    Get information on an image for use in other resources (e.g. creating a Droplet
    based on snapshot). This data source provides all of the image properties as
    configured on your DigitalOcean account. This is useful if the image in question
    is not managed by the provider or you need to utilize any of the image's data.

    An error is triggered if zero or more than one result is returned by the query.

    ## Example Usage

    Get the data about a snapshot:

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    example1 = digitalocean.get_image(name="example-1.0.0")
    ```

    Reuse the data about a snapshot to create a Droplet:

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    example_image = digitalocean.get_image(name="example-1.0.0")
    example_droplet = digitalocean.Droplet("exampleDroplet",
        image=example_image.id,
        region=digitalocean.Region.NYC2,
        size=digitalocean.DropletSlug.DROPLET_S1_VCPU1_GB)
    ```

    Get the data about an official image:

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    example2 = digitalocean.get_image(slug="ubuntu-18-04-x64")
    ```


    :param int id: The id of the image
    :param str name: The name of the image.
    :param str slug: The slug of the official image.
           
           If `name` is specified, you may also specify:
    :param str source: Restrict the search to one of the following categories of images:
    """
    __args__ = dict()
    __args__['id'] = id
    __args__['name'] = name
    __args__['slug'] = slug
    __args__['source'] = source
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('digitalocean:index/getImage:getImage', __args__, opts=opts, typ=GetImageResult).value

    return AwaitableGetImageResult(
        created=pulumi.get(__ret__, 'created'),
        description=pulumi.get(__ret__, 'description'),
        distribution=pulumi.get(__ret__, 'distribution'),
        error_message=pulumi.get(__ret__, 'error_message'),
        id=pulumi.get(__ret__, 'id'),
        image=pulumi.get(__ret__, 'image'),
        min_disk_size=pulumi.get(__ret__, 'min_disk_size'),
        name=pulumi.get(__ret__, 'name'),
        private=pulumi.get(__ret__, 'private'),
        regions=pulumi.get(__ret__, 'regions'),
        size_gigabytes=pulumi.get(__ret__, 'size_gigabytes'),
        slug=pulumi.get(__ret__, 'slug'),
        source=pulumi.get(__ret__, 'source'),
        status=pulumi.get(__ret__, 'status'),
        tags=pulumi.get(__ret__, 'tags'),
        type=pulumi.get(__ret__, 'type'))


@_utilities.lift_output_func(get_image)
def get_image_output(id: Optional[pulumi.Input[Optional[int]]] = None,
                     name: Optional[pulumi.Input[Optional[str]]] = None,
                     slug: Optional[pulumi.Input[Optional[str]]] = None,
                     source: Optional[pulumi.Input[Optional[str]]] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetImageResult]:
    """
    Get information on an image for use in other resources (e.g. creating a Droplet
    based on snapshot). This data source provides all of the image properties as
    configured on your DigitalOcean account. This is useful if the image in question
    is not managed by the provider or you need to utilize any of the image's data.

    An error is triggered if zero or more than one result is returned by the query.

    ## Example Usage

    Get the data about a snapshot:

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    example1 = digitalocean.get_image(name="example-1.0.0")
    ```

    Reuse the data about a snapshot to create a Droplet:

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    example_image = digitalocean.get_image(name="example-1.0.0")
    example_droplet = digitalocean.Droplet("exampleDroplet",
        image=example_image.id,
        region=digitalocean.Region.NYC2,
        size=digitalocean.DropletSlug.DROPLET_S1_VCPU1_GB)
    ```

    Get the data about an official image:

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    example2 = digitalocean.get_image(slug="ubuntu-18-04-x64")
    ```


    :param int id: The id of the image
    :param str name: The name of the image.
    :param str slug: The slug of the official image.
           
           If `name` is specified, you may also specify:
    :param str source: Restrict the search to one of the following categories of images:
    """
    ...
