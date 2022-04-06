// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Inputs
{

    public sealed class AppSpecServiceArgs : Pulumi.ResourceArgs
    {
        [Input("alerts")]
        private InputList<Inputs.AppSpecServiceAlertArgs>? _alerts;

        /// <summary>
        /// Describes an alert policy for the component.
        /// </summary>
        public InputList<Inputs.AppSpecServiceAlertArgs> Alerts
        {
            get => _alerts ?? (_alerts = new InputList<Inputs.AppSpecServiceAlertArgs>());
            set => _alerts = value;
        }

        /// <summary>
        /// An optional build command to run while building this component from source.
        /// </summary>
        [Input("buildCommand")]
        public Input<string>? BuildCommand { get; set; }

        /// <summary>
        /// The [CORS](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS) policies of the app.
        /// </summary>
        [Input("cors")]
        public Input<Inputs.AppSpecServiceCorsArgs>? Cors { get; set; }

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
        private InputList<Inputs.AppSpecServiceEnvArgs>? _envs;

        /// <summary>
        /// Describes an environment variable made available to an app competent.
        /// </summary>
        public InputList<Inputs.AppSpecServiceEnvArgs> Envs
        {
            get => _envs ?? (_envs = new InputList<Inputs.AppSpecServiceEnvArgs>());
            set => _envs = value;
        }

        /// <summary>
        /// A Git repo to use as the component's source. The repository must be able to be cloned without authentication.  Only one of `git`, `github` or `gitlab`  may be set
        /// </summary>
        [Input("git")]
        public Input<Inputs.AppSpecServiceGitArgs>? Git { get; set; }

        /// <summary>
        /// A GitHub repo to use as the component's source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/github/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
        /// </summary>
        [Input("github")]
        public Input<Inputs.AppSpecServiceGithubArgs>? Github { get; set; }

        /// <summary>
        /// A Gitlab repo to use as the component's source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/gitlab/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
        /// </summary>
        [Input("gitlab")]
        public Input<Inputs.AppSpecServiceGitlabArgs>? Gitlab { get; set; }

        /// <summary>
        /// A health check to determine the availability of this component.
        /// </summary>
        [Input("healthCheck")]
        public Input<Inputs.AppSpecServiceHealthCheckArgs>? HealthCheck { get; set; }

        /// <summary>
        /// The internal port on which this service's run command will listen.
        /// </summary>
        [Input("httpPort")]
        public Input<int>? HttpPort { get; set; }

        /// <summary>
        /// An image to use as the component's source. Only one of `git`, `github`, `gitlab`, or `image` may be set.
        /// </summary>
        [Input("image")]
        public Input<Inputs.AppSpecServiceImageArgs>? Image { get; set; }

        /// <summary>
        /// The amount of instances that this component should be scaled to.
        /// </summary>
        [Input("instanceCount")]
        public Input<int>? InstanceCount { get; set; }

        /// <summary>
        /// The instance size to use for this component. This determines the plan (basic or professional) and the available CPU and memory. The list of available instance sizes can be [found with the API](https://docs.digitalocean.com/reference/api/api-reference/#operation/list_instance_sizes) or using the [doctl CLI](https://docs.digitalocean.com/reference/doctl/) (`doctl apps tier instance-size list`). Default: `basic-xxs`
        /// </summary>
        [Input("instanceSizeSlug")]
        public Input<string>? InstanceSizeSlug { get; set; }

        [Input("internalPorts")]
        private InputList<int>? _internalPorts;

        /// <summary>
        /// A list of ports on which this service will listen for internal traffic.
        /// </summary>
        public InputList<int> InternalPorts
        {
            get => _internalPorts ?? (_internalPorts = new InputList<int>());
            set => _internalPorts = value;
        }

        [Input("logDestinations")]
        private InputList<Inputs.AppSpecServiceLogDestinationArgs>? _logDestinations;

        /// <summary>
        /// Describes a log forwarding destination.
        /// </summary>
        public InputList<Inputs.AppSpecServiceLogDestinationArgs> LogDestinations
        {
            get => _logDestinations ?? (_logDestinations = new InputList<Inputs.AppSpecServiceLogDestinationArgs>());
            set => _logDestinations = value;
        }

        /// <summary>
        /// The name of the component.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("routes")]
        private InputList<Inputs.AppSpecServiceRouteArgs>? _routes;
        public InputList<Inputs.AppSpecServiceRouteArgs> Routes
        {
            get => _routes ?? (_routes = new InputList<Inputs.AppSpecServiceRouteArgs>());
            set => _routes = value;
        }

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

        public AppSpecServiceArgs()
        {
        }
    }
}
