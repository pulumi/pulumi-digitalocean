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
    public sealed class GetAppSpecFunctionLogDestinationDatadogResult
    {
        /// <summary>
        /// Datadog API key.
        /// </summary>
        public readonly string ApiKey;
        /// <summary>
        /// OpenSearch API Endpoint. Only HTTPS is supported. Format: https://&lt;host&gt;:&lt;port&gt;.
        /// </summary>
        public readonly string? Endpoint;

        [OutputConstructor]
        private GetAppSpecFunctionLogDestinationDatadogResult(
            string apiKey,

            string? endpoint)
        {
            ApiKey = apiKey;
            Endpoint = endpoint;
        }
    }
}
