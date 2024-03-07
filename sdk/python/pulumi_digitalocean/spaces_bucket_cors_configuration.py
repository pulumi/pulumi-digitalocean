# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['SpacesBucketCorsConfigurationArgs', 'SpacesBucketCorsConfiguration']

@pulumi.input_type
class SpacesBucketCorsConfigurationArgs:
    def __init__(__self__, *,
                 bucket: pulumi.Input[str],
                 cors_rules: pulumi.Input[Sequence[pulumi.Input['SpacesBucketCorsConfigurationCorsRuleArgs']]],
                 region: pulumi.Input[str]):
        """
        The set of arguments for constructing a SpacesBucketCorsConfiguration resource.
        :param pulumi.Input[str] bucket: The name of the bucket to which to apply the CORS configuration.
        :param pulumi.Input[Sequence[pulumi.Input['SpacesBucketCorsConfigurationCorsRuleArgs']]] cors_rules: Set of origins and methods (cross-origin access that you want to allow). See below. You can configure up to 100 rules.
        :param pulumi.Input[str] region: The region where the bucket resides.
        """
        pulumi.set(__self__, "bucket", bucket)
        pulumi.set(__self__, "cors_rules", cors_rules)
        pulumi.set(__self__, "region", region)

    @property
    @pulumi.getter
    def bucket(self) -> pulumi.Input[str]:
        """
        The name of the bucket to which to apply the CORS configuration.
        """
        return pulumi.get(self, "bucket")

    @bucket.setter
    def bucket(self, value: pulumi.Input[str]):
        pulumi.set(self, "bucket", value)

    @property
    @pulumi.getter(name="corsRules")
    def cors_rules(self) -> pulumi.Input[Sequence[pulumi.Input['SpacesBucketCorsConfigurationCorsRuleArgs']]]:
        """
        Set of origins and methods (cross-origin access that you want to allow). See below. You can configure up to 100 rules.
        """
        return pulumi.get(self, "cors_rules")

    @cors_rules.setter
    def cors_rules(self, value: pulumi.Input[Sequence[pulumi.Input['SpacesBucketCorsConfigurationCorsRuleArgs']]]):
        pulumi.set(self, "cors_rules", value)

    @property
    @pulumi.getter
    def region(self) -> pulumi.Input[str]:
        """
        The region where the bucket resides.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: pulumi.Input[str]):
        pulumi.set(self, "region", value)


@pulumi.input_type
class _SpacesBucketCorsConfigurationState:
    def __init__(__self__, *,
                 bucket: Optional[pulumi.Input[str]] = None,
                 cors_rules: Optional[pulumi.Input[Sequence[pulumi.Input['SpacesBucketCorsConfigurationCorsRuleArgs']]]] = None,
                 region: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering SpacesBucketCorsConfiguration resources.
        :param pulumi.Input[str] bucket: The name of the bucket to which to apply the CORS configuration.
        :param pulumi.Input[Sequence[pulumi.Input['SpacesBucketCorsConfigurationCorsRuleArgs']]] cors_rules: Set of origins and methods (cross-origin access that you want to allow). See below. You can configure up to 100 rules.
        :param pulumi.Input[str] region: The region where the bucket resides.
        """
        if bucket is not None:
            pulumi.set(__self__, "bucket", bucket)
        if cors_rules is not None:
            pulumi.set(__self__, "cors_rules", cors_rules)
        if region is not None:
            pulumi.set(__self__, "region", region)

    @property
    @pulumi.getter
    def bucket(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the bucket to which to apply the CORS configuration.
        """
        return pulumi.get(self, "bucket")

    @bucket.setter
    def bucket(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bucket", value)

    @property
    @pulumi.getter(name="corsRules")
    def cors_rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['SpacesBucketCorsConfigurationCorsRuleArgs']]]]:
        """
        Set of origins and methods (cross-origin access that you want to allow). See below. You can configure up to 100 rules.
        """
        return pulumi.get(self, "cors_rules")

    @cors_rules.setter
    def cors_rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['SpacesBucketCorsConfigurationCorsRuleArgs']]]]):
        pulumi.set(self, "cors_rules", value)

    @property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[str]]:
        """
        The region where the bucket resides.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region", value)


class SpacesBucketCorsConfiguration(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bucket: Optional[pulumi.Input[str]] = None,
                 cors_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SpacesBucketCorsConfigurationCorsRuleArgs']]]]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ### Create a Key in a Spaces Bucket

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        foobar = digitalocean.SpacesBucket("foobar", region="nyc3")
        test = digitalocean.SpacesBucketCorsConfiguration("test",
            bucket=foobar.id,
            region="nyc3",
            cors_rules=[digitalocean.SpacesBucketCorsConfigurationCorsRuleArgs(
                allowed_headers=["*"],
                allowed_methods=[
                    "PUT",
                    "POST",
                ],
                allowed_origins=["https://s3-website-test.hashicorp.com"],
                expose_headers=["ETag"],
                max_age_seconds=3000,
            )])
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Bucket policies can be imported using the `region` and `bucket` attributes (delimited by a comma):

        ```sh
        $ pulumi import digitalocean:index/spacesBucketCorsConfiguration:SpacesBucketCorsConfiguration foobar `region`,`bucket`
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] bucket: The name of the bucket to which to apply the CORS configuration.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SpacesBucketCorsConfigurationCorsRuleArgs']]]] cors_rules: Set of origins and methods (cross-origin access that you want to allow). See below. You can configure up to 100 rules.
        :param pulumi.Input[str] region: The region where the bucket resides.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SpacesBucketCorsConfigurationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ### Create a Key in a Spaces Bucket

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        foobar = digitalocean.SpacesBucket("foobar", region="nyc3")
        test = digitalocean.SpacesBucketCorsConfiguration("test",
            bucket=foobar.id,
            region="nyc3",
            cors_rules=[digitalocean.SpacesBucketCorsConfigurationCorsRuleArgs(
                allowed_headers=["*"],
                allowed_methods=[
                    "PUT",
                    "POST",
                ],
                allowed_origins=["https://s3-website-test.hashicorp.com"],
                expose_headers=["ETag"],
                max_age_seconds=3000,
            )])
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Bucket policies can be imported using the `region` and `bucket` attributes (delimited by a comma):

        ```sh
        $ pulumi import digitalocean:index/spacesBucketCorsConfiguration:SpacesBucketCorsConfiguration foobar `region`,`bucket`
        ```

        :param str resource_name: The name of the resource.
        :param SpacesBucketCorsConfigurationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SpacesBucketCorsConfigurationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bucket: Optional[pulumi.Input[str]] = None,
                 cors_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SpacesBucketCorsConfigurationCorsRuleArgs']]]]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SpacesBucketCorsConfigurationArgs.__new__(SpacesBucketCorsConfigurationArgs)

            if bucket is None and not opts.urn:
                raise TypeError("Missing required property 'bucket'")
            __props__.__dict__["bucket"] = bucket
            if cors_rules is None and not opts.urn:
                raise TypeError("Missing required property 'cors_rules'")
            __props__.__dict__["cors_rules"] = cors_rules
            if region is None and not opts.urn:
                raise TypeError("Missing required property 'region'")
            __props__.__dict__["region"] = region
        super(SpacesBucketCorsConfiguration, __self__).__init__(
            'digitalocean:index/spacesBucketCorsConfiguration:SpacesBucketCorsConfiguration',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            bucket: Optional[pulumi.Input[str]] = None,
            cors_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SpacesBucketCorsConfigurationCorsRuleArgs']]]]] = None,
            region: Optional[pulumi.Input[str]] = None) -> 'SpacesBucketCorsConfiguration':
        """
        Get an existing SpacesBucketCorsConfiguration resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] bucket: The name of the bucket to which to apply the CORS configuration.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SpacesBucketCorsConfigurationCorsRuleArgs']]]] cors_rules: Set of origins and methods (cross-origin access that you want to allow). See below. You can configure up to 100 rules.
        :param pulumi.Input[str] region: The region where the bucket resides.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SpacesBucketCorsConfigurationState.__new__(_SpacesBucketCorsConfigurationState)

        __props__.__dict__["bucket"] = bucket
        __props__.__dict__["cors_rules"] = cors_rules
        __props__.__dict__["region"] = region
        return SpacesBucketCorsConfiguration(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def bucket(self) -> pulumi.Output[str]:
        """
        The name of the bucket to which to apply the CORS configuration.
        """
        return pulumi.get(self, "bucket")

    @property
    @pulumi.getter(name="corsRules")
    def cors_rules(self) -> pulumi.Output[Sequence['outputs.SpacesBucketCorsConfigurationCorsRule']]:
        """
        Set of origins and methods (cross-origin access that you want to allow). See below. You can configure up to 100 rules.
        """
        return pulumi.get(self, "cors_rules")

    @property
    @pulumi.getter
    def region(self) -> pulumi.Output[str]:
        """
        The region where the bucket resides.
        """
        return pulumi.get(self, "region")

