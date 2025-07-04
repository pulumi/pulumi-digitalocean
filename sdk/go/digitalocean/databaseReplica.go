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

// Provides a DigitalOcean database replica resource.
//
// ## Example Usage
//
// ### Create a new PostgreSQL database replica
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
//			postgres_example, err := digitalocean.NewDatabaseCluster(ctx, "postgres-example", &digitalocean.DatabaseClusterArgs{
//				Name:      pulumi.String("example-postgres-cluster"),
//				Engine:    pulumi.String("pg"),
//				Version:   pulumi.String("15"),
//				Size:      pulumi.String(digitalocean.DatabaseSlug_DB_1VPCU1GB),
//				Region:    pulumi.String(digitalocean.RegionNYC1),
//				NodeCount: pulumi.Int(1),
//			})
//			if err != nil {
//				return err
//			}
//			replica_example, err := digitalocean.NewDatabaseReplica(ctx, "replica-example", &digitalocean.DatabaseReplicaArgs{
//				ClusterId: postgres_example.ID(),
//				Name:      pulumi.String("replica-example"),
//				Size:      pulumi.String(digitalocean.DatabaseSlug_DB_1VPCU1GB),
//				Region:    pulumi.String(digitalocean.RegionNYC1),
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("UUID", replica_example.Uuid)
//			// Create firewall rule for database replica
//			_, err = digitalocean.NewDatabaseFirewall(ctx, "example-fw", &digitalocean.DatabaseFirewallArgs{
//				ClusterId: replica_example.Uuid,
//				Rules: digitalocean.DatabaseFirewallRuleArray{
//					&digitalocean.DatabaseFirewallRuleArgs{
//						Type:  pulumi.String("ip_addr"),
//						Value: pulumi.String("192.168.1.1"),
//					},
//				},
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
// # Database replicas can be imported using the `id` of the source database cluster
//
// and the `name` of the replica joined with a comma. For example:
//
// ```sh
// $ pulumi import digitalocean:index/databaseReplica:DatabaseReplica read-replica 245bcfd0-7f31-4ce6-a2bc-475a116cca97,read-replica
// ```
type DatabaseReplica struct {
	pulumi.CustomResourceState

	// The ID of the original source database cluster.
	ClusterId pulumi.StringOutput `pulumi:"clusterId"`
	// Name of the replica's default database.
	Database pulumi.StringOutput `pulumi:"database"`
	// Database replica's hostname.
	Host pulumi.StringOutput `pulumi:"host"`
	// The name for the database replica.
	Name pulumi.StringOutput `pulumi:"name"`
	// Password for the replica's default user.
	Password pulumi.StringOutput `pulumi:"password"`
	// Network port that the database replica is listening on.
	Port pulumi.IntOutput `pulumi:"port"`
	// Same as `host`, but only accessible from resources within the account and in the same region.
	PrivateHost pulumi.StringOutput `pulumi:"privateHost"`
	// The ID of the VPC where the database replica will be located.
	PrivateNetworkUuid pulumi.StringOutput `pulumi:"privateNetworkUuid"`
	// Same as `uri`, but only accessible from resources within the account and in the same region.
	PrivateUri pulumi.StringOutput `pulumi:"privateUri"`
	// DigitalOcean region where the replica will reside.
	Region pulumi.StringPtrOutput `pulumi:"region"`
	// Database Droplet size associated with the replica (ex. `db-s-1vcpu-1gb`). Note that when resizing an existing replica, its size can only be increased. Decreasing its size is not supported.
	Size           pulumi.StringPtrOutput `pulumi:"size"`
	StorageSizeMib pulumi.StringOutput    `pulumi:"storageSizeMib"`
	// A list of tag names to be applied to the database replica.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
	// The full URI for connecting to the database replica.
	Uri pulumi.StringOutput `pulumi:"uri"`
	// Username for the replica's default user.
	User pulumi.StringOutput `pulumi:"user"`
	// The UUID of the database replica. The uuid can be used to reference the database replica as the target database cluster in other resources. See example  "Create firewall rule for database replica" above.
	Uuid pulumi.StringOutput `pulumi:"uuid"`
}

