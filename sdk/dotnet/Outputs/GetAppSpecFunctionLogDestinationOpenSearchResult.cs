// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Outputs
{

    [OutputType]
    public sealed class GetAppSpecFunctionLogDestinationOpenSearchResult
    {
        /// <summary>
        /// OpenSearch basic auth
        /// </summary>
        public readonly Outputs.GetAppSpecFunctionLogDestinationOpenSearchBasicAuthResult BasicAuth;
        /// <summary>
        /// The name of the underlying DigitalOcean DBaaS cluster. This is required for production databases. For dev databases, if `cluster_name` is not set, a new cluster will be provisioned.
        /// </summary>
        public readonly string? ClusterName;
        /// <summary>
        /// OpenSearch API Endpoint. Only HTTPS is supported. Format: https://&lt;host&gt;:&lt;port&gt;.
        /// </summary>
        public readonly string? Endpoint;
        /// <summary>
        /// The index name to use for the logs. If not set, the default index name is `logs`.
        /// </summary>
        public readonly string? IndexName;

        [OutputConstructor]
        private GetAppSpecFunctionLogDestinationOpenSearchResult(
            Outputs.GetAppSpecFunctionLogDestinationOpenSearchBasicAuthResult basicAuth,

            string? clusterName,

            string? endpoint,

            string? indexName)
        {
            BasicAuth = basicAuth;
            ClusterName = clusterName;
            Endpoint = endpoint;
            IndexName = indexName;
        }
    }
}