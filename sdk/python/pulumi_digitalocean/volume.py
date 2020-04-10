# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class Volume(pulumi.CustomResource):
    description: pulumi.Output[str]
    """
    A free-form text field up to a limit of 1024 bytes to describe a block storage volume.
    """
    droplet_ids: pulumi.Output[list]
    """
    A list of associated droplet ids.
    """
    filesystem_label: pulumi.Output[str]
    """
    Filesystem label for the block storage volume.
    """
    filesystem_type: pulumi.Output[str]
    """
    Filesystem type (`xfs` or `ext4`) for the block storage volume.
    """
    initial_filesystem_label: pulumi.Output[str]
    """
    Initial filesystem label for the block storage volume.
    """
    initial_filesystem_type: pulumi.Output[str]
    """
    Initial filesystem type (`xfs` or `ext4`) for the block storage volume.
    """
    name: pulumi.Output[str]
    """
    A name for the block storage volume. Must be lowercase and be composed only of numbers, letters and "-", up to a limit of 64 characters.
    """
    region: pulumi.Output[str]
    """
    The region that the block storage volume will be created in.
    """
    size: pulumi.Output[float]
    """
    The size of the block storage volume in GiB. If updated, can only be expanded.
    """
    snapshot_id: pulumi.Output[str]
    """
    The ID of an existing volume snapshot from which the new volume will be created. If supplied, the region and size will be limitied on creation to that of the referenced snapshot
    """
    tags: pulumi.Output[list]
    """
    A list of the tags to be applied to this Volume.
    """
    urn: pulumi.Output[str]
    """
    The uniform resource name for the volume.
    """
    def __init__(__self__, resource_name, opts=None, description=None, filesystem_type=None, initial_filesystem_label=None, initial_filesystem_type=None, name=None, region=None, size=None, snapshot_id=None, tags=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides a DigitalOcean Block Storage volume which can be attached to a Droplet in order to provide expanded storage.



        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: A free-form text field up to a limit of 1024 bytes to describe a block storage volume.
        :param pulumi.Input[str] filesystem_type: Filesystem type (`xfs` or `ext4`) for the block storage volume.
        :param pulumi.Input[str] initial_filesystem_label: Initial filesystem label for the block storage volume.
        :param pulumi.Input[str] initial_filesystem_type: Initial filesystem type (`xfs` or `ext4`) for the block storage volume.
        :param pulumi.Input[str] name: A name for the block storage volume. Must be lowercase and be composed only of numbers, letters and "-", up to a limit of 64 characters.
        :param pulumi.Input[str] region: The region that the block storage volume will be created in.
        :param pulumi.Input[float] size: The size of the block storage volume in GiB. If updated, can only be expanded.
        :param pulumi.Input[str] snapshot_id: The ID of an existing volume snapshot from which the new volume will be created. If supplied, the region and size will be limitied on creation to that of the referenced snapshot
        :param pulumi.Input[list] tags: A list of the tags to be applied to this Volume.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['description'] = description
            __props__['filesystem_type'] = filesystem_type
            __props__['initial_filesystem_label'] = initial_filesystem_label
            __props__['initial_filesystem_type'] = initial_filesystem_type
            __props__['name'] = name
            if region is None:
                raise TypeError("Missing required property 'region'")
            __props__['region'] = region
            if size is None:
                raise TypeError("Missing required property 'size'")
            __props__['size'] = size
            __props__['snapshot_id'] = snapshot_id
            __props__['tags'] = tags
            __props__['droplet_ids'] = None
            __props__['filesystem_label'] = None
            __props__['urn'] = None
        super(Volume, __self__).__init__(
            'digitalocean:index/volume:Volume',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, description=None, droplet_ids=None, filesystem_label=None, filesystem_type=None, initial_filesystem_label=None, initial_filesystem_type=None, name=None, region=None, size=None, snapshot_id=None, tags=None, urn=None):
        """
        Get an existing Volume resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: A free-form text field up to a limit of 1024 bytes to describe a block storage volume.
        :param pulumi.Input[list] droplet_ids: A list of associated droplet ids.
        :param pulumi.Input[str] filesystem_label: Filesystem label for the block storage volume.
        :param pulumi.Input[str] filesystem_type: Filesystem type (`xfs` or `ext4`) for the block storage volume.
        :param pulumi.Input[str] initial_filesystem_label: Initial filesystem label for the block storage volume.
        :param pulumi.Input[str] initial_filesystem_type: Initial filesystem type (`xfs` or `ext4`) for the block storage volume.
        :param pulumi.Input[str] name: A name for the block storage volume. Must be lowercase and be composed only of numbers, letters and "-", up to a limit of 64 characters.
        :param pulumi.Input[str] region: The region that the block storage volume will be created in.
        :param pulumi.Input[float] size: The size of the block storage volume in GiB. If updated, can only be expanded.
        :param pulumi.Input[str] snapshot_id: The ID of an existing volume snapshot from which the new volume will be created. If supplied, the region and size will be limitied on creation to that of the referenced snapshot
        :param pulumi.Input[list] tags: A list of the tags to be applied to this Volume.
        :param pulumi.Input[str] urn: The uniform resource name for the volume.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["description"] = description
        __props__["droplet_ids"] = droplet_ids
        __props__["filesystem_label"] = filesystem_label
        __props__["filesystem_type"] = filesystem_type
        __props__["initial_filesystem_label"] = initial_filesystem_label
        __props__["initial_filesystem_type"] = initial_filesystem_type
        __props__["name"] = name
        __props__["region"] = region
        __props__["size"] = size
        __props__["snapshot_id"] = snapshot_id
        __props__["tags"] = tags
        __props__["urn"] = urn
        return Volume(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

