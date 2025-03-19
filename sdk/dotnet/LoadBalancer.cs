// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean
{
    /// <summary>
    /// Provides a DigitalOcean Load Balancer resource. This can be used to create,
    /// modify, and delete Load Balancers.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using DigitalOcean = Pulumi.DigitalOcean;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var web = new DigitalOcean.Droplet("web", new()
    ///     {
    ///         Name = "web-1",
    ///         Size = DigitalOcean.DropletSlug.DropletS1VCPU1GB,
    ///         Image = "ubuntu-18-04-x64",
    ///         Region = DigitalOcean.Region.NYC3,
    ///     });
    /// 
    ///     var @public = new DigitalOcean.LoadBalancer("public", new()
    ///     {
    ///         Name = "loadbalancer-1",
    ///         Region = DigitalOcean.Region.NYC3,
    ///         ForwardingRules = new[]
    ///         {
    ///             new DigitalOcean.Inputs.LoadBalancerForwardingRuleArgs
    ///             {
    ///                 EntryPort = 80,
    ///                 EntryProtocol = "http",
    ///                 TargetPort = 80,
    ///                 TargetProtocol = "http",
    ///             },
    ///         },
    ///         Healthcheck = new DigitalOcean.Inputs.LoadBalancerHealthcheckArgs
    ///         {
    ///             Port = 22,
    ///             Protocol = "tcp",
    ///         },
    ///         DropletIds = new[]
    ///         {
    ///             web.Id,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// When managing certificates attached to the load balancer, make sure to add the `create_before_destroy`
    /// lifecycle property in order to ensure the certificate is correctly updated when changed. The order of
    /// operations will then be: `Create new certificate` &gt; `Update loadbalancer with new certificate` -&gt;
    /// `Delete old certificate`. When doing so, you must also change the name of the certificate,
    /// as there cannot be multiple certificates with the same name in an account.
    /// 
    /// ## Import
    /// 
    /// Load Balancers can be imported using the `id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import digitalocean:index/loadBalancer:LoadBalancer myloadbalancer 4de7ac8b-495b-4884-9a69-1050c6793cd6
    /// ```
    /// </summary>
    [DigitalOceanResourceType("digitalocean:index/loadBalancer:LoadBalancer")]
    public partial class LoadBalancer : global::Pulumi.CustomResource
    {
        /// <summary>
        /// **Deprecated** This field has been deprecated. You can no longer specify an algorithm for load balancers.
        /// or `least_connections`. The default value is `round_robin`.
        /// </summary>
        [Output("algorithm")]
        public Output<string?> Algorithm { get; private set; } = null!;

        /// <summary>
        /// A boolean value indicating whether to disable automatic DNS record creation for Let's Encrypt certificates that are added to the load balancer. Default value is `false`.
        /// </summary>
        [Output("disableLetsEncryptDnsRecords")]
        public Output<bool?> DisableLetsEncryptDnsRecords { get; private set; } = null!;

        /// <summary>
        /// A list of `domains` required to ingress traffic to a Global Load Balancer. The `domains` block is documented below.
        /// </summary>
        [Output("domains")]
        public Output<ImmutableArray<Outputs.LoadBalancerDomain>> Domains { get; private set; } = null!;

        /// <summary>
        /// A list of the IDs of each droplet to be attached to the Load Balancer.
        /// </summary>
        [Output("dropletIds")]
        public Output<ImmutableArray<int>> DropletIds { get; private set; } = null!;

        /// <summary>
        /// The name of a Droplet tag corresponding to Droplets to be assigned to the Load Balancer.
        /// </summary>
        [Output("dropletTag")]
        public Output<string?> DropletTag { get; private set; } = null!;

        /// <summary>
        /// A boolean value indicating whether HTTP keepalive connections are maintained to target Droplets. Default value is `false`.
        /// </summary>
        [Output("enableBackendKeepalive")]
        public Output<bool?> EnableBackendKeepalive { get; private set; } = null!;

        /// <summary>
        /// A boolean value indicating whether PROXY
        /// Protocol should be used to pass information from connecting client requests to
        /// the backend service. Default value is `false`.
        /// </summary>
        [Output("enableProxyProtocol")]
        public Output<bool?> EnableProxyProtocol { get; private set; } = null!;

        /// <summary>
        /// A block containing rules for allowing/denying traffic to the Load Balancer. The `firewall` block is documented below. Only 1 firewall is allowed.
        /// </summary>
        [Output("firewall")]
        public Output<Outputs.LoadBalancerFirewall> Firewall { get; private set; } = null!;

        /// <summary>
        /// A list of `forwarding_rule` to be assigned to the
        /// Load Balancer. The `forwarding_rule` block is documented below.
        /// </summary>
        [Output("forwardingRules")]
        public Output<ImmutableArray<Outputs.LoadBalancerForwardingRule>> ForwardingRules { get; private set; } = null!;

        /// <summary>
        /// A block containing `glb_settings` required to define target rules for a Global Load Balancer. The `glb_settings` block is documented below.
        /// </summary>
        [Output("glbSettings")]
        public Output<Outputs.LoadBalancerGlbSettings> GlbSettings { get; private set; } = null!;

        /// <summary>
        /// A `healthcheck` block to be assigned to the
        /// Load Balancer. The `healthcheck` block is documented below. Only 1 healthcheck is allowed.
        /// </summary>
        [Output("healthcheck")]
        public Output<Outputs.LoadBalancerHealthcheck> Healthcheck { get; private set; } = null!;

        /// <summary>
        /// Specifies the idle timeout for HTTPS connections on the load balancer in seconds.
        /// </summary>
        [Output("httpIdleTimeoutSeconds")]
        public Output<int> HttpIdleTimeoutSeconds { get; private set; } = null!;

        /// <summary>
        /// The ip of the Load Balancer
        /// </summary>
        [Output("ip")]
        public Output<string> Ip { get; private set; } = null!;

        [Output("ipv6")]
        public Output<string> Ipv6 { get; private set; } = null!;

        /// <summary>
        /// The uniform resource name for the Load Balancer
        /// </summary>
        [Output("loadBalancerUrn")]
        public Output<string> LoadBalancerUrn { get; private set; } = null!;

        /// <summary>
        /// The Load Balancer name
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The type of network the Load Balancer is accessible from. It must be either of `INTERNAL` or `EXTERNAL`. Defaults to `EXTERNAL`.
        /// </summary>
        [Output("network")]
        public Output<string?> Network { get; private set; } = null!;

        /// <summary>
        /// The network stack determines the allocation of ipv4/ipv6 addresses to the load balancer. It must be either of `IPV4` or `DUALSTACK`. Defaults to `IPV4`.
        /// **NOTE**: this feature is in private preview, and may not be available for public use
        /// </summary>
        [Output("networkStack")]
        public Output<string?> NetworkStack { get; private set; } = null!;

        /// <summary>
        /// The ID of the project that the load balancer is associated with. If no ID is provided at creation, the load balancer associates with the user's default project.
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// A boolean value indicating whether
        /// HTTP requests to the Load Balancer on port 80 will be redirected to HTTPS on port 443.
        /// Default value is `false`.
        /// </summary>
        [Output("redirectHttpToHttps")]
        public Output<bool?> RedirectHttpToHttps { get; private set; } = null!;

        /// <summary>
        /// The region to start in
        /// </summary>
        [Output("region")]
        public Output<string?> Region { get; private set; } = null!;

        /// <summary>
        /// The size of the Load Balancer. It must be either `lb-small`, `lb-medium`, or `lb-large`. Defaults to `lb-small`. Only one of `size` or `size_unit` may be provided.
        /// </summary>
        [Output("size")]
        public Output<string?> Size { get; private set; } = null!;

        /// <summary>
        /// The size of the Load Balancer. It must be in the range (1, 200). Defaults to `1`. Only one of `size` or `size_unit` may be provided.
        /// </summary>
        [Output("sizeUnit")]
        public Output<int> SizeUnit { get; private set; } = null!;

        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// A `sticky_sessions` block to be assigned to the
        /// Load Balancer. The `sticky_sessions` block is documented below. Only 1 sticky_sessions block is allowed.
        /// </summary>
        [Output("stickySessions")]
        public Output<Outputs.LoadBalancerStickySessions> StickySessions { get; private set; } = null!;

        /// <summary>
        /// A list of Load Balancer IDs to be attached behind a Global Load Balancer.
        /// </summary>
        [Output("targetLoadBalancerIds")]
        public Output<ImmutableArray<string>> TargetLoadBalancerIds { get; private set; } = null!;

        /// <summary>
        /// The type of the Load Balancer. It must be either of `REGIONAL`, `REGIONAL_NETWORK`, or `GLOBAL`. Defaults to `REGIONAL`.
        /// **NOTE**: non-`REGIONAL/GLOBAL` type may be part of closed beta feature and not available for public use.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// The ID of the VPC where the load balancer will be located.
        /// </summary>
        [Output("vpcUuid")]
        public Output<string> VpcUuid { get; private set; } = null!;


        /// <summary>
        /// Create a LoadBalancer resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LoadBalancer(string name, LoadBalancerArgs? args = null, CustomResourceOptions? options = null)
            : base("digitalocean:index/loadBalancer:LoadBalancer", name, args ?? new LoadBalancerArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LoadBalancer(string name, Input<string> id, LoadBalancerState? state = null, CustomResourceOptions? options = null)
            : base("digitalocean:index/loadBalancer:LoadBalancer", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing LoadBalancer resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LoadBalancer Get(string name, Input<string> id, LoadBalancerState? state = null, CustomResourceOptions? options = null)
        {
            return new LoadBalancer(name, id, state, options);
        }
    }

    public sealed class LoadBalancerArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// **Deprecated** This field has been deprecated. You can no longer specify an algorithm for load balancers.
        /// or `least_connections`. The default value is `round_robin`.
        /// </summary>
        [Input("algorithm")]
        public InputUnion<string, Pulumi.DigitalOcean.Algorithm>? Algorithm { get; set; }

        /// <summary>
        /// A boolean value indicating whether to disable automatic DNS record creation for Let's Encrypt certificates that are added to the load balancer. Default value is `false`.
        /// </summary>
        [Input("disableLetsEncryptDnsRecords")]
        public Input<bool>? DisableLetsEncryptDnsRecords { get; set; }

        [Input("domains")]
        private InputList<Inputs.LoadBalancerDomainArgs>? _domains;

        /// <summary>
        /// A list of `domains` required to ingress traffic to a Global Load Balancer. The `domains` block is documented below.
        /// </summary>
        public InputList<Inputs.LoadBalancerDomainArgs> Domains
        {
            get => _domains ?? (_domains = new InputList<Inputs.LoadBalancerDomainArgs>());
            set => _domains = value;
        }

        [Input("dropletIds")]
        private InputList<int>? _dropletIds;

        /// <summary>
        /// A list of the IDs of each droplet to be attached to the Load Balancer.
        /// </summary>
        public InputList<int> DropletIds
        {
            get => _dropletIds ?? (_dropletIds = new InputList<int>());
            set => _dropletIds = value;
        }

        /// <summary>
        /// The name of a Droplet tag corresponding to Droplets to be assigned to the Load Balancer.
        /// </summary>
        [Input("dropletTag")]
        public Input<string>? DropletTag { get; set; }

        /// <summary>
        /// A boolean value indicating whether HTTP keepalive connections are maintained to target Droplets. Default value is `false`.
        /// </summary>
        [Input("enableBackendKeepalive")]
        public Input<bool>? EnableBackendKeepalive { get; set; }

        /// <summary>
        /// A boolean value indicating whether PROXY
        /// Protocol should be used to pass information from connecting client requests to
        /// the backend service. Default value is `false`.
        /// </summary>
        [Input("enableProxyProtocol")]
        public Input<bool>? EnableProxyProtocol { get; set; }

        /// <summary>
        /// A block containing rules for allowing/denying traffic to the Load Balancer. The `firewall` block is documented below. Only 1 firewall is allowed.
        /// </summary>
        [Input("firewall")]
        public Input<Inputs.LoadBalancerFirewallArgs>? Firewall { get; set; }

        [Input("forwardingRules")]
        private InputList<Inputs.LoadBalancerForwardingRuleArgs>? _forwardingRules;

        /// <summary>
        /// A list of `forwarding_rule` to be assigned to the
        /// Load Balancer. The `forwarding_rule` block is documented below.
        /// </summary>
        public InputList<Inputs.LoadBalancerForwardingRuleArgs> ForwardingRules
        {
            get => _forwardingRules ?? (_forwardingRules = new InputList<Inputs.LoadBalancerForwardingRuleArgs>());
            set => _forwardingRules = value;
        }

        /// <summary>
        /// A block containing `glb_settings` required to define target rules for a Global Load Balancer. The `glb_settings` block is documented below.
        /// </summary>
        [Input("glbSettings")]
        public Input<Inputs.LoadBalancerGlbSettingsArgs>? GlbSettings { get; set; }

        /// <summary>
        /// A `healthcheck` block to be assigned to the
        /// Load Balancer. The `healthcheck` block is documented below. Only 1 healthcheck is allowed.
        /// </summary>
        [Input("healthcheck")]
        public Input<Inputs.LoadBalancerHealthcheckArgs>? Healthcheck { get; set; }

        /// <summary>
        /// Specifies the idle timeout for HTTPS connections on the load balancer in seconds.
        /// </summary>
        [Input("httpIdleTimeoutSeconds")]
        public Input<int>? HttpIdleTimeoutSeconds { get; set; }

        /// <summary>
        /// The Load Balancer name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The type of network the Load Balancer is accessible from. It must be either of `INTERNAL` or `EXTERNAL`. Defaults to `EXTERNAL`.
        /// </summary>
        [Input("network")]
        public Input<string>? Network { get; set; }

        /// <summary>
        /// The network stack determines the allocation of ipv4/ipv6 addresses to the load balancer. It must be either of `IPV4` or `DUALSTACK`. Defaults to `IPV4`.
        /// **NOTE**: this feature is in private preview, and may not be available for public use
        /// </summary>
        [Input("networkStack")]
        public Input<string>? NetworkStack { get; set; }

        /// <summary>
        /// The ID of the project that the load balancer is associated with. If no ID is provided at creation, the load balancer associates with the user's default project.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// A boolean value indicating whether
        /// HTTP requests to the Load Balancer on port 80 will be redirected to HTTPS on port 443.
        /// Default value is `false`.
        /// </summary>
        [Input("redirectHttpToHttps")]
        public Input<bool>? RedirectHttpToHttps { get; set; }

        /// <summary>
        /// The region to start in
        /// </summary>
        [Input("region")]
        public InputUnion<string, Pulumi.DigitalOcean.Region>? Region { get; set; }

        /// <summary>
        /// The size of the Load Balancer. It must be either `lb-small`, `lb-medium`, or `lb-large`. Defaults to `lb-small`. Only one of `size` or `size_unit` may be provided.
        /// </summary>
        [Input("size")]
        public Input<string>? Size { get; set; }

        /// <summary>
        /// The size of the Load Balancer. It must be in the range (1, 200). Defaults to `1`. Only one of `size` or `size_unit` may be provided.
        /// </summary>
        [Input("sizeUnit")]
        public Input<int>? SizeUnit { get; set; }

        /// <summary>
        /// A `sticky_sessions` block to be assigned to the
        /// Load Balancer. The `sticky_sessions` block is documented below. Only 1 sticky_sessions block is allowed.
        /// </summary>
        [Input("stickySessions")]
        public Input<Inputs.LoadBalancerStickySessionsArgs>? StickySessions { get; set; }

        [Input("targetLoadBalancerIds")]
        private InputList<string>? _targetLoadBalancerIds;

        /// <summary>
        /// A list of Load Balancer IDs to be attached behind a Global Load Balancer.
        /// </summary>
        public InputList<string> TargetLoadBalancerIds
        {
            get => _targetLoadBalancerIds ?? (_targetLoadBalancerIds = new InputList<string>());
            set => _targetLoadBalancerIds = value;
        }

        /// <summary>
        /// The type of the Load Balancer. It must be either of `REGIONAL`, `REGIONAL_NETWORK`, or `GLOBAL`. Defaults to `REGIONAL`.
        /// **NOTE**: non-`REGIONAL/GLOBAL` type may be part of closed beta feature and not available for public use.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// The ID of the VPC where the load balancer will be located.
        /// </summary>
        [Input("vpcUuid")]
        public Input<string>? VpcUuid { get; set; }

        public LoadBalancerArgs()
        {
        }
        public static new LoadBalancerArgs Empty => new LoadBalancerArgs();
    }

    public sealed class LoadBalancerState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// **Deprecated** This field has been deprecated. You can no longer specify an algorithm for load balancers.
        /// or `least_connections`. The default value is `round_robin`.
        /// </summary>
        [Input("algorithm")]
        public InputUnion<string, Pulumi.DigitalOcean.Algorithm>? Algorithm { get; set; }

        /// <summary>
        /// A boolean value indicating whether to disable automatic DNS record creation for Let's Encrypt certificates that are added to the load balancer. Default value is `false`.
        /// </summary>
        [Input("disableLetsEncryptDnsRecords")]
        public Input<bool>? DisableLetsEncryptDnsRecords { get; set; }

        [Input("domains")]
        private InputList<Inputs.LoadBalancerDomainGetArgs>? _domains;

        /// <summary>
        /// A list of `domains` required to ingress traffic to a Global Load Balancer. The `domains` block is documented below.
        /// </summary>
        public InputList<Inputs.LoadBalancerDomainGetArgs> Domains
        {
            get => _domains ?? (_domains = new InputList<Inputs.LoadBalancerDomainGetArgs>());
            set => _domains = value;
        }

        [Input("dropletIds")]
        private InputList<int>? _dropletIds;

        /// <summary>
        /// A list of the IDs of each droplet to be attached to the Load Balancer.
        /// </summary>
        public InputList<int> DropletIds
        {
            get => _dropletIds ?? (_dropletIds = new InputList<int>());
            set => _dropletIds = value;
        }

        /// <summary>
        /// The name of a Droplet tag corresponding to Droplets to be assigned to the Load Balancer.
        /// </summary>
        [Input("dropletTag")]
        public Input<string>? DropletTag { get; set; }

        /// <summary>
        /// A boolean value indicating whether HTTP keepalive connections are maintained to target Droplets. Default value is `false`.
        /// </summary>
        [Input("enableBackendKeepalive")]
        public Input<bool>? EnableBackendKeepalive { get; set; }

        /// <summary>
        /// A boolean value indicating whether PROXY
        /// Protocol should be used to pass information from connecting client requests to
        /// the backend service. Default value is `false`.
        /// </summary>
        [Input("enableProxyProtocol")]
        public Input<bool>? EnableProxyProtocol { get; set; }

        /// <summary>
        /// A block containing rules for allowing/denying traffic to the Load Balancer. The `firewall` block is documented below. Only 1 firewall is allowed.
        /// </summary>
        [Input("firewall")]
        public Input<Inputs.LoadBalancerFirewallGetArgs>? Firewall { get; set; }

        [Input("forwardingRules")]
        private InputList<Inputs.LoadBalancerForwardingRuleGetArgs>? _forwardingRules;

        /// <summary>
        /// A list of `forwarding_rule` to be assigned to the
        /// Load Balancer. The `forwarding_rule` block is documented below.
        /// </summary>
        public InputList<Inputs.LoadBalancerForwardingRuleGetArgs> ForwardingRules
        {
            get => _forwardingRules ?? (_forwardingRules = new InputList<Inputs.LoadBalancerForwardingRuleGetArgs>());
            set => _forwardingRules = value;
        }

        /// <summary>
        /// A block containing `glb_settings` required to define target rules for a Global Load Balancer. The `glb_settings` block is documented below.
        /// </summary>
        [Input("glbSettings")]
        public Input<Inputs.LoadBalancerGlbSettingsGetArgs>? GlbSettings { get; set; }

        /// <summary>
        /// A `healthcheck` block to be assigned to the
        /// Load Balancer. The `healthcheck` block is documented below. Only 1 healthcheck is allowed.
        /// </summary>
        [Input("healthcheck")]
        public Input<Inputs.LoadBalancerHealthcheckGetArgs>? Healthcheck { get; set; }

        /// <summary>
        /// Specifies the idle timeout for HTTPS connections on the load balancer in seconds.
        /// </summary>
        [Input("httpIdleTimeoutSeconds")]
        public Input<int>? HttpIdleTimeoutSeconds { get; set; }

        /// <summary>
        /// The ip of the Load Balancer
        /// </summary>
        [Input("ip")]
        public Input<string>? Ip { get; set; }

        [Input("ipv6")]
        public Input<string>? Ipv6 { get; set; }

        /// <summary>
        /// The uniform resource name for the Load Balancer
        /// </summary>
        [Input("loadBalancerUrn")]
        public Input<string>? LoadBalancerUrn { get; set; }

        /// <summary>
        /// The Load Balancer name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The type of network the Load Balancer is accessible from. It must be either of `INTERNAL` or `EXTERNAL`. Defaults to `EXTERNAL`.
        /// </summary>
        [Input("network")]
        public Input<string>? Network { get; set; }

        /// <summary>
        /// The network stack determines the allocation of ipv4/ipv6 addresses to the load balancer. It must be either of `IPV4` or `DUALSTACK`. Defaults to `IPV4`.
        /// **NOTE**: this feature is in private preview, and may not be available for public use
        /// </summary>
        [Input("networkStack")]
        public Input<string>? NetworkStack { get; set; }

        /// <summary>
        /// The ID of the project that the load balancer is associated with. If no ID is provided at creation, the load balancer associates with the user's default project.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// A boolean value indicating whether
        /// HTTP requests to the Load Balancer on port 80 will be redirected to HTTPS on port 443.
        /// Default value is `false`.
        /// </summary>
        [Input("redirectHttpToHttps")]
        public Input<bool>? RedirectHttpToHttps { get; set; }

        /// <summary>
        /// The region to start in
        /// </summary>
        [Input("region")]
        public InputUnion<string, Pulumi.DigitalOcean.Region>? Region { get; set; }

        /// <summary>
        /// The size of the Load Balancer. It must be either `lb-small`, `lb-medium`, or `lb-large`. Defaults to `lb-small`. Only one of `size` or `size_unit` may be provided.
        /// </summary>
        [Input("size")]
        public Input<string>? Size { get; set; }

        /// <summary>
        /// The size of the Load Balancer. It must be in the range (1, 200). Defaults to `1`. Only one of `size` or `size_unit` may be provided.
        /// </summary>
        [Input("sizeUnit")]
        public Input<int>? SizeUnit { get; set; }

        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// A `sticky_sessions` block to be assigned to the
        /// Load Balancer. The `sticky_sessions` block is documented below. Only 1 sticky_sessions block is allowed.
        /// </summary>
        [Input("stickySessions")]
        public Input<Inputs.LoadBalancerStickySessionsGetArgs>? StickySessions { get; set; }

        [Input("targetLoadBalancerIds")]
        private InputList<string>? _targetLoadBalancerIds;

        /// <summary>
        /// A list of Load Balancer IDs to be attached behind a Global Load Balancer.
        /// </summary>
        public InputList<string> TargetLoadBalancerIds
        {
            get => _targetLoadBalancerIds ?? (_targetLoadBalancerIds = new InputList<string>());
            set => _targetLoadBalancerIds = value;
        }

        /// <summary>
        /// The type of the Load Balancer. It must be either of `REGIONAL`, `REGIONAL_NETWORK`, or `GLOBAL`. Defaults to `REGIONAL`.
        /// **NOTE**: non-`REGIONAL/GLOBAL` type may be part of closed beta feature and not available for public use.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// The ID of the VPC where the load balancer will be located.
        /// </summary>
        [Input("vpcUuid")]
        public Input<string>? VpcUuid { get; set; }

        public LoadBalancerState()
        {
        }
        public static new LoadBalancerState Empty => new LoadBalancerState();
    }
}
