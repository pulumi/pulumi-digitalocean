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

__all__ = ['DatabaseMongodbConfigArgs', 'DatabaseMongodbConfig']

@pulumi.input_type
class DatabaseMongodbConfigArgs:
    def __init__(__self__, *,
                 cluster_id: pulumi.Input[str],
                 default_read_concern: Optional[pulumi.Input[str]] = None,
                 default_write_concern: Optional[pulumi.Input[str]] = None,
                 slow_op_threshold_ms: Optional[pulumi.Input[int]] = None,
                 transaction_lifetime_limit_seconds: Optional[pulumi.Input[int]] = None,
                 verbosity: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a DatabaseMongodbConfig resource.
        :param pulumi.Input[str] cluster_id: The ID of the target MongoDB cluster.
        :param pulumi.Input[str] default_read_concern: Specifies the default consistency behavior of reads from the database. Data that is returned from the query with may or may not have been acknowledged by all nodes in the replicaset depending on this value. Learn more [here](https://www.mongodb.com/docs/manual/reference/read-concern/).
        :param pulumi.Input[str] default_write_concern: Describes the level of acknowledgment requested from MongoDB for write operations clusters. This field can set to either `majority` or a number`0...n` which will describe the number of nodes that must acknowledge the write operation before it is fully accepted. Setting to `0` will request no acknowledgement of the write operation. Learn more [here](https://www.mongodb.com/docs/manual/reference/write-concern/).
        :param pulumi.Input[int] slow_op_threshold_ms: Operations that run for longer than this threshold are considered slow which are then recorded to the diagnostic logs. Higher log levels (verbosity) will record all operations regardless of this threshold on the primary node. <em>Changing this parameter will lead to a restart of the MongoDB service.</em> Learn more [here](https://www.mongodb.com/docs/manual/reference/configuration-options/#mongodb-setting-operationProfiling.slowOpThresholdMs).
        :param pulumi.Input[int] transaction_lifetime_limit_seconds: Specifies the lifetime of multi-document transactions. Transactions that exceed this limit are considered expired and will be aborted by a periodic cleanup process. The cleanup process runs every `transactionLifetimeLimitSeconds/2 seconds` or at least once every 60 seconds. <em>Changing this parameter will lead to a restart of the MongoDB service.</em> Learn more [here](https://www.mongodb.com/docs/manual/reference/parameters/#mongodb-parameter-param.transactionLifetimeLimitSeconds).
        :param pulumi.Input[int] verbosity: The log message verbosity level. The verbosity level determines the amount of Informational and Debug messages MongoDB outputs. 0 includes informational messages while 1...5 increases the level to include debug messages. <em>Changing this parameter will lead to a restart of the MongoDB service.</em> Learn more [here](https://www.mongodb.com/docs/manual/reference/configuration-options/#mongodb-setting-systemLog.verbosity).
        """
        pulumi.set(__self__, "cluster_id", cluster_id)
        if default_read_concern is not None:
            pulumi.set(__self__, "default_read_concern", default_read_concern)
        if default_write_concern is not None:
            pulumi.set(__self__, "default_write_concern", default_write_concern)
        if slow_op_threshold_ms is not None:
            pulumi.set(__self__, "slow_op_threshold_ms", slow_op_threshold_ms)
        if transaction_lifetime_limit_seconds is not None:
            pulumi.set(__self__, "transaction_lifetime_limit_seconds", transaction_lifetime_limit_seconds)
        if verbosity is not None:
            pulumi.set(__self__, "verbosity", verbosity)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Input[str]:
        """
        The ID of the target MongoDB cluster.
        """
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter(name="defaultReadConcern")
    def default_read_concern(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the default consistency behavior of reads from the database. Data that is returned from the query with may or may not have been acknowledged by all nodes in the replicaset depending on this value. Learn more [here](https://www.mongodb.com/docs/manual/reference/read-concern/).
        """
        return pulumi.get(self, "default_read_concern")

    @default_read_concern.setter
    def default_read_concern(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "default_read_concern", value)

    @property
    @pulumi.getter(name="defaultWriteConcern")
    def default_write_concern(self) -> Optional[pulumi.Input[str]]:
        """
        Describes the level of acknowledgment requested from MongoDB for write operations clusters. This field can set to either `majority` or a number`0...n` which will describe the number of nodes that must acknowledge the write operation before it is fully accepted. Setting to `0` will request no acknowledgement of the write operation. Learn more [here](https://www.mongodb.com/docs/manual/reference/write-concern/).
        """
        return pulumi.get(self, "default_write_concern")

    @default_write_concern.setter
    def default_write_concern(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "default_write_concern", value)

    @property
    @pulumi.getter(name="slowOpThresholdMs")
    def slow_op_threshold_ms(self) -> Optional[pulumi.Input[int]]:
        """
        Operations that run for longer than this threshold are considered slow which are then recorded to the diagnostic logs. Higher log levels (verbosity) will record all operations regardless of this threshold on the primary node. <em>Changing this parameter will lead to a restart of the MongoDB service.</em> Learn more [here](https://www.mongodb.com/docs/manual/reference/configuration-options/#mongodb-setting-operationProfiling.slowOpThresholdMs).
        """
        return pulumi.get(self, "slow_op_threshold_ms")

    @slow_op_threshold_ms.setter
    def slow_op_threshold_ms(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "slow_op_threshold_ms", value)

    @property
    @pulumi.getter(name="transactionLifetimeLimitSeconds")
    def transaction_lifetime_limit_seconds(self) -> Optional[pulumi.Input[int]]:
        """
        Specifies the lifetime of multi-document transactions. Transactions that exceed this limit are considered expired and will be aborted by a periodic cleanup process. The cleanup process runs every `transactionLifetimeLimitSeconds/2 seconds` or at least once every 60 seconds. <em>Changing this parameter will lead to a restart of the MongoDB service.</em> Learn more [here](https://www.mongodb.com/docs/manual/reference/parameters/#mongodb-parameter-param.transactionLifetimeLimitSeconds).
        """
        return pulumi.get(self, "transaction_lifetime_limit_seconds")

    @transaction_lifetime_limit_seconds.setter
    def transaction_lifetime_limit_seconds(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "transaction_lifetime_limit_seconds", value)

    @property
    @pulumi.getter
    def verbosity(self) -> Optional[pulumi.Input[int]]:
        """
        The log message verbosity level. The verbosity level determines the amount of Informational and Debug messages MongoDB outputs. 0 includes informational messages while 1...5 increases the level to include debug messages. <em>Changing this parameter will lead to a restart of the MongoDB service.</em> Learn more [here](https://www.mongodb.com/docs/manual/reference/configuration-options/#mongodb-setting-systemLog.verbosity).
        """
        return pulumi.get(self, "verbosity")

    @verbosity.setter
    def verbosity(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "verbosity", value)


@pulumi.input_type
class _DatabaseMongodbConfigState:
    def __init__(__self__, *,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 default_read_concern: Optional[pulumi.Input[str]] = None,
                 default_write_concern: Optional[pulumi.Input[str]] = None,
                 slow_op_threshold_ms: Optional[pulumi.Input[int]] = None,
                 transaction_lifetime_limit_seconds: Optional[pulumi.Input[int]] = None,
                 verbosity: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering DatabaseMongodbConfig resources.
        :param pulumi.Input[str] cluster_id: The ID of the target MongoDB cluster.
        :param pulumi.Input[str] default_read_concern: Specifies the default consistency behavior of reads from the database. Data that is returned from the query with may or may not have been acknowledged by all nodes in the replicaset depending on this value. Learn more [here](https://www.mongodb.com/docs/manual/reference/read-concern/).
        :param pulumi.Input[str] default_write_concern: Describes the level of acknowledgment requested from MongoDB for write operations clusters. This field can set to either `majority` or a number`0...n` which will describe the number of nodes that must acknowledge the write operation before it is fully accepted. Setting to `0` will request no acknowledgement of the write operation. Learn more [here](https://www.mongodb.com/docs/manual/reference/write-concern/).
        :param pulumi.Input[int] slow_op_threshold_ms: Operations that run for longer than this threshold are considered slow which are then recorded to the diagnostic logs. Higher log levels (verbosity) will record all operations regardless of this threshold on the primary node. <em>Changing this parameter will lead to a restart of the MongoDB service.</em> Learn more [here](https://www.mongodb.com/docs/manual/reference/configuration-options/#mongodb-setting-operationProfiling.slowOpThresholdMs).
        :param pulumi.Input[int] transaction_lifetime_limit_seconds: Specifies the lifetime of multi-document transactions. Transactions that exceed this limit are considered expired and will be aborted by a periodic cleanup process. The cleanup process runs every `transactionLifetimeLimitSeconds/2 seconds` or at least once every 60 seconds. <em>Changing this parameter will lead to a restart of the MongoDB service.</em> Learn more [here](https://www.mongodb.com/docs/manual/reference/parameters/#mongodb-parameter-param.transactionLifetimeLimitSeconds).
        :param pulumi.Input[int] verbosity: The log message verbosity level. The verbosity level determines the amount of Informational and Debug messages MongoDB outputs. 0 includes informational messages while 1...5 increases the level to include debug messages. <em>Changing this parameter will lead to a restart of the MongoDB service.</em> Learn more [here](https://www.mongodb.com/docs/manual/reference/configuration-options/#mongodb-setting-systemLog.verbosity).
        """
        if cluster_id is not None:
            pulumi.set(__self__, "cluster_id", cluster_id)
        if default_read_concern is not None:
            pulumi.set(__self__, "default_read_concern", default_read_concern)
        if default_write_concern is not None:
            pulumi.set(__self__, "default_write_concern", default_write_concern)
        if slow_op_threshold_ms is not None:
            pulumi.set(__self__, "slow_op_threshold_ms", slow_op_threshold_ms)
        if transaction_lifetime_limit_seconds is not None:
            pulumi.set(__self__, "transaction_lifetime_limit_seconds", transaction_lifetime_limit_seconds)
        if verbosity is not None:
            pulumi.set(__self__, "verbosity", verbosity)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the target MongoDB cluster.
        """
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter(name="defaultReadConcern")
    def default_read_concern(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the default consistency behavior of reads from the database. Data that is returned from the query with may or may not have been acknowledged by all nodes in the replicaset depending on this value. Learn more [here](https://www.mongodb.com/docs/manual/reference/read-concern/).
        """
        return pulumi.get(self, "default_read_concern")

    @default_read_concern.setter
    def default_read_concern(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "default_read_concern", value)

    @property
    @pulumi.getter(name="defaultWriteConcern")
    def default_write_concern(self) -> Optional[pulumi.Input[str]]:
        """
        Describes the level of acknowledgment requested from MongoDB for write operations clusters. This field can set to either `majority` or a number`0...n` which will describe the number of nodes that must acknowledge the write operation before it is fully accepted. Setting to `0` will request no acknowledgement of the write operation. Learn more [here](https://www.mongodb.com/docs/manual/reference/write-concern/).
        """
        return pulumi.get(self, "default_write_concern")

    @default_write_concern.setter
    def default_write_concern(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "default_write_concern", value)

    @property
    @pulumi.getter(name="slowOpThresholdMs")
    def slow_op_threshold_ms(self) -> Optional[pulumi.Input[int]]:
        """
        Operations that run for longer than this threshold are considered slow which are then recorded to the diagnostic logs. Higher log levels (verbosity) will record all operations regardless of this threshold on the primary node. <em>Changing this parameter will lead to a restart of the MongoDB service.</em> Learn more [here](https://www.mongodb.com/docs/manual/reference/configuration-options/#mongodb-setting-operationProfiling.slowOpThresholdMs).
        """
        return pulumi.get(self, "slow_op_threshold_ms")

    @slow_op_threshold_ms.setter
    def slow_op_threshold_ms(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "slow_op_threshold_ms", value)

    @property
    @pulumi.getter(name="transactionLifetimeLimitSeconds")
    def transaction_lifetime_limit_seconds(self) -> Optional[pulumi.Input[int]]:
        """
        Specifies the lifetime of multi-document transactions. Transactions that exceed this limit are considered expired and will be aborted by a periodic cleanup process. The cleanup process runs every `transactionLifetimeLimitSeconds/2 seconds` or at least once every 60 seconds. <em>Changing this parameter will lead to a restart of the MongoDB service.</em> Learn more [here](https://www.mongodb.com/docs/manual/reference/parameters/#mongodb-parameter-param.transactionLifetimeLimitSeconds).
        """
        return pulumi.get(self, "transaction_lifetime_limit_seconds")

    @transaction_lifetime_limit_seconds.setter
    def transaction_lifetime_limit_seconds(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "transaction_lifetime_limit_seconds", value)

    @property
    @pulumi.getter
    def verbosity(self) -> Optional[pulumi.Input[int]]:
        """
        The log message verbosity level. The verbosity level determines the amount of Informational and Debug messages MongoDB outputs. 0 includes informational messages while 1...5 increases the level to include debug messages. <em>Changing this parameter will lead to a restart of the MongoDB service.</em> Learn more [here](https://www.mongodb.com/docs/manual/reference/configuration-options/#mongodb-setting-systemLog.verbosity).
        """
        return pulumi.get(self, "verbosity")

    @verbosity.setter
    def verbosity(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "verbosity", value)


class DatabaseMongodbConfig(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 default_read_concern: Optional[pulumi.Input[str]] = None,
                 default_write_concern: Optional[pulumi.Input[str]] = None,
                 slow_op_threshold_ms: Optional[pulumi.Input[int]] = None,
                 transaction_lifetime_limit_seconds: Optional[pulumi.Input[int]] = None,
                 verbosity: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        Provides a virtual resource that can be used to change advanced configuration
        options for a DigitalOcean managed MongoDB database cluster.

        > **Note** MongoDB configurations are only removed from state when destroyed. The remote configuration is not unset.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        example_database_cluster = digitalocean.DatabaseCluster("example",
            name="example-mongodb-cluster",
            engine="mongodb",
            version="7",
            size=digitalocean.DatabaseSlug.D_B_1_VPCU1_GB,
            region=digitalocean.Region.NYC3,
            node_count=1)
        example = digitalocean.DatabaseMongodbConfig("example",
            cluster_id=example_database_cluster.id,
            default_read_concern="majority",
            default_write_concern="majority",
            transaction_lifetime_limit_seconds=100,
            slow_op_threshold_ms=100,
            verbosity=3)
        ```

        ## Import

        A MongoDB database cluster's configuration can be imported using the `id` the parent cluster, e.g.

        ```sh
        $ pulumi import digitalocean:index/databaseMongodbConfig:DatabaseMongodbConfig example 4b62829a-9c42-465b-aaa3-84051048e712
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_id: The ID of the target MongoDB cluster.
        :param pulumi.Input[str] default_read_concern: Specifies the default consistency behavior of reads from the database. Data that is returned from the query with may or may not have been acknowledged by all nodes in the replicaset depending on this value. Learn more [here](https://www.mongodb.com/docs/manual/reference/read-concern/).
        :param pulumi.Input[str] default_write_concern: Describes the level of acknowledgment requested from MongoDB for write operations clusters. This field can set to either `majority` or a number`0...n` which will describe the number of nodes that must acknowledge the write operation before it is fully accepted. Setting to `0` will request no acknowledgement of the write operation. Learn more [here](https://www.mongodb.com/docs/manual/reference/write-concern/).
        :param pulumi.Input[int] slow_op_threshold_ms: Operations that run for longer than this threshold are considered slow which are then recorded to the diagnostic logs. Higher log levels (verbosity) will record all operations regardless of this threshold on the primary node. <em>Changing this parameter will lead to a restart of the MongoDB service.</em> Learn more [here](https://www.mongodb.com/docs/manual/reference/configuration-options/#mongodb-setting-operationProfiling.slowOpThresholdMs).
        :param pulumi.Input[int] transaction_lifetime_limit_seconds: Specifies the lifetime of multi-document transactions. Transactions that exceed this limit are considered expired and will be aborted by a periodic cleanup process. The cleanup process runs every `transactionLifetimeLimitSeconds/2 seconds` or at least once every 60 seconds. <em>Changing this parameter will lead to a restart of the MongoDB service.</em> Learn more [here](https://www.mongodb.com/docs/manual/reference/parameters/#mongodb-parameter-param.transactionLifetimeLimitSeconds).
        :param pulumi.Input[int] verbosity: The log message verbosity level. The verbosity level determines the amount of Informational and Debug messages MongoDB outputs. 0 includes informational messages while 1...5 increases the level to include debug messages. <em>Changing this parameter will lead to a restart of the MongoDB service.</em> Learn more [here](https://www.mongodb.com/docs/manual/reference/configuration-options/#mongodb-setting-systemLog.verbosity).
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DatabaseMongodbConfigArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a virtual resource that can be used to change advanced configuration
        options for a DigitalOcean managed MongoDB database cluster.

        > **Note** MongoDB configurations are only removed from state when destroyed. The remote configuration is not unset.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        example_database_cluster = digitalocean.DatabaseCluster("example",
            name="example-mongodb-cluster",
            engine="mongodb",
            version="7",
            size=digitalocean.DatabaseSlug.D_B_1_VPCU1_GB,
            region=digitalocean.Region.NYC3,
            node_count=1)
        example = digitalocean.DatabaseMongodbConfig("example",
            cluster_id=example_database_cluster.id,
            default_read_concern="majority",
            default_write_concern="majority",
            transaction_lifetime_limit_seconds=100,
            slow_op_threshold_ms=100,
            verbosity=3)
        ```

        ## Import

        A MongoDB database cluster's configuration can be imported using the `id` the parent cluster, e.g.

        ```sh
        $ pulumi import digitalocean:index/databaseMongodbConfig:DatabaseMongodbConfig example 4b62829a-9c42-465b-aaa3-84051048e712
        ```

        :param str resource_name: The name of the resource.
        :param DatabaseMongodbConfigArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DatabaseMongodbConfigArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 default_read_concern: Optional[pulumi.Input[str]] = None,
                 default_write_concern: Optional[pulumi.Input[str]] = None,
                 slow_op_threshold_ms: Optional[pulumi.Input[int]] = None,
                 transaction_lifetime_limit_seconds: Optional[pulumi.Input[int]] = None,
                 verbosity: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DatabaseMongodbConfigArgs.__new__(DatabaseMongodbConfigArgs)

            if cluster_id is None and not opts.urn:
                raise TypeError("Missing required property 'cluster_id'")
            __props__.__dict__["cluster_id"] = cluster_id
            __props__.__dict__["default_read_concern"] = default_read_concern
            __props__.__dict__["default_write_concern"] = default_write_concern
            __props__.__dict__["slow_op_threshold_ms"] = slow_op_threshold_ms
            __props__.__dict__["transaction_lifetime_limit_seconds"] = transaction_lifetime_limit_seconds
            __props__.__dict__["verbosity"] = verbosity
        super(DatabaseMongodbConfig, __self__).__init__(
            'digitalocean:index/databaseMongodbConfig:DatabaseMongodbConfig',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cluster_id: Optional[pulumi.Input[str]] = None,
            default_read_concern: Optional[pulumi.Input[str]] = None,
            default_write_concern: Optional[pulumi.Input[str]] = None,
            slow_op_threshold_ms: Optional[pulumi.Input[int]] = None,
            transaction_lifetime_limit_seconds: Optional[pulumi.Input[int]] = None,
            verbosity: Optional[pulumi.Input[int]] = None) -> 'DatabaseMongodbConfig':
        """
        Get an existing DatabaseMongodbConfig resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_id: The ID of the target MongoDB cluster.
        :param pulumi.Input[str] default_read_concern: Specifies the default consistency behavior of reads from the database. Data that is returned from the query with may or may not have been acknowledged by all nodes in the replicaset depending on this value. Learn more [here](https://www.mongodb.com/docs/manual/reference/read-concern/).
        :param pulumi.Input[str] default_write_concern: Describes the level of acknowledgment requested from MongoDB for write operations clusters. This field can set to either `majority` or a number`0...n` which will describe the number of nodes that must acknowledge the write operation before it is fully accepted. Setting to `0` will request no acknowledgement of the write operation. Learn more [here](https://www.mongodb.com/docs/manual/reference/write-concern/).
        :param pulumi.Input[int] slow_op_threshold_ms: Operations that run for longer than this threshold are considered slow which are then recorded to the diagnostic logs. Higher log levels (verbosity) will record all operations regardless of this threshold on the primary node. <em>Changing this parameter will lead to a restart of the MongoDB service.</em> Learn more [here](https://www.mongodb.com/docs/manual/reference/configuration-options/#mongodb-setting-operationProfiling.slowOpThresholdMs).
        :param pulumi.Input[int] transaction_lifetime_limit_seconds: Specifies the lifetime of multi-document transactions. Transactions that exceed this limit are considered expired and will be aborted by a periodic cleanup process. The cleanup process runs every `transactionLifetimeLimitSeconds/2 seconds` or at least once every 60 seconds. <em>Changing this parameter will lead to a restart of the MongoDB service.</em> Learn more [here](https://www.mongodb.com/docs/manual/reference/parameters/#mongodb-parameter-param.transactionLifetimeLimitSeconds).
        :param pulumi.Input[int] verbosity: The log message verbosity level. The verbosity level determines the amount of Informational and Debug messages MongoDB outputs. 0 includes informational messages while 1...5 increases the level to include debug messages. <em>Changing this parameter will lead to a restart of the MongoDB service.</em> Learn more [here](https://www.mongodb.com/docs/manual/reference/configuration-options/#mongodb-setting-systemLog.verbosity).
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DatabaseMongodbConfigState.__new__(_DatabaseMongodbConfigState)

        __props__.__dict__["cluster_id"] = cluster_id
        __props__.__dict__["default_read_concern"] = default_read_concern
        __props__.__dict__["default_write_concern"] = default_write_concern
        __props__.__dict__["slow_op_threshold_ms"] = slow_op_threshold_ms
        __props__.__dict__["transaction_lifetime_limit_seconds"] = transaction_lifetime_limit_seconds
        __props__.__dict__["verbosity"] = verbosity
        return DatabaseMongodbConfig(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Output[str]:
        """
        The ID of the target MongoDB cluster.
        """
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter(name="defaultReadConcern")
    def default_read_concern(self) -> pulumi.Output[str]:
        """
        Specifies the default consistency behavior of reads from the database. Data that is returned from the query with may or may not have been acknowledged by all nodes in the replicaset depending on this value. Learn more [here](https://www.mongodb.com/docs/manual/reference/read-concern/).
        """
        return pulumi.get(self, "default_read_concern")

    @property
    @pulumi.getter(name="defaultWriteConcern")
    def default_write_concern(self) -> pulumi.Output[str]:
        """
        Describes the level of acknowledgment requested from MongoDB for write operations clusters. This field can set to either `majority` or a number`0...n` which will describe the number of nodes that must acknowledge the write operation before it is fully accepted. Setting to `0` will request no acknowledgement of the write operation. Learn more [here](https://www.mongodb.com/docs/manual/reference/write-concern/).
        """
        return pulumi.get(self, "default_write_concern")

    @property
    @pulumi.getter(name="slowOpThresholdMs")
    def slow_op_threshold_ms(self) -> pulumi.Output[int]:
        """
        Operations that run for longer than this threshold are considered slow which are then recorded to the diagnostic logs. Higher log levels (verbosity) will record all operations regardless of this threshold on the primary node. <em>Changing this parameter will lead to a restart of the MongoDB service.</em> Learn more [here](https://www.mongodb.com/docs/manual/reference/configuration-options/#mongodb-setting-operationProfiling.slowOpThresholdMs).
        """
        return pulumi.get(self, "slow_op_threshold_ms")

    @property
    @pulumi.getter(name="transactionLifetimeLimitSeconds")
    def transaction_lifetime_limit_seconds(self) -> pulumi.Output[int]:
        """
        Specifies the lifetime of multi-document transactions. Transactions that exceed this limit are considered expired and will be aborted by a periodic cleanup process. The cleanup process runs every `transactionLifetimeLimitSeconds/2 seconds` or at least once every 60 seconds. <em>Changing this parameter will lead to a restart of the MongoDB service.</em> Learn more [here](https://www.mongodb.com/docs/manual/reference/parameters/#mongodb-parameter-param.transactionLifetimeLimitSeconds).
        """
        return pulumi.get(self, "transaction_lifetime_limit_seconds")

    @property
    @pulumi.getter
    def verbosity(self) -> pulumi.Output[int]:
        """
        The log message verbosity level. The verbosity level determines the amount of Informational and Debug messages MongoDB outputs. 0 includes informational messages while 1...5 increases the level to include debug messages. <em>Changing this parameter will lead to a restart of the MongoDB service.</em> Learn more [here](https://www.mongodb.com/docs/manual/reference/configuration-options/#mongodb-setting-systemLog.verbosity).
        """
        return pulumi.get(self, "verbosity")
