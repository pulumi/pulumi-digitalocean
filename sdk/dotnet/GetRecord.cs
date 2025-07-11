// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean
{
    public static class GetRecord
    {
        /// <summary>
        /// Get information on a DNS record. This data source provides the name, TTL, and zone
        /// file as configured on your DigitalOcean account. This is useful if the record
        /// in question is not managed by the provider.
        /// 
        /// An error is triggered if the provided domain name or record are not managed with
        /// your DigitalOcean account.
        /// 
        /// ## Example Usage
        /// 
        /// Get data from a DNS record:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetRecord.Invoke(new()
        ///     {
        ///         Domain = "example.com",
        ///         Name = "test",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["recordType"] = example.Apply(getRecordResult =&gt; getRecordResult.Type),
        ///         ["recordTtl"] = example.Apply(getRecordResult =&gt; getRecordResult.Ttl),
        ///     };
        /// });
        /// ```
        /// 
        /// ```
        /// 
        /// data.digitalocean_record.example: Refreshing state...
        /// 
        /// Apply complete! Resources: 0 added, 0 changed, 0 destroyed.
        /// 
        /// Outputs:
        /// 
        /// record_ttl = 3600
        /// record_type = A
        /// ```
        /// </summary>
        public static Task<GetRecordResult> InvokeAsync(GetRecordArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetRecordResult>("digitalocean:index/getRecord:getRecord", args ?? new GetRecordArgs(), options.WithDefaults());

        /// <summary>
        /// Get information on a DNS record. This data source provides the name, TTL, and zone
        /// file as configured on your DigitalOcean account. This is useful if the record
        /// in question is not managed by the provider.
        /// 
        /// An error is triggered if the provided domain name or record are not managed with
        /// your DigitalOcean account.
        /// 
        /// ## Example Usage
        /// 
        /// Get data from a DNS record:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetRecord.Invoke(new()
        ///     {
        ///         Domain = "example.com",
        ///         Name = "test",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["recordType"] = example.Apply(getRecordResult =&gt; getRecordResult.Type),
        ///         ["recordTtl"] = example.Apply(getRecordResult =&gt; getRecordResult.Ttl),
        ///     };
        /// });
        /// ```
        /// 
        /// ```
        /// 
        /// data.digitalocean_record.example: Refreshing state...
        /// 
        /// Apply complete! Resources: 0 added, 0 changed, 0 destroyed.
        /// 
        /// Outputs:
        /// 
        /// record_ttl = 3600
        /// record_type = A
        /// ```
        /// </summary>
        public static Output<GetRecordResult> Invoke(GetRecordInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetRecordResult>("digitalocean:index/getRecord:getRecord", args ?? new GetRecordInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Get information on a DNS record. This data source provides the name, TTL, and zone
        /// file as configured on your DigitalOcean account. This is useful if the record
        /// in question is not managed by the provider.
        /// 
        /// An error is triggered if the provided domain name or record are not managed with
        /// your DigitalOcean account.
        /// 
        /// ## Example Usage
        /// 
        /// Get data from a DNS record:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetRecord.Invoke(new()
        ///     {
        ///         Domain = "example.com",
        ///         Name = "test",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["recordType"] = example.Apply(getRecordResult =&gt; getRecordResult.Type),
        ///         ["recordTtl"] = example.Apply(getRecordResult =&gt; getRecordResult.Ttl),
        ///     };
        /// });
        /// ```
        /// 
        /// ```
        /// 
        /// data.digitalocean_record.example: Refreshing state...
        /// 
        /// Apply complete! Resources: 0 added, 0 changed, 0 destroyed.
        /// 
        /// Outputs:
        /// 
        /// record_ttl = 3600
        /// record_type = A
        /// ```
        /// </summary>
        public static Output<GetRecordResult> Invoke(GetRecordInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetRecordResult>("digitalocean:index/getRecord:getRecord", args ?? new GetRecordInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRecordArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The domain name of the record.
        /// </summary>
        [Input("domain", required: true)]
        public string Domain { get; set; } = null!;

        /// <summary>
        /// The name of the record.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetRecordArgs()
        {
        }
        public static new GetRecordArgs Empty => new GetRecordArgs();
    }

    public sealed class GetRecordInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The domain name of the record.
        /// </summary>
        [Input("domain", required: true)]
        public Input<string> Domain { get; set; } = null!;

        /// <summary>
        /// The name of the record.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetRecordInvokeArgs()
        {
        }
        public static new GetRecordInvokeArgs Empty => new GetRecordInvokeArgs();
    }


    [OutputType]
    public sealed class GetRecordResult
    {
        /// <summary>
        /// Variable data depending on record type. For example, the "data" value for an A record would be the IPv4 address to which the domain will be mapped. For a CAA record, it would contain the domain name of the CA being granted permission to issue certificates.
        /// </summary>
        public readonly string Data;
        public readonly string Domain;
        /// <summary>
        /// An unsigned integer between 0-255 used for CAA records.
        /// </summary>
        public readonly int Flags;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;
        /// <summary>
        /// The port for SRV records.
        /// </summary>
        public readonly int Port;
        /// <summary>
        /// The priority for SRV and MX records.
        /// </summary>
        public readonly int Priority;
        /// <summary>
        /// The parameter tag for CAA records.
        /// </summary>
        public readonly string Tag;
        /// <summary>
        /// This value is the time to live for the record, in seconds. This defines the time frame that clients can cache queried information before a refresh should be requested.
        /// </summary>
        public readonly int Ttl;
        /// <summary>
        /// The type of the DNS record.
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// The weight for SRV records.
        /// </summary>
        public readonly int Weight;

        [OutputConstructor]
        private GetRecordResult(
            string data,

            string domain,

            int flags,

            string id,

            string name,

            int port,

            int priority,

            string tag,

            int ttl,

            string type,

            int weight)
        {
            Data = data;
            Domain = domain;
            Flags = flags;
            Id = id;
            Name = name;
            Port = port;
            Priority = priority;
            Tag = tag;
            Ttl = ttl;
            Type = type;
            Weight = weight;
        }
    }
}
