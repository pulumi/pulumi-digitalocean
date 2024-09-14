// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Inputs
{

    public sealed class AppSpecFunctionLogDestinationOpenSearchBasicAuthGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// Password for basic authentication.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// user for basic authentication.
        /// </summary>
        [Input("user")]
        public Input<string>? User { get; set; }

        public AppSpecFunctionLogDestinationOpenSearchBasicAuthGetArgs()
        {
        }
        public static new AppSpecFunctionLogDestinationOpenSearchBasicAuthGetArgs Empty => new AppSpecFunctionLogDestinationOpenSearchBasicAuthGetArgs();
    }
}
