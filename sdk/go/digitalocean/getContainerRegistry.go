// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Get information on a container registry. This data source provides the name as
// configured on your DigitalOcean account. This is useful if the container
// registry name in question is not managed by this provider or you need validate if
// the container registry exists in the account.
//
// An error is triggered if the provided container registry name does not exist.
func LookupContainerRegistry(ctx *pulumi.Context, args *LookupContainerRegistryArgs, opts ...pulumi.InvokeOption) (*LookupContainerRegistryResult, error) {
	var rv LookupContainerRegistryResult
	err := ctx.Invoke("digitalocean:index/getContainerRegistry:getContainerRegistry", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getContainerRegistry.
type LookupContainerRegistryArgs struct {
	// The name of the container registry.
	Name string `pulumi:"name"`
}

// A collection of values returned by getContainerRegistry.
type LookupContainerRegistryResult struct {
	Endpoint string `pulumi:"endpoint"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The name of the container registry
	// * `endpoint`: The URL endpoint of the container registry. Ex: `registry.digitalocean.com/my_registry`
	// * `serverUrl`: The domain of the container registry. Ex: `registry.digitalocean.com`
	Name      string `pulumi:"name"`
	ServerUrl string `pulumi:"serverUrl"`
}
