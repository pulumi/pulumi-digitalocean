// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.digitalocean.outputs.AppSpecWorkerAlert;
import com.pulumi.digitalocean.outputs.AppSpecWorkerAutoscaling;
import com.pulumi.digitalocean.outputs.AppSpecWorkerBitbucket;
import com.pulumi.digitalocean.outputs.AppSpecWorkerEnv;
import com.pulumi.digitalocean.outputs.AppSpecWorkerGit;
import com.pulumi.digitalocean.outputs.AppSpecWorkerGithub;
import com.pulumi.digitalocean.outputs.AppSpecWorkerGitlab;
import com.pulumi.digitalocean.outputs.AppSpecWorkerImage;
import com.pulumi.digitalocean.outputs.AppSpecWorkerLogDestination;
import com.pulumi.digitalocean.outputs.AppSpecWorkerTermination;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppSpecWorker {
    /**
     * @return Describes an alert policy for the component.
     * 
     */
    private @Nullable List<AppSpecWorkerAlert> alerts;
    /**
     * @return Configuration for automatically scaling this component based on metrics.
     * 
     */
    private @Nullable AppSpecWorkerAutoscaling autoscaling;
    /**
     * @return A GitHub repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/bitbucket/install). Only one of `git`, `github`, `bitbucket`, `gitlab`, or `image` may be set.
     * 
     */
    private @Nullable AppSpecWorkerBitbucket bitbucket;
    /**
     * @return An optional build command to run while building this component from source.
     * 
     */
    private @Nullable String buildCommand;
    /**
     * @return The path to a Dockerfile relative to the root of the repo. If set, overrides usage of buildpacks.
     * 
     */
    private @Nullable String dockerfilePath;
    /**
     * @return An environment slug describing the type of this app.
     * 
     */
    private @Nullable String environmentSlug;
    /**
     * @return Describes an environment variable made available to an app competent.
     * 
     */
    private @Nullable List<AppSpecWorkerEnv> envs;
    /**
     * @return A Git repo to use as the component&#39;s source. The repository must be able to be cloned without authentication. Only one of `git`, `github` or `gitlab` may be set.
     * 
     */
    private @Nullable AppSpecWorkerGit git;
    /**
     * @return A GitHub repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/github/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    private @Nullable AppSpecWorkerGithub github;
    /**
     * @return A Gitlab repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/gitlab/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    private @Nullable AppSpecWorkerGitlab gitlab;
    /**
     * @return An image to use as the component&#39;s source. Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    private @Nullable AppSpecWorkerImage image;
    /**
     * @return The amount of instances that this component should be scaled to.
     * 
     */
    private @Nullable Integer instanceCount;
    /**
     * @return The instance size to use for this component. This determines the plan (basic or professional) and the available CPU and memory. The list of available instance sizes can be [found with the API](https://docs.digitalocean.com/reference/api/api-reference/#operation/list_instance_sizes) or using the [doctl CLI](https://docs.digitalocean.com/reference/doctl/) (`doctl apps tier instance-size list`). Default: `basic-xxs`
     * 
     */
    private @Nullable String instanceSizeSlug;
    /**
     * @return Describes a log forwarding destination.
     * 
     */
    private @Nullable List<AppSpecWorkerLogDestination> logDestinations;
    /**
     * @return The name of the component.
     * 
     */
    private String name;
    /**
     * @return An optional run command to override the component&#39;s default.
     * 
     */
    private @Nullable String runCommand;
    /**
     * @return An optional path to the working directory to use for the build.
     * 
     */
    private @Nullable String sourceDir;
    /**
     * @return Contains a component&#39;s termination parameters.
     * 
     */
    private @Nullable AppSpecWorkerTermination termination;

    private AppSpecWorker() {}
    /**
     * @return Describes an alert policy for the component.
     * 
     */
    public List<AppSpecWorkerAlert> alerts() {
        return this.alerts == null ? List.of() : this.alerts;
    }
    /**
     * @return Configuration for automatically scaling this component based on metrics.
     * 
     */
    public Optional<AppSpecWorkerAutoscaling> autoscaling() {
        return Optional.ofNullable(this.autoscaling);
    }
    /**
     * @return A GitHub repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/bitbucket/install). Only one of `git`, `github`, `bitbucket`, `gitlab`, or `image` may be set.
     * 
     */
    public Optional<AppSpecWorkerBitbucket> bitbucket() {
        return Optional.ofNullable(this.bitbucket);
    }
    /**
     * @return An optional build command to run while building this component from source.
     * 
     */
    public Optional<String> buildCommand() {
        return Optional.ofNullable(this.buildCommand);
    }
    /**
     * @return The path to a Dockerfile relative to the root of the repo. If set, overrides usage of buildpacks.
     * 
     */
    public Optional<String> dockerfilePath() {
        return Optional.ofNullable(this.dockerfilePath);
    }
    /**
     * @return An environment slug describing the type of this app.
     * 
     */
    public Optional<String> environmentSlug() {
        return Optional.ofNullable(this.environmentSlug);
    }
    /**
     * @return Describes an environment variable made available to an app competent.
     * 
     */
    public List<AppSpecWorkerEnv> envs() {
        return this.envs == null ? List.of() : this.envs;
    }
    /**
     * @return A Git repo to use as the component&#39;s source. The repository must be able to be cloned without authentication. Only one of `git`, `github` or `gitlab` may be set.
     * 
     */
    public Optional<AppSpecWorkerGit> git() {
        return Optional.ofNullable(this.git);
    }
    /**
     * @return A GitHub repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/github/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    public Optional<AppSpecWorkerGithub> github() {
        return Optional.ofNullable(this.github);
    }
    /**
     * @return A Gitlab repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/gitlab/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    public Optional<AppSpecWorkerGitlab> gitlab() {
        return Optional.ofNullable(this.gitlab);
    }
    /**
     * @return An image to use as the component&#39;s source. Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    public Optional<AppSpecWorkerImage> image() {
        return Optional.ofNullable(this.image);
    }
    /**
     * @return The amount of instances that this component should be scaled to.
     * 
     */
    public Optional<Integer> instanceCount() {
        return Optional.ofNullable(this.instanceCount);
    }
    /**
     * @return The instance size to use for this component. This determines the plan (basic or professional) and the available CPU and memory. The list of available instance sizes can be [found with the API](https://docs.digitalocean.com/reference/api/api-reference/#operation/list_instance_sizes) or using the [doctl CLI](https://docs.digitalocean.com/reference/doctl/) (`doctl apps tier instance-size list`). Default: `basic-xxs`
     * 
     */
    public Optional<String> instanceSizeSlug() {
        return Optional.ofNullable(this.instanceSizeSlug);
    }
    /**
     * @return Describes a log forwarding destination.
     * 
     */
    public List<AppSpecWorkerLogDestination> logDestinations() {
        return this.logDestinations == null ? List.of() : this.logDestinations;
    }
    /**
     * @return The name of the component.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return An optional run command to override the component&#39;s default.
     * 
     */
    public Optional<String> runCommand() {
        return Optional.ofNullable(this.runCommand);
    }
    /**
     * @return An optional path to the working directory to use for the build.
     * 
     */
    public Optional<String> sourceDir() {
        return Optional.ofNullable(this.sourceDir);
    }
    /**
     * @return Contains a component&#39;s termination parameters.
     * 
     */
    public Optional<AppSpecWorkerTermination> termination() {
        return Optional.ofNullable(this.termination);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppSpecWorker defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<AppSpecWorkerAlert> alerts;
        private @Nullable AppSpecWorkerAutoscaling autoscaling;
        private @Nullable AppSpecWorkerBitbucket bitbucket;
        private @Nullable String buildCommand;
        private @Nullable String dockerfilePath;
        private @Nullable String environmentSlug;
        private @Nullable List<AppSpecWorkerEnv> envs;
        private @Nullable AppSpecWorkerGit git;
        private @Nullable AppSpecWorkerGithub github;
        private @Nullable AppSpecWorkerGitlab gitlab;
        private @Nullable AppSpecWorkerImage image;
        private @Nullable Integer instanceCount;
        private @Nullable String instanceSizeSlug;
        private @Nullable List<AppSpecWorkerLogDestination> logDestinations;
        private String name;
        private @Nullable String runCommand;
        private @Nullable String sourceDir;
        private @Nullable AppSpecWorkerTermination termination;
        public Builder() {}
        public Builder(AppSpecWorker defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alerts = defaults.alerts;
    	      this.autoscaling = defaults.autoscaling;
    	      this.bitbucket = defaults.bitbucket;
    	      this.buildCommand = defaults.buildCommand;
    	      this.dockerfilePath = defaults.dockerfilePath;
    	      this.environmentSlug = defaults.environmentSlug;
    	      this.envs = defaults.envs;
    	      this.git = defaults.git;
    	      this.github = defaults.github;
    	      this.gitlab = defaults.gitlab;
    	      this.image = defaults.image;
    	      this.instanceCount = defaults.instanceCount;
    	      this.instanceSizeSlug = defaults.instanceSizeSlug;
    	      this.logDestinations = defaults.logDestinations;
    	      this.name = defaults.name;
    	      this.runCommand = defaults.runCommand;
    	      this.sourceDir = defaults.sourceDir;
    	      this.termination = defaults.termination;
        }

        @CustomType.Setter
        public Builder alerts(@Nullable List<AppSpecWorkerAlert> alerts) {

            this.alerts = alerts;
            return this;
        }
        public Builder alerts(AppSpecWorkerAlert... alerts) {
            return alerts(List.of(alerts));
        }
        @CustomType.Setter
        public Builder autoscaling(@Nullable AppSpecWorkerAutoscaling autoscaling) {

            this.autoscaling = autoscaling;
            return this;
        }
        @CustomType.Setter
        public Builder bitbucket(@Nullable AppSpecWorkerBitbucket bitbucket) {

            this.bitbucket = bitbucket;
            return this;
        }
        @CustomType.Setter
        public Builder buildCommand(@Nullable String buildCommand) {

            this.buildCommand = buildCommand;
            return this;
        }
        @CustomType.Setter
        public Builder dockerfilePath(@Nullable String dockerfilePath) {

            this.dockerfilePath = dockerfilePath;
            return this;
        }
        @CustomType.Setter
        public Builder environmentSlug(@Nullable String environmentSlug) {

            this.environmentSlug = environmentSlug;
            return this;
        }
        @CustomType.Setter
        public Builder envs(@Nullable List<AppSpecWorkerEnv> envs) {

            this.envs = envs;
            return this;
        }
        public Builder envs(AppSpecWorkerEnv... envs) {
            return envs(List.of(envs));
        }
        @CustomType.Setter
        public Builder git(@Nullable AppSpecWorkerGit git) {

            this.git = git;
            return this;
        }
        @CustomType.Setter
        public Builder github(@Nullable AppSpecWorkerGithub github) {

            this.github = github;
            return this;
        }
        @CustomType.Setter
        public Builder gitlab(@Nullable AppSpecWorkerGitlab gitlab) {

            this.gitlab = gitlab;
            return this;
        }
        @CustomType.Setter
        public Builder image(@Nullable AppSpecWorkerImage image) {

            this.image = image;
            return this;
        }
        @CustomType.Setter
        public Builder instanceCount(@Nullable Integer instanceCount) {

            this.instanceCount = instanceCount;
            return this;
        }
        @CustomType.Setter
        public Builder instanceSizeSlug(@Nullable String instanceSizeSlug) {

            this.instanceSizeSlug = instanceSizeSlug;
            return this;
        }
        @CustomType.Setter
        public Builder logDestinations(@Nullable List<AppSpecWorkerLogDestination> logDestinations) {

            this.logDestinations = logDestinations;
            return this;
        }
        public Builder logDestinations(AppSpecWorkerLogDestination... logDestinations) {
            return logDestinations(List.of(logDestinations));
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("AppSpecWorker", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder runCommand(@Nullable String runCommand) {

            this.runCommand = runCommand;
            return this;
        }
        @CustomType.Setter
        public Builder sourceDir(@Nullable String sourceDir) {

            this.sourceDir = sourceDir;
            return this;
        }
        @CustomType.Setter
        public Builder termination(@Nullable AppSpecWorkerTermination termination) {

            this.termination = termination;
            return this;
        }
        public AppSpecWorker build() {
            final var _resultValue = new AppSpecWorker();
            _resultValue.alerts = alerts;
            _resultValue.autoscaling = autoscaling;
            _resultValue.bitbucket = bitbucket;
            _resultValue.buildCommand = buildCommand;
            _resultValue.dockerfilePath = dockerfilePath;
            _resultValue.environmentSlug = environmentSlug;
            _resultValue.envs = envs;
            _resultValue.git = git;
            _resultValue.github = github;
            _resultValue.gitlab = gitlab;
            _resultValue.image = image;
            _resultValue.instanceCount = instanceCount;
            _resultValue.instanceSizeSlug = instanceSizeSlug;
            _resultValue.logDestinations = logDestinations;
            _resultValue.name = name;
            _resultValue.runCommand = runCommand;
            _resultValue.sourceDir = sourceDir;
            _resultValue.termination = termination;
            return _resultValue;
        }
    }
}
