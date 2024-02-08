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
 * ```java
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
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var default_ = new Domain(&#34;default&#34;, DomainArgs.builder()        
 *             .name(&#34;example.com&#34;)
 *             .build());
 * 
 *         var www = new DnsRecord(&#34;www&#34;, DnsRecordArgs.builder()        
 *             .domain(default_.id())
 *             .type(&#34;A&#34;)
 *             .value(&#34;192.168.0.11&#34;)
 *             .build());
 * 
 *         var mx = new DnsRecord(&#34;mx&#34;, DnsRecordArgs.builder()        
 *             .domain(default_.id())
 *             .type(&#34;MX&#34;)
 *             .priority(10)
 *             .value(&#34;mail.example.com.&#34;)
 *             .build());
 * 
 *         ctx.export(&#34;wwwFqdn&#34;, www.fqdn());
 *         ctx.export(&#34;mxFqdn&#34;, mx.fqdn());
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Records can be imported using the domain name and record `id` when joined with a comma. See the following example:
 * 
 * ```sh
 * $ pulumi import digitalocean:index/dnsRecord:DnsRecord example_record example.com,12345678
 * ```
 * 
 *  ~&gt;
 * 
 * You find the `id` of the records [using the DigitalOcean API](https://docs.digitalocean.com/reference/api/api-reference/#operation/domains_list_records) or CLI. Run the follow command to list the IDs for all DNS records on a domain: `doctl compute domain records list &lt;domain.name&gt;`
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
     * The hostname of the record. Use `@` for records on domain&#39;s name itself.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The hostname of the record. Use `@` for records on domain&#39;s name itself.
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
    public DnsRecord(String name) {
        this(name, DnsRecordArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DnsRecord(String name, DnsRecordArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DnsRecord(String name, DnsRecordArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/dnsRecord:DnsRecord", name, args == null ? DnsRecordArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DnsRecord(String name, Output<String> id, @Nullable DnsRecordState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/dnsRecord:DnsRecord", name, state, makeResourceOptions(options, id));
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
    public static DnsRecord get(String name, Output<String> id, @Nullable DnsRecordState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DnsRecord(name, id, state, options);
    }
}
