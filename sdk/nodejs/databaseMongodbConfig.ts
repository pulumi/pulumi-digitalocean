// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a virtual resource that can be used to change advanced configuration
 * options for a DigitalOcean managed MongoDB database cluster.
 *
 * > **Note** MongoDB configurations are only removed from state when destroyed. The remote configuration is not unset.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const exampleDatabaseCluster = new digitalocean.DatabaseCluster("example", {
 *     name: "example-mongodb-cluster",
 *     engine: "mongodb",
 *     version: "7",
 *     size: digitalocean.DatabaseSlug.DB_1VPCU1GB,
 *     region: digitalocean.Region.NYC3,
 *     nodeCount: 1,
 * });
 * const example = new digitalocean.DatabaseMongodbConfig("example", {
 *     clusterId: exampleDatabaseCluster.id,
 *     defaultReadConcern: "majority",
 *     defaultWriteConcern: "majority",
 *     transactionLifetimeLimitSeconds: 100,
 *     slowOpThresholdMs: 100,
 *     verbosity: 3,
 * });
 * ```
 *
 * ## Import
 *
 * A MongoDB database cluster's configuration can be imported using the `id` the parent cluster, e.g.
 *
 * ```sh
 * $ pulumi import digitalocean:index/databaseMongodbConfig:DatabaseMongodbConfig example 4b62829a-9c42-465b-aaa3-84051048e712
 * ```
 */
export class DatabaseMongodbConfig extends pulumi.CustomResource {
    /**
     * Get an existing DatabaseMongodbConfig resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DatabaseMongodbConfigState, opts?: pulumi.CustomResourceOptions): DatabaseMongodbConfig {
        return new DatabaseMongodbConfig(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'digitalocean:index/databaseMongodbConfig:DatabaseMongodbConfig';

    /**
     * Returns true if the given object is an instance of DatabaseMongodbConfig.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DatabaseMongodbConfig {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DatabaseMongodbConfig.__pulumiType;
    }

    /**
     * The ID of the target MongoDB cluster.
     */
    public readonly clusterId!: pulumi.Output<string>;
    /**
     * Specifies the default consistency behavior of reads from the database. Data that is returned from the query with may or may not have been acknowledged by all nodes in the replicaset depending on this value. Learn more [here](https://www.mongodb.com/docs/manual/reference/read-concern/).
     */
    public readonly defaultReadConcern!: pulumi.Output<string>;
    /**
     * Describes the level of acknowledgment requested from MongoDB for write operations clusters. This field can set to either `majority` or a number`0...n` which will describe the number of nodes that must acknowledge the write operation before it is fully accepted. Setting to `0` will request no acknowledgement of the write operation. Learn more [here](https://www.mongodb.com/docs/manual/reference/write-concern/).
     */
    public readonly defaultWriteConcern!: pulumi.Output<string>;
    /**
     * Operations that run for longer than this threshold are considered slow which are then recorded to the diagnostic logs. Higher log levels (verbosity) will record all operations regardless of this threshold on the primary node. <em>Changing this parameter will lead to a restart of the MongoDB service.</em> Learn more [here](https://www.mongodb.com/docs/manual/reference/configuration-options/#mongodb-setting-operationProfiling.slowOpThresholdMs).
     */
    public readonly slowOpThresholdMs!: pulumi.Output<number>;
    /**
     * Specifies the lifetime of multi-document transactions. Transactions that exceed this limit are considered expired and will be aborted by a periodic cleanup process. The cleanup process runs every `transactionLifetimeLimitSeconds/2 seconds` or at least once every 60 seconds. <em>Changing this parameter will lead to a restart of the MongoDB service.</em> Learn more [here](https://www.mongodb.com/docs/manual/reference/parameters/#mongodb-parameter-param.transactionLifetimeLimitSeconds).
     */
    public readonly transactionLifetimeLimitSeconds!: pulumi.Output<number>;
    /**
     * The log message verbosity level. The verbosity level determines the amount of Informational and Debug messages MongoDB outputs. 0 includes informational messages while 1...5 increases the level to include debug messages. <em>Changing this parameter will lead to a restart of the MongoDB service.</em> Learn more [here](https://www.mongodb.com/docs/manual/reference/configuration-options/#mongodb-setting-systemLog.verbosity).
     */
    public readonly verbosity!: pulumi.Output<number>;

    /**
     * Create a DatabaseMongodbConfig resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DatabaseMongodbConfigArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DatabaseMongodbConfigArgs | DatabaseMongodbConfigState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DatabaseMongodbConfigState | undefined;
            resourceInputs["clusterId"] = state ? state.clusterId : undefined;
            resourceInputs["defaultReadConcern"] = state ? state.defaultReadConcern : undefined;
            resourceInputs["defaultWriteConcern"] = state ? state.defaultWriteConcern : undefined;
            resourceInputs["slowOpThresholdMs"] = state ? state.slowOpThresholdMs : undefined;
            resourceInputs["transactionLifetimeLimitSeconds"] = state ? state.transactionLifetimeLimitSeconds : undefined;
            resourceInputs["verbosity"] = state ? state.verbosity : undefined;
        } else {
            const args = argsOrState as DatabaseMongodbConfigArgs | undefined;
            if ((!args || args.clusterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterId'");
            }
            resourceInputs["clusterId"] = args ? args.clusterId : undefined;
            resourceInputs["defaultReadConcern"] = args ? args.defaultReadConcern : undefined;
            resourceInputs["defaultWriteConcern"] = args ? args.defaultWriteConcern : undefined;
            resourceInputs["slowOpThresholdMs"] = args ? args.slowOpThresholdMs : undefined;
            resourceInputs["transactionLifetimeLimitSeconds"] = args ? args.transactionLifetimeLimitSeconds : undefined;
            resourceInputs["verbosity"] = args ? args.verbosity : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DatabaseMongodbConfig.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DatabaseMongodbConfig resources.
 */
export interface DatabaseMongodbConfigState {
    /**
     * The ID of the target MongoDB cluster.
     */
    clusterId?: pulumi.Input<string>;
    /**
     * Specifies the default consistency behavior of reads from the database. Data that is returned from the query with may or may not have been acknowledged by all nodes in the replicaset depending on this value. Learn more [here](https://www.mongodb.com/docs/manual/reference/read-concern/).
     */
    defaultReadConcern?: pulumi.Input<string>;
    /**
     * Describes the level of acknowledgment requested from MongoDB for write operations clusters. This field can set to either `majority` or a number`0...n` which will describe the number of nodes that must acknowledge the write operation before it is fully accepted. Setting to `0` will request no acknowledgement of the write operation. Learn more [here](https://www.mongodb.com/docs/manual/reference/write-concern/).
     */
    defaultWriteConcern?: pulumi.Input<string>;
    /**
     * Operations that run for longer than this threshold are considered slow which are then recorded to the diagnostic logs. Higher log levels (verbosity) will record all operations regardless of this threshold on the primary node. <em>Changing this parameter will lead to a restart of the MongoDB service.</em> Learn more [here](https://www.mongodb.com/docs/manual/reference/configuration-options/#mongodb-setting-operationProfiling.slowOpThresholdMs).
     */
    slowOpThresholdMs?: pulumi.Input<number>;
    /**
     * Specifies the lifetime of multi-document transactions. Transactions that exceed this limit are considered expired and will be aborted by a periodic cleanup process. The cleanup process runs every `transactionLifetimeLimitSeconds/2 seconds` or at least once every 60 seconds. <em>Changing this parameter will lead to a restart of the MongoDB service.</em> Learn more [here](https://www.mongodb.com/docs/manual/reference/parameters/#mongodb-parameter-param.transactionLifetimeLimitSeconds).
     */
    transactionLifetimeLimitSeconds?: pulumi.Input<number>;
    /**
     * The log message verbosity level. The verbosity level determines the amount of Informational and Debug messages MongoDB outputs. 0 includes informational messages while 1...5 increases the level to include debug messages. <em>Changing this parameter will lead to a restart of the MongoDB service.</em> Learn more [here](https://www.mongodb.com/docs/manual/reference/configuration-options/#mongodb-setting-systemLog.verbosity).
     */
    verbosity?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a DatabaseMongodbConfig resource.
 */
export interface DatabaseMongodbConfigArgs {
    /**
     * The ID of the target MongoDB cluster.
     */
    clusterId: pulumi.Input<string>;
    /**
     * Specifies the default consistency behavior of reads from the database. Data that is returned from the query with may or may not have been acknowledged by all nodes in the replicaset depending on this value. Learn more [here](https://www.mongodb.com/docs/manual/reference/read-concern/).
     */
    defaultReadConcern?: pulumi.Input<string>;
    /**
     * Describes the level of acknowledgment requested from MongoDB for write operations clusters. This field can set to either `majority` or a number`0...n` which will describe the number of nodes that must acknowledge the write operation before it is fully accepted. Setting to `0` will request no acknowledgement of the write operation. Learn more [here](https://www.mongodb.com/docs/manual/reference/write-concern/).
     */
    defaultWriteConcern?: pulumi.Input<string>;
    /**
     * Operations that run for longer than this threshold are considered slow which are then recorded to the diagnostic logs. Higher log levels (verbosity) will record all operations regardless of this threshold on the primary node. <em>Changing this parameter will lead to a restart of the MongoDB service.</em> Learn more [here](https://www.mongodb.com/docs/manual/reference/configuration-options/#mongodb-setting-operationProfiling.slowOpThresholdMs).
     */
    slowOpThresholdMs?: pulumi.Input<number>;
    /**
     * Specifies the lifetime of multi-document transactions. Transactions that exceed this limit are considered expired and will be aborted by a periodic cleanup process. The cleanup process runs every `transactionLifetimeLimitSeconds/2 seconds` or at least once every 60 seconds. <em>Changing this parameter will lead to a restart of the MongoDB service.</em> Learn more [here](https://www.mongodb.com/docs/manual/reference/parameters/#mongodb-parameter-param.transactionLifetimeLimitSeconds).
     */
    transactionLifetimeLimitSeconds?: pulumi.Input<number>;
    /**
     * The log message verbosity level. The verbosity level determines the amount of Informational and Debug messages MongoDB outputs. 0 includes informational messages while 1...5 increases the level to include debug messages. <em>Changing this parameter will lead to a restart of the MongoDB service.</em> Learn more [here](https://www.mongodb.com/docs/manual/reference/configuration-options/#mongodb-setting-systemLog.verbosity).
     */
    verbosity?: pulumi.Input<number>;
}