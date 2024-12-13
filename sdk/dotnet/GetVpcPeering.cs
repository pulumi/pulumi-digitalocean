// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean
{
    public static class GetVpcPeering
    {
        /// <summary>
        /// ## Example Usage
        /// 
        /// ### VPC Peering By Id
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetVpcPeering.Invoke(new()
        ///     {
        ///         Id = "example-id",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// Reuse the data about a VPC Peering in other resources:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetVpcPeering.Invoke(new()
        ///     {
        ///         Id = "example-id",
        ///     });
        /// 
        ///     var exampleDroplet = new DigitalOcean.Droplet("example", new()
        ///     {
        ///         Name = "example-01",
        ///         Size = DigitalOcean.DropletSlug.DropletS1VCPU1GB,
        ///         Image = "ubuntu-18-04-x64",
        ///         Region = DigitalOcean.Region.NYC3,
        ///         VpcUuid = example.Apply(getVpcPeeringResult =&gt; getVpcPeeringResult.VpcIds[0]),
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ### VPC Peering By Name
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetVpcPeering.Invoke(new()
        ///     {
        ///         Name = "example-peering",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// Reuse the data about a VPC Peering in other resources:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetVpcPeering.Invoke(new()
        ///     {
        ///         Name = "example-peering",
        ///     });
        /// 
        ///     var exampleDroplet = new DigitalOcean.Droplet("example", new()
        ///     {
        ///         Name = "example-01",
        ///         Size = DigitalOcean.DropletSlug.DropletS1VCPU1GB,
        ///         Image = "ubuntu-18-04-x64",
        ///         Region = DigitalOcean.Region.NYC3,
        ///         VpcUuid = example.Apply(getVpcPeeringResult =&gt; getVpcPeeringResult.VpcIds[0]),
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetVpcPeeringResult> InvokeAsync(GetVpcPeeringArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetVpcPeeringResult>("digitalocean:index/getVpcPeering:getVpcPeering", args ?? new GetVpcPeeringArgs(), options.WithDefaults());

        /// <summary>
        /// ## Example Usage
        /// 
        /// ### VPC Peering By Id
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetVpcPeering.Invoke(new()
        ///     {
        ///         Id = "example-id",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// Reuse the data about a VPC Peering in other resources:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetVpcPeering.Invoke(new()
        ///     {
        ///         Id = "example-id",
        ///     });
        /// 
        ///     var exampleDroplet = new DigitalOcean.Droplet("example", new()
        ///     {
        ///         Name = "example-01",
        ///         Size = DigitalOcean.DropletSlug.DropletS1VCPU1GB,
        ///         Image = "ubuntu-18-04-x64",
        ///         Region = DigitalOcean.Region.NYC3,
        ///         VpcUuid = example.Apply(getVpcPeeringResult =&gt; getVpcPeeringResult.VpcIds[0]),
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ### VPC Peering By Name
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetVpcPeering.Invoke(new()
        ///     {
        ///         Name = "example-peering",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// Reuse the data about a VPC Peering in other resources:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetVpcPeering.Invoke(new()
        ///     {
        ///         Name = "example-peering",
        ///     });
        /// 
        ///     var exampleDroplet = new DigitalOcean.Droplet("example", new()
        ///     {
        ///         Name = "example-01",
        ///         Size = DigitalOcean.DropletSlug.DropletS1VCPU1GB,
        ///         Image = "ubuntu-18-04-x64",
        ///         Region = DigitalOcean.Region.NYC3,
        ///         VpcUuid = example.Apply(getVpcPeeringResult =&gt; getVpcPeeringResult.VpcIds[0]),
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetVpcPeeringResult> Invoke(GetVpcPeeringInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetVpcPeeringResult>("digitalocean:index/getVpcPeering:getVpcPeering", args ?? new GetVpcPeeringInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// ## Example Usage
        /// 
        /// ### VPC Peering By Id
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetVpcPeering.Invoke(new()
        ///     {
        ///         Id = "example-id",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// Reuse the data about a VPC Peering in other resources:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetVpcPeering.Invoke(new()
        ///     {
        ///         Id = "example-id",
        ///     });
        /// 
        ///     var exampleDroplet = new DigitalOcean.Droplet("example", new()
        ///     {
        ///         Name = "example-01",
        ///         Size = DigitalOcean.DropletSlug.DropletS1VCPU1GB,
        ///         Image = "ubuntu-18-04-x64",
        ///         Region = DigitalOcean.Region.NYC3,
        ///         VpcUuid = example.Apply(getVpcPeeringResult =&gt; getVpcPeeringResult.VpcIds[0]),
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ### VPC Peering By Name
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetVpcPeering.Invoke(new()
        ///     {
        ///         Name = "example-peering",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// Reuse the data about a VPC Peering in other resources:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetVpcPeering.Invoke(new()
        ///     {
        ///         Name = "example-peering",
        ///     });
        /// 
        ///     var exampleDroplet = new DigitalOcean.Droplet("example", new()
        ///     {
        ///         Name = "example-01",
        ///         Size = DigitalOcean.DropletSlug.DropletS1VCPU1GB,
        ///         Image = "ubuntu-18-04-x64",
        ///         Region = DigitalOcean.Region.NYC3,
        ///         VpcUuid = example.Apply(getVpcPeeringResult =&gt; getVpcPeeringResult.VpcIds[0]),
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetVpcPeeringResult> Invoke(GetVpcPeeringInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetVpcPeeringResult>("digitalocean:index/getVpcPeering:getVpcPeering", args ?? new GetVpcPeeringInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetVpcPeeringArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique identifier of an existing VPC Peering.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        /// <summary>
        /// The name of an existing VPC Peering.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        [Input("vpcIds")]
        private List<string>? _vpcIds;

        /// <summary>
        /// The list of VPC IDs involved in the peering.
        /// </summary>
        public List<string> VpcIds
        {
            get => _vpcIds ?? (_vpcIds = new List<string>());
            set => _vpcIds = value;
        }

        public GetVpcPeeringArgs()
        {
        }
        public static new GetVpcPeeringArgs Empty => new GetVpcPeeringArgs();
    }

    public sealed class GetVpcPeeringInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique identifier of an existing VPC Peering.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// The name of an existing VPC Peering.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("vpcIds")]
        private InputList<string>? _vpcIds;

        /// <summary>
        /// The list of VPC IDs involved in the peering.
        /// </summary>
        public InputList<string> VpcIds
        {
            get => _vpcIds ?? (_vpcIds = new InputList<string>());
            set => _vpcIds = value;
        }

        public GetVpcPeeringInvokeArgs()
        {
        }
        public static new GetVpcPeeringInvokeArgs Empty => new GetVpcPeeringInvokeArgs();
    }


    [OutputType]
    public sealed class GetVpcPeeringResult
    {
        /// <summary>
        /// The date and time of when the VPC Peering was created.
        /// </summary>
        public readonly string CreatedAt;
        /// <summary>
        /// The unique identifier for the VPC Peering.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The name of the VPC Peering.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The status of the VPC Peering.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// The list of VPC IDs involved in the peering.
        /// </summary>
        public readonly ImmutableArray<string> VpcIds;

        [OutputConstructor]
        private GetVpcPeeringResult(
            string createdAt,

            string id,

            string name,

            string status,

            ImmutableArray<string> vpcIds)
        {
            CreatedAt = createdAt;
            Id = id;
            Name = name;
            Status = status;
            VpcIds = vpcIds;
        }
    }
}
