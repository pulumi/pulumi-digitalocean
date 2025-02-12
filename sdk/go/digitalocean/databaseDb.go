// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-digitalocean/sdk/v4/go/digitalocean/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a DigitalOcean database resource. When creating a new database cluster, a default database with name `defaultdb` will be created. Then, this resource can be used to provide additional database inside the cluster.
//
// ## Example Usage
//
// ### Create a new PostgreSQL database
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
//			_, err = digitalocean.NewDatabaseDb(ctx, "database-example", &digitalocean.DatabaseDbArgs{
//				ClusterId: postgres_example.ID(),
//				Name:      pulumi.String("foobar"),
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
// # Database can be imported using the `id` of the source database cluster
//
// and the `name` of the database joined with a comma. For example:
//
// ```sh
// $ pulumi import digitalocean:index/databaseDb:DatabaseDb database-example 245bcfd0-7f31-4ce6-a2bc-475a116cca97,foobar
// ```
type DatabaseDb struct {
	pulumi.CustomResourceState

	// The ID of the original source database cluster.
	ClusterId pulumi.StringOutput `pulumi:"clusterId"`
	// The name for the database.
	Name pulumi.StringOutput `pulumi:"name"`
}

// NewDatabaseDb registers a new resource with the given unique name, arguments, and options.
func NewDatabaseDb(ctx *pulumi.Context,
	name string, args *DatabaseDbArgs, opts ...pulumi.ResourceOption) (*DatabaseDb, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterId == nil {
		return nil, errors.New("invalid value for required argument 'ClusterId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DatabaseDb
	err := ctx.RegisterResource("digitalocean:index/databaseDb:DatabaseDb", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDatabaseDb gets an existing DatabaseDb resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDatabaseDb(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DatabaseDbState, opts ...pulumi.ResourceOption) (*DatabaseDb, error) {
	var resource DatabaseDb
	err := ctx.ReadResource("digitalocean:index/databaseDb:DatabaseDb", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DatabaseDb resources.
type databaseDbState struct {
	// The ID of the original source database cluster.
	ClusterId *string `pulumi:"clusterId"`
	// The name for the database.
	Name *string `pulumi:"name"`
}

type DatabaseDbState struct {
	// The ID of the original source database cluster.
	ClusterId pulumi.StringPtrInput
	// The name for the database.
	Name pulumi.StringPtrInput
}

func (DatabaseDbState) ElementType() reflect.Type {
	return reflect.TypeOf((*databaseDbState)(nil)).Elem()
}

type databaseDbArgs struct {
	// The ID of the original source database cluster.
	ClusterId string `pulumi:"clusterId"`
	// The name for the database.
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a DatabaseDb resource.
type DatabaseDbArgs struct {
	// The ID of the original source database cluster.
	ClusterId pulumi.StringInput
	// The name for the database.
	Name pulumi.StringPtrInput
}

func (DatabaseDbArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*databaseDbArgs)(nil)).Elem()
}

type DatabaseDbInput interface {
	pulumi.Input

	ToDatabaseDbOutput() DatabaseDbOutput
	ToDatabaseDbOutputWithContext(ctx context.Context) DatabaseDbOutput
}

func (*DatabaseDb) ElementType() reflect.Type {
	return reflect.TypeOf((**DatabaseDb)(nil)).Elem()
}

func (i *DatabaseDb) ToDatabaseDbOutput() DatabaseDbOutput {
	return i.ToDatabaseDbOutputWithContext(context.Background())
}

func (i *DatabaseDb) ToDatabaseDbOutputWithContext(ctx context.Context) DatabaseDbOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DatabaseDbOutput)
}

// DatabaseDbArrayInput is an input type that accepts DatabaseDbArray and DatabaseDbArrayOutput values.
// You can construct a concrete instance of `DatabaseDbArrayInput` via:
//
//	DatabaseDbArray{ DatabaseDbArgs{...} }
type DatabaseDbArrayInput interface {
	pulumi.Input

	ToDatabaseDbArrayOutput() DatabaseDbArrayOutput
	ToDatabaseDbArrayOutputWithContext(context.Context) DatabaseDbArrayOutput
}

type DatabaseDbArray []DatabaseDbInput

func (DatabaseDbArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DatabaseDb)(nil)).Elem()
}

func (i DatabaseDbArray) ToDatabaseDbArrayOutput() DatabaseDbArrayOutput {
	return i.ToDatabaseDbArrayOutputWithContext(context.Background())
}

func (i DatabaseDbArray) ToDatabaseDbArrayOutputWithContext(ctx context.Context) DatabaseDbArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DatabaseDbArrayOutput)
}

