// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-digitalocean/sdk/v4/go/digitalocean/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type GenaiAgent struct {
	pulumi.CustomResourceState

	// AgentGuardrail represents a Guardrail attached to Gen AI Agent
	AgentGuardrails GenaiAgentAgentGuardrailArrayOutput `pulumi:"agentGuardrails"`
	// Anthropic API Key information
	AnthropicApiKeys GenaiAgentAnthropicApiKeyArrayOutput `pulumi:"anthropicApiKeys"`
	// Optional Anthropic API key ID to use with Anthropic models
	AnthropicKeyUuid pulumi.StringPtrOutput `pulumi:"anthropicKeyUuid"`
	// List of API Key Infos
	ApiKeyInfos GenaiAgentApiKeyInfoArrayOutput `pulumi:"apiKeyInfos"`
	// List of API Keys
	ApiKeys GenaiAgentApiKeyArrayOutput `pulumi:"apiKeys"`
	// List of Chatbot Identifiers
	ChatbotIdentifiers GenaiAgentChatbotIdentifierArrayOutput `pulumi:"chatbotIdentifiers"`
	// ChatBot configuration
	Chatbots GenaiAgentChatbotArrayOutput `pulumi:"chatbots"`
	// List of child agents
	ChildAgents GenaiAgentChildAgentArrayOutput `pulumi:"childAgents"`
	// Timestamp when the Agent was created
	CreatedAt pulumi.StringPtrOutput `pulumi:"createdAt"`
	// List of API Key Infos
	Deployments GenaiAgentDeploymentArrayOutput `pulumi:"deployments"`
	// Description for the Agent
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// List of Functions
	Functions GenaiAgentFunctionArrayOutput `pulumi:"functions"`
	// If case condition
	IfCase pulumi.StringPtrOutput `pulumi:"ifCase"`
	// Instruction for the Agent
	Instruction pulumi.StringOutput `pulumi:"instruction"`
	// K value
	K pulumi.IntPtrOutput `pulumi:"k"`
	// Ids of the knowledge base(s) to attach to the agent
	KnowledgeBaseUuids pulumi.StringArrayOutput `pulumi:"knowledgeBaseUuids"`
	// List of Knowledge Bases
	KnowledgeBases GenaiAgentKnowledgeBaseArrayOutput `pulumi:"knowledgeBases"`
	// Maximum tokens allowed
	MaxTokens pulumi.IntPtrOutput `pulumi:"maxTokens"`
	// Model UUID of the Agent
	ModelUuid pulumi.StringOutput `pulumi:"modelUuid"`
	// Model of the Agent
	Models GenaiAgentModelArrayOutput `pulumi:"models"`
	// Name of the Agent
	Name pulumi.StringOutput `pulumi:"name"`
	// OpenAI API Key information
	OpenAiApiKeys GenaiAgentOpenAiApiKeyArrayOutput `pulumi:"openAiApiKeys"`
	// Optional OpenAI API key ID to use with OpenAI models
	OpenAiKeyUuid pulumi.StringPtrOutput `pulumi:"openAiKeyUuid"`
	// List of child agents
	ParentAgents GenaiAgentParentAgentArrayOutput `pulumi:"parentAgents"`
	// Project ID of the Agent
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// Indicates if the agent should provide citations in responses
	ProvideCitations pulumi.BoolPtrOutput `pulumi:"provideCitations"`
	// Region where the Agent is deployed
	Region pulumi.StringOutput `pulumi:"region"`
	// Retrieval method used
	RetrievalMethod pulumi.StringPtrOutput `pulumi:"retrievalMethod"`
	// Timestamp when the route was created
	RouteCreatedAt pulumi.StringOutput `pulumi:"routeCreatedAt"`
	// User who created the route
	RouteCreatedBy pulumi.StringPtrOutput `pulumi:"routeCreatedBy"`
	// Route name
	RouteName pulumi.StringPtrOutput `pulumi:"routeName"`
	// Route UUID
	RouteUuid pulumi.StringPtrOutput `pulumi:"routeUuid"`
	// List of Tags
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
	// Agent temperature setting
	Temperature pulumi.Float64PtrOutput `pulumi:"temperature"`
	// Agent Template
	Templates GenaiAgentTemplateArrayOutput `pulumi:"templates"`
	// Top P sampling parameter
	TopP pulumi.Float64PtrOutput `pulumi:"topP"`
	// Timestamp when the Agent was updated
	UpdatedAt pulumi.StringOutput `pulumi:"updatedAt"`
	// URL for the Agent
	Url pulumi.StringPtrOutput `pulumi:"url"`
	// User ID linked with the Agent
	UserId pulumi.StringPtrOutput `pulumi:"userId"`
}

