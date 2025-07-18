// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as enums from "./types/enums";
import * as utilities from "./utilities";

export function getGenaiAgent(args: GetGenaiAgentArgs, opts?: pulumi.InvokeOptions): Promise<GetGenaiAgentResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("digitalocean:index/getGenaiAgent:getGenaiAgent", {
        "agentGuardrails": args.agentGuardrails,
        "agentId": args.agentId,
        "anthropicApiKeys": args.anthropicApiKeys,
        "apiKeyInfos": args.apiKeyInfos,
        "apiKeys": args.apiKeys,
        "chatbotIdentifiers": args.chatbotIdentifiers,
        "chatbots": args.chatbots,
        "deployments": args.deployments,
        "description": args.description,
        "functions": args.functions,
        "ifCase": args.ifCase,
        "k": args.k,
        "knowledgeBases": args.knowledgeBases,
        "maxTokens": args.maxTokens,
        "models": args.models,
        "openAiApiKeys": args.openAiApiKeys,
        "retrievalMethod": args.retrievalMethod,
        "routeCreatedBy": args.routeCreatedBy,
        "routeName": args.routeName,
        "routeUuid": args.routeUuid,
        "tags": args.tags,
        "temperature": args.temperature,
        "templates": args.templates,
        "topP": args.topP,
        "url": args.url,
        "userId": args.userId,
    }, opts);
}

/**
 * A collection of arguments for invoking getGenaiAgent.
 */
export interface GetGenaiAgentArgs {
    agentGuardrails?: inputs.GetGenaiAgentAgentGuardrail[];
    agentId: string;
    anthropicApiKeys?: inputs.GetGenaiAgentAnthropicApiKey[];
    apiKeyInfos?: inputs.GetGenaiAgentApiKeyInfo[];
    apiKeys?: inputs.GetGenaiAgentApiKey[];
    chatbotIdentifiers?: inputs.GetGenaiAgentChatbotIdentifier[];
    chatbots?: inputs.GetGenaiAgentChatbot[];
    deployments?: inputs.GetGenaiAgentDeployment[];
    description?: string;
    functions?: inputs.GetGenaiAgentFunction[];
    ifCase?: string;
    k?: number;
    knowledgeBases?: inputs.GetGenaiAgentKnowledgeBase[];
    maxTokens?: number;
    models?: inputs.GetGenaiAgentModel[];
    openAiApiKeys?: inputs.GetGenaiAgentOpenAiApiKey[];
    retrievalMethod?: string;
    routeCreatedBy?: string;
    routeName?: string;
    routeUuid?: string;
    tags?: string[];
    temperature?: number;
    templates?: inputs.GetGenaiAgentTemplate[];
    topP?: number;
    url?: string;
    userId?: string;
}

/**
 * A collection of values returned by getGenaiAgent.
 */
