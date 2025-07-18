// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Outputs
{

    [OutputType]
    public sealed class GetLoadBalancerGlbSettingResult
    {
        /// <summary>
        /// CDN specific configurations
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLoadBalancerGlbSettingCdnResult> Cdns;
        /// <summary>
        /// fail-over threshold
        /// </summary>
        public readonly int FailoverThreshold;
        /// <summary>
        /// region priority map
        /// </summary>
        public readonly ImmutableDictionary<string, int> RegionPriorities;
        /// <summary>
        /// target port rules
        /// </summary>
        public readonly int TargetPort;
        /// <summary>
        /// target protocol rules
        /// </summary>
        public readonly string TargetProtocol;

        [OutputConstructor]
        private GetLoadBalancerGlbSettingResult(
            ImmutableArray<Outputs.GetLoadBalancerGlbSettingCdnResult> cdns,

            int failoverThreshold,

            ImmutableDictionary<string, int> regionPriorities,

            int targetPort,

            string targetProtocol)
        {
            Cdns = cdns;
            FailoverThreshold = failoverThreshold;
            RegionPriorities = regionPriorities;
            TargetPort = targetPort;
            TargetProtocol = targetProtocol;
        }
    }
}
