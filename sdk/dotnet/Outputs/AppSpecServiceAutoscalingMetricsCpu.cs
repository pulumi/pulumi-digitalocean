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
    public sealed class AppSpecServiceAutoscalingMetricsCpu
    {
        /// <summary>
        /// The average target CPU utilization for the component.
        /// </summary>
        public readonly int Percent;

        [OutputConstructor]
        private AppSpecServiceAutoscalingMetricsCpu(int percent)
        {
            Percent = percent;
        }
    }
}
