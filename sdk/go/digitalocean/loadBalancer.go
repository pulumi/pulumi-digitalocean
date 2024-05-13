// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-digitalocean/sdk/v4/go/digitalocean/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a DigitalOcean Load Balancer resource. This can be used to create,
// modify, and delete Load Balancers.
//
// ## Example Usage
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
//			web, err := digitalocean.NewDroplet(ctx, "web", &digitalocean.DropletArgs{
//				Name:   pulumi.String("web-1"),
//				Size:   pulumi.String(digitalocean.DropletSlugDropletS1VCPU1GB),
//				Image:  pulumi.String("ubuntu-18-04-x64"),
//				Region: pulumi.String(digitalocean.RegionNYC3),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = digitalocean.NewLoadBalancer(ctx, "public", &digitalocean.LoadBalancerArgs{
//				Name:   pulumi.String("loadbalancer-1"),
//				Region: pulumi.String(digitalocean.RegionNYC3),
//				ForwardingRules: digitalocean.LoadBalancerForwardingRuleArray{
//					&digitalocean.LoadBalancerForwardingRuleArgs{
//						EntryPort:      pulumi.Int(80),
//						EntryProtocol:  pulumi.String("http"),
//						TargetPort:     pulumi.Int(80),
//						TargetProtocol: pulumi.String("http"),
//					},
//				},
//				Healthcheck: &digitalocean.LoadBalancerHealthcheckArgs{
//					Port:     pulumi.Int(22),
//					Protocol: pulumi.String("tcp"),
//				},
//				DropletIds: pulumi.IntArray{
//					web.ID(),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// When managing certificates attached to the load balancer, make sure to add the `createBeforeDestroy`
// lifecycle property in order to ensure the certificate is correctly updated when changed. The order of
// operations will then be: `Create new certificate` > `Update loadbalancer with new certificate` ->
// `Delete old certificate`. When doing so, you must also change the name of the certificate,
// as there cannot be multiple certificates with the same name in an account.
//
// ## Import
//
// Load Balancers can be imported using the `id`, e.g.
//
// ```sh
// $ pulumi import digitalocean:index/loadBalancer:LoadBalancer myloadbalancer 4de7ac8b-495b-4884-9a69-1050c6793cd6
// ```
type LoadBalancer struct {
	pulumi.CustomResourceState

	// **Deprecated** This field has been deprecated. You can no longer specify an algorithm for load balancers.
	// or `leastConnections`. The default value is `roundRobin`.
	//
	// Deprecated: This field has been deprecated. You can no longer specify an algorithm for load balancers.
	Algorithm pulumi.StringPtrOutput `pulumi:"algorithm"`
	// A boolean value indicating whether to disable automatic DNS record creation for Let's Encrypt certificates that are added to the load balancer. Default value is `false`.
	DisableLetsEncryptDnsRecords pulumi.BoolPtrOutput `pulumi:"disableLetsEncryptDnsRecords"`
	// A list of `domains` required to ingress traffic to a Global Load Balancer. The `domains` block is documented below.
	// **NOTE**: this is a closed beta feature and not available for public use.
	Domains LoadBalancerDomainArrayOutput `pulumi:"domains"`
	// A list of the IDs of each droplet to be attached to the Load Balancer.
	DropletIds pulumi.IntArrayOutput `pulumi:"dropletIds"`
	// The name of a Droplet tag corresponding to Droplets to be assigned to the Load Balancer.
	DropletTag pulumi.StringPtrOutput `pulumi:"dropletTag"`
	// A boolean value indicating whether HTTP keepalive connections are maintained to target Droplets. Default value is `false`.
	EnableBackendKeepalive pulumi.BoolPtrOutput `pulumi:"enableBackendKeepalive"`
	// A boolean value indicating whether PROXY
	// Protocol should be used to pass information from connecting client requests to
	// the backend service. Default value is `false`.
	EnableProxyProtocol pulumi.BoolPtrOutput `pulumi:"enableProxyProtocol"`
	// A block containing rules for allowing/denying traffic to the Load Balancer. The `firewall` block is documented below. Only 1 firewall is allowed.
	Firewall LoadBalancerFirewallOutput `pulumi:"firewall"`
	// A list of `forwardingRule` to be assigned to the
	// Load Balancer. The `forwardingRule` block is documented below.
	ForwardingRules LoadBalancerForwardingRuleArrayOutput `pulumi:"forwardingRules"`
	// A block containing `glbSettings` required to define target rules for a Global Load Balancer. The `glbSettings` block is documented below.
	// **NOTE**: this is a closed beta feature and not available for public use.
	GlbSettings LoadBalancerGlbSettingsOutput `pulumi:"glbSettings"`
	// A `healthcheck` block to be assigned to the
	// Load Balancer. The `healthcheck` block is documented below. Only 1 healthcheck is allowed.
	Healthcheck LoadBalancerHealthcheckOutput `pulumi:"healthcheck"`
	// Specifies the idle timeout for HTTPS connections on the load balancer in seconds.
	HttpIdleTimeoutSeconds pulumi.IntOutput `pulumi:"httpIdleTimeoutSeconds"`
	// The ip of the Load Balancer
	Ip pulumi.StringOutput `pulumi:"ip"`
	// The uniform resource name for the Load Balancer
	LoadBalancerUrn pulumi.StringOutput `pulumi:"loadBalancerUrn"`
	// The Load Balancer name
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the project that the load balancer is associated with. If no ID is provided at creation, the load balancer associates with the user's default project.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// A boolean value indicating whether
	// HTTP requests to the Load Balancer on port 80 will be redirected to HTTPS on port 443.
	// Default value is `false`.
	RedirectHttpToHttps pulumi.BoolPtrOutput `pulumi:"redirectHttpToHttps"`
	// The region to start in
	Region pulumi.StringPtrOutput `pulumi:"region"`
	// The size of the Load Balancer. It must be either `lb-small`, `lb-medium`, or `lb-large`. Defaults to `lb-small`. Only one of `size` or `sizeUnit` may be provided.
	Size pulumi.StringPtrOutput `pulumi:"size"`
	// The size of the Load Balancer. It must be in the range (1, 100). Defaults to `1`. Only one of `size` or `sizeUnit` may be provided.
	SizeUnit pulumi.IntOutput    `pulumi:"sizeUnit"`
	Status   pulumi.StringOutput `pulumi:"status"`
	// A `stickySessions` block to be assigned to the
	// Load Balancer. The `stickySessions` block is documented below. Only 1 stickySessions block is allowed.
	StickySessions LoadBalancerStickySessionsOutput `pulumi:"stickySessions"`
	// A list of Load Balancer IDs to be attached behind a Global Load Balancer.
	// **NOTE**: this is a closed beta feature and not available for public use.
	TargetLoadBalancerIds pulumi.StringArrayOutput `pulumi:"targetLoadBalancerIds"`
	// the type of the load balancer (GLOBAL or REGIONAL)
	Type pulumi.StringPtrOutput `pulumi:"type"`
	// The ID of the VPC where the load balancer will be located.
	VpcUuid pulumi.StringOutput `pulumi:"vpcUuid"`
}

