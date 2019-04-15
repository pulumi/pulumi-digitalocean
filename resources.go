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

	"github.com/hashicorp/terraform/helper/schema"
	"github.com/pulumi/pulumi-terraform/pkg/tfbridge"
	"github.com/pulumi/pulumi/pkg/tokens"
	"github.com/terraform-providers/terraform-provider-digitalocean/digitalocean"
)

// all of the DigitalOcean token components used below.
const (
	// packages:
	digitalOceanPkg = "digitalocean"
	// modules:
	digitalOceanMod = "index" // the root index.
)

// digitalOceanMember manufactures a type token for the Digital Ocean package and the given module and type.
func digitalOceanMember(mod string, mem string) tokens.ModuleMember {
	return tokens.ModuleMember(digitalOceanPkg + ":" + mod + ":" + mem)
}

// digitalOceanType manufactures a type token for the Digital Ocean package and the given module and type.
func digitalOceanType(mod string, typ string) tokens.Type {
	return tokens.Type(digitalOceanMember(mod, typ))
}

// digitalOceanDataSource manufactures a standard resource token given a module and resource name.
// It automatically uses the Digital Ocean package and names the file by simply lower casing the data
// source's first character.
func digitalOceanDataSource(mod string, res string) tokens.ModuleMember {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return digitalOceanMember(mod+"/"+fn, res)
}

// digitalOceanResource manufactures a standard resource token given a module and resource name.
// It automatically uses the DigitalOcean package and names the file by simply lower casing the resource's
// first character.
func digitalOceanResource(mod string, res string) tokens.Type {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return digitalOceanType(mod+"/"+fn, res)
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
			"digitalocean_certificate":            {Tok: digitalOceanResource(digitalOceanMod, "Certificate")},
			"digitalocean_database_cluster":       {Tok: digitalOceanResource(digitalOceanMod, "DatabaseCluster")},
			"digitalocean_domain":                 {Tok: digitalOceanResource(digitalOceanMod, "Domain")},
			"digitalocean_droplet":                {Tok: digitalOceanResource(digitalOceanMod, "Droplet")},
			"digitalocean_droplet_snapshot":       {Tok: digitalOceanResource(digitalOceanMod, "DropletSnapshot")},
			"digitalocean_firewall":               {Tok: digitalOceanResource(digitalOceanMod, "Firewall")},
			"digitalocean_floating_ip":            {Tok: digitalOceanResource(digitalOceanMod, "FloatingIp")},
			"digitalocean_floating_ip_assignment": {Tok: digitalOceanResource(digitalOceanMod, "FloatingIpAssignment")},
			"digitalocean_kubernetes_cluster":     {Tok: digitalOceanResource(digitalOceanMod, "KubernetesCluster")},
			"digitalocean_kubernetes_node_pool":   {Tok: digitalOceanResource(digitalOceanMod, "KubernetesNodePool")},
			"digitalocean_loadbalancer": {
				Tok: digitalOceanResource(digitalOceanMod, "LoadBalancer"),
			},
			"digitalocean_record":            {Tok: digitalOceanResource(digitalOceanMod, "DnsRecord")},
			"digitalocean_ssh_key":           {Tok: digitalOceanResource(digitalOceanMod, "SshKey")},
			"digitalocean_spaces_bucket":     {Tok: digitalOceanResource(digitalOceanMod, "SpacesBucket")},
			"digitalocean_tag":               {Tok: digitalOceanResource(digitalOceanMod, "Tag")},
			"digitalocean_volume":            {Tok: digitalOceanResource(digitalOceanMod, "Volume")},
			"digitalocean_volume_attachment": {Tok: digitalOceanResource(digitalOceanMod, "VolumeAttachment")},
			"digitalocean_volume_snapshot":   {Tok: digitalOceanResource(digitalOceanMod, "VolumeSnapshot")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"digitalocean_certificate":        {Tok: digitalOceanDataSource(digitalOceanMod, "getCertificate")},
			"digitalocean_domain":             {Tok: digitalOceanDataSource(digitalOceanMod, "getDomain")},
			"digitalocean_droplet":            {Tok: digitalOceanDataSource(digitalOceanMod, "getDroplet")},
			"digitalocean_droplet_snapshot":   {Tok: digitalOceanDataSource(digitalOceanMod, "getDropletSnapshot")},
			"digitalocean_floating_ip":        {Tok: digitalOceanDataSource(digitalOceanMod, "getFloatingIp")},
			"digitalocean_image":              {Tok: digitalOceanDataSource(digitalOceanMod, "getImage")},
			"digitalocean_kubernetes_cluster": {Tok: digitalOceanDataSource(digitalOceanMod, "getKubernetesCluster")},
			"digitalocean_loadbalancer":       {Tok: digitalOceanDataSource(digitalOceanMod, "getLoadBalancer")},
			"digitalocean_record":             {Tok: digitalOceanDataSource(digitalOceanMod, "getRecord")},
			"digitalocean_ssh_key":            {Tok: digitalOceanDataSource(digitalOceanMod, "getSshKey")},
			"digitalocean_tag":                {Tok: digitalOceanDataSource(digitalOceanMod, "getTag")},
			"digitalocean_volume":             {Tok: digitalOceanDataSource(digitalOceanMod, "getVolume")},
			"digitalocean_volume_snapshot":    {Tok: digitalOceanDataSource(digitalOceanMod, "getVolumeSnapshot")},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			Dependencies: map[string]string{
				"@pulumi/pulumi":    "^0.17.1",
				"builtin-modules":   "3.0.0",
				"read-package-tree": "^5.2.1",
				"resolve":           "^1.7.1",
			},
			DevDependencies: map[string]string{
				"@types/node": "^8.0.25", // so we can access strongly typed node definitions.
			},
			Overlay: &tfbridge.OverlayInfo{
				Files:   []string{},
				Modules: map[string]*tfbridge.OverlayInfo{},
			},
		},
		Python: &tfbridge.PythonInfo{
			Requires: map[string]string{
				"pulumi": ">=0.17.1,<0.18.0",
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
