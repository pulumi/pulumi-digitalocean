# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

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
    'GetSizesResult',
    'AwaitableGetSizesResult',
    'get_sizes',
    'get_sizes_output',
]

@pulumi.output_type
class GetSizesResult:
    """
    A collection of values returned by getSizes.
    """
    def __init__(__self__, filters=None, id=None, sizes=None, sorts=None):
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if sizes and not isinstance(sizes, list):
            raise TypeError("Expected argument 'sizes' to be a list")
        pulumi.set(__self__, "sizes", sizes)
        if sorts and not isinstance(sorts, list):
            raise TypeError("Expected argument 'sorts' to be a list")
        pulumi.set(__self__, "sorts", sorts)

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetSizesFilterResult']]:
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
    def sizes(self) -> Sequence['outputs.GetSizesSizeResult']:
        return pulumi.get(self, "sizes")

    @property
    @pulumi.getter
    def sorts(self) -> Optional[Sequence['outputs.GetSizesSortResult']]:
        return pulumi.get(self, "sorts")


class AwaitableGetSizesResult(GetSizesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSizesResult(
            filters=self.filters,
            id=self.id,
            sizes=self.sizes,
            sorts=self.sorts)


def get_sizes(filters: Optional[Sequence[Union['GetSizesFilterArgs', 'GetSizesFilterArgsDict']]] = None,
              sorts: Optional[Sequence[Union['GetSizesSortArgs', 'GetSizesSortArgsDict']]] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSizesResult:
    """
    Retrieves information about the Droplet sizes that DigitalOcean supports, with
    the ability to filter and sort the results. If no filters are specified, all sizes
    will be returned.


    :param Sequence[Union['GetSizesFilterArgs', 'GetSizesFilterArgsDict']] filters: Filter the results.
           The `filter` block is documented below.
    :param Sequence[Union['GetSizesSortArgs', 'GetSizesSortArgsDict']] sorts: Sort the results.
           The `sort` block is documented below.
    """
    __args__ = dict()
    __args__['filters'] = filters
    __args__['sorts'] = sorts
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('digitalocean:index/getSizes:getSizes', __args__, opts=opts, typ=GetSizesResult).value

    return AwaitableGetSizesResult(
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        sizes=pulumi.get(__ret__, 'sizes'),
        sorts=pulumi.get(__ret__, 'sorts'))
def get_sizes_output(filters: Optional[pulumi.Input[Optional[Sequence[Union['GetSizesFilterArgs', 'GetSizesFilterArgsDict']]]]] = None,
                     sorts: Optional[pulumi.Input[Optional[Sequence[Union['GetSizesSortArgs', 'GetSizesSortArgsDict']]]]] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSizesResult]:
    """
    Retrieves information about the Droplet sizes that DigitalOcean supports, with
    the ability to filter and sort the results. If no filters are specified, all sizes
    will be returned.


    :param Sequence[Union['GetSizesFilterArgs', 'GetSizesFilterArgsDict']] filters: Filter the results.
           The `filter` block is documented below.
    :param Sequence[Union['GetSizesSortArgs', 'GetSizesSortArgsDict']] sorts: Sort the results.
           The `sort` block is documented below.
    """
    __args__ = dict()
    __args__['filters'] = filters
    __args__['sorts'] = sorts
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('digitalocean:index/getSizes:getSizes', __args__, opts=opts, typ=GetSizesResult)
    return __ret__.apply(lambda __response__: GetSizesResult(
        filters=pulumi.get(__response__, 'filters'),
        id=pulumi.get(__response__, 'id'),
        sizes=pulumi.get(__response__, 'sizes'),
        sorts=pulumi.get(__response__, 'sorts')))