// NewLoadBalancer registers a new resource with the given unique name, arguments, and options.
func NewLoadBalancer(ctx *pulumi.Context,
	name string, args *LoadBalancerArgs, opts ...pulumi.ResourceOption) (*LoadBalancer, error) {
	if args == nil {
		args = &LoadBalancerArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource LoadBalancer
	err := ctx.RegisterResource("digitalocean:index/loadBalancer:LoadBalancer", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLoadBalancer gets an existing LoadBalancer resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLoadBalancer(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LoadBalancerState, opts ...pulumi.ResourceOption) (*LoadBalancer, error) {
	var resource LoadBalancer
	err := ctx.ReadResource("digitalocean:index/loadBalancer:LoadBalancer", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LoadBalancer resources.
type loadBalancerState struct {
	// **Deprecated** This field has been deprecated. You can no longer specify an algorithm for load balancers.
	// or `leastConnections`. The default value is `roundRobin`.
	//
	// Deprecated: This field has been deprecated. You can no longer specify an algorithm for load balancers.
	Algorithm *string `pulumi:"algorithm"`
	// A boolean value indicating whether to disable automatic DNS record creation for Let's Encrypt certificates that are added to the load balancer. Default value is `false`.
	DisableLetsEncryptDnsRecords *bool `pulumi:"disableLetsEncryptDnsRecords"`
	// A list of `domains` required to ingress traffic to a Global Load Balancer. The `domains` block is documented below.
	// **NOTE**: this is a closed beta feature and not available for public use.
	Domains []LoadBalancerDomain `pulumi:"domains"`
	// A list of the IDs of each droplet to be attached to the Load Balancer.
	DropletIds []int `pulumi:"dropletIds"`
	// The name of a Droplet tag corresponding to Droplets to be assigned to the Load Balancer.
	DropletTag *string `pulumi:"dropletTag"`
	// A boolean value indicating whether HTTP keepalive connections are maintained to target Droplets. Default value is `false`.
	EnableBackendKeepalive *bool `pulumi:"enableBackendKeepalive"`
	// A boolean value indicating whether PROXY
	// Protocol should be used to pass information from connecting client requests to
	// the backend service. Default value is `false`.
	EnableProxyProtocol *bool `pulumi:"enableProxyProtocol"`
	// A block containing rules for allowing/denying traffic to the Load Balancer. The `firewall` block is documented below. Only 1 firewall is allowed.
	Firewall *LoadBalancerFirewall `pulumi:"firewall"`
	// A list of `forwardingRule` to be assigned to the
	// Load Balancer. The `forwardingRule` block is documented below.
	ForwardingRules []LoadBalancerForwardingRule `pulumi:"forwardingRules"`
	// A block containing `glbSettings` required to define target rules for a Global Load Balancer. The `glbSettings` block is documented below.
	// **NOTE**: this is a closed beta feature and not available for public use.
	GlbSettings *LoadBalancerGlbSettings `pulumi:"glbSettings"`
	// A `healthcheck` block to be assigned to the
	// Load Balancer. The `healthcheck` block is documented below. Only 1 healthcheck is allowed.
	Healthcheck *LoadBalancerHealthcheck `pulumi:"healthcheck"`
	// Specifies the idle timeout for HTTPS connections on the load balancer in seconds.
	HttpIdleTimeoutSeconds *int `pulumi:"httpIdleTimeoutSeconds"`
	// The ip of the Load Balancer
	Ip *string `pulumi:"ip"`
	// The uniform resource name for the Load Balancer
	LoadBalancerUrn *string `pulumi:"loadBalancerUrn"`
	// The Load Balancer name
	Name *string `pulumi:"name"`
	// The ID of the project that the load balancer is associated with. If no ID is provided at creation, the load balancer associates with the user's default project.
	ProjectId *string `pulumi:"projectId"`
	// A boolean value indicating whether
	// HTTP requests to the Load Balancer on port 80 will be redirected to HTTPS on port 443.
	// Default value is `false`.
	RedirectHttpToHttps *bool `pulumi:"redirectHttpToHttps"`
	// The region to start in
	Region *string `pulumi:"region"`
	// The size of the Load Balancer. It must be either `lb-small`, `lb-medium`, or `lb-large`. Defaults to `lb-small`. Only one of `size` or `sizeUnit` may be provided.
	Size *string `pulumi:"size"`
	// The size of the Load Balancer. It must be in the range (1, 100). Defaults to `1`. Only one of `size` or `sizeUnit` may be provided.
	SizeUnit *int    `pulumi:"sizeUnit"`
	Status   *string `pulumi:"status"`
	// A `stickySessions` block to be assigned to the
	// Load Balancer. The `stickySessions` block is documented below. Only 1 stickySessions block is allowed.
	StickySessions *LoadBalancerStickySessions `pulumi:"stickySessions"`
	// A list of Load Balancer IDs to be attached behind a Global Load Balancer.
	// **NOTE**: this is a closed beta feature and not available for public use.
	TargetLoadBalancerIds []string `pulumi:"targetLoadBalancerIds"`
	// the type of the load balancer (GLOBAL or REGIONAL)
	Type *string `pulumi:"type"`
	// The ID of the VPC where the load balancer will be located.
	VpcUuid *string `pulumi:"vpcUuid"`
}

type LoadBalancerState struct {
	// **Deprecated** This field has been deprecated. You can no longer specify an algorithm for load balancers.
	// or `leastConnections`. The default value is `roundRobin`.
	//
	// Deprecated: This field has been deprecated. You can no longer specify an algorithm for load balancers.
	Algorithm pulumi.StringPtrInput
	// A boolean value indicating whether to disable automatic DNS record creation for Let's Encrypt certificates that are added to the load balancer. Default value is `false`.
	DisableLetsEncryptDnsRecords pulumi.BoolPtrInput
	// A list of `domains` required to ingress traffic to a Global Load Balancer. The `domains` block is documented below.
	// **NOTE**: this is a closed beta feature and not available for public use.
	Domains LoadBalancerDomainArrayInput
	// A list of the IDs of each droplet to be attached to the Load Balancer.
	DropletIds pulumi.IntArrayInput
	// The name of a Droplet tag corresponding to Droplets to be assigned to the Load Balancer.
	DropletTag pulumi.StringPtrInput
	// A boolean value indicating whether HTTP keepalive connections are maintained to target Droplets. Default value is `false`.
	EnableBackendKeepalive pulumi.BoolPtrInput
	// A boolean value indicating whether PROXY
	// Protocol should be used to pass information from connecting client requests to
	// the backend service. Default value is `false`.
	EnableProxyProtocol pulumi.BoolPtrInput
	// A block containing rules for allowing/denying traffic to the Load Balancer. The `firewall` block is documented below. Only 1 firewall is allowed.
	Firewall LoadBalancerFirewallPtrInput
	// A list of `forwardingRule` to be assigned to the
	// Load Balancer. The `forwardingRule` block is documented below.
	ForwardingRules LoadBalancerForwardingRuleArrayInput
	// A block containing `glbSettings` required to define target rules for a Global Load Balancer. The `glbSettings` block is documented below.
	// **NOTE**: this is a closed beta feature and not available for public use.
	GlbSettings LoadBalancerGlbSettingsPtrInput
	// A `healthcheck` block to be assigned to the
	// Load Balancer. The `healthcheck` block is documented below. Only 1 healthcheck is allowed.
	Healthcheck LoadBalancerHealthcheckPtrInput
	// Specifies the idle timeout for HTTPS connections on the load balancer in seconds.
	HttpIdleTimeoutSeconds pulumi.IntPtrInput
	// The ip of the Load Balancer
	Ip pulumi.StringPtrInput
	// The uniform resource name for the Load Balancer
	LoadBalancerUrn pulumi.StringPtrInput
	// The Load Balancer name
	Name pulumi.StringPtrInput
	// The ID of the project that the load balancer is associated with. If no ID is provided at creation, the load balancer associates with the user's default project.
	ProjectId pulumi.StringPtrInput
	// A boolean value indicating whether
	// HTTP requests to the Load Balancer on port 80 will be redirected to HTTPS on port 443.
	// Default value is `false`.
	RedirectHttpToHttps pulumi.BoolPtrInput
	// The region to start in
	Region pulumi.StringPtrInput
	// The size of the Load Balancer. It must be either `lb-small`, `lb-medium`, or `lb-large`. Defaults to `lb-small`. Only one of `size` or `sizeUnit` may be provided.
	Size pulumi.StringPtrInput
	// The size of the Load Balancer. It must be in the range (1, 100). Defaults to `1`. Only one of `size` or `sizeUnit` may be provided.
	SizeUnit pulumi.IntPtrInput
	Status   pulumi.StringPtrInput
	// A `stickySessions` block to be assigned to the
	// Load Balancer. The `stickySessions` block is documented below. Only 1 stickySessions block is allowed.
	StickySessions LoadBalancerStickySessionsPtrInput
	// A list of Load Balancer IDs to be attached behind a Global Load Balancer.
	// **NOTE**: this is a closed beta feature and not available for public use.
	TargetLoadBalancerIds pulumi.StringArrayInput
	// the type of the load balancer (GLOBAL or REGIONAL)
	Type pulumi.StringPtrInput
	// The ID of the VPC where the load balancer will be located.
	VpcUuid pulumi.StringPtrInput
}

func (LoadBalancerState) ElementType() reflect.Type {
	return reflect.TypeOf((*loadBalancerState)(nil)).Elem()
}

type loadBalancerArgs struct {
	// **Deprecated** This field has been deprecated. You can no longer specify an algorithm for load balancers.
	// or `leastConnections`. The default value is `roundRobin`.
	//
	// Deprecated: This field has been deprecated. You can no longer specify an algorithm for load balancers.
	Algorithm *string `pulumi:"algorithm"`
	// A boolean value indicating whether to disable automatic DNS record creation for Let's Encrypt certificates that are added to the load balancer. Default value is `false`.
	DisableLetsEncryptDnsRecords *bool `pulumi:"disableLetsEncryptDnsRecords"`
	// A list of `domains` required to ingress traffic to a Global Load Balancer. The `domains` block is documented below.
	// **NOTE**: this is a closed beta feature and not available for public use.
	Domains []LoadBalancerDomain `pulumi:"domains"`
	// A list of the IDs of each droplet to be attached to the Load Balancer.
	DropletIds []int `pulumi:"dropletIds"`
	// The name of a Droplet tag corresponding to Droplets to be assigned to the Load Balancer.
	DropletTag *string `pulumi:"dropletTag"`
	// A boolean value indicating whether HTTP keepalive connections are maintained to target Droplets. Default value is `false`.
	EnableBackendKeepalive *bool `pulumi:"enableBackendKeepalive"`
	// A boolean value indicating whether PROXY
	// Protocol should be used to pass information from connecting client requests to
	// the backend service. Default value is `false`.
	EnableProxyProtocol *bool `pulumi:"enableProxyProtocol"`
	// A block containing rules for allowing/denying traffic to the Load Balancer. The `firewall` block is documented below. Only 1 firewall is allowed.
	Firewall *LoadBalancerFirewall `pulumi:"firewall"`
	// A list of `forwardingRule` to be assigned to the
	// Load Balancer. The `forwardingRule` block is documented below.
	ForwardingRules []LoadBalancerForwardingRule `pulumi:"forwardingRules"`
	// A block containing `glbSettings` required to define target rules for a Global Load Balancer. The `glbSettings` block is documented below.
	// **NOTE**: this is a closed beta feature and not available for public use.
	GlbSettings *LoadBalancerGlbSettings `pulumi:"glbSettings"`
	// A `healthcheck` block to be assigned to the
	// Load Balancer. The `healthcheck` block is documented below. Only 1 healthcheck is allowed.
	Healthcheck *LoadBalancerHealthcheck `pulumi:"healthcheck"`
	// Specifies the idle timeout for HTTPS connections on the load balancer in seconds.
	HttpIdleTimeoutSeconds *int `pulumi:"httpIdleTimeoutSeconds"`
	// The Load Balancer name
	Name *string `pulumi:"name"`
	// The ID of the project that the load balancer is associated with. If no ID is provided at creation, the load balancer associates with the user's default project.
	ProjectId *string `pulumi:"projectId"`
	// A boolean value indicating whether
	// HTTP requests to the Load Balancer on port 80 will be redirected to HTTPS on port 443.
	// Default value is `false`.
	RedirectHttpToHttps *bool `pulumi:"redirectHttpToHttps"`
	// The region to start in
	Region *string `pulumi:"region"`
	// The size of the Load Balancer. It must be either `lb-small`, `lb-medium`, or `lb-large`. Defaults to `lb-small`. Only one of `size` or `sizeUnit` may be provided.
	Size *string `pulumi:"size"`
	// The size of the Load Balancer. It must be in the range (1, 100). Defaults to `1`. Only one of `size` or `sizeUnit` may be provided.
	SizeUnit *int `pulumi:"sizeUnit"`
	// A `stickySessions` block to be assigned to the
	// Load Balancer. The `stickySessions` block is documented below. Only 1 stickySessions block is allowed.
	StickySessions *LoadBalancerStickySessions `pulumi:"stickySessions"`
	// A list of Load Balancer IDs to be attached behind a Global Load Balancer.
	// **NOTE**: this is a closed beta feature and not available for public use.
	TargetLoadBalancerIds []string `pulumi:"targetLoadBalancerIds"`
	// the type of the load balancer (GLOBAL or REGIONAL)
	Type *string `pulumi:"type"`
	// The ID of the VPC where the load balancer will be located.
	VpcUuid *string `pulumi:"vpcUuid"`
}

// The set of arguments for constructing a LoadBalancer resource.
type LoadBalancerArgs struct {
	// **Deprecated** This field has been deprecated. You can no longer specify an algorithm for load balancers.
	// or `leastConnections`. The default value is `roundRobin`.
	//
	// Deprecated: This field has been deprecated. You can no longer specify an algorithm for load balancers.
	Algorithm pulumi.StringPtrInput
	// A boolean value indicating whether to disable automatic DNS record creation for Let's Encrypt certificates that are added to the load balancer. Default value is `false`.
	DisableLetsEncryptDnsRecords pulumi.BoolPtrInput
	// A list of `domains` required to ingress traffic to a Global Load Balancer. The `domains` block is documented below.
	// **NOTE**: this is a closed beta feature and not available for public use.
	Domains LoadBalancerDomainArrayInput
	// A list of the IDs of each droplet to be attached to the Load Balancer.
	DropletIds pulumi.IntArrayInput
	// The name of a Droplet tag corresponding to Droplets to be assigned to the Load Balancer.
	DropletTag pulumi.StringPtrInput
	// A boolean value indicating whether HTTP keepalive connections are maintained to target Droplets. Default value is `false`.
	EnableBackendKeepalive pulumi.BoolPtrInput
	// A boolean value indicating whether PROXY
	// Protocol should be used to pass information from connecting client requests to
	// the backend service. Default value is `false`.
	EnableProxyProtocol pulumi.BoolPtrInput
	// A block containing rules for allowing/denying traffic to the Load Balancer. The `firewall` block is documented below. Only 1 firewall is allowed.
	Firewall LoadBalancerFirewallPtrInput
	// A list of `forwardingRule` to be assigned to the
	// Load Balancer. The `forwardingRule` block is documented below.
	ForwardingRules LoadBalancerForwardingRuleArrayInput
	// A block containing `glbSettings` required to define target rules for a Global Load Balancer. The `glbSettings` block is documented below.
	// **NOTE**: this is a closed beta feature and not available for public use.
	GlbSettings LoadBalancerGlbSettingsPtrInput
	// A `healthcheck` block to be assigned to the
	// Load Balancer. The `healthcheck` block is documented below. Only 1 healthcheck is allowed.
	Healthcheck LoadBalancerHealthcheckPtrInput
	// Specifies the idle timeout for HTTPS connections on the load balancer in seconds.
	HttpIdleTimeoutSeconds pulumi.IntPtrInput
	// The Load Balancer name
	Name pulumi.StringPtrInput
	// The ID of the project that the load balancer is associated with. If no ID is provided at creation, the load balancer associates with the user's default project.
	ProjectId pulumi.StringPtrInput
	// A boolean value indicating whether
	// HTTP requests to the Load Balancer on port 80 will be redirected to HTTPS on port 443.
	// Default value is `false`.
	RedirectHttpToHttps pulumi.BoolPtrInput
	// The region to start in
	Region pulumi.StringPtrInput
	// The size of the Load Balancer. It must be either `lb-small`, `lb-medium`, or `lb-large`. Defaults to `lb-small`. Only one of `size` or `sizeUnit` may be provided.
	Size pulumi.StringPtrInput
	// The size of the Load Balancer. It must be in the range (1, 100). Defaults to `1`. Only one of `size` or `sizeUnit` may be provided.
	SizeUnit pulumi.IntPtrInput
	// A `stickySessions` block to be assigned to the
	// Load Balancer. The `stickySessions` block is documented below. Only 1 stickySessions block is allowed.
	StickySessions LoadBalancerStickySessionsPtrInput
	// A list of Load Balancer IDs to be attached behind a Global Load Balancer.
	// **NOTE**: this is a closed beta feature and not available for public use.
	TargetLoadBalancerIds pulumi.StringArrayInput
	// the type of the load balancer (GLOBAL or REGIONAL)
	Type pulumi.StringPtrInput
	// The ID of the VPC where the load balancer will be located.
	VpcUuid pulumi.StringPtrInput
}

func (LoadBalancerArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*loadBalancerArgs)(nil)).Elem()
}

type LoadBalancerInput interface {
	pulumi.Input

	ToLoadBalancerOutput() LoadBalancerOutput
	ToLoadBalancerOutputWithContext(ctx context.Context) LoadBalancerOutput
}

func (*LoadBalancer) ElementType() reflect.Type {
	return reflect.TypeOf((**LoadBalancer)(nil)).Elem()
}

func (i *LoadBalancer) ToLoadBalancerOutput() LoadBalancerOutput {
	return i.ToLoadBalancerOutputWithContext(context.Background())
}

func (i *LoadBalancer) ToLoadBalancerOutputWithContext(ctx context.Context) LoadBalancerOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoadBalancerOutput)
}

// LoadBalancerArrayInput is an input type that accepts LoadBalancerArray and LoadBalancerArrayOutput values.
// You can construct a concrete instance of `LoadBalancerArrayInput` via:
//
//	LoadBalancerArray{ LoadBalancerArgs{...} }
type LoadBalancerArrayInput interface {
	pulumi.Input

	ToLoadBalancerArrayOutput() LoadBalancerArrayOutput
	ToLoadBalancerArrayOutputWithContext(context.Context) LoadBalancerArrayOutput
}

type LoadBalancerArray []LoadBalancerInput

func (LoadBalancerArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LoadBalancer)(nil)).Elem()
}

