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

// Provides a DigitalOcean DNS record resource.
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
//			_, err := digitalocean.NewDomain(ctx, "default", &digitalocean.DomainArgs{
//				Name: pulumi.String("example.com"),
//			})
//			if err != nil {
//				return err
//			}
//			// Add an A record to the domain for www.example.com.
//			www, err := digitalocean.NewDnsRecord(ctx, "www", &digitalocean.DnsRecordArgs{
//				Domain: _default.ID(),
//				Type:   pulumi.String(digitalocean.RecordTypeA),
//				Name:   pulumi.String("www"),
//				Value:  pulumi.String("192.168.0.11"),
//			})
//			if err != nil {
//				return err
//			}
//			// Add a MX record for the example.com domain itself.
//			mx, err := digitalocean.NewDnsRecord(ctx, "mx", &digitalocean.DnsRecordArgs{
//				Domain:   _default.ID(),
//				Type:     pulumi.String(digitalocean.RecordTypeMX),
//				Name:     pulumi.String("@"),
//				Priority: pulumi.Int(10),
//				Value:    pulumi.String("mail.example.com."),
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("wwwFqdn", www.Fqdn)
//			ctx.Export("mxFqdn", mx.Fqdn)
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Records can be imported using the domain name and record `id` when joined with a comma. See the following example:
//
// ```sh
// $ pulumi import digitalocean:index/dnsRecord:DnsRecord example_record example.com,12345678
// ```
//
// ~>  You find the `id` of the records [using the DigitalOcean API](https://docs.digitalocean.com/reference/api/api-reference/#operation/domains_list_records) or CLI. Run the follow command to list the IDs for all DNS records on a domain: `doctl compute domain records list <domain.name>`
type DnsRecord struct {
	pulumi.CustomResourceState

	// The domain to add the record to.
	Domain pulumi.StringOutput `pulumi:"domain"`
	// The flags of the record. Only valid when type is `CAA`. Must be between 0 and 255.
	Flags pulumi.IntPtrOutput `pulumi:"flags"`
	// The FQDN of the record
	Fqdn pulumi.StringOutput `pulumi:"fqdn"`
	// The hostname of the record. Use `@` for records on domain's name itself.
	Name pulumi.StringOutput `pulumi:"name"`
	// The port of the record. Only valid when type is `SRV`.  Must be between 1 and 65535.
	Port pulumi.IntPtrOutput `pulumi:"port"`
	// The priority of the record. Only valid when type is `MX` or `SRV`. Must be between 0 and 65535.
	Priority pulumi.IntPtrOutput `pulumi:"priority"`
	// The tag of the record. Only valid when type is `CAA`. Must be one of `issue`, `issuewild`, or `iodef`.
	Tag pulumi.StringPtrOutput `pulumi:"tag"`
	// The time to live for the record, in seconds. Must be at least 0. Defaults to 1800.
	Ttl pulumi.IntOutput `pulumi:"ttl"`
	// The type of record. Must be one of `A`, `AAAA`, `CAA`, `CNAME`, `MX`, `NS`, `TXT`, or `SRV`.
	Type pulumi.StringOutput `pulumi:"type"`
	// The value of the record.
	Value pulumi.StringOutput `pulumi:"value"`
	// The weight of the record. Only valid when type is `SRV`.  Must be between 0 and 65535.
	Weight pulumi.IntPtrOutput `pulumi:"weight"`
}

