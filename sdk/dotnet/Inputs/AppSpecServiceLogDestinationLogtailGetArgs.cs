// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Inputs
{

    public sealed class AppSpecServiceLogDestinationLogtailGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Logtail token.
        /// </summary>
        [Input("token", required: true)]
        public Input<string> Token { get; set; } = null!;

        public AppSpecServiceLogDestinationLogtailGetArgs()
        {
        }
    }
}
