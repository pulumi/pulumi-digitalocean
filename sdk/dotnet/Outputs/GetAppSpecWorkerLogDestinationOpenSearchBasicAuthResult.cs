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
    public sealed class GetAppSpecWorkerLogDestinationOpenSearchBasicAuthResult
    {
        /// <summary>
        /// Password for user defined in User. Is required when endpoint is set. Cannot be set if using a DigitalOcean DBaaS OpenSearch cluster.
        /// </summary>
        public readonly string? Password;
        /// <summary>
        /// Username to authenticate with. Only required when endpoint is set. Defaults to doadmin when cluster_name is set.
        /// </summary>
        public readonly string? User;

        [OutputConstructor]
        private GetAppSpecWorkerLogDestinationOpenSearchBasicAuthResult(
            string? password,

            string? user)
        {
            Password = password;
            User = user;
        }
    }
}
