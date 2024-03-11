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
    'GetRecordResult',
    'AwaitableGetRecordResult',
    'get_record',
    'get_record_output',
]

@pulumi.output_type
class GetRecordResult:
    """
    A collection of values returned by getRecord.
    """
    def __init__(__self__, data=None, domain=None, flags=None, id=None, name=None, port=None, priority=None, tag=None, ttl=None, type=None, weight=None):
        if data and not isinstance(data, str):
            raise TypeError("Expected argument 'data' to be a str")
        pulumi.set(__self__, "data", data)
        if domain and not isinstance(domain, str):
            raise TypeError("Expected argument 'domain' to be a str")
        pulumi.set(__self__, "domain", domain)
        if flags and not isinstance(flags, int):
            raise TypeError("Expected argument 'flags' to be a int")
        pulumi.set(__self__, "flags", flags)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if port and not isinstance(port, int):
            raise TypeError("Expected argument 'port' to be a int")
        pulumi.set(__self__, "port", port)
        if priority and not isinstance(priority, int):
            raise TypeError("Expected argument 'priority' to be a int")
        pulumi.set(__self__, "priority", priority)
        if tag and not isinstance(tag, str):
            raise TypeError("Expected argument 'tag' to be a str")
        pulumi.set(__self__, "tag", tag)
        if ttl and not isinstance(ttl, int):
            raise TypeError("Expected argument 'ttl' to be a int")
        pulumi.set(__self__, "ttl", ttl)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)
        if weight and not isinstance(weight, int):
            raise TypeError("Expected argument 'weight' to be a int")
        pulumi.set(__self__, "weight", weight)

    @property
    @pulumi.getter
    def data(self) -> str:
        """
        Variable data depending on record type. For example, the "data" value for an A record would be the IPv4 address to which the domain will be mapped. For a CAA record, it would contain the domain name of the CA being granted permission to issue certificates.
        """
        return pulumi.get(self, "data")

    @property
    @pulumi.getter
    def domain(self) -> str:
        return pulumi.get(self, "domain")

    @property
    @pulumi.getter
    def flags(self) -> int:
        """
        An unsigned integer between 0-255 used for CAA records.
        """
        return pulumi.get(self, "flags")

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
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def port(self) -> int:
        """
        The port for SRV records.
        """
        return pulumi.get(self, "port")

    @property
    @pulumi.getter
    def priority(self) -> int:
        """
        The priority for SRV and MX records.
        """
        return pulumi.get(self, "priority")

    @property
    @pulumi.getter
    def tag(self) -> str:
        """
        The parameter tag for CAA records.
        """
        return pulumi.get(self, "tag")

    @property
    @pulumi.getter
    def ttl(self) -> int:
        """
        This value is the time to live for the record, in seconds. This defines the time frame that clients can cache queried information before a refresh should be requested.
        """
        return pulumi.get(self, "ttl")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        The type of the DNS record.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def weight(self) -> int:
        """
        The weight for SRV records.
        """
        return pulumi.get(self, "weight")


class AwaitableGetRecordResult(GetRecordResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRecordResult(
            data=self.data,
            domain=self.domain,
            flags=self.flags,
            id=self.id,
            name=self.name,
            port=self.port,
            priority=self.priority,
            tag=self.tag,
            ttl=self.ttl,
            type=self.type,
            weight=self.weight)


def get_record(domain: Optional[str] = None,
               name: Optional[str] = None,
               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRecordResult:
    """
    Get information on a DNS record. This data source provides the name, TTL, and zone
    file as configured on your DigitalOcean account. This is useful if the record
    in question is not managed by the provider.

    An error is triggered if the provided domain name or record are not managed with
    your DigitalOcean account.

    ## Example Usage

    Get data from a DNS record:

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    example = digitalocean.get_record(domain="example.com",
        name="test")
    pulumi.export("recordType", example.type)
    pulumi.export("recordTtl", example.ttl)
    ```
    <!--End PulumiCodeChooser -->


    :param str domain: The domain name of the record.
    :param str name: The name of the record.
    """
    __args__ = dict()
    __args__['domain'] = domain
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('digitalocean:index/getRecord:getRecord', __args__, opts=opts, typ=GetRecordResult).value

    return AwaitableGetRecordResult(
        data=pulumi.get(__ret__, 'data'),
        domain=pulumi.get(__ret__, 'domain'),
        flags=pulumi.get(__ret__, 'flags'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        port=pulumi.get(__ret__, 'port'),
        priority=pulumi.get(__ret__, 'priority'),
        tag=pulumi.get(__ret__, 'tag'),
        ttl=pulumi.get(__ret__, 'ttl'),
        type=pulumi.get(__ret__, 'type'),
        weight=pulumi.get(__ret__, 'weight'))


@_utilities.lift_output_func(get_record)
def get_record_output(domain: Optional[pulumi.Input[str]] = None,
                      name: Optional[pulumi.Input[str]] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetRecordResult]:
    """
    Get information on a DNS record. This data source provides the name, TTL, and zone
    file as configured on your DigitalOcean account. This is useful if the record
    in question is not managed by the provider.

    An error is triggered if the provided domain name or record are not managed with
    your DigitalOcean account.

    ## Example Usage

    Get data from a DNS record:

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    example = digitalocean.get_record(domain="example.com",
        name="test")
    pulumi.export("recordType", example.type)
    pulumi.export("recordTtl", example.ttl)
    ```
    <!--End PulumiCodeChooser -->


    :param str domain: The domain name of the record.
    :param str name: The name of the record.
    """
    ...
