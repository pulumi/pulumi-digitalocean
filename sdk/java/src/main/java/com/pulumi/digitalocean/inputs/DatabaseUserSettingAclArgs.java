// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabaseUserSettingAclArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseUserSettingAclArgs Empty = new DatabaseUserSettingAclArgs();

    /**
     * An identifier for the ACL, this will be automatically assigned when you create an ACL entry
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return An identifier for the ACL, this will be automatically assigned when you create an ACL entry
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The permission level applied to the ACL. This includes &#34;admin&#34;, &#34;consume&#34;, &#34;produce&#34;, and &#34;produceconsume&#34;. &#34;admin&#34; allows for producing and consuming as well as add/delete/update permission for topics. &#34;consume&#34; allows only for reading topic messages. &#34;produce&#34; allows only for writing topic messages. &#34;produceconsume&#34; allows for both reading and writing topic messages.
     * 
     */
    @Import(name="permission", required=true)
    private Output<String> permission;

    /**
     * @return The permission level applied to the ACL. This includes &#34;admin&#34;, &#34;consume&#34;, &#34;produce&#34;, and &#34;produceconsume&#34;. &#34;admin&#34; allows for producing and consuming as well as add/delete/update permission for topics. &#34;consume&#34; allows only for reading topic messages. &#34;produce&#34; allows only for writing topic messages. &#34;produceconsume&#34; allows for both reading and writing topic messages.
     * 
     */
    public Output<String> permission() {
        return this.permission;
    }

    /**
     * A regex for matching the topic(s) that this ACL should apply to.
     * 
     */
    @Import(name="topic", required=true)
    private Output<String> topic;

    /**
     * @return A regex for matching the topic(s) that this ACL should apply to.
     * 
     */
    public Output<String> topic() {
        return this.topic;
    }

    private DatabaseUserSettingAclArgs() {}

    private DatabaseUserSettingAclArgs(DatabaseUserSettingAclArgs $) {
        this.id = $.id;
        this.permission = $.permission;
        this.topic = $.topic;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseUserSettingAclArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseUserSettingAclArgs $;

        public Builder() {
            $ = new DatabaseUserSettingAclArgs();
        }

        public Builder(DatabaseUserSettingAclArgs defaults) {
            $ = new DatabaseUserSettingAclArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id An identifier for the ACL, this will be automatically assigned when you create an ACL entry
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id An identifier for the ACL, this will be automatically assigned when you create an ACL entry
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param permission The permission level applied to the ACL. This includes &#34;admin&#34;, &#34;consume&#34;, &#34;produce&#34;, and &#34;produceconsume&#34;. &#34;admin&#34; allows for producing and consuming as well as add/delete/update permission for topics. &#34;consume&#34; allows only for reading topic messages. &#34;produce&#34; allows only for writing topic messages. &#34;produceconsume&#34; allows for both reading and writing topic messages.
         * 
         * @return builder
         * 
         */
        public Builder permission(Output<String> permission) {
            $.permission = permission;
            return this;
        }

        /**
         * @param permission The permission level applied to the ACL. This includes &#34;admin&#34;, &#34;consume&#34;, &#34;produce&#34;, and &#34;produceconsume&#34;. &#34;admin&#34; allows for producing and consuming as well as add/delete/update permission for topics. &#34;consume&#34; allows only for reading topic messages. &#34;produce&#34; allows only for writing topic messages. &#34;produceconsume&#34; allows for both reading and writing topic messages.
         * 
         * @return builder
         * 
         */
        public Builder permission(String permission) {
            return permission(Output.of(permission));
        }

        /**
         * @param topic A regex for matching the topic(s) that this ACL should apply to.
         * 
         * @return builder
         * 
         */
        public Builder topic(Output<String> topic) {
            $.topic = topic;
            return this;
        }

        /**
         * @param topic A regex for matching the topic(s) that this ACL should apply to.
         * 
         * @return builder
         * 
         */
        public Builder topic(String topic) {
            return topic(Output.of(topic));
        }

        public DatabaseUserSettingAclArgs build() {
            $.permission = Objects.requireNonNull($.permission, "expected parameter 'permission' to be non-null");
            $.topic = Objects.requireNonNull($.topic, "expected parameter 'topic' to be non-null");
            return $;
        }
    }

}
