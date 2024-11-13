// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum DropletSlug {
        DropletS1VCPU512MB10GB("s-1vcpu-512mb-10gb"),
        DropletS1VCPU1GB("s-1vcpu-1gb"),
        DropletS1VCPU1GBAMD("s-1vcpu-1gb-amd"),
        DropletS1VCPU1GBINTEL("s-1vcpu-1gb-intel"),
        DropletS1VCPU1GB35GBINTEL("s-1vcpu-1gb-35gb-intel"),
        DropletS1VCPU2GB("s-1vcpu-2gb"),
        DropletS1VCPU2GBAMD("s-1vcpu-2gb-amd"),
        DropletS1VCPU2GBINTEL("s-1vcpu-2gb-intel"),
        DropletS1VCPU2GB70GBINTEL("s-1vcpu-2gb-70gb-intel"),
        DropletS2VCPU2GB("s-2vcpu-2gb"),
        DropletS2VCPU2GBAMD("s-2vcpu-2gb-amd"),
        DropletS2VCPU2GBINTEL("s-2vcpu-2gb-intel"),
        DropletS2VCPU2GB90GBINTEL("s-2vcpu-2gb-90gb-intel"),
        DropletS2VCPU4GB("s-2vcpu-4gb"),
        DropletS2VCPU4GBAMD("s-2vcpu-4gb-amd"),
        DropletS2VCPU4GBINTEL("s-2vcpu-4gb-intel"),
        DropletS2VCPU4GB120GBINTEL("s-2vcpu-4gb-120gb-intel"),
        DropletS2VCPU8GBAMD("s-2vcpu-8gb-amd"),
        DropletC2("c-2"),
        DropletC22VCPU4GB("c2-2vcpu-4gb"),
        DropletS2VCPU8GB160GBINTEL("s-2vcpu-8gb-160gb-intel"),
        DropletS4VCPU8GB("s-4vcpu-8gb"),
        DropletS4VCPU8GBAMD("s-4vcpu-8gb-amd"),
        DropletS4VCPU8GBINTEL("s-4vcpu-8gb-intel"),
        DropletG2VCPU8GB("g-2vcpu-8gb"),
        DropletS4VCPU8GB240GBINTEL("s-4vcpu-8gb-240gb-intel"),
        DropletGD2VCPU8GB("gd-2vcpu-8gb"),
        DropletG2VCPU8GBINTEL("g-2vcpu-8gb-intel"),
        DropletGD2VCPU8GBINTEL("gd-2vcpu-8gb-intel"),
        DropletS4VCPU16GBAMD("s-4vcpu-16gb-amd"),
        DropletM2VCPU16GB("m-2vcpu-16gb"),
        DropletC4("c-4"),
        DropletC24VCPU8GB("c2-4vcpu-8gb"),
        DropletS4VCPU16GB320GBINTEL("s-4vcpu-16gb-320gb-intel"),
        DropletS8VCPU16GB("s-8vcpu-16gb"),
        DropletM2VCPU16GBINTEL("m-2vcpu-16gb-intel"),
        DropletM32VCPU16GB("m3-2vcpu-16gb"),
        DropletC4INTEL("c-4-intel"),
        DropletM32VCPU16GBINTEL("m3-2vcpu-16gb-intel"),
        DropletS8VCPU16GBAMD("s-8vcpu-16gb-amd"),
        DropletS8VCPU16GBINTEL("s-8vcpu-16gb-intel"),
        DropletC24VCPU8GBINTEL("c2-4vcpu-8gb-intel"),
        DropletG4VCPU16GB("g-4vcpu-16gb"),
        DropletS8VCPU16GB480GBINTEL("s-8vcpu-16gb-480gb-intel"),
        DropletSO2VCPU16GBINTEL("so-2vcpu-16gb-intel"),
        DropletSO2VCPU16GB("so-2vcpu-16gb"),
        DropletM62VCPU16GB("m6-2vcpu-16gb"),
        DropletGD4VCPU16GB("gd-4vcpu-16gb"),
        DropletSO1_52VCPU16GBINTEL("so1_5-2vcpu-16gb-intel"),
        DropletG4VCPU16GBINTEL("g-4vcpu-16gb-intel"),
        DropletGD4VCPU16GBINTEL("gd-4vcpu-16gb-intel"),
        DropletSO1_52VCPU16GB("so1_5-2vcpu-16gb"),
        DropletS8VCPU32GBAMD("s-8vcpu-32gb-amd"),
        DropletM4VCPU32GB("m-4vcpu-32gb"),
        DropletC8("c-8"),
        DropletC28VCPU16GB("c2-8vcpu-16gb"),
        DropletS8VCPU32GB640GBINTEL("s-8vcpu-32gb-640gb-intel"),
        DropletM4VCPU32GBINTEL("m-4vcpu-32gb-intel"),
        DropletM34VCPU32GB("m3-4vcpu-32gb"),
        DropletC8INTEL("c-8-intel"),
        DropletM34VCPU32GBINTEL("m3-4vcpu-32gb-intel"),
        DropletC28VCPU16GBINTEL("c2-8vcpu-16gb-intel"),
        DropletG8VCPU32GB("g-8vcpu-32gb"),
        DropletSO4VCPU32GBINTEL("so-4vcpu-32gb-intel"),
        DropletSO4VCPU32GB("so-4vcpu-32gb"),
        DropletM64VCPU32GB("m6-4vcpu-32gb"),
        DropletGD8VCPU32GB("gd-8vcpu-32gb"),
        DropletSO1_54VCPU32GBINTEL("so1_5-4vcpu-32gb-intel"),
        DropletG8VCPU32GBINTEL("g-8vcpu-32gb-intel"),
        DropletGD8VCPU32GBINTEL("gd-8vcpu-32gb-intel"),
        DropletSO1_54VCPU32GB("so1_5-4vcpu-32gb"),
        DropletM8VCPU64GB("m-8vcpu-64gb"),
        DropletC16("c-16"),
        DropletC216VCPU32GB("c2-16vcpu-32gb"),
        DropletM8VCPU64GBINTEL("m-8vcpu-64gb-intel"),
        DropletM38VCPU64GB("m3-8vcpu-64gb"),
        DropletC16INTEL("c-16-intel"),
        DropletM38VCPU64GBINTEL("m3-8vcpu-64gb-intel"),
        DropletC216VCPU32GBINTEL("c2-16vcpu-32gb-intel"),
        DropletG16VCPU64GB("g-16vcpu-64gb"),
        DropletSO8VCPU64GBINTEL("so-8vcpu-64gb-intel"),
        DropletSO8VCPU64GB("so-8vcpu-64gb"),
        DropletM68VCPU64GB("m6-8vcpu-64gb"),
        DropletGD16VCPU64GB("gd-16vcpu-64gb"),
        DropletSO1_58VCPU64GBINTEL("so1_5-8vcpu-64gb-intel"),
        DropletG16VCPU64GBINTEL("g-16vcpu-64gb-intel"),
        DropletGD16VCPU64GBINTEL("gd-16vcpu-64gb-intel"),
        DropletSO1_58VCPU64GB("so1_5-8vcpu-64gb"),
        DropletM16VCPU128GB("m-16vcpu-128gb"),
        DropletC32("c-32"),
        DropletC232VCPU64GB("c2-32vcpu-64gb"),
        DropletM16VCPU128GBINTEL("m-16vcpu-128gb-intel"),
        DropletM316VCPU128GB("m3-16vcpu-128gb"),
        DropletC32INTEL("c-32-intel"),
        DropletM316VCPU128GBINTEL("m3-16vcpu-128gb-intel"),
        DropletC232VCPU64GBINTEL("c2-32vcpu-64gb-intel"),
        DropletC48("c-48"),
        DropletM24VCPU192GB("m-24vcpu-192gb"),
        DropletG32VCPU128GB("g-32vcpu-128gb"),
        DropletSO16VCPU128GBINTEL("so-16vcpu-128gb-intel"),
        DropletSO16VCPU128GB("so-16vcpu-128gb"),
        DropletM616VCPU128GB("m6-16vcpu-128gb"),
        DropletGD32VCPU128GB("gd-32vcpu-128gb"),
        DropletSO1_516VCPU128GBINTEL("so1_5-16vcpu-128gb-intel"),
        DropletC248VCPU96GB("c2-48vcpu-96gb"),
        DropletM24VCPU192GBINTEL("m-24vcpu-192gb-intel"),
        DropletG32VCPU128GBINTEL("g-32vcpu-128gb-intel"),
        DropletM324VCPU192GB("m3-24vcpu-192gb"),
        DropletG40VCPU160GB("g-40vcpu-160gb"),
        DropletGD32VCPU128GBINTEL("gd-32vcpu-128gb-intel"),
        DropletSO1_516VCPU128GB("so1_5-16vcpu-128gb"),
        DropletC48INTEL("c-48-intel"),
        DropletM324VCPU192GBINTEL("m3-24vcpu-192gb-intel"),
        DropletM32VCPU256GB("m-32vcpu-256gb"),
        DropletGD40VCPU160GB("gd-40vcpu-160gb"),
        DropletC248VCPU96GBINTEL("c2-48vcpu-96gb-intel"),
        DropletSO24VCPU192GBINTEL("so-24vcpu-192gb-intel"),
        DropletSO24VCPU192GB("so-24vcpu-192gb"),
        DropletM624VCPU192GB("m6-24vcpu-192gb"),
        DropletM32VCPU256GBINTEL("m-32vcpu-256gb-intel"),
        DropletC60INTEL("c-60-intel"),
        DropletM332VCPU256GB("m3-32vcpu-256gb"),
        DropletSO1_524VCPU192GBINTEL("so1_5-24vcpu-192gb-intel"),
        DropletM332VCPU256GBINTEL("m3-32vcpu-256gb-intel"),
        DropletG48VCPU192GBINTEL("g-48vcpu-192gb-intel"),
        DropletC260VCPU120GBINTEL("c2-60vcpu-120gb-intel"),
        DropletGD48VCPU192GBINTEL("gd-48vcpu-192gb-intel"),
        DropletSO1_524VCPU192GB("so1_5-24vcpu-192gb"),
        DropletSO32VCPU256GBINTEL("so-32vcpu-256gb-intel"),
        DropletSO32VCPU256GB("so-32vcpu-256gb"),
        DropletM632VCPU256GB("m6-32vcpu-256gb"),
        DropletSO1_532VCPU256GBINTEL("so1_5-32vcpu-256gb-intel"),
        DropletG60VCPU240GBINTEL("g-60vcpu-240gb-intel"),
        DropletM48VCPU384GBINTEL("m-48vcpu-384gb-intel"),
        DropletGD60VCPU240GBINTEL("gd-60vcpu-240gb-intel"),
        DropletGPUH100X180GB("gpu-h100x1-80gb"),
        DropletSO1_532VCPU256GB("so1_5-32vcpu-256gb"),
        DropletM348VCPU384GBINTEL("m3-48vcpu-384gb-intel"),
        DropletSO48VCPU384GBINTEL("so-48vcpu-384gb-intel"),
        DropletGPUH100X180GB200("gpu-h100x1-80gb-200"),
        DropletGPUH100X8640GB("gpu-h100x8-640gb"),
        DropletGPUH100X8640GB200("gpu-h100x8-640gb-200");

        private final String value;

        DropletSlug(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public java.lang.String toString() {
            return new StringJoiner(", ", "DropletSlug[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
