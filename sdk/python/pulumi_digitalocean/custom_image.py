# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['CustomImageArgs', 'CustomImage']

@pulumi.input_type
class CustomImageArgs:
    def __init__(__self__, *,
                 regions: pulumi.Input[Sequence[pulumi.Input[str]]],
                 url: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 distribution: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a CustomImage resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] regions: A list of regions. (Currently only one is supported).
        :param pulumi.Input[str] url: A URL from which the custom Linux virtual machine image may be retrieved.
        :param pulumi.Input[str] description: An optional description for the image.
        :param pulumi.Input[str] distribution: An optional distribution name for the image. Valid values are documented [here](https://docs.digitalocean.com/reference/api/api-reference/#operation/create_custom_image)
        :param pulumi.Input[str] name: A name for the Custom Image.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: A list of optional tags for the image.
        """
        pulumi.set(__self__, "regions", regions)
        pulumi.set(__self__, "url", url)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if distribution is not None:
            pulumi.set(__self__, "distribution", distribution)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def regions(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        A list of regions. (Currently only one is supported).
        """
        return pulumi.get(self, "regions")

    @regions.setter
    def regions(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "regions", value)

    @property
    @pulumi.getter
    def url(self) -> pulumi.Input[str]:
        """
        A URL from which the custom Linux virtual machine image may be retrieved.
        """
        return pulumi.get(self, "url")

    @url.setter
    def url(self, value: pulumi.Input[str]):
        pulumi.set(self, "url", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        An optional description for the image.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def distribution(self) -> Optional[pulumi.Input[str]]:
        """
        An optional distribution name for the image. Valid values are documented [here](https://docs.digitalocean.com/reference/api/api-reference/#operation/create_custom_image)
        """
        return pulumi.get(self, "distribution")

    @distribution.setter
    def distribution(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "distribution", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        A name for the Custom Image.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of optional tags for the image.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _CustomImageState:
    def __init__(__self__, *,
                 created_at: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 distribution: Optional[pulumi.Input[str]] = None,
                 image_id: Optional[pulumi.Input[int]] = None,
                 min_disk_size: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 public: Optional[pulumi.Input[bool]] = None,
                 regions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 size_gigabytes: Optional[pulumi.Input[float]] = None,
                 slug: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 url: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering CustomImage resources.
        :param pulumi.Input[str] created_at: A time value given in ISO8601 combined date and time format that represents when the image was created.
        :param pulumi.Input[str] description: An optional description for the image.
        :param pulumi.Input[str] distribution: An optional distribution name for the image. Valid values are documented [here](https://docs.digitalocean.com/reference/api/api-reference/#operation/create_custom_image)
        :param pulumi.Input[int] image_id: A unique number that can be used to identify and reference a specific image.
        :param pulumi.Input[int] min_disk_size: The minimum disk size in GB required for a Droplet to use this image.
        :param pulumi.Input[str] name: A name for the Custom Image.
        :param pulumi.Input[bool] public: Indicates whether the image in question is public or not.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] regions: A list of regions. (Currently only one is supported).
        :param pulumi.Input[float] size_gigabytes: The size of the image in gigabytes.
        :param pulumi.Input[str] slug: A uniquely identifying string for each image.
        :param pulumi.Input[str] status: A status string indicating the state of a custom image.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: A list of optional tags for the image.
        :param pulumi.Input[str] type: Describes the kind of image.
        :param pulumi.Input[str] url: A URL from which the custom Linux virtual machine image may be retrieved.
        """
        if created_at is not None:
            pulumi.set(__self__, "created_at", created_at)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if distribution is not None:
            pulumi.set(__self__, "distribution", distribution)
        if image_id is not None:
            pulumi.set(__self__, "image_id", image_id)
        if min_disk_size is not None:
            pulumi.set(__self__, "min_disk_size", min_disk_size)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if public is not None:
            pulumi.set(__self__, "public", public)
        if regions is not None:
            pulumi.set(__self__, "regions", regions)
        if size_gigabytes is not None:
            pulumi.set(__self__, "size_gigabytes", size_gigabytes)
        if slug is not None:
            pulumi.set(__self__, "slug", slug)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if url is not None:
            pulumi.set(__self__, "url", url)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> Optional[pulumi.Input[str]]:
        """
        A time value given in ISO8601 combined date and time format that represents when the image was created.
        """
        return pulumi.get(self, "created_at")

    @created_at.setter
    def created_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_at", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        An optional description for the image.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def distribution(self) -> Optional[pulumi.Input[str]]:
        """
        An optional distribution name for the image. Valid values are documented [here](https://docs.digitalocean.com/reference/api/api-reference/#operation/create_custom_image)
        """
        return pulumi.get(self, "distribution")

    @distribution.setter
    def distribution(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "distribution", value)

    @property
    @pulumi.getter(name="imageId")
    def image_id(self) -> Optional[pulumi.Input[int]]:
        """
        A unique number that can be used to identify and reference a specific image.
        """
        return pulumi.get(self, "image_id")

    @image_id.setter
    def image_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "image_id", value)

    @property
    @pulumi.getter(name="minDiskSize")
    def min_disk_size(self) -> Optional[pulumi.Input[int]]:
        """
        The minimum disk size in GB required for a Droplet to use this image.
        """
        return pulumi.get(self, "min_disk_size")

    @min_disk_size.setter
    def min_disk_size(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "min_disk_size", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        A name for the Custom Image.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def public(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicates whether the image in question is public or not.
        """
        return pulumi.get(self, "public")

    @public.setter
    def public(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "public", value)

    @property
    @pulumi.getter
    def regions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of regions. (Currently only one is supported).
        """
        return pulumi.get(self, "regions")

    @regions.setter
    def regions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "regions", value)

    @property
    @pulumi.getter(name="sizeGigabytes")
    def size_gigabytes(self) -> Optional[pulumi.Input[float]]:
        """
        The size of the image in gigabytes.
        """
        return pulumi.get(self, "size_gigabytes")

    @size_gigabytes.setter
    def size_gigabytes(self, value: Optional[pulumi.Input[float]]):
        pulumi.set(self, "size_gigabytes", value)

    @property
    @pulumi.getter
    def slug(self) -> Optional[pulumi.Input[str]]:
        """
        A uniquely identifying string for each image.
        """
        return pulumi.get(self, "slug")

    @slug.setter
    def slug(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "slug", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        A status string indicating the state of a custom image.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of optional tags for the image.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        Describes the kind of image.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def url(self) -> Optional[pulumi.Input[str]]:
        """
        A URL from which the custom Linux virtual machine image may be retrieved.
        """
        return pulumi.get(self, "url")

    @url.setter
    def url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "url", value)


class CustomImage(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 distribution: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 regions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 url: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a resource which can be used to create a [custom image](https://www.digitalocean.com/docs/images/custom-images/)
        from a URL. The URL must point to an image in one of the following file formats:

        - Raw (.img) with an MBR or GPT partition table
        - qcow2
        - VHDX
        - VDI
        - VMDK

        The image may be compressed using gzip or bzip2. See the DigitalOcean Custom
        Image documentation for [additional requirements](https://www.digitalocean.com/docs/images/custom-images/#image-requirements).

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        flatcar = digitalocean.CustomImage("flatcar",
            url="https://stable.release.flatcar-linux.net/amd64-usr/2605.7.0/flatcar_production_digitalocean_image.bin.bz2",
            regions=["nyc3"])
        example = digitalocean.Droplet("example",
            image=flatcar.id,
            region=digitalocean.Region.NYC3,
            size=digitalocean.DropletSlug.DROPLET_S1_VCPU1_GB,
            ssh_keys=["12345"])
        ```
        <!--End PulumiCodeChooser -->

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: An optional description for the image.
        :param pulumi.Input[str] distribution: An optional distribution name for the image. Valid values are documented [here](https://docs.digitalocean.com/reference/api/api-reference/#operation/create_custom_image)
        :param pulumi.Input[str] name: A name for the Custom Image.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] regions: A list of regions. (Currently only one is supported).
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: A list of optional tags for the image.
        :param pulumi.Input[str] url: A URL from which the custom Linux virtual machine image may be retrieved.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CustomImageArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a resource which can be used to create a [custom image](https://www.digitalocean.com/docs/images/custom-images/)
        from a URL. The URL must point to an image in one of the following file formats:

        - Raw (.img) with an MBR or GPT partition table
        - qcow2
        - VHDX
        - VDI
        - VMDK

        The image may be compressed using gzip or bzip2. See the DigitalOcean Custom
        Image documentation for [additional requirements](https://www.digitalocean.com/docs/images/custom-images/#image-requirements).

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        flatcar = digitalocean.CustomImage("flatcar",
            url="https://stable.release.flatcar-linux.net/amd64-usr/2605.7.0/flatcar_production_digitalocean_image.bin.bz2",
            regions=["nyc3"])
        example = digitalocean.Droplet("example",
            image=flatcar.id,
            region=digitalocean.Region.NYC3,
            size=digitalocean.DropletSlug.DROPLET_S1_VCPU1_GB,
            ssh_keys=["12345"])
        ```
        <!--End PulumiCodeChooser -->

        :param str resource_name: The name of the resource.
        :param CustomImageArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CustomImageArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 distribution: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 regions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 url: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CustomImageArgs.__new__(CustomImageArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["distribution"] = distribution
            __props__.__dict__["name"] = name
            if regions is None and not opts.urn:
                raise TypeError("Missing required property 'regions'")
            __props__.__dict__["regions"] = regions
            __props__.__dict__["tags"] = tags
            if url is None and not opts.urn:
                raise TypeError("Missing required property 'url'")
            __props__.__dict__["url"] = url
            __props__.__dict__["created_at"] = None
            __props__.__dict__["image_id"] = None
            __props__.__dict__["min_disk_size"] = None
            __props__.__dict__["public"] = None
            __props__.__dict__["size_gigabytes"] = None
            __props__.__dict__["slug"] = None
            __props__.__dict__["status"] = None
            __props__.__dict__["type"] = None
        super(CustomImage, __self__).__init__(
            'digitalocean:index/customImage:CustomImage',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            created_at: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            distribution: Optional[pulumi.Input[str]] = None,
            image_id: Optional[pulumi.Input[int]] = None,
            min_disk_size: Optional[pulumi.Input[int]] = None,
            name: Optional[pulumi.Input[str]] = None,
            public: Optional[pulumi.Input[bool]] = None,
            regions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            size_gigabytes: Optional[pulumi.Input[float]] = None,
            slug: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            type: Optional[pulumi.Input[str]] = None,
            url: Optional[pulumi.Input[str]] = None) -> 'CustomImage':
        """
        Get an existing CustomImage resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] created_at: A time value given in ISO8601 combined date and time format that represents when the image was created.
        :param pulumi.Input[str] description: An optional description for the image.
        :param pulumi.Input[str] distribution: An optional distribution name for the image. Valid values are documented [here](https://docs.digitalocean.com/reference/api/api-reference/#operation/create_custom_image)
        :param pulumi.Input[int] image_id: A unique number that can be used to identify and reference a specific image.
        :param pulumi.Input[int] min_disk_size: The minimum disk size in GB required for a Droplet to use this image.
        :param pulumi.Input[str] name: A name for the Custom Image.
        :param pulumi.Input[bool] public: Indicates whether the image in question is public or not.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] regions: A list of regions. (Currently only one is supported).
        :param pulumi.Input[float] size_gigabytes: The size of the image in gigabytes.
        :param pulumi.Input[str] slug: A uniquely identifying string for each image.
        :param pulumi.Input[str] status: A status string indicating the state of a custom image.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: A list of optional tags for the image.
        :param pulumi.Input[str] type: Describes the kind of image.
        :param pulumi.Input[str] url: A URL from which the custom Linux virtual machine image may be retrieved.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CustomImageState.__new__(_CustomImageState)

        __props__.__dict__["created_at"] = created_at
        __props__.__dict__["description"] = description
        __props__.__dict__["distribution"] = distribution
        __props__.__dict__["image_id"] = image_id
        __props__.__dict__["min_disk_size"] = min_disk_size
        __props__.__dict__["name"] = name
        __props__.__dict__["public"] = public
        __props__.__dict__["regions"] = regions
        __props__.__dict__["size_gigabytes"] = size_gigabytes
        __props__.__dict__["slug"] = slug
        __props__.__dict__["status"] = status
        __props__.__dict__["tags"] = tags
        __props__.__dict__["type"] = type
        __props__.__dict__["url"] = url
        return CustomImage(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> pulumi.Output[str]:
        """
        A time value given in ISO8601 combined date and time format that represents when the image was created.
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        An optional description for the image.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def distribution(self) -> pulumi.Output[Optional[str]]:
        """
        An optional distribution name for the image. Valid values are documented [here](https://docs.digitalocean.com/reference/api/api-reference/#operation/create_custom_image)
        """
        return pulumi.get(self, "distribution")

    @property
    @pulumi.getter(name="imageId")
    def image_id(self) -> pulumi.Output[int]:
        """
        A unique number that can be used to identify and reference a specific image.
        """
        return pulumi.get(self, "image_id")

    @property
    @pulumi.getter(name="minDiskSize")
    def min_disk_size(self) -> pulumi.Output[int]:
        """
        The minimum disk size in GB required for a Droplet to use this image.
        """
        return pulumi.get(self, "min_disk_size")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        A name for the Custom Image.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def public(self) -> pulumi.Output[bool]:
        """
        Indicates whether the image in question is public or not.
        """
        return pulumi.get(self, "public")

    @property
    @pulumi.getter
    def regions(self) -> pulumi.Output[Sequence[str]]:
        """
        A list of regions. (Currently only one is supported).
        """
        return pulumi.get(self, "regions")

    @property
    @pulumi.getter(name="sizeGigabytes")
    def size_gigabytes(self) -> pulumi.Output[float]:
        """
        The size of the image in gigabytes.
        """
        return pulumi.get(self, "size_gigabytes")

    @property
    @pulumi.getter
    def slug(self) -> pulumi.Output[str]:
        """
        A uniquely identifying string for each image.
        """
        return pulumi.get(self, "slug")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        A status string indicating the state of a custom image.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        A list of optional tags for the image.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        Describes the kind of image.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def url(self) -> pulumi.Output[str]:
        """
        A URL from which the custom Linux virtual machine image may be retrieved.
        """
        return pulumi.get(self, "url")

