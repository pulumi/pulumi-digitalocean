// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Outputs
{

    [OutputType]
    public sealed class GetLoadBalancerForwardingRuleResult
    {
        /// <summary>
        /// the id of the tls certificate used for ssl termination if enabled
        /// </summary>
        public readonly string CertificateId;
        /// <summary>
        /// the name of the tls certificate used for ssl termination if enabled
        /// </summary>
        public readonly string CertificateName;
        /// <summary>
        /// the port on which the load balancer instance will listen
        /// </summary>
        public readonly int EntryPort;
        /// <summary>
        /// the protocol used for traffic to the load balancer
        /// </summary>
        public readonly string EntryProtocol;
        /// <summary>
        /// the port on the backend Droplets to which the load balancer will send traffic
        /// </summary>
        public readonly int TargetPort;
        /// <summary>
        /// the protocol used for traffic to the backend droplets
        /// </summary>
        public readonly string TargetProtocol;
        /// <summary>
        /// whether ssl encrypted traffic will be passed through to the backend droplets
        /// </summary>
        public readonly bool TlsPassthrough;

        [OutputConstructor]
        private GetLoadBalancerForwardingRuleResult(
            string certificateId,

            string certificateName,

            int entryPort,

            string entryProtocol,

            int targetPort,

            string targetProtocol,

            bool tlsPassthrough)
        {
            CertificateId = certificateId;
            CertificateName = certificateName;
            EntryPort = entryPort;
            EntryProtocol = entryProtocol;
            TargetPort = targetPort;
            TargetProtocol = targetProtocol;
            TlsPassthrough = tlsPassthrough;
        }
    }
}