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
    public sealed class AppSpecIngressRuleMatch
    {
        /// <summary>
        /// The path to match on.
        /// </summary>
        public readonly Outputs.AppSpecIngressRuleMatchPath? Path;

        [OutputConstructor]
        private AppSpecIngressRuleMatch(Outputs.AppSpecIngressRuleMatchPath? path)
        {
            Path = path;
        }
    }
}
