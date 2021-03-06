// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Get information on domains for use in other resources, with the ability to filter and sort the results.
// If no filters are specified, all domains will be returned.
//
// This data source is useful if the domains in question are not managed by this provider or you need to
// utilize any of the domains' data.
//
// Note: You can use the `Domain` data source to obtain metadata
// about a single domain if you already know the `name`.
//
// ## Example Usage
//
// Use the `filter` block with a `key` string and `values` list to filter domains. (This example
// also uses the regular expression `matchBy` mode in order to match domains by suffix.)
//
// ```go
// package main
//
// import (
// 	"fmt"
//
// 	"github.com/pulumi/pulumi-digitalocean/sdk/v4/go/digitalocean"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := digitalocean.GetDomains(ctx, &digitalocean.GetDomainsArgs{
// 			Filters: []digitalocean.GetDomainsFilter{
// 				digitalocean.GetDomainsFilter{
// 					Key:     "name",
// 					MatchBy: "re",
// 					Values: []string{
// 						fmt.Sprintf("%v%v", "example\\.com", "$"),
// 					},
// 				},
// 			},
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func GetDomains(ctx *pulumi.Context, args *GetDomainsArgs, opts ...pulumi.InvokeOption) (*GetDomainsResult, error) {
	var rv GetDomainsResult
	err := ctx.Invoke("digitalocean:index/getDomains:getDomains", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDomains.
type GetDomainsArgs struct {
	// Filter the results.
	// The `filter` block is documented below.
	Filters []GetDomainsFilter `pulumi:"filters"`
	// Sort the results.
	// The `sort` block is documented below.
	Sorts []GetDomainsSort `pulumi:"sorts"`
}

// A collection of values returned by getDomains.
type GetDomainsResult struct {
	// A list of domains satisfying any `filter` and `sort` criteria. Each domain has the following attributes:
	Domains []GetDomainsDomain `pulumi:"domains"`
	Filters []GetDomainsFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id    string           `pulumi:"id"`
	Sorts []GetDomainsSort `pulumi:"sorts"`
}
