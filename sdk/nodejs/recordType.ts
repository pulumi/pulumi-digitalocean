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

export module RecordTypes {
    export const A:     RecordType = "A";
    export const AAAA:  RecordType = "AAAA";
    export const CAA:   RecordType = "CAA";
    export const CNAME: RecordType = "CNAME";
    export const MX:    RecordType = "MX";
    export const NS:    RecordType = "NS";
    export const TXT:   RecordType = "TXT";
    export const SRV:   RecordType = "SRV";
}

export type RecordType =
    "A"     |
    "AAAA"  |
    "CAA"   |
    "CNAME" |
    "MX"    |
    "NS"    |
    "TXT"   |
    "SRV"   ;
