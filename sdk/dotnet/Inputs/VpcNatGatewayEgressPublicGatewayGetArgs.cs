// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Inputs
{

    public sealed class VpcNatGatewayEgressPublicGatewayGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// IPv4 address
        /// </summary>
        [Input("ipv4")]
        public Input<string>? Ipv4 { get; set; }

        public VpcNatGatewayEgressPublicGatewayGetArgs()
        {
        }
        public static new VpcNatGatewayEgressPublicGatewayGetArgs Empty => new VpcNatGatewayEgressPublicGatewayGetArgs();
    }
}