export interface GetGenaiAgentResult {
    readonly agentGuardrails?: outputs.GetGenaiAgentAgentGuardrail[];
    readonly agentId: string;
    readonly anthropicApiKeys?: outputs.GetGenaiAgentAnthropicApiKey[];
    readonly apiKeyInfos?: outputs.GetGenaiAgentApiKeyInfo[];
    readonly apiKeys?: outputs.GetGenaiAgentApiKey[];
    readonly chatbotIdentifiers?: outputs.GetGenaiAgentChatbotIdentifier[];
    readonly chatbots?: outputs.GetGenaiAgentChatbot[];
    readonly childAgents: outputs.GetGenaiAgentChildAgent[];
    readonly createdAt: string;
    readonly deployments?: outputs.GetGenaiAgentDeployment[];
    readonly description?: string;
    readonly functions?: outputs.GetGenaiAgentFunction[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ifCase?: string;
    readonly instruction: string;
    readonly k?: number;
    readonly knowledgeBases?: outputs.GetGenaiAgentKnowledgeBase[];
    readonly maxTokens?: number;
    readonly modelUuid: string;
    readonly models: outputs.GetGenaiAgentModel[];
    readonly name: string;
    readonly openAiApiKeys?: outputs.GetGenaiAgentOpenAiApiKey[];
    readonly parentAgents: outputs.GetGenaiAgentParentAgent[];
    readonly projectId: string;
    readonly region: string;
    readonly retrievalMethod?: string;
    readonly routeCreatedAt: string;
    readonly routeCreatedBy?: string;
    readonly routeName?: string;
    readonly routeUuid?: string;
    readonly tags?: string[];
    readonly temperature?: number;
    readonly templates?: outputs.GetGenaiAgentTemplate[];
    readonly topP?: number;
    readonly updatedAt: string;
    readonly url?: string;
    readonly userId?: string;
}
export function getGenaiAgentOutput(args: GetGenaiAgentOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetGenaiAgentResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("digitalocean:index/getGenaiAgent:getGenaiAgent", {
        "agentGuardrails": args.agentGuardrails,
        "agentId": args.agentId,
        "anthropicApiKeys": args.anthropicApiKeys,
        "apiKeyInfos": args.apiKeyInfos,
        "apiKeys": args.apiKeys,
        "chatbotIdentifiers": args.chatbotIdentifiers,
        "chatbots": args.chatbots,
        "deployments": args.deployments,
        "description": args.description,
        "functions": args.functions,
        "ifCase": args.ifCase,
        "k": args.k,
        "knowledgeBases": args.knowledgeBases,
        "maxTokens": args.maxTokens,
        "models": args.models,
        "openAiApiKeys": args.openAiApiKeys,
        "retrievalMethod": args.retrievalMethod,
        "routeCreatedBy": args.routeCreatedBy,
        "routeName": args.routeName,
        "routeUuid": args.routeUuid,
        "tags": args.tags,
        "temperature": args.temperature,
        "templates": args.templates,
        "topP": args.topP,
        "url": args.url,
        "userId": args.userId,
    }, opts);
}

/**
 * A collection of arguments for invoking getGenaiAgent.
 */
export interface GetGenaiAgentOutputArgs {
    agentGuardrails?: pulumi.Input<pulumi.Input<inputs.GetGenaiAgentAgentGuardrailArgs>[]>;
    agentId: pulumi.Input<string>;
    anthropicApiKeys?: pulumi.Input<pulumi.Input<inputs.GetGenaiAgentAnthropicApiKeyArgs>[]>;
    apiKeyInfos?: pulumi.Input<pulumi.Input<inputs.GetGenaiAgentApiKeyInfoArgs>[]>;
    apiKeys?: pulumi.Input<pulumi.Input<inputs.GetGenaiAgentApiKeyArgs>[]>;
    chatbotIdentifiers?: pulumi.Input<pulumi.Input<inputs.GetGenaiAgentChatbotIdentifierArgs>[]>;
    chatbots?: pulumi.Input<pulumi.Input<inputs.GetGenaiAgentChatbotArgs>[]>;
    deployments?: pulumi.Input<pulumi.Input<inputs.GetGenaiAgentDeploymentArgs>[]>;
    description?: pulumi.Input<string>;
    functions?: pulumi.Input<pulumi.Input<inputs.GetGenaiAgentFunctionArgs>[]>;
    ifCase?: pulumi.Input<string>;
    k?: pulumi.Input<number>;
    knowledgeBases?: pulumi.Input<pulumi.Input<inputs.GetGenaiAgentKnowledgeBaseArgs>[]>;
    maxTokens?: pulumi.Input<number>;
    models?: pulumi.Input<pulumi.Input<inputs.GetGenaiAgentModelArgs>[]>;
    openAiApiKeys?: pulumi.Input<pulumi.Input<inputs.GetGenaiAgentOpenAiApiKeyArgs>[]>;
    retrievalMethod?: pulumi.Input<string>;
    routeCreatedBy?: pulumi.Input<string>;
    routeName?: pulumi.Input<string>;
    routeUuid?: pulumi.Input<string>;
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    temperature?: pulumi.Input<number>;
    templates?: pulumi.Input<pulumi.Input<inputs.GetGenaiAgentTemplateArgs>[]>;
    topP?: pulumi.Input<number>;
    url?: pulumi.Input<string>;
    userId?: pulumi.Input<string>;
}
