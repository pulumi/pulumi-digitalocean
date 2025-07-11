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
    'GetSpacesBucketObjectsResult',
    'AwaitableGetSpacesBucketObjectsResult',
    'get_spaces_bucket_objects',
    'get_spaces_bucket_objects_output',
]

@pulumi.output_type
class GetSpacesBucketObjectsResult:
    """
    A collection of values returned by getSpacesBucketObjects.
    """
    def __init__(__self__, bucket=None, common_prefixes=None, delimiter=None, encoding_type=None, id=None, keys=None, max_keys=None, owners=None, prefix=None, region=None):
        if bucket and not isinstance(bucket, str):
            raise TypeError("Expected argument 'bucket' to be a str")
        pulumi.set(__self__, "bucket", bucket)
        if common_prefixes and not isinstance(common_prefixes, list):
            raise TypeError("Expected argument 'common_prefixes' to be a list")
        pulumi.set(__self__, "common_prefixes", common_prefixes)
        if delimiter and not isinstance(delimiter, str):
            raise TypeError("Expected argument 'delimiter' to be a str")
        pulumi.set(__self__, "delimiter", delimiter)
        if encoding_type and not isinstance(encoding_type, str):
            raise TypeError("Expected argument 'encoding_type' to be a str")
        pulumi.set(__self__, "encoding_type", encoding_type)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if keys and not isinstance(keys, list):
            raise TypeError("Expected argument 'keys' to be a list")
        pulumi.set(__self__, "keys", keys)
        if max_keys and not isinstance(max_keys, int):
            raise TypeError("Expected argument 'max_keys' to be a int")
        pulumi.set(__self__, "max_keys", max_keys)
        if owners and not isinstance(owners, list):
            raise TypeError("Expected argument 'owners' to be a list")
        pulumi.set(__self__, "owners", owners)
        if prefix and not isinstance(prefix, str):
            raise TypeError("Expected argument 'prefix' to be a str")
        pulumi.set(__self__, "prefix", prefix)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)

    @property
    @pulumi.getter
    def bucket(self) -> builtins.str:
        return pulumi.get(self, "bucket")

    @property
    @pulumi.getter(name="commonPrefixes")
    def common_prefixes(self) -> Sequence[builtins.str]:
        """
        List of any keys between `prefix` and the next occurrence of `delimiter` (i.e., similar to subdirectories of the `prefix` "directory"); the list is only returned when you specify `delimiter`
        """
        return pulumi.get(self, "common_prefixes")

    @property
    @pulumi.getter
    def delimiter(self) -> Optional[builtins.str]:
        return pulumi.get(self, "delimiter")

    @property
    @pulumi.getter(name="encodingType")
    def encoding_type(self) -> Optional[builtins.str]:
        return pulumi.get(self, "encoding_type")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def keys(self) -> Sequence[builtins.str]:
        """
        List of strings representing object keys
        """
        return pulumi.get(self, "keys")

    @property
    @pulumi.getter(name="maxKeys")
    def max_keys(self) -> Optional[builtins.int]:
        return pulumi.get(self, "max_keys")

    @property
    @pulumi.getter
    def owners(self) -> Sequence[builtins.str]:
        """
        List of strings representing object owner IDs
        """
        return pulumi.get(self, "owners")

    @property
    @pulumi.getter
    def prefix(self) -> Optional[builtins.str]:
        return pulumi.get(self, "prefix")

    @property
    @pulumi.getter
    def region(self) -> builtins.str:
        return pulumi.get(self, "region")


