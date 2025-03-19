// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.digitalocean.CustomImageArgs;
import com.pulumi.digitalocean.Utilities;
import com.pulumi.digitalocean.inputs.CustomImageState;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a resource which can be used to create a [custom image](https://www.digitalocean.com/docs/images/custom-images/)
 * from a URL. The URL must point to an image in one of the following file formats:
 * 
 * - Raw (.img) with an MBR or GPT partition table
 * - qcow2
 * - VHDX
 * - VDI
 * - VMDK
 * 
 * The image may be compressed using gzip or bzip2. See the DigitalOcean Custom
 * Image documentation for [additional requirements](https://www.digitalocean.com/docs/images/custom-images/#image-requirements).
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
 * import com.pulumi.digitalocean.CustomImage;
 * import com.pulumi.digitalocean.CustomImageArgs;
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
 *         var flatcar = new CustomImage("flatcar", CustomImageArgs.builder()
 *             .name("flatcar")
 *             .url("https://stable.release.flatcar-linux.net/amd64-usr/2605.7.0/flatcar_production_digitalocean_image.bin.bz2")
 *             .regions("nyc3")
 *             .build());
 * 
 *         var example = new Droplet("example", DropletArgs.builder()
 *             .image(flatcar.id())
 *             .name("example-01")
 *             .region("nyc3")
 *             .size("s-1vcpu-1gb")
 *             .sshKeys(12345)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="digitalocean:index/customImage:CustomImage")
public class CustomImage extends com.pulumi.resources.CustomResource {
    /**
     * A time value given in ISO8601 combined date and time format that represents when the image was created.
     * 
     */
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    /**
     * @return A time value given in ISO8601 combined date and time format that represents when the image was created.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * An optional description for the image.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description for the image.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * An optional distribution name for the image. Valid values are documented [here](https://docs.digitalocean.com/reference/api/digitalocean/#tag/Images/operation/images_create_custom)
     * 
     */
    @Export(name="distribution", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> distribution;

    /**
     * @return An optional distribution name for the image. Valid values are documented [here](https://docs.digitalocean.com/reference/api/digitalocean/#tag/Images/operation/images_create_custom)
     * 
     */
    public Output<Optional<String>> distribution() {
        return Codegen.optional(this.distribution);
    }
    /**
     * A unique number that can be used to identify and reference a specific image.
     * 
     */
    @Export(name="imageId", refs={Integer.class}, tree="[0]")
    private Output<Integer> imageId;

    /**
     * @return A unique number that can be used to identify and reference a specific image.
     * 
     */
    public Output<Integer> imageId() {
        return this.imageId;
    }
    /**
     * The minimum disk size in GB required for a Droplet to use this image.
     * 
     */
    @Export(name="minDiskSize", refs={Integer.class}, tree="[0]")
    private Output<Integer> minDiskSize;

    /**
     * @return The minimum disk size in GB required for a Droplet to use this image.
     * 
     */
    public Output<Integer> minDiskSize() {
        return this.minDiskSize;
    }
    /**
     * A name for the Custom Image.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return A name for the Custom Image.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Indicates whether the image in question is public or not.
     * 
     */
    @Export(name="public", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> public_;

    /**
     * @return Indicates whether the image in question is public or not.
     * 
     */
    public Output<Boolean> public_() {
        return this.public_;
    }
    /**
     * A list of regions. (Currently only one is supported).
     * 
     */
    @Export(name="regions", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> regions;

    /**
     * @return A list of regions. (Currently only one is supported).
     * 
     */
    public Output<List<String>> regions() {
        return this.regions;
    }
    /**
     * The size of the image in gigabytes.
     * 
     */
    @Export(name="sizeGigabytes", refs={Double.class}, tree="[0]")
    private Output<Double> sizeGigabytes;

    /**
     * @return The size of the image in gigabytes.
     * 
     */
    public Output<Double> sizeGigabytes() {
        return this.sizeGigabytes;
    }
    /**
     * A uniquely identifying string for each image.
     * 
     */
    @Export(name="slug", refs={String.class}, tree="[0]")
    private Output<String> slug;

    /**
     * @return A uniquely identifying string for each image.
     * 
     */
    public Output<String> slug() {
        return this.slug;
    }
    /**
     * A status string indicating the state of a custom image.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return A status string indicating the state of a custom image.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * A list of optional tags for the image.
     * 
     */
    @Export(name="tags", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return A list of optional tags for the image.
     * 
     */
    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Describes the kind of image.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Describes the kind of image.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * A URL from which the custom Linux virtual machine image may be retrieved.
     * 
     */
    @Export(name="url", refs={String.class}, tree="[0]")
    private Output<String> url;

    /**
     * @return A URL from which the custom Linux virtual machine image may be retrieved.
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CustomImage(java.lang.String name) {
        this(name, CustomImageArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CustomImage(java.lang.String name, CustomImageArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CustomImage(java.lang.String name, CustomImageArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/customImage:CustomImage", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private CustomImage(java.lang.String name, Output<java.lang.String> id, @Nullable CustomImageState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/customImage:CustomImage", name, state, makeResourceOptions(options, id), false);
    }

    private static CustomImageArgs makeArgs(CustomImageArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? CustomImageArgs.Empty : args;
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
    public static CustomImage get(java.lang.String name, Output<java.lang.String> id, @Nullable CustomImageState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CustomImage(name, id, state, options);
    }
}
