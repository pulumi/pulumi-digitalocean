// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Inputs
{

    public sealed class AppSpecIngressRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The component to route to. Only one of `component` or `redirect` may be set.
        /// </summary>
        [Input("component")]
        public Input<Inputs.AppSpecIngressRuleComponentArgs>? Component { get; set; }

        /// <summary>
        /// The [CORS](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS) policies of the app.
        /// </summary>
        [Input("cors")]
        public Input<Inputs.AppSpecIngressRuleCorsArgs>? Cors { get; set; }

        /// <summary>
        /// The match configuration for the rule
        /// </summary>
        [Input("match")]
        public Input<Inputs.AppSpecIngressRuleMatchArgs>? Match { get; set; }

        /// <summary>
        /// The redirect configuration for the rule. Only one of `component` or `redirect` may be set.
        /// </summary>
        [Input("redirect")]
        public Input<Inputs.AppSpecIngressRuleRedirectArgs>? Redirect { get; set; }

        public AppSpecIngressRuleArgs()
        {
        }
        public static new AppSpecIngressRuleArgs Empty => new AppSpecIngressRuleArgs();
    }
}