// NewDnsRecord registers a new resource with the given unique name, arguments, and options.
func NewDnsRecord(ctx *pulumi.Context,
	name string, args *DnsRecordArgs, opts ...pulumi.ResourceOption) (*DnsRecord, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Domain == nil {
		return nil, errors.New("invalid value for required argument 'Domain'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	if args.Value == nil {
		return nil, errors.New("invalid value for required argument 'Value'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DnsRecord
	err := ctx.RegisterResource("digitalocean:index/dnsRecord:DnsRecord", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDnsRecord gets an existing DnsRecord resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDnsRecord(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DnsRecordState, opts ...pulumi.ResourceOption) (*DnsRecord, error) {
	var resource DnsRecord
	err := ctx.ReadResource("digitalocean:index/dnsRecord:DnsRecord", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DnsRecord resources.
type dnsRecordState struct {
	// The domain to add the record to.
	Domain *string `pulumi:"domain"`
	// The flags of the record. Only valid when type is `CAA`. Must be between 0 and 255.
	Flags *int `pulumi:"flags"`
	// The FQDN of the record
	Fqdn *string `pulumi:"fqdn"`
	// The hostname of the record. Use `@` for records on domain's name itself.
	Name *string `pulumi:"name"`
	// The port of the record. Only valid when type is `SRV`.  Must be between 1 and 65535.
	Port *int `pulumi:"port"`
	// The priority of the record. Only valid when type is `MX` or `SRV`. Must be between 0 and 65535.
	Priority *int `pulumi:"priority"`
	// The tag of the record. Only valid when type is `CAA`. Must be one of `issue`, `issuewild`, or `iodef`.
	Tag *string `pulumi:"tag"`
	// The time to live for the record, in seconds. Must be at least 0. Defaults to 1800.
	Ttl *int `pulumi:"ttl"`
	// The type of record. Must be one of `A`, `AAAA`, `CAA`, `CNAME`, `MX`, `NS`, `TXT`, or `SRV`.
	Type *string `pulumi:"type"`
	// The value of the record.
	Value *string `pulumi:"value"`
	// The weight of the record. Only valid when type is `SRV`.  Must be between 0 and 65535.
	Weight *int `pulumi:"weight"`
}

type DnsRecordState struct {
	// The domain to add the record to.
	Domain pulumi.StringPtrInput
	// The flags of the record. Only valid when type is `CAA`. Must be between 0 and 255.
	Flags pulumi.IntPtrInput
	// The FQDN of the record
	Fqdn pulumi.StringPtrInput
	// The hostname of the record. Use `@` for records on domain's name itself.
	Name pulumi.StringPtrInput
	// The port of the record. Only valid when type is `SRV`.  Must be between 1 and 65535.
	Port pulumi.IntPtrInput
	// The priority of the record. Only valid when type is `MX` or `SRV`. Must be between 0 and 65535.
	Priority pulumi.IntPtrInput
	// The tag of the record. Only valid when type is `CAA`. Must be one of `issue`, `issuewild`, or `iodef`.
	Tag pulumi.StringPtrInput
	// The time to live for the record, in seconds. Must be at least 0. Defaults to 1800.
	Ttl pulumi.IntPtrInput
	// The type of record. Must be one of `A`, `AAAA`, `CAA`, `CNAME`, `MX`, `NS`, `TXT`, or `SRV`.
	Type pulumi.StringPtrInput
	// The value of the record.
	Value pulumi.StringPtrInput
	// The weight of the record. Only valid when type is `SRV`.  Must be between 0 and 65535.
	Weight pulumi.IntPtrInput
}

func (DnsRecordState) ElementType() reflect.Type {
	return reflect.TypeOf((*dnsRecordState)(nil)).Elem()
}

type dnsRecordArgs struct {
	// The domain to add the record to.
	Domain string `pulumi:"domain"`
	// The flags of the record. Only valid when type is `CAA`. Must be between 0 and 255.
	Flags *int `pulumi:"flags"`
	// The hostname of the record. Use `@` for records on domain's name itself.
	Name *string `pulumi:"name"`
	// The port of the record. Only valid when type is `SRV`.  Must be between 1 and 65535.
	Port *int `pulumi:"port"`
	// The priority of the record. Only valid when type is `MX` or `SRV`. Must be between 0 and 65535.
	Priority *int `pulumi:"priority"`
	// The tag of the record. Only valid when type is `CAA`. Must be one of `issue`, `issuewild`, or `iodef`.
	Tag *string `pulumi:"tag"`
	// The time to live for the record, in seconds. Must be at least 0. Defaults to 1800.
	Ttl *int `pulumi:"ttl"`
	// The type of record. Must be one of `A`, `AAAA`, `CAA`, `CNAME`, `MX`, `NS`, `TXT`, or `SRV`.
	Type string `pulumi:"type"`
	// The value of the record.
	Value string `pulumi:"value"`
	// The weight of the record. Only valid when type is `SRV`.  Must be between 0 and 65535.
	Weight *int `pulumi:"weight"`
}

// The set of arguments for constructing a DnsRecord resource.
type DnsRecordArgs struct {
	// The domain to add the record to.
	Domain pulumi.StringInput
	// The flags of the record. Only valid when type is `CAA`. Must be between 0 and 255.
	Flags pulumi.IntPtrInput
	// The hostname of the record. Use `@` for records on domain's name itself.
	Name pulumi.StringPtrInput
	// The port of the record. Only valid when type is `SRV`.  Must be between 1 and 65535.
	Port pulumi.IntPtrInput
	// The priority of the record. Only valid when type is `MX` or `SRV`. Must be between 0 and 65535.
	Priority pulumi.IntPtrInput
	// The tag of the record. Only valid when type is `CAA`. Must be one of `issue`, `issuewild`, or `iodef`.
	Tag pulumi.StringPtrInput
	// The time to live for the record, in seconds. Must be at least 0. Defaults to 1800.
	Ttl pulumi.IntPtrInput
	// The type of record. Must be one of `A`, `AAAA`, `CAA`, `CNAME`, `MX`, `NS`, `TXT`, or `SRV`.
	Type pulumi.StringInput
	// The value of the record.
	Value pulumi.StringInput
	// The weight of the record. Only valid when type is `SRV`.  Must be between 0 and 65535.
	Weight pulumi.IntPtrInput
}

func (DnsRecordArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*dnsRecordArgs)(nil)).Elem()
}

type DnsRecordInput interface {
	pulumi.Input

	ToDnsRecordOutput() DnsRecordOutput
	ToDnsRecordOutputWithContext(ctx context.Context) DnsRecordOutput
}

func (*DnsRecord) ElementType() reflect.Type {
	return reflect.TypeOf((**DnsRecord)(nil)).Elem()
}

func (i *DnsRecord) ToDnsRecordOutput() DnsRecordOutput {
	return i.ToDnsRecordOutputWithContext(context.Background())
}

func (i *DnsRecord) ToDnsRecordOutputWithContext(ctx context.Context) DnsRecordOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DnsRecordOutput)
}

// DnsRecordArrayInput is an input type that accepts DnsRecordArray and DnsRecordArrayOutput values.
// You can construct a concrete instance of `DnsRecordArrayInput` via:
//
//	DnsRecordArray{ DnsRecordArgs{...} }
type DnsRecordArrayInput interface {
	pulumi.Input

	ToDnsRecordArrayOutput() DnsRecordArrayOutput
	ToDnsRecordArrayOutputWithContext(context.Context) DnsRecordArrayOutput
}

type DnsRecordArray []DnsRecordInput

func (DnsRecordArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DnsRecord)(nil)).Elem()
}

func (i DnsRecordArray) ToDnsRecordArrayOutput() DnsRecordArrayOutput {
	return i.ToDnsRecordArrayOutputWithContext(context.Background())
}

func (i DnsRecordArray) ToDnsRecordArrayOutputWithContext(ctx context.Context) DnsRecordArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DnsRecordArrayOutput)
}

