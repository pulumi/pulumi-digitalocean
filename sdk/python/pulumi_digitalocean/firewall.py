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
from ._inputs import *

__all__ = ['FirewallArgs', 'Firewall']

@pulumi.input_type
class FirewallArgs:
    def __init__(__self__, *,
                 droplet_ids: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.int]]]] = None,
                 inbound_rules: Optional[pulumi.Input[Sequence[pulumi.Input['FirewallInboundRuleArgs']]]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 outbound_rules: Optional[pulumi.Input[Sequence[pulumi.Input['FirewallOutboundRuleArgs']]]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None):
        """
        The set of arguments for constructing a Firewall resource.
        :param pulumi.Input[Sequence[pulumi.Input[builtins.int]]] droplet_ids: The list of the IDs of the Droplets assigned
               to the Firewall (max. 10). If you want to assign more droplets to the
               Firewall, add Tags to them and use the `tags` argument below.
        :param pulumi.Input[Sequence[pulumi.Input['FirewallInboundRuleArgs']]] inbound_rules: The inbound access rule block for the Firewall.
               The `inbound_rule` block is documented below.
        :param pulumi.Input[builtins.str] name: The Firewall name
        :param pulumi.Input[Sequence[pulumi.Input['FirewallOutboundRuleArgs']]] outbound_rules: The outbound access rule block for the Firewall.
               The `outbound_rule` block is documented below.
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] tags: The names of the Tags assigned to the Firewall (max. 5).
        """
        if droplet_ids is not None:
            pulumi.set(__self__, "droplet_ids", droplet_ids)
        if inbound_rules is not None:
            pulumi.set(__self__, "inbound_rules", inbound_rules)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if outbound_rules is not None:
            pulumi.set(__self__, "outbound_rules", outbound_rules)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="dropletIds")
    def droplet_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[builtins.int]]]]:
        """
        The list of the IDs of the Droplets assigned
        to the Firewall (max. 10). If you want to assign more droplets to the
        Firewall, add Tags to them and use the `tags` argument below.
        """
        return pulumi.get(self, "droplet_ids")

    @droplet_ids.setter
    def droplet_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.int]]]]):
        pulumi.set(self, "droplet_ids", value)

    @property
    @pulumi.getter(name="inboundRules")
    def inbound_rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['FirewallInboundRuleArgs']]]]:
        """
        The inbound access rule block for the Firewall.
        The `inbound_rule` block is documented below.
        """
        return pulumi.get(self, "inbound_rules")

    @inbound_rules.setter
    def inbound_rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['FirewallInboundRuleArgs']]]]):
        pulumi.set(self, "inbound_rules", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The Firewall name
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="outboundRules")
    def outbound_rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['FirewallOutboundRuleArgs']]]]:
        """
        The outbound access rule block for the Firewall.
        The `outbound_rule` block is documented below.
        """
        return pulumi.get(self, "outbound_rules")

    @outbound_rules.setter
    def outbound_rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['FirewallOutboundRuleArgs']]]]):
        pulumi.set(self, "outbound_rules", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]:
        """
        The names of the Tags assigned to the Firewall (max. 5).
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _FirewallState:
    def __init__(__self__, *,
                 created_at: Optional[pulumi.Input[builtins.str]] = None,
                 droplet_ids: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.int]]]] = None,
                 inbound_rules: Optional[pulumi.Input[Sequence[pulumi.Input['FirewallInboundRuleArgs']]]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 outbound_rules: Optional[pulumi.Input[Sequence[pulumi.Input['FirewallOutboundRuleArgs']]]] = None,
                 pending_changes: Optional[pulumi.Input[Sequence[pulumi.Input['FirewallPendingChangeArgs']]]] = None,
                 status: Optional[pulumi.Input[builtins.str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None):
        """
        Input properties used for looking up and filtering Firewall resources.
        :param pulumi.Input[builtins.str] created_at: A time value given in ISO8601 combined date and time format
               that represents when the Firewall was created.
        :param pulumi.Input[Sequence[pulumi.Input[builtins.int]]] droplet_ids: The list of the IDs of the Droplets assigned
               to the Firewall (max. 10). If you want to assign more droplets to the
               Firewall, add Tags to them and use the `tags` argument below.
        :param pulumi.Input[Sequence[pulumi.Input['FirewallInboundRuleArgs']]] inbound_rules: The inbound access rule block for the Firewall.
               The `inbound_rule` block is documented below.
        :param pulumi.Input[builtins.str] name: The Firewall name
        :param pulumi.Input[Sequence[pulumi.Input['FirewallOutboundRuleArgs']]] outbound_rules: The outbound access rule block for the Firewall.
               The `outbound_rule` block is documented below.
        :param pulumi.Input[Sequence[pulumi.Input['FirewallPendingChangeArgs']]] pending_changes: An list of object containing the fields, "droplet_id",
               "removing", and "status".  It is provided to detail exactly which Droplets
               are having their security policies updated.  When empty, all changes
               have been successfully applied.
        :param pulumi.Input[builtins.str] status: A status string indicating the current state of the Firewall.
               This can be "waiting", "succeeded", or "failed".
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] tags: The names of the Tags assigned to the Firewall (max. 5).
        """
        if created_at is not None:
            pulumi.set(__self__, "created_at", created_at)
        if droplet_ids is not None:
            pulumi.set(__self__, "droplet_ids", droplet_ids)
        if inbound_rules is not None:
            pulumi.set(__self__, "inbound_rules", inbound_rules)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if outbound_rules is not None:
            pulumi.set(__self__, "outbound_rules", outbound_rules)
        if pending_changes is not None:
            pulumi.set(__self__, "pending_changes", pending_changes)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        A time value given in ISO8601 combined date and time format
        that represents when the Firewall was created.
        """
        return pulumi.get(self, "created_at")

    @created_at.setter
    def created_at(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "created_at", value)

    @property
    @pulumi.getter(name="dropletIds")
    def droplet_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[builtins.int]]]]:
        """
        The list of the IDs of the Droplets assigned
        to the Firewall (max. 10). If you want to assign more droplets to the
        Firewall, add Tags to them and use the `tags` argument below.
        """
        return pulumi.get(self, "droplet_ids")

    @droplet_ids.setter
    def droplet_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.int]]]]):
        pulumi.set(self, "droplet_ids", value)

    @property
    @pulumi.getter(name="inboundRules")
    def inbound_rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['FirewallInboundRuleArgs']]]]:
        """
        The inbound access rule block for the Firewall.
        The `inbound_rule` block is documented below.
        """
        return pulumi.get(self, "inbound_rules")

    @inbound_rules.setter
    def inbound_rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['FirewallInboundRuleArgs']]]]):
        pulumi.set(self, "inbound_rules", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The Firewall name
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="outboundRules")
    def outbound_rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['FirewallOutboundRuleArgs']]]]:
        """
        The outbound access rule block for the Firewall.
        The `outbound_rule` block is documented below.
        """
        return pulumi.get(self, "outbound_rules")

    @outbound_rules.setter
    def outbound_rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['FirewallOutboundRuleArgs']]]]):
        pulumi.set(self, "outbound_rules", value)

    @property
    @pulumi.getter(name="pendingChanges")
    def pending_changes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['FirewallPendingChangeArgs']]]]:
        """
        An list of object containing the fields, "droplet_id",
        "removing", and "status".  It is provided to detail exactly which Droplets
        are having their security policies updated.  When empty, all changes
        have been successfully applied.
        """
        return pulumi.get(self, "pending_changes")

    @pending_changes.setter
    def pending_changes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['FirewallPendingChangeArgs']]]]):
        pulumi.set(self, "pending_changes", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        A status string indicating the current state of the Firewall.
        This can be "waiting", "succeeded", or "failed".
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]:
        """
        The names of the Tags assigned to the Firewall (max. 5).
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.type_token("digitalocean:index/firewall:Firewall")
class Firewall(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 droplet_ids: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.int]]]] = None,
                 inbound_rules: Optional[pulumi.Input[Sequence[pulumi.Input[Union['FirewallInboundRuleArgs', 'FirewallInboundRuleArgsDict']]]]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 outbound_rules: Optional[pulumi.Input[Sequence[pulumi.Input[Union['FirewallOutboundRuleArgs', 'FirewallOutboundRuleArgsDict']]]]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 __props__=None):
        """
        Provides a DigitalOcean Cloud Firewall resource. This can be used to create,
        modify, and delete Firewalls.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        web = digitalocean.Droplet("web",
            name="web-1",
            size=digitalocean.DropletSlug.DROPLET_S1_VCPU1_GB,
            image="ubuntu-18-04-x64",
            region=digitalocean.Region.NYC3)
        web_firewall = digitalocean.Firewall("web",
            name="only-22-80-and-443",
            droplet_ids=[web.id],
            inbound_rules=[
                {
                    "protocol": "tcp",
                    "port_range": "22",
                    "source_addresses": [
                        "192.168.1.0/24",
                        "2002:1:2::/48",
                    ],
                },
                {
                    "protocol": "tcp",
                    "port_range": "80",
                    "source_addresses": [
                        "0.0.0.0/0",
                        "::/0",
                    ],
                },
                {
                    "protocol": "tcp",
                    "port_range": "443",
                    "source_addresses": [
                        "0.0.0.0/0",
                        "::/0",
                    ],
                },
                {
                    "protocol": "icmp",
                    "source_addresses": [
                        "0.0.0.0/0",
                        "::/0",
                    ],
                },
            ],
            outbound_rules=[
                {
                    "protocol": "tcp",
                    "port_range": "53",
                    "destination_addresses": [
                        "0.0.0.0/0",
                        "::/0",
                    ],
                },
                {
                    "protocol": "udp",
                    "port_range": "53",
                    "destination_addresses": [
                        "0.0.0.0/0",
                        "::/0",
                    ],
                },
                {
                    "protocol": "icmp",
                    "destination_addresses": [
                        "0.0.0.0/0",
                        "::/0",
                    ],
                },
            ])
        ```

        ## Import

        Firewalls can be imported using the firewall `id`, e.g.

        ```sh
        $ pulumi import digitalocean:index/firewall:Firewall myfirewall b8ecd2ab-2267-4a5e-8692-cbf1d32583e3
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[builtins.int]]] droplet_ids: The list of the IDs of the Droplets assigned
               to the Firewall (max. 10). If you want to assign more droplets to the
               Firewall, add Tags to them and use the `tags` argument below.
        :param pulumi.Input[Sequence[pulumi.Input[Union['FirewallInboundRuleArgs', 'FirewallInboundRuleArgsDict']]]] inbound_rules: The inbound access rule block for the Firewall.
               The `inbound_rule` block is documented below.
        :param pulumi.Input[builtins.str] name: The Firewall name
        :param pulumi.Input[Sequence[pulumi.Input[Union['FirewallOutboundRuleArgs', 'FirewallOutboundRuleArgsDict']]]] outbound_rules: The outbound access rule block for the Firewall.
               The `outbound_rule` block is documented below.
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] tags: The names of the Tags assigned to the Firewall (max. 5).
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[FirewallArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a DigitalOcean Cloud Firewall resource. This can be used to create,
        modify, and delete Firewalls.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        web = digitalocean.Droplet("web",
            name="web-1",
            size=digitalocean.DropletSlug.DROPLET_S1_VCPU1_GB,
            image="ubuntu-18-04-x64",
            region=digitalocean.Region.NYC3)
        web_firewall = digitalocean.Firewall("web",
            name="only-22-80-and-443",
            droplet_ids=[web.id],
            inbound_rules=[
                {
                    "protocol": "tcp",
                    "port_range": "22",
                    "source_addresses": [
                        "192.168.1.0/24",
                        "2002:1:2::/48",
                    ],
                },
                {
                    "protocol": "tcp",
                    "port_range": "80",
                    "source_addresses": [
                        "0.0.0.0/0",
                        "::/0",
                    ],
                },
                {
                    "protocol": "tcp",
                    "port_range": "443",
                    "source_addresses": [
                        "0.0.0.0/0",
                        "::/0",
                    ],
                },
                {
                    "protocol": "icmp",
                    "source_addresses": [
                        "0.0.0.0/0",
                        "::/0",
                    ],
                },
            ],
            outbound_rules=[
                {
                    "protocol": "tcp",
                    "port_range": "53",
                    "destination_addresses": [
                        "0.0.0.0/0",
                        "::/0",
                    ],
                },
                {
                    "protocol": "udp",
                    "port_range": "53",
                    "destination_addresses": [
                        "0.0.0.0/0",
                        "::/0",
                    ],
                },
                {
                    "protocol": "icmp",
                    "destination_addresses": [
                        "0.0.0.0/0",
                        "::/0",
                    ],
                },
            ])
        ```

        ## Import

        Firewalls can be imported using the firewall `id`, e.g.

        ```sh
        $ pulumi import digitalocean:index/firewall:Firewall myfirewall b8ecd2ab-2267-4a5e-8692-cbf1d32583e3
        ```

        :param str resource_name: The name of the resource.
        :param FirewallArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FirewallArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 droplet_ids: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.int]]]] = None,
                 inbound_rules: Optional[pulumi.Input[Sequence[pulumi.Input[Union['FirewallInboundRuleArgs', 'FirewallInboundRuleArgsDict']]]]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 outbound_rules: Optional[pulumi.Input[Sequence[pulumi.Input[Union['FirewallOutboundRuleArgs', 'FirewallOutboundRuleArgsDict']]]]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FirewallArgs.__new__(FirewallArgs)

            __props__.__dict__["droplet_ids"] = droplet_ids
            __props__.__dict__["inbound_rules"] = inbound_rules
            __props__.__dict__["name"] = name
            __props__.__dict__["outbound_rules"] = outbound_rules
            __props__.__dict__["tags"] = tags
            __props__.__dict__["created_at"] = None
            __props__.__dict__["pending_changes"] = None
            __props__.__dict__["status"] = None
        super(Firewall, __self__).__init__(
            'digitalocean:index/firewall:Firewall',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            created_at: Optional[pulumi.Input[builtins.str]] = None,
            droplet_ids: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.int]]]] = None,
            inbound_rules: Optional[pulumi.Input[Sequence[pulumi.Input[Union['FirewallInboundRuleArgs', 'FirewallInboundRuleArgsDict']]]]] = None,
            name: Optional[pulumi.Input[builtins.str]] = None,
            outbound_rules: Optional[pulumi.Input[Sequence[pulumi.Input[Union['FirewallOutboundRuleArgs', 'FirewallOutboundRuleArgsDict']]]]] = None,
            pending_changes: Optional[pulumi.Input[Sequence[pulumi.Input[Union['FirewallPendingChangeArgs', 'FirewallPendingChangeArgsDict']]]]] = None,
            status: Optional[pulumi.Input[builtins.str]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None) -> 'Firewall':
        """
        Get an existing Firewall resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] created_at: A time value given in ISO8601 combined date and time format
               that represents when the Firewall was created.
        :param pulumi.Input[Sequence[pulumi.Input[builtins.int]]] droplet_ids: The list of the IDs of the Droplets assigned
               to the Firewall (max. 10). If you want to assign more droplets to the
               Firewall, add Tags to them and use the `tags` argument below.
        :param pulumi.Input[Sequence[pulumi.Input[Union['FirewallInboundRuleArgs', 'FirewallInboundRuleArgsDict']]]] inbound_rules: The inbound access rule block for the Firewall.
               The `inbound_rule` block is documented below.
        :param pulumi.Input[builtins.str] name: The Firewall name
        :param pulumi.Input[Sequence[pulumi.Input[Union['FirewallOutboundRuleArgs', 'FirewallOutboundRuleArgsDict']]]] outbound_rules: The outbound access rule block for the Firewall.
               The `outbound_rule` block is documented below.
        :param pulumi.Input[Sequence[pulumi.Input[Union['FirewallPendingChangeArgs', 'FirewallPendingChangeArgsDict']]]] pending_changes: An list of object containing the fields, "droplet_id",
               "removing", and "status".  It is provided to detail exactly which Droplets
               are having their security policies updated.  When empty, all changes
               have been successfully applied.
        :param pulumi.Input[builtins.str] status: A status string indicating the current state of the Firewall.
               This can be "waiting", "succeeded", or "failed".
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] tags: The names of the Tags assigned to the Firewall (max. 5).
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FirewallState.__new__(_FirewallState)

        __props__.__dict__["created_at"] = created_at
        __props__.__dict__["droplet_ids"] = droplet_ids
        __props__.__dict__["inbound_rules"] = inbound_rules
        __props__.__dict__["name"] = name
        __props__.__dict__["outbound_rules"] = outbound_rules
        __props__.__dict__["pending_changes"] = pending_changes
        __props__.__dict__["status"] = status
        __props__.__dict__["tags"] = tags
        return Firewall(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> pulumi.Output[builtins.str]:
        """
        A time value given in ISO8601 combined date and time format
        that represents when the Firewall was created.
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter(name="dropletIds")
    def droplet_ids(self) -> pulumi.Output[Optional[Sequence[builtins.int]]]:
        """
        The list of the IDs of the Droplets assigned
        to the Firewall (max. 10). If you want to assign more droplets to the
        Firewall, add Tags to them and use the `tags` argument below.
        """
        return pulumi.get(self, "droplet_ids")

    @property
    @pulumi.getter(name="inboundRules")
    def inbound_rules(self) -> pulumi.Output[Optional[Sequence['outputs.FirewallInboundRule']]]:
        """
        The inbound access rule block for the Firewall.
        The `inbound_rule` block is documented below.
        """
        return pulumi.get(self, "inbound_rules")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[builtins.str]:
        """
        The Firewall name
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="outboundRules")
    def outbound_rules(self) -> pulumi.Output[Optional[Sequence['outputs.FirewallOutboundRule']]]:
        """
        The outbound access rule block for the Firewall.
        The `outbound_rule` block is documented below.
        """
        return pulumi.get(self, "outbound_rules")

    @property
    @pulumi.getter(name="pendingChanges")
    def pending_changes(self) -> pulumi.Output[Sequence['outputs.FirewallPendingChange']]:
        """
        An list of object containing the fields, "droplet_id",
        "removing", and "status".  It is provided to detail exactly which Droplets
        are having their security policies updated.  When empty, all changes
        have been successfully applied.
        """
        return pulumi.get(self, "pending_changes")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[builtins.str]:
        """
        A status string indicating the current state of the Firewall.
        This can be "waiting", "succeeded", or "failed".
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Sequence[builtins.str]]]:
        """
        The names of the Tags assigned to the Firewall (max. 5).
        """
        return pulumi.get(self, "tags")

