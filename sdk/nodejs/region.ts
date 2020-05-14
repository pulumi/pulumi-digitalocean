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

export module Regions {
    export const NYC1: Region = "nyc1";
    export const NYC2: Region = "nyc2";
    export const NYC3: Region = "nyc3";
    export const SGP1: Region = "sgp1"
    export const LON1: Region = "lon1"
    export const AMS2: Region = "ams2"
    export const AMS3: Region = "ams3"
    export const FRA1: Region = "fra1"
    export const TOR1: Region = "tor1"
    export const SFO1: Region = "sfo1"
    export const SFO2: Region = "sfo2"
    export const SFO3: Region = "sfo3"
    export const BLR1: Region = "blr1"
}

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
    "sfo3" |
    "blr1" ;

