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
    public sealed class GetProjectsFilterResult
    {
        /// <summary>
        /// Filter the projects by this key. This may be one of `name`,
        /// `purpose`, `description`, `environment`, or `is_default`.
        /// </summary>
        public readonly string Key;
        /// <summary>
        /// A list of values to match against the `key` field. Only retrieves projects
        /// where the `key` field takes on one or more of the values provided here.
        /// </summary>
        public readonly ImmutableArray<string> Values;

        [OutputConstructor]
        private GetProjectsFilterResult(
            string key,

            ImmutableArray<string> values)
        {
            Key = key;
            Values = values;
        }
    }
}