class AwaitableGetSpacesBucketObjectsResult(GetSpacesBucketObjectsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSpacesBucketObjectsResult(
            bucket=self.bucket,
            common_prefixes=self.common_prefixes,
            delimiter=self.delimiter,
            encoding_type=self.encoding_type,
            id=self.id,
            keys=self.keys,
            max_keys=self.max_keys,
            owners=self.owners,
            prefix=self.prefix,
            region=self.region)


def get_spaces_bucket_objects(bucket: Optional[builtins.str] = None,
                              delimiter: Optional[builtins.str] = None,
                              encoding_type: Optional[builtins.str] = None,
                              max_keys: Optional[builtins.int] = None,
                              prefix: Optional[builtins.str] = None,
                              region: Optional[builtins.str] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSpacesBucketObjectsResult:
    """
    > **NOTE on `max_keys`:** Retrieving very large numbers of keys can adversely affect the provider's performance.

    The bucket-objects data source returns keys (i.e., file names) and other metadata about objects in a Spaces bucket.


    :param builtins.str bucket: Lists object keys in this Spaces bucket
    :param builtins.str delimiter: A character used to group keys (Default: none)
    :param builtins.str encoding_type: Encodes keys using this method (Default: none; besides none, only "url" can be used)
    :param builtins.int max_keys: Maximum object keys to return (Default: 1000)
    :param builtins.str prefix: Limits results to object keys with this prefix (Default: none)
    :param builtins.str region: The slug of the region where the bucket is stored.
    """
    __args__ = dict()
    __args__['bucket'] = bucket
    __args__['delimiter'] = delimiter
    __args__['encodingType'] = encoding_type
    __args__['maxKeys'] = max_keys
    __args__['prefix'] = prefix
    __args__['region'] = region
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('digitalocean:index/getSpacesBucketObjects:getSpacesBucketObjects', __args__, opts=opts, typ=GetSpacesBucketObjectsResult).value

    return AwaitableGetSpacesBucketObjectsResult(
        bucket=pulumi.get(__ret__, 'bucket'),
        common_prefixes=pulumi.get(__ret__, 'common_prefixes'),
        delimiter=pulumi.get(__ret__, 'delimiter'),
        encoding_type=pulumi.get(__ret__, 'encoding_type'),
        id=pulumi.get(__ret__, 'id'),
        keys=pulumi.get(__ret__, 'keys'),
        max_keys=pulumi.get(__ret__, 'max_keys'),
        owners=pulumi.get(__ret__, 'owners'),
        prefix=pulumi.get(__ret__, 'prefix'),
        region=pulumi.get(__ret__, 'region'))
def get_spaces_bucket_objects_output(bucket: Optional[pulumi.Input[builtins.str]] = None,
                                     delimiter: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                                     encoding_type: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                                     max_keys: Optional[pulumi.Input[Optional[builtins.int]]] = None,
                                     prefix: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                                     region: Optional[pulumi.Input[builtins.str]] = None,
                                     opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetSpacesBucketObjectsResult]:
    """
    > **NOTE on `max_keys`:** Retrieving very large numbers of keys can adversely affect the provider's performance.

    The bucket-objects data source returns keys (i.e., file names) and other metadata about objects in a Spaces bucket.


    :param builtins.str bucket: Lists object keys in this Spaces bucket
    :param builtins.str delimiter: A character used to group keys (Default: none)
    :param builtins.str encoding_type: Encodes keys using this method (Default: none; besides none, only "url" can be used)
    :param builtins.int max_keys: Maximum object keys to return (Default: 1000)
    :param builtins.str prefix: Limits results to object keys with this prefix (Default: none)
    :param builtins.str region: The slug of the region where the bucket is stored.
    """
    __args__ = dict()
    __args__['bucket'] = bucket
    __args__['delimiter'] = delimiter
    __args__['encodingType'] = encoding_type
    __args__['maxKeys'] = max_keys
    __args__['prefix'] = prefix
    __args__['region'] = region
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('digitalocean:index/getSpacesBucketObjects:getSpacesBucketObjects', __args__, opts=opts, typ=GetSpacesBucketObjectsResult)
    return __ret__.apply(lambda __response__: GetSpacesBucketObjectsResult(
        bucket=pulumi.get(__response__, 'bucket'),
        common_prefixes=pulumi.get(__response__, 'common_prefixes'),
        delimiter=pulumi.get(__response__, 'delimiter'),
        encoding_type=pulumi.get(__response__, 'encoding_type'),
        id=pulumi.get(__response__, 'id'),
        keys=pulumi.get(__response__, 'keys'),
        max_keys=pulumi.get(__response__, 'max_keys'),
        owners=pulumi.get(__response__, 'owners'),
        prefix=pulumi.get(__response__, 'prefix'),
        region=pulumi.get(__response__, 'region')))