func (i LoadBalancerArray) ToLoadBalancerArrayOutput() LoadBalancerArrayOutput {
	return i.ToLoadBalancerArrayOutputWithContext(context.Background())
}

func (i LoadBalancerArray) ToLoadBalancerArrayOutputWithContext(ctx context.Context) LoadBalancerArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoadBalancerArrayOutput)
}

// LoadBalancerMapInput is an input type that accepts LoadBalancerMap and LoadBalancerMapOutput values.
// You can construct a concrete instance of `LoadBalancerMapInput` via:
//
//	LoadBalancerMap{ "key": LoadBalancerArgs{...} }
type LoadBalancerMapInput interface {
	pulumi.Input

	ToLoadBalancerMapOutput() LoadBalancerMapOutput
	ToLoadBalancerMapOutputWithContext(context.Context) LoadBalancerMapOutput
}

type LoadBalancerMap map[string]LoadBalancerInput

func (LoadBalancerMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LoadBalancer)(nil)).Elem()
}

func (i LoadBalancerMap) ToLoadBalancerMapOutput() LoadBalancerMapOutput {
	return i.ToLoadBalancerMapOutputWithContext(context.Background())
}

func (i LoadBalancerMap) ToLoadBalancerMapOutputWithContext(ctx context.Context) LoadBalancerMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoadBalancerMapOutput)
}

