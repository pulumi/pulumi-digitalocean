// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSshKeysFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetSshKeysFilterArgs Empty = new GetSshKeysFilterArgs();

    @Import(name="all")
    private @Nullable Output<Boolean> all;

    public Optional<Output<Boolean>> all() {
        return Optional.ofNullable(this.all);
    }

    /**
     * Filter the SSH Keys by this key. This may be one of `name`, `public_key`, or `fingerprint`.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return Filter the SSH Keys by this key. This may be one of `name`, `public_key`, or `fingerprint`.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    @Import(name="matchBy")
    private @Nullable Output<String> matchBy;

    public Optional<Output<String>> matchBy() {
        return Optional.ofNullable(this.matchBy);
    }

    /**
     * A list of values to match against the key field. Only retrieves SSH keys where the key field matches one or more of the values provided here.
     * 
     */
    @Import(name="values", required=true)
    private Output<List<String>> values;

    /**
     * @return A list of values to match against the key field. Only retrieves SSH keys where the key field matches one or more of the values provided here.
     * 
     */
    public Output<List<String>> values() {
        return this.values;
    }

    private GetSshKeysFilterArgs() {}

    private GetSshKeysFilterArgs(GetSshKeysFilterArgs $) {
        this.all = $.all;
        this.key = $.key;
        this.matchBy = $.matchBy;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSshKeysFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSshKeysFilterArgs $;

        public Builder() {
            $ = new GetSshKeysFilterArgs();
        }

        public Builder(GetSshKeysFilterArgs defaults) {
            $ = new GetSshKeysFilterArgs(Objects.requireNonNull(defaults));
        }

        public Builder all(@Nullable Output<Boolean> all) {
            $.all = all;
            return this;
        }

        public Builder all(Boolean all) {
            return all(Output.of(all));
        }

        /**
         * @param key Filter the SSH Keys by this key. This may be one of `name`, `public_key`, or `fingerprint`.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Filter the SSH Keys by this key. This may be one of `name`, `public_key`, or `fingerprint`.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder matchBy(@Nullable Output<String> matchBy) {
            $.matchBy = matchBy;
            return this;
        }

        public Builder matchBy(String matchBy) {
            return matchBy(Output.of(matchBy));
        }

        /**
         * @param values A list of values to match against the key field. Only retrieves SSH keys where the key field matches one or more of the values provided here.
         * 
         * @return builder
         * 
         */
        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values A list of values to match against the key field. Only retrieves SSH keys where the key field matches one or more of the values provided here.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values A list of values to match against the key field. Only retrieves SSH keys where the key field matches one or more of the values provided here.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public GetSshKeysFilterArgs build() {
            if ($.key == null) {
                throw new MissingRequiredPropertyException("GetSshKeysFilterArgs", "key");
            }
            if ($.values == null) {
                throw new MissingRequiredPropertyException("GetSshKeysFilterArgs", "values");
            }
            return $;
        }
    }

}
