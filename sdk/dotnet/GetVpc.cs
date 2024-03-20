// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean
{
    public static class GetVpc
    {
        /// <summary>
        /// Retrieve information about a VPC for use in other resources.
        /// 
        /// This data source provides all of the VPC's properties as configured on your
        /// DigitalOcean account. This is useful if the VPC in question is not managed by
        /// the provider or you need to utilize any of the VPC's data.
        /// 
        /// VPCs may be looked up by `id` or `name`. Specifying a `region` will
        /// return that that region's default VPC.
        /// 
        /// ## Example Usage
        /// 
        /// ### VPC By Name
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetVpc.Invoke(new()
        ///     {
        ///         Name = "example-network",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// 
        /// Reuse the data about a VPC to assign a Droplet to it:
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var exampleVpc = DigitalOcean.GetVpc.Invoke(new()
        ///     {
        ///         Name = "example-network",
        ///     });
        /// 
        ///     var exampleDroplet = new DigitalOcean.Droplet("exampleDroplet", new()
        ///     {
        ///         Size = DigitalOcean.DropletSlug.DropletS1VCPU1GB,
        ///         Image = "ubuntu-18-04-x64",
        ///         Region = DigitalOcean.Region.NYC3,
        ///         VpcUuid = exampleVpc.Apply(getVpcResult =&gt; getVpcResult.Id),
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetVpcResult> InvokeAsync(GetVpcArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetVpcResult>("digitalocean:index/getVpc:getVpc", args ?? new GetVpcArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieve information about a VPC for use in other resources.
        /// 
        /// This data source provides all of the VPC's properties as configured on your
        /// DigitalOcean account. This is useful if the VPC in question is not managed by
        /// the provider or you need to utilize any of the VPC's data.
        /// 
        /// VPCs may be looked up by `id` or `name`. Specifying a `region` will
        /// return that that region's default VPC.
        /// 
        /// ## Example Usage
        /// 
        /// ### VPC By Name
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetVpc.Invoke(new()
        ///     {
        ///         Name = "example-network",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// 
        /// Reuse the data about a VPC to assign a Droplet to it:
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var exampleVpc = DigitalOcean.GetVpc.Invoke(new()
        ///     {
        ///         Name = "example-network",
        ///     });
        /// 
        ///     var exampleDroplet = new DigitalOcean.Droplet("exampleDroplet", new()
        ///     {
        ///         Size = DigitalOcean.DropletSlug.DropletS1VCPU1GB,
        ///         Image = "ubuntu-18-04-x64",
        ///         Region = DigitalOcean.Region.NYC3,
        ///         VpcUuid = exampleVpc.Apply(getVpcResult =&gt; getVpcResult.Id),
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetVpcResult> Invoke(GetVpcInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetVpcResult>("digitalocean:index/getVpc:getVpc", args ?? new GetVpcInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetVpcArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique identifier of an existing VPC.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        /// <summary>
        /// The name of an existing VPC.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// The DigitalOcean region slug for the VPC's location.
        /// </summary>
        [Input("region")]
        public string? Region { get; set; }

        public GetVpcArgs()
        {
        }
        public static new GetVpcArgs Empty => new GetVpcArgs();
    }

    public sealed class GetVpcInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique identifier of an existing VPC.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// The name of an existing VPC.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The DigitalOcean region slug for the VPC's location.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        public GetVpcInvokeArgs()
        {
        }
        public static new GetVpcInvokeArgs Empty => new GetVpcInvokeArgs();
    }


    [OutputType]
    public sealed class GetVpcResult
    {
        /// <summary>
        /// The date and time of when the VPC was created.
        /// </summary>
        public readonly string CreatedAt;
        /// <summary>
        /// A boolean indicating whether or not the VPC is the default one for the region.
        /// </summary>
        public readonly bool Default;
        /// <summary>
        /// A free-form text field describing the VPC.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The unique identifier for the VPC.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The range of IP addresses for the VPC in CIDR notation.
        /// </summary>
        public readonly string IpRange;
        /// <summary>
        /// The name of the VPC.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The DigitalOcean region slug for the VPC's location.
        /// </summary>
        public readonly string Region;
        /// <summary>
        /// The uniform resource name (URN) for the VPC.
        /// </summary>
        public readonly string Urn;

        [OutputConstructor]
        private GetVpcResult(
            string createdAt,

            bool @default,

            string description,

            string id,

            string ipRange,

            string name,

            string region,

            string urn)
        {
            CreatedAt = createdAt;
            Default = @default;
            Description = description;
            Id = id;
            IpRange = ipRange;
            Name = name;
            Region = region;
            Urn = urn;
        }
    }
}
