// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a DigitalOcean database connection pool resource.
 *
 * ## Example Usage
 *
 * ### Create a new PostgreSQL database connection pool
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const postgresExample = new digitalocean.DatabaseCluster("postgres-example", {
 *     engine: "pg",
 *     version: "11",
 *     size: "db-s-1vcpu-1gb",
 *     region: "nyc1",
 *     nodeCount: 1,
 * });
 * const pool01 = new digitalocean.DatabaseConnectionPool("pool-01", {
 *     clusterId: postgres_example.id,
 *     mode: "transaction",
 *     size: 20,
 *     dbName: "defaultdb",
 *     user: "doadmin",
 * });
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
     * The name of the database user for use with the connection pool.
     */
    public readonly user!: pulumi.Output<string>;

    /**
     * Create a DatabaseConnectionPool resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DatabaseConnectionPoolArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DatabaseConnectionPoolArgs | DatabaseConnectionPoolState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as DatabaseConnectionPoolState | undefined;
            inputs["clusterId"] = state ? state.clusterId : undefined;
            inputs["dbName"] = state ? state.dbName : undefined;
            inputs["host"] = state ? state.host : undefined;
            inputs["mode"] = state ? state.mode : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["password"] = state ? state.password : undefined;
            inputs["port"] = state ? state.port : undefined;
            inputs["privateHost"] = state ? state.privateHost : undefined;
            inputs["privateUri"] = state ? state.privateUri : undefined;
            inputs["size"] = state ? state.size : undefined;
            inputs["uri"] = state ? state.uri : undefined;
            inputs["user"] = state ? state.user : undefined;
        } else {
            const args = argsOrState as DatabaseConnectionPoolArgs | undefined;
            if (!args || args.clusterId === undefined) {
                throw new Error("Missing required property 'clusterId'");
            }
            if (!args || args.dbName === undefined) {
                throw new Error("Missing required property 'dbName'");
            }
            if (!args || args.mode === undefined) {
                throw new Error("Missing required property 'mode'");
            }
            if (!args || args.size === undefined) {
                throw new Error("Missing required property 'size'");
            }
            if (!args || args.user === undefined) {
                throw new Error("Missing required property 'user'");
            }
            inputs["clusterId"] = args ? args.clusterId : undefined;
            inputs["dbName"] = args ? args.dbName : undefined;
            inputs["mode"] = args ? args.mode : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["size"] = args ? args.size : undefined;
            inputs["user"] = args ? args.user : undefined;
            inputs["host"] = undefined /*out*/;
            inputs["password"] = undefined /*out*/;
            inputs["port"] = undefined /*out*/;
            inputs["privateHost"] = undefined /*out*/;
            inputs["privateUri"] = undefined /*out*/;
            inputs["uri"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(DatabaseConnectionPool.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DatabaseConnectionPool resources.
 */
export interface DatabaseConnectionPoolState {
    /**
     * The ID of the source database cluster. Note: This must be a PostgreSQL cluster.
     */
    readonly clusterId?: pulumi.Input<string>;
    /**
     * The database for use with the connection pool.
     */
    readonly dbName?: pulumi.Input<string>;
    /**
     * The hostname used to connect to the database connection pool.
     */
    readonly host?: pulumi.Input<string>;
    /**
     * The PGBouncer transaction mode for the connection pool. The allowed values are session, transaction, and statement.
     */
    readonly mode?: pulumi.Input<string>;
    /**
     * The name for the database connection pool.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Password for the connection pool's user.
     */
    readonly password?: pulumi.Input<string>;
    /**
     * Network port that the database connection pool is listening on.
     */
    readonly port?: pulumi.Input<number>;
    /**
     * Same as `host`, but only accessible from resources within the account and in the same region.
     */
    readonly privateHost?: pulumi.Input<string>;
    /**
     * Same as `uri`, but only accessible from resources within the account and in the same region.
     */
    readonly privateUri?: pulumi.Input<string>;
    /**
     * The desired size of the PGBouncer connection pool.
     */
    readonly size?: pulumi.Input<number>;
    /**
     * The full URI for connecting to the database connection pool.
     */
    readonly uri?: pulumi.Input<string>;
    /**
     * The name of the database user for use with the connection pool.
     */
    readonly user?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a DatabaseConnectionPool resource.
 */
export interface DatabaseConnectionPoolArgs {
    /**
     * The ID of the source database cluster. Note: This must be a PostgreSQL cluster.
     */
    readonly clusterId: pulumi.Input<string>;
    /**
     * The database for use with the connection pool.
     */
    readonly dbName: pulumi.Input<string>;
    /**
     * The PGBouncer transaction mode for the connection pool. The allowed values are session, transaction, and statement.
     */
    readonly mode: pulumi.Input<string>;
    /**
     * The name for the database connection pool.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The desired size of the PGBouncer connection pool.
     */
    readonly size: pulumi.Input<number>;
    /**
     * The name of the database user for use with the connection pool.
     */
    readonly user: pulumi.Input<string>;
}
