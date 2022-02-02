// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a DigitalOcean Container Registry resource. A Container Registry is
 * a secure, private location to store your containers for rapid deployment.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * // Create a new container registry
 * const foobar = new digitalocean.ContainerRegistry("foobar", {
 *     subscriptionTierSlug: "starter",
 * });
 * ```
 *
 * ## Import
 *
 * Container Registries can be imported using the `name`, e.g.
 *
 * ```sh
 *  $ pulumi import digitalocean:index/containerRegistry:ContainerRegistry myregistry registryname
 * ```
 */
export class ContainerRegistry extends pulumi.CustomResource {
    /**
     * Get an existing ContainerRegistry resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ContainerRegistryState, opts?: pulumi.CustomResourceOptions): ContainerRegistry {
        return new ContainerRegistry(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'digitalocean:index/containerRegistry:ContainerRegistry';

    /**
     * Returns true if the given object is an instance of ContainerRegistry.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ContainerRegistry {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ContainerRegistry.__pulumiType;
    }

    public /*out*/ readonly endpoint!: pulumi.Output<string>;
    /**
     * The name of the container_registry
     */
    public readonly name!: pulumi.Output<string>;
    public /*out*/ readonly serverUrl!: pulumi.Output<string>;
    /**
     * The slug identifier for the subscription tier to use (`starter`, `basic`, or `professional`)
     */
    public readonly subscriptionTierSlug!: pulumi.Output<string>;

    /**
     * Create a ContainerRegistry resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ContainerRegistryArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ContainerRegistryArgs | ContainerRegistryState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ContainerRegistryState | undefined;
            resourceInputs["endpoint"] = state ? state.endpoint : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["serverUrl"] = state ? state.serverUrl : undefined;
            resourceInputs["subscriptionTierSlug"] = state ? state.subscriptionTierSlug : undefined;
        } else {
            const args = argsOrState as ContainerRegistryArgs | undefined;
            if ((!args || args.subscriptionTierSlug === undefined) && !opts.urn) {
                throw new Error("Missing required property 'subscriptionTierSlug'");
            }
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["subscriptionTierSlug"] = args ? args.subscriptionTierSlug : undefined;
            resourceInputs["endpoint"] = undefined /*out*/;
            resourceInputs["serverUrl"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ContainerRegistry.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ContainerRegistry resources.
 */
export interface ContainerRegistryState {
    endpoint?: pulumi.Input<string>;
    /**
     * The name of the container_registry
     */
    name?: pulumi.Input<string>;
    serverUrl?: pulumi.Input<string>;
    /**
     * The slug identifier for the subscription tier to use (`starter`, `basic`, or `professional`)
     */
    subscriptionTierSlug?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ContainerRegistry resource.
 */
export interface ContainerRegistryArgs {
    /**
     * The name of the container_registry
     */
    name?: pulumi.Input<string>;
    /**
     * The slug identifier for the subscription tier to use (`starter`, `basic`, or `professional`)
     */
    subscriptionTierSlug: pulumi.Input<string>;
}
