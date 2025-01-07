// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.digitalocean.outputs.GetAppSpecServiceAlert;
import com.pulumi.digitalocean.outputs.GetAppSpecServiceAutoscaling;
import com.pulumi.digitalocean.outputs.GetAppSpecServiceCors;
import com.pulumi.digitalocean.outputs.GetAppSpecServiceEnv;
import com.pulumi.digitalocean.outputs.GetAppSpecServiceGit;
import com.pulumi.digitalocean.outputs.GetAppSpecServiceGithub;
import com.pulumi.digitalocean.outputs.GetAppSpecServiceGitlab;
import com.pulumi.digitalocean.outputs.GetAppSpecServiceHealthCheck;
import com.pulumi.digitalocean.outputs.GetAppSpecServiceImage;
import com.pulumi.digitalocean.outputs.GetAppSpecServiceLogDestination;
import com.pulumi.digitalocean.outputs.GetAppSpecServiceRoute;
import com.pulumi.digitalocean.outputs.GetAppSpecServiceTermination;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAppSpecService {
    /**
     * @return Describes an alert policy for the component.
     * 
     */
    private @Nullable List<GetAppSpecServiceAlert> alerts;
    /**
     * @return Configuration for automatically scaling this component based on metrics.
     * 
     */
    private @Nullable GetAppSpecServiceAutoscaling autoscaling;
    /**
     * @return An optional build command to run while building this component from source.
     * 
     */
    private @Nullable String buildCommand;
    /**
     * @return The [CORS](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS) policies of the app.
     * 
     * @deprecated
     * Service level CORS rules are deprecated in favor of ingresses
     * 
     */
    @Deprecated /* Service level CORS rules are deprecated in favor of ingresses */
    private @Nullable GetAppSpecServiceCors cors;
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
    private @Nullable List<GetAppSpecServiceEnv> envs;
    /**
     * @return A Git repo to use as the component&#39;s source. The repository must be able to be cloned without authentication.  Only one of `git`, `github` or `gitlab`  may be set.
     * 
     */
    private @Nullable GetAppSpecServiceGit git;
    /**
     * @return A GitHub repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/github/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    private @Nullable GetAppSpecServiceGithub github;
    /**
     * @return A Gitlab repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/gitlab/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    private @Nullable GetAppSpecServiceGitlab gitlab;
    /**
     * @return A health check to determine the availability of this component.
     * 
     */
    private @Nullable GetAppSpecServiceHealthCheck healthCheck;
    /**
     * @return The internal port on which this service&#39;s run command will listen.
     * 
     */
    private Integer httpPort;
    /**
     * @return An image to use as the component&#39;s source. Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    private @Nullable GetAppSpecServiceImage image;
    /**
     * @return The amount of instances that this component should be scaled to.
     * 
     */
    private @Nullable Integer instanceCount;
    /**
     * @return The instance size to use for this component.
     * 
     */
    private @Nullable String instanceSizeSlug;
    /**
     * @return A list of ports on which this service will listen for internal traffic.
     * 
     */
    private List<Integer> internalPorts;
    /**
     * @return Describes a log forwarding destination.
     * 
     */
    private @Nullable List<GetAppSpecServiceLogDestination> logDestinations;
    /**
     * @return The name of the component.
     * 
     */
    private String name;
    /**
     * @deprecated
     * Service level routes are deprecated in favor of ingresses
     * 
     */
    @Deprecated /* Service level routes are deprecated in favor of ingresses */
    private List<GetAppSpecServiceRoute> routes;
    /**
     * @return An optional run command to override the component&#39;s default.
     * 
     */
    private String runCommand;
    /**
     * @return An optional path to the working directory to use for the build.
     * 
     */
    private @Nullable String sourceDir;
    /**
     * @return Contains a component&#39;s termination parameters.
     * 
     */
    private @Nullable GetAppSpecServiceTermination termination;

    private GetAppSpecService() {}
    /**
     * @return Describes an alert policy for the component.
     * 
     */
    public List<GetAppSpecServiceAlert> alerts() {
        return this.alerts == null ? List.of() : this.alerts;
    }
    /**
     * @return Configuration for automatically scaling this component based on metrics.
     * 
     */
    public Optional<GetAppSpecServiceAutoscaling> autoscaling() {
        return Optional.ofNullable(this.autoscaling);
    }
    /**
     * @return An optional build command to run while building this component from source.
     * 
     */
    public Optional<String> buildCommand() {
        return Optional.ofNullable(this.buildCommand);
    }
    /**
     * @return The [CORS](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS) policies of the app.
     * 
     * @deprecated
     * Service level CORS rules are deprecated in favor of ingresses
     * 
     */
    @Deprecated /* Service level CORS rules are deprecated in favor of ingresses */
    public Optional<GetAppSpecServiceCors> cors() {
        return Optional.ofNullable(this.cors);
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
    public List<GetAppSpecServiceEnv> envs() {
        return this.envs == null ? List.of() : this.envs;
    }
    /**
     * @return A Git repo to use as the component&#39;s source. The repository must be able to be cloned without authentication.  Only one of `git`, `github` or `gitlab`  may be set.
     * 
     */
    public Optional<GetAppSpecServiceGit> git() {
        return Optional.ofNullable(this.git);
    }
    /**
     * @return A GitHub repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/github/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    public Optional<GetAppSpecServiceGithub> github() {
        return Optional.ofNullable(this.github);
    }
    /**
     * @return A Gitlab repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/gitlab/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    public Optional<GetAppSpecServiceGitlab> gitlab() {
        return Optional.ofNullable(this.gitlab);
    }
    /**
     * @return A health check to determine the availability of this component.
     * 
     */
    public Optional<GetAppSpecServiceHealthCheck> healthCheck() {
        return Optional.ofNullable(this.healthCheck);
    }
    /**
     * @return The internal port on which this service&#39;s run command will listen.
     * 
     */
    public Integer httpPort() {
        return this.httpPort;
    }
    /**
     * @return An image to use as the component&#39;s source. Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    public Optional<GetAppSpecServiceImage> image() {
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
     * @return The instance size to use for this component.
     * 
     */
    public Optional<String> instanceSizeSlug() {
        return Optional.ofNullable(this.instanceSizeSlug);
    }
    /**
     * @return A list of ports on which this service will listen for internal traffic.
     * 
     */
    public List<Integer> internalPorts() {
        return this.internalPorts;
    }
    /**
     * @return Describes a log forwarding destination.
     * 
     */
    public List<GetAppSpecServiceLogDestination> logDestinations() {
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
     * @deprecated
     * Service level routes are deprecated in favor of ingresses
     * 
     */
    @Deprecated /* Service level routes are deprecated in favor of ingresses */
    public List<GetAppSpecServiceRoute> routes() {
        return this.routes;
    }
    /**
     * @return An optional run command to override the component&#39;s default.
     * 
     */
    public String runCommand() {
        return this.runCommand;
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
    public Optional<GetAppSpecServiceTermination> termination() {
        return Optional.ofNullable(this.termination);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppSpecService defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetAppSpecServiceAlert> alerts;
        private @Nullable GetAppSpecServiceAutoscaling autoscaling;
        private @Nullable String buildCommand;
        private @Nullable GetAppSpecServiceCors cors;
        private @Nullable String dockerfilePath;
        private @Nullable String environmentSlug;
        private @Nullable List<GetAppSpecServiceEnv> envs;
        private @Nullable GetAppSpecServiceGit git;
        private @Nullable GetAppSpecServiceGithub github;
        private @Nullable GetAppSpecServiceGitlab gitlab;
        private @Nullable GetAppSpecServiceHealthCheck healthCheck;
        private Integer httpPort;
        private @Nullable GetAppSpecServiceImage image;
        private @Nullable Integer instanceCount;
        private @Nullable String instanceSizeSlug;
        private List<Integer> internalPorts;
        private @Nullable List<GetAppSpecServiceLogDestination> logDestinations;
        private String name;
        private List<GetAppSpecServiceRoute> routes;
        private String runCommand;
        private @Nullable String sourceDir;
        private @Nullable GetAppSpecServiceTermination termination;
        public Builder() {}
        public Builder(GetAppSpecService defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alerts = defaults.alerts;
    	      this.autoscaling = defaults.autoscaling;
    	      this.buildCommand = defaults.buildCommand;
    	      this.cors = defaults.cors;
    	      this.dockerfilePath = defaults.dockerfilePath;
    	      this.environmentSlug = defaults.environmentSlug;
    	      this.envs = defaults.envs;
    	      this.git = defaults.git;
    	      this.github = defaults.github;
    	      this.gitlab = defaults.gitlab;
    	      this.healthCheck = defaults.healthCheck;
    	      this.httpPort = defaults.httpPort;
    	      this.image = defaults.image;
    	      this.instanceCount = defaults.instanceCount;
    	      this.instanceSizeSlug = defaults.instanceSizeSlug;
    	      this.internalPorts = defaults.internalPorts;
    	      this.logDestinations = defaults.logDestinations;
    	      this.name = defaults.name;
    	      this.routes = defaults.routes;
    	      this.runCommand = defaults.runCommand;
    	      this.sourceDir = defaults.sourceDir;
    	      this.termination = defaults.termination;
        }

        @CustomType.Setter
        public Builder alerts(@Nullable List<GetAppSpecServiceAlert> alerts) {

            this.alerts = alerts;
            return this;
        }
        public Builder alerts(GetAppSpecServiceAlert... alerts) {
            return alerts(List.of(alerts));
        }
        @CustomType.Setter
        public Builder autoscaling(@Nullable GetAppSpecServiceAutoscaling autoscaling) {

            this.autoscaling = autoscaling;
            return this;
        }
        @CustomType.Setter
        public Builder buildCommand(@Nullable String buildCommand) {

            this.buildCommand = buildCommand;
            return this;
        }
        @CustomType.Setter
        public Builder cors(@Nullable GetAppSpecServiceCors cors) {

            this.cors = cors;
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
        public Builder envs(@Nullable List<GetAppSpecServiceEnv> envs) {

            this.envs = envs;
            return this;
        }
        public Builder envs(GetAppSpecServiceEnv... envs) {
            return envs(List.of(envs));
        }
        @CustomType.Setter
        public Builder git(@Nullable GetAppSpecServiceGit git) {

            this.git = git;
            return this;
        }
        @CustomType.Setter
        public Builder github(@Nullable GetAppSpecServiceGithub github) {

            this.github = github;
            return this;
        }
        @CustomType.Setter
        public Builder gitlab(@Nullable GetAppSpecServiceGitlab gitlab) {

            this.gitlab = gitlab;
            return this;
        }
        @CustomType.Setter
        public Builder healthCheck(@Nullable GetAppSpecServiceHealthCheck healthCheck) {

            this.healthCheck = healthCheck;
            return this;
        }
        @CustomType.Setter
        public Builder httpPort(Integer httpPort) {
            if (httpPort == null) {
              throw new MissingRequiredPropertyException("GetAppSpecService", "httpPort");
            }
            this.httpPort = httpPort;
            return this;
        }
        @CustomType.Setter
        public Builder image(@Nullable GetAppSpecServiceImage image) {

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
        public Builder internalPorts(List<Integer> internalPorts) {
            if (internalPorts == null) {
              throw new MissingRequiredPropertyException("GetAppSpecService", "internalPorts");
            }
            this.internalPorts = internalPorts;
            return this;
        }
        public Builder internalPorts(Integer... internalPorts) {
            return internalPorts(List.of(internalPorts));
        }
        @CustomType.Setter
        public Builder logDestinations(@Nullable List<GetAppSpecServiceLogDestination> logDestinations) {

            this.logDestinations = logDestinations;
            return this;
        }
        public Builder logDestinations(GetAppSpecServiceLogDestination... logDestinations) {
            return logDestinations(List.of(logDestinations));
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetAppSpecService", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder routes(List<GetAppSpecServiceRoute> routes) {
            if (routes == null) {
              throw new MissingRequiredPropertyException("GetAppSpecService", "routes");
            }
            this.routes = routes;
            return this;
        }
        public Builder routes(GetAppSpecServiceRoute... routes) {
            return routes(List.of(routes));
        }
        @CustomType.Setter
        public Builder runCommand(String runCommand) {
            if (runCommand == null) {
              throw new MissingRequiredPropertyException("GetAppSpecService", "runCommand");
            }
            this.runCommand = runCommand;
            return this;
        }
        @CustomType.Setter
        public Builder sourceDir(@Nullable String sourceDir) {

            this.sourceDir = sourceDir;
            return this;
        }
        @CustomType.Setter
        public Builder termination(@Nullable GetAppSpecServiceTermination termination) {

            this.termination = termination;
            return this;
        }
        public GetAppSpecService build() {
            final var _resultValue = new GetAppSpecService();
            _resultValue.alerts = alerts;
            _resultValue.autoscaling = autoscaling;
            _resultValue.buildCommand = buildCommand;
            _resultValue.cors = cors;
            _resultValue.dockerfilePath = dockerfilePath;
            _resultValue.environmentSlug = environmentSlug;
            _resultValue.envs = envs;
            _resultValue.git = git;
            _resultValue.github = github;
            _resultValue.gitlab = gitlab;
            _resultValue.healthCheck = healthCheck;
            _resultValue.httpPort = httpPort;
            _resultValue.image = image;
            _resultValue.instanceCount = instanceCount;
            _resultValue.instanceSizeSlug = instanceSizeSlug;
            _resultValue.internalPorts = internalPorts;
            _resultValue.logDestinations = logDestinations;
            _resultValue.name = name;
            _resultValue.routes = routes;
            _resultValue.runCommand = runCommand;
            _resultValue.sourceDir = sourceDir;
            _resultValue.termination = termination;
            return _resultValue;
        }
    }
}
