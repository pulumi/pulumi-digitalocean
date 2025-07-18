// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Inputs
{

    public sealed class GenaiAgentChildAgentApiKeyInfoGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// API Key value
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        /// <summary>
        /// Created By user ID for the API Key
        /// </summary>
        [Input("createdBy")]
        public Input<string>? CreatedBy { get; set; }

        /// <summary>
        /// Deleted At timestamp for the API Key
        /// </summary>
        [Input("deletedAt")]
        public Input<string>? DeletedAt { get; set; }

        /// <summary>
        /// Name of the API Key
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Updated At timestamp for the API Key
        /// </summary>
        [Input("secretKey")]
        public Input<string>? SecretKey { get; set; }

        /// <summary>
        /// API Key value
        /// </summary>
        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        public GenaiAgentChildAgentApiKeyInfoGetArgs()
        {
        }
        public static new GenaiAgentChildAgentApiKeyInfoGetArgs Empty => new GenaiAgentChildAgentApiKeyInfoGetArgs();
    }
}
