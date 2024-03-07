// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.digitalocean.ContainerRegistryArgs;
import com.pulumi.digitalocean.Utilities;
import com.pulumi.digitalocean.inputs.ContainerRegistryState;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a DigitalOcean Container Registry resource. A Container Registry is
 * a secure, private location to store your containers for rapid deployment.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.digitalocean.ContainerRegistry;
 * import com.pulumi.digitalocean.ContainerRegistryArgs;
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
 *         var foobar = new ContainerRegistry(&#34;foobar&#34;, ContainerRegistryArgs.builder()        
 *             .subscriptionTierSlug(&#34;starter&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Container Registries can be imported using the `name`, e.g.
 * 
 * ```sh
 * $ pulumi import digitalocean:index/containerRegistry:ContainerRegistry myregistry registryname
 * ```
 * 
 */
@ResourceType(type="digitalocean:index/containerRegistry:ContainerRegistry")
public class ContainerRegistry extends com.pulumi.resources.CustomResource {
    /**
     * The date and time when the registry was created
     * 
     */
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    /**
     * @return The date and time when the registry was created
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * The URL endpoint of the container registry. Ex: `registry.digitalocean.com/my_registry`
     * 
     */
    @Export(name="endpoint", refs={String.class}, tree="[0]")
    private Output<String> endpoint;

    /**
     * @return The URL endpoint of the container registry. Ex: `registry.digitalocean.com/my_registry`
     * 
     */
    public Output<String> endpoint() {
        return this.endpoint;
    }
    /**
     * The name of the container_registry
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the container_registry
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The slug identifier of for region where registry data will be stored. When not provided, a region will be selected automatically.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return The slug identifier of for region where registry data will be stored. When not provided, a region will be selected automatically.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * The domain of the container registry. Ex: `registry.digitalocean.com`
     * 
     */
    @Export(name="serverUrl", refs={String.class}, tree="[0]")
    private Output<String> serverUrl;

    /**
     * @return The domain of the container registry. Ex: `registry.digitalocean.com`
     * 
     */
    public Output<String> serverUrl() {
        return this.serverUrl;
    }
    /**
     * The amount of storage used in the registry in bytes.
     * 
     */
    @Export(name="storageUsageBytes", refs={Integer.class}, tree="[0]")
    private Output<Integer> storageUsageBytes;

    /**
     * @return The amount of storage used in the registry in bytes.
     * 
     */
    public Output<Integer> storageUsageBytes() {
        return this.storageUsageBytes;
    }
    /**
     * The slug identifier for the subscription tier to use (`starter`, `basic`, or `professional`)
     * 
     */
    @Export(name="subscriptionTierSlug", refs={String.class}, tree="[0]")
    private Output<String> subscriptionTierSlug;

    /**
     * @return The slug identifier for the subscription tier to use (`starter`, `basic`, or `professional`)
     * 
     */
    public Output<String> subscriptionTierSlug() {
        return this.subscriptionTierSlug;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ContainerRegistry(String name) {
        this(name, ContainerRegistryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ContainerRegistry(String name, ContainerRegistryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ContainerRegistry(String name, ContainerRegistryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/containerRegistry:ContainerRegistry", name, args == null ? ContainerRegistryArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ContainerRegistry(String name, Output<String> id, @Nullable ContainerRegistryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/containerRegistry:ContainerRegistry", name, state, makeResourceOptions(options, id));
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
    public static ContainerRegistry get(String name, Output<String> id, @Nullable ContainerRegistryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ContainerRegistry(name, id, state, options);
    }
}
