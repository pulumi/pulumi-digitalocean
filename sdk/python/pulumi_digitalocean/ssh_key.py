# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['SshKeyArgs', 'SshKey']

@pulumi.input_type
class SshKeyArgs:
    def __init__(__self__, *,
                 public_key: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a SshKey resource.
        :param pulumi.Input[str] public_key: The public key. If this is a file, it
               can be read using the file interpolation function
        :param pulumi.Input[str] name: The name of the SSH key for identification
        """
        SshKeyArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            public_key=public_key,
            name=name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             public_key: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if public_key is None and 'publicKey' in kwargs:
            public_key = kwargs['publicKey']
        if public_key is None:
            raise TypeError("Missing 'public_key' argument")

        _setter("public_key", public_key)
        if name is not None:
            _setter("name", name)

    @property
    @pulumi.getter(name="publicKey")
    def public_key(self) -> pulumi.Input[str]:
        """
        The public key. If this is a file, it
        can be read using the file interpolation function
        """
        return pulumi.get(self, "public_key")

    @public_key.setter
    def public_key(self, value: pulumi.Input[str]):
        pulumi.set(self, "public_key", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the SSH key for identification
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _SshKeyState:
    def __init__(__self__, *,
                 fingerprint: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 public_key: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering SshKey resources.
        :param pulumi.Input[str] fingerprint: The fingerprint of the SSH key
        :param pulumi.Input[str] name: The name of the SSH key for identification
        :param pulumi.Input[str] public_key: The public key. If this is a file, it
               can be read using the file interpolation function
        """
        _SshKeyState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            fingerprint=fingerprint,
            name=name,
            public_key=public_key,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             fingerprint: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             public_key: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if public_key is None and 'publicKey' in kwargs:
            public_key = kwargs['publicKey']

        if fingerprint is not None:
            _setter("fingerprint", fingerprint)
        if name is not None:
            _setter("name", name)
        if public_key is not None:
            _setter("public_key", public_key)

    @property
    @pulumi.getter
    def fingerprint(self) -> Optional[pulumi.Input[str]]:
        """
        The fingerprint of the SSH key
        """
        return pulumi.get(self, "fingerprint")

    @fingerprint.setter
    def fingerprint(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "fingerprint", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the SSH key for identification
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="publicKey")
    def public_key(self) -> Optional[pulumi.Input[str]]:
        """
        The public key. If this is a file, it
        can be read using the file interpolation function
        """
        return pulumi.get(self, "public_key")

    @public_key.setter
    def public_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "public_key", value)


class SshKey(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 public_key: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a DigitalOcean SSH key resource to allow you to manage SSH
        keys for Droplet access. Keys created with this resource
        can be referenced in your Droplet configuration via their ID or
        fingerprint.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        # Create a new SSH key
        default = digitalocean.SshKey("default", public_key=(lambda path: open(path).read())("/Users/myuser/.ssh/id_rsa.pub"))
        # Create a new Droplet using the SSH key
        web = digitalocean.Droplet("web",
            image="ubuntu-18-04-x64",
            region="nyc3",
            size="s-1vcpu-1gb",
            ssh_keys=[default.fingerprint])
        ```

        ## Import

        SSH Keys can be imported using the `ssh key id`, e.g.

        ```sh
         $ pulumi import digitalocean:index/sshKey:SshKey mykey 263654
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: The name of the SSH key for identification
        :param pulumi.Input[str] public_key: The public key. If this is a file, it
               can be read using the file interpolation function
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SshKeyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a DigitalOcean SSH key resource to allow you to manage SSH
        keys for Droplet access. Keys created with this resource
        can be referenced in your Droplet configuration via their ID or
        fingerprint.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        # Create a new SSH key
        default = digitalocean.SshKey("default", public_key=(lambda path: open(path).read())("/Users/myuser/.ssh/id_rsa.pub"))
        # Create a new Droplet using the SSH key
        web = digitalocean.Droplet("web",
            image="ubuntu-18-04-x64",
            region="nyc3",
            size="s-1vcpu-1gb",
            ssh_keys=[default.fingerprint])
        ```

        ## Import

        SSH Keys can be imported using the `ssh key id`, e.g.

        ```sh
         $ pulumi import digitalocean:index/sshKey:SshKey mykey 263654
        ```

        :param str resource_name: The name of the resource.
        :param SshKeyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SshKeyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            SshKeyArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 public_key: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SshKeyArgs.__new__(SshKeyArgs)

            __props__.__dict__["name"] = name
            if public_key is None and not opts.urn:
                raise TypeError("Missing required property 'public_key'")
            __props__.__dict__["public_key"] = public_key
            __props__.__dict__["fingerprint"] = None
        super(SshKey, __self__).__init__(
            'digitalocean:index/sshKey:SshKey',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            fingerprint: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            public_key: Optional[pulumi.Input[str]] = None) -> 'SshKey':
        """
        Get an existing SshKey resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] fingerprint: The fingerprint of the SSH key
        :param pulumi.Input[str] name: The name of the SSH key for identification
        :param pulumi.Input[str] public_key: The public key. If this is a file, it
               can be read using the file interpolation function
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SshKeyState.__new__(_SshKeyState)

        __props__.__dict__["fingerprint"] = fingerprint
        __props__.__dict__["name"] = name
        __props__.__dict__["public_key"] = public_key
        return SshKey(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def fingerprint(self) -> pulumi.Output[str]:
        """
        The fingerprint of the SSH key
        """
        return pulumi.get(self, "fingerprint")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the SSH key for identification
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="publicKey")
    def public_key(self) -> pulumi.Output[str]:
        """
        The public key. If this is a file, it
        can be read using the file interpolation function
        """
        return pulumi.get(self, "public_key")

