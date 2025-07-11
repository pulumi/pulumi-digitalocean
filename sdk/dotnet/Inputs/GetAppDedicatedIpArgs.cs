// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Inputs
{

    public sealed class GetAppDedicatedIpInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the dedicated egress IP.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        /// <summary>
        /// The IP address of the dedicated egress IP.
        /// </summary>
        [Input("ip", required: true)]
        public Input<string> Ip { get; set; } = null!;

        /// <summary>
        /// The status of the dedicated egress IP.
        /// </summary>
        [Input("status", required: true)]
        public Input<string> Status { get; set; } = null!;

        public GetAppDedicatedIpInputArgs()
        {
        }
        public static new GetAppDedicatedIpInputArgs Empty => new GetAppDedicatedIpInputArgs();
    }
}
