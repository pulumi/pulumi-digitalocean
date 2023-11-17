// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppSpecIngressRuleComponentArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppSpecIngressRuleComponentArgs Empty = new AppSpecIngressRuleComponentArgs();

    /**
     * The name of the component.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the component.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * An optional boolean flag to preserve the path that is forwarded to the backend service. By default, the HTTP request path will be trimmed from the left when forwarded to the component.
     * 
     */
    @Import(name="preservePathPrefix")
    private @Nullable Output<Boolean> preservePathPrefix;

    /**
     * @return An optional boolean flag to preserve the path that is forwarded to the backend service. By default, the HTTP request path will be trimmed from the left when forwarded to the component.
     * 
     */
    public Optional<Output<Boolean>> preservePathPrefix() {
        return Optional.ofNullable(this.preservePathPrefix);
    }

    /**
     * An optional field that will rewrite the path of the component to be what is specified here. This is mutually exclusive with `preserve_path_prefix`.
     * 
     */
    @Import(name="rewrite")
    private @Nullable Output<String> rewrite;

    /**
     * @return An optional field that will rewrite the path of the component to be what is specified here. This is mutually exclusive with `preserve_path_prefix`.
     * 
     */
    public Optional<Output<String>> rewrite() {
        return Optional.ofNullable(this.rewrite);
    }

    private AppSpecIngressRuleComponentArgs() {}

    private AppSpecIngressRuleComponentArgs(AppSpecIngressRuleComponentArgs $) {
        this.name = $.name;
        this.preservePathPrefix = $.preservePathPrefix;
        this.rewrite = $.rewrite;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppSpecIngressRuleComponentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppSpecIngressRuleComponentArgs $;

        public Builder() {
            $ = new AppSpecIngressRuleComponentArgs();
        }

        public Builder(AppSpecIngressRuleComponentArgs defaults) {
            $ = new AppSpecIngressRuleComponentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the component.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the component.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param preservePathPrefix An optional boolean flag to preserve the path that is forwarded to the backend service. By default, the HTTP request path will be trimmed from the left when forwarded to the component.
         * 
         * @return builder
         * 
         */
        public Builder preservePathPrefix(@Nullable Output<Boolean> preservePathPrefix) {
            $.preservePathPrefix = preservePathPrefix;
            return this;
        }

        /**
         * @param preservePathPrefix An optional boolean flag to preserve the path that is forwarded to the backend service. By default, the HTTP request path will be trimmed from the left when forwarded to the component.
         * 
         * @return builder
         * 
         */
        public Builder preservePathPrefix(Boolean preservePathPrefix) {
            return preservePathPrefix(Output.of(preservePathPrefix));
        }

        /**
         * @param rewrite An optional field that will rewrite the path of the component to be what is specified here. This is mutually exclusive with `preserve_path_prefix`.
         * 
         * @return builder
         * 
         */
        public Builder rewrite(@Nullable Output<String> rewrite) {
            $.rewrite = rewrite;
            return this;
        }

        /**
         * @param rewrite An optional field that will rewrite the path of the component to be what is specified here. This is mutually exclusive with `preserve_path_prefix`.
         * 
         * @return builder
         * 
         */
        public Builder rewrite(String rewrite) {
            return rewrite(Output.of(rewrite));
        }

        public AppSpecIngressRuleComponentArgs build() {
            return $;
        }
    }

}
