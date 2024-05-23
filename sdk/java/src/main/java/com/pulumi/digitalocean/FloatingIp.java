// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.digitalocean.FloatingIpArgs;
import com.pulumi.digitalocean.Utilities;
import com.pulumi.digitalocean.inputs.FloatingIpState;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * &gt; **Deprecated:** DigitalOcean Floating IPs have been renamed reserved IPs. This resource will be removed in a future release. Please use `digitalocean.ReservedIp` instead.
 * 
 * Provides a DigitalOcean Floating IP to represent a publicly-accessible static IP addresses that can be mapped to one of your Droplets.
 * 
 * &gt; **NOTE:** Floating IPs can be assigned to a Droplet either directly on the `digitalocean.FloatingIp` resource by setting a `droplet_id` or using the `digitalocean.FloatingIpAssignment` resource, but the two cannot be used together.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.digitalocean.Droplet;
 * import com.pulumi.digitalocean.DropletArgs;
 * import com.pulumi.digitalocean.FloatingIp;
 * import com.pulumi.digitalocean.FloatingIpArgs;
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
 *         var foobar = new Droplet("foobar", DropletArgs.builder()
 *             .name("baz")
 *             .size("s-1vcpu-1gb")
 *             .image("ubuntu-18-04-x64")
 *             .region("sgp1")
 *             .ipv6(true)
 *             .privateNetworking(true)
 *             .build());
 * 
 *         var foobarFloatingIp = new FloatingIp("foobarFloatingIp", FloatingIpArgs.builder()
 *             .dropletId(foobar.id())
 *             .region(foobar.region())
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
 * Floating IPs can be imported using the `ip`, e.g.
 * 
 * ```sh
 * $ pulumi import digitalocean:index/floatingIp:FloatingIp myip 192.168.0.1
 * ```
 * 
 */
@ResourceType(type="digitalocean:index/floatingIp:FloatingIp")
public class FloatingIp extends com.pulumi.resources.CustomResource {
    /**
     * The ID of Droplet that the Floating IP will be assigned to.
     * 
     */
    @Export(name="dropletId", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> dropletId;

    /**
     * @return The ID of Droplet that the Floating IP will be assigned to.
     * 
     */
    public Output<Optional<Integer>> dropletId() {
        return Codegen.optional(this.dropletId);
    }
    /**
     * The uniform resource name of the floating ip
     * 
     */
    @Export(name="floatingIpUrn", refs={String.class}, tree="[0]")
    private Output<String> floatingIpUrn;

    /**
     * @return The uniform resource name of the floating ip
     * 
     */
    public Output<String> floatingIpUrn() {
        return this.floatingIpUrn;
    }
    /**
     * The IP Address of the resource
     * 
     */
    @Export(name="ipAddress", refs={String.class}, tree="[0]")
    private Output<String> ipAddress;

    /**
     * @return The IP Address of the resource
     * 
     */
    public Output<String> ipAddress() {
        return this.ipAddress;
    }
    /**
     * The region that the Floating IP is reserved to.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return The region that the Floating IP is reserved to.
     * 
     */
    public Output<String> region() {
        return this.region;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FloatingIp(String name) {
        this(name, FloatingIpArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FloatingIp(String name, FloatingIpArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FloatingIp(String name, FloatingIpArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/floatingIp:FloatingIp", name, args == null ? FloatingIpArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FloatingIp(String name, Output<String> id, @Nullable FloatingIpState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/floatingIp:FloatingIp", name, state, makeResourceOptions(options, id));
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
    public static FloatingIp get(String name, Output<String> id, @Nullable FloatingIpState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FloatingIp(name, id, state, options);
    }
}
