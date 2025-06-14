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

// Provides a virtual resource that can be used to change advanced configuration
// options for a DigitalOcean managed Redis database cluster.
//
// > **Note** Redis configurations are only removed from state when destroyed. The remote configuration is not unset.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-digitalocean/sdk/v4/go/digitalocean"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleDatabaseCluster, err := digitalocean.NewDatabaseCluster(ctx, "example", &digitalocean.DatabaseClusterArgs{
//				Name:      pulumi.String("example-redis-cluster"),
//				Engine:    pulumi.String("redis"),
//				Version:   pulumi.String("7"),
//				Size:      pulumi.String(digitalocean.DatabaseSlug_DB_1VPCU1GB),
//				Region:    pulumi.String(digitalocean.RegionNYC1),
//				NodeCount: pulumi.Int(1),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = digitalocean.NewDatabaseRedisConfig(ctx, "example", &digitalocean.DatabaseRedisConfigArgs{
//				ClusterId:            exampleDatabaseCluster.ID(),
//				MaxmemoryPolicy:      pulumi.String("allkeys-lru"),
//				NotifyKeyspaceEvents: pulumi.String("KEA"),
//				Timeout:              pulumi.Int(90),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// A Redis database cluster's configuration can be imported using the `id` the parent cluster, e.g.
//
// ```sh
// $ pulumi import digitalocean:index/databaseRedisConfig:DatabaseRedisConfig example 245bcfd0-7f31-4ce6-a2bc-475a116cca97
// ```
type DatabaseRedisConfig struct {
	pulumi.CustomResourceState

	// Determines default pub/sub channels' ACL for new users if an ACL is not supplied. When this option is not defined, `allchannels` is assumed to keep backward compatibility. This option doesn't affect Redis' `acl-pubsub-default` configuration. Supported values are: `allchannels` and `resetchannels`
	AclChannelsDefault pulumi.StringOutput `pulumi:"aclChannelsDefault"`
	// The ID of the target Redis cluster.
	ClusterId pulumi.StringOutput `pulumi:"clusterId"`
	// The Redis IO thread count.
	IoThreads pulumi.IntOutput `pulumi:"ioThreads"`
	// The LFU maxmemory policy counter decay time in minutes.
	LfuDecayTime pulumi.IntOutput `pulumi:"lfuDecayTime"`
	// The counter logarithm factor for volatile-lfu and allkeys-lfu maxmemory policies.
	LfuLogFactor pulumi.IntOutput `pulumi:"lfuLogFactor"`
	// A string specifying the desired eviction policy for the Redis cluster.Supported values are: `noeviction`, `allkeys-lru`, `allkeys-random`, `volatile-lru`, `volatile-random`, `volatile-ttl`
	MaxmemoryPolicy pulumi.StringOutput `pulumi:"maxmemoryPolicy"`
	// The `notify-keyspace-events` option. Requires at least `K` or `E`.
	NotifyKeyspaceEvents pulumi.StringOutput `pulumi:"notifyKeyspaceEvents"`
	// The number of Redis databases. Changing this will cause a restart of Redis service.
	NumberOfDatabases pulumi.IntOutput `pulumi:"numberOfDatabases"`
	// When persistence is `rdb`, Redis does RDB dumps each 10 minutes if any key is changed. Also RDB dumps are done according to backup schedule for backup purposes. When persistence is `off`, no RDB dumps and backups are done, so data can be lost at any moment if service is restarted for any reason, or if service is powered off. Also service can't be forked.
	Persistence pulumi.StringOutput `pulumi:"persistence"`
	// The output buffer limit for pub/sub clients in MB. The value is the hard limit, the soft limit is 1/4 of the hard limit. When setting the limit, be mindful of the available memory in the selected service plan.
	PubsubClientOutputBufferLimit pulumi.IntOutput `pulumi:"pubsubClientOutputBufferLimit"`
	// A boolean indicating whether to require SSL to access Redis.
	// - When enabled, Redis accepts only SSL connections on port `25061`.
	// - When disabled, port `25060` is opened for non-SSL connections, while port `25061` remains available for SSL connections.
	Ssl pulumi.BoolOutput `pulumi:"ssl"`
	// The Redis idle connection timeout in seconds.
	Timeout pulumi.IntOutput `pulumi:"timeout"`
}

