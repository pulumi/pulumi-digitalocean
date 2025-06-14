// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.digitalocean.outputs.AppSpecAlert;
import com.pulumi.digitalocean.outputs.AppSpecDatabase;
import com.pulumi.digitalocean.outputs.AppSpecDomainName;
import com.pulumi.digitalocean.outputs.AppSpecEgress;
import com.pulumi.digitalocean.outputs.AppSpecEnv;
import com.pulumi.digitalocean.outputs.AppSpecFunction;
import com.pulumi.digitalocean.outputs.AppSpecIngress;
import com.pulumi.digitalocean.outputs.AppSpecJob;
import com.pulumi.digitalocean.outputs.AppSpecService;
import com.pulumi.digitalocean.outputs.AppSpecStaticSite;
import com.pulumi.digitalocean.outputs.AppSpecWorker;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppSpec {
    /**
     * @return Describes an alert policy for the component.
     * 
     */
    private @Nullable List<AppSpecAlert> alerts;
    private @Nullable List<AppSpecDatabase> databases;
    /**
     * @return A boolean indicating whether to disable the edge cache for this app. Default: `false`. Available only for non-static sites. Requires custom domains and applies to all the domains of the app.
     * 
     */
    private @Nullable Boolean disableEdgeCache;
    /**
     * @return A boolean indicating whether to disable email obfuscation for this app. Default: `false`. Requires custom domains and applies to all the domains of the app.
     * 
     */
    private @Nullable Boolean disableEmailObfuscation;
    /**
     * @return Describes a domain where the application will be made available.
     * 
     */
    private @Nullable List<AppSpecDomainName> domainNames;
    /**
     * @deprecated
     * This attribute has been replaced by `domain` which supports additional functionality.
     * 
     */
    @Deprecated /* This attribute has been replaced by `domain` which supports additional functionality. */
    private @Nullable List<String> domains;
    /**
     * @return Specification for app egress configurations.
     * 
     */
    private @Nullable List<AppSpecEgress> egresses;
    /**
     * @return A boolean, when set to `true`, enables enhanced analyzing of incoming traffic to prevent layer 7 DDoS attacks. Default: `false`. Requires custom domains and applies to all the domains of the app.
     * 
     */
    private @Nullable Boolean enhancedThreatControlEnabled;
    /**
     * @return Describes an environment variable made available to an app competent.
     * 
     */
    private @Nullable List<AppSpecEnv> envs;
    /**
     * @return A list of the features applied to the app. The default buildpack can be overridden here. List of available buildpacks can be found using the [doctl CLI](https://docs.digitalocean.com/reference/doctl/reference/apps/list-buildpacks/)
     * 
     */
    private @Nullable List<String> features;
    private @Nullable List<AppSpecFunction> functions;
    /**
     * @return Specification for component routing, rewrites, and redirects.
     * 
     */
    private @Nullable AppSpecIngress ingress;
    private @Nullable List<AppSpecJob> jobs;
    /**
     * @return The name of the component.
     * 
     */
    private String name;
    /**
     * @return The slug for the DigitalOcean data center region hosting the app.
     * 
     */
    private @Nullable String region;
    private @Nullable List<AppSpecService> services;
    private @Nullable List<AppSpecStaticSite> staticSites;
    private @Nullable List<AppSpecWorker> workers;

    private AppSpec() {}
    /**
     * @return Describes an alert policy for the component.
     * 
     */
    public List<AppSpecAlert> alerts() {
        return this.alerts == null ? List.of() : this.alerts;
    }
    public List<AppSpecDatabase> databases() {
        return this.databases == null ? List.of() : this.databases;
    }
    /**
     * @return A boolean indicating whether to disable the edge cache for this app. Default: `false`. Available only for non-static sites. Requires custom domains and applies to all the domains of the app.
     * 
     */
    public Optional<Boolean> disableEdgeCache() {
        return Optional.ofNullable(this.disableEdgeCache);
    }
    /**
     * @return A boolean indicating whether to disable email obfuscation for this app. Default: `false`. Requires custom domains and applies to all the domains of the app.
     * 
     */
    public Optional<Boolean> disableEmailObfuscation() {
        return Optional.ofNullable(this.disableEmailObfuscation);
    }
    /**
     * @return Describes a domain where the application will be made available.
     * 
     */
    public List<AppSpecDomainName> domainNames() {
        return this.domainNames == null ? List.of() : this.domainNames;
    }
    /**
     * @deprecated
     * This attribute has been replaced by `domain` which supports additional functionality.
     * 
     */
    @Deprecated /* This attribute has been replaced by `domain` which supports additional functionality. */
    public List<String> domains() {
        return this.domains == null ? List.of() : this.domains;
    }
    /**
     * @return Specification for app egress configurations.
     * 
     */
    public List<AppSpecEgress> egresses() {
        return this.egresses == null ? List.of() : this.egresses;
    }
    /**
     * @return A boolean, when set to `true`, enables enhanced analyzing of incoming traffic to prevent layer 7 DDoS attacks. Default: `false`. Requires custom domains and applies to all the domains of the app.
     * 
     */
    public Optional<Boolean> enhancedThreatControlEnabled() {
        return Optional.ofNullable(this.enhancedThreatControlEnabled);
    }
    /**
     * @return Describes an environment variable made available to an app competent.
     * 
     */
    public List<AppSpecEnv> envs() {
        return this.envs == null ? List.of() : this.envs;
    }
    /**
     * @return A list of the features applied to the app. The default buildpack can be overridden here. List of available buildpacks can be found using the [doctl CLI](https://docs.digitalocean.com/reference/doctl/reference/apps/list-buildpacks/)
     * 
     */
    public List<String> features() {
        return this.features == null ? List.of() : this.features;
    }
    public List<AppSpecFunction> functions() {
        return this.functions == null ? List.of() : this.functions;
    }
    /**
     * @return Specification for component routing, rewrites, and redirects.
     * 
     */
    public Optional<AppSpecIngress> ingress() {
        return Optional.ofNullable(this.ingress);
    }
    public List<AppSpecJob> jobs() {
        return this.jobs == null ? List.of() : this.jobs;
    }
    /**
     * @return The name of the component.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The slug for the DigitalOcean data center region hosting the app.
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    public List<AppSpecService> services() {
        return this.services == null ? List.of() : this.services;
    }
    public List<AppSpecStaticSite> staticSites() {
        return this.staticSites == null ? List.of() : this.staticSites;
    }
    public List<AppSpecWorker> workers() {
        return this.workers == null ? List.of() : this.workers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppSpec defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<AppSpecAlert> alerts;
        private @Nullable List<AppSpecDatabase> databases;
        private @Nullable Boolean disableEdgeCache;
        private @Nullable Boolean disableEmailObfuscation;
        private @Nullable List<AppSpecDomainName> domainNames;
        private @Nullable List<String> domains;
        private @Nullable List<AppSpecEgress> egresses;
        private @Nullable Boolean enhancedThreatControlEnabled;
        private @Nullable List<AppSpecEnv> envs;
        private @Nullable List<String> features;
        private @Nullable List<AppSpecFunction> functions;
        private @Nullable AppSpecIngress ingress;
        private @Nullable List<AppSpecJob> jobs;
        private String name;
        private @Nullable String region;
        private @Nullable List<AppSpecService> services;
        private @Nullable List<AppSpecStaticSite> staticSites;
        private @Nullable List<AppSpecWorker> workers;
        public Builder() {}
        public Builder(AppSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alerts = defaults.alerts;
    	      this.databases = defaults.databases;
    	      this.disableEdgeCache = defaults.disableEdgeCache;
    	      this.disableEmailObfuscation = defaults.disableEmailObfuscation;
    	      this.domainNames = defaults.domainNames;
    	      this.domains = defaults.domains;
    	      this.egresses = defaults.egresses;
    	      this.enhancedThreatControlEnabled = defaults.enhancedThreatControlEnabled;
    	      this.envs = defaults.envs;
    	      this.features = defaults.features;
    	      this.functions = defaults.functions;
    	      this.ingress = defaults.ingress;
    	      this.jobs = defaults.jobs;
    	      this.name = defaults.name;
    	      this.region = defaults.region;
    	      this.services = defaults.services;
    	      this.staticSites = defaults.staticSites;
    	      this.workers = defaults.workers;
        }

        @CustomType.Setter
        public Builder alerts(@Nullable List<AppSpecAlert> alerts) {

            this.alerts = alerts;
            return this;
        }
        public Builder alerts(AppSpecAlert... alerts) {
            return alerts(List.of(alerts));
        }
        @CustomType.Setter
        public Builder databases(@Nullable List<AppSpecDatabase> databases) {

            this.databases = databases;
            return this;
        }
        public Builder databases(AppSpecDatabase... databases) {
            return databases(List.of(databases));
        }
        @CustomType.Setter
        public Builder disableEdgeCache(@Nullable Boolean disableEdgeCache) {

            this.disableEdgeCache = disableEdgeCache;
            return this;
        }
        @CustomType.Setter
        public Builder disableEmailObfuscation(@Nullable Boolean disableEmailObfuscation) {

            this.disableEmailObfuscation = disableEmailObfuscation;
            return this;
        }
        @CustomType.Setter
        public Builder domainNames(@Nullable List<AppSpecDomainName> domainNames) {

            this.domainNames = domainNames;
            return this;
        }
        public Builder domainNames(AppSpecDomainName... domainNames) {
            return domainNames(List.of(domainNames));
        }
        @CustomType.Setter
        public Builder domains(@Nullable List<String> domains) {

            this.domains = domains;
            return this;
        }
        public Builder domains(String... domains) {
            return domains(List.of(domains));
        }
        @CustomType.Setter
        public Builder egresses(@Nullable List<AppSpecEgress> egresses) {

            this.egresses = egresses;
            return this;
        }
        public Builder egresses(AppSpecEgress... egresses) {
            return egresses(List.of(egresses));
        }
        @CustomType.Setter
        public Builder enhancedThreatControlEnabled(@Nullable Boolean enhancedThreatControlEnabled) {

            this.enhancedThreatControlEnabled = enhancedThreatControlEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder envs(@Nullable List<AppSpecEnv> envs) {

            this.envs = envs;
            return this;
        }
        public Builder envs(AppSpecEnv... envs) {
            return envs(List.of(envs));
        }
        @CustomType.Setter
        public Builder features(@Nullable List<String> features) {

            this.features = features;
            return this;
        }
        public Builder features(String... features) {
            return features(List.of(features));
        }
        @CustomType.Setter
        public Builder functions(@Nullable List<AppSpecFunction> functions) {

            this.functions = functions;
            return this;
        }
        public Builder functions(AppSpecFunction... functions) {
            return functions(List.of(functions));
        }
        @CustomType.Setter
        public Builder ingress(@Nullable AppSpecIngress ingress) {

            this.ingress = ingress;
            return this;
        }
        @CustomType.Setter
        public Builder jobs(@Nullable List<AppSpecJob> jobs) {

            this.jobs = jobs;
            return this;
        }
        public Builder jobs(AppSpecJob... jobs) {
            return jobs(List.of(jobs));
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("AppSpec", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder region(@Nullable String region) {

            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder services(@Nullable List<AppSpecService> services) {

            this.services = services;
            return this;
        }
        public Builder services(AppSpecService... services) {
            return services(List.of(services));
        }
        @CustomType.Setter
        public Builder staticSites(@Nullable List<AppSpecStaticSite> staticSites) {

            this.staticSites = staticSites;
            return this;
        }
        public Builder staticSites(AppSpecStaticSite... staticSites) {
            return staticSites(List.of(staticSites));
        }
        @CustomType.Setter
        public Builder workers(@Nullable List<AppSpecWorker> workers) {

            this.workers = workers;
            return this;
        }
        public Builder workers(AppSpecWorker... workers) {
            return workers(List.of(workers));
        }
        public AppSpec build() {
            final var _resultValue = new AppSpec();
            _resultValue.alerts = alerts;
            _resultValue.databases = databases;
            _resultValue.disableEdgeCache = disableEdgeCache;
            _resultValue.disableEmailObfuscation = disableEmailObfuscation;
            _resultValue.domainNames = domainNames;
            _resultValue.domains = domains;
            _resultValue.egresses = egresses;
            _resultValue.enhancedThreatControlEnabled = enhancedThreatControlEnabled;
            _resultValue.envs = envs;
            _resultValue.features = features;
            _resultValue.functions = functions;
            _resultValue.ingress = ingress;
            _resultValue.jobs = jobs;
            _resultValue.name = name;
            _resultValue.region = region;
            _resultValue.services = services;
            _resultValue.staticSites = staticSites;
            _resultValue.workers = workers;
            return _resultValue;
        }
    }
}
