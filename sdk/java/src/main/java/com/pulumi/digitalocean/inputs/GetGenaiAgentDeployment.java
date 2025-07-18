// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGenaiAgentDeployment extends com.pulumi.resources.InvokeArgs {

    public static final GetGenaiAgentDeployment Empty = new GetGenaiAgentDeployment();

    /**
     * API Key value
     * 
     */
    @Import(name="createdAt", required=true)
    private String createdAt;

    /**
     * @return API Key value
     * 
     */
    public String createdAt() {
        return this.createdAt;
    }

    /**
     * Name of the API Key
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Name of the API Key
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Status of the Deployment
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return Status of the Deployment
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Updated At timestamp for the Agent
     * 
     */
    @Import(name="updatedAt", required=true)
    private String updatedAt;

    /**
     * @return Updated At timestamp for the Agent
     * 
     */
    public String updatedAt() {
        return this.updatedAt;
    }

    /**
     * Url of the Deployment
     * 
     */
    @Import(name="url")
    private @Nullable String url;

    /**
     * @return Url of the Deployment
     * 
     */
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }

    /**
     * API Key value
     * 
     */
    @Import(name="uuid")
    private @Nullable String uuid;

    /**
     * @return API Key value
     * 
     */
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    /**
     * Visibility of the Deployment
     * 
     */
    @Import(name="visibility")
    private @Nullable String visibility;

    /**
     * @return Visibility of the Deployment
     * 
     */
    public Optional<String> visibility() {
        return Optional.ofNullable(this.visibility);
    }

    private GetGenaiAgentDeployment() {}

    private GetGenaiAgentDeployment(GetGenaiAgentDeployment $) {
        this.createdAt = $.createdAt;
        this.name = $.name;
        this.status = $.status;
        this.updatedAt = $.updatedAt;
        this.url = $.url;
        this.uuid = $.uuid;
        this.visibility = $.visibility;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGenaiAgentDeployment defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGenaiAgentDeployment $;

        public Builder() {
            $ = new GetGenaiAgentDeployment();
        }

        public Builder(GetGenaiAgentDeployment defaults) {
            $ = new GetGenaiAgentDeployment(Objects.requireNonNull(defaults));
        }

        /**
         * @param createdAt API Key value
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param name Name of the API Key
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param status Status of the Deployment
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        /**
         * @param updatedAt Updated At timestamp for the Agent
         * 
         * @return builder
         * 
         */
        public Builder updatedAt(String updatedAt) {
            $.updatedAt = updatedAt;
            return this;
        }

        /**
         * @param url Url of the Deployment
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable String url) {
            $.url = url;
            return this;
        }

        /**
         * @param uuid API Key value
         * 
         * @return builder
         * 
         */
        public Builder uuid(@Nullable String uuid) {
            $.uuid = uuid;
            return this;
        }

        /**
         * @param visibility Visibility of the Deployment
         * 
         * @return builder
         * 
         */
        public Builder visibility(@Nullable String visibility) {
            $.visibility = visibility;
            return this;
        }

        public GetGenaiAgentDeployment build() {
            if ($.createdAt == null) {
                throw new MissingRequiredPropertyException("GetGenaiAgentDeployment", "createdAt");
            }
            if ($.updatedAt == null) {
                throw new MissingRequiredPropertyException("GetGenaiAgentDeployment", "updatedAt");
            }
            return $;
        }
    }

}
