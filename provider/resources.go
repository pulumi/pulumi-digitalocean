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
	"fmt"
	"path/filepath"
	"unicode"

	"github.com/digitalocean/terraform-provider-digitalocean/digitalocean"
	"github.com/pulumi/pulumi-digitalocean/provider/v4/pkg/version"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
)

// all of the DigitalOcean token components used below.
const (
	// packages:
	digitalOceanPkg = "digitalocean"
	// modules:
	digitalOceanMod = "index" // the root index.
)

// makeMember manufactures a type token for the Digital Ocean package and the given module and type.
func makeMember(mod string, mem string) tokens.ModuleMember {
	return tokens.ModuleMember(digitalOceanPkg + ":" + mod + ":" + mem)
}

// makeType manufactures a type token for the Digital Ocean package and the given module and type.
func makeType(mod string, typ string) tokens.Type {
	return tokens.Type(makeMember(mod, typ))
}

// makeDataSource manufactures a standard resource token given a module and resource name.
// It automatically uses the Digital Ocean package and names the file by simply lower casing the data
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

// Provider returns additional overlaid schema and metadata associated with the Digital Ocean package.
func Provider() tfbridge.ProviderInfo {
	p := shimv2.NewProvider(digitalocean.Provider())
	prov := tfbridge.ProviderInfo{
		P:           p,
		Name:        "digitalocean",
		Description: "A Pulumi package for creating and managing Digital Ocean cloud resources.",
		Keywords:    []string{"pulumi", "digitalocean"},
		License:     "Apache-2.0",
		Homepage:    "https://pulumi.io",
		Repository:  "https://github.com/pulumi/pulumi-digitalocean",
		GitHubOrg:   "digitalocean",
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
						Type: makeType(digitalOceanMod, "CertificateType"),
					},
				},
			},
			"digitalocean_database_cluster": {
				Tok: makeResource(digitalOceanMod, "DatabaseCluster"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"region": {
						Type: makeType(digitalOceanMod, "Region"),
					},
					"size": {
						Type: makeType(digitalOceanMod, "DatabaseSlug"),
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
						Type: makeType(digitalOceanMod, "Region"),
					},
					"size": {
						Type: makeType(digitalOceanMod, "DatabaseSlug"),
					},
				},
			},
			"digitalocean_database_user":     {Tok: makeType(digitalOceanMod, "DatabaseUser")},
			"digitalocean_database_db":       {Tok: makeType(digitalOceanMod, "DatabaseDb")},
			"digitalocean_database_firewall": {Tok: makeType(digitalOceanMod, "DatabaseFirewall")},
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
						Type: makeType(digitalOceanMod, "Region"),
					},
					"size": {
						Type: makeType(digitalOceanMod, "DropletSlug"),
					},
					"urn": {
						Name: "dropletUrn",
					},
				},
			},
			"digitalocean_droplet_snapshot": {
				Tok: makeResource(digitalOceanMod, "DropletSnapshot"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"regions": {
						Elem: &tfbridge.SchemaInfo{Type: makeType(digitalOceanMod, "Region")},
					},
				},
			},
			"digitalocean_firewall": {Tok: makeResource(digitalOceanMod, "Firewall")},
			"digitalocean_floating_ip": {
				Tok: makeResource(digitalOceanMod, "FloatingIp"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"urn": {
						Name: "floatingIpUrn",
					},
				},
			},
			"digitalocean_floating_ip_assignment": {Tok: makeResource(digitalOceanMod, "FloatingIpAssignment")},
			"digitalocean_kubernetes_cluster": {
				Tok: makeResource(digitalOceanMod, "KubernetesCluster"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"region": {
						Type: makeType(digitalOceanMod, "Region"),
					},
				},
			},
			"digitalocean_kubernetes_node_pool": {
				Tok: makeResource(digitalOceanMod, "KubernetesNodePool"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"size": {
						Type: makeType(digitalOceanMod, "DropletSlug"),
					},
				},
			},
			"digitalocean_loadbalancer": {
				Tok: makeResource(digitalOceanMod, "LoadBalancer"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"region": {
						Type: makeType(digitalOceanMod, "Region"),
					},
					"algorithm": {
						Type: makeType(digitalOceanMod, "Algorithm"),
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
						Type: makeType(digitalOceanMod, "RecordType"),
					},
				},
			},
			"digitalocean_ssh_key": {Tok: makeResource(digitalOceanMod, "SshKey")},
			"digitalocean_spaces_bucket": {
				Tok: makeResource(digitalOceanMod, "SpacesBucket"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"region": {
						Type: makeType(digitalOceanMod, "Region"),
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
					"region": {
						Type: makeType(digitalOceanMod, "Region"),
					},
					"initial_filesystem_type": {
						Type: makeType(digitalOceanMod, "FilesystemType"),
					},
					"urn": {
						Name: "volumeUrn",
					},
				},
			},
			"digitalocean_volume_attachment": {Tok: makeResource(digitalOceanMod, "VolumeAttachment")},
			"digitalocean_volume_snapshot": {
				Tok: makeResource(digitalOceanMod, "VolumeSnapshot"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"regions": {
						Elem: &tfbridge.SchemaInfo{Type: makeType(digitalOceanMod, "Region")},
					},
				},
			},
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
			"digitalocean_custom_image": {Tok: makeResource(digitalOceanMod, "CustomImage")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"digitalocean_certificate":      {Tok: makeDataSource(digitalOceanMod, "getCertificate")},
			"digitalocean_database_cluster": {Tok: makeDataSource(digitalOceanMod, "getDatabaseCluster")},
			"digitalocean_database_replica": {Tok: makeDataSource(digitalOceanMod, "getDatabaseReplica")},
			"digitalocean_domain": {
				Tok: makeDataSource(digitalOceanMod, "getDomain"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"urn": {
						Name: "domainUrn",
					},
				},
			},
			"digitalocean_droplet":          {Tok: makeDataSource(digitalOceanMod, "getDroplet")},
			"digitalocean_droplet_snapshot": {Tok: makeDataSource(digitalOceanMod, "getDropletSnapshot")},
			"digitalocean_floating_ip": {
				Tok: makeDataSource(digitalOceanMod, "getFloatingIp"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"urn": {
						Name: "floatingIpUrn",
					},
				},
			},
			"digitalocean_image":               {Tok: makeDataSource(digitalOceanMod, "getImage")},
			"digitalocean_kubernetes_cluster":  {Tok: makeDataSource(digitalOceanMod, "getKubernetesCluster")},
			"digitalocean_kubernetes_versions": {Tok: makeDataSource(digitalOceanMod, "getKubernetesVersions")},
			"digitalocean_loadbalancer": {
				Tok: makeDataSource(digitalOceanMod, "getLoadBalancer"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"urn": {
						Name: "loadBalancerUrn",
					},
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
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			Dependencies: map[string]string{
				"@pulumi/pulumi":    "^3.0.0-alpha.0",
				"builtin-modules":   "3.0.0",
				"read-package-tree": "^5.2.1",
				"resolve":           "^1.7.1",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
			},
			Overlay: &tfbridge.OverlayInfo{
				DestFiles: []string{
					"certificateType.ts",
					"databaseSlug.ts",
					"dropletSlug.ts",
					"filesystemType.ts",
					"loadbalancerAlgorithm.ts",
					"protocol.ts",
					"recordType.ts",
					"region.ts",
				},
				Modules: map[string]*tfbridge.OverlayInfo{},
			},
		},
		Python: &tfbridge.PythonInfo{
			Requires: map[string]string{
				"pulumi": ">=3.0.0a1,<4.0.0",
			},
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", digitalOceanPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				digitalOceanPkg,
			),
			GenerateResourceContainerTypes: true,
		},
		CSharp: &tfbridge.CSharpInfo{
			PackageReferences: map[string]string{
				"Pulumi":                       "3.*-*",
				"System.Collections.Immutable": "1.6.0",
			},
			Namespaces: map[string]string{
				"digitalocean": "DigitalOcean",
			},
		},
	}

	prov.SetAutonaming(255, "-")

	return prov
}