// NewGenaiAgent registers a new resource with the given unique name, arguments, and options.
func NewGenaiAgent(ctx *pulumi.Context,
	name string, args *GenaiAgentArgs, opts ...pulumi.ResourceOption) (*GenaiAgent, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Instruction == nil {
		return nil, errors.New("invalid value for required argument 'Instruction'")
	}
	if args.ModelUuid == nil {
		return nil, errors.New("invalid value for required argument 'ModelUuid'")
	}
	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	if args.Region == nil {
		return nil, errors.New("invalid value for required argument 'Region'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource GenaiAgent
	err := ctx.RegisterResource("digitalocean:index/genaiAgent:GenaiAgent", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGenaiAgent gets an existing GenaiAgent resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGenaiAgent(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GenaiAgentState, opts ...pulumi.ResourceOption) (*GenaiAgent, error) {
	var resource GenaiAgent
	err := ctx.ReadResource("digitalocean:index/genaiAgent:GenaiAgent", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GenaiAgent resources.
type genaiAgentState struct {
	// AgentGuardrail represents a Guardrail attached to Gen AI Agent
	AgentGuardrails []GenaiAgentAgentGuardrail `pulumi:"agentGuardrails"`
	// Anthropic API Key information
	AnthropicApiKeys []GenaiAgentAnthropicApiKey `pulumi:"anthropicApiKeys"`
	// Optional Anthropic API key ID to use with Anthropic models
	AnthropicKeyUuid *string `pulumi:"anthropicKeyUuid"`
	// List of API Key Infos
	ApiKeyInfos []GenaiAgentApiKeyInfo `pulumi:"apiKeyInfos"`
	// List of API Keys
	ApiKeys []GenaiAgentApiKey `pulumi:"apiKeys"`
	// List of Chatbot Identifiers
	ChatbotIdentifiers []GenaiAgentChatbotIdentifier `pulumi:"chatbotIdentifiers"`
	// ChatBot configuration
	Chatbots []GenaiAgentChatbot `pulumi:"chatbots"`
	// List of child agents
	ChildAgents []GenaiAgentChildAgent `pulumi:"childAgents"`
	// Timestamp when the Agent was created
	CreatedAt *string `pulumi:"createdAt"`
	// List of API Key Infos
	Deployments []GenaiAgentDeployment `pulumi:"deployments"`
	// Description for the Agent
	Description *string `pulumi:"description"`
	// List of Functions
	Functions []GenaiAgentFunction `pulumi:"functions"`
	// If case condition
	IfCase *string `pulumi:"ifCase"`
	// Instruction for the Agent
	Instruction *string `pulumi:"instruction"`
	// K value
	K *int `pulumi:"k"`
	// Ids of the knowledge base(s) to attach to the agent
	KnowledgeBaseUuids []string `pulumi:"knowledgeBaseUuids"`
	// List of Knowledge Bases
	KnowledgeBases []GenaiAgentKnowledgeBase `pulumi:"knowledgeBases"`
	// Maximum tokens allowed
	MaxTokens *int `pulumi:"maxTokens"`
	// Model UUID of the Agent
	ModelUuid *string `pulumi:"modelUuid"`
	// Model of the Agent
	Models []GenaiAgentModel `pulumi:"models"`
	// Name of the Agent
	Name *string `pulumi:"name"`
	// OpenAI API Key information
	OpenAiApiKeys []GenaiAgentOpenAiApiKey `pulumi:"openAiApiKeys"`
	// Optional OpenAI API key ID to use with OpenAI models
	OpenAiKeyUuid *string `pulumi:"openAiKeyUuid"`
	// List of child agents
	ParentAgents []GenaiAgentParentAgent `pulumi:"parentAgents"`
	// Project ID of the Agent
	ProjectId *string `pulumi:"projectId"`
	// Indicates if the agent should provide citations in responses
	ProvideCitations *bool `pulumi:"provideCitations"`
	// Region where the Agent is deployed
	Region *string `pulumi:"region"`
	// Retrieval method used
	RetrievalMethod *string `pulumi:"retrievalMethod"`
	// Timestamp when the route was created
	RouteCreatedAt *string `pulumi:"routeCreatedAt"`
	// User who created the route
	RouteCreatedBy *string `pulumi:"routeCreatedBy"`
	// Route name
	RouteName *string `pulumi:"routeName"`
	// Route UUID
	RouteUuid *string `pulumi:"routeUuid"`
	// List of Tags
	Tags []string `pulumi:"tags"`
	// Agent temperature setting
	Temperature *float64 `pulumi:"temperature"`
	// Agent Template
	Templates []GenaiAgentTemplate `pulumi:"templates"`
	// Top P sampling parameter
	TopP *float64 `pulumi:"topP"`
	// Timestamp when the Agent was updated
	UpdatedAt *string `pulumi:"updatedAt"`
	// URL for the Agent
	Url *string `pulumi:"url"`
	// User ID linked with the Agent
	UserId *string `pulumi:"userId"`
}

type GenaiAgentState struct {
	// AgentGuardrail represents a Guardrail attached to Gen AI Agent
	AgentGuardrails GenaiAgentAgentGuardrailArrayInput
	// Anthropic API Key information
	AnthropicApiKeys GenaiAgentAnthropicApiKeyArrayInput
	// Optional Anthropic API key ID to use with Anthropic models
	AnthropicKeyUuid pulumi.StringPtrInput
	// List of API Key Infos
	ApiKeyInfos GenaiAgentApiKeyInfoArrayInput
	// List of API Keys
	ApiKeys GenaiAgentApiKeyArrayInput
	// List of Chatbot Identifiers
	ChatbotIdentifiers GenaiAgentChatbotIdentifierArrayInput
	// ChatBot configuration
	Chatbots GenaiAgentChatbotArrayInput
	// List of child agents
	ChildAgents GenaiAgentChildAgentArrayInput
	// Timestamp when the Agent was created
	CreatedAt pulumi.StringPtrInput
	// List of API Key Infos
	Deployments GenaiAgentDeploymentArrayInput
	// Description for the Agent
	Description pulumi.StringPtrInput
	// List of Functions
	Functions GenaiAgentFunctionArrayInput
	// If case condition
	IfCase pulumi.StringPtrInput
	// Instruction for the Agent
	Instruction pulumi.StringPtrInput
	// K value
	K pulumi.IntPtrInput
	// Ids of the knowledge base(s) to attach to the agent
	KnowledgeBaseUuids pulumi.StringArrayInput
	// List of Knowledge Bases
	KnowledgeBases GenaiAgentKnowledgeBaseArrayInput
	// Maximum tokens allowed
	MaxTokens pulumi.IntPtrInput
	// Model UUID of the Agent
	ModelUuid pulumi.StringPtrInput
	// Model of the Agent
	Models GenaiAgentModelArrayInput
	// Name of the Agent
	Name pulumi.StringPtrInput
	// OpenAI API Key information
	OpenAiApiKeys GenaiAgentOpenAiApiKeyArrayInput
	// Optional OpenAI API key ID to use with OpenAI models
	OpenAiKeyUuid pulumi.StringPtrInput
	// List of child agents
	ParentAgents GenaiAgentParentAgentArrayInput
	// Project ID of the Agent
	ProjectId pulumi.StringPtrInput
	// Indicates if the agent should provide citations in responses
	ProvideCitations pulumi.BoolPtrInput
	// Region where the Agent is deployed
	Region pulumi.StringPtrInput
	// Retrieval method used
	RetrievalMethod pulumi.StringPtrInput
	// Timestamp when the route was created
	RouteCreatedAt pulumi.StringPtrInput
	// User who created the route
	RouteCreatedBy pulumi.StringPtrInput
	// Route name
	RouteName pulumi.StringPtrInput
	// Route UUID
	RouteUuid pulumi.StringPtrInput
	// List of Tags
	Tags pulumi.StringArrayInput
	// Agent temperature setting
	Temperature pulumi.Float64PtrInput
	// Agent Template
	Templates GenaiAgentTemplateArrayInput
	// Top P sampling parameter
	TopP pulumi.Float64PtrInput
	// Timestamp when the Agent was updated
	UpdatedAt pulumi.StringPtrInput
	// URL for the Agent
	Url pulumi.StringPtrInput
	// User ID linked with the Agent
	UserId pulumi.StringPtrInput
}

func (GenaiAgentState) ElementType() reflect.Type {
	return reflect.TypeOf((*genaiAgentState)(nil)).Elem()
}

type genaiAgentArgs struct {
	// AgentGuardrail represents a Guardrail attached to Gen AI Agent
	AgentGuardrails []GenaiAgentAgentGuardrail `pulumi:"agentGuardrails"`
	// Anthropic API Key information
	AnthropicApiKeys []GenaiAgentAnthropicApiKey `pulumi:"anthropicApiKeys"`
	// Optional Anthropic API key ID to use with Anthropic models
	AnthropicKeyUuid *string `pulumi:"anthropicKeyUuid"`
	// List of API Key Infos
	ApiKeyInfos []GenaiAgentApiKeyInfo `pulumi:"apiKeyInfos"`
	// List of API Keys
	ApiKeys []GenaiAgentApiKey `pulumi:"apiKeys"`
	// List of Chatbot Identifiers
	ChatbotIdentifiers []GenaiAgentChatbotIdentifier `pulumi:"chatbotIdentifiers"`
	// ChatBot configuration
	Chatbots []GenaiAgentChatbot `pulumi:"chatbots"`
	// List of child agents
	ChildAgents []GenaiAgentChildAgent `pulumi:"childAgents"`
	// Timestamp when the Agent was created
	CreatedAt *string `pulumi:"createdAt"`
	// List of API Key Infos
	Deployments []GenaiAgentDeployment `pulumi:"deployments"`
	// Description for the Agent
	Description *string `pulumi:"description"`
	// List of Functions
	Functions []GenaiAgentFunction `pulumi:"functions"`
	// If case condition
	IfCase *string `pulumi:"ifCase"`
	// Instruction for the Agent
	Instruction string `pulumi:"instruction"`
	// K value
	K *int `pulumi:"k"`
	// Ids of the knowledge base(s) to attach to the agent
	KnowledgeBaseUuids []string `pulumi:"knowledgeBaseUuids"`
	// List of Knowledge Bases
	KnowledgeBases []GenaiAgentKnowledgeBase `pulumi:"knowledgeBases"`
	// Maximum tokens allowed
	MaxTokens *int `pulumi:"maxTokens"`
	// Model UUID of the Agent
	ModelUuid string `pulumi:"modelUuid"`
	// Model of the Agent
	Models []GenaiAgentModel `pulumi:"models"`
	// Name of the Agent
	Name *string `pulumi:"name"`
	// OpenAI API Key information
	OpenAiApiKeys []GenaiAgentOpenAiApiKey `pulumi:"openAiApiKeys"`
	// Optional OpenAI API key ID to use with OpenAI models
	OpenAiKeyUuid *string `pulumi:"openAiKeyUuid"`
	// List of child agents
	ParentAgents []GenaiAgentParentAgent `pulumi:"parentAgents"`
	// Project ID of the Agent
	ProjectId string `pulumi:"projectId"`
	// Indicates if the agent should provide citations in responses
	ProvideCitations *bool `pulumi:"provideCitations"`
	// Region where the Agent is deployed
	Region string `pulumi:"region"`
	// Retrieval method used
	RetrievalMethod *string `pulumi:"retrievalMethod"`
	// User who created the route
	RouteCreatedBy *string `pulumi:"routeCreatedBy"`
	// Route name
	RouteName *string `pulumi:"routeName"`
	// Route UUID
	RouteUuid *string `pulumi:"routeUuid"`
	// List of Tags
	Tags []string `pulumi:"tags"`
	// Agent temperature setting
	Temperature *float64 `pulumi:"temperature"`
	// Agent Template
	Templates []GenaiAgentTemplate `pulumi:"templates"`
	// Top P sampling parameter
	TopP *float64 `pulumi:"topP"`
	// URL for the Agent
	Url *string `pulumi:"url"`
	// User ID linked with the Agent
	UserId *string `pulumi:"userId"`
}

// The set of arguments for constructing a GenaiAgent resource.
type GenaiAgentArgs struct {
	// AgentGuardrail represents a Guardrail attached to Gen AI Agent
	AgentGuardrails GenaiAgentAgentGuardrailArrayInput
	// Anthropic API Key information
	AnthropicApiKeys GenaiAgentAnthropicApiKeyArrayInput
	// Optional Anthropic API key ID to use with Anthropic models
	AnthropicKeyUuid pulumi.StringPtrInput
	// List of API Key Infos
	ApiKeyInfos GenaiAgentApiKeyInfoArrayInput
	// List of API Keys
	ApiKeys GenaiAgentApiKeyArrayInput
	// List of Chatbot Identifiers
	ChatbotIdentifiers GenaiAgentChatbotIdentifierArrayInput
	// ChatBot configuration
	Chatbots GenaiAgentChatbotArrayInput
	// List of child agents
	ChildAgents GenaiAgentChildAgentArrayInput
	// Timestamp when the Agent was created
	CreatedAt pulumi.StringPtrInput
	// List of API Key Infos
	Deployments GenaiAgentDeploymentArrayInput
	// Description for the Agent
	Description pulumi.StringPtrInput
	// List of Functions
	Functions GenaiAgentFunctionArrayInput
	// If case condition
	IfCase pulumi.StringPtrInput
	// Instruction for the Agent
	Instruction pulumi.StringInput
	// K value
	K pulumi.IntPtrInput
	// Ids of the knowledge base(s) to attach to the agent
	KnowledgeBaseUuids pulumi.StringArrayInput
	// List of Knowledge Bases
	KnowledgeBases GenaiAgentKnowledgeBaseArrayInput
	// Maximum tokens allowed
	MaxTokens pulumi.IntPtrInput
	// Model UUID of the Agent
	ModelUuid pulumi.StringInput
	// Model of the Agent
	Models GenaiAgentModelArrayInput
	// Name of the Agent
	Name pulumi.StringPtrInput
	// OpenAI API Key information
	OpenAiApiKeys GenaiAgentOpenAiApiKeyArrayInput
	// Optional OpenAI API key ID to use with OpenAI models
	OpenAiKeyUuid pulumi.StringPtrInput
	// List of child agents
	ParentAgents GenaiAgentParentAgentArrayInput
	// Project ID of the Agent
	ProjectId pulumi.StringInput
	// Indicates if the agent should provide citations in responses
	ProvideCitations pulumi.BoolPtrInput
	// Region where the Agent is deployed
	Region pulumi.StringInput
	// Retrieval method used
	RetrievalMethod pulumi.StringPtrInput
	// User who created the route
	RouteCreatedBy pulumi.StringPtrInput
	// Route name
	RouteName pulumi.StringPtrInput
	// Route UUID
	RouteUuid pulumi.StringPtrInput
	// List of Tags
	Tags pulumi.StringArrayInput
	// Agent temperature setting
	Temperature pulumi.Float64PtrInput
	// Agent Template
	Templates GenaiAgentTemplateArrayInput
	// Top P sampling parameter
	TopP pulumi.Float64PtrInput
	// URL for the Agent
	Url pulumi.StringPtrInput
	// User ID linked with the Agent
	UserId pulumi.StringPtrInput
}

func (GenaiAgentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*genaiAgentArgs)(nil)).Elem()
}

type GenaiAgentInput interface {
	pulumi.Input

	ToGenaiAgentOutput() GenaiAgentOutput
	ToGenaiAgentOutputWithContext(ctx context.Context) GenaiAgentOutput
}

func (*GenaiAgent) ElementType() reflect.Type {
	return reflect.TypeOf((**GenaiAgent)(nil)).Elem()
}

func (i *GenaiAgent) ToGenaiAgentOutput() GenaiAgentOutput {
	return i.ToGenaiAgentOutputWithContext(context.Background())
}

func (i *GenaiAgent) ToGenaiAgentOutputWithContext(ctx context.Context) GenaiAgentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GenaiAgentOutput)
}

// GenaiAgentArrayInput is an input type that accepts GenaiAgentArray and GenaiAgentArrayOutput values.
// You can construct a concrete instance of `GenaiAgentArrayInput` via:
//
//	GenaiAgentArray{ GenaiAgentArgs{...} }
type GenaiAgentArrayInput interface {
	pulumi.Input

	ToGenaiAgentArrayOutput() GenaiAgentArrayOutput
	ToGenaiAgentArrayOutputWithContext(context.Context) GenaiAgentArrayOutput
}

type GenaiAgentArray []GenaiAgentInput

func (GenaiAgentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GenaiAgent)(nil)).Elem()
}

