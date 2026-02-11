// Copyright 2016-2018, Pulumi Corporation.(
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package digitalocean

import (
	"bytes"
	"fmt"
	"path/filepath"
	"strings"
	"unicode"

	// embed is used to store bridge-metadata.json in the compiled binary
	_ "embed"

	"github.com/digitalocean/terraform-provider-digitalocean/digitalocean"

	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/info"
	tfbridgetokens "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/pkg/v3/codegen/schema"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"

	"github.com/pulumi/pulumi-digitalocean/provider/v4/pkg/version"
)

// all of the DigitalOcean token components used below.
const (
	// packages:
	digitalOceanPkg = "digitalocean"
	// modules:
	digitalOceanMod = "index" // the root index.
)

// makeMember manufactures a type token for the DigitalOcean package and the given module and type.
func makeMember(mod string, mem string) tokens.ModuleMember {
	return tokens.ModuleMember(digitalOceanPkg + ":" + mod + ":" + mem)
}

// makeType manufactures a type token for the DigitalOcean package and the given module and type.
func makeType(mod string, typ string) tokens.Type {
	return tokens.Type(makeMember(mod, typ))
}

// makeDataSource manufactures a standard resource token given a module and resource name.
// It automatically uses the DigitalOcean package and names the file by simply lower casing the data
// source's first character.
func makeDataSource(mod string, res string) tokens.ModuleMember {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return makeMember(mod+"/"+fn, res)
}

// makeResource manufactures a standard resource token given a module and resource name.
// It automatically uses the DigitalOcean package and names the file by simply lower casing the resource's
// first character.
func makeResource(mod string, res string) tokens.Type {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return makeType(mod+"/"+fn, res)
}

func ref[T any](value T) *T { return &value }

