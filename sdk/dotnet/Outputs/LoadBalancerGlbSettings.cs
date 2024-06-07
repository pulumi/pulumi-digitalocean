// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Outputs
{

    [OutputType]
    public sealed class LoadBalancerGlbSettings
    {
        /// <summary>
        /// CDN configuration supporting the following:
        /// </summary>
        public readonly Outputs.LoadBalancerGlbSettingsCdn? Cdn;
        /// <summary>
        /// fail-over threshold
        /// </summary>
        public readonly int? FailoverThreshold;
        /// <summary>
        /// region priority map
        /// </summary>
        public readonly ImmutableDictionary<string, int>? RegionPriorities;
        /// <summary>
        /// An integer representing the port on the backend Droplets to which the Load Balancer will send traffic. The possible values are: `80` for `http` and `443` for `https`.
        /// </summary>
        public readonly int TargetPort;
        /// <summary>
        /// The protocol used for traffic from the Load Balancer to the backend Droplets. The possible values are: `http` and `https`.
        /// </summary>
        public readonly string TargetProtocol;

        [OutputConstructor]
        private LoadBalancerGlbSettings(
            Outputs.LoadBalancerGlbSettingsCdn? cdn,

            int? failoverThreshold,

            ImmutableDictionary<string, int>? regionPriorities,

            int targetPort,

            string targetProtocol)
        {
            Cdn = cdn;
            FailoverThreshold = failoverThreshold;
            RegionPriorities = regionPriorities;
            TargetPort = targetPort;
            TargetProtocol = targetProtocol;
        }
    }
}
