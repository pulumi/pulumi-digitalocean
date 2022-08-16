module database-cluster-digitalocean
go 1.17
replace github.com/pulumi/pulumi-digitalocean/sdk/go => /Users/hliuson/pulumi/pulumi-digitalocean/examples/databaseCluster/digitalocean-sdk/go


require (
	github.com/pulumi/pulumi/sdk/v3 v3.30.0
	github.com/pulumi/pulumi-digitalocean/sdk/v4 v4.15.0+dirty
)