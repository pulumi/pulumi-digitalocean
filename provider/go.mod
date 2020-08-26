module github.com/pulumi/pulumi-digitalocean/provider/v2

go 1.14

require (
	github.com/hashicorp/terraform-plugin-sdk v1.7.0
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.7.2
	github.com/pulumi/pulumi/sdk/v2 v2.9.1-0.20200821035132-629254334213
	github.com/terraform-providers/terraform-provider-digitalocean v1.19.0
)

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
	github.com/keybase/go-crypto => github.com/keybase/go-crypto v0.0.0-20190416182011-b785b22cc757
	github.com/terraform-providers/terraform-provider-aws v2.32.0+incompatible => github.com/terraform-providers/terraform-provider-aws v1.60.1-0.20191010190908-1261a98537f2
	github.com/terraform-providers/terraform-provider-digitalocean => github.com/pulumi/terraform-provider-digitalocean v1.19.1-0.20200616132413-016bf6859393
	github.com/terraform-providers/terraform-provider-google v2.17.0+incompatible => github.com/terraform-providers/terraform-provider-google v1.20.1-0.20191008212436-363f2d283518
	github.com/terraform-providers/terraform-provider-random v2.2.1+incompatible => github.com/terraform-providers/terraform-provider-random v1.3.2-0.20190925210718-83518d96ae4f
	golang.org/x/crypto => golang.org/x/crypto v0.0.0-20200323165209-0ec3e9974c59
	k8s.io/api => k8s.io/api v0.0.0-20191121015604-11707872ac1c
	k8s.io/client-go => k8s.io/client-go v0.0.0-20191029021442-5f2132fc4383
)