func (i GenaiAgentArray) ToGenaiAgentArrayOutput() GenaiAgentArrayOutput {
	return i.ToGenaiAgentArrayOutputWithContext(context.Background())
}

func (i GenaiAgentArray) ToGenaiAgentArrayOutputWithContext(ctx context.Context) GenaiAgentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GenaiAgentArrayOutput)
}

// GenaiAgentMapInput is an input type that accepts GenaiAgentMap and GenaiAgentMapOutput values.
// You can construct a concrete instance of `GenaiAgentMapInput` via:
//
//	GenaiAgentMap{ "key": GenaiAgentArgs{...} }
type GenaiAgentMapInput interface {
	pulumi.Input

	ToGenaiAgentMapOutput() GenaiAgentMapOutput
	ToGenaiAgentMapOutputWithContext(context.Context) GenaiAgentMapOutput
}

type GenaiAgentMap map[string]GenaiAgentInput

func (GenaiAgentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GenaiAgent)(nil)).Elem()
}

func (i GenaiAgentMap) ToGenaiAgentMapOutput() GenaiAgentMapOutput {
	return i.ToGenaiAgentMapOutputWithContext(context.Background())
}

func (i GenaiAgentMap) ToGenaiAgentMapOutputWithContext(ctx context.Context) GenaiAgentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GenaiAgentMapOutput)
}

