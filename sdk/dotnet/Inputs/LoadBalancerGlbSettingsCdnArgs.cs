// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Inputs
{

    public sealed class LoadBalancerGlbSettingsCdnArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Control flag to specify if caching is enabled.
        /// </summary>
        [Input("isEnabled")]
        public Input<bool>? IsEnabled { get; set; }

        public LoadBalancerGlbSettingsCdnArgs()
        {
        }
        public static new LoadBalancerGlbSettingsCdnArgs Empty => new LoadBalancerGlbSettingsCdnArgs();
    }
}
