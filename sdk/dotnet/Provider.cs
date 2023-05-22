// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean
{
    /// <summary>
    /// The provider type for the digitalocean package. By default, resources use package-wide configuration
    /// settings, however an explicit `Provider` instance may be created and passed during resource
    /// construction to achieve fine-grained programmatic control over provider settings. See the
    /// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
    /// </summary>
    [DigitalOceanResourceType("pulumi:providers:digitalocean")]
    public partial class Provider : global::Pulumi.ProviderResource
    {
        /// <summary>
        /// The URL to use for the DigitalOcean API.
        /// </summary>
        [Output("apiEndpoint")]
        public Output<string?> ApiEndpoint { get; private set; } = null!;

        /// <summary>
        /// The access key ID for Spaces API operations.
        /// </summary>
        [Output("spacesAccessId")]
        public Output<string?> SpacesAccessId { get; private set; } = null!;

        /// <summary>
        /// The URL to use for the DigitalOcean Spaces API.
        /// </summary>
        [Output("spacesEndpoint")]
        public Output<string?> SpacesEndpoint { get; private set; } = null!;

        /// <summary>
        /// The secret access key for Spaces API operations.
        /// </summary>
        [Output("spacesSecretKey")]
        public Output<string?> SpacesSecretKey { get; private set; } = null!;

        /// <summary>
        /// The token key for API operations.
        /// </summary>
        [Output("token")]
        public Output<string?> Token { get; private set; } = null!;


        /// <summary>
        /// Create a Provider resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Provider(string name, ProviderArgs? args = null, CustomResourceOptions? options = null)
            : base("digitalocean", name, args ?? new ProviderArgs(), MakeResourceOptions(options, ""))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
    }

    public sealed class ProviderArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The URL to use for the DigitalOcean API.
        /// </summary>
        [Input("apiEndpoint")]
        public Input<string>? ApiEndpoint { get; set; }

        /// <summary>
        /// The maximum number of retries on a failed API request.
        /// </summary>
        [Input("httpRetryMax", json: true)]
        public Input<int>? HttpRetryMax { get; set; }

        /// <summary>
        /// The maximum wait time (in seconds) between failed API requests.
        /// </summary>
        [Input("httpRetryWaitMax", json: true)]
        public Input<double>? HttpRetryWaitMax { get; set; }

        /// <summary>
        /// The minimum wait time (in seconds) between failed API requests.
        /// </summary>
        [Input("httpRetryWaitMin", json: true)]
        public Input<double>? HttpRetryWaitMin { get; set; }

        /// <summary>
        /// The rate of requests per second to limit the HTTP client.
        /// </summary>
        [Input("requestsPerSecond", json: true)]
        public Input<double>? RequestsPerSecond { get; set; }

        /// <summary>
        /// The access key ID for Spaces API operations.
        /// </summary>
        [Input("spacesAccessId")]
        public Input<string>? SpacesAccessId { get; set; }

        /// <summary>
        /// The URL to use for the DigitalOcean Spaces API.
        /// </summary>
        [Input("spacesEndpoint")]
        public Input<string>? SpacesEndpoint { get; set; }

        /// <summary>
        /// The secret access key for Spaces API operations.
        /// </summary>
        [Input("spacesSecretKey")]
        public Input<string>? SpacesSecretKey { get; set; }

        /// <summary>
        /// The token key for API operations.
        /// </summary>
        [Input("token")]
        public Input<string>? Token { get; set; }

        public ProviderArgs()
        {
            ApiEndpoint = Utilities.GetEnv("DIGITALOCEAN_API_URL") ?? "https://api.digitalocean.com";
            SpacesEndpoint = Utilities.GetEnv("SPACES_ENDPOINT_URL");
        }
        public static new ProviderArgs Empty => new ProviderArgs();
    }
}
