// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a DigitalOcean CDN Endpoint resource for use with Spaces.
 *
 * ## Example Usage
 *
 * ### Basic Example
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * // Create a new Spaces Bucket
 * const mybucket = new digitalocean.SpacesBucket("mybucket", {
 *     name: "example",
 *     region: digitalocean.Region.SFO2,
 *     acl: "public-read",
 * });
 * // Add a CDN endpoint to the Spaces Bucket
 * const mycdn = new digitalocean.Cdn("mycdn", {origin: mybucket.bucketDomainName});
 * export const fqdn = mycdn.endpoint;
 * ```
 *
 * ### Custom Sub-Domain Example
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as digitalocean from "@pulumi/digitalocean";
 *
 * // Create a new Spaces Bucket
 * const mybucket = new digitalocean.SpacesBucket("mybucket", {
 *     name: "example",
 *     region: digitalocean.Region.SFO2,
 *     acl: "public-read",
 * });
 * // Create a DigitalOcean managed Let's Encrypt Certificate
 * const cert = new digitalocean.Certificate("cert", {
 *     name: "cdn-cert",
 *     type: digitalocean.CertificateType.LetsEncrypt,
 *     domains: ["static.example.com"],
 * });
 * // Add a CDN endpoint with a custom sub-domain to the Spaces Bucket
 * const mycdn = new digitalocean.Cdn("mycdn", {
 *     origin: mybucket.bucketDomainName,
 *     customDomain: "static.example.com",
 *     certificateName: cert.name,
 * });
 * ```
 *
 * ## Import
 *
 * CDN Endpoints can be imported using the CDN `id`, e.g.
 *
 * ```sh
 * $ pulumi import digitalocean:index/cdn:Cdn mycdn fb06ad00-351f-45c8-b5eb-13523c438661
 * ```
 */
export class Cdn extends pulumi.CustomResource {
    /**
     * Get an existing Cdn resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CdnState, opts?: pulumi.CustomResourceOptions): Cdn {
        return new Cdn(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'digitalocean:index/cdn:Cdn';

    /**
     * Returns true if the given object is an instance of Cdn.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Cdn {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Cdn.__pulumiType;
    }

    /**
     * **Deprecated** The ID of a DigitalOcean managed TLS certificate used for SSL when a custom subdomain is provided.
     *
     * @deprecated Certificate IDs may change, for example when a Let's Encrypt certificate is auto-renewed. Please specify 'certificate_name' instead.
     */
    public readonly certificateId!: pulumi.Output<string>;
    /**
     * The unique name of a DigitalOcean managed TLS certificate used for SSL when a custom subdomain is provided.
     */
    public readonly certificateName!: pulumi.Output<string>;
    /**
     * The date and time when the CDN Endpoint was created.
     */
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * The fully qualified domain name (FQDN) of the custom subdomain used with the CDN Endpoint.
     */
    public readonly customDomain!: pulumi.Output<string | undefined>;
    /**
     * The fully qualified domain name (FQDN) from which the CDN-backed content is served.
     */
    public /*out*/ readonly endpoint!: pulumi.Output<string>;
    /**
     * The fully qualified domain name, (FQDN) for a Space.
     */
    public readonly origin!: pulumi.Output<string>;
    /**
     * The time to live for the CDN Endpoint, in seconds. Default is 3600 seconds.
     */
    public readonly ttl!: pulumi.Output<number>;

    /**
     * Create a Cdn resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CdnArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CdnArgs | CdnState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CdnState | undefined;
            resourceInputs["certificateId"] = state ? state.certificateId : undefined;
            resourceInputs["certificateName"] = state ? state.certificateName : undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["customDomain"] = state ? state.customDomain : undefined;
            resourceInputs["endpoint"] = state ? state.endpoint : undefined;
            resourceInputs["origin"] = state ? state.origin : undefined;
            resourceInputs["ttl"] = state ? state.ttl : undefined;
        } else {
            const args = argsOrState as CdnArgs | undefined;
            if ((!args || args.origin === undefined) && !opts.urn) {
                throw new Error("Missing required property 'origin'");
            }
            resourceInputs["certificateId"] = args ? args.certificateId : undefined;
            resourceInputs["certificateName"] = args ? args.certificateName : undefined;
            resourceInputs["customDomain"] = args ? args.customDomain : undefined;
            resourceInputs["origin"] = args ? args.origin : undefined;
            resourceInputs["ttl"] = args ? args.ttl : undefined;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["endpoint"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Cdn.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Cdn resources.
 */
export interface CdnState {
    /**
     * **Deprecated** The ID of a DigitalOcean managed TLS certificate used for SSL when a custom subdomain is provided.
     *
     * @deprecated Certificate IDs may change, for example when a Let's Encrypt certificate is auto-renewed. Please specify 'certificate_name' instead.
     */
    certificateId?: pulumi.Input<string>;
    /**
     * The unique name of a DigitalOcean managed TLS certificate used for SSL when a custom subdomain is provided.
     */
    certificateName?: pulumi.Input<string>;
    /**
     * The date and time when the CDN Endpoint was created.
     */
    createdAt?: pulumi.Input<string>;
    /**
     * The fully qualified domain name (FQDN) of the custom subdomain used with the CDN Endpoint.
     */
    customDomain?: pulumi.Input<string>;
    /**
     * The fully qualified domain name (FQDN) from which the CDN-backed content is served.
     */
    endpoint?: pulumi.Input<string>;
    /**
     * The fully qualified domain name, (FQDN) for a Space.
     */
    origin?: pulumi.Input<string>;
    /**
     * The time to live for the CDN Endpoint, in seconds. Default is 3600 seconds.
     */
    ttl?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a Cdn resource.
 */
export interface CdnArgs {
    /**
     * **Deprecated** The ID of a DigitalOcean managed TLS certificate used for SSL when a custom subdomain is provided.
     *
     * @deprecated Certificate IDs may change, for example when a Let's Encrypt certificate is auto-renewed. Please specify 'certificate_name' instead.
     */
    certificateId?: pulumi.Input<string>;
    /**
     * The unique name of a DigitalOcean managed TLS certificate used for SSL when a custom subdomain is provided.
     */
    certificateName?: pulumi.Input<string>;
    /**
     * The fully qualified domain name (FQDN) of the custom subdomain used with the CDN Endpoint.
     */
    customDomain?: pulumi.Input<string>;
    /**
     * The fully qualified domain name, (FQDN) for a Space.
     */
    origin: pulumi.Input<string>;
    /**
     * The time to live for the CDN Endpoint, in seconds. Default is 3600 seconds.
     */
    ttl?: pulumi.Input<number>;
}
