// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a DigitalOcean Project resource.
 *
 * Projects allow you to organize your resources into groups that fit the way you work.
 * You can group resources (like Droplets, Spaces, Load Balancers, domains, and Floating IPs)
 * in ways that align with the applications you host on DigitalOcean.
 *
 * The following resource types can be associated with a project:
 *
 * * Database Clusters
 * * Domains
 * * Droplets
 * * Floating IP
 * * Kubernetes Cluster
 * * Load Balancers
 * * Spaces Bucket
 * * Volume
 *
 * **Note:** A provider managed project cannot be set as a default project.
 *
 * ## Example Usage
 *
 * The following example demonstrates the creation of an empty project:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const playground = new digitalocean.Project("playground", {
 *     description: "A project to represent development resources.",
 *     environment: "Development",
 *     purpose: "Web Application",
 * });
 * ```
 *
 * The following example demonstrates the creation of a project with a Droplet resource:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const foobar = new digitalocean.Droplet("foobar", {
 *     size: "s-1vcpu-1gb",
 *     image: "centos-7-x64",
 *     region: "nyc3",
 * });
 * const playground = new digitalocean.Project("playground", {
 *     description: "A project to represent development resources.",
 *     purpose: "Web Application",
 *     environment: "Development",
 *     resources: [foobar.dropletUrn],
 * });
 * ```
 *
 * ## Import
 *
 * Projects can be imported using the `id` returned from DigitalOcean, e.g.
 *
 * ```sh
 *  $ pulumi import digitalocean:index/project:Project myproject 245bcfd0-7f31-4ce6-a2bc-475a116cca97
 * ```
 */
export class Project extends pulumi.CustomResource {
    /**
     * Get an existing Project resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ProjectState, opts?: pulumi.CustomResourceOptions): Project {
        return new Project(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'digitalocean:index/project:Project';

    /**
     * Returns true if the given object is an instance of Project.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Project {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Project.__pulumiType;
    }

    /**
     * the date and time when the project was created, (ISO8601)
     */
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * the description of the project
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * the environment of the project's resources. The possible values are: `Development`, `Staging`, `Production`)
     */
    public readonly environment!: pulumi.Output<string | undefined>;
    public /*out*/ readonly isDefault!: pulumi.Output<boolean>;
    /**
     * The name of the Project
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * the id of the project owner.
     */
    public /*out*/ readonly ownerId!: pulumi.Output<number>;
    /**
     * the unique universal identifier of the project owner.
     */
    public /*out*/ readonly ownerUuid!: pulumi.Output<string>;
    /**
     * the purpose of the project, (Default: "Web Application")
     */
    public readonly purpose!: pulumi.Output<string | undefined>;
    /**
     * a list of uniform resource names (URNs) for the resources associated with the project
     */
    public readonly resources!: pulumi.Output<string[]>;
    /**
     * the date and time when the project was last updated, (ISO8601)
     */
    public /*out*/ readonly updatedAt!: pulumi.Output<string>;

    /**
     * Create a Project resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ProjectArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ProjectArgs | ProjectState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ProjectState | undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["environment"] = state ? state.environment : undefined;
            resourceInputs["isDefault"] = state ? state.isDefault : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["ownerId"] = state ? state.ownerId : undefined;
            resourceInputs["ownerUuid"] = state ? state.ownerUuid : undefined;
            resourceInputs["purpose"] = state ? state.purpose : undefined;
            resourceInputs["resources"] = state ? state.resources : undefined;
            resourceInputs["updatedAt"] = state ? state.updatedAt : undefined;
        } else {
            const args = argsOrState as ProjectArgs | undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["environment"] = args ? args.environment : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["purpose"] = args ? args.purpose : undefined;
            resourceInputs["resources"] = args ? args.resources : undefined;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["isDefault"] = undefined /*out*/;
            resourceInputs["ownerId"] = undefined /*out*/;
            resourceInputs["ownerUuid"] = undefined /*out*/;
            resourceInputs["updatedAt"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Project.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Project resources.
 */
export interface ProjectState {
    /**
     * the date and time when the project was created, (ISO8601)
     */
    createdAt?: pulumi.Input<string>;
    /**
     * the description of the project
     */
    description?: pulumi.Input<string>;
    /**
     * the environment of the project's resources. The possible values are: `Development`, `Staging`, `Production`)
     */
    environment?: pulumi.Input<string>;
    isDefault?: pulumi.Input<boolean>;
    /**
     * The name of the Project
     */
    name?: pulumi.Input<string>;
    /**
     * the id of the project owner.
     */
    ownerId?: pulumi.Input<number>;
    /**
     * the unique universal identifier of the project owner.
     */
    ownerUuid?: pulumi.Input<string>;
    /**
     * the purpose of the project, (Default: "Web Application")
     */
    purpose?: pulumi.Input<string>;
    /**
     * a list of uniform resource names (URNs) for the resources associated with the project
     */
    resources?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * the date and time when the project was last updated, (ISO8601)
     */
    updatedAt?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Project resource.
 */
export interface ProjectArgs {
    /**
     * the description of the project
     */
    description?: pulumi.Input<string>;
    /**
     * the environment of the project's resources. The possible values are: `Development`, `Staging`, `Production`)
     */
    environment?: pulumi.Input<string>;
    /**
     * The name of the Project
     */
    name?: pulumi.Input<string>;
    /**
     * the purpose of the project, (Default: "Web Application")
     */
    purpose?: pulumi.Input<string>;
    /**
     * a list of uniform resource names (URNs) for the resources associated with the project
     */
    resources?: pulumi.Input<pulumi.Input<string>[]>;
}
