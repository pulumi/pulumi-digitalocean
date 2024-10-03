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

__all__ = ['DatabaseKafkaTopicArgs', 'DatabaseKafkaTopic']

@pulumi.input_type
class DatabaseKafkaTopicArgs:
    def __init__(__self__, *,
                 cluster_id: pulumi.Input[str],
                 configs: Optional[pulumi.Input[Sequence[pulumi.Input['DatabaseKafkaTopicConfigArgs']]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 partition_count: Optional[pulumi.Input[int]] = None,
                 replication_factor: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a DatabaseKafkaTopic resource.
        :param pulumi.Input[str] cluster_id: The ID of the source database cluster. Note: This must be a Kafka cluster.
        :param pulumi.Input[Sequence[pulumi.Input['DatabaseKafkaTopicConfigArgs']]] configs: A set of advanced configuration parameters. Defaults will be set for any of the parameters that are not included.
               The `config` block is documented below.
        :param pulumi.Input[str] name: The name for the topic.
        :param pulumi.Input[int] partition_count: The number of partitions for the topic. Default and minimum set at 3, maximum is 2048.
        :param pulumi.Input[int] replication_factor: The number of nodes that topics are replicated across. Default and minimum set at 2, maximum is the number of nodes in the cluster.
        """
        pulumi.set(__self__, "cluster_id", cluster_id)
        if configs is not None:
            pulumi.set(__self__, "configs", configs)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if partition_count is not None:
            pulumi.set(__self__, "partition_count", partition_count)
        if replication_factor is not None:
            pulumi.set(__self__, "replication_factor", replication_factor)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Input[str]:
        """
        The ID of the source database cluster. Note: This must be a Kafka cluster.
        """
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter
    def configs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['DatabaseKafkaTopicConfigArgs']]]]:
        """
        A set of advanced configuration parameters. Defaults will be set for any of the parameters that are not included.
        The `config` block is documented below.
        """
        return pulumi.get(self, "configs")

    @configs.setter
    def configs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['DatabaseKafkaTopicConfigArgs']]]]):
        pulumi.set(self, "configs", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name for the topic.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="partitionCount")
    def partition_count(self) -> Optional[pulumi.Input[int]]:
        """
        The number of partitions for the topic. Default and minimum set at 3, maximum is 2048.
        """
        return pulumi.get(self, "partition_count")

    @partition_count.setter
    def partition_count(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "partition_count", value)

    @property
    @pulumi.getter(name="replicationFactor")
    def replication_factor(self) -> Optional[pulumi.Input[int]]:
        """
        The number of nodes that topics are replicated across. Default and minimum set at 2, maximum is the number of nodes in the cluster.
        """
        return pulumi.get(self, "replication_factor")

    @replication_factor.setter
    def replication_factor(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "replication_factor", value)


@pulumi.input_type
class _DatabaseKafkaTopicState:
    def __init__(__self__, *,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 configs: Optional[pulumi.Input[Sequence[pulumi.Input['DatabaseKafkaTopicConfigArgs']]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 partition_count: Optional[pulumi.Input[int]] = None,
                 replication_factor: Optional[pulumi.Input[int]] = None,
                 state: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering DatabaseKafkaTopic resources.
        :param pulumi.Input[str] cluster_id: The ID of the source database cluster. Note: This must be a Kafka cluster.
        :param pulumi.Input[Sequence[pulumi.Input['DatabaseKafkaTopicConfigArgs']]] configs: A set of advanced configuration parameters. Defaults will be set for any of the parameters that are not included.
               The `config` block is documented below.
        :param pulumi.Input[str] name: The name for the topic.
        :param pulumi.Input[int] partition_count: The number of partitions for the topic. Default and minimum set at 3, maximum is 2048.
        :param pulumi.Input[int] replication_factor: The number of nodes that topics are replicated across. Default and minimum set at 2, maximum is the number of nodes in the cluster.
        :param pulumi.Input[str] state: The current status of the topic. Possible values are 'active', 'configuring', and 'deleting'.
        """
        if cluster_id is not None:
            pulumi.set(__self__, "cluster_id", cluster_id)
        if configs is not None:
            pulumi.set(__self__, "configs", configs)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if partition_count is not None:
            pulumi.set(__self__, "partition_count", partition_count)
        if replication_factor is not None:
            pulumi.set(__self__, "replication_factor", replication_factor)
        if state is not None:
            pulumi.set(__self__, "state", state)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the source database cluster. Note: This must be a Kafka cluster.
        """
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter
    def configs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['DatabaseKafkaTopicConfigArgs']]]]:
        """
        A set of advanced configuration parameters. Defaults will be set for any of the parameters that are not included.
        The `config` block is documented below.
        """
        return pulumi.get(self, "configs")

    @configs.setter
    def configs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['DatabaseKafkaTopicConfigArgs']]]]):
        pulumi.set(self, "configs", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name for the topic.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="partitionCount")
    def partition_count(self) -> Optional[pulumi.Input[int]]:
        """
        The number of partitions for the topic. Default and minimum set at 3, maximum is 2048.
        """
        return pulumi.get(self, "partition_count")

    @partition_count.setter
    def partition_count(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "partition_count", value)

    @property
    @pulumi.getter(name="replicationFactor")
    def replication_factor(self) -> Optional[pulumi.Input[int]]:
        """
        The number of nodes that topics are replicated across. Default and minimum set at 2, maximum is the number of nodes in the cluster.
        """
        return pulumi.get(self, "replication_factor")

    @replication_factor.setter
    def replication_factor(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "replication_factor", value)

    @property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[str]]:
        """
        The current status of the topic. Possible values are 'active', 'configuring', and 'deleting'.
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "state", value)


class DatabaseKafkaTopic(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 configs: Optional[pulumi.Input[Sequence[pulumi.Input[Union['DatabaseKafkaTopicConfigArgs', 'DatabaseKafkaTopicConfigArgsDict']]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 partition_count: Optional[pulumi.Input[int]] = None,
                 replication_factor: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        Provides a DigitalOcean Kafka topic for Kafka clusters.

        ## Example Usage

        ### Create a new Kafka topic
        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        kafka_example = digitalocean.DatabaseCluster("kafka-example",
            name="example-kafka-cluster",
            engine="kafka",
            version="3.5",
            size="db-s-2vcpu-2gb",
            region=digitalocean.Region.NYC1,
            node_count=3,
            tags=["production"])
        topic_01 = digitalocean.DatabaseKafkaTopic("topic-01",
            cluster_id=kafka_example.id,
            name="topic-01",
            partition_count=3,
            replication_factor=2,
            configs=[{
                "cleanup_policy": "compact",
                "compression_type": "uncompressed",
                "delete_retention_ms": "14000",
                "file_delete_delay_ms": "170000",
                "flush_messages": "92233",
                "flush_ms": "92233720368",
                "index_interval_bytes": "40962",
                "max_compaction_lag_ms": "9223372036854775807",
                "max_message_bytes": "1048588",
                "message_down_conversion_enable": True,
                "message_format_version": "3.0-IV1",
                "message_timestamp_difference_max_ms": "9223372036854775807",
                "message_timestamp_type": "log_append_time",
                "min_cleanable_dirty_ratio": 0.5,
                "min_compaction_lag_ms": "20000",
                "min_insync_replicas": 2,
                "preallocate": False,
                "retention_bytes": "-1",
                "retention_ms": "-1",
                "segment_bytes": "209715200",
                "segment_index_bytes": "10485760",
                "segment_jitter_ms": "0",
                "segment_ms": "604800000",
            }])
        ```

        ## Import

        Topics can be imported using the `id` of the source cluster and the `name` of the topic joined with a comma. For example:

        ```sh
        $ pulumi import digitalocean:index/databaseKafkaTopic:DatabaseKafkaTopic topic-01 245bcfd0-7f31-4ce6-a2bc-475a116cca97,topic-01
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_id: The ID of the source database cluster. Note: This must be a Kafka cluster.
        :param pulumi.Input[Sequence[pulumi.Input[Union['DatabaseKafkaTopicConfigArgs', 'DatabaseKafkaTopicConfigArgsDict']]]] configs: A set of advanced configuration parameters. Defaults will be set for any of the parameters that are not included.
               The `config` block is documented below.
        :param pulumi.Input[str] name: The name for the topic.
        :param pulumi.Input[int] partition_count: The number of partitions for the topic. Default and minimum set at 3, maximum is 2048.
        :param pulumi.Input[int] replication_factor: The number of nodes that topics are replicated across. Default and minimum set at 2, maximum is the number of nodes in the cluster.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DatabaseKafkaTopicArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a DigitalOcean Kafka topic for Kafka clusters.

        ## Example Usage

        ### Create a new Kafka topic
        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        kafka_example = digitalocean.DatabaseCluster("kafka-example",
            name="example-kafka-cluster",
            engine="kafka",
            version="3.5",
            size="db-s-2vcpu-2gb",
            region=digitalocean.Region.NYC1,
            node_count=3,
            tags=["production"])
        topic_01 = digitalocean.DatabaseKafkaTopic("topic-01",
            cluster_id=kafka_example.id,
            name="topic-01",
            partition_count=3,
            replication_factor=2,
            configs=[{
                "cleanup_policy": "compact",
                "compression_type": "uncompressed",
                "delete_retention_ms": "14000",
                "file_delete_delay_ms": "170000",
                "flush_messages": "92233",
                "flush_ms": "92233720368",
                "index_interval_bytes": "40962",
                "max_compaction_lag_ms": "9223372036854775807",
                "max_message_bytes": "1048588",
                "message_down_conversion_enable": True,
                "message_format_version": "3.0-IV1",
                "message_timestamp_difference_max_ms": "9223372036854775807",
                "message_timestamp_type": "log_append_time",
                "min_cleanable_dirty_ratio": 0.5,
                "min_compaction_lag_ms": "20000",
                "min_insync_replicas": 2,
                "preallocate": False,
                "retention_bytes": "-1",
                "retention_ms": "-1",
                "segment_bytes": "209715200",
                "segment_index_bytes": "10485760",
                "segment_jitter_ms": "0",
                "segment_ms": "604800000",
            }])
        ```

        ## Import

        Topics can be imported using the `id` of the source cluster and the `name` of the topic joined with a comma. For example:

        ```sh
        $ pulumi import digitalocean:index/databaseKafkaTopic:DatabaseKafkaTopic topic-01 245bcfd0-7f31-4ce6-a2bc-475a116cca97,topic-01
        ```

        :param str resource_name: The name of the resource.
        :param DatabaseKafkaTopicArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DatabaseKafkaTopicArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 configs: Optional[pulumi.Input[Sequence[pulumi.Input[Union['DatabaseKafkaTopicConfigArgs', 'DatabaseKafkaTopicConfigArgsDict']]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 partition_count: Optional[pulumi.Input[int]] = None,
                 replication_factor: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DatabaseKafkaTopicArgs.__new__(DatabaseKafkaTopicArgs)

            if cluster_id is None and not opts.urn:
                raise TypeError("Missing required property 'cluster_id'")
            __props__.__dict__["cluster_id"] = cluster_id
            __props__.__dict__["configs"] = configs
            __props__.__dict__["name"] = name
            __props__.__dict__["partition_count"] = partition_count
            __props__.__dict__["replication_factor"] = replication_factor
            __props__.__dict__["state"] = None
        super(DatabaseKafkaTopic, __self__).__init__(
            'digitalocean:index/databaseKafkaTopic:DatabaseKafkaTopic',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cluster_id: Optional[pulumi.Input[str]] = None,
            configs: Optional[pulumi.Input[Sequence[pulumi.Input[Union['DatabaseKafkaTopicConfigArgs', 'DatabaseKafkaTopicConfigArgsDict']]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            partition_count: Optional[pulumi.Input[int]] = None,
            replication_factor: Optional[pulumi.Input[int]] = None,
            state: Optional[pulumi.Input[str]] = None) -> 'DatabaseKafkaTopic':
        """
        Get an existing DatabaseKafkaTopic resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_id: The ID of the source database cluster. Note: This must be a Kafka cluster.
        :param pulumi.Input[Sequence[pulumi.Input[Union['DatabaseKafkaTopicConfigArgs', 'DatabaseKafkaTopicConfigArgsDict']]]] configs: A set of advanced configuration parameters. Defaults will be set for any of the parameters that are not included.
               The `config` block is documented below.
        :param pulumi.Input[str] name: The name for the topic.
        :param pulumi.Input[int] partition_count: The number of partitions for the topic. Default and minimum set at 3, maximum is 2048.
        :param pulumi.Input[int] replication_factor: The number of nodes that topics are replicated across. Default and minimum set at 2, maximum is the number of nodes in the cluster.
        :param pulumi.Input[str] state: The current status of the topic. Possible values are 'active', 'configuring', and 'deleting'.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DatabaseKafkaTopicState.__new__(_DatabaseKafkaTopicState)

        __props__.__dict__["cluster_id"] = cluster_id
        __props__.__dict__["configs"] = configs
        __props__.__dict__["name"] = name
        __props__.__dict__["partition_count"] = partition_count
        __props__.__dict__["replication_factor"] = replication_factor
        __props__.__dict__["state"] = state
        return DatabaseKafkaTopic(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Output[str]:
        """
        The ID of the source database cluster. Note: This must be a Kafka cluster.
        """
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter
    def configs(self) -> pulumi.Output[Sequence['outputs.DatabaseKafkaTopicConfig']]:
        """
        A set of advanced configuration parameters. Defaults will be set for any of the parameters that are not included.
        The `config` block is documented below.
        """
        return pulumi.get(self, "configs")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name for the topic.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="partitionCount")
    def partition_count(self) -> pulumi.Output[Optional[int]]:
        """
        The number of partitions for the topic. Default and minimum set at 3, maximum is 2048.
        """
        return pulumi.get(self, "partition_count")

    @property
    @pulumi.getter(name="replicationFactor")
    def replication_factor(self) -> pulumi.Output[Optional[int]]:
        """
        The number of nodes that topics are replicated across. Default and minimum set at 2, maximum is the number of nodes in the cluster.
        """
        return pulumi.get(self, "replication_factor")

    @property
    @pulumi.getter
    def state(self) -> pulumi.Output[str]:
        """
        The current status of the topic. Possible values are 'active', 'configuring', and 'deleting'.
        """
        return pulumi.get(self, "state")