// NewDatabaseReplica registers a new resource with the given unique name, arguments, and options.
func NewDatabaseReplica(ctx *pulumi.Context,
	name string, args *DatabaseReplicaArgs, opts ...pulumi.ResourceOption) (*DatabaseReplica, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterId == nil {
		return nil, errors.New("invalid value for required argument 'ClusterId'")
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"password",
		"privateUri",
		"uri",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DatabaseReplica
	err := ctx.RegisterResource("digitalocean:index/databaseReplica:DatabaseReplica", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDatabaseReplica gets an existing DatabaseReplica resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDatabaseReplica(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DatabaseReplicaState, opts ...pulumi.ResourceOption) (*DatabaseReplica, error) {
	var resource DatabaseReplica
	err := ctx.ReadResource("digitalocean:index/databaseReplica:DatabaseReplica", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DatabaseReplica resources.
type databaseReplicaState struct {
	// The ID of the original source database cluster.
	ClusterId *string `pulumi:"clusterId"`
	// Name of the replica's default database.
	Database *string `pulumi:"database"`
	// Database replica's hostname.
	Host *string `pulumi:"host"`
	// The name for the database replica.
	Name *string `pulumi:"name"`
	// Password for the replica's default user.
	Password *string `pulumi:"password"`
	// Network port that the database replica is listening on.
	Port *int `pulumi:"port"`
	// Same as `host`, but only accessible from resources within the account and in the same region.
	PrivateHost *string `pulumi:"privateHost"`
	// The ID of the VPC where the database replica will be located.
	PrivateNetworkUuid *string `pulumi:"privateNetworkUuid"`
	// Same as `uri`, but only accessible from resources within the account and in the same region.
	PrivateUri *string `pulumi:"privateUri"`
	// DigitalOcean region where the replica will reside.
	Region *string `pulumi:"region"`
	// Database Droplet size associated with the replica (ex. `db-s-1vcpu-1gb`). Note that when resizing an existing replica, its size can only be increased. Decreasing its size is not supported.
	Size           *string `pulumi:"size"`
	StorageSizeMib *string `pulumi:"storageSizeMib"`
	// A list of tag names to be applied to the database replica.
	Tags []string `pulumi:"tags"`
	// The full URI for connecting to the database replica.
	Uri *string `pulumi:"uri"`
	// Username for the replica's default user.
	User *string `pulumi:"user"`
	// The UUID of the database replica. The uuid can be used to reference the database replica as the target database cluster in other resources. See example  "Create firewall rule for database replica" above.
	Uuid *string `pulumi:"uuid"`
}

type DatabaseReplicaState struct {
	// The ID of the original source database cluster.
	ClusterId pulumi.StringPtrInput
	// Name of the replica's default database.
	Database pulumi.StringPtrInput
	// Database replica's hostname.
	Host pulumi.StringPtrInput
	// The name for the database replica.
	Name pulumi.StringPtrInput
	// Password for the replica's default user.
	Password pulumi.StringPtrInput
	// Network port that the database replica is listening on.
	Port pulumi.IntPtrInput
	// Same as `host`, but only accessible from resources within the account and in the same region.
	PrivateHost pulumi.StringPtrInput
	// The ID of the VPC where the database replica will be located.
	PrivateNetworkUuid pulumi.StringPtrInput
	// Same as `uri`, but only accessible from resources within the account and in the same region.
	PrivateUri pulumi.StringPtrInput
	// DigitalOcean region where the replica will reside.
	Region pulumi.StringPtrInput
	// Database Droplet size associated with the replica (ex. `db-s-1vcpu-1gb`). Note that when resizing an existing replica, its size can only be increased. Decreasing its size is not supported.
	Size           pulumi.StringPtrInput
	StorageSizeMib pulumi.StringPtrInput
	// A list of tag names to be applied to the database replica.
	Tags pulumi.StringArrayInput
	// The full URI for connecting to the database replica.
	Uri pulumi.StringPtrInput
	// Username for the replica's default user.
	User pulumi.StringPtrInput
	// The UUID of the database replica. The uuid can be used to reference the database replica as the target database cluster in other resources. See example  "Create firewall rule for database replica" above.
	Uuid pulumi.StringPtrInput
}

func (DatabaseReplicaState) ElementType() reflect.Type {
	return reflect.TypeOf((*databaseReplicaState)(nil)).Elem()
}

type databaseReplicaArgs struct {
	// The ID of the original source database cluster.
	ClusterId string `pulumi:"clusterId"`
	// The name for the database replica.
	Name *string `pulumi:"name"`
	// The ID of the VPC where the database replica will be located.
	PrivateNetworkUuid *string `pulumi:"privateNetworkUuid"`
	// DigitalOcean region where the replica will reside.
	Region *string `pulumi:"region"`
	// Database Droplet size associated with the replica (ex. `db-s-1vcpu-1gb`). Note that when resizing an existing replica, its size can only be increased. Decreasing its size is not supported.
	Size           *string `pulumi:"size"`
	StorageSizeMib *string `pulumi:"storageSizeMib"`
	// A list of tag names to be applied to the database replica.
	Tags []string `pulumi:"tags"`
}

// The set of arguments for constructing a DatabaseReplica resource.
type DatabaseReplicaArgs struct {
	// The ID of the original source database cluster.
	ClusterId pulumi.StringInput
	// The name for the database replica.
	Name pulumi.StringPtrInput
	// The ID of the VPC where the database replica will be located.
	PrivateNetworkUuid pulumi.StringPtrInput
	// DigitalOcean region where the replica will reside.
	Region pulumi.StringPtrInput
	// Database Droplet size associated with the replica (ex. `db-s-1vcpu-1gb`). Note that when resizing an existing replica, its size can only be increased. Decreasing its size is not supported.
	Size           pulumi.StringPtrInput
	StorageSizeMib pulumi.StringPtrInput
	// A list of tag names to be applied to the database replica.
	Tags pulumi.StringArrayInput
}

func (DatabaseReplicaArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*databaseReplicaArgs)(nil)).Elem()
}

type DatabaseReplicaInput interface {
	pulumi.Input

	ToDatabaseReplicaOutput() DatabaseReplicaOutput
	ToDatabaseReplicaOutputWithContext(ctx context.Context) DatabaseReplicaOutput
}

func (*DatabaseReplica) ElementType() reflect.Type {
	return reflect.TypeOf((**DatabaseReplica)(nil)).Elem()
}

func (i *DatabaseReplica) ToDatabaseReplicaOutput() DatabaseReplicaOutput {
	return i.ToDatabaseReplicaOutputWithContext(context.Background())
}

func (i *DatabaseReplica) ToDatabaseReplicaOutputWithContext(ctx context.Context) DatabaseReplicaOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DatabaseReplicaOutput)
}

// DatabaseReplicaArrayInput is an input type that accepts DatabaseReplicaArray and DatabaseReplicaArrayOutput values.
// You can construct a concrete instance of `DatabaseReplicaArrayInput` via:
//
//	DatabaseReplicaArray{ DatabaseReplicaArgs{...} }
type DatabaseReplicaArrayInput interface {
	pulumi.Input

	ToDatabaseReplicaArrayOutput() DatabaseReplicaArrayOutput
	ToDatabaseReplicaArrayOutputWithContext(context.Context) DatabaseReplicaArrayOutput
}

type DatabaseReplicaArray []DatabaseReplicaInput

func (DatabaseReplicaArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DatabaseReplica)(nil)).Elem()
}

