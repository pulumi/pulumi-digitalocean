// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a DigitalOcean App resource.
 *
 * ## Example Usage
 *
 * To create an app, provide a [DigitalOcean app spec](https://www.digitalocean.com/docs/app-platform/resources/app-specification-reference/) specifying the app's components.
 * ### Basic Example
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const golang_sample = new digitalocean.App("golang-sample", {
 *     spec: {
 *         name: "golang-sample",
 *         region: "ams",
 *         services: [{
 *             environmentSlug: "go",
 *             git: {
 *                 branch: "main",
 *                 repoCloneUrl: "https://github.com/digitalocean/sample-golang.git",
 *             },
 *             instanceCount: 1,
 *             instanceSizeSlug: "professional-xs",
 *             name: "go-service",
 *         }],
 *     },
 * });
 * ```
 * ### Static Site Example
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const static_ste_example = new digitalocean.App("static-ste-example", {
 *     spec: {
 *         name: "static-ste-example",
 *         region: "ams",
 *         staticSites: [{
 *             buildCommand: "bundle exec jekyll build -d ./public",
 *             git: {
 *                 branch: "main",
 *                 repoCloneUrl: "https://github.com/digitalocean/sample-jekyll.git",
 *             },
 *             name: "sample-jekyll",
 *             outputDir: "/public",
 *         }],
 *     },
 * });
 * ```
 * ### Multiple Components Example
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const mono_repo_example = new digitalocean.App("mono-repo-example", {
 *     spec: {
 *         domains: ["foo.example.com"],
 *         name: "mono-repo-example",
 *         region: "ams",
 *         // Build a Go project in the api/ directory that listens on port 3000
 *         // and serves it at https://foo.example.com/api
 *         services: [{
 *             environmentSlug: "go",
 *             github: {
 *                 branch: "main",
 *                 deployOnPush: true,
 *                 repo: "username/repo",
 *             },
 *             httpPort: 3000,
 *             instanceCount: 2,
 *             instanceSizeSlug: "professional-xs",
 *             name: "api",
 *             routes: {
 *                 path: "/api",
 *             },
 *             runCommand: "bin/api",
 *             sourceDir: "api/",
 *         }],
 *         // Builds a static site in the project's root directory
 *         // and serves it at https://foo.example.com/
 *         staticSites: [{
 *             buildCommand: "npm run build",
 *             github: {
 *                 branch: "main",
 *                 deployOnPush: true,
 *                 repo: "username/repo",
 *             },
 *             name: "web",
 *             routes: {
 *                 path: "/",
 *             },
 *         }],
 *     },
 * });
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
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as AppState | undefined;
            inputs["activeDeploymentId"] = state ? state.activeDeploymentId : undefined;
            inputs["createdAt"] = state ? state.createdAt : undefined;
            inputs["defaultIngress"] = state ? state.defaultIngress : undefined;
            inputs["liveUrl"] = state ? state.liveUrl : undefined;
            inputs["spec"] = state ? state.spec : undefined;
            inputs["updatedAt"] = state ? state.updatedAt : undefined;
        } else {
            const args = argsOrState as AppArgs | undefined;
            inputs["spec"] = args ? args.spec : undefined;
            inputs["activeDeploymentId"] = undefined /*out*/;
            inputs["createdAt"] = undefined /*out*/;
            inputs["defaultIngress"] = undefined /*out*/;
            inputs["liveUrl"] = undefined /*out*/;
            inputs["updatedAt"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(App.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering App resources.
 */
export interface AppState {
    /**
     * The ID the app's currently active deployment.
     */
    readonly activeDeploymentId?: pulumi.Input<string>;
    /**
     * The date and time of when the app was created.
     */
    readonly createdAt?: pulumi.Input<string>;
    /**
     * The default URL to access the app.
     */
    readonly defaultIngress?: pulumi.Input<string>;
    /**
     * The live URL of the app.
     */
    readonly liveUrl?: pulumi.Input<string>;
    /**
     * A DigitalOcean App spec describing the app.
     */
    readonly spec?: pulumi.Input<inputs.AppSpec>;
    /**
     * The date and time of when the app was last updated.
     */
    readonly updatedAt?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a App resource.
 */
export interface AppArgs {
    /**
     * A DigitalOcean App spec describing the app.
     */
    readonly spec?: pulumi.Input<inputs.AppSpec>;
}
