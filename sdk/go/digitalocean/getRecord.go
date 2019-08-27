// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Get information on a DNS record. This data source provides the name, TTL, and zone
// file as configured on your DigitalOcean account. This is useful if the record
// in question is not managed by Terraform.
// 
// An error is triggered if the provided domain name or record are not managed with
// your DigitalOcean account.
func LookupRecord(ctx *pulumi.Context, args *GetRecordArgs) (*GetRecordResult, error) {
	inputs := make(map[string]interface{})
	if args != nil {
		inputs["domain"] = args.Domain
		inputs["name"] = args.Name
	}
	outputs, err := ctx.Invoke("digitalocean:index/getRecord:getRecord", inputs)
	if err != nil {
		return nil, err
	}
	return &GetRecordResult{
		Data: outputs["data"],
		Domain: outputs["domain"],
		Flags: outputs["flags"],
		Name: outputs["name"],
		Port: outputs["port"],
		Priority: outputs["priority"],
		Tag: outputs["tag"],
		Ttl: outputs["ttl"],
		Type: outputs["type"],
		Weight: outputs["weight"],
		Id: outputs["id"],
	}, nil
}

// A collection of arguments for invoking getRecord.
type GetRecordArgs struct {
	// The domain name of the record.
	Domain interface{}
	// The name of the record.
	Name interface{}
}

// A collection of values returned by getRecord.
type GetRecordResult struct {
	Data interface{}
	Domain interface{}
	Flags interface{}
	Name interface{}
	Port interface{}
	Priority interface{}
	Tag interface{}
	Ttl interface{}
	Type interface{}
	Weight interface{}
	// id is the provider-assigned unique ID for this managed resource.
	Id interface{}
}
