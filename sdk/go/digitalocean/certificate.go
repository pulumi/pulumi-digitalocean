// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"reflect"

	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a DigitalOcean Certificate resource that allows you to manage
// certificates for configuring TLS termination in Load Balancers.
// Certificates created with this resource can be referenced in your
// Load Balancer configuration via their ID. The certificate can either
// be a custom one provided by you or automatically generated one with
// Let's Encrypt.
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
}

// NewCertificate registers a new resource with the given unique name, arguments, and options.
func NewCertificate(ctx *pulumi.Context,
	name string, args *CertificateArgs, opts ...pulumi.ResourceOption) (*Certificate, error) {
	if args == nil {
		args = &CertificateArgs{}
	}
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
