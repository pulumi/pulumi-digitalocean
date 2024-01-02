// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KubernetesClusterKubeConfig {
    /**
     * @return The base64 encoded public certificate used by clients to access the cluster. Only available if token authentication is not supported on your cluster.
     * 
     */
    private @Nullable String clientCertificate;
    /**
     * @return The base64 encoded private key used by clients to access the cluster. Only available if token authentication is not supported on your cluster.
     * 
     */
    private @Nullable String clientKey;
    /**
     * @return The base64 encoded public certificate for the cluster&#39;s certificate authority.
     * 
     */
    private @Nullable String clusterCaCertificate;
    /**
     * @return The date and time when the credentials will expire and need to be regenerated.
     * 
     */
    private @Nullable String expiresAt;
    /**
     * @return The URL of the API server on the Kubernetes master node.
     * 
     */
    private @Nullable String host;
    /**
     * @return The full contents of the Kubernetes cluster&#39;s kubeconfig file.
     * 
     */
    private @Nullable String rawConfig;
    /**
     * @return The DigitalOcean API access token used by clients to access the cluster.
     * 
     */
    private @Nullable String token;

    private KubernetesClusterKubeConfig() {}
    /**
     * @return The base64 encoded public certificate used by clients to access the cluster. Only available if token authentication is not supported on your cluster.
     * 
     */
    public Optional<String> clientCertificate() {
        return Optional.ofNullable(this.clientCertificate);
    }
    /**
     * @return The base64 encoded private key used by clients to access the cluster. Only available if token authentication is not supported on your cluster.
     * 
     */
    public Optional<String> clientKey() {
        return Optional.ofNullable(this.clientKey);
    }
    /**
     * @return The base64 encoded public certificate for the cluster&#39;s certificate authority.
     * 
     */
    public Optional<String> clusterCaCertificate() {
        return Optional.ofNullable(this.clusterCaCertificate);
    }
    /**
     * @return The date and time when the credentials will expire and need to be regenerated.
     * 
     */
    public Optional<String> expiresAt() {
        return Optional.ofNullable(this.expiresAt);
    }
    /**
     * @return The URL of the API server on the Kubernetes master node.
     * 
     */
    public Optional<String> host() {
        return Optional.ofNullable(this.host);
    }
    /**
     * @return The full contents of the Kubernetes cluster&#39;s kubeconfig file.
     * 
     */
    public Optional<String> rawConfig() {
        return Optional.ofNullable(this.rawConfig);
    }
    /**
     * @return The DigitalOcean API access token used by clients to access the cluster.
     * 
     */
    public Optional<String> token() {
        return Optional.ofNullable(this.token);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesClusterKubeConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String clientCertificate;
        private @Nullable String clientKey;
        private @Nullable String clusterCaCertificate;
        private @Nullable String expiresAt;
        private @Nullable String host;
        private @Nullable String rawConfig;
        private @Nullable String token;
        public Builder() {}
        public Builder(KubernetesClusterKubeConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientCertificate = defaults.clientCertificate;
    	      this.clientKey = defaults.clientKey;
    	      this.clusterCaCertificate = defaults.clusterCaCertificate;
    	      this.expiresAt = defaults.expiresAt;
    	      this.host = defaults.host;
    	      this.rawConfig = defaults.rawConfig;
    	      this.token = defaults.token;
        }

        @CustomType.Setter
        public Builder clientCertificate(@Nullable String clientCertificate) {

            this.clientCertificate = clientCertificate;
            return this;
        }
        @CustomType.Setter
        public Builder clientKey(@Nullable String clientKey) {

            this.clientKey = clientKey;
            return this;
        }
        @CustomType.Setter
        public Builder clusterCaCertificate(@Nullable String clusterCaCertificate) {

            this.clusterCaCertificate = clusterCaCertificate;
            return this;
        }
        @CustomType.Setter
        public Builder expiresAt(@Nullable String expiresAt) {

            this.expiresAt = expiresAt;
            return this;
        }
        @CustomType.Setter
        public Builder host(@Nullable String host) {

            this.host = host;
            return this;
        }
        @CustomType.Setter
        public Builder rawConfig(@Nullable String rawConfig) {

            this.rawConfig = rawConfig;
            return this;
        }
        @CustomType.Setter
        public Builder token(@Nullable String token) {

            this.token = token;
            return this;
        }
        public KubernetesClusterKubeConfig build() {
            final var _resultValue = new KubernetesClusterKubeConfig();
            _resultValue.clientCertificate = clientCertificate;
            _resultValue.clientKey = clientKey;
            _resultValue.clusterCaCertificate = clusterCaCertificate;
            _resultValue.expiresAt = expiresAt;
            _resultValue.host = host;
            _resultValue.rawConfig = rawConfig;
            _resultValue.token = token;
            return _resultValue;
        }
    }
}
