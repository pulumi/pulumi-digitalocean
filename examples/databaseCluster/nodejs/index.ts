import * as pulumi from "@pulumi/pulumi";
import * as digitalocean from "@pulumi/digitalocean";

const example = new digitalocean.DatabaseCluster("example", {
    engine: "pg",
    nodeCount: 1,
    region: "nyc3",
    size: "db-s-1vcpu-1gb",
    version: "11",
});