// NewDatabaseRedisConfig registers a new resource with the given unique name, arguments, and options.
func NewDatabaseRedisConfig(ctx *pulumi.Context,
	name string, args *DatabaseRedisConfigArgs, opts ...pulumi.ResourceOption) (*DatabaseRedisConfig, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterId == nil {
		return nil, errors.New("invalid value for required argument 'ClusterId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DatabaseRedisConfig
	err := ctx.RegisterResource("digitalocean:index/databaseRedisConfig:DatabaseRedisConfig", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDatabaseRedisConfig gets an existing DatabaseRedisConfig resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDatabaseRedisConfig(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DatabaseRedisConfigState, opts ...pulumi.ResourceOption) (*DatabaseRedisConfig, error) {
	var resource DatabaseRedisConfig
	err := ctx.ReadResource("digitalocean:index/databaseRedisConfig:DatabaseRedisConfig", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DatabaseRedisConfig resources.
type databaseRedisConfigState struct {
	// Determines default pub/sub channels' ACL for new users if an ACL is not supplied. When this option is not defined, `allchannels` is assumed to keep backward compatibility. This option doesn't affect Redis' `acl-pubsub-default` configuration. Supported values are: `allchannels` and `resetchannels`
	AclChannelsDefault *string `pulumi:"aclChannelsDefault"`
	// The ID of the target Redis cluster.
	ClusterId *string `pulumi:"clusterId"`
	// The Redis IO thread count.
	IoThreads *int `pulumi:"ioThreads"`
	// The LFU maxmemory policy counter decay time in minutes.
	LfuDecayTime *int `pulumi:"lfuDecayTime"`
	// The counter logarithm factor for volatile-lfu and allkeys-lfu maxmemory policies.
	LfuLogFactor *int `pulumi:"lfuLogFactor"`
	// A string specifying the desired eviction policy for the Redis cluster.Supported values are: `noeviction`, `allkeys-lru`, `allkeys-random`, `volatile-lru`, `volatile-random`, `volatile-ttl`
	MaxmemoryPolicy *string `pulumi:"maxmemoryPolicy"`
	// The `notify-keyspace-events` option. Requires at least `K` or `E`.
	NotifyKeyspaceEvents *string `pulumi:"notifyKeyspaceEvents"`
	// The number of Redis databases. Changing this will cause a restart of Redis service.
	NumberOfDatabases *int `pulumi:"numberOfDatabases"`
	// When persistence is `rdb`, Redis does RDB dumps each 10 minutes if any key is changed. Also RDB dumps are done according to backup schedule for backup purposes. When persistence is `off`, no RDB dumps and backups are done, so data can be lost at any moment if service is restarted for any reason, or if service is powered off. Also service can't be forked.
	Persistence *string `pulumi:"persistence"`
	// The output buffer limit for pub/sub clients in MB. The value is the hard limit, the soft limit is 1/4 of the hard limit. When setting the limit, be mindful of the available memory in the selected service plan.
	PubsubClientOutputBufferLimit *int `pulumi:"pubsubClientOutputBufferLimit"`
	// A boolean indicating whether to require SSL to access Redis.
	// - When enabled, Redis accepts only SSL connections on port `25061`.
	// - When disabled, port `25060` is opened for non-SSL connections, while port `25061` remains available for SSL connections.
	Ssl *bool `pulumi:"ssl"`
	// The Redis idle connection timeout in seconds.
	Timeout *int `pulumi:"timeout"`
}

type DatabaseRedisConfigState struct {
	// Determines default pub/sub channels' ACL for new users if an ACL is not supplied. When this option is not defined, `allchannels` is assumed to keep backward compatibility. This option doesn't affect Redis' `acl-pubsub-default` configuration. Supported values are: `allchannels` and `resetchannels`
	AclChannelsDefault pulumi.StringPtrInput
	// The ID of the target Redis cluster.
	ClusterId pulumi.StringPtrInput
	// The Redis IO thread count.
	IoThreads pulumi.IntPtrInput
	// The LFU maxmemory policy counter decay time in minutes.
	LfuDecayTime pulumi.IntPtrInput
	// The counter logarithm factor for volatile-lfu and allkeys-lfu maxmemory policies.
	LfuLogFactor pulumi.IntPtrInput
	// A string specifying the desired eviction policy for the Redis cluster.Supported values are: `noeviction`, `allkeys-lru`, `allkeys-random`, `volatile-lru`, `volatile-random`, `volatile-ttl`
	MaxmemoryPolicy pulumi.StringPtrInput
	// The `notify-keyspace-events` option. Requires at least `K` or `E`.
	NotifyKeyspaceEvents pulumi.StringPtrInput
	// The number of Redis databases. Changing this will cause a restart of Redis service.
	NumberOfDatabases pulumi.IntPtrInput
	// When persistence is `rdb`, Redis does RDB dumps each 10 minutes if any key is changed. Also RDB dumps are done according to backup schedule for backup purposes. When persistence is `off`, no RDB dumps and backups are done, so data can be lost at any moment if service is restarted for any reason, or if service is powered off. Also service can't be forked.
	Persistence pulumi.StringPtrInput
	// The output buffer limit for pub/sub clients in MB. The value is the hard limit, the soft limit is 1/4 of the hard limit. When setting the limit, be mindful of the available memory in the selected service plan.
	PubsubClientOutputBufferLimit pulumi.IntPtrInput
	// A boolean indicating whether to require SSL to access Redis.
	// - When enabled, Redis accepts only SSL connections on port `25061`.
	// - When disabled, port `25060` is opened for non-SSL connections, while port `25061` remains available for SSL connections.
	Ssl pulumi.BoolPtrInput
	// The Redis idle connection timeout in seconds.
	Timeout pulumi.IntPtrInput
}

func (DatabaseRedisConfigState) ElementType() reflect.Type {
	return reflect.TypeOf((*databaseRedisConfigState)(nil)).Elem()
}

type databaseRedisConfigArgs struct {
	// Determines default pub/sub channels' ACL for new users if an ACL is not supplied. When this option is not defined, `allchannels` is assumed to keep backward compatibility. This option doesn't affect Redis' `acl-pubsub-default` configuration. Supported values are: `allchannels` and `resetchannels`
	AclChannelsDefault *string `pulumi:"aclChannelsDefault"`
	// The ID of the target Redis cluster.
	ClusterId string `pulumi:"clusterId"`
	// The Redis IO thread count.
	IoThreads *int `pulumi:"ioThreads"`
	// The LFU maxmemory policy counter decay time in minutes.
	LfuDecayTime *int `pulumi:"lfuDecayTime"`
	// The counter logarithm factor for volatile-lfu and allkeys-lfu maxmemory policies.
	LfuLogFactor *int `pulumi:"lfuLogFactor"`
	// A string specifying the desired eviction policy for the Redis cluster.Supported values are: `noeviction`, `allkeys-lru`, `allkeys-random`, `volatile-lru`, `volatile-random`, `volatile-ttl`
	MaxmemoryPolicy *string `pulumi:"maxmemoryPolicy"`
	// The `notify-keyspace-events` option. Requires at least `K` or `E`.
	NotifyKeyspaceEvents *string `pulumi:"notifyKeyspaceEvents"`
	// The number of Redis databases. Changing this will cause a restart of Redis service.
	NumberOfDatabases *int `pulumi:"numberOfDatabases"`
	// When persistence is `rdb`, Redis does RDB dumps each 10 minutes if any key is changed. Also RDB dumps are done according to backup schedule for backup purposes. When persistence is `off`, no RDB dumps and backups are done, so data can be lost at any moment if service is restarted for any reason, or if service is powered off. Also service can't be forked.
	Persistence *string `pulumi:"persistence"`
	// The output buffer limit for pub/sub clients in MB. The value is the hard limit, the soft limit is 1/4 of the hard limit. When setting the limit, be mindful of the available memory in the selected service plan.
	PubsubClientOutputBufferLimit *int `pulumi:"pubsubClientOutputBufferLimit"`
	// A boolean indicating whether to require SSL to access Redis.
	// - When enabled, Redis accepts only SSL connections on port `25061`.
	// - When disabled, port `25060` is opened for non-SSL connections, while port `25061` remains available for SSL connections.
	Ssl *bool `pulumi:"ssl"`
	// The Redis idle connection timeout in seconds.
	Timeout *int `pulumi:"timeout"`
}

// The set of arguments for constructing a DatabaseRedisConfig resource.
type DatabaseRedisConfigArgs struct {
	// Determines default pub/sub channels' ACL for new users if an ACL is not supplied. When this option is not defined, `allchannels` is assumed to keep backward compatibility. This option doesn't affect Redis' `acl-pubsub-default` configuration. Supported values are: `allchannels` and `resetchannels`
	AclChannelsDefault pulumi.StringPtrInput
	// The ID of the target Redis cluster.
	ClusterId pulumi.StringInput
	// The Redis IO thread count.
	IoThreads pulumi.IntPtrInput
	// The LFU maxmemory policy counter decay time in minutes.
	LfuDecayTime pulumi.IntPtrInput
	// The counter logarithm factor for volatile-lfu and allkeys-lfu maxmemory policies.
	LfuLogFactor pulumi.IntPtrInput
	// A string specifying the desired eviction policy for the Redis cluster.Supported values are: `noeviction`, `allkeys-lru`, `allkeys-random`, `volatile-lru`, `volatile-random`, `volatile-ttl`
	MaxmemoryPolicy pulumi.StringPtrInput
	// The `notify-keyspace-events` option. Requires at least `K` or `E`.
	NotifyKeyspaceEvents pulumi.StringPtrInput
	// The number of Redis databases. Changing this will cause a restart of Redis service.
	NumberOfDatabases pulumi.IntPtrInput
	// When persistence is `rdb`, Redis does RDB dumps each 10 minutes if any key is changed. Also RDB dumps are done according to backup schedule for backup purposes. When persistence is `off`, no RDB dumps and backups are done, so data can be lost at any moment if service is restarted for any reason, or if service is powered off. Also service can't be forked.
	Persistence pulumi.StringPtrInput
	// The output buffer limit for pub/sub clients in MB. The value is the hard limit, the soft limit is 1/4 of the hard limit. When setting the limit, be mindful of the available memory in the selected service plan.
	PubsubClientOutputBufferLimit pulumi.IntPtrInput
	// A boolean indicating whether to require SSL to access Redis.
	// - When enabled, Redis accepts only SSL connections on port `25061`.
	// - When disabled, port `25060` is opened for non-SSL connections, while port `25061` remains available for SSL connections.
	Ssl pulumi.BoolPtrInput
	// The Redis idle connection timeout in seconds.
	Timeout pulumi.IntPtrInput
}

func (DatabaseRedisConfigArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*databaseRedisConfigArgs)(nil)).Elem()
}

type DatabaseRedisConfigInput interface {
	pulumi.Input

	ToDatabaseRedisConfigOutput() DatabaseRedisConfigOutput
	ToDatabaseRedisConfigOutputWithContext(ctx context.Context) DatabaseRedisConfigOutput
}

func (*DatabaseRedisConfig) ElementType() reflect.Type {
	return reflect.TypeOf((**DatabaseRedisConfig)(nil)).Elem()
}

func (i *DatabaseRedisConfig) ToDatabaseRedisConfigOutput() DatabaseRedisConfigOutput {
	return i.ToDatabaseRedisConfigOutputWithContext(context.Background())
}

func (i *DatabaseRedisConfig) ToDatabaseRedisConfigOutputWithContext(ctx context.Context) DatabaseRedisConfigOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DatabaseRedisConfigOutput)
}

// DatabaseRedisConfigArrayInput is an input type that accepts DatabaseRedisConfigArray and DatabaseRedisConfigArrayOutput values.
// You can construct a concrete instance of `DatabaseRedisConfigArrayInput` via:
//
//	DatabaseRedisConfigArray{ DatabaseRedisConfigArgs{...} }
type DatabaseRedisConfigArrayInput interface {
	pulumi.Input

	ToDatabaseRedisConfigArrayOutput() DatabaseRedisConfigArrayOutput
	ToDatabaseRedisConfigArrayOutputWithContext(context.Context) DatabaseRedisConfigArrayOutput
}

type DatabaseRedisConfigArray []DatabaseRedisConfigInput

func (DatabaseRedisConfigArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DatabaseRedisConfig)(nil)).Elem()
}

