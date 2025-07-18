// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Inputs
{

    public sealed class GenaiAgentChildAgentDeploymentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// API Key value
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        /// <summary>
        /// Name of the API Key
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Status of the Deployment
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Updated At timestamp for the Agent
        /// </summary>
        [Input("updatedAt")]
        public Input<string>? UpdatedAt { get; set; }

        /// <summary>
        /// Url of the Deployment
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        /// <summary>
        /// API Key value
        /// </summary>
        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        /// <summary>
        /// Visibility of the Deployment
        /// </summary>
        [Input("visibility")]
        public Input<string>? Visibility { get; set; }

        public GenaiAgentChildAgentDeploymentArgs()
        {
        }
        public static new GenaiAgentChildAgentDeploymentArgs Empty => new GenaiAgentChildAgentDeploymentArgs();
    }
}
