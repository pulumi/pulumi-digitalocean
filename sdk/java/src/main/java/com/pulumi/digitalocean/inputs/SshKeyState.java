// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SshKeyState extends com.pulumi.resources.ResourceArgs {

    public static final SshKeyState Empty = new SshKeyState();

    /**
     * The fingerprint of the SSH key
     * 
     */
    @Import(name="fingerprint")
    private @Nullable Output<String> fingerprint;

    /**
     * @return The fingerprint of the SSH key
     * 
     */
    public Optional<Output<String>> fingerprint() {
        return Optional.ofNullable(this.fingerprint);
    }

    /**
     * The name of the SSH key for identification
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the SSH key for identification
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The public key. If this is a file, it
     * can be read using the file interpolation function
     * 
     */
    @Import(name="publicKey")
    private @Nullable Output<String> publicKey;

    /**
     * @return The public key. If this is a file, it
     * can be read using the file interpolation function
     * 
     */
    public Optional<Output<String>> publicKey() {
        return Optional.ofNullable(this.publicKey);
    }

    private SshKeyState() {}

    private SshKeyState(SshKeyState $) {
        this.fingerprint = $.fingerprint;
        this.name = $.name;
        this.publicKey = $.publicKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SshKeyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SshKeyState $;

        public Builder() {
            $ = new SshKeyState();
        }

        public Builder(SshKeyState defaults) {
            $ = new SshKeyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param fingerprint The fingerprint of the SSH key
         * 
         * @return builder
         * 
         */
        public Builder fingerprint(@Nullable Output<String> fingerprint) {
            $.fingerprint = fingerprint;
            return this;
        }

        /**
         * @param fingerprint The fingerprint of the SSH key
         * 
         * @return builder
         * 
         */
        public Builder fingerprint(String fingerprint) {
            return fingerprint(Output.of(fingerprint));
        }

        /**
         * @param name The name of the SSH key for identification
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the SSH key for identification
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param publicKey The public key. If this is a file, it
         * can be read using the file interpolation function
         * 
         * @return builder
         * 
         */
        public Builder publicKey(@Nullable Output<String> publicKey) {
            $.publicKey = publicKey;
            return this;
        }

        /**
         * @param publicKey The public key. If this is a file, it
         * can be read using the file interpolation function
         * 
         * @return builder
         * 
         */
        public Builder publicKey(String publicKey) {
            return publicKey(Output.of(publicKey));
        }

        public SshKeyState build() {
            return $;
        }
    }

}
