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
//go:build nodejs || all
// +build nodejs all

package examples

import (
	"path"
	"testing"

	"github.com/pulumi/pulumi/pkg/v3/testing/integration"
)

func getJSBaseOptions(t *testing.T) integration.ProgramTestOptions {
	base := getBaseOptions(t)
	baseJS := base.With(integration.ProgramTestOptions{
		Dependencies: []string{
			"@pulumi/digitalocean",
		},
	})

	return baseJS
}

func TestAccDatabaseCluster(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: path.Join(getCwd(t), "databaseCluster"),
		})

	integration.ProgramTest(t, &test)
}

func TestAccDomain(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: path.Join(getCwd(t), "domain"),
		})

	integration.ProgramTest(t, &test)
}

func TestAccDroplet(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: path.Join(getCwd(t), "droplet"),
		})

	integration.ProgramTest(t, &test)
}

func TestAccFloatingIp(t *testing.T) {
	t.Skip("Flaky test")
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: path.Join(getCwd(t), "floatingip"),
		})

	integration.ProgramTest(t, &test)
}

func TestAccLoadbalancer(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: path.Join(getCwd(t), "loadbalancer"),
		})

	integration.ProgramTest(t, &test)
}
