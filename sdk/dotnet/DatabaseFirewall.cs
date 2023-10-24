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
    /// Provides a DigitalOcean database firewall resource allowing you to restrict
    /// connections to your database to trusted sources. You may limit connections to
    /// specific Droplets, Kubernetes clusters, or IP addresses.
    /// 
    /// ## Example Usage
    /// 
    /// ## Import
    /// 
    /// Database firewalls can be imported using the `id` of the target database cluster For example
    /// 
    /// ```sh
    ///  $ pulumi import digitalocean:index/databaseFirewall:DatabaseFirewall example-fw 5f55c6cd-863b-4907-99b8-7e09b0275d54
    /// ```
    /// </summary>
    [DigitalOceanResourceType("digitalocean:index/databaseFirewall:DatabaseFirewall")]
    public partial class DatabaseFirewall : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the target database cluster.
        /// </summary>
        [Output("clusterId")]
        public Output<string> ClusterId { get; private set; } = null!;

        /// <summary>
        /// A rule specifying a resource allowed to access the database cluster. The following arguments must be specified:
        /// </summary>
        [Output("rules")]
        public Output<ImmutableArray<Outputs.DatabaseFirewallRule>> Rules { get; private set; } = null!;


        /// <summary>
        /// Create a DatabaseFirewall resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DatabaseFirewall(string name, DatabaseFirewallArgs args, CustomResourceOptions? options = null)
            : base("digitalocean:index/databaseFirewall:DatabaseFirewall", name, args ?? new DatabaseFirewallArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DatabaseFirewall(string name, Input<string> id, DatabaseFirewallState? state = null, CustomResourceOptions? options = null)
            : base("digitalocean:index/databaseFirewall:DatabaseFirewall", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DatabaseFirewall resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DatabaseFirewall Get(string name, Input<string> id, DatabaseFirewallState? state = null, CustomResourceOptions? options = null)
        {
            return new DatabaseFirewall(name, id, state, options);
        }
    }

    public sealed class DatabaseFirewallArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the target database cluster.
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        [Input("rules", required: true)]
        private InputList<Inputs.DatabaseFirewallRuleArgs>? _rules;

        /// <summary>
        /// A rule specifying a resource allowed to access the database cluster. The following arguments must be specified:
        /// </summary>
        public InputList<Inputs.DatabaseFirewallRuleArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.DatabaseFirewallRuleArgs>());
            set => _rules = value;
        }

        public DatabaseFirewallArgs()
        {
        }
        public static new DatabaseFirewallArgs Empty => new DatabaseFirewallArgs();
    }

    public sealed class DatabaseFirewallState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the target database cluster.
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        [Input("rules")]
        private InputList<Inputs.DatabaseFirewallRuleGetArgs>? _rules;

        /// <summary>
        /// A rule specifying a resource allowed to access the database cluster. The following arguments must be specified:
        /// </summary>
        public InputList<Inputs.DatabaseFirewallRuleGetArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.DatabaseFirewallRuleGetArgs>());
            set => _rules = value;
        }

        public DatabaseFirewallState()
        {
        }
        public static new DatabaseFirewallState Empty => new DatabaseFirewallState();
    }
}
