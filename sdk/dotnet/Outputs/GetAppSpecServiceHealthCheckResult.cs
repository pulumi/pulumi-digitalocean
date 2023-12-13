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
    public sealed class GetAppSpecServiceHealthCheckResult
    {
        /// <summary>
        /// The number of failed health checks before considered unhealthy.
        /// </summary>
        public readonly int? FailureThreshold;
        /// <summary>
        /// The route path used for the HTTP health check ping.
        /// </summary>
        public readonly string? HttpPath;
        /// <summary>
        /// The number of seconds to wait before beginning health checks.
        /// </summary>
        public readonly int? InitialDelaySeconds;
        /// <summary>
        /// The number of seconds to wait between health checks.
        /// </summary>
        public readonly int? PeriodSeconds;
        public readonly int? Port;
        /// <summary>
        /// The number of successful health checks before considered healthy.
        /// </summary>
        public readonly int? SuccessThreshold;
        /// <summary>
        /// The number of seconds after which the check times out.
        /// </summary>
        public readonly int? TimeoutSeconds;

        [OutputConstructor]
        private GetAppSpecServiceHealthCheckResult(
            int? failureThreshold,

            string? httpPath,

            int? initialDelaySeconds,

            int? periodSeconds,

            int? port,

            int? successThreshold,

            int? timeoutSeconds)
        {
            FailureThreshold = failureThreshold;
            HttpPath = httpPath;
            InitialDelaySeconds = initialDelaySeconds;
            PeriodSeconds = periodSeconds;
            Port = port;
            SuccessThreshold = successThreshold;
            TimeoutSeconds = timeoutSeconds;
        }
    }
}
