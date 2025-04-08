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
    'GetRegionsResult',
    'AwaitableGetRegionsResult',
    'get_regions',
    'get_regions_output',
]

@pulumi.output_type
class GetRegionsResult:
    """
    A collection of values returned by getRegions.
    """
    def __init__(__self__, filters=None, id=None, regions=None, sorts=None):
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if regions and not isinstance(regions, list):
            raise TypeError("Expected argument 'regions' to be a list")
        pulumi.set(__self__, "regions", regions)
        if sorts and not isinstance(sorts, list):
            raise TypeError("Expected argument 'sorts' to be a list")
        pulumi.set(__self__, "sorts", sorts)

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetRegionsFilterResult']]:
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
    def regions(self) -> Sequence['outputs.GetRegionsRegionResult']:
        """
        A set of regions satisfying any `filter` and `sort` criteria. Each region has the following attributes:
        """
        return pulumi.get(self, "regions")

    @property
    @pulumi.getter
    def sorts(self) -> Optional[Sequence['outputs.GetRegionsSortResult']]:
        return pulumi.get(self, "sorts")


class AwaitableGetRegionsResult(GetRegionsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRegionsResult(
            filters=self.filters,
            id=self.id,
            regions=self.regions,
            sorts=self.sorts)


def get_regions(filters: Optional[Sequence[Union['GetRegionsFilterArgs', 'GetRegionsFilterArgsDict']]] = None,
                sorts: Optional[Sequence[Union['GetRegionsSortArgs', 'GetRegionsSortArgsDict']]] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRegionsResult:
    """
    Retrieve information about all supported DigitalOcean regions, with the ability to
    filter and sort the results. If no filters are specified, all regions will be returned.

    Note: You can use the `get_region` data source
    to obtain metadata about a single region if you already know the `slug` to retrieve.

    ## Example Usage

    Use the `filter` block with a `key` string and `values` list to filter regions.

    For example to find all available regions:

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    available = digitalocean.get_regions(filters=[{
        "key": "available",
        "values": ["true"],
    }])
    ```

    You can filter on multiple fields and sort the results as well:

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    available = digitalocean.get_regions(filters=[
            {
                "key": "available",
                "values": ["true"],
            },
            {
                "key": "features",
                "values": ["private_networking"],
            },
        ],
        sorts=[{
            "key": "name",
            "direction": "desc",
        }])
    ```


    :param Sequence[Union['GetRegionsFilterArgs', 'GetRegionsFilterArgsDict']] filters: Filter the results.
           The `filter` block is documented below.
    :param Sequence[Union['GetRegionsSortArgs', 'GetRegionsSortArgsDict']] sorts: Sort the results.
           The `sort` block is documented below.
    """
    __args__ = dict()
    __args__['filters'] = filters
    __args__['sorts'] = sorts
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('digitalocean:index/getRegions:getRegions', __args__, opts=opts, typ=GetRegionsResult).value

    return AwaitableGetRegionsResult(
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        regions=pulumi.get(__ret__, 'regions'),
        sorts=pulumi.get(__ret__, 'sorts'))
def get_regions_output(filters: Optional[pulumi.Input[Optional[Sequence[Union['GetRegionsFilterArgs', 'GetRegionsFilterArgsDict']]]]] = None,
                       sorts: Optional[pulumi.Input[Optional[Sequence[Union['GetRegionsSortArgs', 'GetRegionsSortArgsDict']]]]] = None,
                       opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetRegionsResult]:
    """
    Retrieve information about all supported DigitalOcean regions, with the ability to
    filter and sort the results. If no filters are specified, all regions will be returned.

    Note: You can use the `get_region` data source
    to obtain metadata about a single region if you already know the `slug` to retrieve.

    ## Example Usage

    Use the `filter` block with a `key` string and `values` list to filter regions.

    For example to find all available regions:

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    available = digitalocean.get_regions(filters=[{
        "key": "available",
        "values": ["true"],
    }])
    ```

    You can filter on multiple fields and sort the results as well:

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    available = digitalocean.get_regions(filters=[
            {
                "key": "available",
                "values": ["true"],
            },
            {
                "key": "features",
                "values": ["private_networking"],
            },
        ],
        sorts=[{
            "key": "name",
            "direction": "desc",
        }])
    ```


    :param Sequence[Union['GetRegionsFilterArgs', 'GetRegionsFilterArgsDict']] filters: Filter the results.
           The `filter` block is documented below.
    :param Sequence[Union['GetRegionsSortArgs', 'GetRegionsSortArgsDict']] sorts: Sort the results.
           The `sort` block is documented below.
    """
    __args__ = dict()
    __args__['filters'] = filters
    __args__['sorts'] = sorts
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('digitalocean:index/getRegions:getRegions', __args__, opts=opts, typ=GetRegionsResult)
    return __ret__.apply(lambda __response__: GetRegionsResult(
        filters=pulumi.get(__response__, 'filters'),
        id=pulumi.get(__response__, 'id'),
        regions=pulumi.get(__response__, 'regions'),
        sorts=pulumi.get(__response__, 'sorts')))
