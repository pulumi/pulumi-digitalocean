// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Inputs
{

    public sealed class KubernetesClusterMaintenancePolicyGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The day of the maintenance window policy. May be one of "monday" through "sunday", or "any" to indicate an arbitrary week day.
        /// </summary>
        [Input("day")]
        public Input<string>? Day { get; set; }

        /// <summary>
        /// A string denoting the duration of the service window, e.g., "04:00".
        /// </summary>
        [Input("duration")]
        public Input<string>? Duration { get; set; }

        /// <summary>
        /// The start time in UTC of the maintenance window policy in 24-hour clock format / HH:MM notation (e.g., 15:00).
        /// </summary>
        [Input("startTime")]
        public Input<string>? StartTime { get; set; }

        public KubernetesClusterMaintenancePolicyGetArgs()
        {
        }
        public static new KubernetesClusterMaintenancePolicyGetArgs Empty => new KubernetesClusterMaintenancePolicyGetArgs();
    }
}