func (i DatabaseRedisConfigArray) ToDatabaseRedisConfigArrayOutput() DatabaseRedisConfigArrayOutput {
	return i.ToDatabaseRedisConfigArrayOutputWithContext(context.Background())
}

func (i DatabaseRedisConfigArray) ToDatabaseRedisConfigArrayOutputWithContext(ctx context.Context) DatabaseRedisConfigArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DatabaseRedisConfigArrayOutput)
}

// DatabaseRedisConfigMapInput is an input type that accepts DatabaseRedisConfigMap and DatabaseRedisConfigMapOutput values.
// You can construct a concrete instance of `DatabaseRedisConfigMapInput` via:
//
//	DatabaseRedisConfigMap{ "key": DatabaseRedisConfigArgs{...} }
type DatabaseRedisConfigMapInput interface {
	pulumi.Input

	ToDatabaseRedisConfigMapOutput() DatabaseRedisConfigMapOutput
	ToDatabaseRedisConfigMapOutputWithContext(context.Context) DatabaseRedisConfigMapOutput
}

type DatabaseRedisConfigMap map[string]DatabaseRedisConfigInput

func (DatabaseRedisConfigMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DatabaseRedisConfig)(nil)).Elem()
}

func (i DatabaseRedisConfigMap) ToDatabaseRedisConfigMapOutput() DatabaseRedisConfigMapOutput {
	return i.ToDatabaseRedisConfigMapOutputWithContext(context.Background())
}

