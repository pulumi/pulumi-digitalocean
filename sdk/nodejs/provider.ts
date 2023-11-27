// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * The provider type for the digitalocean package. By default, resources use package-wide configuration
 * settings, however an explicit `Provider` instance may be created and passed during resource
 * construction to achieve fine-grained programmatic control over provider settings. See the
 * [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
 */
export class Provider extends pulumi.ProviderResource {
    /** @internal */
    public static readonly __pulumiType = 'digitalocean';

    /**
     * Returns true if the given object is an instance of Provider.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Provider {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === "pulumi:providers:" + Provider.__pulumiType;
    }

    /**
     * The URL to use for the DigitalOcean API.
     */
    public readonly apiEndpoint!: pulumi.Output<string | undefined>;
    /**
     * The access key ID for Spaces API operations.
     */
    public readonly spacesAccessId!: pulumi.Output<string | undefined>;
    /**
     * The URL to use for the DigitalOcean Spaces API.
     */
    public readonly spacesEndpoint!: pulumi.Output<string | undefined>;
    /**
     * The secret access key for Spaces API operations.
     */
    public readonly spacesSecretKey!: pulumi.Output<string | undefined>;
    /**
     * The token key for API operations.
     */
    public readonly token!: pulumi.Output<string | undefined>;

    /**
     * Create a Provider resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ProviderArgs, opts?: pulumi.ResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        {
            resourceInputs["apiEndpoint"] = (args ? args.apiEndpoint : undefined) ?? (utilities.getEnv("DIGITALOCEAN_API_URL") || "https://api.digitalocean.com");
            resourceInputs["httpRetryMax"] = pulumi.output(args ? args.httpRetryMax : undefined).apply(JSON.stringify);
            resourceInputs["httpRetryWaitMax"] = pulumi.output(args ? args.httpRetryWaitMax : undefined).apply(JSON.stringify);
            resourceInputs["httpRetryWaitMin"] = pulumi.output(args ? args.httpRetryWaitMin : undefined).apply(JSON.stringify);
            resourceInputs["requestsPerSecond"] = pulumi.output(args ? args.requestsPerSecond : undefined).apply(JSON.stringify);
            resourceInputs["spacesAccessId"] = args ? args.spacesAccessId : undefined;
            resourceInputs["spacesEndpoint"] = (args ? args.spacesEndpoint : undefined) ?? utilities.getEnv("SPACES_ENDPOINT_URL");
            resourceInputs["spacesSecretKey"] = args ? args.spacesSecretKey : undefined;
            resourceInputs["token"] = args ? args.token : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Provider.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * The set of arguments for constructing a Provider resource.
 */
export interface ProviderArgs {
    /**
     * The URL to use for the DigitalOcean API.
     */
    apiEndpoint?: pulumi.Input<string>;
    /**
     * The maximum number of retries on a failed API request.
     */
    httpRetryMax?: pulumi.Input<number>;
    /**
     * The maximum wait time (in seconds) between failed API requests.
     */
    httpRetryWaitMax?: pulumi.Input<number>;
    /**
     * The minimum wait time (in seconds) between failed API requests.
     */
    httpRetryWaitMin?: pulumi.Input<number>;
    /**
     * The rate of requests per second to limit the HTTP client.
     */
    requestsPerSecond?: pulumi.Input<number>;
    /**
     * The access key ID for Spaces API operations.
     */
    spacesAccessId?: pulumi.Input<string>;
    /**
     * The URL to use for the DigitalOcean Spaces API.
     */
    spacesEndpoint?: pulumi.Input<string>;
    /**
     * The secret access key for Spaces API operations.
     */
    spacesSecretKey?: pulumi.Input<string>;
    /**
     * The token key for API operations.
     */
    token?: pulumi.Input<string>;
}
