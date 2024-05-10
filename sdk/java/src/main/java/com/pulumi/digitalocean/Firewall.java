// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.digitalocean.FirewallArgs;
import com.pulumi.digitalocean.Utilities;
import com.pulumi.digitalocean.inputs.FirewallState;
import com.pulumi.digitalocean.outputs.FirewallInboundRule;
import com.pulumi.digitalocean.outputs.FirewallOutboundRule;
import com.pulumi.digitalocean.outputs.FirewallPendingChange;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a DigitalOcean Cloud Firewall resource. This can be used to create,
 * modify, and delete Firewalls.
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
 * import com.pulumi.digitalocean.Droplet;
 * import com.pulumi.digitalocean.DropletArgs;
 * import com.pulumi.digitalocean.Firewall;
 * import com.pulumi.digitalocean.FirewallArgs;
 * import com.pulumi.digitalocean.inputs.FirewallInboundRuleArgs;
 * import com.pulumi.digitalocean.inputs.FirewallOutboundRuleArgs;
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
 *         var webDroplet = new Droplet("webDroplet", DropletArgs.builder()        
 *             .size("s-1vcpu-1gb")
 *             .image("ubuntu-18-04-x64")
 *             .region("nyc3")
 *             .build());
 * 
 *         var webFirewall = new Firewall("webFirewall", FirewallArgs.builder()        
 *             .dropletIds(webDroplet.id())
 *             .inboundRules(            
 *                 FirewallInboundRuleArgs.builder()
 *                     .protocol("tcp")
 *                     .portRange("22")
 *                     .sourceAddresses(                    
 *                         "192.168.1.0/24",
 *                         "2002:1:2::/48")
 *                     .build(),
 *                 FirewallInboundRuleArgs.builder()
 *                     .protocol("tcp")
 *                     .portRange("80")
 *                     .sourceAddresses(                    
 *                         "0.0.0.0/0",
 *                         "::/0")
 *                     .build(),
 *                 FirewallInboundRuleArgs.builder()
 *                     .protocol("tcp")
 *                     .portRange("443")
 *                     .sourceAddresses(                    
 *                         "0.0.0.0/0",
 *                         "::/0")
 *                     .build(),
 *                 FirewallInboundRuleArgs.builder()
 *                     .protocol("icmp")
 *                     .sourceAddresses(                    
 *                         "0.0.0.0/0",
 *                         "::/0")
 *                     .build())
 *             .outboundRules(            
 *                 FirewallOutboundRuleArgs.builder()
 *                     .protocol("tcp")
 *                     .portRange("53")
 *                     .destinationAddresses(                    
 *                         "0.0.0.0/0",
 *                         "::/0")
 *                     .build(),
 *                 FirewallOutboundRuleArgs.builder()
 *                     .protocol("udp")
 *                     .portRange("53")
 *                     .destinationAddresses(                    
 *                         "0.0.0.0/0",
 *                         "::/0")
 *                     .build(),
 *                 FirewallOutboundRuleArgs.builder()
 *                     .protocol("icmp")
 *                     .destinationAddresses(                    
 *                         "0.0.0.0/0",
 *                         "::/0")
 *                     .build())
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
 * Firewalls can be imported using the firewall `id`, e.g.
 * 
 * ```sh
 * $ pulumi import digitalocean:index/firewall:Firewall myfirewall b8ecd2ab-2267-4a5e-8692-cbf1d32583e3
 * ```
 * 
 */
@ResourceType(type="digitalocean:index/firewall:Firewall")
public class Firewall extends com.pulumi.resources.CustomResource {
    /**
     * A time value given in ISO8601 combined date and time format
     * that represents when the Firewall was created.
     * 
     */
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    /**
     * @return A time value given in ISO8601 combined date and time format
     * that represents when the Firewall was created.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * The list of the IDs of the Droplets assigned
     * to the Firewall.
     * 
     */
    @Export(name="dropletIds", refs={List.class,Integer.class}, tree="[0,1]")
    private Output</* @Nullable */ List<Integer>> dropletIds;

    /**
     * @return The list of the IDs of the Droplets assigned
     * to the Firewall.
     * 
     */
    public Output<Optional<List<Integer>>> dropletIds() {
        return Codegen.optional(this.dropletIds);
    }
    /**
     * The inbound access rule block for the Firewall.
     * The `inbound_rule` block is documented below.
     * 
     */
    @Export(name="inboundRules", refs={List.class,FirewallInboundRule.class}, tree="[0,1]")
    private Output</* @Nullable */ List<FirewallInboundRule>> inboundRules;

    /**
     * @return The inbound access rule block for the Firewall.
     * The `inbound_rule` block is documented below.
     * 
     */
    public Output<Optional<List<FirewallInboundRule>>> inboundRules() {
        return Codegen.optional(this.inboundRules);
    }
    /**
     * The Firewall name
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The Firewall name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The outbound access rule block for the Firewall.
     * The `outbound_rule` block is documented below.
     * 
     */
    @Export(name="outboundRules", refs={List.class,FirewallOutboundRule.class}, tree="[0,1]")
    private Output</* @Nullable */ List<FirewallOutboundRule>> outboundRules;

    /**
     * @return The outbound access rule block for the Firewall.
     * The `outbound_rule` block is documented below.
     * 
     */
    public Output<Optional<List<FirewallOutboundRule>>> outboundRules() {
        return Codegen.optional(this.outboundRules);
    }
    /**
     * An list of object containing the fields, &#34;droplet_id&#34;,
     * &#34;removing&#34;, and &#34;status&#34;.  It is provided to detail exactly which Droplets
     * are having their security policies updated.  When empty, all changes
     * have been successfully applied.
     * 
     */
    @Export(name="pendingChanges", refs={List.class,FirewallPendingChange.class}, tree="[0,1]")
    private Output<List<FirewallPendingChange>> pendingChanges;

    /**
     * @return An list of object containing the fields, &#34;droplet_id&#34;,
     * &#34;removing&#34;, and &#34;status&#34;.  It is provided to detail exactly which Droplets
     * are having their security policies updated.  When empty, all changes
     * have been successfully applied.
     * 
     */
    public Output<List<FirewallPendingChange>> pendingChanges() {
        return this.pendingChanges;
    }
    /**
     * A status string indicating the current state of the Firewall.
     * This can be &#34;waiting&#34;, &#34;succeeded&#34;, or &#34;failed&#34;.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return A status string indicating the current state of the Firewall.
     * This can be &#34;waiting&#34;, &#34;succeeded&#34;, or &#34;failed&#34;.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The names of the Tags assigned to the Firewall.
     * 
     */
    @Export(name="tags", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return The names of the Tags assigned to the Firewall.
     * 
     */
    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Firewall(String name) {
        this(name, FirewallArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Firewall(String name, @Nullable FirewallArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Firewall(String name, @Nullable FirewallArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/firewall:Firewall", name, args == null ? FirewallArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Firewall(String name, Output<String> id, @Nullable FirewallState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/firewall:Firewall", name, state, makeResourceOptions(options, id));
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
    public static Firewall get(String name, Output<String> id, @Nullable FirewallState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Firewall(name, id, state, options);
    }
}
