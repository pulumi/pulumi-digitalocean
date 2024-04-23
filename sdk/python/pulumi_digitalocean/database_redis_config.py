# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['DatabaseRedisConfigArgs', 'DatabaseRedisConfig']

@pulumi.input_type
class DatabaseRedisConfigArgs:
    def __init__(__self__, *,
                 cluster_id: pulumi.Input[str],
                 acl_channels_default: Optional[pulumi.Input[str]] = None,
                 io_threads: Optional[pulumi.Input[int]] = None,
                 lfu_decay_time: Optional[pulumi.Input[int]] = None,
                 lfu_log_factor: Optional[pulumi.Input[int]] = None,
                 maxmemory_policy: Optional[pulumi.Input[str]] = None,
                 notify_keyspace_events: Optional[pulumi.Input[str]] = None,
                 number_of_databases: Optional[pulumi.Input[int]] = None,
                 persistence: Optional[pulumi.Input[str]] = None,
                 pubsub_client_output_buffer_limit: Optional[pulumi.Input[int]] = None,
                 ssl: Optional[pulumi.Input[bool]] = None,
                 timeout: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a DatabaseRedisConfig resource.
        :param pulumi.Input[str] cluster_id: The ID of the target Redis cluster.
        :param pulumi.Input[str] acl_channels_default: Determines default pub/sub channels' ACL for new users if an ACL is not supplied. When this option is not defined, `allchannels` is assumed to keep backward compatibility. This option doesn't affect Redis' `acl-pubsub-default` configuration. Supported values are: `allchannels` and `resetchannels`
        :param pulumi.Input[int] io_threads: The Redis IO thread count.
        :param pulumi.Input[int] lfu_decay_time: The LFU maxmemory policy counter decay time in minutes.
        :param pulumi.Input[int] lfu_log_factor: The counter logarithm factor for volatile-lfu and allkeys-lfu maxmemory policies.
        :param pulumi.Input[str] maxmemory_policy: A string specifying the desired eviction policy for the Redis cluster.Supported values are: `noeviction`, `allkeys-lru`, `allkeys-random`, `volatile-lru`, `volatile-random`, `volatile-ttl`
        :param pulumi.Input[str] notify_keyspace_events: The `notify-keyspace-events` option. Requires at least `K` or `E`.
        :param pulumi.Input[int] number_of_databases: The number of Redis databases. Changing this will cause a restart of Redis service.
        :param pulumi.Input[str] persistence: When persistence is `rdb`, Redis does RDB dumps each 10 minutes if any key is changed. Also RDB dumps are done according to backup schedule for backup purposes. When persistence is `off`, no RDB dumps and backups are done, so data can be lost at any moment if service is restarted for any reason, or if service is powered off. Also service can't be forked.
        :param pulumi.Input[int] pubsub_client_output_buffer_limit: The output buffer limit for pub/sub clients in MB. The value is the hard limit, the soft limit is 1/4 of the hard limit. When setting the limit, be mindful of the available memory in the selected service plan.
        :param pulumi.Input[bool] ssl: A boolean indicating whether to require SSL to access Redis.
        :param pulumi.Input[int] timeout: The Redis idle connection timeout in seconds.
        """
        pulumi.set(__self__, "cluster_id", cluster_id)
        if acl_channels_default is not None:
            pulumi.set(__self__, "acl_channels_default", acl_channels_default)
        if io_threads is not None:
            pulumi.set(__self__, "io_threads", io_threads)
        if lfu_decay_time is not None:
            pulumi.set(__self__, "lfu_decay_time", lfu_decay_time)
        if lfu_log_factor is not None:
            pulumi.set(__self__, "lfu_log_factor", lfu_log_factor)
        if maxmemory_policy is not None:
            pulumi.set(__self__, "maxmemory_policy", maxmemory_policy)
        if notify_keyspace_events is not None:
            pulumi.set(__self__, "notify_keyspace_events", notify_keyspace_events)
        if number_of_databases is not None:
            pulumi.set(__self__, "number_of_databases", number_of_databases)
        if persistence is not None:
            pulumi.set(__self__, "persistence", persistence)
        if pubsub_client_output_buffer_limit is not None:
            pulumi.set(__self__, "pubsub_client_output_buffer_limit", pubsub_client_output_buffer_limit)
        if ssl is not None:
            pulumi.set(__self__, "ssl", ssl)
        if timeout is not None:
            pulumi.set(__self__, "timeout", timeout)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Input[str]:
        """
        The ID of the target Redis cluster.
        """
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter(name="aclChannelsDefault")
    def acl_channels_default(self) -> Optional[pulumi.Input[str]]:
        """
        Determines default pub/sub channels' ACL for new users if an ACL is not supplied. When this option is not defined, `allchannels` is assumed to keep backward compatibility. This option doesn't affect Redis' `acl-pubsub-default` configuration. Supported values are: `allchannels` and `resetchannels`
        """
        return pulumi.get(self, "acl_channels_default")

    @acl_channels_default.setter
    def acl_channels_default(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "acl_channels_default", value)

    @property
    @pulumi.getter(name="ioThreads")
    def io_threads(self) -> Optional[pulumi.Input[int]]:
        """
        The Redis IO thread count.
        """
        return pulumi.get(self, "io_threads")

    @io_threads.setter
    def io_threads(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "io_threads", value)

    @property
    @pulumi.getter(name="lfuDecayTime")
    def lfu_decay_time(self) -> Optional[pulumi.Input[int]]:
        """
        The LFU maxmemory policy counter decay time in minutes.
        """
        return pulumi.get(self, "lfu_decay_time")

    @lfu_decay_time.setter
    def lfu_decay_time(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "lfu_decay_time", value)

    @property
    @pulumi.getter(name="lfuLogFactor")
    def lfu_log_factor(self) -> Optional[pulumi.Input[int]]:
        """
        The counter logarithm factor for volatile-lfu and allkeys-lfu maxmemory policies.
        """
        return pulumi.get(self, "lfu_log_factor")

    @lfu_log_factor.setter
    def lfu_log_factor(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "lfu_log_factor", value)

    @property
    @pulumi.getter(name="maxmemoryPolicy")
    def maxmemory_policy(self) -> Optional[pulumi.Input[str]]:
        """
        A string specifying the desired eviction policy for the Redis cluster.Supported values are: `noeviction`, `allkeys-lru`, `allkeys-random`, `volatile-lru`, `volatile-random`, `volatile-ttl`
        """
        return pulumi.get(self, "maxmemory_policy")

    @maxmemory_policy.setter
    def maxmemory_policy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "maxmemory_policy", value)

    @property
    @pulumi.getter(name="notifyKeyspaceEvents")
    def notify_keyspace_events(self) -> Optional[pulumi.Input[str]]:
        """
        The `notify-keyspace-events` option. Requires at least `K` or `E`.
        """
        return pulumi.get(self, "notify_keyspace_events")

    @notify_keyspace_events.setter
    def notify_keyspace_events(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "notify_keyspace_events", value)

    @property
    @pulumi.getter(name="numberOfDatabases")
    def number_of_databases(self) -> Optional[pulumi.Input[int]]:
        """
        The number of Redis databases. Changing this will cause a restart of Redis service.
        """
        return pulumi.get(self, "number_of_databases")

    @number_of_databases.setter
    def number_of_databases(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "number_of_databases", value)

    @property
    @pulumi.getter
    def persistence(self) -> Optional[pulumi.Input[str]]:
        """
        When persistence is `rdb`, Redis does RDB dumps each 10 minutes if any key is changed. Also RDB dumps are done according to backup schedule for backup purposes. When persistence is `off`, no RDB dumps and backups are done, so data can be lost at any moment if service is restarted for any reason, or if service is powered off. Also service can't be forked.
        """
        return pulumi.get(self, "persistence")

    @persistence.setter
    def persistence(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "persistence", value)

    @property
    @pulumi.getter(name="pubsubClientOutputBufferLimit")
    def pubsub_client_output_buffer_limit(self) -> Optional[pulumi.Input[int]]:
        """
        The output buffer limit for pub/sub clients in MB. The value is the hard limit, the soft limit is 1/4 of the hard limit. When setting the limit, be mindful of the available memory in the selected service plan.
        """
        return pulumi.get(self, "pubsub_client_output_buffer_limit")

    @pubsub_client_output_buffer_limit.setter
    def pubsub_client_output_buffer_limit(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "pubsub_client_output_buffer_limit", value)

    @property
    @pulumi.getter
    def ssl(self) -> Optional[pulumi.Input[bool]]:
        """
        A boolean indicating whether to require SSL to access Redis.
        """
        return pulumi.get(self, "ssl")

    @ssl.setter
    def ssl(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "ssl", value)

    @property
    @pulumi.getter
    def timeout(self) -> Optional[pulumi.Input[int]]:
        """
        The Redis idle connection timeout in seconds.
        """
        return pulumi.get(self, "timeout")

    @timeout.setter
    def timeout(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "timeout", value)


@pulumi.input_type
class _DatabaseRedisConfigState:
    def __init__(__self__, *,
                 acl_channels_default: Optional[pulumi.Input[str]] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 io_threads: Optional[pulumi.Input[int]] = None,
                 lfu_decay_time: Optional[pulumi.Input[int]] = None,
                 lfu_log_factor: Optional[pulumi.Input[int]] = None,
                 maxmemory_policy: Optional[pulumi.Input[str]] = None,
                 notify_keyspace_events: Optional[pulumi.Input[str]] = None,
                 number_of_databases: Optional[pulumi.Input[int]] = None,
                 persistence: Optional[pulumi.Input[str]] = None,
                 pubsub_client_output_buffer_limit: Optional[pulumi.Input[int]] = None,
                 ssl: Optional[pulumi.Input[bool]] = None,
                 timeout: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering DatabaseRedisConfig resources.
        :param pulumi.Input[str] acl_channels_default: Determines default pub/sub channels' ACL for new users if an ACL is not supplied. When this option is not defined, `allchannels` is assumed to keep backward compatibility. This option doesn't affect Redis' `acl-pubsub-default` configuration. Supported values are: `allchannels` and `resetchannels`
        :param pulumi.Input[str] cluster_id: The ID of the target Redis cluster.
        :param pulumi.Input[int] io_threads: The Redis IO thread count.
        :param pulumi.Input[int] lfu_decay_time: The LFU maxmemory policy counter decay time in minutes.
        :param pulumi.Input[int] lfu_log_factor: The counter logarithm factor for volatile-lfu and allkeys-lfu maxmemory policies.
        :param pulumi.Input[str] maxmemory_policy: A string specifying the desired eviction policy for the Redis cluster.Supported values are: `noeviction`, `allkeys-lru`, `allkeys-random`, `volatile-lru`, `volatile-random`, `volatile-ttl`
        :param pulumi.Input[str] notify_keyspace_events: The `notify-keyspace-events` option. Requires at least `K` or `E`.
        :param pulumi.Input[int] number_of_databases: The number of Redis databases. Changing this will cause a restart of Redis service.
        :param pulumi.Input[str] persistence: When persistence is `rdb`, Redis does RDB dumps each 10 minutes if any key is changed. Also RDB dumps are done according to backup schedule for backup purposes. When persistence is `off`, no RDB dumps and backups are done, so data can be lost at any moment if service is restarted for any reason, or if service is powered off. Also service can't be forked.
        :param pulumi.Input[int] pubsub_client_output_buffer_limit: The output buffer limit for pub/sub clients in MB. The value is the hard limit, the soft limit is 1/4 of the hard limit. When setting the limit, be mindful of the available memory in the selected service plan.
        :param pulumi.Input[bool] ssl: A boolean indicating whether to require SSL to access Redis.
        :param pulumi.Input[int] timeout: The Redis idle connection timeout in seconds.
        """
        if acl_channels_default is not None:
            pulumi.set(__self__, "acl_channels_default", acl_channels_default)
        if cluster_id is not None:
            pulumi.set(__self__, "cluster_id", cluster_id)
        if io_threads is not None:
            pulumi.set(__self__, "io_threads", io_threads)
        if lfu_decay_time is not None:
            pulumi.set(__self__, "lfu_decay_time", lfu_decay_time)
        if lfu_log_factor is not None:
            pulumi.set(__self__, "lfu_log_factor", lfu_log_factor)
        if maxmemory_policy is not None:
            pulumi.set(__self__, "maxmemory_policy", maxmemory_policy)
        if notify_keyspace_events is not None:
            pulumi.set(__self__, "notify_keyspace_events", notify_keyspace_events)
        if number_of_databases is not None:
            pulumi.set(__self__, "number_of_databases", number_of_databases)
        if persistence is not None:
            pulumi.set(__self__, "persistence", persistence)
        if pubsub_client_output_buffer_limit is not None:
            pulumi.set(__self__, "pubsub_client_output_buffer_limit", pubsub_client_output_buffer_limit)
        if ssl is not None:
            pulumi.set(__self__, "ssl", ssl)
        if timeout is not None:
            pulumi.set(__self__, "timeout", timeout)

    @property
    @pulumi.getter(name="aclChannelsDefault")
    def acl_channels_default(self) -> Optional[pulumi.Input[str]]:
        """
        Determines default pub/sub channels' ACL for new users if an ACL is not supplied. When this option is not defined, `allchannels` is assumed to keep backward compatibility. This option doesn't affect Redis' `acl-pubsub-default` configuration. Supported values are: `allchannels` and `resetchannels`
        """
        return pulumi.get(self, "acl_channels_default")

    @acl_channels_default.setter
    def acl_channels_default(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "acl_channels_default", value)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the target Redis cluster.
        """
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter(name="ioThreads")
    def io_threads(self) -> Optional[pulumi.Input[int]]:
        """
        The Redis IO thread count.
        """
        return pulumi.get(self, "io_threads")

    @io_threads.setter
    def io_threads(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "io_threads", value)

    @property
    @pulumi.getter(name="lfuDecayTime")
    def lfu_decay_time(self) -> Optional[pulumi.Input[int]]:
        """
        The LFU maxmemory policy counter decay time in minutes.
        """
        return pulumi.get(self, "lfu_decay_time")

    @lfu_decay_time.setter
    def lfu_decay_time(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "lfu_decay_time", value)

    @property
    @pulumi.getter(name="lfuLogFactor")
    def lfu_log_factor(self) -> Optional[pulumi.Input[int]]:
        """
        The counter logarithm factor for volatile-lfu and allkeys-lfu maxmemory policies.
        """
        return pulumi.get(self, "lfu_log_factor")

    @lfu_log_factor.setter
    def lfu_log_factor(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "lfu_log_factor", value)

    @property
    @pulumi.getter(name="maxmemoryPolicy")
    def maxmemory_policy(self) -> Optional[pulumi.Input[str]]:
        """
        A string specifying the desired eviction policy for the Redis cluster.Supported values are: `noeviction`, `allkeys-lru`, `allkeys-random`, `volatile-lru`, `volatile-random`, `volatile-ttl`
        """
        return pulumi.get(self, "maxmemory_policy")

    @maxmemory_policy.setter
    def maxmemory_policy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "maxmemory_policy", value)

    @property
    @pulumi.getter(name="notifyKeyspaceEvents")
    def notify_keyspace_events(self) -> Optional[pulumi.Input[str]]:
        """
        The `notify-keyspace-events` option. Requires at least `K` or `E`.
        """
        return pulumi.get(self, "notify_keyspace_events")

    @notify_keyspace_events.setter
    def notify_keyspace_events(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "notify_keyspace_events", value)

    @property
    @pulumi.getter(name="numberOfDatabases")
    def number_of_databases(self) -> Optional[pulumi.Input[int]]:
        """
        The number of Redis databases. Changing this will cause a restart of Redis service.
        """
        return pulumi.get(self, "number_of_databases")

    @number_of_databases.setter
    def number_of_databases(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "number_of_databases", value)

    @property
    @pulumi.getter
    def persistence(self) -> Optional[pulumi.Input[str]]:
        """
        When persistence is `rdb`, Redis does RDB dumps each 10 minutes if any key is changed. Also RDB dumps are done according to backup schedule for backup purposes. When persistence is `off`, no RDB dumps and backups are done, so data can be lost at any moment if service is restarted for any reason, or if service is powered off. Also service can't be forked.
        """
        return pulumi.get(self, "persistence")

    @persistence.setter
    def persistence(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "persistence", value)

    @property
    @pulumi.getter(name="pubsubClientOutputBufferLimit")
    def pubsub_client_output_buffer_limit(self) -> Optional[pulumi.Input[int]]:
        """
        The output buffer limit for pub/sub clients in MB. The value is the hard limit, the soft limit is 1/4 of the hard limit. When setting the limit, be mindful of the available memory in the selected service plan.
        """
        return pulumi.get(self, "pubsub_client_output_buffer_limit")

    @pubsub_client_output_buffer_limit.setter
    def pubsub_client_output_buffer_limit(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "pubsub_client_output_buffer_limit", value)

    @property
    @pulumi.getter
    def ssl(self) -> Optional[pulumi.Input[bool]]:
        """
        A boolean indicating whether to require SSL to access Redis.
        """
        return pulumi.get(self, "ssl")

    @ssl.setter
    def ssl(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "ssl", value)

    @property
    @pulumi.getter
    def timeout(self) -> Optional[pulumi.Input[int]]:
        """
        The Redis idle connection timeout in seconds.
        """
        return pulumi.get(self, "timeout")

    @timeout.setter
    def timeout(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "timeout", value)


class DatabaseRedisConfig(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 acl_channels_default: Optional[pulumi.Input[str]] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 io_threads: Optional[pulumi.Input[int]] = None,
                 lfu_decay_time: Optional[pulumi.Input[int]] = None,
                 lfu_log_factor: Optional[pulumi.Input[int]] = None,
                 maxmemory_policy: Optional[pulumi.Input[str]] = None,
                 notify_keyspace_events: Optional[pulumi.Input[str]] = None,
                 number_of_databases: Optional[pulumi.Input[int]] = None,
                 persistence: Optional[pulumi.Input[str]] = None,
                 pubsub_client_output_buffer_limit: Optional[pulumi.Input[int]] = None,
                 ssl: Optional[pulumi.Input[bool]] = None,
                 timeout: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        Provides a virtual resource that can be used to change advanced configuration
        options for a DigitalOcean managed Redis database cluster.

        > **Note** Redis configurations are only removed from state when destroyed. The remote configuration is not unset.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        example_database_cluster = digitalocean.DatabaseCluster("exampleDatabaseCluster",
            engine="redis",
            version="7",
            size=digitalocean.DatabaseSlug.D_B_1_VPCU1_GB,
            region=digitalocean.Region.NYC1,
            node_count=1)
        example_database_redis_config = digitalocean.DatabaseRedisConfig("exampleDatabaseRedisConfig",
            cluster_id=example_database_cluster.id,
            maxmemory_policy="allkeys-lru",
            notify_keyspace_events="KEA",
            timeout=90)
        ```

        ## Import

        A Redis database cluster's configuration can be imported using the `id` the parent cluster, e.g.

        ```sh
        $ pulumi import digitalocean:index/databaseRedisConfig:DatabaseRedisConfig example 245bcfd0-7f31-4ce6-a2bc-475a116cca97
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] acl_channels_default: Determines default pub/sub channels' ACL for new users if an ACL is not supplied. When this option is not defined, `allchannels` is assumed to keep backward compatibility. This option doesn't affect Redis' `acl-pubsub-default` configuration. Supported values are: `allchannels` and `resetchannels`
        :param pulumi.Input[str] cluster_id: The ID of the target Redis cluster.
        :param pulumi.Input[int] io_threads: The Redis IO thread count.
        :param pulumi.Input[int] lfu_decay_time: The LFU maxmemory policy counter decay time in minutes.
        :param pulumi.Input[int] lfu_log_factor: The counter logarithm factor for volatile-lfu and allkeys-lfu maxmemory policies.
        :param pulumi.Input[str] maxmemory_policy: A string specifying the desired eviction policy for the Redis cluster.Supported values are: `noeviction`, `allkeys-lru`, `allkeys-random`, `volatile-lru`, `volatile-random`, `volatile-ttl`
        :param pulumi.Input[str] notify_keyspace_events: The `notify-keyspace-events` option. Requires at least `K` or `E`.
        :param pulumi.Input[int] number_of_databases: The number of Redis databases. Changing this will cause a restart of Redis service.
        :param pulumi.Input[str] persistence: When persistence is `rdb`, Redis does RDB dumps each 10 minutes if any key is changed. Also RDB dumps are done according to backup schedule for backup purposes. When persistence is `off`, no RDB dumps and backups are done, so data can be lost at any moment if service is restarted for any reason, or if service is powered off. Also service can't be forked.
        :param pulumi.Input[int] pubsub_client_output_buffer_limit: The output buffer limit for pub/sub clients in MB. The value is the hard limit, the soft limit is 1/4 of the hard limit. When setting the limit, be mindful of the available memory in the selected service plan.
        :param pulumi.Input[bool] ssl: A boolean indicating whether to require SSL to access Redis.
        :param pulumi.Input[int] timeout: The Redis idle connection timeout in seconds.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DatabaseRedisConfigArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a virtual resource that can be used to change advanced configuration
        options for a DigitalOcean managed Redis database cluster.

        > **Note** Redis configurations are only removed from state when destroyed. The remote configuration is not unset.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        example_database_cluster = digitalocean.DatabaseCluster("exampleDatabaseCluster",
            engine="redis",
            version="7",
            size=digitalocean.DatabaseSlug.D_B_1_VPCU1_GB,
            region=digitalocean.Region.NYC1,
            node_count=1)
        example_database_redis_config = digitalocean.DatabaseRedisConfig("exampleDatabaseRedisConfig",
            cluster_id=example_database_cluster.id,
            maxmemory_policy="allkeys-lru",
            notify_keyspace_events="KEA",
            timeout=90)
        ```

        ## Import

        A Redis database cluster's configuration can be imported using the `id` the parent cluster, e.g.

        ```sh
        $ pulumi import digitalocean:index/databaseRedisConfig:DatabaseRedisConfig example 245bcfd0-7f31-4ce6-a2bc-475a116cca97
        ```

        :param str resource_name: The name of the resource.
        :param DatabaseRedisConfigArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DatabaseRedisConfigArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 acl_channels_default: Optional[pulumi.Input[str]] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 io_threads: Optional[pulumi.Input[int]] = None,
                 lfu_decay_time: Optional[pulumi.Input[int]] = None,
                 lfu_log_factor: Optional[pulumi.Input[int]] = None,
                 maxmemory_policy: Optional[pulumi.Input[str]] = None,
                 notify_keyspace_events: Optional[pulumi.Input[str]] = None,
                 number_of_databases: Optional[pulumi.Input[int]] = None,
                 persistence: Optional[pulumi.Input[str]] = None,
                 pubsub_client_output_buffer_limit: Optional[pulumi.Input[int]] = None,
                 ssl: Optional[pulumi.Input[bool]] = None,
                 timeout: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DatabaseRedisConfigArgs.__new__(DatabaseRedisConfigArgs)

            __props__.__dict__["acl_channels_default"] = acl_channels_default
            if cluster_id is None and not opts.urn:
                raise TypeError("Missing required property 'cluster_id'")
            __props__.__dict__["cluster_id"] = cluster_id
            __props__.__dict__["io_threads"] = io_threads
            __props__.__dict__["lfu_decay_time"] = lfu_decay_time
            __props__.__dict__["lfu_log_factor"] = lfu_log_factor
            __props__.__dict__["maxmemory_policy"] = maxmemory_policy
            __props__.__dict__["notify_keyspace_events"] = notify_keyspace_events
            __props__.__dict__["number_of_databases"] = number_of_databases
            __props__.__dict__["persistence"] = persistence
            __props__.__dict__["pubsub_client_output_buffer_limit"] = pubsub_client_output_buffer_limit
            __props__.__dict__["ssl"] = ssl
            __props__.__dict__["timeout"] = timeout
        super(DatabaseRedisConfig, __self__).__init__(
            'digitalocean:index/databaseRedisConfig:DatabaseRedisConfig',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            acl_channels_default: Optional[pulumi.Input[str]] = None,
            cluster_id: Optional[pulumi.Input[str]] = None,
            io_threads: Optional[pulumi.Input[int]] = None,
            lfu_decay_time: Optional[pulumi.Input[int]] = None,
            lfu_log_factor: Optional[pulumi.Input[int]] = None,
            maxmemory_policy: Optional[pulumi.Input[str]] = None,
            notify_keyspace_events: Optional[pulumi.Input[str]] = None,
            number_of_databases: Optional[pulumi.Input[int]] = None,
            persistence: Optional[pulumi.Input[str]] = None,
            pubsub_client_output_buffer_limit: Optional[pulumi.Input[int]] = None,
            ssl: Optional[pulumi.Input[bool]] = None,
            timeout: Optional[pulumi.Input[int]] = None) -> 'DatabaseRedisConfig':
        """
        Get an existing DatabaseRedisConfig resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] acl_channels_default: Determines default pub/sub channels' ACL for new users if an ACL is not supplied. When this option is not defined, `allchannels` is assumed to keep backward compatibility. This option doesn't affect Redis' `acl-pubsub-default` configuration. Supported values are: `allchannels` and `resetchannels`
        :param pulumi.Input[str] cluster_id: The ID of the target Redis cluster.
        :param pulumi.Input[int] io_threads: The Redis IO thread count.
        :param pulumi.Input[int] lfu_decay_time: The LFU maxmemory policy counter decay time in minutes.
        :param pulumi.Input[int] lfu_log_factor: The counter logarithm factor for volatile-lfu and allkeys-lfu maxmemory policies.
        :param pulumi.Input[str] maxmemory_policy: A string specifying the desired eviction policy for the Redis cluster.Supported values are: `noeviction`, `allkeys-lru`, `allkeys-random`, `volatile-lru`, `volatile-random`, `volatile-ttl`
        :param pulumi.Input[str] notify_keyspace_events: The `notify-keyspace-events` option. Requires at least `K` or `E`.
        :param pulumi.Input[int] number_of_databases: The number of Redis databases. Changing this will cause a restart of Redis service.
        :param pulumi.Input[str] persistence: When persistence is `rdb`, Redis does RDB dumps each 10 minutes if any key is changed. Also RDB dumps are done according to backup schedule for backup purposes. When persistence is `off`, no RDB dumps and backups are done, so data can be lost at any moment if service is restarted for any reason, or if service is powered off. Also service can't be forked.
        :param pulumi.Input[int] pubsub_client_output_buffer_limit: The output buffer limit for pub/sub clients in MB. The value is the hard limit, the soft limit is 1/4 of the hard limit. When setting the limit, be mindful of the available memory in the selected service plan.
        :param pulumi.Input[bool] ssl: A boolean indicating whether to require SSL to access Redis.
        :param pulumi.Input[int] timeout: The Redis idle connection timeout in seconds.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DatabaseRedisConfigState.__new__(_DatabaseRedisConfigState)

        __props__.__dict__["acl_channels_default"] = acl_channels_default
        __props__.__dict__["cluster_id"] = cluster_id
        __props__.__dict__["io_threads"] = io_threads
        __props__.__dict__["lfu_decay_time"] = lfu_decay_time
        __props__.__dict__["lfu_log_factor"] = lfu_log_factor
        __props__.__dict__["maxmemory_policy"] = maxmemory_policy
        __props__.__dict__["notify_keyspace_events"] = notify_keyspace_events
        __props__.__dict__["number_of_databases"] = number_of_databases
        __props__.__dict__["persistence"] = persistence
        __props__.__dict__["pubsub_client_output_buffer_limit"] = pubsub_client_output_buffer_limit
        __props__.__dict__["ssl"] = ssl
        __props__.__dict__["timeout"] = timeout
        return DatabaseRedisConfig(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="aclChannelsDefault")
    def acl_channels_default(self) -> pulumi.Output[str]:
        """
        Determines default pub/sub channels' ACL for new users if an ACL is not supplied. When this option is not defined, `allchannels` is assumed to keep backward compatibility. This option doesn't affect Redis' `acl-pubsub-default` configuration. Supported values are: `allchannels` and `resetchannels`
        """
        return pulumi.get(self, "acl_channels_default")

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Output[str]:
        """
        The ID of the target Redis cluster.
        """
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter(name="ioThreads")
    def io_threads(self) -> pulumi.Output[int]:
        """
        The Redis IO thread count.
        """
        return pulumi.get(self, "io_threads")

    @property
    @pulumi.getter(name="lfuDecayTime")
    def lfu_decay_time(self) -> pulumi.Output[int]:
        """
        The LFU maxmemory policy counter decay time in minutes.
        """
        return pulumi.get(self, "lfu_decay_time")

    @property
    @pulumi.getter(name="lfuLogFactor")
    def lfu_log_factor(self) -> pulumi.Output[int]:
        """
        The counter logarithm factor for volatile-lfu and allkeys-lfu maxmemory policies.
        """
        return pulumi.get(self, "lfu_log_factor")

    @property
    @pulumi.getter(name="maxmemoryPolicy")
    def maxmemory_policy(self) -> pulumi.Output[str]:
        """
        A string specifying the desired eviction policy for the Redis cluster.Supported values are: `noeviction`, `allkeys-lru`, `allkeys-random`, `volatile-lru`, `volatile-random`, `volatile-ttl`
        """
        return pulumi.get(self, "maxmemory_policy")

    @property
    @pulumi.getter(name="notifyKeyspaceEvents")
    def notify_keyspace_events(self) -> pulumi.Output[str]:
        """
        The `notify-keyspace-events` option. Requires at least `K` or `E`.
        """
        return pulumi.get(self, "notify_keyspace_events")

    @property
    @pulumi.getter(name="numberOfDatabases")
    def number_of_databases(self) -> pulumi.Output[int]:
        """
        The number of Redis databases. Changing this will cause a restart of Redis service.
        """
        return pulumi.get(self, "number_of_databases")

    @property
    @pulumi.getter
    def persistence(self) -> pulumi.Output[str]:
        """
        When persistence is `rdb`, Redis does RDB dumps each 10 minutes if any key is changed. Also RDB dumps are done according to backup schedule for backup purposes. When persistence is `off`, no RDB dumps and backups are done, so data can be lost at any moment if service is restarted for any reason, or if service is powered off. Also service can't be forked.
        """
        return pulumi.get(self, "persistence")

    @property
    @pulumi.getter(name="pubsubClientOutputBufferLimit")
    def pubsub_client_output_buffer_limit(self) -> pulumi.Output[int]:
        """
        The output buffer limit for pub/sub clients in MB. The value is the hard limit, the soft limit is 1/4 of the hard limit. When setting the limit, be mindful of the available memory in the selected service plan.
        """
        return pulumi.get(self, "pubsub_client_output_buffer_limit")

    @property
    @pulumi.getter
    def ssl(self) -> pulumi.Output[bool]:
        """
        A boolean indicating whether to require SSL to access Redis.
        """
        return pulumi.get(self, "ssl")

    @property
    @pulumi.getter
    def timeout(self) -> pulumi.Output[int]:
        """
        The Redis idle connection timeout in seconds.
        """
        return pulumi.get(self, "timeout")

