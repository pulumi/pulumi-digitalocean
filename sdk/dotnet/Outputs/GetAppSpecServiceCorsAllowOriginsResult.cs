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
    public sealed class GetAppSpecServiceCorsAllowOriginsResult
    {
        /// <summary>
        /// The `Access-Control-Allow-Origin` header will be set to the client's origin only if the client's origin exactly matches the value you provide.
        /// </summary>
        public readonly string? Exact;
        /// <summary>
        /// The `Access-Control-Allow-Origin` header will be set to the client's origin if the beginning of the client's origin matches the value you provide.
        /// </summary>
        public readonly string? Prefix;
        /// <summary>
        /// The `Access-Control-Allow-Origin` header will be set to the client's origin if the client’s origin matches the regex you provide, in [RE2 style syntax](https://github.com/google/re2/wiki/Syntax).
        /// </summary>
        public readonly string? Regex;

        [OutputConstructor]
        private GetAppSpecServiceCorsAllowOriginsResult(
            string? exact,

            string? prefix,

            string? regex)
        {
            Exact = exact;
            Prefix = prefix;
            Regex = regex;
        }
    }
}