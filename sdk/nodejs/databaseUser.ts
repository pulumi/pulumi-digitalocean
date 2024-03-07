// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as enums from "./types/enums";
import * as utilities from "./utilities";

/**
 * Provides a DigitalOcean database user resource. When creating a new database cluster, a default admin user with name `doadmin` will be created. Then, this resource can be used to provide additional normal users inside the cluster.
 *
 * > **NOTE:** Any new users created will always have `normal` role, only the default user that comes with database cluster creation has `primary` role. Additional permissions must be managed manually.
 *
 * ## Example Usage
 *
 * ### Create a new PostgreSQL database user
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const postgres_example = new digitalocean.DatabaseCluster("postgres-example", {
 *     engine: "pg",
 *     version: "11",
 *     size: "db-s-1vcpu-1gb",
 *     region: "nyc1",
 *     nodeCount: 1,
 * });
 * const user_example = new digitalocean.DatabaseUser("user-example", {clusterId: postgres_example.id});
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### Create a new user for a PostgreSQL database replica
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const postgres_example = new digitalocean.DatabaseCluster("postgres-example", {
 *     engine: "pg",
 *     version: "11",
 *     size: "db-s-1vcpu-1gb",
 *     region: "nyc1",
 *     nodeCount: 1,
 * });
 * const replica_example = new digitalocean.DatabaseReplica("replica-example", {
 *     clusterId: postgres_example.id,
 *     size: "db-s-1vcpu-1gb",
 *     region: "nyc1",
 * });
 * const user_example = new digitalocean.DatabaseUser("user-example", {clusterId: replica_example.uuid});
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### Create a new user for a Kafka database cluster
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const kafka_example = new digitalocean.DatabaseCluster("kafka-example", {
 *     engine: "kafka",
 *     version: "3.5",
 *     size: "db-s-2vcpu-2gb",
 *     region: "nyc1",
 *     nodeCount: 3,
 * });
 * const foobarTopic = new digitalocean.DatabaseKafkaTopic("foobarTopic", {clusterId: digitalocean_database_cluster.foobar.id});
 * const foobarUser = new digitalocean.DatabaseUser("foobarUser", {
 *     clusterId: digitalocean_database_cluster.foobar.id,
 *     settings: [{
 *         acls: [
 *             {
 *                 topic: "topic-1",
 *                 permission: "produce",
 *             },
 *             {
 *                 topic: "topic-2",
 *                 permission: "produceconsume",
 *             },
 *             {
 *                 topic: "topic-*",
 *                 permission: "consume",
 *             },
 *         ],
 *     }],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Database user can be imported using the `id` of the source database cluster
 *
 * and the `name` of the user joined with a comma. For example:
 *
 * ```sh
 * $ pulumi import digitalocean:index/databaseUser:DatabaseUser user-example 245bcfd0-7f31-4ce6-a2bc-475a116cca97,foobar
 * ```
 */
export class DatabaseUser extends pulumi.CustomResource {
    /**
     * Get an existing DatabaseUser resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DatabaseUserState, opts?: pulumi.CustomResourceOptions): DatabaseUser {
        return new DatabaseUser(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'digitalocean:index/databaseUser:DatabaseUser';

    /**
     * Returns true if the given object is an instance of DatabaseUser.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DatabaseUser {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DatabaseUser.__pulumiType;
    }

    /**
     * The ID of the original source database cluster.
     */
    public readonly clusterId!: pulumi.Output<string>;
    /**
     * The authentication method to use for connections to the MySQL user account. The valid values are `mysqlNativePassword` or `cachingSha2Password` (this is the default).
     */
    public readonly mysqlAuthPlugin!: pulumi.Output<string | undefined>;
    /**
     * The name for the database user.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Password for the database user.
     */
    public /*out*/ readonly password!: pulumi.Output<string>;
    /**
     * Role for the database user. The value will be either "primary" or "normal".
     */
    public /*out*/ readonly role!: pulumi.Output<string>;
    /**
     * Contains optional settings for the user.
     * The `settings` block is documented below.
     */
    public readonly settings!: pulumi.Output<outputs.DatabaseUserSetting[] | undefined>;

    /**
     * Create a DatabaseUser resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DatabaseUserArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DatabaseUserArgs | DatabaseUserState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DatabaseUserState | undefined;
            resourceInputs["clusterId"] = state ? state.clusterId : undefined;
            resourceInputs["mysqlAuthPlugin"] = state ? state.mysqlAuthPlugin : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["password"] = state ? state.password : undefined;
            resourceInputs["role"] = state ? state.role : undefined;
            resourceInputs["settings"] = state ? state.settings : undefined;
        } else {
            const args = argsOrState as DatabaseUserArgs | undefined;
            if ((!args || args.clusterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterId'");
            }
            resourceInputs["clusterId"] = args ? args.clusterId : undefined;
            resourceInputs["mysqlAuthPlugin"] = args ? args.mysqlAuthPlugin : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["settings"] = args ? args.settings : undefined;
            resourceInputs["password"] = undefined /*out*/;
            resourceInputs["role"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["password"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(DatabaseUser.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DatabaseUser resources.
 */
export interface DatabaseUserState {
    /**
     * The ID of the original source database cluster.
     */
    clusterId?: pulumi.Input<string>;
    /**
     * The authentication method to use for connections to the MySQL user account. The valid values are `mysqlNativePassword` or `cachingSha2Password` (this is the default).
     */
    mysqlAuthPlugin?: pulumi.Input<string>;
    /**
     * The name for the database user.
     */
    name?: pulumi.Input<string>;
    /**
     * Password for the database user.
     */
    password?: pulumi.Input<string>;
    /**
     * Role for the database user. The value will be either "primary" or "normal".
     */
    role?: pulumi.Input<string>;
    /**
     * Contains optional settings for the user.
     * The `settings` block is documented below.
     */
    settings?: pulumi.Input<pulumi.Input<inputs.DatabaseUserSetting>[]>;
}

/**
 * The set of arguments for constructing a DatabaseUser resource.
 */
export interface DatabaseUserArgs {
    /**
     * The ID of the original source database cluster.
     */
    clusterId: pulumi.Input<string>;
    /**
     * The authentication method to use for connections to the MySQL user account. The valid values are `mysqlNativePassword` or `cachingSha2Password` (this is the default).
     */
    mysqlAuthPlugin?: pulumi.Input<string>;
    /**
     * The name for the database user.
     */
    name?: pulumi.Input<string>;
    /**
     * Contains optional settings for the user.
     * The `settings` block is documented below.
     */
    settings?: pulumi.Input<pulumi.Input<inputs.DatabaseUserSetting>[]>;
}
