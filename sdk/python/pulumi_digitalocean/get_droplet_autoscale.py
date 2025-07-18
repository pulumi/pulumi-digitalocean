# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
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

__all__ = [
    'GetDropletAutoscaleResult',
    'AwaitableGetDropletAutoscaleResult',
    'get_droplet_autoscale',
    'get_droplet_autoscale_output',
]

@pulumi.output_type
class GetDropletAutoscaleResult:
    """
    A collection of values returned by getDropletAutoscale.
    """
    def __init__(__self__, configs=None, created_at=None, current_utilizations=None, droplet_templates=None, id=None, name=None, status=None, updated_at=None):
        if configs and not isinstance(configs, list):
            raise TypeError("Expected argument 'configs' to be a list")
        pulumi.set(__self__, "configs", configs)
        if created_at and not isinstance(created_at, str):
            raise TypeError("Expected argument 'created_at' to be a str")
        pulumi.set(__self__, "created_at", created_at)
        if current_utilizations and not isinstance(current_utilizations, list):
            raise TypeError("Expected argument 'current_utilizations' to be a list")
        pulumi.set(__self__, "current_utilizations", current_utilizations)
        if droplet_templates and not isinstance(droplet_templates, list):
            raise TypeError("Expected argument 'droplet_templates' to be a list")
        pulumi.set(__self__, "droplet_templates", droplet_templates)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if updated_at and not isinstance(updated_at, str):
            raise TypeError("Expected argument 'updated_at' to be a str")
        pulumi.set(__self__, "updated_at", updated_at)

    @property
    @pulumi.getter
    def configs(self) -> Sequence['outputs.GetDropletAutoscaleConfigResult']:
        return pulumi.get(self, "configs")

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> builtins.str:
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter(name="currentUtilizations")
    def current_utilizations(self) -> Sequence['outputs.GetDropletAutoscaleCurrentUtilizationResult']:
        return pulumi.get(self, "current_utilizations")

    @property
    @pulumi.getter(name="dropletTemplates")
    def droplet_templates(self) -> Sequence['outputs.GetDropletAutoscaleDropletTemplateResult']:
        return pulumi.get(self, "droplet_templates")

    @property
    @pulumi.getter
    def id(self) -> Optional[builtins.str]:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> Optional[builtins.str]:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def status(self) -> builtins.str:
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> builtins.str:
        return pulumi.get(self, "updated_at")


class AwaitableGetDropletAutoscaleResult(GetDropletAutoscaleResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDropletAutoscaleResult(
            configs=self.configs,
            created_at=self.created_at,
            current_utilizations=self.current_utilizations,
            droplet_templates=self.droplet_templates,
            id=self.id,
            name=self.name,
            status=self.status,
            updated_at=self.updated_at)


def get_droplet_autoscale(id: Optional[builtins.str] = None,
                          name: Optional[builtins.str] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDropletAutoscaleResult:
    """
    ## Example Usage

    Get the Droplet Autoscale pool by name:

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    my_imported_autoscale_pool = digitalocean.get_droplet_autoscale(name=my_existing_autoscale_pool["name"])
    ```

    Get the Droplet Autoscale pool by ID:

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    my_imported_autoscale_pool = digitalocean.get_droplet_autoscale(id=my_existing_autoscale_pool["id"])
    ```


    :param builtins.str id: The ID of Droplet Autoscale pool.
    :param builtins.str name: The name of Droplet Autoscale pool.
    """
    __args__ = dict()
    __args__['id'] = id
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('digitalocean:index/getDropletAutoscale:getDropletAutoscale', __args__, opts=opts, typ=GetDropletAutoscaleResult).value

    return AwaitableGetDropletAutoscaleResult(
        configs=pulumi.get(__ret__, 'configs'),
        created_at=pulumi.get(__ret__, 'created_at'),
        current_utilizations=pulumi.get(__ret__, 'current_utilizations'),
        droplet_templates=pulumi.get(__ret__, 'droplet_templates'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        status=pulumi.get(__ret__, 'status'),
        updated_at=pulumi.get(__ret__, 'updated_at'))
def get_droplet_autoscale_output(id: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                                 name: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                                 opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetDropletAutoscaleResult]:
    """
    ## Example Usage

    Get the Droplet Autoscale pool by name:

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    my_imported_autoscale_pool = digitalocean.get_droplet_autoscale(name=my_existing_autoscale_pool["name"])
    ```

    Get the Droplet Autoscale pool by ID:

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    my_imported_autoscale_pool = digitalocean.get_droplet_autoscale(id=my_existing_autoscale_pool["id"])
    ```


    :param builtins.str id: The ID of Droplet Autoscale pool.
    :param builtins.str name: The name of Droplet Autoscale pool.
    """
    __args__ = dict()
    __args__['id'] = id
    __args__['name'] = name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('digitalocean:index/getDropletAutoscale:getDropletAutoscale', __args__, opts=opts, typ=GetDropletAutoscaleResult)
    return __ret__.apply(lambda __response__: GetDropletAutoscaleResult(
        configs=pulumi.get(__response__, 'configs'),
        created_at=pulumi.get(__response__, 'created_at'),
        current_utilizations=pulumi.get(__response__, 'current_utilizations'),
        droplet_templates=pulumi.get(__response__, 'droplet_templates'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        status=pulumi.get(__response__, 'status'),
        updated_at=pulumi.get(__response__, 'updated_at')))
