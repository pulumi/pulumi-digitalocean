CHANGELOG
=========

## HEAD (Unreleased)
* Upgrade to pulumi-terraform-bridge v1.4.3
* Namespace names in .NET SDK are adjusted to PascalCase
([#52](https://github.com/pulumi/pulumi-digitalocean/pull/52)).

---

## 1.1.0 (2019-11-15)
* Upgrade to v1.11.0 of the DigitalOcean Terraform Provider
* Add support for DotNet SDK Generation
* Rename the Droplet slugs to be `VCPU` not `VPCU`

## 1.0.1 (2019-10-09)
* Upgrade to v1.9.1 of the DigitalOcean Terraform Provider

## 1.0.0 (2019-10-08)
* Regenerate SDK based on tf2pulumi 0.6.0
* Upgrade to v1.9.0 of the DigitalOcean Terraform Provider

## 0.18.14 (2019-09-29)
* Upgrade to v1.8.0 of the DigitalOcean Terraform Provider

## 0.18.13 (2019-09-05)
* Upgrade to v1.0.0 of Pulumi

## 0.18.12 (2019-08-29)
* Update to v1.7.0 of the DigitalOcean Terraform Provider
* Upgrade pulumi-terraform to 3f206601e7

## 0.18.11 (2019-08-20)
* Depend on latest pulumi package

## 0.18.10 (2019-08-09)
* Upgrade to pulumi-terraform@9db2fc93cd

## 0.18.9 (2019-08-08)
* Upgrade to v1.6.0 of the DigitalOcean Terraform Provider
* Update to pulumi-terraform@013b95b1c8

## 0.18.8 (2019-07-09)
* Fix detailed diffs with nested computed values.

## 0.18.7 (2019-07-08)
* Communicate detailed information about the difference between a resource's desired and actual state during a Pulumi update

## 0.18.6 (2019-07-04)
* Upgraded to v1.5.0 of the Digital Ocean Terraform Provider

## 0.18.5 (2019-06-25)
* Disable automatic naming for domain names. The `name` property on `Domain` resources is now required.

## 0.18.4 (2019-06-21)
* Update to pulumi-terraform@3635bed3a5 which stops maps containing `.` being treated as nested maps.

## 0.18.3 (2019-06-17)
* Update the provider publish script to prevent user install problems

## 0.18.2 (2019-06-15)
* Add TypeScript type guards for each resource class
* Add constants for Regions
* Add constants for Database Cluster sizes
* Add constants for Droplet sizes
* Add constants for Certificate types
* Add constants for Protocols
* Add constants for Load Balancer Algorithms
* Add constants for DNS Record types
* Add constants for File System types

## 0.18.1 (2019-05-31)
* Upgraded to v1.4.0 of the Digital Ocean Terraform Provider

## 0.18.0 (2019-05-21)
* Initial Release
