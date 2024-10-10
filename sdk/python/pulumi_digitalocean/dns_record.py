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
from ._enums import *

__all__ = ['DnsRecordArgs', 'DnsRecord']

@pulumi.input_type
class DnsRecordArgs:
    def __init__(__self__, *,
                 domain: pulumi.Input[str],
                 type: pulumi.Input[Union[str, 'RecordType']],
                 value: pulumi.Input[str],
                 flags: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 port: Optional[pulumi.Input[int]] = None,
                 priority: Optional[pulumi.Input[int]] = None,
                 tag: Optional[pulumi.Input[str]] = None,
                 ttl: Optional[pulumi.Input[int]] = None,
                 weight: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a DnsRecord resource.
        :param pulumi.Input[str] domain: The domain to add the record to.
        :param pulumi.Input[Union[str, 'RecordType']] type: The type of record. Must be one of `A`, `AAAA`, `CAA`, `CNAME`, `MX`, `NS`, `TXT`, or `SRV`.
        :param pulumi.Input[str] value: The value of the record.
        :param pulumi.Input[int] flags: The flags of the record. Only valid when type is `CAA`. Must be between 0 and 255.
        :param pulumi.Input[str] name: The hostname of the record. Use `@` for records on domain's name itself.
        :param pulumi.Input[int] port: The port of the record. Only valid when type is `SRV`.  Must be between 1 and 65535.
        :param pulumi.Input[int] priority: The priority of the record. Only valid when type is `MX` or `SRV`. Must be between 0 and 65535.
        :param pulumi.Input[str] tag: The tag of the record. Only valid when type is `CAA`. Must be one of `issue`, `issuewild`, or `iodef`.
        :param pulumi.Input[int] ttl: The time to live for the record, in seconds. Must be at least 0. Defaults to 1800.
        :param pulumi.Input[int] weight: The weight of the record. Only valid when type is `SRV`.  Must be between 0 and 65535.
        """
        pulumi.set(__self__, "domain", domain)
        pulumi.set(__self__, "type", type)
        pulumi.set(__self__, "value", value)
        if flags is not None:
            pulumi.set(__self__, "flags", flags)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if port is not None:
            pulumi.set(__self__, "port", port)
        if priority is not None:
            pulumi.set(__self__, "priority", priority)
        if tag is not None:
            pulumi.set(__self__, "tag", tag)
        if ttl is not None:
            pulumi.set(__self__, "ttl", ttl)
        if weight is not None:
            pulumi.set(__self__, "weight", weight)

    @property
    @pulumi.getter
    def domain(self) -> pulumi.Input[str]:
        """
        The domain to add the record to.
        """
        return pulumi.get(self, "domain")

    @domain.setter
    def domain(self, value: pulumi.Input[str]):
        pulumi.set(self, "domain", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[Union[str, 'RecordType']]:
        """
        The type of record. Must be one of `A`, `AAAA`, `CAA`, `CNAME`, `MX`, `NS`, `TXT`, or `SRV`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[Union[str, 'RecordType']]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def value(self) -> pulumi.Input[str]:
        """
        The value of the record.
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: pulumi.Input[str]):
        pulumi.set(self, "value", value)

    @property
    @pulumi.getter
    def flags(self) -> Optional[pulumi.Input[int]]:
        """
        The flags of the record. Only valid when type is `CAA`. Must be between 0 and 255.
        """
        return pulumi.get(self, "flags")

    @flags.setter
    def flags(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "flags", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The hostname of the record. Use `@` for records on domain's name itself.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def port(self) -> Optional[pulumi.Input[int]]:
        """
        The port of the record. Only valid when type is `SRV`.  Must be between 1 and 65535.
        """
        return pulumi.get(self, "port")

    @port.setter
    def port(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "port", value)

    @property
    @pulumi.getter
    def priority(self) -> Optional[pulumi.Input[int]]:
        """
        The priority of the record. Only valid when type is `MX` or `SRV`. Must be between 0 and 65535.
        """
        return pulumi.get(self, "priority")

    @priority.setter
    def priority(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "priority", value)

    @property
    @pulumi.getter
    def tag(self) -> Optional[pulumi.Input[str]]:
        """
        The tag of the record. Only valid when type is `CAA`. Must be one of `issue`, `issuewild`, or `iodef`.
        """
        return pulumi.get(self, "tag")

    @tag.setter
    def tag(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tag", value)

    @property
    @pulumi.getter
    def ttl(self) -> Optional[pulumi.Input[int]]:
        """
        The time to live for the record, in seconds. Must be at least 0. Defaults to 1800.
        """
        return pulumi.get(self, "ttl")

    @ttl.setter
    def ttl(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "ttl", value)

    @property
    @pulumi.getter
    def weight(self) -> Optional[pulumi.Input[int]]:
        """
        The weight of the record. Only valid when type is `SRV`.  Must be between 0 and 65535.
        """
        return pulumi.get(self, "weight")

    @weight.setter
    def weight(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "weight", value)


@pulumi.input_type
class _DnsRecordState:
    def __init__(__self__, *,
                 domain: Optional[pulumi.Input[str]] = None,
                 flags: Optional[pulumi.Input[int]] = None,
                 fqdn: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 port: Optional[pulumi.Input[int]] = None,
                 priority: Optional[pulumi.Input[int]] = None,
                 tag: Optional[pulumi.Input[str]] = None,
                 ttl: Optional[pulumi.Input[int]] = None,
                 type: Optional[pulumi.Input[Union[str, 'RecordType']]] = None,
                 value: Optional[pulumi.Input[str]] = None,
                 weight: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering DnsRecord resources.
        :param pulumi.Input[str] domain: The domain to add the record to.
        :param pulumi.Input[int] flags: The flags of the record. Only valid when type is `CAA`. Must be between 0 and 255.
        :param pulumi.Input[str] fqdn: The FQDN of the record
        :param pulumi.Input[str] name: The hostname of the record. Use `@` for records on domain's name itself.
        :param pulumi.Input[int] port: The port of the record. Only valid when type is `SRV`.  Must be between 1 and 65535.
        :param pulumi.Input[int] priority: The priority of the record. Only valid when type is `MX` or `SRV`. Must be between 0 and 65535.
        :param pulumi.Input[str] tag: The tag of the record. Only valid when type is `CAA`. Must be one of `issue`, `issuewild`, or `iodef`.
        :param pulumi.Input[int] ttl: The time to live for the record, in seconds. Must be at least 0. Defaults to 1800.
        :param pulumi.Input[Union[str, 'RecordType']] type: The type of record. Must be one of `A`, `AAAA`, `CAA`, `CNAME`, `MX`, `NS`, `TXT`, or `SRV`.
        :param pulumi.Input[str] value: The value of the record.
        :param pulumi.Input[int] weight: The weight of the record. Only valid when type is `SRV`.  Must be between 0 and 65535.
        """
        if domain is not None:
            pulumi.set(__self__, "domain", domain)
        if flags is not None:
            pulumi.set(__self__, "flags", flags)
        if fqdn is not None:
            pulumi.set(__self__, "fqdn", fqdn)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if port is not None:
            pulumi.set(__self__, "port", port)
        if priority is not None:
            pulumi.set(__self__, "priority", priority)
        if tag is not None:
            pulumi.set(__self__, "tag", tag)
        if ttl is not None:
            pulumi.set(__self__, "ttl", ttl)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if value is not None:
            pulumi.set(__self__, "value", value)
        if weight is not None:
            pulumi.set(__self__, "weight", weight)

    @property
    @pulumi.getter
    def domain(self) -> Optional[pulumi.Input[str]]:
        """
        The domain to add the record to.
        """
        return pulumi.get(self, "domain")

    @domain.setter
    def domain(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "domain", value)

    @property
    @pulumi.getter
    def flags(self) -> Optional[pulumi.Input[int]]:
        """
        The flags of the record. Only valid when type is `CAA`. Must be between 0 and 255.
        """
        return pulumi.get(self, "flags")

    @flags.setter
    def flags(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "flags", value)

    @property
    @pulumi.getter
    def fqdn(self) -> Optional[pulumi.Input[str]]:
        """
        The FQDN of the record
        """
        return pulumi.get(self, "fqdn")

    @fqdn.setter
    def fqdn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "fqdn", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The hostname of the record. Use `@` for records on domain's name itself.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def port(self) -> Optional[pulumi.Input[int]]:
        """
        The port of the record. Only valid when type is `SRV`.  Must be between 1 and 65535.
        """
        return pulumi.get(self, "port")

    @port.setter
    def port(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "port", value)

    @property
    @pulumi.getter
    def priority(self) -> Optional[pulumi.Input[int]]:
        """
        The priority of the record. Only valid when type is `MX` or `SRV`. Must be between 0 and 65535.
        """
        return pulumi.get(self, "priority")

    @priority.setter
    def priority(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "priority", value)

    @property
    @pulumi.getter
    def tag(self) -> Optional[pulumi.Input[str]]:
        """
        The tag of the record. Only valid when type is `CAA`. Must be one of `issue`, `issuewild`, or `iodef`.
        """
        return pulumi.get(self, "tag")

    @tag.setter
    def tag(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tag", value)

    @property
    @pulumi.getter
    def ttl(self) -> Optional[pulumi.Input[int]]:
        """
        The time to live for the record, in seconds. Must be at least 0. Defaults to 1800.
        """
        return pulumi.get(self, "ttl")

    @ttl.setter
    def ttl(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "ttl", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[Union[str, 'RecordType']]]:
        """
        The type of record. Must be one of `A`, `AAAA`, `CAA`, `CNAME`, `MX`, `NS`, `TXT`, or `SRV`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[Union[str, 'RecordType']]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def value(self) -> Optional[pulumi.Input[str]]:
        """
        The value of the record.
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "value", value)

    @property
    @pulumi.getter
    def weight(self) -> Optional[pulumi.Input[int]]:
        """
        The weight of the record. Only valid when type is `SRV`.  Must be between 0 and 65535.
        """
        return pulumi.get(self, "weight")

    @weight.setter
    def weight(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "weight", value)


class DnsRecord(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 domain: Optional[pulumi.Input[str]] = None,
                 flags: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 port: Optional[pulumi.Input[int]] = None,
                 priority: Optional[pulumi.Input[int]] = None,
                 tag: Optional[pulumi.Input[str]] = None,
                 ttl: Optional[pulumi.Input[int]] = None,
                 type: Optional[pulumi.Input[Union[str, 'RecordType']]] = None,
                 value: Optional[pulumi.Input[str]] = None,
                 weight: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        Provides a DigitalOcean DNS record resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        default = digitalocean.Domain("default", name="example.com")
        # Add an A record to the domain for www.example.com.
        www = digitalocean.DnsRecord("www",
            domain=default.id,
            type=digitalocean.RecordType.A,
            name="www",
            value="192.168.0.11")
        # Add a MX record for the example.com domain itself.
        mx = digitalocean.DnsRecord("mx",
            domain=default.id,
            type=digitalocean.RecordType.MX,
            name="@",
            priority=10,
            value="mail.example.com.")
        pulumi.export("wwwFqdn", www.fqdn)
        pulumi.export("mxFqdn", mx.fqdn)
        ```

        ## Import

        Records can be imported using the domain name and record `id` when joined with a comma. See the following example:

        ```sh
        $ pulumi import digitalocean:index/dnsRecord:DnsRecord example_record example.com,12345678
        ```

        ~>  You find the `id` of the records [using the DigitalOcean API](https://docs.digitalocean.com/reference/api/api-reference/#operation/domains_list_records) or CLI. Run the follow command to list the IDs for all DNS records on a domain: `doctl compute domain records list <domain.name>`

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] domain: The domain to add the record to.
        :param pulumi.Input[int] flags: The flags of the record. Only valid when type is `CAA`. Must be between 0 and 255.
        :param pulumi.Input[str] name: The hostname of the record. Use `@` for records on domain's name itself.
        :param pulumi.Input[int] port: The port of the record. Only valid when type is `SRV`.  Must be between 1 and 65535.
        :param pulumi.Input[int] priority: The priority of the record. Only valid when type is `MX` or `SRV`. Must be between 0 and 65535.
        :param pulumi.Input[str] tag: The tag of the record. Only valid when type is `CAA`. Must be one of `issue`, `issuewild`, or `iodef`.
        :param pulumi.Input[int] ttl: The time to live for the record, in seconds. Must be at least 0. Defaults to 1800.
        :param pulumi.Input[Union[str, 'RecordType']] type: The type of record. Must be one of `A`, `AAAA`, `CAA`, `CNAME`, `MX`, `NS`, `TXT`, or `SRV`.
        :param pulumi.Input[str] value: The value of the record.
        :param pulumi.Input[int] weight: The weight of the record. Only valid when type is `SRV`.  Must be between 0 and 65535.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DnsRecordArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a DigitalOcean DNS record resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        default = digitalocean.Domain("default", name="example.com")
        # Add an A record to the domain for www.example.com.
        www = digitalocean.DnsRecord("www",
            domain=default.id,
            type=digitalocean.RecordType.A,
            name="www",
            value="192.168.0.11")
        # Add a MX record for the example.com domain itself.
        mx = digitalocean.DnsRecord("mx",
            domain=default.id,
            type=digitalocean.RecordType.MX,
            name="@",
            priority=10,
            value="mail.example.com.")
        pulumi.export("wwwFqdn", www.fqdn)
        pulumi.export("mxFqdn", mx.fqdn)
        ```

        ## Import

        Records can be imported using the domain name and record `id` when joined with a comma. See the following example:

        ```sh
        $ pulumi import digitalocean:index/dnsRecord:DnsRecord example_record example.com,12345678
        ```

        ~>  You find the `id` of the records [using the DigitalOcean API](https://docs.digitalocean.com/reference/api/api-reference/#operation/domains_list_records) or CLI. Run the follow command to list the IDs for all DNS records on a domain: `doctl compute domain records list <domain.name>`

        :param str resource_name: The name of the resource.
        :param DnsRecordArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DnsRecordArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 domain: Optional[pulumi.Input[str]] = None,
                 flags: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 port: Optional[pulumi.Input[int]] = None,
                 priority: Optional[pulumi.Input[int]] = None,
                 tag: Optional[pulumi.Input[str]] = None,
                 ttl: Optional[pulumi.Input[int]] = None,
                 type: Optional[pulumi.Input[Union[str, 'RecordType']]] = None,
                 value: Optional[pulumi.Input[str]] = None,
                 weight: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DnsRecordArgs.__new__(DnsRecordArgs)

            if domain is None and not opts.urn:
                raise TypeError("Missing required property 'domain'")
            __props__.__dict__["domain"] = domain
            __props__.__dict__["flags"] = flags
            __props__.__dict__["name"] = name
            __props__.__dict__["port"] = port
            __props__.__dict__["priority"] = priority
            __props__.__dict__["tag"] = tag
            __props__.__dict__["ttl"] = ttl
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
            if value is None and not opts.urn:
                raise TypeError("Missing required property 'value'")
            __props__.__dict__["value"] = value
            __props__.__dict__["weight"] = weight
            __props__.__dict__["fqdn"] = None
        super(DnsRecord, __self__).__init__(
            'digitalocean:index/dnsRecord:DnsRecord',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            domain: Optional[pulumi.Input[str]] = None,
            flags: Optional[pulumi.Input[int]] = None,
            fqdn: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            port: Optional[pulumi.Input[int]] = None,
            priority: Optional[pulumi.Input[int]] = None,
            tag: Optional[pulumi.Input[str]] = None,
            ttl: Optional[pulumi.Input[int]] = None,
            type: Optional[pulumi.Input[Union[str, 'RecordType']]] = None,
            value: Optional[pulumi.Input[str]] = None,
            weight: Optional[pulumi.Input[int]] = None) -> 'DnsRecord':
        """
        Get an existing DnsRecord resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] domain: The domain to add the record to.
        :param pulumi.Input[int] flags: The flags of the record. Only valid when type is `CAA`. Must be between 0 and 255.
        :param pulumi.Input[str] fqdn: The FQDN of the record
        :param pulumi.Input[str] name: The hostname of the record. Use `@` for records on domain's name itself.
        :param pulumi.Input[int] port: The port of the record. Only valid when type is `SRV`.  Must be between 1 and 65535.
        :param pulumi.Input[int] priority: The priority of the record. Only valid when type is `MX` or `SRV`. Must be between 0 and 65535.
        :param pulumi.Input[str] tag: The tag of the record. Only valid when type is `CAA`. Must be one of `issue`, `issuewild`, or `iodef`.
        :param pulumi.Input[int] ttl: The time to live for the record, in seconds. Must be at least 0. Defaults to 1800.
        :param pulumi.Input[Union[str, 'RecordType']] type: The type of record. Must be one of `A`, `AAAA`, `CAA`, `CNAME`, `MX`, `NS`, `TXT`, or `SRV`.
        :param pulumi.Input[str] value: The value of the record.
        :param pulumi.Input[int] weight: The weight of the record. Only valid when type is `SRV`.  Must be between 0 and 65535.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DnsRecordState.__new__(_DnsRecordState)

        __props__.__dict__["domain"] = domain
        __props__.__dict__["flags"] = flags
        __props__.__dict__["fqdn"] = fqdn
        __props__.__dict__["name"] = name
        __props__.__dict__["port"] = port
        __props__.__dict__["priority"] = priority
        __props__.__dict__["tag"] = tag
        __props__.__dict__["ttl"] = ttl
        __props__.__dict__["type"] = type
        __props__.__dict__["value"] = value
        __props__.__dict__["weight"] = weight
        return DnsRecord(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def domain(self) -> pulumi.Output[str]:
        """
        The domain to add the record to.
        """
        return pulumi.get(self, "domain")

    @property
    @pulumi.getter
    def flags(self) -> pulumi.Output[Optional[int]]:
        """
        The flags of the record. Only valid when type is `CAA`. Must be between 0 and 255.
        """
        return pulumi.get(self, "flags")

    @property
    @pulumi.getter
    def fqdn(self) -> pulumi.Output[str]:
        """
        The FQDN of the record
        """
        return pulumi.get(self, "fqdn")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The hostname of the record. Use `@` for records on domain's name itself.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def port(self) -> pulumi.Output[Optional[int]]:
        """
        The port of the record. Only valid when type is `SRV`.  Must be between 1 and 65535.
        """
        return pulumi.get(self, "port")

    @property
    @pulumi.getter
    def priority(self) -> pulumi.Output[Optional[int]]:
        """
        The priority of the record. Only valid when type is `MX` or `SRV`. Must be between 0 and 65535.
        """
        return pulumi.get(self, "priority")

    @property
    @pulumi.getter
    def tag(self) -> pulumi.Output[Optional[str]]:
        """
        The tag of the record. Only valid when type is `CAA`. Must be one of `issue`, `issuewild`, or `iodef`.
        """
        return pulumi.get(self, "tag")

    @property
    @pulumi.getter
    def ttl(self) -> pulumi.Output[int]:
        """
        The time to live for the record, in seconds. Must be at least 0. Defaults to 1800.
        """
        return pulumi.get(self, "ttl")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        The type of record. Must be one of `A`, `AAAA`, `CAA`, `CNAME`, `MX`, `NS`, `TXT`, or `SRV`.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def value(self) -> pulumi.Output[str]:
        """
        The value of the record.
        """
        return pulumi.get(self, "value")

    @property
    @pulumi.getter
    def weight(self) -> pulumi.Output[Optional[int]]:
        """
        The weight of the record. Only valid when type is `SRV`.  Must be between 0 and 65535.
        """
        return pulumi.get(self, "weight")

