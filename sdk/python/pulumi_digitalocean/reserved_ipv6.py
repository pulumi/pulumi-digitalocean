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

__all__ = ['ReservedIpv6Args', 'ReservedIpv6']

@pulumi.input_type
class ReservedIpv6Args:
    def __init__(__self__, *,
                 region_slug: pulumi.Input[str],
                 droplet_id: Optional[pulumi.Input[int]] = None,
                 ip: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ReservedIpv6 resource.
        """
        pulumi.set(__self__, "region_slug", region_slug)
        if droplet_id is not None:
            pulumi.set(__self__, "droplet_id", droplet_id)
        if ip is not None:
            pulumi.set(__self__, "ip", ip)

    @property
    @pulumi.getter(name="regionSlug")
    def region_slug(self) -> pulumi.Input[str]:
        return pulumi.get(self, "region_slug")

    @region_slug.setter
    def region_slug(self, value: pulumi.Input[str]):
        pulumi.set(self, "region_slug", value)

    @property
    @pulumi.getter(name="dropletId")
    def droplet_id(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "droplet_id")

    @droplet_id.setter
    def droplet_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "droplet_id", value)

    @property
    @pulumi.getter
    def ip(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "ip")

    @ip.setter
    def ip(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ip", value)


@pulumi.input_type
class _ReservedIpv6State:
    def __init__(__self__, *,
                 droplet_id: Optional[pulumi.Input[int]] = None,
                 ip: Optional[pulumi.Input[str]] = None,
                 region_slug: Optional[pulumi.Input[str]] = None,
                 urn: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ReservedIpv6 resources.
        :param pulumi.Input[str] urn: the uniform resource name for the reserved ipv6
        """
        if droplet_id is not None:
            pulumi.set(__self__, "droplet_id", droplet_id)
        if ip is not None:
            pulumi.set(__self__, "ip", ip)
        if region_slug is not None:
            pulumi.set(__self__, "region_slug", region_slug)
        if urn is not None:
            pulumi.set(__self__, "urn", urn)

    @property
    @pulumi.getter(name="dropletId")
    def droplet_id(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "droplet_id")

    @droplet_id.setter
    def droplet_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "droplet_id", value)

    @property
    @pulumi.getter
    def ip(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "ip")

    @ip.setter
    def ip(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ip", value)

    @property
    @pulumi.getter(name="regionSlug")
    def region_slug(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "region_slug")

    @region_slug.setter
    def region_slug(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region_slug", value)

    @property
    @pulumi.getter
    def urn(self) -> Optional[pulumi.Input[str]]:
        """
        the uniform resource name for the reserved ipv6
        """
        return pulumi.get(self, "urn")

    @urn.setter
    def urn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "urn", value)


class ReservedIpv6(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 droplet_id: Optional[pulumi.Input[int]] = None,
                 ip: Optional[pulumi.Input[str]] = None,
                 region_slug: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Create a ReservedIpv6 resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ReservedIpv6Args,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a ReservedIpv6 resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param ReservedIpv6Args args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ReservedIpv6Args, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 droplet_id: Optional[pulumi.Input[int]] = None,
                 ip: Optional[pulumi.Input[str]] = None,
                 region_slug: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ReservedIpv6Args.__new__(ReservedIpv6Args)

            __props__.__dict__["droplet_id"] = droplet_id
            __props__.__dict__["ip"] = ip
            if region_slug is None and not opts.urn:
                raise TypeError("Missing required property 'region_slug'")
            __props__.__dict__["region_slug"] = region_slug
            __props__.__dict__["urn"] = None
        super(ReservedIpv6, __self__).__init__(
            'digitalocean:index/reservedIpv6:ReservedIpv6',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            droplet_id: Optional[pulumi.Input[int]] = None,
            ip: Optional[pulumi.Input[str]] = None,
            region_slug: Optional[pulumi.Input[str]] = None,
            urn: Optional[pulumi.Input[str]] = None) -> 'ReservedIpv6':
        """
        Get an existing ReservedIpv6 resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] urn: the uniform resource name for the reserved ipv6
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ReservedIpv6State.__new__(_ReservedIpv6State)

        __props__.__dict__["droplet_id"] = droplet_id
        __props__.__dict__["ip"] = ip
        __props__.__dict__["region_slug"] = region_slug
        __props__.__dict__["urn"] = urn
        return ReservedIpv6(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="dropletId")
    def droplet_id(self) -> pulumi.Output[int]:
        return pulumi.get(self, "droplet_id")

    @property
    @pulumi.getter
    def ip(self) -> pulumi.Output[str]:
        return pulumi.get(self, "ip")

    @property
    @pulumi.getter(name="regionSlug")
    def region_slug(self) -> pulumi.Output[str]:
        return pulumi.get(self, "region_slug")

    @property
    @pulumi.getter
    def urn(self) -> pulumi.Output[str]:
        """
        the uniform resource name for the reserved ipv6
        """
        return pulumi.get(self, "urn")
