// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Inputs
{

    public sealed class GetGenaiAgentAnthropicApiKeyArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Timestamp when the API Key was created
        /// </summary>
        [Input("createdAt", required: true)]
        public string CreatedAt { get; set; } = null!;

        /// <summary>
        /// Created By user ID for the API Key
        /// </summary>
        [Input("createdBy")]
        public string? CreatedBy { get; set; }

        /// <summary>
        /// Deleted At timestamp for the API Key
        /// </summary>
        [Input("deletedAt", required: true)]
        public string DeletedAt { get; set; } = null!;

        /// <summary>
        /// Name of the API Key
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// Updated At timestamp for the API Key
        /// </summary>
        [Input("updatedAt", required: true)]
        public string UpdatedAt { get; set; } = null!;

        /// <summary>
        /// API Key value
        /// </summary>
        [Input("uuid")]
        public string? Uuid { get; set; }

        public GetGenaiAgentAnthropicApiKeyArgs()
        {
        }
        public static new GetGenaiAgentAnthropicApiKeyArgs Empty => new GetGenaiAgentAnthropicApiKeyArgs();
    }
}
