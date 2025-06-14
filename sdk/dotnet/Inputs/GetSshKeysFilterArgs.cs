// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Inputs
{

    public sealed class GetSshKeysFilterInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("all")]
        public Input<bool>? All { get; set; }

        /// <summary>
        /// Filter the SSH Keys by this key. This may be one of `name`, `public_key`, or `fingerprint`.
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        [Input("matchBy")]
        public Input<string>? MatchBy { get; set; }

        [Input("values", required: true)]
        private InputList<string>? _values;

        /// <summary>
        /// A list of values to match against the key field. Only retrieves SSH keys where the key field matches one or more of the values provided here.
        /// </summary>
        public InputList<string> Values
        {
            get => _values ?? (_values = new InputList<string>());
            set => _values = value;
        }

        public GetSshKeysFilterInputArgs()
        {
        }
        public static new GetSshKeysFilterInputArgs Empty => new GetSshKeysFilterInputArgs();
    }
}
