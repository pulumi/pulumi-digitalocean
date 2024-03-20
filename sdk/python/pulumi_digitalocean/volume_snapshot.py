# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['VolumeSnapshotArgs', 'VolumeSnapshot']

@pulumi.input_type
class VolumeSnapshotArgs:
    def __init__(__self__, *,
                 volume_id: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a VolumeSnapshot resource.
        :param pulumi.Input[str] volume_id: The ID of the volume from which the volume snapshot originated.
        :param pulumi.Input[str] name: A name for the volume snapshot.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: A list of the tags to be applied to this volume snapshot.
        """
        pulumi.set(__self__, "volume_id", volume_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="volumeId")
    def volume_id(self) -> pulumi.Input[str]:
        """
        The ID of the volume from which the volume snapshot originated.
        """
        return pulumi.get(self, "volume_id")

    @volume_id.setter
    def volume_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "volume_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        A name for the volume snapshot.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of the tags to be applied to this volume snapshot.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _VolumeSnapshotState:
    def __init__(__self__, *,
                 created_at: Optional[pulumi.Input[str]] = None,
                 min_disk_size: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 regions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 size: Optional[pulumi.Input[float]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 volume_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering VolumeSnapshot resources.
        :param pulumi.Input[str] created_at: The date and time the volume snapshot was created.
        :param pulumi.Input[int] min_disk_size: The minimum size in gigabytes required for a volume to be created based on this volume snapshot.
        :param pulumi.Input[str] name: A name for the volume snapshot.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] regions: A list of DigitalOcean region "slugs" indicating where the volume snapshot is available.
        :param pulumi.Input[float] size: The billable size of the volume snapshot in gigabytes.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: A list of the tags to be applied to this volume snapshot.
        :param pulumi.Input[str] volume_id: The ID of the volume from which the volume snapshot originated.
        """
        if created_at is not None:
            pulumi.set(__self__, "created_at", created_at)
        if min_disk_size is not None:
            pulumi.set(__self__, "min_disk_size", min_disk_size)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if regions is not None:
            pulumi.set(__self__, "regions", regions)
        if size is not None:
            pulumi.set(__self__, "size", size)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if volume_id is not None:
            pulumi.set(__self__, "volume_id", volume_id)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> Optional[pulumi.Input[str]]:
        """
        The date and time the volume snapshot was created.
        """
        return pulumi.get(self, "created_at")

    @created_at.setter
    def created_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_at", value)

    @property
    @pulumi.getter(name="minDiskSize")
    def min_disk_size(self) -> Optional[pulumi.Input[int]]:
        """
        The minimum size in gigabytes required for a volume to be created based on this volume snapshot.
        """
        return pulumi.get(self, "min_disk_size")

    @min_disk_size.setter
    def min_disk_size(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "min_disk_size", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        A name for the volume snapshot.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def regions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of DigitalOcean region "slugs" indicating where the volume snapshot is available.
        """
        return pulumi.get(self, "regions")

    @regions.setter
    def regions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "regions", value)

    @property
    @pulumi.getter
    def size(self) -> Optional[pulumi.Input[float]]:
        """
        The billable size of the volume snapshot in gigabytes.
        """
        return pulumi.get(self, "size")

    @size.setter
    def size(self, value: Optional[pulumi.Input[float]]):
        pulumi.set(self, "size", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of the tags to be applied to this volume snapshot.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="volumeId")
    def volume_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the volume from which the volume snapshot originated.
        """
        return pulumi.get(self, "volume_id")

    @volume_id.setter
    def volume_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "volume_id", value)


class VolumeSnapshot(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 volume_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a DigitalOcean Volume Snapshot which can be used to create a snapshot from an existing volume.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        foobar_volume = digitalocean.Volume("foobarVolume",
            region=digitalocean.Region.NYC1,
            size=100,
            description="an example volume")
        foobar_volume_snapshot = digitalocean.VolumeSnapshot("foobarVolumeSnapshot", volume_id=foobar_volume.id)
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Volume Snapshots can be imported using the `snapshot id`, e.g.

        ```sh
        $ pulumi import digitalocean:index/volumeSnapshot:VolumeSnapshot snapshot 506f78a4-e098-11e5-ad9f-000f53306ae1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: A name for the volume snapshot.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: A list of the tags to be applied to this volume snapshot.
        :param pulumi.Input[str] volume_id: The ID of the volume from which the volume snapshot originated.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: VolumeSnapshotArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a DigitalOcean Volume Snapshot which can be used to create a snapshot from an existing volume.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        foobar_volume = digitalocean.Volume("foobarVolume",
            region=digitalocean.Region.NYC1,
            size=100,
            description="an example volume")
        foobar_volume_snapshot = digitalocean.VolumeSnapshot("foobarVolumeSnapshot", volume_id=foobar_volume.id)
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Volume Snapshots can be imported using the `snapshot id`, e.g.

        ```sh
        $ pulumi import digitalocean:index/volumeSnapshot:VolumeSnapshot snapshot 506f78a4-e098-11e5-ad9f-000f53306ae1
        ```

        :param str resource_name: The name of the resource.
        :param VolumeSnapshotArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(VolumeSnapshotArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 volume_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = VolumeSnapshotArgs.__new__(VolumeSnapshotArgs)

            __props__.__dict__["name"] = name
            __props__.__dict__["tags"] = tags
            if volume_id is None and not opts.urn:
                raise TypeError("Missing required property 'volume_id'")
            __props__.__dict__["volume_id"] = volume_id
            __props__.__dict__["created_at"] = None
            __props__.__dict__["min_disk_size"] = None
            __props__.__dict__["regions"] = None
            __props__.__dict__["size"] = None
        super(VolumeSnapshot, __self__).__init__(
            'digitalocean:index/volumeSnapshot:VolumeSnapshot',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            created_at: Optional[pulumi.Input[str]] = None,
            min_disk_size: Optional[pulumi.Input[int]] = None,
            name: Optional[pulumi.Input[str]] = None,
            regions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            size: Optional[pulumi.Input[float]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            volume_id: Optional[pulumi.Input[str]] = None) -> 'VolumeSnapshot':
        """
        Get an existing VolumeSnapshot resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] created_at: The date and time the volume snapshot was created.
        :param pulumi.Input[int] min_disk_size: The minimum size in gigabytes required for a volume to be created based on this volume snapshot.
        :param pulumi.Input[str] name: A name for the volume snapshot.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] regions: A list of DigitalOcean region "slugs" indicating where the volume snapshot is available.
        :param pulumi.Input[float] size: The billable size of the volume snapshot in gigabytes.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: A list of the tags to be applied to this volume snapshot.
        :param pulumi.Input[str] volume_id: The ID of the volume from which the volume snapshot originated.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _VolumeSnapshotState.__new__(_VolumeSnapshotState)

        __props__.__dict__["created_at"] = created_at
        __props__.__dict__["min_disk_size"] = min_disk_size
        __props__.__dict__["name"] = name
        __props__.__dict__["regions"] = regions
        __props__.__dict__["size"] = size
        __props__.__dict__["tags"] = tags
        __props__.__dict__["volume_id"] = volume_id
        return VolumeSnapshot(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> pulumi.Output[str]:
        """
        The date and time the volume snapshot was created.
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter(name="minDiskSize")
    def min_disk_size(self) -> pulumi.Output[int]:
        """
        The minimum size in gigabytes required for a volume to be created based on this volume snapshot.
        """
        return pulumi.get(self, "min_disk_size")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        A name for the volume snapshot.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def regions(self) -> pulumi.Output[Sequence[str]]:
        """
        A list of DigitalOcean region "slugs" indicating where the volume snapshot is available.
        """
        return pulumi.get(self, "regions")

    @property
    @pulumi.getter
    def size(self) -> pulumi.Output[float]:
        """
        The billable size of the volume snapshot in gigabytes.
        """
        return pulumi.get(self, "size")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        A list of the tags to be applied to this volume snapshot.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="volumeId")
    def volume_id(self) -> pulumi.Output[str]:
        """
        The ID of the volume from which the volume snapshot originated.
        """
        return pulumi.get(self, "volume_id")

