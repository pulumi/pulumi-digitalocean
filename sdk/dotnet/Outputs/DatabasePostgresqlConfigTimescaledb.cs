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
    public sealed class DatabasePostgresqlConfigTimescaledb
    {
        public readonly int? MaxBackgroundWorkers;

        [OutputConstructor]
        private DatabasePostgresqlConfigTimescaledb(int? maxBackgroundWorkers)
        {
            MaxBackgroundWorkers = maxBackgroundWorkers;
        }
    }
}
