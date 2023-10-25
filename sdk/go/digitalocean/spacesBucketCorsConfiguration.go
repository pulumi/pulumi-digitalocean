// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-digitalocean/sdk/v4/go/digitalocean/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// ## Example Usage
// ### Create a Key in a Spaces Bucket
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
//			foobar, err := digitalocean.NewSpacesBucket(ctx, "foobar", &digitalocean.SpacesBucketArgs{
//				Region: pulumi.String("nyc3"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = digitalocean.NewSpacesBucketCorsConfiguration(ctx, "test", &digitalocean.SpacesBucketCorsConfigurationArgs{
//				Bucket: foobar.ID(),
//				Region: pulumi.String("nyc3"),
//				CorsRules: digitalocean.SpacesBucketCorsConfigurationCorsRuleArray{
//					&digitalocean.SpacesBucketCorsConfigurationCorsRuleArgs{
//						AllowedHeaders: pulumi.StringArray{
//							pulumi.String("*"),
//						},
//						AllowedMethods: pulumi.StringArray{
//							pulumi.String("PUT"),
//							pulumi.String("POST"),
//						},
//						AllowedOrigins: pulumi.StringArray{
//							pulumi.String("https://s3-website-test.hashicorp.com"),
//						},
//						ExposeHeaders: pulumi.StringArray{
//							pulumi.String("ETag"),
//						},
//						MaxAgeSeconds: pulumi.Int(3000),
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
// Bucket policies can be imported using the `region` and `bucket` attributes (delimited by a comma)
//
// ```sh
//
//	$ pulumi import digitalocean:index/spacesBucketCorsConfiguration:SpacesBucketCorsConfiguration foobar `region`,`bucket`
//
// ```
type SpacesBucketCorsConfiguration struct {
	pulumi.CustomResourceState

	// The name of the bucket to which to apply the CORS configuration.
	Bucket pulumi.StringOutput `pulumi:"bucket"`
	// Set of origins and methods (cross-origin access that you want to allow). See below. You can configure up to 100 rules.
	CorsRules SpacesBucketCorsConfigurationCorsRuleArrayOutput `pulumi:"corsRules"`
	// The region where the bucket resides.
	Region pulumi.StringOutput `pulumi:"region"`
}

