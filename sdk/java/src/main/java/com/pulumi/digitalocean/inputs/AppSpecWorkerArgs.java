// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.digitalocean.inputs.AppSpecWorkerAlertArgs;
import com.pulumi.digitalocean.inputs.AppSpecWorkerEnvArgs;
import com.pulumi.digitalocean.inputs.AppSpecWorkerGitArgs;
import com.pulumi.digitalocean.inputs.AppSpecWorkerGithubArgs;
import com.pulumi.digitalocean.inputs.AppSpecWorkerGitlabArgs;
import com.pulumi.digitalocean.inputs.AppSpecWorkerImageArgs;
import com.pulumi.digitalocean.inputs.AppSpecWorkerLogDestinationArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppSpecWorkerArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppSpecWorkerArgs Empty = new AppSpecWorkerArgs();

    /**
     * Describes an alert policy for the component.
     * 
     */
    @Import(name="alerts")
    private @Nullable Output<List<AppSpecWorkerAlertArgs>> alerts;

    /**
     * @return Describes an alert policy for the component.
     * 
     */
    public Optional<Output<List<AppSpecWorkerAlertArgs>>> alerts() {
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
    private @Nullable Output<List<AppSpecWorkerEnvArgs>> envs;

    /**
     * @return Describes an environment variable made available to an app competent.
     * 
     */
    public Optional<Output<List<AppSpecWorkerEnvArgs>>> envs() {
        return Optional.ofNullable(this.envs);
    }

    /**
     * A Git repo to use as the component&#39;s source. The repository must be able to be cloned without authentication.  Only one of `git`, `github` or `gitlab`  may be set.
     * 
     */
    @Import(name="git")
    private @Nullable Output<AppSpecWorkerGitArgs> git;

    /**
     * @return A Git repo to use as the component&#39;s source. The repository must be able to be cloned without authentication.  Only one of `git`, `github` or `gitlab`  may be set.
     * 
     */
    public Optional<Output<AppSpecWorkerGitArgs>> git() {
        return Optional.ofNullable(this.git);
    }

    /**
     * A GitHub repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/github/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    @Import(name="github")
    private @Nullable Output<AppSpecWorkerGithubArgs> github;

    /**
     * @return A GitHub repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/github/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    public Optional<Output<AppSpecWorkerGithubArgs>> github() {
        return Optional.ofNullable(this.github);
    }

    /**
     * A Gitlab repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/gitlab/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    @Import(name="gitlab")
    private @Nullable Output<AppSpecWorkerGitlabArgs> gitlab;

    /**
     * @return A Gitlab repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/gitlab/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    public Optional<Output<AppSpecWorkerGitlabArgs>> gitlab() {
        return Optional.ofNullable(this.gitlab);
    }

    /**
     * An image to use as the component&#39;s source. Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    @Import(name="image")
    private @Nullable Output<AppSpecWorkerImageArgs> image;

    /**
     * @return An image to use as the component&#39;s source. Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    public Optional<Output<AppSpecWorkerImageArgs>> image() {
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
     * Describes a log forwarding destination.
     * 
     */
    @Import(name="logDestinations")
    private @Nullable Output<List<AppSpecWorkerLogDestinationArgs>> logDestinations;

    /**
     * @return Describes a log forwarding destination.
     * 
     */
    public Optional<Output<List<AppSpecWorkerLogDestinationArgs>>> logDestinations() {
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

    private AppSpecWorkerArgs() {}

    private AppSpecWorkerArgs(AppSpecWorkerArgs $) {
        this.alerts = $.alerts;
        this.buildCommand = $.buildCommand;
        this.dockerfilePath = $.dockerfilePath;
        this.environmentSlug = $.environmentSlug;
        this.envs = $.envs;
        this.git = $.git;
        this.github = $.github;
        this.gitlab = $.gitlab;
        this.image = $.image;
        this.instanceCount = $.instanceCount;
        this.instanceSizeSlug = $.instanceSizeSlug;
        this.logDestinations = $.logDestinations;
        this.name = $.name;
        this.runCommand = $.runCommand;
        this.sourceDir = $.sourceDir;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppSpecWorkerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppSpecWorkerArgs $;

        public Builder() {
            $ = new AppSpecWorkerArgs();
        }

        public Builder(AppSpecWorkerArgs defaults) {
            $ = new AppSpecWorkerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alerts Describes an alert policy for the component.
         * 
         * @return builder
         * 
         */
        public Builder alerts(@Nullable Output<List<AppSpecWorkerAlertArgs>> alerts) {
            $.alerts = alerts;
            return this;
        }

        /**
         * @param alerts Describes an alert policy for the component.
         * 
         * @return builder
         * 
         */
        public Builder alerts(List<AppSpecWorkerAlertArgs> alerts) {
            return alerts(Output.of(alerts));
        }

        /**
         * @param alerts Describes an alert policy for the component.
         * 
         * @return builder
         * 
         */
        public Builder alerts(AppSpecWorkerAlertArgs... alerts) {
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
        public Builder envs(@Nullable Output<List<AppSpecWorkerEnvArgs>> envs) {
            $.envs = envs;
            return this;
        }

        /**
         * @param envs Describes an environment variable made available to an app competent.
         * 
         * @return builder
         * 
         */
        public Builder envs(List<AppSpecWorkerEnvArgs> envs) {
            return envs(Output.of(envs));
        }

        /**
         * @param envs Describes an environment variable made available to an app competent.
         * 
         * @return builder
         * 
         */
        public Builder envs(AppSpecWorkerEnvArgs... envs) {
            return envs(List.of(envs));
        }

        /**
         * @param git A Git repo to use as the component&#39;s source. The repository must be able to be cloned without authentication.  Only one of `git`, `github` or `gitlab`  may be set.
         * 
         * @return builder
         * 
         */
        public Builder git(@Nullable Output<AppSpecWorkerGitArgs> git) {
            $.git = git;
            return this;
        }

        /**
         * @param git A Git repo to use as the component&#39;s source. The repository must be able to be cloned without authentication.  Only one of `git`, `github` or `gitlab`  may be set.
         * 
         * @return builder
         * 
         */
        public Builder git(AppSpecWorkerGitArgs git) {
            return git(Output.of(git));
        }

        /**
         * @param github A GitHub repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/github/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
         * 
         * @return builder
         * 
         */
        public Builder github(@Nullable Output<AppSpecWorkerGithubArgs> github) {
            $.github = github;
            return this;
        }

        /**
         * @param github A GitHub repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/github/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
         * 
         * @return builder
         * 
         */
        public Builder github(AppSpecWorkerGithubArgs github) {
            return github(Output.of(github));
        }

        /**
         * @param gitlab A Gitlab repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/gitlab/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
         * 
         * @return builder
         * 
         */
        public Builder gitlab(@Nullable Output<AppSpecWorkerGitlabArgs> gitlab) {
            $.gitlab = gitlab;
            return this;
        }

        /**
         * @param gitlab A Gitlab repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/gitlab/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
         * 
         * @return builder
         * 
         */
        public Builder gitlab(AppSpecWorkerGitlabArgs gitlab) {
            return gitlab(Output.of(gitlab));
        }

        /**
         * @param image An image to use as the component&#39;s source. Only one of `git`, `github`, `gitlab`, or `image` may be set.
         * 
         * @return builder
         * 
         */
        public Builder image(@Nullable Output<AppSpecWorkerImageArgs> image) {
            $.image = image;
            return this;
        }

        /**
         * @param image An image to use as the component&#39;s source. Only one of `git`, `github`, `gitlab`, or `image` may be set.
         * 
         * @return builder
         * 
         */
        public Builder image(AppSpecWorkerImageArgs image) {
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
         * @param logDestinations Describes a log forwarding destination.
         * 
         * @return builder
         * 
         */
        public Builder logDestinations(@Nullable Output<List<AppSpecWorkerLogDestinationArgs>> logDestinations) {
            $.logDestinations = logDestinations;
            return this;
        }

        /**
         * @param logDestinations Describes a log forwarding destination.
         * 
         * @return builder
         * 
         */
        public Builder logDestinations(List<AppSpecWorkerLogDestinationArgs> logDestinations) {
            return logDestinations(Output.of(logDestinations));
        }

        /**
         * @param logDestinations Describes a log forwarding destination.
         * 
         * @return builder
         * 
         */
        public Builder logDestinations(AppSpecWorkerLogDestinationArgs... logDestinations) {
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

        public AppSpecWorkerArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("AppSpecWorkerArgs", "name");
            }
            return $;
        }
    }

}
