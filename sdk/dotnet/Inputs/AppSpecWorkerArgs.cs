// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Inputs
{

    public sealed class AppSpecWorkerArgs : global::Pulumi.ResourceArgs
    {
        [Input("alerts")]
        private InputList<Inputs.AppSpecWorkerAlertArgs>? _alerts;

        /// <summary>
        /// Describes an alert policy for the component.
        /// </summary>
        public InputList<Inputs.AppSpecWorkerAlertArgs> Alerts
        {
            get => _alerts ?? (_alerts = new InputList<Inputs.AppSpecWorkerAlertArgs>());
            set => _alerts = value;
        }

        /// <summary>
        /// Configuration for automatically scaling this component based on metrics.
        /// </summary>
        [Input("autoscaling")]
        public Input<Inputs.AppSpecWorkerAutoscalingArgs>? Autoscaling { get; set; }

        /// <summary>
        /// A GitHub repo to use as the component's source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/bitbucket/install). Only one of `git`, `github`, `bitbucket`, `gitlab`, or `image` may be set.
        /// </summary>
        [Input("bitbucket")]
        public Input<Inputs.AppSpecWorkerBitbucketArgs>? Bitbucket { get; set; }

        /// <summary>
        /// An optional build command to run while building this component from source.
        /// </summary>
        [Input("buildCommand")]
        public Input<string>? BuildCommand { get; set; }

        /// <summary>
        /// The path to a Dockerfile relative to the root of the repo. If set, overrides usage of buildpacks.
        /// </summary>
        [Input("dockerfilePath")]
        public Input<string>? DockerfilePath { get; set; }

        /// <summary>
        /// An environment slug describing the type of this app.
        /// </summary>
        [Input("environmentSlug")]
        public Input<string>? EnvironmentSlug { get; set; }

        [Input("envs")]
        private InputList<Inputs.AppSpecWorkerEnvArgs>? _envs;

        /// <summary>
        /// Describes an environment variable made available to an app competent.
        /// </summary>
        public InputList<Inputs.AppSpecWorkerEnvArgs> Envs
        {
            get => _envs ?? (_envs = new InputList<Inputs.AppSpecWorkerEnvArgs>());
            set => _envs = value;
        }

        /// <summary>
        /// A Git repo to use as the component's source. The repository must be able to be cloned without authentication. Only one of `git`, `github` or `gitlab` may be set.
        /// </summary>
        [Input("git")]
        public Input<Inputs.AppSpecWorkerGitArgs>? Git { get; set; }

        /// <summary>
        /// A GitHub repo to use as the component's source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/github/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
        /// </summary>
        [Input("github")]
        public Input<Inputs.AppSpecWorkerGithubArgs>? Github { get; set; }

        /// <summary>
        /// A Gitlab repo to use as the component's source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/gitlab/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
        /// </summary>
        [Input("gitlab")]
        public Input<Inputs.AppSpecWorkerGitlabArgs>? Gitlab { get; set; }

        /// <summary>
        /// An image to use as the component's source. Only one of `git`, `github`, `gitlab`, or `image` may be set.
        /// </summary>
        [Input("image")]
        public Input<Inputs.AppSpecWorkerImageArgs>? Image { get; set; }

        /// <summary>
        /// The amount of instances that this component should be scaled to.
        /// </summary>
        [Input("instanceCount")]
        public Input<int>? InstanceCount { get; set; }

        /// <summary>
        /// The instance size to use for this component. This determines the plan (basic or professional) and the available CPU and memory. The list of available instance sizes can be [found with the API](https://docs.digitalocean.com/reference/api/digitalocean/#tag/Apps/operation/apps_list_instanceSizes) or using the [doctl CLI](https://docs.digitalocean.com/reference/doctl/) (`doctl apps tier instance-size list`). Default: `basic-xxs`
        /// </summary>
        [Input("instanceSizeSlug")]
        public Input<string>? InstanceSizeSlug { get; set; }

        [Input("logDestinations")]
        private InputList<Inputs.AppSpecWorkerLogDestinationArgs>? _logDestinations;

        /// <summary>
        /// Describes a log forwarding destination.
        /// </summary>
        public InputList<Inputs.AppSpecWorkerLogDestinationArgs> LogDestinations
        {
            get => _logDestinations ?? (_logDestinations = new InputList<Inputs.AppSpecWorkerLogDestinationArgs>());
            set => _logDestinations = value;
        }

        /// <summary>
        /// The name of the component.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// An optional run command to override the component's default.
        /// </summary>
        [Input("runCommand")]
        public Input<string>? RunCommand { get; set; }

        /// <summary>
        /// An optional path to the working directory to use for the build.
        /// </summary>
        [Input("sourceDir")]
        public Input<string>? SourceDir { get; set; }

        /// <summary>
        /// Contains a component's termination parameters.
        /// </summary>
        [Input("termination")]
        public Input<Inputs.AppSpecWorkerTerminationArgs>? Termination { get; set; }

        public AppSpecWorkerArgs()
        {
        }
        public static new AppSpecWorkerArgs Empty => new AppSpecWorkerArgs();
    }
}
