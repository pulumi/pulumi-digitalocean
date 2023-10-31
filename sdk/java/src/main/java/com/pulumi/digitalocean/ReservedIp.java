// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.digitalocean.ReservedIpArgs;
import com.pulumi.digitalocean.Utilities;
import com.pulumi.digitalocean.inputs.ReservedIpState;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a DigitalOcean reserved IP to represent a publicly-accessible static IP addresses that can be mapped to one of your Droplets.
 * 
 * &gt; **NOTE:** Reserved IPs can be assigned to a Droplet either directly on the `digitalocean.ReservedIp` resource by setting a `droplet_id` or using the `digitalocean.ReservedIpAssignment` resource, but the two cannot be used together.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.digitalocean.Droplet;
 * import com.pulumi.digitalocean.DropletArgs;
 * import com.pulumi.digitalocean.ReservedIp;
 * import com.pulumi.digitalocean.ReservedIpArgs;
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
 *         var exampleDroplet = new Droplet(&#34;exampleDroplet&#34;, DropletArgs.builder()        
 *             .size(&#34;s-1vcpu-1gb&#34;)
 *             .image(&#34;ubuntu-22-04-x64&#34;)
 *             .region(&#34;nyc3&#34;)
 *             .ipv6(true)
 *             .privateNetworking(true)
 *             .build());
 * 
 *         var exampleReservedIp = new ReservedIp(&#34;exampleReservedIp&#34;, ReservedIpArgs.builder()        
 *             .dropletId(exampleDroplet.id())
 *             .region(exampleDroplet.region())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Reserved IPs can be imported using the `ip`, e.g.
 * 
 * ```sh
 *  $ pulumi import digitalocean:index/reservedIp:ReservedIp myip 192.168.0.1
 * ```
 * 
 */
@ResourceType(type="digitalocean:index/reservedIp:ReservedIp")
public class ReservedIp extends com.pulumi.resources.CustomResource {
    /**
     * The ID of Droplet that the reserved IP will be assigned to.
     * 
     */
    @Export(name="dropletId", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> dropletId;

    /**
     * @return The ID of Droplet that the reserved IP will be assigned to.
     * 
     */
    public Output<Optional<Integer>> dropletId() {
        return Codegen.optional(this.dropletId);
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
     * The region that the reserved IP is reserved to.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return The region that the reserved IP is reserved to.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * The uniform resource name of the reserved ip
     * 
     */
    @Export(name="urn", refs={String.class}, tree="[0]")
    private Output<String> urn;

    /**
     * @return The uniform resource name of the reserved ip
     * 
     */
    public Output<String> urn_() {
        return this.urn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ReservedIp(String name) {
        this(name, ReservedIpArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ReservedIp(String name, ReservedIpArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ReservedIp(String name, ReservedIpArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/reservedIp:ReservedIp", name, args == null ? ReservedIpArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ReservedIp(String name, Output<String> id, @Nullable ReservedIpState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/reservedIp:ReservedIp", name, state, makeResourceOptions(options, id));
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
    public static ReservedIp get(String name, Output<String> id, @Nullable ReservedIpState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ReservedIp(name, id, state, options);
    }
}