// NewSpacesBucketCorsConfiguration registers a new resource with the given unique name, arguments, and options.
func NewSpacesBucketCorsConfiguration(ctx *pulumi.Context,
	name string, args *SpacesBucketCorsConfigurationArgs, opts ...pulumi.ResourceOption) (*SpacesBucketCorsConfiguration, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Bucket == nil {
		return nil, errors.New("invalid value for required argument 'Bucket'")
	}
	if args.CorsRules == nil {
		return nil, errors.New("invalid value for required argument 'CorsRules'")
	}
	if args.Region == nil {
		return nil, errors.New("invalid value for required argument 'Region'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SpacesBucketCorsConfiguration
	err := ctx.RegisterResource("digitalocean:index/spacesBucketCorsConfiguration:SpacesBucketCorsConfiguration", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSpacesBucketCorsConfiguration gets an existing SpacesBucketCorsConfiguration resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSpacesBucketCorsConfiguration(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SpacesBucketCorsConfigurationState, opts ...pulumi.ResourceOption) (*SpacesBucketCorsConfiguration, error) {
	var resource SpacesBucketCorsConfiguration
	err := ctx.ReadResource("digitalocean:index/spacesBucketCorsConfiguration:SpacesBucketCorsConfiguration", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SpacesBucketCorsConfiguration resources.
type spacesBucketCorsConfigurationState struct {
	// The name of the bucket to which to apply the CORS configuration.
	Bucket *string `pulumi:"bucket"`
	// Set of origins and methods (cross-origin access that you want to allow). See below. You can configure up to 100 rules.
	CorsRules []SpacesBucketCorsConfigurationCorsRule `pulumi:"corsRules"`
	// The region where the bucket resides.
	Region *string `pulumi:"region"`
}

type SpacesBucketCorsConfigurationState struct {
	// The name of the bucket to which to apply the CORS configuration.
	Bucket pulumi.StringPtrInput
	// Set of origins and methods (cross-origin access that you want to allow). See below. You can configure up to 100 rules.
	CorsRules SpacesBucketCorsConfigurationCorsRuleArrayInput
	// The region where the bucket resides.
	Region pulumi.StringPtrInput
}

func (SpacesBucketCorsConfigurationState) ElementType() reflect.Type {
	return reflect.TypeOf((*spacesBucketCorsConfigurationState)(nil)).Elem()
}

type spacesBucketCorsConfigurationArgs struct {
	// The name of the bucket to which to apply the CORS configuration.
	Bucket string `pulumi:"bucket"`
	// Set of origins and methods (cross-origin access that you want to allow). See below. You can configure up to 100 rules.
	CorsRules []SpacesBucketCorsConfigurationCorsRule `pulumi:"corsRules"`
	// The region where the bucket resides.
	Region string `pulumi:"region"`
}

// The set of arguments for constructing a SpacesBucketCorsConfiguration resource.
type SpacesBucketCorsConfigurationArgs struct {
	// The name of the bucket to which to apply the CORS configuration.
	Bucket pulumi.StringInput
	// Set of origins and methods (cross-origin access that you want to allow). See below. You can configure up to 100 rules.
	CorsRules SpacesBucketCorsConfigurationCorsRuleArrayInput
	// The region where the bucket resides.
	Region pulumi.StringInput
}

func (SpacesBucketCorsConfigurationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*spacesBucketCorsConfigurationArgs)(nil)).Elem()
}

type SpacesBucketCorsConfigurationInput interface {
	pulumi.Input

	ToSpacesBucketCorsConfigurationOutput() SpacesBucketCorsConfigurationOutput
	ToSpacesBucketCorsConfigurationOutputWithContext(ctx context.Context) SpacesBucketCorsConfigurationOutput
}

func (*SpacesBucketCorsConfiguration) ElementType() reflect.Type {
	return reflect.TypeOf((**SpacesBucketCorsConfiguration)(nil)).Elem()
}

func (i *SpacesBucketCorsConfiguration) ToSpacesBucketCorsConfigurationOutput() SpacesBucketCorsConfigurationOutput {
	return i.ToSpacesBucketCorsConfigurationOutputWithContext(context.Background())
}

func (i *SpacesBucketCorsConfiguration) ToSpacesBucketCorsConfigurationOutputWithContext(ctx context.Context) SpacesBucketCorsConfigurationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SpacesBucketCorsConfigurationOutput)
}

func (i *SpacesBucketCorsConfiguration) ToOutput(ctx context.Context) pulumix.Output[*SpacesBucketCorsConfiguration] {
	return pulumix.Output[*SpacesBucketCorsConfiguration]{
		OutputState: i.ToSpacesBucketCorsConfigurationOutputWithContext(ctx).OutputState,
	}
}

// SpacesBucketCorsConfigurationArrayInput is an input type that accepts SpacesBucketCorsConfigurationArray and SpacesBucketCorsConfigurationArrayOutput values.
// You can construct a concrete instance of `SpacesBucketCorsConfigurationArrayInput` via:
//
//	SpacesBucketCorsConfigurationArray{ SpacesBucketCorsConfigurationArgs{...} }
type SpacesBucketCorsConfigurationArrayInput interface {
	pulumi.Input

	ToSpacesBucketCorsConfigurationArrayOutput() SpacesBucketCorsConfigurationArrayOutput
	ToSpacesBucketCorsConfigurationArrayOutputWithContext(context.Context) SpacesBucketCorsConfigurationArrayOutput
}

type SpacesBucketCorsConfigurationArray []SpacesBucketCorsConfigurationInput

func (SpacesBucketCorsConfigurationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SpacesBucketCorsConfiguration)(nil)).Elem()
}

