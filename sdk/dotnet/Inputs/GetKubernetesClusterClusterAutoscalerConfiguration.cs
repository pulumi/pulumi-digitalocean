// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Inputs
{

    public sealed class GetKubernetesClusterClusterAutoscalerConfigurationArgs : global::Pulumi.InvokeArgs
    {
        [Input("scaleDownUnneededTime")]
        public string? ScaleDownUnneededTime { get; set; }

        [Input("scaleDownUtilizationThreshold")]
        public double? ScaleDownUtilizationThreshold { get; set; }

        public GetKubernetesClusterClusterAutoscalerConfigurationArgs()
        {
        }
        public static new GetKubernetesClusterClusterAutoscalerConfigurationArgs Empty => new GetKubernetesClusterClusterAutoscalerConfigurationArgs();
    }
}
