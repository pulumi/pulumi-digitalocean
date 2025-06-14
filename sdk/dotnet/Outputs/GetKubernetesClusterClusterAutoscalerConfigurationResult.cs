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
    public sealed class GetKubernetesClusterClusterAutoscalerConfigurationResult
    {
        public readonly string? ScaleDownUnneededTime;
        public readonly double? ScaleDownUtilizationThreshold;

        [OutputConstructor]
        private GetKubernetesClusterClusterAutoscalerConfigurationResult(
            string? scaleDownUnneededTime,

            double? scaleDownUtilizationThreshold)
        {
            ScaleDownUnneededTime = scaleDownUnneededTime;
            ScaleDownUtilizationThreshold = scaleDownUtilizationThreshold;
        }
    }
}
