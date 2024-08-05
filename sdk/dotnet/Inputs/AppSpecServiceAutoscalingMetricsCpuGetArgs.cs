// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Inputs
{

    public sealed class AppSpecServiceAutoscalingMetricsCpuGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The average target CPU utilization for the component.
        /// 
        /// A `static_site` can contain:
        /// </summary>
        [Input("percent", required: true)]
        public Input<int> Percent { get; set; } = null!;

        public AppSpecServiceAutoscalingMetricsCpuGetArgs()
        {
        }
        public static new AppSpecServiceAutoscalingMetricsCpuGetArgs Empty => new AppSpecServiceAutoscalingMetricsCpuGetArgs();
    }
}
