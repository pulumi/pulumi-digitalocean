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
    public sealed class AppSpecServiceTermination
    {
        /// <summary>
        /// The number of seconds to wait between selecting a container instance for termination and issuing the TERM signal. Selecting a container instance for termination begins an asynchronous drain of new requests on upstream load-balancers. Default: 15 seconds, Minimum 1, Maximum 110.
        /// 
        /// A `static_site` can contain:
        /// </summary>
        public readonly int? DrainSeconds;
        /// <summary>
        /// The number of seconds to wait between sending a TERM signal to a container and issuing a KILL which causes immediate shutdown. Default: 120, Minimum 1, Maximum 600.
        /// 
        /// A `function` component can contain:
        /// </summary>
        public readonly int? GracePeriodSeconds;

        [OutputConstructor]
        private AppSpecServiceTermination(
            int? drainSeconds,

            int? gracePeriodSeconds)
        {
            DrainSeconds = drainSeconds;
            GracePeriodSeconds = gracePeriodSeconds;
        }
    }
}