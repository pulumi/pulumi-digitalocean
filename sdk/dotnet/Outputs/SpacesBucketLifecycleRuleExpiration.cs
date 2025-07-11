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
    public sealed class SpacesBucketLifecycleRuleExpiration
    {
        /// <summary>
        /// Specifies the date/time after which you want applicable objects to expire. The argument uses
        /// RFC3339 format, e.g. "2020-03-22T15:03:55Z" or parts thereof e.g. "2019-02-28".
        /// </summary>
        public readonly string? Date;
        /// <summary>
        /// Specifies the number of days after object creation when the applicable objects will expire.
        /// </summary>
        public readonly int? Days;
        /// <summary>
        /// On a versioned bucket (versioning-enabled or versioning-suspended
        /// bucket), setting this to true directs Spaces to delete expired object delete markers.
        /// </summary>
        public readonly bool? ExpiredObjectDeleteMarker;

        [OutputConstructor]
        private SpacesBucketLifecycleRuleExpiration(
            string? date,

            int? days,

            bool? expiredObjectDeleteMarker)
        {
            Date = date;
            Days = days;
            ExpiredObjectDeleteMarker = expiredObjectDeleteMarker;
        }
    }
}
