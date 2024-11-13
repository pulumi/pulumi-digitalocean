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
    'GetDatabaseClusterResult',
    'AwaitableGetDatabaseClusterResult',
    'get_database_cluster',
    'get_database_cluster_output',
]

@pulumi.output_type
class GetDatabaseClusterResult:
    """
    A collection of values returned by getDatabaseCluster.
    """
    def __init__(__self__, database=None, engine=None, host=None, id=None, maintenance_windows=None, name=None, node_count=None, password=None, port=None, private_host=None, private_network_uuid=None, private_uri=None, project_id=None, region=None, size=None, storage_size_mib=None, tags=None, ui_database=None, ui_host=None, ui_password=None, ui_port=None, ui_uri=None, ui_user=None, uri=None, urn=None, user=None, version=None):
        if database and not isinstance(database, str):
            raise TypeError("Expected argument 'database' to be a str")
        pulumi.set(__self__, "database", database)
        if engine and not isinstance(engine, str):
            raise TypeError("Expected argument 'engine' to be a str")
        pulumi.set(__self__, "engine", engine)
        if host and not isinstance(host, str):
            raise TypeError("Expected argument 'host' to be a str")
        pulumi.set(__self__, "host", host)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if maintenance_windows and not isinstance(maintenance_windows, list):
            raise TypeError("Expected argument 'maintenance_windows' to be a list")
        pulumi.set(__self__, "maintenance_windows", maintenance_windows)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if node_count and not isinstance(node_count, int):
            raise TypeError("Expected argument 'node_count' to be a int")
        pulumi.set(__self__, "node_count", node_count)
        if password and not isinstance(password, str):
            raise TypeError("Expected argument 'password' to be a str")
        pulumi.set(__self__, "password", password)
        if port and not isinstance(port, int):
            raise TypeError("Expected argument 'port' to be a int")
        pulumi.set(__self__, "port", port)
        if private_host and not isinstance(private_host, str):
            raise TypeError("Expected argument 'private_host' to be a str")
        pulumi.set(__self__, "private_host", private_host)
        if private_network_uuid and not isinstance(private_network_uuid, str):
            raise TypeError("Expected argument 'private_network_uuid' to be a str")
        pulumi.set(__self__, "private_network_uuid", private_network_uuid)
        if private_uri and not isinstance(private_uri, str):
            raise TypeError("Expected argument 'private_uri' to be a str")
        pulumi.set(__self__, "private_uri", private_uri)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if size and not isinstance(size, str):
            raise TypeError("Expected argument 'size' to be a str")
        pulumi.set(__self__, "size", size)
        if storage_size_mib and not isinstance(storage_size_mib, str):
            raise TypeError("Expected argument 'storage_size_mib' to be a str")
        pulumi.set(__self__, "storage_size_mib", storage_size_mib)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)
        if ui_database and not isinstance(ui_database, str):
            raise TypeError("Expected argument 'ui_database' to be a str")
        pulumi.set(__self__, "ui_database", ui_database)
        if ui_host and not isinstance(ui_host, str):
            raise TypeError("Expected argument 'ui_host' to be a str")
        pulumi.set(__self__, "ui_host", ui_host)
        if ui_password and not isinstance(ui_password, str):
            raise TypeError("Expected argument 'ui_password' to be a str")
        pulumi.set(__self__, "ui_password", ui_password)
        if ui_port and not isinstance(ui_port, int):
            raise TypeError("Expected argument 'ui_port' to be a int")
        pulumi.set(__self__, "ui_port", ui_port)
        if ui_uri and not isinstance(ui_uri, str):
            raise TypeError("Expected argument 'ui_uri' to be a str")
        pulumi.set(__self__, "ui_uri", ui_uri)
        if ui_user and not isinstance(ui_user, str):
            raise TypeError("Expected argument 'ui_user' to be a str")
        pulumi.set(__self__, "ui_user", ui_user)
        if uri and not isinstance(uri, str):
            raise TypeError("Expected argument 'uri' to be a str")
        pulumi.set(__self__, "uri", uri)
        if urn and not isinstance(urn, str):
            raise TypeError("Expected argument 'urn' to be a str")
        pulumi.set(__self__, "urn", urn)
        if user and not isinstance(user, str):
            raise TypeError("Expected argument 'user' to be a str")
        pulumi.set(__self__, "user", user)
        if version and not isinstance(version, str):
            raise TypeError("Expected argument 'version' to be a str")
        pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter
    def database(self) -> str:
        """
        Name of the cluster's default database.
        """
        return pulumi.get(self, "database")

    @property
    @pulumi.getter
    def engine(self) -> str:
        """
        Database engine used by the cluster (ex. `pg` for PostgreSQL).
        """
        return pulumi.get(self, "engine")

    @property
    @pulumi.getter
    def host(self) -> str:
        """
        Database cluster's hostname.
        """
        return pulumi.get(self, "host")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="maintenanceWindows")
    def maintenance_windows(self) -> Sequence['outputs.GetDatabaseClusterMaintenanceWindowResult']:
        """
        Defines when the automatic maintenance should be performed for the database cluster.
        """
        return pulumi.get(self, "maintenance_windows")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="nodeCount")
    def node_count(self) -> int:
        """
        Number of nodes that will be included in the cluster.
        """
        return pulumi.get(self, "node_count")

    @property
    @pulumi.getter
    def password(self) -> str:
        """
        Password for the cluster's default user.
        """
        return pulumi.get(self, "password")

    @property
    @pulumi.getter
    def port(self) -> int:
        """
        Network port that the database cluster is listening on.
        """
        return pulumi.get(self, "port")

    @property
    @pulumi.getter(name="privateHost")
    def private_host(self) -> str:
        """
        Same as `host`, but only accessible from resources within the account and in the same region.
        """
        return pulumi.get(self, "private_host")

    @property
    @pulumi.getter(name="privateNetworkUuid")
    def private_network_uuid(self) -> str:
        """
        The ID of the VPC where the database cluster is located.
        """
        return pulumi.get(self, "private_network_uuid")

    @property
    @pulumi.getter(name="privateUri")
    def private_uri(self) -> str:
        """
        Same as `uri`, but only accessible from resources within the account and in the same region.
        """
        return pulumi.get(self, "private_uri")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        """
        The ID of the project that the database cluster is assigned to.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def region(self) -> str:
        """
        DigitalOcean region where the cluster will reside.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter
    def size(self) -> str:
        """
        Database droplet size associated with the cluster (ex. `db-s-1vcpu-1gb`).
        """
        return pulumi.get(self, "size")

    @property
    @pulumi.getter(name="storageSizeMib")
    def storage_size_mib(self) -> str:
        return pulumi.get(self, "storage_size_mib")

    @property
    @pulumi.getter
    def tags(self) -> Optional[Sequence[str]]:
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="uiDatabase")
    def ui_database(self) -> str:
        """
        Name of the OpenSearch dashboard db.
        """
        return pulumi.get(self, "ui_database")

    @property
    @pulumi.getter(name="uiHost")
    def ui_host(self) -> str:
        """
        Hostname for the OpenSearch dashboard.
        """
        return pulumi.get(self, "ui_host")

    @property
    @pulumi.getter(name="uiPassword")
    def ui_password(self) -> str:
        """
        Password for the OpenSearch dashboard's default user.
        """
        return pulumi.get(self, "ui_password")

    @property
    @pulumi.getter(name="uiPort")
    def ui_port(self) -> int:
        """
        Network port that the OpenSearch dashboard is listening on.
        """
        return pulumi.get(self, "ui_port")

    @property
    @pulumi.getter(name="uiUri")
    def ui_uri(self) -> str:
        """
        The full URI for connecting to the OpenSearch dashboard.
        """
        return pulumi.get(self, "ui_uri")

    @property
    @pulumi.getter(name="uiUser")
    def ui_user(self) -> str:
        """
        Username for OpenSearch dashboard's default user.
        """
        return pulumi.get(self, "ui_user")

    @property
    @pulumi.getter
    def uri(self) -> str:
        """
        The full URI for connecting to the database cluster.
        """
        return pulumi.get(self, "uri")

    @property
    @pulumi.getter
    def urn(self) -> str:
        """
        The uniform resource name of the database cluster.
        """
        return pulumi.get(self, "urn")

    @property
    @pulumi.getter
    def user(self) -> str:
        """
        Username for the cluster's default user.
        """
        return pulumi.get(self, "user")

    @property
    @pulumi.getter
    def version(self) -> str:
        """
        Engine version used by the cluster (ex. `11` for PostgreSQL 11).
        """
        return pulumi.get(self, "version")


