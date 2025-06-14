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

__all__ = ['VpcArgs', 'Vpc']

@pulumi.input_type
class VpcArgs:
    def __init__(__self__, *,
                 region: pulumi.Input[builtins.str],
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 ip_range: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None):
        """
        The set of arguments for constructing a Vpc resource.
        :param pulumi.Input[builtins.str] region: The DigitalOcean region slug for the VPC's location.
        :param pulumi.Input[builtins.str] description: A free-form text field up to a limit of 255 characters to describe the VPC.
        :param pulumi.Input[builtins.str] ip_range: The range of IP addresses for the VPC in CIDR notation. Network ranges cannot overlap with other networks in the same account and must be in range of private addresses as defined in RFC1918. It may not be larger than `/16` or smaller than `/24`.
        :param pulumi.Input[builtins.str] name: A name for the VPC. Must be unique and contain alphanumeric characters, dashes, and periods only.
        """
        pulumi.set(__self__, "region", region)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if ip_range is not None:
            pulumi.set(__self__, "ip_range", ip_range)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def region(self) -> pulumi.Input[builtins.str]:
        """
        The DigitalOcean region slug for the VPC's location.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        A free-form text field up to a limit of 255 characters to describe the VPC.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="ipRange")
    def ip_range(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The range of IP addresses for the VPC in CIDR notation. Network ranges cannot overlap with other networks in the same account and must be in range of private addresses as defined in RFC1918. It may not be larger than `/16` or smaller than `/24`.
        """
        return pulumi.get(self, "ip_range")

    @ip_range.setter
    def ip_range(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "ip_range", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        A name for the VPC. Must be unique and contain alphanumeric characters, dashes, and periods only.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _VpcState:
    def __init__(__self__, *,
                 created_at: Optional[pulumi.Input[builtins.str]] = None,
                 default: Optional[pulumi.Input[builtins.bool]] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 ip_range: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 region: Optional[pulumi.Input[builtins.str]] = None,
                 vpc_urn: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering Vpc resources.
        :param pulumi.Input[builtins.str] created_at: The date and time of when the VPC was created.
        :param pulumi.Input[builtins.bool] default: A boolean indicating whether or not the VPC is the default one for the region.
        :param pulumi.Input[builtins.str] description: A free-form text field up to a limit of 255 characters to describe the VPC.
        :param pulumi.Input[builtins.str] ip_range: The range of IP addresses for the VPC in CIDR notation. Network ranges cannot overlap with other networks in the same account and must be in range of private addresses as defined in RFC1918. It may not be larger than `/16` or smaller than `/24`.
        :param pulumi.Input[builtins.str] name: A name for the VPC. Must be unique and contain alphanumeric characters, dashes, and periods only.
        :param pulumi.Input[builtins.str] region: The DigitalOcean region slug for the VPC's location.
        :param pulumi.Input[builtins.str] vpc_urn: The uniform resource name (URN) for the VPC.
        """
        if created_at is not None:
            pulumi.set(__self__, "created_at", created_at)
        if default is not None:
            pulumi.set(__self__, "default", default)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if ip_range is not None:
            pulumi.set(__self__, "ip_range", ip_range)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if region is not None:
            pulumi.set(__self__, "region", region)
        if vpc_urn is not None:
            pulumi.set(__self__, "vpc_urn", vpc_urn)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The date and time of when the VPC was created.
        """
        return pulumi.get(self, "created_at")

    @created_at.setter
    def created_at(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "created_at", value)

    @property
    @pulumi.getter
    def default(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        A boolean indicating whether or not the VPC is the default one for the region.
        """
        return pulumi.get(self, "default")

    @default.setter
    def default(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "default", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        A free-form text field up to a limit of 255 characters to describe the VPC.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="ipRange")
    def ip_range(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The range of IP addresses for the VPC in CIDR notation. Network ranges cannot overlap with other networks in the same account and must be in range of private addresses as defined in RFC1918. It may not be larger than `/16` or smaller than `/24`.
        """
        return pulumi.get(self, "ip_range")

    @ip_range.setter
    def ip_range(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "ip_range", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        A name for the VPC. Must be unique and contain alphanumeric characters, dashes, and periods only.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The DigitalOcean region slug for the VPC's location.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter(name="vpcUrn")
    def vpc_urn(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The uniform resource name (URN) for the VPC.
        """
        return pulumi.get(self, "vpc_urn")

    @vpc_urn.setter
    def vpc_urn(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "vpc_urn", value)


@pulumi.type_token("digitalocean:index/vpc:Vpc")
class Vpc(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 ip_range: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 region: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        Provides a [DigitalOcean VPC](https://docs.digitalocean.com/reference/api/digitalocean/#tag/VPCs) resource.

        VPCs are virtual networks containing resources that can communicate with each
        other in full isolation, using private IP addresses.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        example = digitalocean.Vpc("example",
            name="example-project-network",
            region="nyc3",
            ip_range="10.10.10.0/24")
        ```

        ### Resource Assignment

        `Droplet`, `KubernetesCluster`,
        `digitalocean_load_balancer`, and `DatabaseCluster` resources
        may be assigned to a VPC by referencing its `id`. For example:

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        example = digitalocean.Vpc("example",
            name="example-project-network",
            region="nyc3")
        example_droplet = digitalocean.Droplet("example",
            name="example-01",
            size=digitalocean.DropletSlug.DROPLET_S1_VCPU1_GB,
            image="ubuntu-18-04-x64",
            region=digitalocean.Region.NYC3,
            vpc_uuid=example.id)
        ```

        ## Import

        A VPC can be imported using its `id`, e.g.

        ```sh
        $ pulumi import digitalocean:index/vpc:Vpc example 506f78a4-e098-11e5-ad9f-000f53306ae1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] description: A free-form text field up to a limit of 255 characters to describe the VPC.
        :param pulumi.Input[builtins.str] ip_range: The range of IP addresses for the VPC in CIDR notation. Network ranges cannot overlap with other networks in the same account and must be in range of private addresses as defined in RFC1918. It may not be larger than `/16` or smaller than `/24`.
        :param pulumi.Input[builtins.str] name: A name for the VPC. Must be unique and contain alphanumeric characters, dashes, and periods only.
        :param pulumi.Input[builtins.str] region: The DigitalOcean region slug for the VPC's location.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: VpcArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a [DigitalOcean VPC](https://docs.digitalocean.com/reference/api/digitalocean/#tag/VPCs) resource.

        VPCs are virtual networks containing resources that can communicate with each
        other in full isolation, using private IP addresses.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        example = digitalocean.Vpc("example",
            name="example-project-network",
            region="nyc3",
            ip_range="10.10.10.0/24")
        ```

        ### Resource Assignment

        `Droplet`, `KubernetesCluster`,
        `digitalocean_load_balancer`, and `DatabaseCluster` resources
        may be assigned to a VPC by referencing its `id`. For example:

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        example = digitalocean.Vpc("example",
            name="example-project-network",
            region="nyc3")
        example_droplet = digitalocean.Droplet("example",
            name="example-01",
            size=digitalocean.DropletSlug.DROPLET_S1_VCPU1_GB,
            image="ubuntu-18-04-x64",
            region=digitalocean.Region.NYC3,
            vpc_uuid=example.id)
        ```

        ## Import

        A VPC can be imported using its `id`, e.g.

        ```sh
        $ pulumi import digitalocean:index/vpc:Vpc example 506f78a4-e098-11e5-ad9f-000f53306ae1
        ```

        :param str resource_name: The name of the resource.
        :param VpcArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(VpcArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 ip_range: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 region: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = VpcArgs.__new__(VpcArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["ip_range"] = ip_range
            __props__.__dict__["name"] = name
            if region is None and not opts.urn:
                raise TypeError("Missing required property 'region'")
            __props__.__dict__["region"] = region
            __props__.__dict__["created_at"] = None
            __props__.__dict__["default"] = None
            __props__.__dict__["vpc_urn"] = None
        super(Vpc, __self__).__init__(
            'digitalocean:index/vpc:Vpc',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            created_at: Optional[pulumi.Input[builtins.str]] = None,
            default: Optional[pulumi.Input[builtins.bool]] = None,
            description: Optional[pulumi.Input[builtins.str]] = None,
            ip_range: Optional[pulumi.Input[builtins.str]] = None,
            name: Optional[pulumi.Input[builtins.str]] = None,
            region: Optional[pulumi.Input[builtins.str]] = None,
            vpc_urn: Optional[pulumi.Input[builtins.str]] = None) -> 'Vpc':
        """
        Get an existing Vpc resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] created_at: The date and time of when the VPC was created.
        :param pulumi.Input[builtins.bool] default: A boolean indicating whether or not the VPC is the default one for the region.
        :param pulumi.Input[builtins.str] description: A free-form text field up to a limit of 255 characters to describe the VPC.
        :param pulumi.Input[builtins.str] ip_range: The range of IP addresses for the VPC in CIDR notation. Network ranges cannot overlap with other networks in the same account and must be in range of private addresses as defined in RFC1918. It may not be larger than `/16` or smaller than `/24`.
        :param pulumi.Input[builtins.str] name: A name for the VPC. Must be unique and contain alphanumeric characters, dashes, and periods only.
        :param pulumi.Input[builtins.str] region: The DigitalOcean region slug for the VPC's location.
        :param pulumi.Input[builtins.str] vpc_urn: The uniform resource name (URN) for the VPC.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _VpcState.__new__(_VpcState)

        __props__.__dict__["created_at"] = created_at
        __props__.__dict__["default"] = default
        __props__.__dict__["description"] = description
        __props__.__dict__["ip_range"] = ip_range
        __props__.__dict__["name"] = name
        __props__.__dict__["region"] = region
        __props__.__dict__["vpc_urn"] = vpc_urn
        return Vpc(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> pulumi.Output[builtins.str]:
        """
        The date and time of when the VPC was created.
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter
    def default(self) -> pulumi.Output[builtins.bool]:
        """
        A boolean indicating whether or not the VPC is the default one for the region.
        """
        return pulumi.get(self, "default")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        A free-form text field up to a limit of 255 characters to describe the VPC.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="ipRange")
    def ip_range(self) -> pulumi.Output[builtins.str]:
        """
        The range of IP addresses for the VPC in CIDR notation. Network ranges cannot overlap with other networks in the same account and must be in range of private addresses as defined in RFC1918. It may not be larger than `/16` or smaller than `/24`.
        """
        return pulumi.get(self, "ip_range")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[builtins.str]:
        """
        A name for the VPC. Must be unique and contain alphanumeric characters, dashes, and periods only.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def region(self) -> pulumi.Output[builtins.str]:
        """
        The DigitalOcean region slug for the VPC's location.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="vpcUrn")
    def vpc_urn(self) -> pulumi.Output[builtins.str]:
        """
        The uniform resource name (URN) for the VPC.
        """
        return pulumi.get(self, "vpc_urn")

