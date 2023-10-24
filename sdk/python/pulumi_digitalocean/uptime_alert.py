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
from ._inputs import *

__all__ = ['UptimeAlertArgs', 'UptimeAlert']

@pulumi.input_type
class UptimeAlertArgs:
    def __init__(__self__, *,
                 check_id: pulumi.Input[str],
                 notifications: pulumi.Input[Sequence[pulumi.Input['UptimeAlertNotificationArgs']]],
                 type: pulumi.Input[str],
                 comparison: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 period: Optional[pulumi.Input[str]] = None,
                 threshold: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a UptimeAlert resource.
        :param pulumi.Input[str] check_id: A unique identifier for a check
        :param pulumi.Input[Sequence[pulumi.Input['UptimeAlertNotificationArgs']]] notifications: The notification settings for a trigger alert.
        :param pulumi.Input[str] type: The type of health check to perform. Must be one of `latency`, `down`, `down_global` or `ssl_expiry`.
        :param pulumi.Input[str] comparison: The comparison operator used against the alert's threshold. Must be one of `greater_than` or `less_than`.
        :param pulumi.Input[str] name: A human-friendly display name.
        :param pulumi.Input[str] period: Period of time the threshold must be exceeded to trigger the alert. Must be one of `2m`, `3m`, `5m`, `10m`, `15m`, `30m` or `1h`.
        :param pulumi.Input[int] threshold: The threshold at which the alert will enter a trigger state. The specific threshold is dependent on the alert type.
        """
        UptimeAlertArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            check_id=check_id,
            notifications=notifications,
            type=type,
            comparison=comparison,
            name=name,
            period=period,
            threshold=threshold,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             check_id: Optional[pulumi.Input[str]] = None,
             notifications: Optional[pulumi.Input[Sequence[pulumi.Input['UptimeAlertNotificationArgs']]]] = None,
             type: Optional[pulumi.Input[str]] = None,
             comparison: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             period: Optional[pulumi.Input[str]] = None,
             threshold: Optional[pulumi.Input[int]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if check_id is None and 'checkId' in kwargs:
            check_id = kwargs['checkId']
        if check_id is None:
            raise TypeError("Missing 'check_id' argument")
        if notifications is None:
            raise TypeError("Missing 'notifications' argument")
        if type is None:
            raise TypeError("Missing 'type' argument")

        _setter("check_id", check_id)
        _setter("notifications", notifications)
        _setter("type", type)
        if comparison is not None:
            _setter("comparison", comparison)
        if name is not None:
            _setter("name", name)
        if period is not None:
            _setter("period", period)
        if threshold is not None:
            _setter("threshold", threshold)

    @property
    @pulumi.getter(name="checkId")
    def check_id(self) -> pulumi.Input[str]:
        """
        A unique identifier for a check
        """
        return pulumi.get(self, "check_id")

    @check_id.setter
    def check_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "check_id", value)

    @property
    @pulumi.getter
    def notifications(self) -> pulumi.Input[Sequence[pulumi.Input['UptimeAlertNotificationArgs']]]:
        """
        The notification settings for a trigger alert.
        """
        return pulumi.get(self, "notifications")

    @notifications.setter
    def notifications(self, value: pulumi.Input[Sequence[pulumi.Input['UptimeAlertNotificationArgs']]]):
        pulumi.set(self, "notifications", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        The type of health check to perform. Must be one of `latency`, `down`, `down_global` or `ssl_expiry`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def comparison(self) -> Optional[pulumi.Input[str]]:
        """
        The comparison operator used against the alert's threshold. Must be one of `greater_than` or `less_than`.
        """
        return pulumi.get(self, "comparison")

    @comparison.setter
    def comparison(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comparison", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        A human-friendly display name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def period(self) -> Optional[pulumi.Input[str]]:
        """
        Period of time the threshold must be exceeded to trigger the alert. Must be one of `2m`, `3m`, `5m`, `10m`, `15m`, `30m` or `1h`.
        """
        return pulumi.get(self, "period")

    @period.setter
    def period(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "period", value)

    @property
    @pulumi.getter
    def threshold(self) -> Optional[pulumi.Input[int]]:
        """
        The threshold at which the alert will enter a trigger state. The specific threshold is dependent on the alert type.
        """
        return pulumi.get(self, "threshold")

    @threshold.setter
    def threshold(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "threshold", value)


@pulumi.input_type
class _UptimeAlertState:
    def __init__(__self__, *,
                 check_id: Optional[pulumi.Input[str]] = None,
                 comparison: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 notifications: Optional[pulumi.Input[Sequence[pulumi.Input['UptimeAlertNotificationArgs']]]] = None,
                 period: Optional[pulumi.Input[str]] = None,
                 threshold: Optional[pulumi.Input[int]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering UptimeAlert resources.
        :param pulumi.Input[str] check_id: A unique identifier for a check
        :param pulumi.Input[str] comparison: The comparison operator used against the alert's threshold. Must be one of `greater_than` or `less_than`.
        :param pulumi.Input[str] name: A human-friendly display name.
        :param pulumi.Input[Sequence[pulumi.Input['UptimeAlertNotificationArgs']]] notifications: The notification settings for a trigger alert.
        :param pulumi.Input[str] period: Period of time the threshold must be exceeded to trigger the alert. Must be one of `2m`, `3m`, `5m`, `10m`, `15m`, `30m` or `1h`.
        :param pulumi.Input[int] threshold: The threshold at which the alert will enter a trigger state. The specific threshold is dependent on the alert type.
        :param pulumi.Input[str] type: The type of health check to perform. Must be one of `latency`, `down`, `down_global` or `ssl_expiry`.
        """
        _UptimeAlertState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            check_id=check_id,
            comparison=comparison,
            name=name,
            notifications=notifications,
            period=period,
            threshold=threshold,
            type=type,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             check_id: Optional[pulumi.Input[str]] = None,
             comparison: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             notifications: Optional[pulumi.Input[Sequence[pulumi.Input['UptimeAlertNotificationArgs']]]] = None,
             period: Optional[pulumi.Input[str]] = None,
             threshold: Optional[pulumi.Input[int]] = None,
             type: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if check_id is None and 'checkId' in kwargs:
            check_id = kwargs['checkId']

        if check_id is not None:
            _setter("check_id", check_id)
        if comparison is not None:
            _setter("comparison", comparison)
        if name is not None:
            _setter("name", name)
        if notifications is not None:
            _setter("notifications", notifications)
        if period is not None:
            _setter("period", period)
        if threshold is not None:
            _setter("threshold", threshold)
        if type is not None:
            _setter("type", type)

    @property
    @pulumi.getter(name="checkId")
    def check_id(self) -> Optional[pulumi.Input[str]]:
        """
        A unique identifier for a check
        """
        return pulumi.get(self, "check_id")

    @check_id.setter
    def check_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "check_id", value)

    @property
    @pulumi.getter
    def comparison(self) -> Optional[pulumi.Input[str]]:
        """
        The comparison operator used against the alert's threshold. Must be one of `greater_than` or `less_than`.
        """
        return pulumi.get(self, "comparison")

    @comparison.setter
    def comparison(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comparison", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        A human-friendly display name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def notifications(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['UptimeAlertNotificationArgs']]]]:
        """
        The notification settings for a trigger alert.
        """
        return pulumi.get(self, "notifications")

    @notifications.setter
    def notifications(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['UptimeAlertNotificationArgs']]]]):
        pulumi.set(self, "notifications", value)

    @property
    @pulumi.getter
    def period(self) -> Optional[pulumi.Input[str]]:
        """
        Period of time the threshold must be exceeded to trigger the alert. Must be one of `2m`, `3m`, `5m`, `10m`, `15m`, `30m` or `1h`.
        """
        return pulumi.get(self, "period")

    @period.setter
    def period(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "period", value)

    @property
    @pulumi.getter
    def threshold(self) -> Optional[pulumi.Input[int]]:
        """
        The threshold at which the alert will enter a trigger state. The specific threshold is dependent on the alert type.
        """
        return pulumi.get(self, "threshold")

    @threshold.setter
    def threshold(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "threshold", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of health check to perform. Must be one of `latency`, `down`, `down_global` or `ssl_expiry`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class UptimeAlert(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 check_id: Optional[pulumi.Input[str]] = None,
                 comparison: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 notifications: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['UptimeAlertNotificationArgs']]]]] = None,
                 period: Optional[pulumi.Input[str]] = None,
                 threshold: Optional[pulumi.Input[int]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a [DigitalOcean Uptime Alerts](https://docs.digitalocean.com/reference/api/api-reference/#operation/uptime_alert_create)
        resource. Uptime Alerts provide the ability to add alerts to your [DigitalOcean Uptime Checks](https://docs.digitalocean.com/reference/api/api-reference/#tag/Uptime) when your endpoints are slow, unavailable, or SSL certificates are expiring.

        ## Import

        Uptime checks can be imported using the uptime alert's `id`, e.g.

        ```sh
         $ pulumi import digitalocean:index/uptimeAlert:UptimeAlert target 5a4981aa-9653-4bd1-bef5-d6bff52042e4
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] check_id: A unique identifier for a check
        :param pulumi.Input[str] comparison: The comparison operator used against the alert's threshold. Must be one of `greater_than` or `less_than`.
        :param pulumi.Input[str] name: A human-friendly display name.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['UptimeAlertNotificationArgs']]]] notifications: The notification settings for a trigger alert.
        :param pulumi.Input[str] period: Period of time the threshold must be exceeded to trigger the alert. Must be one of `2m`, `3m`, `5m`, `10m`, `15m`, `30m` or `1h`.
        :param pulumi.Input[int] threshold: The threshold at which the alert will enter a trigger state. The specific threshold is dependent on the alert type.
        :param pulumi.Input[str] type: The type of health check to perform. Must be one of `latency`, `down`, `down_global` or `ssl_expiry`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: UptimeAlertArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a [DigitalOcean Uptime Alerts](https://docs.digitalocean.com/reference/api/api-reference/#operation/uptime_alert_create)
        resource. Uptime Alerts provide the ability to add alerts to your [DigitalOcean Uptime Checks](https://docs.digitalocean.com/reference/api/api-reference/#tag/Uptime) when your endpoints are slow, unavailable, or SSL certificates are expiring.

        ## Import

        Uptime checks can be imported using the uptime alert's `id`, e.g.

        ```sh
         $ pulumi import digitalocean:index/uptimeAlert:UptimeAlert target 5a4981aa-9653-4bd1-bef5-d6bff52042e4
        ```

        :param str resource_name: The name of the resource.
        :param UptimeAlertArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(UptimeAlertArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            UptimeAlertArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 check_id: Optional[pulumi.Input[str]] = None,
                 comparison: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 notifications: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['UptimeAlertNotificationArgs']]]]] = None,
                 period: Optional[pulumi.Input[str]] = None,
                 threshold: Optional[pulumi.Input[int]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = UptimeAlertArgs.__new__(UptimeAlertArgs)

            if check_id is None and not opts.urn:
                raise TypeError("Missing required property 'check_id'")
            __props__.__dict__["check_id"] = check_id
            __props__.__dict__["comparison"] = comparison
            __props__.__dict__["name"] = name
            if notifications is None and not opts.urn:
                raise TypeError("Missing required property 'notifications'")
            __props__.__dict__["notifications"] = notifications
            __props__.__dict__["period"] = period
            __props__.__dict__["threshold"] = threshold
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
        super(UptimeAlert, __self__).__init__(
            'digitalocean:index/uptimeAlert:UptimeAlert',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            check_id: Optional[pulumi.Input[str]] = None,
            comparison: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            notifications: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['UptimeAlertNotificationArgs']]]]] = None,
            period: Optional[pulumi.Input[str]] = None,
            threshold: Optional[pulumi.Input[int]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'UptimeAlert':
        """
        Get an existing UptimeAlert resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] check_id: A unique identifier for a check
        :param pulumi.Input[str] comparison: The comparison operator used against the alert's threshold. Must be one of `greater_than` or `less_than`.
        :param pulumi.Input[str] name: A human-friendly display name.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['UptimeAlertNotificationArgs']]]] notifications: The notification settings for a trigger alert.
        :param pulumi.Input[str] period: Period of time the threshold must be exceeded to trigger the alert. Must be one of `2m`, `3m`, `5m`, `10m`, `15m`, `30m` or `1h`.
        :param pulumi.Input[int] threshold: The threshold at which the alert will enter a trigger state. The specific threshold is dependent on the alert type.
        :param pulumi.Input[str] type: The type of health check to perform. Must be one of `latency`, `down`, `down_global` or `ssl_expiry`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _UptimeAlertState.__new__(_UptimeAlertState)

        __props__.__dict__["check_id"] = check_id
        __props__.__dict__["comparison"] = comparison
        __props__.__dict__["name"] = name
        __props__.__dict__["notifications"] = notifications
        __props__.__dict__["period"] = period
        __props__.__dict__["threshold"] = threshold
        __props__.__dict__["type"] = type
        return UptimeAlert(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="checkId")
    def check_id(self) -> pulumi.Output[str]:
        """
        A unique identifier for a check
        """
        return pulumi.get(self, "check_id")

    @property
    @pulumi.getter
    def comparison(self) -> pulumi.Output[Optional[str]]:
        """
        The comparison operator used against the alert's threshold. Must be one of `greater_than` or `less_than`.
        """
        return pulumi.get(self, "comparison")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        A human-friendly display name.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def notifications(self) -> pulumi.Output[Sequence['outputs.UptimeAlertNotification']]:
        """
        The notification settings for a trigger alert.
        """
        return pulumi.get(self, "notifications")

    @property
    @pulumi.getter
    def period(self) -> pulumi.Output[Optional[str]]:
        """
        Period of time the threshold must be exceeded to trigger the alert. Must be one of `2m`, `3m`, `5m`, `10m`, `15m`, `30m` or `1h`.
        """
        return pulumi.get(self, "period")

    @property
    @pulumi.getter
    def threshold(self) -> pulumi.Output[Optional[int]]:
        """
        The threshold at which the alert will enter a trigger state. The specific threshold is dependent on the alert type.
        """
        return pulumi.get(self, "threshold")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        The type of health check to perform. Must be one of `latency`, `down`, `down_global` or `ssl_expiry`.
        """
        return pulumi.get(self, "type")

