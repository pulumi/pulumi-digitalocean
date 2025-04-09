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

__all__ = ['DomainArgs', 'Domain']

@pulumi.input_type
class DomainArgs:
    def __init__(__self__, *,
                 name: pulumi.Input[builtins.str],
                 ip_address: Optional[pulumi.Input[builtins.str]] = None):
        """
        The set of arguments for constructing a Domain resource.
        :param pulumi.Input[builtins.str] name: The name of the domain
        :param pulumi.Input[builtins.str] ip_address: The IP address of the domain. If specified, this IP
               is used to created an initial A record for the domain.
        """
        pulumi.set(__self__, "name", name)
        if ip_address is not None:
            pulumi.set(__self__, "ip_address", ip_address)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[builtins.str]:
        """
        The name of the domain
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="ipAddress")
    def ip_address(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The IP address of the domain. If specified, this IP
        is used to created an initial A record for the domain.
        """
        return pulumi.get(self, "ip_address")

    @ip_address.setter
    def ip_address(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "ip_address", value)


@pulumi.input_type
class _DomainState:
    def __init__(__self__, *,
                 domain_urn: Optional[pulumi.Input[builtins.str]] = None,
                 ip_address: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 ttl: Optional[pulumi.Input[builtins.int]] = None):
        """
        Input properties used for looking up and filtering Domain resources.
        :param pulumi.Input[builtins.str] domain_urn: The uniform resource name of the domain
        :param pulumi.Input[builtins.str] ip_address: The IP address of the domain. If specified, this IP
               is used to created an initial A record for the domain.
        :param pulumi.Input[builtins.str] name: The name of the domain
        :param pulumi.Input[builtins.int] ttl: The TTL value of the domain
        """
        if domain_urn is not None:
            pulumi.set(__self__, "domain_urn", domain_urn)
        if ip_address is not None:
            pulumi.set(__self__, "ip_address", ip_address)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if ttl is not None:
            pulumi.set(__self__, "ttl", ttl)

    @property
    @pulumi.getter(name="domainUrn")
    def domain_urn(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The uniform resource name of the domain
        """
        return pulumi.get(self, "domain_urn")

    @domain_urn.setter
    def domain_urn(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "domain_urn", value)

    @property
    @pulumi.getter(name="ipAddress")
    def ip_address(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The IP address of the domain. If specified, this IP
        is used to created an initial A record for the domain.
        """
        return pulumi.get(self, "ip_address")

    @ip_address.setter
    def ip_address(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "ip_address", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name of the domain
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def ttl(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        The TTL value of the domain
        """
        return pulumi.get(self, "ttl")

    @ttl.setter
    def ttl(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "ttl", value)


class Domain(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 ip_address: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        Provides a DigitalOcean domain resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        # Create a new domain
        default = digitalocean.Domain("default",
            name="example.com",
            ip_address=foo["ipv4Address"])
        ```

        ## Import

        Domains can be imported using the `domain name`, e.g.

        ```sh
        $ pulumi import digitalocean:index/domain:Domain mydomain mytestdomain.com
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] ip_address: The IP address of the domain. If specified, this IP
               is used to created an initial A record for the domain.
        :param pulumi.Input[builtins.str] name: The name of the domain
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DomainArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a DigitalOcean domain resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        # Create a new domain
        default = digitalocean.Domain("default",
            name="example.com",
            ip_address=foo["ipv4Address"])
        ```

        ## Import

        Domains can be imported using the `domain name`, e.g.

        ```sh
        $ pulumi import digitalocean:index/domain:Domain mydomain mytestdomain.com
        ```

        :param str resource_name: The name of the resource.
        :param DomainArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DomainArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 ip_address: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DomainArgs.__new__(DomainArgs)

            __props__.__dict__["ip_address"] = ip_address
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__.__dict__["name"] = name
            __props__.__dict__["domain_urn"] = None
            __props__.__dict__["ttl"] = None
        super(Domain, __self__).__init__(
            'digitalocean:index/domain:Domain',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            domain_urn: Optional[pulumi.Input[builtins.str]] = None,
            ip_address: Optional[pulumi.Input[builtins.str]] = None,
            name: Optional[pulumi.Input[builtins.str]] = None,
            ttl: Optional[pulumi.Input[builtins.int]] = None) -> 'Domain':
        """
        Get an existing Domain resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] domain_urn: The uniform resource name of the domain
        :param pulumi.Input[builtins.str] ip_address: The IP address of the domain. If specified, this IP
               is used to created an initial A record for the domain.
        :param pulumi.Input[builtins.str] name: The name of the domain
        :param pulumi.Input[builtins.int] ttl: The TTL value of the domain
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DomainState.__new__(_DomainState)

        __props__.__dict__["domain_urn"] = domain_urn
        __props__.__dict__["ip_address"] = ip_address
        __props__.__dict__["name"] = name
        __props__.__dict__["ttl"] = ttl
        return Domain(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="domainUrn")
    def domain_urn(self) -> pulumi.Output[builtins.str]:
        """
        The uniform resource name of the domain
        """
        return pulumi.get(self, "domain_urn")

    @property
    @pulumi.getter(name="ipAddress")
    def ip_address(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        The IP address of the domain. If specified, this IP
        is used to created an initial A record for the domain.
        """
        return pulumi.get(self, "ip_address")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[builtins.str]:
        """
        The name of the domain
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def ttl(self) -> pulumi.Output[builtins.int]:
        """
        The TTL value of the domain
        """
        return pulumi.get(self, "ttl")

