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
    /// ## Example Usage
    /// 
    /// ### Create a Key in a Spaces Bucket
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using DigitalOcean = Pulumi.DigitalOcean;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foobar = new DigitalOcean.SpacesBucket("foobar", new()
    ///     {
    ///         Region = DigitalOcean.Region.NYC3,
    ///     });
    /// 
    ///     var test = new DigitalOcean.SpacesBucketCorsConfiguration("test", new()
    ///     {
    ///         Bucket = foobar.Id,
    ///         Region = "nyc3",
    ///         CorsRules = new[]
    ///         {
    ///             new DigitalOcean.Inputs.SpacesBucketCorsConfigurationCorsRuleArgs
    ///             {
    ///                 AllowedHeaders = new[]
    ///                 {
    ///                     "*",
    ///                 },
    ///                 AllowedMethods = new[]
    ///                 {
    ///                     "PUT",
    ///                     "POST",
    ///                 },
    ///                 AllowedOrigins = new[]
    ///                 {
    ///                     "https://s3-website-test.hashicorp.com",
    ///                 },
    ///                 ExposeHeaders = new[]
    ///                 {
    ///                     "ETag",
    ///                 },
    ///                 MaxAgeSeconds = 3000,
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Bucket policies can be imported using the `region` and `bucket` attributes (delimited by a comma):
    /// 
    /// ```sh
    /// $ pulumi import digitalocean:index/spacesBucketCorsConfiguration:SpacesBucketCorsConfiguration foobar `region`,`bucket`
    /// ```
    /// </summary>
    [DigitalOceanResourceType("digitalocean:index/spacesBucketCorsConfiguration:SpacesBucketCorsConfiguration")]
    public partial class SpacesBucketCorsConfiguration : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the bucket to which to apply the CORS configuration.
        /// </summary>
        [Output("bucket")]
        public Output<string> Bucket { get; private set; } = null!;

        /// <summary>
        /// Set of origins and methods (cross-origin access that you want to allow). See below. You can configure up to 100 rules.
        /// </summary>
        [Output("corsRules")]
        public Output<ImmutableArray<Outputs.SpacesBucketCorsConfigurationCorsRule>> CorsRules { get; private set; } = null!;

        /// <summary>
        /// The region where the bucket resides.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;


        /// <summary>
        /// Create a SpacesBucketCorsConfiguration resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SpacesBucketCorsConfiguration(string name, SpacesBucketCorsConfigurationArgs args, CustomResourceOptions? options = null)
            : base("digitalocean:index/spacesBucketCorsConfiguration:SpacesBucketCorsConfiguration", name, args ?? new SpacesBucketCorsConfigurationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SpacesBucketCorsConfiguration(string name, Input<string> id, SpacesBucketCorsConfigurationState? state = null, CustomResourceOptions? options = null)
            : base("digitalocean:index/spacesBucketCorsConfiguration:SpacesBucketCorsConfiguration", name, state, MakeResourceOptions(options, id))
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
        /// <summary>
        /// Get an existing SpacesBucketCorsConfiguration resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SpacesBucketCorsConfiguration Get(string name, Input<string> id, SpacesBucketCorsConfigurationState? state = null, CustomResourceOptions? options = null)
        {
            return new SpacesBucketCorsConfiguration(name, id, state, options);
        }
    }

    public sealed class SpacesBucketCorsConfigurationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the bucket to which to apply the CORS configuration.
        /// </summary>
        [Input("bucket", required: true)]
        public Input<string> Bucket { get; set; } = null!;

        [Input("corsRules", required: true)]
        private InputList<Inputs.SpacesBucketCorsConfigurationCorsRuleArgs>? _corsRules;

        /// <summary>
        /// Set of origins and methods (cross-origin access that you want to allow). See below. You can configure up to 100 rules.
        /// </summary>
        public InputList<Inputs.SpacesBucketCorsConfigurationCorsRuleArgs> CorsRules
        {
            get => _corsRules ?? (_corsRules = new InputList<Inputs.SpacesBucketCorsConfigurationCorsRuleArgs>());
            set => _corsRules = value;
        }

        /// <summary>
        /// The region where the bucket resides.
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        public SpacesBucketCorsConfigurationArgs()
        {
        }
        public static new SpacesBucketCorsConfigurationArgs Empty => new SpacesBucketCorsConfigurationArgs();
    }

    public sealed class SpacesBucketCorsConfigurationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the bucket to which to apply the CORS configuration.
        /// </summary>
        [Input("bucket")]
        public Input<string>? Bucket { get; set; }

        [Input("corsRules")]
        private InputList<Inputs.SpacesBucketCorsConfigurationCorsRuleGetArgs>? _corsRules;

        /// <summary>
        /// Set of origins and methods (cross-origin access that you want to allow). See below. You can configure up to 100 rules.
        /// </summary>
        public InputList<Inputs.SpacesBucketCorsConfigurationCorsRuleGetArgs> CorsRules
        {
            get => _corsRules ?? (_corsRules = new InputList<Inputs.SpacesBucketCorsConfigurationCorsRuleGetArgs>());
            set => _corsRules = value;
        }

        /// <summary>
        /// The region where the bucket resides.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        public SpacesBucketCorsConfigurationState()
        {
        }
        public static new SpacesBucketCorsConfigurationState Empty => new SpacesBucketCorsConfigurationState();
    }
}
