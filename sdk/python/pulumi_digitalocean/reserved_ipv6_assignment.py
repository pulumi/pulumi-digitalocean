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

__all__ = ['ReservedIpv6AssignmentArgs', 'ReservedIpv6Assignment']

@pulumi.input_type
class ReservedIpv6AssignmentArgs:
    def __init__(__self__, *,
                 droplet_id: pulumi.Input[builtins.int],
                 ip: pulumi.Input[builtins.str]):
        """
        The set of arguments for constructing a ReservedIpv6Assignment resource.
        :param pulumi.Input[builtins.int] droplet_id: The ID of Droplet that the reserved IPv6 will be assigned to.
        :param pulumi.Input[builtins.str] ip: The reserved IPv6 to assign to the Droplet.
        """
        pulumi.set(__self__, "droplet_id", droplet_id)
        pulumi.set(__self__, "ip", ip)

    @property
    @pulumi.getter(name="dropletId")
    def droplet_id(self) -> pulumi.Input[builtins.int]:
        """
        The ID of Droplet that the reserved IPv6 will be assigned to.
        """
        return pulumi.get(self, "droplet_id")

    @droplet_id.setter
    def droplet_id(self, value: pulumi.Input[builtins.int]):
        pulumi.set(self, "droplet_id", value)

    @property
    @pulumi.getter
    def ip(self) -> pulumi.Input[builtins.str]:
        """
        The reserved IPv6 to assign to the Droplet.
        """
        return pulumi.get(self, "ip")

    @ip.setter
    def ip(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "ip", value)


@pulumi.input_type
class _ReservedIpv6AssignmentState:
    def __init__(__self__, *,
                 droplet_id: Optional[pulumi.Input[builtins.int]] = None,
                 ip: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering ReservedIpv6Assignment resources.
        :param pulumi.Input[builtins.int] droplet_id: The ID of Droplet that the reserved IPv6 will be assigned to.
        :param pulumi.Input[builtins.str] ip: The reserved IPv6 to assign to the Droplet.
        """
        if droplet_id is not None:
            pulumi.set(__self__, "droplet_id", droplet_id)
        if ip is not None:
            pulumi.set(__self__, "ip", ip)

    @property
    @pulumi.getter(name="dropletId")
    def droplet_id(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        The ID of Droplet that the reserved IPv6 will be assigned to.
        """
        return pulumi.get(self, "droplet_id")

    @droplet_id.setter
    def droplet_id(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "droplet_id", value)

    @property
    @pulumi.getter
    def ip(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The reserved IPv6 to assign to the Droplet.
        """
        return pulumi.get(self, "ip")

    @ip.setter
    def ip(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "ip", value)


class ReservedIpv6Assignment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 droplet_id: Optional[pulumi.Input[builtins.int]] = None,
                 ip: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        Provides a resource for assigning an existing DigitalOcean reserved IPv6 to a Droplet. This
        makes it easy to provision reserved IPv6 addresses that are not tied to the lifecycle of your Droplet.

        ## Import

        Reserved IPv6 assignments can be imported using the reserved IPv6 itself and the `id` of

        the Droplet joined with a comma. For example:

        ```sh
        $ pulumi import digitalocean:index/reservedIpv6Assignment:ReservedIpv6Assignment foobar 2409:40d0:fa:27dd:9b24:7074:7b85:eee6,123456
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.int] droplet_id: The ID of Droplet that the reserved IPv6 will be assigned to.
        :param pulumi.Input[builtins.str] ip: The reserved IPv6 to assign to the Droplet.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ReservedIpv6AssignmentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a resource for assigning an existing DigitalOcean reserved IPv6 to a Droplet. This
        makes it easy to provision reserved IPv6 addresses that are not tied to the lifecycle of your Droplet.

        ## Import

        Reserved IPv6 assignments can be imported using the reserved IPv6 itself and the `id` of

        the Droplet joined with a comma. For example:

        ```sh
        $ pulumi import digitalocean:index/reservedIpv6Assignment:ReservedIpv6Assignment foobar 2409:40d0:fa:27dd:9b24:7074:7b85:eee6,123456
        ```

        :param str resource_name: The name of the resource.
        :param ReservedIpv6AssignmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ReservedIpv6AssignmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 droplet_id: Optional[pulumi.Input[builtins.int]] = None,
                 ip: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ReservedIpv6AssignmentArgs.__new__(ReservedIpv6AssignmentArgs)

            if droplet_id is None and not opts.urn:
                raise TypeError("Missing required property 'droplet_id'")
            __props__.__dict__["droplet_id"] = droplet_id
            if ip is None and not opts.urn:
                raise TypeError("Missing required property 'ip'")
            __props__.__dict__["ip"] = ip
        super(ReservedIpv6Assignment, __self__).__init__(
            'digitalocean:index/reservedIpv6Assignment:ReservedIpv6Assignment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            droplet_id: Optional[pulumi.Input[builtins.int]] = None,
            ip: Optional[pulumi.Input[builtins.str]] = None) -> 'ReservedIpv6Assignment':
        """
        Get an existing ReservedIpv6Assignment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.int] droplet_id: The ID of Droplet that the reserved IPv6 will be assigned to.
        :param pulumi.Input[builtins.str] ip: The reserved IPv6 to assign to the Droplet.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ReservedIpv6AssignmentState.__new__(_ReservedIpv6AssignmentState)

        __props__.__dict__["droplet_id"] = droplet_id
        __props__.__dict__["ip"] = ip
        return ReservedIpv6Assignment(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="dropletId")
    def droplet_id(self) -> pulumi.Output[builtins.int]:
        """
        The ID of Droplet that the reserved IPv6 will be assigned to.
        """
        return pulumi.get(self, "droplet_id")

    @property
    @pulumi.getter
    def ip(self) -> pulumi.Output[builtins.str]:
        """
        The reserved IPv6 to assign to the Droplet.
        """
        return pulumi.get(self, "ip")

