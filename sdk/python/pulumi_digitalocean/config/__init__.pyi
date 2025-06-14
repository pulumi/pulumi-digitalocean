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
from .. import _utilities

apiEndpoint: str
"""
The URL to use for the DigitalOcean API.
"""

httpRetryMax: Optional[int]
"""
The maximum number of retries on a failed API request.
"""

httpRetryWaitMax: Optional[float]
"""
The maximum wait time (in seconds) between failed API requests.
"""

httpRetryWaitMin: Optional[float]
"""
The minimum wait time (in seconds) between failed API requests.
"""

requestsPerSecond: Optional[float]
"""
The rate of requests per second to limit the HTTP client.
"""

spacesAccessId: Optional[str]
"""
The access key ID for Spaces API operations.
"""

spacesEndpoint: Optional[str]
"""
The URL to use for the DigitalOcean Spaces API.
"""

spacesSecretKey: Optional[str]
"""
The secret access key for Spaces API operations.
"""

token: Optional[str]
"""
The token key for API operations.
"""

