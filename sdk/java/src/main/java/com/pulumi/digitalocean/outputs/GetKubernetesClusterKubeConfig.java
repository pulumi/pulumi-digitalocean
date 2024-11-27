// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetKubernetesClusterKubeConfig {
    /**
     * @return The base64 encoded public certificate used by clients to access the cluster. Only available if token authentication is not supported on your cluster.
     * 
     */
    private String clientCertificate;
    /**
     * @return The base64 encoded private key used by clients to access the cluster. Only available if token authentication is not supported on your cluster.
     * 
     */
    private String clientKey;
    /**
     * @return The base64 encoded public certificate for the cluster&#39;s certificate authority.
     * 
     */
    private String clusterCaCertificate;
    /**
     * @return The date and time when the credentials will expire and need to be regenerated.
     * 
     */
    private String expiresAt;
    /**
     * @return The URL of the API server on the Kubernetes master node.
     * 
     */
    private String host;
    /**
     * @return The full contents of the Kubernetes cluster&#39;s kubeconfig file.
     * 
     */
    private String rawConfig;
    /**
     * @return The DigitalOcean API access token used by clients to access the cluster.
     * 
     */
    private String token;

    private GetKubernetesClusterKubeConfig() {}
    /**
     * @return The base64 encoded public certificate used by clients to access the cluster. Only available if token authentication is not supported on your cluster.
     * 
     */
    public String clientCertificate() {
        return this.clientCertificate;
    }
    /**
     * @return The base64 encoded private key used by clients to access the cluster. Only available if token authentication is not supported on your cluster.
     * 
     */
    public String clientKey() {
        return this.clientKey;
    }
    /**
     * @return The base64 encoded public certificate for the cluster&#39;s certificate authority.
     * 
     */
    public String clusterCaCertificate() {
        return this.clusterCaCertificate;
    }
    /**
     * @return The date and time when the credentials will expire and need to be regenerated.
     * 
     */
    public String expiresAt() {
        return this.expiresAt;
    }
    /**
     * @return The URL of the API server on the Kubernetes master node.
     * 
     */
    public String host() {
        return this.host;
    }
    /**
     * @return The full contents of the Kubernetes cluster&#39;s kubeconfig file.
     * 
     */
    public String rawConfig() {
        return this.rawConfig;
    }
    /**
     * @return The DigitalOcean API access token used by clients to access the cluster.
     * 
     */
    public String token() {
        return this.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKubernetesClusterKubeConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String clientCertificate;
        private String clientKey;
        private String clusterCaCertificate;
        private String expiresAt;
        private String host;
        private String rawConfig;
        private String token;
        public Builder() {}
        public Builder(GetKubernetesClusterKubeConfig defaults) {
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
        public Builder clientCertificate(String clientCertificate) {
            if (clientCertificate == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClusterKubeConfig", "clientCertificate");
            }
            this.clientCertificate = clientCertificate;
            return this;
        }
        @CustomType.Setter
        public Builder clientKey(String clientKey) {
            if (clientKey == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClusterKubeConfig", "clientKey");
            }
            this.clientKey = clientKey;
            return this;
        }
        @CustomType.Setter
        public Builder clusterCaCertificate(String clusterCaCertificate) {
            if (clusterCaCertificate == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClusterKubeConfig", "clusterCaCertificate");
            }
            this.clusterCaCertificate = clusterCaCertificate;
            return this;
        }
        @CustomType.Setter
        public Builder expiresAt(String expiresAt) {
            if (expiresAt == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClusterKubeConfig", "expiresAt");
            }
            this.expiresAt = expiresAt;
            return this;
        }
        @CustomType.Setter
        public Builder host(String host) {
            if (host == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClusterKubeConfig", "host");
            }
            this.host = host;
            return this;
        }
        @CustomType.Setter
        public Builder rawConfig(String rawConfig) {
            if (rawConfig == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClusterKubeConfig", "rawConfig");
            }
            this.rawConfig = rawConfig;
            return this;
        }
        @CustomType.Setter
        public Builder token(String token) {
            if (token == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClusterKubeConfig", "token");
            }
            this.token = token;
            return this;
        }
        public GetKubernetesClusterKubeConfig build() {
            final var _resultValue = new GetKubernetesClusterKubeConfig();
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