# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

# Export this package's modules as members:
from .app import *
from .cdn import *
from .certificate import *
from .container_registry import *
from .container_registry_docker_credentials import *
from .custom_image import *
from .database_cluster import *
from .database_connection_pool import *
from .database_db import *
from .database_firewall import *
from .database_replica import *
from .database_user import *
from .dns_record import *
from .domain import *
from .droplet import *
from .droplet_snapshot import *
from .firewall import *
from .floating_ip import *
from .floating_ip_assignment import *
from .get_account import *
from .get_app import *
from .get_certificate import *
from .get_container_registry import *
from .get_database_cluster import *
from .get_database_replica import *
from .get_domain import *
from .get_domains import *
from .get_droplet import *
from .get_droplet_snapshot import *
from .get_droplets import *
from .get_firewall import *
from .get_floating_ip import *
from .get_image import *
from .get_images import *
from .get_kubernetes_cluster import *
from .get_kubernetes_versions import *
from .get_load_balancer import *
from .get_project import *
from .get_projects import *
from .get_record import *
from .get_records import *
from .get_region import *
from .get_regions import *
from .get_sizes import *
from .get_spaces_bucket import *
from .get_spaces_bucket_object import *
from .get_spaces_bucket_objects import *
from .get_spaces_buckets import *
from .get_ssh_key import *
from .get_ssh_keys import *
from .get_tag import *
from .get_tags import *
from .get_volume import *
from .get_volume_snapshot import *
from .get_vpc import *
from .kubernetes_cluster import *
from .kubernetes_node_pool import *
from .load_balancer import *
from .project import *
from .project_resources import *
from .provider import *
from .spaces_bucket import *
from .spaces_bucket_object import *
from .ssh_key import *
from .tag import *
from .volume import *
from .volume_attachment import *
from .volume_snapshot import *
from .vpc import *
from ._inputs import *
from . import outputs

# Make subpackages available:
from . import (
    config,
)

