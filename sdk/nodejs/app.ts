// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as enums from "./types/enums";
import * as utilities from "./utilities";

/**
 * Provides a DigitalOcean App resource.
 *
 * ## Example Usage
 *
 * To create an app, provide a [DigitalOcean app spec](https://docs.digitalocean.com/products/app-platform/reference/app-spec/) specifying the app's components.
 *
 * ### Basic Example
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const golang_sample = new digitalocean.App("golang-sample", {spec: {
 *     name: "golang-sample",
 *     region: "ams",
 *     services: [{
 *         environmentSlug: "go",
 *         git: {
 *             branch: "main",
 *             repoCloneUrl: "https://github.com/digitalocean/sample-golang.git",
 *         },
 *         instanceCount: 1,
 *         instanceSizeSlug: "professional-xs",
 *         name: "go-service",
 *     }],
 * }});
 * ```
 *
 * ### Static Site Example
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const static_site_example = new digitalocean.App("static-site-example", {spec: {
 *     name: "static-site-example",
 *     region: "ams",
 *     staticSites: [{
 *         buildCommand: "bundle exec jekyll build -d ./public",
 *         git: {
 *             branch: "main",
 *             repoCloneUrl: "https://github.com/digitalocean/sample-jekyll.git",
 *         },
 *         name: "sample-jekyll",
 *         outputDir: "/public",
 *     }],
 * }});
 * ```
 *
 * ## Import
 *
 * An app can be imported using its `id`, e.g.
 *
 * ```sh
 * $ pulumi import digitalocean:index/app:App myapp fb06ad00-351f-45c8-b5eb-13523c438661
 * ```
 */
export class App extends pulumi.CustomResource {
    /**
     * Get an existing App resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AppState, opts?: pulumi.CustomResourceOptions): App {
        return new App(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'digitalocean:index/app:App';

    /**
     * Returns true if the given object is an instance of App.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is App {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === App.__pulumiType;
    }

    /**
     * The ID the app's currently active deployment.
     */
    public /*out*/ readonly activeDeploymentId!: pulumi.Output<string>;
    /**
     * The uniform resource identifier for the app.
     */
    public /*out*/ readonly appUrn!: pulumi.Output<string>;
    /**
     * The date and time of when the app was created.
     */
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * The default URL to access the app.
     */
    public /*out*/ readonly defaultIngress!: pulumi.Output<string>;
    /**
     * The live URL of the app.
     */
    public /*out*/ readonly liveUrl!: pulumi.Output<string>;
    /**
     * The ID of the project that the app is assigned to.
     *
     * A spec can contain multiple components.
     *
     * A `service` can contain:
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * A DigitalOcean App spec describing the app.
     */
    public readonly spec!: pulumi.Output<outputs.AppSpec | undefined>;
    /**
     * The date and time of when the app was last updated.
     */
    public /*out*/ readonly updatedAt!: pulumi.Output<string>;

    /**
     * Create a App resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: AppArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AppArgs | AppState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AppState | undefined;
            resourceInputs["activeDeploymentId"] = state ? state.activeDeploymentId : undefined;
            resourceInputs["appUrn"] = state ? state.appUrn : undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["defaultIngress"] = state ? state.defaultIngress : undefined;
            resourceInputs["liveUrl"] = state ? state.liveUrl : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["spec"] = state ? state.spec : undefined;
            resourceInputs["updatedAt"] = state ? state.updatedAt : undefined;
        } else {
            const args = argsOrState as AppArgs | undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["spec"] = args ? args.spec : undefined;
            resourceInputs["activeDeploymentId"] = undefined /*out*/;
            resourceInputs["appUrn"] = undefined /*out*/;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["defaultIngress"] = undefined /*out*/;
            resourceInputs["liveUrl"] = undefined /*out*/;
            resourceInputs["updatedAt"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(App.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering App resources.
 */
export interface AppState {
    /**
     * The ID the app's currently active deployment.
     */
    activeDeploymentId?: pulumi.Input<string>;
    /**
     * The uniform resource identifier for the app.
     */
    appUrn?: pulumi.Input<string>;
    /**
     * The date and time of when the app was created.
     */
    createdAt?: pulumi.Input<string>;
    /**
     * The default URL to access the app.
     */
    defaultIngress?: pulumi.Input<string>;
    /**
     * The live URL of the app.
     */
    liveUrl?: pulumi.Input<string>;
    /**
     * The ID of the project that the app is assigned to.
     *
     * A spec can contain multiple components.
     *
     * A `service` can contain:
     */
    projectId?: pulumi.Input<string>;
    /**
     * A DigitalOcean App spec describing the app.
     */
    spec?: pulumi.Input<inputs.AppSpec>;
    /**
     * The date and time of when the app was last updated.
     */
    updatedAt?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a App resource.
 */
export interface AppArgs {
    /**
     * The ID of the project that the app is assigned to.
     *
     * A spec can contain multiple components.
     *
     * A `service` can contain:
     */
    projectId?: pulumi.Input<string>;
    /**
     * A DigitalOcean App spec describing the app.
     */
    spec?: pulumi.Input<inputs.AppSpec>;
}
