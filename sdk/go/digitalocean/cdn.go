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

// Provides a DigitalOcean CDN Endpoint resource for use with Spaces.
//
// ## Example Usage
//
// ### Basic Example
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
//			// Create a new Spaces Bucket
//			mybucket, err := digitalocean.NewSpacesBucket(ctx, "mybucket", &digitalocean.SpacesBucketArgs{
//				Name:   pulumi.String("example"),
//				Region: pulumi.String(digitalocean.RegionSFO2),
//				Acl:    pulumi.String("public-read"),
//			})
//			if err != nil {
//				return err
//			}
//			// Add a CDN endpoint to the Spaces Bucket
//			mycdn, err := digitalocean.NewCdn(ctx, "mycdn", &digitalocean.CdnArgs{
//				Origin: mybucket.BucketDomainName,
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("fqdn", mycdn.Endpoint)
//			return nil
//		})
//	}
//
// ```
//
// ### Custom Sub-Domain Example
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
//			// Create a new Spaces Bucket
//			mybucket, err := digitalocean.NewSpacesBucket(ctx, "mybucket", &digitalocean.SpacesBucketArgs{
//				Name:   pulumi.String("example"),
//				Region: pulumi.String(digitalocean.RegionSFO2),
//				Acl:    pulumi.String("public-read"),
//			})
//			if err != nil {
//				return err
//			}
//			// Create a DigitalOcean managed Let's Encrypt Certificate
//			cert, err := digitalocean.NewCertificate(ctx, "cert", &digitalocean.CertificateArgs{
//				Name: pulumi.String("cdn-cert"),
//				Type: pulumi.String(digitalocean.CertificateTypeLetsEncrypt),
//				Domains: pulumi.StringArray{
//					pulumi.String("static.example.com"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			// Add a CDN endpoint with a custom sub-domain to the Spaces Bucket
//			_, err = digitalocean.NewCdn(ctx, "mycdn", &digitalocean.CdnArgs{
//				Origin:          mybucket.BucketDomainName,
//				CustomDomain:    pulumi.String("static.example.com"),
//				CertificateName: cert.Name,
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
// CDN Endpoints can be imported using the CDN `id`, e.g.
//
// ```sh
// $ pulumi import digitalocean:index/cdn:Cdn mycdn fb06ad00-351f-45c8-b5eb-13523c438661
// ```
type Cdn struct {
	pulumi.CustomResourceState

	// **Deprecated** The ID of a DigitalOcean managed TLS certificate used for SSL when a custom subdomain is provided.
	//
	// Deprecated: Certificate IDs may change, for example when a Let's Encrypt certificate is auto-renewed. Please specify 'certificate_name' instead.
	CertificateId pulumi.StringOutput `pulumi:"certificateId"`
	// The unique name of a DigitalOcean managed TLS certificate used for SSL when a custom subdomain is provided.
	CertificateName pulumi.StringOutput `pulumi:"certificateName"`
	// The date and time when the CDN Endpoint was created.
	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// The fully qualified domain name (FQDN) of the custom subdomain used with the CDN Endpoint.
	CustomDomain pulumi.StringPtrOutput `pulumi:"customDomain"`
	// The fully qualified domain name (FQDN) from which the CDN-backed content is served.
	Endpoint pulumi.StringOutput `pulumi:"endpoint"`
	// The fully qualified domain name, (FQDN) for a Space.
	Origin pulumi.StringOutput `pulumi:"origin"`
	// The time to live for the CDN Endpoint, in seconds. Default is 3600 seconds.
	Ttl pulumi.IntOutput `pulumi:"ttl"`
}

