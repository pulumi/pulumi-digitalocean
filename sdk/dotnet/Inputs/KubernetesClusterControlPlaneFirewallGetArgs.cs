// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Inputs
{

    public sealed class KubernetesClusterControlPlaneFirewallGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("allowedAddresses", required: true)]
        private InputList<string>? _allowedAddresses;
        public InputList<string> AllowedAddresses
        {
            get => _allowedAddresses ?? (_allowedAddresses = new InputList<string>());
            set => _allowedAddresses = value;
        }

        /// <summary>
        /// Boolean flag whether the routing-agent is enabled or not.
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        public KubernetesClusterControlPlaneFirewallGetArgs()
        {
        }
        public static new KubernetesClusterControlPlaneFirewallGetArgs Empty => new KubernetesClusterControlPlaneFirewallGetArgs();
    }
}
