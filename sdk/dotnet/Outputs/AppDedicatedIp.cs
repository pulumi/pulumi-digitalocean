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
    public sealed class AppDedicatedIp
    {
        /// <summary>
        /// The ID of the app.
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// The IP address of the dedicated egress IP.
        /// </summary>
        public readonly string? Ip;
        /// <summary>
        /// The status of the dedicated egress IP: 'UNKNOWN', 'ASSIGNING', 'ASSIGNED', or 'REMOVED'
        /// </summary>
        public readonly string? Status;

        [OutputConstructor]
        private AppDedicatedIp(
            string? id,

            string? ip,

            string? status)
        {
            Id = id;
            Ip = ip;
            Status = status;
        }
    }
}
