// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.digitalocean.Utilities;
import com.pulumi.digitalocean.VolumeAttachmentArgs;
import com.pulumi.digitalocean.inputs.VolumeAttachmentState;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages attaching a Volume to a Droplet.
 * 
 * &gt; **NOTE:** Volumes can be attached either directly on the `digitalocean.Droplet` resource, or using the `digitalocean.VolumeAttachment` resource - but the two cannot be used together. If both are used against the same Droplet, the volume attachments will constantly drift.
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
 * import com.pulumi.digitalocean.Volume;
 * import com.pulumi.digitalocean.VolumeArgs;
 * import com.pulumi.digitalocean.Droplet;
 * import com.pulumi.digitalocean.DropletArgs;
 * import com.pulumi.digitalocean.VolumeAttachment;
 * import com.pulumi.digitalocean.VolumeAttachmentArgs;
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
 *         var foobar = new Volume("foobar", VolumeArgs.builder()
 *             .region("nyc1")
 *             .name("baz")
 *             .size(100)
 *             .initialFilesystemType("ext4")
 *             .description("an example volume")
 *             .build());
 * 
 *         var foobarDroplet = new Droplet("foobarDroplet", DropletArgs.builder()
 *             .name("baz")
 *             .size("s-1vcpu-1gb")
 *             .image("ubuntu-18-04-x64")
 *             .region("nyc1")
 *             .build());
 * 
 *         var foobarVolumeAttachment = new VolumeAttachment("foobarVolumeAttachment", VolumeAttachmentArgs.builder()
 *             .dropletId(foobarDroplet.id())
 *             .volumeId(foobar.id())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="digitalocean:index/volumeAttachment:VolumeAttachment")
public class VolumeAttachment extends com.pulumi.resources.CustomResource {
    /**
     * ID of the Droplet to attach the volume to.
     * 
     */
    @Export(name="dropletId", refs={Integer.class}, tree="[0]")
    private Output<Integer> dropletId;

    /**
     * @return ID of the Droplet to attach the volume to.
     * 
     */
    public Output<Integer> dropletId() {
        return this.dropletId;
    }
    /**
     * ID of the Volume to be attached to the Droplet.
     * 
     */
    @Export(name="volumeId", refs={String.class}, tree="[0]")
    private Output<String> volumeId;

    /**
     * @return ID of the Volume to be attached to the Droplet.
     * 
     */
    public Output<String> volumeId() {
        return this.volumeId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VolumeAttachment(String name) {
        this(name, VolumeAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VolumeAttachment(String name, VolumeAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VolumeAttachment(String name, VolumeAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/volumeAttachment:VolumeAttachment", name, args == null ? VolumeAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VolumeAttachment(String name, Output<String> id, @Nullable VolumeAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/volumeAttachment:VolumeAttachment", name, state, makeResourceOptions(options, id));
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
    public static VolumeAttachment get(String name, Output<String> id, @Nullable VolumeAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VolumeAttachment(name, id, state, options);
    }
}
