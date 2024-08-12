// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.digitalocean.DatabaseKafkaTopicArgs;
import com.pulumi.digitalocean.Utilities;
import com.pulumi.digitalocean.inputs.DatabaseKafkaTopicState;
import com.pulumi.digitalocean.outputs.DatabaseKafkaTopicConfig;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a DigitalOcean Kafka topic for Kafka clusters.
 * 
 * ## Example Usage
 * 
 * ### Create a new Kafka topic
 * &lt;!--Start PulumiCodeChooser --&gt;
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Topics can be imported using the `id` of the source cluster and the `name` of the topic joined with a comma. For example:
 * 
 * ```sh
 * $ pulumi import digitalocean:index/databaseKafkaTopic:DatabaseKafkaTopic topic-01 245bcfd0-7f31-4ce6-a2bc-475a116cca97,topic-01
 * ```
 * 
 */
@ResourceType(type="digitalocean:index/databaseKafkaTopic:DatabaseKafkaTopic")
public class DatabaseKafkaTopic extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the source database cluster. Note: This must be a Kafka cluster.
     * 
     */
    @Export(name="clusterId", refs={String.class}, tree="[0]")
    private Output<String> clusterId;

    /**
     * @return The ID of the source database cluster. Note: This must be a Kafka cluster.
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }
    /**
     * A set of advanced configuration parameters. Defaults will be set for any of the parameters that are not included.
     * The `config` block is documented below.
     * 
     */
    @Export(name="configs", refs={List.class,DatabaseKafkaTopicConfig.class}, tree="[0,1]")
    private Output<List<DatabaseKafkaTopicConfig>> configs;

    /**
     * @return A set of advanced configuration parameters. Defaults will be set for any of the parameters that are not included.
     * The `config` block is documented below.
     * 
     */
    public Output<List<DatabaseKafkaTopicConfig>> configs() {
        return this.configs;
    }
    /**
     * The name for the topic.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name for the topic.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The number of partitions for the topic. Default and minimum set at 3, maximum is 2048.
     * 
     */
    @Export(name="partitionCount", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> partitionCount;

    /**
     * @return The number of partitions for the topic. Default and minimum set at 3, maximum is 2048.
     * 
     */
    public Output<Optional<Integer>> partitionCount() {
        return Codegen.optional(this.partitionCount);
    }
    /**
     * The number of nodes that topics are replicated across. Default and minimum set at 2, maximum is the number of nodes in the cluster.
     * 
     */
    @Export(name="replicationFactor", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> replicationFactor;

    /**
     * @return The number of nodes that topics are replicated across. Default and minimum set at 2, maximum is the number of nodes in the cluster.
     * 
     */
    public Output<Optional<Integer>> replicationFactor() {
        return Codegen.optional(this.replicationFactor);
    }
    /**
     * The current status of the topic. Possible values are &#39;active&#39;, &#39;configuring&#39;, and &#39;deleting&#39;.
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return The current status of the topic. Possible values are &#39;active&#39;, &#39;configuring&#39;, and &#39;deleting&#39;.
     * 
     */
    public Output<String> state() {
        return this.state;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DatabaseKafkaTopic(java.lang.String name) {
        this(name, DatabaseKafkaTopicArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DatabaseKafkaTopic(java.lang.String name, DatabaseKafkaTopicArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DatabaseKafkaTopic(java.lang.String name, DatabaseKafkaTopicArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/databaseKafkaTopic:DatabaseKafkaTopic", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private DatabaseKafkaTopic(java.lang.String name, Output<java.lang.String> id, @Nullable DatabaseKafkaTopicState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/databaseKafkaTopic:DatabaseKafkaTopic", name, state, makeResourceOptions(options, id), false);
    }

    private static DatabaseKafkaTopicArgs makeArgs(DatabaseKafkaTopicArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? DatabaseKafkaTopicArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static DatabaseKafkaTopic get(java.lang.String name, Output<java.lang.String> id, @Nullable DatabaseKafkaTopicState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DatabaseKafkaTopic(name, id, state, options);
    }
}
