// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGenaiAgentModelAgreementArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetGenaiAgentModelAgreementArgs Empty = new GetGenaiAgentModelAgreementArgs();

    /**
     * Description of the agreement
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the agreement
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Name of the agreement
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the agreement
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * URL of the agreement
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return URL of the agreement
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    /**
     * UUID of the agreement
     * 
     */
    @Import(name="uuid")
    private @Nullable Output<String> uuid;

    /**
     * @return UUID of the agreement
     * 
     */
    public Optional<Output<String>> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private GetGenaiAgentModelAgreementArgs() {}

    private GetGenaiAgentModelAgreementArgs(GetGenaiAgentModelAgreementArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.url = $.url;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGenaiAgentModelAgreementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGenaiAgentModelAgreementArgs $;

        public Builder() {
            $ = new GetGenaiAgentModelAgreementArgs();
        }

        public Builder(GetGenaiAgentModelAgreementArgs defaults) {
            $ = new GetGenaiAgentModelAgreementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description of the agreement
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the agreement
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name Name of the agreement
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the agreement
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param url URL of the agreement
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url URL of the agreement
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        /**
         * @param uuid UUID of the agreement
         * 
         * @return builder
         * 
         */
        public Builder uuid(@Nullable Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        /**
         * @param uuid UUID of the agreement
         * 
         * @return builder
         * 
         */
        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public GetGenaiAgentModelAgreementArgs build() {
            return $;
        }
    }

}
