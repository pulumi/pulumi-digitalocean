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

__all__ = ['CdnArgs', 'Cdn']

@pulumi.input_type
class CdnArgs:
    def __init__(__self__, *,
                 origin: pulumi.Input[builtins.str],
                 certificate_id: Optional[pulumi.Input[builtins.str]] = None,
                 certificate_name: Optional[pulumi.Input[builtins.str]] = None,
                 custom_domain: Optional[pulumi.Input[builtins.str]] = None,
                 ttl: Optional[pulumi.Input[builtins.int]] = None):
        """
        The set of arguments for constructing a Cdn resource.
        :param pulumi.Input[builtins.str] origin: The fully qualified domain name, (FQDN) for a Space.
        :param pulumi.Input[builtins.str] certificate_id: **Deprecated** The ID of a DigitalOcean managed TLS certificate used for SSL when a custom subdomain is provided.
        :param pulumi.Input[builtins.str] certificate_name: The unique name of a DigitalOcean managed TLS certificate used for SSL when a custom subdomain is provided.
        :param pulumi.Input[builtins.str] custom_domain: The fully qualified domain name (FQDN) of the custom subdomain used with the CDN Endpoint.
        :param pulumi.Input[builtins.int] ttl: The time to live for the CDN Endpoint, in seconds. Default is 3600 seconds.
        """
        pulumi.set(__self__, "origin", origin)
        if certificate_id is not None:
            warnings.warn("""Certificate IDs may change, for example when a Let's Encrypt certificate is auto-renewed. Please specify 'certificate_name' instead.""", DeprecationWarning)
            pulumi.log.warn("""certificate_id is deprecated: Certificate IDs may change, for example when a Let's Encrypt certificate is auto-renewed. Please specify 'certificate_name' instead.""")
        if certificate_id is not None:
            pulumi.set(__self__, "certificate_id", certificate_id)
        if certificate_name is not None:
            pulumi.set(__self__, "certificate_name", certificate_name)
        if custom_domain is not None:
            pulumi.set(__self__, "custom_domain", custom_domain)
        if ttl is not None:
            pulumi.set(__self__, "ttl", ttl)

    @property
    @pulumi.getter
    def origin(self) -> pulumi.Input[builtins.str]:
        """
        The fully qualified domain name, (FQDN) for a Space.
        """
        return pulumi.get(self, "origin")

    @origin.setter
    def origin(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "origin", value)

    @property
    @pulumi.getter(name="certificateId")
    @_utilities.deprecated("""Certificate IDs may change, for example when a Let's Encrypt certificate is auto-renewed. Please specify 'certificate_name' instead.""")
    def certificate_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        **Deprecated** The ID of a DigitalOcean managed TLS certificate used for SSL when a custom subdomain is provided.
        """
        return pulumi.get(self, "certificate_id")

    @certificate_id.setter
    def certificate_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "certificate_id", value)

    @property
    @pulumi.getter(name="certificateName")
    def certificate_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The unique name of a DigitalOcean managed TLS certificate used for SSL when a custom subdomain is provided.
        """
        return pulumi.get(self, "certificate_name")

    @certificate_name.setter
    def certificate_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "certificate_name", value)

    @property
    @pulumi.getter(name="customDomain")
    def custom_domain(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The fully qualified domain name (FQDN) of the custom subdomain used with the CDN Endpoint.
        """
        return pulumi.get(self, "custom_domain")

    @custom_domain.setter
    def custom_domain(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "custom_domain", value)

    @property
    @pulumi.getter
    def ttl(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        The time to live for the CDN Endpoint, in seconds. Default is 3600 seconds.
        """
        return pulumi.get(self, "ttl")

    @ttl.setter
    def ttl(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "ttl", value)


@pulumi.input_type
class _CdnState:
    def __init__(__self__, *,
                 certificate_id: Optional[pulumi.Input[builtins.str]] = None,
                 certificate_name: Optional[pulumi.Input[builtins.str]] = None,
                 created_at: Optional[pulumi.Input[builtins.str]] = None,
                 custom_domain: Optional[pulumi.Input[builtins.str]] = None,
                 endpoint: Optional[pulumi.Input[builtins.str]] = None,
                 origin: Optional[pulumi.Input[builtins.str]] = None,
                 ttl: Optional[pulumi.Input[builtins.int]] = None):
        """
        Input properties used for looking up and filtering Cdn resources.
        :param pulumi.Input[builtins.str] certificate_id: **Deprecated** The ID of a DigitalOcean managed TLS certificate used for SSL when a custom subdomain is provided.
        :param pulumi.Input[builtins.str] certificate_name: The unique name of a DigitalOcean managed TLS certificate used for SSL when a custom subdomain is provided.
        :param pulumi.Input[builtins.str] created_at: The date and time when the CDN Endpoint was created.
        :param pulumi.Input[builtins.str] custom_domain: The fully qualified domain name (FQDN) of the custom subdomain used with the CDN Endpoint.
        :param pulumi.Input[builtins.str] endpoint: The fully qualified domain name (FQDN) from which the CDN-backed content is served.
        :param pulumi.Input[builtins.str] origin: The fully qualified domain name, (FQDN) for a Space.
        :param pulumi.Input[builtins.int] ttl: The time to live for the CDN Endpoint, in seconds. Default is 3600 seconds.
        """
        if certificate_id is not None:
            warnings.warn("""Certificate IDs may change, for example when a Let's Encrypt certificate is auto-renewed. Please specify 'certificate_name' instead.""", DeprecationWarning)
            pulumi.log.warn("""certificate_id is deprecated: Certificate IDs may change, for example when a Let's Encrypt certificate is auto-renewed. Please specify 'certificate_name' instead.""")
        if certificate_id is not None:
            pulumi.set(__self__, "certificate_id", certificate_id)
        if certificate_name is not None:
            pulumi.set(__self__, "certificate_name", certificate_name)
        if created_at is not None:
            pulumi.set(__self__, "created_at", created_at)
        if custom_domain is not None:
            pulumi.set(__self__, "custom_domain", custom_domain)
        if endpoint is not None:
            pulumi.set(__self__, "endpoint", endpoint)
        if origin is not None:
            pulumi.set(__self__, "origin", origin)
        if ttl is not None:
            pulumi.set(__self__, "ttl", ttl)

    @property
    @pulumi.getter(name="certificateId")
    @_utilities.deprecated("""Certificate IDs may change, for example when a Let's Encrypt certificate is auto-renewed. Please specify 'certificate_name' instead.""")
    def certificate_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        **Deprecated** The ID of a DigitalOcean managed TLS certificate used for SSL when a custom subdomain is provided.
        """
        return pulumi.get(self, "certificate_id")

    @certificate_id.setter
    def certificate_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "certificate_id", value)

    @property
    @pulumi.getter(name="certificateName")
    def certificate_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The unique name of a DigitalOcean managed TLS certificate used for SSL when a custom subdomain is provided.
        """
        return pulumi.get(self, "certificate_name")

    @certificate_name.setter
    def certificate_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "certificate_name", value)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The date and time when the CDN Endpoint was created.
        """
        return pulumi.get(self, "created_at")

    @created_at.setter
    def created_at(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "created_at", value)

    @property
    @pulumi.getter(name="customDomain")
    def custom_domain(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The fully qualified domain name (FQDN) of the custom subdomain used with the CDN Endpoint.
        """
        return pulumi.get(self, "custom_domain")

    @custom_domain.setter
    def custom_domain(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "custom_domain", value)

    @property
    @pulumi.getter
    def endpoint(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The fully qualified domain name (FQDN) from which the CDN-backed content is served.
        """
        return pulumi.get(self, "endpoint")

    @endpoint.setter
    def endpoint(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "endpoint", value)

    @property
    @pulumi.getter
    def origin(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The fully qualified domain name, (FQDN) for a Space.
        """
        return pulumi.get(self, "origin")

    @origin.setter
    def origin(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "origin", value)

    @property
    @pulumi.getter
    def ttl(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        The time to live for the CDN Endpoint, in seconds. Default is 3600 seconds.
        """
        return pulumi.get(self, "ttl")

    @ttl.setter
    def ttl(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "ttl", value)


class Cdn(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 certificate_id: Optional[pulumi.Input[builtins.str]] = None,
                 certificate_name: Optional[pulumi.Input[builtins.str]] = None,
                 custom_domain: Optional[pulumi.Input[builtins.str]] = None,
                 origin: Optional[pulumi.Input[builtins.str]] = None,
                 ttl: Optional[pulumi.Input[builtins.int]] = None,
                 __props__=None):
        """
        Provides a DigitalOcean CDN Endpoint resource for use with Spaces.

        ## Example Usage

        ### Basic Example

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        # Create a new Spaces Bucket
        mybucket = digitalocean.SpacesBucket("mybucket",
            name="example",
            region=digitalocean.Region.SFO2,
            acl="public-read")
        # Add a CDN endpoint to the Spaces Bucket
        mycdn = digitalocean.Cdn("mycdn", origin=mybucket.bucket_domain_name)
        pulumi.export("fqdn", mycdn.endpoint)
        ```

        ### Custom Sub-Domain Example

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        # Create a new Spaces Bucket
        mybucket = digitalocean.SpacesBucket("mybucket",
            name="example",
            region=digitalocean.Region.SFO2,
            acl="public-read")
        # Create a DigitalOcean managed Let's Encrypt Certificate
        cert = digitalocean.Certificate("cert",
            name="cdn-cert",
            type=digitalocean.CertificateType.LETS_ENCRYPT,
            domains=["static.example.com"])
        # Add a CDN endpoint with a custom sub-domain to the Spaces Bucket
        mycdn = digitalocean.Cdn("mycdn",
            origin=mybucket.bucket_domain_name,
            custom_domain="static.example.com",
            certificate_name=cert.name)
        ```

        ## Import

        CDN Endpoints can be imported using the CDN `id`, e.g.

        ```sh
        $ pulumi import digitalocean:index/cdn:Cdn mycdn fb06ad00-351f-45c8-b5eb-13523c438661
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] certificate_id: **Deprecated** The ID of a DigitalOcean managed TLS certificate used for SSL when a custom subdomain is provided.
        :param pulumi.Input[builtins.str] certificate_name: The unique name of a DigitalOcean managed TLS certificate used for SSL when a custom subdomain is provided.
        :param pulumi.Input[builtins.str] custom_domain: The fully qualified domain name (FQDN) of the custom subdomain used with the CDN Endpoint.
        :param pulumi.Input[builtins.str] origin: The fully qualified domain name, (FQDN) for a Space.
        :param pulumi.Input[builtins.int] ttl: The time to live for the CDN Endpoint, in seconds. Default is 3600 seconds.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CdnArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a DigitalOcean CDN Endpoint resource for use with Spaces.

        ## Example Usage

        ### Basic Example

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        # Create a new Spaces Bucket
        mybucket = digitalocean.SpacesBucket("mybucket",
            name="example",
            region=digitalocean.Region.SFO2,
            acl="public-read")
        # Add a CDN endpoint to the Spaces Bucket
        mycdn = digitalocean.Cdn("mycdn", origin=mybucket.bucket_domain_name)
        pulumi.export("fqdn", mycdn.endpoint)
        ```

        ### Custom Sub-Domain Example

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        # Create a new Spaces Bucket
        mybucket = digitalocean.SpacesBucket("mybucket",
            name="example",
            region=digitalocean.Region.SFO2,
            acl="public-read")
        # Create a DigitalOcean managed Let's Encrypt Certificate
        cert = digitalocean.Certificate("cert",
            name="cdn-cert",
            type=digitalocean.CertificateType.LETS_ENCRYPT,
            domains=["static.example.com"])
        # Add a CDN endpoint with a custom sub-domain to the Spaces Bucket
        mycdn = digitalocean.Cdn("mycdn",
            origin=mybucket.bucket_domain_name,
            custom_domain="static.example.com",
            certificate_name=cert.name)
        ```

        ## Import

        CDN Endpoints can be imported using the CDN `id`, e.g.

        ```sh
        $ pulumi import digitalocean:index/cdn:Cdn mycdn fb06ad00-351f-45c8-b5eb-13523c438661
        ```

        :param str resource_name: The name of the resource.
        :param CdnArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CdnArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 certificate_id: Optional[pulumi.Input[builtins.str]] = None,
                 certificate_name: Optional[pulumi.Input[builtins.str]] = None,
                 custom_domain: Optional[pulumi.Input[builtins.str]] = None,
                 origin: Optional[pulumi.Input[builtins.str]] = None,
                 ttl: Optional[pulumi.Input[builtins.int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CdnArgs.__new__(CdnArgs)

            __props__.__dict__["certificate_id"] = certificate_id
            __props__.__dict__["certificate_name"] = certificate_name
            __props__.__dict__["custom_domain"] = custom_domain
            if origin is None and not opts.urn:
                raise TypeError("Missing required property 'origin'")
            __props__.__dict__["origin"] = origin
            __props__.__dict__["ttl"] = ttl
            __props__.__dict__["created_at"] = None
            __props__.__dict__["endpoint"] = None
        super(Cdn, __self__).__init__(
            'digitalocean:index/cdn:Cdn',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            certificate_id: Optional[pulumi.Input[builtins.str]] = None,
            certificate_name: Optional[pulumi.Input[builtins.str]] = None,
            created_at: Optional[pulumi.Input[builtins.str]] = None,
            custom_domain: Optional[pulumi.Input[builtins.str]] = None,
            endpoint: Optional[pulumi.Input[builtins.str]] = None,
            origin: Optional[pulumi.Input[builtins.str]] = None,
            ttl: Optional[pulumi.Input[builtins.int]] = None) -> 'Cdn':
        """
        Get an existing Cdn resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] certificate_id: **Deprecated** The ID of a DigitalOcean managed TLS certificate used for SSL when a custom subdomain is provided.
        :param pulumi.Input[builtins.str] certificate_name: The unique name of a DigitalOcean managed TLS certificate used for SSL when a custom subdomain is provided.
        :param pulumi.Input[builtins.str] created_at: The date and time when the CDN Endpoint was created.
        :param pulumi.Input[builtins.str] custom_domain: The fully qualified domain name (FQDN) of the custom subdomain used with the CDN Endpoint.
        :param pulumi.Input[builtins.str] endpoint: The fully qualified domain name (FQDN) from which the CDN-backed content is served.
        :param pulumi.Input[builtins.str] origin: The fully qualified domain name, (FQDN) for a Space.
        :param pulumi.Input[builtins.int] ttl: The time to live for the CDN Endpoint, in seconds. Default is 3600 seconds.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CdnState.__new__(_CdnState)

        __props__.__dict__["certificate_id"] = certificate_id
        __props__.__dict__["certificate_name"] = certificate_name
        __props__.__dict__["created_at"] = created_at
        __props__.__dict__["custom_domain"] = custom_domain
        __props__.__dict__["endpoint"] = endpoint
        __props__.__dict__["origin"] = origin
        __props__.__dict__["ttl"] = ttl
        return Cdn(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="certificateId")
    @_utilities.deprecated("""Certificate IDs may change, for example when a Let's Encrypt certificate is auto-renewed. Please specify 'certificate_name' instead.""")
    def certificate_id(self) -> pulumi.Output[builtins.str]:
        """
        **Deprecated** The ID of a DigitalOcean managed TLS certificate used for SSL when a custom subdomain is provided.
        """
        return pulumi.get(self, "certificate_id")

    @property
    @pulumi.getter(name="certificateName")
    def certificate_name(self) -> pulumi.Output[builtins.str]:
        """
        The unique name of a DigitalOcean managed TLS certificate used for SSL when a custom subdomain is provided.
        """
        return pulumi.get(self, "certificate_name")

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> pulumi.Output[builtins.str]:
        """
        The date and time when the CDN Endpoint was created.
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter(name="customDomain")
    def custom_domain(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        The fully qualified domain name (FQDN) of the custom subdomain used with the CDN Endpoint.
        """
        return pulumi.get(self, "custom_domain")

    @property
    @pulumi.getter
    def endpoint(self) -> pulumi.Output[builtins.str]:
        """
        The fully qualified domain name (FQDN) from which the CDN-backed content is served.
        """
        return pulumi.get(self, "endpoint")

    @property
    @pulumi.getter
    def origin(self) -> pulumi.Output[builtins.str]:
        """
        The fully qualified domain name, (FQDN) for a Space.
        """
        return pulumi.get(self, "origin")

    @property
    @pulumi.getter
    def ttl(self) -> pulumi.Output[builtins.int]:
        """
        The time to live for the CDN Endpoint, in seconds. Default is 3600 seconds.
        """
        return pulumi.get(self, "ttl")

