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
    public sealed class AppSpecServiceAutoscaling
    {
        /// <summary>
        /// The maximum amount of instances for this component. Must be more than min_instance_count.
        /// </summary>
        public readonly int MaxInstanceCount;
        /// <summary>
        /// The metrics that the component is scaled on.
        /// </summary>
        public readonly Outputs.AppSpecServiceAutoscalingMetrics Metrics;
        /// <summary>
        /// The minimum amount of instances for this component. Must be less than max_instance_count.
        /// </summary>
        public readonly int MinInstanceCount;

        [OutputConstructor]
        private AppSpecServiceAutoscaling(
            int maxInstanceCount,

            Outputs.AppSpecServiceAutoscalingMetrics metrics,

            int minInstanceCount)
        {
            MaxInstanceCount = maxInstanceCount;
            Metrics = metrics;
            MinInstanceCount = minInstanceCount;
        }
    }
}
