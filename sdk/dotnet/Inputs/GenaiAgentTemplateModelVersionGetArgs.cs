// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Inputs
{

    public sealed class GenaiAgentTemplateModelVersionGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Major version of the model
        /// </summary>
        [Input("major")]
        public Input<int>? Major { get; set; }

        /// <summary>
        /// Minor version of the model
        /// </summary>
        [Input("minor")]
        public Input<int>? Minor { get; set; }

        /// <summary>
        /// Patch version of the model
        /// </summary>
        [Input("patch")]
        public Input<int>? Patch { get; set; }

        public GenaiAgentTemplateModelVersionGetArgs()
        {
        }
        public static new GenaiAgentTemplateModelVersionGetArgs Empty => new GenaiAgentTemplateModelVersionGetArgs();
    }
}
