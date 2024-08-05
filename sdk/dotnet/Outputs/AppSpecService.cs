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
    public sealed class AppSpecService
    {
        /// <summary>
        /// Describes an alert policy for the component.
        /// </summary>
        public readonly ImmutableArray<Outputs.AppSpecServiceAlert> Alerts;
        /// <summary>
        /// Configuration for automatically scaling this component based on metrics.
        /// </summary>
        public readonly Outputs.AppSpecServiceAutoscaling? Autoscaling;
        /// <summary>
        /// An optional build command to run while building this component from source.
        /// </summary>
        public readonly string? BuildCommand;
        /// <summary>
        /// The [CORS](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS) policies of the app.
        /// </summary>
        public readonly Outputs.AppSpecServiceCors? Cors;
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
        public readonly ImmutableArray<Outputs.AppSpecServiceEnv> Envs;
        /// <summary>
        /// A Git repo to use as the component's source. The repository must be able to be cloned without authentication.  Only one of `git`, `github` or `gitlab`  may be set.
        /// </summary>
        public readonly Outputs.AppSpecServiceGit? Git;
        /// <summary>
        /// A GitHub repo to use as the component's source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/github/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
        /// </summary>
        public readonly Outputs.AppSpecServiceGithub? Github;
        /// <summary>
        /// A Gitlab repo to use as the component's source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/gitlab/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
        /// </summary>
        public readonly Outputs.AppSpecServiceGitlab? Gitlab;
        /// <summary>
        /// A health check to determine the availability of this component.
        /// </summary>
        public readonly Outputs.AppSpecServiceHealthCheck? HealthCheck;
        /// <summary>
        /// The internal port on which this service's run command will listen.
        /// </summary>
        public readonly int? HttpPort;
        /// <summary>
        /// An image to use as the component's source. Only one of `git`, `github`, `gitlab`, or `image` may be set.
        /// </summary>
        public readonly Outputs.AppSpecServiceImage? Image;
        /// <summary>
        /// The amount of instances that this component should be scaled to.
        /// </summary>
        public readonly int? InstanceCount;
        /// <summary>
        /// The instance size to use for this component. This determines the plan (basic or professional) and the available CPU and memory. The list of available instance sizes can be [found with the API](https://docs.digitalocean.com/reference/api/api-reference/#operation/list_instance_sizes) or using the [doctl CLI](https://docs.digitalocean.com/reference/doctl/) (`doctl apps tier instance-size list`). Default: `basic-xxs`
        /// </summary>
        public readonly string? InstanceSizeSlug;
        /// <summary>
        /// A list of ports on which this service will listen for internal traffic.
        /// </summary>
        public readonly ImmutableArray<int> InternalPorts;
        /// <summary>
        /// Describes a log forwarding destination.
        /// </summary>
        public readonly ImmutableArray<Outputs.AppSpecServiceLogDestination> LogDestinations;
        /// <summary>
        /// The name of the component.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// An HTTP paths that should be routed to this component.
        /// </summary>
        public readonly ImmutableArray<Outputs.AppSpecServiceRoute> Routes;
        /// <summary>
        /// An optional run command to override the component's default.
        /// </summary>
        public readonly string? RunCommand;
        /// <summary>
        /// An optional path to the working directory to use for the build.
        /// </summary>
        public readonly string? SourceDir;

        [OutputConstructor]
        private AppSpecService(
            ImmutableArray<Outputs.AppSpecServiceAlert> alerts,

            Outputs.AppSpecServiceAutoscaling? autoscaling,

            string? buildCommand,

            Outputs.AppSpecServiceCors? cors,

            string? dockerfilePath,

            string? environmentSlug,

            ImmutableArray<Outputs.AppSpecServiceEnv> envs,

            Outputs.AppSpecServiceGit? git,

            Outputs.AppSpecServiceGithub? github,

            Outputs.AppSpecServiceGitlab? gitlab,

            Outputs.AppSpecServiceHealthCheck? healthCheck,

            int? httpPort,

            Outputs.AppSpecServiceImage? image,

            int? instanceCount,

            string? instanceSizeSlug,

            ImmutableArray<int> internalPorts,

            ImmutableArray<Outputs.AppSpecServiceLogDestination> logDestinations,

            string name,

            ImmutableArray<Outputs.AppSpecServiceRoute> routes,

            string? runCommand,

            string? sourceDir)
        {
            Alerts = alerts;
            Autoscaling = autoscaling;
            BuildCommand = buildCommand;
            Cors = cors;
            DockerfilePath = dockerfilePath;
            EnvironmentSlug = environmentSlug;
            Envs = envs;
            Git = git;
            Github = github;
            Gitlab = gitlab;
            HealthCheck = healthCheck;
            HttpPort = httpPort;
            Image = image;
            InstanceCount = instanceCount;
            InstanceSizeSlug = instanceSizeSlug;
            InternalPorts = internalPorts;
            LogDestinations = logDestinations;
            Name = name;
            Routes = routes;
            RunCommand = runCommand;
            SourceDir = sourceDir;
        }
    }
}
