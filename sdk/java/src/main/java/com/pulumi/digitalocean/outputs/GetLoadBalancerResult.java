// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.digitalocean.outputs.GetLoadBalancerFirewall;
import com.pulumi.digitalocean.outputs.GetLoadBalancerForwardingRule;
import com.pulumi.digitalocean.outputs.GetLoadBalancerHealthcheck;
import com.pulumi.digitalocean.outputs.GetLoadBalancerStickySession;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetLoadBalancerResult {
    private String algorithm;
    private Boolean disableLetsEncryptDnsRecords;
    private List<Integer> dropletIds;
    private String dropletTag;
    private Boolean enableBackendKeepalive;
    private Boolean enableProxyProtocol;
    private List<GetLoadBalancerFirewall> firewalls;
    private List<GetLoadBalancerForwardingRule> forwardingRules;
    private List<GetLoadBalancerHealthcheck> healthchecks;
    private Integer httpIdleTimeoutSeconds;
    private @Nullable String id;
    private String ip;
    private String loadBalancerUrn;
    private @Nullable String name;
    private String projectId;
    private Boolean redirectHttpToHttps;
    private String region;
    private String size;
    private Integer sizeUnit;
    private String status;
    private List<GetLoadBalancerStickySession> stickySessions;
    private String type;
    private String vpcUuid;

    private GetLoadBalancerResult() {}
    public String algorithm() {
        return this.algorithm;
    }
    public Boolean disableLetsEncryptDnsRecords() {
        return this.disableLetsEncryptDnsRecords;
    }
    public List<Integer> dropletIds() {
        return this.dropletIds;
    }
    public String dropletTag() {
        return this.dropletTag;
    }
    public Boolean enableBackendKeepalive() {
        return this.enableBackendKeepalive;
    }
    public Boolean enableProxyProtocol() {
        return this.enableProxyProtocol;
    }
    public List<GetLoadBalancerFirewall> firewalls() {
        return this.firewalls;
    }
    public List<GetLoadBalancerForwardingRule> forwardingRules() {
        return this.forwardingRules;
    }
    public List<GetLoadBalancerHealthcheck> healthchecks() {
        return this.healthchecks;
    }
    public Integer httpIdleTimeoutSeconds() {
        return this.httpIdleTimeoutSeconds;
    }
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    public String ip() {
        return this.ip;
    }
    public String loadBalancerUrn() {
        return this.loadBalancerUrn;
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public String projectId() {
        return this.projectId;
    }
    public Boolean redirectHttpToHttps() {
        return this.redirectHttpToHttps;
    }
    public String region() {
        return this.region;
    }
    public String size() {
        return this.size;
    }
    public Integer sizeUnit() {
        return this.sizeUnit;
    }
    public String status() {
        return this.status;
    }
    public List<GetLoadBalancerStickySession> stickySessions() {
        return this.stickySessions;
    }
    public String type() {
        return this.type;
    }
    public String vpcUuid() {
        return this.vpcUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancerResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String algorithm;
        private Boolean disableLetsEncryptDnsRecords;
        private List<Integer> dropletIds;
        private String dropletTag;
        private Boolean enableBackendKeepalive;
        private Boolean enableProxyProtocol;
        private List<GetLoadBalancerFirewall> firewalls;
        private List<GetLoadBalancerForwardingRule> forwardingRules;
        private List<GetLoadBalancerHealthcheck> healthchecks;
        private Integer httpIdleTimeoutSeconds;
        private @Nullable String id;
        private String ip;
        private String loadBalancerUrn;
        private @Nullable String name;
        private String projectId;
        private Boolean redirectHttpToHttps;
        private String region;
        private String size;
        private Integer sizeUnit;
        private String status;
        private List<GetLoadBalancerStickySession> stickySessions;
        private String type;
        private String vpcUuid;
        public Builder() {}
        public Builder(GetLoadBalancerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.disableLetsEncryptDnsRecords = defaults.disableLetsEncryptDnsRecords;
    	      this.dropletIds = defaults.dropletIds;
    	      this.dropletTag = defaults.dropletTag;
    	      this.enableBackendKeepalive = defaults.enableBackendKeepalive;
    	      this.enableProxyProtocol = defaults.enableProxyProtocol;
    	      this.firewalls = defaults.firewalls;
    	      this.forwardingRules = defaults.forwardingRules;
    	      this.healthchecks = defaults.healthchecks;
    	      this.httpIdleTimeoutSeconds = defaults.httpIdleTimeoutSeconds;
    	      this.id = defaults.id;
    	      this.ip = defaults.ip;
    	      this.loadBalancerUrn = defaults.loadBalancerUrn;
    	      this.name = defaults.name;
    	      this.projectId = defaults.projectId;
    	      this.redirectHttpToHttps = defaults.redirectHttpToHttps;
    	      this.region = defaults.region;
    	      this.size = defaults.size;
    	      this.sizeUnit = defaults.sizeUnit;
    	      this.status = defaults.status;
    	      this.stickySessions = defaults.stickySessions;
    	      this.type = defaults.type;
    	      this.vpcUuid = defaults.vpcUuid;
        }

        @CustomType.Setter
        public Builder algorithm(String algorithm) {
            this.algorithm = Objects.requireNonNull(algorithm);
            return this;
        }
        @CustomType.Setter
        public Builder disableLetsEncryptDnsRecords(Boolean disableLetsEncryptDnsRecords) {
            this.disableLetsEncryptDnsRecords = Objects.requireNonNull(disableLetsEncryptDnsRecords);
            return this;
        }
        @CustomType.Setter
        public Builder dropletIds(List<Integer> dropletIds) {
            this.dropletIds = Objects.requireNonNull(dropletIds);
            return this;
        }
        public Builder dropletIds(Integer... dropletIds) {
            return dropletIds(List.of(dropletIds));
        }
        @CustomType.Setter
        public Builder dropletTag(String dropletTag) {
            this.dropletTag = Objects.requireNonNull(dropletTag);
            return this;
        }
        @CustomType.Setter
        public Builder enableBackendKeepalive(Boolean enableBackendKeepalive) {
            this.enableBackendKeepalive = Objects.requireNonNull(enableBackendKeepalive);
            return this;
        }
        @CustomType.Setter
        public Builder enableProxyProtocol(Boolean enableProxyProtocol) {
            this.enableProxyProtocol = Objects.requireNonNull(enableProxyProtocol);
            return this;
        }
        @CustomType.Setter
        public Builder firewalls(List<GetLoadBalancerFirewall> firewalls) {
            this.firewalls = Objects.requireNonNull(firewalls);
            return this;
        }
        public Builder firewalls(GetLoadBalancerFirewall... firewalls) {
            return firewalls(List.of(firewalls));
        }
        @CustomType.Setter
        public Builder forwardingRules(List<GetLoadBalancerForwardingRule> forwardingRules) {
            this.forwardingRules = Objects.requireNonNull(forwardingRules);
            return this;
        }
        public Builder forwardingRules(GetLoadBalancerForwardingRule... forwardingRules) {
            return forwardingRules(List.of(forwardingRules));
        }
        @CustomType.Setter
        public Builder healthchecks(List<GetLoadBalancerHealthcheck> healthchecks) {
            this.healthchecks = Objects.requireNonNull(healthchecks);
            return this;
        }
        public Builder healthchecks(GetLoadBalancerHealthcheck... healthchecks) {
            return healthchecks(List.of(healthchecks));
        }
        @CustomType.Setter
        public Builder httpIdleTimeoutSeconds(Integer httpIdleTimeoutSeconds) {
            this.httpIdleTimeoutSeconds = Objects.requireNonNull(httpIdleTimeoutSeconds);
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ip(String ip) {
            this.ip = Objects.requireNonNull(ip);
            return this;
        }
        @CustomType.Setter
        public Builder loadBalancerUrn(String loadBalancerUrn) {
            this.loadBalancerUrn = Objects.requireNonNull(loadBalancerUrn);
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        @CustomType.Setter
        public Builder redirectHttpToHttps(Boolean redirectHttpToHttps) {
            this.redirectHttpToHttps = Objects.requireNonNull(redirectHttpToHttps);
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        @CustomType.Setter
        public Builder size(String size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }
        @CustomType.Setter
        public Builder sizeUnit(Integer sizeUnit) {
            this.sizeUnit = Objects.requireNonNull(sizeUnit);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder stickySessions(List<GetLoadBalancerStickySession> stickySessions) {
            this.stickySessions = Objects.requireNonNull(stickySessions);
            return this;
        }
        public Builder stickySessions(GetLoadBalancerStickySession... stickySessions) {
            return stickySessions(List.of(stickySessions));
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder vpcUuid(String vpcUuid) {
            this.vpcUuid = Objects.requireNonNull(vpcUuid);
            return this;
        }
        public GetLoadBalancerResult build() {
            final var _resultValue = new GetLoadBalancerResult();
            _resultValue.algorithm = algorithm;
            _resultValue.disableLetsEncryptDnsRecords = disableLetsEncryptDnsRecords;
            _resultValue.dropletIds = dropletIds;
            _resultValue.dropletTag = dropletTag;
            _resultValue.enableBackendKeepalive = enableBackendKeepalive;
            _resultValue.enableProxyProtocol = enableProxyProtocol;
            _resultValue.firewalls = firewalls;
            _resultValue.forwardingRules = forwardingRules;
            _resultValue.healthchecks = healthchecks;
            _resultValue.httpIdleTimeoutSeconds = httpIdleTimeoutSeconds;
            _resultValue.id = id;
            _resultValue.ip = ip;
            _resultValue.loadBalancerUrn = loadBalancerUrn;
            _resultValue.name = name;
            _resultValue.projectId = projectId;
            _resultValue.redirectHttpToHttps = redirectHttpToHttps;
            _resultValue.region = region;
            _resultValue.size = size;
            _resultValue.sizeUnit = sizeUnit;
            _resultValue.status = status;
            _resultValue.stickySessions = stickySessions;
            _resultValue.type = type;
            _resultValue.vpcUuid = vpcUuid;
            return _resultValue;
        }
    }
}
