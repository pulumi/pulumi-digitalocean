# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

from . import _utilities
import typing
# Export this package's modules as members:
from ._enums import *
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
from .database_kafka_topic import *
from .database_mysql_config import *
from .database_redis_config import *
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
from .get_database_ca import *
from .get_database_cluster import *
from .get_database_replica import *
from .get_database_user import *
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
from .get_reserved_ip import *
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
from .monitor_alert import *
from .project import *
from .project_resources import *
from .provider import *
from .reserved_ip import *
from .reserved_ip_assignment import *
from .spaces_bucket import *
from .spaces_bucket_cors_configuration import *
from .spaces_bucket_object import *
from .spaces_bucket_policy import *
from .ssh_key import *
from .tag import *
from .uptime_alert import *
from .uptime_check import *
from .volume import *
from .volume_attachment import *
from .volume_snapshot import *
from .vpc import *
from ._inputs import *
from . import outputs

# Make subpackages available:
if typing.TYPE_CHECKING:
    import pulumi_digitalocean.config as __config
    config = __config
else:
    config = _utilities.lazy_import('pulumi_digitalocean.config')

_utilities.register(
    resource_modules="""
[
 {
  "pkg": "digitalocean",
  "mod": "index/app",
  "fqn": "pulumi_digitalocean",
  "classes": {
   "digitalocean:index/app:App": "App"
  }
 },
 {
  "pkg": "digitalocean",
  "mod": "index/cdn",
  "fqn": "pulumi_digitalocean",
  "classes": {
   "digitalocean:index/cdn:Cdn": "Cdn"
  }
 },
 {
  "pkg": "digitalocean",
  "mod": "index/certificate",
  "fqn": "pulumi_digitalocean",
  "classes": {
   "digitalocean:index/certificate:Certificate": "Certificate"
  }
 },
 {
  "pkg": "digitalocean",
  "mod": "index/containerRegistry",
  "fqn": "pulumi_digitalocean",
  "classes": {
   "digitalocean:index/containerRegistry:ContainerRegistry": "ContainerRegistry"
  }
 },
 {
  "pkg": "digitalocean",
  "mod": "index/containerRegistryDockerCredentials",
  "fqn": "pulumi_digitalocean",
  "classes": {
   "digitalocean:index/containerRegistryDockerCredentials:ContainerRegistryDockerCredentials": "ContainerRegistryDockerCredentials"
  }
 },
 {
  "pkg": "digitalocean",
  "mod": "index/customImage",
  "fqn": "pulumi_digitalocean",
  "classes": {
   "digitalocean:index/customImage:CustomImage": "CustomImage"
  }
 },
 {
  "pkg": "digitalocean",
  "mod": "index/databaseCluster",
  "fqn": "pulumi_digitalocean",
  "classes": {
   "digitalocean:index/databaseCluster:DatabaseCluster": "DatabaseCluster"
  }
 },
 {
  "pkg": "digitalocean",
  "mod": "index/databaseConnectionPool",
  "fqn": "pulumi_digitalocean",
  "classes": {
   "digitalocean:index/databaseConnectionPool:DatabaseConnectionPool": "DatabaseConnectionPool"
  }
 },
 {
  "pkg": "digitalocean",
  "mod": "index/databaseDb",
  "fqn": "pulumi_digitalocean",
  "classes": {
   "digitalocean:index/databaseDb:DatabaseDb": "DatabaseDb"
  }
 },
 {
  "pkg": "digitalocean",
  "mod": "index/databaseFirewall",
  "fqn": "pulumi_digitalocean",
  "classes": {
   "digitalocean:index/databaseFirewall:DatabaseFirewall": "DatabaseFirewall"
  }
 },
 {
  "pkg": "digitalocean",
  "mod": "index/databaseKafkaTopic",
  "fqn": "pulumi_digitalocean",
  "classes": {
   "digitalocean:index/databaseKafkaTopic:DatabaseKafkaTopic": "DatabaseKafkaTopic"
  }
 },
 {
  "pkg": "digitalocean",
  "mod": "index/databaseMysqlConfig",
  "fqn": "pulumi_digitalocean",
  "classes": {
   "digitalocean:index/databaseMysqlConfig:DatabaseMysqlConfig": "DatabaseMysqlConfig"
  }
 },
 {
  "pkg": "digitalocean",
  "mod": "index/databaseRedisConfig",
  "fqn": "pulumi_digitalocean",
  "classes": {
   "digitalocean:index/databaseRedisConfig:DatabaseRedisConfig": "DatabaseRedisConfig"
  }
 },
 {
  "pkg": "digitalocean",
  "mod": "index/databaseReplica",
  "fqn": "pulumi_digitalocean",
  "classes": {
   "digitalocean:index/databaseReplica:DatabaseReplica": "DatabaseReplica"
  }
 },
 {
  "pkg": "digitalocean",
  "mod": "index/databaseUser",
  "fqn": "pulumi_digitalocean",
  "classes": {
   "digitalocean:index/databaseUser:DatabaseUser": "DatabaseUser"
  }
 },
 {
  "pkg": "digitalocean",
  "mod": "index/dnsRecord",
  "fqn": "pulumi_digitalocean",
  "classes": {
   "digitalocean:index/dnsRecord:DnsRecord": "DnsRecord"
  }
 },
 {
  "pkg": "digitalocean",
  "mod": "index/domain",
  "fqn": "pulumi_digitalocean",
  "classes": {
   "digitalocean:index/domain:Domain": "Domain"
  }
 },
 {
  "pkg": "digitalocean",
  "mod": "index/droplet",
  "fqn": "pulumi_digitalocean",
  "classes": {
   "digitalocean:index/droplet:Droplet": "Droplet"
  }
 },
 {
  "pkg": "digitalocean",
  "mod": "index/dropletSnapshot",
  "fqn": "pulumi_digitalocean",
  "classes": {
   "digitalocean:index/dropletSnapshot:DropletSnapshot": "DropletSnapshot"
  }
 },
 {
  "pkg": "digitalocean",
  "mod": "index/firewall",
  "fqn": "pulumi_digitalocean",
  "classes": {
   "digitalocean:index/firewall:Firewall": "Firewall"
  }
 },
 {
  "pkg": "digitalocean",
  "mod": "index/floatingIp",
  "fqn": "pulumi_digitalocean",
  "classes": {
   "digitalocean:index/floatingIp:FloatingIp": "FloatingIp"
  }
 },
 {
  "pkg": "digitalocean",
  "mod": "index/floatingIpAssignment",
  "fqn": "pulumi_digitalocean",
  "classes": {
   "digitalocean:index/floatingIpAssignment:FloatingIpAssignment": "FloatingIpAssignment"
  }
 },
 {
  "pkg": "digitalocean",
  "mod": "index/kubernetesCluster",
  "fqn": "pulumi_digitalocean",
  "classes": {
   "digitalocean:index/kubernetesCluster:KubernetesCluster": "KubernetesCluster"
  }
 },
 {
  "pkg": "digitalocean",
  "mod": "index/kubernetesNodePool",
  "fqn": "pulumi_digitalocean",
  "classes": {
   "digitalocean:index/kubernetesNodePool:KubernetesNodePool": "KubernetesNodePool"
  }
 },
 {
  "pkg": "digitalocean",
  "mod": "index/loadBalancer",
  "fqn": "pulumi_digitalocean",
  "classes": {
   "digitalocean:index/loadBalancer:LoadBalancer": "LoadBalancer"
  }
 },
 {
  "pkg": "digitalocean",
  "mod": "index/monitorAlert",
  "fqn": "pulumi_digitalocean",
  "classes": {
   "digitalocean:index/monitorAlert:MonitorAlert": "MonitorAlert"
  }
 },
 {
  "pkg": "digitalocean",
  "mod": "index/project",
  "fqn": "pulumi_digitalocean",
  "classes": {
   "digitalocean:index/project:Project": "Project"
  }
 },
 {
  "pkg": "digitalocean",
  "mod": "index/projectResources",
  "fqn": "pulumi_digitalocean",
  "classes": {
   "digitalocean:index/projectResources:ProjectResources": "ProjectResources"
  }
 },
 {
  "pkg": "digitalocean",
  "mod": "index/reservedIp",
  "fqn": "pulumi_digitalocean",
  "classes": {
   "digitalocean:index/reservedIp:ReservedIp": "ReservedIp"
  }
 },
 {
  "pkg": "digitalocean",
  "mod": "index/reservedIpAssignment",
  "fqn": "pulumi_digitalocean",
  "classes": {
   "digitalocean:index/reservedIpAssignment:ReservedIpAssignment": "ReservedIpAssignment"
  }
 },
 {
  "pkg": "digitalocean",
  "mod": "index/spacesBucket",
  "fqn": "pulumi_digitalocean",
  "classes": {
   "digitalocean:index/spacesBucket:SpacesBucket": "SpacesBucket"
  }
 },
 {
  "pkg": "digitalocean",
  "mod": "index/spacesBucketCorsConfiguration",
  "fqn": "pulumi_digitalocean",
  "classes": {
   "digitalocean:index/spacesBucketCorsConfiguration:SpacesBucketCorsConfiguration": "SpacesBucketCorsConfiguration"
  }
 },
 {
  "pkg": "digitalocean",
  "mod": "index/spacesBucketObject",
  "fqn": "pulumi_digitalocean",
  "classes": {
   "digitalocean:index/spacesBucketObject:SpacesBucketObject": "SpacesBucketObject"
  }
 },
 {
  "pkg": "digitalocean",
  "mod": "index/spacesBucketPolicy",
  "fqn": "pulumi_digitalocean",
  "classes": {
   "digitalocean:index/spacesBucketPolicy:SpacesBucketPolicy": "SpacesBucketPolicy"
  }
 },
 {
  "pkg": "digitalocean",
  "mod": "index/sshKey",
  "fqn": "pulumi_digitalocean",
  "classes": {
   "digitalocean:index/sshKey:SshKey": "SshKey"
  }
 },
 {
  "pkg": "digitalocean",
  "mod": "index/tag",
  "fqn": "pulumi_digitalocean",
  "classes": {
   "digitalocean:index/tag:Tag": "Tag"
  }
 },
 {
  "pkg": "digitalocean",
  "mod": "index/uptimeAlert",
  "fqn": "pulumi_digitalocean",
  "classes": {
   "digitalocean:index/uptimeAlert:UptimeAlert": "UptimeAlert"
  }
 },
 {
  "pkg": "digitalocean",
  "mod": "index/uptimeCheck",
  "fqn": "pulumi_digitalocean",
  "classes": {
   "digitalocean:index/uptimeCheck:UptimeCheck": "UptimeCheck"
  }
 },
 {
  "pkg": "digitalocean",
  "mod": "index/volume",
  "fqn": "pulumi_digitalocean",
  "classes": {
   "digitalocean:index/volume:Volume": "Volume"
  }
 },
 {
  "pkg": "digitalocean",
  "mod": "index/volumeAttachment",
  "fqn": "pulumi_digitalocean",
  "classes": {
   "digitalocean:index/volumeAttachment:VolumeAttachment": "VolumeAttachment"
  }
 },
 {
  "pkg": "digitalocean",
  "mod": "index/volumeSnapshot",
  "fqn": "pulumi_digitalocean",
  "classes": {
   "digitalocean:index/volumeSnapshot:VolumeSnapshot": "VolumeSnapshot"
  }
 },
 {
  "pkg": "digitalocean",
  "mod": "index/vpc",
  "fqn": "pulumi_digitalocean",
  "classes": {
   "digitalocean:index/vpc:Vpc": "Vpc"
  }
 }
]
""",
    resource_packages="""
[
 {
  "pkg": "digitalocean",
  "token": "pulumi:providers:digitalocean",
  "fqn": "pulumi_digitalocean",
  "class": "Provider"
 }
]
"""
)
