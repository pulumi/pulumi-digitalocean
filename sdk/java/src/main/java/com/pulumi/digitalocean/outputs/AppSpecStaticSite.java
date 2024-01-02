// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.digitalocean.outputs.AppSpecStaticSiteCors;
import com.pulumi.digitalocean.outputs.AppSpecStaticSiteEnv;
import com.pulumi.digitalocean.outputs.AppSpecStaticSiteGit;
import com.pulumi.digitalocean.outputs.AppSpecStaticSiteGithub;
import com.pulumi.digitalocean.outputs.AppSpecStaticSiteGitlab;
import com.pulumi.digitalocean.outputs.AppSpecStaticSiteRoute;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppSpecStaticSite {
    /**
     * @return An optional build command to run while building this component from source.
     * 
     */
    private @Nullable String buildCommand;
    /**
     * @return The name of the document to use as the fallback for any requests to documents that are not found when serving this static site.
     * 
     */
    private @Nullable String catchallDocument;
    /**
     * @return The [CORS](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS) policies of the app.
     * 
     * @deprecated
     * Service level CORS rules are deprecated in favor of ingresses
     * 
     */
    @Deprecated /* Service level CORS rules are deprecated in favor of ingresses */
    private @Nullable AppSpecStaticSiteCors cors;
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
    private @Nullable List<AppSpecStaticSiteEnv> envs;
    /**
     * @return The name of the error document to use when serving this static site.
     * 
     */
    private @Nullable String errorDocument;
    /**
     * @return A Git repo to use as the component&#39;s source. The repository must be able to be cloned without authentication.  Only one of `git`, `github` or `gitlab`  may be set.
     * 
     */
    private @Nullable AppSpecStaticSiteGit git;
    /**
     * @return A GitHub repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/github/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    private @Nullable AppSpecStaticSiteGithub github;
    /**
     * @return A Gitlab repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/gitlab/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    private @Nullable AppSpecStaticSiteGitlab gitlab;
    /**
     * @return The name of the index document to use when serving this static site.
     * 
     */
    private @Nullable String indexDocument;
    /**
     * @return The name of the component.
     * 
     */
    private String name;
    /**
     * @return An optional path to where the built assets will be located, relative to the build context. If not set, App Platform will automatically scan for these directory names: `_static`, `dist`, `public`.
     * 
     */
    private @Nullable String outputDir;
    /**
     * @return An HTTP paths that should be routed to this component.
     * 
     * @deprecated
     * Service level routes are deprecated in favor of ingresses
     * 
     */
    @Deprecated /* Service level routes are deprecated in favor of ingresses */
    private @Nullable List<AppSpecStaticSiteRoute> routes;
    /**
     * @return An optional path to the working directory to use for the build.
     * 
     */
    private @Nullable String sourceDir;

    private AppSpecStaticSite() {}
    /**
     * @return An optional build command to run while building this component from source.
     * 
     */
    public Optional<String> buildCommand() {
        return Optional.ofNullable(this.buildCommand);
    }
    /**
     * @return The name of the document to use as the fallback for any requests to documents that are not found when serving this static site.
     * 
     */
    public Optional<String> catchallDocument() {
        return Optional.ofNullable(this.catchallDocument);
    }
    /**
     * @return The [CORS](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS) policies of the app.
     * 
     * @deprecated
     * Service level CORS rules are deprecated in favor of ingresses
     * 
     */
    @Deprecated /* Service level CORS rules are deprecated in favor of ingresses */
    public Optional<AppSpecStaticSiteCors> cors() {
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
    public List<AppSpecStaticSiteEnv> envs() {
        return this.envs == null ? List.of() : this.envs;
    }
    /**
     * @return The name of the error document to use when serving this static site.
     * 
     */
    public Optional<String> errorDocument() {
        return Optional.ofNullable(this.errorDocument);
    }
    /**
     * @return A Git repo to use as the component&#39;s source. The repository must be able to be cloned without authentication.  Only one of `git`, `github` or `gitlab`  may be set.
     * 
     */
    public Optional<AppSpecStaticSiteGit> git() {
        return Optional.ofNullable(this.git);
    }
    /**
     * @return A GitHub repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/github/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    public Optional<AppSpecStaticSiteGithub> github() {
        return Optional.ofNullable(this.github);
    }
    /**
     * @return A Gitlab repo to use as the component&#39;s source. DigitalOcean App Platform must have [access to the repository](https://cloud.digitalocean.com/apps/gitlab/install). Only one of `git`, `github`, `gitlab`, or `image` may be set.
     * 
     */
    public Optional<AppSpecStaticSiteGitlab> gitlab() {
        return Optional.ofNullable(this.gitlab);
    }
    /**
     * @return The name of the index document to use when serving this static site.
     * 
     */
    public Optional<String> indexDocument() {
        return Optional.ofNullable(this.indexDocument);
    }
    /**
     * @return The name of the component.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return An optional path to where the built assets will be located, relative to the build context. If not set, App Platform will automatically scan for these directory names: `_static`, `dist`, `public`.
     * 
     */
    public Optional<String> outputDir() {
        return Optional.ofNullable(this.outputDir);
    }
    /**
     * @return An HTTP paths that should be routed to this component.
     * 
     * @deprecated
     * Service level routes are deprecated in favor of ingresses
     * 
     */
    @Deprecated /* Service level routes are deprecated in favor of ingresses */
    public List<AppSpecStaticSiteRoute> routes() {
        return this.routes == null ? List.of() : this.routes;
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

    public static Builder builder(AppSpecStaticSite defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String buildCommand;
        private @Nullable String catchallDocument;
        private @Nullable AppSpecStaticSiteCors cors;
        private @Nullable String dockerfilePath;
        private @Nullable String environmentSlug;
        private @Nullable List<AppSpecStaticSiteEnv> envs;
        private @Nullable String errorDocument;
        private @Nullable AppSpecStaticSiteGit git;
        private @Nullable AppSpecStaticSiteGithub github;
        private @Nullable AppSpecStaticSiteGitlab gitlab;
        private @Nullable String indexDocument;
        private String name;
        private @Nullable String outputDir;
        private @Nullable List<AppSpecStaticSiteRoute> routes;
        private @Nullable String sourceDir;
        public Builder() {}
        public Builder(AppSpecStaticSite defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buildCommand = defaults.buildCommand;
    	      this.catchallDocument = defaults.catchallDocument;
    	      this.cors = defaults.cors;
    	      this.dockerfilePath = defaults.dockerfilePath;
    	      this.environmentSlug = defaults.environmentSlug;
    	      this.envs = defaults.envs;
    	      this.errorDocument = defaults.errorDocument;
    	      this.git = defaults.git;
    	      this.github = defaults.github;
    	      this.gitlab = defaults.gitlab;
    	      this.indexDocument = defaults.indexDocument;
    	      this.name = defaults.name;
    	      this.outputDir = defaults.outputDir;
    	      this.routes = defaults.routes;
    	      this.sourceDir = defaults.sourceDir;
        }

        @CustomType.Setter
        public Builder buildCommand(@Nullable String buildCommand) {

            this.buildCommand = buildCommand;
            return this;
        }
        @CustomType.Setter
        public Builder catchallDocument(@Nullable String catchallDocument) {

            this.catchallDocument = catchallDocument;
            return this;
        }
        @CustomType.Setter
        public Builder cors(@Nullable AppSpecStaticSiteCors cors) {

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
        public Builder envs(@Nullable List<AppSpecStaticSiteEnv> envs) {

            this.envs = envs;
            return this;
        }
        public Builder envs(AppSpecStaticSiteEnv... envs) {
            return envs(List.of(envs));
        }
        @CustomType.Setter
        public Builder errorDocument(@Nullable String errorDocument) {

            this.errorDocument = errorDocument;
            return this;
        }
        @CustomType.Setter
        public Builder git(@Nullable AppSpecStaticSiteGit git) {

            this.git = git;
            return this;
        }
        @CustomType.Setter
        public Builder github(@Nullable AppSpecStaticSiteGithub github) {

            this.github = github;
            return this;
        }
        @CustomType.Setter
        public Builder gitlab(@Nullable AppSpecStaticSiteGitlab gitlab) {

            this.gitlab = gitlab;
            return this;
        }
        @CustomType.Setter
        public Builder indexDocument(@Nullable String indexDocument) {

            this.indexDocument = indexDocument;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("AppSpecStaticSite", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder outputDir(@Nullable String outputDir) {

            this.outputDir = outputDir;
            return this;
        }
        @CustomType.Setter
        public Builder routes(@Nullable List<AppSpecStaticSiteRoute> routes) {

            this.routes = routes;
            return this;
        }
        public Builder routes(AppSpecStaticSiteRoute... routes) {
            return routes(List.of(routes));
        }
        @CustomType.Setter
        public Builder sourceDir(@Nullable String sourceDir) {

            this.sourceDir = sourceDir;
            return this;
        }
        public AppSpecStaticSite build() {
            final var _resultValue = new AppSpecStaticSite();
            _resultValue.buildCommand = buildCommand;
            _resultValue.catchallDocument = catchallDocument;
            _resultValue.cors = cors;
            _resultValue.dockerfilePath = dockerfilePath;
            _resultValue.environmentSlug = environmentSlug;
            _resultValue.envs = envs;
            _resultValue.errorDocument = errorDocument;
            _resultValue.git = git;
            _resultValue.github = github;
            _resultValue.gitlab = gitlab;
            _resultValue.indexDocument = indexDocument;
            _resultValue.name = name;
            _resultValue.outputDir = outputDir;
            _resultValue.routes = routes;
            _resultValue.sourceDir = sourceDir;
            return _resultValue;
        }
    }
}
