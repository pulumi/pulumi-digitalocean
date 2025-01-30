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
    public sealed class GetAppSpecJobBitbucketResult
    {
        /// <summary>
        /// The name of the branch to use.
        /// </summary>
        public readonly string? Branch;
        /// <summary>
        /// Whether to automatically deploy new commits made to the repo.
        /// </summary>
        public readonly bool? DeployOnPush;
        /// <summary>
        /// The name of the repo in the format `owner/repo`.
        /// </summary>
        public readonly string? Repo;

        [OutputConstructor]
        private GetAppSpecJobBitbucketResult(
            string? branch,

            bool? deployOnPush,

            string? repo)
        {
            Branch = branch;
            DeployOnPush = deployOnPush;
            Repo = repo;
        }
    }
}
