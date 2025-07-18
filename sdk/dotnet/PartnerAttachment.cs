// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean
{
    [DigitalOceanResourceType("digitalocean:index/partnerAttachment:PartnerAttachment")]
    public partial class PartnerAttachment : global::Pulumi.CustomResource
    {
        [Output("bgp")]
        public Output<Outputs.PartnerAttachmentBgp> Bgp { get; private set; } = null!;

        /// <summary>
        /// The children uuids of Partner Attachment
        /// </summary>
        [Output("childrens")]
        public Output<ImmutableArray<string>> Childrens { get; private set; } = null!;

        /// <summary>
        /// The connection bandwidth in Mbps
        /// </summary>
        [Output("connectionBandwidthInMbps")]
        public Output<int> ConnectionBandwidthInMbps { get; private set; } = null!;

        /// <summary>
        /// The date and time when the Partner Attachment was created
        /// </summary>
        [Output("createdAt")]
        public Output<string> CreatedAt { get; private set; } = null!;

        /// <summary>
        /// The NaaS provider
        /// </summary>
        [Output("naasProvider")]
        public Output<string> NaasProvider { get; private set; } = null!;

        /// <summary>
        /// The name of the Partner Attachment
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The UUID of the Parent Partner Attachment
        /// </summary>
        [Output("parentUuid")]
        public Output<string?> ParentUuid { get; private set; } = null!;

        /// <summary>
        /// The redundancy zone for the NaaS
        /// </summary>
        [Output("redundancyZone")]
        public Output<string> RedundancyZone { get; private set; } = null!;

        /// <summary>
        /// The region where the Partner Attachment will be created
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// The state of the Partner Attachment
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// The list of VPC IDs to attach the Partner Attachment to
        /// </summary>
        [Output("vpcIds")]
        public Output<ImmutableArray<string>> VpcIds { get; private set; } = null!;


        /// <summary>
        /// Create a PartnerAttachment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PartnerAttachment(string name, PartnerAttachmentArgs args, CustomResourceOptions? options = null)
            : base("digitalocean:index/partnerAttachment:PartnerAttachment", name, args ?? new PartnerAttachmentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PartnerAttachment(string name, Input<string> id, PartnerAttachmentState? state = null, CustomResourceOptions? options = null)
            : base("digitalocean:index/partnerAttachment:PartnerAttachment", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PartnerAttachment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PartnerAttachment Get(string name, Input<string> id, PartnerAttachmentState? state = null, CustomResourceOptions? options = null)
        {
            return new PartnerAttachment(name, id, state, options);
        }
    }

    public sealed class PartnerAttachmentArgs : global::Pulumi.ResourceArgs
    {
        [Input("bgp")]
        public Input<Inputs.PartnerAttachmentBgpArgs>? Bgp { get; set; }

        /// <summary>
        /// The connection bandwidth in Mbps
        /// </summary>
        [Input("connectionBandwidthInMbps", required: true)]
        public Input<int> ConnectionBandwidthInMbps { get; set; } = null!;

        /// <summary>
        /// The NaaS provider
        /// </summary>
        [Input("naasProvider", required: true)]
        public Input<string> NaasProvider { get; set; } = null!;

        /// <summary>
        /// The name of the Partner Attachment
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The UUID of the Parent Partner Attachment
        /// </summary>
        [Input("parentUuid")]
        public Input<string>? ParentUuid { get; set; }

        /// <summary>
        /// The redundancy zone for the NaaS
        /// </summary>
        [Input("redundancyZone")]
        public Input<string>? RedundancyZone { get; set; }

        /// <summary>
        /// The region where the Partner Attachment will be created
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        [Input("vpcIds", required: true)]
        private InputList<string>? _vpcIds;

        /// <summary>
        /// The list of VPC IDs to attach the Partner Attachment to
        /// </summary>
        public InputList<string> VpcIds
        {
            get => _vpcIds ?? (_vpcIds = new InputList<string>());
            set => _vpcIds = value;
        }

        public PartnerAttachmentArgs()
        {
        }
        public static new PartnerAttachmentArgs Empty => new PartnerAttachmentArgs();
    }

    public sealed class PartnerAttachmentState : global::Pulumi.ResourceArgs
    {
        [Input("bgp")]
        public Input<Inputs.PartnerAttachmentBgpGetArgs>? Bgp { get; set; }

        [Input("childrens")]
        private InputList<string>? _childrens;

        /// <summary>
        /// The children uuids of Partner Attachment
        /// </summary>
        public InputList<string> Childrens
        {
            get => _childrens ?? (_childrens = new InputList<string>());
            set => _childrens = value;
        }

        /// <summary>
        /// The connection bandwidth in Mbps
        /// </summary>
        [Input("connectionBandwidthInMbps")]
        public Input<int>? ConnectionBandwidthInMbps { get; set; }

        /// <summary>
        /// The date and time when the Partner Attachment was created
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        /// <summary>
        /// The NaaS provider
        /// </summary>
        [Input("naasProvider")]
        public Input<string>? NaasProvider { get; set; }

        /// <summary>
        /// The name of the Partner Attachment
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The UUID of the Parent Partner Attachment
        /// </summary>
        [Input("parentUuid")]
        public Input<string>? ParentUuid { get; set; }

        /// <summary>
        /// The redundancy zone for the NaaS
        /// </summary>
        [Input("redundancyZone")]
        public Input<string>? RedundancyZone { get; set; }

        /// <summary>
        /// The region where the Partner Attachment will be created
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// The state of the Partner Attachment
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        [Input("vpcIds")]
        private InputList<string>? _vpcIds;

        /// <summary>
        /// The list of VPC IDs to attach the Partner Attachment to
        /// </summary>
        public InputList<string> VpcIds
        {
            get => _vpcIds ?? (_vpcIds = new InputList<string>());
            set => _vpcIds = value;
        }

        public PartnerAttachmentState()
        {
        }
        public static new PartnerAttachmentState Empty => new PartnerAttachmentState();
    }
}
