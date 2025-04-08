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
from . import outputs
from ._inputs import *

__all__ = [
    'GetTagsResult',
    'AwaitableGetTagsResult',
    'get_tags',
    'get_tags_output',
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
    def id(self) -> builtins.str:
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


def get_tags(filters: Optional[Sequence[Union['GetTagsFilterArgs', 'GetTagsFilterArgsDict']]] = None,
             sorts: Optional[Sequence[Union['GetTagsSortArgs', 'GetTagsSortArgsDict']]] = None,
             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTagsResult:
    """
    Returns a list of tags in your DigitalOcean account, with the ability to
    filter and sort the results. If no filters are specified, all tags will be
    returned.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    list = digitalocean.get_tags(sorts=[{
        "key": "total_resource_count",
        "direction": "asc",
    }])
    pulumi.export("sortedTags", list.tags)
    ```


    :param Sequence[Union['GetTagsFilterArgs', 'GetTagsFilterArgsDict']] filters: Filter the results.
           The `filter` block is documented below.
    :param Sequence[Union['GetTagsSortArgs', 'GetTagsSortArgsDict']] sorts: Sort the results.
           The `sort` block is documented below.
    """
    __args__ = dict()
    __args__['filters'] = filters
    __args__['sorts'] = sorts
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('digitalocean:index/getTags:getTags', __args__, opts=opts, typ=GetTagsResult).value

    return AwaitableGetTagsResult(
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        sorts=pulumi.get(__ret__, 'sorts'),
        tags=pulumi.get(__ret__, 'tags'))
def get_tags_output(filters: Optional[pulumi.Input[Optional[Sequence[Union['GetTagsFilterArgs', 'GetTagsFilterArgsDict']]]]] = None,
                    sorts: Optional[pulumi.Input[Optional[Sequence[Union['GetTagsSortArgs', 'GetTagsSortArgsDict']]]]] = None,
                    opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetTagsResult]:
    """
    Returns a list of tags in your DigitalOcean account, with the ability to
    filter and sort the results. If no filters are specified, all tags will be
    returned.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    list = digitalocean.get_tags(sorts=[{
        "key": "total_resource_count",
        "direction": "asc",
    }])
    pulumi.export("sortedTags", list.tags)
    ```


    :param Sequence[Union['GetTagsFilterArgs', 'GetTagsFilterArgsDict']] filters: Filter the results.
           The `filter` block is documented below.
    :param Sequence[Union['GetTagsSortArgs', 'GetTagsSortArgsDict']] sorts: Sort the results.
           The `sort` block is documented below.
    """
    __args__ = dict()
    __args__['filters'] = filters
    __args__['sorts'] = sorts
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('digitalocean:index/getTags:getTags', __args__, opts=opts, typ=GetTagsResult)
    return __ret__.apply(lambda __response__: GetTagsResult(
        filters=pulumi.get(__response__, 'filters'),
        id=pulumi.get(__response__, 'id'),
        sorts=pulumi.get(__response__, 'sorts'),
        tags=pulumi.get(__response__, 'tags')))
