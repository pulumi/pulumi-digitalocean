// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Inputs
{

    public sealed class DatabaseClusterMaintenanceWindowArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The day of the week on which to apply maintenance updates. May be one of `monday` through `sunday`.
        /// </summary>
        [Input("day", required: true)]
        public Input<string> Day { get; set; } = null!;

        /// <summary>
        /// The hour in UTC at which maintenance updates will be applied as a string in 24 hour format, e.g. `13:00`.
        /// </summary>
        [Input("hour", required: true)]
        public Input<string> Hour { get; set; } = null!;

        public DatabaseClusterMaintenanceWindowArgs()
        {
        }
        public static new DatabaseClusterMaintenanceWindowArgs Empty => new DatabaseClusterMaintenanceWindowArgs();
    }
}
