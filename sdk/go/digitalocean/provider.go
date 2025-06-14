// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-digitalocean/sdk/v4/go/digitalocean/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The provider type for the digitalocean package. By default, resources use package-wide configuration
// settings, however an explicit `Provider` instance may be created and passed during resource
// construction to achieve fine-grained programmatic control over provider settings. See the
// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
type Provider struct {
	pulumi.ProviderResourceState

	// The URL to use for the DigitalOcean API.
	ApiEndpoint pulumi.StringPtrOutput `pulumi:"apiEndpoint"`
	// The access key ID for Spaces API operations.
	SpacesAccessId pulumi.StringPtrOutput `pulumi:"spacesAccessId"`
	// The URL to use for the DigitalOcean Spaces API.
	SpacesEndpoint pulumi.StringPtrOutput `pulumi:"spacesEndpoint"`
	// The secret access key for Spaces API operations.
	SpacesSecretKey pulumi.StringPtrOutput `pulumi:"spacesSecretKey"`
	// The token key for API operations.
	Token pulumi.StringPtrOutput `pulumi:"token"`
}

// NewProvider registers a new resource with the given unique name, arguments, and options.
func NewProvider(ctx *pulumi.Context,
	name string, args *ProviderArgs, opts ...pulumi.ResourceOption) (*Provider, error) {
	if args == nil {
		args = &ProviderArgs{}
	}

	if args.ApiEndpoint == nil {
		if d := internal.GetEnvOrDefault("https://api.digitalocean.com", nil, "DIGITALOCEAN_API_URL"); d != nil {
			args.ApiEndpoint = pulumi.StringPtr(d.(string))
		}
	}
	if args.SpacesEndpoint == nil {
		if d := internal.GetEnvOrDefault(nil, nil, "SPACES_ENDPOINT_URL"); d != nil {
			args.SpacesEndpoint = pulumi.StringPtr(d.(string))
		}
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Provider
	err := ctx.RegisterResource("pulumi:providers:digitalocean", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

type providerArgs struct {
	// The URL to use for the DigitalOcean API.
	ApiEndpoint *string `pulumi:"apiEndpoint"`
	// The maximum number of retries on a failed API request.
	HttpRetryMax *int `pulumi:"httpRetryMax"`
	// The maximum wait time (in seconds) between failed API requests.
	HttpRetryWaitMax *float64 `pulumi:"httpRetryWaitMax"`
	// The minimum wait time (in seconds) between failed API requests.
	HttpRetryWaitMin *float64 `pulumi:"httpRetryWaitMin"`
	// The rate of requests per second to limit the HTTP client.
	RequestsPerSecond *float64 `pulumi:"requestsPerSecond"`
	// The access key ID for Spaces API operations.
	SpacesAccessId *string `pulumi:"spacesAccessId"`
	// The URL to use for the DigitalOcean Spaces API.
	SpacesEndpoint *string `pulumi:"spacesEndpoint"`
	// The secret access key for Spaces API operations.
	SpacesSecretKey *string `pulumi:"spacesSecretKey"`
	// The token key for API operations.
	Token *string `pulumi:"token"`
}

// The set of arguments for constructing a Provider resource.
type ProviderArgs struct {
	// The URL to use for the DigitalOcean API.
	ApiEndpoint pulumi.StringPtrInput
	// The maximum number of retries on a failed API request.
	HttpRetryMax pulumi.IntPtrInput
	// The maximum wait time (in seconds) between failed API requests.
	HttpRetryWaitMax pulumi.Float64PtrInput
	// The minimum wait time (in seconds) between failed API requests.
	HttpRetryWaitMin pulumi.Float64PtrInput
	// The rate of requests per second to limit the HTTP client.
	RequestsPerSecond pulumi.Float64PtrInput
	// The access key ID for Spaces API operations.
	SpacesAccessId pulumi.StringPtrInput
	// The URL to use for the DigitalOcean Spaces API.
	SpacesEndpoint pulumi.StringPtrInput
	// The secret access key for Spaces API operations.
	SpacesSecretKey pulumi.StringPtrInput
	// The token key for API operations.
	Token pulumi.StringPtrInput
}

func (ProviderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*providerArgs)(nil)).Elem()
}

// This function returns a Terraform config object with terraform-namecased keys,to be used with the Terraform Module Provider.
func (r *Provider) TerraformConfig(ctx *pulumi.Context) (ProviderTerraformConfigResultOutput, error) {
	out, err := ctx.Call("pulumi:providers:digitalocean/terraformConfig", nil, ProviderTerraformConfigResultOutput{}, r)
	if err != nil {
		return ProviderTerraformConfigResultOutput{}, err
	}
	return out.(ProviderTerraformConfigResultOutput), nil
}

type ProviderTerraformConfigResult struct {
	Result map[string]interface{} `pulumi:"result"`
}

type ProviderTerraformConfigResultOutput struct{ *pulumi.OutputState }

func (ProviderTerraformConfigResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ProviderTerraformConfigResult)(nil)).Elem()
}

func (o ProviderTerraformConfigResultOutput) Result() pulumi.MapOutput {
	return o.ApplyT(func(v ProviderTerraformConfigResult) map[string]interface{} { return v.Result }).(pulumi.MapOutput)
}

type ProviderInput interface {
	pulumi.Input

	ToProviderOutput() ProviderOutput
	ToProviderOutputWithContext(ctx context.Context) ProviderOutput
}

func (*Provider) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil)).Elem()
}

func (i *Provider) ToProviderOutput() ProviderOutput {
	return i.ToProviderOutputWithContext(context.Background())
}

func (i *Provider) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderOutput)
}

type ProviderOutput struct{ *pulumi.OutputState }

func (ProviderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil)).Elem()
}

func (o ProviderOutput) ToProviderOutput() ProviderOutput {
	return o
}

func (o ProviderOutput) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return o
}

// The URL to use for the DigitalOcean API.
func (o ProviderOutput) ApiEndpoint() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.ApiEndpoint }).(pulumi.StringPtrOutput)
}

// The access key ID for Spaces API operations.
func (o ProviderOutput) SpacesAccessId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.SpacesAccessId }).(pulumi.StringPtrOutput)
}

// The URL to use for the DigitalOcean Spaces API.
func (o ProviderOutput) SpacesEndpoint() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.SpacesEndpoint }).(pulumi.StringPtrOutput)
}

// The secret access key for Spaces API operations.
func (o ProviderOutput) SpacesSecretKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.SpacesSecretKey }).(pulumi.StringPtrOutput)
}

// The token key for API operations.
func (o ProviderOutput) Token() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.Token }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProviderInput)(nil)).Elem(), &Provider{})
	pulumi.RegisterOutputType(ProviderOutput{})
	pulumi.RegisterOutputType(ProviderTerraformConfigResultOutput{})
}
