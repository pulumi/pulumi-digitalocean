// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-digitalocean/sdk/v4/go/digitalocean/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a DigitalOcean Certificate resource that allows you to manage
// certificates for configuring TLS termination in Load Balancers.
// Certificates created with this resource can be referenced in your
// Load Balancer configuration via their ID. The certificate can either
// be a custom one provided by you or automatically generated one with
// Let's Encrypt.
//
// ## Example Usage
//
// ### Custom Certificate
//
// ```go
// package main
//
// import (
//
//	"os"
//
//	"github.com/pulumi/pulumi-digitalocean/sdk/v4/go/digitalocean"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func readFileOrPanic(path string) pulumi.StringPtrInput {
//		data, err := os.ReadFile(path)
//		if err != nil {
//			panic(err.Error())
//		}
//		return pulumi.String(string(data))
//	}
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := digitalocean.NewCertificate(ctx, "cert", &digitalocean.CertificateArgs{
//				Type:             pulumi.String(digitalocean.CertificateTypeCustom),
//				PrivateKey:       readFileOrPanic("/Users/myuser/certs/privkey.pem"),
//				LeafCertificate:  readFileOrPanic("/Users/myuser/certs/cert.pem"),
//				CertificateChain: readFileOrPanic("/Users/myuser/certs/fullchain.pem"),
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
// ### Let's Encrypt Certificate
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
//			_, err := digitalocean.NewCertificate(ctx, "cert", &digitalocean.CertificateArgs{
//				Domains: pulumi.StringArray{
//					pulumi.String("example.com"),
//				},
//				Type: pulumi.String(digitalocean.CertificateTypeLetsEncrypt),
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
// ### Use with Other Resources
//
// Both custom and Let's Encrypt certificates can be used with other resources
// including the `LoadBalancer` and `Cdn` resources.
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
//			cert, err := digitalocean.NewCertificate(ctx, "cert", &digitalocean.CertificateArgs{
//				Type: pulumi.String(digitalocean.CertificateTypeLetsEncrypt),
//				Domains: pulumi.StringArray{
//					pulumi.String("example.com"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			// Create a new Load Balancer with TLS termination
//			_, err = digitalocean.NewLoadBalancer(ctx, "public", &digitalocean.LoadBalancerArgs{
//				Region:     pulumi.String(digitalocean.RegionNYC3),
//				DropletTag: pulumi.String("backend"),
//				ForwardingRules: digitalocean.LoadBalancerForwardingRuleArray{
//					&digitalocean.LoadBalancerForwardingRuleArgs{
//						EntryPort:       pulumi.Int(443),
//						EntryProtocol:   pulumi.String("https"),
//						TargetPort:      pulumi.Int(80),
//						TargetProtocol:  pulumi.String("http"),
//						CertificateName: cert.Name,
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
// Certificates can be imported using the certificate `name`, e.g.
//
// ```sh
// $ pulumi import digitalocean:index/certificate:Certificate mycertificate cert-01
// ```
type Certificate struct {
	pulumi.CustomResourceState

	// The full PEM-formatted trust chain
	// between the certificate authority's certificate and your domain's TLS
	// certificate. Only valid when type is `custom`.
	CertificateChain pulumi.StringPtrOutput `pulumi:"certificateChain"`
	// List of fully qualified domain names (FQDNs) for
	// which the certificate will be issued. The domains must be managed using
	// DigitalOcean's DNS. Only valid when type is `letsEncrypt`.
	Domains pulumi.StringArrayOutput `pulumi:"domains"`
	// The contents of a PEM-formatted public
	// TLS certificate. Only valid when type is `custom`.
	LeafCertificate pulumi.StringPtrOutput `pulumi:"leafCertificate"`
	// The name of the certificate for identification.
	Name pulumi.StringOutput `pulumi:"name"`
	// The expiration date of the certificate
	NotAfter pulumi.StringOutput `pulumi:"notAfter"`
	// The contents of a PEM-formatted private-key
	// corresponding to the SSL certificate. Only valid when type is `custom`.
	PrivateKey pulumi.StringPtrOutput `pulumi:"privateKey"`
	// The SHA-1 fingerprint of the certificate
	Sha1Fingerprint pulumi.StringOutput `pulumi:"sha1Fingerprint"`
	State           pulumi.StringOutput `pulumi:"state"`
	// The type of certificate to provision. Can be either
	// `custom` or `letsEncrypt`. Defaults to `custom`.
	Type pulumi.StringPtrOutput `pulumi:"type"`
	// The UUID of the certificate
	Uuid pulumi.StringOutput `pulumi:"uuid"`
}

// NewCertificate registers a new resource with the given unique name, arguments, and options.
func NewCertificate(ctx *pulumi.Context,
	name string, args *CertificateArgs, opts ...pulumi.ResourceOption) (*Certificate, error) {
	if args == nil {
		args = &CertificateArgs{}
	}

	if args.PrivateKey != nil {
		args.PrivateKey = pulumi.ToSecret(args.PrivateKey).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"privateKey",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Certificate
	err := ctx.RegisterResource("digitalocean:index/certificate:Certificate", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCertificate gets an existing Certificate resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCertificate(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CertificateState, opts ...pulumi.ResourceOption) (*Certificate, error) {
	var resource Certificate
	err := ctx.ReadResource("digitalocean:index/certificate:Certificate", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Certificate resources.
type certificateState struct {
	// The full PEM-formatted trust chain
	// between the certificate authority's certificate and your domain's TLS
	// certificate. Only valid when type is `custom`.
	CertificateChain *string `pulumi:"certificateChain"`
	// List of fully qualified domain names (FQDNs) for
	// which the certificate will be issued. The domains must be managed using
	// DigitalOcean's DNS. Only valid when type is `letsEncrypt`.
	Domains []string `pulumi:"domains"`
	// The contents of a PEM-formatted public
	// TLS certificate. Only valid when type is `custom`.
	LeafCertificate *string `pulumi:"leafCertificate"`
	// The name of the certificate for identification.
	Name *string `pulumi:"name"`
	// The expiration date of the certificate
	NotAfter *string `pulumi:"notAfter"`
	// The contents of a PEM-formatted private-key
	// corresponding to the SSL certificate. Only valid when type is `custom`.
	PrivateKey *string `pulumi:"privateKey"`
	// The SHA-1 fingerprint of the certificate
	Sha1Fingerprint *string `pulumi:"sha1Fingerprint"`
	State           *string `pulumi:"state"`
	// The type of certificate to provision. Can be either
	// `custom` or `letsEncrypt`. Defaults to `custom`.
	Type *string `pulumi:"type"`
	// The UUID of the certificate
	Uuid *string `pulumi:"uuid"`
}

type CertificateState struct {
	// The full PEM-formatted trust chain
	// between the certificate authority's certificate and your domain's TLS
	// certificate. Only valid when type is `custom`.
	CertificateChain pulumi.StringPtrInput
	// List of fully qualified domain names (FQDNs) for
	// which the certificate will be issued. The domains must be managed using
	// DigitalOcean's DNS. Only valid when type is `letsEncrypt`.
	Domains pulumi.StringArrayInput
	// The contents of a PEM-formatted public
	// TLS certificate. Only valid when type is `custom`.
	LeafCertificate pulumi.StringPtrInput
	// The name of the certificate for identification.
	Name pulumi.StringPtrInput
	// The expiration date of the certificate
	NotAfter pulumi.StringPtrInput
	// The contents of a PEM-formatted private-key
	// corresponding to the SSL certificate. Only valid when type is `custom`.
	PrivateKey pulumi.StringPtrInput
	// The SHA-1 fingerprint of the certificate
	Sha1Fingerprint pulumi.StringPtrInput
	State           pulumi.StringPtrInput
	// The type of certificate to provision. Can be either
	// `custom` or `letsEncrypt`. Defaults to `custom`.
	Type pulumi.StringPtrInput
	// The UUID of the certificate
	Uuid pulumi.StringPtrInput
}

func (CertificateState) ElementType() reflect.Type {
	return reflect.TypeOf((*certificateState)(nil)).Elem()
}

type certificateArgs struct {
	// The full PEM-formatted trust chain
	// between the certificate authority's certificate and your domain's TLS
	// certificate. Only valid when type is `custom`.
	CertificateChain *string `pulumi:"certificateChain"`
	// List of fully qualified domain names (FQDNs) for
	// which the certificate will be issued. The domains must be managed using
	// DigitalOcean's DNS. Only valid when type is `letsEncrypt`.
	Domains []string `pulumi:"domains"`
	// The contents of a PEM-formatted public
	// TLS certificate. Only valid when type is `custom`.
	LeafCertificate *string `pulumi:"leafCertificate"`
	// The name of the certificate for identification.
	Name *string `pulumi:"name"`
	// The contents of a PEM-formatted private-key
	// corresponding to the SSL certificate. Only valid when type is `custom`.
	PrivateKey *string `pulumi:"privateKey"`
	// The type of certificate to provision. Can be either
	// `custom` or `letsEncrypt`. Defaults to `custom`.
	Type *string `pulumi:"type"`
}

// The set of arguments for constructing a Certificate resource.
type CertificateArgs struct {
	// The full PEM-formatted trust chain
	// between the certificate authority's certificate and your domain's TLS
	// certificate. Only valid when type is `custom`.
	CertificateChain pulumi.StringPtrInput
	// List of fully qualified domain names (FQDNs) for
	// which the certificate will be issued. The domains must be managed using
	// DigitalOcean's DNS. Only valid when type is `letsEncrypt`.
	Domains pulumi.StringArrayInput
	// The contents of a PEM-formatted public
	// TLS certificate. Only valid when type is `custom`.
	LeafCertificate pulumi.StringPtrInput
	// The name of the certificate for identification.
	Name pulumi.StringPtrInput
	// The contents of a PEM-formatted private-key
	// corresponding to the SSL certificate. Only valid when type is `custom`.
	PrivateKey pulumi.StringPtrInput
	// The type of certificate to provision. Can be either
	// `custom` or `letsEncrypt`. Defaults to `custom`.
	Type pulumi.StringPtrInput
}

func (CertificateArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*certificateArgs)(nil)).Elem()
}

type CertificateInput interface {
	pulumi.Input

	ToCertificateOutput() CertificateOutput
	ToCertificateOutputWithContext(ctx context.Context) CertificateOutput
}

func (*Certificate) ElementType() reflect.Type {
	return reflect.TypeOf((**Certificate)(nil)).Elem()
}

func (i *Certificate) ToCertificateOutput() CertificateOutput {
	return i.ToCertificateOutputWithContext(context.Background())
}

func (i *Certificate) ToCertificateOutputWithContext(ctx context.Context) CertificateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CertificateOutput)
}

// CertificateArrayInput is an input type that accepts CertificateArray and CertificateArrayOutput values.
// You can construct a concrete instance of `CertificateArrayInput` via:
//
//	CertificateArray{ CertificateArgs{...} }
type CertificateArrayInput interface {
	pulumi.Input

	ToCertificateArrayOutput() CertificateArrayOutput
	ToCertificateArrayOutputWithContext(context.Context) CertificateArrayOutput
}

type CertificateArray []CertificateInput

func (CertificateArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Certificate)(nil)).Elem()
}

func (i CertificateArray) ToCertificateArrayOutput() CertificateArrayOutput {
	return i.ToCertificateArrayOutputWithContext(context.Background())
}

func (i CertificateArray) ToCertificateArrayOutputWithContext(ctx context.Context) CertificateArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CertificateArrayOutput)
}

