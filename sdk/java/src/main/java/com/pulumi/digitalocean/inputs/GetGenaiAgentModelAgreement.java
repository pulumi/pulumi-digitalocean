// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGenaiAgentModelAgreement extends com.pulumi.resources.InvokeArgs {

    public static final GetGenaiAgentModelAgreement Empty = new GetGenaiAgentModelAgreement();

    /**
     * Description of the agreement
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    /**
     * @return Description of the agreement
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Name of the agreement
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Name of the agreement
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * URL of the agreement
     * 
     */
    @Import(name="url")
    private @Nullable String url;

    /**
     * @return URL of the agreement
     * 
     */
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }

    /**
     * UUID of the agreement
     * 
     */
    @Import(name="uuid")
    private @Nullable String uuid;

    /**
     * @return UUID of the agreement
     * 
     */
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private GetGenaiAgentModelAgreement() {}

    private GetGenaiAgentModelAgreement(GetGenaiAgentModelAgreement $) {
        this.description = $.description;
        this.name = $.name;
        this.url = $.url;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGenaiAgentModelAgreement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGenaiAgentModelAgreement $;

        public Builder() {
            $ = new GetGenaiAgentModelAgreement();
        }

        public Builder(GetGenaiAgentModelAgreement defaults) {
            $ = new GetGenaiAgentModelAgreement(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description of the agreement
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        /**
         * @param name Name of the agreement
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param url URL of the agreement
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable String url) {
            $.url = url;
            return this;
        }

        /**
         * @param uuid UUID of the agreement
         * 
         * @return builder
         * 
         */
        public Builder uuid(@Nullable String uuid) {
            $.uuid = uuid;
            return this;
        }

        public GetGenaiAgentModelAgreement build() {
            return $;
        }
    }

}