func (i SpacesBucketCorsConfigurationArray) ToSpacesBucketCorsConfigurationArrayOutput() SpacesBucketCorsConfigurationArrayOutput {
	return i.ToSpacesBucketCorsConfigurationArrayOutputWithContext(context.Background())
}

func (i SpacesBucketCorsConfigurationArray) ToSpacesBucketCorsConfigurationArrayOutputWithContext(ctx context.Context) SpacesBucketCorsConfigurationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SpacesBucketCorsConfigurationArrayOutput)
}

func (i SpacesBucketCorsConfigurationArray) ToOutput(ctx context.Context) pulumix.Output[[]*SpacesBucketCorsConfiguration] {
	return pulumix.Output[[]*SpacesBucketCorsConfiguration]{
		OutputState: i.ToSpacesBucketCorsConfigurationArrayOutputWithContext(ctx).OutputState,
	}
}

// SpacesBucketCorsConfigurationMapInput is an input type that accepts SpacesBucketCorsConfigurationMap and SpacesBucketCorsConfigurationMapOutput values.
// You can construct a concrete instance of `SpacesBucketCorsConfigurationMapInput` via:
//
//	SpacesBucketCorsConfigurationMap{ "key": SpacesBucketCorsConfigurationArgs{...} }
type SpacesBucketCorsConfigurationMapInput interface {
	pulumi.Input

	ToSpacesBucketCorsConfigurationMapOutput() SpacesBucketCorsConfigurationMapOutput
	ToSpacesBucketCorsConfigurationMapOutputWithContext(context.Context) SpacesBucketCorsConfigurationMapOutput
}

type SpacesBucketCorsConfigurationMap map[string]SpacesBucketCorsConfigurationInput

func (SpacesBucketCorsConfigurationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SpacesBucketCorsConfiguration)(nil)).Elem()
}

func (i SpacesBucketCorsConfigurationMap) ToSpacesBucketCorsConfigurationMapOutput() SpacesBucketCorsConfigurationMapOutput {
	return i.ToSpacesBucketCorsConfigurationMapOutputWithContext(context.Background())
}

func (i SpacesBucketCorsConfigurationMap) ToSpacesBucketCorsConfigurationMapOutputWithContext(ctx context.Context) SpacesBucketCorsConfigurationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SpacesBucketCorsConfigurationMapOutput)
}

func (i SpacesBucketCorsConfigurationMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*SpacesBucketCorsConfiguration] {
	return pulumix.Output[map[string]*SpacesBucketCorsConfiguration]{
		OutputState: i.ToSpacesBucketCorsConfigurationMapOutputWithContext(ctx).OutputState,
	}
}

type SpacesBucketCorsConfigurationOutput struct{ *pulumi.OutputState }

func (SpacesBucketCorsConfigurationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SpacesBucketCorsConfiguration)(nil)).Elem()
}

func (o SpacesBucketCorsConfigurationOutput) ToSpacesBucketCorsConfigurationOutput() SpacesBucketCorsConfigurationOutput {
	return o
}

func (o SpacesBucketCorsConfigurationOutput) ToSpacesBucketCorsConfigurationOutputWithContext(ctx context.Context) SpacesBucketCorsConfigurationOutput {
	return o
}

func (o SpacesBucketCorsConfigurationOutput) ToOutput(ctx context.Context) pulumix.Output[*SpacesBucketCorsConfiguration] {
	return pulumix.Output[*SpacesBucketCorsConfiguration]{
		OutputState: o.OutputState,
	}
}

// The name of the bucket to which to apply the CORS configuration.
func (o SpacesBucketCorsConfigurationOutput) Bucket() pulumi.StringOutput {
	return o.ApplyT(func(v *SpacesBucketCorsConfiguration) pulumi.StringOutput { return v.Bucket }).(pulumi.StringOutput)
}

