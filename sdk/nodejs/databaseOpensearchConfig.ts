// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a virtual resource that can be used to change advanced configuration
 * options for a DigitalOcean managed Opensearch database cluster.
 *
 * > **Note** Opensearch configurations are only removed from state when destroyed. The remote configuration is not unset.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * const exampleDatabaseCluster = new digitalocean.DatabaseCluster("example", {
 *     name: "example-opensearch-cluster",
 *     engine: "opensearch",
 *     version: "2",
 *     size: digitalocean.DatabaseSlug.DB_1VPCU2GB,
 *     region: digitalocean.Region.NYC3,
 *     nodeCount: 1,
 * });
 * const example = new digitalocean.DatabaseOpensearchConfig("example", {
 *     clusterId: exampleDatabaseCluster.id,
 *     ismEnabled: true,
 *     ismHistoryEnabled: true,
 *     ismHistoryMaxAgeHours: 24,
 *     ismHistoryMaxDocs: 2500000,
 *     ismHistoryRolloverCheckPeriodHours: 8,
 *     ismHistoryRolloverRetentionPeriodDays: 30,
 *     httpMaxContentLengthBytes: 100000000,
 *     httpMaxHeaderSizeBytes: 8192,
 *     httpMaxInitialLineLengthBytes: 4096,
 *     indicesQueryBoolMaxClauseCount: 1024,
 *     searchMaxBuckets: 10000,
 *     indicesFielddataCacheSizePercentage: 3,
 *     indicesMemoryIndexBufferSizePercentage: 10,
 *     indicesMemoryMinIndexBufferSizeMb: 48,
 *     indicesMemoryMaxIndexBufferSizeMb: 3,
 *     indicesQueriesCacheSizePercentage: 10,
 *     indicesRecoveryMaxMbPerSec: 40,
 *     indicesRecoveryMaxConcurrentFileChunks: 2,
 *     actionAutoCreateIndexEnabled: true,
 *     actionDestructiveRequiresName: false,
 *     enableSecurityAudit: false,
 *     threadPoolSearchSize: 1,
 *     threadPoolSearchThrottledSize: 1,
 *     threadPoolSearchThrottledQueueSize: 10,
 *     threadPoolSearchQueueSize: 10,
 *     threadPoolGetSize: 1,
 *     threadPoolGetQueueSize: 10,
 *     threadPoolAnalyzeSize: 1,
 *     threadPoolAnalyzeQueueSize: 10,
 *     threadPoolWriteSize: 1,
 *     threadPoolWriteQueueSize: 10,
 *     threadPoolForceMergeSize: 1,
 *     overrideMainResponseVersion: false,
 *     scriptMaxCompilationsRate: "use-context",
 *     clusterMaxShardsPerNode: 100,
 *     clusterRoutingAllocationNodeConcurrentRecoveries: 2,
 *     pluginsAlertingFilterByBackendRolesEnabled: false,
 *     reindexRemoteWhitelists: ["cloud.digitalocean.com:8080"],
 * });
 * ```
 *
 * ## Import
 *
 * A Opensearch database cluster's configuration can be imported using the `id` the parent cluster, e.g.
 *
 * ```sh
 * $ pulumi import digitalocean:index/databaseOpensearchConfig:DatabaseOpensearchConfig example 4b62829a-9c42-465b-aaa3-84051048e712
 * ```
 */
export class DatabaseOpensearchConfig extends pulumi.CustomResource {
    /**
     * Get an existing DatabaseOpensearchConfig resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DatabaseOpensearchConfigState, opts?: pulumi.CustomResourceOptions): DatabaseOpensearchConfig {
        return new DatabaseOpensearchConfig(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'digitalocean:index/databaseOpensearchConfig:DatabaseOpensearchConfig';

    /**
     * Returns true if the given object is an instance of DatabaseOpensearchConfig.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DatabaseOpensearchConfig {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DatabaseOpensearchConfig.__pulumiType;
    }

    /**
     * Specifies whether ISM is enabled or not. Default: `true`
     */
    public readonly actionAutoCreateIndexEnabled!: pulumi.Output<boolean>;
    /**
     * Specifies whether to require explicit index names when deleting indices.
     */
    public readonly actionDestructiveRequiresName!: pulumi.Output<boolean>;
    /**
     * The ID of the target Opensearch cluster.
     */
    public readonly clusterId!: pulumi.Output<string>;
    /**
     * Maximum number of shards allowed per data node.
     */
    public readonly clusterMaxShardsPerNode!: pulumi.Output<number>;
    /**
     * Maximum concurrent incoming/outgoing shard recoveries (normally replicas) are allowed to happen per node. Default: `2`
     */
    public readonly clusterRoutingAllocationNodeConcurrentRecoveries!: pulumi.Output<number>;
    /**
     * Specifies whether to allow security audit logging. Default: `false`
     */
    public readonly enableSecurityAudit!: pulumi.Output<boolean>;
    /**
     * Maximum content length for HTTP requests to the OpenSearch HTTP API, in bytes. Default: `100000000`
     */
    public readonly httpMaxContentLengthBytes!: pulumi.Output<number>;
    /**
     * Maximum size of allowed headers, in bytes. Default: `8192`
     */
    public readonly httpMaxHeaderSizeBytes!: pulumi.Output<number>;
    /**
     * Maximum length of an HTTP URL, in bytes. Default: `4096`
     */
    public readonly httpMaxInitialLineLengthBytes!: pulumi.Output<number>;
    /**
     * Maximum amount of heap memory used for field data cache, expressed as a percentage. Decreasing the value too much will increase overhead of loading field data. Increasing the value too much will decrease amount of heap available for other operations.
     */
    public readonly indicesFielddataCacheSizePercentage!: pulumi.Output<number>;
    /**
     * Total amount of heap used for indexing buffer before writing segments to disk, expressed as a percentage. Too low value will slow down indexing; too high value will increase indexing performance but causes performance issues for query performance. Default: `10`
     */
    public readonly indicesMemoryIndexBufferSizePercentage!: pulumi.Output<number>;
    /**
     * Maximum amount of heap used for indexing buffer before writing segments to disk, in mb. Works in conjunction with indices_memory_index_buffer_size_percentage, each being enforced. The default is unbounded.
     */
    public readonly indicesMemoryMaxIndexBufferSizeMb!: pulumi.Output<number>;
    /**
     * Minimum amount of heap used for indexing buffer before writing segments to disk, in mb. Works in conjunction with indices_memory_index_buffer_size_percentage, each being enforced. Default: `48`
     */
    public readonly indicesMemoryMinIndexBufferSizeMb!: pulumi.Output<number>;
    /**
     * Maximum amount of heap used for query cache. Too low value will decrease query performance and increase performance for other operations; too high value will cause issues with other functionality. Default: `10`
     */
    public readonly indicesQueriesCacheSizePercentage!: pulumi.Output<number>;
    /**
     * Maximum number of clauses Lucene BooleanQuery can have. Only increase it if necessary, as it may cause performance issues. Default: `1024`
     */
    public readonly indicesQueryBoolMaxClauseCount!: pulumi.Output<number>;
    /**
     * Maximum number of file chunks sent in parallel for each recovery. Default: `2`
     */
    public readonly indicesRecoveryMaxConcurrentFileChunks!: pulumi.Output<number>;
    /**
     * Limits total inbound and outbound recovery traffic for each node, expressed in mb per second. Applies to both peer recoveries as well as snapshot recoveries (i.e., restores from a snapshot). Default: `40`
     */
    public readonly indicesRecoveryMaxMbPerSec!: pulumi.Output<number>;
    /**
     * Specifies whether ISM is enabled or not. Default: `true`
     */
    public readonly ismEnabled!: pulumi.Output<boolean>;
    /**
     * Specifies whether audit history is enabled or not. The logs from ISM are automatically indexed to a logs document. Default: `true`
     */
    public readonly ismHistoryEnabled!: pulumi.Output<boolean>;
    /**
     * Maximum age before rolling over the audit history index, in hours. Default: `24`
     */
    public readonly ismHistoryMaxAgeHours!: pulumi.Output<number>;
    /**
     * Maximum number of documents before rolling over the audit history index. Default: `2500000`
     */
    public readonly ismHistoryMaxDocs!: pulumi.Output<number>;
    /**
     * The time between rollover checks for the audit history index, in hours. Default: `8`
     */
    public readonly ismHistoryRolloverCheckPeriodHours!: pulumi.Output<number>;
    /**
     * Length of time long audit history indices are kept, in days. Default: `30`
     */
    public readonly ismHistoryRolloverRetentionPeriodDays!: pulumi.Output<number>;
    /**
     * Compatibility mode sets OpenSearch to report its version as 7.10 so clients continue to work. Default: `false`
     */
    public readonly overrideMainResponseVersion!: pulumi.Output<boolean>;
    /**
     * Enable or disable filtering of alerting by backend roles. Default: `false`
     */
    public readonly pluginsAlertingFilterByBackendRolesEnabled!: pulumi.Output<boolean>;
    /**
     * Allowlist of remote IP addresses for reindexing. Changing this value will cause all OpenSearch instances to restart.
     */
    public readonly reindexRemoteWhitelists!: pulumi.Output<string[] | undefined>;
    /**
     * Limits the number of inline script compilations within a period of time. Default is `use-context`
     */
    public readonly scriptMaxCompilationsRate!: pulumi.Output<string>;
    /**
     * Maximum number of aggregation buckets allowed in a single response. Default: `10000`
     */
    public readonly searchMaxBuckets!: pulumi.Output<number>;
    /**
     * Size of queue for operations in the analyze thread pool.
     */
    public readonly threadPoolAnalyzeQueueSize!: pulumi.Output<number>;
    /**
     * Number of workers in the analyze operation thread pool. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
     */
    public readonly threadPoolAnalyzeSize!: pulumi.Output<number>;
    /**
     * Number of workers in the force merge operation thread pool. This pool is used for forcing a merge between shards of one or more indices. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
     */
    public readonly threadPoolForceMergeSize!: pulumi.Output<number>;
    /**
     * Size of queue for operations in the get thread pool.
     */
    public readonly threadPoolGetQueueSize!: pulumi.Output<number>;
    /**
     * Number of workers in the get operation thread pool. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
     */
    public readonly threadPoolGetSize!: pulumi.Output<number>;
    /**
     * Size of queue for operations in the search thread pool.
     */
    public readonly threadPoolSearchQueueSize!: pulumi.Output<number>;
    /**
     * Number of workers in the search operation thread pool. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
     */
    public readonly threadPoolSearchSize!: pulumi.Output<number>;
    /**
     * Size of queue for operations in the search throttled thread pool.
     */
    public readonly threadPoolSearchThrottledQueueSize!: pulumi.Output<number>;
    /**
     * Number of workers in the search throttled operation thread pool. This pool is used for searching frozen indices. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
     */
    public readonly threadPoolSearchThrottledSize!: pulumi.Output<number>;
    /**
     * Size of queue for operations in the write thread pool.
     */
    public readonly threadPoolWriteQueueSize!: pulumi.Output<number>;
    /**
     * Number of workers in the write operation thread pool. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
     */
    public readonly threadPoolWriteSize!: pulumi.Output<number>;

    /**
     * Create a DatabaseOpensearchConfig resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DatabaseOpensearchConfigArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DatabaseOpensearchConfigArgs | DatabaseOpensearchConfigState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DatabaseOpensearchConfigState | undefined;
            resourceInputs["actionAutoCreateIndexEnabled"] = state ? state.actionAutoCreateIndexEnabled : undefined;
            resourceInputs["actionDestructiveRequiresName"] = state ? state.actionDestructiveRequiresName : undefined;
            resourceInputs["clusterId"] = state ? state.clusterId : undefined;
            resourceInputs["clusterMaxShardsPerNode"] = state ? state.clusterMaxShardsPerNode : undefined;
            resourceInputs["clusterRoutingAllocationNodeConcurrentRecoveries"] = state ? state.clusterRoutingAllocationNodeConcurrentRecoveries : undefined;
            resourceInputs["enableSecurityAudit"] = state ? state.enableSecurityAudit : undefined;
            resourceInputs["httpMaxContentLengthBytes"] = state ? state.httpMaxContentLengthBytes : undefined;
            resourceInputs["httpMaxHeaderSizeBytes"] = state ? state.httpMaxHeaderSizeBytes : undefined;
            resourceInputs["httpMaxInitialLineLengthBytes"] = state ? state.httpMaxInitialLineLengthBytes : undefined;
            resourceInputs["indicesFielddataCacheSizePercentage"] = state ? state.indicesFielddataCacheSizePercentage : undefined;
            resourceInputs["indicesMemoryIndexBufferSizePercentage"] = state ? state.indicesMemoryIndexBufferSizePercentage : undefined;
            resourceInputs["indicesMemoryMaxIndexBufferSizeMb"] = state ? state.indicesMemoryMaxIndexBufferSizeMb : undefined;
            resourceInputs["indicesMemoryMinIndexBufferSizeMb"] = state ? state.indicesMemoryMinIndexBufferSizeMb : undefined;
            resourceInputs["indicesQueriesCacheSizePercentage"] = state ? state.indicesQueriesCacheSizePercentage : undefined;
            resourceInputs["indicesQueryBoolMaxClauseCount"] = state ? state.indicesQueryBoolMaxClauseCount : undefined;
            resourceInputs["indicesRecoveryMaxConcurrentFileChunks"] = state ? state.indicesRecoveryMaxConcurrentFileChunks : undefined;
            resourceInputs["indicesRecoveryMaxMbPerSec"] = state ? state.indicesRecoveryMaxMbPerSec : undefined;
            resourceInputs["ismEnabled"] = state ? state.ismEnabled : undefined;
            resourceInputs["ismHistoryEnabled"] = state ? state.ismHistoryEnabled : undefined;
            resourceInputs["ismHistoryMaxAgeHours"] = state ? state.ismHistoryMaxAgeHours : undefined;
            resourceInputs["ismHistoryMaxDocs"] = state ? state.ismHistoryMaxDocs : undefined;
            resourceInputs["ismHistoryRolloverCheckPeriodHours"] = state ? state.ismHistoryRolloverCheckPeriodHours : undefined;
            resourceInputs["ismHistoryRolloverRetentionPeriodDays"] = state ? state.ismHistoryRolloverRetentionPeriodDays : undefined;
            resourceInputs["overrideMainResponseVersion"] = state ? state.overrideMainResponseVersion : undefined;
            resourceInputs["pluginsAlertingFilterByBackendRolesEnabled"] = state ? state.pluginsAlertingFilterByBackendRolesEnabled : undefined;
            resourceInputs["reindexRemoteWhitelists"] = state ? state.reindexRemoteWhitelists : undefined;
            resourceInputs["scriptMaxCompilationsRate"] = state ? state.scriptMaxCompilationsRate : undefined;
            resourceInputs["searchMaxBuckets"] = state ? state.searchMaxBuckets : undefined;
            resourceInputs["threadPoolAnalyzeQueueSize"] = state ? state.threadPoolAnalyzeQueueSize : undefined;
            resourceInputs["threadPoolAnalyzeSize"] = state ? state.threadPoolAnalyzeSize : undefined;
            resourceInputs["threadPoolForceMergeSize"] = state ? state.threadPoolForceMergeSize : undefined;
            resourceInputs["threadPoolGetQueueSize"] = state ? state.threadPoolGetQueueSize : undefined;
            resourceInputs["threadPoolGetSize"] = state ? state.threadPoolGetSize : undefined;
            resourceInputs["threadPoolSearchQueueSize"] = state ? state.threadPoolSearchQueueSize : undefined;
            resourceInputs["threadPoolSearchSize"] = state ? state.threadPoolSearchSize : undefined;
            resourceInputs["threadPoolSearchThrottledQueueSize"] = state ? state.threadPoolSearchThrottledQueueSize : undefined;
            resourceInputs["threadPoolSearchThrottledSize"] = state ? state.threadPoolSearchThrottledSize : undefined;
            resourceInputs["threadPoolWriteQueueSize"] = state ? state.threadPoolWriteQueueSize : undefined;
            resourceInputs["threadPoolWriteSize"] = state ? state.threadPoolWriteSize : undefined;
        } else {
            const args = argsOrState as DatabaseOpensearchConfigArgs | undefined;
            if ((!args || args.clusterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterId'");
            }
            resourceInputs["actionAutoCreateIndexEnabled"] = args ? args.actionAutoCreateIndexEnabled : undefined;
            resourceInputs["actionDestructiveRequiresName"] = args ? args.actionDestructiveRequiresName : undefined;
            resourceInputs["clusterId"] = args ? args.clusterId : undefined;
            resourceInputs["clusterMaxShardsPerNode"] = args ? args.clusterMaxShardsPerNode : undefined;
            resourceInputs["clusterRoutingAllocationNodeConcurrentRecoveries"] = args ? args.clusterRoutingAllocationNodeConcurrentRecoveries : undefined;
            resourceInputs["enableSecurityAudit"] = args ? args.enableSecurityAudit : undefined;
            resourceInputs["httpMaxContentLengthBytes"] = args ? args.httpMaxContentLengthBytes : undefined;
            resourceInputs["httpMaxHeaderSizeBytes"] = args ? args.httpMaxHeaderSizeBytes : undefined;
            resourceInputs["httpMaxInitialLineLengthBytes"] = args ? args.httpMaxInitialLineLengthBytes : undefined;
            resourceInputs["indicesFielddataCacheSizePercentage"] = args ? args.indicesFielddataCacheSizePercentage : undefined;
            resourceInputs["indicesMemoryIndexBufferSizePercentage"] = args ? args.indicesMemoryIndexBufferSizePercentage : undefined;
            resourceInputs["indicesMemoryMaxIndexBufferSizeMb"] = args ? args.indicesMemoryMaxIndexBufferSizeMb : undefined;
            resourceInputs["indicesMemoryMinIndexBufferSizeMb"] = args ? args.indicesMemoryMinIndexBufferSizeMb : undefined;
            resourceInputs["indicesQueriesCacheSizePercentage"] = args ? args.indicesQueriesCacheSizePercentage : undefined;
            resourceInputs["indicesQueryBoolMaxClauseCount"] = args ? args.indicesQueryBoolMaxClauseCount : undefined;
            resourceInputs["indicesRecoveryMaxConcurrentFileChunks"] = args ? args.indicesRecoveryMaxConcurrentFileChunks : undefined;
            resourceInputs["indicesRecoveryMaxMbPerSec"] = args ? args.indicesRecoveryMaxMbPerSec : undefined;
            resourceInputs["ismEnabled"] = args ? args.ismEnabled : undefined;
            resourceInputs["ismHistoryEnabled"] = args ? args.ismHistoryEnabled : undefined;
            resourceInputs["ismHistoryMaxAgeHours"] = args ? args.ismHistoryMaxAgeHours : undefined;
            resourceInputs["ismHistoryMaxDocs"] = args ? args.ismHistoryMaxDocs : undefined;
            resourceInputs["ismHistoryRolloverCheckPeriodHours"] = args ? args.ismHistoryRolloverCheckPeriodHours : undefined;
            resourceInputs["ismHistoryRolloverRetentionPeriodDays"] = args ? args.ismHistoryRolloverRetentionPeriodDays : undefined;
            resourceInputs["overrideMainResponseVersion"] = args ? args.overrideMainResponseVersion : undefined;
            resourceInputs["pluginsAlertingFilterByBackendRolesEnabled"] = args ? args.pluginsAlertingFilterByBackendRolesEnabled : undefined;
            resourceInputs["reindexRemoteWhitelists"] = args ? args.reindexRemoteWhitelists : undefined;
            resourceInputs["scriptMaxCompilationsRate"] = args ? args.scriptMaxCompilationsRate : undefined;
            resourceInputs["searchMaxBuckets"] = args ? args.searchMaxBuckets : undefined;
            resourceInputs["threadPoolAnalyzeQueueSize"] = args ? args.threadPoolAnalyzeQueueSize : undefined;
            resourceInputs["threadPoolAnalyzeSize"] = args ? args.threadPoolAnalyzeSize : undefined;
            resourceInputs["threadPoolForceMergeSize"] = args ? args.threadPoolForceMergeSize : undefined;
            resourceInputs["threadPoolGetQueueSize"] = args ? args.threadPoolGetQueueSize : undefined;
            resourceInputs["threadPoolGetSize"] = args ? args.threadPoolGetSize : undefined;
            resourceInputs["threadPoolSearchQueueSize"] = args ? args.threadPoolSearchQueueSize : undefined;
            resourceInputs["threadPoolSearchSize"] = args ? args.threadPoolSearchSize : undefined;
            resourceInputs["threadPoolSearchThrottledQueueSize"] = args ? args.threadPoolSearchThrottledQueueSize : undefined;
            resourceInputs["threadPoolSearchThrottledSize"] = args ? args.threadPoolSearchThrottledSize : undefined;
            resourceInputs["threadPoolWriteQueueSize"] = args ? args.threadPoolWriteQueueSize : undefined;
            resourceInputs["threadPoolWriteSize"] = args ? args.threadPoolWriteSize : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DatabaseOpensearchConfig.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DatabaseOpensearchConfig resources.
 */
export interface DatabaseOpensearchConfigState {
    /**
     * Specifies whether ISM is enabled or not. Default: `true`
     */
    actionAutoCreateIndexEnabled?: pulumi.Input<boolean>;
    /**
     * Specifies whether to require explicit index names when deleting indices.
     */
    actionDestructiveRequiresName?: pulumi.Input<boolean>;
    /**
     * The ID of the target Opensearch cluster.
     */
    clusterId?: pulumi.Input<string>;
    /**
     * Maximum number of shards allowed per data node.
     */
    clusterMaxShardsPerNode?: pulumi.Input<number>;
    /**
     * Maximum concurrent incoming/outgoing shard recoveries (normally replicas) are allowed to happen per node. Default: `2`
     */
    clusterRoutingAllocationNodeConcurrentRecoveries?: pulumi.Input<number>;
    /**
     * Specifies whether to allow security audit logging. Default: `false`
     */
    enableSecurityAudit?: pulumi.Input<boolean>;
    /**
     * Maximum content length for HTTP requests to the OpenSearch HTTP API, in bytes. Default: `100000000`
     */
    httpMaxContentLengthBytes?: pulumi.Input<number>;
    /**
     * Maximum size of allowed headers, in bytes. Default: `8192`
     */
    httpMaxHeaderSizeBytes?: pulumi.Input<number>;
    /**
     * Maximum length of an HTTP URL, in bytes. Default: `4096`
     */
    httpMaxInitialLineLengthBytes?: pulumi.Input<number>;
    /**
     * Maximum amount of heap memory used for field data cache, expressed as a percentage. Decreasing the value too much will increase overhead of loading field data. Increasing the value too much will decrease amount of heap available for other operations.
     */
    indicesFielddataCacheSizePercentage?: pulumi.Input<number>;
    /**
     * Total amount of heap used for indexing buffer before writing segments to disk, expressed as a percentage. Too low value will slow down indexing; too high value will increase indexing performance but causes performance issues for query performance. Default: `10`
     */
    indicesMemoryIndexBufferSizePercentage?: pulumi.Input<number>;
    /**
     * Maximum amount of heap used for indexing buffer before writing segments to disk, in mb. Works in conjunction with indices_memory_index_buffer_size_percentage, each being enforced. The default is unbounded.
     */
    indicesMemoryMaxIndexBufferSizeMb?: pulumi.Input<number>;
    /**
     * Minimum amount of heap used for indexing buffer before writing segments to disk, in mb. Works in conjunction with indices_memory_index_buffer_size_percentage, each being enforced. Default: `48`
     */
    indicesMemoryMinIndexBufferSizeMb?: pulumi.Input<number>;
    /**
     * Maximum amount of heap used for query cache. Too low value will decrease query performance and increase performance for other operations; too high value will cause issues with other functionality. Default: `10`
     */
    indicesQueriesCacheSizePercentage?: pulumi.Input<number>;
    /**
     * Maximum number of clauses Lucene BooleanQuery can have. Only increase it if necessary, as it may cause performance issues. Default: `1024`
     */
    indicesQueryBoolMaxClauseCount?: pulumi.Input<number>;
    /**
     * Maximum number of file chunks sent in parallel for each recovery. Default: `2`
     */
    indicesRecoveryMaxConcurrentFileChunks?: pulumi.Input<number>;
    /**
     * Limits total inbound and outbound recovery traffic for each node, expressed in mb per second. Applies to both peer recoveries as well as snapshot recoveries (i.e., restores from a snapshot). Default: `40`
     */
    indicesRecoveryMaxMbPerSec?: pulumi.Input<number>;
    /**
     * Specifies whether ISM is enabled or not. Default: `true`
     */
    ismEnabled?: pulumi.Input<boolean>;
    /**
     * Specifies whether audit history is enabled or not. The logs from ISM are automatically indexed to a logs document. Default: `true`
     */
    ismHistoryEnabled?: pulumi.Input<boolean>;
    /**
     * Maximum age before rolling over the audit history index, in hours. Default: `24`
     */
    ismHistoryMaxAgeHours?: pulumi.Input<number>;
    /**
     * Maximum number of documents before rolling over the audit history index. Default: `2500000`
     */
    ismHistoryMaxDocs?: pulumi.Input<number>;
    /**
     * The time between rollover checks for the audit history index, in hours. Default: `8`
     */
    ismHistoryRolloverCheckPeriodHours?: pulumi.Input<number>;
    /**
     * Length of time long audit history indices are kept, in days. Default: `30`
     */
    ismHistoryRolloverRetentionPeriodDays?: pulumi.Input<number>;
    /**
     * Compatibility mode sets OpenSearch to report its version as 7.10 so clients continue to work. Default: `false`
     */
    overrideMainResponseVersion?: pulumi.Input<boolean>;
    /**
     * Enable or disable filtering of alerting by backend roles. Default: `false`
     */
    pluginsAlertingFilterByBackendRolesEnabled?: pulumi.Input<boolean>;
    /**
     * Allowlist of remote IP addresses for reindexing. Changing this value will cause all OpenSearch instances to restart.
     */
    reindexRemoteWhitelists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Limits the number of inline script compilations within a period of time. Default is `use-context`
     */
    scriptMaxCompilationsRate?: pulumi.Input<string>;
    /**
     * Maximum number of aggregation buckets allowed in a single response. Default: `10000`
     */
    searchMaxBuckets?: pulumi.Input<number>;
    /**
     * Size of queue for operations in the analyze thread pool.
     */
    threadPoolAnalyzeQueueSize?: pulumi.Input<number>;
    /**
     * Number of workers in the analyze operation thread pool. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
     */
    threadPoolAnalyzeSize?: pulumi.Input<number>;
    /**
     * Number of workers in the force merge operation thread pool. This pool is used for forcing a merge between shards of one or more indices. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
     */
    threadPoolForceMergeSize?: pulumi.Input<number>;
    /**
     * Size of queue for operations in the get thread pool.
     */
    threadPoolGetQueueSize?: pulumi.Input<number>;
    /**
     * Number of workers in the get operation thread pool. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
     */
    threadPoolGetSize?: pulumi.Input<number>;
    /**
     * Size of queue for operations in the search thread pool.
     */
    threadPoolSearchQueueSize?: pulumi.Input<number>;
    /**
     * Number of workers in the search operation thread pool. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
     */
    threadPoolSearchSize?: pulumi.Input<number>;
    /**
     * Size of queue for operations in the search throttled thread pool.
     */
    threadPoolSearchThrottledQueueSize?: pulumi.Input<number>;
    /**
     * Number of workers in the search throttled operation thread pool. This pool is used for searching frozen indices. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
     */
    threadPoolSearchThrottledSize?: pulumi.Input<number>;
    /**
     * Size of queue for operations in the write thread pool.
     */
    threadPoolWriteQueueSize?: pulumi.Input<number>;
    /**
     * Number of workers in the write operation thread pool. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
     */
    threadPoolWriteSize?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a DatabaseOpensearchConfig resource.
 */
export interface DatabaseOpensearchConfigArgs {
    /**
     * Specifies whether ISM is enabled or not. Default: `true`
     */
    actionAutoCreateIndexEnabled?: pulumi.Input<boolean>;
    /**
     * Specifies whether to require explicit index names when deleting indices.
     */
    actionDestructiveRequiresName?: pulumi.Input<boolean>;
    /**
     * The ID of the target Opensearch cluster.
     */
    clusterId: pulumi.Input<string>;
    /**
     * Maximum number of shards allowed per data node.
     */
    clusterMaxShardsPerNode?: pulumi.Input<number>;
    /**
     * Maximum concurrent incoming/outgoing shard recoveries (normally replicas) are allowed to happen per node. Default: `2`
     */
    clusterRoutingAllocationNodeConcurrentRecoveries?: pulumi.Input<number>;
    /**
     * Specifies whether to allow security audit logging. Default: `false`
     */
    enableSecurityAudit?: pulumi.Input<boolean>;
    /**
     * Maximum content length for HTTP requests to the OpenSearch HTTP API, in bytes. Default: `100000000`
     */
    httpMaxContentLengthBytes?: pulumi.Input<number>;
    /**
     * Maximum size of allowed headers, in bytes. Default: `8192`
     */
    httpMaxHeaderSizeBytes?: pulumi.Input<number>;
    /**
     * Maximum length of an HTTP URL, in bytes. Default: `4096`
     */
    httpMaxInitialLineLengthBytes?: pulumi.Input<number>;
    /**
     * Maximum amount of heap memory used for field data cache, expressed as a percentage. Decreasing the value too much will increase overhead of loading field data. Increasing the value too much will decrease amount of heap available for other operations.
     */
    indicesFielddataCacheSizePercentage?: pulumi.Input<number>;
    /**
     * Total amount of heap used for indexing buffer before writing segments to disk, expressed as a percentage. Too low value will slow down indexing; too high value will increase indexing performance but causes performance issues for query performance. Default: `10`
     */
    indicesMemoryIndexBufferSizePercentage?: pulumi.Input<number>;
    /**
     * Maximum amount of heap used for indexing buffer before writing segments to disk, in mb. Works in conjunction with indices_memory_index_buffer_size_percentage, each being enforced. The default is unbounded.
     */
    indicesMemoryMaxIndexBufferSizeMb?: pulumi.Input<number>;
    /**
     * Minimum amount of heap used for indexing buffer before writing segments to disk, in mb. Works in conjunction with indices_memory_index_buffer_size_percentage, each being enforced. Default: `48`
     */
    indicesMemoryMinIndexBufferSizeMb?: pulumi.Input<number>;
    /**
     * Maximum amount of heap used for query cache. Too low value will decrease query performance and increase performance for other operations; too high value will cause issues with other functionality. Default: `10`
     */
    indicesQueriesCacheSizePercentage?: pulumi.Input<number>;
    /**
     * Maximum number of clauses Lucene BooleanQuery can have. Only increase it if necessary, as it may cause performance issues. Default: `1024`
     */
    indicesQueryBoolMaxClauseCount?: pulumi.Input<number>;
    /**
     * Maximum number of file chunks sent in parallel for each recovery. Default: `2`
     */
    indicesRecoveryMaxConcurrentFileChunks?: pulumi.Input<number>;
    /**
     * Limits total inbound and outbound recovery traffic for each node, expressed in mb per second. Applies to both peer recoveries as well as snapshot recoveries (i.e., restores from a snapshot). Default: `40`
     */
    indicesRecoveryMaxMbPerSec?: pulumi.Input<number>;
    /**
     * Specifies whether ISM is enabled or not. Default: `true`
     */
    ismEnabled?: pulumi.Input<boolean>;
    /**
     * Specifies whether audit history is enabled or not. The logs from ISM are automatically indexed to a logs document. Default: `true`
     */
    ismHistoryEnabled?: pulumi.Input<boolean>;
    /**
     * Maximum age before rolling over the audit history index, in hours. Default: `24`
     */
    ismHistoryMaxAgeHours?: pulumi.Input<number>;
    /**
     * Maximum number of documents before rolling over the audit history index. Default: `2500000`
     */
    ismHistoryMaxDocs?: pulumi.Input<number>;
    /**
     * The time between rollover checks for the audit history index, in hours. Default: `8`
     */
    ismHistoryRolloverCheckPeriodHours?: pulumi.Input<number>;
    /**
     * Length of time long audit history indices are kept, in days. Default: `30`
     */
    ismHistoryRolloverRetentionPeriodDays?: pulumi.Input<number>;
    /**
     * Compatibility mode sets OpenSearch to report its version as 7.10 so clients continue to work. Default: `false`
     */
    overrideMainResponseVersion?: pulumi.Input<boolean>;
    /**
     * Enable or disable filtering of alerting by backend roles. Default: `false`
     */
    pluginsAlertingFilterByBackendRolesEnabled?: pulumi.Input<boolean>;
    /**
     * Allowlist of remote IP addresses for reindexing. Changing this value will cause all OpenSearch instances to restart.
     */
    reindexRemoteWhitelists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Limits the number of inline script compilations within a period of time. Default is `use-context`
     */
    scriptMaxCompilationsRate?: pulumi.Input<string>;
    /**
     * Maximum number of aggregation buckets allowed in a single response. Default: `10000`
     */
    searchMaxBuckets?: pulumi.Input<number>;
    /**
     * Size of queue for operations in the analyze thread pool.
     */
    threadPoolAnalyzeQueueSize?: pulumi.Input<number>;
    /**
     * Number of workers in the analyze operation thread pool. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
     */
    threadPoolAnalyzeSize?: pulumi.Input<number>;
    /**
     * Number of workers in the force merge operation thread pool. This pool is used for forcing a merge between shards of one or more indices. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
     */
    threadPoolForceMergeSize?: pulumi.Input<number>;
    /**
     * Size of queue for operations in the get thread pool.
     */
    threadPoolGetQueueSize?: pulumi.Input<number>;
    /**
     * Number of workers in the get operation thread pool. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
     */
    threadPoolGetSize?: pulumi.Input<number>;
    /**
     * Size of queue for operations in the search thread pool.
     */
    threadPoolSearchQueueSize?: pulumi.Input<number>;
    /**
     * Number of workers in the search operation thread pool. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
     */
    threadPoolSearchSize?: pulumi.Input<number>;
    /**
     * Size of queue for operations in the search throttled thread pool.
     */
    threadPoolSearchThrottledQueueSize?: pulumi.Input<number>;
    /**
     * Number of workers in the search throttled operation thread pool. This pool is used for searching frozen indices. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
     */
    threadPoolSearchThrottledSize?: pulumi.Input<number>;
    /**
     * Size of queue for operations in the write thread pool.
     */
    threadPoolWriteQueueSize?: pulumi.Input<number>;
    /**
     * Number of workers in the write operation thread pool. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
     */
    threadPoolWriteSize?: pulumi.Input<number>;
}
