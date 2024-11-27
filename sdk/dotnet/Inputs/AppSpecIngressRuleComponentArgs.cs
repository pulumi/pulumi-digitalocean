// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Inputs
{

    public sealed class AppSpecIngressRuleComponentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the component to route to.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// An optional boolean flag to preserve the path that is forwarded to the backend service. By default, the HTTP request path will be trimmed from the left when forwarded to the component.
        /// </summary>
        [Input("preservePathPrefix")]
        public Input<bool>? PreservePathPrefix { get; set; }

        /// <summary>
        /// An optional field that will rewrite the path of the component to be what is specified here. This is mutually exclusive with `preserve_path_prefix`.
        /// </summary>
        [Input("rewrite")]
        public Input<string>? Rewrite { get; set; }

        public AppSpecIngressRuleComponentArgs()
        {
        }
        public static new AppSpecIngressRuleComponentArgs Empty => new AppSpecIngressRuleComponentArgs();
    }
}