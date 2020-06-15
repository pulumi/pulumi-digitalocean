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
// +build dotnet all

package examples

import (
	"testing"

	"github.com/pulumi/pulumi/pkg/v2/testing/integration"
)

func getCsharpBaseOptions(t *testing.T) integration.ProgramTestOptions {
	base := getBaseOptions()
	baseCsharp := base.With(integration.ProgramTestOptions{
		Dependencies: []string{
<<<<<<< HEAD
			"Pulumi.SpotInst",
=======
			"Pulumi.DigitalOcean",
>>>>>>> 4722edbbbe9c376c1f9e2a27d548da0217d74456
		},
	})

	return baseCsharp
}
