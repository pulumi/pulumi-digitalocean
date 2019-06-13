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

export module DatabaseSlugs {
    export const DB_1VPCU1GB:   DatabaseSlug = "db-s-1vcpu-1gb";
    export const DB_1VPCU2GB:   DatabaseSlug = "db-s-1vcpu-2gb";
    export const DB_2VPCU4GB:   DatabaseSlug = "db-s-2vcpu-4gb";
    export const DB_4VPCU8GB:   DatabaseSlug = "db-s-4vcpu-8gb";
    export const DB_6VPCU16GB:  DatabaseSlug = "db-s-6vcpu-16gb";
    export const DB_8VPCU32GB:  DatabaseSlug = "db-s-8vcpu-32gb";
    export const DB_16VPCU64GB: DatabaseSlug = "db-s-16vcpu-64gb";
}


/**
 * A DatabaseSlug represents any valid DigitalOcean database slug size that may be targeted with database clusters.
 */
export type DatabaseSlug =
    "db-s-1vcpu-1gb"   |
    "db-s-1vcpu-2gb"   |
    "db-s-2vcpu-4gb"   |
    "db-s-4vcpu-8gb"   |
    "db-s-6vcpu-16gb"  |
    "db-s-8vcpu-32gb"  |
    "db-s-16vcpu-64gb" ;

