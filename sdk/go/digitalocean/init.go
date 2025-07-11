// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi-digitalocean/sdk/v4/go/digitalocean/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "digitalocean:index/app:App":
		r = &App{}
	case "digitalocean:index/cdn:Cdn":
		r = &Cdn{}
	case "digitalocean:index/certificate:Certificate":
		r = &Certificate{}
	case "digitalocean:index/containerRegistry:ContainerRegistry":
		r = &ContainerRegistry{}
	case "digitalocean:index/containerRegistryDockerCredentials:ContainerRegistryDockerCredentials":
		r = &ContainerRegistryDockerCredentials{}
	case "digitalocean:index/customImage:CustomImage":
		r = &CustomImage{}
	case "digitalocean:index/databaseCluster:DatabaseCluster":
		r = &DatabaseCluster{}
	case "digitalocean:index/databaseConnectionPool:DatabaseConnectionPool":
		r = &DatabaseConnectionPool{}
	case "digitalocean:index/databaseDb:DatabaseDb":
		r = &DatabaseDb{}
	case "digitalocean:index/databaseFirewall:DatabaseFirewall":
		r = &DatabaseFirewall{}
	case "digitalocean:index/databaseKafkaConfig:DatabaseKafkaConfig":
		r = &DatabaseKafkaConfig{}
	case "digitalocean:index/databaseKafkaTopic:DatabaseKafkaTopic":
		r = &DatabaseKafkaTopic{}
	case "digitalocean:index/databaseMongodbConfig:DatabaseMongodbConfig":
		r = &DatabaseMongodbConfig{}
	case "digitalocean:index/databaseMysqlConfig:DatabaseMysqlConfig":
		r = &DatabaseMysqlConfig{}
	case "digitalocean:index/databaseOpensearchConfig:DatabaseOpensearchConfig":
		r = &DatabaseOpensearchConfig{}
	case "digitalocean:index/databasePostgresqlConfig:DatabasePostgresqlConfig":
		r = &DatabasePostgresqlConfig{}
	case "digitalocean:index/databaseRedisConfig:DatabaseRedisConfig":
		r = &DatabaseRedisConfig{}
	case "digitalocean:index/databaseReplica:DatabaseReplica":
		r = &DatabaseReplica{}
	case "digitalocean:index/databaseUser:DatabaseUser":
		r = &DatabaseUser{}
	case "digitalocean:index/dnsRecord:DnsRecord":
		r = &DnsRecord{}
	case "digitalocean:index/domain:Domain":
		r = &Domain{}
	case "digitalocean:index/droplet:Droplet":
		r = &Droplet{}
	case "digitalocean:index/dropletAutoscale:DropletAutoscale":
		r = &DropletAutoscale{}
	case "digitalocean:index/dropletSnapshot:DropletSnapshot":
		r = &DropletSnapshot{}
	case "digitalocean:index/firewall:Firewall":
		r = &Firewall{}
	case "digitalocean:index/floatingIp:FloatingIp":
		r = &FloatingIp{}
	case "digitalocean:index/floatingIpAssignment:FloatingIpAssignment":
		r = &FloatingIpAssignment{}
	case "digitalocean:index/genaiAgent:GenaiAgent":
		r = &GenaiAgent{}
	case "digitalocean:index/kubernetesCluster:KubernetesCluster":
		r = &KubernetesCluster{}
	case "digitalocean:index/kubernetesNodePool:KubernetesNodePool":
		r = &KubernetesNodePool{}
	case "digitalocean:index/loadBalancer:LoadBalancer":
		r = &LoadBalancer{}
	case "digitalocean:index/monitorAlert:MonitorAlert":
		r = &MonitorAlert{}
	case "digitalocean:index/partnerAttachment:PartnerAttachment":
		r = &PartnerAttachment{}
	case "digitalocean:index/project:Project":
		r = &Project{}
	case "digitalocean:index/projectResources:ProjectResources":
		r = &ProjectResources{}
	case "digitalocean:index/reservedIp:ReservedIp":
		r = &ReservedIp{}
	case "digitalocean:index/reservedIpAssignment:ReservedIpAssignment":
		r = &ReservedIpAssignment{}
	case "digitalocean:index/reservedIpv6:ReservedIpv6":
		r = &ReservedIpv6{}
	case "digitalocean:index/reservedIpv6Assignment:ReservedIpv6Assignment":
		r = &ReservedIpv6Assignment{}
	case "digitalocean:index/spacesBucket:SpacesBucket":
		r = &SpacesBucket{}
	case "digitalocean:index/spacesBucketCorsConfiguration:SpacesBucketCorsConfiguration":
		r = &SpacesBucketCorsConfiguration{}
	case "digitalocean:index/spacesBucketLogging:SpacesBucketLogging":
		r = &SpacesBucketLogging{}
	case "digitalocean:index/spacesBucketObject:SpacesBucketObject":
		r = &SpacesBucketObject{}
	case "digitalocean:index/spacesBucketPolicy:SpacesBucketPolicy":
		r = &SpacesBucketPolicy{}
	case "digitalocean:index/spacesKey:SpacesKey":
		r = &SpacesKey{}
	case "digitalocean:index/sshKey:SshKey":
		r = &SshKey{}
	case "digitalocean:index/tag:Tag":
		r = &Tag{}
	case "digitalocean:index/uptimeAlert:UptimeAlert":
		r = &UptimeAlert{}
	case "digitalocean:index/uptimeCheck:UptimeCheck":
		r = &UptimeCheck{}
	case "digitalocean:index/volume:Volume":
		r = &Volume{}
	case "digitalocean:index/volumeAttachment:VolumeAttachment":
		r = &VolumeAttachment{}
	case "digitalocean:index/volumeSnapshot:VolumeSnapshot":
		r = &VolumeSnapshot{}
	case "digitalocean:index/vpc:Vpc":
		r = &Vpc{}
	case "digitalocean:index/vpcNatGateway:VpcNatGateway":
		r = &VpcNatGateway{}
	case "digitalocean:index/vpcPeering:VpcPeering":
		r = &VpcPeering{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

type pkg struct {
	version semver.Version
}

func (p *pkg) Version() semver.Version {
	return p.version
}

func (p *pkg) ConstructProvider(ctx *pulumi.Context, name, typ, urn string) (pulumi.ProviderResource, error) {
	if typ != "pulumi:providers:digitalocean" {
		return nil, fmt.Errorf("unknown provider type: %s", typ)
	}

	r := &Provider{}
	err := ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return r, err
}

func init() {
	version, err := internal.PkgVersion()
	if err != nil {
		version = semver.Version{Major: 1}
	}
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/app",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/cdn",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/certificate",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/containerRegistry",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/containerRegistryDockerCredentials",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/customImage",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/databaseCluster",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/databaseConnectionPool",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/databaseDb",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/databaseFirewall",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/databaseKafkaConfig",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/databaseKafkaTopic",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/databaseMongodbConfig",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/databaseMysqlConfig",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/databaseOpensearchConfig",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/databasePostgresqlConfig",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/databaseRedisConfig",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/databaseReplica",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/databaseUser",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/dnsRecord",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/domain",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/droplet",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/dropletAutoscale",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/dropletSnapshot",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/firewall",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/floatingIp",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/floatingIpAssignment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/genaiAgent",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/kubernetesCluster",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/kubernetesNodePool",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/loadBalancer",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/monitorAlert",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/partnerAttachment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/project",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/projectResources",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/reservedIp",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/reservedIpAssignment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/reservedIpv6",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/reservedIpv6Assignment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/spacesBucket",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/spacesBucketCorsConfiguration",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/spacesBucketLogging",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/spacesBucketObject",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/spacesBucketPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/spacesKey",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/sshKey",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/tag",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/uptimeAlert",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/uptimeCheck",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/volume",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/volumeAttachment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/volumeSnapshot",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/vpc",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/vpcNatGateway",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"digitalocean",
		"index/vpcPeering",
		&module{version},
	)
	pulumi.RegisterResourcePackage(
		"digitalocean",
		&pkg{version},
	)
}
