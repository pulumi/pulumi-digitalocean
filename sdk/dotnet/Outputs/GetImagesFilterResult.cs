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
    public sealed class GetImagesFilterResult
    {
        /// <summary>
        /// Filter the images by this key. This may be one of `distribution`, `error_message`,
        /// `id`, `image`, `min_disk_size`, `name`, `private`, `regions`, `size_gigabytes`, `slug`, `status`,
        /// `tags`, or `type`.
        /// </summary>
        public readonly string Key;
        /// <summary>
        /// A list of values to match against the `key` field. Only retrieves images
        /// where the `key` field takes on one or more of the values provided here.
        /// </summary>
        public readonly ImmutableArray<string> Values;

        [OutputConstructor]
        private GetImagesFilterResult(
            string key,

            ImmutableArray<string> values)
        {
            Key = key;
            Values = values;
        }
    }
}
