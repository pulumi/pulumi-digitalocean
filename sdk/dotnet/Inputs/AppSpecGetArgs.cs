// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Inputs
{

    public sealed class AppSpecGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("alerts")]
        private InputList<Inputs.AppSpecAlertGetArgs>? _alerts;

        /// <summary>
        /// Describes an alert policy for the component.
        /// </summary>
        public InputList<Inputs.AppSpecAlertGetArgs> Alerts
        {
            get => _alerts ?? (_alerts = new InputList<Inputs.AppSpecAlertGetArgs>());
            set => _alerts = value;
        }

        [Input("databases")]
        private InputList<Inputs.AppSpecDatabaseGetArgs>? _databases;
        public InputList<Inputs.AppSpecDatabaseGetArgs> Databases
        {
            get => _databases ?? (_databases = new InputList<Inputs.AppSpecDatabaseGetArgs>());
            set => _databases = value;
        }

        /// <summary>
        /// A boolean indicating whether to disable the edge cache for this app. Default: `false`. Available only for non-static sites. Requires custom domains and applies to all the domains of the app.
        /// </summary>
        [Input("disableEdgeCache")]
        public Input<bool>? DisableEdgeCache { get; set; }

        /// <summary>
        /// A boolean indicating whether to disable email obfuscation for this app. Default: `false`. Requires custom domains and applies to all the domains of the app.
        /// </summary>
        [Input("disableEmailObfuscation")]
        public Input<bool>? DisableEmailObfuscation { get; set; }

        [Input("domainNames")]
        private InputList<Inputs.AppSpecDomainNameGetArgs>? _domainNames;

        /// <summary>
        /// Describes a domain where the application will be made available.
        /// </summary>
        public InputList<Inputs.AppSpecDomainNameGetArgs> DomainNames
        {
            get => _domainNames ?? (_domainNames = new InputList<Inputs.AppSpecDomainNameGetArgs>());
            set => _domainNames = value;
        }

        [Input("domains")]
        private InputList<string>? _domains;
        [Obsolete(@"This attribute has been replaced by `domain` which supports additional functionality.")]
        public InputList<string> Domains
        {
            get => _domains ?? (_domains = new InputList<string>());
            set => _domains = value;
        }

        [Input("egresses")]
        private InputList<Inputs.AppSpecEgressGetArgs>? _egresses;

        /// <summary>
        /// Specification for app egress configurations.
        /// </summary>
        public InputList<Inputs.AppSpecEgressGetArgs> Egresses
        {
            get => _egresses ?? (_egresses = new InputList<Inputs.AppSpecEgressGetArgs>());
            set => _egresses = value;
        }

        /// <summary>
        /// A boolean, when set to `true`, enables enhanced analyzing of incoming traffic to prevent layer 7 DDoS attacks. Default: `false`. Requires custom domains and applies to all the domains of the app.
        /// </summary>
        [Input("enhancedThreatControlEnabled")]
        public Input<bool>? EnhancedThreatControlEnabled { get; set; }

        [Input("envs")]
        private InputList<Inputs.AppSpecEnvGetArgs>? _envs;

        /// <summary>
        /// Describes an environment variable made available to an app competent.
        /// </summary>
        public InputList<Inputs.AppSpecEnvGetArgs> Envs
        {
            get => _envs ?? (_envs = new InputList<Inputs.AppSpecEnvGetArgs>());
            set => _envs = value;
        }

        [Input("features")]
        private InputList<string>? _features;

        /// <summary>
        /// A list of the features applied to the app. The default buildpack can be overridden here. List of available buildpacks can be found using the [doctl CLI](https://docs.digitalocean.com/reference/doctl/reference/apps/list-buildpacks/)
        /// </summary>
        public InputList<string> Features
        {
            get => _features ?? (_features = new InputList<string>());
            set => _features = value;
        }

        [Input("functions")]
        private InputList<Inputs.AppSpecFunctionGetArgs>? _functions;
        public InputList<Inputs.AppSpecFunctionGetArgs> Functions
        {
            get => _functions ?? (_functions = new InputList<Inputs.AppSpecFunctionGetArgs>());
            set => _functions = value;
        }

        /// <summary>
        /// Specification for component routing, rewrites, and redirects.
        /// </summary>
        [Input("ingress")]
        public Input<Inputs.AppSpecIngressGetArgs>? Ingress { get; set; }

        [Input("jobs")]
        private InputList<Inputs.AppSpecJobGetArgs>? _jobs;
        public InputList<Inputs.AppSpecJobGetArgs> Jobs
        {
            get => _jobs ?? (_jobs = new InputList<Inputs.AppSpecJobGetArgs>());
            set => _jobs = value;
        }

        /// <summary>
        /// The name of the component.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The slug for the DigitalOcean data center region hosting the app.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("services")]
        private InputList<Inputs.AppSpecServiceGetArgs>? _services;
        public InputList<Inputs.AppSpecServiceGetArgs> Services
        {
            get => _services ?? (_services = new InputList<Inputs.AppSpecServiceGetArgs>());
            set => _services = value;
        }

        [Input("staticSites")]
        private InputList<Inputs.AppSpecStaticSiteGetArgs>? _staticSites;
        public InputList<Inputs.AppSpecStaticSiteGetArgs> StaticSites
        {
            get => _staticSites ?? (_staticSites = new InputList<Inputs.AppSpecStaticSiteGetArgs>());
            set => _staticSites = value;
        }

        [Input("workers")]
        private InputList<Inputs.AppSpecWorkerGetArgs>? _workers;
        public InputList<Inputs.AppSpecWorkerGetArgs> Workers
        {
            get => _workers ?? (_workers = new InputList<Inputs.AppSpecWorkerGetArgs>());
            set => _workers = value;
        }

        public AppSpecGetArgs()
        {
        }
        public static new AppSpecGetArgs Empty => new AppSpecGetArgs();
    }
}