// CertificateMapInput is an input type that accepts CertificateMap and CertificateMapOutput values.
// You can construct a concrete instance of `CertificateMapInput` via:
//
//	CertificateMap{ "key": CertificateArgs{...} }
type CertificateMapInput interface {
	pulumi.Input

	ToCertificateMapOutput() CertificateMapOutput
	ToCertificateMapOutputWithContext(context.Context) CertificateMapOutput
}

type CertificateMap map[string]CertificateInput

func (CertificateMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Certificate)(nil)).Elem()
}

func (i CertificateMap) ToCertificateMapOutput() CertificateMapOutput {
	return i.ToCertificateMapOutputWithContext(context.Background())
}

func (i CertificateMap) ToCertificateMapOutputWithContext(ctx context.Context) CertificateMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CertificateMapOutput)
}

type CertificateOutput struct{ *pulumi.OutputState }

func (CertificateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Certificate)(nil)).Elem()
}

func (o CertificateOutput) ToCertificateOutput() CertificateOutput {
	return o
}

func (o CertificateOutput) ToCertificateOutputWithContext(ctx context.Context) CertificateOutput {
	return o
}

// The full PEM-formatted trust chain
// between the certificate authority's certificate and your domain's TLS
// certificate. Only valid when type is `custom`.
func (o CertificateOutput) CertificateChain() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringPtrOutput { return v.CertificateChain }).(pulumi.StringPtrOutput)
}

