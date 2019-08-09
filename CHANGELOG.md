CHANGELOG
=========

## HEAD (Unreleased)
* Upgrade to pulumi-terraform@9db2fc93cd

---

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

