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
    public sealed class GetKubernetesClusterKubeConfigResult
    {
        /// <summary>
        /// The base64 encoded public certificate used by clients to access the cluster. Only available if token authentication is not supported on your cluster.
        /// </summary>
        public readonly string ClientCertificate;
        /// <summary>
        /// The base64 encoded private key used by clients to access the cluster. Only available if token authentication is not supported on your cluster.
        /// </summary>
        public readonly string ClientKey;
        /// <summary>
        /// The base64 encoded public certificate for the cluster's certificate authority.
        /// </summary>
        public readonly string ClusterCaCertificate;
        /// <summary>
        /// The date and time when the credentials will expire and need to be regenerated.
        /// </summary>
        public readonly string ExpiresAt;
        /// <summary>
        /// The URL of the API server on the Kubernetes master node.
        /// </summary>
        public readonly string Host;
        /// <summary>
        /// The full contents of the Kubernetes cluster's kubeconfig file.
        /// </summary>
        public readonly string RawConfig;
        /// <summary>
        /// The DigitalOcean API access token used by clients to access the cluster.
        /// </summary>
        public readonly string Token;

        [OutputConstructor]
        private GetKubernetesClusterKubeConfigResult(
            string clientCertificate,

            string clientKey,

            string clusterCaCertificate,

            string expiresAt,

            string host,

            string rawConfig,

            string token)
        {
            ClientCertificate = clientCertificate;
            ClientKey = clientKey;
            ClusterCaCertificate = clusterCaCertificate;
            ExpiresAt = expiresAt;
            Host = host;
            RawConfig = rawConfig;
            Token = token;
        }
    }
}