def _register_module():
    import pulumi
    from . import _utilities


    class Module(pulumi.runtime.ResourceModule):
        _version = _utilities.get_semver_version()

        def version(self):
            return Module._version

        def construct(self, name: str, typ: str, urn: str) -> pulumi.Resource:
            if typ == "digitalocean:index/app:App":
                return App(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "digitalocean:index/cdn:Cdn":
                return Cdn(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "digitalocean:index/certificate:Certificate":
                return Certificate(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "digitalocean:index/containerRegistry:ContainerRegistry":
                return ContainerRegistry(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "digitalocean:index/containerRegistryDockerCredentials:ContainerRegistryDockerCredentials":
                return ContainerRegistryDockerCredentials(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "digitalocean:index/customImage:CustomImage":
                return CustomImage(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "digitalocean:index/databaseCluster:DatabaseCluster":
                return DatabaseCluster(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "digitalocean:index/databaseConnectionPool:DatabaseConnectionPool":
                return DatabaseConnectionPool(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "digitalocean:index/databaseReplica:DatabaseReplica":
                return DatabaseReplica(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "digitalocean:index/dnsRecord:DnsRecord":
                return DnsRecord(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "digitalocean:index/domain:Domain":
                return Domain(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "digitalocean:index/droplet:Droplet":
                return Droplet(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "digitalocean:index/dropletSnapshot:DropletSnapshot":
                return DropletSnapshot(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "digitalocean:index/firewall:Firewall":
                return Firewall(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "digitalocean:index/floatingIp:FloatingIp":
                return FloatingIp(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "digitalocean:index/floatingIpAssignment:FloatingIpAssignment":
                return FloatingIpAssignment(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "digitalocean:index/kubernetesCluster:KubernetesCluster":
                return KubernetesCluster(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "digitalocean:index/kubernetesNodePool:KubernetesNodePool":
                return KubernetesNodePool(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "digitalocean:index/loadBalancer:LoadBalancer":
                return LoadBalancer(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "digitalocean:index/project:Project":
                return Project(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "digitalocean:index/projectResources:ProjectResources":
                return ProjectResources(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "digitalocean:index/spacesBucket:SpacesBucket":
                return SpacesBucket(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "digitalocean:index/spacesBucketObject:SpacesBucketObject":
                return SpacesBucketObject(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "digitalocean:index/sshKey:SshKey":
                return SshKey(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "digitalocean:index/tag:Tag":
                return Tag(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "digitalocean:index/volume:Volume":
                return Volume(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "digitalocean:index/volumeAttachment:VolumeAttachment":
                return VolumeAttachment(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "digitalocean:index/volumeSnapshot:VolumeSnapshot":
                return VolumeSnapshot(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "digitalocean:index/vpc:Vpc":
                return Vpc(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "digitalocean:index:DatabaseDb":
                return DatabaseDb(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "digitalocean:index:DatabaseFirewall":
                return DatabaseFirewall(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "digitalocean:index:DatabaseUser":
                return DatabaseUser(name, pulumi.ResourceOptions(urn=urn))
            else:
                raise Exception(f"unknown resource type {typ}")


    _module_instance = Module()
    pulumi.runtime.register_resource_module("digitalocean", "index", _module_instance)
    pulumi.runtime.register_resource_module("digitalocean", "index/app", _module_instance)
    pulumi.runtime.register_resource_module("digitalocean", "index/cdn", _module_instance)
    pulumi.runtime.register_resource_module("digitalocean", "index/certificate", _module_instance)
    pulumi.runtime.register_resource_module("digitalocean", "index/containerRegistry", _module_instance)
    pulumi.runtime.register_resource_module("digitalocean", "index/containerRegistryDockerCredentials", _module_instance)
    pulumi.runtime.register_resource_module("digitalocean", "index/customImage", _module_instance)
    pulumi.runtime.register_resource_module("digitalocean", "index/databaseCluster", _module_instance)
    pulumi.runtime.register_resource_module("digitalocean", "index/databaseConnectionPool", _module_instance)
    pulumi.runtime.register_resource_module("digitalocean", "index/databaseReplica", _module_instance)
    pulumi.runtime.register_resource_module("digitalocean", "index/dnsRecord", _module_instance)
    pulumi.runtime.register_resource_module("digitalocean", "index/domain", _module_instance)
    pulumi.runtime.register_resource_module("digitalocean", "index/droplet", _module_instance)
    pulumi.runtime.register_resource_module("digitalocean", "index/dropletSnapshot", _module_instance)
    pulumi.runtime.register_resource_module("digitalocean", "index/firewall", _module_instance)
    pulumi.runtime.register_resource_module("digitalocean", "index/floatingIp", _module_instance)
    pulumi.runtime.register_resource_module("digitalocean", "index/floatingIpAssignment", _module_instance)
    pulumi.runtime.register_resource_module("digitalocean", "index/kubernetesCluster", _module_instance)
    pulumi.runtime.register_resource_module("digitalocean", "index/kubernetesNodePool", _module_instance)
    pulumi.runtime.register_resource_module("digitalocean", "index/loadBalancer", _module_instance)
    pulumi.runtime.register_resource_module("digitalocean", "index/project", _module_instance)
    pulumi.runtime.register_resource_module("digitalocean", "index/projectResources", _module_instance)
    pulumi.runtime.register_resource_module("digitalocean", "index/spacesBucket", _module_instance)
    pulumi.runtime.register_resource_module("digitalocean", "index/spacesBucketObject", _module_instance)
    pulumi.runtime.register_resource_module("digitalocean", "index/sshKey", _module_instance)
    pulumi.runtime.register_resource_module("digitalocean", "index/tag", _module_instance)
    pulumi.runtime.register_resource_module("digitalocean", "index/volume", _module_instance)
    pulumi.runtime.register_resource_module("digitalocean", "index/volumeAttachment", _module_instance)
    pulumi.runtime.register_resource_module("digitalocean", "index/volumeSnapshot", _module_instance)
    pulumi.runtime.register_resource_module("digitalocean", "index/vpc", _module_instance)


    class Package(pulumi.runtime.ResourcePackage):
        _version = _utilities.get_semver_version()

        def version(self):
            return Package._version

        def construct_provider(self, name: str, typ: str, urn: str) -> pulumi.ProviderResource:
            if typ != "pulumi:providers:digitalocean":
                raise Exception(f"unknown provider type {typ}")
            return Provider(name, pulumi.ResourceOptions(urn=urn))


    pulumi.runtime.register_resource_package("digitalocean", Package())

_register_module()
