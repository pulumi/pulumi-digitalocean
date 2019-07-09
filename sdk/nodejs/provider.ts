// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * The provider type for the digitalocean package. By default, resources use package-wide configuration
 * settings, however an explicit `Provider` instance may be created and passed during resource
 * construction to achieve fine-grained programmatic control over provider settings. See the
 * [documentation](https://pulumi.io/reference/programming-model.html#providers) for more information.
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-digitalocean/blob/master/website/docs/index.html.markdown.
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
        return obj['__pulumiType'] === Provider.__pulumiType;
    }


    /**
     * Create a Provider resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ProviderArgs, opts?: pulumi.ResourceOptions) {
        let inputs: pulumi.Inputs = {};
        {
            inputs["apiEndpoint"] = (args ? args.apiEndpoint : undefined) || (utilities.getEnv("DIGITALOCEAN_API_URL") || "https://api.digitalocean.com");
            inputs["spacesAccessId"] = (args ? args.spacesAccessId : undefined) || utilities.getEnv("SPACES_ACCESS_KEY_ID");
            inputs["spacesSecretKey"] = (args ? args.spacesSecretKey : undefined) || utilities.getEnv("SPACES_SECRET_ACCESS_KEY");
            inputs["token"] = (args ? args.token : undefined) || utilities.getEnv("DIGITALOCEAN_TOKEN");
        }
        super(Provider.__pulumiType, name, inputs, opts);
    }
}

/**
 * The set of arguments for constructing a Provider resource.
 */
export interface ProviderArgs {
    /**
     * The URL to use for the DigitalOcean API.
     */
    readonly apiEndpoint?: pulumi.Input<string>;
    /**
     * The access key ID for Spaces API operations.
     */
    readonly spacesAccessId?: pulumi.Input<string>;
    /**
     * The secret access key for Spaces API operations.
     */
    readonly spacesSecretKey?: pulumi.Input<string>;
    /**
     * The token key for API operations.
     */
    readonly token?: pulumi.Input<string>;
}
