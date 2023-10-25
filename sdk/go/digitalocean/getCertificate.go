// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-digitalocean/sdk/v4/go/digitalocean/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Get information on a certificate. This data source provides the name, type, state,
// domains, expiry date, and the sha1 fingerprint as configured on your DigitalOcean account.
// This is useful if the certificate in question is not managed by this provider or you need to utilize
// any of the certificates data.
//
// An error is triggered if the provided certificate name does not exist.
//
// ## Example Usage
//
// Get the certificate:
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
//			_, err := digitalocean.LookupCertificate(ctx, &digitalocean.LookupCertificateArgs{
//				Name: "example",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupCertificate(ctx *pulumi.Context, args *LookupCertificateArgs, opts ...pulumi.InvokeOption) (*LookupCertificateResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupCertificateResult
	err := ctx.Invoke("digitalocean:index/getCertificate:getCertificate", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCertificate.
type LookupCertificateArgs struct {
	// The name of certificate.
	Name string `pulumi:"name"`
}

// A collection of values returned by getCertificate.
type LookupCertificateResult struct {
	// Domains for which the certificate was issued.
	Domains []string `pulumi:"domains"`
	// The provider-assigned unique ID for this managed resource.
	Id   string `pulumi:"id"`
	Name string `pulumi:"name"`
	// The expiration date and time of the certificate.
	NotAfter string `pulumi:"notAfter"`
	// The SHA1 fingerprint of the certificate.
	Sha1Fingerprint string `pulumi:"sha1Fingerprint"`
	// the current state of the certificate.
	State string `pulumi:"state"`
	// The type of the certificate.
	Type string `pulumi:"type"`
	// The ID of the certificate.
	Uuid string `pulumi:"uuid"`
}

func LookupCertificateOutput(ctx *pulumi.Context, args LookupCertificateOutputArgs, opts ...pulumi.InvokeOption) LookupCertificateResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupCertificateResult, error) {
			args := v.(LookupCertificateArgs)
			r, err := LookupCertificate(ctx, &args, opts...)
			var s LookupCertificateResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupCertificateResultOutput)
}

// A collection of arguments for invoking getCertificate.
type LookupCertificateOutputArgs struct {
	// The name of certificate.
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupCertificateOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCertificateArgs)(nil)).Elem()
}

// A collection of values returned by getCertificate.
type LookupCertificateResultOutput struct{ *pulumi.OutputState }

func (LookupCertificateResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCertificateResult)(nil)).Elem()
}

func (o LookupCertificateResultOutput) ToLookupCertificateResultOutput() LookupCertificateResultOutput {
	return o
}

func (o LookupCertificateResultOutput) ToLookupCertificateResultOutputWithContext(ctx context.Context) LookupCertificateResultOutput {
	return o
}

func (o LookupCertificateResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupCertificateResult] {
	return pulumix.Output[LookupCertificateResult]{
		OutputState: o.OutputState,
	}
}

// Domains for which the certificate was issued.
func (o LookupCertificateResultOutput) Domains() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupCertificateResult) []string { return v.Domains }).(pulumi.StringArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupCertificateResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCertificateResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupCertificateResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCertificateResult) string { return v.Name }).(pulumi.StringOutput)
}

// The expiration date and time of the certificate.
func (o LookupCertificateResultOutput) NotAfter() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCertificateResult) string { return v.NotAfter }).(pulumi.StringOutput)
}

// The SHA1 fingerprint of the certificate.
func (o LookupCertificateResultOutput) Sha1Fingerprint() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCertificateResult) string { return v.Sha1Fingerprint }).(pulumi.StringOutput)
}

// the current state of the certificate.
func (o LookupCertificateResultOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCertificateResult) string { return v.State }).(pulumi.StringOutput)
}

// The type of the certificate.
func (o LookupCertificateResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCertificateResult) string { return v.Type }).(pulumi.StringOutput)
}

// The ID of the certificate.
func (o LookupCertificateResultOutput) Uuid() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCertificateResult) string { return v.Uuid }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupCertificateResultOutput{})
}
