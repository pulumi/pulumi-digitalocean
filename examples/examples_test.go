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
	"path/filepath"
	"testing"

	i "github.com/pulumi/pulumi/pkg/v3/testing/integration"
	"github.com/pulumi/pulumi/pkg/v3/testing/matrix"
	"github.com/pulumi/pulumi/sdk/v3/go/common/workspace"
	//"github.com/stretchr/testify/assert"
)

func DigitalOceanPlugins(t *testing.T) []matrix.PluginOptions {
	return []matrix.PluginOptions{
		{
			Name: "digitalocean",
			Kind: workspace.ResourcePlugin,
			Bin:  "../bin",
		},
	}
}

func testLang(t *testing.T, lang string) {
	tester, err := matrix.NewTester(
		DigitalOceanPlugins(t),
		[]matrix.LangTestOption{
			{
				Language: lang,
			},
		},
		nil)
	if err != nil {
		t.Fatal(err)
	}

	tester.TestLang(t, opts(t, "databaseCluster"), lang)
	tester.TestLang(t, opts(t, "domain"), lang)
	tester.TestLang(t, opts(t, "droplet"), lang)
	tester.TestLang(t, opts(t, "floatingip"), lang)
	tester.TestLang(t, opts(t, "loadbalancer"), lang)
	tester.TestLang(t, opts(t, "volume"), lang)
}

func opts(t *testing.T, dir string) *i.ProgramTestOptions {
	o := getBaseOptions(t)
	o = o.With(i.ProgramTestOptions{
		Dir: filepath.Join(getCwd(t), dir),
	})
	return &o
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

func getBaseOptions(t *testing.T) i.ProgramTestOptions {
	checkDigitalOceanTokenSet(t)
	//get ~ dir
	home, err := os.UserHomeDir()
	if err != nil {
		t.FailNow()
	}
	return i.ProgramTestOptions{
		RunUpdateTest:        false, //temporarily skipping these since we have jsut changed the enum types
		ExpectRefreshChanges: true,
		//for dev purposes. Once matrix testing is merged and released this can be omitted
		PulumiBin: filepath.Join(home, ".pulumi-dev", "bin", "pulumi"),
	}
}
