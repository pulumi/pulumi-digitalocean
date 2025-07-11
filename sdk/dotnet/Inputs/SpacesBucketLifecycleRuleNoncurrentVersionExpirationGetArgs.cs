// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Inputs
{

    public sealed class SpacesBucketLifecycleRuleNoncurrentVersionExpirationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the number of days after which an object's non-current versions expire.
        /// </summary>
        [Input("days")]
        public Input<int>? Days { get; set; }

        public SpacesBucketLifecycleRuleNoncurrentVersionExpirationGetArgs()
        {
        }
        public static new SpacesBucketLifecycleRuleNoncurrentVersionExpirationGetArgs Empty => new SpacesBucketLifecycleRuleNoncurrentVersionExpirationGetArgs();
    }
}
