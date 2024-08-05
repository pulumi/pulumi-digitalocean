// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.digitalocean.CdnArgs;
import com.pulumi.digitalocean.Utilities;
import com.pulumi.digitalocean.inputs.CdnState;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a DigitalOcean CDN Endpoint resource for use with Spaces.
 * 
 * ## Example Usage
 * 
 * ### Basic Example
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.digitalocean.SpacesBucket;
 * import com.pulumi.digitalocean.SpacesBucketArgs;
 * import com.pulumi.digitalocean.Cdn;
 * import com.pulumi.digitalocean.CdnArgs;
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
 *         // Create a new Spaces Bucket
 *         var mybucket = new SpacesBucket("mybucket", SpacesBucketArgs.builder()
 *             .name("example")
 *             .region("sfo2")
 *             .acl("public-read")
 *             .build());
 * 
 *         // Add a CDN endpoint to the Spaces Bucket
 *         var mycdn = new Cdn("mycdn", CdnArgs.builder()
 *             .origin(mybucket.bucketDomainName())
 *             .build());
 * 
 *         ctx.export("fqdn", mycdn.endpoint());
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Custom Sub-Domain Example
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.digitalocean.SpacesBucket;
 * import com.pulumi.digitalocean.SpacesBucketArgs;
 * import com.pulumi.digitalocean.Certificate;
 * import com.pulumi.digitalocean.CertificateArgs;
 * import com.pulumi.digitalocean.Cdn;
 * import com.pulumi.digitalocean.CdnArgs;
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
 *         // Create a new Spaces Bucket
 *         var mybucket = new SpacesBucket("mybucket", SpacesBucketArgs.builder()
 *             .name("example")
 *             .region("sfo2")
 *             .acl("public-read")
 *             .build());
 * 
 *         // Create a DigitalOcean managed Let's Encrypt Certificate
 *         var cert = new Certificate("cert", CertificateArgs.builder()
 *             .name("cdn-cert")
 *             .type("lets_encrypt")
 *             .domains("static.example.com")
 *             .build());
 * 
 *         // Add a CDN endpoint with a custom sub-domain to the Spaces Bucket
 *         var mycdn = new Cdn("mycdn", CdnArgs.builder()
 *             .origin(mybucket.bucketDomainName())
 *             .customDomain("static.example.com")
 *             .certificateName(cert.name())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * CDN Endpoints can be imported using the CDN `id`, e.g.
 * 
 * ```sh
 * $ pulumi import digitalocean:index/cdn:Cdn mycdn fb06ad00-351f-45c8-b5eb-13523c438661
 * ```
 * 
 */
@ResourceType(type="digitalocean:index/cdn:Cdn")
public class Cdn extends com.pulumi.resources.CustomResource {
    /**
     * **Deprecated** The ID of a DigitalOcean managed TLS certificate used for SSL when a custom subdomain is provided.
     * 
     * @deprecated
     * Certificate IDs may change, for example when a Let&#39;s Encrypt certificate is auto-renewed. Please specify &#39;certificate_name&#39; instead.
     * 
     */
    @Deprecated /* Certificate IDs may change, for example when a Let's Encrypt certificate is auto-renewed. Please specify 'certificate_name' instead. */
    @Export(name="certificateId", refs={String.class}, tree="[0]")
    private Output<String> certificateId;

    /**
     * @return **Deprecated** The ID of a DigitalOcean managed TLS certificate used for SSL when a custom subdomain is provided.
     * 
     */
    public Output<String> certificateId() {
        return this.certificateId;
    }
    /**
     * The unique name of a DigitalOcean managed TLS certificate used for SSL when a custom subdomain is provided.
     * 
     */
    @Export(name="certificateName", refs={String.class}, tree="[0]")
    private Output<String> certificateName;

    /**
     * @return The unique name of a DigitalOcean managed TLS certificate used for SSL when a custom subdomain is provided.
     * 
     */
    public Output<String> certificateName() {
        return this.certificateName;
    }
    /**
     * The date and time when the CDN Endpoint was created.
     * 
     */
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    /**
     * @return The date and time when the CDN Endpoint was created.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * The fully qualified domain name (FQDN) of the custom subdomain used with the CDN Endpoint.
     * 
     */
    @Export(name="customDomain", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> customDomain;

    /**
     * @return The fully qualified domain name (FQDN) of the custom subdomain used with the CDN Endpoint.
     * 
     */
    public Output<Optional<String>> customDomain() {
        return Codegen.optional(this.customDomain);
    }
    /**
     * The fully qualified domain name (FQDN) from which the CDN-backed content is served.
     * 
     */
    @Export(name="endpoint", refs={String.class}, tree="[0]")
    private Output<String> endpoint;

    /**
     * @return The fully qualified domain name (FQDN) from which the CDN-backed content is served.
     * 
     */
    public Output<String> endpoint() {
        return this.endpoint;
    }
    /**
     * The fully qualified domain name, (FQDN) for a Space.
     * 
     */
    @Export(name="origin", refs={String.class}, tree="[0]")
    private Output<String> origin;

    /**
     * @return The fully qualified domain name, (FQDN) for a Space.
     * 
     */
    public Output<String> origin() {
        return this.origin;
    }
    /**
     * The time to live for the CDN Endpoint, in seconds. Default is 3600 seconds.
     * 
     */
    @Export(name="ttl", refs={Integer.class}, tree="[0]")
    private Output<Integer> ttl;

    /**
     * @return The time to live for the CDN Endpoint, in seconds. Default is 3600 seconds.
     * 
     */
    public Output<Integer> ttl() {
        return this.ttl;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Cdn(String name) {
        this(name, CdnArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Cdn(String name, CdnArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Cdn(String name, CdnArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/cdn:Cdn", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private Cdn(String name, Output<String> id, @Nullable CdnState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/cdn:Cdn", name, state, makeResourceOptions(options, id));
    }

    private static CdnArgs makeArgs(CdnArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? CdnArgs.Empty : args;
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
    public static Cdn get(String name, Output<String> id, @Nullable CdnState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Cdn(name, id, state, options);
    }
}
