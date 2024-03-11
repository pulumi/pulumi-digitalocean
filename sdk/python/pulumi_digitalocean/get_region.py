# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetRegionResult',
    'AwaitableGetRegionResult',
    'get_region',
    'get_region_output',
]

@pulumi.output_type
class GetRegionResult:
    """
    A collection of values returned by getRegion.
    """
    def __init__(__self__, available=None, features=None, id=None, name=None, sizes=None, slug=None):
        if available and not isinstance(available, bool):
            raise TypeError("Expected argument 'available' to be a bool")
        pulumi.set(__self__, "available", available)
        if features and not isinstance(features, list):
            raise TypeError("Expected argument 'features' to be a list")
        pulumi.set(__self__, "features", features)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if sizes and not isinstance(sizes, list):
            raise TypeError("Expected argument 'sizes' to be a list")
        pulumi.set(__self__, "sizes", sizes)
        if slug and not isinstance(slug, str):
            raise TypeError("Expected argument 'slug' to be a str")
        pulumi.set(__self__, "slug", slug)

    @property
    @pulumi.getter
    def available(self) -> bool:
        """
        A boolean value that represents whether new Droplets can be created in this region.
        """
        return pulumi.get(self, "available")

    @property
    @pulumi.getter
    def features(self) -> Sequence[str]:
        """
        A set of features available in this region.
        """
        return pulumi.get(self, "features")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The display name of the region.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def sizes(self) -> Sequence[str]:
        """
        A set of identifying slugs for the Droplet sizes available in this region.
        """
        return pulumi.get(self, "sizes")

    @property
    @pulumi.getter
    def slug(self) -> str:
        """
        A human-readable string that is used as a unique identifier for each region.
        """
        return pulumi.get(self, "slug")


class AwaitableGetRegionResult(GetRegionResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRegionResult(
            available=self.available,
            features=self.features,
            id=self.id,
            name=self.name,
            sizes=self.sizes,
            slug=self.slug)


def get_region(slug: Optional[str] = None,
               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRegionResult:
    """
    Get information on a single DigitalOcean region. This is useful to find out
    what Droplet sizes and features are supported within a region.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    sfo2 = digitalocean.get_region(slug="sfo2")
    pulumi.export("regionName", sfo2.name)
    ```
    <!--End PulumiCodeChooser -->


    :param str slug: A human-readable string that is used as a unique identifier for each region.
    """
    __args__ = dict()
    __args__['slug'] = slug
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('digitalocean:index/getRegion:getRegion', __args__, opts=opts, typ=GetRegionResult).value

    return AwaitableGetRegionResult(
        available=pulumi.get(__ret__, 'available'),
        features=pulumi.get(__ret__, 'features'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        sizes=pulumi.get(__ret__, 'sizes'),
        slug=pulumi.get(__ret__, 'slug'))


@_utilities.lift_output_func(get_region)
def get_region_output(slug: Optional[pulumi.Input[str]] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetRegionResult]:
    """
    Get information on a single DigitalOcean region. This is useful to find out
    what Droplet sizes and features are supported within a region.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    sfo2 = digitalocean.get_region(slug="sfo2")
    pulumi.export("regionName", sfo2.name)
    ```
    <!--End PulumiCodeChooser -->


    :param str slug: A human-readable string that is used as a unique identifier for each region.
    """
    ...
