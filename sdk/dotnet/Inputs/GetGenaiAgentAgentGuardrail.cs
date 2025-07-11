// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Inputs
{

    public sealed class GetGenaiAgentAgentGuardrailArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Agent UUID for the Guardrail
        /// </summary>
        [Input("agentUuid")]
        public string? AgentUuid { get; set; }

        /// <summary>
        /// Created At timestamp for the Guardrail
        /// </summary>
        [Input("createdAt", required: true)]
        public string CreatedAt { get; set; } = null!;

        /// <summary>
        /// Default response for the Guardrail
        /// </summary>
        [Input("defaultResponse")]
        public string? DefaultResponse { get; set; }

        /// <summary>
        /// Description of the Guardrail
        /// </summary>
        [Input("description")]
        public string? Description { get; set; }

        /// <summary>
        /// Guardrail UUID
        /// </summary>
        [Input("guardrailUuid")]
        public string? GuardrailUuid { get; set; }

        /// <summary>
        /// Indicates if the Guardrail is attached
        /// </summary>
        [Input("isAttached", required: true)]
        public bool IsAttached { get; set; }

        /// <summary>
        /// Indicates if the Guardrail is default
        /// </summary>
        [Input("isDefault")]
        public bool? IsDefault { get; set; }

        /// <summary>
        /// Name of Guardrail
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// Priority of the Guardrail
        /// </summary>
        [Input("priority")]
        public int? Priority { get; set; }

        /// <summary>
        /// Type of the Guardrail
        /// </summary>
        [Input("type")]
        public string? Type { get; set; }

        /// <summary>
        /// Updated At timestamp for the Guardrail
        /// </summary>
        [Input("updatedAt", required: true)]
        public string UpdatedAt { get; set; } = null!;

        /// <summary>
        /// Guardrail UUID
        /// </summary>
        [Input("uuid")]
        public string? Uuid { get; set; }

        public GetGenaiAgentAgentGuardrailArgs()
        {
        }
        public static new GetGenaiAgentAgentGuardrailArgs Empty => new GetGenaiAgentAgentGuardrailArgs();
    }
}
