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
    /// Provides a DigitalOcean Cloud Firewall resource. This can be used to create,
    /// modify, and delete Firewalls.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using DigitalOcean = Pulumi.DigitalOcean;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var webDroplet = new DigitalOcean.Droplet("webDroplet", new DigitalOcean.DropletArgs
    ///         {
    ///             Size = "s-1vcpu-1gb",
    ///             Image = "ubuntu-18-04-x64",
    ///             Region = "nyc3",
    ///         });
    ///         var webFirewall = new DigitalOcean.Firewall("webFirewall", new DigitalOcean.FirewallArgs
    ///         {
    ///             DropletIds = 
    ///             {
    ///                 webDroplet.Id,
    ///             },
    ///             InboundRules = 
    ///             {
    ///                 new DigitalOcean.Inputs.FirewallInboundRuleArgs
    ///                 {
    ///                     Protocol = "tcp",
    ///                     PortRange = "22",
    ///                     SourceAddresses = 
    ///                     {
    ///                         "192.168.1.0/24",
    ///                         "2002:1:2::/48",
    ///                     },
    ///                 },
    ///                 new DigitalOcean.Inputs.FirewallInboundRuleArgs
    ///                 {
    ///                     Protocol = "tcp",
    ///                     PortRange = "80",
    ///                     SourceAddresses = 
    ///                     {
    ///                         "0.0.0.0/0",
    ///                         "::/0",
    ///                     },
    ///                 },
    ///                 new DigitalOcean.Inputs.FirewallInboundRuleArgs
    ///                 {
    ///                     Protocol = "tcp",
    ///                     PortRange = "443",
    ///                     SourceAddresses = 
    ///                     {
    ///                         "0.0.0.0/0",
    ///                         "::/0",
    ///                     },
    ///                 },
    ///                 new DigitalOcean.Inputs.FirewallInboundRuleArgs
    ///                 {
    ///                     Protocol = "icmp",
    ///                     SourceAddresses = 
    ///                     {
    ///                         "0.0.0.0/0",
    ///                         "::/0",
    ///                     },
    ///                 },
    ///             },
    ///             OutboundRules = 
    ///             {
    ///                 new DigitalOcean.Inputs.FirewallOutboundRuleArgs
    ///                 {
    ///                     Protocol = "tcp",
    ///                     PortRange = "53",
    ///                     DestinationAddresses = 
    ///                     {
    ///                         "0.0.0.0/0",
    ///                         "::/0",
    ///                     },
    ///                 },
    ///                 new DigitalOcean.Inputs.FirewallOutboundRuleArgs
    ///                 {
    ///                     Protocol = "udp",
    ///                     PortRange = "53",
    ///                     DestinationAddresses = 
    ///                     {
    ///                         "0.0.0.0/0",
    ///                         "::/0",
    ///                     },
    ///                 },
    ///                 new DigitalOcean.Inputs.FirewallOutboundRuleArgs
    ///                 {
    ///                     Protocol = "icmp",
    ///                     DestinationAddresses = 
    ///                     {
    ///                         "0.0.0.0/0",
    ///                         "::/0",
    ///                     },
    ///                 },
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    public partial class Firewall : Pulumi.CustomResource
    {
        /// <summary>
        /// A time value given in ISO8601 combined date and time format
        /// that represents when the Firewall was created.
        /// </summary>
        [Output("createdAt")]
        public Output<string> CreatedAt { get; private set; } = null!;

        /// <summary>
        /// The list of the IDs of the Droplets assigned
        /// to the Firewall.
        /// </summary>
        [Output("dropletIds")]
        public Output<ImmutableArray<int>> DropletIds { get; private set; } = null!;

        /// <summary>
        /// The inbound access rule block for the Firewall.
        /// The `inbound_rule` block is documented below.
        /// </summary>
        [Output("inboundRules")]
        public Output<ImmutableArray<Outputs.FirewallInboundRule>> InboundRules { get; private set; } = null!;

        /// <summary>
        /// The Firewall name
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The outbound access rule block for the Firewall.
        /// The `outbound_rule` block is documented below.
        /// </summary>
        [Output("outboundRules")]
        public Output<ImmutableArray<Outputs.FirewallOutboundRule>> OutboundRules { get; private set; } = null!;

        /// <summary>
        /// An list of object containing the fields, "droplet_id",
        /// "removing", and "status".  It is provided to detail exactly which Droplets
        /// are having their security policies updated.  When empty, all changes
        /// have been successfully applied.
        /// </summary>
        [Output("pendingChanges")]
        public Output<ImmutableArray<Outputs.FirewallPendingChange>> PendingChanges { get; private set; } = null!;

        /// <summary>
        /// A status string indicating the current state of the Firewall.
        /// This can be "waiting", "succeeded", or "failed".
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The names of the Tags assigned to the Firewall.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a Firewall resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Firewall(string name, FirewallArgs? args = null, CustomResourceOptions? options = null)
            : base("digitalocean:index/firewall:Firewall", name, args ?? new FirewallArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Firewall(string name, Input<string> id, FirewallState? state = null, CustomResourceOptions? options = null)
            : base("digitalocean:index/firewall:Firewall", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Firewall resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Firewall Get(string name, Input<string> id, FirewallState? state = null, CustomResourceOptions? options = null)
        {
            return new Firewall(name, id, state, options);
        }
    }

    public sealed class FirewallArgs : Pulumi.ResourceArgs
    {
        [Input("dropletIds")]
        private InputList<int>? _dropletIds;

        /// <summary>
        /// The list of the IDs of the Droplets assigned
        /// to the Firewall.
        /// </summary>
        public InputList<int> DropletIds
        {
            get => _dropletIds ?? (_dropletIds = new InputList<int>());
            set => _dropletIds = value;
        }

        [Input("inboundRules")]
        private InputList<Inputs.FirewallInboundRuleArgs>? _inboundRules;

        /// <summary>
        /// The inbound access rule block for the Firewall.
        /// The `inbound_rule` block is documented below.
        /// </summary>
        public InputList<Inputs.FirewallInboundRuleArgs> InboundRules
        {
            get => _inboundRules ?? (_inboundRules = new InputList<Inputs.FirewallInboundRuleArgs>());
            set => _inboundRules = value;
        }

        /// <summary>
        /// The Firewall name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("outboundRules")]
        private InputList<Inputs.FirewallOutboundRuleArgs>? _outboundRules;

        /// <summary>
        /// The outbound access rule block for the Firewall.
        /// The `outbound_rule` block is documented below.
        /// </summary>
        public InputList<Inputs.FirewallOutboundRuleArgs> OutboundRules
        {
            get => _outboundRules ?? (_outboundRules = new InputList<Inputs.FirewallOutboundRuleArgs>());
            set => _outboundRules = value;
        }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// The names of the Tags assigned to the Firewall.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        public FirewallArgs()
        {
        }
    }

    public sealed class FirewallState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// A time value given in ISO8601 combined date and time format
        /// that represents when the Firewall was created.
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        [Input("dropletIds")]
        private InputList<int>? _dropletIds;

        /// <summary>
        /// The list of the IDs of the Droplets assigned
        /// to the Firewall.
        /// </summary>
        public InputList<int> DropletIds
        {
            get => _dropletIds ?? (_dropletIds = new InputList<int>());
            set => _dropletIds = value;
        }

        [Input("inboundRules")]
        private InputList<Inputs.FirewallInboundRuleGetArgs>? _inboundRules;

        /// <summary>
        /// The inbound access rule block for the Firewall.
        /// The `inbound_rule` block is documented below.
        /// </summary>
        public InputList<Inputs.FirewallInboundRuleGetArgs> InboundRules
        {
            get => _inboundRules ?? (_inboundRules = new InputList<Inputs.FirewallInboundRuleGetArgs>());
            set => _inboundRules = value;
        }

        /// <summary>
        /// The Firewall name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("outboundRules")]
        private InputList<Inputs.FirewallOutboundRuleGetArgs>? _outboundRules;

        /// <summary>
        /// The outbound access rule block for the Firewall.
        /// The `outbound_rule` block is documented below.
        /// </summary>
        public InputList<Inputs.FirewallOutboundRuleGetArgs> OutboundRules
        {
            get => _outboundRules ?? (_outboundRules = new InputList<Inputs.FirewallOutboundRuleGetArgs>());
            set => _outboundRules = value;
        }

        [Input("pendingChanges")]
        private InputList<Inputs.FirewallPendingChangeGetArgs>? _pendingChanges;

        /// <summary>
        /// An list of object containing the fields, "droplet_id",
        /// "removing", and "status".  It is provided to detail exactly which Droplets
        /// are having their security policies updated.  When empty, all changes
        /// have been successfully applied.
        /// </summary>
        public InputList<Inputs.FirewallPendingChangeGetArgs> PendingChanges
        {
            get => _pendingChanges ?? (_pendingChanges = new InputList<Inputs.FirewallPendingChangeGetArgs>());
            set => _pendingChanges = value;
        }

        /// <summary>
        /// A status string indicating the current state of the Firewall.
        /// This can be "waiting", "succeeded", or "failed".
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// The names of the Tags assigned to the Firewall.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        public FirewallState()
        {
        }
    }
}
