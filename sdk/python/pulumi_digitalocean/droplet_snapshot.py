# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['DropletSnapshotArgs', 'DropletSnapshot']

@pulumi.input_type
class DropletSnapshotArgs:
    def __init__(__self__, *,
                 droplet_id: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a DropletSnapshot resource.
        :param pulumi.Input[str] droplet_id: The ID of the Droplet from which the snapshot will be taken.
        :param pulumi.Input[str] name: A name for the Droplet snapshot.
        """
        DropletSnapshotArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            droplet_id=droplet_id,
            name=name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             droplet_id: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if droplet_id is None and 'dropletId' in kwargs:
            droplet_id = kwargs['dropletId']
        if droplet_id is None:
            raise TypeError("Missing 'droplet_id' argument")

        _setter("droplet_id", droplet_id)
        if name is not None:
            _setter("name", name)

    @property
    @pulumi.getter(name="dropletId")
    def droplet_id(self) -> pulumi.Input[str]:
        """
        The ID of the Droplet from which the snapshot will be taken.
        """
        return pulumi.get(self, "droplet_id")

    @droplet_id.setter
    def droplet_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "droplet_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        A name for the Droplet snapshot.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _DropletSnapshotState:
    def __init__(__self__, *,
                 created_at: Optional[pulumi.Input[str]] = None,
                 droplet_id: Optional[pulumi.Input[str]] = None,
                 min_disk_size: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 regions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 size: Optional[pulumi.Input[float]] = None):
        """
        Input properties used for looking up and filtering DropletSnapshot resources.
        :param pulumi.Input[str] created_at: The date and time the Droplet snapshot was created.
        :param pulumi.Input[str] droplet_id: The ID of the Droplet from which the snapshot will be taken.
        :param pulumi.Input[int] min_disk_size: The minimum size in gigabytes required for a Droplet to be created based on this snapshot.
        :param pulumi.Input[str] name: A name for the Droplet snapshot.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] regions: A list of DigitalOcean region "slugs" indicating where the droplet snapshot is available.
        :param pulumi.Input[float] size: The billable size of the Droplet snapshot in gigabytes.
        """
        _DropletSnapshotState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            created_at=created_at,
            droplet_id=droplet_id,
            min_disk_size=min_disk_size,
            name=name,
            regions=regions,
            size=size,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             created_at: Optional[pulumi.Input[str]] = None,
             droplet_id: Optional[pulumi.Input[str]] = None,
             min_disk_size: Optional[pulumi.Input[int]] = None,
             name: Optional[pulumi.Input[str]] = None,
             regions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             size: Optional[pulumi.Input[float]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if created_at is None and 'createdAt' in kwargs:
            created_at = kwargs['createdAt']
        if droplet_id is None and 'dropletId' in kwargs:
            droplet_id = kwargs['dropletId']
        if min_disk_size is None and 'minDiskSize' in kwargs:
            min_disk_size = kwargs['minDiskSize']

        if created_at is not None:
            _setter("created_at", created_at)
        if droplet_id is not None:
            _setter("droplet_id", droplet_id)
        if min_disk_size is not None:
            _setter("min_disk_size", min_disk_size)
        if name is not None:
            _setter("name", name)
        if regions is not None:
            _setter("regions", regions)
        if size is not None:
            _setter("size", size)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> Optional[pulumi.Input[str]]:
        """
        The date and time the Droplet snapshot was created.
        """
        return pulumi.get(self, "created_at")

    @created_at.setter
    def created_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_at", value)

    @property
    @pulumi.getter(name="dropletId")
    def droplet_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Droplet from which the snapshot will be taken.
        """
        return pulumi.get(self, "droplet_id")

    @droplet_id.setter
    def droplet_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "droplet_id", value)

    @property
    @pulumi.getter(name="minDiskSize")
    def min_disk_size(self) -> Optional[pulumi.Input[int]]:
        """
        The minimum size in gigabytes required for a Droplet to be created based on this snapshot.
        """
        return pulumi.get(self, "min_disk_size")

    @min_disk_size.setter
    def min_disk_size(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "min_disk_size", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        A name for the Droplet snapshot.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def regions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of DigitalOcean region "slugs" indicating where the droplet snapshot is available.
        """
        return pulumi.get(self, "regions")

    @regions.setter
    def regions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "regions", value)

    @property
    @pulumi.getter
    def size(self) -> Optional[pulumi.Input[float]]:
        """
        The billable size of the Droplet snapshot in gigabytes.
        """
        return pulumi.get(self, "size")

    @size.setter
    def size(self, value: Optional[pulumi.Input[float]]):
        pulumi.set(self, "size", value)


class DropletSnapshot(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 droplet_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a resource which can be used to create a snapshot from an existing DigitalOcean Droplet.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        web = digitalocean.Droplet("web",
            size="s-1vcpu-1gb",
            image="ubuntu-22-04-x64",
            region="nyc3")
        web_snapshot = digitalocean.DropletSnapshot("web-snapshot", droplet_id=web.id)
        from_snapshot = digitalocean.Droplet("from-snapshot",
            image=web_snapshot.id,
            region="nyc3",
            size="s-2vcpu-4gb")
        ```

        ## Import

        Droplet Snapshots can be imported using the `snapshot id`, e.g.

        ```sh
         $ pulumi import digitalocean:index/dropletSnapshot:DropletSnapshot mysnapshot 123456
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] droplet_id: The ID of the Droplet from which the snapshot will be taken.
        :param pulumi.Input[str] name: A name for the Droplet snapshot.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DropletSnapshotArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a resource which can be used to create a snapshot from an existing DigitalOcean Droplet.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        web = digitalocean.Droplet("web",
            size="s-1vcpu-1gb",
            image="ubuntu-22-04-x64",
            region="nyc3")
        web_snapshot = digitalocean.DropletSnapshot("web-snapshot", droplet_id=web.id)
        from_snapshot = digitalocean.Droplet("from-snapshot",
            image=web_snapshot.id,
            region="nyc3",
            size="s-2vcpu-4gb")
        ```

        ## Import

        Droplet Snapshots can be imported using the `snapshot id`, e.g.

        ```sh
         $ pulumi import digitalocean:index/dropletSnapshot:DropletSnapshot mysnapshot 123456
        ```

        :param str resource_name: The name of the resource.
        :param DropletSnapshotArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DropletSnapshotArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            DropletSnapshotArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 droplet_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DropletSnapshotArgs.__new__(DropletSnapshotArgs)

            if droplet_id is None and not opts.urn:
                raise TypeError("Missing required property 'droplet_id'")
            __props__.__dict__["droplet_id"] = droplet_id
            __props__.__dict__["name"] = name
            __props__.__dict__["created_at"] = None
            __props__.__dict__["min_disk_size"] = None
            __props__.__dict__["regions"] = None
            __props__.__dict__["size"] = None
        super(DropletSnapshot, __self__).__init__(
            'digitalocean:index/dropletSnapshot:DropletSnapshot',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            created_at: Optional[pulumi.Input[str]] = None,
            droplet_id: Optional[pulumi.Input[str]] = None,
            min_disk_size: Optional[pulumi.Input[int]] = None,
            name: Optional[pulumi.Input[str]] = None,
            regions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            size: Optional[pulumi.Input[float]] = None) -> 'DropletSnapshot':
        """
        Get an existing DropletSnapshot resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] created_at: The date and time the Droplet snapshot was created.
        :param pulumi.Input[str] droplet_id: The ID of the Droplet from which the snapshot will be taken.
        :param pulumi.Input[int] min_disk_size: The minimum size in gigabytes required for a Droplet to be created based on this snapshot.
        :param pulumi.Input[str] name: A name for the Droplet snapshot.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] regions: A list of DigitalOcean region "slugs" indicating where the droplet snapshot is available.
        :param pulumi.Input[float] size: The billable size of the Droplet snapshot in gigabytes.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DropletSnapshotState.__new__(_DropletSnapshotState)

        __props__.__dict__["created_at"] = created_at
        __props__.__dict__["droplet_id"] = droplet_id
        __props__.__dict__["min_disk_size"] = min_disk_size
        __props__.__dict__["name"] = name
        __props__.__dict__["regions"] = regions
        __props__.__dict__["size"] = size
        return DropletSnapshot(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> pulumi.Output[str]:
        """
        The date and time the Droplet snapshot was created.
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter(name="dropletId")
    def droplet_id(self) -> pulumi.Output[str]:
        """
        The ID of the Droplet from which the snapshot will be taken.
        """
        return pulumi.get(self, "droplet_id")

    @property
    @pulumi.getter(name="minDiskSize")
    def min_disk_size(self) -> pulumi.Output[int]:
        """
        The minimum size in gigabytes required for a Droplet to be created based on this snapshot.
        """
        return pulumi.get(self, "min_disk_size")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        A name for the Droplet snapshot.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def regions(self) -> pulumi.Output[Sequence[str]]:
        """
        A list of DigitalOcean region "slugs" indicating where the droplet snapshot is available.
        """
        return pulumi.get(self, "regions")

    @property
    @pulumi.getter
    def size(self) -> pulumi.Output[float]:
        """
        The billable size of the Droplet snapshot in gigabytes.
        """
        return pulumi.get(self, "size")

