// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.digitalocean.ProjectArgs;
import com.pulumi.digitalocean.Utilities;
import com.pulumi.digitalocean.inputs.ProjectState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a DigitalOcean Project resource.
 * 
 * Projects allow you to organize your resources into groups that fit the way you work.
 * You can group resources (like Droplets, Spaces, Load Balancers, domains, and Floating IPs)
 * in ways that align with the applications you host on DigitalOcean.
 * 
 * The following resource types can be associated with a project:
 * 
 * * App Platform Apps
 * * Database Clusters
 * * Domains
 * * Droplets
 * * Floating IPs
 * * Kubernetes Clusters
 * * Load Balancers
 * * Spaces Buckets
 * * Volumes
 * 
 * **Note:** A provider managed project cannot be set as a default project.
 * 
 * ## Example Usage
 * 
 * The following example demonstrates the creation of an empty project:
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.digitalocean.Project;
 * import com.pulumi.digitalocean.ProjectArgs;
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
 *         var playground = new Project("playground", ProjectArgs.builder()
 *             .name("playground")
 *             .description("A project to represent development resources.")
 *             .purpose("Web Application")
 *             .environment("Development")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * The following example demonstrates the creation of a project with a Droplet resource:
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
 * import com.pulumi.digitalocean.Project;
 * import com.pulumi.digitalocean.ProjectArgs;
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
 *             .name("example")
 *             .size("s-1vcpu-1gb")
 *             .image("ubuntu-22-04-x64")
 *             .region("nyc3")
 *             .build());
 * 
 *         var playground = new Project("playground", ProjectArgs.builder()
 *             .name("playground")
 *             .description("A project to represent development resources.")
 *             .purpose("Web Application")
 *             .environment("Development")
 *             .resources(foobar.dropletUrn())
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
 * Projects can be imported using the `id` returned from DigitalOcean, e.g.
 * 
 * ```sh
 * $ pulumi import digitalocean:index/project:Project myproject 245bcfd0-7f31-4ce6-a2bc-475a116cca97
 * ```
 * 
 */
@ResourceType(type="digitalocean:index/project:Project")
public class Project extends com.pulumi.resources.CustomResource {
    /**
     * the date and time when the project was created, (ISO8601)
     * 
     */
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    /**
     * @return the date and time when the project was created, (ISO8601)
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * the description of the project
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return the description of the project
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * the environment of the project&#39;s resources. The possible values are: `Development`, `Staging`, `Production`)
     * 
     */
    @Export(name="environment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> environment;

    /**
     * @return the environment of the project&#39;s resources. The possible values are: `Development`, `Staging`, `Production`)
     * 
     */
    public Output<Optional<String>> environment() {
        return Codegen.optional(this.environment);
    }
    /**
     * a boolean indicating whether or not the project is the default project. (Default: &#34;false&#34;)
     * 
     */
    @Export(name="isDefault", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> isDefault;

    /**
     * @return a boolean indicating whether or not the project is the default project. (Default: &#34;false&#34;)
     * 
     */
    public Output<Optional<Boolean>> isDefault() {
        return Codegen.optional(this.isDefault);
    }
    /**
     * The name of the Project
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the Project
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * the id of the project owner.
     * 
     */
    @Export(name="ownerId", refs={Integer.class}, tree="[0]")
    private Output<Integer> ownerId;

    /**
     * @return the id of the project owner.
     * 
     */
    public Output<Integer> ownerId() {
        return this.ownerId;
    }
    /**
     * the unique universal identifier of the project owner.
     * 
     */
    @Export(name="ownerUuid", refs={String.class}, tree="[0]")
    private Output<String> ownerUuid;

    /**
     * @return the unique universal identifier of the project owner.
     * 
     */
    public Output<String> ownerUuid() {
        return this.ownerUuid;
    }
    /**
     * the purpose of the project, (Default: &#34;Web Application&#34;)
     * 
     */
    @Export(name="purpose", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> purpose;

    /**
     * @return the purpose of the project, (Default: &#34;Web Application&#34;)
     * 
     */
    public Output<Optional<String>> purpose() {
        return Codegen.optional(this.purpose);
    }
    /**
     * a list of uniform resource names (URNs) for the resources associated with the project
     * 
     */
    @Export(name="resources", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> resources;

    /**
     * @return a list of uniform resource names (URNs) for the resources associated with the project
     * 
     */
    public Output<List<String>> resources() {
        return this.resources;
    }
    /**
     * the date and time when the project was last updated, (ISO8601)
     * 
     */
    @Export(name="updatedAt", refs={String.class}, tree="[0]")
    private Output<String> updatedAt;

    /**
     * @return the date and time when the project was last updated, (ISO8601)
     * 
     */
    public Output<String> updatedAt() {
        return this.updatedAt;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Project(java.lang.String name) {
        this(name, ProjectArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Project(java.lang.String name, @Nullable ProjectArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Project(java.lang.String name, @Nullable ProjectArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/project:Project", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Project(java.lang.String name, Output<java.lang.String> id, @Nullable ProjectState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/project:Project", name, state, makeResourceOptions(options, id), false);
    }

    private static ProjectArgs makeArgs(@Nullable ProjectArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ProjectArgs.Empty : args;
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
    public static Project get(java.lang.String name, Output<java.lang.String> id, @Nullable ProjectState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Project(name, id, state, options);
    }
}
