<<<<<<< HEAD
// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.
=======
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
>>>>>>> 4722edbbbe9c376c1f9e2a27d548da0217d74456
// +build nodejs all

package examples

import (
	"path"
	"testing"

	"github.com/pulumi/pulumi/pkg/v2/testing/integration"
)

<<<<<<< HEAD
=======
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

>>>>>>> 4722edbbbe9c376c1f9e2a27d548da0217d74456
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
<<<<<<< HEAD

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
=======
>>>>>>> 4722edbbbe9c376c1f9e2a27d548da0217d74456
