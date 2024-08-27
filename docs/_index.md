---
title: Digitalocean Provider
meta_desc: Provides an overview on how to configure the Pulumi Digitalocean provider.
layout: package
---
## Installation

The digitalocean provider is available as a package in all Pulumi languages:

* JavaScript/TypeScript: [`@pulumi/digitalocean`](https://www.npmjs.com/package/@pulumi/digitalocean)
* Python: [`pulumi-digitalocean`](https://pypi.org/project/pulumi-digitalocean/)
* Go: [`github.com/pulumi/pulumi-digitalocean/sdk/v4/go/digitalocean`](https://github.com/pulumi/pulumi-digitalocean)
* .NET: [`Pulumi.Digitalocean`](https://www.nuget.org/packages/Pulumi.Digitalocean)
* Java: [`com.pulumi/digitalocean`](https://central.sonatype.com/artifact/com.pulumi/digitalocean)

The DigitalOcean (DO) provider is used to interact with the
resources supported by DigitalOcean. The provider needs to be configured
with the proper credentials before it can be used.

Use the navigation to the left to read about the available resources.
## Example Usage

{{< chooser language "typescript,python,go,csharp,java,yaml" >}}
{{% choosable language typescript %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: nodejs
config:
    digitalocean:token:
        value: 'TODO: var.do_token'

```
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as digitalocean from "@pulumi/digitalocean";

const config = new pulumi.Config();
const doToken = config.requireObject("doToken");
// Create a web server
const web = new digitalocean.Droplet("web", {});
```
{{% /choosable %}}
{{% choosable language python %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: python
config:
    digitalocean:token:
        value: 'TODO: var.do_token'

```
```python
import pulumi
import pulumi_digitalocean as digitalocean

config = pulumi.Config()
do_token = config.require_object("doToken")
# Create a web server
web = digitalocean.Droplet("web")
```
{{% /choosable %}}
{{% choosable language csharp %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: dotnet
config:
    digitalocean:token:
        value: 'TODO: var.do_token'

```
```csharp
using System.Collections.Generic;
using System.Linq;
using Pulumi;
using DigitalOcean = Pulumi.DigitalOcean;

return await Deployment.RunAsync(() =>
{
    var config = new Config();
    var doToken = config.RequireObject<dynamic>("doToken");
    // Create a web server
    var web = new DigitalOcean.Droplet("web");

});

```
{{% /choosable %}}
{{% choosable language go %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: go
config:
    digitalocean:token:
        value: 'TODO: var.do_token'

```
```go
package main

import (
	"github.com/pulumi/pulumi-digitalocean/sdk/v4/go/digitalocean"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		cfg := config.New(ctx, "")
		doToken := cfg.RequireObject("doToken")
		// Create a web server
		_, err := digitalocean.NewDroplet(ctx, "web", nil)
		if err != nil {
			return err
		}
		return nil
	})
}
```
{{% /choosable %}}
{{% choosable language yaml %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: yaml
config:
    digitalocean:token:
        value: 'TODO: var.do_token'

```
```yaml
configuration:
  # Set the variable value in *.tfvars file
  # or using -var="do_token=..." CLI option
  doToken:
    type: dynamic
resources:
  # Create a web server
  web:
    type: digitalocean:Droplet
```
{{% /choosable %}}
{{% choosable language java %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: java
config:
    digitalocean:token:
        value: 'TODO: var.do_token'

```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.digitalocean.Droplet;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    public static void stack(Context ctx) {
        final var config = ctx.config();
        final var doToken = config.get("doToken");
        // Create a web server
        var web = new Droplet("web");

    }
}
```
{{% /choosable %}}
{{< /chooser >}}

> **Note for Module Developers** Although provider configurations are shared between modules, each module must
declare its own provider requirements. See the module development documentation for additional information.
## Configuration Reference

The following configuration inputs are supported:

* `token` - (Required) This is the DO API token. Alternatively, this can also be specified
  using environment variables ordered by precedence:
  * `DIGITALOCEAN_TOKEN`
  * `DIGITALOCEAN_ACCESS_TOKEN`
* `spacesAccessId` - (Optional) The access key ID used for Spaces API
  operations (Defaults to the value of the `SPACES_ACCESS_KEY_ID` environment
  variable).
* `spacesSecretKey` - (Optional) The secret access key used for Spaces API
  operations (Defaults to the value of the `SPACES_SECRET_ACCESS_KEY`
  environment variable).
* `apiEndpoint` - (Optional) This can be used to override the base URL for
  DigitalOcean API requests (Defaults to the value of the `DIGITALOCEAN_API_URL`
  environment variable or `https://api.digitalocean.com` if unset).
* `spacesEndpoint` - (Optional) This can be used to override the endpoint URL
  used for DigitalOcean Spaces requests. (It defaults to the value of the
  `SPACES_ENDPOINT_URL` environment variable or `https://{{.Region}}.digitaloceanspaces.com`
  if unset.) The provider will replace `{{.Region}}` (via Go's templating engine) with the slug
  of the applicable Spaces region.
* `requestsPerSecond` - (Optional) This can be used to enable throttling, overriding the limit
  of API calls per second to avoid rate limit errors, can be disabled by setting the value
  to `0.0` (Defaults to the value of the `DIGITALOCEAN_REQUESTS_PER_SECOND` environment
  variable or `0.0` if unset).
* `httpRetryMax` - (Optional) This can be used to override the maximum number
  of retries on a failed API request (client errors, 422, 500, 502...), the exponential
  backoff can be configured by the `httpRetryWaitMin` and `httpRetryWaitMax` arguments
  (Defaults to the value of the `DIGITALOCEAN_HTTP_RETRY_MAX` environment variable or
  `4` if unset).
* `httpRetryWaitMin` - (Optional) This can be used to configure the minimum
  waiting time (**in seconds**) between failed requests for the backoff strategy
  (Defaults to the value of the `DIGITALOCEAN_HTTP_RETRY_WAIT_MIN` environment
  variable or `1.0` if unset).
* `httpRetryWaitMax` - (Optional) This can be used to configure the maximum
  waiting time (**in seconds**) between failed requests for the backoff strategy
  (Defaults to the value of the `DIGITALOCEAN_HTTP_RETRY_WAIT_MAX` environment
  variable or `30.0` if unset).