// List of fully qualified domain names (FQDNs) for
// which the certificate will be issued. The domains must be managed using
// DigitalOcean's DNS. Only valid when type is `letsEncrypt`.
func (o CertificateOutput) Domains() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringArrayOutput { return v.Domains }).(pulumi.StringArrayOutput)
}

// The contents of a PEM-formatted public
// TLS certificate. Only valid when type is `custom`.
func (o CertificateOutput) LeafCertificate() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringPtrOutput { return v.LeafCertificate }).(pulumi.StringPtrOutput)
}

// The name of the certificate for identification.
func (o CertificateOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The expiration date of the certificate
func (o CertificateOutput) NotAfter() pulumi.StringOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringOutput { return v.NotAfter }).(pulumi.StringOutput)
}

// The contents of a PEM-formatted private-key
// corresponding to the SSL certificate. Only valid when type is `custom`.
func (o CertificateOutput) PrivateKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringPtrOutput { return v.PrivateKey }).(pulumi.StringPtrOutput)
}

// The SHA-1 fingerprint of the certificate
func (o CertificateOutput) Sha1Fingerprint() pulumi.StringOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringOutput { return v.Sha1Fingerprint }).(pulumi.StringOutput)
}

func (o CertificateOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

// The type of certificate to provision. Can be either
// `custom` or `letsEncrypt`. Defaults to `custom`.
func (o CertificateOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringPtrOutput { return v.Type }).(pulumi.StringPtrOutput)
}

