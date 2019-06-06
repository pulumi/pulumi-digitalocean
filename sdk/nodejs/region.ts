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

export let NYC1Region: Region = "nyc1";
export let NYC2Region: Region = "nyc2";
export let NYC3Region: Region = "nyc3";
export let SGP1Region: Region = "sgp1"
export let LON1Region: Region = "lon1"
export let AMS2Region: Region = "ams2"
export let AMS3Region: Region = "ams3"
export let FRA1Region: Region = "fra1"
export let TOR1Region: Region = "tor1"
export let SFO1Region: Region = "sfo1"
export let SFO2Region: Region = "sfo2"
export let BLR1Region: Region = "blr1"

/**
 * A Region represents any valid DigitalOcean region that may be targeted with deployments.
 */
export type Region =
    "nyc1" |
    "nyc2" |
    "nyc3" |
    "sgp1" |
    "lon1" |
    "ams2" |
    "ams3" |
    "fra1" |
    "tor1" |
    "sfo1" |
    "sfo2" |
    "blr1" ;

