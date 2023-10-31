// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.digitalocean.DropletSnapshotArgs;
import com.pulumi.digitalocean.Utilities;
import com.pulumi.digitalocean.inputs.DropletSnapshotState;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a resource which can be used to create a snapshot from an existing DigitalOcean Droplet.
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
 * import com.pulumi.digitalocean.DropletSnapshot;
 * import com.pulumi.digitalocean.DropletSnapshotArgs;
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
 *         var web = new Droplet(&#34;web&#34;, DropletArgs.builder()        
 *             .size(&#34;s-1vcpu-1gb&#34;)
 *             .image(&#34;ubuntu-22-04-x64&#34;)
 *             .region(&#34;nyc3&#34;)
 *             .build());
 * 
 *         var web_snapshot = new DropletSnapshot(&#34;web-snapshot&#34;, DropletSnapshotArgs.builder()        
 *             .dropletId(web.id())
 *             .build());
 * 
 *         var from_snapshot = new Droplet(&#34;from-snapshot&#34;, DropletArgs.builder()        
 *             .image(web_snapshot.id())
 *             .region(&#34;nyc3&#34;)
 *             .size(&#34;s-2vcpu-4gb&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Droplet Snapshots can be imported using the `snapshot id`, e.g.
 * 
 * ```sh
 *  $ pulumi import digitalocean:index/dropletSnapshot:DropletSnapshot mysnapshot 123456
 * ```
 * 
 */
@ResourceType(type="digitalocean:index/dropletSnapshot:DropletSnapshot")
public class DropletSnapshot extends com.pulumi.resources.CustomResource {
    /**
     * The date and time the Droplet snapshot was created.
     * 
     */
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    /**
     * @return The date and time the Droplet snapshot was created.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * The ID of the Droplet from which the snapshot will be taken.
     * 
     */
    @Export(name="dropletId", refs={String.class}, tree="[0]")
    private Output<String> dropletId;

    /**
     * @return The ID of the Droplet from which the snapshot will be taken.
     * 
     */
    public Output<String> dropletId() {
        return this.dropletId;
    }
    /**
     * The minimum size in gigabytes required for a Droplet to be created based on this snapshot.
     * 
     */
    @Export(name="minDiskSize", refs={Integer.class}, tree="[0]")
    private Output<Integer> minDiskSize;

    /**
     * @return The minimum size in gigabytes required for a Droplet to be created based on this snapshot.
     * 
     */
    public Output<Integer> minDiskSize() {
        return this.minDiskSize;
    }
    /**
     * A name for the Droplet snapshot.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return A name for the Droplet snapshot.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A list of DigitalOcean region &#34;slugs&#34; indicating where the droplet snapshot is available.
     * 
     */
    @Export(name="regions", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> regions;

    /**
     * @return A list of DigitalOcean region &#34;slugs&#34; indicating where the droplet snapshot is available.
     * 
     */
    public Output<List<String>> regions() {
        return this.regions;
    }
    /**
     * The billable size of the Droplet snapshot in gigabytes.
     * 
     */
    @Export(name="size", refs={Double.class}, tree="[0]")
    private Output<Double> size;

    /**
     * @return The billable size of the Droplet snapshot in gigabytes.
     * 
     */
    public Output<Double> size() {
        return this.size;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DropletSnapshot(String name) {
        this(name, DropletSnapshotArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DropletSnapshot(String name, DropletSnapshotArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DropletSnapshot(String name, DropletSnapshotArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/dropletSnapshot:DropletSnapshot", name, args == null ? DropletSnapshotArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DropletSnapshot(String name, Output<String> id, @Nullable DropletSnapshotState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/dropletSnapshot:DropletSnapshot", name, state, makeResourceOptions(options, id));
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
    public static DropletSnapshot get(String name, Output<String> id, @Nullable DropletSnapshotState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DropletSnapshot(name, id, state, options);
    }
}
