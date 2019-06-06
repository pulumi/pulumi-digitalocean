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

export let Droplet512mb:         DropletSlug = "512mb";
export let Droplet1GB:           DropletSlug = "1gb";
export let Droplet2GB:           DropletSlug = "2gb";
export let Droplet4GB:           DropletSlug = "4gb";
export let Droplet8GB:           DropletSlug = "8gb";
export let Droplet16GB:          DropletSlug = "16gb";
export let Droplet32GB:          DropletSlug = "32gb";
export let Droplet48GB:          DropletSlug = "48gb";
export let Droplet64GB:          DropletSlug = "64gb";
export let DropletC2:            DropletSlug = "c-2";
export let DropletC4:            DropletSlug = "c-4";
export let DropletC8:            DropletSlug = "c-8";
export let DropletC16:           DropletSlug = "c-16";
export let DropletC32:           DropletSlug = "c-32";
export let DropletS1VPCU1GB:     DropletSlug = "s-1vcpu-1gb";
export let DropletS1VPCU2GB:     DropletSlug = "s-1vcpu-2gb";
export let DropletS1VPCU3GB:     DropletSlug = "s-1vcpu-3gb";
export let DropletS2VPCU2GB:     DropletSlug = "s-2vcpu-2gb";
export let DropletS2VPCU4GB:     DropletSlug = "s-2vcpu-4gb";
export let DropletS3VPCU1GB:     DropletSlug = "s-3vcpu-1gb";
export let DropletS4VPCU8GB:     DropletSlug = "s-4vcpu-8gb";
export let DropletS6VPCU16GB:    DropletSlug = "s-6vcpu-16gb";
export let DropletS8VPCU32GB:    DropletSlug = "s-8vcpu-32gb";
export let DropletS12VPCU48GB:   DropletSlug = "s-12vcpu-48gb";
export let DropletS16VPCU64GB:   DropletSlug = "s-16vcpu-64gb";
export let DropletS20VPCU96GB:   DropletSlug = "s-20vcpu-96gb";
export let DropletS24VPCU128GB:  DropletSlug = "s-24vcpu-128gb";
export let DropletS32VPCU192GB:  DropletSlug = "s-32vcpu-192gb";
export let DropletG2VPCU8GB:     DropletSlug = "g-2vcpu-8gb";
export let DropletG4VPCU16GB:    DropletSlug = "g-4vcpu-16gb";
export let DropletG8VPCU32GB:    DropletSlug = "g-8vcpu-32gb";
export let DropletG16VPCU64GB:   DropletSlug = "g-16vcpu-64gb";
export let DropletG32VPCU128GB:  DropletSlug = "g-32vcpu-128gb";
export let DropletG40VPCU160GB:  DropletSlug = "g-40vcpu-160gb";
export let DropletGD2VPCU8GB:    DropletSlug = "gd-2vcpu-8gb";
export let DropletGD4VPCU16GB:   DropletSlug = "gd-4vcpu-16gb";
export let DropletGD8VPCU32GB:   DropletSlug = "gd-8vcpu-32gb";
export let DropletGD16VPCU64GB:  DropletSlug = "gd-16vcpu-64gb";
export let DropletGD32VPCU128GB: DropletSlug = "gd-32vcpu-128gb";
export let DropletGD40VPCU160GB: DropletSlug = "gd-40vcpu-160gb";

/**
 * A DropletSlug represents any valid DigitalOcean droplet slug size that may be targeted for deployment.
 */
export type DropletSlug =
    "512mb"           |
    "1gb"             |
    "2gb"             |
    "4gb"             |
    "8gb"             |
    "16gb"            |
    "32gb"            |
    "48gb"            |
    "64gb"            |
    "c-2"             |
    "c-4"             |
    "c-8"             |
    "c-16"            |
    "c-32"            |
    "s-1vcpu-1gb"     |
    "s-1vcpu-2gb"     |
    "s-1vcpu-3gb"     |
    "s-2vcpu-2gb"     |
    "s-2vcpu-4gb"     |
    "s-3vcpu-1gb"     |
    "s-4vcpu-8gb"     |
    "s-6vcpu-16gb"    |
    "s-8vcpu-32gb"    |
    "s-12vcpu-48gb"   |
    "s-16vcpu-64gb"   |
    "s-20vcpu-96gb"   |
    "s-24vcpu-128gb"  |
    "s-32vcpu-192gb"  |
    "g-2vcpu-8gb"     |
    "g-4vcpu-16gb"    |
    "g-8vcpu-32gb"    |
    "g-16vcpu-64gb"   |
    "g-32vcpu-128gb"  |
    "g-40vcpu-160gb"  |
    "gd-2vcpu-8gb"    |
    "gd-4vcpu-16gb"   |
    "gd-8vcpu-32gb"   |
    "gd-16vcpu-64gb"  |
    "gd-32vcpu-128gb" |
    "gd-40vcpu-160gb" ;