func (i DatabaseReplicaArray) ToDatabaseReplicaArrayOutput() DatabaseReplicaArrayOutput {
	return i.ToDatabaseReplicaArrayOutputWithContext(context.Background())
}

func (i DatabaseReplicaArray) ToDatabaseReplicaArrayOutputWithContext(ctx context.Context) DatabaseReplicaArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DatabaseReplicaArrayOutput)
}

// DatabaseReplicaMapInput is an input type that accepts DatabaseReplicaMap and DatabaseReplicaMapOutput values.
// You can construct a concrete instance of `DatabaseReplicaMapInput` via:
//
//	DatabaseReplicaMap{ "key": DatabaseReplicaArgs{...} }
type DatabaseReplicaMapInput interface {
	pulumi.Input

	ToDatabaseReplicaMapOutput() DatabaseReplicaMapOutput
	ToDatabaseReplicaMapOutputWithContext(context.Context) DatabaseReplicaMapOutput
}

type DatabaseReplicaMap map[string]DatabaseReplicaInput

func (DatabaseReplicaMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DatabaseReplica)(nil)).Elem()
}

func (i DatabaseReplicaMap) ToDatabaseReplicaMapOutput() DatabaseReplicaMapOutput {
	return i.ToDatabaseReplicaMapOutputWithContext(context.Background())
}

func (i DatabaseReplicaMap) ToDatabaseReplicaMapOutputWithContext(ctx context.Context) DatabaseReplicaMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DatabaseReplicaMapOutput)
}

type DatabaseReplicaOutput struct{ *pulumi.OutputState }

func (DatabaseReplicaOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DatabaseReplica)(nil)).Elem()
}

func (o DatabaseReplicaOutput) ToDatabaseReplicaOutput() DatabaseReplicaOutput {
	return o
}

func (o DatabaseReplicaOutput) ToDatabaseReplicaOutputWithContext(ctx context.Context) DatabaseReplicaOutput {
	return o
}

// The ID of the original source database cluster.
func (o DatabaseReplicaOutput) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseReplica) pulumi.StringOutput { return v.ClusterId }).(pulumi.StringOutput)
}

// Name of the replica's default database.
func (o DatabaseReplicaOutput) Database() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseReplica) pulumi.StringOutput { return v.Database }).(pulumi.StringOutput)
}

// Database replica's hostname.
func (o DatabaseReplicaOutput) Host() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseReplica) pulumi.StringOutput { return v.Host }).(pulumi.StringOutput)
}