// The UUID of the certificate
func (o CertificateOutput) Uuid() pulumi.StringOutput {
	return o.ApplyT(func(v *Certificate) pulumi.StringOutput { return v.Uuid }).(pulumi.StringOutput)
}

type CertificateArrayOutput struct{ *pulumi.OutputState }

func (CertificateArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Certificate)(nil)).Elem()
}

func (o CertificateArrayOutput) ToCertificateArrayOutput() CertificateArrayOutput {
	return o
}

func (o CertificateArrayOutput) ToCertificateArrayOutputWithContext(ctx context.Context) CertificateArrayOutput {
	return o
}

func (o CertificateArrayOutput) Index(i pulumi.IntInput) CertificateOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Certificate {
		return vs[0].([]*Certificate)[vs[1].(int)]
	}).(CertificateOutput)
}

type CertificateMapOutput struct{ *pulumi.OutputState }

func (CertificateMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Certificate)(nil)).Elem()
}

func (o CertificateMapOutput) ToCertificateMapOutput() CertificateMapOutput {
	return o
}

func (o CertificateMapOutput) ToCertificateMapOutputWithContext(ctx context.Context) CertificateMapOutput {
	return o
}

func (o CertificateMapOutput) MapIndex(k pulumi.StringInput) CertificateOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Certificate {
		return vs[0].(map[string]*Certificate)[vs[1].(string)]
	}).(CertificateOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CertificateInput)(nil)).Elem(), &Certificate{})
	pulumi.RegisterInputType(reflect.TypeOf((*CertificateArrayInput)(nil)).Elem(), CertificateArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CertificateMapInput)(nil)).Elem(), CertificateMap{})
	pulumi.RegisterOutputType(CertificateOutput{})
	pulumi.RegisterOutputType(CertificateArrayOutput{})
	pulumi.RegisterOutputType(CertificateMapOutput{})
}
