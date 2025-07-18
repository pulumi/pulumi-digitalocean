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
    public sealed class GetAppSpecAlertResult
    {
        /// <summary>
        /// Determines whether or not the alert is disabled (default: `false`).
        /// </summary>
        public readonly bool? Disabled;
        /// <summary>
        /// The type of the alert to configure. Component app alert policies can be: `CPU_UTILIZATION`, `MEM_UTILIZATION`, or `RESTART_COUNT`.
        /// </summary>
        public readonly string Rule;

        [OutputConstructor]
        private GetAppSpecAlertResult(
            bool? disabled,

            string rule)
        {
            Disabled = disabled;
            Rule = rule;
        }
    }
}
