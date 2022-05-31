module github.com/pulumi/pulumi-digitalocean/provider/v4

go 1.16

require (
	github.com/digitalocean/terraform-provider-digitalocean v1.22.2
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.24.1
	github.com/pulumi/pulumi/pkg/v3 v3.33.1
	github.com/pulumi/pulumi/sdk/v3 v3.33.1
)

replace (
	github.com/digitalocean/terraform-provider-digitalocean => github.com/pulumi/terraform-provider-digitalocean v1.19.1-0.20220531092225-fd1d6f711343
	github.com/hashicorp/go-getter v1.5.0 => github.com/hashicorp/go-getter v1.4.0
	github.com/hashicorp/terraform-plugin-sdk/v2 => github.com/pulumi/terraform-plugin-sdk/v2 v2.0.0-20220505215311-795430389fa7
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
	github.com/keybase/go-crypto => github.com/keybase/go-crypto v0.0.0-20190416182011-b785b22cc757
	golang.org/x/crypto => golang.org/x/crypto v0.0.0-20200323165209-0ec3e9974c59
)
