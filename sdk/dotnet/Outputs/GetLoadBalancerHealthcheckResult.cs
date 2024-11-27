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
    public sealed class GetLoadBalancerHealthcheckResult
    {
        /// <summary>
        /// the number of seconds between between two consecutive health checks
        /// </summary>
        public readonly int CheckIntervalSeconds;
        /// <summary>
        /// the number of times a health check must pass for a backend droplet to be marked 'healthy' and be re-added to the pool
        /// </summary>
        public readonly int HealthyThreshold;
        /// <summary>
        /// the path on the backend Droplets to which the Load Balancer will send a request
        /// </summary>
        public readonly string Path;
        /// <summary>
        /// the port on the backend droplets on which the health check will attempt a connection
        /// </summary>
        public readonly int Port;
        /// <summary>
        /// the protocol used for health checks sent to the backend droplets
        /// </summary>
        public readonly string Protocol;
        /// <summary>
        /// the number of seconds to wait for a response until marking a health check as failed
        /// </summary>
        public readonly int ResponseTimeoutSeconds;
        /// <summary>
        /// The number of times a health check must fail for a backend droplet to be marked 'unhealthy' and be removed from the pool
        /// </summary>
        public readonly int UnhealthyThreshold;

        [OutputConstructor]
        private GetLoadBalancerHealthcheckResult(
            int checkIntervalSeconds,

            int healthyThreshold,

            string path,

            int port,

            string protocol,

            int responseTimeoutSeconds,

            int unhealthyThreshold)
        {
            CheckIntervalSeconds = checkIntervalSeconds;
            HealthyThreshold = healthyThreshold;
            Path = path;
            Port = port;
            Protocol = protocol;
            ResponseTimeoutSeconds = responseTimeoutSeconds;
            UnhealthyThreshold = unhealthyThreshold;
        }
    }
}