class AwaitableGetDatabaseClusterResult(GetDatabaseClusterResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDatabaseClusterResult(
            database=self.database,
            engine=self.engine,
            host=self.host,
            id=self.id,
            maintenance_windows=self.maintenance_windows,
            name=self.name,
            node_count=self.node_count,
            password=self.password,
            port=self.port,
            private_host=self.private_host,
            private_network_uuid=self.private_network_uuid,
            private_uri=self.private_uri,
            project_id=self.project_id,
            region=self.region,
            size=self.size,
            storage_size_mib=self.storage_size_mib,
            tags=self.tags,
            ui_database=self.ui_database,
            ui_host=self.ui_host,
            ui_password=self.ui_password,
            ui_port=self.ui_port,
            ui_uri=self.ui_uri,
            ui_user=self.ui_user,
            uri=self.uri,
            urn=self.urn,
            user=self.user,
            version=self.version)


def get_database_cluster(name: Optional[str] = None,
                         tags: Optional[Sequence[str]] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDatabaseClusterResult:
    """
    Provides information on a DigitalOcean database cluster resource.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    example = digitalocean.get_database_cluster(name="example-cluster")
    pulumi.export("databaseOutput", example.uri)
    ```


    :param str name: The name of the database cluster.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('digitalocean:index/getDatabaseCluster:getDatabaseCluster', __args__, opts=opts, typ=GetDatabaseClusterResult).value

    return AwaitableGetDatabaseClusterResult(
        database=pulumi.get(__ret__, 'database'),
        engine=pulumi.get(__ret__, 'engine'),
        host=pulumi.get(__ret__, 'host'),
        id=pulumi.get(__ret__, 'id'),
        maintenance_windows=pulumi.get(__ret__, 'maintenance_windows'),
        name=pulumi.get(__ret__, 'name'),
        node_count=pulumi.get(__ret__, 'node_count'),
        password=pulumi.get(__ret__, 'password'),
        port=pulumi.get(__ret__, 'port'),
        private_host=pulumi.get(__ret__, 'private_host'),
        private_network_uuid=pulumi.get(__ret__, 'private_network_uuid'),
        private_uri=pulumi.get(__ret__, 'private_uri'),
        project_id=pulumi.get(__ret__, 'project_id'),
        region=pulumi.get(__ret__, 'region'),
        size=pulumi.get(__ret__, 'size'),
        storage_size_mib=pulumi.get(__ret__, 'storage_size_mib'),
        tags=pulumi.get(__ret__, 'tags'),
        ui_database=pulumi.get(__ret__, 'ui_database'),
        ui_host=pulumi.get(__ret__, 'ui_host'),
        ui_password=pulumi.get(__ret__, 'ui_password'),
        ui_port=pulumi.get(__ret__, 'ui_port'),
        ui_uri=pulumi.get(__ret__, 'ui_uri'),
        ui_user=pulumi.get(__ret__, 'ui_user'),
        uri=pulumi.get(__ret__, 'uri'),
        urn=pulumi.get(__ret__, 'urn'),
        user=pulumi.get(__ret__, 'user'),
        version=pulumi.get(__ret__, 'version'))
def get_database_cluster_output(name: Optional[pulumi.Input[str]] = None,
                                tags: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetDatabaseClusterResult]:
    """
    Provides information on a DigitalOcean database cluster resource.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_digitalocean as digitalocean

    example = digitalocean.get_database_cluster(name="example-cluster")
    pulumi.export("databaseOutput", example.uri)
    ```


    :param str name: The name of the database cluster.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('digitalocean:index/getDatabaseCluster:getDatabaseCluster', __args__, opts=opts, typ=GetDatabaseClusterResult)
    return __ret__.apply(lambda __response__: GetDatabaseClusterResult(
        database=pulumi.get(__response__, 'database'),
        engine=pulumi.get(__response__, 'engine'),
        host=pulumi.get(__response__, 'host'),
        id=pulumi.get(__response__, 'id'),
        maintenance_windows=pulumi.get(__response__, 'maintenance_windows'),
        name=pulumi.get(__response__, 'name'),
        node_count=pulumi.get(__response__, 'node_count'),
        password=pulumi.get(__response__, 'password'),
        port=pulumi.get(__response__, 'port'),
        private_host=pulumi.get(__response__, 'private_host'),
        private_network_uuid=pulumi.get(__response__, 'private_network_uuid'),
        private_uri=pulumi.get(__response__, 'private_uri'),
        project_id=pulumi.get(__response__, 'project_id'),
        region=pulumi.get(__response__, 'region'),
        size=pulumi.get(__response__, 'size'),
        storage_size_mib=pulumi.get(__response__, 'storage_size_mib'),
        tags=pulumi.get(__response__, 'tags'),
        ui_database=pulumi.get(__response__, 'ui_database'),
        ui_host=pulumi.get(__response__, 'ui_host'),
        ui_password=pulumi.get(__response__, 'ui_password'),
        ui_port=pulumi.get(__response__, 'ui_port'),
        ui_uri=pulumi.get(__response__, 'ui_uri'),
        ui_user=pulumi.get(__response__, 'ui_user'),
        uri=pulumi.get(__response__, 'uri'),
        urn=pulumi.get(__response__, 'urn'),
        user=pulumi.get(__response__, 'user'),
        version=pulumi.get(__response__, 'version')))
