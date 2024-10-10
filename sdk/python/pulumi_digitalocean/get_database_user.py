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

__all__ = [
    'GetDatabaseUserResult',
    'AwaitableGetDatabaseUserResult',
    'get_database_user',
    'get_database_user_output',
]

@pulumi.output_type
class GetDatabaseUserResult:
    """
    A collection of values returned by getDatabaseUser.
    """
    def __init__(__self__, access_cert=None, access_key=None, cluster_id=None, id=None, mysql_auth_plugin=None, name=None, password=None, role=None, settings=None):
        if access_cert and not isinstance(access_cert, str):
            raise TypeError("Expected argument 'access_cert' to be a str")
        pulumi.set(__self__, "access_cert", access_cert)
        if access_key and not isinstance(access_key, str):
            raise TypeError("Expected argument 'access_key' to be a str")
        pulumi.set(__self__, "access_key", access_key)
        if cluster_id and not isinstance(cluster_id, str):
            raise TypeError("Expected argument 'cluster_id' to be a str")
        pulumi.set(__self__, "cluster_id", cluster_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if mysql_auth_plugin and not isinstance(mysql_auth_plugin, str):
            raise TypeError("Expected argument 'mysql_auth_plugin' to be a str")
        pulumi.set(__self__, "mysql_auth_plugin", mysql_auth_plugin)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if password and not isinstance(password, str):
            raise TypeError("Expected argument 'password' to be a str")
        pulumi.set(__self__, "password", password)
        if role and not isinstance(role, str):
            raise TypeError("Expected argument 'role' to be a str")
        pulumi.set(__self__, "role", role)
        if settings and not isinstance(settings, list):
            raise TypeError("Expected argument 'settings' to be a list")
        pulumi.set(__self__, "settings", settings)

    @property
    @pulumi.getter(name="accessCert")
    def access_cert(self) -> str:
        """
        Access certificate for TLS client authentication. (Kafka only)
        """
        return pulumi.get(self, "access_cert")

    @property
    @pulumi.getter(name="accessKey")
    def access_key(self) -> str:
        """
        Access key for TLS client authentication. (Kafka only)
        """
        return pulumi.get(self, "access_key")

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> str:
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="mysqlAuthPlugin")
    def mysql_auth_plugin(self) -> str:
        """
        The authentication method of the MySQL user. The value will be `mysql_native_password` or `caching_sha2_password`.
        """
        return pulumi.get(self, "mysql_auth_plugin")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def password(self) -> str:
        """
        The password of the database user. This will not be set for MongoDB users.
        """
        return pulumi.get(self, "password")

    @property
    @pulumi.getter
    def role(self) -> str:
        """
        The role of the database user. The value will be either `primary` or `normal`.
        """
        return pulumi.get(self, "role")

    @property
    @pulumi.getter
    def settings(self) -> Sequence['outputs.GetDatabaseUserSettingResult']:
        return pulumi.get(self, "settings")


class AwaitableGetDatabaseUserResult(GetDatabaseUserResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDatabaseUserResult(
            access_cert=self.access_cert,
            access_key=self.access_key,
            cluster_id=self.cluster_id,
            id=self.id,
            mysql_auth_plugin=self.mysql_auth_plugin,
            name=self.name,
            password=self.password,
            role=self.role,
            settings=self.settings)


def get_database_user(cluster_id: Optional[str] = None,
                      name: Optional[str] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDatabaseUserResult:
    """
    Provides information on a DigitalOcean database user resource.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    main = digitalocean.get_database_cluster(name="main-cluster")
    example = digitalocean.get_database_user(cluster_id=main.id,
        name="example-user")
    pulumi.export("databaseUserPassword", example.password)
    ```


    :param str cluster_id: The ID of the database cluster.
    :param str name: The name of the database user.
    """
    __args__ = dict()
    __args__['clusterId'] = cluster_id
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('digitalocean:index/getDatabaseUser:getDatabaseUser', __args__, opts=opts, typ=GetDatabaseUserResult).value

    return AwaitableGetDatabaseUserResult(
        access_cert=pulumi.get(__ret__, 'access_cert'),
        access_key=pulumi.get(__ret__, 'access_key'),
        cluster_id=pulumi.get(__ret__, 'cluster_id'),
        id=pulumi.get(__ret__, 'id'),
        mysql_auth_plugin=pulumi.get(__ret__, 'mysql_auth_plugin'),
        name=pulumi.get(__ret__, 'name'),
        password=pulumi.get(__ret__, 'password'),
        role=pulumi.get(__ret__, 'role'),
        settings=pulumi.get(__ret__, 'settings'))
def get_database_user_output(cluster_id: Optional[pulumi.Input[str]] = None,
                             name: Optional[pulumi.Input[str]] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetDatabaseUserResult]:
    """
    Provides information on a DigitalOcean database user resource.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    main = digitalocean.get_database_cluster(name="main-cluster")
    example = digitalocean.get_database_user(cluster_id=main.id,
        name="example-user")
    pulumi.export("databaseUserPassword", example.password)
    ```


    :param str cluster_id: The ID of the database cluster.
    :param str name: The name of the database user.
    """
    __args__ = dict()
    __args__['clusterId'] = cluster_id
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('digitalocean:index/getDatabaseUser:getDatabaseUser', __args__, opts=opts, typ=GetDatabaseUserResult)
    return __ret__.apply(lambda __response__: GetDatabaseUserResult(
        access_cert=pulumi.get(__response__, 'access_cert'),
        access_key=pulumi.get(__response__, 'access_key'),
        cluster_id=pulumi.get(__response__, 'cluster_id'),
        id=pulumi.get(__response__, 'id'),
        mysql_auth_plugin=pulumi.get(__response__, 'mysql_auth_plugin'),
        name=pulumi.get(__response__, 'name'),
        password=pulumi.get(__response__, 'password'),
        role=pulumi.get(__response__, 'role'),
        settings=pulumi.get(__response__, 'settings')))
