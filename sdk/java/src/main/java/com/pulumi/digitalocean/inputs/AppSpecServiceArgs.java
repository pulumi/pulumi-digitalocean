// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.digitalocean.inputs.AppSpecServiceAlertArgs;
import com.pulumi.digitalocean.inputs.AppSpecServiceCorsArgs;
import com.pulumi.digitalocean.inputs.AppSpecServiceEnvArgs;
import com.pulumi.digitalocean.inputs.AppSpecServiceGitArgs;
import com.pulumi.digitalocean.inputs.AppSpecServiceGithubArgs;
import com.pulumi.digitalocean.inputs.AppSpecServiceGitlabArgs;
import com.pulumi.digitalocean.inputs.AppSpecServiceHealthCheckArgs;
import com.pulumi.digitalocean.inputs.AppSpecServiceImageArgs;
import com.pulumi.digitalocean.inputs.AppSpecServiceLogDestinationArgs;
import com.pulumi.digitalocean.inputs.AppSpecServiceRouteArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppSpecServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppSpecServiceArgs Empty = new AppSpecServiceArgs();

    /**
     * Describes an alert policy for the component.
     * 
     */
    @Import(name="alerts")
    private @Nullable Output<List<AppSpecServiceAlertArgs>> alerts;

    /**
     * @return Describes an alert policy for the component.
     * 
     */
    public Optional<Output<List<AppSpecServiceAlertArgs>>> alerts() {
        return Optional.ofNullable(this.alerts);
    }

    /**
     * An optional build command to run while building this component from source.
     * 
     */
    @Import(name="buildCommand")
    private @Nullable Output<String> buildCommand;

    /**
     * @return An optional build command to run while building this component from source.
     * 
     */
    public Optional<Output<String>> buildCommand() {
        return Optional.ofNullable(this.buildCommand);
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
    private @Nullable Output<AppSpecServiceCorsArgs> cors;

    /**
     * @return The [CORS](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS) policies of the app.
     * 
     * @deprecated
     * Service level CORS rules are deprecated in favor of ingresses
     * 
     */
    @Deprecated /* Service level CORS rules are deprecated in favor of ingresses */
    public Optional<Output<AppSpecServiceCorsArgs>> cors() {
        return Optional.ofNullable(this.cors);
    }

    /**
     * The path to a Dockerfile relative to the root of the repo. If set, overrides usage of buildpacks.
     * 
     */
    @Import(name="dockerfilePath")
    private @Nullable Output<String> dockerfilePath;

    /**
     * @return The path to a Dockerfile relative to the root of the repo. If set, overrides usage of buildpacks.
     * 
     */
    public Optional<Output<String>> dockerfilePath() {
        return Optional.ofNullable(this.dockerfilePath);
    }

    /**
     * An environment slug describing the type of this app.
     * 
     */
    @Import(name="environmentSlug")
    private @Nullable Output<String> environmentSlug;

    /**
     * @return An environment slug describing the type of this app.
     * 
     */
    public Optional<Output<String>> environmentSlug() {
        return Optional.ofNullable(this.environmentSlug);
    }

    /**
     * Describes an environment variable made available to an app competent.
     * 
     */
    @Import(name="envs")
    private @Nullable Output<List<AppSpecServiceEnvArgs>> envs;

    /**
     * @return Describes an environment variable made available to an app competent.
     * 
     */
    public Optional<Output<List<AppSpecServiceEnvArgs>>> envs() {
        return Optional.ofNullable(this.envs);
    }

    /**
     * A Git repo to use as the component&#39;s source. The repository must be able to be cloned without authentication.  Only one of `git`, `github` or `gitlab`  may be set.
     * 
     */
    @Import(name="git")
    private @Nullable Output<AppSpecServiceGitArgs> git;

    /**
     * @return A Git repo to use as the component&#39;s source. The repository must be able to be cloned without authentication.  Only one of `git`, `github` or `gitlab`  may be set.
     * 
     */
    public Optional<Output<AppSpecServiceGitArgs>> git() {
        return Optional.ofNullable(this.git);
    }

    /**
     * A GitHub repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/github/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    @Import(name="github")
    private @Nullable Output<AppSpecServiceGithubArgs> github;

    /**
     * @return A GitHub repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/github/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    public Optional<Output<AppSpecServiceGithubArgs>> github() {
        return Optional.ofNullable(this.github);
    }

    /**
     * A Gitlab repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/gitlab/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    @Import(name="gitlab")
    private @Nullable Output<AppSpecServiceGitlabArgs> gitlab;

    /**
     * @return A Gitlab repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/gitlab/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    public Optional<Output<AppSpecServiceGitlabArgs>> gitlab() {
        return Optional.ofNullable(this.gitlab);
    }

    /**
     * A health check to determine the availability of this component.
     * 
     */
    @Import(name="healthCheck")
    private @Nullable Output<AppSpecServiceHealthCheckArgs> healthCheck;

    /**
     * @return A health check to determine the availability of this component.
     * 
     */
    public Optional<Output<AppSpecServiceHealthCheckArgs>> healthCheck() {
        return Optional.ofNullable(this.healthCheck);
    }

    /**
     * The internal port on which this service&#39;s run command will listen.
     * 
     */
    @Import(name="httpPort")
    private @Nullable Output<Integer> httpPort;

    /**
     * @return The internal port on which this service&#39;s run command will listen.
     * 
     */
    public Optional<Output<Integer>> httpPort() {
        return Optional.ofNullable(this.httpPort);
    }

    /**
     * An image to use as the component&#39;s source. Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    @Import(name="image")
    private @Nullable Output<AppSpecServiceImageArgs> image;

    /**
     * @return An image to use as the component&#39;s source. Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    public Optional<Output<AppSpecServiceImageArgs>> image() {
        return Optional.ofNullable(this.image);
    }

    /**
     * The amount of instances that this component should be scaled to.
     * 
     */
    @Import(name="instanceCount")
    private @Nullable Output<Integer> instanceCount;

    /**
     * @return The amount of instances that this component should be scaled to.
     * 
     */
    public Optional<Output<Integer>> instanceCount() {
        return Optional.ofNullable(this.instanceCount);
    }

    /**
     * The instance size to use for this component. This determines the plan (basic or professional) and the available CPU and memory. The list of available instance sizes can be [found with the API](https://docs.digitalocean.com/reference/api/api-reference/#operation/list_instance_sizes) or using the [doctl CLI](https://docs.digitalocean.com/reference/doctl/) (`doctl apps tier instance-size list`). Default: `basic-xxs`
     * 
     */
    @Import(name="instanceSizeSlug")
    private @Nullable Output<String> instanceSizeSlug;

    /**
     * @return The instance size to use for this component. This determines the plan (basic or professional) and the available CPU and memory. The list of available instance sizes can be [found with the API](https://docs.digitalocean.com/reference/api/api-reference/#operation/list_instance_sizes) or using the [doctl CLI](https://docs.digitalocean.com/reference/doctl/) (`doctl apps tier instance-size list`). Default: `basic-xxs`
     * 
     */
    public Optional<Output<String>> instanceSizeSlug() {
        return Optional.ofNullable(this.instanceSizeSlug);
    }

    /**
     * A list of ports on which this service will listen for internal traffic.
     * 
     */
    @Import(name="internalPorts")
    private @Nullable Output<List<Integer>> internalPorts;

    /**
     * @return A list of ports on which this service will listen for internal traffic.
     * 
     */
    public Optional<Output<List<Integer>>> internalPorts() {
        return Optional.ofNullable(this.internalPorts);
    }

    /**
     * Describes a log forwarding destination.
     * 
     */
    @Import(name="logDestinations")
    private @Nullable Output<List<AppSpecServiceLogDestinationArgs>> logDestinations;

    /**
     * @return Describes a log forwarding destination.
     * 
     */
    public Optional<Output<List<AppSpecServiceLogDestinationArgs>>> logDestinations() {
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
    private @Nullable Output<List<AppSpecServiceRouteArgs>> routes;

    /**
     * @return An HTTP paths that should be routed to this component.
     * 
     * @deprecated
     * Service level routes are deprecated in favor of ingresses
     * 
     */
    @Deprecated /* Service level routes are deprecated in favor of ingresses */
    public Optional<Output<List<AppSpecServiceRouteArgs>>> routes() {
        return Optional.ofNullable(this.routes);
    }

    /**
     * An optional run command to override the component&#39;s default.
     * 
     */
    @Import(name="runCommand")
    private @Nullable Output<String> runCommand;

    /**
     * @return An optional run command to override the component&#39;s default.
     * 
     */
    public Optional<Output<String>> runCommand() {
        return Optional.ofNullable(this.runCommand);
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

    private AppSpecServiceArgs() {}

    private AppSpecServiceArgs(AppSpecServiceArgs $) {
        this.alerts = $.alerts;
        this.buildCommand = $.buildCommand;
        this.cors = $.cors;
        this.dockerfilePath = $.dockerfilePath;
        this.environmentSlug = $.environmentSlug;
        this.envs = $.envs;
        this.git = $.git;
        this.github = $.github;
        this.gitlab = $.gitlab;
        this.healthCheck = $.healthCheck;
        this.httpPort = $.httpPort;
        this.image = $.image;
        this.instanceCount = $.instanceCount;
        this.instanceSizeSlug = $.instanceSizeSlug;
        this.internalPorts = $.internalPorts;
        this.logDestinations = $.logDestinations;
        this.name = $.name;
        this.routes = $.routes;
        this.runCommand = $.runCommand;
        this.sourceDir = $.sourceDir;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppSpecServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppSpecServiceArgs $;

        public Builder() {
            $ = new AppSpecServiceArgs();
        }

        public Builder(AppSpecServiceArgs defaults) {
            $ = new AppSpecServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alerts Describes an alert policy for the component.
         * 
         * @return builder
         * 
         */
        public Builder alerts(@Nullable Output<List<AppSpecServiceAlertArgs>> alerts) {
            $.alerts = alerts;
            return this;
        }

        /**
         * @param alerts Describes an alert policy for the component.
         * 
         * @return builder
         * 
         */
        public Builder alerts(List<AppSpecServiceAlertArgs> alerts) {
            return alerts(Output.of(alerts));
        }

        /**
         * @param alerts Describes an alert policy for the component.
         * 
         * @return builder
         * 
         */
        public Builder alerts(AppSpecServiceAlertArgs... alerts) {
            return alerts(List.of(alerts));
        }

        /**
         * @param buildCommand An optional build command to run while building this component from source.
         * 
         * @return builder
         * 
         */
        public Builder buildCommand(@Nullable Output<String> buildCommand) {
            $.buildCommand = buildCommand;
            return this;
        }

        /**
         * @param buildCommand An optional build command to run while building this component from source.
         * 
         * @return builder
         * 
         */
        public Builder buildCommand(String buildCommand) {
            return buildCommand(Output.of(buildCommand));
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
        public Builder cors(@Nullable Output<AppSpecServiceCorsArgs> cors) {
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
        public Builder cors(AppSpecServiceCorsArgs cors) {
            return cors(Output.of(cors));
        }

        /**
         * @param dockerfilePath The path to a Dockerfile relative to the root of the repo. If set, overrides usage of buildpacks.
         * 
         * @return builder
         * 
         */
        public Builder dockerfilePath(@Nullable Output<String> dockerfilePath) {
            $.dockerfilePath = dockerfilePath;
            return this;
        }

        /**
         * @param dockerfilePath The path to a Dockerfile relative to the root of the repo. If set, overrides usage of buildpacks.
         * 
         * @return builder
         * 
         */
        public Builder dockerfilePath(String dockerfilePath) {
            return dockerfilePath(Output.of(dockerfilePath));
        }

        /**
         * @param environmentSlug An environment slug describing the type of this app.
         * 
         * @return builder
         * 
         */
        public Builder environmentSlug(@Nullable Output<String> environmentSlug) {
            $.environmentSlug = environmentSlug;
            return this;
        }

        /**
         * @param environmentSlug An environment slug describing the type of this app.
         * 
         * @return builder
         * 
         */
        public Builder environmentSlug(String environmentSlug) {
            return environmentSlug(Output.of(environmentSlug));
        }

        /**
         * @param envs Describes an environment variable made available to an app competent.
         * 
         * @return builder
         * 
         */
        public Builder envs(@Nullable Output<List<AppSpecServiceEnvArgs>> envs) {
            $.envs = envs;
            return this;
        }

        /**
         * @param envs Describes an environment variable made available to an app competent.
         * 
         * @return builder
         * 
         */
        public Builder envs(List<AppSpecServiceEnvArgs> envs) {
            return envs(Output.of(envs));
        }

        /**
         * @param envs Describes an environment variable made available to an app competent.
         * 
         * @return builder
         * 
         */
        public Builder envs(AppSpecServiceEnvArgs... envs) {
            return envs(List.of(envs));
        }

        /**
         * @param git A Git repo to use as the component&#39;s source. The repository must be able to be cloned without authentication.  Only one of `git`, `github` or `gitlab`  may be set.
         * 
         * @return builder
         * 
         */
        public Builder git(@Nullable Output<AppSpecServiceGitArgs> git) {
            $.git = git;
            return this;
        }

        /**
         * @param git A Git repo to use as the component&#39;s source. The repository must be able to be cloned without authentication.  Only one of `git`, `github` or `gitlab`  may be set.
         * 
         * @return builder
         * 
         */
        public Builder git(AppSpecServiceGitArgs git) {
            return git(Output.of(git));
        }

        /**
         * @param github A GitHub repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/github/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
         * 
         * @return builder
         * 
         */
        public Builder github(@Nullable Output<AppSpecServiceGithubArgs> github) {
            $.github = github;
            return this;
        }

        /**
         * @param github A GitHub repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/github/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
         * 
         * @return builder
         * 
         */
        public Builder github(AppSpecServiceGithubArgs github) {
            return github(Output.of(github));
        }

        /**
         * @param gitlab A Gitlab repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/gitlab/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
         * 
         * @return builder
         * 
         */
        public Builder gitlab(@Nullable Output<AppSpecServiceGitlabArgs> gitlab) {
            $.gitlab = gitlab;
            return this;
        }

        /**
         * @param gitlab A Gitlab repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/gitlab/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
         * 
         * @return builder
         * 
         */
        public Builder gitlab(AppSpecServiceGitlabArgs gitlab) {
            return gitlab(Output.of(gitlab));
        }

        /**
         * @param healthCheck A health check to determine the availability of this component.
         * 
         * @return builder
         * 
         */
        public Builder healthCheck(@Nullable Output<AppSpecServiceHealthCheckArgs> healthCheck) {
            $.healthCheck = healthCheck;
            return this;
        }

        /**
         * @param healthCheck A health check to determine the availability of this component.
         * 
         * @return builder
         * 
         */
        public Builder healthCheck(AppSpecServiceHealthCheckArgs healthCheck) {
            return healthCheck(Output.of(healthCheck));
        }

        /**
         * @param httpPort The internal port on which this service&#39;s run command will listen.
         * 
         * @return builder
         * 
         */
        public Builder httpPort(@Nullable Output<Integer> httpPort) {
            $.httpPort = httpPort;
            return this;
        }

        /**
         * @param httpPort The internal port on which this service&#39;s run command will listen.
         * 
         * @return builder
         * 
         */
        public Builder httpPort(Integer httpPort) {
            return httpPort(Output.of(httpPort));
        }

        /**
         * @param image An image to use as the component&#39;s source. Only one of `git`, `github`, `gitlab`, or `image` may be set.
         * 
         * @return builder
         * 
         */
        public Builder image(@Nullable Output<AppSpecServiceImageArgs> image) {
            $.image = image;
            return this;
        }

        /**
         * @param image An image to use as the component&#39;s source. Only one of `git`, `github`, `gitlab`, or `image` may be set.
         * 
         * @return builder
         * 
         */
        public Builder image(AppSpecServiceImageArgs image) {
            return image(Output.of(image));
        }

        /**
         * @param instanceCount The amount of instances that this component should be scaled to.
         * 
         * @return builder
         * 
         */
        public Builder instanceCount(@Nullable Output<Integer> instanceCount) {
            $.instanceCount = instanceCount;
            return this;
        }

        /**
         * @param instanceCount The amount of instances that this component should be scaled to.
         * 
         * @return builder
         * 
         */
        public Builder instanceCount(Integer instanceCount) {
            return instanceCount(Output.of(instanceCount));
        }

        /**
         * @param instanceSizeSlug The instance size to use for this component. This determines the plan (basic or professional) and the available CPU and memory. The list of available instance sizes can be [found with the API](https://docs.digitalocean.com/reference/api/api-reference/#operation/list_instance_sizes) or using the [doctl CLI](https://docs.digitalocean.com/reference/doctl/) (`doctl apps tier instance-size list`). Default: `basic-xxs`
         * 
         * @return builder
         * 
         */
        public Builder instanceSizeSlug(@Nullable Output<String> instanceSizeSlug) {
            $.instanceSizeSlug = instanceSizeSlug;
            return this;
        }

        /**
         * @param instanceSizeSlug The instance size to use for this component. This determines the plan (basic or professional) and the available CPU and memory. The list of available instance sizes can be [found with the API](https://docs.digitalocean.com/reference/api/api-reference/#operation/list_instance_sizes) or using the [doctl CLI](https://docs.digitalocean.com/reference/doctl/) (`doctl apps tier instance-size list`). Default: `basic-xxs`
         * 
         * @return builder
         * 
         */
        public Builder instanceSizeSlug(String instanceSizeSlug) {
            return instanceSizeSlug(Output.of(instanceSizeSlug));
        }

        /**
         * @param internalPorts A list of ports on which this service will listen for internal traffic.
         * 
         * @return builder
         * 
         */
        public Builder internalPorts(@Nullable Output<List<Integer>> internalPorts) {
            $.internalPorts = internalPorts;
            return this;
        }

        /**
         * @param internalPorts A list of ports on which this service will listen for internal traffic.
         * 
         * @return builder
         * 
         */
        public Builder internalPorts(List<Integer> internalPorts) {
            return internalPorts(Output.of(internalPorts));
        }

        /**
         * @param internalPorts A list of ports on which this service will listen for internal traffic.
         * 
         * @return builder
         * 
         */
        public Builder internalPorts(Integer... internalPorts) {
            return internalPorts(List.of(internalPorts));
        }

        /**
         * @param logDestinations Describes a log forwarding destination.
         * 
         * @return builder
         * 
         */
        public Builder logDestinations(@Nullable Output<List<AppSpecServiceLogDestinationArgs>> logDestinations) {
            $.logDestinations = logDestinations;
            return this;
        }

        /**
         * @param logDestinations Describes a log forwarding destination.
         * 
         * @return builder
         * 
         */
        public Builder logDestinations(List<AppSpecServiceLogDestinationArgs> logDestinations) {
            return logDestinations(Output.of(logDestinations));
        }

        /**
         * @param logDestinations Describes a log forwarding destination.
         * 
         * @return builder
         * 
         */
        public Builder logDestinations(AppSpecServiceLogDestinationArgs... logDestinations) {
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
        public Builder routes(@Nullable Output<List<AppSpecServiceRouteArgs>> routes) {
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
        public Builder routes(List<AppSpecServiceRouteArgs> routes) {
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
        public Builder routes(AppSpecServiceRouteArgs... routes) {
            return routes(List.of(routes));
        }

        /**
         * @param runCommand An optional run command to override the component&#39;s default.
         * 
         * @return builder
         * 
         */
        public Builder runCommand(@Nullable Output<String> runCommand) {
            $.runCommand = runCommand;
            return this;
        }

        /**
         * @param runCommand An optional run command to override the component&#39;s default.
         * 
         * @return builder
         * 
         */
        public Builder runCommand(String runCommand) {
            return runCommand(Output.of(runCommand));
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

        public AppSpecServiceArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
