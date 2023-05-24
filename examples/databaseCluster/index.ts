// Copyright 2016-2018, Pulumi Corporation.
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

import * as digitalocean from "@pulumi/digitalocean";

const example = new digitalocean.DatabaseCluster("example", {
    engine: "pg",
    nodeCount: 1,
    region: digitalocean.Region.NYC3,
    size: digitalocean.DatabaseSlug.DB_1VPCU1GB,
    version: "12",
});

export let name = example.name;