type LoadBalancerOutput struct{ *pulumi.OutputState }

func (LoadBalancerOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LoadBalancer)(nil)).Elem()
}

func (o LoadBalancerOutput) ToLoadBalancerOutput() LoadBalancerOutput {
	return o
}

func (o LoadBalancerOutput) ToLoadBalancerOutputWithContext(ctx context.Context) LoadBalancerOutput {
	return o
}

// **Deprecated** This field has been deprecated. You can no longer specify an algorithm for load balancers.
// or `leastConnections`. The default value is `roundRobin`.
//
// Deprecated: This field has been deprecated. You can no longer specify an algorithm for load balancers.
func (o LoadBalancerOutput) Algorithm() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LoadBalancer) pulumi.StringPtrOutput { return v.Algorithm }).(pulumi.StringPtrOutput)
}

// A boolean value indicating whether to disable automatic DNS record creation for Let's Encrypt certificates that are added to the load balancer. Default value is `false`.
func (o LoadBalancerOutput) DisableLetsEncryptDnsRecords() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *LoadBalancer) pulumi.BoolPtrOutput { return v.DisableLetsEncryptDnsRecords }).(pulumi.BoolPtrOutput)
}

// A list of `domains` required to ingress traffic to a Global Load Balancer. The `domains` block is documented below.
// **NOTE**: this is a closed beta feature and not available for public use.
func (o LoadBalancerOutput) Domains() LoadBalancerDomainArrayOutput {
	return o.ApplyT(func(v *LoadBalancer) LoadBalancerDomainArrayOutput { return v.Domains }).(LoadBalancerDomainArrayOutput)
}

