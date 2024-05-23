// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Inputs
{

    public sealed class AppSpecAlertArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Determines whether or not the alert is disabled (default: `false`).
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// The type of the alert to configure. Top-level app alert policies can be: `DEPLOYMENT_FAILED`, `DEPLOYMENT_LIVE`, `DOMAIN_FAILED`, or `DOMAIN_LIVE`.
        /// </summary>
        [Input("rule", required: true)]
        public Input<string> Rule { get; set; } = null!;

        public AppSpecAlertArgs()
        {
        }
        public static new AppSpecAlertArgs Empty => new AppSpecAlertArgs();
    }
}
