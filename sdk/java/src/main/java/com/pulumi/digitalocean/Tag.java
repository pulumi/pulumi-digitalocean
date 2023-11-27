// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.digitalocean.TagArgs;
import com.pulumi.digitalocean.Utilities;
import com.pulumi.digitalocean.inputs.TagState;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a DigitalOcean Tag resource. A Tag is a label that can be applied to a
 * Droplet resource in order to better organize or facilitate the lookups and
 * actions on it. Tags created with this resource can be referenced in your Droplet
 * configuration via their ID or name.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.digitalocean.Tag;
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
 *         var foobar = new Tag(&#34;foobar&#34;);
 * 
 *         var web = new Droplet(&#34;web&#34;, DropletArgs.builder()        
 *             .image(&#34;ubuntu-18-04-x64&#34;)
 *             .region(&#34;nyc3&#34;)
 *             .size(&#34;s-1vcpu-1gb&#34;)
 *             .tags(foobar.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Tags can be imported using the `name`, e.g.
 * 
 * ```sh
 *  $ pulumi import digitalocean:index/tag:Tag mytag tagname
 * ```
 * 
 */
@ResourceType(type="digitalocean:index/tag:Tag")
public class Tag extends com.pulumi.resources.CustomResource {
    /**
     * A count of the database clusters that the tag is applied to.
     * 
     */
    @Export(name="databasesCount", refs={Integer.class}, tree="[0]")
    private Output<Integer> databasesCount;

    /**
     * @return A count of the database clusters that the tag is applied to.
     * 
     */
    public Output<Integer> databasesCount() {
        return this.databasesCount;
    }
    /**
     * A count of the Droplets the tag is applied to.
     * 
     */
    @Export(name="dropletsCount", refs={Integer.class}, tree="[0]")
    private Output<Integer> dropletsCount;

    /**
     * @return A count of the Droplets the tag is applied to.
     * 
     */
    public Output<Integer> dropletsCount() {
        return this.dropletsCount;
    }
    /**
     * A count of the images that the tag is applied to.
     * 
     */
    @Export(name="imagesCount", refs={Integer.class}, tree="[0]")
    private Output<Integer> imagesCount;

    /**
     * @return A count of the images that the tag is applied to.
     * 
     */
    public Output<Integer> imagesCount() {
        return this.imagesCount;
    }
    /**
     * The name of the tag
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the tag
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A count of the total number of resources that the tag is applied to.
     * 
     */
    @Export(name="totalResourceCount", refs={Integer.class}, tree="[0]")
    private Output<Integer> totalResourceCount;

    /**
     * @return A count of the total number of resources that the tag is applied to.
     * 
     */
    public Output<Integer> totalResourceCount() {
        return this.totalResourceCount;
    }
    /**
     * A count of the volume snapshots that the tag is applied to.
     * 
     */
    @Export(name="volumeSnapshotsCount", refs={Integer.class}, tree="[0]")
    private Output<Integer> volumeSnapshotsCount;

    /**
     * @return A count of the volume snapshots that the tag is applied to.
     * 
     */
    public Output<Integer> volumeSnapshotsCount() {
        return this.volumeSnapshotsCount;
    }
    /**
     * A count of the volumes that the tag is applied to.
     * 
     */
    @Export(name="volumesCount", refs={Integer.class}, tree="[0]")
    private Output<Integer> volumesCount;

    /**
     * @return A count of the volumes that the tag is applied to.
     * 
     */
    public Output<Integer> volumesCount() {
        return this.volumesCount;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Tag(String name) {
        this(name, TagArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Tag(String name, @Nullable TagArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Tag(String name, @Nullable TagArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/tag:Tag", name, args == null ? TagArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Tag(String name, Output<String> id, @Nullable TagState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/tag:Tag", name, state, makeResourceOptions(options, id));
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
    public static Tag get(String name, Output<String> id, @Nullable TagState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Tag(name, id, state, options);
    }
}
