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

__all__ = ['UptimeCheckArgs', 'UptimeCheck']

@pulumi.input_type
class UptimeCheckArgs:
    def __init__(__self__, *,
                 target: pulumi.Input[str],
                 enabled: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 regions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a UptimeCheck resource.
        :param pulumi.Input[str] target: The endpoint to perform healthchecks on.
        :param pulumi.Input[bool] enabled: A boolean value indicating whether the check is enabled/disabled.
        :param pulumi.Input[str] name: A human-friendly display name for the check.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] regions: An array containing the selected regions to perform healthchecks from: "us_east", "us_west", "eu_west", "se_asia"
        :param pulumi.Input[str] type: The type of health check to perform: 'ping' 'http' 'https'.
        """
        pulumi.set(__self__, "target", target)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if regions is not None:
            pulumi.set(__self__, "regions", regions)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def target(self) -> pulumi.Input[str]:
        """
        The endpoint to perform healthchecks on.
        """
        return pulumi.get(self, "target")

    @target.setter
    def target(self, value: pulumi.Input[str]):
        pulumi.set(self, "target", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        A boolean value indicating whether the check is enabled/disabled.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        A human-friendly display name for the check.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def regions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        An array containing the selected regions to perform healthchecks from: "us_east", "us_west", "eu_west", "se_asia"
        """
        return pulumi.get(self, "regions")

    @regions.setter
    def regions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "regions", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of health check to perform: 'ping' 'http' 'https'.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class _UptimeCheckState:
    def __init__(__self__, *,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 regions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 target: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering UptimeCheck resources.
        :param pulumi.Input[bool] enabled: A boolean value indicating whether the check is enabled/disabled.
        :param pulumi.Input[str] name: A human-friendly display name for the check.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] regions: An array containing the selected regions to perform healthchecks from: "us_east", "us_west", "eu_west", "se_asia"
        :param pulumi.Input[str] target: The endpoint to perform healthchecks on.
        :param pulumi.Input[str] type: The type of health check to perform: 'ping' 'http' 'https'.
        """
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if regions is not None:
            pulumi.set(__self__, "regions", regions)
        if target is not None:
            pulumi.set(__self__, "target", target)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        A boolean value indicating whether the check is enabled/disabled.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        A human-friendly display name for the check.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def regions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        An array containing the selected regions to perform healthchecks from: "us_east", "us_west", "eu_west", "se_asia"
        """
        return pulumi.get(self, "regions")

    @regions.setter
    def regions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "regions", value)

    @property
    @pulumi.getter
    def target(self) -> Optional[pulumi.Input[str]]:
        """
        The endpoint to perform healthchecks on.
        """
        return pulumi.get(self, "target")

    @target.setter
    def target(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "target", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of health check to perform: 'ping' 'http' 'https'.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class UptimeCheck(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 regions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 target: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a [DigitalOcean Uptime Checks](https://docs.digitalocean.com/reference/api/api-reference/#tag/Uptime)
        resource. Uptime Checks provide the ability to monitor your endpoints from around the world, and alert you when they're slow, unavailable, or SSL certificates are expiring.

        ## Import

        Uptime checks can be imported using the uptime check's `id`, e.g.

        ```sh
        $ pulumi import digitalocean:index/uptimeCheck:UptimeCheck target 5a4981aa-9653-4bd1-bef5-d6bff52042e4
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enabled: A boolean value indicating whether the check is enabled/disabled.
        :param pulumi.Input[str] name: A human-friendly display name for the check.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] regions: An array containing the selected regions to perform healthchecks from: "us_east", "us_west", "eu_west", "se_asia"
        :param pulumi.Input[str] target: The endpoint to perform healthchecks on.
        :param pulumi.Input[str] type: The type of health check to perform: 'ping' 'http' 'https'.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: UptimeCheckArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a [DigitalOcean Uptime Checks](https://docs.digitalocean.com/reference/api/api-reference/#tag/Uptime)
        resource. Uptime Checks provide the ability to monitor your endpoints from around the world, and alert you when they're slow, unavailable, or SSL certificates are expiring.

        ## Import

        Uptime checks can be imported using the uptime check's `id`, e.g.

        ```sh
        $ pulumi import digitalocean:index/uptimeCheck:UptimeCheck target 5a4981aa-9653-4bd1-bef5-d6bff52042e4
        ```

        :param str resource_name: The name of the resource.
        :param UptimeCheckArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(UptimeCheckArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 regions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 target: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = UptimeCheckArgs.__new__(UptimeCheckArgs)

            __props__.__dict__["enabled"] = enabled
            __props__.__dict__["name"] = name
            __props__.__dict__["regions"] = regions
            if target is None and not opts.urn:
                raise TypeError("Missing required property 'target'")
            __props__.__dict__["target"] = target
            __props__.__dict__["type"] = type
        super(UptimeCheck, __self__).__init__(
            'digitalocean:index/uptimeCheck:UptimeCheck',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None,
            regions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            target: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'UptimeCheck':
        """
        Get an existing UptimeCheck resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enabled: A boolean value indicating whether the check is enabled/disabled.
        :param pulumi.Input[str] name: A human-friendly display name for the check.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] regions: An array containing the selected regions to perform healthchecks from: "us_east", "us_west", "eu_west", "se_asia"
        :param pulumi.Input[str] target: The endpoint to perform healthchecks on.
        :param pulumi.Input[str] type: The type of health check to perform: 'ping' 'http' 'https'.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _UptimeCheckState.__new__(_UptimeCheckState)

        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["name"] = name
        __props__.__dict__["regions"] = regions
        __props__.__dict__["target"] = target
        __props__.__dict__["type"] = type
        return UptimeCheck(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        A boolean value indicating whether the check is enabled/disabled.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        A human-friendly display name for the check.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def regions(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        An array containing the selected regions to perform healthchecks from: "us_east", "us_west", "eu_west", "se_asia"
        """
        return pulumi.get(self, "regions")

    @property
    @pulumi.getter
    def target(self) -> pulumi.Output[str]:
        """
        The endpoint to perform healthchecks on.
        """
        return pulumi.get(self, "target")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[Optional[str]]:
        """
        The type of health check to perform: 'ping' 'http' 'https'.
        """
        return pulumi.get(self, "type")

