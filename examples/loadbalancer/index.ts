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
import * as tls from "@pulumi/tls";

const privateKey = new tls.PrivateKey("my-private-key", {
    algorithm: "RSA",
});

const sshKey = new digitalocean.SshKey("my-ssh-key", {
    publicKey: privateKey.publicKeyOpenssh,
});

const foobar = new digitalocean.Tag("foobar");

new digitalocean.Droplet("web", {
    image: "ubuntu-20-04-x64",
    region: digitalocean.Region.NYC3,
    size: "s-1vcpu-1gb",
    tags: [foobar.id],
    sshKeys: [sshKey.id],
});

const lb = new digitalocean.LoadBalancer("public", {
    dropletTag: foobar.name,
    forwardingRules: [{
        entryPort: 80,
        entryProtocol: "http",
        targetPort: 80,
        targetProtocol: "http",
    }],
    healthcheck: {
        port: 22,
        protocol: "tcp",
    },
    region: digitalocean.Region.NYC3,
});

export let status = lb.status;
