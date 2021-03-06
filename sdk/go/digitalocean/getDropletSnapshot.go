// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Droplet snapshots are saved instances of a Droplet. Use this data
// source to retrieve the ID of a DigitalOcean Droplet snapshot for use in other
// resources.
//
// ## Example Usage
//
// Get the Droplet snapshot:
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-digitalocean/sdk/v4/go/digitalocean"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		opt0 := true
// 		opt1 := "^web"
// 		opt2 := "nyc3"
// 		_, err := digitalocean.LookupDropletSnapshot(ctx, &digitalocean.LookupDropletSnapshotArgs{
// 			MostRecent: &opt0,
// 			NameRegex:  &opt1,
// 			Region:     &opt2,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupDropletSnapshot(ctx *pulumi.Context, args *LookupDropletSnapshotArgs, opts ...pulumi.InvokeOption) (*LookupDropletSnapshotResult, error) {
	var rv LookupDropletSnapshotResult
	err := ctx.Invoke("digitalocean:index/getDropletSnapshot:getDropletSnapshot", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDropletSnapshot.
type LookupDropletSnapshotArgs struct {
	// If more than one result is returned, use the most recent Droplet snapshot.
	MostRecent *bool `pulumi:"mostRecent"`
	// The name of the Droplet snapshot.
	Name *string `pulumi:"name"`
	// A regex string to apply to the Droplet snapshot list returned by DigitalOcean. This allows more advanced filtering not supported from the DigitalOcean API. This filtering is done locally on what DigitalOcean returns.
	NameRegex *string `pulumi:"nameRegex"`
	// A "slug" representing a DigitalOcean region (e.g. `nyc1`). If set, only Droplet snapshots available in the region will be returned.
	Region *string `pulumi:"region"`
}

// A collection of values returned by getDropletSnapshot.
type LookupDropletSnapshotResult struct {
	// The date and time the Droplet snapshot was created.
	CreatedAt string `pulumi:"createdAt"`
	// The ID of the Droplet from which the Droplet snapshot originated.
	DropletId string `pulumi:"dropletId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The minimum size in gigabytes required for a Droplet to be created based on this Droplet snapshot.
	MinDiskSize int     `pulumi:"minDiskSize"`
	MostRecent  *bool   `pulumi:"mostRecent"`
	Name        *string `pulumi:"name"`
	NameRegex   *string `pulumi:"nameRegex"`
	Region      *string `pulumi:"region"`
	// A list of DigitalOcean region "slugs" indicating where the Droplet snapshot is available.
	Regions []string `pulumi:"regions"`
	// The billable size of the Droplet snapshot in gigabytes.
	Size float64 `pulumi:"size"`
}
