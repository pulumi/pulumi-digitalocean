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

package examples

import (
	"os"
	"path"
	"testing"

	"github.com/pulumi/pulumi/pkg/testing/integration"
	"github.com/stretchr/testify/assert"
)

var base = integration.ProgramTestOptions{
	ExpectRefreshChanges: true,
	// Note: no Config! This package should be usable without any config.
}

func TestDomain(t *testing.T) {
	cwd, err := os.Getwd()
	if !assert.NoError(t, err) {
		t.FailNow()
	}

	baseJS := base.With(integration.ProgramTestOptions{
		Dependencies: []string{
			"@pulumi/digitalocean",
		},
	})

	tests := []integration.ProgramTestOptions{
		baseJS.With(integration.ProgramTestOptions{Dir: path.Join(cwd, "domain")}),
		baseJS.With(integration.ProgramTestOptions{Dir: path.Join(cwd, "droplet")}),
		baseJS.With(integration.ProgramTestOptions{Dir: path.Join(cwd, "floatingip")}),
		baseJS.With(integration.ProgramTestOptions{Dir: path.Join(cwd, "loadbalancer")}),
	}

	for _, ex := range tests {
		example := ex
		t.Run(example.Dir, func(t *testing.T) {
			integration.ProgramTest(t, &example)
		})
	}
}