func (i DatabaseRedisConfigMap) ToDatabaseRedisConfigMapOutputWithContext(ctx context.Context) DatabaseRedisConfigMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DatabaseRedisConfigMapOutput)
}

type DatabaseRedisConfigOutput struct{ *pulumi.OutputState }

func (DatabaseRedisConfigOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DatabaseRedisConfig)(nil)).Elem()
}

func (o DatabaseRedisConfigOutput) ToDatabaseRedisConfigOutput() DatabaseRedisConfigOutput {
	return o
}

func (o DatabaseRedisConfigOutput) ToDatabaseRedisConfigOutputWithContext(ctx context.Context) DatabaseRedisConfigOutput {
	return o
}

// Determines default pub/sub channels' ACL for new users if an ACL is not supplied. When this option is not defined, `allchannels` is assumed to keep backward compatibility. This option doesn't affect Redis' `acl-pubsub-default` configuration. Supported values are: `allchannels` and `resetchannels`
func (o DatabaseRedisConfigOutput) AclChannelsDefault() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseRedisConfig) pulumi.StringOutput { return v.AclChannelsDefault }).(pulumi.StringOutput)
}

// The ID of the target Redis cluster.
func (o DatabaseRedisConfigOutput) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseRedisConfig) pulumi.StringOutput { return v.ClusterId }).(pulumi.StringOutput)
}

