// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.digitalocean.outputs.GetAppSpecFunctionAlert;
import com.pulumi.digitalocean.outputs.GetAppSpecFunctionCors;
import com.pulumi.digitalocean.outputs.GetAppSpecFunctionEnv;
import com.pulumi.digitalocean.outputs.GetAppSpecFunctionGit;
import com.pulumi.digitalocean.outputs.GetAppSpecFunctionGithub;
import com.pulumi.digitalocean.outputs.GetAppSpecFunctionGitlab;
import com.pulumi.digitalocean.outputs.GetAppSpecFunctionLogDestination;
import com.pulumi.digitalocean.outputs.GetAppSpecFunctionRoute;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAppSpecFunction {
    /**
     * @return Describes an alert policy for the component.
     * 
     */
    private @Nullable List<GetAppSpecFunctionAlert> alerts;
    /**
     * @return The [CORS](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS) policies of the app.
     * 
     * @deprecated
     * Service level CORS rules are deprecated in favor of ingresses
     * 
     */
    @Deprecated /* Service level CORS rules are deprecated in favor of ingresses */
    private @Nullable GetAppSpecFunctionCors cors;
    /**
     * @return Describes an environment variable made available to an app competent.
     * 
     */
    private @Nullable List<GetAppSpecFunctionEnv> envs;
    /**
     * @return A Git repo to use as the component&#39;s source. The repository must be able to be cloned without authentication.  Only one of `git`, `github` or `gitlab`  may be set.
     * 
     */
    private @Nullable GetAppSpecFunctionGit git;
    /**
     * @return A GitHub repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/github/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    private @Nullable GetAppSpecFunctionGithub github;
    /**
     * @return A Gitlab repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/gitlab/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    private @Nullable GetAppSpecFunctionGitlab gitlab;
    /**
     * @return Describes a log forwarding destination.
     * 
     */
    private @Nullable List<GetAppSpecFunctionLogDestination> logDestinations;
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
    private List<GetAppSpecFunctionRoute> routes;
    /**
     * @return An optional path to the working directory to use for the build.
     * 
     */
    private @Nullable String sourceDir;

    private GetAppSpecFunction() {}
    /**
     * @return Describes an alert policy for the component.
     * 
     */
    public List<GetAppSpecFunctionAlert> alerts() {
        return this.alerts == null ? List.of() : this.alerts;
    }
    /**
     * @return The [CORS](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS) policies of the app.
     * 
     * @deprecated
     * Service level CORS rules are deprecated in favor of ingresses
     * 
     */
    @Deprecated /* Service level CORS rules are deprecated in favor of ingresses */
    public Optional<GetAppSpecFunctionCors> cors() {
        return Optional.ofNullable(this.cors);
    }
    /**
     * @return Describes an environment variable made available to an app competent.
     * 
     */
    public List<GetAppSpecFunctionEnv> envs() {
        return this.envs == null ? List.of() : this.envs;
    }
    /**
     * @return A Git repo to use as the component&#39;s source. The repository must be able to be cloned without authentication.  Only one of `git`, `github` or `gitlab`  may be set.
     * 
     */
    public Optional<GetAppSpecFunctionGit> git() {
        return Optional.ofNullable(this.git);
    }
    /**
     * @return A GitHub repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/github/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    public Optional<GetAppSpecFunctionGithub> github() {
        return Optional.ofNullable(this.github);
    }
    /**
     * @return A Gitlab repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/gitlab/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    public Optional<GetAppSpecFunctionGitlab> gitlab() {
        return Optional.ofNullable(this.gitlab);
    }
    /**
     * @return Describes a log forwarding destination.
     * 
     */
    public List<GetAppSpecFunctionLogDestination> logDestinations() {
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
    public List<GetAppSpecFunctionRoute> routes() {
        return this.routes;
    }
    /**
     * @return An optional path to the working directory to use for the build.
     * 
     */
    public Optional<String> sourceDir() {
        return Optional.ofNullable(this.sourceDir);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppSpecFunction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetAppSpecFunctionAlert> alerts;
        private @Nullable GetAppSpecFunctionCors cors;
        private @Nullable List<GetAppSpecFunctionEnv> envs;
        private @Nullable GetAppSpecFunctionGit git;
        private @Nullable GetAppSpecFunctionGithub github;
        private @Nullable GetAppSpecFunctionGitlab gitlab;
        private @Nullable List<GetAppSpecFunctionLogDestination> logDestinations;
        private String name;
        private List<GetAppSpecFunctionRoute> routes;
        private @Nullable String sourceDir;
        public Builder() {}
        public Builder(GetAppSpecFunction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alerts = defaults.alerts;
    	      this.cors = defaults.cors;
    	      this.envs = defaults.envs;
    	      this.git = defaults.git;
    	      this.github = defaults.github;
    	      this.gitlab = defaults.gitlab;
    	      this.logDestinations = defaults.logDestinations;
    	      this.name = defaults.name;
    	      this.routes = defaults.routes;
    	      this.sourceDir = defaults.sourceDir;
        }

        @CustomType.Setter
        public Builder alerts(@Nullable List<GetAppSpecFunctionAlert> alerts) {
            this.alerts = alerts;
            return this;
        }
        public Builder alerts(GetAppSpecFunctionAlert... alerts) {
            return alerts(List.of(alerts));
        }
        @CustomType.Setter
        public Builder cors(@Nullable GetAppSpecFunctionCors cors) {
            this.cors = cors;
            return this;
        }
        @CustomType.Setter
        public Builder envs(@Nullable List<GetAppSpecFunctionEnv> envs) {
            this.envs = envs;
            return this;
        }
        public Builder envs(GetAppSpecFunctionEnv... envs) {
            return envs(List.of(envs));
        }
        @CustomType.Setter
        public Builder git(@Nullable GetAppSpecFunctionGit git) {
            this.git = git;
            return this;
        }
        @CustomType.Setter
        public Builder github(@Nullable GetAppSpecFunctionGithub github) {
            this.github = github;
            return this;
        }
        @CustomType.Setter
        public Builder gitlab(@Nullable GetAppSpecFunctionGitlab gitlab) {
            this.gitlab = gitlab;
            return this;
        }
        @CustomType.Setter
        public Builder logDestinations(@Nullable List<GetAppSpecFunctionLogDestination> logDestinations) {
            this.logDestinations = logDestinations;
            return this;
        }
        public Builder logDestinations(GetAppSpecFunctionLogDestination... logDestinations) {
            return logDestinations(List.of(logDestinations));
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder routes(List<GetAppSpecFunctionRoute> routes) {
            this.routes = Objects.requireNonNull(routes);
            return this;
        }
        public Builder routes(GetAppSpecFunctionRoute... routes) {
            return routes(List.of(routes));
        }
        @CustomType.Setter
        public Builder sourceDir(@Nullable String sourceDir) {
            this.sourceDir = sourceDir;
            return this;
        }
        public GetAppSpecFunction build() {
            final var _resultValue = new GetAppSpecFunction();
            _resultValue.alerts = alerts;
            _resultValue.cors = cors;
            _resultValue.envs = envs;
            _resultValue.git = git;
            _resultValue.github = github;
            _resultValue.gitlab = gitlab;
            _resultValue.logDestinations = logDestinations;
            _resultValue.name = name;
            _resultValue.routes = routes;
            _resultValue.sourceDir = sourceDir;
            return _resultValue;
        }
    }
}
