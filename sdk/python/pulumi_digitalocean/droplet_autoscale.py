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
from . import outputs
from ._inputs import *

__all__ = ['DropletAutoscaleArgs', 'DropletAutoscale']

@pulumi.input_type
class DropletAutoscaleArgs:
    def __init__(__self__, *,
                 config: pulumi.Input['DropletAutoscaleConfigArgs'],
                 droplet_template: pulumi.Input['DropletAutoscaleDropletTemplateArgs'],
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a DropletAutoscale resource.
        :param pulumi.Input['DropletAutoscaleConfigArgs'] config: The configuration parameters for Droplet Autoscale pool, the supported arguments are 
               documented below.
        :param pulumi.Input['DropletAutoscaleDropletTemplateArgs'] droplet_template: The droplet template parameters for Droplet Autoscale pool, the supported arguments 
               are documented below.
        :param pulumi.Input[str] name: The name of the Droplet Autoscale pool.
        """
        pulumi.set(__self__, "config", config)
        pulumi.set(__self__, "droplet_template", droplet_template)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def config(self) -> pulumi.Input['DropletAutoscaleConfigArgs']:
        """
        The configuration parameters for Droplet Autoscale pool, the supported arguments are 
        documented below.
        """
        return pulumi.get(self, "config")

    @config.setter
    def config(self, value: pulumi.Input['DropletAutoscaleConfigArgs']):
        pulumi.set(self, "config", value)

    @property
    @pulumi.getter(name="dropletTemplate")
    def droplet_template(self) -> pulumi.Input['DropletAutoscaleDropletTemplateArgs']:
        """
        The droplet template parameters for Droplet Autoscale pool, the supported arguments 
        are documented below.
        """
        return pulumi.get(self, "droplet_template")

    @droplet_template.setter
    def droplet_template(self, value: pulumi.Input['DropletAutoscaleDropletTemplateArgs']):
        pulumi.set(self, "droplet_template", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Droplet Autoscale pool.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _DropletAutoscaleState:
    def __init__(__self__, *,
                 config: Optional[pulumi.Input['DropletAutoscaleConfigArgs']] = None,
                 created_at: Optional[pulumi.Input[str]] = None,
                 current_utilizations: Optional[pulumi.Input[Sequence[pulumi.Input['DropletAutoscaleCurrentUtilizationArgs']]]] = None,
                 droplet_template: Optional[pulumi.Input['DropletAutoscaleDropletTemplateArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 updated_at: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering DropletAutoscale resources.
        :param pulumi.Input['DropletAutoscaleConfigArgs'] config: The configuration parameters for Droplet Autoscale pool, the supported arguments are 
               documented below.
        :param pulumi.Input[str] created_at: Created at timestamp for the Droplet Autoscale pool.
        :param pulumi.Input[Sequence[pulumi.Input['DropletAutoscaleCurrentUtilizationArgs']]] current_utilizations: The current average resource utilization of the Droplet Autoscale pool, this attribute further
               embeds `memory` and `cpu` attributes to respectively report utilization data.
        :param pulumi.Input['DropletAutoscaleDropletTemplateArgs'] droplet_template: The droplet template parameters for Droplet Autoscale pool, the supported arguments 
               are documented below.
        :param pulumi.Input[str] name: The name of the Droplet Autoscale pool.
        :param pulumi.Input[str] status: Droplet Autoscale pool health status; this reflects if the pool is currently healthy and ready to accept
               traffic, or in an error state and needs user intervention.
        :param pulumi.Input[str] updated_at: Updated at timestamp for the Droplet Autoscale pool.
        """
        if config is not None:
            pulumi.set(__self__, "config", config)
        if created_at is not None:
            pulumi.set(__self__, "created_at", created_at)
        if current_utilizations is not None:
            pulumi.set(__self__, "current_utilizations", current_utilizations)
        if droplet_template is not None:
            pulumi.set(__self__, "droplet_template", droplet_template)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if updated_at is not None:
            pulumi.set(__self__, "updated_at", updated_at)

    @property
    @pulumi.getter
    def config(self) -> Optional[pulumi.Input['DropletAutoscaleConfigArgs']]:
        """
        The configuration parameters for Droplet Autoscale pool, the supported arguments are 
        documented below.
        """
        return pulumi.get(self, "config")

    @config.setter
    def config(self, value: Optional[pulumi.Input['DropletAutoscaleConfigArgs']]):
        pulumi.set(self, "config", value)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> Optional[pulumi.Input[str]]:
        """
        Created at timestamp for the Droplet Autoscale pool.
        """
        return pulumi.get(self, "created_at")

    @created_at.setter
    def created_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_at", value)

    @property
    @pulumi.getter(name="currentUtilizations")
    def current_utilizations(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['DropletAutoscaleCurrentUtilizationArgs']]]]:
        """
        The current average resource utilization of the Droplet Autoscale pool, this attribute further
        embeds `memory` and `cpu` attributes to respectively report utilization data.
        """
        return pulumi.get(self, "current_utilizations")

    @current_utilizations.setter
    def current_utilizations(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['DropletAutoscaleCurrentUtilizationArgs']]]]):
        pulumi.set(self, "current_utilizations", value)

    @property
    @pulumi.getter(name="dropletTemplate")
    def droplet_template(self) -> Optional[pulumi.Input['DropletAutoscaleDropletTemplateArgs']]:
        """
        The droplet template parameters for Droplet Autoscale pool, the supported arguments 
        are documented below.
        """
        return pulumi.get(self, "droplet_template")

    @droplet_template.setter
    def droplet_template(self, value: Optional[pulumi.Input['DropletAutoscaleDropletTemplateArgs']]):
        pulumi.set(self, "droplet_template", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Droplet Autoscale pool.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        Droplet Autoscale pool health status; this reflects if the pool is currently healthy and ready to accept
        traffic, or in an error state and needs user intervention.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> Optional[pulumi.Input[str]]:
        """
        Updated at timestamp for the Droplet Autoscale pool.
        """
        return pulumi.get(self, "updated_at")

    @updated_at.setter
    def updated_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "updated_at", value)


