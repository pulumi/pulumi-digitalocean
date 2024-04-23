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
    /// Assign resources to a DigitalOcean Project. This is useful if you need to assign resources
    /// managed via this provider to a DigitalOcean Project managed outside of the provider.
    /// 
    /// The following resource types can be associated with a project:
    /// 
    /// * App Platform Apps
    /// * Database Clusters
    /// * Domains
    /// * Droplets
    /// * Floating IPs
    /// * Kubernetes Clusters
    /// * Load Balancers
    /// * Spaces Buckets
    /// * Volumes
    /// 
    /// ## Example Usage
    /// 
    /// The following example assigns a droplet to a Project managed outside of the provider:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using DigitalOcean = Pulumi.DigitalOcean;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var playground = DigitalOcean.GetProject.Invoke(new()
    ///     {
    ///         Name = "playground",
    ///     });
    /// 
    ///     var foobar = new DigitalOcean.Droplet("foobar", new()
    ///     {
    ///         Size = DigitalOcean.DropletSlug.DropletS1VCPU1GB,
    ///         Image = "ubuntu-22-04-x64",
    ///         Region = DigitalOcean.Region.NYC3,
    ///     });
    /// 
    ///     var barfoo = new DigitalOcean.ProjectResources("barfoo", new()
    ///     {
    ///         Project = playground.Apply(getProjectResult =&gt; getProjectResult.Id),
    ///         Resources = new[]
    ///         {
    ///             foobar.DropletUrn,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Importing this resource is not supported.
    /// </summary>
    [DigitalOceanResourceType("digitalocean:index/projectResources:ProjectResources")]
    public partial class ProjectResources : global::Pulumi.CustomResource
    {
        /// <summary>
        /// the ID of the project
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// a list of uniform resource names (URNs) for the resources associated with the project
        /// </summary>
        [Output("resources")]
        public Output<ImmutableArray<string>> Resources { get; private set; } = null!;


        /// <summary>
        /// Create a ProjectResources resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ProjectResources(string name, ProjectResourcesArgs args, CustomResourceOptions? options = null)
            : base("digitalocean:index/projectResources:ProjectResources", name, args ?? new ProjectResourcesArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ProjectResources(string name, Input<string> id, ProjectResourcesState? state = null, CustomResourceOptions? options = null)
            : base("digitalocean:index/projectResources:ProjectResources", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ProjectResources resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ProjectResources Get(string name, Input<string> id, ProjectResourcesState? state = null, CustomResourceOptions? options = null)
        {
            return new ProjectResources(name, id, state, options);
        }
    }

    public sealed class ProjectResourcesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// the ID of the project
        /// </summary>
        [Input("project", required: true)]
        public Input<string> Project { get; set; } = null!;

        [Input("resources", required: true)]
        private InputList<string>? _resources;

        /// <summary>
        /// a list of uniform resource names (URNs) for the resources associated with the project
        /// </summary>
        public InputList<string> Resources
        {
            get => _resources ?? (_resources = new InputList<string>());
            set => _resources = value;
        }

        public ProjectResourcesArgs()
        {
        }
        public static new ProjectResourcesArgs Empty => new ProjectResourcesArgs();
    }

    public sealed class ProjectResourcesState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// the ID of the project
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        [Input("resources")]
        private InputList<string>? _resources;

        /// <summary>
        /// a list of uniform resource names (URNs) for the resources associated with the project
        /// </summary>
        public InputList<string> Resources
        {
            get => _resources ?? (_resources = new InputList<string>());
            set => _resources = value;
        }

        public ProjectResourcesState()
        {
        }
        public static new ProjectResourcesState Empty => new ProjectResourcesState();
    }
}
