// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Inputs
{

    public sealed class GetGenaiAgentsSortInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("direction")]
        public Input<string>? Direction { get; set; }

        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        public GetGenaiAgentsSortInputArgs()
        {
        }
        public static new GetGenaiAgentsSortInputArgs Empty => new GetGenaiAgentsSortInputArgs();
    }
}
