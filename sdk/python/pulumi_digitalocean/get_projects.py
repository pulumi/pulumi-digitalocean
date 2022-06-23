# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = [
    'GetProjectsResult',
    'AwaitableGetProjectsResult',
    'get_projects',
    'get_projects_output',
]

@pulumi.output_type
class GetProjectsResult:
    """
    A collection of values returned by getProjects.
    """
    def __init__(__self__, filters=None, id=None, projects=None, sorts=None):
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if projects and not isinstance(projects, list):
            raise TypeError("Expected argument 'projects' to be a list")
        pulumi.set(__self__, "projects", projects)
        if sorts and not isinstance(sorts, list):
            raise TypeError("Expected argument 'sorts' to be a list")
        pulumi.set(__self__, "sorts", sorts)

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetProjectsFilterResult']]:
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
    def projects(self) -> Sequence['outputs.GetProjectsProjectResult']:
        """
        A set of projects satisfying any `filter` and `sort` criteria. Each project has
        the following attributes:
        """
        return pulumi.get(self, "projects")

    @property
    @pulumi.getter
    def sorts(self) -> Optional[Sequence['outputs.GetProjectsSortResult']]:
        return pulumi.get(self, "sorts")


class AwaitableGetProjectsResult(GetProjectsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetProjectsResult(
            filters=self.filters,
            id=self.id,
            projects=self.projects,
            sorts=self.sorts)


def get_projects(filters: Optional[Sequence[pulumi.InputType['GetProjectsFilterArgs']]] = None,
                 sorts: Optional[Sequence[pulumi.InputType['GetProjectsSortArgs']]] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetProjectsResult:
    """
    Retrieve information about all DigitalOcean projects associated with an account, with
    the ability to filter and sort the results. If no filters are specified, all projects
    will be returned.

    Note: You can use the `Project` data source to
    obtain metadata about a single project if you already know the `id` to retrieve or the unique
    `name` of the project.

    ## Example Usage

    Use the `filter` block with a `key` string and `values` list to filter projects.

    For example to find all staging environment projects:

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    staging = digitalocean.get_projects(filters=[digitalocean.GetProjectsFilterArgs(
        key="environment",
        values=["Staging"],
    )])
    ```

    You can filter on multiple fields and sort the results as well:

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    non_default_production = digitalocean.get_projects(filters=[
            digitalocean.GetProjectsFilterArgs(
                key="environment",
                values=["Production"],
            ),
            digitalocean.GetProjectsFilterArgs(
                key="is_default",
                values=["false"],
            ),
        ],
        sorts=[digitalocean.GetProjectsSortArgs(
            direction="asc",
            key="name",
        )])
    ```


    :param Sequence[pulumi.InputType['GetProjectsFilterArgs']] filters: Filter the results.
           The `filter` block is documented below.
    :param Sequence[pulumi.InputType['GetProjectsSortArgs']] sorts: Sort the results.
           The `sort` block is documented below.
    """
    __args__ = dict()
    __args__['filters'] = filters
    __args__['sorts'] = sorts
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('digitalocean:index/getProjects:getProjects', __args__, opts=opts, typ=GetProjectsResult).value

    return AwaitableGetProjectsResult(
        filters=__ret__.filters,
        id=__ret__.id,
        projects=__ret__.projects,
        sorts=__ret__.sorts)


@_utilities.lift_output_func(get_projects)
def get_projects_output(filters: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetProjectsFilterArgs']]]]] = None,
                        sorts: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetProjectsSortArgs']]]]] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetProjectsResult]:
    """
    Retrieve information about all DigitalOcean projects associated with an account, with
    the ability to filter and sort the results. If no filters are specified, all projects
    will be returned.

    Note: You can use the `Project` data source to
    obtain metadata about a single project if you already know the `id` to retrieve or the unique
    `name` of the project.

    ## Example Usage

    Use the `filter` block with a `key` string and `values` list to filter projects.

    For example to find all staging environment projects:

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    staging = digitalocean.get_projects(filters=[digitalocean.GetProjectsFilterArgs(
        key="environment",
        values=["Staging"],
    )])
    ```

    You can filter on multiple fields and sort the results as well:

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    non_default_production = digitalocean.get_projects(filters=[
            digitalocean.GetProjectsFilterArgs(
                key="environment",
                values=["Production"],
            ),
            digitalocean.GetProjectsFilterArgs(
                key="is_default",
                values=["false"],
            ),
        ],
        sorts=[digitalocean.GetProjectsSortArgs(
            direction="asc",
            key="name",
        )])
    ```


    :param Sequence[pulumi.InputType['GetProjectsFilterArgs']] filters: Filter the results.
           The `filter` block is documented below.
    :param Sequence[pulumi.InputType['GetProjectsSortArgs']] sorts: Sort the results.
           The `sort` block is documented below.
    """
    ...
