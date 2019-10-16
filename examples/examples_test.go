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

package examples

import (
	"os"
	"path"
	"testing"

	"github.com/pulumi/pulumi/pkg/testing/integration"
)

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

func checkDigitalOceanTokenSet(t *testing.T) {
	token := os.Getenv("DIGITALOCEAN_TOKEN")
	if token == "" {
		t.Skipf("Skipping test due to missing DIGITALOCEAN_TOKEN environment variable")
	}
}

func getCwd(t *testing.T) string {
	cwd, err := os.Getwd()
	if err != nil {
		t.FailNow()
	}

	return cwd
}

func getBaseOptions() integration.ProgramTestOptions {
	return integration.ProgramTestOptions{
		ExpectRefreshChanges: true,
	}
}

func getJSBaseOptions(t *testing.T) integration.ProgramTestOptions {
	checkDigitalOceanTokenSet(t)
	base := getBaseOptions()
	baseJS := base.With(integration.ProgramTestOptions{
		Dependencies: []string{
			"@pulumi/digitalocean",
		},
	})

	return baseJS
}
