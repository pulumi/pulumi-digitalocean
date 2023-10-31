// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Inputs
{

    public sealed class AppSpecStaticSiteGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An optional build command to run while building this component from source.
        /// </summary>
        [Input("buildCommand")]
        public Input<string>? BuildCommand { get; set; }

        /// <summary>
        /// The name of the document to use as the fallback for any requests to documents that are not found when serving this static site.
        /// </summary>
        [Input("catchallDocument")]
        public Input<string>? CatchallDocument { get; set; }

        /// <summary>
        /// The [CORS](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS) policies of the app.
        /// </summary>
        [Input("cors")]
        public Input<Inputs.AppSpecStaticSiteCorsGetArgs>? Cors { get; set; }

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
        private InputList<Inputs.AppSpecStaticSiteEnvGetArgs>? _envs;

        /// <summary>
        /// Describes an environment variable made available to an app competent.
        /// </summary>
        public InputList<Inputs.AppSpecStaticSiteEnvGetArgs> Envs
        {
            get => _envs ?? (_envs = new InputList<Inputs.AppSpecStaticSiteEnvGetArgs>());
            set => _envs = value;
        }

        /// <summary>
        /// The name of the error document to use when serving this static site.
        /// </summary>
        [Input("errorDocument")]
        public Input<string>? ErrorDocument { get; set; }

        /// <summary>
        /// A Git repo to use as the component's source. The repository must be able to be cloned without authentication.  Only one of `git`, `github` or `gitlab`  may be set.
        /// </summary>
        [Input("git")]
        public Input<Inputs.AppSpecStaticSiteGitGetArgs>? Git { get; set; }

        /// <summary>
        /// A GitHub repo to use as the component's source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/github/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
        /// </summary>
        [Input("github")]
        public Input<Inputs.AppSpecStaticSiteGithubGetArgs>? Github { get; set; }

        /// <summary>
        /// A Gitlab repo to use as the component's source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/gitlab/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
        /// </summary>
        [Input("gitlab")]
        public Input<Inputs.AppSpecStaticSiteGitlabGetArgs>? Gitlab { get; set; }

        /// <summary>
        /// The name of the index document to use when serving this static site.
        /// </summary>
        [Input("indexDocument")]
        public Input<string>? IndexDocument { get; set; }

        /// <summary>
        /// The name of the component.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// An optional path to where the built assets will be located, relative to the build context. If not set, App Platform will automatically scan for these directory names: `_static`, `dist`, `public`.
        /// </summary>
        [Input("outputDir")]
        public Input<string>? OutputDir { get; set; }

        [Input("routes")]
        private InputList<Inputs.AppSpecStaticSiteRouteGetArgs>? _routes;

        /// <summary>
        /// An HTTP paths that should be routed to this component.
        /// </summary>
        [Obsolete(@"Service level routes are deprecated in favor of ingresses")]
        public InputList<Inputs.AppSpecStaticSiteRouteGetArgs> Routes
        {
            get => _routes ?? (_routes = new InputList<Inputs.AppSpecStaticSiteRouteGetArgs>());
            set => _routes = value;
        }

        /// <summary>
        /// An optional path to the working directory to use for the build.
        /// </summary>
        [Input("sourceDir")]
        public Input<string>? SourceDir { get; set; }

        public AppSpecStaticSiteGetArgs()
        {
        }
        public static new AppSpecStaticSiteGetArgs Empty => new AppSpecStaticSiteGetArgs();
    }
}
