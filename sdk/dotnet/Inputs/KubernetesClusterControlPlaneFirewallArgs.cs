// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Inputs
{

    public sealed class KubernetesClusterControlPlaneFirewallArgs : global::Pulumi.ResourceArgs
    {
        [Input("allowedAddresses", required: true)]
        private InputList<string>? _allowedAddresses;

        /// <summary>
        /// A list of addresses allowed (CIDR notation).
        /// </summary>
        public InputList<string> AllowedAddresses
        {
            get => _allowedAddresses ?? (_allowedAddresses = new InputList<string>());
            set => _allowedAddresses = value;
        }

        /// <summary>
        /// Boolean flag whether the firewall should be enabled or not.
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        public KubernetesClusterControlPlaneFirewallArgs()
        {
        }
        public static new KubernetesClusterControlPlaneFirewallArgs Empty => new KubernetesClusterControlPlaneFirewallArgs();
    }
}
