// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KubernetesClusterNodePoolNodeArgs extends com.pulumi.resources.ResourceArgs {

    public static final KubernetesClusterNodePoolNodeArgs Empty = new KubernetesClusterNodePoolNodeArgs();

    /**
     * The date and time when the node was created.
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    /**
     * @return The date and time when the node was created.
     * 
     */
    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * The id of the node&#39;s droplet
     * 
     */
    @Import(name="dropletId")
    private @Nullable Output<String> dropletId;

    /**
     * @return The id of the node&#39;s droplet
     * 
     */
    public Optional<Output<String>> dropletId() {
        return Optional.ofNullable(this.dropletId);
    }

    /**
     * A unique ID that can be used to identify and reference the node.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return A unique ID that can be used to identify and reference the node.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * A name for the Kubernetes cluster.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A name for the Kubernetes cluster.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A string indicating the current status of the individual node.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return A string indicating the current status of the individual node.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The date and time when the node was last updated.
     * 
     */
    @Import(name="updatedAt")
    private @Nullable Output<String> updatedAt;

    /**
     * @return The date and time when the node was last updated.
     * 
     */
    public Optional<Output<String>> updatedAt() {
        return Optional.ofNullable(this.updatedAt);
    }

    private KubernetesClusterNodePoolNodeArgs() {}

    private KubernetesClusterNodePoolNodeArgs(KubernetesClusterNodePoolNodeArgs $) {
        this.createdAt = $.createdAt;
        this.dropletId = $.dropletId;
        this.id = $.id;
        this.name = $.name;
        this.status = $.status;
        this.updatedAt = $.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KubernetesClusterNodePoolNodeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubernetesClusterNodePoolNodeArgs $;

        public Builder() {
            $ = new KubernetesClusterNodePoolNodeArgs();
        }

        public Builder(KubernetesClusterNodePoolNodeArgs defaults) {
            $ = new KubernetesClusterNodePoolNodeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param createdAt The date and time when the node was created.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt The date and time when the node was created.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param dropletId The id of the node&#39;s droplet
         * 
         * @return builder
         * 
         */
        public Builder dropletId(@Nullable Output<String> dropletId) {
            $.dropletId = dropletId;
            return this;
        }

        /**
         * @param dropletId The id of the node&#39;s droplet
         * 
         * @return builder
         * 
         */
        public Builder dropletId(String dropletId) {
            return dropletId(Output.of(dropletId));
        }

        /**
         * @param id A unique ID that can be used to identify and reference the node.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id A unique ID that can be used to identify and reference the node.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name A name for the Kubernetes cluster.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A name for the Kubernetes cluster.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param status A string indicating the current status of the individual node.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status A string indicating the current status of the individual node.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param updatedAt The date and time when the node was last updated.
         * 
         * @return builder
         * 
         */
        public Builder updatedAt(@Nullable Output<String> updatedAt) {
            $.updatedAt = updatedAt;
            return this;
        }

        /**
         * @param updatedAt The date and time when the node was last updated.
         * 
         * @return builder
         * 
         */
        public Builder updatedAt(String updatedAt) {
            return updatedAt(Output.of(updatedAt));
        }

        public KubernetesClusterNodePoolNodeArgs build() {
            return $;
        }
    }

}
