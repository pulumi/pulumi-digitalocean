// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a DigitalOcean database resource. When creating a new database cluster, a default database with name `defaultdb` will be created. Then, this resource can be used to provide additional database inside the cluster.
 *
 * ## Example Usage
 *
 * ### Create a new PostgreSQL database
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const postgres_example = new digitalocean.DatabaseCluster("postgres-example", {
 *     name: "example-postgres-cluster",
 *     engine: "pg",
 *     version: "15",
 *     size: digitalocean.DatabaseSlug.DB_1VPCU1GB,
 *     region: digitalocean.Region.NYC1,
 *     nodeCount: 1,
 * });
 * const database_example = new digitalocean.DatabaseDb("database-example", {
 *     clusterId: postgres_example.id,
 *     name: "foobar",
 * });
 * ```
 *
 * ## Import
 *
 * Database can be imported using the `id` of the source database cluster
 *
 * and the `name` of the database joined with a comma. For example:
 *
 * ```sh
 * $ pulumi import digitalocean:index/databaseDb:DatabaseDb database-example 245bcfd0-7f31-4ce6-a2bc-475a116cca97,foobar
 * ```
 */
export class DatabaseDb extends pulumi.CustomResource {
    /**
     * Get an existing DatabaseDb resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DatabaseDbState, opts?: pulumi.CustomResourceOptions): DatabaseDb {
        return new DatabaseDb(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'digitalocean:index/databaseDb:DatabaseDb';

    /**
     * Returns true if the given object is an instance of DatabaseDb.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DatabaseDb {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DatabaseDb.__pulumiType;
    }

    /**
     * The ID of the original source database cluster.
     */
    public readonly clusterId!: pulumi.Output<string>;
    /**
     * The name for the database.
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a DatabaseDb resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DatabaseDbArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DatabaseDbArgs | DatabaseDbState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DatabaseDbState | undefined;
            resourceInputs["clusterId"] = state ? state.clusterId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as DatabaseDbArgs | undefined;
            if ((!args || args.clusterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterId'");
            }
            resourceInputs["clusterId"] = args ? args.clusterId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DatabaseDb.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DatabaseDb resources.
 */
export interface DatabaseDbState {
    /**
     * The ID of the original source database cluster.
     */
    clusterId?: pulumi.Input<string>;
    /**
     * The name for the database.
     */
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a DatabaseDb resource.
 */
export interface DatabaseDbArgs {
    /**
     * The ID of the original source database cluster.
     */
    clusterId: pulumi.Input<string>;
    /**
     * The name for the database.
     */
    name?: pulumi.Input<string>;
}
