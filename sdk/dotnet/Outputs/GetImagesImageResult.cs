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
    public sealed class GetImagesImageResult
    {
        /// <summary>
        /// When the image was created
        /// </summary>
        public readonly string Created;
        /// <summary>
        /// a description of the image
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The name of the distribution of the OS of the image.
        /// </summary>
        public readonly string Distribution;
        /// <summary>
        /// Any applicable error message pertaining to the image
        /// </summary>
        public readonly string ErrorMessage;
        /// <summary>
        /// The ID of the image.
        /// </summary>
        public readonly int Id;
        /// <summary>
        /// The id of the image (legacy parameter).
        /// </summary>
        public readonly string Image;
        /// <summary>
        /// The minimum 'disk' required for the image.
        /// </summary>
        public readonly int MinDiskSize;
        /// <summary>
        /// The name of the image.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Is image a public image or not. Public images represent
        /// Linux distributions or One-Click Applications, while non-public images represent
        /// snapshots and backups and are only available within your account.
        /// </summary>
        public readonly bool Private;
        /// <summary>
        /// A set of the regions that the image is available in.
        /// </summary>
        public readonly ImmutableArray<string> Regions;
        /// <summary>
        /// The size of the image in GB.
        /// </summary>
        public readonly double SizeGigabytes;
        /// <summary>
        /// Unique text identifier of the image.
        /// </summary>
        public readonly string Slug;
        /// <summary>
        /// Current status of the image
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// A set of tags applied to the image
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        /// <summary>
        /// Type of the image.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetImagesImageResult(
            string created,

            string description,

            string distribution,

            string errorMessage,

            int id,

            string image,

            int minDiskSize,

            string name,

            bool @private,

            ImmutableArray<string> regions,

            double sizeGigabytes,

            string slug,

            string status,

            ImmutableArray<string> tags,

            string type)
        {
            Created = created;
            Description = description;
            Distribution = distribution;
            ErrorMessage = errorMessage;
            Id = id;
            Image = image;
            MinDiskSize = minDiskSize;
            Name = name;
            Private = @private;
            Regions = regions;
            SizeGigabytes = sizeGigabytes;
            Slug = slug;
            Status = status;
            Tags = tags;
            Type = type;
        }
    }
}
