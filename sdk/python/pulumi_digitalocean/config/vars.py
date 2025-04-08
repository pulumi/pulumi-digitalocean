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
from .. import _utilities

import types

__config__ = pulumi.Config('digitalocean')


class _ExportableConfig(types.ModuleType):
    @property
    def api_endpoint(self) -> str:
        """
        The URL to use for the DigitalOcean API.
        """
        return __config__.get('apiEndpoint') or (_utilities.get_env('DIGITALOCEAN_API_URL') or 'https://api.digitalocean.com')

    @property
    def http_retry_max(self) -> Optional[int]:
        """
        The maximum number of retries on a failed API request.
        """
        return __config__.get_int('httpRetryMax')

    @property
    def http_retry_wait_max(self) -> Optional[float]:
        """
        The maximum wait time (in seconds) between failed API requests.
        """
        return __config__.get_float('httpRetryWaitMax')

    @property
    def http_retry_wait_min(self) -> Optional[float]:
        """
        The minimum wait time (in seconds) between failed API requests.
        """
        return __config__.get_float('httpRetryWaitMin')

    @property
    def requests_per_second(self) -> Optional[float]:
        """
        The rate of requests per second to limit the HTTP client.
        """
        return __config__.get_float('requestsPerSecond')

    @property
    def spaces_access_id(self) -> Optional[str]:
        """
        The access key ID for Spaces API operations.
        """
        return __config__.get('spacesAccessId')

    @property
    def spaces_endpoint(self) -> Optional[str]:
        """
        The URL to use for the DigitalOcean Spaces API.
        """
        return __config__.get('spacesEndpoint') or _utilities.get_env('SPACES_ENDPOINT_URL')

    @property
    def spaces_secret_key(self) -> Optional[str]:
        """
        The secret access key for Spaces API operations.
        """
        return __config__.get('spacesSecretKey')

    @property
    def token(self) -> Optional[str]:
        """
        The token key for API operations.
        """
        return __config__.get('token')

