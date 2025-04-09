# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
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

__all__ = ['VolumeAttachmentArgs', 'VolumeAttachment']

@pulumi.input_type
class VolumeAttachmentArgs:
    def __init__(__self__, *,
                 droplet_id: pulumi.Input[builtins.int],
                 volume_id: pulumi.Input[builtins.str]):
        """
        The set of arguments for constructing a VolumeAttachment resource.
        :param pulumi.Input[builtins.int] droplet_id: ID of the Droplet to attach the volume to.
        :param pulumi.Input[builtins.str] volume_id: ID of the Volume to be attached to the Droplet.
        """
        pulumi.set(__self__, "droplet_id", droplet_id)
        pulumi.set(__self__, "volume_id", volume_id)

    @property
    @pulumi.getter(name="dropletId")
    def droplet_id(self) -> pulumi.Input[builtins.int]:
        """
        ID of the Droplet to attach the volume to.
        """
        return pulumi.get(self, "droplet_id")

    @droplet_id.setter
    def droplet_id(self, value: pulumi.Input[builtins.int]):
        pulumi.set(self, "droplet_id", value)

    @property
    @pulumi.getter(name="volumeId")
    def volume_id(self) -> pulumi.Input[builtins.str]:
        """
        ID of the Volume to be attached to the Droplet.
        """
        return pulumi.get(self, "volume_id")

    @volume_id.setter
    def volume_id(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "volume_id", value)


@pulumi.input_type
class _VolumeAttachmentState:
    def __init__(__self__, *,
                 droplet_id: Optional[pulumi.Input[builtins.int]] = None,
                 volume_id: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering VolumeAttachment resources.
        :param pulumi.Input[builtins.int] droplet_id: ID of the Droplet to attach the volume to.
        :param pulumi.Input[builtins.str] volume_id: ID of the Volume to be attached to the Droplet.
        """
        if droplet_id is not None:
            pulumi.set(__self__, "droplet_id", droplet_id)
        if volume_id is not None:
            pulumi.set(__self__, "volume_id", volume_id)

    @property
    @pulumi.getter(name="dropletId")
    def droplet_id(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        ID of the Droplet to attach the volume to.
        """
        return pulumi.get(self, "droplet_id")

    @droplet_id.setter
    def droplet_id(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "droplet_id", value)

    @property
    @pulumi.getter(name="volumeId")
    def volume_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        ID of the Volume to be attached to the Droplet.
        """
        return pulumi.get(self, "volume_id")

    @volume_id.setter
    def volume_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "volume_id", value)


class VolumeAttachment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 droplet_id: Optional[pulumi.Input[builtins.int]] = None,
                 volume_id: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        Manages attaching a Volume to a Droplet.

        > **NOTE:** Volumes can be attached either directly on the `Droplet` resource, or using the `VolumeAttachment` resource - but the two cannot be used together. If both are used against the same Droplet, the volume attachments will constantly drift.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        foobar = digitalocean.Volume("foobar",
            region=digitalocean.Region.NYC1,
            name="baz",
            size=100,
            initial_filesystem_type=digitalocean.FileSystemType.EXT4,
            description="an example volume")
        foobar_droplet = digitalocean.Droplet("foobar",
            name="baz",
            size=digitalocean.DropletSlug.DROPLET_S1_VCPU1_GB,
            image="ubuntu-18-04-x64",
            region=digitalocean.Region.NYC1)
        foobar_volume_attachment = digitalocean.VolumeAttachment("foobar",
            droplet_id=foobar_droplet.id,
            volume_id=foobar.id)
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.int] droplet_id: ID of the Droplet to attach the volume to.
        :param pulumi.Input[builtins.str] volume_id: ID of the Volume to be attached to the Droplet.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: VolumeAttachmentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages attaching a Volume to a Droplet.

        > **NOTE:** Volumes can be attached either directly on the `Droplet` resource, or using the `VolumeAttachment` resource - but the two cannot be used together. If both are used against the same Droplet, the volume attachments will constantly drift.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        foobar = digitalocean.Volume("foobar",
            region=digitalocean.Region.NYC1,
            name="baz",
            size=100,
            initial_filesystem_type=digitalocean.FileSystemType.EXT4,
            description="an example volume")
        foobar_droplet = digitalocean.Droplet("foobar",
            name="baz",
            size=digitalocean.DropletSlug.DROPLET_S1_VCPU1_GB,
            image="ubuntu-18-04-x64",
            region=digitalocean.Region.NYC1)
        foobar_volume_attachment = digitalocean.VolumeAttachment("foobar",
            droplet_id=foobar_droplet.id,
            volume_id=foobar.id)
        ```

        :param str resource_name: The name of the resource.
        :param VolumeAttachmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(VolumeAttachmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 droplet_id: Optional[pulumi.Input[builtins.int]] = None,
                 volume_id: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = VolumeAttachmentArgs.__new__(VolumeAttachmentArgs)

            if droplet_id is None and not opts.urn:
                raise TypeError("Missing required property 'droplet_id'")
            __props__.__dict__["droplet_id"] = droplet_id
            if volume_id is None and not opts.urn:
                raise TypeError("Missing required property 'volume_id'")
            __props__.__dict__["volume_id"] = volume_id
        super(VolumeAttachment, __self__).__init__(
            'digitalocean:index/volumeAttachment:VolumeAttachment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            droplet_id: Optional[pulumi.Input[builtins.int]] = None,
            volume_id: Optional[pulumi.Input[builtins.str]] = None) -> 'VolumeAttachment':
        """
        Get an existing VolumeAttachment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.int] droplet_id: ID of the Droplet to attach the volume to.
        :param pulumi.Input[builtins.str] volume_id: ID of the Volume to be attached to the Droplet.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _VolumeAttachmentState.__new__(_VolumeAttachmentState)

        __props__.__dict__["droplet_id"] = droplet_id
        __props__.__dict__["volume_id"] = volume_id
        return VolumeAttachment(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="dropletId")
    def droplet_id(self) -> pulumi.Output[builtins.int]:
        """
        ID of the Droplet to attach the volume to.
        """
        return pulumi.get(self, "droplet_id")

    @property
    @pulumi.getter(name="volumeId")
    def volume_id(self) -> pulumi.Output[builtins.str]:
        """
        ID of the Volume to be attached to the Droplet.
        """
        return pulumi.get(self, "volume_id")

