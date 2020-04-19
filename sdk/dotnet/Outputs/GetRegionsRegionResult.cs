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
    public sealed class GetRegionsRegionResult
    {
        public readonly bool Available;
        public readonly ImmutableArray<string> Features;
        public readonly string Name;
        public readonly ImmutableArray<string> Sizes;
        public readonly string Slug;

        [OutputConstructor]
        private GetRegionsRegionResult(
            bool available,

            ImmutableArray<string> features,

            string name,

            ImmutableArray<string> sizes,

            string slug)
        {
            Available = available;
            Features = features;
            Name = name;
            Sizes = sizes;
            Slug = slug;
        }
    }
}