package main

import (
	"github.com/pulumi/pulumi-digitalocean/sdk/v4/go/digitalocean"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		vol, err := digitalocean.NewVolume(ctx, "demoName", &digitalocean.VolumeArgs{
			Region:     pulumi.String("lon1"),
			Size:       pulumi.Int(10),
		})
		if err != nil {
			return err
		}

		ctx.Export("name", vol.Name)
		return nil
	})
}
