# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
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
from . import outputs
from ._inputs import *

__all__ = ['DatabaseUserArgs', 'DatabaseUser']

@pulumi.input_type
class DatabaseUserArgs:
    def __init__(__self__, *,
                 cluster_id: pulumi.Input[builtins.str],
                 mysql_auth_plugin: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 settings: Optional[pulumi.Input[Sequence[pulumi.Input['DatabaseUserSettingArgs']]]] = None):
        """
        The set of arguments for constructing a DatabaseUser resource.
        :param pulumi.Input[builtins.str] cluster_id: The ID of the original source database cluster.
        :param pulumi.Input[builtins.str] mysql_auth_plugin: The authentication method to use for connections to the MySQL user account. The valid values are `mysql_native_password` or `caching_sha2_password` (this is the default).
        :param pulumi.Input[builtins.str] name: The name for the database user.
        :param pulumi.Input[Sequence[pulumi.Input['DatabaseUserSettingArgs']]] settings: Contains optional settings for the user.
               The `settings` block is documented below.
        """
        pulumi.set(__self__, "cluster_id", cluster_id)
        if mysql_auth_plugin is not None:
            pulumi.set(__self__, "mysql_auth_plugin", mysql_auth_plugin)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if settings is not None:
            pulumi.set(__self__, "settings", settings)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Input[builtins.str]:
        """
        The ID of the original source database cluster.
        """
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter(name="mysqlAuthPlugin")
    def mysql_auth_plugin(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The authentication method to use for connections to the MySQL user account. The valid values are `mysql_native_password` or `caching_sha2_password` (this is the default).
        """
        return pulumi.get(self, "mysql_auth_plugin")

    @mysql_auth_plugin.setter
    def mysql_auth_plugin(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "mysql_auth_plugin", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name for the database user.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def settings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['DatabaseUserSettingArgs']]]]:
        """
        Contains optional settings for the user.
        The `settings` block is documented below.
        """
        return pulumi.get(self, "settings")

    @settings.setter
    def settings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['DatabaseUserSettingArgs']]]]):
        pulumi.set(self, "settings", value)


@pulumi.input_type
class _DatabaseUserState:
    def __init__(__self__, *,
                 access_cert: Optional[pulumi.Input[builtins.str]] = None,
                 access_key: Optional[pulumi.Input[builtins.str]] = None,
                 cluster_id: Optional[pulumi.Input[builtins.str]] = None,
                 mysql_auth_plugin: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 password: Optional[pulumi.Input[builtins.str]] = None,
                 role: Optional[pulumi.Input[builtins.str]] = None,
                 settings: Optional[pulumi.Input[Sequence[pulumi.Input['DatabaseUserSettingArgs']]]] = None):
        """
        Input properties used for looking up and filtering DatabaseUser resources.
        :param pulumi.Input[builtins.str] access_cert: Access certificate for TLS client authentication. (Kafka only)
        :param pulumi.Input[builtins.str] access_key: Access key for TLS client authentication. (Kafka only)
        :param pulumi.Input[builtins.str] cluster_id: The ID of the original source database cluster.
        :param pulumi.Input[builtins.str] mysql_auth_plugin: The authentication method to use for connections to the MySQL user account. The valid values are `mysql_native_password` or `caching_sha2_password` (this is the default).
        :param pulumi.Input[builtins.str] name: The name for the database user.
        :param pulumi.Input[builtins.str] password: Password for the database user.
        :param pulumi.Input[builtins.str] role: Role for the database user. The value will be either "primary" or "normal".
        :param pulumi.Input[Sequence[pulumi.Input['DatabaseUserSettingArgs']]] settings: Contains optional settings for the user.
               The `settings` block is documented below.
        """
        if access_cert is not None:
            pulumi.set(__self__, "access_cert", access_cert)
        if access_key is not None:
            pulumi.set(__self__, "access_key", access_key)
        if cluster_id is not None:
            pulumi.set(__self__, "cluster_id", cluster_id)
        if mysql_auth_plugin is not None:
            pulumi.set(__self__, "mysql_auth_plugin", mysql_auth_plugin)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if password is not None:
            pulumi.set(__self__, "password", password)
        if role is not None:
            pulumi.set(__self__, "role", role)
        if settings is not None:
            pulumi.set(__self__, "settings", settings)

    @property
    @pulumi.getter(name="accessCert")
    def access_cert(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Access certificate for TLS client authentication. (Kafka only)
        """
        return pulumi.get(self, "access_cert")

    @access_cert.setter
    def access_cert(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "access_cert", value)

    @property
    @pulumi.getter(name="accessKey")
    def access_key(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Access key for TLS client authentication. (Kafka only)
        """
        return pulumi.get(self, "access_key")

    @access_key.setter
    def access_key(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "access_key", value)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The ID of the original source database cluster.
        """
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter(name="mysqlAuthPlugin")
    def mysql_auth_plugin(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The authentication method to use for connections to the MySQL user account. The valid values are `mysql_native_password` or `caching_sha2_password` (this is the default).
        """
        return pulumi.get(self, "mysql_auth_plugin")

    @mysql_auth_plugin.setter
    def mysql_auth_plugin(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "mysql_auth_plugin", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name for the database user.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def password(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Password for the database user.
        """
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "password", value)

    @property
    @pulumi.getter
    def role(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Role for the database user. The value will be either "primary" or "normal".
        """
        return pulumi.get(self, "role")

    @role.setter
    def role(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "role", value)

    @property
    @pulumi.getter
    def settings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['DatabaseUserSettingArgs']]]]:
        """
        Contains optional settings for the user.
        The `settings` block is documented below.
        """
        return pulumi.get(self, "settings")

    @settings.setter
    def settings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['DatabaseUserSettingArgs']]]]):
        pulumi.set(self, "settings", value)


class DatabaseUser(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_id: Optional[pulumi.Input[builtins.str]] = None,
                 mysql_auth_plugin: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 settings: Optional[pulumi.Input[Sequence[pulumi.Input[Union['DatabaseUserSettingArgs', 'DatabaseUserSettingArgsDict']]]]] = None,
                 __props__=None):
        """
        Provides a DigitalOcean database user resource. When creating a new database cluster, a default admin user with name `doadmin` will be created. Then, this resource can be used to provide additional normal users inside the cluster.

        > **NOTE:** Any new users created will always have `normal` role, only the default user that comes with database cluster creation has `primary` role. Additional permissions must be managed manually.

        ## Example Usage

        ### Create a new PostgreSQL database user
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
        user_example = digitalocean.DatabaseUser("user-example",
            cluster_id=postgres_example.id,
            name="foobar")
        ```

        ### Create a new user for a PostgreSQL database replica
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
        replica_example = digitalocean.DatabaseReplica("replica-example",
            cluster_id=postgres_example.id,
            name="replica-example",
            size=digitalocean.DatabaseSlug.D_B_1_VPCU1_GB,
            region=digitalocean.Region.NYC1)
        user_example = digitalocean.DatabaseUser("user-example",
            cluster_id=replica_example.uuid,
            name="foobar")
        ```

        ### Create a new user for a Kafka database cluster
        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        kafka_example = digitalocean.DatabaseCluster("kafka-example",
            name="example-kafka-cluster",
            engine="kafka",
            version="3.5",
            size="db-s-2vcpu-2gb",
            region=digitalocean.Region.NYC1,
            node_count=3)
        foobar_topic = digitalocean.DatabaseKafkaTopic("foobar_topic",
            cluster_id=foobar["id"],
            name="topic-1")
        foobar_user = digitalocean.DatabaseUser("foobar_user",
            cluster_id=foobar["id"],
            name="example-user",
            settings=[{
                "acls": [
                    {
                        "topic": "topic-1",
                        "permission": "produce",
                    },
                    {
                        "topic": "topic-2",
                        "permission": "produceconsume",
                    },
                    {
                        "topic": "topic-*",
                        "permission": "consume",
                    },
                ],
            }])
        ```

        ## Import

        Database user can be imported using the `id` of the source database cluster

        and the `name` of the user joined with a comma. For example:

        ```sh
        $ pulumi import digitalocean:index/databaseUser:DatabaseUser user-example 245bcfd0-7f31-4ce6-a2bc-475a116cca97,foobar
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] cluster_id: The ID of the original source database cluster.
        :param pulumi.Input[builtins.str] mysql_auth_plugin: The authentication method to use for connections to the MySQL user account. The valid values are `mysql_native_password` or `caching_sha2_password` (this is the default).
        :param pulumi.Input[builtins.str] name: The name for the database user.
        :param pulumi.Input[Sequence[pulumi.Input[Union['DatabaseUserSettingArgs', 'DatabaseUserSettingArgsDict']]]] settings: Contains optional settings for the user.
               The `settings` block is documented below.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DatabaseUserArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a DigitalOcean database user resource. When creating a new database cluster, a default admin user with name `doadmin` will be created. Then, this resource can be used to provide additional normal users inside the cluster.

        > **NOTE:** Any new users created will always have `normal` role, only the default user that comes with database cluster creation has `primary` role. Additional permissions must be managed manually.

        ## Example Usage

        ### Create a new PostgreSQL database user
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
        user_example = digitalocean.DatabaseUser("user-example",
            cluster_id=postgres_example.id,
            name="foobar")
        ```

        ### Create a new user for a PostgreSQL database replica
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
        replica_example = digitalocean.DatabaseReplica("replica-example",
            cluster_id=postgres_example.id,
            name="replica-example",
            size=digitalocean.DatabaseSlug.D_B_1_VPCU1_GB,
            region=digitalocean.Region.NYC1)
        user_example = digitalocean.DatabaseUser("user-example",
            cluster_id=replica_example.uuid,
            name="foobar")
        ```

        ### Create a new user for a Kafka database cluster
        ```python
        import pulumi
        import pulumi_digitalocean as digitalocean

        kafka_example = digitalocean.DatabaseCluster("kafka-example",
            name="example-kafka-cluster",
            engine="kafka",
            version="3.5",
            size="db-s-2vcpu-2gb",
            region=digitalocean.Region.NYC1,
            node_count=3)
        foobar_topic = digitalocean.DatabaseKafkaTopic("foobar_topic",
            cluster_id=foobar["id"],
            name="topic-1")
        foobar_user = digitalocean.DatabaseUser("foobar_user",
            cluster_id=foobar["id"],
            name="example-user",
            settings=[{
                "acls": [
                    {
                        "topic": "topic-1",
                        "permission": "produce",
                    },
                    {
                        "topic": "topic-2",
                        "permission": "produceconsume",
                    },
                    {
                        "topic": "topic-*",
                        "permission": "consume",
                    },
                ],
            }])
        ```

        ## Import

        Database user can be imported using the `id` of the source database cluster

        and the `name` of the user joined with a comma. For example:

        ```sh
        $ pulumi import digitalocean:index/databaseUser:DatabaseUser user-example 245bcfd0-7f31-4ce6-a2bc-475a116cca97,foobar
        ```

        :param str resource_name: The name of the resource.
        :param DatabaseUserArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DatabaseUserArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_id: Optional[pulumi.Input[builtins.str]] = None,
                 mysql_auth_plugin: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 settings: Optional[pulumi.Input[Sequence[pulumi.Input[Union['DatabaseUserSettingArgs', 'DatabaseUserSettingArgsDict']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DatabaseUserArgs.__new__(DatabaseUserArgs)

            if cluster_id is None and not opts.urn:
                raise TypeError("Missing required property 'cluster_id'")
            __props__.__dict__["cluster_id"] = cluster_id
            __props__.__dict__["mysql_auth_plugin"] = mysql_auth_plugin
            __props__.__dict__["name"] = name
            __props__.__dict__["settings"] = settings
            __props__.__dict__["access_cert"] = None
            __props__.__dict__["access_key"] = None
            __props__.__dict__["password"] = None
            __props__.__dict__["role"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["accessCert", "accessKey", "password"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(DatabaseUser, __self__).__init__(
            'digitalocean:index/databaseUser:DatabaseUser',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            access_cert: Optional[pulumi.Input[builtins.str]] = None,
            access_key: Optional[pulumi.Input[builtins.str]] = None,
            cluster_id: Optional[pulumi.Input[builtins.str]] = None,
            mysql_auth_plugin: Optional[pulumi.Input[builtins.str]] = None,
            name: Optional[pulumi.Input[builtins.str]] = None,
            password: Optional[pulumi.Input[builtins.str]] = None,
            role: Optional[pulumi.Input[builtins.str]] = None,
            settings: Optional[pulumi.Input[Sequence[pulumi.Input[Union['DatabaseUserSettingArgs', 'DatabaseUserSettingArgsDict']]]]] = None) -> 'DatabaseUser':
        """
        Get an existing DatabaseUser resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] access_cert: Access certificate for TLS client authentication. (Kafka only)
        :param pulumi.Input[builtins.str] access_key: Access key for TLS client authentication. (Kafka only)
        :param pulumi.Input[builtins.str] cluster_id: The ID of the original source database cluster.
        :param pulumi.Input[builtins.str] mysql_auth_plugin: The authentication method to use for connections to the MySQL user account. The valid values are `mysql_native_password` or `caching_sha2_password` (this is the default).
        :param pulumi.Input[builtins.str] name: The name for the database user.
        :param pulumi.Input[builtins.str] password: Password for the database user.
        :param pulumi.Input[builtins.str] role: Role for the database user. The value will be either "primary" or "normal".
        :param pulumi.Input[Sequence[pulumi.Input[Union['DatabaseUserSettingArgs', 'DatabaseUserSettingArgsDict']]]] settings: Contains optional settings for the user.
               The `settings` block is documented below.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DatabaseUserState.__new__(_DatabaseUserState)

        __props__.__dict__["access_cert"] = access_cert
        __props__.__dict__["access_key"] = access_key
        __props__.__dict__["cluster_id"] = cluster_id
        __props__.__dict__["mysql_auth_plugin"] = mysql_auth_plugin
        __props__.__dict__["name"] = name
        __props__.__dict__["password"] = password
        __props__.__dict__["role"] = role
        __props__.__dict__["settings"] = settings
        return DatabaseUser(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accessCert")
    def access_cert(self) -> pulumi.Output[builtins.str]:
        """
        Access certificate for TLS client authentication. (Kafka only)
        """
        return pulumi.get(self, "access_cert")

    @property
    @pulumi.getter(name="accessKey")
    def access_key(self) -> pulumi.Output[builtins.str]:
        """
        Access key for TLS client authentication. (Kafka only)
        """
        return pulumi.get(self, "access_key")

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Output[builtins.str]:
        """
        The ID of the original source database cluster.
        """
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter(name="mysqlAuthPlugin")
    def mysql_auth_plugin(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        The authentication method to use for connections to the MySQL user account. The valid values are `mysql_native_password` or `caching_sha2_password` (this is the default).
        """
        return pulumi.get(self, "mysql_auth_plugin")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[builtins.str]:
        """
        The name for the database user.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def password(self) -> pulumi.Output[builtins.str]:
        """
        Password for the database user.
        """
        return pulumi.get(self, "password")

    @property
    @pulumi.getter
    def role(self) -> pulumi.Output[builtins.str]:
        """
        Role for the database user. The value will be either "primary" or "normal".
        """
        return pulumi.get(self, "role")

    @property
    @pulumi.getter
    def settings(self) -> pulumi.Output[Optional[Sequence['outputs.DatabaseUserSetting']]]:
        """
        Contains optional settings for the user.
        The `settings` block is documented below.
        """
        return pulumi.get(self, "settings")

