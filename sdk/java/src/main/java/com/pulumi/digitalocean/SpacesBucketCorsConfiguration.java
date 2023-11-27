// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.digitalocean.SpacesBucketCorsConfigurationArgs;
import com.pulumi.digitalocean.Utilities;
import com.pulumi.digitalocean.inputs.SpacesBucketCorsConfigurationState;
import com.pulumi.digitalocean.outputs.SpacesBucketCorsConfigurationCorsRule;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ### Create a Key in a Spaces Bucket
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.digitalocean.SpacesBucket;
 * import com.pulumi.digitalocean.SpacesBucketArgs;
 * import com.pulumi.digitalocean.SpacesBucketCorsConfiguration;
 * import com.pulumi.digitalocean.SpacesBucketCorsConfigurationArgs;
 * import com.pulumi.digitalocean.inputs.SpacesBucketCorsConfigurationCorsRuleArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var foobar = new SpacesBucket(&#34;foobar&#34;, SpacesBucketArgs.builder()        
 *             .region(&#34;nyc3&#34;)
 *             .build());
 * 
 *         var test = new SpacesBucketCorsConfiguration(&#34;test&#34;, SpacesBucketCorsConfigurationArgs.builder()        
 *             .bucket(foobar.id())
 *             .region(&#34;nyc3&#34;)
 *             .corsRules(SpacesBucketCorsConfigurationCorsRuleArgs.builder()
 *                 .allowedHeaders(&#34;*&#34;)
 *                 .allowedMethods(                
 *                     &#34;PUT&#34;,
 *                     &#34;POST&#34;)
 *                 .allowedOrigins(&#34;https://s3-website-test.hashicorp.com&#34;)
 *                 .exposeHeaders(&#34;ETag&#34;)
 *                 .maxAgeSeconds(3000)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Bucket policies can be imported using the `region` and `bucket` attributes (delimited by a comma)
 * 
 * ```sh
 *  $ pulumi import digitalocean:index/spacesBucketCorsConfiguration:SpacesBucketCorsConfiguration foobar `region`,`bucket`
 * ```
 * 
 */
@ResourceType(type="digitalocean:index/spacesBucketCorsConfiguration:SpacesBucketCorsConfiguration")
public class SpacesBucketCorsConfiguration extends com.pulumi.resources.CustomResource {
    /**
     * The name of the bucket to which to apply the CORS configuration.
     * 
     */
    @Export(name="bucket", refs={String.class}, tree="[0]")
    private Output<String> bucket;

    /**
     * @return The name of the bucket to which to apply the CORS configuration.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }
    /**
     * Set of origins and methods (cross-origin access that you want to allow). See below. You can configure up to 100 rules.
     * 
     */
    @Export(name="corsRules", refs={List.class,SpacesBucketCorsConfigurationCorsRule.class}, tree="[0,1]")
    private Output<List<SpacesBucketCorsConfigurationCorsRule>> corsRules;

    /**
     * @return Set of origins and methods (cross-origin access that you want to allow). See below. You can configure up to 100 rules.
     * 
     */
    public Output<List<SpacesBucketCorsConfigurationCorsRule>> corsRules() {
        return this.corsRules;
    }
    /**
     * The region where the bucket resides.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return The region where the bucket resides.
     * 
     */
    public Output<String> region() {
        return this.region;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SpacesBucketCorsConfiguration(String name) {
        this(name, SpacesBucketCorsConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SpacesBucketCorsConfiguration(String name, SpacesBucketCorsConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SpacesBucketCorsConfiguration(String name, SpacesBucketCorsConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/spacesBucketCorsConfiguration:SpacesBucketCorsConfiguration", name, args == null ? SpacesBucketCorsConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SpacesBucketCorsConfiguration(String name, Output<String> id, @Nullable SpacesBucketCorsConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/spacesBucketCorsConfiguration:SpacesBucketCorsConfiguration", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static SpacesBucketCorsConfiguration get(String name, Output<String> id, @Nullable SpacesBucketCorsConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SpacesBucketCorsConfiguration(name, id, state, options);
    }
}
