# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class LoadBalancer(pulumi.CustomResource):
    algorithm: pulumi.Output[str]
    """
    The load balancing algorithm used to determine
    which backend Droplet will be selected by a client. It must be either `round_robin`
    or `least_connections`. The default value is `round_robin`.
    """
    droplet_ids: pulumi.Output[list]
    """
    A list of the IDs of each droplet to be attached to the Load Balancer.
    """
    droplet_tag: pulumi.Output[str]
    """
    The name of a Droplet tag corresponding to Droplets to be assigned to the Load Balancer.
    """
    enable_proxy_protocol: pulumi.Output[bool]
    """
    A boolean value indicating whether PROXY
    Protocol should be used to pass information from connecting client requests to
    the backend service. Default value is `false`.
    """
    forwarding_rules: pulumi.Output[list]
    """
    A list of `forwarding_rule` to be assigned to the
    Load Balancer. The `forwarding_rule` block is documented below.
    
      * `certificate_id` (`str`) - The ID of the TLS certificate to be used for SSL termination.
      * `entry_port` (`float`) - An integer representing the port on which the Load Balancer instance will listen.
      * `entry_protocol` (`str`) - The protocol used for traffic to the Load Balancer. The possible values are: `http`, `https`, `http2` or `tcp`.
      * `target_port` (`float`) - An integer representing the port on the backend Droplets to which the Load Balancer will send traffic.
      * `target_protocol` (`str`) - The protocol used for traffic from the Load Balancer to the backend Droplets. The possible values are: `http`, `https`, `http2` or `tcp`.
      * `tls_passthrough` (`bool`) - A boolean value indicating whether SSL encrypted traffic will be passed through to the backend Droplets. The default value is `false`.
    """
    healthcheck: pulumi.Output[dict]
    """
    A `healthcheck` block to be assigned to the
    Load Balancer. The `healthcheck` block is documented below. Only 1 healthcheck is allowed.
    
      * `check_interval_seconds` (`float`) - The number of seconds between between two consecutive health checks. If not specified, the default value is `10`.
      * `healthy_threshold` (`float`) - The number of times a health check must pass for a backend Droplet to be marked "healthy" and be re-added to the pool. If not specified, the default value is `5`.
      * `path` (`str`) - The path on the backend Droplets to which the Load Balancer instance will send a request.
      * `port` (`float`) - An integer representing the port on the backend Droplets on which the health check will attempt a connection.
      * `protocol` (`str`) - The protocol used for health checks sent to the backend Droplets. The possible values are `http` or `tcp`.
      * `response_timeout_seconds` (`float`) - The number of seconds the Load Balancer instance will wait for a response until marking a health check as failed. If not specified, the default value is `5`.
      * `unhealthy_threshold` (`float`) - The number of times a health check must fail for a backend Droplet to be marked "unhealthy" and be removed from the pool. If not specified, the default value is `3`.
    """
    ip: pulumi.Output[str]
    name: pulumi.Output[str]
    """
    The Load Balancer name
    """
    redirect_http_to_https: pulumi.Output[bool]
    """
    A boolean value indicating whether
    HTTP requests to the Load Balancer on port 80 will be redirected to HTTPS on port 443.
    Default value is `false`.
    """
    region: pulumi.Output[str]
    """
    The region to start in
    """
    status: pulumi.Output[str]
    sticky_sessions: pulumi.Output[dict]
    """
    A `sticky_sessions` block to be assigned to the
    Load Balancer. The `sticky_sessions` block is documented below. Only 1 sticky_sessions block is allowed.
    
      * `cookie_name` (`str`) - The name to be used for the cookie sent to the client. This attribute is required when using `cookies` for the sticky sessions type.
      * `cookie_ttl_seconds` (`float`) - The number of seconds until the cookie set by the Load Balancer expires. This attribute is required when using `cookies` for the sticky sessions type.
      * `type` (`str`) - An attribute indicating how and if requests from a client will be persistently served by the same backend Droplet. The possible values are `cookies` or `none`. If not specified, the default value is `none`.
    """
    urn: pulumi.Output[str]
    """
    The uniform resource name for the Load Balancer
    """
    def __init__(__self__, resource_name, opts=None, algorithm=None, droplet_ids=None, droplet_tag=None, enable_proxy_protocol=None, forwarding_rules=None, healthcheck=None, name=None, redirect_http_to_https=None, region=None, sticky_sessions=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides a DigitalOcean Load Balancer resource. This can be used to create,
        modify, and delete Load Balancers.
        
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] algorithm: The load balancing algorithm used to determine
               which backend Droplet will be selected by a client. It must be either `round_robin`
               or `least_connections`. The default value is `round_robin`.
        :param pulumi.Input[list] droplet_ids: A list of the IDs of each droplet to be attached to the Load Balancer.
        :param pulumi.Input[str] droplet_tag: The name of a Droplet tag corresponding to Droplets to be assigned to the Load Balancer.
        :param pulumi.Input[bool] enable_proxy_protocol: A boolean value indicating whether PROXY
               Protocol should be used to pass information from connecting client requests to
               the backend service. Default value is `false`.
        :param pulumi.Input[list] forwarding_rules: A list of `forwarding_rule` to be assigned to the
               Load Balancer. The `forwarding_rule` block is documented below.
        :param pulumi.Input[dict] healthcheck: A `healthcheck` block to be assigned to the
               Load Balancer. The `healthcheck` block is documented below. Only 1 healthcheck is allowed.
        :param pulumi.Input[str] name: The Load Balancer name
        :param pulumi.Input[bool] redirect_http_to_https: A boolean value indicating whether
               HTTP requests to the Load Balancer on port 80 will be redirected to HTTPS on port 443.
               Default value is `false`.
        :param pulumi.Input[str] region: The region to start in
        :param pulumi.Input[dict] sticky_sessions: A `sticky_sessions` block to be assigned to the
               Load Balancer. The `sticky_sessions` block is documented below. Only 1 sticky_sessions block is allowed.
        
        The **forwarding_rules** object supports the following:
        
          * `certificate_id` (`pulumi.Input[str]`) - The ID of the TLS certificate to be used for SSL termination.
          * `entry_port` (`pulumi.Input[float]`) - An integer representing the port on which the Load Balancer instance will listen.
          * `entry_protocol` (`pulumi.Input[str]`) - The protocol used for traffic to the Load Balancer. The possible values are: `http`, `https`, `http2` or `tcp`.
          * `target_port` (`pulumi.Input[float]`) - An integer representing the port on the backend Droplets to which the Load Balancer will send traffic.
          * `target_protocol` (`pulumi.Input[str]`) - The protocol used for traffic from the Load Balancer to the backend Droplets. The possible values are: `http`, `https`, `http2` or `tcp`.
          * `tls_passthrough` (`pulumi.Input[bool]`) - A boolean value indicating whether SSL encrypted traffic will be passed through to the backend Droplets. The default value is `false`.
        
        The **healthcheck** object supports the following:
        
          * `check_interval_seconds` (`pulumi.Input[float]`) - The number of seconds between between two consecutive health checks. If not specified, the default value is `10`.
          * `healthy_threshold` (`pulumi.Input[float]`) - The number of times a health check must pass for a backend Droplet to be marked "healthy" and be re-added to the pool. If not specified, the default value is `5`.
          * `path` (`pulumi.Input[str]`) - The path on the backend Droplets to which the Load Balancer instance will send a request.
          * `port` (`pulumi.Input[float]`) - An integer representing the port on the backend Droplets on which the health check will attempt a connection.
          * `protocol` (`pulumi.Input[str]`) - The protocol used for health checks sent to the backend Droplets. The possible values are `http` or `tcp`.
          * `response_timeout_seconds` (`pulumi.Input[float]`) - The number of seconds the Load Balancer instance will wait for a response until marking a health check as failed. If not specified, the default value is `5`.
          * `unhealthy_threshold` (`pulumi.Input[float]`) - The number of times a health check must fail for a backend Droplet to be marked "unhealthy" and be removed from the pool. If not specified, the default value is `3`.
        
        The **sticky_sessions** object supports the following:
        
          * `cookie_name` (`pulumi.Input[str]`) - The name to be used for the cookie sent to the client. This attribute is required when using `cookies` for the sticky sessions type.
          * `cookie_ttl_seconds` (`pulumi.Input[float]`) - The number of seconds until the cookie set by the Load Balancer expires. This attribute is required when using `cookies` for the sticky sessions type.
          * `type` (`pulumi.Input[str]`) - An attribute indicating how and if requests from a client will be persistently served by the same backend Droplet. The possible values are `cookies` or `none`. If not specified, the default value is `none`.

        > This content is derived from https://github.com/terraform-providers/terraform-provider-digitalocean/blob/master/website/docs/r/loadbalancer.html.markdown.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['algorithm'] = algorithm
            __props__['droplet_ids'] = droplet_ids
            __props__['droplet_tag'] = droplet_tag
            __props__['enable_proxy_protocol'] = enable_proxy_protocol
            if forwarding_rules is None:
                raise TypeError("Missing required property 'forwarding_rules'")
            __props__['forwarding_rules'] = forwarding_rules
            __props__['healthcheck'] = healthcheck
            __props__['name'] = name
            __props__['redirect_http_to_https'] = redirect_http_to_https
            if region is None:
                raise TypeError("Missing required property 'region'")
            __props__['region'] = region
            __props__['sticky_sessions'] = sticky_sessions
            __props__['ip'] = None
            __props__['status'] = None
            __props__['urn'] = None
        super(LoadBalancer, __self__).__init__(
            'digitalocean:index/loadBalancer:LoadBalancer',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, algorithm=None, droplet_ids=None, droplet_tag=None, enable_proxy_protocol=None, forwarding_rules=None, healthcheck=None, ip=None, name=None, redirect_http_to_https=None, region=None, status=None, sticky_sessions=None, urn=None):
        """
        Get an existing LoadBalancer resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.
        
        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] algorithm: The load balancing algorithm used to determine
               which backend Droplet will be selected by a client. It must be either `round_robin`
               or `least_connections`. The default value is `round_robin`.
        :param pulumi.Input[list] droplet_ids: A list of the IDs of each droplet to be attached to the Load Balancer.
        :param pulumi.Input[str] droplet_tag: The name of a Droplet tag corresponding to Droplets to be assigned to the Load Balancer.
        :param pulumi.Input[bool] enable_proxy_protocol: A boolean value indicating whether PROXY
               Protocol should be used to pass information from connecting client requests to
               the backend service. Default value is `false`.
        :param pulumi.Input[list] forwarding_rules: A list of `forwarding_rule` to be assigned to the
               Load Balancer. The `forwarding_rule` block is documented below.
        :param pulumi.Input[dict] healthcheck: A `healthcheck` block to be assigned to the
               Load Balancer. The `healthcheck` block is documented below. Only 1 healthcheck is allowed.
        :param pulumi.Input[str] name: The Load Balancer name
        :param pulumi.Input[bool] redirect_http_to_https: A boolean value indicating whether
               HTTP requests to the Load Balancer on port 80 will be redirected to HTTPS on port 443.
               Default value is `false`.
        :param pulumi.Input[str] region: The region to start in
        :param pulumi.Input[dict] sticky_sessions: A `sticky_sessions` block to be assigned to the
               Load Balancer. The `sticky_sessions` block is documented below. Only 1 sticky_sessions block is allowed.
        :param pulumi.Input[str] urn: The uniform resource name for the Load Balancer
        
        The **forwarding_rules** object supports the following:
        
          * `certificate_id` (`pulumi.Input[str]`) - The ID of the TLS certificate to be used for SSL termination.
          * `entry_port` (`pulumi.Input[float]`) - An integer representing the port on which the Load Balancer instance will listen.
          * `entry_protocol` (`pulumi.Input[str]`) - The protocol used for traffic to the Load Balancer. The possible values are: `http`, `https`, `http2` or `tcp`.
          * `target_port` (`pulumi.Input[float]`) - An integer representing the port on the backend Droplets to which the Load Balancer will send traffic.
          * `target_protocol` (`pulumi.Input[str]`) - The protocol used for traffic from the Load Balancer to the backend Droplets. The possible values are: `http`, `https`, `http2` or `tcp`.
          * `tls_passthrough` (`pulumi.Input[bool]`) - A boolean value indicating whether SSL encrypted traffic will be passed through to the backend Droplets. The default value is `false`.
        
        The **healthcheck** object supports the following:
        
          * `check_interval_seconds` (`pulumi.Input[float]`) - The number of seconds between between two consecutive health checks. If not specified, the default value is `10`.
          * `healthy_threshold` (`pulumi.Input[float]`) - The number of times a health check must pass for a backend Droplet to be marked "healthy" and be re-added to the pool. If not specified, the default value is `5`.
          * `path` (`pulumi.Input[str]`) - The path on the backend Droplets to which the Load Balancer instance will send a request.
          * `port` (`pulumi.Input[float]`) - An integer representing the port on the backend Droplets on which the health check will attempt a connection.
          * `protocol` (`pulumi.Input[str]`) - The protocol used for health checks sent to the backend Droplets. The possible values are `http` or `tcp`.
          * `response_timeout_seconds` (`pulumi.Input[float]`) - The number of seconds the Load Balancer instance will wait for a response until marking a health check as failed. If not specified, the default value is `5`.
          * `unhealthy_threshold` (`pulumi.Input[float]`) - The number of times a health check must fail for a backend Droplet to be marked "unhealthy" and be removed from the pool. If not specified, the default value is `3`.
        
        The **sticky_sessions** object supports the following:
        
          * `cookie_name` (`pulumi.Input[str]`) - The name to be used for the cookie sent to the client. This attribute is required when using `cookies` for the sticky sessions type.
          * `cookie_ttl_seconds` (`pulumi.Input[float]`) - The number of seconds until the cookie set by the Load Balancer expires. This attribute is required when using `cookies` for the sticky sessions type.
          * `type` (`pulumi.Input[str]`) - An attribute indicating how and if requests from a client will be persistently served by the same backend Droplet. The possible values are `cookies` or `none`. If not specified, the default value is `none`.

        > This content is derived from https://github.com/terraform-providers/terraform-provider-digitalocean/blob/master/website/docs/r/loadbalancer.html.markdown.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()
        __props__["algorithm"] = algorithm
        __props__["droplet_ids"] = droplet_ids
        __props__["droplet_tag"] = droplet_tag
        __props__["enable_proxy_protocol"] = enable_proxy_protocol
        __props__["forwarding_rules"] = forwarding_rules
        __props__["healthcheck"] = healthcheck
        __props__["ip"] = ip
        __props__["name"] = name
        __props__["redirect_http_to_https"] = redirect_http_to_https
        __props__["region"] = region
        __props__["status"] = status
        __props__["sticky_sessions"] = sticky_sessions
        __props__["urn"] = urn
        return LoadBalancer(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

