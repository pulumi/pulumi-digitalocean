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
    public sealed class GetGenaiAgentModelAgreementResult
    {
        /// <summary>
        /// Description of the agreement
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// Name of the agreement
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// URL of the agreement
        /// </summary>
        public readonly string? Url;
        /// <summary>
        /// UUID of the agreement
        /// </summary>
        public readonly string? Uuid;

        [OutputConstructor]
        private GetGenaiAgentModelAgreementResult(
            string? description,

            string? name,

            string? url,

            string? uuid)
        {
            Description = description;
            Name = name;
            Url = url;
            Uuid = uuid;
        }
    }
}
