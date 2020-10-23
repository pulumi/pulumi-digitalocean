# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['LoadBalancer']


class LoadBalancer(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 algorithm: Optional[pulumi.Input[str]] = None,
                 droplet_ids: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]] = None,
                 droplet_tag: Optional[pulumi.Input[str]] = None,
                 enable_backend_keepalive: Optional[pulumi.Input[bool]] = None,
                 enable_proxy_protocol: Optional[pulumi.Input[bool]] = None,
                 forwarding_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['LoadBalancerForwardingRuleArgs']]]]] = None,
                 healthcheck: Optional[pulumi.Input[pulumi.InputType['LoadBalancerHealthcheckArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 redirect_http_to_https: Optional[pulumi.Input[bool]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 sticky_sessions: Optional[pulumi.Input[pulumi.InputType['LoadBalancerStickySessionsArgs']]] = None,
                 vpc_uuid: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a DigitalOcean Load Balancer resource. This can be used to create,
        modify, and delete Load Balancers.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        web = digitalocean.Droplet("web",
            size="s-1vcpu-1gb",
            image="ubuntu-18-04-x64",
            region="nyc3")
        public = digitalocean.LoadBalancer("public",
            region="nyc3",
            forwarding_rules=[digitalocean.LoadBalancerForwardingRuleArgs(
                entry_port=80,
                entry_protocol="http",
                target_port=80,
                target_protocol="http",
            )],
            healthcheck=digitalocean.LoadBalancerHealthcheckArgs(
                port=22,
                protocol="tcp",
            ),
            droplet_ids=[web.id])
        ```

        When managing certificates attached to the load balancer, make sure to add the `create_before_destroy`
        lifecycle property in order to ensure the certificate is correctly updated when changed. The order of
        operations will then be: `Create new certificate` > `Update loadbalancer with new certificate` ->
        `Delete old certificate`. When doing so, you must also change the name of the certificate,
        as there cannot be multiple certificates with the same name in an account.

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        cert = digitalocean.Certificate("cert",
            private_key="file('key.pem')",
            leaf_certificate="file('cert.pem')")
        web = digitalocean.Droplet("web",
            size="s-1vcpu-1gb",
            image="ubuntu-18-04-x64",
            region="nyc3")
        public = digitalocean.LoadBalancer("public",
            region="nyc3",
            forwarding_rules=[digitalocean.LoadBalancerForwardingRuleArgs(
                entry_port=443,
                entry_protocol="https",
                target_port=80,
                target_protocol="http",
                certificate_name=cert.name,
            )],
            healthcheck=digitalocean.LoadBalancerHealthcheckArgs(
                port=22,
                protocol="tcp",
            ),
            droplet_ids=[web.id])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] algorithm: The load balancing algorithm used to determine
               which backend Droplet will be selected by a client. It must be either `round_robin`
               or `least_connections`. The default value is `round_robin`.
        :param pulumi.Input[Sequence[pulumi.Input[int]]] droplet_ids: A list of the IDs of each droplet to be attached to the Load Balancer.
        :param pulumi.Input[str] droplet_tag: The name of a Droplet tag corresponding to Droplets to be assigned to the Load Balancer.
        :param pulumi.Input[bool] enable_backend_keepalive: A boolean value indicating whether HTTP keepalive connections are maintained to target Droplets. Default value is `false`.
        :param pulumi.Input[bool] enable_proxy_protocol: A boolean value indicating whether PROXY
               Protocol should be used to pass information from connecting client requests to
               the backend service. Default value is `false`.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['LoadBalancerForwardingRuleArgs']]]] forwarding_rules: A list of `forwarding_rule` to be assigned to the
               Load Balancer. The `forwarding_rule` block is documented below.
        :param pulumi.Input[pulumi.InputType['LoadBalancerHealthcheckArgs']] healthcheck: A `healthcheck` block to be assigned to the
               Load Balancer. The `healthcheck` block is documented below. Only 1 healthcheck is allowed.
        :param pulumi.Input[str] name: The Load Balancer name
        :param pulumi.Input[bool] redirect_http_to_https: A boolean value indicating whether
               HTTP requests to the Load Balancer on port 80 will be redirected to HTTPS on port 443.
               Default value is `false`.
        :param pulumi.Input[str] region: The region to start in
        :param pulumi.Input[pulumi.InputType['LoadBalancerStickySessionsArgs']] sticky_sessions: A `sticky_sessions` block to be assigned to the
               Load Balancer. The `sticky_sessions` block is documented below. Only 1 sticky_sessions block is allowed.
        :param pulumi.Input[str] vpc_uuid: The ID of the VPC where the load balancer will be located.
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
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['algorithm'] = algorithm
            __props__['droplet_ids'] = droplet_ids
            __props__['droplet_tag'] = droplet_tag
            __props__['enable_backend_keepalive'] = enable_backend_keepalive
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
            __props__['vpc_uuid'] = vpc_uuid
            __props__['ip'] = None
            __props__['load_balancer_urn'] = None
            __props__['status'] = None
        super(LoadBalancer, __self__).__init__(
            'digitalocean:index/loadBalancer:LoadBalancer',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            algorithm: Optional[pulumi.Input[str]] = None,
            droplet_ids: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]] = None,
            droplet_tag: Optional[pulumi.Input[str]] = None,
            enable_backend_keepalive: Optional[pulumi.Input[bool]] = None,
            enable_proxy_protocol: Optional[pulumi.Input[bool]] = None,
            forwarding_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['LoadBalancerForwardingRuleArgs']]]]] = None,
            healthcheck: Optional[pulumi.Input[pulumi.InputType['LoadBalancerHealthcheckArgs']]] = None,
            ip: Optional[pulumi.Input[str]] = None,
            load_balancer_urn: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            redirect_http_to_https: Optional[pulumi.Input[bool]] = None,
            region: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            sticky_sessions: Optional[pulumi.Input[pulumi.InputType['LoadBalancerStickySessionsArgs']]] = None,
            vpc_uuid: Optional[pulumi.Input[str]] = None) -> 'LoadBalancer':
        """
        Get an existing LoadBalancer resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] algorithm: The load balancing algorithm used to determine
               which backend Droplet will be selected by a client. It must be either `round_robin`
               or `least_connections`. The default value is `round_robin`.
        :param pulumi.Input[Sequence[pulumi.Input[int]]] droplet_ids: A list of the IDs of each droplet to be attached to the Load Balancer.
        :param pulumi.Input[str] droplet_tag: The name of a Droplet tag corresponding to Droplets to be assigned to the Load Balancer.
        :param pulumi.Input[bool] enable_backend_keepalive: A boolean value indicating whether HTTP keepalive connections are maintained to target Droplets. Default value is `false`.
        :param pulumi.Input[bool] enable_proxy_protocol: A boolean value indicating whether PROXY
               Protocol should be used to pass information from connecting client requests to
               the backend service. Default value is `false`.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['LoadBalancerForwardingRuleArgs']]]] forwarding_rules: A list of `forwarding_rule` to be assigned to the
               Load Balancer. The `forwarding_rule` block is documented below.
        :param pulumi.Input[pulumi.InputType['LoadBalancerHealthcheckArgs']] healthcheck: A `healthcheck` block to be assigned to the
               Load Balancer. The `healthcheck` block is documented below. Only 1 healthcheck is allowed.
        :param pulumi.Input[str] load_balancer_urn: The uniform resource name for the Load Balancer
        :param pulumi.Input[str] name: The Load Balancer name
        :param pulumi.Input[bool] redirect_http_to_https: A boolean value indicating whether
               HTTP requests to the Load Balancer on port 80 will be redirected to HTTPS on port 443.
               Default value is `false`.
        :param pulumi.Input[str] region: The region to start in
        :param pulumi.Input[pulumi.InputType['LoadBalancerStickySessionsArgs']] sticky_sessions: A `sticky_sessions` block to be assigned to the
               Load Balancer. The `sticky_sessions` block is documented below. Only 1 sticky_sessions block is allowed.
        :param pulumi.Input[str] vpc_uuid: The ID of the VPC where the load balancer will be located.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["algorithm"] = algorithm
        __props__["droplet_ids"] = droplet_ids
        __props__["droplet_tag"] = droplet_tag
        __props__["enable_backend_keepalive"] = enable_backend_keepalive
        __props__["enable_proxy_protocol"] = enable_proxy_protocol
        __props__["forwarding_rules"] = forwarding_rules
        __props__["healthcheck"] = healthcheck
        __props__["ip"] = ip
        __props__["load_balancer_urn"] = load_balancer_urn
        __props__["name"] = name
        __props__["redirect_http_to_https"] = redirect_http_to_https
        __props__["region"] = region
        __props__["status"] = status
        __props__["sticky_sessions"] = sticky_sessions
        __props__["vpc_uuid"] = vpc_uuid
        return LoadBalancer(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def algorithm(self) -> pulumi.Output[Optional[str]]:
        """
        The load balancing algorithm used to determine
        which backend Droplet will be selected by a client. It must be either `round_robin`
        or `least_connections`. The default value is `round_robin`.
        """
        return pulumi.get(self, "algorithm")

    @property
    @pulumi.getter(name="dropletIds")
    def droplet_ids(self) -> pulumi.Output[Sequence[int]]:
        """
        A list of the IDs of each droplet to be attached to the Load Balancer.
        """
        return pulumi.get(self, "droplet_ids")

    @property
    @pulumi.getter(name="dropletTag")
    def droplet_tag(self) -> pulumi.Output[Optional[str]]:
        """
        The name of a Droplet tag corresponding to Droplets to be assigned to the Load Balancer.
        """
        return pulumi.get(self, "droplet_tag")

    @property
    @pulumi.getter(name="enableBackendKeepalive")
    def enable_backend_keepalive(self) -> pulumi.Output[Optional[bool]]:
        """
        A boolean value indicating whether HTTP keepalive connections are maintained to target Droplets. Default value is `false`.
        """
        return pulumi.get(self, "enable_backend_keepalive")

    @property
    @pulumi.getter(name="enableProxyProtocol")
    def enable_proxy_protocol(self) -> pulumi.Output[Optional[bool]]:
        """
        A boolean value indicating whether PROXY
        Protocol should be used to pass information from connecting client requests to
        the backend service. Default value is `false`.
        """
        return pulumi.get(self, "enable_proxy_protocol")

    @property
    @pulumi.getter(name="forwardingRules")
    def forwarding_rules(self) -> pulumi.Output[Sequence['outputs.LoadBalancerForwardingRule']]:
        """
        A list of `forwarding_rule` to be assigned to the
        Load Balancer. The `forwarding_rule` block is documented below.
        """
        return pulumi.get(self, "forwarding_rules")

    @property
    @pulumi.getter
    def healthcheck(self) -> pulumi.Output['outputs.LoadBalancerHealthcheck']:
        """
        A `healthcheck` block to be assigned to the
        Load Balancer. The `healthcheck` block is documented below. Only 1 healthcheck is allowed.
        """
        return pulumi.get(self, "healthcheck")

    @property
    @pulumi.getter
    def ip(self) -> pulumi.Output[str]:
        return pulumi.get(self, "ip")

    @property
    @pulumi.getter(name="loadBalancerUrn")
    def load_balancer_urn(self) -> pulumi.Output[str]:
        """
        The uniform resource name for the Load Balancer
        """
        return pulumi.get(self, "load_balancer_urn")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The Load Balancer name
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="redirectHttpToHttps")
    def redirect_http_to_https(self) -> pulumi.Output[Optional[bool]]:
        """
        A boolean value indicating whether
        HTTP requests to the Load Balancer on port 80 will be redirected to HTTPS on port 443.
        Default value is `false`.
        """
        return pulumi.get(self, "redirect_http_to_https")

    @property
    @pulumi.getter
    def region(self) -> pulumi.Output[str]:
        """
        The region to start in
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="stickySessions")
    def sticky_sessions(self) -> pulumi.Output['outputs.LoadBalancerStickySessions']:
        """
        A `sticky_sessions` block to be assigned to the
        Load Balancer. The `sticky_sessions` block is documented below. Only 1 sticky_sessions block is allowed.
        """
        return pulumi.get(self, "sticky_sessions")

    @property
    @pulumi.getter(name="vpcUuid")
    def vpc_uuid(self) -> pulumi.Output[str]:
        """
        The ID of the VPC where the load balancer will be located.
        """
        return pulumi.get(self, "vpc_uuid")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

