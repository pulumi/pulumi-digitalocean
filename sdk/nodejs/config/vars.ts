// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

declare var exports: any;
const __config = new pulumi.Config("digitalocean");

/**
 * The URL to use for the DigitalOcean API.
 */
export declare const apiEndpoint: string;
Object.defineProperty(exports, "apiEndpoint", {
    get() {
        return __config.get("apiEndpoint") ?? (utilities.getEnv("DIGITALOCEAN_API_URL") || "https://api.digitalocean.com");
    },
    enumerable: true,
});

/**
 * The maximum number of retries on a failed API request.
 */
export declare const httpRetryMax: number | undefined;
Object.defineProperty(exports, "httpRetryMax", {
    get() {
        return __config.getObject<number>("httpRetryMax");
    },
    enumerable: true,
});

/**
 * The maximum wait time (in seconds) between failed API requests.
 */
export declare const httpRetryWaitMax: number | undefined;
Object.defineProperty(exports, "httpRetryWaitMax", {
    get() {
        return __config.getObject<number>("httpRetryWaitMax");
    },
    enumerable: true,
});

/**
 * The minimum wait time (in seconds) between failed API requests.
 */
export declare const httpRetryWaitMin: number | undefined;
Object.defineProperty(exports, "httpRetryWaitMin", {
    get() {
        return __config.getObject<number>("httpRetryWaitMin");
    },
    enumerable: true,
});

/**
 * The rate of requests per second to limit the HTTP client.
 */
export declare const requestsPerSecond: number | undefined;
Object.defineProperty(exports, "requestsPerSecond", {
    get() {
        return __config.getObject<number>("requestsPerSecond");
    },
    enumerable: true,
});

/**
 * The access key ID for Spaces API operations.
 */
export declare const spacesAccessId: string | undefined;
Object.defineProperty(exports, "spacesAccessId", {
    get() {
        return __config.get("spacesAccessId");
    },
    enumerable: true,
});

/**
 * The URL to use for the DigitalOcean Spaces API.
 */
export declare const spacesEndpoint: string | undefined;
Object.defineProperty(exports, "spacesEndpoint", {
    get() {
        return __config.get("spacesEndpoint") ?? utilities.getEnv("SPACES_ENDPOINT_URL");
    },
    enumerable: true,
});

/**
 * The secret access key for Spaces API operations.
 */
export declare const spacesSecretKey: string | undefined;
Object.defineProperty(exports, "spacesSecretKey", {
    get() {
        return __config.get("spacesSecretKey");
    },
    enumerable: true,
});

/**
 * The token key for API operations.
 */
export declare const token: string | undefined;
Object.defineProperty(exports, "token", {
    get() {
        return __config.get("token");
    },
    enumerable: true,
});

