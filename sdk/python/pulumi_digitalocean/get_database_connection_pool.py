# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
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

__all__ = [
    'GetDatabaseConnectionPoolResult',
    'AwaitableGetDatabaseConnectionPoolResult',
    'get_database_connection_pool',
    'get_database_connection_pool_output',
]

@pulumi.output_type
class GetDatabaseConnectionPoolResult:
    """
    A collection of values returned by getDatabaseConnectionPool.
    """
    def __init__(__self__, cluster_id=None, db_name=None, host=None, id=None, mode=None, name=None, password=None, port=None, private_host=None, private_uri=None, size=None, uri=None, user=None):
        if cluster_id and not isinstance(cluster_id, str):
            raise TypeError("Expected argument 'cluster_id' to be a str")
        pulumi.set(__self__, "cluster_id", cluster_id)
        if db_name and not isinstance(db_name, str):
            raise TypeError("Expected argument 'db_name' to be a str")
        pulumi.set(__self__, "db_name", db_name)
        if host and not isinstance(host, str):
            raise TypeError("Expected argument 'host' to be a str")
        pulumi.set(__self__, "host", host)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if mode and not isinstance(mode, str):
            raise TypeError("Expected argument 'mode' to be a str")
        pulumi.set(__self__, "mode", mode)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if password and not isinstance(password, str):
            raise TypeError("Expected argument 'password' to be a str")
        pulumi.set(__self__, "password", password)
        if port and not isinstance(port, int):
            raise TypeError("Expected argument 'port' to be a int")
        pulumi.set(__self__, "port", port)
        if private_host and not isinstance(private_host, str):
            raise TypeError("Expected argument 'private_host' to be a str")
        pulumi.set(__self__, "private_host", private_host)
        if private_uri and not isinstance(private_uri, str):
            raise TypeError("Expected argument 'private_uri' to be a str")
        pulumi.set(__self__, "private_uri", private_uri)
        if size and not isinstance(size, int):
            raise TypeError("Expected argument 'size' to be a int")
        pulumi.set(__self__, "size", size)
        if uri and not isinstance(uri, str):
            raise TypeError("Expected argument 'uri' to be a str")
        pulumi.set(__self__, "uri", uri)
        if user and not isinstance(user, str):
            raise TypeError("Expected argument 'user' to be a str")
        pulumi.set(__self__, "user", user)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> builtins.str:
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter(name="dbName")
    def db_name(self) -> builtins.str:
        """
        Name of the connection pool's default database.
        """
        return pulumi.get(self, "db_name")

    @property
    @pulumi.getter
    def host(self) -> builtins.str:
        """
        Connection pool hostname.
        """
        return pulumi.get(self, "host")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def mode(self) -> builtins.str:
        """
        The transaction mode for the connection pool.
        """
        return pulumi.get(self, "mode")

    @property
    @pulumi.getter
    def name(self) -> builtins.str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def password(self) -> builtins.str:
        """
        Password for the connection pool's default user.
        """
        return pulumi.get(self, "password")

    @property
    @pulumi.getter
    def port(self) -> builtins.int:
        """
        Network port that the connection pool is listening on.
        """
        return pulumi.get(self, "port")

    @property
    @pulumi.getter(name="privateHost")
    def private_host(self) -> builtins.str:
        """
        Same as `host`, but only accessible from resources within the account and in the same region.
        """
        return pulumi.get(self, "private_host")

    @property
    @pulumi.getter(name="privateUri")
    def private_uri(self) -> builtins.str:
        """
        Same as `uri`, but only accessible from resources within the account and in the same region.
        """
        return pulumi.get(self, "private_uri")

    @property
    @pulumi.getter
    def size(self) -> builtins.int:
        """
        Size of the connection pool.
        """
        return pulumi.get(self, "size")

    @property
    @pulumi.getter
    def uri(self) -> builtins.str:
        """
        The full URI for connecting to the database connection pool.
        """
        return pulumi.get(self, "uri")

    @property
    @pulumi.getter
    def user(self) -> builtins.str:
        """
        Username for the connection pool's default user.
        """
        return pulumi.get(self, "user")