// The Redis IO thread count.
func (o DatabaseRedisConfigOutput) IoThreads() pulumi.IntOutput {
	return o.ApplyT(func(v *DatabaseRedisConfig) pulumi.IntOutput { return v.IoThreads }).(pulumi.IntOutput)
}

// The LFU maxmemory policy counter decay time in minutes.
func (o DatabaseRedisConfigOutput) LfuDecayTime() pulumi.IntOutput {
	return o.ApplyT(func(v *DatabaseRedisConfig) pulumi.IntOutput { return v.LfuDecayTime }).(pulumi.IntOutput)
}

// The counter logarithm factor for volatile-lfu and allkeys-lfu maxmemory policies.
func (o DatabaseRedisConfigOutput) LfuLogFactor() pulumi.IntOutput {
	return o.ApplyT(func(v *DatabaseRedisConfig) pulumi.IntOutput { return v.LfuLogFactor }).(pulumi.IntOutput)
}

// A string specifying the desired eviction policy for the Redis cluster.Supported values are: `noeviction`, `allkeys-lru`, `allkeys-random`, `volatile-lru`, `volatile-random`, `volatile-ttl`
func (o DatabaseRedisConfigOutput) MaxmemoryPolicy() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseRedisConfig) pulumi.StringOutput { return v.MaxmemoryPolicy }).(pulumi.StringOutput)
}

// The `notify-keyspace-events` option. Requires at least `K` or `E`.
func (o DatabaseRedisConfigOutput) NotifyKeyspaceEvents() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseRedisConfig) pulumi.StringOutput { return v.NotifyKeyspaceEvents }).(pulumi.StringOutput)
}

