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

__all__ = ['SpacesBucketPolicyArgs', 'SpacesBucketPolicy']

@pulumi.input_type
class SpacesBucketPolicyArgs:
    def __init__(__self__, *,
                 bucket: pulumi.Input[str],
                 policy: pulumi.Input[str],
                 region: pulumi.Input[str]):
        """
        The set of arguments for constructing a SpacesBucketPolicy resource.
        :param pulumi.Input[str] bucket: The name of the bucket to which to apply the policy.
        :param pulumi.Input[str] policy: The text of the policy.
        :param pulumi.Input[str] region: The region where the bucket resides.
        """
        pulumi.set(__self__, "bucket", bucket)
        pulumi.set(__self__, "policy", policy)
        pulumi.set(__self__, "region", region)

    @property
    @pulumi.getter
    def bucket(self) -> pulumi.Input[str]:
        """
        The name of the bucket to which to apply the policy.
        """
        return pulumi.get(self, "bucket")

    @bucket.setter
    def bucket(self, value: pulumi.Input[str]):
        pulumi.set(self, "bucket", value)

    @property
    @pulumi.getter
    def policy(self) -> pulumi.Input[str]:
        """
        The text of the policy.
        """
        return pulumi.get(self, "policy")

    @policy.setter
    def policy(self, value: pulumi.Input[str]):
        pulumi.set(self, "policy", value)

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
class _SpacesBucketPolicyState:
    def __init__(__self__, *,
                 bucket: Optional[pulumi.Input[str]] = None,
                 policy: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering SpacesBucketPolicy resources.
        :param pulumi.Input[str] bucket: The name of the bucket to which to apply the policy.
        :param pulumi.Input[str] policy: The text of the policy.
        :param pulumi.Input[str] region: The region where the bucket resides.
        """
        if bucket is not None:
            pulumi.set(__self__, "bucket", bucket)
        if policy is not None:
            pulumi.set(__self__, "policy", policy)
        if region is not None:
            pulumi.set(__self__, "region", region)

    @property
    @pulumi.getter
    def bucket(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the bucket to which to apply the policy.
        """
        return pulumi.get(self, "bucket")

    @bucket.setter
    def bucket(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bucket", value)

    @property
    @pulumi.getter
    def policy(self) -> Optional[pulumi.Input[str]]:
        """
        The text of the policy.
        """
        return pulumi.get(self, "policy")

    @policy.setter
    def policy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "policy", value)

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


class SpacesBucketPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bucket: Optional[pulumi.Input[str]] = None,
                 policy: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ### Limiting access to specific IP addresses

        ```python
        import pulumi
        import json
        import pulumi_digitalocean as digitalocean

        foobar = digitalocean.SpacesBucket("foobar",
            name="foobar",
            region=digitalocean.Region.NYC3)
        foobar_spaces_bucket_policy = digitalocean.SpacesBucketPolicy("foobar",
            region=foobar.region,
            bucket=foobar.name,
            policy=pulumi.Output.json_dumps({
                "Version": "2012-10-17",
                "Statement": [{
                    "Sid": "IPAllow",
                    "Effect": "Deny",
                    "Principal": "*",
                    "Action": "s3:*",
                    "Resource": [
                        foobar.name.apply(lambda name: f"arn:aws:s3:::{name}"),
                        foobar.name.apply(lambda name: f"arn:aws:s3:::{name}/*"),
                    ],
                    "Condition": {
                        "NotIpAddress": {
                            "aws:SourceIp": "54.240.143.0/24",
                        },
                    },
                }],
            }))
        ```

        !> **Warning:** Before using this policy, replace the 54.240.143.0/24 IP address range in this example with an appropriate value for your use case. Otherwise, you will lose the ability to access your bucket.

        ## Import

        Bucket policies can be imported using the `region` and `bucket` attributes (delimited by a comma):

        ```sh
        $ pulumi import digitalocean:index/spacesBucketPolicy:SpacesBucketPolicy foobar `region`,`bucket`
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] bucket: The name of the bucket to which to apply the policy.
        :param pulumi.Input[str] policy: The text of the policy.
        :param pulumi.Input[str] region: The region where the bucket resides.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SpacesBucketPolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ### Limiting access to specific IP addresses

        ```python
        import pulumi
        import json
        import pulumi_digitalocean as digitalocean

        foobar = digitalocean.SpacesBucket("foobar",
            name="foobar",
            region=digitalocean.Region.NYC3)
        foobar_spaces_bucket_policy = digitalocean.SpacesBucketPolicy("foobar",
            region=foobar.region,
            bucket=foobar.name,
            policy=pulumi.Output.json_dumps({
                "Version": "2012-10-17",
                "Statement": [{
                    "Sid": "IPAllow",
                    "Effect": "Deny",
                    "Principal": "*",
                    "Action": "s3:*",
                    "Resource": [
                        foobar.name.apply(lambda name: f"arn:aws:s3:::{name}"),
                        foobar.name.apply(lambda name: f"arn:aws:s3:::{name}/*"),
                    ],
                    "Condition": {
                        "NotIpAddress": {
                            "aws:SourceIp": "54.240.143.0/24",
                        },
                    },
                }],
            }))
        ```

        !> **Warning:** Before using this policy, replace the 54.240.143.0/24 IP address range in this example with an appropriate value for your use case. Otherwise, you will lose the ability to access your bucket.

        ## Import

        Bucket policies can be imported using the `region` and `bucket` attributes (delimited by a comma):

        ```sh
        $ pulumi import digitalocean:index/spacesBucketPolicy:SpacesBucketPolicy foobar `region`,`bucket`
        ```

        :param str resource_name: The name of the resource.
        :param SpacesBucketPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SpacesBucketPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bucket: Optional[pulumi.Input[str]] = None,
                 policy: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SpacesBucketPolicyArgs.__new__(SpacesBucketPolicyArgs)

            if bucket is None and not opts.urn:
                raise TypeError("Missing required property 'bucket'")
            __props__.__dict__["bucket"] = bucket
            if policy is None and not opts.urn:
                raise TypeError("Missing required property 'policy'")
            __props__.__dict__["policy"] = policy
            if region is None and not opts.urn:
                raise TypeError("Missing required property 'region'")
            __props__.__dict__["region"] = region
        super(SpacesBucketPolicy, __self__).__init__(
            'digitalocean:index/spacesBucketPolicy:SpacesBucketPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            bucket: Optional[pulumi.Input[str]] = None,
            policy: Optional[pulumi.Input[str]] = None,
            region: Optional[pulumi.Input[str]] = None) -> 'SpacesBucketPolicy':
        """
        Get an existing SpacesBucketPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] bucket: The name of the bucket to which to apply the policy.
        :param pulumi.Input[str] policy: The text of the policy.
        :param pulumi.Input[str] region: The region where the bucket resides.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SpacesBucketPolicyState.__new__(_SpacesBucketPolicyState)

        __props__.__dict__["bucket"] = bucket
        __props__.__dict__["policy"] = policy
        __props__.__dict__["region"] = region
        return SpacesBucketPolicy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def bucket(self) -> pulumi.Output[str]:
        """
        The name of the bucket to which to apply the policy.
        """
        return pulumi.get(self, "bucket")

    @property
    @pulumi.getter
    def policy(self) -> pulumi.Output[str]:
        """
        The text of the policy.
        """
        return pulumi.get(self, "policy")

    @property
    @pulumi.getter
    def region(self) -> pulumi.Output[str]:
        """
        The region where the bucket resides.
        """
        return pulumi.get(self, "region")

