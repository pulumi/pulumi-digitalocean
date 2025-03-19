// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.digitalocean.Utilities;
import com.pulumi.digitalocean.VpcArgs;
import com.pulumi.digitalocean.inputs.VpcState;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a [DigitalOcean VPC](https://docs.digitalocean.com/reference/api/digitalocean/#tag/VPCs) resource.
 * 
 * VPCs are virtual networks containing resources that can communicate with each
 * other in full isolation, using private IP addresses.
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
 * import com.pulumi.digitalocean.Vpc;
 * import com.pulumi.digitalocean.VpcArgs;
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
 *         var example = new Vpc("example", VpcArgs.builder()
 *             .name("example-project-network")
 *             .region("nyc3")
 *             .ipRange("10.10.10.0/24")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Resource Assignment
 * 
 * `digitalocean.Droplet`, `digitalocean.KubernetesCluster`,
 * `digitalocean_load_balancer`, and `digitalocean.DatabaseCluster` resources
 * may be assigned to a VPC by referencing its `id`. For example:
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.digitalocean.Vpc;
 * import com.pulumi.digitalocean.VpcArgs;
 * import com.pulumi.digitalocean.Droplet;
 * import com.pulumi.digitalocean.DropletArgs;
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
 *         var example = new Vpc("example", VpcArgs.builder()
 *             .name("example-project-network")
 *             .region("nyc3")
 *             .build());
 * 
 *         var exampleDroplet = new Droplet("exampleDroplet", DropletArgs.builder()
 *             .name("example-01")
 *             .size("s-1vcpu-1gb")
 *             .image("ubuntu-18-04-x64")
 *             .region("nyc3")
 *             .vpcUuid(example.id())
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
 * A VPC can be imported using its `id`, e.g.
 * 
 * ```sh
 * $ pulumi import digitalocean:index/vpc:Vpc example 506f78a4-e098-11e5-ad9f-000f53306ae1
 * ```
 * 
 */
@ResourceType(type="digitalocean:index/vpc:Vpc")
public class Vpc extends com.pulumi.resources.CustomResource {
    /**
     * The date and time of when the VPC was created.
     * 
     */
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    /**
     * @return The date and time of when the VPC was created.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * A boolean indicating whether or not the VPC is the default one for the region.
     * 
     */
    @Export(name="default", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> default_;

    /**
     * @return A boolean indicating whether or not the VPC is the default one for the region.
     * 
     */
    public Output<Boolean> default_() {
        return this.default_;
    }
    /**
     * A free-form text field up to a limit of 255 characters to describe the VPC.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A free-form text field up to a limit of 255 characters to describe the VPC.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The range of IP addresses for the VPC in CIDR notation. Network ranges cannot overlap with other networks in the same account and must be in range of private addresses as defined in RFC1918. It may not be larger than `/16` or smaller than `/24`.
     * 
     */
    @Export(name="ipRange", refs={String.class}, tree="[0]")
    private Output<String> ipRange;

    /**
     * @return The range of IP addresses for the VPC in CIDR notation. Network ranges cannot overlap with other networks in the same account and must be in range of private addresses as defined in RFC1918. It may not be larger than `/16` or smaller than `/24`.
     * 
     */
    public Output<String> ipRange() {
        return this.ipRange;
    }
    /**
     * A name for the VPC. Must be unique and contain alphanumeric characters, dashes, and periods only.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return A name for the VPC. Must be unique and contain alphanumeric characters, dashes, and periods only.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The DigitalOcean region slug for the VPC&#39;s location.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return The DigitalOcean region slug for the VPC&#39;s location.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * The uniform resource name (URN) for the VPC.
     * 
     */
    @Export(name="vpcUrn", refs={String.class}, tree="[0]")
    private Output<String> vpcUrn;

    /**
     * @return The uniform resource name (URN) for the VPC.
     * 
     */
    public Output<String> vpcUrn() {
        return this.vpcUrn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Vpc(java.lang.String name) {
        this(name, VpcArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Vpc(java.lang.String name, VpcArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Vpc(java.lang.String name, VpcArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/vpc:Vpc", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Vpc(java.lang.String name, Output<java.lang.String> id, @Nullable VpcState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/vpc:Vpc", name, state, makeResourceOptions(options, id), false);
    }

    private static VpcArgs makeArgs(VpcArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? VpcArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
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
    public static Vpc get(java.lang.String name, Output<java.lang.String> id, @Nullable VpcState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Vpc(name, id, state, options);
    }
}
