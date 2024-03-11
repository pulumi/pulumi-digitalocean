// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean
{
    public static class GetLoadBalancer
    {
        /// <summary>
        /// Get information on a load balancer for use in other resources. This data source
        /// provides all of the load balancers properties as configured on your DigitalOcean
        /// account. This is useful if the load balancer in question is not managed by
        /// the provider or you need to utilize any of the load balancers data.
        /// 
        /// An error is triggered if the provided load balancer name does not exist.
        /// 
        /// ## Example Usage
        /// 
        /// Get the load balancer by name:
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetLoadBalancer.Invoke(new()
        ///     {
        ///         Name = "app",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["lbOutput"] = example.Apply(getLoadBalancerResult =&gt; getLoadBalancerResult.Ip),
        ///     };
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// 
        /// Get the load balancer by ID:
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetLoadBalancer.Invoke(new()
        ///     {
        ///         Id = "loadbalancer_id",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetLoadBalancerResult> InvokeAsync(GetLoadBalancerArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetLoadBalancerResult>("digitalocean:index/getLoadBalancer:getLoadBalancer", args ?? new GetLoadBalancerArgs(), options.WithDefaults());

        /// <summary>
        /// Get information on a load balancer for use in other resources. This data source
        /// provides all of the load balancers properties as configured on your DigitalOcean
        /// account. This is useful if the load balancer in question is not managed by
        /// the provider or you need to utilize any of the load balancers data.
        /// 
        /// An error is triggered if the provided load balancer name does not exist.
        /// 
        /// ## Example Usage
        /// 
        /// Get the load balancer by name:
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetLoadBalancer.Invoke(new()
        ///     {
        ///         Name = "app",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["lbOutput"] = example.Apply(getLoadBalancerResult =&gt; getLoadBalancerResult.Ip),
        ///     };
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// 
        /// Get the load balancer by ID:
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetLoadBalancer.Invoke(new()
        ///     {
        ///         Id = "loadbalancer_id",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetLoadBalancerResult> Invoke(GetLoadBalancerInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetLoadBalancerResult>("digitalocean:index/getLoadBalancer:getLoadBalancer", args ?? new GetLoadBalancerInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetLoadBalancerArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of load balancer.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        /// <summary>
        /// The name of load balancer.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        [Input("type")]
        public string? Type { get; set; }

        public GetLoadBalancerArgs()
        {
        }
        public static new GetLoadBalancerArgs Empty => new GetLoadBalancerArgs();
    }

    public sealed class GetLoadBalancerInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of load balancer.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// The name of load balancer.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("type")]
        public Input<string>? Type { get; set; }

        public GetLoadBalancerInvokeArgs()
        {
        }
        public static new GetLoadBalancerInvokeArgs Empty => new GetLoadBalancerInvokeArgs();
    }


    [OutputType]
    public sealed class GetLoadBalancerResult
    {
        public readonly string Algorithm;
        public readonly bool DisableLetsEncryptDnsRecords;
        public readonly ImmutableArray<int> DropletIds;
        public readonly string DropletTag;
        public readonly bool EnableBackendKeepalive;
        public readonly bool EnableProxyProtocol;
        public readonly ImmutableArray<Outputs.GetLoadBalancerFirewallResult> Firewalls;
        public readonly ImmutableArray<Outputs.GetLoadBalancerForwardingRuleResult> ForwardingRules;
        public readonly ImmutableArray<Outputs.GetLoadBalancerHealthcheckResult> Healthchecks;
        public readonly int HttpIdleTimeoutSeconds;
        public readonly string? Id;
        public readonly string Ip;
        public readonly string LoadBalancerUrn;
        public readonly string? Name;
        public readonly string ProjectId;
        public readonly bool RedirectHttpToHttps;
        public readonly string Region;
        public readonly string Size;
        public readonly int SizeUnit;
        public readonly string Status;
        public readonly ImmutableArray<Outputs.GetLoadBalancerStickySessionResult> StickySessions;
        public readonly string Type;
        public readonly string VpcUuid;

        [OutputConstructor]
        private GetLoadBalancerResult(
            string algorithm,

            bool disableLetsEncryptDnsRecords,

            ImmutableArray<int> dropletIds,

            string dropletTag,

            bool enableBackendKeepalive,

            bool enableProxyProtocol,

            ImmutableArray<Outputs.GetLoadBalancerFirewallResult> firewalls,

            ImmutableArray<Outputs.GetLoadBalancerForwardingRuleResult> forwardingRules,

            ImmutableArray<Outputs.GetLoadBalancerHealthcheckResult> healthchecks,

            int httpIdleTimeoutSeconds,

            string? id,

            string ip,

            string loadBalancerUrn,

            string? name,

            string projectId,

            bool redirectHttpToHttps,

            string region,

            string size,

            int sizeUnit,

            string status,

            ImmutableArray<Outputs.GetLoadBalancerStickySessionResult> stickySessions,

            string type,

            string vpcUuid)
        {
            Algorithm = algorithm;
            DisableLetsEncryptDnsRecords = disableLetsEncryptDnsRecords;
            DropletIds = dropletIds;
            DropletTag = dropletTag;
            EnableBackendKeepalive = enableBackendKeepalive;
            EnableProxyProtocol = enableProxyProtocol;
            Firewalls = firewalls;
            ForwardingRules = forwardingRules;
            Healthchecks = healthchecks;
            HttpIdleTimeoutSeconds = httpIdleTimeoutSeconds;
            Id = id;
            Ip = ip;
            LoadBalancerUrn = loadBalancerUrn;
            Name = name;
            ProjectId = projectId;
            RedirectHttpToHttps = redirectHttpToHttps;
            Region = region;
            Size = size;
            SizeUnit = sizeUnit;
            Status = status;
            StickySessions = stickySessions;
            Type = type;
            VpcUuid = vpcUuid;
        }
    }
}