// A list of the IDs of each droplet to be attached to the Load Balancer.
func (o LoadBalancerOutput) DropletIds() pulumi.IntArrayOutput {
	return o.ApplyT(func(v *LoadBalancer) pulumi.IntArrayOutput { return v.DropletIds }).(pulumi.IntArrayOutput)
}

// The name of a Droplet tag corresponding to Droplets to be assigned to the Load Balancer.
func (o LoadBalancerOutput) DropletTag() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LoadBalancer) pulumi.StringPtrOutput { return v.DropletTag }).(pulumi.StringPtrOutput)
}

// A boolean value indicating whether HTTP keepalive connections are maintained to target Droplets. Default value is `false`.
func (o LoadBalancerOutput) EnableBackendKeepalive() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *LoadBalancer) pulumi.BoolPtrOutput { return v.EnableBackendKeepalive }).(pulumi.BoolPtrOutput)
}

// A boolean value indicating whether PROXY
// Protocol should be used to pass information from connecting client requests to
// the backend service. Default value is `false`.
func (o LoadBalancerOutput) EnableProxyProtocol() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *LoadBalancer) pulumi.BoolPtrOutput { return v.EnableProxyProtocol }).(pulumi.BoolPtrOutput)
}

// A block containing rules for allowing/denying traffic to the Load Balancer. The `firewall` block is documented below. Only 1 firewall is allowed.
func (o LoadBalancerOutput) Firewall() LoadBalancerFirewallOutput {
	return o.ApplyT(func(v *LoadBalancer) LoadBalancerFirewallOutput { return v.Firewall }).(LoadBalancerFirewallOutput)
}

