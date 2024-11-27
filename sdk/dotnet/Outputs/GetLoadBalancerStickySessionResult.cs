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
    public sealed class GetLoadBalancerStickySessionResult
    {
        /// <summary>
        /// the name of the cookie sent to the client
        /// </summary>
        public readonly string CookieName;
        /// <summary>
        /// the number of seconds until the cookie set by the Load Balancer expires
        /// </summary>
        public readonly int CookieTtlSeconds;
        /// <summary>
        /// how and if requests from a client will be persistently served by the same backend droplet
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetLoadBalancerStickySessionResult(
            string cookieName,

            int cookieTtlSeconds,

            string type)
        {
            CookieName = cookieName;
            CookieTtlSeconds = cookieTtlSeconds;
            Type = type;
        }
    }
}