// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Assign resources to a DigitalOcean Project. This is useful if you need to assign resources
 * managed this provider to a DigitalOcean Project that is unmanaged by the provider.
 *
 * The following resource types can be associated with a project:
 *
 * * Database Clusters
 * * Domains
 * * Droplets
 * * Floating IP
 * * Load Balancers
 * * Spaces Bucket
 * * Volume
 *
 * ## Example Usage
 *
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const playground = digitalocean.getProject({
 *     name: "playground",
 * });
 * const foobar = new digitalocean.Droplet("foobar", {
 *     size: "512mb",
 *     image: "centos-7-x64",
 *     region: "nyc3",
 * });
 * const barfoo = new digitalocean.ProjectResources("barfoo", {
 *     project: data.digitalocean_project.foo.id,
 *     resources: [foobar.dropletUrn],
 * });
 * ```
 */
export class ProjectResources extends pulumi.CustomResource {
    /**
     * Get an existing ProjectResources resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ProjectResourcesState, opts?: pulumi.CustomResourceOptions): ProjectResources {
        return new ProjectResources(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'digitalocean:index/projectResources:ProjectResources';

    /**
     * Returns true if the given object is an instance of ProjectResources.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ProjectResources {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ProjectResources.__pulumiType;
    }

    /**
     * the ID of the project
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * a list of uniform resource names (URNs) for the resources associated with the project
     */
    public readonly resources!: pulumi.Output<string[]>;

    /**
     * Create a ProjectResources resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ProjectResourcesArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ProjectResourcesArgs | ProjectResourcesState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as ProjectResourcesState | undefined;
            inputs["project"] = state ? state.project : undefined;
            inputs["resources"] = state ? state.resources : undefined;
        } else {
            const args = argsOrState as ProjectResourcesArgs | undefined;
            if (!args || args.project === undefined) {
                throw new Error("Missing required property 'project'");
            }
            if (!args || args.resources === undefined) {
                throw new Error("Missing required property 'resources'");
            }
            inputs["project"] = args ? args.project : undefined;
            inputs["resources"] = args ? args.resources : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(ProjectResources.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ProjectResources resources.
 */
export interface ProjectResourcesState {
    /**
     * the ID of the project
     */
    readonly project?: pulumi.Input<string>;
    /**
     * a list of uniform resource names (URNs) for the resources associated with the project
     */
    readonly resources?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a ProjectResources resource.
 */
export interface ProjectResourcesArgs {
    /**
     * the ID of the project
     */
    readonly project: pulumi.Input<string>;
    /**
     * a list of uniform resource names (URNs) for the resources associated with the project
     */
    readonly resources: pulumi.Input<pulumi.Input<string>[]>;
}
