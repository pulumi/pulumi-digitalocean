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

__all__ = [
    'GetCertificateResult',
    'AwaitableGetCertificateResult',
    'get_certificate',
    'get_certificate_output',
]

@pulumi.output_type
class GetCertificateResult:
    """
    A collection of values returned by getCertificate.
    """
    def __init__(__self__, domains=None, id=None, name=None, not_after=None, sha1_fingerprint=None, state=None, type=None, uuid=None):
        if domains and not isinstance(domains, list):
            raise TypeError("Expected argument 'domains' to be a list")
        pulumi.set(__self__, "domains", domains)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if not_after and not isinstance(not_after, str):
            raise TypeError("Expected argument 'not_after' to be a str")
        pulumi.set(__self__, "not_after", not_after)
        if sha1_fingerprint and not isinstance(sha1_fingerprint, str):
            raise TypeError("Expected argument 'sha1_fingerprint' to be a str")
        pulumi.set(__self__, "sha1_fingerprint", sha1_fingerprint)
        if state and not isinstance(state, str):
            raise TypeError("Expected argument 'state' to be a str")
        pulumi.set(__self__, "state", state)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)
        if uuid and not isinstance(uuid, str):
            raise TypeError("Expected argument 'uuid' to be a str")
        pulumi.set(__self__, "uuid", uuid)

    @property
    @pulumi.getter
    def domains(self) -> Sequence[builtins.str]:
        """
        Domains for which the certificate was issued.
        """
        return pulumi.get(self, "domains")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> builtins.str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="notAfter")
    def not_after(self) -> builtins.str:
        """
        The expiration date and time of the certificate.
        """
        return pulumi.get(self, "not_after")

    @property
    @pulumi.getter(name="sha1Fingerprint")
    def sha1_fingerprint(self) -> builtins.str:
        """
        The SHA1 fingerprint of the certificate.
        """
        return pulumi.get(self, "sha1_fingerprint")

    @property
    @pulumi.getter
    def state(self) -> builtins.str:
        """
        the current state of the certificate.
        """
        return pulumi.get(self, "state")

    @property
    @pulumi.getter
    def type(self) -> builtins.str:
        """
        The type of the certificate.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def uuid(self) -> builtins.str:
        """
        The ID of the certificate.
        """
        return pulumi.get(self, "uuid")


class AwaitableGetCertificateResult(GetCertificateResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCertificateResult(
            domains=self.domains,
            id=self.id,
            name=self.name,
            not_after=self.not_after,
            sha1_fingerprint=self.sha1_fingerprint,
            state=self.state,
            type=self.type,
            uuid=self.uuid)


def get_certificate(name: Optional[builtins.str] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCertificateResult:
    """
    Get information on a certificate. This data source provides the name, type, state,
    domains, expiry date, and the sha1 fingerprint as configured on your DigitalOcean account.
    This is useful if the certificate in question is not managed by this provider or you need to utilize
    any of the certificates data.

    An error is triggered if the provided certificate name does not exist.

    ## Example Usage

    Get the certificate:

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    example = digitalocean.get_certificate(name="example")
    ```


    :param builtins.str name: The name of certificate.
    """
    __args__ = dict()
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('digitalocean:index/getCertificate:getCertificate', __args__, opts=opts, typ=GetCertificateResult).value

    return AwaitableGetCertificateResult(
        domains=pulumi.get(__ret__, 'domains'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        not_after=pulumi.get(__ret__, 'not_after'),
        sha1_fingerprint=pulumi.get(__ret__, 'sha1_fingerprint'),
        state=pulumi.get(__ret__, 'state'),
        type=pulumi.get(__ret__, 'type'),
        uuid=pulumi.get(__ret__, 'uuid'))
def get_certificate_output(name: Optional[pulumi.Input[builtins.str]] = None,
                           opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetCertificateResult]:
    """
    Get information on a certificate. This data source provides the name, type, state,
    domains, expiry date, and the sha1 fingerprint as configured on your DigitalOcean account.
    This is useful if the certificate in question is not managed by this provider or you need to utilize
    any of the certificates data.

    An error is triggered if the provided certificate name does not exist.

    ## Example Usage

    Get the certificate:

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    example = digitalocean.get_certificate(name="example")
    ```


    :param builtins.str name: The name of certificate.
    """
    __args__ = dict()
    __args__['name'] = name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('digitalocean:index/getCertificate:getCertificate', __args__, opts=opts, typ=GetCertificateResult)
    return __ret__.apply(lambda __response__: GetCertificateResult(
        domains=pulumi.get(__response__, 'domains'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        not_after=pulumi.get(__response__, 'not_after'),
        sha1_fingerprint=pulumi.get(__response__, 'sha1_fingerprint'),
        state=pulumi.get(__response__, 'state'),
        type=pulumi.get(__response__, 'type'),
        uuid=pulumi.get(__response__, 'uuid')))
