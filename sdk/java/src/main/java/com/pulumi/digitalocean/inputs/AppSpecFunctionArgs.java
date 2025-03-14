// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.digitalocean.inputs.AppSpecFunctionAlertArgs;
import com.pulumi.digitalocean.inputs.AppSpecFunctionBitbucketArgs;
import com.pulumi.digitalocean.inputs.AppSpecFunctionCorsArgs;
import com.pulumi.digitalocean.inputs.AppSpecFunctionEnvArgs;
import com.pulumi.digitalocean.inputs.AppSpecFunctionGitArgs;
import com.pulumi.digitalocean.inputs.AppSpecFunctionGithubArgs;
import com.pulumi.digitalocean.inputs.AppSpecFunctionGitlabArgs;
import com.pulumi.digitalocean.inputs.AppSpecFunctionLogDestinationArgs;
import com.pulumi.digitalocean.inputs.AppSpecFunctionRouteArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppSpecFunctionArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppSpecFunctionArgs Empty = new AppSpecFunctionArgs();

    /**
     * Describes an alert policy for the component.
     * 
     */
    @Import(name="alerts")
    private @Nullable Output<List<AppSpecFunctionAlertArgs>> alerts;

    /**
     * @return Describes an alert policy for the component.
     * 
     */
    public Optional<Output<List<AppSpecFunctionAlertArgs>>> alerts() {
        return Optional.ofNullable(this.alerts);
    }

    /**
     * A GitHub repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/bitbucket/install). Only one of `git`, `github`, `bitbucket`, `gitlab`, or `image` may be set.
     * 
     */
    @Import(name="bitbucket")
    private @Nullable Output<AppSpecFunctionBitbucketArgs> bitbucket;

    /**
     * @return A GitHub repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/bitbucket/install). Only one of `git`, `github`, `bitbucket`, `gitlab`, or `image` may be set.
     * 
     */
    public Optional<Output<AppSpecFunctionBitbucketArgs>> bitbucket() {
        return Optional.ofNullable(this.bitbucket);
    }

    /**
     * The [CORS](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS) policies of the app.
     * 
     * @deprecated
     * Service level CORS rules are deprecated in favor of ingresses
     * 
     */
    @Deprecated /* Service level CORS rules are deprecated in favor of ingresses */
    @Import(name="cors")
    private @Nullable Output<AppSpecFunctionCorsArgs> cors;

    /**
     * @return The [CORS](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS) policies of the app.
     * 
     * @deprecated
     * Service level CORS rules are deprecated in favor of ingresses
     * 
     */
    @Deprecated /* Service level CORS rules are deprecated in favor of ingresses */
    public Optional<Output<AppSpecFunctionCorsArgs>> cors() {
        return Optional.ofNullable(this.cors);
    }

    /**
     * Describes an environment variable made available to an app competent.
     * 
     */
    @Import(name="envs")
    private @Nullable Output<List<AppSpecFunctionEnvArgs>> envs;

    /**
     * @return Describes an environment variable made available to an app competent.
     * 
     */
    public Optional<Output<List<AppSpecFunctionEnvArgs>>> envs() {
        return Optional.ofNullable(this.envs);
    }

    /**
     * A Git repo to use as the component&#39;s source. The repository must be able to be cloned without authentication. Only one of `git`, `github` or `gitlab` may be set.
     * 
     */
    @Import(name="git")
    private @Nullable Output<AppSpecFunctionGitArgs> git;

    /**
     * @return A Git repo to use as the component&#39;s source. The repository must be able to be cloned without authentication. Only one of `git`, `github` or `gitlab` may be set.
     * 
     */
    public Optional<Output<AppSpecFunctionGitArgs>> git() {
        return Optional.ofNullable(this.git);
    }

    /**
     * A GitHub repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/github/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    @Import(name="github")
    private @Nullable Output<AppSpecFunctionGithubArgs> github;

    /**
     * @return A GitHub repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/github/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    public Optional<Output<AppSpecFunctionGithubArgs>> github() {
        return Optional.ofNullable(this.github);
    }

    /**
     * A Gitlab repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/gitlab/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    @Import(name="gitlab")
    private @Nullable Output<AppSpecFunctionGitlabArgs> gitlab;

    /**
     * @return A Gitlab repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/gitlab/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    public Optional<Output<AppSpecFunctionGitlabArgs>> gitlab() {
        return Optional.ofNullable(this.gitlab);
    }

    /**
     * Describes a log forwarding destination.
     * 
     */
    @Import(name="logDestinations")
    private @Nullable Output<List<AppSpecFunctionLogDestinationArgs>> logDestinations;

    /**
     * @return Describes a log forwarding destination.
     * 
     */
    public Optional<Output<List<AppSpecFunctionLogDestinationArgs>>> logDestinations() {
        return Optional.ofNullable(this.logDestinations);
    }

    /**
     * The name of the component.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the component.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * An HTTP paths that should be routed to this component.
     * 
     * @deprecated
     * Service level routes are deprecated in favor of ingresses
     * 
     */
    @Deprecated /* Service level routes are deprecated in favor of ingresses */
    @Import(name="routes")
    private @Nullable Output<List<AppSpecFunctionRouteArgs>> routes;

    /**
     * @return An HTTP paths that should be routed to this component.
     * 
     * @deprecated
     * Service level routes are deprecated in favor of ingresses
     * 
     */
    @Deprecated /* Service level routes are deprecated in favor of ingresses */
    public Optional<Output<List<AppSpecFunctionRouteArgs>>> routes() {
        return Optional.ofNullable(this.routes);
    }

    /**
     * An optional path to the working directory to use for the build.
     * 
     */
    @Import(name="sourceDir")
    private @Nullable Output<String> sourceDir;

    /**
     * @return An optional path to the working directory to use for the build.
     * 
     */
    public Optional<Output<String>> sourceDir() {
        return Optional.ofNullable(this.sourceDir);
    }

    private AppSpecFunctionArgs() {}

    private AppSpecFunctionArgs(AppSpecFunctionArgs $) {
        this.alerts = $.alerts;
        this.bitbucket = $.bitbucket;
        this.cors = $.cors;
        this.envs = $.envs;
        this.git = $.git;
        this.github = $.github;
        this.gitlab = $.gitlab;
        this.logDestinations = $.logDestinations;
        this.name = $.name;
        this.routes = $.routes;
        this.sourceDir = $.sourceDir;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppSpecFunctionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppSpecFunctionArgs $;

        public Builder() {
            $ = new AppSpecFunctionArgs();
        }

        public Builder(AppSpecFunctionArgs defaults) {
            $ = new AppSpecFunctionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alerts Describes an alert policy for the component.
         * 
         * @return builder
         * 
         */
        public Builder alerts(@Nullable Output<List<AppSpecFunctionAlertArgs>> alerts) {
            $.alerts = alerts;
            return this;
        }

        /**
         * @param alerts Describes an alert policy for the component.
         * 
         * @return builder
         * 
         */
        public Builder alerts(List<AppSpecFunctionAlertArgs> alerts) {
            return alerts(Output.of(alerts));
        }

        /**
         * @param alerts Describes an alert policy for the component.
         * 
         * @return builder
         * 
         */
        public Builder alerts(AppSpecFunctionAlertArgs... alerts) {
            return alerts(List.of(alerts));
        }

        /**
         * @param bitbucket A GitHub repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/bitbucket/install). Only one of `git`, `github`, `bitbucket`, `gitlab`, or `image` may be set.
         * 
         * @return builder
         * 
         */
        public Builder bitbucket(@Nullable Output<AppSpecFunctionBitbucketArgs> bitbucket) {
            $.bitbucket = bitbucket;
            return this;
        }

        /**
         * @param bitbucket A GitHub repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/bitbucket/install). Only one of `git`, `github`, `bitbucket`, `gitlab`, or `image` may be set.
         * 
         * @return builder
         * 
         */
        public Builder bitbucket(AppSpecFunctionBitbucketArgs bitbucket) {
            return bitbucket(Output.of(bitbucket));
        }

        /**
         * @param cors The [CORS](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS) policies of the app.
         * 
         * @return builder
         * 
         * @deprecated
         * Service level CORS rules are deprecated in favor of ingresses
         * 
         */
        @Deprecated /* Service level CORS rules are deprecated in favor of ingresses */
        public Builder cors(@Nullable Output<AppSpecFunctionCorsArgs> cors) {
            $.cors = cors;
            return this;
        }

        /**
         * @param cors The [CORS](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS) policies of the app.
         * 
         * @return builder
         * 
         * @deprecated
         * Service level CORS rules are deprecated in favor of ingresses
         * 
         */
        @Deprecated /* Service level CORS rules are deprecated in favor of ingresses */
        public Builder cors(AppSpecFunctionCorsArgs cors) {
            return cors(Output.of(cors));
        }

        /**
         * @param envs Describes an environment variable made available to an app competent.
         * 
         * @return builder
         * 
         */
        public Builder envs(@Nullable Output<List<AppSpecFunctionEnvArgs>> envs) {
            $.envs = envs;
            return this;
        }

        /**
         * @param envs Describes an environment variable made available to an app competent.
         * 
         * @return builder
         * 
         */
        public Builder envs(List<AppSpecFunctionEnvArgs> envs) {
            return envs(Output.of(envs));
        }

        /**
         * @param envs Describes an environment variable made available to an app competent.
         * 
         * @return builder
         * 
         */
        public Builder envs(AppSpecFunctionEnvArgs... envs) {
            return envs(List.of(envs));
        }

        /**
         * @param git A Git repo to use as the component&#39;s source. The repository must be able to be cloned without authentication. Only one of `git`, `github` or `gitlab` may be set.
         * 
         * @return builder
         * 
         */
        public Builder git(@Nullable Output<AppSpecFunctionGitArgs> git) {
            $.git = git;
            return this;
        }

        /**
         * @param git A Git repo to use as the component&#39;s source. The repository must be able to be cloned without authentication. Only one of `git`, `github` or `gitlab` may be set.
         * 
         * @return builder
         * 
         */
        public Builder git(AppSpecFunctionGitArgs git) {
            return git(Output.of(git));
        }

        /**
         * @param github A GitHub repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/github/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
         * 
         * @return builder
         * 
         */
        public Builder github(@Nullable Output<AppSpecFunctionGithubArgs> github) {
            $.github = github;
            return this;
        }

        /**
         * @param github A GitHub repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/github/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
         * 
         * @return builder
         * 
         */
        public Builder github(AppSpecFunctionGithubArgs github) {
            return github(Output.of(github));
        }

        /**
         * @param gitlab A Gitlab repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/gitlab/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
         * 
         * @return builder
         * 
         */
        public Builder gitlab(@Nullable Output<AppSpecFunctionGitlabArgs> gitlab) {
            $.gitlab = gitlab;
            return this;
        }

        /**
         * @param gitlab A Gitlab repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/gitlab/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
         * 
         * @return builder
         * 
         */
        public Builder gitlab(AppSpecFunctionGitlabArgs gitlab) {
            return gitlab(Output.of(gitlab));
        }

        /**
         * @param logDestinations Describes a log forwarding destination.
         * 
         * @return builder
         * 
         */
        public Builder logDestinations(@Nullable Output<List<AppSpecFunctionLogDestinationArgs>> logDestinations) {
            $.logDestinations = logDestinations;
            return this;
        }

        /**
         * @param logDestinations Describes a log forwarding destination.
         * 
         * @return builder
         * 
         */
        public Builder logDestinations(List<AppSpecFunctionLogDestinationArgs> logDestinations) {
            return logDestinations(Output.of(logDestinations));
        }

        /**
         * @param logDestinations Describes a log forwarding destination.
         * 
         * @return builder
         * 
         */
        public Builder logDestinations(AppSpecFunctionLogDestinationArgs... logDestinations) {
            return logDestinations(List.of(logDestinations));
        }

        /**
         * @param name The name of the component.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
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
         * @param routes An HTTP paths that should be routed to this component.
         * 
         * @return builder
         * 
         * @deprecated
         * Service level routes are deprecated in favor of ingresses
         * 
         */
        @Deprecated /* Service level routes are deprecated in favor of ingresses */
        public Builder routes(@Nullable Output<List<AppSpecFunctionRouteArgs>> routes) {
            $.routes = routes;
            return this;
        }

        /**
         * @param routes An HTTP paths that should be routed to this component.
         * 
         * @return builder
         * 
         * @deprecated
         * Service level routes are deprecated in favor of ingresses
         * 
         */
        @Deprecated /* Service level routes are deprecated in favor of ingresses */
        public Builder routes(List<AppSpecFunctionRouteArgs> routes) {
            return routes(Output.of(routes));
        }

        /**
         * @param routes An HTTP paths that should be routed to this component.
         * 
         * @return builder
         * 
         * @deprecated
         * Service level routes are deprecated in favor of ingresses
         * 
         */
        @Deprecated /* Service level routes are deprecated in favor of ingresses */
        public Builder routes(AppSpecFunctionRouteArgs... routes) {
            return routes(List.of(routes));
        }

        /**
         * @param sourceDir An optional path to the working directory to use for the build.
         * 
         * @return builder
         * 
         */
        public Builder sourceDir(@Nullable Output<String> sourceDir) {
            $.sourceDir = sourceDir;
            return this;
        }

        /**
         * @param sourceDir An optional path to the working directory to use for the build.
         * 
         * @return builder
         * 
         */
        public Builder sourceDir(String sourceDir) {
            return sourceDir(Output.of(sourceDir));
        }

        public AppSpecFunctionArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("AppSpecFunctionArgs", "name");
            }
            return $;
        }
    }

}
