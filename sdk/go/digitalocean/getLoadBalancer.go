// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-digitalocean/sdk/v4/go/digitalocean/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Get information on a load balancer for use in other resources. This data source
// provides all of the load balancers properties as configured on your DigitalOcean
// account. This is useful if the load balancer in question is not managed by
// the provider or you need to utilize any of the load balancers data.
//
// An error is triggered if the provided load balancer name does not exist.
//
// ## Example Usage
//
// Get the load balancer by name:
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-digitalocean/sdk/v4/go/digitalocean"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := digitalocean.LookupLoadBalancer(ctx, &digitalocean.LookupLoadBalancerArgs{
//				Name: pulumi.StringRef("app"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("lbOutput", example.Ip)
//			return nil
//		})
//	}
//
// ```
//
// Get the load balancer by ID:
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-digitalocean/sdk/v4/go/digitalocean"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := digitalocean.LookupLoadBalancer(ctx, &digitalocean.LookupLoadBalancerArgs{
//				Id: pulumi.StringRef("loadbalancer_id"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupLoadBalancer(ctx *pulumi.Context, args *LookupLoadBalancerArgs, opts ...pulumi.InvokeOption) (*LookupLoadBalancerResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupLoadBalancerResult
	err := ctx.Invoke("digitalocean:index/getLoadBalancer:getLoadBalancer", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getLoadBalancer.
type LookupLoadBalancerArgs struct {
	// The ID of load balancer.
	Id *string `pulumi:"id"`
	// The name of load balancer.
	Name *string `pulumi:"name"`
}

// A collection of values returned by getLoadBalancer.
type LookupLoadBalancerResult struct {
	// Deprecated: This field has been deprecated. You can no longer specify an algorithm for load balancers.
	Algorithm                    string                          `pulumi:"algorithm"`
	DisableLetsEncryptDnsRecords bool                            `pulumi:"disableLetsEncryptDnsRecords"`
	Domains                      []GetLoadBalancerDomain         `pulumi:"domains"`
	DropletIds                   []int                           `pulumi:"dropletIds"`
	DropletTag                   string                          `pulumi:"dropletTag"`
	EnableBackendKeepalive       bool                            `pulumi:"enableBackendKeepalive"`
	EnableProxyProtocol          bool                            `pulumi:"enableProxyProtocol"`
	Firewalls                    []GetLoadBalancerFirewall       `pulumi:"firewalls"`
	ForwardingRules              []GetLoadBalancerForwardingRule `pulumi:"forwardingRules"`
	GlbSettings                  []GetLoadBalancerGlbSetting     `pulumi:"glbSettings"`
	Healthchecks                 []GetLoadBalancerHealthcheck    `pulumi:"healthchecks"`
	HttpIdleTimeoutSeconds       int                             `pulumi:"httpIdleTimeoutSeconds"`
	Id                           *string                         `pulumi:"id"`
	Ip                           string                          `pulumi:"ip"`
	Ipv6                         string                          `pulumi:"ipv6"`
	LoadBalancerUrn              string                          `pulumi:"loadBalancerUrn"`
	Name                         *string                         `pulumi:"name"`
	Network                      string                          `pulumi:"network"`
	ProjectId                    string                          `pulumi:"projectId"`
	RedirectHttpToHttps          bool                            `pulumi:"redirectHttpToHttps"`
	Region                       string                          `pulumi:"region"`
	Size                         string                          `pulumi:"size"`
	SizeUnit                     int                             `pulumi:"sizeUnit"`
	Status                       string                          `pulumi:"status"`
	StickySessions               []GetLoadBalancerStickySession  `pulumi:"stickySessions"`
	TargetLoadBalancerIds        []string                        `pulumi:"targetLoadBalancerIds"`
	Type                         string                          `pulumi:"type"`
	VpcUuid                      string                          `pulumi:"vpcUuid"`
}

func LookupLoadBalancerOutput(ctx *pulumi.Context, args LookupLoadBalancerOutputArgs, opts ...pulumi.InvokeOption) LookupLoadBalancerResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupLoadBalancerResultOutput, error) {
			args := v.(LookupLoadBalancerArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("digitalocean:index/getLoadBalancer:getLoadBalancer", args, LookupLoadBalancerResultOutput{}, options).(LookupLoadBalancerResultOutput), nil
		}).(LookupLoadBalancerResultOutput)
}

// A collection of arguments for invoking getLoadBalancer.
type LookupLoadBalancerOutputArgs struct {
	// The ID of load balancer.
	Id pulumi.StringPtrInput `pulumi:"id"`
	// The name of load balancer.
	Name pulumi.StringPtrInput `pulumi:"name"`
}

func (LookupLoadBalancerOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupLoadBalancerArgs)(nil)).Elem()
}

// A collection of values returned by getLoadBalancer.
type LookupLoadBalancerResultOutput struct{ *pulumi.OutputState }

func (LookupLoadBalancerResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupLoadBalancerResult)(nil)).Elem()
}

