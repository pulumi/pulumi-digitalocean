// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

let __config = new pulumi.Config("digitalocean");

/**
 * The URL to use for the DigitalOcean API.
 */
export let apiEndpoint: string | undefined = __config.get("apiEndpoint") || (utilities.getEnv("DIGITALOCEAN_API_URL") || "https://api.digitalocean.com");
/**
 * The access key ID for Spaces API operations.
 */
export let spacesAccessId: string | undefined = __config.get("spacesAccessId");
/**
 * The URL to use for the DigitalOcean Spaces API.
 */
export let spacesEndpoint: string | undefined = __config.get("spacesEndpoint") || utilities.getEnv("SPACES_ENDPOINT_URL");
/**
 * The secret access key for Spaces API operations.
 */
export let spacesSecretKey: string | undefined = __config.get("spacesSecretKey");
/**
 * The token key for API operations.
 */
export let token: string | undefined = __config.get("token");
