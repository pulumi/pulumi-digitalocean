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
    /// ### Limiting access to specific IP addresses
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using System.Text.Json;
    /// using Pulumi;
    /// using DigitalOcean = Pulumi.DigitalOcean;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foobar = new DigitalOcean.SpacesBucket("foobar", new()
    ///     {
    ///         Name = "foobar",
    ///         Region = DigitalOcean.Region.NYC3,
    ///     });
    /// 
    ///     var foobarSpacesBucketPolicy = new DigitalOcean.SpacesBucketPolicy("foobar", new()
    ///     {
    ///         Region = foobar.Region,
    ///         Bucket = foobar.Name,
    ///         Policy = Output.JsonSerialize(Output.Create(new Dictionary&lt;string, object?&gt;
    ///         {
    ///             ["Version"] = "2012-10-17",
    ///             ["Statement"] = new[]
    ///             {
    ///                 new Dictionary&lt;string, object?&gt;
    ///                 {
    ///                     ["Sid"] = "IPAllow",
    ///                     ["Effect"] = "Deny",
    ///                     ["Principal"] = "*",
    ///                     ["Action"] = "s3:*",
    ///                     ["Resource"] = new[]
    ///                     {
    ///                         foobar.Name.Apply(name =&gt; $"arn:aws:s3:::{name}"),
    ///                         foobar.Name.Apply(name =&gt; $"arn:aws:s3:::{name}/*"),
    ///                     },
    ///                     ["Condition"] = new Dictionary&lt;string, object?&gt;
    ///                     {
    ///                         ["NotIpAddress"] = new Dictionary&lt;string, object?&gt;
    ///                         {
    ///                             ["aws:SourceIp"] = "54.240.143.0/24",
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         })),
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// !&gt; **Warning:** Before using this policy, replace the 54.240.143.0/24 IP address range in this example with an appropriate value for your use case. Otherwise, you will lose the ability to access your bucket.
    /// 
    /// ## Import
    /// 
    /// Bucket policies can be imported using the `region` and `bucket` attributes (delimited by a comma):
    /// 
    /// ```sh
    /// $ pulumi import digitalocean:index/spacesBucketPolicy:SpacesBucketPolicy foobar `region`,`bucket`
    /// ```
    /// </summary>
    [DigitalOceanResourceType("digitalocean:index/spacesBucketPolicy:SpacesBucketPolicy")]
    public partial class SpacesBucketPolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the bucket to which to apply the policy.
        /// </summary>
        [Output("bucket")]
        public Output<string> Bucket { get; private set; } = null!;

        /// <summary>
        /// The text of the policy.
        /// </summary>
        [Output("policy")]
        public Output<string> Policy { get; private set; } = null!;

        /// <summary>
        /// The region where the bucket resides.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;


        /// <summary>
        /// Create a SpacesBucketPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SpacesBucketPolicy(string name, SpacesBucketPolicyArgs args, CustomResourceOptions? options = null)
            : base("digitalocean:index/spacesBucketPolicy:SpacesBucketPolicy", name, args ?? new SpacesBucketPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SpacesBucketPolicy(string name, Input<string> id, SpacesBucketPolicyState? state = null, CustomResourceOptions? options = null)
            : base("digitalocean:index/spacesBucketPolicy:SpacesBucketPolicy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SpacesBucketPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SpacesBucketPolicy Get(string name, Input<string> id, SpacesBucketPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new SpacesBucketPolicy(name, id, state, options);
        }
    }

    public sealed class SpacesBucketPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the bucket to which to apply the policy.
        /// </summary>
        [Input("bucket", required: true)]
        public Input<string> Bucket { get; set; } = null!;

        /// <summary>
        /// The text of the policy.
        /// </summary>
        [Input("policy", required: true)]
        public Input<string> Policy { get; set; } = null!;

        /// <summary>
        /// The region where the bucket resides.
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        public SpacesBucketPolicyArgs()
        {
        }
        public static new SpacesBucketPolicyArgs Empty => new SpacesBucketPolicyArgs();
    }

    public sealed class SpacesBucketPolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the bucket to which to apply the policy.
        /// </summary>
        [Input("bucket")]
        public Input<string>? Bucket { get; set; }

        /// <summary>
        /// The text of the policy.
        /// </summary>
        [Input("policy")]
        public Input<string>? Policy { get; set; }

        /// <summary>
        /// The region where the bucket resides.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        public SpacesBucketPolicyState()
        {
        }
        public static new SpacesBucketPolicyState Empty => new SpacesBucketPolicyState();
    }
}