// NewCdn registers a new resource with the given unique name, arguments, and options.
func NewCdn(ctx *pulumi.Context,
	name string, args *CdnArgs, opts ...pulumi.ResourceOption) (*Cdn, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Origin == nil {
		return nil, errors.New("invalid value for required argument 'Origin'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Cdn
	err := ctx.RegisterResource("digitalocean:index/cdn:Cdn", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCdn gets an existing Cdn resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCdn(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CdnState, opts ...pulumi.ResourceOption) (*Cdn, error) {
	var resource Cdn
	err := ctx.ReadResource("digitalocean:index/cdn:Cdn", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Cdn resources.
type cdnState struct {
	// **Deprecated** The ID of a DigitalOcean managed TLS certificate used for SSL when a custom subdomain is provided.
	//
	// Deprecated: Certificate IDs may change, for example when a Let's Encrypt certificate is auto-renewed. Please specify 'certificate_name' instead.
	CertificateId *string `pulumi:"certificateId"`
	// The unique name of a DigitalOcean managed TLS certificate used for SSL when a custom subdomain is provided.
	CertificateName *string `pulumi:"certificateName"`
	// The date and time when the CDN Endpoint was created.
	CreatedAt *string `pulumi:"createdAt"`
	// The fully qualified domain name (FQDN) of the custom subdomain used with the CDN Endpoint.
	CustomDomain *string `pulumi:"customDomain"`
	// The fully qualified domain name (FQDN) from which the CDN-backed content is served.
	Endpoint *string `pulumi:"endpoint"`
	// The fully qualified domain name, (FQDN) for a Space.
	Origin *string `pulumi:"origin"`
	// The time to live for the CDN Endpoint, in seconds. Default is 3600 seconds.
	Ttl *int `pulumi:"ttl"`
}

type CdnState struct {
	// **Deprecated** The ID of a DigitalOcean managed TLS certificate used for SSL when a custom subdomain is provided.
	//
	// Deprecated: Certificate IDs may change, for example when a Let's Encrypt certificate is auto-renewed. Please specify 'certificate_name' instead.
	CertificateId pulumi.StringPtrInput
	// The unique name of a DigitalOcean managed TLS certificate used for SSL when a custom subdomain is provided.
	CertificateName pulumi.StringPtrInput
	// The date and time when the CDN Endpoint was created.
	CreatedAt pulumi.StringPtrInput
	// The fully qualified domain name (FQDN) of the custom subdomain used with the CDN Endpoint.
	CustomDomain pulumi.StringPtrInput
	// The fully qualified domain name (FQDN) from which the CDN-backed content is served.
	Endpoint pulumi.StringPtrInput
	// The fully qualified domain name, (FQDN) for a Space.
	Origin pulumi.StringPtrInput
	// The time to live for the CDN Endpoint, in seconds. Default is 3600 seconds.
	Ttl pulumi.IntPtrInput
}

func (CdnState) ElementType() reflect.Type {
	return reflect.TypeOf((*cdnState)(nil)).Elem()
}

type cdnArgs struct {
	// **Deprecated** The ID of a DigitalOcean managed TLS certificate used for SSL when a custom subdomain is provided.
	//
	// Deprecated: Certificate IDs may change, for example when a Let's Encrypt certificate is auto-renewed. Please specify 'certificate_name' instead.
	CertificateId *string `pulumi:"certificateId"`
	// The unique name of a DigitalOcean managed TLS certificate used for SSL when a custom subdomain is provided.
	CertificateName *string `pulumi:"certificateName"`
	// The fully qualified domain name (FQDN) of the custom subdomain used with the CDN Endpoint.
	CustomDomain *string `pulumi:"customDomain"`
	// The fully qualified domain name, (FQDN) for a Space.
	Origin string `pulumi:"origin"`
	// The time to live for the CDN Endpoint, in seconds. Default is 3600 seconds.
	Ttl *int `pulumi:"ttl"`
}

// The set of arguments for constructing a Cdn resource.
type CdnArgs struct {
	// **Deprecated** The ID of a DigitalOcean managed TLS certificate used for SSL when a custom subdomain is provided.
	//
	// Deprecated: Certificate IDs may change, for example when a Let's Encrypt certificate is auto-renewed. Please specify 'certificate_name' instead.
	CertificateId pulumi.StringPtrInput
	// The unique name of a DigitalOcean managed TLS certificate used for SSL when a custom subdomain is provided.
	CertificateName pulumi.StringPtrInput
	// The fully qualified domain name (FQDN) of the custom subdomain used with the CDN Endpoint.
	CustomDomain pulumi.StringPtrInput
	// The fully qualified domain name, (FQDN) for a Space.
	Origin pulumi.StringInput
	// The time to live for the CDN Endpoint, in seconds. Default is 3600 seconds.
	Ttl pulumi.IntPtrInput
}

func (CdnArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*cdnArgs)(nil)).Elem()
}

type CdnInput interface {
	pulumi.Input

	ToCdnOutput() CdnOutput
	ToCdnOutputWithContext(ctx context.Context) CdnOutput
}

func (*Cdn) ElementType() reflect.Type {
	return reflect.TypeOf((**Cdn)(nil)).Elem()
}

func (i *Cdn) ToCdnOutput() CdnOutput {
	return i.ToCdnOutputWithContext(context.Background())
}

func (i *Cdn) ToCdnOutputWithContext(ctx context.Context) CdnOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CdnOutput)
}

// CdnArrayInput is an input type that accepts CdnArray and CdnArrayOutput values.
// You can construct a concrete instance of `CdnArrayInput` via:
//
//	CdnArray{ CdnArgs{...} }
type CdnArrayInput interface {
	pulumi.Input

	ToCdnArrayOutput() CdnArrayOutput
	ToCdnArrayOutputWithContext(context.Context) CdnArrayOutput
}

type CdnArray []CdnInput

func (CdnArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Cdn)(nil)).Elem()
}

func (i CdnArray) ToCdnArrayOutput() CdnArrayOutput {
	return i.ToCdnArrayOutputWithContext(context.Background())
}

