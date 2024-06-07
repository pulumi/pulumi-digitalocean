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
    public sealed class AppSpecFunctionLogDestination
    {
        /// <summary>
        /// Datadog configuration.
        /// </summary>
        public readonly Outputs.AppSpecFunctionLogDestinationDatadog? Datadog;
        /// <summary>
        /// Logtail configuration.
        /// </summary>
        public readonly Outputs.AppSpecFunctionLogDestinationLogtail? Logtail;
        /// <summary>
        /// Name of the log destination. Minimum length: 2. Maximum length: 42.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Papertrail configuration.
        /// </summary>
        public readonly Outputs.AppSpecFunctionLogDestinationPapertrail? Papertrail;

        [OutputConstructor]
        private AppSpecFunctionLogDestination(
            Outputs.AppSpecFunctionLogDestinationDatadog? datadog,

            Outputs.AppSpecFunctionLogDestinationLogtail? logtail,

            string name,

            Outputs.AppSpecFunctionLogDestinationPapertrail? papertrail)
        {
            Datadog = datadog;
            Logtail = logtail;
            Name = name;
            Papertrail = papertrail;
        }
    }
}