// DnsRecordMapInput is an input type that accepts DnsRecordMap and DnsRecordMapOutput values.
// You can construct a concrete instance of `DnsRecordMapInput` via:
//
//	DnsRecordMap{ "key": DnsRecordArgs{...} }
type DnsRecordMapInput interface {
	pulumi.Input

	ToDnsRecordMapOutput() DnsRecordMapOutput
	ToDnsRecordMapOutputWithContext(context.Context) DnsRecordMapOutput
}

type DnsRecordMap map[string]DnsRecordInput

func (DnsRecordMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DnsRecord)(nil)).Elem()
}

func (i DnsRecordMap) ToDnsRecordMapOutput() DnsRecordMapOutput {
	return i.ToDnsRecordMapOutputWithContext(context.Background())
}

func (i DnsRecordMap) ToDnsRecordMapOutputWithContext(ctx context.Context) DnsRecordMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DnsRecordMapOutput)
}

type DnsRecordOutput struct{ *pulumi.OutputState }

func (DnsRecordOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DnsRecord)(nil)).Elem()
}

func (o DnsRecordOutput) ToDnsRecordOutput() DnsRecordOutput {
	return o
}

func (o DnsRecordOutput) ToDnsRecordOutputWithContext(ctx context.Context) DnsRecordOutput {
	return o
}

// The domain to add the record to.
func (o DnsRecordOutput) Domain() pulumi.StringOutput {
	return o.ApplyT(func(v *DnsRecord) pulumi.StringOutput { return v.Domain }).(pulumi.StringOutput)
}

