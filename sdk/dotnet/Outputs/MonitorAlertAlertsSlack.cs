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
    public sealed class MonitorAlertAlertsSlack
    {
        public readonly string Channel;
        public readonly string Url;

        [OutputConstructor]
        private MonitorAlertAlertsSlack(
            string channel,

            string url)
        {
            Channel = channel;
            Url = url;
        }
    }
}