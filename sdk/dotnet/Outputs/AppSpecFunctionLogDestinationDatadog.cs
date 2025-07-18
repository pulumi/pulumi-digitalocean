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
    public sealed class AppSpecFunctionLogDestinationDatadog
    {
        /// <summary>
        /// Datadog API key.
        /// </summary>
        public readonly string ApiKey;
        /// <summary>
        /// Datadog HTTP log intake endpoint.
        /// </summary>
        public readonly string? Endpoint;

        [OutputConstructor]
        private AppSpecFunctionLogDestinationDatadog(
            string apiKey,

            string? endpoint)
        {
            ApiKey = apiKey;
            Endpoint = endpoint;
        }
    }
}