type GenaiAgentOutput struct{ *pulumi.OutputState }

func (GenaiAgentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GenaiAgent)(nil)).Elem()
}

func (o GenaiAgentOutput) ToGenaiAgentOutput() GenaiAgentOutput {
	return o
}

func (o GenaiAgentOutput) ToGenaiAgentOutputWithContext(ctx context.Context) GenaiAgentOutput {
	return o
}

// AgentGuardrail represents a Guardrail attached to Gen AI Agent
func (o GenaiAgentOutput) AgentGuardrails() GenaiAgentAgentGuardrailArrayOutput {
	return o.ApplyT(func(v *GenaiAgent) GenaiAgentAgentGuardrailArrayOutput { return v.AgentGuardrails }).(GenaiAgentAgentGuardrailArrayOutput)
}

// Anthropic API Key information
func (o GenaiAgentOutput) AnthropicApiKeys() GenaiAgentAnthropicApiKeyArrayOutput {
	return o.ApplyT(func(v *GenaiAgent) GenaiAgentAnthropicApiKeyArrayOutput { return v.AnthropicApiKeys }).(GenaiAgentAnthropicApiKeyArrayOutput)
}

// Optional Anthropic API key ID to use with Anthropic models
func (o GenaiAgentOutput) AnthropicKeyUuid() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GenaiAgent) pulumi.StringPtrOutput { return v.AnthropicKeyUuid }).(pulumi.StringPtrOutput)
}

