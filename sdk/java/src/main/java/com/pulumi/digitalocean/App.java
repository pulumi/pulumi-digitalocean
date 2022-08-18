// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.digitalocean.AppArgs;
import com.pulumi.digitalocean.Utilities;
import com.pulumi.digitalocean.inputs.AppState;
import com.pulumi.digitalocean.outputs.AppSpec;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a DigitalOcean App resource.
 * 
 * ## Example Usage
 * 
 * To create an app, provide a [DigitalOcean app spec](https://www.digitalocean.com/docs/app-platform/references/app-specification-reference/) specifying the app&#39;s components.
 * ### Basic Example
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.digitalocean.App;
 * import com.pulumi.digitalocean.AppArgs;
 * import com.pulumi.digitalocean.inputs.AppSpecArgs;
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
 *         var golang_sample = new App(&#34;golang-sample&#34;, AppArgs.builder()        
 *             .spec(AppSpecArgs.builder()
 *                 .name(&#34;golang-sample&#34;)
 *                 .region(&#34;ams&#34;)
 *                 .services(AppSpecServiceArgs.builder()
 *                     .environmentSlug(&#34;go&#34;)
 *                     .git(AppSpecServiceGitArgs.builder()
 *                         .branch(&#34;main&#34;)
 *                         .repoCloneUrl(&#34;https://github.com/digitalocean/sample-golang.git&#34;)
 *                         .build())
 *                     .instanceCount(1)
 *                     .instanceSizeSlug(&#34;professional-xs&#34;)
 *                     .name(&#34;go-service&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Static Site Example
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.digitalocean.App;
 * import com.pulumi.digitalocean.AppArgs;
 * import com.pulumi.digitalocean.inputs.AppSpecArgs;
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
 *         var static_ste_example = new App(&#34;static-ste-example&#34;, AppArgs.builder()        
 *             .spec(AppSpecArgs.builder()
 *                 .name(&#34;static-ste-example&#34;)
 *                 .region(&#34;ams&#34;)
 *                 .staticSites(AppSpecStaticSiteArgs.builder()
 *                     .buildCommand(&#34;bundle exec jekyll build -d ./public&#34;)
 *                     .git(AppSpecStaticSiteGitArgs.builder()
 *                         .branch(&#34;main&#34;)
 *                         .repoCloneUrl(&#34;https://github.com/digitalocean/sample-jekyll.git&#34;)
 *                         .build())
 *                     .name(&#34;sample-jekyll&#34;)
 *                     .outputDir(&#34;/public&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Multiple Components Example
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.digitalocean.App;
 * import com.pulumi.digitalocean.AppArgs;
 * import com.pulumi.digitalocean.inputs.AppSpecArgs;
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
 *         var mono_repo_example = new App(&#34;mono-repo-example&#34;, AppArgs.builder()        
 *             .spec(AppSpecArgs.builder()
 *                 .alerts(AppSpecAlertArgs.builder()
 *                     .rule(&#34;DEPLOYMENT_FAILED&#34;)
 *                     .build())
 *                 .databases(AppSpecDatabaseArgs.builder()
 *                     .engine(&#34;PG&#34;)
 *                     .name(&#34;starter-db&#34;)
 *                     .production(false)
 *                     .build())
 *                 .domains(Map.of(&#34;name&#34;, &#34;foo.example.com&#34;))
 *                 .name(&#34;mono-repo-example&#34;)
 *                 .region(&#34;ams&#34;)
 *                 .services(AppSpecServiceArgs.builder()
 *                     .alert(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *                     .environmentSlug(&#34;go&#34;)
 *                     .github(AppSpecServiceGithubArgs.builder()
 *                         .branch(&#34;main&#34;)
 *                         .deployOnPush(true)
 *                         .repo(&#34;username/repo&#34;)
 *                         .build())
 *                     .httpPort(3000)
 *                     .instanceCount(2)
 *                     .instanceSizeSlug(&#34;professional-xs&#34;)
 *                     .logDestination(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *                     .name(&#34;api&#34;)
 *                     .routes(AppSpecServiceRouteArgs.builder()
 *                         .path(&#34;/api&#34;)
 *                         .build())
 *                     .runCommand(&#34;bin/api&#34;)
 *                     .sourceDir(&#34;api/&#34;)
 *                     .build())
 *                 .staticSites(AppSpecStaticSiteArgs.builder()
 *                     .buildCommand(&#34;npm run build&#34;)
 *                     .github(AppSpecStaticSiteGithubArgs.builder()
 *                         .branch(&#34;main&#34;)
 *                         .deployOnPush(true)
 *                         .repo(&#34;username/repo&#34;)
 *                         .build())
 *                     .name(&#34;web&#34;)
 *                     .routes(AppSpecStaticSiteRouteArgs.builder()
 *                         .path(&#34;/&#34;)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * An app can be imported using its `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import digitalocean:index/app:App myapp fb06ad00-351f-45c8-b5eb-13523c438661
 * ```
 * 
 */
@ResourceType(type="digitalocean:index/app:App")
public class App extends com.pulumi.resources.CustomResource {
    /**
     * The ID the app&#39;s currently active deployment.
     * 
     */
    @Export(name="activeDeploymentId", type=String.class, parameters={})
    private Output<String> activeDeploymentId;

    /**
     * @return The ID the app&#39;s currently active deployment.
     * 
     */
    public Output<String> activeDeploymentId() {
        return this.activeDeploymentId;
    }
    /**
     * The date and time of when the app was created.
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return The date and time of when the app was created.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * The default URL to access the app.
     * 
     */
    @Export(name="defaultIngress", type=String.class, parameters={})
    private Output<String> defaultIngress;

    /**
     * @return The default URL to access the app.
     * 
     */
    public Output<String> defaultIngress() {
        return this.defaultIngress;
    }
    /**
     * The live URL of the app.
     * 
     */
    @Export(name="liveUrl", type=String.class, parameters={})
    private Output<String> liveUrl;

    /**
     * @return The live URL of the app.
     * 
     */
    public Output<String> liveUrl() {
        return this.liveUrl;
    }
    /**
     * A DigitalOcean App spec describing the app.
     * 
     */
    @Export(name="spec", type=AppSpec.class, parameters={})
    private Output</* @Nullable */ AppSpec> spec;

    /**
     * @return A DigitalOcean App spec describing the app.
     * 
     */
    public Output<Optional<AppSpec>> spec() {
        return Codegen.optional(this.spec);
    }
    /**
     * The date and time of when the app was last updated.
     * 
     */
    @Export(name="updatedAt", type=String.class, parameters={})
    private Output<String> updatedAt;

    /**
     * @return The date and time of when the app was last updated.
     * 
     */
    public Output<String> updatedAt() {
        return this.updatedAt;
    }
    /**
     * The uniform resource identifier for the app.
     * 
     */
    @Export(name="urn", type=String.class, parameters={})
    private Output<String> urn;

    /**
     * @return The uniform resource identifier for the app.
     * 
     */
    public Output<String> urn() {
        return this.urn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public App(String name) {
        this(name, AppArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public App(String name, @Nullable AppArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public App(String name, @Nullable AppArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/app:App", name, args == null ? AppArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private App(String name, Output<String> id, @Nullable AppState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/app:App", name, state, makeResourceOptions(options, id));
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
    public static App get(String name, Output<String> id, @Nullable AppState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new App(name, id, state, options);
    }
}