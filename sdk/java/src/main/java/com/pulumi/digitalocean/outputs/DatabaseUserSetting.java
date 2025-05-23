// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.digitalocean.outputs.DatabaseUserSettingAcl;
import com.pulumi.digitalocean.outputs.DatabaseUserSettingOpensearchAcl;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class DatabaseUserSetting {
    /**
     * @return A set of ACLs (Access Control Lists) specifying permission on topics with a Kafka cluster. The properties of an individual ACL are described below:
     * 
     * An individual ACL includes the following:
     * 
     */
    private @Nullable List<DatabaseUserSettingAcl> acls;
    private @Nullable List<DatabaseUserSettingOpensearchAcl> opensearchAcls;

    private DatabaseUserSetting() {}
    /**
     * @return A set of ACLs (Access Control Lists) specifying permission on topics with a Kafka cluster. The properties of an individual ACL are described below:
     * 
     * An individual ACL includes the following:
     * 
     */
    public List<DatabaseUserSettingAcl> acls() {
        return this.acls == null ? List.of() : this.acls;
    }
    public List<DatabaseUserSettingOpensearchAcl> opensearchAcls() {
        return this.opensearchAcls == null ? List.of() : this.opensearchAcls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseUserSetting defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<DatabaseUserSettingAcl> acls;
        private @Nullable List<DatabaseUserSettingOpensearchAcl> opensearchAcls;
        public Builder() {}
        public Builder(DatabaseUserSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acls = defaults.acls;
    	      this.opensearchAcls = defaults.opensearchAcls;
        }

        @CustomType.Setter
        public Builder acls(@Nullable List<DatabaseUserSettingAcl> acls) {

            this.acls = acls;
            return this;
        }
        public Builder acls(DatabaseUserSettingAcl... acls) {
            return acls(List.of(acls));
        }
        @CustomType.Setter
        public Builder opensearchAcls(@Nullable List<DatabaseUserSettingOpensearchAcl> opensearchAcls) {

            this.opensearchAcls = opensearchAcls;
            return this;
        }
        public Builder opensearchAcls(DatabaseUserSettingOpensearchAcl... opensearchAcls) {
            return opensearchAcls(List.of(opensearchAcls));
        }
        public DatabaseUserSetting build() {
            final var _resultValue = new DatabaseUserSetting();
            _resultValue.acls = acls;
            _resultValue.opensearchAcls = opensearchAcls;
            return _resultValue;
        }
    }
}
