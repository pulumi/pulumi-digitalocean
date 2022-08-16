import pulumi
import pulumi_digitalocean as digitalocean

example = digitalocean.DatabaseCluster("example",
    engine="pg",
    node_count=1,
    region="nyc3",
    size="db-s-1vcpu-1gb",
    version="11")
