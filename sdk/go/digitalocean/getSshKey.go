// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Get information on a ssh key. This data source provides the name, public key,
// and fingerprint as configured on your DigitalOcean account. This is useful if
// the ssh key in question is not managed by this provider or you need to utilize any
// of the keys data.
//
// An error is triggered if the provided ssh key name does not exist.
func LookupSshKey(ctx *pulumi.Context, args *LookupSshKeyArgs, opts ...pulumi.InvokeOption) (*LookupSshKeyResult, error) {
	var rv LookupSshKeyResult
	err := ctx.Invoke("digitalocean:index/getSshKey:getSshKey", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSshKey.
type LookupSshKeyArgs struct {
	// The name of the ssh key.
	Name string `pulumi:"name"`
}

// A collection of values returned by getSshKey.
type LookupSshKeyResult struct {
	Fingerprint string `pulumi:"fingerprint"`
	// The provider-assigned unique ID for this managed resource.
	Id        string `pulumi:"id"`
	Name      string `pulumi:"name"`
	PublicKey string `pulumi:"publicKey"`
}