// Provider returns additional overlaid schema and metadata associated with the DigitalOcean package.
func Provider() tfbridge.ProviderInfo {
	p := shimv2.NewProvider(digitalocean.Provider())
	prov := tfbridge.ProviderInfo{
		P:                p,
		Name:             "digitalocean",
		DisplayName:      "DigitalOcean",
		Description:      "A Pulumi package for creating and managing DigitalOcean cloud resources.",
		Keywords:         []string{"pulumi", "digitalocean"},
		License:          "Apache-2.0",
		Homepage:         "https://pulumi.io",
		Repository:       "https://github.com/pulumi/pulumi-digitalocean",
		GitHubOrg:        "digitalocean",
		UpstreamRepoPath: "./upstream",
		Config: map[string]*tfbridge.SchemaInfo{
			"api_endpoint": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"DIGITALOCEAN_API_URL"},
					Value:   "https://api.digitalocean.com",
				},
			},
			"spaces_endpoint": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"SPACES_ENDPOINT_URL"},
				},
			},
		},
		Resources: map[string]*tfbridge.ResourceInfo{
			"digitalocean_cdn": {Tok: makeResource(digitalOceanMod, "Cdn")},
			"digitalocean_certificate": {
				Tok: makeResource(digitalOceanMod, "Certificate"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"type": {
						Type:     "string",
						AltTypes: []tokens.Type{makeType(digitalOceanMod, "CertificateType")},
					},
				},
			},
			"digitalocean_database_cluster": {
				Tok: makeResource(digitalOceanMod, "DatabaseCluster"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"region": {
						Type:     "string",
						AltTypes: []tokens.Type{makeType(digitalOceanMod, "Region")},
					},
					"size": {
						Type:     "string",
						AltTypes: []tokens.Type{makeType(digitalOceanMod, "DatabaseSlug")},
					},
					"urn": {
						Name: "clusterUrn",
					},
				},
			},
			"digitalocean_database_connection_pool": {
				Tok: makeResource(digitalOceanMod, "DatabaseConnectionPool"),
			},
			"digitalocean_database_replica": {
				Tok: makeResource(digitalOceanMod, "DatabaseReplica"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"region": {
						Type:     "string",
						AltTypes: []tokens.Type{makeType(digitalOceanMod, "Region")},
					},
					"size": {
						Type:     "string",
						AltTypes: []tokens.Type{makeType(digitalOceanMod, "DatabaseSlug")},
					},
				},
			},
			"digitalocean_database_user":     {Tok: makeResource(digitalOceanMod, "DatabaseUser")},
			"digitalocean_database_db":       {Tok: makeResource(digitalOceanMod, "DatabaseDb")},
			"digitalocean_database_firewall": {Tok: makeResource(digitalOceanMod, "DatabaseFirewall")},
			"digitalocean_domain": {
				Tok: makeResource(digitalOceanMod, "Domain"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"name": {
						Name: "name",
					},
					"urn": {
						Name: "domainUrn",
					},
				},
			},
			"digitalocean_droplet": {
				Tok: makeResource(digitalOceanMod, "Droplet"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"region": {
						Type:     "string",
						AltTypes: []tokens.Type{makeType(digitalOceanMod, "Region")},
					},
					"size": {
						Type:     "string",
						AltTypes: []tokens.Type{makeType(digitalOceanMod, "DropletSlug")},
					},
					"urn": {
						Name: "dropletUrn",
					},
				},
			},
			"digitalocean_droplet_snapshot": {Tok: makeResource(digitalOceanMod, "DropletSnapshot")},
			"digitalocean_firewall":         {Tok: makeResource(digitalOceanMod, "Firewall")},
			"digitalocean_floating_ip": {
				Tok: makeResource(digitalOceanMod, "FloatingIp"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"urn": {
						Name: "floatingIpUrn",
					},
				},
			},
			"digitalocean_floating_ip_assignment": {Tok: makeResource(digitalOceanMod, "FloatingIpAssignment")},
			"digitalocean_gradientai_knowledge_base": {
				Tok: makeResource(digitalOceanMod, "GradientaiKnowledgeBase"),
				Aliases: []tfbridge.AliasInfo{
					{Type: ref(string(makeResource(digitalOceanMod, "GenaiKnowledgeBase")))},
				},
				Fields: map[string]*info.Schema{
					"datasources": {
						Elem: &info.Schema{
							TypeName: tfbridge.Ref("GradientaiKnowledgeBaseDataSource"),
						},
					},
				},
			},
			"digitalocean_gradientai_knowledge_base_data_source": {
				Tok: makeResource(digitalOceanMod, "GradientaiKnowledgeBaseDataSource"),
				Aliases: []tfbridge.AliasInfo{
					{Type: ref(string(makeResource(digitalOceanMod, "GenaiKnowledgeBaseDataSource")))},
				},
			},

			"digitalocean_kubernetes_cluster": {
				Tok: makeResource(digitalOceanMod, "KubernetesCluster"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"region": {
						Type:     "string",
						AltTypes: []tokens.Type{makeType(digitalOceanMod, "Region")},
					},
					"urn": {
						Name: "clusterUrn",
					},
				},
			},
			"digitalocean_kubernetes_node_pool": {
				Tok: makeResource(digitalOceanMod, "KubernetesNodePool"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"size": {
						Type:     "string",
						AltTypes: []tokens.Type{makeType(digitalOceanMod, "DropletSlug")},
					},
				},
			},
			"digitalocean_loadbalancer": {
				Tok: makeResource(digitalOceanMod, "LoadBalancer"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"region": {
						Type:     "string",
						AltTypes: []tokens.Type{makeType(digitalOceanMod, "Region")},
					},
					"algorithm": {
						Type:     "string",
						AltTypes: []tokens.Type{makeType(digitalOceanMod, "Algorithm")},
					},
					"urn": {
						Name: "loadBalancerUrn",
					},
				},
			},
			"digitalocean_project": {Tok: makeResource(digitalOceanMod, "Project")},
			"digitalocean_record": {
				Tok: makeResource(digitalOceanMod, "DnsRecord"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"type": {
						Type:     "string",
						AltTypes: []tokens.Type{makeType(digitalOceanMod, "RecordType")},
					},
				},
			},
			"digitalocean_ssh_key": {Tok: makeResource(digitalOceanMod, "SshKey")},
			"digitalocean_spaces_bucket": {
				Tok: makeResource(digitalOceanMod, "SpacesBucket"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"region": {
						Type:     "string",
						AltTypes: []tokens.Type{makeType(digitalOceanMod, "Region")},
					},
					"urn": {
						Name: "bucketUrn",
					},
				},
			},
			"digitalocean_spaces_bucket_object": {Tok: makeResource(digitalOceanMod, "SpacesBucketObject")},
			"digitalocean_tag":                  {Tok: makeResource(digitalOceanMod, "Tag")},
			"digitalocean_volume": {
				Tok: makeResource(digitalOceanMod, "Volume"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"name": tfbridge.AutoNameTransform("name", 64, func(name string) string {
						return strings.ToLower(name)
					}),
					"region": {
						Type:     "string",
						AltTypes: []tokens.Type{makeType(digitalOceanMod, "Region")},
					},
					"initial_filesystem_type": {
						Type:     "string",
						AltTypes: []tokens.Type{makeType(digitalOceanMod, "FileSystemType")},
					},
					"urn": {
						Name: "volumeUrn",
					},
				},
			},
			"digitalocean_volume_attachment": {Tok: makeResource(digitalOceanMod, "VolumeAttachment")},
			"digitalocean_volume_snapshot":   {Tok: makeResource(digitalOceanMod, "VolumeSnapshot")},
			"digitalocean_vpc": {
				Tok: makeResource(digitalOceanMod, "Vpc"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"urn": {
						Name: "vpcUrn",
					},
				},
			},
			"digitalocean_container_registry": {Tok: makeResource(digitalOceanMod, "ContainerRegistry")},
			"digitalocean_container_registry_docker_credentials": {
				Tok: makeResource(digitalOceanMod, "ContainerRegistryDockerCredentials"),
			},
			"digitalocean_project_resources": {Tok: makeResource(digitalOceanMod, "ProjectResources")},
			"digitalocean_app": {
				Tok: makeResource(digitalOceanMod, "App"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"urn": {Name: "appUrn"},
					"spec": {
						Elem: &tfbridge.SchemaInfo{
							Fields: map[string]*tfbridge.SchemaInfo{
								"domain": {
									Name: "domainNames",
								},
							},
						},
					},
				},
			},
			"digitalocean_custom_image":         {Tok: makeResource(digitalOceanMod, "CustomImage")},
			"digitalocean_monitor_alert":        {Tok: makeResource(digitalOceanMod, "MonitorAlert")},
			"digitalocean_spaces_bucket_policy": {Tok: makeResource(digitalOceanMod, "SpacesBucketPolicy")},
			"digitalocean_reserved_ip": {
				Tok: makeResource(digitalOceanMod, "ReservedIp"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"urn": {Name: "reservedIpUrn"},
				},
			},
			"digitalocean_reserved_ip_assignment": {Tok: makeResource(digitalOceanMod, "ReservedIpAssignment")},

			"digitalocean_reserved_ipv6": {
				Docs: &info.Doc{AllowMissing: true},
				Fields: map[string]*tfbridge.SchemaInfo{
					"urn": {Name: "reservedIpv6Urn"},
				},
			},
			"digitalocean_reserved_ipv6_assignment": {Docs: &info.Doc{AllowMissing: true}},
		},
		ExtraTypes: map[string]schema.ComplexTypeSpec{
			"digitalocean:index:Region": {
				ObjectTypeSpec: schema.ObjectTypeSpec{
					Type: "string",
				},
				Enum: []schema.EnumValueSpec{
					{Name: "NYC1", Value: "nyc1"},
					{Name: "NYC2", Value: "nyc2"},
					{Name: "NYC3", Value: "nyc3"},
					{Name: "SGP1", Value: "sgp1"},
					{Name: "LON1", Value: "lon1"},
					{Name: "AMS2", Value: "ams2"},
					{Name: "AMS3", Value: "ams3"},
					{Name: "FRA1", Value: "fra1"},
					{Name: "TOR1", Value: "tor1"},
					{Name: "SFO1", Value: "sfo1"},
					{Name: "SFO2", Value: "sfo2"},
					{Name: "SFO3", Value: "sfo3"},
					{Name: "BLR1", Value: "blr1"},
					{Name: "SYD1", Value: "syd1"},
				},
			},
			"digitalocean:index:RecordType": {
				ObjectTypeSpec: schema.ObjectTypeSpec{
					Type: "string",
				},
				Enum: []schema.EnumValueSpec{
					{Name: "A", Value: "A"},
					{Name: "AAAA", Value: "AAAA"},
					{Name: "CAA", Value: "CAA"},
					{Name: "CNAME", Value: "CNAME"},
					{Name: "MX", Value: "MX"},
					{Name: "NS", Value: "NS"},
					{Name: "TXT", Value: "TXT"},
					{Name: "SRV", Value: "SRV"},
				},
			},
			"digitalocean:index:Protocol": {
				ObjectTypeSpec: schema.ObjectTypeSpec{
					Type: "string",
				},
				Enum: []schema.EnumValueSpec{
					{Name: "TCP", Value: "tcp"},
					{Name: "UDP", Value: "udp"},
					{Name: "ICMP", Value: "icmp"},
					{Name: "HTTP", Value: "http"},
					{Name: "HTTPS", Value: "https"},
				},
			},
			"digitalocean:index:Algorithm": {
				ObjectTypeSpec: schema.ObjectTypeSpec{
					Type: "string",
				},
				Enum: []schema.EnumValueSpec{
					{Name: "RoundRobin", Value: "round_robin"},
					{Name: "LeastConnections", Value: "least_connections"},
				},
			},
			"digitalocean:index:FileSystemType": {
				ObjectTypeSpec: schema.ObjectTypeSpec{
					Type: "string",
				},
				Enum: []schema.EnumValueSpec{
					{Name: "EXT4", Value: "ext4"},
					{Name: "XFS", Value: "xfs"},
				},
			},
			"digitalocean:index:CertificateType": {
				ObjectTypeSpec: schema.ObjectTypeSpec{
					Type: "string",
				},
				Enum: []schema.EnumValueSpec{
					{Name: "LetsEncrypt", Value: "lets_encrypt"},
					{Name: "Custom", Value: "custom"},
				},
			},
			"digitalocean:index:DatabaseSlug": {
				ObjectTypeSpec: schema.ObjectTypeSpec{
					Type: "string",
				},
				Enum: []schema.EnumValueSpec{
					{Name: "DB_1VPCU1GB", Value: "db-s-1vcpu-1gb"},
					{Name: "DB_1VPCU2GB", Value: "db-s-1vcpu-2gb"},
					{Name: "DB_2VPCU4GB", Value: "db-s-2vcpu-4gb"},
					{Name: "DB_4VPCU8GB", Value: "db-s-4vcpu-8gb"},
					{Name: "DB_6VPCU16GB", Value: "db-s-6vcpu-16gb"},
					{Name: "DB_8VPCU32GB", Value: "db-s-8vcpu-32gb"},
					{Name: "DB_16VPCU64GB", Value: "db-s-16vcpu-64gb"},
				},
			},
			"digitalocean:index:DropletSlug": {
				ObjectTypeSpec: schema.ObjectTypeSpec{
					Type: "string",
				},
				// Generated with `doctl compute size list --output json | jq -r '.[].slug'`.
				Enum: []schema.EnumValueSpec{
					{Name: "DropletS1VCPU512MB10GB", Value: "s-1vcpu-512mb-10gb"},
					{Name: "DropletS1VCPU1GB", Value: "s-1vcpu-1gb"},
					{Name: "DropletS1VCPU1GB-AMD", Value: "s-1vcpu-1gb-amd"},
					{Name: "DropletS1VCPU1GB-INTEL", Value: "s-1vcpu-1gb-intel"},
					{Name: "DropletS1VCPU1GB35GB-INTEL", Value: "s-1vcpu-1gb-35gb-intel"},
					{Name: "DropletS1VCPU2GB", Value: "s-1vcpu-2gb"},
					{Name: "DropletS1VCPU2GB-AMD", Value: "s-1vcpu-2gb-amd"},
					{Name: "DropletS1VCPU2GB-INTEL", Value: "s-1vcpu-2gb-intel"},
					{Name: "DropletS1VCPU2GB70GB-INTEL", Value: "s-1vcpu-2gb-70gb-intel"},
					{Name: "DropletS2VCPU2GB", Value: "s-2vcpu-2gb"},
					{Name: "DropletS2VCPU2GB-AMD", Value: "s-2vcpu-2gb-amd"},
					{Name: "DropletS2VCPU2GB-INTEL", Value: "s-2vcpu-2gb-intel"},
					{Name: "DropletS2VCPU2GB90GB-INTEL", Value: "s-2vcpu-2gb-90gb-intel"},
					{Name: "DropletS2VCPU4GB", Value: "s-2vcpu-4gb"},
					{Name: "DropletS2VCPU4GB-AMD", Value: "s-2vcpu-4gb-amd"},
					{Name: "DropletS2VCPU4GB-INTEL", Value: "s-2vcpu-4gb-intel"},
					{Name: "DropletS2VCPU4GB120GB-INTEL", Value: "s-2vcpu-4gb-120gb-intel"},
					{Name: "DropletS2VCPU8GB-AMD", Value: "s-2vcpu-8gb-amd"},
					{Name: "DropletC2", Value: "c-2"},
					{Name: "DropletC22VCPU4GB", Value: "c2-2vcpu-4gb"},
					{Name: "DropletS2VCPU8GB160GB-INTEL", Value: "s-2vcpu-8gb-160gb-intel"},
					{Name: "DropletS4VCPU8GB", Value: "s-4vcpu-8gb"},
					{Name: "DropletS4VCPU8GB-AMD", Value: "s-4vcpu-8gb-amd"},
					{Name: "DropletS4VCPU8GB-INTEL", Value: "s-4vcpu-8gb-intel"},
					{Name: "DropletG2VCPU8GB", Value: "g-2vcpu-8gb"},
					{Name: "DropletS4VCPU8GB240GB-INTEL", Value: "s-4vcpu-8gb-240gb-intel"},
					{Name: "DropletGD2VCPU8GB", Value: "gd-2vcpu-8gb"},
					{Name: "DropletG2VCPU8GB-INTEL", Value: "g-2vcpu-8gb-intel"},
					{Name: "DropletGD2VCPU8GB-INTEL", Value: "gd-2vcpu-8gb-intel"},
					{Name: "DropletS4VCPU16GB-AMD", Value: "s-4vcpu-16gb-amd"},
					{Name: "DropletM2VCPU16GB", Value: "m-2vcpu-16gb"},
					{Name: "DropletC4", Value: "c-4"},
					{Name: "DropletC24VCPU8GB", Value: "c2-4vcpu-8gb"},
					{Name: "DropletS4VCPU16GB320GB-INTEL", Value: "s-4vcpu-16gb-320gb-intel"},
					{Name: "DropletS8VCPU16GB", Value: "s-8vcpu-16gb"},
					{Name: "DropletM2VCPU16GB-INTEL", Value: "m-2vcpu-16gb-intel"},
					{Name: "DropletM32VCPU16GB", Value: "m3-2vcpu-16gb"},
					{Name: "DropletC4-INTEL", Value: "c-4-intel"},
					{Name: "DropletM32VCPU16GB-INTEL", Value: "m3-2vcpu-16gb-intel"},
					{Name: "DropletS8VCPU16GB-AMD", Value: "s-8vcpu-16gb-amd"},
					{Name: "DropletS8VCPU16GB-INTEL", Value: "s-8vcpu-16gb-intel"},
					{Name: "DropletC24VCPU8GB-INTEL", Value: "c2-4vcpu-8gb-intel"},
					{Name: "DropletG4VCPU16GB", Value: "g-4vcpu-16gb"},
					{Name: "DropletS8VCPU16GB480GB-INTEL", Value: "s-8vcpu-16gb-480gb-intel"},
					{Name: "DropletSO2VCPU16GB-INTEL", Value: "so-2vcpu-16gb-intel"},
					{Name: "DropletSO2VCPU16GB", Value: "so-2vcpu-16gb"},
					{Name: "DropletM62VCPU16GB", Value: "m6-2vcpu-16gb"},
					{Name: "DropletGD4VCPU16GB", Value: "gd-4vcpu-16gb"},
					{Name: "DropletSO1_52VCPU16GB-INTEL", Value: "so1_5-2vcpu-16gb-intel"},
					{Name: "DropletG4VCPU16GB-INTEL", Value: "g-4vcpu-16gb-intel"},
					{Name: "DropletGD4VCPU16GB-INTEL", Value: "gd-4vcpu-16gb-intel"},
					{Name: "DropletSO1_52VCPU16GB", Value: "so1_5-2vcpu-16gb"},
					{Name: "DropletS8VCPU32GB-AMD", Value: "s-8vcpu-32gb-amd"},
					{Name: "DropletM4VCPU32GB", Value: "m-4vcpu-32gb"},
					{Name: "DropletC8", Value: "c-8"},
					{Name: "DropletC28VCPU16GB", Value: "c2-8vcpu-16gb"},
					{Name: "DropletS8VCPU32GB640GB-INTEL", Value: "s-8vcpu-32gb-640gb-intel"},
					{Name: "DropletM4VCPU32GB-INTEL", Value: "m-4vcpu-32gb-intel"},
					{Name: "DropletM34VCPU32GB", Value: "m3-4vcpu-32gb"},
					{Name: "DropletC8-INTEL", Value: "c-8-intel"},
					{Name: "DropletM34VCPU32GB-INTEL", Value: "m3-4vcpu-32gb-intel"},
					{Name: "DropletC28VCPU16GB-INTEL", Value: "c2-8vcpu-16gb-intel"},
					{Name: "DropletG8VCPU32GB", Value: "g-8vcpu-32gb"},
					{Name: "DropletSO4VCPU32GB-INTEL", Value: "so-4vcpu-32gb-intel"},
					{Name: "DropletSO4VCPU32GB", Value: "so-4vcpu-32gb"},
					{Name: "DropletM64VCPU32GB", Value: "m6-4vcpu-32gb"},
					{Name: "DropletGD8VCPU32GB", Value: "gd-8vcpu-32gb"},
					{Name: "DropletSO1_54VCPU32GB-INTEL", Value: "so1_5-4vcpu-32gb-intel"},
					{Name: "DropletG8VCPU32GB-INTEL", Value: "g-8vcpu-32gb-intel"},
					{Name: "DropletGD8VCPU32GB-INTEL", Value: "gd-8vcpu-32gb-intel"},
					{Name: "DropletSO1_54VCPU32GB", Value: "so1_5-4vcpu-32gb"},
					{Name: "DropletM8VCPU64GB", Value: "m-8vcpu-64gb"},
					{Name: "DropletC16", Value: "c-16"},
					{Name: "DropletC216VCPU32GB", Value: "c2-16vcpu-32gb"},
					{Name: "DropletM8VCPU64GB-INTEL", Value: "m-8vcpu-64gb-intel"},
					{Name: "DropletM38VCPU64GB", Value: "m3-8vcpu-64gb"},
					{Name: "DropletC16-INTEL", Value: "c-16-intel"},
					{Name: "DropletM38VCPU64GB-INTEL", Value: "m3-8vcpu-64gb-intel"},
					{Name: "DropletC216VCPU32GB-INTEL", Value: "c2-16vcpu-32gb-intel"},
					{Name: "DropletG16VCPU64GB", Value: "g-16vcpu-64gb"},
					{Name: "DropletSO8VCPU64GB-INTEL", Value: "so-8vcpu-64gb-intel"},
					{Name: "DropletSO8VCPU64GB", Value: "so-8vcpu-64gb"},
					{Name: "DropletM68VCPU64GB", Value: "m6-8vcpu-64gb"},
					{Name: "DropletGD16VCPU64GB", Value: "gd-16vcpu-64gb"},
					{Name: "DropletSO1_58VCPU64GB-INTEL", Value: "so1_5-8vcpu-64gb-intel"},
					{Name: "DropletG16VCPU64GB-INTEL", Value: "g-16vcpu-64gb-intel"},
					{Name: "DropletGD16VCPU64GB-INTEL", Value: "gd-16vcpu-64gb-intel"},
					{Name: "DropletSO1_58VCPU64GB", Value: "so1_5-8vcpu-64gb"},
					{Name: "DropletM16VCPU128GB", Value: "m-16vcpu-128gb"},
					{Name: "DropletC32", Value: "c-32"},
					{Name: "DropletC232VCPU64GB", Value: "c2-32vcpu-64gb"},
					{Name: "DropletM16VCPU128GB-INTEL", Value: "m-16vcpu-128gb-intel"},
					{Name: "DropletM316VCPU128GB", Value: "m3-16vcpu-128gb"},
					{Name: "DropletC32-INTEL", Value: "c-32-intel"},
					{Name: "DropletM316VCPU128GB-INTEL", Value: "m3-16vcpu-128gb-intel"},
					{Name: "DropletC232VCPU64GB-INTEL", Value: "c2-32vcpu-64gb-intel"},
					{Name: "DropletC48", Value: "c-48"},
					{Name: "DropletM24VCPU192GB", Value: "m-24vcpu-192gb"},
					{Name: "DropletG32VCPU128GB", Value: "g-32vcpu-128gb"},
					{Name: "DropletSO16VCPU128GB-INTEL", Value: "so-16vcpu-128gb-intel"},
					{Name: "DropletSO16VCPU128GB", Value: "so-16vcpu-128gb"},
					{Name: "DropletM616VCPU128GB", Value: "m6-16vcpu-128gb"},
					{Name: "DropletGD32VCPU128GB", Value: "gd-32vcpu-128gb"},
					{Name: "DropletSO1_516VCPU128GB-INTEL", Value: "so1_5-16vcpu-128gb-intel"},
					{Name: "DropletC248VCPU96GB", Value: "c2-48vcpu-96gb"},
					{Name: "DropletM24VCPU192GB-INTEL", Value: "m-24vcpu-192gb-intel"},
					{Name: "DropletG32VCPU128GB-INTEL", Value: "g-32vcpu-128gb-intel"},
					{Name: "DropletM324VCPU192GB", Value: "m3-24vcpu-192gb"},
					{Name: "DropletG40VCPU160GB", Value: "g-40vcpu-160gb"},
					{Name: "DropletGD32VCPU128GB-INTEL", Value: "gd-32vcpu-128gb-intel"},
					{Name: "DropletSO1_516VCPU128GB", Value: "so1_5-16vcpu-128gb"},
					{Name: "DropletC48-INTEL", Value: "c-48-intel"},
					{Name: "DropletM324VCPU192GB-INTEL", Value: "m3-24vcpu-192gb-intel"},
					{Name: "DropletM32VCPU256GB", Value: "m-32vcpu-256gb"},
					{Name: "DropletGD40VCPU160GB", Value: "gd-40vcpu-160gb"},
					{Name: "DropletC248VCPU96GB-INTEL", Value: "c2-48vcpu-96gb-intel"},
					{Name: "DropletSO24VCPU192GB-INTEL", Value: "so-24vcpu-192gb-intel"},
					{Name: "DropletSO24VCPU192GB", Value: "so-24vcpu-192gb"},
					{Name: "DropletM624VCPU192GB", Value: "m6-24vcpu-192gb"},
					{Name: "DropletM32VCPU256GB-INTEL", Value: "m-32vcpu-256gb-intel"},
					{Name: "DropletC60-INTEL", Value: "c-60-intel"},
					{Name: "DropletM332VCPU256GB", Value: "m3-32vcpu-256gb"},
					{Name: "DropletSO1_524VCPU192GB-INTEL", Value: "so1_5-24vcpu-192gb-intel"},
					{Name: "DropletM332VCPU256GB-INTEL", Value: "m3-32vcpu-256gb-intel"},
					{Name: "DropletG48VCPU192GB-INTEL", Value: "g-48vcpu-192gb-intel"},
					{Name: "DropletC260VCPU120GB-INTEL", Value: "c2-60vcpu-120gb-intel"},
					{Name: "DropletGD48VCPU192GB-INTEL", Value: "gd-48vcpu-192gb-intel"},
					{Name: "DropletSO1_524VCPU192GB", Value: "so1_5-24vcpu-192gb"},
					{Name: "DropletSO32VCPU256GB-INTEL", Value: "so-32vcpu-256gb-intel"},
					{Name: "DropletSO32VCPU256GB", Value: "so-32vcpu-256gb"},
					{Name: "DropletM632VCPU256GB", Value: "m6-32vcpu-256gb"},
					{Name: "DropletSO1_532VCPU256GB-INTEL", Value: "so1_5-32vcpu-256gb-intel"},
					{Name: "DropletG60VCPU240GB-INTEL", Value: "g-60vcpu-240gb-intel"},
					{Name: "DropletM48VCPU384GB-INTEL", Value: "m-48vcpu-384gb-intel"},
					{Name: "DropletGD60VCPU240GB-INTEL", Value: "gd-60vcpu-240gb-intel"},
					{Name: "DropletGPUH100X180GB", Value: "gpu-h100x1-80gb"},
					{Name: "DropletSO1_532VCPU256GB", Value: "so1_5-32vcpu-256gb"},
					{Name: "DropletM348VCPU384GB-INTEL", Value: "m3-48vcpu-384gb-intel"},
					{Name: "DropletSO48VCPU384GB-INTEL", Value: "so-48vcpu-384gb-intel"},
					{Name: "DropletGPUH100X180GB200", Value: "gpu-h100x1-80gb-200"},
					{Name: "DropletGPUH100X8640GB", Value: "gpu-h100x8-640gb"},
					{Name: "DropletGPUH100X8640GB200", Value: "gpu-h100x8-640gb-200"},

					// No longer supported
					{Name: "Droplet16GB", Value: "16gb"},
					{Name: "Droplet1GB", Value: "1gb"},
					{Name: "Droplet2GB", Value: "2gb"},
					{Name: "Droplet32GB", Value: "32gb"},
					{Name: "Droplet48GB", Value: "48gb"},
					{Name: "Droplet4GB", Value: "4gb"},
					{Name: "Droplet512mb", Value: "512mb"},
					{Name: "Droplet64GB", Value: "64gb"},
					{Name: "Droplet8GB", Value: "8gb"},
					{Name: "DropletC22VCPU8GB", Value: "c2-4vcpu-8gb"},
					{Name: "DropletS12VCPU48GB", Value: "s-12vcpu-48gb"},
					{Name: "DropletS16VCPU64GB", Value: "s-16vcpu-64gb"},
					{Name: "DropletS1VCPU3GB", Value: "s-1vcpu-3gb"},
					{Name: "DropletS20VCPU96GB", Value: "s-20vcpu-96gb"},
					{Name: "DropletS24VCPU128GB", Value: "s-24vcpu-128gb"},
					{Name: "DropletS32VCPU192GB", Value: "s-32vcpu-192gb"},
					{Name: "DropletS3VCPU1GB", Value: "s-3vcpu-1gb"},
					{Name: "DropletS6VCPU16GB", Value: "s-6vcpu-16gb"},
					{Name: "DropletS8VCPU32GB", Value: "s-8vcpu-32gb"},
					{Name: "DropletSO1516VCPU128GB", Value: "so1_5-16vcpu-128gb"},
					{Name: "DropletSO1524VCPU192GB", Value: "so1_5-24vcpu-192gb"},
					{Name: "DropletSO152VCPU16GB", Value: "so1_5-2vcpu-16gb"},
					{Name: "DropletSO1532VCPU256GB", Value: "so1_5-32vcpu-256gb"},
					{Name: "DropletSO154VCPU32GB", Value: "so1_5-4vcpu-32gb"},
					{Name: "DropletSO158VCPU64GB", Value: "so1_5-8vcpu-64gb"},
				},
			},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"digitalocean_certificate":      {Tok: makeDataSource(digitalOceanMod, "getCertificate")},
			"digitalocean_database_cluster": {Tok: makeDataSource(digitalOceanMod, "getDatabaseCluster")},
			"digitalocean_database_replica": {Tok: makeDataSource(digitalOceanMod, "getDatabaseReplica")},
			"digitalocean_domain": {
				Tok: makeDataSource(digitalOceanMod, "getDomain"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"urn": {Name: "domainUrn"},
				},
			},
			"digitalocean_droplet":          {Tok: makeDataSource(digitalOceanMod, "getDroplet")},
			"digitalocean_droplet_snapshot": {Tok: makeDataSource(digitalOceanMod, "getDropletSnapshot")},
			"digitalocean_floating_ip": {
				Tok: makeDataSource(digitalOceanMod, "getFloatingIp"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"urn": {Name: "floatingIpUrn"},
				},
			},
			"digitalocean_image":               {Tok: makeDataSource(digitalOceanMod, "getImage")},
			"digitalocean_kubernetes_cluster":  {Tok: makeDataSource(digitalOceanMod, "getKubernetesCluster")},
			"digitalocean_kubernetes_versions": {Tok: makeDataSource(digitalOceanMod, "getKubernetesVersions")},
			"digitalocean_loadbalancer": {
				Tok: makeDataSource(digitalOceanMod, "getLoadBalancer"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"urn": {Name: "loadBalancerUrn"},
				},
			},
			"digitalocean_record":                {Tok: makeDataSource(digitalOceanMod, "getRecord")},
			"digitalocean_ssh_key":               {Tok: makeDataSource(digitalOceanMod, "getSshKey")},
			"digitalocean_tag":                   {Tok: makeDataSource(digitalOceanMod, "getTag")},
			"digitalocean_volume":                {Tok: makeDataSource(digitalOceanMod, "getVolume")},
			"digitalocean_volume_snapshot":       {Tok: makeDataSource(digitalOceanMod, "getVolumeSnapshot")},
			"digitalocean_sizes":                 {Tok: makeDataSource(digitalOceanMod, "getSizes")},
			"digitalocean_account":               {Tok: makeDataSource(digitalOceanMod, "getAccount")},
			"digitalocean_images":                {Tok: makeDataSource(digitalOceanMod, "getImages")},
			"digitalocean_project":               {Tok: makeDataSource(digitalOceanMod, "getProject")},
			"digitalocean_projects":              {Tok: makeDataSource(digitalOceanMod, "getProjects")},
			"digitalocean_region":                {Tok: makeDataSource(digitalOceanMod, "getRegion")},
			"digitalocean_regions":               {Tok: makeDataSource(digitalOceanMod, "getRegions")},
			"digitalocean_vpc":                   {Tok: makeDataSource(digitalOceanMod, "getVpc")},
			"digitalocean_spaces_bucket":         {Tok: makeDataSource(digitalOceanMod, "getSpacesBucket")},
			"digitalocean_spaces_buckets":        {Tok: makeDataSource(digitalOceanMod, "getSpacesBuckets")},
			"digitalocean_spaces_bucket_object":  {Tok: makeDataSource(digitalOceanMod, "getSpacesBucketObject")},
			"digitalocean_spaces_bucket_objects": {Tok: makeDataSource(digitalOceanMod, "getSpacesBucketObjects")},
			"digitalocean_droplets":              {Tok: makeDataSource(digitalOceanMod, "getDroplets")},
			"digitalocean_container_registry":    {Tok: makeDataSource(digitalOceanMod, "getContainerRegistry")},
			"digitalocean_tags":                  {Tok: makeDataSource(digitalOceanMod, "getTags")},
			"digitalocean_app":                   {Tok: makeDataSource(digitalOceanMod, "getApp")},
			"digitalocean_domains":               {Tok: makeDataSource(digitalOceanMod, "getDomains")},
			"digitalocean_records":               {Tok: makeDataSource(digitalOceanMod, "getRecords")},
			"digitalocean_ssh_keys":              {Tok: makeDataSource(digitalOceanMod, "getSshKeys")},
			"digitalocean_firewall":              {Tok: makeDataSource(digitalOceanMod, "getFirewall")},
			"digitalocean_database_ca":           {Tok: makeDataSource(digitalOceanMod, "getDatabaseCa")},
			"digitalocean_reserved_ip":           {Tok: makeDataSource(digitalOceanMod, "getReservedIp")},
			"digitalocean_reserved_ipv6":         {Docs: &info.Doc{AllowMissing: true}},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
			},
			RespectSchemaVersion: true,
		},
		Python: (func() *tfbridge.PythonInfo {
			i := &tfbridge.PythonInfo{
				RespectSchemaVersion: true,
			}
			i.PyProject.Enabled = true
			return i
		})(),

		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", digitalOceanPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				digitalOceanPkg,
			),
			GenerateResourceContainerTypes: true,
			RespectSchemaVersion:           true,
		},
		CSharp: &tfbridge.CSharpInfo{
			RespectSchemaVersion: true,
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
			Namespaces: map[string]string{
				"digitalocean": "DigitalOcean",
			},
		},
		MetadataInfo:                   tfbridge.NewProviderMetadata(metadata),
		Version:                        version.Version,
		EnableZeroDefaultSchemaVersion: true,
		DocRules: &info.DocRule{
			EditRules: func(defaults []info.DocsEdit) []info.DocsEdit {
				return append(defaults, info.DocsEdit{
					Path: "database_cluster.md",
					Edit: func(_ string, content []byte) ([]byte, error) {
						return bytes.ReplaceAll(content, []byte("PostreSQL"), []byte("PostgreSQL")), nil
					},
				})
			},
		},
	}

	defaults := tfbridgetokens.SingleModule("digitalocean_", digitalOceanMod, tfbridgetokens.MakeStandard(digitalOceanPkg))
	prov.MustComputeTokens(defaults)
	prov.MustApplyAutoAliases()
	prov.SetAutonaming(255, "-")

	return prov
}

//go:embed cmd/pulumi-resource-digitalocean/bridge-metadata.json
var metadata []byte
