# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from . import utilities, tables

class KubernetesNodePool(pulumi.CustomResource):
    cluster_id: pulumi.Output[str]
    """
    The ID of the Kubernetes cluster to which the node pool is associated.
    """
    name: pulumi.Output[str]
    """
    A name for the node pool.
    """
    node_count: pulumi.Output[float]
    """
    The number of Droplet instances in the node pool.
    """
    nodes: pulumi.Output[list]
    """
    A list of nodes in the pool. Each node exports the following attributes:
    - `id` -  A unique ID that can be used to identify and reference the node.
    - `name` - The auto-generated name for the node.
    - `status` -  A string indicating the current status of the individual node.
    - `created_at` - The date and time when the node was created.
    - `updated_at` - The date and time when the node was last updated.
    """
    size: pulumi.Output[str]
    """
    The slug identifier for the type of Droplet to be used as workers in the node pool.
    """
    tags: pulumi.Output[list]
    """
    A list of tag names to be applied to the Kubernetes cluster.
    """
    def __init__(__self__, resource_name, opts=None, cluster_id=None, name=None, node_count=None, size=None, tags=None, __name__=None, __opts__=None):
        """
        Provides a DigitalOcean Kubernetes node pool resource. While the default node pool must be defined in the `digitalocean_kubernetes_cluster` resource, this resource can be used to add additional ones to a cluster.
        
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_id: The ID of the Kubernetes cluster to which the node pool is associated.
        :param pulumi.Input[str] name: A name for the node pool.
        :param pulumi.Input[float] node_count: The number of Droplet instances in the node pool.
        :param pulumi.Input[str] size: The slug identifier for the type of Droplet to be used as workers in the node pool.
        :param pulumi.Input[list] tags: A list of tag names to be applied to the Kubernetes cluster.

        > This content is derived from https://github.com/terraform-providers/terraform-provider-digitalocean/blob/master/website/docs/r/kubernetes_node_pool.html.markdown.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if not resource_name:
            raise TypeError('Missing resource name argument (for URN creation)')
        if not isinstance(resource_name, str):
            raise TypeError('Expected resource name to be a string')
        if opts and not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')

        __props__ = dict()

        if cluster_id is None:
            raise TypeError("Missing required property 'cluster_id'")
        __props__['cluster_id'] = cluster_id

        __props__['name'] = name

        if node_count is None:
            raise TypeError("Missing required property 'node_count'")
        __props__['node_count'] = node_count

        if size is None:
            raise TypeError("Missing required property 'size'")
        __props__['size'] = size

        __props__['tags'] = tags

        __props__['nodes'] = None

        super(KubernetesNodePool, __self__).__init__(
            'digitalocean:index/kubernetesNodePool:KubernetesNodePool',
            resource_name,
            __props__,
            opts)


    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