// List of API Key Infos
func (o GenaiAgentOutput) ApiKeyInfos() GenaiAgentApiKeyInfoArrayOutput {
	return o.ApplyT(func(v *GenaiAgent) GenaiAgentApiKeyInfoArrayOutput { return v.ApiKeyInfos }).(GenaiAgentApiKeyInfoArrayOutput)
}

// List of API Keys
func (o GenaiAgentOutput) ApiKeys() GenaiAgentApiKeyArrayOutput {
	return o.ApplyT(func(v *GenaiAgent) GenaiAgentApiKeyArrayOutput { return v.ApiKeys }).(GenaiAgentApiKeyArrayOutput)
}

// List of Chatbot Identifiers
func (o GenaiAgentOutput) ChatbotIdentifiers() GenaiAgentChatbotIdentifierArrayOutput {
	return o.ApplyT(func(v *GenaiAgent) GenaiAgentChatbotIdentifierArrayOutput { return v.ChatbotIdentifiers }).(GenaiAgentChatbotIdentifierArrayOutput)
}

// ChatBot configuration
func (o GenaiAgentOutput) Chatbots() GenaiAgentChatbotArrayOutput {
	return o.ApplyT(func(v *GenaiAgent) GenaiAgentChatbotArrayOutput { return v.Chatbots }).(GenaiAgentChatbotArrayOutput)
}

