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
    public sealed class GetAppSpecJobResult
    {
        /// <summary>
        /// Describes an alert policy for the component.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAppSpecJobAlertResult> Alerts;
        /// <summary>
        /// A Bitbucket repo to use as component's source. Only one of `git`, `github`, `bitbucket`, `gitlab`, or `image` may be set.
        /// </summary>
        public readonly Outputs.GetAppSpecJobBitbucketResult? Bitbucket;
        /// <summary>
        /// An optional build command to run while building this component from source.
        /// </summary>
        public readonly string? BuildCommand;
        /// <summary>
        /// The path to a Dockerfile relative to the root of the repo. If set, overrides usage of buildpacks.
        /// </summary>
        public readonly string? DockerfilePath;
        /// <summary>
        /// An environment slug describing the type of this app.
        /// </summary>
        public readonly string? EnvironmentSlug;
        /// <summary>
        /// Describes an environment variable made available to an app competent.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAppSpecJobEnvResult> Envs;
        /// <summary>
        /// A Git repo to use as the component's source. The repository must be able to be cloned without authentication.  Only one of `git`, `github` or `gitlab`  may be set.
        /// </summary>
        public readonly Outputs.GetAppSpecJobGitResult? Git;
        /// <summary>
        /// A GitHub repo to use as the component's source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/github/install). Only one of `git`, `github`, `bitbucket`, `gitlab`, or `image` may be set.
        /// </summary>
        public readonly Outputs.GetAppSpecJobGithubResult? Github;
        /// <summary>
        /// A Gitlab repo to use as the component's source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/gitlab/install). Only one of `git`, `github`, `bitbucket`, `gitlab`, or `image` may be set.
        /// </summary>
        public readonly Outputs.GetAppSpecJobGitlabResult? Gitlab;
        /// <summary>
        /// An image to use as the component's source. Only one of `git`, `github`, `bitbucket`, `gitlab`, or `image` may be set.
        /// </summary>
        public readonly Outputs.GetAppSpecJobImageResult? Image;
        /// <summary>
        /// The amount of instances that this component should be scaled to.
        /// </summary>
        public readonly int? InstanceCount;
        /// <summary>
        /// The instance size to use for this component.
        /// </summary>
        public readonly string? InstanceSizeSlug;
        /// <summary>
        /// The type of job and when it will be run during the deployment process. It may be one of:
        /// - `UNSPECIFIED`: Default job type, will auto-complete to POST_DEPLOY kind.
        /// - `PRE_DEPLOY`: Indicates a job that runs before an app deployment.
        /// - `POST_DEPLOY`: Indicates a job that runs after an app deployment.
        /// - `FAILED_DEPLOY`: Indicates a job that runs after a component fails to deploy.
        /// </summary>
        public readonly string? Kind;
        /// <summary>
        /// Describes a log forwarding destination.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAppSpecJobLogDestinationResult> LogDestinations;
        /// <summary>
        /// The name of the component.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// An optional run command to override the component's default.
        /// </summary>
        public readonly string? RunCommand;
        /// <summary>
        /// An optional path to the working directory to use for the build.
        /// </summary>
        public readonly string? SourceDir;
        /// <summary>
        /// Contains a component's termination parameters.
        /// </summary>
        public readonly Outputs.GetAppSpecJobTerminationResult? Termination;

        [OutputConstructor]
        private GetAppSpecJobResult(
            ImmutableArray<Outputs.GetAppSpecJobAlertResult> alerts,

            Outputs.GetAppSpecJobBitbucketResult? bitbucket,

            string? buildCommand,

            string? dockerfilePath,

            string? environmentSlug,

            ImmutableArray<Outputs.GetAppSpecJobEnvResult> envs,

            Outputs.GetAppSpecJobGitResult? git,

            Outputs.GetAppSpecJobGithubResult? github,

            Outputs.GetAppSpecJobGitlabResult? gitlab,

            Outputs.GetAppSpecJobImageResult? image,

            int? instanceCount,

            string? instanceSizeSlug,

            string? kind,

            ImmutableArray<Outputs.GetAppSpecJobLogDestinationResult> logDestinations,

            string name,

            string? runCommand,

            string? sourceDir,

            Outputs.GetAppSpecJobTerminationResult? termination)
        {
            Alerts = alerts;
            Bitbucket = bitbucket;
            BuildCommand = buildCommand;
            DockerfilePath = dockerfilePath;
            EnvironmentSlug = environmentSlug;
            Envs = envs;
            Git = git;
            Github = github;
            Gitlab = gitlab;
            Image = image;
            InstanceCount = instanceCount;
            InstanceSizeSlug = instanceSizeSlug;
            Kind = kind;
            LogDestinations = logDestinations;
            Name = name;
            RunCommand = runCommand;
            SourceDir = sourceDir;
            Termination = termination;
        }
    }
}
