// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean
{
    public static class GetFloatingIp
    {
        /// <summary>
        /// Get information on a floating ip. This data source provides the region and Droplet id
        /// as configured on your DigitalOcean account. This is useful if the floating IP
        /// in question is not managed by this provider or you need to find the Droplet the IP is
        /// attached to.
        /// 
        /// An error is triggered if the provided floating IP does not exist.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Get the floating IP:
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var config = new Config();
        ///         var publicIp = config.RequireObject&lt;dynamic&gt;("publicIp");
        ///         var example = Output.Create(DigitalOcean.GetFloatingIp.InvokeAsync(new DigitalOcean.GetFloatingIpArgs
        ///         {
        ///             IpAddress = publicIp,
        ///         }));
        ///         this.FipOutput = example.Apply(example =&gt; example.DropletId);
        ///     }
        /// 
        ///     [Output("fipOutput")]
        ///     public Output&lt;string&gt; FipOutput { get; set; }
        /// }
        /// ```
        /// 
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetFloatingIpResult> InvokeAsync(GetFloatingIpArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetFloatingIpResult>("digitalocean:index/getFloatingIp:getFloatingIp", args ?? new GetFloatingIpArgs(), options.WithVersion());
    }


    public sealed class GetFloatingIpArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The allocated IP address of the specific floating IP to retrieve.
        /// </summary>
        [Input("ipAddress", required: true)]
        public string IpAddress { get; set; } = null!;

        public GetFloatingIpArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetFloatingIpResult
    {
        public readonly int DropletId;
        public readonly string FloatingIpUrn;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string IpAddress;
        public readonly string Region;

        [OutputConstructor]
        private GetFloatingIpResult(
            int dropletId,

            string floatingIpUrn,

            string id,

            string ipAddress,

            string region)
        {
            DropletId = dropletId;
            FloatingIpUrn = floatingIpUrn;
            Id = id;
            IpAddress = ipAddress;
            Region = region;
        }
    }
}
