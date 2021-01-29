// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Get information on a single DigitalOcean project. If neither the `id` nor `name` attributes are provided,
// then this data source returns the default project.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-digitalocean/sdk/v3/go/digitalocean"
// 	"github.com/pulumi/pulumi-digitalocean/sdk/v3/go/digitalocean/"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := digitalocean.LookupProject(ctx, nil, nil)
// 		if err != nil {
// 			return err
// 		}
// 		opt0 := "My Staging Project"
// 		_, err = digitalocean.LookupProject(ctx, &digitalocean.LookupProjectArgs{
// 			Name: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupProject(ctx *pulumi.Context, args *LookupProjectArgs, opts ...pulumi.InvokeOption) (*LookupProjectResult, error) {
	var rv LookupProjectResult
	err := ctx.Invoke("digitalocean:index/getProject:getProject", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getProject.
type LookupProjectArgs struct {
	// the ID of the project to retrieve
	Id *string `pulumi:"id"`
	// the name of the project to retrieve. The data source will raise an error if more than
	// one project has the provided name or if no project has that name.
	Name *string `pulumi:"name"`
}

// A collection of values returned by getProject.
type LookupProjectResult struct {
	// The date and time when the project was created, (ISO8601)
	CreatedAt string `pulumi:"createdAt"`
	// The description of the project
	Description string `pulumi:"description"`
	// The environment of the project's resources. The possible values are: `Development`, `Staging`, `Production`.
	Environment string `pulumi:"environment"`
	Id          string `pulumi:"id"`
	IsDefault   bool   `pulumi:"isDefault"`
	Name        string `pulumi:"name"`
	// The ID of the project owner.
	OwnerId int `pulumi:"ownerId"`
	// The unique universal identifier of the project owner.
	OwnerUuid string `pulumi:"ownerUuid"`
	// The purpose of the project, (Default: "Web Application")
	Purpose string `pulumi:"purpose"`
	// A set of uniform resource names (URNs) for the resources associated with the project
	Resources []string `pulumi:"resources"`
	// The date and time when the project was last updated, (ISO8601)
	UpdatedAt string `pulumi:"updatedAt"`
}
