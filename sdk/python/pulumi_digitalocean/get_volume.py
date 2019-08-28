# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class GetVolumeResult:
    """
    A collection of values returned by getVolume.
    """
    def __init__(__self__, description=None, droplet_ids=None, filesystem_label=None, filesystem_type=None, name=None, region=None, size=None, urn=None, id=None):
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        __self__.description = description
        """
        Text describing a block storage volume.
        """
        if droplet_ids and not isinstance(droplet_ids, list):
            raise TypeError("Expected argument 'droplet_ids' to be a list")
        __self__.droplet_ids = droplet_ids
        """
        A list of associated Droplet ids.
        """
        if filesystem_label and not isinstance(filesystem_label, str):
            raise TypeError("Expected argument 'filesystem_label' to be a str")
        __self__.filesystem_label = filesystem_label
        """
        Filesystem label currently in-use on the block storage volume.
        """
        if filesystem_type and not isinstance(filesystem_type, str):
            raise TypeError("Expected argument 'filesystem_type' to be a str")
        __self__.filesystem_type = filesystem_type
        """
        Filesystem type currently in-use on the block storage volume.
        """
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        __self__.name = name
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        __self__.region = region
        if size and not isinstance(size, float):
            raise TypeError("Expected argument 'size' to be a float")
        __self__.size = size
        """
        The size of the block storage volume in GiB.
        """
        if urn and not isinstance(urn, str):
            raise TypeError("Expected argument 'urn' to be a str")
        __self__.urn = urn
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        __self__.id = id
        """
        id is the provider-assigned unique ID for this managed resource.
        """
class AwaitableGetVolumeResult(GetVolumeResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetVolumeResult(
            description=self.description,
            droplet_ids=self.droplet_ids,
            filesystem_label=self.filesystem_label,
            filesystem_type=self.filesystem_type,
            name=self.name,
            region=self.region,
            size=self.size,
            urn=self.urn,
            id=self.id)

def get_volume(description=None,name=None,region=None,opts=None):
    """
    Use this data source to access information about an existing resource.
    
    :param str name: The name of block storage volume.
    :param str region: The region the block storage volume is provisioned in.

    > This content is derived from https://github.com/terraform-providers/terraform-provider-digitalocean/blob/master/website/docs/d/volume.html.markdown.
    """
    __args__ = dict()

    __args__['description'] = description
    __args__['name'] = name
    __args__['region'] = region
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = utilities.get_version()
    __ret__ = pulumi.runtime.invoke('digitalocean:index/getVolume:getVolume', __args__, opts=opts).value

    return AwaitableGetVolumeResult(
        description=__ret__.get('description'),
        droplet_ids=__ret__.get('dropletIds'),
        filesystem_label=__ret__.get('filesystemLabel'),
        filesystem_type=__ret__.get('filesystemType'),
        name=__ret__.get('name'),
        region=__ret__.get('region'),
        size=__ret__.get('size'),
        urn=__ret__.get('urn'),
        id=__ret__.get('id'))