func (i CdnArray) ToCdnArrayOutputWithContext(ctx context.Context) CdnArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CdnArrayOutput)
}

// CdnMapInput is an input type that accepts CdnMap and CdnMapOutput values.
// You can construct a concrete instance of `CdnMapInput` via:
//
//	CdnMap{ "key": CdnArgs{...} }
type CdnMapInput interface {
	pulumi.Input

	ToCdnMapOutput() CdnMapOutput
	ToCdnMapOutputWithContext(context.Context) CdnMapOutput
}

type CdnMap map[string]CdnInput

func (CdnMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Cdn)(nil)).Elem()
}

func (i CdnMap) ToCdnMapOutput() CdnMapOutput {
	return i.ToCdnMapOutputWithContext(context.Background())
}

func (i CdnMap) ToCdnMapOutputWithContext(ctx context.Context) CdnMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CdnMapOutput)
}

type CdnOutput struct{ *pulumi.OutputState }

func (CdnOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Cdn)(nil)).Elem()
}

func (o CdnOutput) ToCdnOutput() CdnOutput {
	return o
}

func (o CdnOutput) ToCdnOutputWithContext(ctx context.Context) CdnOutput {
	return o
}

// **Deprecated** The ID of a DigitalOcean managed TLS certificate used for SSL when a custom subdomain is provided.
//
// Deprecated: Certificate IDs may change, for example when a Let's Encrypt certificate is auto-renewed. Please specify 'certificate_name' instead.
func (o CdnOutput) CertificateId() pulumi.StringOutput {
	return o.ApplyT(func(v *Cdn) pulumi.StringOutput { return v.CertificateId }).(pulumi.StringOutput)
}

// The unique name of a DigitalOcean managed TLS certificate used for SSL when a custom subdomain is provided.
func (o CdnOutput) CertificateName() pulumi.StringOutput {
	return o.ApplyT(func(v *Cdn) pulumi.StringOutput { return v.CertificateName }).(pulumi.StringOutput)
}

// The date and time when the CDN Endpoint was created.
func (o CdnOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *Cdn) pulumi.StringOutput { return v.CreatedAt }).(pulumi.StringOutput)
}

// The fully qualified domain name (FQDN) of the custom subdomain used with the CDN Endpoint.
func (o CdnOutput) CustomDomain() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Cdn) pulumi.StringPtrOutput { return v.CustomDomain }).(pulumi.StringPtrOutput)
}

// The fully qualified domain name (FQDN) from which the CDN-backed content is served.
func (o CdnOutput) Endpoint() pulumi.StringOutput {
	return o.ApplyT(func(v *Cdn) pulumi.StringOutput { return v.Endpoint }).(pulumi.StringOutput)
}

// The fully qualified domain name, (FQDN) for a Space.
func (o CdnOutput) Origin() pulumi.StringOutput {
	return o.ApplyT(func(v *Cdn) pulumi.StringOutput { return v.Origin }).(pulumi.StringOutput)
}

// The time to live for the CDN Endpoint, in seconds. Default is 3600 seconds.
func (o CdnOutput) Ttl() pulumi.IntOutput {
	return o.ApplyT(func(v *Cdn) pulumi.IntOutput { return v.Ttl }).(pulumi.IntOutput)
}

type CdnArrayOutput struct{ *pulumi.OutputState }

func (CdnArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Cdn)(nil)).Elem()
}

func (o CdnArrayOutput) ToCdnArrayOutput() CdnArrayOutput {
	return o
}

func (o CdnArrayOutput) ToCdnArrayOutputWithContext(ctx context.Context) CdnArrayOutput {
	return o
}

func (o CdnArrayOutput) Index(i pulumi.IntInput) CdnOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Cdn {
		return vs[0].([]*Cdn)[vs[1].(int)]
	}).(CdnOutput)
}

type CdnMapOutput struct{ *pulumi.OutputState }

func (CdnMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Cdn)(nil)).Elem()
}

func (o CdnMapOutput) ToCdnMapOutput() CdnMapOutput {
	return o
}

func (o CdnMapOutput) ToCdnMapOutputWithContext(ctx context.Context) CdnMapOutput {
	return o
}

func (o CdnMapOutput) MapIndex(k pulumi.StringInput) CdnOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Cdn {
		return vs[0].(map[string]*Cdn)[vs[1].(string)]
	}).(CdnOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CdnInput)(nil)).Elem(), &Cdn{})
	pulumi.RegisterInputType(reflect.TypeOf((*CdnArrayInput)(nil)).Elem(), CdnArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CdnMapInput)(nil)).Elem(), CdnMap{})
	pulumi.RegisterOutputType(CdnOutput{})
	pulumi.RegisterOutputType(CdnArrayOutput{})
	pulumi.RegisterOutputType(CdnMapOutput{})
}
