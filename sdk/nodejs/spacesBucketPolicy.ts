// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 * ### Limiting access to specific IP addresses
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const foobarSpacesBucket = new digitalocean.SpacesBucket("foobarSpacesBucket", {region: "nyc3"});
 * const foobarSpacesBucketPolicy = new digitalocean.SpacesBucketPolicy("foobarSpacesBucketPolicy", {
 *     region: foobarSpacesBucket.region,
 *     bucket: foobarSpacesBucket.name,
 *     policy: pulumi.jsonStringify({
 *         Version: "2012-10-17",
 *         Statement: [{
 *             Sid: "IPAllow",
 *             Effect: "Deny",
 *             Principal: "*",
 *             Action: "s3:*",
 *             Resource: [
 *                 pulumi.interpolate`arn:aws:s3:::${foobarSpacesBucket.name}`,
 *                 pulumi.interpolate`arn:aws:s3:::${foobarSpacesBucket.name}/*`,
 *             ],
 *             Condition: {
 *                 NotIpAddress: {
 *                     "aws:SourceIp": "54.240.143.0/24",
 *                 },
 *             },
 *         }],
 *     }),
 * });
 * ```
 *
 * !> **Warning:** Before using this policy, replace the 54.240.143.0/24 IP address range in this example with an appropriate value for your use case. Otherwise, you will lose the ability to access your bucket.
 *
 * ## Import
 *
 * Bucket policies can be imported using the `region` and `bucket` attributes (delimited by a comma):
 *
 * ```sh
 * $ pulumi import digitalocean:index/spacesBucketPolicy:SpacesBucketPolicy foobar `region`,`bucket`
 * ```
 */
export class SpacesBucketPolicy extends pulumi.CustomResource {
    /**
     * Get an existing SpacesBucketPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SpacesBucketPolicyState, opts?: pulumi.CustomResourceOptions): SpacesBucketPolicy {
        return new SpacesBucketPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'digitalocean:index/spacesBucketPolicy:SpacesBucketPolicy';

    /**
     * Returns true if the given object is an instance of SpacesBucketPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SpacesBucketPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SpacesBucketPolicy.__pulumiType;
    }

    /**
     * The name of the bucket to which to apply the policy.
     */
    public readonly bucket!: pulumi.Output<string>;
    /**
     * The text of the policy.
     */
    public readonly policy!: pulumi.Output<string>;
    /**
     * The region where the bucket resides.
     */
    public readonly region!: pulumi.Output<string>;

    /**
     * Create a SpacesBucketPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SpacesBucketPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SpacesBucketPolicyArgs | SpacesBucketPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SpacesBucketPolicyState | undefined;
            resourceInputs["bucket"] = state ? state.bucket : undefined;
            resourceInputs["policy"] = state ? state.policy : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
        } else {
            const args = argsOrState as SpacesBucketPolicyArgs | undefined;
            if ((!args || args.bucket === undefined) && !opts.urn) {
                throw new Error("Missing required property 'bucket'");
            }
            if ((!args || args.policy === undefined) && !opts.urn) {
                throw new Error("Missing required property 'policy'");
            }
            if ((!args || args.region === undefined) && !opts.urn) {
                throw new Error("Missing required property 'region'");
            }
            resourceInputs["bucket"] = args ? args.bucket : undefined;
            resourceInputs["policy"] = args ? args.policy : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SpacesBucketPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SpacesBucketPolicy resources.
 */
export interface SpacesBucketPolicyState {
    /**
     * The name of the bucket to which to apply the policy.
     */
    bucket?: pulumi.Input<string>;
    /**
     * The text of the policy.
     */
    policy?: pulumi.Input<string>;
    /**
     * The region where the bucket resides.
     */
    region?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SpacesBucketPolicy resource.
 */
export interface SpacesBucketPolicyArgs {
    /**
     * The name of the bucket to which to apply the policy.
     */
    bucket: pulumi.Input<string>;
    /**
     * The text of the policy.
     */
    policy: pulumi.Input<string>;
    /**
     * The region where the bucket resides.
     */
    region: pulumi.Input<string>;
}
