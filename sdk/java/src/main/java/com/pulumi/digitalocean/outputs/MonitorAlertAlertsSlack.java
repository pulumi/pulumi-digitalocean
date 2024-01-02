// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MonitorAlertAlertsSlack {
    private String channel;
    private String url;

    private MonitorAlertAlertsSlack() {}
    public String channel() {
        return this.channel;
    }
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitorAlertAlertsSlack defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String channel;
        private String url;
        public Builder() {}
        public Builder(MonitorAlertAlertsSlack defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channel = defaults.channel;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder channel(String channel) {
            if (channel == null) {
              throw new MissingRequiredPropertyException("MonitorAlertAlertsSlack", "channel");
            }
            this.channel = channel;
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            if (url == null) {
              throw new MissingRequiredPropertyException("MonitorAlertAlertsSlack", "url");
            }
            this.url = url;
            return this;
        }
        public MonitorAlertAlertsSlack build() {
            final var _resultValue = new MonitorAlertAlertsSlack();
            _resultValue.channel = channel;
            _resultValue.url = url;
            return _resultValue;
        }
    }
}
