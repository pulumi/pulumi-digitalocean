// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Inputs
{

    public sealed class LoadBalancerGlbSettingsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// CDN configuration supporting the following:
        /// </summary>
        [Input("cdn")]
        public Input<Inputs.LoadBalancerGlbSettingsCdnGetArgs>? Cdn { get; set; }

        /// <summary>
        /// fail-over threshold
        /// </summary>
        [Input("failoverThreshold")]
        public Input<int>? FailoverThreshold { get; set; }

        [Input("regionPriorities")]
        private InputMap<int>? _regionPriorities;

        /// <summary>
        /// region priority map
        /// </summary>
        public InputMap<int> RegionPriorities
        {
            get => _regionPriorities ?? (_regionPriorities = new InputMap<int>());
            set => _regionPriorities = value;
        }

        /// <summary>
        /// An integer representing the port on the backend Droplets to which the Load Balancer will send traffic. The possible values are: `80` for `http` and `443` for `https`.
        /// </summary>
        [Input("targetPort", required: true)]
        public Input<int> TargetPort { get; set; } = null!;

        /// <summary>
        /// The protocol used for traffic from the Load Balancer to the backend Droplets. The possible values are: `http` and `https`.
        /// </summary>
        [Input("targetProtocol", required: true)]
        public Input<string> TargetProtocol { get; set; } = null!;

        public LoadBalancerGlbSettingsGetArgs()
        {
        }
        public static new LoadBalancerGlbSettingsGetArgs Empty => new LoadBalancerGlbSettingsGetArgs();
    }
}