// The flags of the record. Only valid when type is `CAA`. Must be between 0 and 255.
func (o DnsRecordOutput) Flags() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *DnsRecord) pulumi.IntPtrOutput { return v.Flags }).(pulumi.IntPtrOutput)
}

// The FQDN of the record
func (o DnsRecordOutput) Fqdn() pulumi.StringOutput {
	return o.ApplyT(func(v *DnsRecord) pulumi.StringOutput { return v.Fqdn }).(pulumi.StringOutput)
}

// The hostname of the record. Use `@` for records on domain's name itself.
func (o DnsRecordOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *DnsRecord) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The port of the record. Only valid when type is `SRV`.  Must be between 1 and 65535.
func (o DnsRecordOutput) Port() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *DnsRecord) pulumi.IntPtrOutput { return v.Port }).(pulumi.IntPtrOutput)
}

// The priority of the record. Only valid when type is `MX` or `SRV`. Must be between 0 and 65535.
func (o DnsRecordOutput) Priority() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *DnsRecord) pulumi.IntPtrOutput { return v.Priority }).(pulumi.IntPtrOutput)
}

// The tag of the record. Only valid when type is `CAA`. Must be one of `issue`, `issuewild`, or `iodef`.
func (o DnsRecordOutput) Tag() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DnsRecord) pulumi.StringPtrOutput { return v.Tag }).(pulumi.StringPtrOutput)
}

// The time to live for the record, in seconds. Must be at least 0. Defaults to 1800.
func (o DnsRecordOutput) Ttl() pulumi.IntOutput {
	return o.ApplyT(func(v *DnsRecord) pulumi.IntOutput { return v.Ttl }).(pulumi.IntOutput)
}

// The type of record. Must be one of `A`, `AAAA`, `CAA`, `CNAME`, `MX`, `NS`, `TXT`, or `SRV`.
func (o DnsRecordOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *DnsRecord) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// The value of the record.
func (o DnsRecordOutput) Value() pulumi.StringOutput {
	return o.ApplyT(func(v *DnsRecord) pulumi.StringOutput { return v.Value }).(pulumi.StringOutput)
}

// The weight of the record. Only valid when type is `SRV`.  Must be between 0 and 65535.
func (o DnsRecordOutput) Weight() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *DnsRecord) pulumi.IntPtrOutput { return v.Weight }).(pulumi.IntPtrOutput)
}

type DnsRecordArrayOutput struct{ *pulumi.OutputState }

func (DnsRecordArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DnsRecord)(nil)).Elem()
}

func (o DnsRecordArrayOutput) ToDnsRecordArrayOutput() DnsRecordArrayOutput {
	return o
}

func (o DnsRecordArrayOutput) ToDnsRecordArrayOutputWithContext(ctx context.Context) DnsRecordArrayOutput {
	return o
}

func (o DnsRecordArrayOutput) Index(i pulumi.IntInput) DnsRecordOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DnsRecord {
		return vs[0].([]*DnsRecord)[vs[1].(int)]
	}).(DnsRecordOutput)
}

type DnsRecordMapOutput struct{ *pulumi.OutputState }

func (DnsRecordMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DnsRecord)(nil)).Elem()
}

func (o DnsRecordMapOutput) ToDnsRecordMapOutput() DnsRecordMapOutput {
	return o
}

func (o DnsRecordMapOutput) ToDnsRecordMapOutputWithContext(ctx context.Context) DnsRecordMapOutput {
	return o
}

func (o DnsRecordMapOutput) MapIndex(k pulumi.StringInput) DnsRecordOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DnsRecord {
		return vs[0].(map[string]*DnsRecord)[vs[1].(string)]
	}).(DnsRecordOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DnsRecordInput)(nil)).Elem(), &DnsRecord{})
	pulumi.RegisterInputType(reflect.TypeOf((*DnsRecordArrayInput)(nil)).Elem(), DnsRecordArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DnsRecordMapInput)(nil)).Elem(), DnsRecordMap{})
	pulumi.RegisterOutputType(DnsRecordOutput{})
	pulumi.RegisterOutputType(DnsRecordArrayOutput{})
	pulumi.RegisterOutputType(DnsRecordMapOutput{})
}
