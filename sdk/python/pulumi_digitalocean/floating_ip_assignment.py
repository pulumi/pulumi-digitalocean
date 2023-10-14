# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['FloatingIpAssignmentArgs', 'FloatingIpAssignment']

@pulumi.input_type
class FloatingIpAssignmentArgs:
    def __init__(__self__, *,
                 droplet_id: pulumi.Input[int],
                 ip_address: pulumi.Input[str]):
        """
        The set of arguments for constructing a FloatingIpAssignment resource.
        :param pulumi.Input[int] droplet_id: The ID of Droplet that the Floating IP will be assigned to.
        :param pulumi.Input[str] ip_address: The Floating IP to assign to the Droplet.
        """
        FloatingIpAssignmentArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            droplet_id=droplet_id,
            ip_address=ip_address,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             droplet_id: pulumi.Input[int],
             ip_address: pulumi.Input[str],
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("droplet_id", droplet_id)
        _setter("ip_address", ip_address)

    @property
    @pulumi.getter(name="dropletId")
    def droplet_id(self) -> pulumi.Input[int]:
        """
        The ID of Droplet that the Floating IP will be assigned to.
        """
        return pulumi.get(self, "droplet_id")

    @droplet_id.setter
    def droplet_id(self, value: pulumi.Input[int]):
        pulumi.set(self, "droplet_id", value)

    @property
    @pulumi.getter(name="ipAddress")
    def ip_address(self) -> pulumi.Input[str]:
        """
        The Floating IP to assign to the Droplet.
        """
        return pulumi.get(self, "ip_address")

    @ip_address.setter
    def ip_address(self, value: pulumi.Input[str]):
        pulumi.set(self, "ip_address", value)


@pulumi.input_type
class _FloatingIpAssignmentState:
    def __init__(__self__, *,
                 droplet_id: Optional[pulumi.Input[int]] = None,
                 ip_address: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering FloatingIpAssignment resources.
        :param pulumi.Input[int] droplet_id: The ID of Droplet that the Floating IP will be assigned to.
        :param pulumi.Input[str] ip_address: The Floating IP to assign to the Droplet.
        """
        _FloatingIpAssignmentState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            droplet_id=droplet_id,
            ip_address=ip_address,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             droplet_id: Optional[pulumi.Input[int]] = None,
             ip_address: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if droplet_id is not None:
            _setter("droplet_id", droplet_id)
        if ip_address is not None:
            _setter("ip_address", ip_address)

    @property
    @pulumi.getter(name="dropletId")
    def droplet_id(self) -> Optional[pulumi.Input[int]]:
        """
        The ID of Droplet that the Floating IP will be assigned to.
        """
        return pulumi.get(self, "droplet_id")

    @droplet_id.setter
    def droplet_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "droplet_id", value)

    @property
    @pulumi.getter(name="ipAddress")
    def ip_address(self) -> Optional[pulumi.Input[str]]:
        """
        The Floating IP to assign to the Droplet.
        """
        return pulumi.get(self, "ip_address")

    @ip_address.setter
    def ip_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ip_address", value)


class FloatingIpAssignment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 droplet_id: Optional[pulumi.Input[int]] = None,
                 ip_address: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        > **Deprecated:** DigitalOcean Floating IPs have been renamed reserved IPs. This resource will be removed in a future release. Please use `ReservedIpAssignment` instead.

        Provides a resource for assigning an existing DigitalOcean Floating IP to a Droplet. This
        makes it easy to provision floating IP addresses that are not tied to the lifecycle of your
        Droplet.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        foobar_floating_ip = digitalocean.FloatingIp("foobarFloatingIp", region="sgp1")
        foobar_droplet = digitalocean.Droplet("foobarDroplet",
            size="s-1vcpu-1gb",
            image="ubuntu-18-04-x64",
            region="sgp1",
            ipv6=True,
            private_networking=True)
        foobar_floating_ip_assignment = digitalocean.FloatingIpAssignment("foobarFloatingIpAssignment",
            ip_address=foobar_floating_ip.ip_address,
            droplet_id=foobar_droplet.id)
        ```

        ## Import

        Floating IP assignments can be imported using the Floating IP itself and the `id` of the Droplet joined with a comma. For example

        ```sh
         $ pulumi import digitalocean:index/floatingIpAssignment:FloatingIpAssignment foobar 192.0.2.1,123456
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] droplet_id: The ID of Droplet that the Floating IP will be assigned to.
        :param pulumi.Input[str] ip_address: The Floating IP to assign to the Droplet.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: FloatingIpAssignmentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        > **Deprecated:** DigitalOcean Floating IPs have been renamed reserved IPs. This resource will be removed in a future release. Please use `ReservedIpAssignment` instead.

        Provides a resource for assigning an existing DigitalOcean Floating IP to a Droplet. This
        makes it easy to provision floating IP addresses that are not tied to the lifecycle of your
        Droplet.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        foobar_floating_ip = digitalocean.FloatingIp("foobarFloatingIp", region="sgp1")
        foobar_droplet = digitalocean.Droplet("foobarDroplet",
            size="s-1vcpu-1gb",
            image="ubuntu-18-04-x64",
            region="sgp1",
            ipv6=True,
            private_networking=True)
        foobar_floating_ip_assignment = digitalocean.FloatingIpAssignment("foobarFloatingIpAssignment",
            ip_address=foobar_floating_ip.ip_address,
            droplet_id=foobar_droplet.id)
        ```

        ## Import

        Floating IP assignments can be imported using the Floating IP itself and the `id` of the Droplet joined with a comma. For example

        ```sh
         $ pulumi import digitalocean:index/floatingIpAssignment:FloatingIpAssignment foobar 192.0.2.1,123456
        ```

        :param str resource_name: The name of the resource.
        :param FloatingIpAssignmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FloatingIpAssignmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            FloatingIpAssignmentArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 droplet_id: Optional[pulumi.Input[int]] = None,
                 ip_address: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FloatingIpAssignmentArgs.__new__(FloatingIpAssignmentArgs)

            if droplet_id is None and not opts.urn:
                raise TypeError("Missing required property 'droplet_id'")
            __props__.__dict__["droplet_id"] = droplet_id
            if ip_address is None and not opts.urn:
                raise TypeError("Missing required property 'ip_address'")
            __props__.__dict__["ip_address"] = ip_address
        super(FloatingIpAssignment, __self__).__init__(
            'digitalocean:index/floatingIpAssignment:FloatingIpAssignment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            droplet_id: Optional[pulumi.Input[int]] = None,
            ip_address: Optional[pulumi.Input[str]] = None) -> 'FloatingIpAssignment':
        """
        Get an existing FloatingIpAssignment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] droplet_id: The ID of Droplet that the Floating IP will be assigned to.
        :param pulumi.Input[str] ip_address: The Floating IP to assign to the Droplet.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FloatingIpAssignmentState.__new__(_FloatingIpAssignmentState)

        __props__.__dict__["droplet_id"] = droplet_id
        __props__.__dict__["ip_address"] = ip_address
        return FloatingIpAssignment(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="dropletId")
    def droplet_id(self) -> pulumi.Output[int]:
        """
        The ID of Droplet that the Floating IP will be assigned to.
        """
        return pulumi.get(self, "droplet_id")

    @property
    @pulumi.getter(name="ipAddress")
    def ip_address(self) -> pulumi.Output[str]:
        """
        The Floating IP to assign to the Droplet.
        """
        return pulumi.get(self, "ip_address")

