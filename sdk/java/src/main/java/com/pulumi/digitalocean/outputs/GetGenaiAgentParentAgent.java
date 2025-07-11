// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.digitalocean.outputs.GetGenaiAgentParentAgentAnthropicApiKey;
import com.pulumi.digitalocean.outputs.GetGenaiAgentParentAgentApiKey;
import com.pulumi.digitalocean.outputs.GetGenaiAgentParentAgentApiKeyInfo;
import com.pulumi.digitalocean.outputs.GetGenaiAgentParentAgentChatbot;
import com.pulumi.digitalocean.outputs.GetGenaiAgentParentAgentChatbotIdentifier;
import com.pulumi.digitalocean.outputs.GetGenaiAgentParentAgentDeployment;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetGenaiAgentParentAgent {
    /**
     * @return ID of the child agent
     * 
     */
    private String agentId;
    /**
     * @return Anthropic API Key information
     * 
     */
    private @Nullable List<GetGenaiAgentParentAgentAnthropicApiKey> anthropicApiKeys;
    /**
     * @return List of API Key Infos
     * 
     */
    private @Nullable List<GetGenaiAgentParentAgentApiKeyInfo> apiKeyInfos;
    /**
     * @return List of API Keys
     * 
     */
    private @Nullable List<GetGenaiAgentParentAgentApiKey> apiKeys;
    /**
     * @return List of Chatbot Identifiers
     * 
     */
    private @Nullable List<GetGenaiAgentParentAgentChatbotIdentifier> chatbotIdentifiers;
    /**
     * @return ChatBot configuration
     * 
     */
    private @Nullable List<GetGenaiAgentParentAgentChatbot> chatbots;
    /**
     * @return List of API Key Infos
     * 
     */
    private @Nullable List<GetGenaiAgentParentAgentDeployment> deployments;
    /**
     * @return Description for the Agent
     * 
     */
    private @Nullable String description;
    /**
     * @return Instruction for the Agent
     * 
     */
    private String instruction;
    /**
     * @return Model UUID of the Agent
     * 
     */
    private String modelUuid;
    /**
     * @return Name of the Agent
     * 
     */
    private String name;
    /**
     * @return Project ID of the Agent
     * 
     */
    private String projectId;
    /**
     * @return Region where the Agent is deployed
     * 
     */
    private String region;

    private GetGenaiAgentParentAgent() {}
    /**
     * @return ID of the child agent
     * 
     */
    public String agentId() {
        return this.agentId;
    }
    /**
     * @return Anthropic API Key information
     * 
     */
    public List<GetGenaiAgentParentAgentAnthropicApiKey> anthropicApiKeys() {
        return this.anthropicApiKeys == null ? List.of() : this.anthropicApiKeys;
    }
    /**
     * @return List of API Key Infos
     * 
     */
    public List<GetGenaiAgentParentAgentApiKeyInfo> apiKeyInfos() {
        return this.apiKeyInfos == null ? List.of() : this.apiKeyInfos;
    }
    /**
     * @return List of API Keys
     * 
     */
    public List<GetGenaiAgentParentAgentApiKey> apiKeys() {
        return this.apiKeys == null ? List.of() : this.apiKeys;
    }
    /**
     * @return List of Chatbot Identifiers
     * 
     */
    public List<GetGenaiAgentParentAgentChatbotIdentifier> chatbotIdentifiers() {
        return this.chatbotIdentifiers == null ? List.of() : this.chatbotIdentifiers;
    }
    /**
     * @return ChatBot configuration
     * 
     */
    public List<GetGenaiAgentParentAgentChatbot> chatbots() {
        return this.chatbots == null ? List.of() : this.chatbots;
    }
    /**
     * @return List of API Key Infos
     * 
     */
    public List<GetGenaiAgentParentAgentDeployment> deployments() {
        return this.deployments == null ? List.of() : this.deployments;
    }
    /**
     * @return Description for the Agent
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Instruction for the Agent
     * 
     */
    public String instruction() {
        return this.instruction;
    }
    /**
     * @return Model UUID of the Agent
     * 
     */
    public String modelUuid() {
        return this.modelUuid;
    }
    /**
     * @return Name of the Agent
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Project ID of the Agent
     * 
     */
    public String projectId() {
        return this.projectId;
    }
    /**
     * @return Region where the Agent is deployed
     * 
     */
    public String region() {
        return this.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGenaiAgentParentAgent defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String agentId;
        private @Nullable List<GetGenaiAgentParentAgentAnthropicApiKey> anthropicApiKeys;
        private @Nullable List<GetGenaiAgentParentAgentApiKeyInfo> apiKeyInfos;
        private @Nullable List<GetGenaiAgentParentAgentApiKey> apiKeys;
        private @Nullable List<GetGenaiAgentParentAgentChatbotIdentifier> chatbotIdentifiers;
        private @Nullable List<GetGenaiAgentParentAgentChatbot> chatbots;
        private @Nullable List<GetGenaiAgentParentAgentDeployment> deployments;
        private @Nullable String description;
        private String instruction;
        private String modelUuid;
        private String name;
        private String projectId;
        private String region;
        public Builder() {}
        public Builder(GetGenaiAgentParentAgent defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentId = defaults.agentId;
    	      this.anthropicApiKeys = defaults.anthropicApiKeys;
    	      this.apiKeyInfos = defaults.apiKeyInfos;
    	      this.apiKeys = defaults.apiKeys;
    	      this.chatbotIdentifiers = defaults.chatbotIdentifiers;
    	      this.chatbots = defaults.chatbots;
    	      this.deployments = defaults.deployments;
    	      this.description = defaults.description;
    	      this.instruction = defaults.instruction;
    	      this.modelUuid = defaults.modelUuid;
    	      this.name = defaults.name;
    	      this.projectId = defaults.projectId;
    	      this.region = defaults.region;
        }

        @CustomType.Setter
        public Builder agentId(String agentId) {
            if (agentId == null) {
              throw new MissingRequiredPropertyException("GetGenaiAgentParentAgent", "agentId");
            }
            this.agentId = agentId;
            return this;
        }
        @CustomType.Setter
        public Builder anthropicApiKeys(@Nullable List<GetGenaiAgentParentAgentAnthropicApiKey> anthropicApiKeys) {

            this.anthropicApiKeys = anthropicApiKeys;
            return this;
        }
        public Builder anthropicApiKeys(GetGenaiAgentParentAgentAnthropicApiKey... anthropicApiKeys) {
            return anthropicApiKeys(List.of(anthropicApiKeys));
        }
        @CustomType.Setter
        public Builder apiKeyInfos(@Nullable List<GetGenaiAgentParentAgentApiKeyInfo> apiKeyInfos) {

            this.apiKeyInfos = apiKeyInfos;
            return this;
        }
        public Builder apiKeyInfos(GetGenaiAgentParentAgentApiKeyInfo... apiKeyInfos) {
            return apiKeyInfos(List.of(apiKeyInfos));
        }
        @CustomType.Setter
        public Builder apiKeys(@Nullable List<GetGenaiAgentParentAgentApiKey> apiKeys) {

            this.apiKeys = apiKeys;
            return this;
        }
        public Builder apiKeys(GetGenaiAgentParentAgentApiKey... apiKeys) {
            return apiKeys(List.of(apiKeys));
        }
        @CustomType.Setter
        public Builder chatbotIdentifiers(@Nullable List<GetGenaiAgentParentAgentChatbotIdentifier> chatbotIdentifiers) {

            this.chatbotIdentifiers = chatbotIdentifiers;
            return this;
        }
        public Builder chatbotIdentifiers(GetGenaiAgentParentAgentChatbotIdentifier... chatbotIdentifiers) {
            return chatbotIdentifiers(List.of(chatbotIdentifiers));
        }
        @CustomType.Setter
        public Builder chatbots(@Nullable List<GetGenaiAgentParentAgentChatbot> chatbots) {

            this.chatbots = chatbots;
            return this;
        }
        public Builder chatbots(GetGenaiAgentParentAgentChatbot... chatbots) {
            return chatbots(List.of(chatbots));
        }
        @CustomType.Setter
        public Builder deployments(@Nullable List<GetGenaiAgentParentAgentDeployment> deployments) {

            this.deployments = deployments;
            return this;
        }
        public Builder deployments(GetGenaiAgentParentAgentDeployment... deployments) {
            return deployments(List.of(deployments));
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {

            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder instruction(String instruction) {
            if (instruction == null) {
              throw new MissingRequiredPropertyException("GetGenaiAgentParentAgent", "instruction");
            }
            this.instruction = instruction;
            return this;
        }
        @CustomType.Setter
        public Builder modelUuid(String modelUuid) {
            if (modelUuid == null) {
              throw new MissingRequiredPropertyException("GetGenaiAgentParentAgent", "modelUuid");
            }
            this.modelUuid = modelUuid;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetGenaiAgentParentAgent", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("GetGenaiAgentParentAgent", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            if (region == null) {
              throw new MissingRequiredPropertyException("GetGenaiAgentParentAgent", "region");
            }
            this.region = region;
            return this;
        }
        public GetGenaiAgentParentAgent build() {
            final var _resultValue = new GetGenaiAgentParentAgent();
            _resultValue.agentId = agentId;
            _resultValue.anthropicApiKeys = anthropicApiKeys;
            _resultValue.apiKeyInfos = apiKeyInfos;
            _resultValue.apiKeys = apiKeys;
            _resultValue.chatbotIdentifiers = chatbotIdentifiers;
            _resultValue.chatbots = chatbots;
            _resultValue.deployments = deployments;
            _resultValue.description = description;
            _resultValue.instruction = instruction;
            _resultValue.modelUuid = modelUuid;
            _resultValue.name = name;
            _resultValue.projectId = projectId;
            _resultValue.region = region;
            return _resultValue;
        }
    }
}
