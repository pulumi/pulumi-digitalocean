// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Outputs
{

    [OutputType]
    public sealed class AppSpecWorkerLogDestinationOpenSearch
    {
        /// <summary>
        /// Basic authentication details.
        /// </summary>
        public readonly Outputs.AppSpecWorkerLogDestinationOpenSearchBasicAuth BasicAuth;
        /// <summary>
        /// The name of the underlying DigitalOcean DBaaS cluster. This is required for production databases. For dev databases, if `cluster_name` is not set, a new cluster will be provisioned.
        /// </summary>
        public readonly string? ClusterName;
        /// <summary>
        /// OpenSearch endpoint.
        /// </summary>
        public readonly string? Endpoint;
        /// <summary>
        /// OpenSearch index name.
        /// </summary>
        public readonly string? IndexName;

        [OutputConstructor]
        private AppSpecWorkerLogDestinationOpenSearch(
            Outputs.AppSpecWorkerLogDestinationOpenSearchBasicAuth basicAuth,

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
