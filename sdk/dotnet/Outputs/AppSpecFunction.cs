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
    public sealed class AppSpecFunction
    {
        /// <summary>
        /// Describes an alert policy for the component.
        /// </summary>
        public readonly ImmutableArray<Outputs.AppSpecFunctionAlert> Alerts;
        /// <summary>
        /// The [CORS](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS) policies of the app.
        /// </summary>
        public readonly Outputs.AppSpecFunctionCors? Cors;
        /// <summary>
        /// Describes an environment variable made available to an app competent.
        /// </summary>
        public readonly ImmutableArray<Outputs.AppSpecFunctionEnv> Envs;
        /// <summary>
        /// A Git repo to use as the component's source. The repository must be able to be cloned without authentication.  Only one of `git`, `github` or `gitlab`  may be set.
        /// </summary>
        public readonly Outputs.AppSpecFunctionGit? Git;
        /// <summary>
        /// A GitHub repo to use as the component's source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/github/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
        /// </summary>
        public readonly Outputs.AppSpecFunctionGithub? Github;
        /// <summary>
        /// A Gitlab repo to use as the component's source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/gitlab/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
        /// </summary>
        public readonly Outputs.AppSpecFunctionGitlab? Gitlab;
        /// <summary>
        /// Describes a log forwarding destination.
        /// </summary>
        public readonly ImmutableArray<Outputs.AppSpecFunctionLogDestination> LogDestinations;
        /// <summary>
        /// The name of the component.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// An HTTP paths that should be routed to this component.
        /// </summary>
        public readonly ImmutableArray<Outputs.AppSpecFunctionRoute> Routes;
        /// <summary>
        /// An optional path to the working directory to use for the build.
        /// </summary>
        public readonly string? SourceDir;

        [OutputConstructor]
        private AppSpecFunction(
            ImmutableArray<Outputs.AppSpecFunctionAlert> alerts,

            Outputs.AppSpecFunctionCors? cors,

            ImmutableArray<Outputs.AppSpecFunctionEnv> envs,

            Outputs.AppSpecFunctionGit? git,

            Outputs.AppSpecFunctionGithub? github,

            Outputs.AppSpecFunctionGitlab? gitlab,

            ImmutableArray<Outputs.AppSpecFunctionLogDestination> logDestinations,

            string name,

            ImmutableArray<Outputs.AppSpecFunctionRoute> routes,

            string? sourceDir)
        {
            Alerts = alerts;
            Cors = cors;
            Envs = envs;
            Git = git;
            Github = github;
            Gitlab = gitlab;
            LogDestinations = logDestinations;
            Name = name;
            Routes = routes;
            SourceDir = sourceDir;
        }
    }
}