// Set of origins and methods (cross-origin access that you want to allow). See below. You can configure up to 100 rules.
func (o SpacesBucketCorsConfigurationOutput) CorsRules() SpacesBucketCorsConfigurationCorsRuleArrayOutput {
	return o.ApplyT(func(v *SpacesBucketCorsConfiguration) SpacesBucketCorsConfigurationCorsRuleArrayOutput {
		return v.CorsRules
	}).(SpacesBucketCorsConfigurationCorsRuleArrayOutput)
}

// The region where the bucket resides.
func (o SpacesBucketCorsConfigurationOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v *SpacesBucketCorsConfiguration) pulumi.StringOutput { return v.Region }).(pulumi.StringOutput)
}

type SpacesBucketCorsConfigurationArrayOutput struct{ *pulumi.OutputState }

func (SpacesBucketCorsConfigurationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SpacesBucketCorsConfiguration)(nil)).Elem()
}

func (o SpacesBucketCorsConfigurationArrayOutput) ToSpacesBucketCorsConfigurationArrayOutput() SpacesBucketCorsConfigurationArrayOutput {
	return o
}

func (o SpacesBucketCorsConfigurationArrayOutput) ToSpacesBucketCorsConfigurationArrayOutputWithContext(ctx context.Context) SpacesBucketCorsConfigurationArrayOutput {
	return o
}

func (o SpacesBucketCorsConfigurationArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*SpacesBucketCorsConfiguration] {
	return pulumix.Output[[]*SpacesBucketCorsConfiguration]{
		OutputState: o.OutputState,
	}
}

func (o SpacesBucketCorsConfigurationArrayOutput) Index(i pulumi.IntInput) SpacesBucketCorsConfigurationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SpacesBucketCorsConfiguration {
		return vs[0].([]*SpacesBucketCorsConfiguration)[vs[1].(int)]
	}).(SpacesBucketCorsConfigurationOutput)
}

type SpacesBucketCorsConfigurationMapOutput struct{ *pulumi.OutputState }

func (SpacesBucketCorsConfigurationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SpacesBucketCorsConfiguration)(nil)).Elem()
}

func (o SpacesBucketCorsConfigurationMapOutput) ToSpacesBucketCorsConfigurationMapOutput() SpacesBucketCorsConfigurationMapOutput {
	return o
}

func (o SpacesBucketCorsConfigurationMapOutput) ToSpacesBucketCorsConfigurationMapOutputWithContext(ctx context.Context) SpacesBucketCorsConfigurationMapOutput {
	return o
}

func (o SpacesBucketCorsConfigurationMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*SpacesBucketCorsConfiguration] {
	return pulumix.Output[map[string]*SpacesBucketCorsConfiguration]{
		OutputState: o.OutputState,
	}
}

func (o SpacesBucketCorsConfigurationMapOutput) MapIndex(k pulumi.StringInput) SpacesBucketCorsConfigurationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SpacesBucketCorsConfiguration {
		return vs[0].(map[string]*SpacesBucketCorsConfiguration)[vs[1].(string)]
	}).(SpacesBucketCorsConfigurationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SpacesBucketCorsConfigurationInput)(nil)).Elem(), &SpacesBucketCorsConfiguration{})
	pulumi.RegisterInputType(reflect.TypeOf((*SpacesBucketCorsConfigurationArrayInput)(nil)).Elem(), SpacesBucketCorsConfigurationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SpacesBucketCorsConfigurationMapInput)(nil)).Elem(), SpacesBucketCorsConfigurationMap{})
	pulumi.RegisterOutputType(SpacesBucketCorsConfigurationOutput{})
	pulumi.RegisterOutputType(SpacesBucketCorsConfigurationArrayOutput{})
	pulumi.RegisterOutputType(SpacesBucketCorsConfigurationMapOutput{})
}