func (o LookupLoadBalancerResultOutput) ToLookupLoadBalancerResultOutput() LookupLoadBalancerResultOutput {
	return o
}

func (o LookupLoadBalancerResultOutput) ToLookupLoadBalancerResultOutputWithContext(ctx context.Context) LookupLoadBalancerResultOutput {
	return o
}

// Deprecated: This field has been deprecated. You can no longer specify an algorithm for load balancers.
func (o LookupLoadBalancerResultOutput) Algorithm() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) string { return v.Algorithm }).(pulumi.StringOutput)
}

func (o LookupLoadBalancerResultOutput) DisableLetsEncryptDnsRecords() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) bool { return v.DisableLetsEncryptDnsRecords }).(pulumi.BoolOutput)
}

func (o LookupLoadBalancerResultOutput) Domains() GetLoadBalancerDomainArrayOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) []GetLoadBalancerDomain { return v.Domains }).(GetLoadBalancerDomainArrayOutput)
}

func (o LookupLoadBalancerResultOutput) DropletIds() pulumi.IntArrayOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) []int { return v.DropletIds }).(pulumi.IntArrayOutput)
}

func (o LookupLoadBalancerResultOutput) DropletTag() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) string { return v.DropletTag }).(pulumi.StringOutput)
}

func (o LookupLoadBalancerResultOutput) EnableBackendKeepalive() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) bool { return v.EnableBackendKeepalive }).(pulumi.BoolOutput)
}

func (o LookupLoadBalancerResultOutput) EnableProxyProtocol() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) bool { return v.EnableProxyProtocol }).(pulumi.BoolOutput)
}

func (o LookupLoadBalancerResultOutput) Firewalls() GetLoadBalancerFirewallArrayOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) []GetLoadBalancerFirewall { return v.Firewalls }).(GetLoadBalancerFirewallArrayOutput)
}

func (o LookupLoadBalancerResultOutput) ForwardingRules() GetLoadBalancerForwardingRuleArrayOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) []GetLoadBalancerForwardingRule { return v.ForwardingRules }).(GetLoadBalancerForwardingRuleArrayOutput)
}

func (o LookupLoadBalancerResultOutput) GlbSettings() GetLoadBalancerGlbSettingArrayOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) []GetLoadBalancerGlbSetting { return v.GlbSettings }).(GetLoadBalancerGlbSettingArrayOutput)
}

func (o LookupLoadBalancerResultOutput) Healthchecks() GetLoadBalancerHealthcheckArrayOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) []GetLoadBalancerHealthcheck { return v.Healthchecks }).(GetLoadBalancerHealthcheckArrayOutput)
}

func (o LookupLoadBalancerResultOutput) HttpIdleTimeoutSeconds() pulumi.IntOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) int { return v.HttpIdleTimeoutSeconds }).(pulumi.IntOutput)
}

func (o LookupLoadBalancerResultOutput) Id() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) *string { return v.Id }).(pulumi.StringPtrOutput)
}

func (o LookupLoadBalancerResultOutput) Ip() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) string { return v.Ip }).(pulumi.StringOutput)
}

func (o LookupLoadBalancerResultOutput) Ipv6() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) string { return v.Ipv6 }).(pulumi.StringOutput)
}

func (o LookupLoadBalancerResultOutput) LoadBalancerUrn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) string { return v.LoadBalancerUrn }).(pulumi.StringOutput)
}

func (o LookupLoadBalancerResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

func (o LookupLoadBalancerResultOutput) Network() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) string { return v.Network }).(pulumi.StringOutput)
}

func (o LookupLoadBalancerResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

func (o LookupLoadBalancerResultOutput) RedirectHttpToHttps() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) bool { return v.RedirectHttpToHttps }).(pulumi.BoolOutput)
}

func (o LookupLoadBalancerResultOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) string { return v.Region }).(pulumi.StringOutput)
}

func (o LookupLoadBalancerResultOutput) Size() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) string { return v.Size }).(pulumi.StringOutput)
}

func (o LookupLoadBalancerResultOutput) SizeUnit() pulumi.IntOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) int { return v.SizeUnit }).(pulumi.IntOutput)
}

func (o LookupLoadBalancerResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) string { return v.Status }).(pulumi.StringOutput)
}

func (o LookupLoadBalancerResultOutput) StickySessions() GetLoadBalancerStickySessionArrayOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) []GetLoadBalancerStickySession { return v.StickySessions }).(GetLoadBalancerStickySessionArrayOutput)
}

func (o LookupLoadBalancerResultOutput) TargetLoadBalancerIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) []string { return v.TargetLoadBalancerIds }).(pulumi.StringArrayOutput)
}

func (o LookupLoadBalancerResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) string { return v.Type }).(pulumi.StringOutput)
}

func (o LookupLoadBalancerResultOutput) VpcUuid() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) string { return v.VpcUuid }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupLoadBalancerResultOutput{})
}