class AwaitableGetDatabaseConnectionPoolResult(GetDatabaseConnectionPoolResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDatabaseConnectionPoolResult(
            cluster_id=self.cluster_id,
            db_name=self.db_name,
            host=self.host,
            id=self.id,
            mode=self.mode,
            name=self.name,
            password=self.password,
            port=self.port,
            private_host=self.private_host,
            private_uri=self.private_uri,
            size=self.size,
            uri=self.uri,
            user=self.user)


def get_database_connection_pool(cluster_id: Optional[builtins.str] = None,
                                 name: Optional[builtins.str] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDatabaseConnectionPoolResult:
    """
    Provides information on a DigitalOcean PostgreSQL database connection pool.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    example = digitalocean.get_database_cluster(name="example-cluster")
    read_only = digitalocean.get_database_connection_pool(cluster_id=example.id,
        name="pool-01")
    pulumi.export("connectionPoolUriOutput", read_only.uri)
    ```


    :param builtins.str cluster_id: The ID of the original source database cluster.
    :param builtins.str name: The name for the database connection pool.
    """
    __args__ = dict()
    __args__['clusterId'] = cluster_id
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('digitalocean:index/getDatabaseConnectionPool:getDatabaseConnectionPool', __args__, opts=opts, typ=GetDatabaseConnectionPoolResult).value

    return AwaitableGetDatabaseConnectionPoolResult(
        cluster_id=pulumi.get(__ret__, 'cluster_id'),
        db_name=pulumi.get(__ret__, 'db_name'),
        host=pulumi.get(__ret__, 'host'),
        id=pulumi.get(__ret__, 'id'),
        mode=pulumi.get(__ret__, 'mode'),
        name=pulumi.get(__ret__, 'name'),
        password=pulumi.get(__ret__, 'password'),
        port=pulumi.get(__ret__, 'port'),
        private_host=pulumi.get(__ret__, 'private_host'),
        private_uri=pulumi.get(__ret__, 'private_uri'),
        size=pulumi.get(__ret__, 'size'),
        uri=pulumi.get(__ret__, 'uri'),
        user=pulumi.get(__ret__, 'user'))
def get_database_connection_pool_output(cluster_id: Optional[pulumi.Input[builtins.str]] = None,
                                        name: Optional[pulumi.Input[builtins.str]] = None,
                                        opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetDatabaseConnectionPoolResult]:
    """
    Provides information on a DigitalOcean PostgreSQL database connection pool.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    example = digitalocean.get_database_cluster(name="example-cluster")
    read_only = digitalocean.get_database_connection_pool(cluster_id=example.id,
        name="pool-01")
    pulumi.export("connectionPoolUriOutput", read_only.uri)
    ```


    :param builtins.str cluster_id: The ID of the original source database cluster.
    :param builtins.str name: The name for the database connection pool.
    """
    __args__ = dict()
    __args__['clusterId'] = cluster_id
    __args__['name'] = name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('digitalocean:index/getDatabaseConnectionPool:getDatabaseConnectionPool', __args__, opts=opts, typ=GetDatabaseConnectionPoolResult)
    return __ret__.apply(lambda __response__: GetDatabaseConnectionPoolResult(
        cluster_id=pulumi.get(__response__, 'cluster_id'),
        db_name=pulumi.get(__response__, 'db_name'),
        host=pulumi.get(__response__, 'host'),
        id=pulumi.get(__response__, 'id'),
        mode=pulumi.get(__response__, 'mode'),
        name=pulumi.get(__response__, 'name'),
        password=pulumi.get(__response__, 'password'),
        port=pulumi.get(__response__, 'port'),
        private_host=pulumi.get(__response__, 'private_host'),
        private_uri=pulumi.get(__response__, 'private_uri'),
        size=pulumi.get(__response__, 'size'),
        uri=pulumi.get(__response__, 'uri'),
        user=pulumi.get(__response__, 'user')))
