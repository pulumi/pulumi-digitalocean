# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['AppArgs', 'App']

@pulumi.input_type
class AppArgs:
    def __init__(__self__, *,
                 dedicated_ips: Optional[pulumi.Input[Sequence[pulumi.Input['AppDedicatedIpArgs']]]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 spec: Optional[pulumi.Input['AppSpecArgs']] = None):
        """
        The set of arguments for constructing a App resource.
        :param pulumi.Input[Sequence[pulumi.Input['AppDedicatedIpArgs']]] dedicated_ips: The dedicated egress IP addresses associated with the app.
        :param pulumi.Input[str] project_id: The ID of the project that the app is assigned to.
               
               A spec can contain multiple components.
               
               A `service` can contain:
        :param pulumi.Input['AppSpecArgs'] spec: A DigitalOcean App spec describing the app.
        """
        if dedicated_ips is not None:
            pulumi.set(__self__, "dedicated_ips", dedicated_ips)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if spec is not None:
            pulumi.set(__self__, "spec", spec)

    @property
    @pulumi.getter(name="dedicatedIps")
    def dedicated_ips(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AppDedicatedIpArgs']]]]:
        """
        The dedicated egress IP addresses associated with the app.
        """
        return pulumi.get(self, "dedicated_ips")

    @dedicated_ips.setter
    def dedicated_ips(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AppDedicatedIpArgs']]]]):
        pulumi.set(self, "dedicated_ips", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the project that the app is assigned to.

        A spec can contain multiple components.

        A `service` can contain:
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter
    def spec(self) -> Optional[pulumi.Input['AppSpecArgs']]:
        """
        A DigitalOcean App spec describing the app.
        """
        return pulumi.get(self, "spec")

    @spec.setter
    def spec(self, value: Optional[pulumi.Input['AppSpecArgs']]):
        pulumi.set(self, "spec", value)


@pulumi.input_type
class _AppState:
    def __init__(__self__, *,
                 active_deployment_id: Optional[pulumi.Input[str]] = None,
                 app_urn: Optional[pulumi.Input[str]] = None,
                 created_at: Optional[pulumi.Input[str]] = None,
                 dedicated_ips: Optional[pulumi.Input[Sequence[pulumi.Input['AppDedicatedIpArgs']]]] = None,
                 default_ingress: Optional[pulumi.Input[str]] = None,
                 live_url: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 spec: Optional[pulumi.Input['AppSpecArgs']] = None,
                 updated_at: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering App resources.
        :param pulumi.Input[str] active_deployment_id: The ID the app's currently active deployment.
        :param pulumi.Input[str] app_urn: The uniform resource identifier for the app.
        :param pulumi.Input[str] created_at: The date and time of when the app was created.
        :param pulumi.Input[Sequence[pulumi.Input['AppDedicatedIpArgs']]] dedicated_ips: The dedicated egress IP addresses associated with the app.
        :param pulumi.Input[str] default_ingress: The default URL to access the app.
        :param pulumi.Input[str] live_url: The live URL of the app.
        :param pulumi.Input[str] project_id: The ID of the project that the app is assigned to.
               
               A spec can contain multiple components.
               
               A `service` can contain:
        :param pulumi.Input['AppSpecArgs'] spec: A DigitalOcean App spec describing the app.
        :param pulumi.Input[str] updated_at: The date and time of when the app was last updated.
        """
        if active_deployment_id is not None:
            pulumi.set(__self__, "active_deployment_id", active_deployment_id)
        if app_urn is not None:
            pulumi.set(__self__, "app_urn", app_urn)
        if created_at is not None:
            pulumi.set(__self__, "created_at", created_at)
        if dedicated_ips is not None:
            pulumi.set(__self__, "dedicated_ips", dedicated_ips)
        if default_ingress is not None:
            pulumi.set(__self__, "default_ingress", default_ingress)
        if live_url is not None:
            pulumi.set(__self__, "live_url", live_url)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if spec is not None:
            pulumi.set(__self__, "spec", spec)
        if updated_at is not None:
            pulumi.set(__self__, "updated_at", updated_at)

    @property
    @pulumi.getter(name="activeDeploymentId")
    def active_deployment_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID the app's currently active deployment.
        """
        return pulumi.get(self, "active_deployment_id")

    @active_deployment_id.setter
    def active_deployment_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "active_deployment_id", value)

    @property
    @pulumi.getter(name="appUrn")
    def app_urn(self) -> Optional[pulumi.Input[str]]:
        """
        The uniform resource identifier for the app.
        """
        return pulumi.get(self, "app_urn")

    @app_urn.setter
    def app_urn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "app_urn", value)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> Optional[pulumi.Input[str]]:
        """
        The date and time of when the app was created.
        """
        return pulumi.get(self, "created_at")

    @created_at.setter
    def created_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_at", value)

    @property
    @pulumi.getter(name="dedicatedIps")
    def dedicated_ips(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AppDedicatedIpArgs']]]]:
        """
        The dedicated egress IP addresses associated with the app.
        """
        return pulumi.get(self, "dedicated_ips")

    @dedicated_ips.setter
    def dedicated_ips(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AppDedicatedIpArgs']]]]):
        pulumi.set(self, "dedicated_ips", value)

    @property
    @pulumi.getter(name="defaultIngress")
    def default_ingress(self) -> Optional[pulumi.Input[str]]:
        """
        The default URL to access the app.
        """
        return pulumi.get(self, "default_ingress")

    @default_ingress.setter
    def default_ingress(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "default_ingress", value)

    @property
    @pulumi.getter(name="liveUrl")
    def live_url(self) -> Optional[pulumi.Input[str]]:
        """
        The live URL of the app.
        """
        return pulumi.get(self, "live_url")

    @live_url.setter
    def live_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "live_url", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the project that the app is assigned to.

        A spec can contain multiple components.

        A `service` can contain:
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter
    def spec(self) -> Optional[pulumi.Input['AppSpecArgs']]:
        """
        A DigitalOcean App spec describing the app.
        """
        return pulumi.get(self, "spec")

    @spec.setter
    def spec(self, value: Optional[pulumi.Input['AppSpecArgs']]):
        pulumi.set(self, "spec", value)

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> Optional[pulumi.Input[str]]:
        """
        The date and time of when the app was last updated.
        """
        return pulumi.get(self, "updated_at")

    @updated_at.setter
    def updated_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "updated_at", value)


class App(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dedicated_ips: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AppDedicatedIpArgs']]]]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 spec: Optional[pulumi.Input[pulumi.InputType['AppSpecArgs']]] = None,
                 __props__=None):
        """
        Provides a DigitalOcean App resource.

        ## Example Usage

        To create an app, provide a [DigitalOcean app spec](https://docs.digitalocean.com/products/app-platform/reference/app-spec/) specifying the app's components.

        ### Basic Example

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        golang_sample = digitalocean.App("golang-sample", spec=digitalocean.AppSpecArgs(
            name="golang-sample",
            region="ams",
            services=[digitalocean.AppSpecServiceArgs(
                name="go-service",
                environment_slug="go",
                instance_count=1,
                instance_size_slug="professional-xs",
                git=digitalocean.AppSpecServiceGitArgs(
                    repo_clone_url="https://github.com/digitalocean/sample-golang.git",
                    branch="main",
                ),
            )],
        ))
        ```

        ### Static Site Example

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        static_site_example = digitalocean.App("static-site-example", spec=digitalocean.AppSpecArgs(
            name="static-site-example",
            region="ams",
            static_sites=[digitalocean.AppSpecStaticSiteArgs(
                name="sample-jekyll",
                build_command="bundle exec jekyll build -d ./public",
                output_dir="/public",
                git=digitalocean.AppSpecStaticSiteGitArgs(
                    repo_clone_url="https://github.com/digitalocean/sample-jekyll.git",
                    branch="main",
                ),
            )],
        ))
        ```

        ## Import

        An app can be imported using its `id`, e.g.

        ```sh
        $ pulumi import digitalocean:index/app:App myapp fb06ad00-351f-45c8-b5eb-13523c438661
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AppDedicatedIpArgs']]]] dedicated_ips: The dedicated egress IP addresses associated with the app.
        :param pulumi.Input[str] project_id: The ID of the project that the app is assigned to.
               
               A spec can contain multiple components.
               
               A `service` can contain:
        :param pulumi.Input[pulumi.InputType['AppSpecArgs']] spec: A DigitalOcean App spec describing the app.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[AppArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a DigitalOcean App resource.

        ## Example Usage

        To create an app, provide a [DigitalOcean app spec](https://docs.digitalocean.com/products/app-platform/reference/app-spec/) specifying the app's components.

        ### Basic Example

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        golang_sample = digitalocean.App("golang-sample", spec=digitalocean.AppSpecArgs(
            name="golang-sample",
            region="ams",
            services=[digitalocean.AppSpecServiceArgs(
                name="go-service",
                environment_slug="go",
                instance_count=1,
                instance_size_slug="professional-xs",
                git=digitalocean.AppSpecServiceGitArgs(
                    repo_clone_url="https://github.com/digitalocean/sample-golang.git",
                    branch="main",
                ),
            )],
        ))
        ```

        ### Static Site Example

        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        static_site_example = digitalocean.App("static-site-example", spec=digitalocean.AppSpecArgs(
            name="static-site-example",
            region="ams",
            static_sites=[digitalocean.AppSpecStaticSiteArgs(
                name="sample-jekyll",
                build_command="bundle exec jekyll build -d ./public",
                output_dir="/public",
                git=digitalocean.AppSpecStaticSiteGitArgs(
                    repo_clone_url="https://github.com/digitalocean/sample-jekyll.git",
                    branch="main",
                ),
            )],
        ))
        ```

        ## Import

        An app can be imported using its `id`, e.g.

        ```sh
        $ pulumi import digitalocean:index/app:App myapp fb06ad00-351f-45c8-b5eb-13523c438661
        ```

        :param str resource_name: The name of the resource.
        :param AppArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AppArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dedicated_ips: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AppDedicatedIpArgs']]]]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 spec: Optional[pulumi.Input[pulumi.InputType['AppSpecArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AppArgs.__new__(AppArgs)

            __props__.__dict__["dedicated_ips"] = dedicated_ips
            __props__.__dict__["project_id"] = project_id
            __props__.__dict__["spec"] = spec
            __props__.__dict__["active_deployment_id"] = None
            __props__.__dict__["app_urn"] = None
            __props__.__dict__["created_at"] = None
            __props__.__dict__["default_ingress"] = None
            __props__.__dict__["live_url"] = None
            __props__.__dict__["updated_at"] = None
        super(App, __self__).__init__(
            'digitalocean:index/app:App',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            active_deployment_id: Optional[pulumi.Input[str]] = None,
            app_urn: Optional[pulumi.Input[str]] = None,
            created_at: Optional[pulumi.Input[str]] = None,
            dedicated_ips: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AppDedicatedIpArgs']]]]] = None,
            default_ingress: Optional[pulumi.Input[str]] = None,
            live_url: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            spec: Optional[pulumi.Input[pulumi.InputType['AppSpecArgs']]] = None,
            updated_at: Optional[pulumi.Input[str]] = None) -> 'App':
        """
        Get an existing App resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] active_deployment_id: The ID the app's currently active deployment.
        :param pulumi.Input[str] app_urn: The uniform resource identifier for the app.
        :param pulumi.Input[str] created_at: The date and time of when the app was created.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AppDedicatedIpArgs']]]] dedicated_ips: The dedicated egress IP addresses associated with the app.
        :param pulumi.Input[str] default_ingress: The default URL to access the app.
        :param pulumi.Input[str] live_url: The live URL of the app.
        :param pulumi.Input[str] project_id: The ID of the project that the app is assigned to.
               
               A spec can contain multiple components.
               
               A `service` can contain:
        :param pulumi.Input[pulumi.InputType['AppSpecArgs']] spec: A DigitalOcean App spec describing the app.
        :param pulumi.Input[str] updated_at: The date and time of when the app was last updated.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AppState.__new__(_AppState)

        __props__.__dict__["active_deployment_id"] = active_deployment_id
        __props__.__dict__["app_urn"] = app_urn
        __props__.__dict__["created_at"] = created_at
        __props__.__dict__["dedicated_ips"] = dedicated_ips
        __props__.__dict__["default_ingress"] = default_ingress
        __props__.__dict__["live_url"] = live_url
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["spec"] = spec
        __props__.__dict__["updated_at"] = updated_at
        return App(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="activeDeploymentId")
    def active_deployment_id(self) -> pulumi.Output[str]:
        """
        The ID the app's currently active deployment.
        """
        return pulumi.get(self, "active_deployment_id")

    @property
    @pulumi.getter(name="appUrn")
    def app_urn(self) -> pulumi.Output[str]:
        """
        The uniform resource identifier for the app.
        """
        return pulumi.get(self, "app_urn")

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> pulumi.Output[str]:
        """
        The date and time of when the app was created.
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter(name="dedicatedIps")
    def dedicated_ips(self) -> pulumi.Output[Sequence['outputs.AppDedicatedIp']]:
        """
        The dedicated egress IP addresses associated with the app.
        """
        return pulumi.get(self, "dedicated_ips")

    @property
    @pulumi.getter(name="defaultIngress")
    def default_ingress(self) -> pulumi.Output[str]:
        """
        The default URL to access the app.
        """
        return pulumi.get(self, "default_ingress")

    @property
    @pulumi.getter(name="liveUrl")
    def live_url(self) -> pulumi.Output[str]:
        """
        The live URL of the app.
        """
        return pulumi.get(self, "live_url")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        The ID of the project that the app is assigned to.

        A spec can contain multiple components.

        A `service` can contain:
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def spec(self) -> pulumi.Output[Optional['outputs.AppSpec']]:
        """
        A DigitalOcean App spec describing the app.
        """
        return pulumi.get(self, "spec")

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> pulumi.Output[str]:
        """
        The date and time of when the app was last updated.
        """
        return pulumi.get(self, "updated_at")

