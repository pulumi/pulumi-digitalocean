// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as enums from "./types/enums";
import * as utilities from "./utilities";

/**
 * Provides a DigitalOcean database replica resource.
 *
 * ## Example Usage
 *
 * ## Import
 *
 * Database replicas can be imported using the `id` of the source database cluster and the `name` of the replica joined with a comma. For example
 *
 * ```sh
 *  $ pulumi import digitalocean:index/databaseReplica:DatabaseReplica read-replica 245bcfd0-7f31-4ce6-a2bc-475a116cca97,read-replica
 * ```
 */
export class DatabaseReplica extends pulumi.CustomResource {
    /**
     * Get an existing DatabaseReplica resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DatabaseReplicaState, opts?: pulumi.CustomResourceOptions): DatabaseReplica {
        return new DatabaseReplica(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'digitalocean:index/databaseReplica:DatabaseReplica';

    /**
     * Returns true if the given object is an instance of DatabaseReplica.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DatabaseReplica {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DatabaseReplica.__pulumiType;
    }

    /**
     * The ID of the original source database cluster.
     */
    public readonly clusterId!: pulumi.Output<string>;
    /**
     * Name of the replica's default database.
     */
    public /*out*/ readonly database!: pulumi.Output<string>;
    /**
     * Database replica's hostname.
     */
    public /*out*/ readonly host!: pulumi.Output<string>;
    /**
     * The name for the database replica.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Password for the replica's default user.
     */
    public /*out*/ readonly password!: pulumi.Output<string>;
    /**
     * Network port that the database replica is listening on.
     */
    public /*out*/ readonly port!: pulumi.Output<number>;
    /**
     * Same as `host`, but only accessible from resources within the account and in the same region.
     */
    public /*out*/ readonly privateHost!: pulumi.Output<string>;
    /**
     * The ID of the VPC where the database replica will be located.
     */
    public readonly privateNetworkUuid!: pulumi.Output<string>;
    /**
     * Same as `uri`, but only accessible from resources within the account and in the same region.
     */
    public /*out*/ readonly privateUri!: pulumi.Output<string>;
    /**
     * DigitalOcean region where the replica will reside.
     */
    public readonly region!: pulumi.Output<string | undefined>;
    /**
     * Database Droplet size associated with the replica (ex. `db-s-1vcpu-1gb`). Note that when resizing an existing replica, its size can only be increased. Decreasing its size is not supported.
     */
    public readonly size!: pulumi.Output<string | undefined>;
    /**
     * A list of tag names to be applied to the database replica.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;
    /**
     * The full URI for connecting to the database replica.
     */
    public /*out*/ readonly uri!: pulumi.Output<string>;
    /**
     * Username for the replica's default user.
     */
    public /*out*/ readonly user!: pulumi.Output<string>;
    /**
     * The UUID of the database replica. The uuid can be used to reference the database replica as the target database cluster in other resources. See example  "Create firewall rule for database replica" above.
     */
    public /*out*/ readonly uuid!: pulumi.Output<string>;

    /**
     * Create a DatabaseReplica resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DatabaseReplicaArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DatabaseReplicaArgs | DatabaseReplicaState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DatabaseReplicaState | undefined;
            resourceInputs["clusterId"] = state ? state.clusterId : undefined;
            resourceInputs["database"] = state ? state.database : undefined;
            resourceInputs["host"] = state ? state.host : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["password"] = state ? state.password : undefined;
            resourceInputs["port"] = state ? state.port : undefined;
            resourceInputs["privateHost"] = state ? state.privateHost : undefined;
            resourceInputs["privateNetworkUuid"] = state ? state.privateNetworkUuid : undefined;
            resourceInputs["privateUri"] = state ? state.privateUri : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["size"] = state ? state.size : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["uri"] = state ? state.uri : undefined;
            resourceInputs["user"] = state ? state.user : undefined;
            resourceInputs["uuid"] = state ? state.uuid : undefined;
        } else {
            const args = argsOrState as DatabaseReplicaArgs | undefined;
            if ((!args || args.clusterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterId'");
            }
            resourceInputs["clusterId"] = args ? args.clusterId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["privateNetworkUuid"] = args ? args.privateNetworkUuid : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["size"] = args ? args.size : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["database"] = undefined /*out*/;
            resourceInputs["host"] = undefined /*out*/;
            resourceInputs["password"] = undefined /*out*/;
            resourceInputs["port"] = undefined /*out*/;
            resourceInputs["privateHost"] = undefined /*out*/;
            resourceInputs["privateUri"] = undefined /*out*/;
            resourceInputs["uri"] = undefined /*out*/;
            resourceInputs["user"] = undefined /*out*/;
            resourceInputs["uuid"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["password", "privateUri", "uri"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(DatabaseReplica.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DatabaseReplica resources.
 */
export interface DatabaseReplicaState {
    /**
     * The ID of the original source database cluster.
     */
    clusterId?: pulumi.Input<string>;
    /**
     * Name of the replica's default database.
     */
    database?: pulumi.Input<string>;
    /**
     * Database replica's hostname.
     */
    host?: pulumi.Input<string>;
    /**
     * The name for the database replica.
     */
    name?: pulumi.Input<string>;
    /**
     * Password for the replica's default user.
     */
    password?: pulumi.Input<string>;
    /**
     * Network port that the database replica is listening on.
     */
    port?: pulumi.Input<number>;
    /**
     * Same as `host`, but only accessible from resources within the account and in the same region.
     */
    privateHost?: pulumi.Input<string>;
    /**
     * The ID of the VPC where the database replica will be located.
     */
    privateNetworkUuid?: pulumi.Input<string>;
    /**
     * Same as `uri`, but only accessible from resources within the account and in the same region.
     */
    privateUri?: pulumi.Input<string>;
    /**
     * DigitalOcean region where the replica will reside.
     */
    region?: pulumi.Input<string | enums.Region>;
    /**
     * Database Droplet size associated with the replica (ex. `db-s-1vcpu-1gb`). Note that when resizing an existing replica, its size can only be increased. Decreasing its size is not supported.
     */
    size?: pulumi.Input<string | enums.DatabaseSlug>;
    /**
     * A list of tag names to be applied to the database replica.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The full URI for connecting to the database replica.
     */
    uri?: pulumi.Input<string>;
    /**
     * Username for the replica's default user.
     */
    user?: pulumi.Input<string>;
    /**
     * The UUID of the database replica. The uuid can be used to reference the database replica as the target database cluster in other resources. See example  "Create firewall rule for database replica" above.
     */
    uuid?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a DatabaseReplica resource.
 */
export interface DatabaseReplicaArgs {
    /**
     * The ID of the original source database cluster.
     */
    clusterId: pulumi.Input<string>;
    /**
     * The name for the database replica.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the VPC where the database replica will be located.
     */
    privateNetworkUuid?: pulumi.Input<string>;
    /**
     * DigitalOcean region where the replica will reside.
     */
    region?: pulumi.Input<string | enums.Region>;
    /**
     * Database Droplet size associated with the replica (ex. `db-s-1vcpu-1gb`). Note that when resizing an existing replica, its size can only be increased. Decreasing its size is not supported.
     */
    size?: pulumi.Input<string | enums.DatabaseSlug>;
    /**
     * A list of tag names to be applied to the database replica.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
}
