// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.digitalocean.DnsRecordArgs;
import com.pulumi.digitalocean.Utilities;
import com.pulumi.digitalocean.inputs.DnsRecordState;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a DigitalOcean DNS record resource.
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
 * import com.pulumi.digitalocean.Domain;
 * import com.pulumi.digitalocean.DomainArgs;
 * import com.pulumi.digitalocean.DnsRecord;
 * import com.pulumi.digitalocean.DnsRecordArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App }{{@code
 *     public static void main(String[] args) }{{@code
 *         Pulumi.run(App::stack);
 *     }}{@code
 * 
 *     public static void stack(Context ctx) }{{@code
 *         var default_ = new Domain("default", DomainArgs.builder()
 *             .name("example.com")
 *             .build());
 * 
 *         // Add an A record to the domain for www.example.com.
 *         var www = new DnsRecord("www", DnsRecordArgs.builder()
 *             .domain(default_.id())
 *             .type("A")
 *             .name("www")
 *             .value("192.168.0.11")
 *             .build());
 * 
 *         // Add a MX record for the example.com domain itself.
 *         var mx = new DnsRecord("mx", DnsRecordArgs.builder()
 *             .domain(default_.id())
 *             .type("MX")
 *             .name("}{@literal @}{@code ")
 *             .priority(10)
 *             .value("mail.example.com.")
 *             .build());
 * 
 *         ctx.export("wwwFqdn", www.fqdn());
 *         ctx.export("mxFqdn", mx.fqdn());
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Records can be imported using the domain name and record `id` when joined with a comma. See the following example:
 * 
 * ```sh
 * $ pulumi import digitalocean:index/dnsRecord:DnsRecord example_record example.com,12345678
 * ```
 * 
 * ~&gt;  You find the `id` of the records [using the DigitalOcean API](https://docs.digitalocean.com/reference/api/api-reference/#operation/domains_list_records) or CLI. Run the follow command to list the IDs for all DNS records on a domain: `doctl compute domain records list &lt;domain.name&gt;`
 * 
 */
@ResourceType(type="digitalocean:index/dnsRecord:DnsRecord")
public class DnsRecord extends com.pulumi.resources.CustomResource {
    /**
     * The domain to add the record to.
     * 
     */
    @Export(name="domain", refs={String.class}, tree="[0]")
    private Output<String> domain;

    /**
     * @return The domain to add the record to.
     * 
     */
    public Output<String> domain() {
        return this.domain;
    }
    /**
     * The flags of the record. Only valid when type is `CAA`. Must be between 0 and 255.
     * 
     */
    @Export(name="flags", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> flags;

    /**
     * @return The flags of the record. Only valid when type is `CAA`. Must be between 0 and 255.
     * 
     */
    public Output<Optional<Integer>> flags() {
        return Codegen.optional(this.flags);
    }
    /**
     * The FQDN of the record
     * 
     */
    @Export(name="fqdn", refs={String.class}, tree="[0]")
    private Output<String> fqdn;

    /**
     * @return The FQDN of the record
     * 
     */
    public Output<String> fqdn() {
        return this.fqdn;
    }
    /**
     * The hostname of the record. Use `{@literal @}` for records on domain&#39;s name itself.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The hostname of the record. Use `{@literal @}` for records on domain&#39;s name itself.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The port of the record. Only valid when type is `SRV`.  Must be between 1 and 65535.
     * 
     */
    @Export(name="port", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> port;

    /**
     * @return The port of the record. Only valid when type is `SRV`.  Must be between 1 and 65535.
     * 
     */
    public Output<Optional<Integer>> port() {
        return Codegen.optional(this.port);
    }
    /**
     * The priority of the record. Only valid when type is `MX` or `SRV`. Must be between 0 and 65535.
     * 
     */
    @Export(name="priority", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> priority;

    /**
     * @return The priority of the record. Only valid when type is `MX` or `SRV`. Must be between 0 and 65535.
     * 
     */
    public Output<Optional<Integer>> priority() {
        return Codegen.optional(this.priority);
    }
    /**
     * The tag of the record. Only valid when type is `CAA`. Must be one of `issue`, `issuewild`, or `iodef`.
     * 
     */
    @Export(name="tag", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> tag;

    /**
     * @return The tag of the record. Only valid when type is `CAA`. Must be one of `issue`, `issuewild`, or `iodef`.
     * 
     */
    public Output<Optional<String>> tag() {
        return Codegen.optional(this.tag);
    }
    /**
     * The time to live for the record, in seconds. Must be at least 0. Defaults to 1800.
     * 
     */
    @Export(name="ttl", refs={Integer.class}, tree="[0]")
    private Output<Integer> ttl;

    /**
     * @return The time to live for the record, in seconds. Must be at least 0. Defaults to 1800.
     * 
     */
    public Output<Integer> ttl() {
        return this.ttl;
    }
    /**
     * The type of record. Must be one of `A`, `AAAA`, `CAA`, `CNAME`, `MX`, `NS`, `TXT`, or `SRV`.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The type of record. Must be one of `A`, `AAAA`, `CAA`, `CNAME`, `MX`, `NS`, `TXT`, or `SRV`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The value of the record.
     * 
     */
    @Export(name="value", refs={String.class}, tree="[0]")
    private Output<String> value;

    /**
     * @return The value of the record.
     * 
     */
    public Output<String> value() {
        return this.value;
    }
    /**
     * The weight of the record. Only valid when type is `SRV`.  Must be between 0 and 65535.
     * 
     */
    @Export(name="weight", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> weight;

    /**
     * @return The weight of the record. Only valid when type is `SRV`.  Must be between 0 and 65535.
     * 
     */
    public Output<Optional<Integer>> weight() {
        return Codegen.optional(this.weight);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DnsRecord(java.lang.String name) {
        this(name, DnsRecordArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DnsRecord(java.lang.String name, DnsRecordArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DnsRecord(java.lang.String name, DnsRecordArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/dnsRecord:DnsRecord", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private DnsRecord(java.lang.String name, Output<java.lang.String> id, @Nullable DnsRecordState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/dnsRecord:DnsRecord", name, state, makeResourceOptions(options, id), false);
    }

    private static DnsRecordArgs makeArgs(DnsRecordArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? DnsRecordArgs.Empty : args;
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
    public static DnsRecord get(java.lang.String name, Output<java.lang.String> id, @Nullable DnsRecordState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DnsRecord(name, id, state, options);
    }
}
