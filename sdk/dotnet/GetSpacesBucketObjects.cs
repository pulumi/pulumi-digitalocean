// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean
{
    public static class GetSpacesBucketObjects
    {
        /// <summary>
        /// &gt; **NOTE on `max_keys`:** Retrieving very large numbers of keys can adversely affect this provider's performance.
        /// 
        /// The bucket-objects data source returns keys (i.e., file names) and other metadata about objects in a Spaces bucket.
        /// </summary>
        public static Task<GetSpacesBucketObjectsResult> InvokeAsync(GetSpacesBucketObjectsArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetSpacesBucketObjectsResult>("digitalocean:index/getSpacesBucketObjects:getSpacesBucketObjects", args ?? new GetSpacesBucketObjectsArgs(), options.WithVersion());
    }


    public sealed class GetSpacesBucketObjectsArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Lists object keys in this Spaces bucket
        /// </summary>
        [Input("bucket", required: true)]
        public string Bucket { get; set; } = null!;

        /// <summary>
        /// A character used to group keys (Default: none)
        /// </summary>
        [Input("delimiter")]
        public string? Delimiter { get; set; }

        /// <summary>
        /// Encodes keys using this method (Default: none; besides none, only "url" can be used)
        /// </summary>
        [Input("encodingType")]
        public string? EncodingType { get; set; }

        /// <summary>
        /// Maximum object keys to return (Default: 1000)
        /// </summary>
        [Input("maxKeys")]
        public int? MaxKeys { get; set; }

        /// <summary>
        /// Limits results to object keys with this prefix (Default: none)
        /// </summary>
        [Input("prefix")]
        public string? Prefix { get; set; }

        /// <summary>
        /// The slug of the region where the bucket is stored.
        /// </summary>
        [Input("region", required: true)]
        public string Region { get; set; } = null!;

        public GetSpacesBucketObjectsArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetSpacesBucketObjectsResult
    {
        public readonly string Bucket;
        /// <summary>
        /// List of any keys between `prefix` and the next occurrence of `delimiter` (i.e., similar to subdirectories of the `prefix` "directory"); the list is only returned when you specify `delimiter`
        /// </summary>
        public readonly ImmutableArray<string> CommonPrefixes;
        public readonly string? Delimiter;
        public readonly string? EncodingType;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// List of strings representing object keys
        /// </summary>
        public readonly ImmutableArray<string> Keys;
        public readonly int? MaxKeys;
        /// <summary>
        /// List of strings representing object owner IDs
        /// </summary>
        public readonly ImmutableArray<string> Owners;
        public readonly string? Prefix;
        public readonly string Region;

        [OutputConstructor]
        private GetSpacesBucketObjectsResult(
            string bucket,

            ImmutableArray<string> commonPrefixes,

            string? delimiter,

            string? encodingType,

            string id,

            ImmutableArray<string> keys,

            int? maxKeys,

            ImmutableArray<string> owners,

            string? prefix,

            string region)
        {
            Bucket = bucket;
            CommonPrefixes = commonPrefixes;
            Delimiter = delimiter;
            EncodingType = encodingType;
            Id = id;
            Keys = keys;
            MaxKeys = maxKeys;
            Owners = owners;
            Prefix = prefix;
            Region = region;
        }
    }
}
