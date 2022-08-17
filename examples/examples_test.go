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
	"fmt"
	"os"
	"path/filepath"
	"testing"

	"github.com/blang/semver"
	i "github.com/pulumi/pulumi/pkg/v3/testing/integration"
	"github.com/pulumi/pulumi/pkg/v3/testing/matrix"
	"github.com/pulumi/pulumi/sdk/v3/go/common/workspace"
)

func TestAll(t *testing.T) {
	opts := []matrix.TestOptions{
		opts(t, "databaseCluster"),
	}

	t.Parallel()
	for _, o := range opts {
		t.Run(o.Program.Dir, func(t *testing.T) {
			t.Parallel()
			matrix.Test(t, o)
		})
	}
}

func opts(t *testing.T, dir string) matrix.TestOptions {
	o := getBaseOptions(t)
	o = o.With(i.ProgramTestOptions{
		Dir: filepath.Join(getCwd(t), dir),
	})
	return matrix.TestOptions{
		Program:   &o,
		Languages: allLanguages(),
		Plugins: []matrix.PluginOptions{
			{
				Name:    "digitalocean",
				Kind:    workspace.ResourcePlugin,
				Bin:     "../../bin",
				Version: semver.MustParse("0.0.0"),
			},
		},
	}
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
	return i.ProgramTestOptions{
		RunUpdateTest:        false, //temporarily skipping these since we have jsut changed the enum types
		ExpectRefreshChanges: true,
	}
}

func allLanguages() []matrix.LangTestOption {
	return []matrix.LangTestOption{
		{
			Language: "go",
			Opts:     nil,
		},
		{
			Language: "python",
			Opts:     nil,
		},
		{
			Language: "nodejs",
			Opts:     nil,
		},
		{
			Language: "dotnet",
			Opts:     nil,
		},
	}
}