// DatabaseDbMapInput is an input type that accepts DatabaseDbMap and DatabaseDbMapOutput values.
// You can construct a concrete instance of `DatabaseDbMapInput` via:
//
//	DatabaseDbMap{ "key": DatabaseDbArgs{...} }
type DatabaseDbMapInput interface {
	pulumi.Input

	ToDatabaseDbMapOutput() DatabaseDbMapOutput
	ToDatabaseDbMapOutputWithContext(context.Context) DatabaseDbMapOutput
}

type DatabaseDbMap map[string]DatabaseDbInput

func (DatabaseDbMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DatabaseDb)(nil)).Elem()
}

func (i DatabaseDbMap) ToDatabaseDbMapOutput() DatabaseDbMapOutput {
	return i.ToDatabaseDbMapOutputWithContext(context.Background())
}

func (i DatabaseDbMap) ToDatabaseDbMapOutputWithContext(ctx context.Context) DatabaseDbMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DatabaseDbMapOutput)
}

type DatabaseDbOutput struct{ *pulumi.OutputState }

func (DatabaseDbOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DatabaseDb)(nil)).Elem()
}

func (o DatabaseDbOutput) ToDatabaseDbOutput() DatabaseDbOutput {
	return o
}

func (o DatabaseDbOutput) ToDatabaseDbOutputWithContext(ctx context.Context) DatabaseDbOutput {
	return o
}

// The ID of the original source database cluster.
func (o DatabaseDbOutput) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseDb) pulumi.StringOutput { return v.ClusterId }).(pulumi.StringOutput)
}

// The name for the database.
func (o DatabaseDbOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseDb) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

type DatabaseDbArrayOutput struct{ *pulumi.OutputState }

func (DatabaseDbArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DatabaseDb)(nil)).Elem()
}

func (o DatabaseDbArrayOutput) ToDatabaseDbArrayOutput() DatabaseDbArrayOutput {
	return o
}

func (o DatabaseDbArrayOutput) ToDatabaseDbArrayOutputWithContext(ctx context.Context) DatabaseDbArrayOutput {
	return o
}

func (o DatabaseDbArrayOutput) Index(i pulumi.IntInput) DatabaseDbOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DatabaseDb {
		return vs[0].([]*DatabaseDb)[vs[1].(int)]
	}).(DatabaseDbOutput)
}

type DatabaseDbMapOutput struct{ *pulumi.OutputState }

func (DatabaseDbMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DatabaseDb)(nil)).Elem()
}

func (o DatabaseDbMapOutput) ToDatabaseDbMapOutput() DatabaseDbMapOutput {
	return o
}

func (o DatabaseDbMapOutput) ToDatabaseDbMapOutputWithContext(ctx context.Context) DatabaseDbMapOutput {
	return o
}

func (o DatabaseDbMapOutput) MapIndex(k pulumi.StringInput) DatabaseDbOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DatabaseDb {
		return vs[0].(map[string]*DatabaseDb)[vs[1].(string)]
	}).(DatabaseDbOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DatabaseDbInput)(nil)).Elem(), &DatabaseDb{})
	pulumi.RegisterInputType(reflect.TypeOf((*DatabaseDbArrayInput)(nil)).Elem(), DatabaseDbArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DatabaseDbMapInput)(nil)).Elem(), DatabaseDbMap{})
	pulumi.RegisterOutputType(DatabaseDbOutput{})
	pulumi.RegisterOutputType(DatabaseDbArrayOutput{})
	pulumi.RegisterOutputType(DatabaseDbMapOutput{})
}