// List of child agents
func (o GenaiAgentOutput) ChildAgents() GenaiAgentChildAgentArrayOutput {
	return o.ApplyT(func(v *GenaiAgent) GenaiAgentChildAgentArrayOutput { return v.ChildAgents }).(GenaiAgentChildAgentArrayOutput)
}

// Timestamp when the Agent was created
func (o GenaiAgentOutput) CreatedAt() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GenaiAgent) pulumi.StringPtrOutput { return v.CreatedAt }).(pulumi.StringPtrOutput)
}

// List of API Key Infos
func (o GenaiAgentOutput) Deployments() GenaiAgentDeploymentArrayOutput {
	return o.ApplyT(func(v *GenaiAgent) GenaiAgentDeploymentArrayOutput { return v.Deployments }).(GenaiAgentDeploymentArrayOutput)
}

// Description for the Agent
func (o GenaiAgentOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GenaiAgent) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// List of Functions
func (o GenaiAgentOutput) Functions() GenaiAgentFunctionArrayOutput {
	return o.ApplyT(func(v *GenaiAgent) GenaiAgentFunctionArrayOutput { return v.Functions }).(GenaiAgentFunctionArrayOutput)
}

// If case condition
func (o GenaiAgentOutput) IfCase() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GenaiAgent) pulumi.StringPtrOutput { return v.IfCase }).(pulumi.StringPtrOutput)
}

