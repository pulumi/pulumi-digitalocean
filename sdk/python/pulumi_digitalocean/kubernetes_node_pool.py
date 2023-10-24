# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._enums import *
from ._inputs import *

__all__ = ['KubernetesNodePoolArgs', 'KubernetesNodePool']

@pulumi.input_type
class KubernetesNodePoolArgs:
    def __init__(__self__, *,
                 cluster_id: pulumi.Input[str],
                 size: pulumi.Input[Union[str, 'DropletSlug']],
                 auto_scale: Optional[pulumi.Input[bool]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 max_nodes: Optional[pulumi.Input[int]] = None,
                 min_nodes: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 node_count: Optional[pulumi.Input[int]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 taints: Optional[pulumi.Input[Sequence[pulumi.Input['KubernetesNodePoolTaintArgs']]]] = None):
        """
        The set of arguments for constructing a KubernetesNodePool resource.
        :param pulumi.Input[str] cluster_id: The ID of the Kubernetes cluster to which the node pool is associated.
        :param pulumi.Input[Union[str, 'DropletSlug']] size: The slug identifier for the type of Droplet to be used as workers in the node pool.
        :param pulumi.Input[bool] auto_scale: Enable auto-scaling of the number of nodes in the node pool within the given min/max range.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: A map of key/value pairs to apply to nodes in the pool. The labels are exposed in the Kubernetes API as labels in the metadata of the corresponding [Node resources](https://kubernetes.io/docs/concepts/architecture/nodes/).
        :param pulumi.Input[int] max_nodes: If auto-scaling is enabled, this represents the maximum number of nodes that the node pool can be scaled up to.
        :param pulumi.Input[int] min_nodes: If auto-scaling is enabled, this represents the minimum number of nodes that the node pool can be scaled down to.
        :param pulumi.Input[str] name: A name for the node pool.
        :param pulumi.Input[int] node_count: The number of Droplet instances in the node pool. If auto-scaling is enabled, this should only be set if the desired result is to explicitly reset the number of nodes to this value. If auto-scaling is enabled, and the node count is outside of the given min/max range, it will use the min nodes value.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: A list of tag names to be applied to the Kubernetes cluster.
        :param pulumi.Input[Sequence[pulumi.Input['KubernetesNodePoolTaintArgs']]] taints: A list of taints applied to all nodes in the pool.
               
               This resource supports customized create timeouts. The default timeout is 30 minutes.
        """
        KubernetesNodePoolArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            cluster_id=cluster_id,
            size=size,
            auto_scale=auto_scale,
            labels=labels,
            max_nodes=max_nodes,
            min_nodes=min_nodes,
            name=name,
            node_count=node_count,
            tags=tags,
            taints=taints,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             cluster_id: Optional[pulumi.Input[str]] = None,
             size: Optional[pulumi.Input[Union[str, 'DropletSlug']]] = None,
             auto_scale: Optional[pulumi.Input[bool]] = None,
             labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
             max_nodes: Optional[pulumi.Input[int]] = None,
             min_nodes: Optional[pulumi.Input[int]] = None,
             name: Optional[pulumi.Input[str]] = None,
             node_count: Optional[pulumi.Input[int]] = None,
             tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             taints: Optional[pulumi.Input[Sequence[pulumi.Input['KubernetesNodePoolTaintArgs']]]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if cluster_id is None and 'clusterId' in kwargs:
            cluster_id = kwargs['clusterId']
        if cluster_id is None:
            raise TypeError("Missing 'cluster_id' argument")
        if size is None:
            raise TypeError("Missing 'size' argument")
        if auto_scale is None and 'autoScale' in kwargs:
            auto_scale = kwargs['autoScale']
        if max_nodes is None and 'maxNodes' in kwargs:
            max_nodes = kwargs['maxNodes']
        if min_nodes is None and 'minNodes' in kwargs:
            min_nodes = kwargs['minNodes']
        if node_count is None and 'nodeCount' in kwargs:
            node_count = kwargs['nodeCount']

        _setter("cluster_id", cluster_id)
        _setter("size", size)
        if auto_scale is not None:
            _setter("auto_scale", auto_scale)
        if labels is not None:
            _setter("labels", labels)
        if max_nodes is not None:
            _setter("max_nodes", max_nodes)
        if min_nodes is not None:
            _setter("min_nodes", min_nodes)
        if name is not None:
            _setter("name", name)
        if node_count is not None:
            _setter("node_count", node_count)
        if tags is not None:
            _setter("tags", tags)
        if taints is not None:
            _setter("taints", taints)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Input[str]:
        """
        The ID of the Kubernetes cluster to which the node pool is associated.
        """
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter
    def size(self) -> pulumi.Input[Union[str, 'DropletSlug']]:
        """
        The slug identifier for the type of Droplet to be used as workers in the node pool.
        """
        return pulumi.get(self, "size")

    @size.setter
    def size(self, value: pulumi.Input[Union[str, 'DropletSlug']]):
        pulumi.set(self, "size", value)

    @property
    @pulumi.getter(name="autoScale")
    def auto_scale(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable auto-scaling of the number of nodes in the node pool within the given min/max range.
        """
        return pulumi.get(self, "auto_scale")

    @auto_scale.setter
    def auto_scale(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "auto_scale", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of key/value pairs to apply to nodes in the pool. The labels are exposed in the Kubernetes API as labels in the metadata of the corresponding [Node resources](https://kubernetes.io/docs/concepts/architecture/nodes/).
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter(name="maxNodes")
    def max_nodes(self) -> Optional[pulumi.Input[int]]:
        """
        If auto-scaling is enabled, this represents the maximum number of nodes that the node pool can be scaled up to.
        """
        return pulumi.get(self, "max_nodes")

    @max_nodes.setter
    def max_nodes(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "max_nodes", value)

    @property
    @pulumi.getter(name="minNodes")
    def min_nodes(self) -> Optional[pulumi.Input[int]]:
        """
        If auto-scaling is enabled, this represents the minimum number of nodes that the node pool can be scaled down to.
        """
        return pulumi.get(self, "min_nodes")

    @min_nodes.setter
    def min_nodes(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "min_nodes", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        A name for the node pool.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="nodeCount")
    def node_count(self) -> Optional[pulumi.Input[int]]:
        """
        The number of Droplet instances in the node pool. If auto-scaling is enabled, this should only be set if the desired result is to explicitly reset the number of nodes to this value. If auto-scaling is enabled, and the node count is outside of the given min/max range, it will use the min nodes value.
        """
        return pulumi.get(self, "node_count")

    @node_count.setter
    def node_count(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "node_count", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of tag names to be applied to the Kubernetes cluster.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter
    def taints(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['KubernetesNodePoolTaintArgs']]]]:
        """
        A list of taints applied to all nodes in the pool.

        This resource supports customized create timeouts. The default timeout is 30 minutes.
        """
        return pulumi.get(self, "taints")

    @taints.setter
    def taints(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['KubernetesNodePoolTaintArgs']]]]):
        pulumi.set(self, "taints", value)


@pulumi.input_type
class _KubernetesNodePoolState:
    def __init__(__self__, *,
                 actual_node_count: Optional[pulumi.Input[int]] = None,
                 auto_scale: Optional[pulumi.Input[bool]] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 max_nodes: Optional[pulumi.Input[int]] = None,
                 min_nodes: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 node_count: Optional[pulumi.Input[int]] = None,
                 nodes: Optional[pulumi.Input[Sequence[pulumi.Input['KubernetesNodePoolNodeArgs']]]] = None,
                 size: Optional[pulumi.Input[Union[str, 'DropletSlug']]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 taints: Optional[pulumi.Input[Sequence[pulumi.Input['KubernetesNodePoolTaintArgs']]]] = None):
        """
        Input properties used for looking up and filtering KubernetesNodePool resources.
        :param pulumi.Input[int] actual_node_count: A computed field representing the actual number of nodes in the node pool, which is especially useful when auto-scaling is enabled.
        :param pulumi.Input[bool] auto_scale: Enable auto-scaling of the number of nodes in the node pool within the given min/max range.
        :param pulumi.Input[str] cluster_id: The ID of the Kubernetes cluster to which the node pool is associated.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: A map of key/value pairs to apply to nodes in the pool. The labels are exposed in the Kubernetes API as labels in the metadata of the corresponding [Node resources](https://kubernetes.io/docs/concepts/architecture/nodes/).
        :param pulumi.Input[int] max_nodes: If auto-scaling is enabled, this represents the maximum number of nodes that the node pool can be scaled up to.
        :param pulumi.Input[int] min_nodes: If auto-scaling is enabled, this represents the minimum number of nodes that the node pool can be scaled down to.
        :param pulumi.Input[str] name: A name for the node pool.
        :param pulumi.Input[int] node_count: The number of Droplet instances in the node pool. If auto-scaling is enabled, this should only be set if the desired result is to explicitly reset the number of nodes to this value. If auto-scaling is enabled, and the node count is outside of the given min/max range, it will use the min nodes value.
        :param pulumi.Input[Sequence[pulumi.Input['KubernetesNodePoolNodeArgs']]] nodes: A list of nodes in the pool. Each node exports the following attributes:
        :param pulumi.Input[Union[str, 'DropletSlug']] size: The slug identifier for the type of Droplet to be used as workers in the node pool.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: A list of tag names to be applied to the Kubernetes cluster.
        :param pulumi.Input[Sequence[pulumi.Input['KubernetesNodePoolTaintArgs']]] taints: A list of taints applied to all nodes in the pool.
               
               This resource supports customized create timeouts. The default timeout is 30 minutes.
        """
        _KubernetesNodePoolState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            actual_node_count=actual_node_count,
            auto_scale=auto_scale,
            cluster_id=cluster_id,
            labels=labels,
            max_nodes=max_nodes,
            min_nodes=min_nodes,
            name=name,
            node_count=node_count,
            nodes=nodes,
            size=size,
            tags=tags,
            taints=taints,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             actual_node_count: Optional[pulumi.Input[int]] = None,
             auto_scale: Optional[pulumi.Input[bool]] = None,
             cluster_id: Optional[pulumi.Input[str]] = None,
             labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
             max_nodes: Optional[pulumi.Input[int]] = None,
             min_nodes: Optional[pulumi.Input[int]] = None,
             name: Optional[pulumi.Input[str]] = None,
             node_count: Optional[pulumi.Input[int]] = None,
             nodes: Optional[pulumi.Input[Sequence[pulumi.Input['KubernetesNodePoolNodeArgs']]]] = None,
             size: Optional[pulumi.Input[Union[str, 'DropletSlug']]] = None,
             tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             taints: Optional[pulumi.Input[Sequence[pulumi.Input['KubernetesNodePoolTaintArgs']]]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if actual_node_count is None and 'actualNodeCount' in kwargs:
            actual_node_count = kwargs['actualNodeCount']
        if auto_scale is None and 'autoScale' in kwargs:
            auto_scale = kwargs['autoScale']
        if cluster_id is None and 'clusterId' in kwargs:
            cluster_id = kwargs['clusterId']
        if max_nodes is None and 'maxNodes' in kwargs:
            max_nodes = kwargs['maxNodes']
        if min_nodes is None and 'minNodes' in kwargs:
            min_nodes = kwargs['minNodes']
        if node_count is None and 'nodeCount' in kwargs:
            node_count = kwargs['nodeCount']

        if actual_node_count is not None:
            _setter("actual_node_count", actual_node_count)
        if auto_scale is not None:
            _setter("auto_scale", auto_scale)
        if cluster_id is not None:
            _setter("cluster_id", cluster_id)
        if labels is not None:
            _setter("labels", labels)
        if max_nodes is not None:
            _setter("max_nodes", max_nodes)
        if min_nodes is not None:
            _setter("min_nodes", min_nodes)
        if name is not None:
            _setter("name", name)
        if node_count is not None:
            _setter("node_count", node_count)
        if nodes is not None:
            _setter("nodes", nodes)
        if size is not None:
            _setter("size", size)
        if tags is not None:
            _setter("tags", tags)
        if taints is not None:
            _setter("taints", taints)

    @property
    @pulumi.getter(name="actualNodeCount")
    def actual_node_count(self) -> Optional[pulumi.Input[int]]:
        """
        A computed field representing the actual number of nodes in the node pool, which is especially useful when auto-scaling is enabled.
        """
        return pulumi.get(self, "actual_node_count")

    @actual_node_count.setter
    def actual_node_count(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "actual_node_count", value)

    @property
    @pulumi.getter(name="autoScale")
    def auto_scale(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable auto-scaling of the number of nodes in the node pool within the given min/max range.
        """
        return pulumi.get(self, "auto_scale")

    @auto_scale.setter
    def auto_scale(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "auto_scale", value)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Kubernetes cluster to which the node pool is associated.
        """
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of key/value pairs to apply to nodes in the pool. The labels are exposed in the Kubernetes API as labels in the metadata of the corresponding [Node resources](https://kubernetes.io/docs/concepts/architecture/nodes/).
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter(name="maxNodes")
    def max_nodes(self) -> Optional[pulumi.Input[int]]:
        """
        If auto-scaling is enabled, this represents the maximum number of nodes that the node pool can be scaled up to.
        """
        return pulumi.get(self, "max_nodes")

    @max_nodes.setter
    def max_nodes(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "max_nodes", value)

    @property
    @pulumi.getter(name="minNodes")
    def min_nodes(self) -> Optional[pulumi.Input[int]]:
        """
        If auto-scaling is enabled, this represents the minimum number of nodes that the node pool can be scaled down to.
        """
        return pulumi.get(self, "min_nodes")

    @min_nodes.setter
    def min_nodes(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "min_nodes", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        A name for the node pool.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="nodeCount")
    def node_count(self) -> Optional[pulumi.Input[int]]:
        """
        The number of Droplet instances in the node pool. If auto-scaling is enabled, this should only be set if the desired result is to explicitly reset the number of nodes to this value. If auto-scaling is enabled, and the node count is outside of the given min/max range, it will use the min nodes value.
        """
        return pulumi.get(self, "node_count")

    @node_count.setter
    def node_count(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "node_count", value)

    @property
    @pulumi.getter
    def nodes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['KubernetesNodePoolNodeArgs']]]]:
        """
        A list of nodes in the pool. Each node exports the following attributes:
        """
        return pulumi.get(self, "nodes")

    @nodes.setter
    def nodes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['KubernetesNodePoolNodeArgs']]]]):
        pulumi.set(self, "nodes", value)

    @property
    @pulumi.getter
    def size(self) -> Optional[pulumi.Input[Union[str, 'DropletSlug']]]:
        """
        The slug identifier for the type of Droplet to be used as workers in the node pool.
        """
        return pulumi.get(self, "size")

    @size.setter
    def size(self, value: Optional[pulumi.Input[Union[str, 'DropletSlug']]]):
        pulumi.set(self, "size", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of tag names to be applied to the Kubernetes cluster.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter
    def taints(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['KubernetesNodePoolTaintArgs']]]]:
        """
        A list of taints applied to all nodes in the pool.

        This resource supports customized create timeouts. The default timeout is 30 minutes.
        """
        return pulumi.get(self, "taints")

    @taints.setter
    def taints(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['KubernetesNodePoolTaintArgs']]]]):
        pulumi.set(self, "taints", value)


class KubernetesNodePool(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 auto_scale: Optional[pulumi.Input[bool]] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 max_nodes: Optional[pulumi.Input[int]] = None,
                 min_nodes: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 node_count: Optional[pulumi.Input[int]] = None,
                 size: Optional[pulumi.Input[Union[str, 'DropletSlug']]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 taints: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['KubernetesNodePoolTaintArgs']]]]] = None,
                 __props__=None):
        """
        Provides a DigitalOcean Kubernetes node pool resource. While the default node pool must be defined in the `KubernetesCluster` resource, this resource can be used to add additional ones to a cluster.

        ## Example Usage

        ## Import

        If you are importing an existing Kubernetes cluster with a single node pool, just import the cluster. Additional node pools can be imported by using their `id`, e.g.

        ```sh
         $ pulumi import digitalocean:index/kubernetesNodePool:KubernetesNodePool mynodepool 9d76f410-9284-4436-9633-4066852442c8
        ```

         NoteIf the node pool has the `terraform:default-node-pool` tag, then it is a default node pool for an existing cluster. The provider will refuse to import the node pool in that case because the node pool is managed by the `digitalocean_kubernetes_cluster` resource and not by this `digitalocean_kubernetes_node_pool` resource.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] auto_scale: Enable auto-scaling of the number of nodes in the node pool within the given min/max range.
        :param pulumi.Input[str] cluster_id: The ID of the Kubernetes cluster to which the node pool is associated.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: A map of key/value pairs to apply to nodes in the pool. The labels are exposed in the Kubernetes API as labels in the metadata of the corresponding [Node resources](https://kubernetes.io/docs/concepts/architecture/nodes/).
        :param pulumi.Input[int] max_nodes: If auto-scaling is enabled, this represents the maximum number of nodes that the node pool can be scaled up to.
        :param pulumi.Input[int] min_nodes: If auto-scaling is enabled, this represents the minimum number of nodes that the node pool can be scaled down to.
        :param pulumi.Input[str] name: A name for the node pool.
        :param pulumi.Input[int] node_count: The number of Droplet instances in the node pool. If auto-scaling is enabled, this should only be set if the desired result is to explicitly reset the number of nodes to this value. If auto-scaling is enabled, and the node count is outside of the given min/max range, it will use the min nodes value.
        :param pulumi.Input[Union[str, 'DropletSlug']] size: The slug identifier for the type of Droplet to be used as workers in the node pool.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: A list of tag names to be applied to the Kubernetes cluster.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['KubernetesNodePoolTaintArgs']]]] taints: A list of taints applied to all nodes in the pool.
               
               This resource supports customized create timeouts. The default timeout is 30 minutes.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: KubernetesNodePoolArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a DigitalOcean Kubernetes node pool resource. While the default node pool must be defined in the `KubernetesCluster` resource, this resource can be used to add additional ones to a cluster.

        ## Example Usage

        ## Import

        If you are importing an existing Kubernetes cluster with a single node pool, just import the cluster. Additional node pools can be imported by using their `id`, e.g.

        ```sh
         $ pulumi import digitalocean:index/kubernetesNodePool:KubernetesNodePool mynodepool 9d76f410-9284-4436-9633-4066852442c8
        ```

         NoteIf the node pool has the `terraform:default-node-pool` tag, then it is a default node pool for an existing cluster. The provider will refuse to import the node pool in that case because the node pool is managed by the `digitalocean_kubernetes_cluster` resource and not by this `digitalocean_kubernetes_node_pool` resource.

        :param str resource_name: The name of the resource.
        :param KubernetesNodePoolArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(KubernetesNodePoolArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            KubernetesNodePoolArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 auto_scale: Optional[pulumi.Input[bool]] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 max_nodes: Optional[pulumi.Input[int]] = None,
                 min_nodes: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 node_count: Optional[pulumi.Input[int]] = None,
                 size: Optional[pulumi.Input[Union[str, 'DropletSlug']]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 taints: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['KubernetesNodePoolTaintArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = KubernetesNodePoolArgs.__new__(KubernetesNodePoolArgs)

            __props__.__dict__["auto_scale"] = auto_scale
            if cluster_id is None and not opts.urn:
                raise TypeError("Missing required property 'cluster_id'")
            __props__.__dict__["cluster_id"] = cluster_id
            __props__.__dict__["labels"] = labels
            __props__.__dict__["max_nodes"] = max_nodes
            __props__.__dict__["min_nodes"] = min_nodes
            __props__.__dict__["name"] = name
            __props__.__dict__["node_count"] = node_count
            if size is None and not opts.urn:
                raise TypeError("Missing required property 'size'")
            __props__.__dict__["size"] = size
            __props__.__dict__["tags"] = tags
            __props__.__dict__["taints"] = taints
            __props__.__dict__["actual_node_count"] = None
            __props__.__dict__["nodes"] = None
        super(KubernetesNodePool, __self__).__init__(
            'digitalocean:index/kubernetesNodePool:KubernetesNodePool',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            actual_node_count: Optional[pulumi.Input[int]] = None,
            auto_scale: Optional[pulumi.Input[bool]] = None,
            cluster_id: Optional[pulumi.Input[str]] = None,
            labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            max_nodes: Optional[pulumi.Input[int]] = None,
            min_nodes: Optional[pulumi.Input[int]] = None,
            name: Optional[pulumi.Input[str]] = None,
            node_count: Optional[pulumi.Input[int]] = None,
            nodes: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['KubernetesNodePoolNodeArgs']]]]] = None,
            size: Optional[pulumi.Input[Union[str, 'DropletSlug']]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            taints: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['KubernetesNodePoolTaintArgs']]]]] = None) -> 'KubernetesNodePool':
        """
        Get an existing KubernetesNodePool resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] actual_node_count: A computed field representing the actual number of nodes in the node pool, which is especially useful when auto-scaling is enabled.
        :param pulumi.Input[bool] auto_scale: Enable auto-scaling of the number of nodes in the node pool within the given min/max range.
        :param pulumi.Input[str] cluster_id: The ID of the Kubernetes cluster to which the node pool is associated.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: A map of key/value pairs to apply to nodes in the pool. The labels are exposed in the Kubernetes API as labels in the metadata of the corresponding [Node resources](https://kubernetes.io/docs/concepts/architecture/nodes/).
        :param pulumi.Input[int] max_nodes: If auto-scaling is enabled, this represents the maximum number of nodes that the node pool can be scaled up to.
        :param pulumi.Input[int] min_nodes: If auto-scaling is enabled, this represents the minimum number of nodes that the node pool can be scaled down to.
        :param pulumi.Input[str] name: A name for the node pool.
        :param pulumi.Input[int] node_count: The number of Droplet instances in the node pool. If auto-scaling is enabled, this should only be set if the desired result is to explicitly reset the number of nodes to this value. If auto-scaling is enabled, and the node count is outside of the given min/max range, it will use the min nodes value.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['KubernetesNodePoolNodeArgs']]]] nodes: A list of nodes in the pool. Each node exports the following attributes:
        :param pulumi.Input[Union[str, 'DropletSlug']] size: The slug identifier for the type of Droplet to be used as workers in the node pool.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: A list of tag names to be applied to the Kubernetes cluster.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['KubernetesNodePoolTaintArgs']]]] taints: A list of taints applied to all nodes in the pool.
               
               This resource supports customized create timeouts. The default timeout is 30 minutes.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _KubernetesNodePoolState.__new__(_KubernetesNodePoolState)

        __props__.__dict__["actual_node_count"] = actual_node_count
        __props__.__dict__["auto_scale"] = auto_scale
        __props__.__dict__["cluster_id"] = cluster_id
        __props__.__dict__["labels"] = labels
        __props__.__dict__["max_nodes"] = max_nodes
        __props__.__dict__["min_nodes"] = min_nodes
        __props__.__dict__["name"] = name
        __props__.__dict__["node_count"] = node_count
        __props__.__dict__["nodes"] = nodes
        __props__.__dict__["size"] = size
        __props__.__dict__["tags"] = tags
        __props__.__dict__["taints"] = taints
        return KubernetesNodePool(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="actualNodeCount")
    def actual_node_count(self) -> pulumi.Output[int]:
        """
        A computed field representing the actual number of nodes in the node pool, which is especially useful when auto-scaling is enabled.
        """
        return pulumi.get(self, "actual_node_count")

    @property
    @pulumi.getter(name="autoScale")
    def auto_scale(self) -> pulumi.Output[Optional[bool]]:
        """
        Enable auto-scaling of the number of nodes in the node pool within the given min/max range.
        """
        return pulumi.get(self, "auto_scale")

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Output[str]:
        """
        The ID of the Kubernetes cluster to which the node pool is associated.
        """
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        A map of key/value pairs to apply to nodes in the pool. The labels are exposed in the Kubernetes API as labels in the metadata of the corresponding [Node resources](https://kubernetes.io/docs/concepts/architecture/nodes/).
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter(name="maxNodes")
    def max_nodes(self) -> pulumi.Output[Optional[int]]:
        """
        If auto-scaling is enabled, this represents the maximum number of nodes that the node pool can be scaled up to.
        """
        return pulumi.get(self, "max_nodes")

    @property
    @pulumi.getter(name="minNodes")
    def min_nodes(self) -> pulumi.Output[Optional[int]]:
        """
        If auto-scaling is enabled, this represents the minimum number of nodes that the node pool can be scaled down to.
        """
        return pulumi.get(self, "min_nodes")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        A name for the node pool.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="nodeCount")
    def node_count(self) -> pulumi.Output[Optional[int]]:
        """
        The number of Droplet instances in the node pool. If auto-scaling is enabled, this should only be set if the desired result is to explicitly reset the number of nodes to this value. If auto-scaling is enabled, and the node count is outside of the given min/max range, it will use the min nodes value.
        """
        return pulumi.get(self, "node_count")

    @property
    @pulumi.getter
    def nodes(self) -> pulumi.Output[Sequence['outputs.KubernetesNodePoolNode']]:
        """
        A list of nodes in the pool. Each node exports the following attributes:
        """
        return pulumi.get(self, "nodes")

    @property
    @pulumi.getter
    def size(self) -> pulumi.Output[str]:
        """
        The slug identifier for the type of Droplet to be used as workers in the node pool.
        """
        return pulumi.get(self, "size")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        A list of tag names to be applied to the Kubernetes cluster.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def taints(self) -> pulumi.Output[Optional[Sequence['outputs.KubernetesNodePoolTaint']]]:
        """
        A list of taints applied to all nodes in the pool.

        This resource supports customized create timeouts. The default timeout is 30 minutes.
        """
        return pulumi.get(self, "taints")

