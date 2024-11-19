// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Inputs
{

    public sealed class DropletBackupPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The hour of the day that the backup window will start (`0`, `4`, `8`, `12`, `16`, `20`).
        /// </summary>
        [Input("hour")]
        public Input<int>? Hour { get; set; }

        /// <summary>
        /// The backup plan used for the Droplet. The plan can be either `daily` or `weekly`.
        /// </summary>
        [Input("plan")]
        public Input<string>? Plan { get; set; }

        /// <summary>
        /// The day of the week on which the backup will occur (`SUN`, `MON`, `TUE`, `WED`, `THU`, `FRI`, `SAT`).
        /// </summary>
        [Input("weekday")]
        public Input<string>? Weekday { get; set; }

        public DropletBackupPolicyArgs()
        {
        }
        public static new DropletBackupPolicyArgs Empty => new DropletBackupPolicyArgs();
    }
}
