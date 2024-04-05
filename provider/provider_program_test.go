//go:build !go && !nodejs && !python && !dotnet
// +build !go,!nodejs,!python,!dotnet

// Copyright 2016-2024, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License")
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//	http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package digitalocean

import (
	"os"
	"path/filepath"
	"testing"

	"github.com/stretchr/testify/require"

	"github.com/pulumi/providertest/pulumitest"
	"github.com/pulumi/providertest/pulumitest/opttest"
)

const providerName = "digitalocean"

func testProgram(t *testing.T, dir string) {
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without credentials")
	}
	cwd, err := os.Getwd()
	require.NoError(t, err)
	test := pulumitest.NewPulumiTest(t, dir,
		opttest.LocalProviderPath(providerName, filepath.Join(cwd, "..", "bin")),
		opttest.SkipInstall(),
	)
	test.Up()
}

func TestPrograms(t *testing.T) {
	programs := []string{
		"test-programs/index_kubernetescluster",
		"test-programs/index_databasecluster",
		"test-programs/index_droplet",
		"test-programs/index_vpc",
		"test-programs/index_domain",
		"test-programs/index_project",
		"test-programs/index_dnsrecord",
		"test-programs/index_spacesbucket",
		"test-programs/index_containerregistry",
		"test-programs/index_databasedb",
		"test-programs/index_databasefirewall",
		"test-programs/index_projectresources",
		"test-programs/index_firewall",
		"test-programs/index_databaseuser",
		"test-programs/index_sshkey",
		"test-programs/index_containerregistrydockercredentials",
		"test-programs/index_app",
		"test-programs/index_certificate",
		"test-programs/index_loadbalancer",
		"test-programs/index_tag",
	}
	for _, p := range programs {
		t.Run(p, func(t *testing.T) {
			testProgram(t, p)
		})
	}
}