// The number of Redis databases. Changing this will cause a restart of Redis service.
func (o DatabaseRedisConfigOutput) NumberOfDatabases() pulumi.IntOutput {
	return o.ApplyT(func(v *DatabaseRedisConfig) pulumi.IntOutput { return v.NumberOfDatabases }).(pulumi.IntOutput)
}

// When persistence is `rdb`, Redis does RDB dumps each 10 minutes if any key is changed. Also RDB dumps are done according to backup schedule for backup purposes. When persistence is `off`, no RDB dumps and backups are done, so data can be lost at any moment if service is restarted for any reason, or if service is powered off. Also service can't be forked.
func (o DatabaseRedisConfigOutput) Persistence() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseRedisConfig) pulumi.StringOutput { return v.Persistence }).(pulumi.StringOutput)
}

// The output buffer limit for pub/sub clients in MB. The value is the hard limit, the soft limit is 1/4 of the hard limit. When setting the limit, be mindful of the available memory in the selected service plan.
func (o DatabaseRedisConfigOutput) PubsubClientOutputBufferLimit() pulumi.IntOutput {
	return o.ApplyT(func(v *DatabaseRedisConfig) pulumi.IntOutput { return v.PubsubClientOutputBufferLimit }).(pulumi.IntOutput)
}

// A boolean indicating whether to require SSL to access Redis.
// - When enabled, Redis accepts only SSL connections on port `25061`.
// - When disabled, port `25060` is opened for non-SSL connections, while port `25061` remains available for SSL connections.
func (o DatabaseRedisConfigOutput) Ssl() pulumi.BoolOutput {
	return o.ApplyT(func(v *DatabaseRedisConfig) pulumi.BoolOutput { return v.Ssl }).(pulumi.BoolOutput)
}

// The Redis idle connection timeout in seconds.
func (o DatabaseRedisConfigOutput) Timeout() pulumi.IntOutput {
	return o.ApplyT(func(v *DatabaseRedisConfig) pulumi.IntOutput { return v.Timeout }).(pulumi.IntOutput)
}

type DatabaseRedisConfigArrayOutput struct{ *pulumi.OutputState }

func (DatabaseRedisConfigArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DatabaseRedisConfig)(nil)).Elem()
}

func (o DatabaseRedisConfigArrayOutput) ToDatabaseRedisConfigArrayOutput() DatabaseRedisConfigArrayOutput {
	return o
}

func (o DatabaseRedisConfigArrayOutput) ToDatabaseRedisConfigArrayOutputWithContext(ctx context.Context) DatabaseRedisConfigArrayOutput {
	return o
}

func (o DatabaseRedisConfigArrayOutput) Index(i pulumi.IntInput) DatabaseRedisConfigOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DatabaseRedisConfig {
		return vs[0].([]*DatabaseRedisConfig)[vs[1].(int)]
	}).(DatabaseRedisConfigOutput)
}

type DatabaseRedisConfigMapOutput struct{ *pulumi.OutputState }

func (DatabaseRedisConfigMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DatabaseRedisConfig)(nil)).Elem()
}

func (o DatabaseRedisConfigMapOutput) ToDatabaseRedisConfigMapOutput() DatabaseRedisConfigMapOutput {
	return o
}

func (o DatabaseRedisConfigMapOutput) ToDatabaseRedisConfigMapOutputWithContext(ctx context.Context) DatabaseRedisConfigMapOutput {
	return o
}

func (o DatabaseRedisConfigMapOutput) MapIndex(k pulumi.StringInput) DatabaseRedisConfigOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DatabaseRedisConfig {
		return vs[0].(map[string]*DatabaseRedisConfig)[vs[1].(string)]
	}).(DatabaseRedisConfigOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DatabaseRedisConfigInput)(nil)).Elem(), &DatabaseRedisConfig{})
	pulumi.RegisterInputType(reflect.TypeOf((*DatabaseRedisConfigArrayInput)(nil)).Elem(), DatabaseRedisConfigArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DatabaseRedisConfigMapInput)(nil)).Elem(), DatabaseRedisConfigMap{})
	pulumi.RegisterOutputType(DatabaseRedisConfigOutput{})
	pulumi.RegisterOutputType(DatabaseRedisConfigArrayOutput{})
	pulumi.RegisterOutputType(DatabaseRedisConfigMapOutput{})
}
