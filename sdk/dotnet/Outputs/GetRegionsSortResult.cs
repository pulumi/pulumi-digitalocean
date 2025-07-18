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
    public sealed class GetRegionsSortResult
    {
        /// <summary>
        /// The sort direction. This may be either `asc` or `desc`.
        /// </summary>
        public readonly string? Direction;
        /// <summary>
        /// Sort the regions by this key. This may be one of `slug`,
        /// `name`, or `available`.
        /// </summary>
        public readonly string Key;

        [OutputConstructor]
        private GetRegionsSortResult(
            string? direction,

            string key)
        {
            Direction = direction;
            Key = key;
        }
    }
}
