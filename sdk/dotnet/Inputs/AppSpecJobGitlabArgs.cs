// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Inputs
{

    public sealed class AppSpecJobGitlabArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the branch to use.
        /// </summary>
        [Input("branch")]
        public Input<string>? Branch { get; set; }

        /// <summary>
        /// Whether to automatically deploy new commits made to the repo.
        /// </summary>
        [Input("deployOnPush")]
        public Input<bool>? DeployOnPush { get; set; }

        /// <summary>
        /// The name of the repo in the format `owner/repo`.
        /// </summary>
        [Input("repo")]
        public Input<string>? Repo { get; set; }

        public AppSpecJobGitlabArgs()
        {
        }
        public static new AppSpecJobGitlabArgs Empty => new AppSpecJobGitlabArgs();
    }
}
