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
	"unicode"

	"github.com/hashicorp/terraform-plugin-sdk/helper/schema"
	"github.com/pulumi/pulumi-terraform-bridge/v2/pkg/tfbridge"
	"github.com/pulumi/pulumi/sdk/v2/go/common/tokens"
	"github.com/terraform-providers/terraform-provider-digitalocean/digitalocean"
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
	p := digitalocean.Provider().(*schema.Provider)
	prov := tfbridge.ProviderInfo{
		P:           p,
		Name:        "digitalocean",
		Description: "A Pulumi package for creating and managing Digital Ocean cloud resources.",
		Keywords:    []string{"pulumi", "digital ocean"},
		License:     "Apache-2.0",
		Homepage:    "https://pulumi.io",
		Repository:  "https://github.com/pulumi/pulumi-digitalocean",
		Config: map[string]*tfbridge.SchemaInfo{
			"token": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"DIGITALOCEAN_TOKEN"},
				},
			},
			"api_endpoint": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"DIGITALOCEAN_API_URL"},
					Value:   "https://api.digitalocean.com",
				},
			},
			"spaces_access_id": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"SPACES_ACCESS_KEY_ID"},
				},
			},
			"spaces_secret_key": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"SPACES_SECRET_ACCESS_KEY"},
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
					"name": {Name: "name"},
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
			"digitalocean_firewall":               {Tok: makeResource(digitalOceanMod, "Firewall")},
			"digitalocean_floating_ip":            {Tok: makeResource(digitalOceanMod, "FloatingIp")},
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
			"digitalocean_vpc": {Tok: makeResource(digitalOceanMod, "Vpc")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"digitalocean_certificate":           {Tok: makeDataSource(digitalOceanMod, "getCertificate")},
			"digitalocean_database_cluster":      {Tok: makeDataSource(digitalOceanMod, "getDatabaseCluster")},
			"digitalocean_domain":                {Tok: makeDataSource(digitalOceanMod, "getDomain")},
			"digitalocean_droplet":               {Tok: makeDataSource(digitalOceanMod, "getDroplet")},
			"digitalocean_droplet_snapshot":      {Tok: makeDataSource(digitalOceanMod, "getDropletSnapshot")},
			"digitalocean_floating_ip":           {Tok: makeDataSource(digitalOceanMod, "getFloatingIp")},
			"digitalocean_image":                 {Tok: makeDataSource(digitalOceanMod, "getImage")},
			"digitalocean_kubernetes_cluster":    {Tok: makeDataSource(digitalOceanMod, "getKubernetesCluster")},
			"digitalocean_kubernetes_versions":   {Tok: makeDataSource(digitalOceanMod, "getKubernetesVersions")},
			"digitalocean_loadbalancer":          {Tok: makeDataSource(digitalOceanMod, "getLoadBalancer")},
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
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			Dependencies: map[string]string{
				"@pulumi/pulumi":    "^2.0.0",
				"builtin-modules":   "3.0.0",
				"read-package-tree": "^5.2.1",
				"resolve":           "^1.7.1",
			},
			DevDependencies: map[string]string{
				"@types/node": "^8.0.25", // so we can access strongly typed node definitions.
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
				"pulumi": ">=2.0.0,<3.0.0",
			},
		},
		CSharp: &tfbridge.CSharpInfo{
			PackageReferences: map[string]string{
				"Pulumi":                       "2.*",
				"System.Collections.Immutable": "1.6.0",
			},
			Namespaces: map[string]string{
				"digitalocean": "DigitalOcean",
			},
		},
	}

	// For all resources with name properties, we will add an auto-name property.  Make sure to skip those that
	// already have a name mapping entry, since those may have custom overrides set above (e.g., for length).
	const nameField = "name"
	for resname, res := range prov.Resources {
		if schema := p.ResourcesMap[resname]; schema != nil {
			// Only apply auto-name to input properties (Optional || Required) named `name`
			if tfs, has := schema.Schema[nameField]; has && (tfs.Optional || tfs.Required) {
				if _, hasfield := res.Fields[nameField]; !hasfield {
					if res.Fields == nil {
						res.Fields = make(map[string]*tfbridge.SchemaInfo)
					}
					res.Fields[nameField] = tfbridge.AutoName(nameField, 255)
				}
			}
		}
	}

	return prov
}
