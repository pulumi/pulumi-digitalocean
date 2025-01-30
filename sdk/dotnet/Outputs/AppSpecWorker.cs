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
    public sealed class AppSpecWorker
    {
        /// <summary>
        /// Describes an alert policy for the component.
        /// </summary>
        public readonly ImmutableArray<Outputs.AppSpecWorkerAlert> Alerts;
        /// <summary>
        /// Configuration for automatically scaling this component based on metrics.
        /// </summary>
        public readonly Outputs.AppSpecWorkerAutoscaling? Autoscaling;
        /// <summary>
        /// A GitHub repo to use as the component's source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/bitbucket/install). Only one of `git`, `github`, `bitbucket`, `gitlab`, or `image` may be set.
        /// </summary>
        public readonly Outputs.AppSpecWorkerBitbucket? Bitbucket;
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
        public readonly ImmutableArray<Outputs.AppSpecWorkerEnv> Envs;
        /// <summary>
        /// A Git repo to use as the component's source. The repository must be able to be cloned without authentication. Only one of `git`, `github` or `gitlab` may be set.
        /// </summary>
        public readonly Outputs.AppSpecWorkerGit? Git;
        /// <summary>
        /// A GitHub repo to use as the component's source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/github/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
        /// </summary>
        public readonly Outputs.AppSpecWorkerGithub? Github;
        /// <summary>
        /// A Gitlab repo to use as the component's source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/gitlab/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
        /// </summary>
        public readonly Outputs.AppSpecWorkerGitlab? Gitlab;
        /// <summary>
        /// An image to use as the component's source. Only one of `git`, `github`, `gitlab`, or `image` may be set.
        /// </summary>
        public readonly Outputs.AppSpecWorkerImage? Image;
        /// <summary>
        /// The amount of instances that this component should be scaled to.
        /// </summary>
        public readonly int? InstanceCount;
        /// <summary>
        /// The instance size to use for this component. This determines the plan (basic or professional) and the available CPU and memory. The list of available instance sizes can be [found with the API](https://docs.digitalocean.com/reference/api/api-reference/#operation/list_instance_sizes) or using the [doctl CLI](https://docs.digitalocean.com/reference/doctl/) (`doctl apps tier instance-size list`). Default: `basic-xxs`
        /// </summary>
        public readonly string? InstanceSizeSlug;
        /// <summary>
        /// Describes a log forwarding destination.
        /// </summary>
        public readonly ImmutableArray<Outputs.AppSpecWorkerLogDestination> LogDestinations;
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
        public readonly Outputs.AppSpecWorkerTermination? Termination;

        [OutputConstructor]
        private AppSpecWorker(
            ImmutableArray<Outputs.AppSpecWorkerAlert> alerts,

            Outputs.AppSpecWorkerAutoscaling? autoscaling,

            Outputs.AppSpecWorkerBitbucket? bitbucket,

            string? buildCommand,

            string? dockerfilePath,

            string? environmentSlug,

            ImmutableArray<Outputs.AppSpecWorkerEnv> envs,

            Outputs.AppSpecWorkerGit? git,

            Outputs.AppSpecWorkerGithub? github,

            Outputs.AppSpecWorkerGitlab? gitlab,

            Outputs.AppSpecWorkerImage? image,

            int? instanceCount,

            string? instanceSizeSlug,

            ImmutableArray<Outputs.AppSpecWorkerLogDestination> logDestinations,

            string name,

            string? runCommand,

            string? sourceDir,

            Outputs.AppSpecWorkerTermination? termination)
        {
            Alerts = alerts;
            Autoscaling = autoscaling;
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
            LogDestinations = logDestinations;
            Name = name;
            RunCommand = runCommand;
            SourceDir = sourceDir;
            Termination = termination;
        }
    }
}
