// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.digitalocean.FloatingIpAssignmentArgs;
import com.pulumi.digitalocean.Utilities;
import com.pulumi.digitalocean.inputs.FloatingIpAssignmentState;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * &gt; **Deprecated:** DigitalOcean Floating IPs have been renamed reserved IPs. This resource will be removed in a future release. Please use `digitalocean.ReservedIpAssignment` instead.
 * 
 * Provides a resource for assigning an existing DigitalOcean Floating IP to a Droplet. This
 * makes it easy to provision floating IP addresses that are not tied to the lifecycle of your
 * Droplet.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.digitalocean.FloatingIp;
 * import com.pulumi.digitalocean.FloatingIpArgs;
 * import com.pulumi.digitalocean.Droplet;
 * import com.pulumi.digitalocean.DropletArgs;
 * import com.pulumi.digitalocean.FloatingIpAssignment;
 * import com.pulumi.digitalocean.FloatingIpAssignmentArgs;
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
 *         var foobarFloatingIp = new FloatingIp(&#34;foobarFloatingIp&#34;, FloatingIpArgs.builder()        
 *             .region(&#34;sgp1&#34;)
 *             .build());
 * 
 *         var foobarDroplet = new Droplet(&#34;foobarDroplet&#34;, DropletArgs.builder()        
 *             .size(&#34;s-1vcpu-1gb&#34;)
 *             .image(&#34;ubuntu-18-04-x64&#34;)
 *             .region(&#34;sgp1&#34;)
 *             .ipv6(true)
 *             .privateNetworking(true)
 *             .build());
 * 
 *         var foobarFloatingIpAssignment = new FloatingIpAssignment(&#34;foobarFloatingIpAssignment&#34;, FloatingIpAssignmentArgs.builder()        
 *             .ipAddress(foobarFloatingIp.ipAddress())
 *             .dropletId(foobarDroplet.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Floating IP assignments can be imported using the Floating IP itself and the `id` of the Droplet joined with a comma. For example
 * 
 * ```sh
 *  $ pulumi import digitalocean:index/floatingIpAssignment:FloatingIpAssignment foobar 192.0.2.1,123456
 * ```
 * 
 */
@ResourceType(type="digitalocean:index/floatingIpAssignment:FloatingIpAssignment")
public class FloatingIpAssignment extends com.pulumi.resources.CustomResource {
    /**
     * The ID of Droplet that the Floating IP will be assigned to.
     * 
     */
    @Export(name="dropletId", refs={Integer.class}, tree="[0]")
    private Output<Integer> dropletId;

    /**
     * @return The ID of Droplet that the Floating IP will be assigned to.
     * 
     */
    public Output<Integer> dropletId() {
        return this.dropletId;
    }
    /**
     * The Floating IP to assign to the Droplet.
     * 
     */
    @Export(name="ipAddress", refs={String.class}, tree="[0]")
    private Output<String> ipAddress;

    /**
     * @return The Floating IP to assign to the Droplet.
     * 
     */
    public Output<String> ipAddress() {
        return this.ipAddress;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FloatingIpAssignment(String name) {
        this(name, FloatingIpAssignmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FloatingIpAssignment(String name, FloatingIpAssignmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FloatingIpAssignment(String name, FloatingIpAssignmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/floatingIpAssignment:FloatingIpAssignment", name, args == null ? FloatingIpAssignmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FloatingIpAssignment(String name, Output<String> id, @Nullable FloatingIpAssignmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/floatingIpAssignment:FloatingIpAssignment", name, state, makeResourceOptions(options, id));
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
    public static FloatingIpAssignment get(String name, Output<String> id, @Nullable FloatingIpAssignmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FloatingIpAssignment(name, id, state, options);
    }
}
