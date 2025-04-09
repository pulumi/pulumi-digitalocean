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
from . import outputs
from ._inputs import *

__all__ = ['SpacesKeyArgs', 'SpacesKey']

@pulumi.input_type
class SpacesKeyArgs:
    def __init__(__self__, *,
                 grants: Optional[pulumi.Input[Sequence[pulumi.Input['SpacesKeyGrantArgs']]]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None):
        """
        The set of arguments for constructing a SpacesKey resource.
        :param pulumi.Input[Sequence[pulumi.Input['SpacesKeyGrantArgs']]] grants: A grant for the key (documented below).
        :param pulumi.Input[builtins.str] name: The name of the key
        """
        if grants is not None:
            pulumi.set(__self__, "grants", grants)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def grants(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['SpacesKeyGrantArgs']]]]:
        """
        A grant for the key (documented below).
        """
        return pulumi.get(self, "grants")

    @grants.setter
    def grants(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['SpacesKeyGrantArgs']]]]):
        pulumi.set(self, "grants", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name of the key
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _SpacesKeyState:
    def __init__(__self__, *,
                 access_key: Optional[pulumi.Input[builtins.str]] = None,
                 created_at: Optional[pulumi.Input[builtins.str]] = None,
                 grants: Optional[pulumi.Input[Sequence[pulumi.Input['SpacesKeyGrantArgs']]]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 secret_key: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering SpacesKey resources.
        :param pulumi.Input[builtins.str] access_key: The access key ID of the key
        :param pulumi.Input[builtins.str] created_at: The creation time of the key
        :param pulumi.Input[Sequence[pulumi.Input['SpacesKeyGrantArgs']]] grants: A grant for the key (documented below).
        :param pulumi.Input[builtins.str] name: The name of the key
        :param pulumi.Input[builtins.str] secret_key: The access key secret of the key
        """
        if access_key is not None:
            pulumi.set(__self__, "access_key", access_key)
        if created_at is not None:
            pulumi.set(__self__, "created_at", created_at)
        if grants is not None:
            pulumi.set(__self__, "grants", grants)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if secret_key is not None:
            pulumi.set(__self__, "secret_key", secret_key)

    @property
    @pulumi.getter(name="accessKey")
    def access_key(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The access key ID of the key
        """
        return pulumi.get(self, "access_key")

    @access_key.setter
    def access_key(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "access_key", value)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The creation time of the key
        """
        return pulumi.get(self, "created_at")

    @created_at.setter
    def created_at(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "created_at", value)

    @property
    @pulumi.getter
    def grants(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['SpacesKeyGrantArgs']]]]:
        """
        A grant for the key (documented below).
        """
        return pulumi.get(self, "grants")

    @grants.setter
    def grants(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['SpacesKeyGrantArgs']]]]):
        pulumi.set(self, "grants", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name of the key
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="secretKey")
    def secret_key(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The access key secret of the key
        """
        return pulumi.get(self, "secret_key")

    @secret_key.setter
    def secret_key(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "secret_key", value)


class SpacesKey(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 grants: Optional[pulumi.Input[Sequence[pulumi.Input[Union['SpacesKeyGrantArgs', 'SpacesKeyGrantArgsDict']]]]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        Provides a key resource for Spaces, DigitalOcean's object storage product.

        The [Spaces API](https://docs.digitalocean.com/reference/api/spaces-api/) was
        designed to be interoperable with Amazon's AWS S3 API. This allows users to
        interact with the service while using the tools they already know. Spaces
        mirrors S3's authentication framework and requests to Spaces require a key pair
        similar to Amazon's Access ID and Secret Key.

        As a Spaces owner, you limit others’ access to your buckets using Spaces access
        keys. Access keys can provide several levels of permissions to create, destroy,
        read, and write to specific associated buckets. However, access keys only limit
        access to certain commands using the S3 API or CLI, not the control panel or
        other DigitalOcean resources.

        ## Example Usage

        ### Create a New Key

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        foobar = digitalocean.SpacesKey("foobar", name="foobar")
        ```

        ### Create a New Key with Grants

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        foobar = digitalocean.SpacesKey("foobar",
            name="foobar",
            grants=[{
                "bucket": "my-bucket",
                "permission": "read",
            }])
        ```

        ### Create a New Key with full access

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        foobar = digitalocean.SpacesKey("foobar",
            name="foobar",
            grants=[{
                "bucket": "",
                "permission": "fullaccess",
            }])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['SpacesKeyGrantArgs', 'SpacesKeyGrantArgsDict']]]] grants: A grant for the key (documented below).
        :param pulumi.Input[builtins.str] name: The name of the key
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[SpacesKeyArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a key resource for Spaces, DigitalOcean's object storage product.

        The [Spaces API](https://docs.digitalocean.com/reference/api/spaces-api/) was
        designed to be interoperable with Amazon's AWS S3 API. This allows users to
        interact with the service while using the tools they already know. Spaces
        mirrors S3's authentication framework and requests to Spaces require a key pair
        similar to Amazon's Access ID and Secret Key.

        As a Spaces owner, you limit others’ access to your buckets using Spaces access
        keys. Access keys can provide several levels of permissions to create, destroy,
        read, and write to specific associated buckets. However, access keys only limit
        access to certain commands using the S3 API or CLI, not the control panel or
        other DigitalOcean resources.

        ## Example Usage

        ### Create a New Key

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        foobar = digitalocean.SpacesKey("foobar", name="foobar")
        ```

        ### Create a New Key with Grants

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        foobar = digitalocean.SpacesKey("foobar",
            name="foobar",
            grants=[{
                "bucket": "my-bucket",
                "permission": "read",
            }])
        ```

        ### Create a New Key with full access

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        foobar = digitalocean.SpacesKey("foobar",
            name="foobar",
            grants=[{
                "bucket": "",
                "permission": "fullaccess",
            }])
        ```

        :param str resource_name: The name of the resource.
        :param SpacesKeyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SpacesKeyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 grants: Optional[pulumi.Input[Sequence[pulumi.Input[Union['SpacesKeyGrantArgs', 'SpacesKeyGrantArgsDict']]]]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SpacesKeyArgs.__new__(SpacesKeyArgs)

            __props__.__dict__["grants"] = grants
            __props__.__dict__["name"] = name
            __props__.__dict__["access_key"] = None
            __props__.__dict__["created_at"] = None
            __props__.__dict__["secret_key"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["secretKey"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(SpacesKey, __self__).__init__(
            'digitalocean:index/spacesKey:SpacesKey',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            access_key: Optional[pulumi.Input[builtins.str]] = None,
            created_at: Optional[pulumi.Input[builtins.str]] = None,
            grants: Optional[pulumi.Input[Sequence[pulumi.Input[Union['SpacesKeyGrantArgs', 'SpacesKeyGrantArgsDict']]]]] = None,
            name: Optional[pulumi.Input[builtins.str]] = None,
            secret_key: Optional[pulumi.Input[builtins.str]] = None) -> 'SpacesKey':
        """
        Get an existing SpacesKey resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] access_key: The access key ID of the key
        :param pulumi.Input[builtins.str] created_at: The creation time of the key
        :param pulumi.Input[Sequence[pulumi.Input[Union['SpacesKeyGrantArgs', 'SpacesKeyGrantArgsDict']]]] grants: A grant for the key (documented below).
        :param pulumi.Input[builtins.str] name: The name of the key
        :param pulumi.Input[builtins.str] secret_key: The access key secret of the key
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SpacesKeyState.__new__(_SpacesKeyState)

        __props__.__dict__["access_key"] = access_key
        __props__.__dict__["created_at"] = created_at
        __props__.__dict__["grants"] = grants
        __props__.__dict__["name"] = name
        __props__.__dict__["secret_key"] = secret_key
        return SpacesKey(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accessKey")
    def access_key(self) -> pulumi.Output[builtins.str]:
        """
        The access key ID of the key
        """
        return pulumi.get(self, "access_key")

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> pulumi.Output[builtins.str]:
        """
        The creation time of the key
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter
    def grants(self) -> pulumi.Output[Optional[Sequence['outputs.SpacesKeyGrant']]]:
        """
        A grant for the key (documented below).
        """
        return pulumi.get(self, "grants")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[builtins.str]:
        """
        The name of the key
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="secretKey")
    def secret_key(self) -> pulumi.Output[builtins.str]:
        """
        The access key secret of the key
        """
        return pulumi.get(self, "secret_key")

