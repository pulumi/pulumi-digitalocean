module github.com/pulumi/pulumi-digitalocean/provider/v3

go 1.14

require (
	github.com/digitalocean/terraform-provider-digitalocean v1.22.2
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.13.2
	github.com/pulumi/pulumi/sdk/v2 v2.13.3-0.20201109230029-a6f8b9b205cd
	github.com/satori/go.uuid v1.2.0 // indirect
)

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/digitalocean/terraform-provider-digitalocean => github.com/pulumi/terraform-provider-digitalocean v1.19.1-0.20201113120058-287306fc1d67
	github.com/hashicorp/terraform-plugin-sdk/v2 => github.com/pulumi/terraform-plugin-sdk/v2 v2.0.0-20200910230100-328eb4ff41df
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
	github.com/keybase/go-crypto => github.com/keybase/go-crypto v0.0.0-20190416182011-b785b22cc757
	golang.org/x/crypto => golang.org/x/crypto v0.0.0-20200323165209-0ec3e9974c59
)