// A list of `forwardingRule` to be assigned to the
// Load Balancer. The `forwardingRule` block is documented below.
func (o LoadBalancerOutput) ForwardingRules() LoadBalancerForwardingRuleArrayOutput {
	return o.ApplyT(func(v *LoadBalancer) LoadBalancerForwardingRuleArrayOutput { return v.ForwardingRules }).(LoadBalancerForwardingRuleArrayOutput)
}

// A block containing `glbSettings` required to define target rules for a Global Load Balancer. The `glbSettings` block is documented below.
// **NOTE**: this is a closed beta feature and not available for public use.
func (o LoadBalancerOutput) GlbSettings() LoadBalancerGlbSettingsOutput {
	return o.ApplyT(func(v *LoadBalancer) LoadBalancerGlbSettingsOutput { return v.GlbSettings }).(LoadBalancerGlbSettingsOutput)
}

// A `healthcheck` block to be assigned to the
// Load Balancer. The `healthcheck` block is documented below. Only 1 healthcheck is allowed.
func (o LoadBalancerOutput) Healthcheck() LoadBalancerHealthcheckOutput {
	return o.ApplyT(func(v *LoadBalancer) LoadBalancerHealthcheckOutput { return v.Healthcheck }).(LoadBalancerHealthcheckOutput)
}

