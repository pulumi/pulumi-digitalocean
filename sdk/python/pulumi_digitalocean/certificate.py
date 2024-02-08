# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from ._enums import *

__all__ = ['CertificateArgs', 'Certificate']

@pulumi.input_type
class CertificateArgs:
    def __init__(__self__, *,
                 certificate_chain: Optional[pulumi.Input[str]] = None,
                 domains: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 leaf_certificate: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 private_key: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[Union[str, 'CertificateType']]] = None):
        """
        The set of arguments for constructing a Certificate resource.
        :param pulumi.Input[str] certificate_chain: The full PEM-formatted trust chain
               between the certificate authority's certificate and your domain's TLS
               certificate. Only valid when type is `custom`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] domains: List of fully qualified domain names (FQDNs) for
               which the certificate will be issued. The domains must be managed using
               DigitalOcean's DNS. Only valid when type is `lets_encrypt`.
        :param pulumi.Input[str] leaf_certificate: The contents of a PEM-formatted public
               TLS certificate. Only valid when type is `custom`.
        :param pulumi.Input[str] name: The name of the certificate for identification.
        :param pulumi.Input[str] private_key: The contents of a PEM-formatted private-key
               corresponding to the SSL certificate. Only valid when type is `custom`.
        :param pulumi.Input[Union[str, 'CertificateType']] type: The type of certificate to provision. Can be either
               `custom` or `lets_encrypt`. Defaults to `custom`.
        """
        if certificate_chain is not None:
            pulumi.set(__self__, "certificate_chain", certificate_chain)
        if domains is not None:
            pulumi.set(__self__, "domains", domains)
        if leaf_certificate is not None:
            pulumi.set(__self__, "leaf_certificate", leaf_certificate)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if private_key is not None:
            pulumi.set(__self__, "private_key", private_key)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="certificateChain")
    def certificate_chain(self) -> Optional[pulumi.Input[str]]:
        """
        The full PEM-formatted trust chain
        between the certificate authority's certificate and your domain's TLS
        certificate. Only valid when type is `custom`.
        """
        return pulumi.get(self, "certificate_chain")

    @certificate_chain.setter
    def certificate_chain(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "certificate_chain", value)

    @property
    @pulumi.getter
    def domains(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of fully qualified domain names (FQDNs) for
        which the certificate will be issued. The domains must be managed using
        DigitalOcean's DNS. Only valid when type is `lets_encrypt`.
        """
        return pulumi.get(self, "domains")

    @domains.setter
    def domains(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "domains", value)

    @property
    @pulumi.getter(name="leafCertificate")
    def leaf_certificate(self) -> Optional[pulumi.Input[str]]:
        """
        The contents of a PEM-formatted public
        TLS certificate. Only valid when type is `custom`.
        """
        return pulumi.get(self, "leaf_certificate")

    @leaf_certificate.setter
    def leaf_certificate(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "leaf_certificate", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the certificate for identification.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="privateKey")
    def private_key(self) -> Optional[pulumi.Input[str]]:
        """
        The contents of a PEM-formatted private-key
        corresponding to the SSL certificate. Only valid when type is `custom`.
        """
        return pulumi.get(self, "private_key")

    @private_key.setter
    def private_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "private_key", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[Union[str, 'CertificateType']]]:
        """
        The type of certificate to provision. Can be either
        `custom` or `lets_encrypt`. Defaults to `custom`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[Union[str, 'CertificateType']]]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class _CertificateState:
    def __init__(__self__, *,
                 certificate_chain: Optional[pulumi.Input[str]] = None,
                 domains: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 leaf_certificate: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 not_after: Optional[pulumi.Input[str]] = None,
                 private_key: Optional[pulumi.Input[str]] = None,
                 sha1_fingerprint: Optional[pulumi.Input[str]] = None,
                 state: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[Union[str, 'CertificateType']]] = None,
                 uuid: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Certificate resources.
        :param pulumi.Input[str] certificate_chain: The full PEM-formatted trust chain
               between the certificate authority's certificate and your domain's TLS
               certificate. Only valid when type is `custom`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] domains: List of fully qualified domain names (FQDNs) for
               which the certificate will be issued. The domains must be managed using
               DigitalOcean's DNS. Only valid when type is `lets_encrypt`.
        :param pulumi.Input[str] leaf_certificate: The contents of a PEM-formatted public
               TLS certificate. Only valid when type is `custom`.
        :param pulumi.Input[str] name: The name of the certificate for identification.
        :param pulumi.Input[str] not_after: The expiration date of the certificate
        :param pulumi.Input[str] private_key: The contents of a PEM-formatted private-key
               corresponding to the SSL certificate. Only valid when type is `custom`.
        :param pulumi.Input[str] sha1_fingerprint: The SHA-1 fingerprint of the certificate
        :param pulumi.Input[Union[str, 'CertificateType']] type: The type of certificate to provision. Can be either
               `custom` or `lets_encrypt`. Defaults to `custom`.
        :param pulumi.Input[str] uuid: The UUID of the certificate
        """
        if certificate_chain is not None:
            pulumi.set(__self__, "certificate_chain", certificate_chain)
        if domains is not None:
            pulumi.set(__self__, "domains", domains)
        if leaf_certificate is not None:
            pulumi.set(__self__, "leaf_certificate", leaf_certificate)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if not_after is not None:
            pulumi.set(__self__, "not_after", not_after)
        if private_key is not None:
            pulumi.set(__self__, "private_key", private_key)
        if sha1_fingerprint is not None:
            pulumi.set(__self__, "sha1_fingerprint", sha1_fingerprint)
        if state is not None:
            pulumi.set(__self__, "state", state)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if uuid is not None:
            pulumi.set(__self__, "uuid", uuid)

    @property
    @pulumi.getter(name="certificateChain")
    def certificate_chain(self) -> Optional[pulumi.Input[str]]:
        """
        The full PEM-formatted trust chain
        between the certificate authority's certificate and your domain's TLS
        certificate. Only valid when type is `custom`.
        """
        return pulumi.get(self, "certificate_chain")

    @certificate_chain.setter
    def certificate_chain(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "certificate_chain", value)

    @property
    @pulumi.getter
    def domains(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of fully qualified domain names (FQDNs) for
        which the certificate will be issued. The domains must be managed using
        DigitalOcean's DNS. Only valid when type is `lets_encrypt`.
        """
        return pulumi.get(self, "domains")

    @domains.setter
    def domains(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "domains", value)

    @property
    @pulumi.getter(name="leafCertificate")
    def leaf_certificate(self) -> Optional[pulumi.Input[str]]:
        """
        The contents of a PEM-formatted public
        TLS certificate. Only valid when type is `custom`.
        """
        return pulumi.get(self, "leaf_certificate")

    @leaf_certificate.setter
    def leaf_certificate(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "leaf_certificate", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the certificate for identification.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="notAfter")
    def not_after(self) -> Optional[pulumi.Input[str]]:
        """
        The expiration date of the certificate
        """
        return pulumi.get(self, "not_after")

    @not_after.setter
    def not_after(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "not_after", value)

    @property
    @pulumi.getter(name="privateKey")
    def private_key(self) -> Optional[pulumi.Input[str]]:
        """
        The contents of a PEM-formatted private-key
        corresponding to the SSL certificate. Only valid when type is `custom`.
        """
        return pulumi.get(self, "private_key")

    @private_key.setter
    def private_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "private_key", value)

    @property
    @pulumi.getter(name="sha1Fingerprint")
    def sha1_fingerprint(self) -> Optional[pulumi.Input[str]]:
        """
        The SHA-1 fingerprint of the certificate
        """
        return pulumi.get(self, "sha1_fingerprint")

    @sha1_fingerprint.setter
    def sha1_fingerprint(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "sha1_fingerprint", value)

    @property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "state", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[Union[str, 'CertificateType']]]:
        """
        The type of certificate to provision. Can be either
        `custom` or `lets_encrypt`. Defaults to `custom`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[Union[str, 'CertificateType']]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def uuid(self) -> Optional[pulumi.Input[str]]:
        """
        The UUID of the certificate
        """
        return pulumi.get(self, "uuid")

    @uuid.setter
    def uuid(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "uuid", value)


class Certificate(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 certificate_chain: Optional[pulumi.Input[str]] = None,
                 domains: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 leaf_certificate: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 private_key: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[Union[str, 'CertificateType']]] = None,
                 __props__=None):
        """
        Provides a DigitalOcean Certificate resource that allows you to manage
        certificates for configuring TLS termination in Load Balancers.
        Certificates created with this resource can be referenced in your
        Load Balancer configuration via their ID. The certificate can either
        be a custom one provided by you or automatically generated one with
        Let's Encrypt.

        ## Example Usage
        ### Custom Certificate

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        cert = digitalocean.Certificate("cert",
            type="custom",
            private_key=(lambda path: open(path).read())("/Users/myuser/certs/privkey.pem"),
            leaf_certificate=(lambda path: open(path).read())("/Users/myuser/certs/cert.pem"),
            certificate_chain=(lambda path: open(path).read())("/Users/myuser/certs/fullchain.pem"))
        ```
        ### Let's Encrypt Certificate

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        cert = digitalocean.Certificate("cert",
            domains=["example.com"],
            type="lets_encrypt")
        ```
        ### Use with Other Resources

        Both custom and Let's Encrypt certificates can be used with other resources
        including the `LoadBalancer` and `Cdn` resources.

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        cert = digitalocean.Certificate("cert",
            type="lets_encrypt",
            domains=["example.com"])
        # Create a new Load Balancer with TLS termination
        public = digitalocean.LoadBalancer("public",
            region="nyc3",
            droplet_tag="backend",
            forwarding_rules=[digitalocean.LoadBalancerForwardingRuleArgs(
                entry_port=443,
                entry_protocol="https",
                target_port=80,
                target_protocol="http",
                certificate_name=cert.name,
            )])
        ```

        ## Import

        Certificates can be imported using the certificate `name`, e.g.

        ```sh
        $ pulumi import digitalocean:index/certificate:Certificate mycertificate cert-01
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] certificate_chain: The full PEM-formatted trust chain
               between the certificate authority's certificate and your domain's TLS
               certificate. Only valid when type is `custom`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] domains: List of fully qualified domain names (FQDNs) for
               which the certificate will be issued. The domains must be managed using
               DigitalOcean's DNS. Only valid when type is `lets_encrypt`.
        :param pulumi.Input[str] leaf_certificate: The contents of a PEM-formatted public
               TLS certificate. Only valid when type is `custom`.
        :param pulumi.Input[str] name: The name of the certificate for identification.
        :param pulumi.Input[str] private_key: The contents of a PEM-formatted private-key
               corresponding to the SSL certificate. Only valid when type is `custom`.
        :param pulumi.Input[Union[str, 'CertificateType']] type: The type of certificate to provision. Can be either
               `custom` or `lets_encrypt`. Defaults to `custom`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[CertificateArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a DigitalOcean Certificate resource that allows you to manage
        certificates for configuring TLS termination in Load Balancers.
        Certificates created with this resource can be referenced in your
        Load Balancer configuration via their ID. The certificate can either
        be a custom one provided by you or automatically generated one with
        Let's Encrypt.

        ## Example Usage
        ### Custom Certificate

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        cert = digitalocean.Certificate("cert",
            type="custom",
            private_key=(lambda path: open(path).read())("/Users/myuser/certs/privkey.pem"),
            leaf_certificate=(lambda path: open(path).read())("/Users/myuser/certs/cert.pem"),
            certificate_chain=(lambda path: open(path).read())("/Users/myuser/certs/fullchain.pem"))
        ```
        ### Let's Encrypt Certificate

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        cert = digitalocean.Certificate("cert",
            domains=["example.com"],
            type="lets_encrypt")
        ```
        ### Use with Other Resources

        Both custom and Let's Encrypt certificates can be used with other resources
        including the `LoadBalancer` and `Cdn` resources.

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        cert = digitalocean.Certificate("cert",
            type="lets_encrypt",
            domains=["example.com"])
        # Create a new Load Balancer with TLS termination
        public = digitalocean.LoadBalancer("public",
            region="nyc3",
            droplet_tag="backend",
            forwarding_rules=[digitalocean.LoadBalancerForwardingRuleArgs(
                entry_port=443,
                entry_protocol="https",
                target_port=80,
                target_protocol="http",
                certificate_name=cert.name,
            )])
        ```

        ## Import

        Certificates can be imported using the certificate `name`, e.g.

        ```sh
        $ pulumi import digitalocean:index/certificate:Certificate mycertificate cert-01
        ```

        :param str resource_name: The name of the resource.
        :param CertificateArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CertificateArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 certificate_chain: Optional[pulumi.Input[str]] = None,
                 domains: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 leaf_certificate: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 private_key: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[Union[str, 'CertificateType']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CertificateArgs.__new__(CertificateArgs)

            __props__.__dict__["certificate_chain"] = certificate_chain
            __props__.__dict__["domains"] = domains
            __props__.__dict__["leaf_certificate"] = leaf_certificate
            __props__.__dict__["name"] = name
            __props__.__dict__["private_key"] = None if private_key is None else pulumi.Output.secret(private_key)
            __props__.__dict__["type"] = type
            __props__.__dict__["not_after"] = None
            __props__.__dict__["sha1_fingerprint"] = None
            __props__.__dict__["state"] = None
            __props__.__dict__["uuid"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["privateKey"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(Certificate, __self__).__init__(
            'digitalocean:index/certificate:Certificate',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            certificate_chain: Optional[pulumi.Input[str]] = None,
            domains: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            leaf_certificate: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            not_after: Optional[pulumi.Input[str]] = None,
            private_key: Optional[pulumi.Input[str]] = None,
            sha1_fingerprint: Optional[pulumi.Input[str]] = None,
            state: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[Union[str, 'CertificateType']]] = None,
            uuid: Optional[pulumi.Input[str]] = None) -> 'Certificate':
        """
        Get an existing Certificate resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] certificate_chain: The full PEM-formatted trust chain
               between the certificate authority's certificate and your domain's TLS
               certificate. Only valid when type is `custom`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] domains: List of fully qualified domain names (FQDNs) for
               which the certificate will be issued. The domains must be managed using
               DigitalOcean's DNS. Only valid when type is `lets_encrypt`.
        :param pulumi.Input[str] leaf_certificate: The contents of a PEM-formatted public
               TLS certificate. Only valid when type is `custom`.
        :param pulumi.Input[str] name: The name of the certificate for identification.
        :param pulumi.Input[str] not_after: The expiration date of the certificate
        :param pulumi.Input[str] private_key: The contents of a PEM-formatted private-key
               corresponding to the SSL certificate. Only valid when type is `custom`.
        :param pulumi.Input[str] sha1_fingerprint: The SHA-1 fingerprint of the certificate
        :param pulumi.Input[Union[str, 'CertificateType']] type: The type of certificate to provision. Can be either
               `custom` or `lets_encrypt`. Defaults to `custom`.
        :param pulumi.Input[str] uuid: The UUID of the certificate
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CertificateState.__new__(_CertificateState)

        __props__.__dict__["certificate_chain"] = certificate_chain
        __props__.__dict__["domains"] = domains
        __props__.__dict__["leaf_certificate"] = leaf_certificate
        __props__.__dict__["name"] = name
        __props__.__dict__["not_after"] = not_after
        __props__.__dict__["private_key"] = private_key
        __props__.__dict__["sha1_fingerprint"] = sha1_fingerprint
        __props__.__dict__["state"] = state
        __props__.__dict__["type"] = type
        __props__.__dict__["uuid"] = uuid
        return Certificate(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="certificateChain")
    def certificate_chain(self) -> pulumi.Output[Optional[str]]:
        """
        The full PEM-formatted trust chain
        between the certificate authority's certificate and your domain's TLS
        certificate. Only valid when type is `custom`.
        """
        return pulumi.get(self, "certificate_chain")

    @property
    @pulumi.getter
    def domains(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        List of fully qualified domain names (FQDNs) for
        which the certificate will be issued. The domains must be managed using
        DigitalOcean's DNS. Only valid when type is `lets_encrypt`.
        """
        return pulumi.get(self, "domains")

    @property
    @pulumi.getter(name="leafCertificate")
    def leaf_certificate(self) -> pulumi.Output[Optional[str]]:
        """
        The contents of a PEM-formatted public
        TLS certificate. Only valid when type is `custom`.
        """
        return pulumi.get(self, "leaf_certificate")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the certificate for identification.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="notAfter")
    def not_after(self) -> pulumi.Output[str]:
        """
        The expiration date of the certificate
        """
        return pulumi.get(self, "not_after")

    @property
    @pulumi.getter(name="privateKey")
    def private_key(self) -> pulumi.Output[Optional[str]]:
        """
        The contents of a PEM-formatted private-key
        corresponding to the SSL certificate. Only valid when type is `custom`.
        """
        return pulumi.get(self, "private_key")

    @property
    @pulumi.getter(name="sha1Fingerprint")
    def sha1_fingerprint(self) -> pulumi.Output[str]:
        """
        The SHA-1 fingerprint of the certificate
        """
        return pulumi.get(self, "sha1_fingerprint")

    @property
    @pulumi.getter
    def state(self) -> pulumi.Output[str]:
        return pulumi.get(self, "state")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[Optional[str]]:
        """
        The type of certificate to provision. Can be either
        `custom` or `lets_encrypt`. Defaults to `custom`.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def uuid(self) -> pulumi.Output[str]:
        """
        The UUID of the certificate
        """
        return pulumi.get(self, "uuid")