// The name for the database replica.
func (o DatabaseReplicaOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseReplica) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Password for the replica's default user.
func (o DatabaseReplicaOutput) Password() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseReplica) pulumi.StringOutput { return v.Password }).(pulumi.StringOutput)
}

// Network port that the database replica is listening on.
func (o DatabaseReplicaOutput) Port() pulumi.IntOutput {
	return o.ApplyT(func(v *DatabaseReplica) pulumi.IntOutput { return v.Port }).(pulumi.IntOutput)
}

// Same as `host`, but only accessible from resources within the account and in the same region.
func (o DatabaseReplicaOutput) PrivateHost() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseReplica) pulumi.StringOutput { return v.PrivateHost }).(pulumi.StringOutput)
}

// The ID of the VPC where the database replica will be located.
func (o DatabaseReplicaOutput) PrivateNetworkUuid() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseReplica) pulumi.StringOutput { return v.PrivateNetworkUuid }).(pulumi.StringOutput)
}

// Same as `uri`, but only accessible from resources within the account and in the same region.
func (o DatabaseReplicaOutput) PrivateUri() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseReplica) pulumi.StringOutput { return v.PrivateUri }).(pulumi.StringOutput)
}

// DigitalOcean region where the replica will reside.
func (o DatabaseReplicaOutput) Region() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DatabaseReplica) pulumi.StringPtrOutput { return v.Region }).(pulumi.StringPtrOutput)
}

// Database Droplet size associated with the replica (ex. `db-s-1vcpu-1gb`). Note that when resizing an existing replica, its size can only be increased. Decreasing its size is not supported.
func (o DatabaseReplicaOutput) Size() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DatabaseReplica) pulumi.StringPtrOutput { return v.Size }).(pulumi.StringPtrOutput)
}

func (o DatabaseReplicaOutput) StorageSizeMib() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseReplica) pulumi.StringOutput { return v.StorageSizeMib }).(pulumi.StringOutput)
}

// A list of tag names to be applied to the database replica.
func (o DatabaseReplicaOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *DatabaseReplica) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

// The full URI for connecting to the database replica.
func (o DatabaseReplicaOutput) Uri() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseReplica) pulumi.StringOutput { return v.Uri }).(pulumi.StringOutput)
}

// Username for the replica's default user.
func (o DatabaseReplicaOutput) User() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseReplica) pulumi.StringOutput { return v.User }).(pulumi.StringOutput)
}

// The UUID of the database replica. The uuid can be used to reference the database replica as the target database cluster in other resources. See example  "Create firewall rule for database replica" above.
func (o DatabaseReplicaOutput) Uuid() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseReplica) pulumi.StringOutput { return v.Uuid }).(pulumi.StringOutput)
}

type DatabaseReplicaArrayOutput struct{ *pulumi.OutputState }

func (DatabaseReplicaArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DatabaseReplica)(nil)).Elem()
}

func (o DatabaseReplicaArrayOutput) ToDatabaseReplicaArrayOutput() DatabaseReplicaArrayOutput {
	return o
}

func (o DatabaseReplicaArrayOutput) ToDatabaseReplicaArrayOutputWithContext(ctx context.Context) DatabaseReplicaArrayOutput {
	return o
}

func (o DatabaseReplicaArrayOutput) Index(i pulumi.IntInput) DatabaseReplicaOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DatabaseReplica {
		return vs[0].([]*DatabaseReplica)[vs[1].(int)]
	}).(DatabaseReplicaOutput)
}

type DatabaseReplicaMapOutput struct{ *pulumi.OutputState }

func (DatabaseReplicaMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DatabaseReplica)(nil)).Elem()
}

func (o DatabaseReplicaMapOutput) ToDatabaseReplicaMapOutput() DatabaseReplicaMapOutput {
	return o
}

func (o DatabaseReplicaMapOutput) ToDatabaseReplicaMapOutputWithContext(ctx context.Context) DatabaseReplicaMapOutput {
	return o
}

func (o DatabaseReplicaMapOutput) MapIndex(k pulumi.StringInput) DatabaseReplicaOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DatabaseReplica {
		return vs[0].(map[string]*DatabaseReplica)[vs[1].(string)]
	}).(DatabaseReplicaOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DatabaseReplicaInput)(nil)).Elem(), &DatabaseReplica{})
	pulumi.RegisterInputType(reflect.TypeOf((*DatabaseReplicaArrayInput)(nil)).Elem(), DatabaseReplicaArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DatabaseReplicaMapInput)(nil)).Elem(), DatabaseReplicaMap{})
	pulumi.RegisterOutputType(DatabaseReplicaOutput{})
	pulumi.RegisterOutputType(DatabaseReplicaArrayOutput{})
	pulumi.RegisterOutputType(DatabaseReplicaMapOutput{})
}
