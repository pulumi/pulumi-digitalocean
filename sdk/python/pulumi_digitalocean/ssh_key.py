# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class SshKey(pulumi.CustomResource):
    fingerprint: pulumi.Output[str]
    """
    The fingerprint of the SSH key
    """
    name: pulumi.Output[str]
    """
    The name of the SSH key for identification
    """
    public_key: pulumi.Output[str]
    """
    The public key. If this is a file, it
    can be read using the file interpolation function
    """
    def __init__(__self__, resource_name, opts=None, name=None, public_key=None, __props__=None, __name__=None, __opts__=None):
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


        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: The name of the SSH key for identification
        :param pulumi.Input[str] public_key: The public key. If this is a file, it
               can be read using the file interpolation function
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['name'] = name
            if public_key is None:
                raise TypeError("Missing required property 'public_key'")
            __props__['public_key'] = public_key
            __props__['fingerprint'] = None
        super(SshKey, __self__).__init__(
            'digitalocean:index/sshKey:SshKey',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, fingerprint=None, name=None, public_key=None):
        """
        Get an existing SshKey resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] fingerprint: The fingerprint of the SSH key
        :param pulumi.Input[str] name: The name of the SSH key for identification
        :param pulumi.Input[str] public_key: The public key. If this is a file, it
               can be read using the file interpolation function
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["fingerprint"] = fingerprint
        __props__["name"] = name
        __props__["public_key"] = public_key
        return SshKey(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