// Specifies the idle timeout for HTTPS connections on the load balancer in seconds.
func (o LoadBalancerOutput) HttpIdleTimeoutSeconds() pulumi.IntOutput {
	return o.ApplyT(func(v *LoadBalancer) pulumi.IntOutput { return v.HttpIdleTimeoutSeconds }).(pulumi.IntOutput)
}

// The ip of the Load Balancer
func (o LoadBalancerOutput) Ip() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadBalancer) pulumi.StringOutput { return v.Ip }).(pulumi.StringOutput)
}

// The uniform resource name for the Load Balancer
func (o LoadBalancerOutput) LoadBalancerUrn() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadBalancer) pulumi.StringOutput { return v.LoadBalancerUrn }).(pulumi.StringOutput)
}

// The Load Balancer name
func (o LoadBalancerOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadBalancer) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the project that the load balancer is associated with. If no ID is provided at creation, the load balancer associates with the user's default project.
func (o LoadBalancerOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadBalancer) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

// A boolean value indicating whether
// HTTP requests to the Load Balancer on port 80 will be redirected to HTTPS on port 443.
// Default value is `false`.
func (o LoadBalancerOutput) RedirectHttpToHttps() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *LoadBalancer) pulumi.BoolPtrOutput { return v.RedirectHttpToHttps }).(pulumi.BoolPtrOutput)
}

