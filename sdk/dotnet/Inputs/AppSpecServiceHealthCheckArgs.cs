// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Inputs
{

    public sealed class AppSpecServiceHealthCheckArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The number of failed health checks before considered unhealthy.
        /// </summary>
        [Input("failureThreshold")]
        public Input<int>? FailureThreshold { get; set; }

        /// <summary>
        /// The route path used for the HTTP health check ping.
        /// </summary>
        [Input("httpPath")]
        public Input<string>? HttpPath { get; set; }

        /// <summary>
        /// The number of seconds to wait before beginning health checks.
        /// </summary>
        [Input("initialDelaySeconds")]
        public Input<int>? InitialDelaySeconds { get; set; }

        /// <summary>
        /// The number of seconds to wait between health checks.
        /// </summary>
        [Input("periodSeconds")]
        public Input<int>? PeriodSeconds { get; set; }

        /// <summary>
        /// The health check will be performed on this port instead of component's HTTP port.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// The number of successful health checks before considered healthy.
        /// </summary>
        [Input("successThreshold")]
        public Input<int>? SuccessThreshold { get; set; }

        /// <summary>
        /// The number of seconds after which the check times out.
        /// </summary>
        [Input("timeoutSeconds")]
        public Input<int>? TimeoutSeconds { get; set; }

        public AppSpecServiceHealthCheckArgs()
        {
        }
        public static new AppSpecServiceHealthCheckArgs Empty => new AppSpecServiceHealthCheckArgs();
    }
}
