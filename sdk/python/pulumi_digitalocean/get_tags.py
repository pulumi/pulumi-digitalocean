# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = [
    'GetTagsResult',
    'AwaitableGetTagsResult',
    'get_tags',
]

@pulumi.output_type
class GetTagsResult:
    """
    A collection of values returned by getTags.
    """
    def __init__(__self__, filters=None, id=None, sorts=None, tags=None):
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if sorts and not isinstance(sorts, list):
            raise TypeError("Expected argument 'sorts' to be a list")
        pulumi.set(__self__, "sorts", sorts)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetTagsFilterResult']]:
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def sorts(self) -> Optional[Sequence['outputs.GetTagsSortResult']]:
        return pulumi.get(self, "sorts")

    @property
    @pulumi.getter
    def tags(self) -> Sequence['outputs.GetTagsTagResult']:
        return pulumi.get(self, "tags")


class AwaitableGetTagsResult(GetTagsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetTagsResult(
            filters=self.filters,
            id=self.id,
            sorts=self.sorts,
            tags=self.tags)


def get_tags(filters: Optional[Sequence[pulumi.InputType['GetTagsFilterArgs']]] = None,
             sorts: Optional[Sequence[pulumi.InputType['GetTagsSortArgs']]] = None,
             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTagsResult:
    """
    Returns a list of tags in your DigitalOcean account, with the ability to
    filter and sort the results. If no filters are specified, all tags will be
    returned.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    list = digitalocean.get_tags(sorts=[digitalocean.GetTagsSortArgs(
        key="total_resource_count",
        direction="asc",
    )])
    pulumi.export("sortedTags", list.tags)
    ```


    :param Sequence[pulumi.InputType['GetTagsFilterArgs']] filters: Filter the results.
           The `filter` block is documented below.
    :param Sequence[pulumi.InputType['GetTagsSortArgs']] sorts: Sort the results.
           The `sort` block is documented below.
    """
    __args__ = dict()
    __args__['filters'] = filters
    __args__['sorts'] = sorts
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('digitalocean:index/getTags:getTags', __args__, opts=opts, typ=GetTagsResult).value

    return AwaitableGetTagsResult(
        filters=__ret__.filters,
        id=__ret__.id,
        sorts=__ret__.sorts,
        tags=__ret__.tags)