class DropletAutoscale(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config: Optional[pulumi.Input[Union['DropletAutoscaleConfigArgs', 'DropletAutoscaleConfigArgsDict']]] = None,
                 droplet_template: Optional[pulumi.Input[Union['DropletAutoscaleDropletTemplateArgs', 'DropletAutoscaleDropletTemplateArgsDict']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a DigitalOcean Droplet Autoscale resource. This can be used to create, modify,
        read and delete Droplet Autoscale pools.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean
        import pulumi_std as std

        my_ssh_key = digitalocean.SshKey("my-ssh-key",
            name="terraform-example",
            public_key=std.file(input="/Users/terraform/.ssh/id_rsa.pub").result)
        my_tag = digitalocean.Tag("my-tag", name="terraform-example")
        my_autoscale_pool = digitalocean.DropletAutoscale("my-autoscale-pool",
            name="terraform-example",
            config={
                "min_instances": 10,
                "max_instances": 50,
                "target_cpu_utilization": 0.5,
                "target_memory_utilization": 0.5,
                "cooldown_minutes": 5,
            },
            droplet_template={
                "size": "c-2",
                "region": "nyc3",
                "image": "ubuntu-24-04-x64",
                "tags": [my_tag.id],
                "ssh_keys": [my_ssh_key.id],
                "with_droplet_agent": True,
                "ipv6": True,
                "user_data": \"\"\"
        #cloud-config
        runcmd:
        - apt-get update
        - apt-get install -y stress-ng
        \"\"\",
            })
        ```

        ## Import

        Droplet Autoscale pools can be imported using their `id`, e.g.

        ```sh
        $ pulumi import digitalocean:index/dropletAutoscale:DropletAutoscale my-autoscale-pool 38e66834-d741-47ec-88e7-c70cbdcz0445
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['DropletAutoscaleConfigArgs', 'DropletAutoscaleConfigArgsDict']] config: The configuration parameters for Droplet Autoscale pool, the supported arguments are 
               documented below.
        :param pulumi.Input[Union['DropletAutoscaleDropletTemplateArgs', 'DropletAutoscaleDropletTemplateArgsDict']] droplet_template: The droplet template parameters for Droplet Autoscale pool, the supported arguments 
               are documented below.
        :param pulumi.Input[str] name: The name of the Droplet Autoscale pool.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DropletAutoscaleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a DigitalOcean Droplet Autoscale resource. This can be used to create, modify,
        read and delete Droplet Autoscale pools.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean
        import pulumi_std as std

        my_ssh_key = digitalocean.SshKey("my-ssh-key",
            name="terraform-example",
            public_key=std.file(input="/Users/terraform/.ssh/id_rsa.pub").result)
        my_tag = digitalocean.Tag("my-tag", name="terraform-example")
        my_autoscale_pool = digitalocean.DropletAutoscale("my-autoscale-pool",
            name="terraform-example",
            config={
                "min_instances": 10,
                "max_instances": 50,
                "target_cpu_utilization": 0.5,
                "target_memory_utilization": 0.5,
                "cooldown_minutes": 5,
            },
            droplet_template={
                "size": "c-2",
                "region": "nyc3",
                "image": "ubuntu-24-04-x64",
                "tags": [my_tag.id],
                "ssh_keys": [my_ssh_key.id],
                "with_droplet_agent": True,
                "ipv6": True,
                "user_data": \"\"\"
        #cloud-config
        runcmd:
        - apt-get update
        - apt-get install -y stress-ng
        \"\"\",
            })
        ```

        ## Import

        Droplet Autoscale pools can be imported using their `id`, e.g.

        ```sh
        $ pulumi import digitalocean:index/dropletAutoscale:DropletAutoscale my-autoscale-pool 38e66834-d741-47ec-88e7-c70cbdcz0445
        ```

        :param str resource_name: The name of the resource.
        :param DropletAutoscaleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DropletAutoscaleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config: Optional[pulumi.Input[Union['DropletAutoscaleConfigArgs', 'DropletAutoscaleConfigArgsDict']]] = None,
                 droplet_template: Optional[pulumi.Input[Union['DropletAutoscaleDropletTemplateArgs', 'DropletAutoscaleDropletTemplateArgsDict']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DropletAutoscaleArgs.__new__(DropletAutoscaleArgs)

            if config is None and not opts.urn:
                raise TypeError("Missing required property 'config'")
            __props__.__dict__["config"] = config
            if droplet_template is None and not opts.urn:
                raise TypeError("Missing required property 'droplet_template'")
            __props__.__dict__["droplet_template"] = droplet_template
            __props__.__dict__["name"] = name
            __props__.__dict__["created_at"] = None
            __props__.__dict__["current_utilizations"] = None
            __props__.__dict__["status"] = None
            __props__.__dict__["updated_at"] = None
        super(DropletAutoscale, __self__).__init__(
            'digitalocean:index/dropletAutoscale:DropletAutoscale',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            config: Optional[pulumi.Input[Union['DropletAutoscaleConfigArgs', 'DropletAutoscaleConfigArgsDict']]] = None,
            created_at: Optional[pulumi.Input[str]] = None,
            current_utilizations: Optional[pulumi.Input[Sequence[pulumi.Input[Union['DropletAutoscaleCurrentUtilizationArgs', 'DropletAutoscaleCurrentUtilizationArgsDict']]]]] = None,
            droplet_template: Optional[pulumi.Input[Union['DropletAutoscaleDropletTemplateArgs', 'DropletAutoscaleDropletTemplateArgsDict']]] = None,
            name: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            updated_at: Optional[pulumi.Input[str]] = None) -> 'DropletAutoscale':
        """
        Get an existing DropletAutoscale resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['DropletAutoscaleConfigArgs', 'DropletAutoscaleConfigArgsDict']] config: The configuration parameters for Droplet Autoscale pool, the supported arguments are 
               documented below.
        :param pulumi.Input[str] created_at: Created at timestamp for the Droplet Autoscale pool.
        :param pulumi.Input[Sequence[pulumi.Input[Union['DropletAutoscaleCurrentUtilizationArgs', 'DropletAutoscaleCurrentUtilizationArgsDict']]]] current_utilizations: The current average resource utilization of the Droplet Autoscale pool, this attribute further
               embeds `memory` and `cpu` attributes to respectively report utilization data.
        :param pulumi.Input[Union['DropletAutoscaleDropletTemplateArgs', 'DropletAutoscaleDropletTemplateArgsDict']] droplet_template: The droplet template parameters for Droplet Autoscale pool, the supported arguments 
               are documented below.
        :param pulumi.Input[str] name: The name of the Droplet Autoscale pool.
        :param pulumi.Input[str] status: Droplet Autoscale pool health status; this reflects if the pool is currently healthy and ready to accept
               traffic, or in an error state and needs user intervention.
        :param pulumi.Input[str] updated_at: Updated at timestamp for the Droplet Autoscale pool.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DropletAutoscaleState.__new__(_DropletAutoscaleState)

        __props__.__dict__["config"] = config
        __props__.__dict__["created_at"] = created_at
        __props__.__dict__["current_utilizations"] = current_utilizations
        __props__.__dict__["droplet_template"] = droplet_template
        __props__.__dict__["name"] = name
        __props__.__dict__["status"] = status
        __props__.__dict__["updated_at"] = updated_at
        return DropletAutoscale(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def config(self) -> pulumi.Output['outputs.DropletAutoscaleConfig']:
        """
        The configuration parameters for Droplet Autoscale pool, the supported arguments are 
        documented below.
        """
        return pulumi.get(self, "config")

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> pulumi.Output[str]:
        """
        Created at timestamp for the Droplet Autoscale pool.
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter(name="currentUtilizations")
    def current_utilizations(self) -> pulumi.Output[Sequence['outputs.DropletAutoscaleCurrentUtilization']]:
        """
        The current average resource utilization of the Droplet Autoscale pool, this attribute further
        embeds `memory` and `cpu` attributes to respectively report utilization data.
        """
        return pulumi.get(self, "current_utilizations")

    @property
    @pulumi.getter(name="dropletTemplate")
    def droplet_template(self) -> pulumi.Output['outputs.DropletAutoscaleDropletTemplate']:
        """
        The droplet template parameters for Droplet Autoscale pool, the supported arguments 
        are documented below.
        """
        return pulumi.get(self, "droplet_template")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the Droplet Autoscale pool.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        Droplet Autoscale pool health status; this reflects if the pool is currently healthy and ready to accept
        traffic, or in an error state and needs user intervention.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> pulumi.Output[str]:
        """
        Updated at timestamp for the Droplet Autoscale pool.
        """
        return pulumi.get(self, "updated_at")
