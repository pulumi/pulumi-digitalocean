// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information on a DigitalOcean database replica.
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
//			example, err := digitalocean.LookupDatabaseCluster(ctx, &digitalocean.LookupDatabaseClusterArgs{
//				Name: "example-cluster",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			read_only, err := digitalocean.LookupDatabaseReplica(ctx, &digitalocean.LookupDatabaseReplicaArgs{
//				ClusterId: example.Id,
//				Name:      "terra-test-ro",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("replicaOutput", read_only.Uri)
//			return nil
//		})
//	}
//
// ```
func LookupDatabaseReplica(ctx *pulumi.Context, args *LookupDatabaseReplicaArgs, opts ...pulumi.InvokeOption) (*LookupDatabaseReplicaResult, error) {
	var rv LookupDatabaseReplicaResult
	err := ctx.Invoke("digitalocean:index/getDatabaseReplica:getDatabaseReplica", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDatabaseReplica.
type LookupDatabaseReplicaArgs struct {
	// The ID of the original source database cluster.
	ClusterId string `pulumi:"clusterId"`
	// The name for the database replica.
	Name string `pulumi:"name"`
	// A list of tag names to be applied to the database replica.
	Tags []string `pulumi:"tags"`
}

// A collection of values returned by getDatabaseReplica.
type LookupDatabaseReplicaResult struct {
	ClusterId string `pulumi:"clusterId"`
	// Name of the replica's default database.
	Database string `pulumi:"database"`
	// Database replica's hostname.
	Host string `pulumi:"host"`
	// The provider-assigned unique ID for this managed resource.
	Id   string `pulumi:"id"`
	Name string `pulumi:"name"`
	// Password for the replica's default user.
	Password string `pulumi:"password"`
	// Network port that the database replica is listening on.
	Port int `pulumi:"port"`
	// Same as `host`, but only accessible from resources within the account and in the same region.
	PrivateHost        string `pulumi:"privateHost"`
	PrivateNetworkUuid string `pulumi:"privateNetworkUuid"`
	// Same as `uri`, but only accessible from resources within the account and in the same region.
	PrivateUri string `pulumi:"privateUri"`
	Region     string `pulumi:"region"`
	// A list of tag names to be applied to the database replica.
	Tags []string `pulumi:"tags"`
	// The full URI for connecting to the database replica.
	Uri string `pulumi:"uri"`
	// Username for the replica's default user.
	User string `pulumi:"user"`
	// The UUID of the database replica.
	Uuid string `pulumi:"uuid"`
}

func LookupDatabaseReplicaOutput(ctx *pulumi.Context, args LookupDatabaseReplicaOutputArgs, opts ...pulumi.InvokeOption) LookupDatabaseReplicaResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupDatabaseReplicaResult, error) {
			args := v.(LookupDatabaseReplicaArgs)
			r, err := LookupDatabaseReplica(ctx, &args, opts...)
			var s LookupDatabaseReplicaResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupDatabaseReplicaResultOutput)
}

// A collection of arguments for invoking getDatabaseReplica.
type LookupDatabaseReplicaOutputArgs struct {
	// The ID of the original source database cluster.
	ClusterId pulumi.StringInput `pulumi:"clusterId"`
	// The name for the database replica.
	Name pulumi.StringInput `pulumi:"name"`
	// A list of tag names to be applied to the database replica.
	Tags pulumi.StringArrayInput `pulumi:"tags"`
}

func (LookupDatabaseReplicaOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDatabaseReplicaArgs)(nil)).Elem()
}

// A collection of values returned by getDatabaseReplica.
type LookupDatabaseReplicaResultOutput struct{ *pulumi.OutputState }

func (LookupDatabaseReplicaResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDatabaseReplicaResult)(nil)).Elem()
}

func (o LookupDatabaseReplicaResultOutput) ToLookupDatabaseReplicaResultOutput() LookupDatabaseReplicaResultOutput {
	return o
}

func (o LookupDatabaseReplicaResultOutput) ToLookupDatabaseReplicaResultOutputWithContext(ctx context.Context) LookupDatabaseReplicaResultOutput {
	return o
}

func (o LookupDatabaseReplicaResultOutput) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseReplicaResult) string { return v.ClusterId }).(pulumi.StringOutput)
}

// Name of the replica's default database.
func (o LookupDatabaseReplicaResultOutput) Database() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseReplicaResult) string { return v.Database }).(pulumi.StringOutput)
}

// Database replica's hostname.
func (o LookupDatabaseReplicaResultOutput) Host() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseReplicaResult) string { return v.Host }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupDatabaseReplicaResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseReplicaResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupDatabaseReplicaResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseReplicaResult) string { return v.Name }).(pulumi.StringOutput)
}

// Password for the replica's default user.
func (o LookupDatabaseReplicaResultOutput) Password() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseReplicaResult) string { return v.Password }).(pulumi.StringOutput)
}

// Network port that the database replica is listening on.
func (o LookupDatabaseReplicaResultOutput) Port() pulumi.IntOutput {
	return o.ApplyT(func(v LookupDatabaseReplicaResult) int { return v.Port }).(pulumi.IntOutput)
}

// Same as `host`, but only accessible from resources within the account and in the same region.
func (o LookupDatabaseReplicaResultOutput) PrivateHost() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseReplicaResult) string { return v.PrivateHost }).(pulumi.StringOutput)
}

func (o LookupDatabaseReplicaResultOutput) PrivateNetworkUuid() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseReplicaResult) string { return v.PrivateNetworkUuid }).(pulumi.StringOutput)
}

// Same as `uri`, but only accessible from resources within the account and in the same region.
func (o LookupDatabaseReplicaResultOutput) PrivateUri() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseReplicaResult) string { return v.PrivateUri }).(pulumi.StringOutput)
}

func (o LookupDatabaseReplicaResultOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseReplicaResult) string { return v.Region }).(pulumi.StringOutput)
}

// A list of tag names to be applied to the database replica.
func (o LookupDatabaseReplicaResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupDatabaseReplicaResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

// The full URI for connecting to the database replica.
func (o LookupDatabaseReplicaResultOutput) Uri() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseReplicaResult) string { return v.Uri }).(pulumi.StringOutput)
}

// Username for the replica's default user.
func (o LookupDatabaseReplicaResultOutput) User() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseReplicaResult) string { return v.User }).(pulumi.StringOutput)
}

// The UUID of the database replica.
func (o LookupDatabaseReplicaResultOutput) Uuid() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseReplicaResult) string { return v.Uuid }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupDatabaseReplicaResultOutput{})
}
