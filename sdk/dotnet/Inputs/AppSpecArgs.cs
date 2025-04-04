// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Inputs
{

    public sealed class AppSpecArgs : global::Pulumi.ResourceArgs
    {
        [Input("alerts")]
        private InputList<Inputs.AppSpecAlertArgs>? _alerts;

        /// <summary>
        /// Describes an alert policy for the component.
        /// </summary>
        public InputList<Inputs.AppSpecAlertArgs> Alerts
        {
            get => _alerts ?? (_alerts = new InputList<Inputs.AppSpecAlertArgs>());
            set => _alerts = value;
        }

        [Input("databases")]
        private InputList<Inputs.AppSpecDatabaseArgs>? _databases;
        public InputList<Inputs.AppSpecDatabaseArgs> Databases
        {
            get => _databases ?? (_databases = new InputList<Inputs.AppSpecDatabaseArgs>());
            set => _databases = value;
        }

        [Input("domainNames")]
        private InputList<Inputs.AppSpecDomainNameArgs>? _domainNames;

        /// <summary>
        /// Describes a domain where the application will be made available.
        /// </summary>
        public InputList<Inputs.AppSpecDomainNameArgs> DomainNames
        {
            get => _domainNames ?? (_domainNames = new InputList<Inputs.AppSpecDomainNameArgs>());
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
        private InputList<Inputs.AppSpecEgressArgs>? _egresses;

        /// <summary>
        /// Specification for app egress configurations.
        /// </summary>
        public InputList<Inputs.AppSpecEgressArgs> Egresses
        {
            get => _egresses ?? (_egresses = new InputList<Inputs.AppSpecEgressArgs>());
            set => _egresses = value;
        }

        [Input("envs")]
        private InputList<Inputs.AppSpecEnvArgs>? _envs;

        /// <summary>
        /// Describes an environment variable made available to an app competent.
        /// </summary>
        public InputList<Inputs.AppSpecEnvArgs> Envs
        {
            get => _envs ?? (_envs = new InputList<Inputs.AppSpecEnvArgs>());
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
        private InputList<Inputs.AppSpecFunctionArgs>? _functions;
        public InputList<Inputs.AppSpecFunctionArgs> Functions
        {
            get => _functions ?? (_functions = new InputList<Inputs.AppSpecFunctionArgs>());
            set => _functions = value;
        }

        /// <summary>
        /// Specification for component routing, rewrites, and redirects.
        /// </summary>
        [Input("ingress")]
        public Input<Inputs.AppSpecIngressArgs>? Ingress { get; set; }

        [Input("jobs")]
        private InputList<Inputs.AppSpecJobArgs>? _jobs;
        public InputList<Inputs.AppSpecJobArgs> Jobs
        {
            get => _jobs ?? (_jobs = new InputList<Inputs.AppSpecJobArgs>());
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
        private InputList<Inputs.AppSpecServiceArgs>? _services;
        public InputList<Inputs.AppSpecServiceArgs> Services
        {
            get => _services ?? (_services = new InputList<Inputs.AppSpecServiceArgs>());
            set => _services = value;
        }

        [Input("staticSites")]
        private InputList<Inputs.AppSpecStaticSiteArgs>? _staticSites;
        public InputList<Inputs.AppSpecStaticSiteArgs> StaticSites
        {
            get => _staticSites ?? (_staticSites = new InputList<Inputs.AppSpecStaticSiteArgs>());
            set => _staticSites = value;
        }

        [Input("workers")]
        private InputList<Inputs.AppSpecWorkerArgs>? _workers;
        public InputList<Inputs.AppSpecWorkerArgs> Workers
        {
            get => _workers ?? (_workers = new InputList<Inputs.AppSpecWorkerArgs>());
            set => _workers = value;
        }

        public AppSpecArgs()
        {
        }
        public static new AppSpecArgs Empty => new AppSpecArgs();
    }
}