// The region to start in
func (o LoadBalancerOutput) Region() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LoadBalancer) pulumi.StringPtrOutput { return v.Region }).(pulumi.StringPtrOutput)
}

// The size of the Load Balancer. It must be either `lb-small`, `lb-medium`, or `lb-large`. Defaults to `lb-small`. Only one of `size` or `sizeUnit` may be provided.
func (o LoadBalancerOutput) Size() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LoadBalancer) pulumi.StringPtrOutput { return v.Size }).(pulumi.StringPtrOutput)
}

// The size of the Load Balancer. It must be in the range (1, 100). Defaults to `1`. Only one of `size` or `sizeUnit` may be provided.
func (o LoadBalancerOutput) SizeUnit() pulumi.IntOutput {
	return o.ApplyT(func(v *LoadBalancer) pulumi.IntOutput { return v.SizeUnit }).(pulumi.IntOutput)
}

func (o LoadBalancerOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadBalancer) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// A `stickySessions` block to be assigned to the
// Load Balancer. The `stickySessions` block is documented below. Only 1 stickySessions block is allowed.
func (o LoadBalancerOutput) StickySessions() LoadBalancerStickySessionsOutput {
	return o.ApplyT(func(v *LoadBalancer) LoadBalancerStickySessionsOutput { return v.StickySessions }).(LoadBalancerStickySessionsOutput)
}

// A list of Load Balancer IDs to be attached behind a Global Load Balancer.
// **NOTE**: this is a closed beta feature and not available for public use.
func (o LoadBalancerOutput) TargetLoadBalancerIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *LoadBalancer) pulumi.StringArrayOutput { return v.TargetLoadBalancerIds }).(pulumi.StringArrayOutput)
}

// the type of the load balancer (GLOBAL or REGIONAL)
func (o LoadBalancerOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LoadBalancer) pulumi.StringPtrOutput { return v.Type }).(pulumi.StringPtrOutput)
}

// The ID of the VPC where the load balancer will be located.
func (o LoadBalancerOutput) VpcUuid() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadBalancer) pulumi.StringOutput { return v.VpcUuid }).(pulumi.StringOutput)
}

type LoadBalancerArrayOutput struct{ *pulumi.OutputState }

func (LoadBalancerArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LoadBalancer)(nil)).Elem()
}

func (o LoadBalancerArrayOutput) ToLoadBalancerArrayOutput() LoadBalancerArrayOutput {
	return o
}

func (o LoadBalancerArrayOutput) ToLoadBalancerArrayOutputWithContext(ctx context.Context) LoadBalancerArrayOutput {
	return o
}

func (o LoadBalancerArrayOutput) Index(i pulumi.IntInput) LoadBalancerOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LoadBalancer {
		return vs[0].([]*LoadBalancer)[vs[1].(int)]
	}).(LoadBalancerOutput)
}

type LoadBalancerMapOutput struct{ *pulumi.OutputState }

func (LoadBalancerMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LoadBalancer)(nil)).Elem()
}

func (o LoadBalancerMapOutput) ToLoadBalancerMapOutput() LoadBalancerMapOutput {
	return o
}

func (o LoadBalancerMapOutput) ToLoadBalancerMapOutputWithContext(ctx context.Context) LoadBalancerMapOutput {
	return o
}

func (o LoadBalancerMapOutput) MapIndex(k pulumi.StringInput) LoadBalancerOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LoadBalancer {
		return vs[0].(map[string]*LoadBalancer)[vs[1].(string)]
	}).(LoadBalancerOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LoadBalancerInput)(nil)).Elem(), &LoadBalancer{})
	pulumi.RegisterInputType(reflect.TypeOf((*LoadBalancerArrayInput)(nil)).Elem(), LoadBalancerArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LoadBalancerMapInput)(nil)).Elem(), LoadBalancerMap{})
	pulumi.RegisterOutputType(LoadBalancerOutput{})
	pulumi.RegisterOutputType(LoadBalancerArrayOutput{})
	pulumi.RegisterOutputType(LoadBalancerMapOutput{})
}
