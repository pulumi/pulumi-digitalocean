// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Get information on a certificate. This data source provides the name, type, state,
 * domains, expiry date, and the sha1 fingerprint as configured on your DigitalOcean account.
 * This is useful if the certificate in question is not managed by this provider or you need to utilize
 * any of the certificates data.
 *
 * An error is triggered if the provided certificate name does not exist.
 */
export function getCertificate(args: GetCertificateArgs, opts?: pulumi.InvokeOptions): Promise<GetCertificateResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("digitalocean:index/getCertificate:getCertificate", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getCertificate.
 */
export interface GetCertificateArgs {
    /**
     * The name of certificate.
     */
    name: string;
}

/**
 * A collection of values returned by getCertificate.
 */
export interface GetCertificateResult {
    /**
     * Domains for which the certificate was issued.
     */
    readonly domains: string[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
    /**
     * The expiration date and time of the certificate.
     */
    readonly notAfter: string;
    /**
     * The SHA1 fingerprint of the certificate.
     */
    readonly sha1Fingerprint: string;
    /**
     * the current state of the certificate.
     */
    readonly state: string;
    /**
     * The type of the certificate.
     */
    readonly type: string;
    /**
     * The ID of the certificate.
     */
    readonly uuid: string;
}
/**
 * Get information on a certificate. This data source provides the name, type, state,
 * domains, expiry date, and the sha1 fingerprint as configured on your DigitalOcean account.
 * This is useful if the certificate in question is not managed by this provider or you need to utilize
 * any of the certificates data.
 *
 * An error is triggered if the provided certificate name does not exist.
 */
export function getCertificateOutput(args: GetCertificateOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetCertificateResult> {
    return pulumi.output(args).apply((a: any) => getCertificate(a, opts))
}

/**
 * A collection of arguments for invoking getCertificate.
 */
export interface GetCertificateOutputArgs {
    /**
     * The name of certificate.
     */
    name: pulumi.Input<string>;
}
