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
    public sealed class GenaiAgentChildAgentChatbotIdentifier
    {
        public readonly string? ChatbotId;

        [OutputConstructor]
        private GenaiAgentChildAgentChatbotIdentifier(string? chatbotId)
        {
            ChatbotId = chatbotId;
        }
    }
}
