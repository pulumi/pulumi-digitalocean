// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.digitalocean.UptimeCheckArgs;
import com.pulumi.digitalocean.Utilities;
import com.pulumi.digitalocean.inputs.UptimeCheckState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a [DigitalOcean Uptime Checks](https://docs.digitalocean.com/reference/api/kafka-beta-api-reference/#tag/Uptime)
 * resource. Uptime Checks provide the ability to monitor your endpoints from around the world, and alert you when they&#39;re slow, unavailable, or SSL certificates are expiring.
 * 
 * ## Import
 * 
 * Uptime checks can be imported using the uptime check&#39;s `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import digitalocean:index/uptimeCheck:UptimeCheck target 5a4981aa-9653-4bd1-bef5-d6bff52042e4
 * ```
 * 
 */
@ResourceType(type="digitalocean:index/uptimeCheck:UptimeCheck")
public class UptimeCheck extends com.pulumi.resources.CustomResource {
    /**
     * A boolean value indicating whether the check is enabled/disabled.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return A boolean value indicating whether the check is enabled/disabled.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * A human-friendly display name for the check.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A human-friendly display name for the check.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * An array containing the selected regions to perform healthchecks from: &#34;us_east&#34;, &#34;us_west&#34;, &#34;eu_west&#34;, &#34;se_asia&#34;
     * 
     */
    @Export(name="regions", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> regions;

    /**
     * @return An array containing the selected regions to perform healthchecks from: &#34;us_east&#34;, &#34;us_west&#34;, &#34;eu_west&#34;, &#34;se_asia&#34;
     * 
     */
    public Output<Optional<List<String>>> regions() {
        return Codegen.optional(this.regions);
    }
    /**
     * The endpoint to perform healthchecks on.
     * 
     */
    @Export(name="target", type=String.class, parameters={})
    private Output<String> target;

    /**
     * @return The endpoint to perform healthchecks on.
     * 
     */
    public Output<String> target() {
        return this.target;
    }
    /**
     * The type of health check to perform: &#39;ping&#39; &#39;http&#39; &#39;https&#39;.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output</* @Nullable */ String> type;

    /**
     * @return The type of health check to perform: &#39;ping&#39; &#39;http&#39; &#39;https&#39;.
     * 
     */
    public Output<Optional<String>> type() {
        return Codegen.optional(this.type);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public UptimeCheck(String name) {
        this(name, UptimeCheckArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public UptimeCheck(String name, UptimeCheckArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UptimeCheck(String name, UptimeCheckArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/uptimeCheck:UptimeCheck", name, args == null ? UptimeCheckArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private UptimeCheck(String name, Output<String> id, @Nullable UptimeCheckState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/uptimeCheck:UptimeCheck", name, state, makeResourceOptions(options, id));
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
    public static UptimeCheck get(String name, Output<String> id, @Nullable UptimeCheckState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new UptimeCheck(name, id, state, options);
    }
}