// Instruction for the Agent
func (o GenaiAgentOutput) Instruction() pulumi.StringOutput {
	return o.ApplyT(func(v *GenaiAgent) pulumi.StringOutput { return v.Instruction }).(pulumi.StringOutput)
}

// K value
func (o GenaiAgentOutput) K() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *GenaiAgent) pulumi.IntPtrOutput { return v.K }).(pulumi.IntPtrOutput)
}

// Ids of the knowledge base(s) to attach to the agent
func (o GenaiAgentOutput) KnowledgeBaseUuids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *GenaiAgent) pulumi.StringArrayOutput { return v.KnowledgeBaseUuids }).(pulumi.StringArrayOutput)
}

// List of Knowledge Bases
func (o GenaiAgentOutput) KnowledgeBases() GenaiAgentKnowledgeBaseArrayOutput {
	return o.ApplyT(func(v *GenaiAgent) GenaiAgentKnowledgeBaseArrayOutput { return v.KnowledgeBases }).(GenaiAgentKnowledgeBaseArrayOutput)
}

// Maximum tokens allowed
func (o GenaiAgentOutput) MaxTokens() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *GenaiAgent) pulumi.IntPtrOutput { return v.MaxTokens }).(pulumi.IntPtrOutput)
}

// Model UUID of the Agent
func (o GenaiAgentOutput) ModelUuid() pulumi.StringOutput {
	return o.ApplyT(func(v *GenaiAgent) pulumi.StringOutput { return v.ModelUuid }).(pulumi.StringOutput)
}

// Model of the Agent
func (o GenaiAgentOutput) Models() GenaiAgentModelArrayOutput {
	return o.ApplyT(func(v *GenaiAgent) GenaiAgentModelArrayOutput { return v.Models }).(GenaiAgentModelArrayOutput)
}

// Name of the Agent
func (o GenaiAgentOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *GenaiAgent) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// OpenAI API Key information
func (o GenaiAgentOutput) OpenAiApiKeys() GenaiAgentOpenAiApiKeyArrayOutput {
	return o.ApplyT(func(v *GenaiAgent) GenaiAgentOpenAiApiKeyArrayOutput { return v.OpenAiApiKeys }).(GenaiAgentOpenAiApiKeyArrayOutput)
}

// Optional OpenAI API key ID to use with OpenAI models
func (o GenaiAgentOutput) OpenAiKeyUuid() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GenaiAgent) pulumi.StringPtrOutput { return v.OpenAiKeyUuid }).(pulumi.StringPtrOutput)
}

// List of child agents
func (o GenaiAgentOutput) ParentAgents() GenaiAgentParentAgentArrayOutput {
	return o.ApplyT(func(v *GenaiAgent) GenaiAgentParentAgentArrayOutput { return v.ParentAgents }).(GenaiAgentParentAgentArrayOutput)
}

// Project ID of the Agent
func (o GenaiAgentOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *GenaiAgent) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

// Indicates if the agent should provide citations in responses
func (o GenaiAgentOutput) ProvideCitations() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *GenaiAgent) pulumi.BoolPtrOutput { return v.ProvideCitations }).(pulumi.BoolPtrOutput)
}

// Region where the Agent is deployed
func (o GenaiAgentOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v *GenaiAgent) pulumi.StringOutput { return v.Region }).(pulumi.StringOutput)
}

