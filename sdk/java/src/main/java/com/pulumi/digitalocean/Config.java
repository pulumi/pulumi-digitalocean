// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean;

import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;

public final class Config {

    private static final com.pulumi.Config config = com.pulumi.Config.of("digitalocean");
/**
 * The URL to use for the DigitalOcean API.
 * 
 */
    public String apiEndpoint() {
        return Codegen.stringProp("apiEndpoint").config(config).env("DIGITALOCEAN_API_URL").def("https://api.digitalocean.com").require();
    }
/**
 * The maximum number of retries on a failed API request.
 * 
 */
    public Optional<Integer> httpRetryMax() {
        return Codegen.integerProp("httpRetryMax").config(config).get();
    }
/**
 * The maximum wait time (in seconds) between failed API requests.
 * 
 */
    public Optional<Double> httpRetryWaitMax() {
        return Codegen.doubleProp("httpRetryWaitMax").config(config).get();
    }
/**
 * The minimum wait time (in seconds) between failed API requests.
 * 
 */
    public Optional<Double> httpRetryWaitMin() {
        return Codegen.doubleProp("httpRetryWaitMin").config(config).get();
    }
/**
 * The rate of requests per second to limit the HTTP client.
 * 
 */
    public Optional<Double> requestsPerSecond() {
        return Codegen.doubleProp("requestsPerSecond").config(config).get();
    }
/**
 * The access key ID for Spaces API operations.
 * 
 */
    public Optional<String> spacesAccessId() {
        return Codegen.stringProp("spacesAccessId").config(config).get();
    }
/**
 * The URL to use for the DigitalOcean Spaces API.
 * 
 */
    public Optional<String> spacesEndpoint() {
        return Codegen.stringProp("spacesEndpoint").config(config).env("SPACES_ENDPOINT_URL").get();
    }
/**
 * The secret access key for Spaces API operations.
 * 
 */
    public Optional<String> spacesSecretKey() {
        return Codegen.stringProp("spacesSecretKey").config(config).get();
    }
/**
 * The token key for API operations.
 * 
 */
    public Optional<String> token() {
        return Codegen.stringProp("token").config(config).get();
    }
}
