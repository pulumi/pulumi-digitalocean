# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['DatabaseConnectionPoolArgs', 'DatabaseConnectionPool']

@pulumi.input_type
class DatabaseConnectionPoolArgs:
    def __init__(__self__, *,
                 cluster_id: pulumi.Input[str],
                 db_name: pulumi.Input[str],
                 mode: pulumi.Input[str],
                 size: pulumi.Input[int],
                 name: Optional[pulumi.Input[str]] = None,
                 user: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a DatabaseConnectionPool resource.
        :param pulumi.Input[str] cluster_id: The ID of the source database cluster. Note: This must be a PostgreSQL cluster.
        :param pulumi.Input[str] db_name: The database for use with the connection pool.
        :param pulumi.Input[str] mode: The PGBouncer transaction mode for the connection pool. The allowed values are session, transaction, and statement.
        :param pulumi.Input[int] size: The desired size of the PGBouncer connection pool.
        :param pulumi.Input[str] name: The name for the database connection pool.
        :param pulumi.Input[str] user: The name of the database user for use with the connection pool. When excluded, all sessions connect to the database as the inbound user.
        """
        pulumi.set(__self__, "cluster_id", cluster_id)
        pulumi.set(__self__, "db_name", db_name)
        pulumi.set(__self__, "mode", mode)
        pulumi.set(__self__, "size", size)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if user is not None:
            pulumi.set(__self__, "user", user)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Input[str]:
        """
        The ID of the source database cluster. Note: This must be a PostgreSQL cluster.
        """
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter(name="dbName")
    def db_name(self) -> pulumi.Input[str]:
        """
        The database for use with the connection pool.
        """
        return pulumi.get(self, "db_name")

    @db_name.setter
    def db_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "db_name", value)

    @property
    @pulumi.getter
    def mode(self) -> pulumi.Input[str]:
        """
        The PGBouncer transaction mode for the connection pool. The allowed values are session, transaction, and statement.
        """
        return pulumi.get(self, "mode")

    @mode.setter
    def mode(self, value: pulumi.Input[str]):
        pulumi.set(self, "mode", value)

    @property
    @pulumi.getter
    def size(self) -> pulumi.Input[int]:
        """
        The desired size of the PGBouncer connection pool.
        """
        return pulumi.get(self, "size")

    @size.setter
    def size(self, value: pulumi.Input[int]):
        pulumi.set(self, "size", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name for the database connection pool.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def user(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the database user for use with the connection pool. When excluded, all sessions connect to the database as the inbound user.
        """
        return pulumi.get(self, "user")

    @user.setter
    def user(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user", value)


@pulumi.input_type
class _DatabaseConnectionPoolState:
    def __init__(__self__, *,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 db_name: Optional[pulumi.Input[str]] = None,
                 host: Optional[pulumi.Input[str]] = None,
                 mode: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 port: Optional[pulumi.Input[int]] = None,
                 private_host: Optional[pulumi.Input[str]] = None,
                 private_uri: Optional[pulumi.Input[str]] = None,
                 size: Optional[pulumi.Input[int]] = None,
                 uri: Optional[pulumi.Input[str]] = None,
                 user: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering DatabaseConnectionPool resources.
        :param pulumi.Input[str] cluster_id: The ID of the source database cluster. Note: This must be a PostgreSQL cluster.
        :param pulumi.Input[str] db_name: The database for use with the connection pool.
        :param pulumi.Input[str] host: The hostname used to connect to the database connection pool.
        :param pulumi.Input[str] mode: The PGBouncer transaction mode for the connection pool. The allowed values are session, transaction, and statement.
        :param pulumi.Input[str] name: The name for the database connection pool.
        :param pulumi.Input[str] password: Password for the connection pool's user.
        :param pulumi.Input[int] port: Network port that the database connection pool is listening on.
        :param pulumi.Input[str] private_host: Same as `host`, but only accessible from resources within the account and in the same region.
        :param pulumi.Input[str] private_uri: Same as `uri`, but only accessible from resources within the account and in the same region.
        :param pulumi.Input[int] size: The desired size of the PGBouncer connection pool.
        :param pulumi.Input[str] uri: The full URI for connecting to the database connection pool.
        :param pulumi.Input[str] user: The name of the database user for use with the connection pool. When excluded, all sessions connect to the database as the inbound user.
        """
        if cluster_id is not None:
            pulumi.set(__self__, "cluster_id", cluster_id)
        if db_name is not None:
            pulumi.set(__self__, "db_name", db_name)
        if host is not None:
            pulumi.set(__self__, "host", host)
        if mode is not None:
            pulumi.set(__self__, "mode", mode)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if password is not None:
            pulumi.set(__self__, "password", password)
        if port is not None:
            pulumi.set(__self__, "port", port)
        if private_host is not None:
            pulumi.set(__self__, "private_host", private_host)
        if private_uri is not None:
            pulumi.set(__self__, "private_uri", private_uri)
        if size is not None:
            pulumi.set(__self__, "size", size)
        if uri is not None:
            pulumi.set(__self__, "uri", uri)
        if user is not None:
            pulumi.set(__self__, "user", user)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the source database cluster. Note: This must be a PostgreSQL cluster.
        """
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter(name="dbName")
    def db_name(self) -> Optional[pulumi.Input[str]]:
        """
        The database for use with the connection pool.
        """
        return pulumi.get(self, "db_name")

    @db_name.setter
    def db_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "db_name", value)

    @property
    @pulumi.getter
    def host(self) -> Optional[pulumi.Input[str]]:
        """
        The hostname used to connect to the database connection pool.
        """
        return pulumi.get(self, "host")

    @host.setter
    def host(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "host", value)

    @property
    @pulumi.getter
    def mode(self) -> Optional[pulumi.Input[str]]:
        """
        The PGBouncer transaction mode for the connection pool. The allowed values are session, transaction, and statement.
        """
        return pulumi.get(self, "mode")

    @mode.setter
    def mode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "mode", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name for the database connection pool.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def password(self) -> Optional[pulumi.Input[str]]:
        """
        Password for the connection pool's user.
        """
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "password", value)

    @property
    @pulumi.getter
    def port(self) -> Optional[pulumi.Input[int]]:
        """
        Network port that the database connection pool is listening on.
        """
        return pulumi.get(self, "port")

    @port.setter
    def port(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "port", value)

    @property
    @pulumi.getter(name="privateHost")
    def private_host(self) -> Optional[pulumi.Input[str]]:
        """
        Same as `host`, but only accessible from resources within the account and in the same region.
        """
        return pulumi.get(self, "private_host")

    @private_host.setter
    def private_host(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "private_host", value)

    @property
    @pulumi.getter(name="privateUri")
    def private_uri(self) -> Optional[pulumi.Input[str]]:
        """
        Same as `uri`, but only accessible from resources within the account and in the same region.
        """
        return pulumi.get(self, "private_uri")

    @private_uri.setter
    def private_uri(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "private_uri", value)

    @property
    @pulumi.getter
    def size(self) -> Optional[pulumi.Input[int]]:
        """
        The desired size of the PGBouncer connection pool.
        """
        return pulumi.get(self, "size")

    @size.setter
    def size(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "size", value)

    @property
    @pulumi.getter
    def uri(self) -> Optional[pulumi.Input[str]]:
        """
        The full URI for connecting to the database connection pool.
        """
        return pulumi.get(self, "uri")

    @uri.setter
    def uri(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "uri", value)

    @property
    @pulumi.getter
    def user(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the database user for use with the connection pool. When excluded, all sessions connect to the database as the inbound user.
        """
        return pulumi.get(self, "user")

    @user.setter
    def user(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user", value)


class DatabaseConnectionPool(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 db_name: Optional[pulumi.Input[str]] = None,
                 mode: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 size: Optional[pulumi.Input[int]] = None,
                 user: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a DigitalOcean database connection pool resource.

        ## Example Usage

        ### Create a new PostgreSQL database connection pool
        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        postgres_example = digitalocean.DatabaseCluster("postgres-example",
            name="example-postgres-cluster",
            engine="pg",
            version="15",
            size=digitalocean.DatabaseSlug.D_B_1_VPCU1_GB,
            region=digitalocean.Region.NYC1,
            node_count=1)
        pool_01 = digitalocean.DatabaseConnectionPool("pool-01",
            cluster_id=postgres_example.id,
            name="pool-01",
            mode="transaction",
            size=20,
            db_name="defaultdb",
            user="doadmin")
        ```

        ## Import

        Database connection pools can be imported using the `id` of the source database cluster

        and the `name` of the connection pool joined with a comma. For example:

        ```sh
        $ pulumi import digitalocean:index/databaseConnectionPool:DatabaseConnectionPool pool-01 245bcfd0-7f31-4ce6-a2bc-475a116cca97,pool-01
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_id: The ID of the source database cluster. Note: This must be a PostgreSQL cluster.
        :param pulumi.Input[str] db_name: The database for use with the connection pool.
        :param pulumi.Input[str] mode: The PGBouncer transaction mode for the connection pool. The allowed values are session, transaction, and statement.
        :param pulumi.Input[str] name: The name for the database connection pool.
        :param pulumi.Input[int] size: The desired size of the PGBouncer connection pool.
        :param pulumi.Input[str] user: The name of the database user for use with the connection pool. When excluded, all sessions connect to the database as the inbound user.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DatabaseConnectionPoolArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a DigitalOcean database connection pool resource.

        ## Example Usage

        ### Create a new PostgreSQL database connection pool
        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        postgres_example = digitalocean.DatabaseCluster("postgres-example",
            name="example-postgres-cluster",
            engine="pg",
            version="15",
            size=digitalocean.DatabaseSlug.D_B_1_VPCU1_GB,
            region=digitalocean.Region.NYC1,
            node_count=1)
        pool_01 = digitalocean.DatabaseConnectionPool("pool-01",
            cluster_id=postgres_example.id,
            name="pool-01",
            mode="transaction",
            size=20,
            db_name="defaultdb",
            user="doadmin")
        ```

        ## Import

        Database connection pools can be imported using the `id` of the source database cluster

        and the `name` of the connection pool joined with a comma. For example:

        ```sh
        $ pulumi import digitalocean:index/databaseConnectionPool:DatabaseConnectionPool pool-01 245bcfd0-7f31-4ce6-a2bc-475a116cca97,pool-01
        ```

        :param str resource_name: The name of the resource.
        :param DatabaseConnectionPoolArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DatabaseConnectionPoolArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 db_name: Optional[pulumi.Input[str]] = None,
                 mode: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 size: Optional[pulumi.Input[int]] = None,
                 user: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DatabaseConnectionPoolArgs.__new__(DatabaseConnectionPoolArgs)

            if cluster_id is None and not opts.urn:
                raise TypeError("Missing required property 'cluster_id'")
            __props__.__dict__["cluster_id"] = cluster_id
            if db_name is None and not opts.urn:
                raise TypeError("Missing required property 'db_name'")
            __props__.__dict__["db_name"] = db_name
            if mode is None and not opts.urn:
                raise TypeError("Missing required property 'mode'")
            __props__.__dict__["mode"] = mode
            __props__.__dict__["name"] = name
            if size is None and not opts.urn:
                raise TypeError("Missing required property 'size'")
            __props__.__dict__["size"] = size
            __props__.__dict__["user"] = user
            __props__.__dict__["host"] = None
            __props__.__dict__["password"] = None
            __props__.__dict__["port"] = None
            __props__.__dict__["private_host"] = None
            __props__.__dict__["private_uri"] = None
            __props__.__dict__["uri"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["password", "privateUri", "uri"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(DatabaseConnectionPool, __self__).__init__(
            'digitalocean:index/databaseConnectionPool:DatabaseConnectionPool',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cluster_id: Optional[pulumi.Input[str]] = None,
            db_name: Optional[pulumi.Input[str]] = None,
            host: Optional[pulumi.Input[str]] = None,
            mode: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            password: Optional[pulumi.Input[str]] = None,
            port: Optional[pulumi.Input[int]] = None,
            private_host: Optional[pulumi.Input[str]] = None,
            private_uri: Optional[pulumi.Input[str]] = None,
            size: Optional[pulumi.Input[int]] = None,
            uri: Optional[pulumi.Input[str]] = None,
            user: Optional[pulumi.Input[str]] = None) -> 'DatabaseConnectionPool':
        """
        Get an existing DatabaseConnectionPool resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_id: The ID of the source database cluster. Note: This must be a PostgreSQL cluster.
        :param pulumi.Input[str] db_name: The database for use with the connection pool.
        :param pulumi.Input[str] host: The hostname used to connect to the database connection pool.
        :param pulumi.Input[str] mode: The PGBouncer transaction mode for the connection pool. The allowed values are session, transaction, and statement.
        :param pulumi.Input[str] name: The name for the database connection pool.
        :param pulumi.Input[str] password: Password for the connection pool's user.
        :param pulumi.Input[int] port: Network port that the database connection pool is listening on.
        :param pulumi.Input[str] private_host: Same as `host`, but only accessible from resources within the account and in the same region.
        :param pulumi.Input[str] private_uri: Same as `uri`, but only accessible from resources within the account and in the same region.
        :param pulumi.Input[int] size: The desired size of the PGBouncer connection pool.
        :param pulumi.Input[str] uri: The full URI for connecting to the database connection pool.
        :param pulumi.Input[str] user: The name of the database user for use with the connection pool. When excluded, all sessions connect to the database as the inbound user.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DatabaseConnectionPoolState.__new__(_DatabaseConnectionPoolState)

        __props__.__dict__["cluster_id"] = cluster_id
        __props__.__dict__["db_name"] = db_name
        __props__.__dict__["host"] = host
        __props__.__dict__["mode"] = mode
        __props__.__dict__["name"] = name
        __props__.__dict__["password"] = password
        __props__.__dict__["port"] = port
        __props__.__dict__["private_host"] = private_host
        __props__.__dict__["private_uri"] = private_uri
        __props__.__dict__["size"] = size
        __props__.__dict__["uri"] = uri
        __props__.__dict__["user"] = user
        return DatabaseConnectionPool(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Output[str]:
        """
        The ID of the source database cluster. Note: This must be a PostgreSQL cluster.
        """
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter(name="dbName")
    def db_name(self) -> pulumi.Output[str]:
        """
        The database for use with the connection pool.
        """
        return pulumi.get(self, "db_name")

    @property
    @pulumi.getter
    def host(self) -> pulumi.Output[str]:
        """
        The hostname used to connect to the database connection pool.
        """
        return pulumi.get(self, "host")

    @property
    @pulumi.getter
    def mode(self) -> pulumi.Output[str]:
        """
        The PGBouncer transaction mode for the connection pool. The allowed values are session, transaction, and statement.
        """
        return pulumi.get(self, "mode")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name for the database connection pool.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def password(self) -> pulumi.Output[str]:
        """
        Password for the connection pool's user.
        """
        return pulumi.get(self, "password")

    @property
    @pulumi.getter
    def port(self) -> pulumi.Output[int]:
        """
        Network port that the database connection pool is listening on.
        """
        return pulumi.get(self, "port")

    @property
    @pulumi.getter(name="privateHost")
    def private_host(self) -> pulumi.Output[str]:
        """
        Same as `host`, but only accessible from resources within the account and in the same region.
        """
        return pulumi.get(self, "private_host")

    @property
    @pulumi.getter(name="privateUri")
    def private_uri(self) -> pulumi.Output[str]:
        """
        Same as `uri`, but only accessible from resources within the account and in the same region.
        """
        return pulumi.get(self, "private_uri")

    @property
    @pulumi.getter
    def size(self) -> pulumi.Output[int]:
        """
        The desired size of the PGBouncer connection pool.
        """
        return pulumi.get(self, "size")

    @property
    @pulumi.getter
    def uri(self) -> pulumi.Output[str]:
        """
        The full URI for connecting to the database connection pool.
        """
        return pulumi.get(self, "uri")

    @property
    @pulumi.getter
    def user(self) -> pulumi.Output[Optional[str]]:
        """
        The name of the database user for use with the connection pool. When excluded, all sessions connect to the database as the inbound user.
        """
        return pulumi.get(self, "user")