// Retrieval method used
func (o GenaiAgentOutput) RetrievalMethod() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GenaiAgent) pulumi.StringPtrOutput { return v.RetrievalMethod }).(pulumi.StringPtrOutput)
}

// Timestamp when the route was created
func (o GenaiAgentOutput) RouteCreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *GenaiAgent) pulumi.StringOutput { return v.RouteCreatedAt }).(pulumi.StringOutput)
}

// User who created the route
func (o GenaiAgentOutput) RouteCreatedBy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GenaiAgent) pulumi.StringPtrOutput { return v.RouteCreatedBy }).(pulumi.StringPtrOutput)
}

// Route name
func (o GenaiAgentOutput) RouteName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GenaiAgent) pulumi.StringPtrOutput { return v.RouteName }).(pulumi.StringPtrOutput)
}

// Route UUID
func (o GenaiAgentOutput) RouteUuid() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GenaiAgent) pulumi.StringPtrOutput { return v.RouteUuid }).(pulumi.StringPtrOutput)
}

// List of Tags
func (o GenaiAgentOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *GenaiAgent) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

// Agent temperature setting
func (o GenaiAgentOutput) Temperature() pulumi.Float64PtrOutput {
	return o.ApplyT(func(v *GenaiAgent) pulumi.Float64PtrOutput { return v.Temperature }).(pulumi.Float64PtrOutput)
}

// Agent Template
func (o GenaiAgentOutput) Templates() GenaiAgentTemplateArrayOutput {
	return o.ApplyT(func(v *GenaiAgent) GenaiAgentTemplateArrayOutput { return v.Templates }).(GenaiAgentTemplateArrayOutput)
}

// Top P sampling parameter
func (o GenaiAgentOutput) TopP() pulumi.Float64PtrOutput {
	return o.ApplyT(func(v *GenaiAgent) pulumi.Float64PtrOutput { return v.TopP }).(pulumi.Float64PtrOutput)
}

// Timestamp when the Agent was updated
func (o GenaiAgentOutput) UpdatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *GenaiAgent) pulumi.StringOutput { return v.UpdatedAt }).(pulumi.StringOutput)
}

// URL for the Agent
func (o GenaiAgentOutput) Url() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GenaiAgent) pulumi.StringPtrOutput { return v.Url }).(pulumi.StringPtrOutput)
}

// User ID linked with the Agent
func (o GenaiAgentOutput) UserId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GenaiAgent) pulumi.StringPtrOutput { return v.UserId }).(pulumi.StringPtrOutput)
}

type GenaiAgentArrayOutput struct{ *pulumi.OutputState }

func (GenaiAgentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GenaiAgent)(nil)).Elem()
}

func (o GenaiAgentArrayOutput) ToGenaiAgentArrayOutput() GenaiAgentArrayOutput {
	return o
}

func (o GenaiAgentArrayOutput) ToGenaiAgentArrayOutputWithContext(ctx context.Context) GenaiAgentArrayOutput {
	return o
}

func (o GenaiAgentArrayOutput) Index(i pulumi.IntInput) GenaiAgentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *GenaiAgent {
		return vs[0].([]*GenaiAgent)[vs[1].(int)]
	}).(GenaiAgentOutput)
}

type GenaiAgentMapOutput struct{ *pulumi.OutputState }

func (GenaiAgentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GenaiAgent)(nil)).Elem()
}

func (o GenaiAgentMapOutput) ToGenaiAgentMapOutput() GenaiAgentMapOutput {
	return o
}

func (o GenaiAgentMapOutput) ToGenaiAgentMapOutputWithContext(ctx context.Context) GenaiAgentMapOutput {
	return o
}

func (o GenaiAgentMapOutput) MapIndex(k pulumi.StringInput) GenaiAgentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *GenaiAgent {
		return vs[0].(map[string]*GenaiAgent)[vs[1].(string)]
	}).(GenaiAgentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GenaiAgentInput)(nil)).Elem(), &GenaiAgent{})
	pulumi.RegisterInputType(reflect.TypeOf((*GenaiAgentArrayInput)(nil)).Elem(), GenaiAgentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GenaiAgentMapInput)(nil)).Elem(), GenaiAgentMap{})
	pulumi.RegisterOutputType(GenaiAgentOutput{})
	pulumi.RegisterOutputType(GenaiAgentArrayOutput{})
	pulumi.RegisterOutputType(GenaiAgentMapOutput{})
}
