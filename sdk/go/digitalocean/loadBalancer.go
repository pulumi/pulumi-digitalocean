// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides a DigitalOcean Load Balancer resource. This can be used to create,
// modify, and delete Load Balancers.
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-digitalocean/blob/master/website/docs/r/loadbalancer.html.markdown.
type LoadBalancer struct {
	s *pulumi.ResourceState
}

// NewLoadBalancer registers a new resource with the given unique name, arguments, and options.
func NewLoadBalancer(ctx *pulumi.Context,
	name string, args *LoadBalancerArgs, opts ...pulumi.ResourceOpt) (*LoadBalancer, error) {
	if args == nil || args.ForwardingRules == nil {
		return nil, errors.New("missing required argument 'ForwardingRules'")
	}
	if args == nil || args.Region == nil {
		return nil, errors.New("missing required argument 'Region'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["algorithm"] = nil
		inputs["dropletIds"] = nil
		inputs["dropletTag"] = nil
		inputs["enableProxyProtocol"] = nil
		inputs["forwardingRules"] = nil
		inputs["healthcheck"] = nil
		inputs["name"] = nil
		inputs["redirectHttpToHttps"] = nil
		inputs["region"] = nil
		inputs["stickySessions"] = nil
	} else {
		inputs["algorithm"] = args.Algorithm
		inputs["dropletIds"] = args.DropletIds
		inputs["dropletTag"] = args.DropletTag
		inputs["enableProxyProtocol"] = args.EnableProxyProtocol
		inputs["forwardingRules"] = args.ForwardingRules
		inputs["healthcheck"] = args.Healthcheck
		inputs["name"] = args.Name
		inputs["redirectHttpToHttps"] = args.RedirectHttpToHttps
		inputs["region"] = args.Region
		inputs["stickySessions"] = args.StickySessions
	}
	inputs["ip"] = nil
	inputs["status"] = nil
	inputs["urn"] = nil
	s, err := ctx.RegisterResource("digitalocean:index/loadBalancer:LoadBalancer", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &LoadBalancer{s: s}, nil
}

// GetLoadBalancer gets an existing LoadBalancer resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLoadBalancer(ctx *pulumi.Context,
	name string, id pulumi.ID, state *LoadBalancerState, opts ...pulumi.ResourceOpt) (*LoadBalancer, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["algorithm"] = state.Algorithm
		inputs["dropletIds"] = state.DropletIds
		inputs["dropletTag"] = state.DropletTag
		inputs["enableProxyProtocol"] = state.EnableProxyProtocol
		inputs["forwardingRules"] = state.ForwardingRules
		inputs["healthcheck"] = state.Healthcheck
		inputs["ip"] = state.Ip
		inputs["name"] = state.Name
		inputs["redirectHttpToHttps"] = state.RedirectHttpToHttps
		inputs["region"] = state.Region
		inputs["status"] = state.Status
		inputs["stickySessions"] = state.StickySessions
		inputs["urn"] = state.Urn
	}
	s, err := ctx.ReadResource("digitalocean:index/loadBalancer:LoadBalancer", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &LoadBalancer{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *LoadBalancer) URN() *pulumi.URNOutput {
	return r.s.URN()
}

// ID is this resource's unique identifier assigned by its provider.
func (r *LoadBalancer) ID() *pulumi.IDOutput {
	return r.s.ID()
}

// The load balancing algorithm used to determine
// which backend Droplet will be selected by a client. It must be either `round_robin`
// or `least_connections`. The default value is `round_robin`.
func (r *LoadBalancer) Algorithm() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["algorithm"])
}

// A list of the IDs of each droplet to be attached to the Load Balancer.
func (r *LoadBalancer) DropletIds() *pulumi.ArrayOutput {
	return (*pulumi.ArrayOutput)(r.s.State["dropletIds"])
}

// The name of a Droplet tag corresponding to Droplets to be assigned to the Load Balancer.
func (r *LoadBalancer) DropletTag() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["dropletTag"])
}

// A boolean value indicating whether PROXY
// Protocol should be used to pass information from connecting client requests to
// the backend service. Default value is `false`.
func (r *LoadBalancer) EnableProxyProtocol() *pulumi.BoolOutput {
	return (*pulumi.BoolOutput)(r.s.State["enableProxyProtocol"])
}

// A list of `forwarding_rule` to be assigned to the
// Load Balancer. The `forwarding_rule` block is documented below.
func (r *LoadBalancer) ForwardingRules() *pulumi.ArrayOutput {
	return (*pulumi.ArrayOutput)(r.s.State["forwardingRules"])
}

