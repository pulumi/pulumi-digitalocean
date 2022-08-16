package main

import (
	"github.com/pulumi/pulumi-digitalocean/sdk/v4/go/digitalocean"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := digitalocean.NewDatabaseCluster(ctx, "example", &digitalocean.DatabaseClusterArgs{
			Engine:    pulumi.String("pg"),
			NodeCount: pulumi.Int(1),
			Region:    pulumi.String("nyc3"),
			Size:      pulumi.String("db-s-1vcpu-1gb"),
			Version:   pulumi.String("11"),
		})
		if err != nil {
			return err
		}
		return nil
	})
}
