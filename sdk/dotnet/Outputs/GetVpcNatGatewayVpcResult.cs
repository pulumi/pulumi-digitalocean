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
    public sealed class GetVpcNatGatewayVpcResult
    {
        /// <summary>
        /// Indicates if this is the default VPC NAT Gateway in the VPC
        /// </summary>
        public readonly bool DefaultGateway;
        /// <summary>
        /// Gateway IP of the VPC NAT Gateway
        /// </summary>
        public readonly string GatewayIp;
        /// <summary>
        /// ID of the ingress VPC
        /// </summary>
        public readonly string VpcUuid;

        [OutputConstructor]
        private GetVpcNatGatewayVpcResult(
            bool defaultGateway,

            string gatewayIp,

            string vpcUuid)
        {
            DefaultGateway = defaultGateway;
            GatewayIp = gatewayIp;
            VpcUuid = vpcUuid;
        }
    }
}
