// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a DigitalOcean database connection pool resource.
 *
 * ## Example Usage
 *
 * ### Create a new PostgreSQL database connection pool
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
 * const pool_01 = new digitalocean.DatabaseConnectionPool("pool-01", {
 *     clusterId: postgres_example.id,
 *     name: "pool-01",
 *     mode: "transaction",
 *     size: 20,
 *     dbName: "defaultdb",
 *     user: "doadmin",
 * });
 * ```
 *
 * ## Import
 *
 * Database connection pools can be imported using the `id` of the source database cluster
 *
 * and the `name` of the connection pool joined with a comma. For example:
 *
 * ```sh
 * $ pulumi import digitalocean:index/databaseConnectionPool:DatabaseConnectionPool pool-01 245bcfd0-7f31-4ce6-a2bc-475a116cca97,pool-01
 * ```
 */
export class DatabaseConnectionPool extends pulumi.CustomResource {
    /**
     * Get an existing DatabaseConnectionPool resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DatabaseConnectionPoolState, opts?: pulumi.CustomResourceOptions): DatabaseConnectionPool {
        return new DatabaseConnectionPool(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'digitalocean:index/databaseConnectionPool:DatabaseConnectionPool';

    /**
     * Returns true if the given object is an instance of DatabaseConnectionPool.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DatabaseConnectionPool {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DatabaseConnectionPool.__pulumiType;
    }

    /**
     * The ID of the source database cluster. Note: This must be a PostgreSQL cluster.
     */
    public readonly clusterId!: pulumi.Output<string>;
    /**
     * The database for use with the connection pool.
     */
    public readonly dbName!: pulumi.Output<string>;
    /**
     * The hostname used to connect to the database connection pool.
     */
    public /*out*/ readonly host!: pulumi.Output<string>;
    /**
     * The PGBouncer transaction mode for the connection pool. The allowed values are session, transaction, and statement.
     */
    public readonly mode!: pulumi.Output<string>;
    /**
     * The name for the database connection pool.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Password for the connection pool's user.
     */
    public /*out*/ readonly password!: pulumi.Output<string>;
    /**
     * Network port that the database connection pool is listening on.
     */
    public /*out*/ readonly port!: pulumi.Output<number>;
    /**
     * Same as `host`, but only accessible from resources within the account and in the same region.
     */
    public /*out*/ readonly privateHost!: pulumi.Output<string>;
    /**
     * Same as `uri`, but only accessible from resources within the account and in the same region.
     */
    public /*out*/ readonly privateUri!: pulumi.Output<string>;
    /**
     * The desired size of the PGBouncer connection pool.
     */
    public readonly size!: pulumi.Output<number>;
    /**
     * The full URI for connecting to the database connection pool.
     */
    public /*out*/ readonly uri!: pulumi.Output<string>;
    /**
     * The name of the database user for use with the connection pool. When excluded, all sessions connect to the database as the inbound user.
     */
    public readonly user!: pulumi.Output<string | undefined>;

    /**
     * Create a DatabaseConnectionPool resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DatabaseConnectionPoolArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DatabaseConnectionPoolArgs | DatabaseConnectionPoolState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DatabaseConnectionPoolState | undefined;
            resourceInputs["clusterId"] = state ? state.clusterId : undefined;
            resourceInputs["dbName"] = state ? state.dbName : undefined;
            resourceInputs["host"] = state ? state.host : undefined;
            resourceInputs["mode"] = state ? state.mode : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["password"] = state ? state.password : undefined;
            resourceInputs["port"] = state ? state.port : undefined;
            resourceInputs["privateHost"] = state ? state.privateHost : undefined;
            resourceInputs["privateUri"] = state ? state.privateUri : undefined;
            resourceInputs["size"] = state ? state.size : undefined;
            resourceInputs["uri"] = state ? state.uri : undefined;
            resourceInputs["user"] = state ? state.user : undefined;
        } else {
            const args = argsOrState as DatabaseConnectionPoolArgs | undefined;
            if ((!args || args.clusterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterId'");
            }
            if ((!args || args.dbName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dbName'");
            }
            if ((!args || args.mode === undefined) && !opts.urn) {
                throw new Error("Missing required property 'mode'");
            }
            if ((!args || args.size === undefined) && !opts.urn) {
                throw new Error("Missing required property 'size'");
            }
            resourceInputs["clusterId"] = args ? args.clusterId : undefined;
            resourceInputs["dbName"] = args ? args.dbName : undefined;
            resourceInputs["mode"] = args ? args.mode : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["size"] = args ? args.size : undefined;
            resourceInputs["user"] = args ? args.user : undefined;
            resourceInputs["host"] = undefined /*out*/;
            resourceInputs["password"] = undefined /*out*/;
            resourceInputs["port"] = undefined /*out*/;
            resourceInputs["privateHost"] = undefined /*out*/;
            resourceInputs["privateUri"] = undefined /*out*/;
            resourceInputs["uri"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["password", "privateUri", "uri"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(DatabaseConnectionPool.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DatabaseConnectionPool resources.
 */
export interface DatabaseConnectionPoolState {
    /**
     * The ID of the source database cluster. Note: This must be a PostgreSQL cluster.
     */
    clusterId?: pulumi.Input<string>;
    /**
     * The database for use with the connection pool.
     */
    dbName?: pulumi.Input<string>;
    /**
     * The hostname used to connect to the database connection pool.
     */
    host?: pulumi.Input<string>;
    /**
     * The PGBouncer transaction mode for the connection pool. The allowed values are session, transaction, and statement.
     */
    mode?: pulumi.Input<string>;
    /**
     * The name for the database connection pool.
     */
    name?: pulumi.Input<string>;
    /**
     * Password for the connection pool's user.
     */
    password?: pulumi.Input<string>;
    /**
     * Network port that the database connection pool is listening on.
     */
    port?: pulumi.Input<number>;
    /**
     * Same as `host`, but only accessible from resources within the account and in the same region.
     */
    privateHost?: pulumi.Input<string>;
    /**
     * Same as `uri`, but only accessible from resources within the account and in the same region.
     */
    privateUri?: pulumi.Input<string>;
    /**
     * The desired size of the PGBouncer connection pool.
     */
    size?: pulumi.Input<number>;
    /**
     * The full URI for connecting to the database connection pool.
     */
    uri?: pulumi.Input<string>;
    /**
     * The name of the database user for use with the connection pool. When excluded, all sessions connect to the database as the inbound user.
     */
    user?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a DatabaseConnectionPool resource.
 */
export interface DatabaseConnectionPoolArgs {
    /**
     * The ID of the source database cluster. Note: This must be a PostgreSQL cluster.
     */
    clusterId: pulumi.Input<string>;
    /**
     * The database for use with the connection pool.
     */
    dbName: pulumi.Input<string>;
    /**
     * The PGBouncer transaction mode for the connection pool. The allowed values are session, transaction, and statement.
     */
    mode: pulumi.Input<string>;
    /**
     * The name for the database connection pool.
     */
    name?: pulumi.Input<string>;
    /**
     * The desired size of the PGBouncer connection pool.
     */
    size: pulumi.Input<number>;
    /**
     * The name of the database user for use with the connection pool. When excluded, all sessions connect to the database as the inbound user.
     */
    user?: pulumi.Input<string>;
}