// A `healthcheck` block to be assigned to the
// Load Balancer. The `healthcheck` block is documented below. Only 1 healthcheck is allowed.
func (r *LoadBalancer) Healthcheck() *pulumi.Output {
	return r.s.State["healthcheck"]
}

func (r *LoadBalancer) Ip() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["ip"])
}

// The Load Balancer name
func (r *LoadBalancer) Name() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["name"])
}

// A boolean value indicating whether
// HTTP requests to the Load Balancer on port 80 will be redirected to HTTPS on port 443.
// Default value is `false`.
func (r *LoadBalancer) RedirectHttpToHttps() *pulumi.BoolOutput {
	return (*pulumi.BoolOutput)(r.s.State["redirectHttpToHttps"])
}

// The region to start in
func (r *LoadBalancer) Region() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["region"])
}

func (r *LoadBalancer) Status() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["status"])
}

// A `sticky_sessions` block to be assigned to the
// Load Balancer. The `sticky_sessions` block is documented below. Only 1 sticky_sessions block is allowed.
func (r *LoadBalancer) StickySessions() *pulumi.Output {
	return r.s.State["stickySessions"]
}

// The uniform resource name for the Load Balancer
func (r *LoadBalancer) Urn() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["urn"])
}

// Input properties used for looking up and filtering LoadBalancer resources.
type LoadBalancerState struct {
	// The load balancing algorithm used to determine
	// which backend Droplet will be selected by a client. It must be either `round_robin`
	// or `least_connections`. The default value is `round_robin`.
	Algorithm interface{}
	// A list of the IDs of each droplet to be attached to the Load Balancer.
	DropletIds interface{}
	// The name of a Droplet tag corresponding to Droplets to be assigned to the Load Balancer.
	DropletTag interface{}
	// A boolean value indicating whether PROXY
	// Protocol should be used to pass information from connecting client requests to
	// the backend service. Default value is `false`.
	EnableProxyProtocol interface{}
	// A list of `forwarding_rule` to be assigned to the
	// Load Balancer. The `forwarding_rule` block is documented below.
	ForwardingRules interface{}
	// A `healthcheck` block to be assigned to the
	// Load Balancer. The `healthcheck` block is documented below. Only 1 healthcheck is allowed.
	Healthcheck interface{}
	Ip interface{}
	// The Load Balancer name
	Name interface{}
	// A boolean value indicating whether
	// HTTP requests to the Load Balancer on port 80 will be redirected to HTTPS on port 443.
	// Default value is `false`.
	RedirectHttpToHttps interface{}
	// The region to start in
	Region interface{}
	Status interface{}
	// A `sticky_sessions` block to be assigned to the
	// Load Balancer. The `sticky_sessions` block is documented below. Only 1 sticky_sessions block is allowed.
	StickySessions interface{}
	// The uniform resource name for the Load Balancer
	Urn interface{}
}

// The set of arguments for constructing a LoadBalancer resource.
type LoadBalancerArgs struct {
	// The load balancing algorithm used to determine
	// which backend Droplet will be selected by a client. It must be either `round_robin`
	// or `least_connections`. The default value is `round_robin`.
	Algorithm interface{}
	// A list of the IDs of each droplet to be attached to the Load Balancer.
	DropletIds interface{}
	// The name of a Droplet tag corresponding to Droplets to be assigned to the Load Balancer.
	DropletTag interface{}
	// A boolean value indicating whether PROXY
	// Protocol should be used to pass information from connecting client requests to
	// the backend service. Default value is `false`.
	EnableProxyProtocol interface{}
	// A list of `forwarding_rule` to be assigned to the
	// Load Balancer. The `forwarding_rule` block is documented below.
	ForwardingRules interface{}
	// A `healthcheck` block to be assigned to the
	// Load Balancer. The `healthcheck` block is documented below. Only 1 healthcheck is allowed.
	Healthcheck interface{}
	// The Load Balancer name
	Name interface{}
	// A boolean value indicating whether
	// HTTP requests to the Load Balancer on port 80 will be redirected to HTTPS on port 443.
	// Default value is `false`.
	RedirectHttpToHttps interface{}
	// The region to start in
	Region interface{}
	// A `sticky_sessions` block to be assigned to the
	// Load Balancer. The `sticky_sessions` block is documented below. Only 1 sticky_sessions block is allowed.
	StickySessions interface{}
}
